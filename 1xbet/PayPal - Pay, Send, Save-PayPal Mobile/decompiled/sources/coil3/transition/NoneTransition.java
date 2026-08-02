package coil3.transition;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0010B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/transition/NoneTransition;", "Lcoil3/transition/Transition;", "Lcoil3/transition/TransitionTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "<init>", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;)V", "", "transition", "()V", "Camera2StreamConfigurationMap", "Lcoil3/transition/TransitionTarget;", "getHighSpeedVideoSizes", "Lcoil3/request/ImageResult;", "getHighResolutionOutputSizeshNQ4ISI", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoneTransition implements coil3.transition.Transition {
    private final coil3.transition.TransitionTarget Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final coil3.view.ImageResult getHighResolutionOutputSizeshNQ4ISI;

    public NoneTransition(coil3.transition.TransitionTarget transitionTarget, coil3.view.ImageResult imageResult) {
        this.Camera2StreamConfigurationMap = transitionTarget;
        this.getHighResolutionOutputSizeshNQ4ISI = imageResult;
    }

    @Override // coil3.transition.Transition
    public final void transition() {
        coil3.view.ImageResult imageResult = this.getHighResolutionOutputSizeshNQ4ISI;
        if (imageResult instanceof coil3.view.SuccessResult) {
            this.Camera2StreamConfigurationMap.onSuccess(((coil3.view.SuccessResult) imageResult).getImage());
        } else {
            if (!(imageResult instanceof coil3.view.ErrorResult)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.Camera2StreamConfigurationMap.onError(((coil3.view.ErrorResult) imageResult).getImage());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcoil3/transition/NoneTransition$Factory;", "Lcoil3/transition/Transition$Factory;", "<init>", "()V", "Lcoil3/transition/TransitionTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "Lcoil3/transition/Transition;", "create", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;)Lcoil3/transition/Transition;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Factory implements coil3.transition.Transition.Factory {
        @Override // coil3.transition.Transition.Factory
        public final coil3.transition.Transition create(coil3.transition.TransitionTarget target, coil3.view.ImageResult result) {
            return new coil3.transition.NoneTransition(target, result);
        }
    }
}
