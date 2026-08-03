package com.google.android.datatransport.runtime.scheduling;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes3.dex */
public abstract class SchedulingConfigModule {
    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(com.google.android.datatransport.runtime.time.Clock clock) {
        return com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.getDefault(clock);
    }
}
