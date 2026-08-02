package coil3.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcoil3/request/ErrorResult;", "Lcoil3/request/ImageResult;", "Lcoil3/Image;", "image", "Lcoil3/request/ImageRequest;", "request", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "<init>", "(Lcoil3/Image;Lcoil3/request/ImageRequest;Ljava/lang/Throwable;)V", "copy", "(Lcoil3/Image;Lcoil3/request/ImageRequest;Ljava/lang/Throwable;)Lcoil3/request/ErrorResult;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcoil3/Image;", "getImage", "()Lcoil3/Image;", "Lcoil3/request/ImageRequest;", "getRequest", "()Lcoil3/request/ImageRequest;", "Ljava/lang/Throwable;", "getThrowable", "()Ljava/lang/Throwable;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ErrorResult implements coil3.view.ImageResult {
    private final coil3.Image image;
    private final coil3.view.ImageRequest request;
    private final java.lang.Throwable throwable;

    public ErrorResult(coil3.Image image, coil3.view.ImageRequest imageRequest, java.lang.Throwable th) {
        this.image = image;
        this.request = imageRequest;
        this.throwable = th;
    }

    @Override // coil3.view.ImageResult
    public final coil3.Image getImage() {
        return this.image;
    }

    @Override // coil3.view.ImageResult
    public final coil3.view.ImageRequest getRequest() {
        return this.request;
    }

    public final java.lang.Throwable getThrowable() {
        return this.throwable;
    }

    public static /* synthetic */ coil3.view.ErrorResult copy$default(coil3.view.ErrorResult errorResult, coil3.Image image, coil3.view.ImageRequest imageRequest, java.lang.Throwable th, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            image = errorResult.getImage();
        }
        if ((i & 2) != 0) {
            imageRequest = errorResult.getRequest();
        }
        if ((i & 4) != 0) {
            th = errorResult.throwable;
        }
        return errorResult.copy(image, imageRequest, th);
    }

    public final coil3.view.ErrorResult copy(coil3.Image image, coil3.view.ImageRequest request, java.lang.Throwable throwable) {
        return new coil3.view.ErrorResult(image, request, throwable);
    }

    public final java.lang.String toString() {
        coil3.Image image = this.image;
        coil3.view.ImageRequest imageRequest = this.request;
        java.lang.Throwable th = this.throwable;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ErrorResult(image=");
        sb.append(image);
        sb.append(", request=");
        sb.append(imageRequest);
        sb.append(", throwable=");
        sb.append(th);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        coil3.Image image = this.image;
        return ((((image == null ? 0 : image.hashCode()) * 31) + this.request.hashCode()) * 31) + this.throwable.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof coil3.view.ErrorResult)) {
            return false;
        }
        coil3.view.ErrorResult errorResult = (coil3.view.ErrorResult) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, errorResult.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.request, errorResult.request) && kotlin.jvm.internal.Intrinsics.areEqual(this.throwable, errorResult.throwable);
    }
}
