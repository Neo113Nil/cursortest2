package coil3.target;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000b\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\bH\u0004¢\u0006\u0004\b\u0016\u0010\fJ\u000f\u0010\u0017\u001a\u00020\nH\u0004¢\u0006\u0004\b\u0017\u0010\u0007R\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8'@'X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 "}, d2 = {"Lcoil3/target/GenericViewTarget;", "Landroid/view/View;", "T", "Lcoil3/target/ViewTarget;", "Lcoil3/transition/TransitionTarget;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "Lcoil3/Image;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "", "onStart", "(Lcoil3/Image;)V", "error", "onError", "result", "onSuccess", "Landroidx/lifecycle/LifecycleOwner;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Owner, "(Landroidx/lifecycle/LifecycleOwner;)V", "onStop", "image", "updateImage", "updateAnimation", "", "Camera2StreamConfigurationMap", "Z", "getHighSpeedVideoFpsRanges", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class GenericViewTarget<T extends android.view.View> implements coil3.target.ViewTarget<T>, coil3.transition.TransitionTarget, androidx.view.DefaultLifecycleObserver {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRanges;

    @Override // coil3.transition.TransitionTarget
    public abstract android.graphics.drawable.Drawable getDrawable();

    public abstract void setDrawable(android.graphics.drawable.Drawable drawable);

    @Override // coil3.target.Target
    public void onStart(coil3.Image placeholder) {
        updateImage(placeholder);
    }

    @Override // coil3.target.Target
    public void onError(coil3.Image error) {
        updateImage(error);
    }

    @Override // coil3.target.Target
    public void onSuccess(coil3.Image result) {
        updateImage(result);
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onStart(androidx.view.LifecycleOwner owner) {
        this.getHighSpeedVideoFpsRanges = true;
        updateAnimation();
    }

    @Override // androidx.view.DefaultLifecycleObserver
    public void onStop(androidx.view.LifecycleOwner owner) {
        this.getHighSpeedVideoFpsRanges = false;
        updateAnimation();
    }

    protected final void updateImage(coil3.Image image) {
        android.graphics.drawable.Drawable asDrawable = image != null ? coil3.Image_androidKt.asDrawable(image, getView().getResources()) : null;
        java.lang.Object drawable = getDrawable();
        android.graphics.drawable.Animatable animatable = drawable instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(asDrawable);
        updateAnimation();
    }

    protected final void updateAnimation() {
        java.lang.Object drawable = getDrawable();
        android.graphics.drawable.Animatable animatable = drawable instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.getHighSpeedVideoFpsRanges) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }
}
