package androidx.media3.exoplayer.scheduler;

/* loaded from: classes2.dex */
public interface Scheduler {
    boolean cancel();

    androidx.media3.exoplayer.scheduler.Requirements getSupportedRequirements(androidx.media3.exoplayer.scheduler.Requirements requirements);

    boolean schedule(androidx.media3.exoplayer.scheduler.Requirements requirements, java.lang.String str, java.lang.String str2);
}
