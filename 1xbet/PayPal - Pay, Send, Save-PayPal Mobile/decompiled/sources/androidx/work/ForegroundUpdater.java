package androidx.work;

/* loaded from: classes3.dex */
public interface ForegroundUpdater {
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setForegroundAsync(android.content.Context context, java.util.UUID uuid, androidx.work.ForegroundInfo foregroundInfo);
}
