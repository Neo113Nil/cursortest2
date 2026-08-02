package coil3.target;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R(\u0010\u001a\u001a\u0004\u0018\u00010\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00148W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcoil3/target/ImageViewTarget;", "Lcoil3/target/GenericViewTarget;", "Landroid/widget/ImageView;", "view", "<init>", "(Landroid/widget/ImageView;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/widget/ImageView;", "getView", "()Landroid/widget/ImageView;", "Landroid/graphics/drawable/Drawable;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "getDrawable", "()Landroid/graphics/drawable/Drawable;", "setDrawable", "(Landroid/graphics/drawable/Drawable;)V", "drawable"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class ImageViewTarget extends coil3.target.GenericViewTarget<android.widget.ImageView> {
    private final android.widget.ImageView view;

    public ImageViewTarget(android.widget.ImageView imageView) {
        this.view = imageView;
    }

    @Override // coil3.target.ViewTarget, coil3.transition.TransitionTarget
    public android.widget.ImageView getView() {
        return this.view;
    }

    @Override // coil3.target.GenericViewTarget, coil3.transition.TransitionTarget
    public android.graphics.drawable.Drawable getDrawable() {
        return getView().getDrawable();
    }

    @Override // coil3.target.GenericViewTarget
    public void setDrawable(android.graphics.drawable.Drawable drawable) {
        getView().setImageDrawable(drawable);
    }

    public java.lang.String toString() {
        android.widget.ImageView imageView = this.view;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageViewTarget(view=");
        sb.append(imageView);
        sb.append(")");
        return sb.toString();
    }

    public int hashCode() {
        return this.view.hashCode();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof coil3.target.ImageViewTarget) && kotlin.jvm.internal.Intrinsics.areEqual(this.view, ((coil3.target.ImageViewTarget) other).view);
    }
}
