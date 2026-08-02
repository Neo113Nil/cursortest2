package kotlinx.coroutines;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086@¢\u0006\u0002\u0010\rR\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "[Lkotlinx/coroutines/Deferred;", "notCompletedCount", "Lkotlinx/atomicfu/AtomicInt;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DisposeHandlersOnCancel", "AwaitAllNode", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
final class AwaitAll<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getHighSpeedVideoFpsRanges = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.AwaitAll.class, "notCompletedCount$volatile");
    private final kotlinx.coroutines.Deferred<T>[] getHighSpeedVideoSizes;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitAll(kotlinx.coroutines.Deferred<? extends T>[] deferredArr) {
        this.getHighSpeedVideoSizes = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0013\u001a\u0012\u0012\u000e\u0012\f0\u0003R\b\u0012\u0004\u0012\u00028\u00000\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "p0", "<init>", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "", "getHighResolutionOutputSizeshNQ4ISI", "()V", "", "invoke", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class DisposeHandlersOnCancel implements kotlinx.coroutines.CancelHandler {

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] getHighSpeedVideoSizes;

        public DisposeHandlersOnCancel(kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] awaitAllNodeArr) {
            this.getHighSpeedVideoSizes = awaitAllNodeArr;
        }

        public final void getHighResolutionOutputSizeshNQ4ISI() {
            for (kotlinx.coroutines.AwaitAll<T>.AwaitAllNode awaitAllNode : this.getHighSpeedVideoSizes) {
                kotlinx.coroutines.DisposableHandle disposableHandle = awaitAllNode.getHighResolutionOutputSizeshNQ4ISI;
                if (disposableHandle == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                    disposableHandle = null;
                }
                disposableHandle.dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public final void invoke(java.lang.Throwable p0) {
            getHighResolutionOutputSizeshNQ4ISI();
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DisposeHandlersOnCancel[");
            sb.append(this.getHighSpeedVideoSizes);
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
            return sb.toString();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00100\u000eX\u0082\u0004R<\u0010\u0012\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0011\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "_disposer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "disposer", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class AwaitAllNode extends kotlinx.coroutines.JobNode {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater Camera2StreamConfigurationMap = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.AwaitAll.AwaitAllNode.class, java.lang.Object.class, "_disposer$volatile");
        private volatile /* synthetic */ java.lang.Object _disposer$volatile;
        public kotlinx.coroutines.DisposableHandle getHighResolutionOutputSizeshNQ4ISI;
        private final kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> getHighSpeedVideoFpsRangesFor;

        @Override // kotlinx.coroutines.JobNode
        public final boolean getOnCancelling() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitAllNode(kotlinx.coroutines.CancellableContinuation<? super java.util.List<? extends T>> cancellableContinuation) {
            this.getHighSpeedVideoFpsRangesFor = cancellableContinuation;
        }

        @Override // kotlinx.coroutines.JobNode
        public final void invoke(java.lang.Throwable cause) {
            if (cause != null) {
                java.lang.Object tryResumeWithException = this.getHighSpeedVideoFpsRangesFor.tryResumeWithException(cause);
                if (tryResumeWithException != null) {
                    this.getHighSpeedVideoFpsRangesFor.completeResume(tryResumeWithException);
                    kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel disposeHandlersOnCancel = (kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel) Camera2StreamConfigurationMap.get(this);
                    if (disposeHandlersOnCancel != null) {
                        disposeHandlersOnCancel.getHighResolutionOutputSizeshNQ4ISI();
                        return;
                    }
                    return;
                }
                return;
            }
            if (kotlinx.coroutines.AwaitAll.getHighSpeedVideoFpsRanges.decrementAndGet(kotlinx.coroutines.AwaitAll.this) == 0) {
                kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> cancellableContinuation = this.getHighSpeedVideoFpsRangesFor;
                kotlinx.coroutines.Deferred[] deferredArr = ((kotlinx.coroutines.AwaitAll) kotlinx.coroutines.AwaitAll.this).getHighSpeedVideoSizes;
                java.util.ArrayList arrayList = new java.util.ArrayList(deferredArr.length);
                for (kotlinx.coroutines.Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(arrayList));
            }
        }
    }

    public final java.lang.Object getHighSpeedVideoFpsRangesFor(kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        int length = this.getHighSpeedVideoSizes.length;
        kotlinx.coroutines.AwaitAll.AwaitAllNode[] awaitAllNodeArr = new kotlinx.coroutines.AwaitAll.AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            kotlinx.coroutines.Deferred<T> deferred = this.getHighSpeedVideoSizes[i];
            deferred.start();
            kotlinx.coroutines.AwaitAll.AwaitAllNode awaitAllNode = new kotlinx.coroutines.AwaitAll.AwaitAllNode(cancellableContinuationImpl2);
            awaitAllNode.getHighResolutionOutputSizeshNQ4ISI = kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(deferred, false, awaitAllNode, 1, null);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            awaitAllNodeArr[i] = awaitAllNode;
        }
        kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel disposeHandlersOnCancel = new kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            kotlinx.coroutines.AwaitAll.AwaitAllNode.Camera2StreamConfigurationMap.set(awaitAllNodeArr[i2], disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl2.isCompleted()) {
            disposeHandlersOnCancel.getHighResolutionOutputSizeshNQ4ISI();
        } else {
            kotlinx.coroutines.CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl2, disposeHandlersOnCancel);
        }
        java.lang.Object result = cancellableContinuationImpl.getResult();
        if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
