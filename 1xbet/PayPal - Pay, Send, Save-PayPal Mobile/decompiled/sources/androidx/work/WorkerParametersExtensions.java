package androidx.work;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a(\u0010\b\u001a\u00020\u0000\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0004*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\b\u0010\t\u001a!\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\f\u001a%\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u000e¢\u0006\u0004\b\u0002\u0010\u0012"}, d2 = {"Landroidx/work/WorkerParameters;", "", "isRemoteWorkRequest", "(Landroidx/work/WorkerParameters;)Z", "Landroidx/work/ListenableWorker;", "T", "Landroid/content/ComponentName;", "componentName", "usingRemoteService", "(Landroidx/work/WorkerParameters;Landroid/content/ComponentName;)Landroidx/work/WorkerParameters;", "", "workerClassName", "(Landroidx/work/WorkerParameters;Ljava/lang/String;Landroid/content/ComponentName;)Landroidx/work/WorkerParameters;", "delegatedWorkerName", "Landroidx/work/Data;", "inputData", "buildDelegatedRemoteRequestData", "(Ljava/lang/String;Landroid/content/ComponentName;Landroidx/work/Data;)Landroidx/work/Data;", "(Landroidx/work/Data;)Z"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WorkerParametersExtensions {
    public static final boolean isRemoteWorkRequest(androidx.work.WorkerParameters workerParameters) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        androidx.work.Data inputData = workerParameters.getInputData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
        return isRemoteWorkRequest(inputData);
    }

    public static final /* synthetic */ <T extends androidx.work.ListenableWorker> androidx.work.WorkerParameters usingRemoteService(androidx.work.WorkerParameters workerParameters, android.content.ComponentName componentName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "T");
        java.lang.String name2 = androidx.work.ListenableWorker.class.getName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name2, "");
        return usingRemoteService(workerParameters, name2, componentName);
    }

    public static final androidx.work.WorkerParameters usingRemoteService(androidx.work.WorkerParameters workerParameters, java.lang.String str, android.content.ComponentName componentName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        java.util.UUID id = workerParameters.getId();
        androidx.work.Data inputData = workerParameters.getInputData();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(inputData, "");
        return new androidx.work.WorkerParameters(id, buildDelegatedRemoteRequestData(str, componentName, inputData), workerParameters.getTags(), workerParameters.getRuntimeExtras(), workerParameters.getRunAttemptCount(), workerParameters.getGeneration(), workerParameters.getBackgroundExecutor(), workerParameters.getWorkerContext(), workerParameters.getTaskExecutor(), workerParameters.getWorkerFactory(), workerParameters.getProgressUpdater(), workerParameters.getForegroundUpdater());
    }

    public static final androidx.work.Data buildDelegatedRemoteRequestData(java.lang.String str, android.content.ComponentName componentName, androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        androidx.work.Data.Builder builder = new androidx.work.Data.Builder();
        builder.putAll(data).putString(androidx.work.impl.utils.EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, componentName.getPackageName()).putString(androidx.work.impl.utils.EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, componentName.getClassName()).putString(androidx.work.impl.utils.EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, str);
        return builder.build();
    }

    public static final boolean isRemoteWorkRequest(androidx.work.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return data.hasKeyWithValueOfType(androidx.work.impl.utils.EnqueueUtilsKt.ARGUMENT_SERVICE_PACKAGE_NAME, java.lang.String.class) && data.hasKeyWithValueOfType(androidx.work.impl.utils.EnqueueUtilsKt.ARGUMENT_SERVICE_CLASS_NAME, java.lang.String.class) && data.hasKeyWithValueOfType(androidx.work.impl.utils.EnqueueUtilsKt.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME, java.lang.String.class);
    }
}
