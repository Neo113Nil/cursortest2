package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001b*\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010&\u001a\u0004\b-\u0010.R\u001a\u0010/\u001a\u00020+8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b/\u0010&\u001a\u0004\b0\u0010."}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidImageWriter;", "Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "Landroid/media/ImageWriter$OnImageReleasedListener;", "Landroid/media/ImageWriter;", "p0", "Landroidx/camera/camera2/pipe/InputStreamId;", "p1", "<init>", "(Landroid/media/ImageWriter;I)V", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "image", "", "queueInputImage", "(Landroidx/camera/camera2/pipe/media/ImageWrapper;)Z", "dequeueInputImage", "()Landroidx/camera/camera2/pipe/media/ImageWrapper;", "Landroidx/camera/camera2/pipe/media/ImageWriterWrapper$OnImageReleasedListener;", "onImageReleasedListener", "", "setOnImageReleasedListener", "(Landroidx/camera/camera2/pipe/media/ImageWriterWrapper$OnImageReleasedListener;)V", "writer", "onImageReleased", "(Landroid/media/ImageWriter;)V", "close", "()V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroid/media/ImageWriter;", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Lkotlinx/atomicfu/AtomicRef;", "getHighSpeedVideoFpsRanges", "Lkotlinx/atomicfu/AtomicRef;", "", "maxImages", "getMaxImages", "()I", "format", "getFormat", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidImageWriter implements androidx.camera.camera2.pipe.media.ImageWriterWrapper, android.media.ImageWriter.OnImageReleasedListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.media.AndroidImageWriter.Companion INSTANCE = new androidx.camera.camera2.pipe.media.AndroidImageWriter.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final int format;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef<androidx.camera.camera2.pipe.media.ImageWriterWrapper.OnImageReleasedListener> Camera2StreamConfigurationMap;
    private final android.media.ImageWriter getHighSpeedVideoFpsRangesFor;
    private final int maxImages;

    private AndroidImageWriter(android.media.ImageWriter imageWriter, int i) {
        this.getHighSpeedVideoFpsRangesFor = imageWriter;
        this.getHighSpeedVideoSizes = i;
        this.Camera2StreamConfigurationMap = kotlinx.atomicfu.AtomicFU.atomic((java.lang.Object) null);
        this.maxImages = imageWriter.getMaxImages();
        this.format = imageWriter.getFormat();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public final int getMaxImages() {
        return this.maxImages;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public final int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public final boolean queueInputImage(androidx.camera.camera2.pipe.media.ImageWrapper image) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        try {
            android.media.Image image2 = (android.media.Image) image.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.media.Image.class));
            if (image2 != null) {
                this.getHighSpeedVideoFpsRangesFor.queueInputImage(image2);
                return true;
            }
            androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            return false;
        } catch (java.lang.Throwable th) {
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                th.getMessage();
            }
            image.close();
            return false;
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public final androidx.camera.camera2.pipe.media.ImageWrapper dequeueInputImage() {
        android.media.Image dequeueInputImage = this.getHighSpeedVideoFpsRangesFor.dequeueInputImage();
        kotlin.jvm.internal.Intrinsics.checkNotNull(dequeueInputImage);
        return new androidx.camera.camera2.pipe.media.AndroidImage(dequeueInputImage);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWriterWrapper
    public final void setOnImageReleasedListener(androidx.camera.camera2.pipe.media.ImageWriterWrapper.OnImageReleasedListener onImageReleasedListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onImageReleasedListener, "");
        this.Camera2StreamConfigurationMap.setValue(onImageReleasedListener);
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(android.media.ImageWriter writer) {
        androidx.camera.camera2.pipe.media.ImageWriterWrapper.OnImageReleasedListener value = this.Camera2StreamConfigurationMap.getValue();
        if (value != null) {
            value.m1003onImageReleasedI45lehc(this.getHighSpeedVideoSizes);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighSpeedVideoFpsRangesFor.close();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.media.ImageWriter.class))) {
            return (T) this.getHighSpeedVideoFpsRangesFor;
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ImageWriter-");
        sb.append(androidx.camera.camera2.pipe.StreamFormat.m714getNameimpl(androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(this.getHighSpeedVideoFpsRangesFor.getFormat())));
        sb.append('-');
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.InputStreamId.m522toStringimpl(this.getHighSpeedVideoSizes));
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidImageWriter$Companion;", "", "<init>", "()V", "Landroid/view/Surface;", "surface", "Landroidx/camera/camera2/pipe/InputStreamId;", "inputStreamId", "", "maxImages", "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroid/os/Handler;", "handler", "Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "create-U86x6Zg", "(Landroid/view/Surface;IILandroidx/camera/camera2/pipe/StreamFormat;Landroid/os/Handler;)Landroidx/camera/camera2/pipe/media/ImageWriterWrapper;", "create"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: create-U86x6Zg, reason: not valid java name */
        public final androidx.camera.camera2.pipe.media.ImageWriterWrapper m995createU86x6Zg(android.view.Surface surface, int inputStreamId, int maxImages, androidx.camera.camera2.pipe.StreamFormat format, android.os.Handler handler) {
            android.media.ImageWriter newInstance;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surface, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(handler, "");
            if (maxImages <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Max images (");
                sb.append(maxImages);
                sb.append(") must be > 0");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (maxImages > 54) {
                throw new java.lang.IllegalArgumentException("Max images for ImageWriters is restricted to 54 to prevent overloading downstream consumer components.".toString());
            }
            if (android.os.Build.VERSION.SDK_INT >= 29 && format != null) {
                newInstance = androidx.camera.camera2.pipe.compat.Api29Compat.imageWriterNewInstance(surface, maxImages, format.m717unboximpl());
            } else {
                if (format != null && androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    androidx.camera.camera2.pipe.StreamFormat.m716toStringimpl(format.m717unboximpl());
                    androidx.camera.camera2.pipe.InputStreamId.m522toStringimpl(inputStreamId);
                }
                newInstance = android.media.ImageWriter.newInstance(surface, maxImages);
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstance);
            }
            androidx.camera.camera2.pipe.media.AndroidImageWriter androidImageWriter = new androidx.camera.camera2.pipe.media.AndroidImageWriter(newInstance, inputStreamId, null);
            newInstance.setOnImageReleasedListener(androidImageWriter, handler);
            return androidImageWriter;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ AndroidImageWriter(android.media.ImageWriter imageWriter, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(imageWriter, i);
    }
}
