package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PINWHEEL_LOGO_VALUE}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class TransformableStateKt$animatePanBy$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.TransformScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.LongRef Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ long getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.TransformScope transformScope = (androidx.compose.foundation.gestures.TransformScope) this.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.animation.core.AnimationState animationState = new androidx.compose.animation.core.AnimationState(androidx.compose.animation.core.VectorConvertersKt.getVectorConverter(androidx.compose.ui.geometry.Offset.INSTANCE), androidx.compose.ui.geometry.Offset.m5741boximpl(this.Camera2StreamConfigurationMap.element), null, 0L, 0L, false, 60, null);
            androidx.compose.ui.geometry.Offset m5741boximpl = androidx.compose.ui.geometry.Offset.m5741boximpl(this.getHighSpeedVideoSizes);
            androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec = this.getHighSpeedVideoFpsRanges;
            final kotlin.jvm.internal.Ref.LongRef longRef = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animateTo$default(animationState, m5741boximpl, animationSpec, false, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit Camera2StreamConfigurationMap;
                    Camera2StreamConfigurationMap = androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.LongRef.this, transformScope, (androidx.compose.animation.core.AnimationScope) obj2);
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
    public static final kotlin.Unit Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.LongRef longRef, androidx.compose.foundation.gestures.TransformScope transformScope, androidx.compose.animation.core.AnimationScope animationScope) {
        androidx.compose.foundation.gestures.TransformScope.m1548transformByd4ec7I$default(transformScope, 0.0f, androidx.compose.ui.geometry.Offset.m5756minusMKHz9U(((androidx.compose.ui.geometry.Offset) animationScope.getValue()).m5762unboximpl(), longRef.element), 0.0f, 5, null);
        longRef.element = ((androidx.compose.ui.geometry.Offset) animationScope.getValue()).m5762unboximpl();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.TransformScope transformScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2) create(transformScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges, continuation);
        transformableStateKt$animatePanBy$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return transformableStateKt$animatePanBy$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animatePanBy$2(kotlin.jvm.internal.Ref.LongRef longRef, long j, androidx.compose.animation.core.AnimationSpec<androidx.compose.ui.geometry.Offset> animationSpec, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = longRef;
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = animationSpec;
    }
}
