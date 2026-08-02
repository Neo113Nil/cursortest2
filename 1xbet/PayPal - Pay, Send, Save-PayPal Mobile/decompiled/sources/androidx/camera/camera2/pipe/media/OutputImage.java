package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tR\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/media/OutputImage;", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "Landroidx/camera/camera2/pipe/StreamId;", "getStreamId-ptHMqGs", "()I", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "getOutputId-4LaLFng", "outputId", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OutputImage extends androidx.camera.camera2.pipe.media.ImageWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.media.OutputImage.Companion INSTANCE = androidx.camera.camera2.pipe.media.OutputImage.Companion.getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputId-4LaLFng */
    int getGetHighSpeedVideoFpsRangesFor();

    /* renamed from: getStreamId-ptHMqGs */
    int getCamera2StreamConfigurationMap();

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0014\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0080\b¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/media/OutputImage$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "image", "Landroidx/camera/camera2/pipe/media/OutputImage;", "from-AQuxepk", "(IILandroidx/camera/camera2/pipe/media/ImageWrapper;)Landroidx/camera/camera2/pipe/media/OutputImage;", "from", "", "toLogString$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/media/OutputImage;)Ljava/lang/String;", "OutputImageImpl"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.media.OutputImage.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.pipe.media.OutputImage.Companion();

        private Companion() {
        }

        /* renamed from: from-AQuxepk, reason: not valid java name */
        public final androidx.camera.camera2.pipe.media.OutputImage m1004fromAQuxepk(int streamId, int outputId, androidx.camera.camera2.pipe.media.ImageWrapper image) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
            return image instanceof androidx.camera.camera2.pipe.media.OutputImage ? (androidx.camera.camera2.pipe.media.OutputImage) image : new androidx.camera.camera2.pipe.media.OutputImage.Companion.OutputImageImpl(streamId, outputId, image, null);
        }

        @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ)\u0010\r\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00038\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0015\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001c\u001a\u00020\u001f8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0014\u0010\u001a\u001a\u00020$8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010\u0018R\u0016\u0010)\u001a\u0004\u0018\u00010&8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020$8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b*\u0010\u0018R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020-0,8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020$8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u0010\u0018"}, d2 = {"Landroidx/camera/camera2/pipe/media/OutputImage$Companion$OutputImageImpl;", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "Landroidx/camera/camera2/pipe/media/OutputImage;", "Landroidx/camera/camera2/pipe/StreamId;", "p0", "Landroidx/camera/camera2/pipe/OutputId;", "p1", "p2", "<init>", "(IILandroidx/camera/camera2/pipe/media/ImageWrapper;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "T", "Lkotlin/reflect/KClass;", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "close", "()V", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getStreamId-ptHMqGs", "()I", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "getOutputId-4LaLFng", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "getHighSpeedVideoFpsRanges", "Landroid/graphics/Rect;", "getCropRect", "()Landroid/graphics/Rect;", "setCropRect", "(Landroid/graphics/Rect;)V", "", "getFormat", "Landroid/hardware/HardwareBuffer;", "getHardwareBuffer", "()Landroid/hardware/HardwareBuffer;", "getOutputMinFrameDuration", "getHeight", "getInputFormats", "", "Landroidx/camera/camera2/pipe/media/ImagePlane;", "getPlanes", "()Ljava/util/List;", "getHighSpeedVideoSizesFor", "", "getTimestamp", "()J", "getInputSizeshNQ4ISI", "getWidth", "getOutputFormats"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class OutputImageImpl implements androidx.camera.camera2.pipe.media.ImageWrapper, androidx.camera.camera2.pipe.media.OutputImage {

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final int getHighSpeedVideoFpsRangesFor;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private final int Camera2StreamConfigurationMap;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final androidx.camera.camera2.pipe.media.ImageWrapper getHighSpeedVideoFpsRanges;

            private OutputImageImpl(int i, int i2, androidx.camera.camera2.pipe.media.ImageWrapper imageWrapper) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageWrapper, "");
                this.Camera2StreamConfigurationMap = i;
                this.getHighSpeedVideoFpsRangesFor = i2;
                this.getHighSpeedVideoFpsRanges = imageWrapper;
            }

            @Override // androidx.camera.camera2.pipe.media.OutputImage
            /* renamed from: getStreamId-ptHMqGs, reason: from getter */
            public final int getCamera2StreamConfigurationMap() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // androidx.camera.camera2.pipe.media.OutputImage
            /* renamed from: getOutputId-4LaLFng, reason: from getter */
            public final int getGetHighSpeedVideoFpsRangesFor() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public final <T> T unwrapAs(kotlin.reflect.KClass<T> p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p0, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.OutputImage.class)) && !kotlin.jvm.internal.Intrinsics.areEqual(p0, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.ImageWrapper.class))) {
                    return (T) this.getHighSpeedVideoFpsRanges.unwrapAs(p0);
                }
                return (T) this;
            }

            public final java.lang.String toString() {
                androidx.camera.camera2.pipe.media.OutputImage.Companion companion = androidx.camera.camera2.pipe.media.OutputImage.Companion.getHighResolutionOutputSizeshNQ4ISI;
                androidx.camera.camera2.pipe.media.OutputImage.Companion.OutputImageImpl outputImageImpl = this;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputImage-s");
                sb.append(outputImageImpl.getCamera2StreamConfigurationMap());
                sb.append("_o");
                sb.append(outputImageImpl.getGetHighSpeedVideoFpsRangesFor());
                sb.append("-t");
                sb.append(outputImageImpl.getTimestamp());
                return sb.toString();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final void setCropRect(android.graphics.Rect rect) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rect, "");
                this.getHighSpeedVideoFpsRanges.setCropRect(rect);
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final int getWidth() {
                return this.getHighSpeedVideoFpsRanges.getWidth();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final long getTimestamp() {
                return this.getHighSpeedVideoFpsRanges.getTimestamp();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final java.util.List<androidx.camera.camera2.pipe.media.ImagePlane> getPlanes() {
                return this.getHighSpeedVideoFpsRanges.getPlanes();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final int getHeight() {
                return this.getHighSpeedVideoFpsRanges.getHeight();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final android.hardware.HardwareBuffer getHardwareBuffer() {
                return this.getHighSpeedVideoFpsRanges.getHardwareBuffer();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final int getFormat() {
                return this.getHighSpeedVideoFpsRanges.getFormat();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final android.graphics.Rect getCropRect() {
                return this.getHighSpeedVideoFpsRanges.getCropRect();
            }

            @Override // java.lang.AutoCloseable
            public final void close() {
                this.getHighSpeedVideoFpsRanges.close();
            }

            public /* synthetic */ OutputImageImpl(int i, int i2, androidx.camera.camera2.pipe.media.ImageWrapper imageWrapper, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(i, i2, imageWrapper);
            }
        }

        public final java.lang.String toLogString$camera_camera2_pipe(androidx.camera.camera2.pipe.media.OutputImage outputImage) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputImage, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OutputImage-s");
            sb.append(outputImage.getCamera2StreamConfigurationMap());
            sb.append("_o");
            sb.append(outputImage.getGetHighSpeedVideoFpsRangesFor());
            sb.append("-t");
            sb.append(outputImage.getTimestamp());
            return sb.toString();
        }
    }
}
