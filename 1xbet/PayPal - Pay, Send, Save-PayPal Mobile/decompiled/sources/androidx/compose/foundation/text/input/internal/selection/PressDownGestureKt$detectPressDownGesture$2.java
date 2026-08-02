package androidx.compose.foundation.text.input.internal.selection;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2", f = "PressDownGesture.kt", i = {0, 1, 1}, l = {31, 37}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", com.datadog.android.rum.internal.instrumentation.gestures.GesturesListener.SCROLL_DIRECTION_DOWN}, s = {"L$0", "L$0", "L$1"}, v = 1)
/* loaded from: classes6.dex */
final class PressDownGestureKt$detectPressDownGesture$2 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.text.input.internal.selection.TapOnPosition getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    java.lang.Object getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0063, code lost:
    
        if (r13 != r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x009b, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0042, code lost:
    
        if (r13 != r0) goto L12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:6:0x0066). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope;
        androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope2;
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            this.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope;
            this.getHighSpeedVideoFpsRanges = 1;
            obj = androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 2, null);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pointerInputChange = (androidx.compose.ui.input.pointer.PointerInputChange) this.getHighSpeedVideoSizes;
                awaitPointerEventScope2 = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                java.util.List<androidx.compose.ui.input.pointer.PointerInputChange> changes = ((androidx.compose.ui.input.pointer.PointerEvent) obj).getChanges();
                int size = changes.size();
                for (int i2 = 0; i2 < size; i2++) {
                    androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange2 = changes.get(i2);
                    if (androidx.compose.ui.input.pointer.PointerId.m7213equalsimpl0(pointerInputChange2.getId(), pointerInputChange.getId()) && pointerInputChange2.getPressed()) {
                        this.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
                        this.getHighSpeedVideoSizes = pointerInputChange;
                        this.getHighSpeedVideoFpsRanges = 2;
                        obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
                    }
                }
                this.Camera2StreamConfigurationMap.invoke();
                return kotlin.Unit.INSTANCE;
            }
            awaitPointerEventScope = (androidx.compose.ui.input.pointer.AwaitPointerEventScope) this.getHighSpeedVideoFpsRangesFor;
            kotlin.ResultKt.throwOnFailure(obj);
        }
        androidx.compose.ui.input.pointer.PointerInputChange pointerInputChange3 = (androidx.compose.ui.input.pointer.PointerInputChange) obj;
        this.getHighResolutionOutputSizeshNQ4ISI.mo2292onEventk4lQ0M(pointerInputChange3.getPosition());
        if (this.Camera2StreamConfigurationMap != null) {
            awaitPointerEventScope2 = awaitPointerEventScope;
            pointerInputChange = pointerInputChange3;
            this.getHighSpeedVideoFpsRangesFor = awaitPointerEventScope2;
            this.getHighSpeedVideoSizes = pointerInputChange;
            this.getHighSpeedVideoFpsRanges = 2;
            obj = androidx.compose.ui.input.pointer.AwaitPointerEventScope.awaitPointerEvent$default(awaitPointerEventScope2, null, this, 1, null);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.ui.input.pointer.AwaitPointerEventScope awaitPointerEventScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2) create(awaitPointerEventScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2 pressDownGestureKt$detectPressDownGesture$2 = new androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, continuation);
        pressDownGestureKt$detectPressDownGesture$2.getHighSpeedVideoFpsRangesFor = obj;
        return pressDownGestureKt$detectPressDownGesture$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PressDownGestureKt$detectPressDownGesture$2(androidx.compose.foundation.text.input.internal.selection.TapOnPosition tapOnPosition, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.coroutines.Continuation<? super androidx.compose.foundation.text.input.internal.selection.PressDownGestureKt$detectPressDownGesture$2> continuation) {
        super(2, continuation);
        this.getHighResolutionOutputSizeshNQ4ISI = tapOnPosition;
        this.Camera2StreamConfigurationMap = function0;
    }
}
