package com.datadog.android.core.internal.net.info;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0001!B\u0019\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/datadog/android/core/internal/net/info/CallbackNetworkInfoProvider;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lcom/datadog/android/core/internal/net/info/NetworkInfoProvider;", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "<init>", "(Lcom/datadog/android/internal/system/BuildSdkVersionProvider;Lcom/datadog/android/api/InternalLogger;)V", "Lcom/datadog/android/api/context/NetworkInfo;", "getLatestNetworkInfo", "()Lcom/datadog/android/api/context/NetworkInfo;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "Landroid/content/Context;", "context", "register", "(Landroid/content/Context;)V", "unregister", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/context/NetworkInfo;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CallbackNetworkInfoProvider extends android.net.ConnectivityManager.NetworkCallback implements com.datadog.android.core.internal.net.info.NetworkInfoProvider {
    public static final java.lang.String ERROR_REGISTER = "We couldn't register a Network Callback, the network information reported will be less accurate.";
    public static final java.lang.String ERROR_UNREGISTER = "We couldn't unregister the Network Callback";

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoSizes;
    private com.datadog.android.api.context.NetworkInfo getHighSpeedVideoFpsRanges;
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighSpeedVideoFpsRangesFor;

    public /* synthetic */ CallbackNetworkInfoProvider(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider, internalLogger);
    }

    public CallbackNetworkInfoProvider(com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRangesFor = buildSdkVersionProvider;
        this.getHighSpeedVideoSizes = internalLogger;
        this.getHighSpeedVideoFpsRanges = new com.datadog.android.api.context.NetworkInfo(null, null, null, null, null, null, null, 127, null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
        com.datadog.android.api.context.NetworkInfo.Connectivity connectivity;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities, "");
        super.onCapabilitiesChanged(network, networkCapabilities);
        if (networkCapabilities.hasTransport(1)) {
            connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_WIFI;
        } else if (networkCapabilities.hasTransport(3)) {
            connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_ETHERNET;
        } else if (networkCapabilities.hasTransport(0)) {
            connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_CELLULAR;
        } else if (networkCapabilities.hasTransport(2)) {
            connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_BLUETOOTH;
        } else {
            connectivity = com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER;
        }
        this.getHighSpeedVideoFpsRanges = new com.datadog.android.api.context.NetworkInfo(connectivity, null, null, networkCapabilities.getLinkUpstreamBandwidthKbps() > 0 ? java.lang.Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()) : null, networkCapabilities.getLinkDownstreamBandwidthKbps() > 0 ? java.lang.Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()) : null, (!this.getHighSpeedVideoFpsRangesFor.getIsAtLeastQ() || networkCapabilities.getSignalStrength() == Integer.MIN_VALUE) ? null : java.lang.Long.valueOf(networkCapabilities.getSignalStrength()), null, 70, null);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(android.net.Network network) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
        super.onLost(network);
        this.getHighSpeedVideoFpsRanges = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_NOT_CONNECTED, null, null, null, null, null, null, 126, null);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void register(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider.ERROR_REGISTER;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(this);
            android.net.Network activeNetwork = connectivityManager.getActiveNetwork();
            android.net.NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (activeNetwork == null || networkCapabilities == null) {
                return;
            }
            onCapabilitiesChanged(activeNetwork, networkCapabilities);
        } catch (java.lang.SecurityException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider.ERROR_REGISTER;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            this.getHighSpeedVideoFpsRanges = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
        } catch (java.lang.Exception e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$register$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider.ERROR_REGISTER;
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            this.getHighSpeedVideoFpsRanges = new com.datadog.android.api.context.NetworkInfo(com.datadog.android.api.context.NetworkInfo.Connectivity.NETWORK_OTHER, null, null, null, null, null, null, 126, null);
        }
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void unregister(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.lang.Object systemService = context.getSystemService("connectivity");
        android.net.ConnectivityManager connectivityManager = systemService instanceof android.net.ConnectivityManager ? (android.net.ConnectivityManager) systemService : null;
        if (connectivityManager == null) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider.ERROR_UNREGISTER;
                }
            }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (java.lang.SecurityException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider.ERROR_UNREGISTER;
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        } catch (java.lang.RuntimeException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoSizes, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider$unregister$3
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return com.datadog.android.core.internal.net.info.CallbackNetworkInfoProvider.ERROR_UNREGISTER;
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    /* renamed from: getLatestNetworkInfo, reason: from getter */
    public final com.datadog.android.api.context.NetworkInfo getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }
}
