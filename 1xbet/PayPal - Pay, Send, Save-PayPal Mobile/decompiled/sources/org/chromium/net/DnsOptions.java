package org.chromium.net;

/* loaded from: classes18.dex */
public final class DnsOptions {
    private final java.lang.Boolean mEnableStaleDns;
    private final java.lang.Boolean mPersistHostCache;
    private final java.lang.Long mPersistHostCachePeriodMillis;
    private final java.lang.Boolean mPreestablishConnectionsToStaleDnsResults;
    private final org.chromium.net.DnsOptions.StaleDnsOptions mStaleDnsOptions;
    private final java.lang.Boolean mUseBuiltInDnsResolver;

    /* loaded from: classes3.dex */
    public @interface Experimental {
    }

    DnsOptions(org.chromium.net.DnsOptions.Builder builder) {
        this.mEnableStaleDns = builder.mEnableStaleDns;
        this.mStaleDnsOptions = builder.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = builder.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = builder.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = builder.mUseBuiltInDnsResolver;
        this.mPersistHostCache = builder.mPersistHostCache;
    }

    public final java.lang.Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }

    public final java.lang.Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    public final java.lang.Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    public final java.lang.Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    public final java.lang.Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    public final org.chromium.net.DnsOptions.StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    public static org.chromium.net.DnsOptions.Builder builder() {
        return new org.chromium.net.DnsOptions.Builder();
    }

    public static class StaleDnsOptions {
        private final java.lang.Boolean mAllowCrossNetworkUsage;
        private final java.lang.Long mFreshLookupTimeoutMillis;
        private final java.lang.Long mMaxExpiredDelayMillis;
        private final java.lang.Boolean mUseStaleOnNameNotResolved;

        public java.lang.Long getFreshLookupTimeoutMillis() {
            return this.mFreshLookupTimeoutMillis;
        }

        public java.lang.Long getMaxExpiredDelayMillis() {
            return this.mMaxExpiredDelayMillis;
        }

        public java.lang.Boolean getAllowCrossNetworkUsage() {
            return this.mAllowCrossNetworkUsage;
        }

        public java.lang.Boolean getUseStaleOnNameNotResolved() {
            return this.mUseStaleOnNameNotResolved;
        }

        public static org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder() {
            return new org.chromium.net.DnsOptions.StaleDnsOptions.Builder();
        }

        StaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder) {
            this.mFreshLookupTimeoutMillis = builder.mFreshLookupTimeoutMillis;
            this.mMaxExpiredDelayMillis = builder.mMaxExpiredDelayMillis;
            this.mAllowCrossNetworkUsage = builder.mAllowCrossNetworkUsage;
            this.mUseStaleOnNameNotResolved = builder.mUseStaleOnNameNotResolved;
        }

        public static final class Builder {
            private java.lang.Boolean mAllowCrossNetworkUsage;
            private java.lang.Long mFreshLookupTimeoutMillis;
            private java.lang.Long mMaxExpiredDelayMillis;
            private java.lang.Boolean mUseStaleOnNameNotResolved;

            Builder() {
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeoutMillis(long j) {
                this.mFreshLookupTimeoutMillis = java.lang.Long.valueOf(j);
                return this;
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions.Builder setFreshLookupTimeout(java.time.Duration duration) {
                java.util.Objects.requireNonNull(duration);
                return setFreshLookupTimeoutMillis(duration.toMillis());
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelayMillis(long j) {
                this.mMaxExpiredDelayMillis = java.lang.Long.valueOf(j);
                return this;
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions.Builder setMaxExpiredDelay(java.time.Duration duration) {
                java.util.Objects.requireNonNull(duration);
                return setMaxExpiredDelayMillis(duration.toMillis());
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions.Builder allowCrossNetworkUsage(boolean z) {
                this.mAllowCrossNetworkUsage = java.lang.Boolean.valueOf(z);
                return this;
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions.Builder useStaleOnNameNotResolved(boolean z) {
                this.mUseStaleOnNameNotResolved = java.lang.Boolean.valueOf(z);
                return this;
            }

            public final org.chromium.net.DnsOptions.StaleDnsOptions build() {
                return new org.chromium.net.DnsOptions.StaleDnsOptions(this);
            }
        }
    }

    public static final class Builder {
        private java.lang.Boolean mEnableStaleDns;
        private java.lang.Boolean mPersistHostCache;
        private java.lang.Long mPersistHostCachePeriodMillis;
        private java.lang.Boolean mPreestablishConnectionsToStaleDnsResults;
        private org.chromium.net.DnsOptions.StaleDnsOptions mStaleDnsOptions;
        private java.lang.Boolean mUseBuiltInDnsResolver;

        Builder() {
        }

        public final org.chromium.net.DnsOptions.Builder useBuiltInDnsResolver(boolean z) {
            this.mUseBuiltInDnsResolver = java.lang.Boolean.valueOf(z);
            return this;
        }

        public final org.chromium.net.DnsOptions.Builder enableStaleDns(boolean z) {
            this.mEnableStaleDns = java.lang.Boolean.valueOf(z);
            return this;
        }

        public final org.chromium.net.DnsOptions.Builder setStaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions staleDnsOptions) {
            this.mStaleDnsOptions = staleDnsOptions;
            return this;
        }

        public final org.chromium.net.DnsOptions.Builder setStaleDnsOptions(org.chromium.net.DnsOptions.StaleDnsOptions.Builder builder) {
            return setStaleDnsOptions(builder.build());
        }

        public final org.chromium.net.DnsOptions.Builder preestablishConnectionsToStaleDnsResults(boolean z) {
            this.mPreestablishConnectionsToStaleDnsResults = java.lang.Boolean.valueOf(z);
            return this;
        }

        public final org.chromium.net.DnsOptions.Builder persistHostCache(boolean z) {
            this.mPersistHostCache = java.lang.Boolean.valueOf(z);
            return this;
        }

        public final org.chromium.net.DnsOptions.Builder setPersistHostCachePeriodMillis(long j) {
            this.mPersistHostCachePeriodMillis = java.lang.Long.valueOf(j);
            return this;
        }

        public final org.chromium.net.DnsOptions.Builder setPersistDelay(java.time.Duration duration) {
            java.util.Objects.requireNonNull(duration);
            return setPersistHostCachePeriodMillis(duration.toMillis());
        }

        public final org.chromium.net.DnsOptions build() {
            return new org.chromium.net.DnsOptions(this);
        }
    }
}
