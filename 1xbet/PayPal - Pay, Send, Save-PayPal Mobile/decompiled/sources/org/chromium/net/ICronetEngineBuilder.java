package org.chromium.net;

/* loaded from: classes5.dex */
public abstract class ICronetEngineBuilder {
    public static final int CONNECTION_MIGRATION_OPTIONS = 1;
    public static final int DNS_OPTIONS = 2;
    public static final int PROXY_OPTIONS = 4;
    public static final int QUIC_OPTIONS = 3;

    public abstract org.chromium.net.ICronetEngineBuilder addPublicKeyPins(java.lang.String str, java.util.Set<byte[]> set, boolean z, java.util.Date date);

    public abstract org.chromium.net.ICronetEngineBuilder addQuicHint(java.lang.String str, int i, int i2);

    public abstract org.chromium.net.ExperimentalCronetEngine build();

    public org.chromium.net.ICronetEngineBuilder enableBrotli(boolean z) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder enableHttp2(boolean z);

    public abstract org.chromium.net.ICronetEngineBuilder enableHttpCache(int i, long j);

    public org.chromium.net.ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z);

    public abstract org.chromium.net.ICronetEngineBuilder enableQuic(boolean z);

    public abstract org.chromium.net.ICronetEngineBuilder enableSdch(boolean z);

    public abstract java.lang.String getDefaultUserAgent();

    protected long getLogCronetInitializationRef() {
        return 0L;
    }

    public org.chromium.net.ICronetEngineBuilder setConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions connectionMigrationOptions) {
        return this;
    }

    public org.chromium.net.ICronetEngineBuilder setDnsOptions(org.chromium.net.DnsOptions dnsOptions) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setExperimentalOptions(java.lang.String str);

    public abstract org.chromium.net.ICronetEngineBuilder setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader);

    public org.chromium.net.ICronetEngineBuilder setQuicOptions(org.chromium.net.QuicOptions quicOptions) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setStoragePath(java.lang.String str);

    public org.chromium.net.ICronetEngineBuilder setThreadPriority(int i) {
        return this;
    }

    public abstract org.chromium.net.ICronetEngineBuilder setUserAgent(java.lang.String str);

    public org.chromium.net.ICronetEngineBuilder setProxyOptions(org.chromium.net.ProxyOptions proxyOptions) {
        throw new java.lang.UnsupportedOperationException("This Cronet implementation does not support ProxyOptions");
    }

    protected java.util.Set<java.lang.Integer> getSupportedConfigOptions() {
        return java.util.Collections.emptySet();
    }
}
