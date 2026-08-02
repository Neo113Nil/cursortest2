package coil3.fetch;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcoil3/fetch/ImageFetchResult;", "Lcoil3/fetch/FetchResult;", "Lcoil3/Image;", "image", "", "isSampled", "Lcoil3/decode/DataSource;", "dataSource", "<init>", "(Lcoil3/Image;ZLcoil3/decode/DataSource;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcoil3/Image;", "getImage", "()Lcoil3/Image;", "Z", "()Z", "Lcoil3/decode/DataSource;", "getDataSource", "()Lcoil3/decode/DataSource;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImageFetchResult implements coil3.fetch.FetchResult {
    private final coil3.graphics.DataSource dataSource;
    private final coil3.Image image;
    private final boolean isSampled;

    public ImageFetchResult(coil3.Image image, boolean z, coil3.graphics.DataSource dataSource) {
        this.image = image;
        this.isSampled = z;
        this.dataSource = dataSource;
    }

    public final coil3.Image getImage() {
        return this.image;
    }

    /* renamed from: isSampled, reason: from getter */
    public final boolean getIsSampled() {
        return this.isSampled;
    }

    public final coil3.graphics.DataSource getDataSource() {
        return this.dataSource;
    }

    public final java.lang.String toString() {
        coil3.Image image = this.image;
        boolean z = this.isSampled;
        coil3.graphics.DataSource dataSource = this.dataSource;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageFetchResult(image=");
        sb.append(image);
        sb.append(", isSampled=");
        sb.append(z);
        sb.append(", dataSource=");
        sb.append(dataSource);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.image.hashCode() * 31) + java.lang.Boolean.hashCode(this.isSampled)) * 31) + this.dataSource.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.fetch.ImageFetchResult)) {
            return false;
        }
        coil3.fetch.ImageFetchResult imageFetchResult = (coil3.fetch.ImageFetchResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, imageFetchResult.image) && this.isSampled == imageFetchResult.isSampled && this.dataSource == imageFetchResult.dataSource;
    }
}
