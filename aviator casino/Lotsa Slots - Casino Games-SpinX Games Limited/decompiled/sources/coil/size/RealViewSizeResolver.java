package coil.size;

/* compiled from: RealViewSizeResolver.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0016\u0010\u0004\u001a\u00028\u0000X\u0096\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcoil/size/RealViewSizeResolver;", "T", "Landroid/view/View;", "Lcoil/size/ViewSizeResolver;", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "subtractPadding", "", "<init>", "(Landroid/view/View;Z)V", "getView", "()Landroid/view/View;", "Landroid/view/View;", "getSubtractPadding", "()Z", "equals", "other", "", "hashCode", "", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RealViewSizeResolver<T extends android.view.View> implements coil.size.ViewSizeResolver<T> {
    private final boolean subtractPadding;
    private final T view;

    @Override // coil.size.ViewSizeResolver, coil.size.SizeResolver
    public /* synthetic */ java.lang.Object size(kotlin.coroutines.Continuation continuation) {
        return coil.size.ViewSizeResolver.CC.size$suspendImpl(this, continuation);
    }

    public RealViewSizeResolver(T t, boolean z) {
        this.view = t;
        this.subtractPadding = z;
    }

    @Override // coil.size.ViewSizeResolver
    public T getView() {
        return this.view;
    }

    @Override // coil.size.ViewSizeResolver
    public boolean getSubtractPadding() {
        return this.subtractPadding;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other instanceof coil.size.RealViewSizeResolver) {
            coil.size.RealViewSizeResolver realViewSizeResolver = (coil.size.RealViewSizeResolver) other;
            if (kotlin.jvm.internal.Intrinsics.areEqual(getView(), realViewSizeResolver.getView()) && getSubtractPadding() == realViewSizeResolver.getSubtractPadding()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (getView().hashCode() * 31) + kotlin.UByte$$ExternalSyntheticBackport0.m(getSubtractPadding());
    }
}
