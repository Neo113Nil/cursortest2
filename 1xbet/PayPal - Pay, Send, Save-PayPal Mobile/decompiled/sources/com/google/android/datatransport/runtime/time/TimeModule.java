package com.google.android.datatransport.runtime.time;

@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: classes3.dex */
public abstract class TimeModule {
    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.time.Clock eventClock() {
        return new com.google.android.datatransport.runtime.time.WallTimeClock();
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.time.Clock uptimeClock() {
        return new com.google.android.datatransport.runtime.time.UptimeClock();
    }
}
