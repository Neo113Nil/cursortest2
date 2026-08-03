package androidx.compose.foundation.gestures;

/* compiled from: Scrollable.kt */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/unit/Velocity;", "velocity"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {804, 807, 810}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
/* loaded from: classes.dex */
final class ScrollingLogic$onDragStopped$performFling$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.unit.Velocity, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity>, java.lang.Object> {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ androidx.compose.foundation.gestures.ScrollingLogic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollingLogic$onDragStopped$performFling$1(androidx.compose.foundation.gestures.ScrollingLogic scrollingLogic, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1> continuation) {
        super(2, continuation);
        this.this$0 = scrollingLogic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1 scrollingLogic$onDragStopped$performFling$1 = new androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1(this.this$0, continuation);
        scrollingLogic$onDragStopped$performFling$1.J$0 = ((androidx.compose.ui.unit.Velocity) obj).getPackedValue();
        return scrollingLogic$onDragStopped$performFling$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.compose.ui.unit.Velocity velocity, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return m418invokesFctU(velocity.getPackedValue(), continuation);
    }

    /* renamed from: invoke-sF-c-tU, reason: not valid java name */
    public final java.lang.Object m418invokesFctU(long j, kotlin.coroutines.Continuation<? super androidx.compose.ui.unit.Velocity> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollingLogic$onDragStopped$performFling$1) create(androidx.compose.ui.unit.Velocity.m4708boximpl(j), continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0097 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher;
        java.lang.Object m3158dispatchPreFlingQWom1Mo;
        long j;
        long m4720minusAH228Gc;
        java.lang.Object m406doFlingAnimationQWom1Mo;
        androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher nestedScrollDispatcher2;
        long j2;
        java.lang.Object m3156dispatchPostFlingRZ2iAVY;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            long j3 = this.J$0;
            nestedScrollDispatcher = this.this$0.nestedScrollDispatcher;
            this.J$0 = j3;
            this.label = 1;
            m3158dispatchPreFlingQWom1Mo = nestedScrollDispatcher.m3158dispatchPreFlingQWom1Mo(j3, this);
            if (m3158dispatchPreFlingQWom1Mo == coroutine_suspended) {
                return coroutine_suspended;
            }
            j = j3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j4 = this.J$1;
                    long j5 = this.J$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                    j = j5;
                    j2 = j4;
                    m3156dispatchPostFlingRZ2iAVY = obj;
                    return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j, androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) m3156dispatchPostFlingRZ2iAVY).getPackedValue())));
                }
                long j6 = this.J$1;
                long j7 = this.J$0;
                kotlin.ResultKt.throwOnFailure(obj);
                m406doFlingAnimationQWom1Mo = obj;
                j = j7;
                m4720minusAH228Gc = j6;
                long packedValue = ((androidx.compose.ui.unit.Velocity) m406doFlingAnimationQWom1Mo).getPackedValue();
                nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
                this.J$0 = j;
                this.J$1 = packedValue;
                this.label = 3;
                j2 = packedValue;
                m3156dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m3156dispatchPostFlingRZ2iAVY(androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(m4720minusAH228Gc, packedValue), packedValue, this);
                if (m3156dispatchPostFlingRZ2iAVY == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j, androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) m3156dispatchPostFlingRZ2iAVY).getPackedValue())));
            }
            j = this.J$0;
            kotlin.ResultKt.throwOnFailure(obj);
            m3158dispatchPreFlingQWom1Mo = obj;
        }
        m4720minusAH228Gc = androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j, ((androidx.compose.ui.unit.Velocity) m3158dispatchPreFlingQWom1Mo).getPackedValue());
        this.J$0 = j;
        this.J$1 = m4720minusAH228Gc;
        this.label = 2;
        m406doFlingAnimationQWom1Mo = this.this$0.m406doFlingAnimationQWom1Mo(m4720minusAH228Gc, this);
        if (m406doFlingAnimationQWom1Mo == coroutine_suspended) {
            return coroutine_suspended;
        }
        long packedValue2 = ((androidx.compose.ui.unit.Velocity) m406doFlingAnimationQWom1Mo).getPackedValue();
        nestedScrollDispatcher2 = this.this$0.nestedScrollDispatcher;
        this.J$0 = j;
        this.J$1 = packedValue2;
        this.label = 3;
        j2 = packedValue2;
        m3156dispatchPostFlingRZ2iAVY = nestedScrollDispatcher2.m3156dispatchPostFlingRZ2iAVY(androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(m4720minusAH228Gc, packedValue2), packedValue2, this);
        if (m3156dispatchPostFlingRZ2iAVY == coroutine_suspended) {
        }
        return androidx.compose.ui.unit.Velocity.m4708boximpl(androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j, androidx.compose.ui.unit.Velocity.m4720minusAH228Gc(j2, ((androidx.compose.ui.unit.Velocity) m3156dispatchPostFlingRZ2iAVY).getPackedValue())));
    }
}
