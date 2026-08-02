package org.chromium.net.impl;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.util.Base64;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.IDN;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Pattern;
import org.chromium.net.CronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.ProxyOptions;
import org.chromium.net.impl.CronetLogger;
import org.chromium.net.impl.VersionSafeCallbacks;

/* loaded from: classes4.dex */
public abstract class CronetEngineBuilderImpl extends ICronetEngineBuilder {
    public static final int NETWORK_THREAD_PRIORITY = 0;
    private final Context mApplicationContext;
    private boolean mBrotiEnabled;
    private String mExperimentalOptions;
    private boolean mHttp2Enabled;
    private long mHttpCacheMaxSize;
    private HttpCacheMode mHttpCacheMode;
    protected final CronetLogger mLogger;
    protected long mMockCertVerifier;
    private boolean mNetworkQualityEstimatorEnabled;
    private final List<Pkp> mPkps;
    private VersionSafeProxyOptions mProxyOptions;
    private boolean mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    private boolean mQuicEnabled;
    private final List<QuicHint> mQuicHints;
    private String mStoragePath;
    private String mUserAgent;
    private static final Pattern INVALID_PKP_HOST_NAME = Pattern.compile("^[0-9\\.]*$");
    static int sApiLevel = VersionSafeCallbacks.ApiVersion.getMaximumAvailableApiLevel();

    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpCacheSetting {
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableSdch(boolean value) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return null;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setLibraryLoader(CronetEngine.Builder.LibraryLoader loader) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setThreadPriority(int priority) {
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String hostName, Set pinsSha256, boolean includeSubdomains, Date expirationDate) {
        return addPublicKeyPins(hostName, (Set<byte[]>) pinsSha256, includeSubdomains, expirationDate);
    }

    public static class QuicHint {
        final int mAlternatePort;
        final String mHost;
        final int mPort;

        QuicHint(String host, int port, int alternatePort) {
            this.mHost = host;
            this.mPort = port;
            this.mAlternatePort = alternatePort;
        }
    }

    public static class Pkp {
        final Date mExpirationDate;
        final byte[][] mHashes;
        final String mHost;
        final boolean mIncludeSubdomains;

        Pkp(String host, byte[][] hashes, boolean includeSubdomains, Date expirationDate) {
            this.mHost = host;
            this.mHashes = hashes;
            this.mIncludeSubdomains = includeSubdomains;
            this.mExpirationDate = expirationDate;
        }
    }

    enum HttpCacheMode {
        DISABLED(0, false),
        DISK(1, true),
        DISK_NO_HTTP(1, false),
        MEMORY(2, true);

        private final boolean mContentCacheEnabled;
        private final int mType;

        HttpCacheMode(int type, boolean contentCacheEnabled) {
            this.mContentCacheEnabled = contentCacheEnabled;
            this.mType = type;
        }

        int getType() {
            return this.mType;
        }

        boolean isContentCacheEnabled() {
            return this.mContentCacheEnabled;
        }

        int toPublicBuilderCacheMode() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return 0;
            }
            if (ordinal == 1) {
                return 3;
            }
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new IllegalArgumentException("Unknown internal builder cache mode");
        }

        static HttpCacheMode fromPublicBuilderCacheMode(int cacheMode) {
            if (cacheMode == 0) {
                return DISABLED;
            }
            if (cacheMode == 1) {
                return MEMORY;
            }
            if (cacheMode == 2) {
                return DISK_NO_HTTP;
            }
            if (cacheMode == 3) {
                return DISK;
            }
            throw new IllegalArgumentException("Unknown public builder cache mode");
        }
    }

    public CronetEngineBuilderImpl(Context context, CronetLogger.CronetSource cronetSource) {
        this.mQuicHints = new ArrayList();
        this.mPkps = new ArrayList();
        long uptimeMillis = SystemClock.uptimeMillis();
        Context applicationContext = context.getApplicationContext();
        this.mApplicationContext = applicationContext;
        this.mLogger = CronetLoggerFactory.createLogger(applicationContext, cronetSource);
        try {
            enableQuic(true);
            enableHttp2(true);
            enableBrotli(false);
            enableHttpCache(0, 0L);
            enableNetworkQualityEstimator(false);
            enablePublicKeyPinningBypassForLocalTrustAnchors(true);
            maybeLogCronetEngineBuilderInitializedInfo(uptimeMillis, true, cronetSource);
        } catch (Throwable th) {
            maybeLogCronetEngineBuilderInitializedInfo(uptimeMillis, false, cronetSource);
            throw th;
        }
    }

    public CronetEngineBuilderImpl(Context context) {
        this(context, CronetLogger.CronetSource.CRONET_SOURCE_UNSPECIFIED);
    }

    private void maybeLogCronetEngineBuilderInitializedInfo(long startUptimeMillis, boolean successful, CronetLogger.CronetSource cronetSource) {
        if (sApiLevel >= 30) {
            return;
        }
        CronetLogger.CronetEngineBuilderInitializedInfo cronetEngineBuilderInitializedInfo = new CronetLogger.CronetEngineBuilderInitializedInfo();
        cronetEngineBuilderInitializedInfo.creationSuccessful = false;
        try {
            cronetEngineBuilderInitializedInfo.author = CronetLogger.CronetEngineBuilderInitializedInfo.Author.IMPL;
            cronetEngineBuilderInitializedInfo.uid = Process.myUid();
            cronetEngineBuilderInitializedInfo.implVersion = new CronetLogger.CronetVersion(ImplVersion.getCronetVersion());
            cronetEngineBuilderInitializedInfo.source = cronetSource;
            cronetEngineBuilderInitializedInfo.apiVersion = new CronetLogger.CronetVersion(VersionSafeCallbacks.ApiVersion.getCronetVersion());
            cronetEngineBuilderInitializedInfo.cronetInitializationRef = getLogCronetInitializationRef();
            cronetEngineBuilderInitializedInfo.creationSuccessful = Boolean.valueOf(successful);
        } finally {
            cronetEngineBuilderInitializedInfo.engineBuilderCreatedLatencyMillis = (int) (SystemClock.uptimeMillis() - startUptimeMillis);
            this.mLogger.logCronetEngineBuilderInitializedInfo(cronetEngineBuilderInitializedInfo);
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public String getDefaultUserAgent() {
        return UserAgent.from(this.mApplicationContext);
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setUserAgent(String userAgent) {
        this.mUserAgent = userAgent;
        return this;
    }

    String getUserAgent() {
        return this.mUserAgent;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setStoragePath(String value) {
        if (!new File(value).isDirectory()) {
            throw new IllegalArgumentException("Storage path must be set to existing directory");
        }
        this.mStoragePath = value;
        return this;
    }

    String storagePath() {
        return this.mStoragePath;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableQuic(boolean value) {
        this.mQuicEnabled = value;
        return this;
    }

    boolean quicEnabled() {
        return this.mQuicEnabled;
    }

    String getDefaultQuicUserAgentId() {
        return this.mQuicEnabled ? UserAgent.getQuicUserAgentIdFrom(this.mApplicationContext) : "";
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttp2(boolean value) {
        this.mHttp2Enabled = value;
        return this;
    }

    boolean http2Enabled() {
        return this.mHttp2Enabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableBrotli(boolean value) {
        this.mBrotiEnabled = value;
        return this;
    }

    boolean brotliEnabled() {
        return this.mBrotiEnabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableHttpCache(int cacheMode, long maxSize) {
        HttpCacheMode fromPublicBuilderCacheMode = HttpCacheMode.fromPublicBuilderCacheMode(cacheMode);
        if (fromPublicBuilderCacheMode.getType() == 1 && storagePath() == null) {
            throw new IllegalArgumentException("Storage path must be set");
        }
        this.mHttpCacheMode = fromPublicBuilderCacheMode;
        this.mHttpCacheMaxSize = maxSize;
        return this;
    }

    boolean cacheDisabled() {
        return !this.mHttpCacheMode.isContentCacheEnabled();
    }

    long httpCacheMaxSize() {
        return this.mHttpCacheMaxSize;
    }

    int httpCacheMode() {
        return this.mHttpCacheMode.getType();
    }

    int publicBuilderHttpCacheMode() {
        return this.mHttpCacheMode.toPublicBuilderCacheMode();
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addQuicHint(String host, int port, int alternatePort) {
        if (host.contains("/")) {
            throw new IllegalArgumentException("Illegal QUIC Hint Host: " + host);
        }
        this.mQuicHints.add(new QuicHint(host, port, alternatePort));
        return this;
    }

    List<QuicHint> quicHints() {
        return this.mQuicHints;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl addPublicKeyPins(String hostName, Set<byte[]> pinsSha256, boolean includeSubdomains, Date expirationDate) {
        Objects.requireNonNull(hostName, "The hostname cannot be null.");
        Objects.requireNonNull(pinsSha256, "The set of SHA256 pins cannot be null.");
        Objects.requireNonNull(expirationDate, "The pin expiration date cannot be null.");
        String validateHostNameForPinningAndConvert = validateHostNameForPinningAndConvert(hostName);
        HashMap hashMap = new HashMap();
        for (byte[] bArr : pinsSha256) {
            if (bArr == null || bArr.length != 32) {
                throw new IllegalArgumentException("Public key pin is invalid");
            }
            hashMap.put(Base64.encodeToString(bArr, 0), bArr);
        }
        this.mPkps.add(new Pkp(validateHostNameForPinningAndConvert, (byte[][]) hashMap.values().toArray(new byte[hashMap.size()][]), includeSubdomains, expirationDate));
        return this;
    }

    List<Pkp> publicKeyPins() {
        return this.mPkps;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enablePublicKeyPinningBypassForLocalTrustAnchors(boolean value) {
        this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled = value;
        return this;
    }

    boolean publicKeyPinningBypassForLocalTrustAnchorsEnabled() {
        return this.mPublicKeyPinningBypassForLocalTrustAnchorsEnabled;
    }

    private static String validateHostNameForPinningAndConvert(String hostName) throws IllegalArgumentException {
        if (INVALID_PKP_HOST_NAME.matcher(hostName).matches()) {
            throw new IllegalArgumentException("Hostname " + hostName + " is illegal. A hostname should not consist of digits and/or dots only.");
        }
        if (hostName.length() > 255) {
            throw new IllegalArgumentException("Hostname " + hostName + " is too long. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
        try {
            return IDN.toASCII(hostName, 2);
        } catch (IllegalArgumentException unused) {
            throw new IllegalArgumentException("Hostname " + hostName + " is illegal. The name of the host does not comply with RFC 1122 and RFC 1123.");
        }
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setExperimentalOptions(String options) {
        this.mExperimentalOptions = options;
        return this;
    }

    public String experimentalOptions() {
        return this.mExperimentalOptions;
    }

    public CronetEngineBuilderImpl setMockCertVerifierForTesting(long mockCertVerifier) {
        this.mMockCertVerifier = mockCertVerifier;
        return this;
    }

    long mockCertVerifier() {
        return this.mMockCertVerifier;
    }

    boolean networkQualityEstimatorEnabled() {
        return this.mNetworkQualityEstimatorEnabled;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl enableNetworkQualityEstimator(boolean value) {
        this.mNetworkQualityEstimatorEnabled = value;
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public CronetEngineBuilderImpl setProxyOptions(ProxyOptions proxyOptions) {
        if (proxyOptions != null) {
            this.mProxyOptions = new VersionSafeProxyOptions(proxyOptions);
        }
        return this;
    }

    VersionSafeProxyOptions getProxyOptions() {
        return this.mProxyOptions;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public Set<Integer> getSupportedConfigOptions() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return Collections.unmodifiableSet(hashSet);
    }

    Context getContext() {
        return this.mApplicationContext;
    }

    CronetLogger.CronetEngineBuilderInfo toLoggerInfo() {
        return new CronetLogger.CronetEngineBuilderInfo(publicKeyPinningBypassForLocalTrustAnchorsEnabled(), getUserAgent(), storagePath(), quicEnabled(), http2Enabled(), brotliEnabled(), publicBuilderHttpCacheMode(), experimentalOptions(), networkQualityEstimatorEnabled(), 0, getLogCronetInitializationRef());
    }
}
