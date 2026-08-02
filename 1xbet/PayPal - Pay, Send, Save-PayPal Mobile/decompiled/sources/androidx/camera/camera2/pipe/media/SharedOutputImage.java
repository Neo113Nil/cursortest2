package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ\u000f\u0010\u0002\u001a\u00020\u0000H&¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0000H&¢\u0006\u0004\b\u0004\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "Landroidx/camera/camera2/pipe/media/OutputImage;", "acquire", "()Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "acquireOrNull", "Landroidx/camera/camera2/pipe/media/Finalizer;", "finalizer", "", "setFinalizer", "(Landroidx/camera/camera2/pipe/media/Finalizer;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface SharedOutputImage extends androidx.camera.camera2.pipe.media.OutputImage {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.media.SharedOutputImage.Companion INSTANCE = androidx.camera.camera2.pipe.media.SharedOutputImage.Companion.getHighSpeedVideoFpsRanges;

    androidx.camera.camera2.pipe.media.SharedOutputImage acquire();

    androidx.camera.camera2.pipe.media.SharedOutputImage acquireOrNull();

    void setFinalizer(androidx.camera.camera2.pipe.media.Finalizer<? super androidx.camera.camera2.pipe.media.OutputImage> finalizer);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/media/SharedOutputImage$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/media/OutputImage;", "image", "Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "from", "(Landroidx/camera/camera2/pipe/media/OutputImage;)Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "SharedOutputImageImpl"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.media.SharedOutputImage.Companion getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.media.SharedOutputImage.Companion();

        private Companion() {
        }

        public final androidx.camera.camera2.pipe.media.SharedOutputImage from(androidx.camera.camera2.pipe.media.OutputImage image) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(image, "");
            if (image instanceof androidx.camera.camera2.pipe.media.SharedOutputImage) {
                return ((androidx.camera.camera2.pipe.media.SharedOutputImage) image).acquire();
            }
            androidx.camera.camera2.pipe.media.SharedOutputImage sharedOutputImage = (androidx.camera.camera2.pipe.media.SharedOutputImage) image.unwrapAs(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.SharedOutputImage.class));
            if (sharedOutputImage != null) {
                return sharedOutputImage.acquire();
            }
            return new androidx.camera.camera2.pipe.media.SharedOutputImage.Companion.SharedOutputImageImpl(image, new androidx.camera.camera2.pipe.media.SharedReference(image, androidx.camera.camera2.pipe.media.ClosingFinalizer.INSTANCE));
        }

        @kotlin.Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0011\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0010*\u00020\u000f2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001c\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010\u0019\u001a\u00020\"8\u0017@\u0017X\u0096\u000f¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010 \u001a\u00020'8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010-\u001a\u0004\u0018\u00010*8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020'8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b.\u0010)R\u0014\u00102\u001a\u0002008\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b1\u0010)R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u0002088\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010)R\u0014\u0010>\u001a\u00020;8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u00020'8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010)"}, d2 = {"Landroidx/camera/camera2/pipe/media/SharedOutputImage$Companion$SharedOutputImageImpl;", "Landroidx/camera/camera2/pipe/media/OutputImage;", "Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "p0", "Landroidx/camera/camera2/pipe/media/SharedReference;", "p1", "<init>", "(Landroidx/camera/camera2/pipe/media/OutputImage;Landroidx/camera/camera2/pipe/media/SharedReference;)V", "acquire", "()Landroidx/camera/camera2/pipe/media/SharedOutputImage;", "acquireOrNull", "Landroidx/camera/camera2/pipe/media/Finalizer;", "", "setFinalizer", "(Landroidx/camera/camera2/pipe/media/Finalizer;)V", "", "T", "Lkotlin/reflect/KClass;", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "close", "()V", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/media/OutputImage;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/media/SharedReference;", "Camera2StreamConfigurationMap", "Lkotlinx/atomicfu/AtomicBoolean;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/atomicfu/AtomicBoolean;", "Landroid/graphics/Rect;", "getCropRect", "()Landroid/graphics/Rect;", "setCropRect", "(Landroid/graphics/Rect;)V", "", "getFormat", "()I", "Landroid/hardware/HardwareBuffer;", "getHardwareBuffer", "()Landroid/hardware/HardwareBuffer;", "getOutputFormats", "getHeight", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/pipe/OutputId;", "getOutputId-4LaLFng", "getOutputMinFrameDuration", "", "Landroidx/camera/camera2/pipe/media/ImagePlane;", "getPlanes", "()Ljava/util/List;", "getInputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/StreamId;", "getStreamId-ptHMqGs", "getInputFormats", "", "getTimestamp", "()J", "getOutputStallDuration", "getWidth", "getOutputStallDurationlomOqCM"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class SharedOutputImageImpl implements androidx.camera.camera2.pipe.media.OutputImage, androidx.camera.camera2.pipe.media.SharedOutputImage {

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final kotlinx.atomicfu.AtomicBoolean getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private final androidx.camera.camera2.pipe.media.OutputImage getHighSpeedVideoFpsRanges;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final androidx.camera.camera2.pipe.media.SharedReference<androidx.camera.camera2.pipe.media.OutputImage> Camera2StreamConfigurationMap;

            public SharedOutputImageImpl(androidx.camera.camera2.pipe.media.OutputImage outputImage, androidx.camera.camera2.pipe.media.SharedReference<androidx.camera.camera2.pipe.media.OutputImage> sharedReference) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputImage, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedReference, "");
                this.getHighSpeedVideoFpsRanges = outputImage;
                this.Camera2StreamConfigurationMap = sharedReference;
                this.getHighSpeedVideoSizes = kotlinx.atomicfu.AtomicFU.atomic(false);
            }

            @Override // androidx.camera.camera2.pipe.media.SharedOutputImage
            public final androidx.camera.camera2.pipe.media.SharedOutputImage acquire() {
                androidx.camera.camera2.pipe.media.SharedOutputImage acquireOrNull = acquireOrNull();
                if (acquireOrNull != null) {
                    return acquireOrNull;
                }
                throw new java.lang.IllegalStateException("Required value was null.".toString());
            }

            @Override // androidx.camera.camera2.pipe.media.SharedOutputImage
            public final androidx.camera.camera2.pipe.media.SharedOutputImage acquireOrNull() {
                if (this.getHighSpeedVideoSizes.getValue()) {
                    return null;
                }
                return this.Camera2StreamConfigurationMap.acquireOrNull() != null ? new androidx.camera.camera2.pipe.media.SharedOutputImage.Companion.SharedOutputImageImpl(this.getHighSpeedVideoFpsRanges, this.Camera2StreamConfigurationMap) : null;
            }

            @Override // androidx.camera.camera2.pipe.media.SharedOutputImage
            public final void setFinalizer(androidx.camera.camera2.pipe.media.Finalizer<? super androidx.camera.camera2.pipe.media.OutputImage> p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                if (this.getHighSpeedVideoSizes.getValue()) {
                    p0.finalize(null);
                } else {
                    this.Camera2StreamConfigurationMap.setFinalizer(p0);
                }
            }

            @Override // androidx.camera.camera2.pipe.UnsafeWrapper
            public final <T> T unwrapAs(kotlin.reflect.KClass<T> p0) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                if (this.getHighSpeedVideoSizes.getValue()) {
                    return null;
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(p0, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.SharedOutputImage.class)) && !kotlin.jvm.internal.Intrinsics.areEqual(p0, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.OutputImage.class)) && !kotlin.jvm.internal.Intrinsics.areEqual(p0, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.ImageWrapper.class))) {
                    if (kotlin.jvm.internal.Intrinsics.areEqual(p0, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.media.Image.class))) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot unwrap ");
                        sb.append(this);
                        sb.append(" as android.media.Image. Use setFinalizerinstead and close all outstanding references.");
                        throw new java.lang.UnsupportedOperationException(sb.toString());
                    }
                    return (T) this.getHighSpeedVideoFpsRanges.unwrapAs(p0);
                }
                return (T) this;
            }

            @Override // java.lang.AutoCloseable
            public final void close() {
                if (this.getHighSpeedVideoSizes.compareAndSet(false, true)) {
                    this.Camera2StreamConfigurationMap.decrement();
                }
            }

            public final java.lang.String toString() {
                return this.getHighSpeedVideoFpsRanges.toString();
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

            @Override // androidx.camera.camera2.pipe.media.OutputImage
            /* renamed from: getStreamId-ptHMqGs */
            public final int getGetHighSpeedVideoFpsRanges() {
                return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoFpsRanges();
            }

            @Override // androidx.camera.camera2.pipe.media.ImageWrapper
            public final java.util.List<androidx.camera.camera2.pipe.media.ImagePlane> getPlanes() {
                return this.getHighSpeedVideoFpsRanges.getPlanes();
            }

            @Override // androidx.camera.camera2.pipe.media.OutputImage
            /* renamed from: getOutputId-4LaLFng */
            public final int getGetHighSpeedVideoSizes() {
                return this.getHighSpeedVideoFpsRanges.getGetHighSpeedVideoSizes();
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
        }
    }
}
