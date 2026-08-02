package androidx.compose.foundation.text.contextmenu.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2", f = "RightClickGestures.kt", i = {0}, l = {32, 35}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"}, v = 1)
/* loaded from: classes6.dex */
final class RightClickGesturesKt$onRightClickDown$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.compose.ui.geometry.Offset, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r8 == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0035, code lost:
    
        if (r8 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
            this.Camera2StreamConfigurationMap = awaitPointerEventScope;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            obj = androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt.access$awaitFirstRightClickDown(awaitPointerEventScope, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
                androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
                if (pointerInputChange != null) {
                    pointerInputChange.consume();
                }
                return kotlin.Unit.INSTANCE;
            }
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.Camera2StreamConfigurationMap;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
        pointerInputChange2.consume();
        this.getHighSpeedVideoSizes.invoke(androidx.compose.ui.geometry.Offset.m5741boximpl(pointerInputChange2.getPosition()));
        this.Camera2StreamConfigurationMap = null;
        this.getHighResolutionOutputSizeshNQ4ISI = 2;
        obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2 rightClickGesturesKt$onRightClickDown$2 = new androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2(this.getHighSpeedVideoSizes, continuation);
        rightClickGesturesKt$onRightClickDown$2.Camera2StreamConfigurationMap = obj;
        return rightClickGesturesKt$onRightClickDown$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    RightClickGesturesKt$onRightClickDown$2(kotlin.jvm.functions.Function1<? super androidx.compose.ui.geometry.Offset, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.contextmenu.gestures.RightClickGesturesKt$onRightClickDown$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = function1;
    }
}
