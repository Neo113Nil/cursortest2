package org.chromium.net;

/* loaded from: classes17.dex */
public final class ConnectionMigrationOptions {
    private final java.lang.Boolean mAllowNonDefaultNetworkUsage;
    private final java.lang.Boolean mAllowServerMigration;
    private final java.lang.Boolean mEnableDefaultNetworkMigration;
    private final java.lang.Boolean mEnablePathDegradationMigration;
    private final java.lang.Long mIdleMigrationPeriodSeconds;
    private final java.lang.Integer mMaxPathDegradingEagerMigrationsCount;
    private final java.lang.Long mMaxTimeOnNonDefaultNetworkSeconds;
    private final java.lang.Integer mMaxWriteErrorEagerMigrationsCount;
    private final java.lang.Boolean mMigrateIdleConnections;
    private final java.lang.Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

    /* loaded from: classes3.dex */
    public @interface Experimental {
    }

    public final java.lang.Boolean getEnableDefaultNetworkMigration() {
        return this.mEnableDefaultNetworkMigration;
    }

    public final java.lang.Boolean getEnablePathDegradationMigration() {
        return this.mEnablePathDegradationMigration;
    }

    public final java.lang.Boolean getAllowServerMigration() {
        return this.mAllowServerMigration;
    }

    public final java.lang.Boolean getMigrateIdleConnections() {
        return this.mMigrateIdleConnections;
    }

    public final java.lang.Long getIdleMigrationPeriodSeconds() {
        return this.mIdleMigrationPeriodSeconds;
    }

    public final java.lang.Boolean getRetryPreHandshakeErrorsOnAlternateNetwork() {
        return this.mRetryPreHandshakeErrorsOnAlternateNetwork;
    }

    public final java.lang.Boolean getAllowNonDefaultNetworkUsage() {
        return this.mAllowNonDefaultNetworkUsage;
    }

    public final java.lang.Long getMaxTimeOnNonDefaultNetworkSeconds() {
        return this.mMaxTimeOnNonDefaultNetworkSeconds;
    }

    public final java.lang.Integer getMaxWriteErrorEagerMigrationsCount() {
        return this.mMaxWriteErrorEagerMigrationsCount;
    }

    public final java.lang.Integer getMaxPathDegradingEagerMigrationsCount() {
        return this.mMaxPathDegradingEagerMigrationsCount;
    }

    private ConnectionMigrationOptions(org.chromium.net.ConnectionMigrationOptions.Builder builder) {
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

    /* loaded from: classes18.dex */
    public static class Builder {
        private java.lang.Boolean mAllowNonDefaultNetworkUsage;
        private java.lang.Boolean mAllowServerMigration;
        private java.lang.Boolean mEnableDefaultNetworkConnectionMigration;
        private java.lang.Boolean mEnablePathDegradationMigration;
        private java.lang.Long mIdleConnectionMigrationPeriodSeconds;
        private java.lang.Integer mMaxPathDegradingEagerMigrationsCount;
        private java.lang.Long mMaxTimeOnNonDefaultNetworkSeconds;
        private java.lang.Integer mMaxWriteErrorEagerMigrationsCount;
        private java.lang.Boolean mMigrateIdleConnections;
        private java.lang.Boolean mRetryPreHandshakeErrorsOnAlternateNetwork;

        private Builder() {
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder enableDefaultNetworkMigration(boolean z) {
            this.mEnableDefaultNetworkConnectionMigration = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder enablePathDegradationMigration(boolean z) {
            this.mEnablePathDegradationMigration = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder allowServerMigration(boolean z) {
            this.mAllowServerMigration = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder migrateIdleConnections(boolean z) {
            this.mMigrateIdleConnections = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder setIdleConnectionMigrationPeriodSeconds(long j) {
            this.mIdleConnectionMigrationPeriodSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder allowNonDefaultNetworkUsage(boolean z) {
            this.mAllowNonDefaultNetworkUsage = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder setMaxTimeOnNonDefaultNetworkSeconds(long j) {
            this.mMaxTimeOnNonDefaultNetworkSeconds = java.lang.Long.valueOf(j);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder setMaxWriteErrorNonDefaultNetworkMigrationsCount(int i) {
            this.mMaxWriteErrorEagerMigrationsCount = java.lang.Integer.valueOf(i);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder setMaxPathDegradingNonDefaultNetworkMigrationsCount(int i) {
            this.mMaxPathDegradingEagerMigrationsCount = java.lang.Integer.valueOf(i);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions.Builder retryPreHandshakeErrorsOnNonDefaultNetwork(boolean z) {
            this.mRetryPreHandshakeErrorsOnAlternateNetwork = java.lang.Boolean.valueOf(z);
            return this;
        }

        public org.chromium.net.ConnectionMigrationOptions build() {
            return new org.chromium.net.ConnectionMigrationOptions(this);
        }
    }

    public static org.chromium.net.ConnectionMigrationOptions.Builder builder() {
        return new org.chromium.net.ConnectionMigrationOptions.Builder();
    }
}
