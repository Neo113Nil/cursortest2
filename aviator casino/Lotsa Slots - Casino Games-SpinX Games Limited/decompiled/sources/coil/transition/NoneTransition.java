package coil.transition;

/* compiled from: NoneTransition.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcoil/transition/NoneTransition;", "Lcoil/transition/Transition;", "target", "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "<init>", "(Lcoil/transition/TransitionTarget;Lcoil/request/ImageResult;)V", "transition", "", "Factory", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NoneTransition implements coil.transition.Transition {
    private final coil.request.ImageResult result;
    private final coil.transition.TransitionTarget target;

    public NoneTransition(coil.transition.TransitionTarget transitionTarget, coil.request.ImageResult imageResult) {
        this.target = transitionTarget;
        this.result = imageResult;
    }

    @Override // coil.transition.Transition
    public void transition() {
        coil.request.ImageResult imageResult = this.result;
        if (imageResult instanceof coil.request.SuccessResult) {
            this.target.onSuccess(((coil.request.SuccessResult) imageResult).getDrawable());
        } else {
            if (!(imageResult instanceof coil.request.ErrorResult)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.target.onError(((coil.request.ErrorResult) imageResult).getDrawable());
        }
    }

    /* compiled from: NoneTransition.kt */
    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0096\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcoil/transition/NoneTransition$Factory;", "Lcoil/transition/Transition$Factory;", "<init>", "()V", "create", "Lcoil/transition/Transition;", "target", "Lcoil/transition/TransitionTarget;", "result", "Lcoil/request/ImageResult;", "equals", "", "other", "", "hashCode", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Factory implements coil.transition.Transition.Factory {
        @Override // coil.transition.Transition.Factory
        public coil.transition.Transition create(coil.transition.TransitionTarget target, coil.request.ImageResult result) {
            return new coil.transition.NoneTransition(target, result);
        }

        public boolean equals(java.lang.Object other) {
            return other instanceof coil.transition.NoneTransition.Factory;
        }

        public int hashCode() {
            return getClass().hashCode();
        }
    }
}
