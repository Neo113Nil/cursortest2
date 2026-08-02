package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001as\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0005X\u008a\u008e\u0002"}, d2 = {"animateLottieCompositionAsState", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "composition", "Lcom/airbnb/lottie/LottieComposition;", "isPlaying", "", "restartOnPlay", "reverseOnRepeat", "clipSpec", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "speed", "", "iterations", "", "cancellationBehavior", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "ignoreSystemAnimatorScale", "useCompositionFrameRate", "(Lcom/airbnb/lottie/LottieComposition;ZZZLcom/airbnb/lottie/compose/LottieClipSpec;FILcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLandroidx/compose/runtime/Composer;II)Lcom/airbnb/lottie/compose/LottieAnimationState;", "lottie-compose_release", "wasPlaying"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AnimateLottieCompositionAsStateKt {
    public static final com.airbnb.lottie.compose.LottieAnimationState animateLottieCompositionAsState(com.airbnb.lottie.LottieComposition lottieComposition, boolean z, boolean z2, boolean z3, com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec, float f, int i, com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior, boolean z4, boolean z5, androidx.compose.runtime.Composer composer, int i2, int i3) {
        composer.startReplaceableGroup(683659508);
        boolean z6 = (i3 & 2) != 0 ? true : z;
        boolean z7 = (i3 & 4) != 0 ? true : z2;
        boolean z8 = (i3 & 8) != 0 ? false : z3;
        com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec2 = (i3 & 16) != 0 ? null : lottieClipSpec;
        float f2 = (i3 & 32) != 0 ? 1.0f : f;
        int i4 = (i3 & 64) != 0 ? 1 : i;
        com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior2 = (i3 & 128) != 0 ? com.airbnb.lottie.compose.LottieCancellationBehavior.Immediately : lottieCancellationBehavior;
        boolean z9 = (i3 & 256) != 0 ? false : z4;
        boolean z10 = (i3 & 512) != 0 ? false : z5;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(683659508, i2, -1, "com.airbnb.lottie.compose.animateLottieCompositionAsState (animateLottieCompositionAsState.kt:54)");
        }
        if (i4 <= 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Iterations must be a positive number (");
            sb.append(i4);
            sb.append(").");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (java.lang.Float.isInfinite(f2) || java.lang.Float.isNaN(f2)) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Speed must be a finite number. It is ");
            sb2.append(f2);
            sb2.append(".");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        com.airbnb.lottie.compose.LottieAnimatable rememberLottieAnimatable = com.airbnb.lottie.compose.LottieAnimatableKt.rememberLottieAnimatable(composer, 0);
        composer.startReplaceableGroup(-180606964);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.valueOf(z6), null, 2, null);
            composer.updateRememberedValue(rememberedValue);
        }
        androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
        composer.endReplaceableGroup();
        composer.startReplaceableGroup(-180606834);
        if (!z9) {
            f2 /= com.airbnb.lottie.utils.Utils.getAnimationScale((android.content.Context) composer.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext()));
        }
        float f3 = f2;
        composer.endReplaceableGroup();
        androidx.compose.runtime.EffectsKt.LaunchedEffect(new java.lang.Object[]{lottieComposition, java.lang.Boolean.valueOf(z6), lottieClipSpec2, java.lang.Float.valueOf(f3), java.lang.Integer.valueOf(i4)}, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) new com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(z6, z7, rememberLottieAnimatable, lottieComposition, i4, z8, f3, lottieClipSpec2, lottieCancellationBehavior2, z10, mutableState, null), composer, 72);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return rememberLottieAnimatable;
    }
}
