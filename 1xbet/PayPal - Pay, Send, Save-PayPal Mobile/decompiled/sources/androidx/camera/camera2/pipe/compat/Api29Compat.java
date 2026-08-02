package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/compat/Api29Compat;", "", "<init>", "()V", "", "width", "height", "format", "capacity", "", "usage", "Landroid/media/ImageReader;", "imageReaderNewInstance", "(IIIIJ)Landroid/media/ImageReader;", "Landroid/view/Surface;", "surface", "maxImages", "Landroid/media/ImageWriter;", "imageWriterNewInstance", "(Landroid/view/Surface;II)Landroid/media/ImageWriter;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Api29Compat {
    public static final androidx.camera.camera2.pipe.compat.Api29Compat INSTANCE = new androidx.camera.camera2.pipe.compat.Api29Compat();

    private Api29Compat() {
    }

    @kotlin.jvm.JvmStatic
    public static final android.media.ImageReader imageReaderNewInstance(int width, int height, int format, int capacity, long usage) {
        android.media.ImageReader newInstance = android.media.ImageReader.newInstance(width, height, format, capacity, usage);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }

    @kotlin.jvm.JvmStatic
    public static final android.media.ImageWriter imageWriterNewInstance(android.view.Surface surface, int maxImages, int format) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
        android.media.ImageWriter newInstance = android.media.ImageWriter.newInstance(surface, maxImages, format);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newInstance, "");
        return newInstance;
    }
}
