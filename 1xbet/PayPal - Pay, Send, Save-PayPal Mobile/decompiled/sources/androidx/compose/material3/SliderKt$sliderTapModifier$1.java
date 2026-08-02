package androidx.compose.material3;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SliderKt$sliderTapModifier$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ androidx.compose.material3.SliderState getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "it", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material3.SliderKt$sliderTapModifier$1$1", f = "Slider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: androidx.compose.material3.SliderKt$sliderTapModifier$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        /* synthetic */ long getHighSpeedVideoFpsRanges;
        final /* synthetic */ androidx.compose.material3.SliderState getHighSpeedVideoFpsRangesFor;
        int getHighSpeedVideoSizes;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.getHighSpeedVideoSizes != 0) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRangesFor.m3813onPressk4lQ0M$material3(this.getHighSpeedVideoFpsRanges);
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            long m5762unboximpl = offset.m5762unboximpl();
            androidx.compose.material3.SliderKt$sliderTapModifier$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.SliderKt$sliderTapModifier$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, continuation);
            anonymousClass1.getHighSpeedVideoFpsRanges = m5762unboximpl;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(androidx.compose.material3.SliderState sliderState, kotlin.coroutines.Continuation<? super androidx.compose.material3.SliderKt$sliderTapModifier$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRangesFor = sliderState;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material3.SliderKt$sliderTapModifier$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material3.SliderKt$sliderTapModifier$1.AnonymousClass1(this.getHighResolutionOutputSizeshNQ4ISI, null);
        final androidx.compose.material3.SliderState sliderState = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material3.SliderKt$sliderTapModifier$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material3.SliderKt$sliderTapModifier$1.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.SliderState.this);
            }
        }, continuation, 3, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.material3.SliderState sliderState) {
        sliderState.dispatchRawDelta(0.0f);
        sliderState.getGestureEndAction$material3().invoke();
        return kotlin.Unit.INSTANCE;
    }

    SliderKt$sliderTapModifier$1(androidx.compose.material3.SliderState sliderState) {
        this.getHighResolutionOutputSizeshNQ4ISI = sliderState;
    }
}
