package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.core.util.Consumer;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.C1103o0;
import kotlinx.coroutines.I;
import kotlinx.coroutines.L;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\u00020\bH\u0096@¢\u0006\u0002\u0010\tJ&\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\u00020\bH\u0082@¢\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "runWorker", "delegate", "Landroidx/work/ListenableWorker;", "workConstraintsTracker", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "(Landroidx/work/ListenableWorker;Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupAndRunConstraintTrackingWork", "ConstraintUnsatisfiedException", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n29#2:169\n19#2:170\n19#2:171\n19#2:172\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker\n*L\n65#1:169\n75#1:170\n78#1:171\n87#1:172\n*E\n"})
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "(I)V", "getStopReason", "()I", "work-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runWorker(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ListenableWorker.Result> continuation) {
        ConstraintTrackingWorker$runWorker$1 constraintTrackingWorker$runWorker$1;
        int i;
        if (continuation instanceof ConstraintTrackingWorker$runWorker$1) {
            constraintTrackingWorker$runWorker$1 = (ConstraintTrackingWorker$runWorker$1) continuation;
            int i2 = constraintTrackingWorker$runWorker$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$runWorker$1.label = i2 - Integer.MIN_VALUE;
                Object obj = constraintTrackingWorker$runWorker$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintTrackingWorker$runWorker$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(listenableWorker, workConstraintsTracker, workSpec, null);
                    constraintTrackingWorker$runWorker$1.label = 1;
                    obj = L.c(constraintTrackingWorker$runWorker$2, constraintTrackingWorker$runWorker$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "delegate: ListenableWork….cancel()\n        }\n    }");
                return obj;
            }
        }
        constraintTrackingWorker$runWorker$1 = new ConstraintTrackingWorker$runWorker$1(this, continuation);
        Object obj2 = constraintTrackingWorker$runWorker$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintTrackingWorker$runWorker$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "delegate: ListenableWork….cancel()\n        }\n    }");
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupAndRunConstraintTrackingWork(Continuation<? super ListenableWorker.Result> continuation) {
        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        ListenableWorker createWorkerWithDefaultFallback;
        ConstraintTrackingWorker constraintTrackingWorker;
        String str5;
        int stopReason;
        if (continuation instanceof ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) {
            constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = (ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) continuation;
            int i2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label = i2 - Integer.MIN_VALUE;
                ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$12 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
                Object obj = constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
                    if (string == null || string.length() == 0) {
                        str = ConstraintTrackingWorkerKt.TAG;
                        Logger.get().error(str, "No worker to delegate to.");
                        ListenableWorker.Result failure = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure, "failure()");
                        return failure;
                    }
                    WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
                    Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(applicationContext)");
                    WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
                    String uuid = getId().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
                    WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
                    if (workSpec == null) {
                        ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure2, "failure()");
                        return failure2;
                    }
                    Trackers trackers = workManagerImpl.getTrackers();
                    Intrinsics.checkNotNullExpressionValue(trackers, "workManagerImpl.trackers");
                    WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackers);
                    if (!workConstraintsTracker.areAllConstraintsMet(workSpec)) {
                        str5 = ConstraintTrackingWorkerKt.TAG;
                        Logger.get().debug(str5, "Constraints not met for delegate " + string + ". Requesting retry.");
                        ListenableWorker.Result retry = ListenableWorker.Result.retry();
                        Intrinsics.checkNotNullExpressionValue(retry, "retry()");
                        return retry;
                    }
                    str2 = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str2, "Constraints met for delegate " + string);
                    try {
                        WorkerFactory workerFactory = getWorkerFactory();
                        Context applicationContext = getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                        createWorkerWithDefaultFallback = workerFactory.createWorkerWithDefaultFallback(applicationContext, string, this.workerParameters);
                        Executor mainThreadExecutor = this.workerParameters.getTaskExecutor().getMainThreadExecutor();
                        Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "workerParameters.taskExecutor.mainThreadExecutor");
                        try {
                            I a = C1103o0.a(mainThreadExecutor);
                            ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 constraintTrackingWorker$setupAndRunConstraintTrackingWork$5 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this, createWorkerWithDefaultFallback, workConstraintsTracker, workSpec, null);
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.L$0 = this;
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.L$1 = createWorkerWithDefaultFallback;
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.label = 1;
                            obj = C1082i.f(constraintTrackingWorker$setupAndRunConstraintTrackingWork$5, a, constraintTrackingWorker$setupAndRunConstraintTrackingWork$12);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            constraintTrackingWorker = this;
                        } catch (CancellationException e) {
                            e = e;
                            constraintTrackingWorker = this;
                            if (!constraintTrackingWorker.isStopped() || (e instanceof ConstraintUnsatisfiedException)) {
                                if (Build.VERSION.SDK_INT >= 31) {
                                    stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                                } else if (constraintTrackingWorker.isStopped()) {
                                    stopReason = constraintTrackingWorker.getStopReason();
                                } else {
                                    if (!(e instanceof ConstraintUnsatisfiedException)) {
                                        throw new IllegalStateException("Unreachable");
                                    }
                                    stopReason = ((ConstraintUnsatisfiedException) e).getStopReason();
                                }
                                createWorkerWithDefaultFallback.stop(stopReason);
                            }
                            if (e instanceof ConstraintUnsatisfiedException) {
                                throw e;
                            }
                            ListenableWorker.Result retry2 = ListenableWorker.Result.retry();
                            Intrinsics.checkNotNullExpressionValue(retry2, "{\n            // there a…throw cancelled\n        }");
                            return retry2;
                        }
                    } catch (Throwable th) {
                        str3 = ConstraintTrackingWorkerKt.TAG;
                        Logger.get().debug(str3, "No worker to delegate to.");
                        Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = workManagerImpl.getConfiguration().getWorkerInitializationExceptionHandler();
                        if (workerInitializationExceptionHandler != null) {
                            WorkerExceptionInfo workerExceptionInfo = new WorkerExceptionInfo(string, this.workerParameters, th);
                            str4 = ConstraintTrackingWorkerKt.TAG;
                            WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, workerExceptionInfo, str4);
                        }
                        ListenableWorker.Result failure3 = ListenableWorker.Result.failure();
                        Intrinsics.checkNotNullExpressionValue(failure3, "failure()");
                        return failure3;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    createWorkerWithDefaultFallback = (ListenableWorker) constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.L$1;
                    constraintTrackingWorker = (ConstraintTrackingWorker) constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (CancellationException e2) {
                        e = e2;
                        if (!constraintTrackingWorker.isStopped()) {
                        }
                        if (Build.VERSION.SDK_INT >= 31) {
                        }
                        createWorkerWithDefaultFallback.stop(stopReason);
                        if (e instanceof ConstraintUnsatisfiedException) {
                        }
                    }
                }
                return (ListenableWorker.Result) obj;
            }
        }
        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(this, continuation);
        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$122 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        Object obj2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintTrackingWorker$setupAndRunConstraintTrackingWork$122.label;
        if (i != 0) {
        }
        return (ListenableWorker.Result) obj2;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "backgroundExecutor");
        return C1082i.f(new ConstraintTrackingWorker$doWork$2(this, null), C1103o0.a(backgroundExecutor), continuation);
    }
}
