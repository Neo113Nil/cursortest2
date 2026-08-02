package io.sentry.android.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.Hint;
import io.sentry.ILogger;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.SentryDateProvider;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.TypeCheckHint;
import io.sentry.android.core.internal.util.AndroidConnectionStatusProvider;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import java.io.Closeable;

/* loaded from: classes2.dex */
public final class NetworkBreadcrumbsIntegration implements Integration, Closeable {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private volatile boolean isClosed;
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private final ILogger logger;
    volatile NetworkBreadcrumbsNetworkCallback networkCallback;
    private SentryOptions options;

    public static class NetworkBreadcrumbConnectionDetail {
        final int downBandwidth;
        final boolean isVpn;
        final int signalStrength;
        private long timestampNanos;
        final String type;
        final int upBandwidth;

        public NetworkBreadcrumbConnectionDetail(NetworkCapabilities networkCapabilities, BuildInfoProvider buildInfoProvider, long j) {
            Objects.requireNonNull(networkCapabilities, "NetworkCapabilities is required");
            Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
            this.downBandwidth = networkCapabilities.getLinkDownstreamBandwidthKbps();
            this.upBandwidth = networkCapabilities.getLinkUpstreamBandwidthKbps();
            int signalStrength = buildInfoProvider.getSdkInfoVersion() >= 29 ? networkCapabilities.getSignalStrength() : 0;
            this.signalStrength = signalStrength > -100 ? signalStrength : 0;
            this.isVpn = networkCapabilities.hasTransport(4);
            String connectionType = AndroidConnectionStatusProvider.getConnectionType(networkCapabilities);
            this.type = connectionType == null ? "" : connectionType;
            this.timestampNanos = j;
        }

        public boolean isSimilar(NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail) {
            int abs = Math.abs(this.signalStrength - networkBreadcrumbConnectionDetail.signalStrength);
            int abs2 = Math.abs(this.downBandwidth - networkBreadcrumbConnectionDetail.downBandwidth);
            int abs3 = Math.abs(this.upBandwidth - networkBreadcrumbConnectionDetail.upBandwidth);
            boolean z4 = DateUtils.nanosToMillis((double) Math.abs(this.timestampNanos - networkBreadcrumbConnectionDetail.timestampNanos)) < 5000.0d;
            return this.isVpn == networkBreadcrumbConnectionDetail.isVpn && this.type.equals(networkBreadcrumbConnectionDetail.type) && (z4 || abs <= 5) && (z4 || (((double) abs2) > Math.max(1000.0d, ((double) Math.abs(this.downBandwidth)) * 0.1d) ? 1 : (((double) abs2) == Math.max(1000.0d, ((double) Math.abs(this.downBandwidth)) * 0.1d) ? 0 : -1)) <= 0) && (z4 || (((double) abs3) > Math.max(1000.0d, ((double) Math.abs(this.upBandwidth)) * 0.1d) ? 1 : (((double) abs3) == Math.max(1000.0d, ((double) Math.abs(this.upBandwidth)) * 0.1d) ? 0 : -1)) <= 0);
        }
    }

    public static final class NetworkBreadcrumbsNetworkCallback extends ConnectivityManager.NetworkCallback {
        final BuildInfoProvider buildInfoProvider;
        final SentryDateProvider dateProvider;
        final IScopes scopes;
        Network currentNetwork = null;
        NetworkCapabilities lastCapabilities = null;
        long lastCapabilityNanos = 0;

        public NetworkBreadcrumbsNetworkCallback(IScopes iScopes, BuildInfoProvider buildInfoProvider, SentryDateProvider sentryDateProvider) {
            this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
            this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
            this.dateProvider = (SentryDateProvider) Objects.requireNonNull(sentryDateProvider, "SentryDateProvider is required");
        }

        private Breadcrumb createBreadcrumb(String str) {
            Breadcrumb breadcrumb = new Breadcrumb();
            breadcrumb.setType("system");
            breadcrumb.setCategory("network.event");
            breadcrumb.setData("action", str);
            breadcrumb.setLevel(SentryLevel.INFO);
            return breadcrumb;
        }

        private NetworkBreadcrumbConnectionDetail getNewConnectionDetails(NetworkCapabilities networkCapabilities, NetworkCapabilities networkCapabilities2, long j, long j3) {
            if (networkCapabilities == null) {
                return new NetworkBreadcrumbConnectionDetail(networkCapabilities2, this.buildInfoProvider, j3);
            }
            NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail = new NetworkBreadcrumbConnectionDetail(networkCapabilities, this.buildInfoProvider, j);
            NetworkBreadcrumbConnectionDetail networkBreadcrumbConnectionDetail2 = new NetworkBreadcrumbConnectionDetail(networkCapabilities2, this.buildInfoProvider, j3);
            if (networkBreadcrumbConnectionDetail.isSimilar(networkBreadcrumbConnectionDetail2)) {
                return null;
            }
            return networkBreadcrumbConnectionDetail2;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network.equals(this.currentNetwork)) {
                return;
            }
            this.scopes.addBreadcrumb(createBreadcrumb("NETWORK_AVAILABLE"));
            this.currentNetwork = network;
            this.lastCapabilities = null;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network.equals(this.currentNetwork)) {
                long nanoTimestamp = this.dateProvider.now().nanoTimestamp();
                NetworkBreadcrumbConnectionDetail newConnectionDetails = getNewConnectionDetails(this.lastCapabilities, networkCapabilities, this.lastCapabilityNanos, nanoTimestamp);
                if (newConnectionDetails == null) {
                    return;
                }
                this.lastCapabilities = networkCapabilities;
                this.lastCapabilityNanos = nanoTimestamp;
                Breadcrumb createBreadcrumb = createBreadcrumb("NETWORK_CAPABILITIES_CHANGED");
                createBreadcrumb.setData("download_bandwidth", Integer.valueOf(newConnectionDetails.downBandwidth));
                createBreadcrumb.setData("upload_bandwidth", Integer.valueOf(newConnectionDetails.upBandwidth));
                createBreadcrumb.setData("vpn_active", Boolean.valueOf(newConnectionDetails.isVpn));
                createBreadcrumb.setData("network_type", newConnectionDetails.type);
                int i7 = newConnectionDetails.signalStrength;
                if (i7 != 0) {
                    createBreadcrumb.setData("signal_strength", Integer.valueOf(i7));
                }
                Hint hint = new Hint();
                hint.set(TypeCheckHint.ANDROID_NETWORK_CAPABILITIES, newConnectionDetails);
                this.scopes.addBreadcrumb(createBreadcrumb, hint);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (network.equals(this.currentNetwork)) {
                this.scopes.addBreadcrumb(createBreadcrumb("NETWORK_LOST"));
                this.currentNetwork = null;
                this.lastCapabilities = null;
            }
        }
    }

    public NetworkBreadcrumbsIntegration(Context context, BuildInfoProvider buildInfoProvider, ILogger iLogger) {
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "Context is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$close$0() {
        ISentryLifecycleToken acquire = this.lock.acquire();
        try {
            if (this.networkCallback != null) {
                AndroidConnectionStatusProvider.unregisterNetworkCallback(this.context, this.logger, this.networkCallback);
                this.logger.log(SentryLevel.DEBUG, "NetworkBreadcrumbsIntegration removed.", new Object[0]);
            }
            this.networkCallback = null;
            if (acquire != null) {
                acquire.close();
            }
        } catch (Throwable th) {
            if (acquire != null) {
                try {
                    acquire.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed = true;
        try {
            ((SentryOptions) Objects.requireNonNull(this.options, "Options is required")).getExecutorService().submit(new d(this, 5));
        } catch (Throwable th) {
            this.logger.log(SentryLevel.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
        }
    }

    @Override // io.sentry.Integration
    public void register(final IScopes iScopes, final SentryOptions sentryOptions) {
        Objects.requireNonNull(iScopes, "Scopes are required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        ILogger iLogger = this.logger;
        SentryLevel sentryLevel = SentryLevel.DEBUG;
        iLogger.log(sentryLevel, "NetworkBreadcrumbsIntegration enabled: %s", Boolean.valueOf(sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
        this.options = sentryOptions;
        if (sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()) {
            if (this.buildInfoProvider.getSdkInfoVersion() < 24) {
                this.logger.log(sentryLevel, "NetworkCallbacks need Android N+.", new Object[0]);
                return;
            }
            try {
                sentryOptions.getExecutorService().submit(new Runnable() { // from class: io.sentry.android.core.NetworkBreadcrumbsIntegration.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (NetworkBreadcrumbsIntegration.this.isClosed) {
                            return;
                        }
                        ISentryLifecycleToken acquire = NetworkBreadcrumbsIntegration.this.lock.acquire();
                        try {
                            NetworkBreadcrumbsIntegration.this.networkCallback = new NetworkBreadcrumbsNetworkCallback(iScopes, NetworkBreadcrumbsIntegration.this.buildInfoProvider, sentryOptions.getDateProvider());
                            if (AndroidConnectionStatusProvider.registerNetworkCallback(NetworkBreadcrumbsIntegration.this.context, NetworkBreadcrumbsIntegration.this.logger, NetworkBreadcrumbsIntegration.this.buildInfoProvider, NetworkBreadcrumbsIntegration.this.networkCallback)) {
                                NetworkBreadcrumbsIntegration.this.logger.log(SentryLevel.DEBUG, "NetworkBreadcrumbsIntegration installed.", new Object[0]);
                                IntegrationUtils.addIntegrationToSdkVersion("NetworkBreadcrumbs");
                            } else {
                                NetworkBreadcrumbsIntegration.this.logger.log(SentryLevel.DEBUG, "NetworkBreadcrumbsIntegration not installed.", new Object[0]);
                            }
                            if (acquire != null) {
                                acquire.close();
                            }
                        } catch (Throwable th) {
                            if (acquire != null) {
                                try {
                                    acquire.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            }
                            throw th;
                        }
                    }
                });
            } catch (Throwable th) {
                this.logger.log(SentryLevel.ERROR, "Error submitting NetworkBreadcrumbsIntegration task.", th);
            }
        }
    }
}
