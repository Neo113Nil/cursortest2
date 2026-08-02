package androidx.work;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/work/DelegatingWorkerFactory;", "Landroidx/work/WorkerFactory;", "<init>", "()V", "workerFactory", "", "addFactory", "(Landroidx/work/WorkerFactory;)V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/ListenableWorker;", "createWorker", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;", "", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class DelegatingWorkerFactory extends androidx.work.WorkerFactory {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<androidx.work.WorkerFactory> getHighSpeedVideoSizes = new java.util.concurrent.CopyOnWriteArrayList();

    public final void addFactory(androidx.work.WorkerFactory workerFactory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerFactory, "");
        this.getHighSpeedVideoSizes.add(workerFactory);
    }

    @Override // androidx.work.WorkerFactory
    public final androidx.work.ListenableWorker createWorker(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        java.util.Iterator<T> it = this.getHighSpeedVideoSizes.iterator();
        while (it.hasNext()) {
            try {
                androidx.work.ListenableWorker createWorker = ((androidx.work.WorkerFactory) it.next()).createWorker(appContext, workerClassName, workerParameters);
                if (createWorker != null) {
                    return createWorker;
                }
            } catch (java.lang.Throwable th) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unable to instantiate a ListenableWorker (");
                sb.append(workerClassName);
                sb.append(')');
                java.lang.String obj = sb.toString();
                androidx.work.Logger logger = androidx.work.Logger.get();
                str = androidx.work.DelegatingWorkerFactoryKt.getHighSpeedVideoFpsRangesFor;
                logger.error(str, obj, th);
                throw th;
            }
        }
        return null;
    }
}
