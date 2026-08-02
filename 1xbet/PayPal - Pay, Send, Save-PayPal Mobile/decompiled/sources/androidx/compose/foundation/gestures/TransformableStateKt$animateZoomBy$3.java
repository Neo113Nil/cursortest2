package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3", f = "TransformableState.kt", i = {}, l = {142}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TransformableStateKt$animateZoomBy$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    private /* synthetic */ java.lang.Object Camera2StreamConfigurationMap;
    final /* synthetic */ float getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoSizes;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.TransformScope transformScope = (androidx.compose.foundation.gestures.TransformScope) this.Camera2StreamConfigurationMap;
            androidx.compose.animation.core.AnimationState AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(this.getHighSpeedVideoFpsRanges.element, 0.0f, 0L, 0L, false, 30, null);
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.getHighResolutionOutputSizeshNQ4ISI);
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.internal.Ref.FloatRef floatRef = this.getHighSpeedVideoFpsRanges;
            this.getHighSpeedVideoSizes = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoFpsRanges;
                    highSpeedVideoFpsRanges = androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3.getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.FloatRef.this, transformScope, (androidx.compose.animation.core.AnimationScope) obj2);
                    return highSpeedVideoFpsRanges;
                }
            }, this, 4, null) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.TransformScope transformScope, androidx.compose.animation.core.AnimationScope animationScope) {
        androidx.compose.foundation.gestures.TransformScope.m1548transformByd4ec7I$default(transformScope, floatRef.element == 0.0f ? 1.0f : ((java.lang.Number) animationScope.getValue()).floatValue() / floatRef.element, 0L, 0.0f, 6, null);
        floatRef.element = ((java.lang.Number) animationScope.getValue()).floatValue();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.TransformScope transformScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3) create(transformScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3 transformableStateKt$animateZoomBy$3 = new androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        transformableStateKt$animateZoomBy$3.Camera2StreamConfigurationMap = obj;
        return transformableStateKt$animateZoomBy$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateZoomBy$3(kotlin.jvm.internal.Ref.FloatRef floatRef, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableStateKt$animateZoomBy$3> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = floatRef;
        this.getHighResolutionOutputSizeshNQ4ISI = f;
        this.getHighSpeedVideoFpsRangesFor = animationSpec;
    }
}
