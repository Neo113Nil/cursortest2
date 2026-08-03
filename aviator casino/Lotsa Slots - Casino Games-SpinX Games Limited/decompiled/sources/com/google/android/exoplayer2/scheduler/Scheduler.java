package com.google.android.exoplayer2.scheduler;

/* loaded from: classes3.dex */
public interface Scheduler {
    boolean cancel();

    com.google.android.exoplayer2.scheduler.Requirements getSupportedRequirements(com.google.android.exoplayer2.scheduler.Requirements requirements);

    boolean schedule(com.google.android.exoplayer2.scheduler.Requirements requirements, java.lang.String str, java.lang.String str2);
}
