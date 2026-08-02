package androidx.fragment.app;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController$AnimationEffect$onCommit$1;", "Landroid/view/animation/Animation$AnimationListener;", "Landroid/view/animation/Animation;", "animation", "", "onAnimationEnd", "(Landroid/view/animation/Animation;)V", "onAnimationRepeat", "onAnimationStart"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultSpecialEffectsController$AnimationEffect$onCommit$1 implements android.view.animation.Animation.AnimationListener {
    final /* synthetic */ android.view.View Camera2StreamConfigurationMap;
    final /* synthetic */ androidx.fragment.app.SpecialEffectsController.Operation getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.view.ViewGroup getHighSpeedVideoSizes;

    DefaultSpecialEffectsController$AnimationEffect$onCommit$1(androidx.fragment.app.SpecialEffectsController.Operation operation, android.view.ViewGroup viewGroup, android.view.View view, androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect animationEffect) {
        this.getHighResolutionOutputSizeshNQ4ISI = operation;
        this.getHighSpeedVideoSizes = viewGroup;
        this.Camera2StreamConfigurationMap = view;
        this.getHighSpeedVideoFpsRangesFor = animationEffect;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(android.view.animation.Animation animation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "");
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(android.view.animation.Animation animation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "");
        final android.view.ViewGroup viewGroup = this.getHighSpeedVideoSizes;
        final android.view.View view = this.Camera2StreamConfigurationMap;
        final androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect animationEffect = this.getHighSpeedVideoFpsRangesFor;
        viewGroup.post(new java.lang.Runnable() { // from class: androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.fragment.app.DefaultSpecialEffectsController$AnimationEffect$onCommit$1.m9150$r8$lambda$6fa8Ib9UodOeQPVWaNv8aZmow0(viewGroup, view, animationEffect);
            }
        });
        androidx.fragment.app.FragmentManager.isLoggingEnabled(2);
    }

    /* renamed from: $r8$lambda$6fa8Ib9U-odOeQPVWaNv8aZmow0, reason: not valid java name */
    public static /* synthetic */ void m9150$r8$lambda$6fa8Ib9UodOeQPVWaNv8aZmow0(android.view.ViewGroup viewGroup, android.view.View view, androidx.fragment.app.DefaultSpecialEffectsController.AnimationEffect animationEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewGroup, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animationEffect, "");
        viewGroup.endViewTransition(view);
        animationEffect.getGetHighSpeedVideoSizes().getOperation().completeEffect(animationEffect);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(android.view.animation.Animation animation) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animation, "");
    }
}
