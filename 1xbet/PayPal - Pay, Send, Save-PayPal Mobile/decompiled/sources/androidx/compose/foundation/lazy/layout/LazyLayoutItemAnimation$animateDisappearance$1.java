package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class LazyLayoutItemAnimation$animateDisappearance$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.ui.graphics.layer.GraphicsLayer getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                animatable = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor;
                java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f);
                androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.Camera2StreamConfigurationMap;
                final androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighResolutionOutputSizeshNQ4ISI;
                final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = this.getHighSpeedVideoSizes;
                this.getHighSpeedVideoFpsRangesFor = 1;
                if (androidx.compose.animation.core.Animatable.animateTo$default(animatable, boxFloat, finiteAnimationSpec, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        kotlin.Unit highSpeedVideoFpsRanges;
                        highSpeedVideoFpsRanges = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1.getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.layer.GraphicsLayer.this, lazyLayoutItemAnimation, (androidx.compose.animation.core.Animatable) obj2);
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
            this.getHighSpeedVideoSizes.setDisappearanceAnimationFinished(true);
            this.getHighSpeedVideoSizes.setDisappearanceAnimationInProgress(false);
            return kotlin.Unit.INSTANCE;
        } catch (java.lang.Throwable th) {
            this.getHighSpeedVideoSizes.setDisappearanceAnimationInProgress(false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoFpsRanges(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation, androidx.compose.animation.core.Animatable animatable) {
        kotlin.jvm.functions.Function0 function0;
        graphicsLayer.setAlpha(((java.lang.Number) animatable.getValue()).floatValue());
        function0 = lazyLayoutItemAnimation.getHighSpeedVideoSizes;
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animateDisappearance$1(androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoSizes = lazyLayoutItemAnimation;
        this.Camera2StreamConfigurationMap = finiteAnimationSpec;
        this.getHighResolutionOutputSizeshNQ4ISI = graphicsLayer;
    }
}
