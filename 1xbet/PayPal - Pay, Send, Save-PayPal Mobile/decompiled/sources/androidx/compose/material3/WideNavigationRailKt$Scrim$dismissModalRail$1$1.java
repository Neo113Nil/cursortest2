package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WideNavigationRailKt$Scrim$dismissModalRail$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Boolean> getHighResolutionOutputSizeshNQ4ISI;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.WideNavigationRailKt$Scrim$dismissModalRail$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.WideNavigationRailKt$Scrim$dismissModalRail$1$1.getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState.this);
            }
        }, continuation, 7, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(true));
        return kotlin.Unit.INSTANCE;
    }

    WideNavigationRailKt$Scrim$dismissModalRail$1$1(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
    }
}
