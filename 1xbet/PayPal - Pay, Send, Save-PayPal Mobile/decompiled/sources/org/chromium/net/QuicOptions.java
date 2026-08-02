package org.chromium.net;

/* loaded from: classes18.dex */
public final class QuicOptions {
    private final java.util.Set<java.lang.String> mClientConnectionOptions;
    private final java.lang.Boolean mCloseSessionsOnIpChange;
    private final java.util.Set<java.lang.String> mConnectionOptions;
    private final java.lang.Long mCryptoHandshakeTimeoutSeconds;
    private final java.lang.Boolean mDelayJobsWithAvailableSpdySession;
    private final java.lang.Boolean mEnableTlsZeroRtt;
    private final java.util.Set<java.lang.String> mEnabledQuicVersions;
    private final java.util.Set<java.lang.String> mExtraQuicheFlags;
    private final java.lang.Boolean mGoawaySessionsOnIpChange;
    private final java.lang.String mHandshakeUserAgent;
    private final java.lang.Long mIdleConnectionTimeoutSeconds;
    private final java.lang.Integer mInMemoryServerConfigsCacheSize;
    private final java.lang.Boolean mIncreaseBrokenServicePeriodExponentially;
    private final java.lang.Long mInitialBrokenServicePeriodSeconds;
    private final java.lang.Long mPreCryptoHandshakeIdleTimeoutSeconds;
    private final java.util.Set<java.lang.String> mQuicHostAllowlist;
    private final java.lang.Long mRetransmittableOnWireTimeoutMillis;
    private final java.lang.Boolean mRetryWithoutAltSvcOnQuicErrors;

    /* loaded from: classes3.dex */
    public @interface Experimental {
    }

    /* loaded from: classes3.dex */
    public @interface QuichePassthroughOption {
    }

    QuicOptions(org.chromium.net.QuicOptions.Builder builder) {
        this.mQuicHostAllowlist = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.mQuicHostAllowlist));
        this.mEnabledQuicVersions = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.mEnabledQuicVersions));
        this.mConnectionOptions = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.mConnectionOptions));
        this.mClientConnectionOptions = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.mClientConnectionOptions));
        this.mInMemoryServerConfigsCacheSize = builder.mInMemoryServerConfigsCacheSize;
        this.mHandshakeUserAgent = builder.mHandshakeUserAgent;
        this.mRetryWithoutAltSvcOnQuicErrors = builder.mRetryWithoutAltSvcOnQuicErrors;
        this.mEnableTlsZeroRtt = builder.mEnableTlsZeroRtt;
        this.mPreCryptoHandshakeIdleTimeoutSeconds = builder.mPreCryptoHandshakeIdleTimeoutSeconds;
        this.mCryptoHandshakeTimeoutSeconds = builder.mCryptoHandshakeTimeoutSeconds;
        this.mIdleConnectionTimeoutSeconds = builder.mIdleConnectionTimeoutSeconds;
        this.mRetransmittableOnWireTimeoutMillis = builder.mRetransmittableOnWireTimeoutMillis;
        this.mCloseSessionsOnIpChange = builder.mCloseSessionsOnIpChange;
        this.mGoawaySessionsOnIpChange = builder.mGoawaySessionsOnIpChange;
        this.mInitialBrokenServicePeriodSeconds = builder.mInitialBrokenServicePeriodSeconds;
        this.mIncreaseBrokenServicePeriodExponentially = builder.mIncreaseBrokenServicePeriodExponentially;
        this.mDelayJobsWithAvailableSpdySession = builder.mDelayJobsWithAvailableSpdySession;
        this.mExtraQuicheFlags = java.util.Collections.unmodifiableSet(new java.util.LinkedHashSet(builder.mExtraQuicheFlags));
    }

    public final java.util.Set<java.lang.String> getQuicHostAllowlist() {
        return this.mQuicHostAllowlist;
    }

    public final java.util.Set<java.lang.String> getEnabledQuicVersions() {
        return this.mEnabledQuicVersions;
    }

    public final java.util.Set<java.lang.String> getConnectionOptions() {
        return this.mConnectionOptions;
    }

    public final java.util.Set<java.lang.String> getClientConnectionOptions() {
        return this.mClientConnectionOptions;
    }

    public final java.lang.Integer getInMemoryServerConfigsCacheSize() {
        return this.mInMemoryServerConfigsCacheSize;
    }

    public final java.lang.String getHandshakeUserAgent() {
        return this.mHandshakeUserAgent;
    }

    public final java.lang.Boolean getRetryWithoutAltSvcOnQuicErrors() {
        return this.mRetryWithoutAltSvcOnQuicErrors;
    }

    public final java.lang.Boolean getEnableTlsZeroRtt() {
        return this.mEnableTlsZeroRtt;
    }

    public final java.lang.Long getPreCryptoHandshakeIdleTimeoutSeconds() {
        return this.mPreCryptoHandshakeIdleTimeoutSeconds;
    }

    public final java.lang.Long getCryptoHandshakeTimeoutSeconds() {
        return this.mCryptoHandshakeTimeoutSeconds;
    }

    public final java.lang.Long getIdleConnectionTimeoutSeconds() {
        return this.mIdleConnectionTimeoutSeconds;
    }

    public final java.lang.Long getRetransmittableOnWireTimeoutMillis() {
        return this.mRetransmittableOnWireTimeoutMillis;
    }

    public final java.lang.Boolean getCloseSessionsOnIpChange() {
        return this.mCloseSessionsOnIpChange;
    }

    public final java.lang.Boolean getGoawaySessionsOnIpChange() {
        return this.mGoawaySessionsOnIpChange;
    }

    public final java.lang.Long getInitialBrokenServicePeriodSeconds() {
        return this.mInitialBrokenServicePeriodSeconds;
    }

    public final java.lang.Boolean getIncreaseBrokenServicePeriodExponentially() {
        return this.mIncreaseBrokenServicePeriodExponentially;
    }

    public final java.lang.Boolean getDelayJobsWithAvailableSpdySession() {
        return this.mDelayJobsWithAvailableSpdySession;
    }

    public final java.util.Set<java.lang.String> getExtraQuicheFlags() {
        return this.mExtraQuicheFlags;
    }

    public static org.chromium.net.QuicOptions.Builder builder() {
        return new org.chromium.net.QuicOptions.Builder();
    }

    public static class Builder {
        private java.lang.Boolean mCloseSessionsOnIpChange;
        private java.lang.Long mCryptoHandshakeTimeoutSeconds;
        private java.lang.Boolean mDelayJobsWithAvailableSpdySession;
        private java.lang.Boolean mEnableTlsZeroRtt;
        private java.lang.Boolean mGoawaySessionsOnIpChange;
        private java.lang.String mHandshakeUserAgent;
        private java.lang.Long mIdleConnectionTimeoutSeconds;
        private java.lang.Integer mInMemoryServerConfigsCacheSize;
        private java.lang.Boolean mIncreaseBrokenServicePeriodExponentially;
        private java.lang.Long mInitialBrokenServicePeriodSeconds;
        private java.lang.Long mPreCryptoHandshakeIdleTimeoutSeconds;
        private java.lang.Long mRetransmittableOnWireTimeoutMillis;
        private java.lang.Boolean mRetryWithoutAltSvcOnQuicErrors;
        private final java.util.Set<java.lang.String> mQuicHostAllowlist = new java.util.LinkedHashSet();
        private final java.util.Set<java.lang.String> mEnabledQuicVersions = new java.util.LinkedHashSet();
        private final java.util.Set<java.lang.String> mConnectionOptions = new java.util.LinkedHashSet();
        private final java.util.Set<java.lang.String> mClientConnectionOptions = new java.util.LinkedHashSet();
        private final java.util.Set<java.lang.String> mExtraQuicheFlags = new java.util.LinkedHashSet();

        Builder() {
        }

        public org.chromium.net.QuicOptions.Builder addAllowedQuicHost(java.lang.String str) {
            this.mQuicHostAllowlist.add(str);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder addEnabledQuicVersion(java.lang.String str) {
            this.mEnabledQuicVersions.add(str);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder addConnectionOption(java.lang.String str) {
            this.mConnectionOptions.add(str);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder addClientConnectionOption(java.lang.String str) {
            this.mClientConnectionOptions.add(str);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setInMemoryServerConfigsCacheSize(int i) {
            this.mInMemoryServerConfigsCacheSize = java.lang.Integer.valueOf(i);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setHandshakeUserAgent(java.lang.String str) {
            this.mHandshakeUserAgent = str;
            return this;
        }

        public org.chromium.net.QuicOptions.Builder retryWithoutAltSvcOnQuicErrors(boolean z) {
            this.mRetryWithoutAltSvcOnQuicErrors = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder enableTlsZeroRtt(boolean z) {
            this.mEnableTlsZeroRtt = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setPreCryptoHandshakeIdleTimeoutSeconds(long j) {
            this.mPreCryptoHandshakeIdleTimeoutSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setCryptoHandshakeTimeoutSeconds(long j) {
            this.mCryptoHandshakeTimeoutSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setIdleConnectionTimeoutSeconds(long j) {
            this.mIdleConnectionTimeoutSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setIdleConnectionTimeout(java.time.Duration duration) {
            java.util.Objects.requireNonNull(duration);
            return setIdleConnectionTimeoutSeconds(duration.toSeconds());
        }

        public org.chromium.net.QuicOptions.Builder setRetransmittableOnWireTimeoutMillis(long j) {
            this.mRetransmittableOnWireTimeoutMillis = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder closeSessionsOnIpChange(boolean z) {
            this.mCloseSessionsOnIpChange = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder goawaySessionsOnIpChange(boolean z) {
            this.mGoawaySessionsOnIpChange = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder setInitialBrokenServicePeriodSeconds(long j) {
            this.mInitialBrokenServicePeriodSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder increaseBrokenServicePeriodExponentially(boolean z) {
            this.mIncreaseBrokenServicePeriodExponentially = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder delayJobsWithAvailableSpdySession(boolean z) {
            this.mDelayJobsWithAvailableSpdySession = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.QuicOptions.Builder addExtraQuicheFlag(java.lang.String str) {
            this.mExtraQuicheFlags.add(str);
            return this;
        }

        public org.chromium.net.QuicOptions build() {
            return new org.chromium.net.QuicOptions(this);
        }
    }
}
