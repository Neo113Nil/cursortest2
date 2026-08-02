package androidx.core.transition;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Landroidx/core/transition/TransitionKt$addListener$listener$1;", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "transition", "", "onTransitionEnd", "(Landroid/transition/Transition;)V", "onTransitionResume", "onTransitionPause", "onTransitionCancel", "onTransitionStart"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes7.dex */
public final class TransitionKt$addListener$listener$1 implements android.transition.Transition.TransitionListener {
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ kotlin.jvm.functions.Function1<android.transition.Transition, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public TransitionKt$addListener$listener$1(kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function13, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function14, kotlin.jvm.functions.Function1<? super android.transition.Transition, kotlin.Unit> function15) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRangesFor = function12;
        this.getHighSpeedVideoFpsRanges = function13;
        this.Camera2StreamConfigurationMap = function14;
        this.getHighSpeedVideoSizes = function15;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(android.transition.Transition transition) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(android.transition.Transition transition) {
        this.getHighSpeedVideoFpsRangesFor.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(android.transition.Transition transition) {
        this.getHighSpeedVideoFpsRanges.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(android.transition.Transition transition) {
        this.Camera2StreamConfigurationMap.invoke(transition);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(android.transition.Transition transition) {
        this.getHighSpeedVideoSizes.invoke(transition);
    }
}
