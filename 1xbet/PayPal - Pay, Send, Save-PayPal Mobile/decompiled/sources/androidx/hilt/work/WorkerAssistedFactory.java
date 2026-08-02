package androidx.hilt.work;

/* loaded from: classes3.dex */
public interface WorkerAssistedFactory<T extends androidx.work.ListenableWorker> {
    T create(android.content.Context context, androidx.work.WorkerParameters workerParameters);
}
