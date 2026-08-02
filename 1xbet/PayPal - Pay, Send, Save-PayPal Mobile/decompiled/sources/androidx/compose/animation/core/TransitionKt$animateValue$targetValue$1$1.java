package androidx.compose.animation.core;

/* JADX INFO: Add missing generic type declarations: [S] */
@kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 176)
/* loaded from: classes.dex */
public final class TransitionKt$animateValue$targetValue$1$1<S> implements kotlin.jvm.functions.Function0<S> {
    final /* synthetic */ androidx.compose.animation.core.Transition<S> getHighSpeedVideoSizes;

    @Override // kotlin.jvm.functions.Function0
    public final S invoke() {
        return this.getHighSpeedVideoSizes.getTargetState();
    }

    public TransitionKt$animateValue$targetValue$1$1(androidx.compose.animation.core.Transition<S> transition) {
        this.getHighSpeedVideoSizes = transition;
    }
}
