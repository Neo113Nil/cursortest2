package androidx.work.impl.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a'\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/core/util/Consumer;", "Landroidx/work/WorkerExceptionInfo;", "info", "", "tag", "", "safeAccept", "(Landroidx/core/util/Consumer;Landroidx/work/WorkerExceptionInfo;Ljava/lang/String;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerExceptionUtilsKt {
    public static final void safeAccept(androidx.core.util.Consumer<androidx.work.WorkerExceptionInfo> consumer, androidx.work.WorkerExceptionInfo workerExceptionInfo, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumer, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerExceptionInfo, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        try {
            consumer.accept(workerExceptionInfo);
        } catch (java.lang.Throwable th) {
            androidx.work.Logger.get().error(str, "Exception handler threw an exception", th);
        }
    }
}
