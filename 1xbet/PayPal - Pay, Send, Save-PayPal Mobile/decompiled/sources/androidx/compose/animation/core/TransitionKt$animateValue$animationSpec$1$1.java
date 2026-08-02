package androidx.compose.animation.core;

/* JADX INFO: Add missing generic type declarations: [S] */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateValue$animationSpec$1$1<S> implements kotlin.jvm.functions.Function0<androidx.compose.animation.core.Transition.Segment<S>> {
    final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighSpeedVideoFpsRanges;

    @Override // kotlin.jvm.functions.Function0
    public final androidx.compose.animation.core.Transition.Segment<S> invoke() {
        return this.getHighSpeedVideoFpsRanges.getSegment();
    }

    public TransitionKt$animateValue$animationSpec$1$1(androidx.compose.animation.core.Transition<S> transition) {
        this.getHighSpeedVideoFpsRanges = transition;
    }
}
