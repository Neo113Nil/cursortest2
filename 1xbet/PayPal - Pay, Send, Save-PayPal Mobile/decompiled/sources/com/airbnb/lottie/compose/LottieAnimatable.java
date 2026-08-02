package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0080\u0001\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0014\u0010\u0015J:\u0010\u0018\u001a\u00020\u00132\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0016\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0007H¦@¢\u0006\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimatable;", "Lcom/airbnb/lottie/compose/LottieAnimationState;", "Lcom/airbnb/lottie/LottieComposition;", "composition", "", "iteration", "iterations", "", "reverseOnRepeat", "", "speed", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "initialProgress", "continueFromPreviousAnimate", "Lcom/airbnb/lottie/compose/LottieCancellationBehavior;", "cancellationBehavior", "ignoreSystemAnimationsDisabled", "useCompositionFrameRate", "", "animate", "(Lcom/airbnb/lottie/LottieComposition;IIZFLcom/airbnb/lottie/compose/LottieClipSpec;FZLcom/airbnb/lottie/compose/LottieCancellationBehavior;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "progress", "resetLastFrameNanos", "snapTo", "(Lcom/airbnb/lottie/LottieComposition;FIZLkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface LottieAnimatable extends com.airbnb.lottie.compose.LottieAnimationState {
    java.lang.Object animate(com.airbnb.lottie.LottieComposition lottieComposition, int i, int i2, boolean z, float f, com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec, float f2, boolean z2, com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object snapTo(com.airbnb.lottie.LottieComposition lottieComposition, float f, int i, boolean z, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static long getLastFrameNanos(com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable) {
            return com.airbnb.lottie.compose.LottieAnimationState.DefaultImpls.getLastFrameNanos(lottieAnimatable);
        }

        public static /* synthetic */ java.lang.Object snapTo$default(com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable, com.airbnb.lottie.LottieComposition lottieComposition, float f, int i, boolean z, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: snapTo");
            }
            if ((i2 & 1) != 0) {
                lottieComposition = lottieAnimatable.getComposition();
            }
            com.airbnb.lottie.LottieComposition lottieComposition2 = lottieComposition;
            if ((i2 & 2) != 0) {
                f = lottieAnimatable.getProgress();
            }
            float f2 = f;
            if ((i2 & 4) != 0) {
                i = lottieAnimatable.getIteration();
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                z = !(f2 == lottieAnimatable.getProgress());
            }
            return lottieAnimatable.snapTo(lottieComposition2, f2, i3, z, continuation);
        }

        public static /* synthetic */ java.lang.Object animate$default(com.airbnb.lottie.compose.LottieAnimatable lottieAnimatable, com.airbnb.lottie.LottieComposition lottieComposition, int i, int i2, boolean z, float f, com.airbnb.lottie.compose.LottieClipSpec lottieClipSpec, float f2, boolean z2, com.airbnb.lottie.compose.LottieCancellationBehavior lottieCancellationBehavior, boolean z3, boolean z4, kotlin.coroutines.Continuation continuation, int i3, java.lang.Object obj) {
            float f3;
            float Camera2StreamConfigurationMap;
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
            }
            int iteration = (i3 & 2) != 0 ? lottieAnimatable.getIteration() : i;
            int iterations = (i3 & 4) != 0 ? lottieAnimatable.getIterations() : i2;
            boolean reverseOnRepeat = (i3 & 8) != 0 ? lottieAnimatable.getReverseOnRepeat() : z;
            float speed = (i3 & 16) != 0 ? lottieAnimatable.getSpeed() : f;
            com.airbnb.lottie.compose.LottieClipSpec clipSpec = (i3 & 32) != 0 ? lottieAnimatable.getClipSpec() : lottieClipSpec;
            if ((i3 & 64) != 0) {
                Camera2StreamConfigurationMap = com.airbnb.lottie.compose.LottieAnimatableKt.Camera2StreamConfigurationMap(lottieComposition, clipSpec, speed);
                f3 = Camera2StreamConfigurationMap;
            } else {
                f3 = f2;
            }
            return lottieAnimatable.animate(lottieComposition, iteration, iterations, reverseOnRepeat, speed, clipSpec, f3, (i3 & 128) != 0 ? false : z2, (i3 & 256) != 0 ? com.airbnb.lottie.compose.LottieCancellationBehavior.Immediately : lottieCancellationBehavior, (i3 & 512) != 0 ? false : z3, (i3 & 1024) != 0 ? false : z4, continuation);
        }
    }
}
