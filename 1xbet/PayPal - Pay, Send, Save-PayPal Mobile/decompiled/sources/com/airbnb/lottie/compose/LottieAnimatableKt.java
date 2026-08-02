package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\r\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a+\u0010\t\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\r\u0010\u000b\u001a\u00020\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0014\u0010\u000e\u001a\u00020\r*\u00020\u0000H\u0086@¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "LottieAnimatable", "()Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/LottieComposition;", "p0", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "p1", "", "p2", "Camera2StreamConfigurationMap", "(Lcom/airbnb/lottie/LottieComposition;Lcom/airbnb/lottie/compose/LottieClipSpec;F)F", "rememberLottieAnimatable", "(Landroidx/compose/runtime/Composer;I)Lcom/airbnb/lottie/compose/LottieAnimatable;", "", "resetToBeginning", "(Lcom/airbnb/lottie/compose/LottieAnimatable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LottieAnimatableKt {
    public static final com.airbnb.lottie.compose.LottieAnimatable rememberLottieAnimatable(androidx.compose.runtime.Composer composer, int i) {
        composer.startReplaceableGroup(2024497114);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2024497114, i, -1, "com.airbnb.lottie.compose.rememberLottieAnimatable (LottieAnimatable.kt:28)");
        }
        composer.startReplaceableGroup(-610207850);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = LottieAnimatable();
            composer.updateRememberedValue(rememberedValue);
        }
        com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable = (com.airbnb.lottie.compose.LottieAnimatable) rememberedValue;
        composer.endReplaceableGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return lottieAnimatable;
    }

    public static final com.airbnb.lottie.compose.LottieAnimatable LottieAnimatable() {
        return new com.airbnb.lottie.compose.LottieAnimatableImpl();
    }

    public static final java.lang.Object resetToBeginning(com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object snapTo$default = com.airbnb.lottie.compose.LottieAnimatable.DefaultImpls.snapTo$default(lottieAnimatable, null, Camera2StreamConfigurationMap(lottieAnimatable.getComposition(), lottieAnimatable.getClipSpec(), lottieAnimatable.getSpeed()), 1, false, continuation, 9, null);
        return snapTo$default == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? snapTo$default : kotlin.Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Camera2StreamConfigurationMap(com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec, float f) {
        if (f < 0.0f && lottieComposition == null) {
            return 1.0f;
        }
        if (lottieComposition == null) {
            return 0.0f;
        }
        if (f < 0.0f) {
            if (lottieClipSpec != null) {
                return lottieClipSpec.getMaxProgress$lottie_compose_release(lottieComposition);
            }
            return 1.0f;
        }
        if (lottieClipSpec != null) {
            return lottieClipSpec.getMinProgress$lottie_compose_release(lottieComposition);
        }
        return 0.0f;
    }
}
