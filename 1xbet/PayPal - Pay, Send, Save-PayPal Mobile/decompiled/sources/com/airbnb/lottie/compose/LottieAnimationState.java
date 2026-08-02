package com.airbnb.lottie.compose;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\f\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00038'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078'X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0018\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\rR\u0014\u0010\u001f\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aR\u0014\u0010!\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationState;", "Landroidx/compose/runtime/State;", "", "Lcom/airbnb/lottie/compose/LottieClipSpec;", "getClipSpec", "()Lcom/airbnb/lottie/compose/LottieClipSpec;", "clipSpec", "Lcom/airbnb/lottie/LottieComposition;", "getComposition", "()Lcom/airbnb/lottie/LottieComposition;", "composition", "", "isAtEnd", "()Z", "isPlaying", "", "getIteration", "()I", "iteration", "getIterations", "iterations", "", "getLastFrameNanos", "()J", "lastFrameNanos", "getProgress", "()F", "progress", "getReverseOnRepeat", "reverseOnRepeat", "getSpeed", "speed", "getUseCompositionFrameRate", "useCompositionFrameRate"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface LottieAnimationState extends androidx.compose.runtime.State<java.lang.Float> {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static long getLastFrameNanos(com.airbnb.lottie.compose.LottieAnimationState lottieAnimationState) {
            return Long.MIN_VALUE;
        }
    }

    com.airbnb.lottie.compose.LottieClipSpec getClipSpec();

    com.airbnb.lottie.LottieComposition getComposition();

    int getIteration();

    int getIterations();

    long getLastFrameNanos();

    float getProgress();

    boolean getReverseOnRepeat();

    float getSpeed();

    boolean getUseCompositionFrameRate();

    boolean isAtEnd();

    boolean isPlaying();
}
