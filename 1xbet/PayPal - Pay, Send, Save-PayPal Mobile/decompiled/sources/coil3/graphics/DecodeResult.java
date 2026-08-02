package coil3.graphics;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0005\u0010\u0015"}, d2 = {"Lcoil3/decode/DecodeResult;", "", "Lcoil3/Image;", "image", "", "isSampled", "<init>", "(Lcoil3/Image;Z)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcoil3/Image;", "getImage", "()Lcoil3/Image;", "Z", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DecodeResult {
    private final coil3.Image image;
    private final boolean isSampled;

    public DecodeResult(coil3.Image image, boolean z) {
        this.image = image;
        this.isSampled = z;
    }

    public final coil3.Image getImage() {
        return this.image;
    }

    /* renamed from: isSampled, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public final java.lang.String toString() {
        coil3.Image image = this.image;
        boolean z = this.isSampled;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DecodeResult(image=");
        sb.append(image);
        sb.append(", isSampled=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (this.image.hashCode() * 31) + java.lang.Boolean.hashCode(this.isSampled);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.graphics.DecodeResult)) {
            return false;
        }
        coil3.graphics.DecodeResult decodeResult = (coil3.graphics.DecodeResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, decodeResult.image) && this.isSampled == decodeResult.isSampled;
    }
}
