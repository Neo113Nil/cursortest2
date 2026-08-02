package androidx.compose.foundation.lazy.layout;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", i = {}, l = {183, 185}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class LazyLayoutItemAnimation$animateAppearance$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    final /* synthetic */ boolean getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.ui.graphics.layer.GraphicsLayer getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r13 == r0) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        androidx.compose.animation.core.Animatable animatable;
        androidx.compose.animation.core.Animatable animatable2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        try {
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                if (this.getHighSpeedVideoFpsRangesFor) {
                    animatable = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
                    this.getHighSpeedVideoFpsRanges = 1;
                    if (animatable.snapTo(kotlin.coroutines.jvm.internal.Boxing.boxFloat(0.0f), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    this.Camera2StreamConfigurationMap.setAppearanceAnimationInProgress(false);
                    return kotlin.Unit.INSTANCE;
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            animatable2 = this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
            java.lang.Float boxFloat = kotlin.coroutines.jvm.internal.Boxing.boxFloat(1.0f);
            androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec = this.getHighResolutionOutputSizeshNQ4ISI;
            final androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer = this.getHighSpeedVideoSizes;
            final androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRanges = 2;
            obj = androidx.compose.animation.core.Animatable.animateTo$default(animatable2, boxFloat, finiteAnimationSpec, null, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj2) {
                    kotlin.Unit highSpeedVideoSizes;
                    highSpeedVideoSizes = androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2.getHighSpeedVideoSizes(androidx.compose.ui.graphics.layer.GraphicsLayer.this, lazyLayoutItemAnimation, (androidx.compose.animation.core.Animatable) obj2);
                    return highSpeedVideoSizes;
                }
            }, this, 4, null);
        } catch (java.lang.Throwable th) {
            this.Camera2StreamConfigurationMap.setAppearanceAnimationInProgress(false);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit getHighSpeedVideoSizes(androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation, androidx.compose.animation.core.Animatable animatable) {
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
        return ((androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2(this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyLayoutItemAnimation$animateAppearance$2(boolean z, androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation lazyLayoutItemAnimation, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> finiteAnimationSpec, androidx.compose.ui.graphics.layer.GraphicsLayer graphicsLayer, kotlin.coroutines.Continuation<? super androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRangesFor = z;
        this.Camera2StreamConfigurationMap = lazyLayoutItemAnimation;
        this.getHighResolutionOutputSizeshNQ4ISI = finiteAnimationSpec;
        this.getHighSpeedVideoSizes = graphicsLayer;
    }
}
