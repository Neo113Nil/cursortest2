package coil3.transition;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0019B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcoil3/transition/CrossfadeTransition;", "Lcoil3/transition/Transition;", "Lcoil3/transition/TransitionTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;IZ)V", "", "transition", "()V", "getHighSpeedVideoFpsRanges", "Lcoil3/transition/TransitionTarget;", "getHighResolutionOutputSizeshNQ4ISI", "Lcoil3/request/ImageResult;", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "()I", "Z", "getPreferExactIntrinsicSize", "()Z", "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CrossfadeTransition implements coil3.transition.Transition {
    private final int durationMillis;
    private final coil3.view.ImageResult getHighResolutionOutputSizeshNQ4ISI;
    private final coil3.transition.TransitionTarget getHighSpeedVideoFpsRanges;
    private final boolean preferExactIntrinsicSize;

    public CrossfadeTransition(coil3.transition.TransitionTarget transitionTarget, coil3.view.ImageResult imageResult, int i, boolean z) {
        this.getHighSpeedVideoFpsRanges = transitionTarget;
        this.getHighResolutionOutputSizeshNQ4ISI = imageResult;
        this.durationMillis = i;
        this.preferExactIntrinsicSize = z;
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
        }
    }

    public /* synthetic */ CrossfadeTransition(coil3.transition.TransitionTarget transitionTarget, coil3.view.ImageResult imageResult, int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(transitionTarget, imageResult, (i2 & 4) != 0 ? 200 : i, (i2 & 8) != 0 ? false : z);
    }

    public final int getDurationMillis() {
        return this.durationMillis;
    }

    public final boolean getPreferExactIntrinsicSize() {
        return this.preferExactIntrinsicSize;
    }

    @Override // coil3.transition.Transition
    public final void transition() {
        android.graphics.drawable.Drawable drawable = this.getHighSpeedVideoFpsRanges.getDrawable();
        coil3.Image image = this.getHighResolutionOutputSizeshNQ4ISI.getImage();
        android.graphics.drawable.Drawable asDrawable = image != null ? coil3.Image_androidKt.asDrawable(image, this.getHighSpeedVideoFpsRanges.getView().getResources()) : null;
        coil3.view.Scale scale = this.getHighResolutionOutputSizeshNQ4ISI.getRequest().getScale();
        int i = this.durationMillis;
        coil3.view.ImageResult imageResult = this.getHighResolutionOutputSizeshNQ4ISI;
        coil3.transition.CrossfadeDrawable crossfadeDrawable = new coil3.transition.CrossfadeDrawable(drawable, asDrawable, scale, i, ((imageResult instanceof coil3.view.SuccessResult) && ((coil3.view.SuccessResult) imageResult).getIsPlaceholderCached()) ? false : true, this.preferExactIntrinsicSize);
        coil3.view.ImageResult imageResult2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (imageResult2 instanceof coil3.view.SuccessResult) {
            this.getHighSpeedVideoFpsRanges.onSuccess(coil3.Image_androidKt.asImage(crossfadeDrawable));
        } else {
            if (!(imageResult2 instanceof coil3.view.ErrorResult)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            this.getHighSpeedVideoFpsRanges.onError(coil3.Image_androidKt.asImage(crossfadeDrawable));
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcoil3/transition/CrossfadeTransition$Factory;", "Lcoil3/transition/Transition$Factory;", "", "durationMillis", "", "preferExactIntrinsicSize", "<init>", "(IZ)V", "Lcoil3/transition/TransitionTarget;", androidx.constraintlayout.core.motion.utils.TypedValues.AttributesType.S_TARGET, "Lcoil3/request/ImageResult;", "result", "Lcoil3/transition/Transition;", "create", "(Lcoil3/transition/TransitionTarget;Lcoil3/request/ImageResult;)Lcoil3/transition/Transition;", com.visa.cbp.getEncExpo.warmup, "getDurationMillis", "()I", "Z", "getPreferExactIntrinsicSize", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Factory implements coil3.transition.Transition.Factory {
        private final int durationMillis;
        private final boolean preferExactIntrinsicSize;

        public Factory(int i, boolean z) {
            this.durationMillis = i;
            this.preferExactIntrinsicSize = z;
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("durationMillis must be > 0.".toString());
            }
        }

        public /* synthetic */ Factory(int i, boolean z, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 200 : i, (i2 & 2) != 0 ? false : z);
        }

        public final int getDurationMillis() {
            return this.durationMillis;
        }

        public final boolean getPreferExactIntrinsicSize() {
            return this.preferExactIntrinsicSize;
        }

        @Override // coil3.transition.Transition.Factory
        public final coil3.transition.Transition create(coil3.transition.TransitionTarget target, coil3.view.ImageResult result) {
            if (!(result instanceof coil3.view.SuccessResult)) {
                return coil3.transition.Transition.Factory.NONE.create(target, result);
            }
            if (((coil3.view.SuccessResult) result).getDataSource() == coil3.graphics.DataSource.MEMORY_CACHE) {
                return coil3.transition.Transition.Factory.NONE.create(target, result);
            }
            return new coil3.transition.CrossfadeTransition(target, result, this.durationMillis, this.preferExactIntrinsicSize);
        }

        public Factory(int i) {
            this(i, false, 2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Factory() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }
    }

    public CrossfadeTransition(coil3.transition.TransitionTarget transitionTarget, coil3.view.ImageResult imageResult, int i) {
        this(transitionTarget, imageResult, i, false, 8, null);
    }

    public CrossfadeTransition(coil3.transition.TransitionTarget transitionTarget, coil3.view.ImageResult imageResult) {
        this(transitionTarget, imageResult, 0, false, 12, null);
    }
}
