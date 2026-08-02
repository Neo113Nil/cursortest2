package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ClockDialNode$pointerInputDragNode$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.material3.ClockDialNode getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.material3.ClockDialNode clockDialNode = this.getHighResolutionOutputSizeshNQ4ISI;
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.getHighSpeedVideoFpsRangesFor(androidx.compose.material3.ClockDialNode.this);
            }
        };
        final androidx.compose.material3.ClockDialNode clockDialNode2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object detectDragGestures$default = androidx.compose.foundation.gestures.DragGestureDetectorKt.detectDragGestures$default(pointerInputScope, null, function0, null, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                return androidx.compose.material3.ClockDialNode$pointerInputDragNode$1.Camera2StreamConfigurationMap(androidx.compose.material3.ClockDialNode.this, (androidx.compose.ui.geometry.Offset) obj2);
            }
        }, continuation, 5, null);
        return detectDragGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectDragGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.material3.ClockDialNode clockDialNode) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(clockDialNode.getCoroutineScope(), null, null, new androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$1$1(clockDialNode, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(androidx.compose.material3.ClockDialNode clockDialNode, androidx.compose.ui.geometry.Offset offset) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(clockDialNode.getCoroutineScope(), null, null, new androidx.compose.material3.ClockDialNode$pointerInputDragNode$1$2$1(clockDialNode, offset, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    ClockDialNode$pointerInputDragNode$1(androidx.compose.material3.ClockDialNode clockDialNode) {
        this.getHighResolutionOutputSizeshNQ4ISI = clockDialNode;
    }
}
