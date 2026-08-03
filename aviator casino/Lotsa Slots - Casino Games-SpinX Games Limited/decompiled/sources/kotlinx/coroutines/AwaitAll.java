package kotlinx.coroutines;

/* compiled from: Await.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002\u000e\u000fB\u001d\u0012\u0014\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0086@¢\u0006\u0002\u0010\rR\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\bR\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/AwaitAll;", "T", "", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "<init>", "([Lkotlinx/coroutines/Deferred;)V", "[Lkotlinx/coroutines/Deferred;", "notCompletedCount", "Lkotlinx/atomicfu/AtomicInt;", "await", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "DisposeHandlersOnCancel", "AwaitAllNode", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AwaitAll<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(kotlinx.coroutines.AwaitAll.class, "notCompletedCount$volatile");
    private final kotlinx.coroutines.Deferred<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    private final /* synthetic */ int getNotCompletedCount$volatile() {
        return this.notCompletedCount$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater getNotCompletedCount$volatile$FU() {
        return notCompletedCount$volatile$FU;
    }

    private final /* synthetic */ void setNotCompletedCount$volatile(int i) {
        this.notCompletedCount$volatile = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitAll(kotlinx.coroutines.Deferred<? extends T>[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    /* compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016R \u0010\u0002\u001a\u0012\u0012\u000e\u0012\f0\u0004R\b\u0012\u0004\u0012\u00028\u00000\u00050\u0003X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u0010"}, d2 = {"Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/CancelHandler;", "nodes", "", "Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/AwaitAll;", "<init>", "(Lkotlinx/coroutines/AwaitAll;[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;)V", "[Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "disposeAll", "", "invoke", "cause", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class DisposeHandlersOnCancel implements kotlinx.coroutines.CancelHandler {
        private final kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(kotlinx.coroutines.AwaitAll<T>.AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        public final void disposeAll() {
            for (kotlinx.coroutines.AwaitAll<T>.AwaitAllNode awaitAllNode : this.nodes) {
                awaitAllNode.getHandle().dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(java.lang.Throwable cause) {
            disposeAll();
        }

        public java.lang.String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST;
        }
    }

    /* compiled from: Await.kt */
    @kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001b\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00100\u000eX\u0082\u0004R<\u0010\u0012\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00102\u0012\u0010\u0011\u001a\u000e\u0018\u00010\u000fR\b\u0012\u0004\u0012\u00028\u00000\u00108F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lkotlinx/coroutines/AwaitAll$AwaitAllNode;", "Lkotlinx/coroutines/JobNode;", "continuation", "Lkotlinx/coroutines/CancellableContinuation;", "", "<init>", "(Lkotlinx/coroutines/AwaitAll;Lkotlinx/coroutines/CancellableContinuation;)V", "handle", "Lkotlinx/coroutines/DisposableHandle;", "getHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setHandle", "(Lkotlinx/coroutines/DisposableHandle;)V", "_disposer", "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "Lkotlinx/coroutines/AwaitAll;", "value", "disposer", "getDisposer", "()Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;", "setDisposer", "(Lkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel;)V", "onCancelling", "", "getOnCancelling", "()Z", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class AwaitAllNode extends kotlinx.coroutines.JobNode {
        private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _disposer$volatile$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.AwaitAll.AwaitAllNode.class, java.lang.Object.class, "_disposer$volatile");
        private volatile /* synthetic */ java.lang.Object _disposer$volatile;
        private final kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> continuation;
        public kotlinx.coroutines.DisposableHandle handle;

        private final /* synthetic */ java.lang.Object get_disposer$volatile() {
            return this._disposer$volatile;
        }

        private final /* synthetic */ void set_disposer$volatile(java.lang.Object obj) {
            this._disposer$volatile = obj;
        }

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitAllNode(kotlinx.coroutines.CancellableContinuation<? super java.util.List<? extends T>> cancellableContinuation) {
            this.continuation = cancellableContinuation;
        }

        public final kotlinx.coroutines.DisposableHandle getHandle() {
            kotlinx.coroutines.DisposableHandle disposableHandle = this.handle;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("handle");
            return null;
        }

        public final void setHandle(kotlinx.coroutines.DisposableHandle disposableHandle) {
            this.handle = disposableHandle;
        }

        public final kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
            return (kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel) _disposer$volatile$FU.get(this);
        }

        public final void setDisposer(kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel) {
            _disposer$volatile$FU.set(this, disposeHandlersOnCancel);
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(java.lang.Throwable cause) {
            if (cause == null) {
                if (kotlinx.coroutines.AwaitAll.getNotCompletedCount$volatile$FU().decrementAndGet(kotlinx.coroutines.AwaitAll.this) == 0) {
                    kotlinx.coroutines.CancellableContinuation<java.util.List<? extends T>> cancellableContinuation = this.continuation;
                    kotlinx.coroutines.Deferred[] deferredArr = ((kotlinx.coroutines.AwaitAll) kotlinx.coroutines.AwaitAll.this).deferreds;
                    java.util.ArrayList arrayList = new java.util.ArrayList(deferredArr.length);
                    for (kotlinx.coroutines.Deferred deferred : deferredArr) {
                        arrayList.add(deferred.getCompleted());
                    }
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    cancellableContinuation.resumeWith(kotlin.Result.m10798constructorimpl(arrayList));
                    return;
                }
                return;
            }
            java.lang.Object tryResumeWithException = this.continuation.tryResumeWithException(cause);
            if (tryResumeWithException != null) {
                this.continuation.completeResume(tryResumeWithException);
                kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel disposer = getDisposer();
                if (disposer != null) {
                    disposer.disposeAll();
                }
            }
        }
    }

    public final java.lang.Object await(kotlin.coroutines.Continuation<? super java.util.List<? extends T>> continuation) {
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        int length = this.deferreds.length;
        kotlinx.coroutines.AwaitAll.AwaitAllNode[] awaitAllNodeArr = new kotlinx.coroutines.AwaitAll.AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            kotlinx.coroutines.Deferred deferred = this.deferreds[i];
            deferred.start();
            kotlinx.coroutines.AwaitAll.AwaitAllNode awaitAllNode = new kotlinx.coroutines.AwaitAll.AwaitAllNode(cancellableContinuationImpl2);
            awaitAllNode.setHandle(kotlinx.coroutines.JobKt__JobKt.invokeOnCompletion$default(deferred, false, awaitAllNode, 1, null));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            awaitAllNodeArr[i] = awaitAllNode;
        }
        kotlinx.coroutines.AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel = new kotlinx.coroutines.AwaitAll.DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            awaitAllNodeArr[i2].setDisposer(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl2.isCompleted()) {
            disposeHandlersOnCancel.disposeAll();
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
