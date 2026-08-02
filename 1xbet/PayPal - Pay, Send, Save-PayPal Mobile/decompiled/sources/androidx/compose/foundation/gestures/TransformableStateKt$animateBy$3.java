package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3", f = "TransformableState.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TransformableStateKt$animateBy$3 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.AnimationData> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.foundation.gestures.AnimationData getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ androidx.compose.foundation.gestures.DelegatingAnimationSpec getHighSpeedVideoFpsRangesFor;
    private /* synthetic */ java.lang.Object getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.foundation.gestures.AnimationData animationData;
        androidx.compose.animation.core.AnimationState AnimationState;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.TransformScope transformScope = (androidx.compose.foundation.gestures.TransformScope) this.getHighSpeedVideoSizes;
            androidx.compose.foundation.gestures.AnimationDataConverter animationDataConverter = androidx.compose.foundation.gestures.AnimationDataConverter.INSTANCE;
            androidx.compose.foundation.gestures.AnimationData animationData2 = this.Camera2StreamConfigurationMap.element;
            animationData = androidx.compose.foundation.gestures.TransformableStateKt.getHighSpeedVideoFpsRangesFor;
            AnimationState = androidx.compose.animation.core.AnimationStateKt.AnimationState(animationDataConverter, animationData2, animationData, (r19 & 8) != 0 ? Long.MIN_VALUE : 0L, (r19 & 16) != 0 ? Long.MIN_VALUE : 0L, (r19 & 32) != 0 ? false : false);
            androidx.compose.foundation.gestures.AnimationData animationData3 = this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.foundation.gestures.DelegatingAnimationSpec delegatingAnimationSpec = this.getHighSpeedVideoFpsRangesFor;
            final kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.AnimationData> objectRef = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(AnimationState, animationData3, delegatingAnimationSpec, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef.this, transformScope, (androidx.compose.animation.core.AnimationScope) obj2);
                    return Camera2StreamConfigurationMap;
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
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, java.lang.Object] */
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.ObjectRef objectRef, androidx.compose.foundation.gestures.TransformScope transformScope, androidx.compose.animation.core.AnimationScope animationScope) {
        transformScope.mo1439transformByd4ec7I(((androidx.compose.foundation.gestures.AnimationData) objectRef.element).getGetHighSpeedVideoSizes() == 0.0f ? 1.0f : ((androidx.compose.foundation.gestures.AnimationData) animationScope.getValue()).getGetHighSpeedVideoSizes() / ((androidx.compose.foundation.gestures.AnimationData) objectRef.element).getGetHighSpeedVideoSizes(), androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(((androidx.compose.foundation.gestures.AnimationData) animationScope.getValue()).getCamera2StreamConfigurationMap(), ((androidx.compose.foundation.gestures.AnimationData) objectRef.element).getCamera2StreamConfigurationMap()), ((androidx.compose.foundation.gestures.AnimationData) animationScope.getValue()).getGetHighResolutionOutputSizeshNQ4ISI() - ((androidx.compose.foundation.gestures.AnimationData) objectRef.element).getGetHighResolutionOutputSizeshNQ4ISI());
        objectRef.element = animationScope.getValue();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.TransformScope transformScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3) create(transformScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3 transformableStateKt$animateBy$3 = new androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor, continuation);
        transformableStateKt$animateBy$3.getHighSpeedVideoSizes = obj;
        return transformableStateKt$animateBy$3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animateBy$3(kotlin.jvm.internal.Ref.ObjectRef<androidx.compose.foundation.gestures.AnimationData> objectRef, androidx.compose.foundation.gestures.AnimationData animationData, androidx.compose.foundation.gestures.DelegatingAnimationSpec delegatingAnimationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableStateKt$animateBy$3> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = objectRef;
        this.getHighResolutionOutputSizeshNQ4ISI = animationData;
        this.getHighSpeedVideoFpsRangesFor = delegatingAnimationSpec;
    }
}
