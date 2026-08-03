package androidx.compose.foundation;

/* compiled from: Clickable.kt */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "offset", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4", f = "Clickable.kt", i = {}, l = {1028}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class CombinedClickablePointerInputNode$pointerInput$4 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    /* synthetic */ long J$0;
    private /* synthetic */ java.lang.Object L$0;
    int label;
    final /* synthetic */ androidx.compose.foundation.CombinedClickablePointerInputNode this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CombinedClickablePointerInputNode$pointerInput$4(androidx.compose.foundation.CombinedClickablePointerInputNode combinedClickablePointerInputNode, kotlin.coroutines.Continuation<? super androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4> continuation) {
        super(3, continuation);
        this.this$0 = combinedClickablePointerInputNode;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return m266invoked4ec7I(pressGestureScope, offset.getPackedValue(), continuation);
    }

    /* renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final java.lang.Object m266invoked4ec7I(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, long j, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4 combinedClickablePointerInputNode$pointerInput$4 = new androidx.compose.foundation.CombinedClickablePointerInputNode$pointerInput$4(this.this$0, continuation);
        combinedClickablePointerInputNode$pointerInput$4.L$0 = pressGestureScope;
        combinedClickablePointerInputNode$pointerInput$4.J$0 = j;
        return combinedClickablePointerInputNode$pointerInput$4.invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.L$0;
            long j = this.J$0;
            if (this.this$0.getEnabled()) {
                this.label = 1;
                if (this.this$0.m186handlePressInteractiond4ec7I(pressGestureScope, j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }
}
