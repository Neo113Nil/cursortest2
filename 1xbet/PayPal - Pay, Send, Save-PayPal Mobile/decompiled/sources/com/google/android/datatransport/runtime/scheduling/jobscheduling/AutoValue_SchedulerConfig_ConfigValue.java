package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes3.dex */
final class AutoValue_SchedulerConfig_ConfigValue extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue {
    private final long delta;
    private final java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> flags;
    private final long maxAllowedDelay;

    private AutoValue_SchedulerConfig_ConfigValue(long j, long j2, java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> set) {
        this.delta = j;
        this.maxAllowedDelay = j2;
        this.flags = set;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    final long getDelta() {
        return this.delta;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    final long getMaxAllowedDelay() {
        return this.maxAllowedDelay;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue
    final java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> getFlags() {
        return this.flags;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ConfigValue{delta=");
        sb.append(this.delta);
        sb.append(", maxAllowedDelay=");
        sb.append(this.maxAllowedDelay);
        sb.append(", flags=");
        sb.append(this.flags);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue configValue = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue) obj;
        return this.delta == configValue.getDelta() && this.maxAllowedDelay == configValue.getMaxAllowedDelay() && this.flags.equals(configValue.getFlags());
    }

    public final int hashCode() {
        long j = this.delta;
        long j2 = this.maxAllowedDelay;
        return ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.flags.hashCode();
    }

    static final class Builder extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder {
        private java.lang.Long delta;
        private java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> flags;
        private java.lang.Long maxAllowedDelay;

        Builder() {
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setDelta(long j) {
            this.delta = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setMaxAllowedDelay(long j) {
            this.maxAllowedDelay = java.lang.Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder setFlags(java.util.Set<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.Flag> set) {
            if (set == null) {
                throw new java.lang.NullPointerException("Null flags");
            }
            this.flags = set;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue.Builder
        public final com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue build() {
            java.lang.String str;
            if (this.delta != null) {
                str = "";
            } else {
                str = " delta";
            }
            if (this.maxAllowedDelay == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append(" maxAllowedDelay");
                str = sb.toString();
            }
            if (this.flags == null) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(str);
                sb2.append(" flags");
                str = sb2.toString();
            }
            if (!str.isEmpty()) {
                throw new java.lang.IllegalStateException("Missing required properties:".concat(java.lang.String.valueOf(str)));
            }
            return new com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig_ConfigValue(this.delta.longValue(), this.maxAllowedDelay.longValue(), this.flags);
        }
    }
}
