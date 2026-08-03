package coil.target;

/* compiled from: GenericViewTarget.kt */
@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0013\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u001a\u001a\u00020\u00112\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0004J\b\u0010\u001b\u001a\u00020\u0011H\u0004R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000bX¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcoil/target/GenericViewTarget;", "T", "Landroid/view/View;", "Lcoil/target/ViewTarget;", "Lcoil/transition/TransitionTarget;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "<init>", "()V", "isStarted", "", "drawable", "Landroid/graphics/drawable/Drawable;", "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "onStart", "", "placeholder", "onError", "error", "onSuccess", "result", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStop", "updateDrawable", "updateAnimation", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class GenericViewTarget<T extends android.view.View> implements coil.target.ViewTarget<T>, coil.transition.TransitionTarget, androidx.lifecycle.DefaultLifecycleObserver {
    private boolean isStarted;

    @Override // coil.transition.TransitionTarget
    public abstract android.graphics.drawable.Drawable getDrawable();

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onCreate(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onDestroy(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onPause(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* synthetic */ void onResume(androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "owner");
    }

    public abstract void setDrawable(android.graphics.drawable.Drawable drawable);

    @Override // coil.target.Target
    public void onStart(android.graphics.drawable.Drawable placeholder) {
        updateDrawable(placeholder);
    }

    @Override // coil.target.Target
    public void onError(android.graphics.drawable.Drawable error) {
        updateDrawable(error);
    }

    @Override // coil.target.Target
    public void onSuccess(android.graphics.drawable.Drawable result) {
        updateDrawable(result);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.lifecycle.LifecycleOwner owner) {
        this.isStarted = true;
        updateAnimation();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.lifecycle.LifecycleOwner owner) {
        this.isStarted = false;
        updateAnimation();
    }

    protected final void updateDrawable(android.graphics.drawable.Drawable drawable) {
        java.lang.Object drawable2 = getDrawable();
        android.graphics.drawable.Animatable animatable = drawable2 instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable2 : null;
        if (animatable != null) {
            animatable.stop();
        }
        setDrawable(drawable);
        updateAnimation();
    }

    protected final void updateAnimation() {
        java.lang.Object drawable = getDrawable();
        android.graphics.drawable.Animatable animatable = drawable instanceof android.graphics.drawable.Animatable ? (android.graphics.drawable.Animatable) drawable : null;
        if (animatable == null) {
            return;
        }
        if (this.isStarted) {
            animatable.start();
        } else {
            animatable.stop();
        }
    }
}
