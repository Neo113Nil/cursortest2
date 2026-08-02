package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* loaded from: classes3.dex */
final class AutoValue_SchedulerConfig extends com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig {
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> values;

    AutoValue_SchedulerConfig(com.google.android.datatransport.runtime.time.Clock clock, java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> map) {
        if (clock == null) {
            throw new java.lang.NullPointerException("Null clock");
        }
        this.clock = clock;
        if (map == null) {
            throw new java.lang.NullPointerException("Null values");
        }
        this.values = map;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    final com.google.android.datatransport.runtime.time.Clock getClock() {
        return this.clock;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig
    final java.util.Map<com.google.android.datatransport.Priority, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.ConfigValue> getValues() {
        return this.values;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SchedulerConfig{clock=");
        sb.append(this.clock);
        sb.append(", values=");
        sb.append(this.values);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig)) {
            return false;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig schedulerConfig = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) obj;
        return this.clock.equals(schedulerConfig.getClock()) && this.values.equals(schedulerConfig.getValues());
    }

    public final int hashCode() {
        return ((this.clock.hashCode() ^ 1000003) * 1000003) ^ this.values.hashCode();
    }
}
