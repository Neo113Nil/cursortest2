package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Landroidx/camera/camera2/pipe/InputRequest;", "", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "image", "Landroidx/camera/camera2/pipe/FrameInfo;", "frameInfo", "<init>", "(Landroidx/camera/camera2/pipe/media/ImageWrapper;Landroidx/camera/camera2/pipe/FrameInfo;)V", "component1", "()Landroidx/camera/camera2/pipe/media/ImageWrapper;", "component2", "()Landroidx/camera/camera2/pipe/FrameInfo;", "copy", "(Landroidx/camera/camera2/pipe/media/ImageWrapper;Landroidx/camera/camera2/pipe/FrameInfo;)Landroidx/camera/camera2/pipe/InputRequest;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "getImage", "Landroidx/camera/camera2/pipe/FrameInfo;", "getFrameInfo"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class InputRequest {
    private final androidx.camera.camera2.pipe.FrameInfo frameInfo;
    private final androidx.camera.camera2.pipe.media.ImageWrapper image;

    public InputRequest(androidx.camera.camera2.pipe.media.ImageWrapper imageWrapper, androidx.camera.camera2.pipe.FrameInfo frameInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
        this.image = imageWrapper;
        this.frameInfo = frameInfo;
    }

    public final androidx.camera.camera2.pipe.FrameInfo getFrameInfo() {
        return this.frameInfo;
    }

    public final androidx.camera.camera2.pipe.media.ImageWrapper getImage() {
        return this.image;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("InputRequest(image=");
        sb.append(this.image);
        sb.append(", frameInfo=");
        sb.append(this.frameInfo);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        return (this.image.hashCode() * 31) + this.frameInfo.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.camera.camera2.pipe.InputRequest)) {
            return false;
        }
        androidx.camera.camera2.pipe.InputRequest inputRequest = (androidx.camera.camera2.pipe.InputRequest) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.image, inputRequest.image) && kotlin.jvm.internal.Intrinsics.areEqual(this.frameInfo, inputRequest.frameInfo);
    }

    public final androidx.camera.camera2.pipe.InputRequest copy(androidx.camera.camera2.pipe.media.ImageWrapper image, androidx.camera.camera2.pipe.FrameInfo frameInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameInfo, "");
        return new androidx.camera.camera2.pipe.InputRequest(image, frameInfo);
    }

    /* renamed from: component2, reason: from getter */
    public final androidx.camera.camera2.pipe.FrameInfo getFrameInfo() {
        return this.frameInfo;
    }

    /* renamed from: component1, reason: from getter */
    public final androidx.camera.camera2.pipe.media.ImageWrapper getImage() {
        return this.image;
    }

    public static /* synthetic */ androidx.camera.camera2.pipe.InputRequest copy$default(androidx.camera.camera2.pipe.InputRequest inputRequest, androidx.camera.camera2.pipe.media.ImageWrapper imageWrapper, androidx.camera.camera2.pipe.FrameInfo frameInfo, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            imageWrapper = inputRequest.image;
        }
        if ((i & 2) != 0) {
            frameInfo = inputRequest.frameInfo;
        }
        return inputRequest.copy(imageWrapper, frameInfo);
    }
}
