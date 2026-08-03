package androidx.compose.foundation.text2.input.internal.selection;

/* compiled from: PressDownGesture.kt */
@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {32, 38}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down"}, s = {"L$0", "L$0", "L$1"})
/* loaded from: classes.dex */
final class PressDownGestureKt$detectPressDownGesture$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.text2.input.internal.selection.TapOnPosition $onDown;
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> $onUp;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressDownGestureKt$detectPressDownGesture$2(androidx.compose.foundation.text2.input.internal.selection.TapOnPosition tapOnPosition, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2> continuation) {
        super(2, continuation);
        this.$onDown = tapOnPosition;
        this.$onUp = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2(this.$onDown, this.$onUp, continuation);
        pressDownGestureKt$detectPressDownGesture$2.L$0 = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text2.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0074  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0064 -> B:6:0x0067). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        int size;
        int i;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            this.L$0 = awaitPointerEventScope;
            this.label = 1;
            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.L$1;
                awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                size = changes.size();
                i = 0;
                while (i < size) {
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes.get(i);
                    if (androidx.compose.ui.input.pointer.PointerId.m3257equalsimpl0(pointerInputChange2.getId(), pointerInputChange.getId()) && pointerInputChange2.getPressed()) {
                        this.L$0 = awaitPointerEventScope2;
                        this.L$1 = pointerInputChange;
                        this.label = 2;
                        obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes2 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                        size = changes2.size();
                        i = 0;
                        while (i < size) {
                        }
                    } else {
                        i++;
                    }
                }
                this.$onUp.invoke();
                return kotlin.Unit.INSTANCE;
            }
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.L$0;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
        this.$onDown.mo1177onEventk4lQ0M(pointerInputChange3.getPosition());
        if (this.$onUp != null) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = pointerInputChange3;
            this.L$0 = awaitPointerEventScope2;
            this.L$1 = pointerInputChange;
            this.label = 2;
            obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.CC.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
            if (obj == coroutine_suspended) {
            }
            java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes22 = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
            size = changes22.size();
            i = 0;
            while (i < size) {
            }
            this.$onUp.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }
}
