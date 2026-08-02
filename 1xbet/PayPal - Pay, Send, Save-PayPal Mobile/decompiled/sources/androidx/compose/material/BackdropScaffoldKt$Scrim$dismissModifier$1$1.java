package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
final class BackdropScaffoldKt$Scrim$dismissModifier$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ kotlin.jvm.functions.Function0<kotlin.Unit> getHighSpeedVideoFpsRanges;

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        final kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.getHighSpeedVideoFpsRanges;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.BackdropScaffoldKt$Scrim$dismissModifier$1$1.getHighSpeedVideoSizes(kotlin.jvm.functions.Function0.this);
            }
        }, continuation, 7, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    BackdropScaffoldKt$Scrim$dismissModifier$1$1(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.getHighSpeedVideoFpsRanges = function0;
    }
}
