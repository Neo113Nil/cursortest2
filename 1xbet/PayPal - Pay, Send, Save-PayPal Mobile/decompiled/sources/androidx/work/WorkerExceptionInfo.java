package androidx.work;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Landroidx/work/WorkerExceptionInfo;", "", "", "workerClassName", "Landroidx/work/WorkerParameters;", "workerParameters", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Ljava/lang/String;Landroidx/work/WorkerParameters;Ljava/lang/Throwable;)V", "Ljava/lang/String;", "getWorkerClassName", "()Ljava/lang/String;", "Landroidx/work/WorkerParameters;", "getWorkerParameters", "()Landroidx/work/WorkerParameters;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class WorkerExceptionInfo {
    private final java.lang.Throwable throwable;
    private final java.lang.String workerClassName;
    private final androidx.work.WorkerParameters workerParameters;

    public WorkerExceptionInfo(java.lang.String str, androidx.work.WorkerParameters workerParameters, java.lang.Throwable th) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workerParameters, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
        this.workerClassName = str;
        this.workerParameters = workerParameters;
        this.throwable = th;
    }

    public final java.lang.String getWorkerClassName() {
        return this.workerClassName;
    }

    public final androidx.work.WorkerParameters getWorkerParameters() {
        return this.workerParameters;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }
}
