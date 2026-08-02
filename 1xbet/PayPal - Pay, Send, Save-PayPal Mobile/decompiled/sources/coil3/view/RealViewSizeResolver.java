package coil3.view;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00008\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcoil3/size/RealViewSizeResolver;", "Landroid/view/View;", "T", "Lcoil3/size/ViewSizeResolver;", "view", "", "subtractPadding", "<init>", "(Landroid/view/View;Z)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "Z", "getSubtractPadding", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RealViewSizeResolver<T extends android.view.View> implements coil3.view.ViewSizeResolver<T> {
    private final boolean subtractPadding;
    private final T view;

    public RealViewSizeResolver(T t, boolean z) {
        this.view = t;
        this.subtractPadding = z;
    }

    @Override // coil3.view.ViewSizeResolver
    public final T getView() {
        return this.view;
    }

    @Override // coil3.view.ViewSizeResolver
    public final boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public final java.lang.String toString() {
        T t = this.view;
        boolean z = this.subtractPadding;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RealViewSizeResolver(view=");
        sb.append(t);
        sb.append(", subtractPadding=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.view.hashCode() * 31) + java.lang.Boolean.hashCode(this.subtractPadding);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.view.RealViewSizeResolver)) {
            return false;
        }
        coil3.view.RealViewSizeResolver realViewSizeResolver = (coil3.view.RealViewSizeResolver) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.view, realViewSizeResolver.view) && this.subtractPadding == realViewSizeResolver.subtractPadding;
    }
}
