package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJC\u0010\u0017\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Landroidx/camera/camera2/pipe/media/ImageReaderImageSources;", "Landroidx/camera/camera2/pipe/media/ImageSources;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "cameraPipeConfig", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraPipe$Config;)V", "Landroidx/camera/camera2/pipe/CameraStream;", "cameraStream", "Landroidx/camera/camera2/pipe/ImageSourceConfig;", "imageSourceConfig", "Landroidx/camera/camera2/pipe/media/ImageSource;", "createImageSource", "(Landroidx/camera/camera2/pipe/CameraStream;Landroidx/camera/camera2/pipe/ImageSourceConfig;)Landroidx/camera/camera2/pipe/media/ImageSource;", "", "capacity", "", "usageFlags", "defaultDataSpace", "defaultHardwareBufferFormat", "", "enableConcurrentOutputs", "create", "(Landroidx/camera/camera2/pipe/CameraStream;ILjava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Z)Landroidx/camera/camera2/pipe/media/ImageSource;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ImageReaderImageSources implements androidx.camera.camera2.pipe.media.ImageSources {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.PlatformApiCompat getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public ImageReaderImageSources(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraPipe.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        this.getHighResolutionOutputSizeshNQ4ISI = threads;
        this.getHighSpeedVideoFpsRanges = config.getPlatformApiCompat();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageSources
    public final androidx.camera.camera2.pipe.media.ImageSource createImageSource(androidx.camera.camera2.pipe.CameraStream cameraStream, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStream, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageSourceConfig, "");
        return create(cameraStream, imageSourceConfig.getCapacity(), imageSourceConfig.getUsageFlags(), imageSourceConfig.getDefaultDataSpace(), imageSourceConfig.getDefaultHardwareBufferFormat(), imageSourceConfig.getEnableConcurrentOutputs());
    }

    public final androidx.camera.camera2.pipe.media.ImageSource create(androidx.camera.camera2.pipe.CameraStream cameraStream, int capacity, java.lang.Long usageFlags, java.lang.Integer defaultDataSpace, java.lang.Integer defaultHardwareBufferFormat, boolean enableConcurrentOutputs) {
        java.lang.Long l;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStream, "");
        if (cameraStream.getOutputs().isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(cameraStream);
            sb.append(" must have outputs.");
            throw new java.lang.IllegalArgumentException(sb.toString().toString());
        }
        if (capacity <= 0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Capacity (");
            sb2.append(capacity);
            sb2.append(") must be > 0");
            throw new java.lang.IllegalArgumentException(sb2.toString().toString());
        }
        if (capacity > 52) {
            throw new java.lang.IllegalArgumentException("Capacity for creating new ImageReaderImageSources is restricted to 52. Android has undocumented internal limits that can vary per device.".toString());
        }
        if (enableConcurrentOutputs && cameraStream.getOutputs().size() <= 1) {
            throw new java.lang.IllegalStateException("Cannot enable concurrent outputs for a single output camera stream.".toString());
        }
        kotlin.jvm.functions.Function0 function0 = new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSources$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                android.os.Handler camera2Handler;
                camera2Handler = androidx.camera.camera2.pipe.media.ImageReaderImageSources.this.getHighResolutionOutputSizeshNQ4ISI.getCamera2Handler();
                return camera2Handler;
            }
        };
        kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: androidx.camera.camera2.pipe.media.ImageReaderImageSources$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                java.util.concurrent.Executor lightweightExecutor;
                lightweightExecutor = androidx.camera.camera2.pipe.media.ImageReaderImageSources.this.getHighResolutionOutputSizeshNQ4ISI.getLightweightExecutor();
                return lightweightExecutor;
            }
        };
        if (cameraStream.getOutputs().size() == 1) {
            androidx.camera.camera2.pipe.OutputStream outputStream = (androidx.camera.camera2.pipe.OutputStream) kotlin.collections.CollectionsKt.single((java.util.List) cameraStream.getOutputs());
            return androidx.camera.camera2.pipe.media.ImageReaderImageSource.INSTANCE.create(androidx.camera.camera2.pipe.media.AndroidImageReader.INSTANCE.m994createfE0t4g(outputStream.getSize().getWidth(), outputStream.getSize().getHeight(), outputStream.getFormat(), capacity + 2, usageFlags, defaultDataSpace, defaultHardwareBufferFormat, cameraStream.getId(), outputStream.getId(), (android.os.Handler) function0.invoke()));
        }
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            if (usageFlags == null || android.os.Build.VERSION.SDK_INT < 36) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                l = null;
            } else {
                l = usageFlags;
            }
            if (defaultDataSpace != null) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            }
            if (defaultHardwareBufferFormat != null) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            }
            return androidx.camera.camera2.pipe.media.ImageReaderImageSource.INSTANCE.create(androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader.INSTANCE.create(cameraStream, capacity, (java.util.concurrent.Executor) function02.invoke(), l, enableConcurrentOutputs, this.getHighSpeedVideoFpsRanges));
        }
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Failed to create an ImageSource for ");
        sb3.append(cameraStream);
        sb3.append('!');
        throw new java.lang.IllegalStateException(sb3.toString());
    }
}
