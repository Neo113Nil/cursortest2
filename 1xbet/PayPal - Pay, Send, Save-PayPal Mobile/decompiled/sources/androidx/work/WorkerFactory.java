package androidx.work;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\f"}, d2 = {"Landroidx/work/WorkerFactory;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "Landroidx/work/ListenableWorker;", "createWorker", "(Landroid/content/Context;Ljava/lang/String;Landroidx/work/WorkerParameters;)Landroidx/work/ListenableWorker;", "createWorkerWithDefaultFallback"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class WorkerFactory {
    public abstract androidx.work.ListenableWorker createWorker(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters);

    private static final java.lang.Class<? extends androidx.work.ListenableWorker> getHighSpeedVideoFpsRangesFor(java.lang.String str) {
        java.lang.String str2;
        try {
            java.lang.Class asSubclass = java.lang.Class.forName(str).asSubclass(androidx.work.ListenableWorker.class);
            kotlin.jvm.internal.Intrinsics.checkNotNull(asSubclass);
            return asSubclass;
        } catch (java.lang.Throwable th) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str2 = androidx.work.WorkerFactoryKt.getHighResolutionOutputSizeshNQ4ISI;
            logger.error(str2, "Invalid class: ".concat(java.lang.String.valueOf(str)), th);
            throw th;
        }
    }

    private static final androidx.work.ListenableWorker getHighSpeedVideoFpsRangesFor(android.content.Context context, java.lang.String str, androidx.work.WorkerParameters workerParameters) {
        java.lang.String str2;
        try {
            androidx.work.ListenableWorker newInstance = getHighSpeedVideoFpsRangesFor(str).getDeclaredConstructor(android.content.Context.class, androidx.work.WorkerParameters.class).newInstance(context, workerParameters);
            kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
            return newInstance;
        } catch (java.lang.Throwable th) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str2 = androidx.work.WorkerFactoryKt.getHighResolutionOutputSizeshNQ4ISI;
            logger.error(str2, "Could not instantiate ".concat(java.lang.String.valueOf(str)), th);
            throw th;
        }
    }

    public final androidx.work.ListenableWorker createWorkerWithDefaultFallback(android.content.Context appContext, java.lang.String workerClassName, androidx.work.WorkerParameters workerParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerClassName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        androidx.work.ListenableWorker createWorker = createWorker(appContext, workerClassName, workerParameters);
        if (createWorker == null) {
            createWorker = getHighSpeedVideoFpsRangesFor(appContext, workerClassName, workerParameters);
        }
        if (!createWorker.isUsed()) {
            return createWorker;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("WorkerFactory (");
        sb.append(getClass().getName());
        sb.append(") returned an instance of a ListenableWorker (");
        sb.append(workerClassName);
        sb.append(") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
        throw new java.lang.IllegalStateException(sb.toString());
    }
}
