package androidx.compose.material;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/DragScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.material.SliderKt$animateToTarget$2", f = "Slider.kt", i = {}, l = {org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants.IMAGE_RESOURCE_BLOCK_WORKFLOW_URL}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class SliderKt$animateToTarget$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.DragScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    final /* synthetic */ float getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.TweenSpec tweenSpec;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.DragScope dragScope = (androidx.compose.foundation.gestures.DragScope) this.getHighSpeedVideoSizes;
            final kotlin.jvm.internal.Ref.FloatRef floatRef = new kotlin.jvm.internal.Ref.FloatRef();
            floatRef.element = this.getHighSpeedVideoFpsRangesFor;
            androidx.compose.animation.core.Animatable Animatable$default = androidx.compose.animation.core.AnimatableKt.Animatable$default(this.getHighSpeedVideoFpsRangesFor, 0.0f, 2, null);
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap);
            tweenSpec = androidx.compose.material.SliderKt.getHighSpeedVideoFpsRanges;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (Animatable$default.animateTo(boxFloat, tweenSpec, kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighSpeedVideoFpsRanges), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.material.SliderKt$animateToTarget$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    return androidx.compose.material.SliderKt$animateToTarget$2.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.DragScope.this, floatRef, (androidx.compose.animation.core.Animatable) obj2);
                }
            }, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.material.SliderKt$animateToTarget$2) create(dragScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.gestures.DragScope dragScope, kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.animation.core.Animatable animatable) {
        dragScope.dragBy(((java.lang.Number) animatable.getValue()).floatValue() - floatRef.element);
        floatRef.element = ((java.lang.Number) animatable.getValue()).floatValue();
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.material.SliderKt$animateToTarget$2 sliderKt$animateToTarget$2 = new androidx.compose.material.SliderKt$animateToTarget$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        sliderKt$animateToTarget$2.getHighSpeedVideoSizes = obj;
        return sliderKt$animateToTarget$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SliderKt$animateToTarget$2(float f, float f2, float f3, kotlin.coroutines.Continuation<? super androidx.compose.material.SliderKt$animateToTarget$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = f;
        this.Camera2StreamConfigurationMap = f2;
        this.getHighSpeedVideoFpsRanges = f3;
    }
}
