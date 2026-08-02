package org.chromium.net;

/* loaded from: classes4.dex */
public final class ConnectionMigrationOptions {
    private final Boolean mAllowNonDefaultNetworkUsage;
    private final Boolean mAllowServerMigration;
    private final Boolean mEnableDefaultNetworkMigration;
    private final Boolean mEnablePathDegradationMigration;
    private final Long mIdleMigrationPeriodSeconds;
    private final Integer mMaxPathDegradingEagerMigrationsCount;
    private final Long mMaxTimeOnNonDefaultNetworkSeconds;
    private final Integer mMaxWriteErrorEagerMigrationsCount;
    private final Boolean mMigrateIdleConnections;
    private final Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

    public @interface Experimental {
    }

    public Boolean getEnableDefaultNetworkMigration() {
        return this.mEnableDefaultNetworkMigration;
    }

    public Boolean getEnablePathDegradationMigration() {
        return this.mEnablePathDegradationMigration;
    }

    public Boolean getAllowServerMigration() {
        return this.mAllowServerMigration;
    }

    public Boolean getMigrateIdleConnections() {
        return this.mMigrateIdleConnections;
    }

    public Long getIdleMigrationPeriodSeconds() {
        return this.mIdleMigrationPeriodSeconds;
    }

    public Boolean getRetryPreHandshakeErrorsOnAlternateNetwork() {
        return this.mRetryPreHandshakeErrorsOnAlternateNetwork;
    }

    public Boolean getAllowNonDefaultNetworkUsage() {
        return this.mAllowNonDefaultNetworkUsage;
    }

    public Long getMaxTimeOnNonDefaultNetworkSeconds() {
        return this.mMaxTimeOnNonDefaultNetworkSeconds;
    }

    public Integer getMaxWriteErrorEagerMigrationsCount() {
        return this.mMaxWriteErrorEagerMigrationsCount;
    }

    public Integer getMaxPathDegradingEagerMigrationsCount() {
        return this.mMaxPathDegradingEagerMigrationsCount;
    }

    private ConnectionMigrationOptions(Builder builder) {
        this.mEnableDefaultNetworkMigration = builder.mEnableDefaultNetworkConnectionMigration;
        this.mEnablePathDegradationMigration = builder.mEnablePathDegradationMigration;
        this.mAllowServerMigration = builder.mAllowServerMigration;
        this.mMigrateIdleConnections = builder.mMigrateIdleConnections;
        this.mIdleMigrationPeriodSeconds = builder.mIdleConnectionMigrationPeriodSeconds;
        this.mRetryPreHandshakeErrorsOnAlternateNetwork = builder.mRetryPreHandshakeErrorsOnAlternateNetwork;
        this.mAllowNonDefaultNetworkUsage = builder.mAllowNonDefaultNetworkUsage;
        this.mMaxTimeOnNonDefaultNetworkSeconds = builder.mMaxTimeOnNonDefaultNetworkSeconds;
        this.mMaxWriteErrorEagerMigrationsCount = builder.mMaxWriteErrorEagerMigrationsCount;
        this.mMaxPathDegradingEagerMigrationsCount = builder.mMaxPathDegradingEagerMigrationsCount;
    }

    public static class Builder {
        private Boolean mAllowNonDefaultNetworkUsage;
        private Boolean mAllowServerMigration;
        private Boolean mEnableDefaultNetworkConnectionMigration;
        private Boolean mEnablePathDegradationMigration;
        private Long mIdleConnectionMigrationPeriodSeconds;
        private Integer mMaxPathDegradingEagerMigrationsCount;
        private Long mMaxTimeOnNonDefaultNetworkSeconds;
        private Integer mMaxWriteErrorEagerMigrationsCount;
        private Boolean mMigrateIdleConnections;
        private Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

        private Builder() {
        }

        public Builder enableDefaultNetworkMigration(boolean enableDefaultNetworkConnectionMigration) {
            this.mEnableDefaultNetworkConnectionMigration = Boolean.valueOf(enableDefaultNetworkConnectionMigration);
            return this;
        }

        public Builder enablePathDegradationMigration(boolean enable) {
            this.mEnablePathDegradationMigration = Boolean.valueOf(enable);
            return this;
        }

        public Builder allowServerMigration(boolean allowServerMigration) {
            this.mAllowServerMigration = Boolean.valueOf(allowServerMigration);
            return this;
        }

        public Builder migrateIdleConnections(boolean migrateIdleConnections) {
            this.mMigrateIdleConnections = Boolean.valueOf(migrateIdleConnections);
            return this;
        }

        public Builder setIdleConnectionMigrationPeriodSeconds(long idleConnectionMigrationPeriodSeconds) {
            this.mIdleConnectionMigrationPeriodSeconds = Long.valueOf(idleConnectionMigrationPeriodSeconds);
            return this;
        }

        public Builder allowNonDefaultNetworkUsage(boolean enable) {
            this.mAllowNonDefaultNetworkUsage = Boolean.valueOf(enable);
            return this;
        }

        public Builder setMaxTimeOnNonDefaultNetworkSeconds(long maxTimeOnNonDefaultNetworkSeconds) {
            this.mMaxTimeOnNonDefaultNetworkSeconds = Long.valueOf(maxTimeOnNonDefaultNetworkSeconds);
            return this;
        }

        public Builder setMaxWriteErrorNonDefaultNetworkMigrationsCount(int maxWriteErrorEagerMigrationsCount) {
            this.mMaxWriteErrorEagerMigrationsCount = Integer.valueOf(maxWriteErrorEagerMigrationsCount);
            return this;
        }

        public Builder setMaxPathDegradingNonDefaultNetworkMigrationsCount(int maxPathDegradingEagerMigrationsCount) {
            this.mMaxPathDegradingEagerMigrationsCount = Integer.valueOf(maxPathDegradingEagerMigrationsCount);
            return this;
        }

        public Builder retryPreHandshakeErrorsOnNonDefaultNetwork(boolean retryPreHandshakeErrorsOnAlternateNetwork) {
            this.mRetryPreHandshakeErrorsOnAlternateNetwork = Boolean.valueOf(retryPreHandshakeErrorsOnAlternateNetwork);
            return this;
        }

        public ConnectionMigrationOptions build() {
            return new ConnectionMigrationOptions(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
