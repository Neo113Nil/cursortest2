package org.chromium.net;

import java.time.Duration;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class DnsOptions {
    private final Boolean mEnableStaleDns;
    private final Boolean mPersistHostCache;
    private final Long mPersistHostCachePeriodMillis;
    private final Boolean mPreestablishConnectionsToStaleDnsResults;
    private final StaleDnsOptions mStaleDnsOptions;
    private final Boolean mUseBuiltInDnsResolver;

    public @interface Experimental {
    }

    DnsOptions(Builder builder) {
        this.mEnableStaleDns = builder.mEnableStaleDns;
        this.mStaleDnsOptions = builder.mStaleDnsOptions;
        this.mPersistHostCachePeriodMillis = builder.mPersistHostCachePeriodMillis;
        this.mPreestablishConnectionsToStaleDnsResults = builder.mPreestablishConnectionsToStaleDnsResults;
        this.mUseBuiltInDnsResolver = builder.mUseBuiltInDnsResolver;
        this.mPersistHostCache = builder.mPersistHostCache;
    }

    public Boolean getUseBuiltInDnsResolver() {
        return this.mUseBuiltInDnsResolver;
    }

    public Boolean getPersistHostCache() {
        return this.mPersistHostCache;
    }

    public Boolean getEnableStaleDns() {
        return this.mEnableStaleDns;
    }

    public Long getPersistHostCachePeriodMillis() {
        return this.mPersistHostCachePeriodMillis;
    }

    public Boolean getPreestablishConnectionsToStaleDnsResults() {
        return this.mPreestablishConnectionsToStaleDnsResults;
    }

    public StaleDnsOptions getStaleDnsOptions() {
        return this.mStaleDnsOptions;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class StaleDnsOptions {
        private final Boolean mAllowCrossNetworkUsage;
        private final Long mFreshLookupTimeoutMillis;
        private final Long mMaxExpiredDelayMillis;
        private final Boolean mUseStaleOnNameNotResolved;

        public Long getFreshLookupTimeoutMillis() {
            return this.mFreshLookupTimeoutMillis;
        }

        public Long getMaxExpiredDelayMillis() {
            return this.mMaxExpiredDelayMillis;
        }

        public Boolean getAllowCrossNetworkUsage() {
            return this.mAllowCrossNetworkUsage;
        }

        public Boolean getUseStaleOnNameNotResolved() {
            return this.mUseStaleOnNameNotResolved;
        }

        public static Builder builder() {
            return new Builder();
        }

        StaleDnsOptions(Builder builder) {
            this.mFreshLookupTimeoutMillis = builder.mFreshLookupTimeoutMillis;
            this.mMaxExpiredDelayMillis = builder.mMaxExpiredDelayMillis;
            this.mAllowCrossNetworkUsage = builder.mAllowCrossNetworkUsage;
            this.mUseStaleOnNameNotResolved = builder.mUseStaleOnNameNotResolved;
        }

        public static final class Builder {
            private Boolean mAllowCrossNetworkUsage;
            private Long mFreshLookupTimeoutMillis;
            private Long mMaxExpiredDelayMillis;
            private Boolean mUseStaleOnNameNotResolved;

            Builder() {
            }

            public Builder setFreshLookupTimeoutMillis(long freshLookupTimeoutMillis) {
                this.mFreshLookupTimeoutMillis = Long.valueOf(freshLookupTimeoutMillis);
                return this;
            }

            public Builder setFreshLookupTimeout(Duration freshLookupTimeout) {
                Objects.requireNonNull(freshLookupTimeout);
                return setFreshLookupTimeoutMillis(freshLookupTimeout.toMillis());
            }

            public Builder setMaxExpiredDelayMillis(long maxExpiredDelayMillis) {
                this.mMaxExpiredDelayMillis = Long.valueOf(maxExpiredDelayMillis);
                return this;
            }

            public Builder setMaxExpiredDelay(Duration maxExpiredDelay) {
                Objects.requireNonNull(maxExpiredDelay);
                return setMaxExpiredDelayMillis(maxExpiredDelay.toMillis());
            }

            public Builder allowCrossNetworkUsage(boolean allowCrossNetworkUsage) {
                this.mAllowCrossNetworkUsage = Boolean.valueOf(allowCrossNetworkUsage);
                return this;
            }

            public Builder useStaleOnNameNotResolved(boolean useStaleOnNameNotResolved) {
                this.mUseStaleOnNameNotResolved = Boolean.valueOf(useStaleOnNameNotResolved);
                return this;
            }

            public StaleDnsOptions build() {
                return new StaleDnsOptions(this);
            }
        }
    }

    public static final class Builder {
        private Boolean mEnableStaleDns;
        private Boolean mPersistHostCache;
        private Long mPersistHostCachePeriodMillis;
        private Boolean mPreestablishConnectionsToStaleDnsResults;
        private StaleDnsOptions mStaleDnsOptions;
        private Boolean mUseBuiltInDnsResolver;

        Builder() {
        }

        public Builder useBuiltInDnsResolver(boolean enable) {
            this.mUseBuiltInDnsResolver = Boolean.valueOf(enable);
            return this;
        }

        public Builder enableStaleDns(boolean enable) {
            this.mEnableStaleDns = Boolean.valueOf(enable);
            return this;
        }

        public Builder setStaleDnsOptions(StaleDnsOptions staleDnsOptions) {
            this.mStaleDnsOptions = staleDnsOptions;
            return this;
        }

        public Builder setStaleDnsOptions(StaleDnsOptions.Builder staleDnsOptionsBuilder) {
            return setStaleDnsOptions(staleDnsOptionsBuilder.build());
        }

        public Builder preestablishConnectionsToStaleDnsResults(boolean enable) {
            this.mPreestablishConnectionsToStaleDnsResults = Boolean.valueOf(enable);
            return this;
        }

        public Builder persistHostCache(boolean persistHostCache) {
            this.mPersistHostCache = Boolean.valueOf(persistHostCache);
            return this;
        }

        public Builder setPersistHostCachePeriodMillis(long persistHostCachePeriodMillis) {
            this.mPersistHostCachePeriodMillis = Long.valueOf(persistHostCachePeriodMillis);
            return this;
        }

        public Builder setPersistDelay(Duration persistToDiskPeriod) {
            Objects.requireNonNull(persistToDiskPeriod);
            return setPersistHostCachePeriodMillis(persistToDiskPeriod.toMillis());
        }

        public DnsOptions build() {
            return new DnsOptions(this);
        }
    }
}
