package androidx.compose.foundation.gestures;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/ScrollScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {}, v = 1)
/* loaded from: classes6.dex */
final class ScrollExtensionsKt$animateScrollBy$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<androidx.compose.foundation.gestures.ScrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.internal.Ref.FloatRef Camera2StreamConfigurationMap;
    private /* synthetic */ java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ float getHighSpeedVideoFpsRanges;
    int getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ androidx.compose.animation.core.AnimationSpec<java.lang.Float> getHighSpeedVideoSizes;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRangesFor;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            final androidx.compose.foundation.gestures.ScrollScope scrollScope = (androidx.compose.foundation.gestures.ScrollScope) this.getHighResolutionOutputSizeshNQ4ISI;
            float f = this.getHighSpeedVideoFpsRanges;
            androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec = this.getHighSpeedVideoSizes;
            final kotlin.jvm.internal.Ref.FloatRef floatRef = this.Camera2StreamConfigurationMap;
            this.getHighSpeedVideoFpsRangesFor = 1;
            if (androidx.compose.animation.core.SuspendAnimationKt.animate$default(0.0f, f, 0.0f, animationSpec, new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    kotlin.Unit highResolutionOutputSizeshNQ4ISI;
                    highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.FloatRef.this, scrollScope, ((java.lang.Float) obj2).floatValue());
                    return highResolutionOutputSizeshNQ4ISI;
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
    public static final kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.FloatRef floatRef, androidx.compose.foundation.gestures.ScrollScope scrollScope, float f) {
        floatRef.element += scrollScope.scrollBy(f - floatRef.element);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.jvm.functions.Function2
    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
    public java.lang.Object invoke(androidx.compose.foundation.gestures.ScrollScope scrollScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2) create(scrollScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap, continuation);
        scrollExtensionsKt$animateScrollBy$2.getHighResolutionOutputSizeshNQ4ISI = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f, androidx.compose.animation.core.AnimationSpec<java.lang.Float> animationSpec, kotlin.jvm.internal.Ref.FloatRef floatRef, kotlin.coroutines.Continuation<? super androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2> continuation) {
        super(2, continuation);
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoSizes = animationSpec;
        this.Camera2StreamConfigurationMap = floatRef;
    }
}
