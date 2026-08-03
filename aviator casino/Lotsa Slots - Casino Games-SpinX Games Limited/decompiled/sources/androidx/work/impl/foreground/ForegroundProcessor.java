package androidx.work.impl.foreground;

/* loaded from: classes2.dex */
public interface ForegroundProcessor {
    boolean isEnqueuedInForeground(java.lang.String workSpecId);

    void startForeground(java.lang.String workSpecId, androidx.work.ForegroundInfo foregroundInfo);

    void stopForeground(java.lang.String workSpecId);
}
