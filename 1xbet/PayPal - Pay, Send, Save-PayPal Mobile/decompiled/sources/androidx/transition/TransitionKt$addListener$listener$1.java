package androidx.transition;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Landroidx/transition/TransitionKt$addListener$listener$1;", "Landroidx/transition/Transition$TransitionListener;", "Landroidx/transition/Transition;", "transition", "", "onTransitionCancel", "(Landroidx/transition/Transition;)V", "onTransitionEnd", "onTransitionPause", "onTransitionResume", "onTransitionStart"}, k = 1, mv = {1, 8, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class TransitionKt$addListener$listener$1 implements androidx.transition.Transition.TransitionListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<androidx.transition.Transition, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super androidx.transition.Transition, kotlin.Unit> function15) {
        this.getHighSpeedVideoSizes = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.getHighSpeedVideoFpsRanges = function13;
        this.getHighResolutionOutputSizeshNQ4ISI = function14;
        this.Camera2StreamConfigurationMap = function15;
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionEnd(androidx.transition.Transition transition) {
        this.getHighSpeedVideoSizes.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionResume(androidx.transition.Transition transition) {
        this.getHighSpeedVideoFpsRangesFor.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionPause(androidx.transition.Transition transition) {
        this.getHighSpeedVideoFpsRanges.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionCancel(androidx.transition.Transition transition) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(transition);
    }

    @Override // androidx.transition.Transition.TransitionListener
    public final void onTransitionStart(androidx.transition.Transition transition) {
        this.Camera2StreamConfigurationMap.invoke(transition);
    }
}
