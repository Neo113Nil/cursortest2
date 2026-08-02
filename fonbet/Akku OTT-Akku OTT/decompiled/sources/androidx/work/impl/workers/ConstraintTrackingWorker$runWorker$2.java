package androidx.work.impl.workers;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.u;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.C1082i;
import kotlinx.coroutines.InterfaceC1120x0;
import kotlinx.coroutines.K;
import kotlinx.coroutines.Q0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/K;", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "<anonymous>", "(Lkotlinx/coroutines/K;)Landroidx/work/ListenableWorker$Result;"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
@SourceDebugExtension({"SMAP\nConstraintTrackingWorker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker$runWorker$2\n+ 2 LoggerExt.kt\nandroidx/work/LoggerExtKt\n*L\n1#1,168:1\n22#2:169\n22#2:170\n*S KotlinDebug\n*F\n+ 1 ConstraintTrackingWorker.kt\nandroidx/work/impl/workers/ConstraintTrackingWorker$runWorker$2\n*L\n137#1:169\n144#1:170\n*E\n"})
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<K, Continuation<? super ListenableWorker.Result>, Object> {
    final /* synthetic */ ListenableWorker $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ WorkSpec $workSpec;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker$runWorker$2(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.$delegate = listenableWorker;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = workSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        constraintTrackingWorker$runWorker$2.L$0 = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d6 A[Catch: all -> 0x0097, TRY_LEAVE, TryCatch #2 {all -> 0x0097, blocks: (B:39:0x0074, B:40:0x0096, B:15:0x009a, B:18:0x00c4, B:21:0x00cc, B:22:0x00d5, B:24:0x00d6, B:7:0x001f, B:8:0x0069, B:30:0x0058), top: B:2:0x000c, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.x0] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v6, types: [kotlinx.coroutines.x0] */
    /* JADX WARN: Type inference failed for: r1v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        CancellationException cancellationException;
        AtomicInteger atomicInteger;
        u<ListenableWorker.Result> uVar;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        boolean z = true;
        try {
            try {
                if (r1 == 0) {
                    ResultKt.throwOnFailure(obj);
                    K k = (K) this.L$0;
                    AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                    u<ListenableWorker.Result> startWork = this.$delegate.startWork();
                    Intrinsics.checkNotNullExpressionValue(startWork, "delegate.startWork()");
                    Q0 c = C1082i.c(k, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger2, startWork, null), 3);
                    try {
                        this.L$0 = atomicInteger2;
                        this.L$1 = startWork;
                        this.L$2 = c;
                        this.label = 1;
                        obj = ListenableFutureKt.await(startWork, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        atomicInteger = atomicInteger2;
                        uVar = startWork;
                        r1 = c;
                    } catch (CancellationException e) {
                        cancellationException = e;
                        atomicInteger = atomicInteger2;
                        uVar = startWork;
                        str2 = ConstraintTrackingWorkerKt.TAG;
                        ListenableWorker listenableWorker = this.$delegate;
                        Logger.get().debug(str2, "Delegated worker " + listenableWorker.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                            z = false;
                        }
                        if (uVar.isCancelled()) {
                            throw cancellationException;
                        }
                        if (z) {
                            throw new ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                        }
                        throw cancellationException;
                    }
                } else {
                    if (r1 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC1120x0 interfaceC1120x0 = (InterfaceC1120x0) this.L$2;
                    uVar = (u) this.L$1;
                    atomicInteger = (AtomicInteger) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        r1 = interfaceC1120x0;
                    } catch (CancellationException e2) {
                        cancellationException = e2;
                        str2 = ConstraintTrackingWorkerKt.TAG;
                        ListenableWorker listenableWorker2 = this.$delegate;
                        Logger.get().debug(str2, "Delegated worker " + listenableWorker2.getClass() + " was cancelled", cancellationException);
                        if (atomicInteger.get() != -256) {
                        }
                        if (uVar.isCancelled()) {
                        }
                    }
                }
                ListenableWorker.Result result = (ListenableWorker.Result) obj;
                r1.cancel(null);
                return result;
            } catch (Throwable th) {
                str = ConstraintTrackingWorkerKt.TAG;
                ListenableWorker listenableWorker3 = this.$delegate;
                Logger.get().debug(str, "Delegated worker " + listenableWorker3.getClass() + " threw exception in startWork.", th);
                throw th;
            }
        } catch (Throwable th2) {
            r1.cancel(null);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(K k, Continuation<? super ListenableWorker.Result> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2) create(k, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
