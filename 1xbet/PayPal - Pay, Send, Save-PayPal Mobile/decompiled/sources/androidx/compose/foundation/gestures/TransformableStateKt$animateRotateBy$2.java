package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2", f = "TransformableState.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TransformableStateKt$animateRotateBy$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ float Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.TransformScope transformScope = (androidx.compose.foundation.gestures.TransformScope) this.getHighSpeedVideoSizes;
            androidx.compose.animation.core.AnimationState AnimationState$default = androidx.compose.animation.core.AnimationStateKt.AnimationState$default(this.getHighSpeedVideoFpsRangesFor.element, 0.0f, 0L, 0L, false, 30, null);
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(this.Camera2StreamConfigurationMap);
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.internal.Ref.FloatRef floatRef = this.getHighSpeedVideoFpsRangesFor;
            this.getHighResolutionOutputSizeshNQ4ISI = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(AnimationState$default, boxFloat, animationSpec, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2.getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.FloatRef.this, transformScope, (androidx.compose.animation.core.AnimationScope) obj2);
                    return highSpeedVideoSizes;
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
    public static final kotlin.Unit getHighSpeedVideoSizes(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.TransformScope transformScope, androidx.compose.animation.core.AnimationScope animationScope) {
        androidx.compose.foundation.gestures.TransformScope.m1548transformByd4ec7I$default(transformScope, 0.0f, 0L, ((java.lang.Number) animationScope.getValue()).floatValue() - floatRef.element, 3, null);
        floatRef.element = ((java.lang.Number) animationScope.getValue()).floatValue();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.TransformScope transformScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2) create(transformScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2 transformableStateKt$animateRotateBy$2 = new androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, continuation);
        transformableStateKt$animateRotateBy$2.getHighSpeedVideoSizes = obj;
        return transformableStateKt$animateRotateBy$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateRotateBy$2(kotlin.jvm.internal.Ref.FloatRef floatRef, float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableStateKt$animateRotateBy$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = floatRef;
        this.Camera2StreamConfigurationMap = f;
        this.getHighSpeedVideoFpsRanges = animationSpec;
    }
}
