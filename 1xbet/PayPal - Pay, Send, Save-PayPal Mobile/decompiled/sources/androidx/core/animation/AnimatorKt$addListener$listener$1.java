package androidx.core.animation;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006"}, d2 = {"Landroidx/core/animation/AnimatorKt$addListener$listener$1;", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "animator", "", "onAnimationRepeat", "(Landroid/animation/Animator;)V", "onAnimationEnd", "onAnimationCancel", "onAnimationStart"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class AnimatorKt$addListener$listener$1 implements android.animation.Animator.AnimatorListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.animation.Animator, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public AnimatorKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super android.animation.Animator, kotlin.Unit> function14) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.getHighSpeedVideoSizes = function13;
        this.getHighResolutionOutputSizeshNQ4ISI = function14;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(android.animation.Animator animator) {
        this.getHighSpeedVideoFpsRangesFor.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        this.getHighSpeedVideoFpsRanges.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        this.getHighSpeedVideoSizes.invoke(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(animator);
    }
}
