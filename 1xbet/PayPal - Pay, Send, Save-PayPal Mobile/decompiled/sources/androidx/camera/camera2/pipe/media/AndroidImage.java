package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u00017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u00020\u001c8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 R\u001a\u0010#\u001a\u00020\u001c8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010 R\u001a\u0010&\u001a\u00020%8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R$\u00100\u001a\u00020*2\u0006\u0010+\u001a\u00020*8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0016\u00104\u001a\u0004\u0018\u0001018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u0010\u0015"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidImage;", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "Landroid/media/Image;", "image", "<init>", "(Landroid/media/Image;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "close", "()V", "", "Landroidx/camera/camera2/pipe/media/ImagePlane;", "Camera2StreamConfigurationMap", "()Ljava/util/List;", "Landroid/media/Image;", "getHighSpeedVideoSizes", "Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "", "format", com.visa.cbp.getEncExpo.warmup, "getFormat", "()I", "width", "getWidth", "height", "getHeight", "", "timestamp", "J", "getTimestamp", "()J", "Landroid/graphics/Rect;", "newRectValue", "getCropRect", "()Landroid/graphics/Rect;", "setCropRect", "(Landroid/graphics/Rect;)V", "cropRect", "Landroid/hardware/HardwareBuffer;", "getHardwareBuffer", "()Landroid/hardware/HardwareBuffer;", "hardwareBuffer", "getPlanes", "planes", "Plane"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidImage implements androidx.camera.camera2.pipe.media.ImageWrapper {
    private final android.media.Image Camera2StreamConfigurationMap;
    private final int format;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile java.util.List<? extends androidx.camera.camera2.pipe.media.ImagePlane> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.Object getHighSpeedVideoSizes;
    private final int height;
    private final long timestamp;
    private final int width;

    public AndroidImage(android.media.Image image) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
        this.Camera2StreamConfigurationMap = image;
        this.getHighSpeedVideoSizes = new java.lang.Object();
        this.format = image.getFormat();
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.timestamp = image.getTimestamp();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\n\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0007*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00158\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidImage$Plane;", "Landroidx/camera/camera2/pipe/media/ImagePlane;", "Landroid/media/Image$Plane;", "imagePlane", "<init>", "(Landroid/media/Image$Plane;)V", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "getHighSpeedVideoFpsRangesFor", "Landroid/media/Image$Plane;", "", "pixelStride", com.visa.cbp.getEncExpo.warmup, "getPixelStride", "()I", "rowStride", "getRowStride", "Ljava/nio/ByteBuffer;", "buffer", "Ljava/nio/ByteBuffer;", "getBuffer", "()Ljava/nio/ByteBuffer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Plane implements androidx.camera.camera2.pipe.media.ImagePlane {
        private final java.nio.ByteBuffer buffer;
        private final android.media.Image.Plane getHighSpeedVideoFpsRangesFor;
        private final int pixelStride;
        private final int rowStride;

        public Plane(android.media.Image.Plane plane) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(plane, "");
            this.getHighSpeedVideoFpsRangesFor = plane;
            this.pixelStride = plane.getPixelStride();
            this.rowStride = plane.getRowStride();
            java.nio.ByteBuffer buffer = plane.getBuffer();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(buffer, "");
            this.buffer = buffer;
        }

        @Override // androidx.camera.camera2.pipe.media.ImagePlane
        public final int getPixelStride() {
            return this.pixelStride;
        }

        @Override // androidx.camera.camera2.pipe.media.ImagePlane
        public final int getRowStride() {
            return this.rowStride;
        }

        @Override // androidx.camera.camera2.pipe.media.ImagePlane
        public final java.nio.ByteBuffer getBuffer() {
            return this.buffer;
        }

        @Override // androidx.camera.camera2.pipe.UnsafeWrapper
        public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
            if (!kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.media.Image.Plane.class))) {
                return null;
            }
            java.lang.Object obj = this.getHighSpeedVideoFpsRangesFor;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (T) obj;
        }
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final int getWidth() {
        return this.width;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final long getTimestamp() {
        return this.timestamp;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final android.graphics.Rect getCropRect() {
        android.graphics.Rect cropRect = this.Camera2StreamConfigurationMap.getCropRect();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(cropRect, "");
        return cropRect;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final void setCropRect(android.graphics.Rect rect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
        this.Camera2StreamConfigurationMap.setCropRect(rect);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final android.hardware.HardwareBuffer getHardwareBuffer() {
        if (android.os.Build.VERSION.SDK_INT > 27) {
            return androidx.camera.camera2.pipe.compat.Api28Compat.getHardwareBuffer(this.Camera2StreamConfigurationMap);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.media.Image.class))) {
            java.lang.Object obj = this.Camera2StreamConfigurationMap;
            kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
            return (T) obj;
        }
        if (android.os.Build.VERSION.SDK_INT > 27) {
            return (T) androidx.camera.camera2.pipe.compat.Api28Compat.unwrapAsHardwareBuffer(this.Camera2StreamConfigurationMap, type);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageWrapper
    public final java.util.List<androidx.camera.camera2.pipe.media.ImagePlane> getPlanes() {
        return Camera2StreamConfigurationMap();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Image-");
        sb.append(androidx.camera.camera2.pipe.StreamFormat.m714getNameimpl(androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(getFormat())));
        sb.append("-w");
        sb.append(getWidth());
        sb.append(io.ktor.util.date.GMTDateParser.HOURS);
        sb.append(getHeight());
        sb.append("-t");
        sb.append(getTimestamp());
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.Camera2StreamConfigurationMap.close();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final java.util.List<androidx.camera.camera2.pipe.media.ImagePlane> Camera2StreamConfigurationMap() {
        java.util.List list;
        java.util.List emptyList;
        java.util.List list2 = this.getHighResolutionOutputSizeshNQ4ISI;
        java.util.List list3 = list2;
        if (list2 == null) {
            synchronized (this.getHighSpeedVideoSizes) {
                list = this.getHighResolutionOutputSizeshNQ4ISI;
                if (list == null) {
                    android.media.Image.Plane[] planes = this.Camera2StreamConfigurationMap.getPlanes();
                    if (planes == null) {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    } else {
                        java.util.List arrayList = new java.util.ArrayList(planes.length);
                        for (android.media.Image.Plane plane : planes) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(plane);
                            arrayList.add(new androidx.camera.camera2.pipe.media.AndroidImage.Plane(plane));
                        }
                        emptyList = arrayList;
                    }
                    this.getHighResolutionOutputSizeshNQ4ISI = emptyList;
                    list = emptyList;
                }
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
            }
            list3 = list;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(list3);
        return list3;
    }
}
