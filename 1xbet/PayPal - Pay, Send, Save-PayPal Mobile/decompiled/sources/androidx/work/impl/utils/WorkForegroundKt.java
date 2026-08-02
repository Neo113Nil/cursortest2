package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086@¢\u0006\u0004\b\u000b\u0010\f\"\u0019\u0010\u000f\u001a\u00070\r¢\u0006\u0002\b\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroid/content/Context;", "context", "Landroidx/work/impl/model/WorkSpec;", "spec", "Landroidx/work/ListenableWorker;", "worker", "Landroidx/work/ForegroundUpdater;", "foregroundUpdater", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "taskExecutor", "", "workForeground", "(Landroid/content/Context;Landroidx/work/impl/model/WorkSpec;Landroidx/work/ListenableWorker;Landroidx/work/ForegroundUpdater;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lorg/jspecify/annotations/NonNull;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkForegroundKt {
    private static final java.lang.String getHighSpeedVideoFpsRanges;

    public static final java.lang.Object workForeground(android.content.Context context, androidx.work.impl.model.WorkSpec workSpec, androidx.work.ListenableWorker listenableWorker, androidx.work.ForegroundUpdater foregroundUpdater, androidx.work.impl.utils.taskexecutor.TaskExecutor taskExecutor, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        if (!workSpec.expedited || android.os.Build.VERSION.SDK_INT >= 31) {
            return kotlin.Unit.INSTANCE;
        }
        java.util.concurrent.Executor mainThreadExecutor = taskExecutor.getMainThreadExecutor();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "");
        java.lang.Object withContext = kotlinx.coroutines.BuildersKt.withContext(kotlinx.coroutines.ExecutorsKt.from(mainThreadExecutor), new androidx.work.impl.utils.WorkForegroundKt$workForeground$2(listenableWorker, workSpec, foregroundUpdater, context, null), continuation);
        return withContext == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? withContext : kotlin.Unit.INSTANCE;
    }

    static {
        java.lang.String tagWithPrefix = androidx.work.Logger.tagWithPrefix("WorkForegroundRunnable");
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tagWithPrefix, "");
        getHighSpeedVideoFpsRanges = tagWithPrefix;
    }
}
