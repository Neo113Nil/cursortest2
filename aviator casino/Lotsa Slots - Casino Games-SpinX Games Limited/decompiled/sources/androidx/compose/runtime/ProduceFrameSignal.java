package androidx.compose.runtime;

/* compiled from: Recomposer.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0001H\u0086@¢\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\tJ\u0006\u0010\n\u001a\u00020\u0005R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/compose/runtime/ProduceFrameSignal;", "", "()V", "pendingFrameContinuation", "awaitFrameRequest", "", "lock", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestFrameLocked", "Lkotlin/coroutines/Continuation;", "takeFrameRequestLocked", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class ProduceFrameSignal {
    private java.lang.Object pendingFrameContinuation;

    public final void takeFrameRequestLocked() {
        java.lang.Object obj;
        java.lang.Object obj2 = this.pendingFrameContinuation;
        obj = androidx.compose.runtime.RecomposerKt.FramePending;
        if (obj2 != obj) {
            throw new java.lang.IllegalStateException("frame not pending".toString());
        }
        this.pendingFrameContinuation = null;
    }

    public final kotlin.coroutines.Continuation<kotlin.Unit> requestFrameLocked() {
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5 = this.pendingFrameContinuation;
        if (obj5 instanceof kotlin.coroutines.Continuation) {
            obj4 = androidx.compose.runtime.RecomposerKt.FramePending;
            this.pendingFrameContinuation = obj4;
            return (kotlin.coroutines.Continuation) obj5;
        }
        obj = androidx.compose.runtime.RecomposerKt.ProduceAnotherFrame;
        if (!kotlin.jvm.internal.Intrinsics.areEqual(obj5, obj)) {
            obj2 = androidx.compose.runtime.RecomposerKt.FramePending;
            if (!kotlin.jvm.internal.Intrinsics.areEqual(obj5, obj2)) {
                if (obj5 == null) {
                    obj3 = androidx.compose.runtime.RecomposerKt.ProduceAnotherFrame;
                    this.pendingFrameContinuation = obj3;
                } else {
                    throw new java.lang.IllegalStateException(("invalid pendingFrameContinuation " + obj5).toString());
                }
            }
        }
        return null;
    }

    public final java.lang.Object awaitFrameRequest(java.lang.Object obj, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        java.lang.Object obj5;
        synchronized (obj) {
            java.lang.Object obj6 = this.pendingFrameContinuation;
            obj2 = androidx.compose.runtime.RecomposerKt.ProduceAnotherFrame;
            if (obj6 == obj2) {
                obj5 = androidx.compose.runtime.RecomposerKt.FramePending;
                this.pendingFrameContinuation = obj5;
                return kotlin.Unit.INSTANCE;
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            synchronized (obj) {
                java.lang.Object obj7 = this.pendingFrameContinuation;
                obj3 = androidx.compose.runtime.RecomposerKt.ProduceAnotherFrame;
                if (obj7 == obj3) {
                    obj4 = androidx.compose.runtime.RecomposerKt.FramePending;
                    this.pendingFrameContinuation = obj4;
                } else {
                    this.pendingFrameContinuation = cancellableContinuationImpl2;
                    cancellableContinuationImpl2 = null;
                }
            }
            if (cancellableContinuationImpl2 != null) {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE));
            }
            java.lang.Object result = cancellableContinuationImpl.getResult();
            if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? result : kotlin.Unit.INSTANCE;
        }
    }
}
