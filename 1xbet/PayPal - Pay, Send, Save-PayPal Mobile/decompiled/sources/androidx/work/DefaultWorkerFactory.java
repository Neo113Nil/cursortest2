package androidx.work;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/work/DefaultWorkerFactory;", "Landroidx/work/WorkerFactory;", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", "createWorker", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Ljava/lang/Void;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DefaultWorkerFactory extends androidx.work.WorkerFactory {
    public static final androidx.work.DefaultWorkerFactory INSTANCE = new androidx.work.DefaultWorkerFactory();

    @Override // androidx.work.WorkerFactory
    public final /* bridge */ /* synthetic */ androidx.work.ListenableWorker createWorker(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        return (androidx.work.ListenableWorker) m9464createWorker(context, str, workerParameters);
    }

    private DefaultWorkerFactory() {
    }

    /* renamed from: createWorker, reason: collision with other method in class */
    public final java.lang.Void m9464createWorker(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        return null;
    }
}
