package coil3.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\b"}, d2 = {"Lcoil3/size/Size;", "", "Lcoil3/size/Dimension;", "width", "height", "<init>", "(Lcoil3/size/Dimension;Lcoil3/size/Dimension;)V", "component1", "()Lcoil3/size/Dimension;", "component2", "copy", "(Lcoil3/size/Dimension;Lcoil3/size/Dimension;)Lcoil3/size/Size;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcoil3/size/Dimension;", "getWidth", "getHeight", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class Size {
    public static final coil3.view.Size ORIGINAL = new coil3.view.Size(coil3.size.Dimension.Undefined.INSTANCE, coil3.size.Dimension.Undefined.INSTANCE);
    private final coil3.view.Dimension height;
    private final coil3.view.Dimension width;

    public Size(coil3.view.Dimension dimension, coil3.view.Dimension dimension2) {
        this.width = dimension;
        this.height = dimension2;
    }

    public final coil3.view.Dimension getWidth() {
        return this.width;
    }

    public final coil3.view.Dimension getHeight() {
        return this.height;
    }

    public final java.lang.String toString() {
        coil3.view.Dimension dimension = this.width;
        coil3.view.Dimension dimension2 = this.height;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Size(width=");
        sb.append(dimension);
        sb.append(", height=");
        sb.append(dimension2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.width.hashCode() * 31) + this.height.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.view.Size)) {
            return false;
        }
        coil3.view.Size size = (coil3.view.Size) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.width, size.width) && kotlin.jvm.internal.Intrinsics.areEqual(this.height, size.height);
    }

    public final coil3.view.Size copy(coil3.view.Dimension width, coil3.view.Dimension height) {
        return new coil3.view.Size(width, height);
    }

    /* renamed from: component2, reason: from getter */
    public final coil3.view.Dimension getHeight() {
        return this.height;
    }

    /* renamed from: component1, reason: from getter */
    public final coil3.view.Dimension getWidth() {
        return this.width;
    }

    public static /* synthetic */ coil3.view.Size copy$default(coil3.view.Size size, coil3.view.Dimension dimension, coil3.view.Dimension dimension2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            dimension = size.width;
        }
        if ((i & 2) != 0) {
            dimension2 = size.height;
        }
        return size.copy(dimension, dimension2);
    }
}
