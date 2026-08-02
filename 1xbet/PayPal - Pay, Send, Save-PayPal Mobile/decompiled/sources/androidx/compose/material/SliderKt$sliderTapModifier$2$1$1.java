package androidx.compose.material;

@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SliderKt$sliderTapModifier$2$1$1 implements androidx.compose.ui.input.pointer.PointerInputEventHandler {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.gestures.DraggableState getHighSpeedVideoSizes;
    final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> getInputFormats;
    final /* synthetic */ kotlinx.coroutines.CoroutineScope getOutputFormats;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/PressGestureScope;", "pos", "Landroidx/compose/ui/geometry/Offset;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1", f = "Slider.kt", i = {}, l = {1009}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    /* renamed from: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function3<androidx.compose.foundation.gestures.PressGestureScope, androidx.compose.ui.geometry.Offset, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ float Camera2StreamConfigurationMap;
        final /* synthetic */ androidx.compose.runtime.MutableState<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
        final /* synthetic */ androidx.compose.runtime.State<java.lang.Float> getHighSpeedVideoFpsRanges;
        final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
        /* synthetic */ long getHighSpeedVideoSizes;
        private /* synthetic */ java.lang.Object getInputFormats;
        int getOutputMinFrameDuration;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.getOutputMinFrameDuration;
            try {
                if (i == 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    androidx.compose.foundation.gestures.PressGestureScope pressGestureScope = (androidx.compose.foundation.gestures.PressGestureScope) this.getInputFormats;
                    long j = this.getHighSpeedVideoSizes;
                    this.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat((this.getHighSpeedVideoFpsRangesFor ? this.Camera2StreamConfigurationMap - java.lang.Float.intBitsToFloat((int) (j >> 32)) : java.lang.Float.intBitsToFloat((int) (j >> 32))) - this.getHighSpeedVideoFpsRanges.getValue().floatValue()));
                    this.getOutputMinFrameDuration = 1;
                    if (pressGestureScope.awaitRelease(this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
            } catch (androidx.compose.foundation.gestures.GestureCancellationException unused) {
                this.getHighResolutionOutputSizeshNQ4ISI.setValue(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f));
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.PressGestureScope pressGestureScope, androidx.compose.ui.geometry.Offset offset, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            long m5762unboximpl = offset.m5762unboximpl();
            androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRanges, continuation);
            anonymousClass1.getInputFormats = pressGestureScope;
            anonymousClass1.getHighSpeedVideoSizes = m5762unboximpl;
            return anonymousClass1.invokeSuspend(kotlin.Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, float f, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.State<java.lang.Float> state, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.AnonymousClass1> continuation) {
            super(3, continuation);
            this.getHighSpeedVideoFpsRangesFor = z;
            this.Camera2StreamConfigurationMap = f;
            this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
            this.getHighSpeedVideoFpsRanges = state;
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final java.lang.Object invoke(androidx.compose.ui.input.pointer.PointerInputScope pointerInputScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.AnonymousClass1 anonymousClass1 = new androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.AnonymousClass1(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getInputFormats, null);
        final kotlinx.coroutines.CoroutineScope coroutineScope = this.getOutputFormats;
        final androidx.compose.foundation.gestures.DraggableState draggableState = this.getHighSpeedVideoSizes;
        final androidx.compose.runtime.State<kotlin.jvm.functions.Function1<java.lang.Float, kotlin.Unit>> state = this.getHighSpeedVideoFpsRanges;
        java.lang.Object detectTapGestures$default = androidx.compose.foundation.gestures.TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, anonymousClass1, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.compose.material.SliderKt$sliderTapModifier$2$1$1.getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope.this, draggableState, state);
            }
        }, continuation, 3, null);
        return detectTapGestures$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? detectTapGestures$default : kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.runtime.State state) {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.material.SliderKt$sliderTapModifier$2$1$1$2$1(draggableState, state, null), 3, null);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$sliderTapModifier$2$1$1(boolean z, float f, androidx.compose.runtime.MutableState<java.lang.Float> mutableState, androidx.compose.runtime.State<java.lang.Float> state, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.compose.foundation.gestures.DraggableState draggableState, androidx.compose.runtime.State<? extends kotlin.jvm.functions.Function1<? super java.lang.Float, kotlin.Unit>> state2) {
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = f;
        this.getHighResolutionOutputSizeshNQ4ISI = mutableState;
        this.getInputFormats = state;
        this.getOutputFormats = coroutineScope;
        this.getHighSpeedVideoSizes = draggableState;
        this.getHighSpeedVideoFpsRanges = state2;
    }
}
