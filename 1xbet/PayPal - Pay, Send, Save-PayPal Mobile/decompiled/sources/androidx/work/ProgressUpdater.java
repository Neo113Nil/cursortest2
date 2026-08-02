package androidx.work;

/* loaded from: classes3.dex */
public interface ProgressUpdater {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> updateProgress(android.content.Context context, java.util.UUID uuid, androidx.work.Data data);
}
