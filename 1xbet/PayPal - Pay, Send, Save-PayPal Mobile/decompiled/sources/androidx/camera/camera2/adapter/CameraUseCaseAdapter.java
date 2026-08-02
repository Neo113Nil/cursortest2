package androidx.camera.camera2.adapter;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0011\u0012\u0013\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter;", "Landroidx/camera/core/impl/UseCaseConfigFactory;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;", "captureType", "", "captureMode", "Landroidx/camera/core/impl/Config;", "getConfig", "(Landroidx/camera/core/impl/UseCaseConfigFactory$CaptureType;I)Landroidx/camera/core/impl/Config;", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/impl/DisplayInfoManager;", "getHighSpeedVideoFpsRangesFor", "DefaultCaptureOptionsUnpacker", "ImageCaptureOptionUnpacker", "DefaultSessionOptionsUnpacker", "CaptureCallbackContainer"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraUseCaseAdapter implements androidx.camera.core.impl.UseCaseConfigFactory {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.DisplayInfoManager getHighSpeedVideoFpsRangesFor;

    public CameraUseCaseAdapter(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = androidx.camera.camera2.impl.DisplayInfoManager.INSTANCE.getInstance(context);
        if (context instanceof android.app.Application) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    public final androidx.camera.core.impl.Config getConfig(androidx.camera.core.impl.UseCaseConfigFactory.CaptureType captureType, int captureMode) {
        androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker instance;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureType, "");
        androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
        }
        androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
        androidx.camera.core.impl.SessionConfig.Builder builder = new androidx.camera.core.impl.SessionConfig.Builder();
        switch (androidx.camera.camera2.adapter.CameraUseCaseAdapter.WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                builder.setTemplateType(1);
                break;
            case 6:
                builder.setTemplateType(androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class) != null ? 1 : 3);
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        androidx.camera.core.impl.CaptureConfig.Builder builder2 = new androidx.camera.core.impl.CaptureConfig.Builder();
        switch (androidx.camera.camera2.adapter.CameraUseCaseAdapter.WhenMappings.$EnumSwitchMapping$0[captureType.ordinal()]) {
            case 1:
                builder2.setTemplateType(captureMode == 2 ? 5 : 2);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                builder2.setTemplateType(1);
                break;
            case 6:
                builder2.setTemplateType(androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk.class) != null ? 1 : 3);
                break;
            default:
                throw new kotlin.NoWhenBranchMatchedException();
        }
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        androidx.camera.core.impl.Config.Option<androidx.camera.core.impl.CaptureConfig.OptionUnpacker> option = androidx.camera.core.impl.UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER;
        if (captureType == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE) {
            instance = androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker.INSTANCE.getINSTANCE();
        } else {
            instance = androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker.INSTANCE.getINSTANCE();
        }
        create.insertOption(option, instance);
        create.insertOption(androidx.camera.core.impl.UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultSessionOptionsUnpacker.INSTANCE);
        if (captureType == androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW) {
            create.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_MAX_RESOLUTION, this.getHighSpeedVideoFpsRangesFor.getPreviewSize());
        }
        create.insertOption(androidx.camera.core.impl.ImageOutputConfig.OPTION_TARGET_ROTATION, java.lang.Integer.valueOf(androidx.camera.camera2.impl.DisplayInfoManager.getMaxSizeDisplay$default(this.getHighSpeedVideoFpsRangesFor, false, 1, null).getRotation()));
        androidx.camera.core.impl.OptionsBundle from = androidx.camera.core.impl.OptionsBundle.from(create);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(from, "");
        return from;
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultCaptureOptionsUnpacker;", "Landroidx/camera/core/impl/CaptureConfig$OptionUnpacker;", "<init>", "()V", "Landroidx/camera/core/impl/UseCaseConfig;", "config", "Landroidx/camera/core/impl/CaptureConfig$Builder;", "builder", "", "unpack", "(Landroidx/camera/core/impl/UseCaseConfig;Landroidx/camera/core/impl/CaptureConfig$Builder;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class DefaultCaptureOptionsUnpacker implements androidx.camera.core.impl.CaptureConfig.OptionUnpacker {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker.Companion INSTANCE = new androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker.Companion(null);
        private static final androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker INSTANCE = new androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker();

        @Override // androidx.camera.core.impl.CaptureConfig.OptionUnpacker
        public void unpack(androidx.camera.core.impl.UseCaseConfig<?> config, androidx.camera.core.impl.CaptureConfig.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            androidx.camera.core.impl.CaptureConfig defaultCaptureConfig = config.getDefaultCaptureConfig(null);
            androidx.camera.core.impl.OptionsBundle emptyBundle = androidx.camera.core.impl.OptionsBundle.emptyBundle();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emptyBundle, "");
            androidx.camera.core.impl.OptionsBundle optionsBundle = emptyBundle;
            int templateType = androidx.camera.core.impl.CaptureConfig.defaultEmptyCaptureConfig().getTemplateType();
            if (defaultCaptureConfig != null) {
                templateType = defaultCaptureConfig.getTemplateType();
                builder.addAllCameraCaptureCallbacks(defaultCaptureConfig.getCameraCaptureCallbacks());
                optionsBundle = defaultCaptureConfig.getImplementationOptions();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optionsBundle, "");
                builder.setUseRepeatingSurface(defaultCaptureConfig.isUseRepeatingSurface());
                builder.addAllTags(defaultCaptureConfig.getTagBundle());
                java.util.List<androidx.camera.core.impl.DeferrableSurface> surfaces = defaultCaptureConfig.getSurfaces();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surfaces, "");
                java.util.Iterator<T> it = surfaces.iterator();
                while (it.hasNext()) {
                    builder.addSurface((androidx.camera.core.impl.DeferrableSurface) it.next());
                }
            }
            builder.setImplementationOptions(optionsBundle);
            androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig = new androidx.camera.camera2.impl.Camera2ImplConfig(config);
            builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
            android.hardware.camera2.CameraCaptureSession.CaptureCallback sessionCaptureCallback$default = androidx.camera.camera2.impl.Camera2ImplConfig.getSessionCaptureCallback$default(camera2ImplConfig, null, 1, null);
            if (sessionCaptureCallback$default != null) {
                builder.addCameraCaptureCallback(androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer.INSTANCE.create(sessionCaptureCallback$default));
            }
            builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultCaptureOptionsUnpacker$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultCaptureOptionsUnpacker;", "INSTANCE", "Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultCaptureOptionsUnpacker;", "getINSTANCE", "()Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultCaptureOptionsUnpacker;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker getINSTANCE() {
                return androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$ImageCaptureOptionUnpacker;", "Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultCaptureOptionsUnpacker;", "<init>", "()V", "Landroidx/camera/core/impl/UseCaseConfig;", "config", "Landroidx/camera/core/impl/CaptureConfig$Builder;", "builder", "", "unpack", "(Landroidx/camera/core/impl/UseCaseConfig;Landroidx/camera/core/impl/CaptureConfig$Builder;)V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageCaptureOptionUnpacker extends androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker.Companion INSTANCE = new androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker.Companion(null);
        private static final androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker INSTANCE = new androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker();

        @Override // androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultCaptureOptionsUnpacker, androidx.camera.core.impl.CaptureConfig.OptionUnpacker
        public final void unpack(androidx.camera.core.impl.UseCaseConfig<?> config, androidx.camera.core.impl.CaptureConfig.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            super.unpack(config, builder);
            if (!(config instanceof androidx.camera.core.impl.ImageCaptureConfig)) {
                throw new java.lang.IllegalArgumentException("config is not ImageCaptureConfig".toString());
            }
            androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder2 = new androidx.camera.camera2.impl.Camera2ImplConfig.Builder();
            androidx.camera.camera2.compat.workaround.ImageCapturePixelHDRPlusKt.toggleHDRPlus(builder2, (androidx.camera.core.impl.ImageCaptureConfig) config);
            builder.addImplementationOptions(builder2.build());
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$ImageCaptureOptionUnpacker$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$ImageCaptureOptionUnpacker;", "INSTANCE", "Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$ImageCaptureOptionUnpacker;", "getINSTANCE", "()Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$ImageCaptureOptionUnpacker;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker getINSTANCE() {
                return androidx.camera.camera2.adapter.CameraUseCaseAdapter.ImageCaptureOptionUnpacker.INSTANCE;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$DefaultSessionOptionsUnpacker;", "Landroidx/camera/core/impl/SessionConfig$OptionUnpacker;", "<init>", "()V", "Landroid/util/Size;", "resolution", "Landroidx/camera/core/impl/UseCaseConfig;", "config", "Landroidx/camera/core/impl/SessionConfig$Builder;", "builder", "", "unpack", "(Landroid/util/Size;Landroidx/camera/core/impl/UseCaseConfig;Landroidx/camera/core/impl/SessionConfig$Builder;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultSessionOptionsUnpacker implements androidx.camera.core.impl.SessionConfig.OptionUnpacker {
        public static final androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultSessionOptionsUnpacker INSTANCE = new androidx.camera.camera2.adapter.CameraUseCaseAdapter.DefaultSessionOptionsUnpacker();

        private DefaultSessionOptionsUnpacker() {
        }

        @Override // androidx.camera.core.impl.SessionConfig.OptionUnpacker
        public final void unpack(android.util.Size resolution, androidx.camera.core.impl.UseCaseConfig<?> config, androidx.camera.core.impl.SessionConfig.Builder builder) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(resolution, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
            androidx.camera.core.impl.SessionConfig defaultSessionConfig = config.getDefaultSessionConfig(null);
            androidx.camera.core.impl.OptionsBundle emptyBundle = androidx.camera.core.impl.OptionsBundle.emptyBundle();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(emptyBundle, "");
            androidx.camera.core.impl.OptionsBundle optionsBundle = emptyBundle;
            int templateType = androidx.camera.core.impl.SessionConfig.defaultEmptySessionConfig().getTemplateType();
            if (defaultSessionConfig != null) {
                templateType = defaultSessionConfig.getTemplateType();
                builder.addAllDeviceStateCallbacks(defaultSessionConfig.getDeviceStateCallbacks());
                builder.addAllSessionStateCallbacks(defaultSessionConfig.getSessionStateCallbacks());
                builder.addAllRepeatingCameraCaptureCallbacks(defaultSessionConfig.getRepeatingCameraCaptureCallbacks());
                optionsBundle = defaultSessionConfig.getImplementationOptions();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(optionsBundle, "");
            }
            builder.setImplementationOptions(optionsBundle);
            if (config instanceof androidx.camera.core.impl.PreviewConfig) {
                androidx.camera.camera2.compat.workaround.PreviewPixelHDRnetKt.setupHDRnet(builder, resolution);
            }
            androidx.camera.camera2.impl.Camera2ImplConfig camera2ImplConfig = new androidx.camera.camera2.impl.Camera2ImplConfig(config);
            builder.setTemplateType(camera2ImplConfig.getCaptureRequestTemplate(templateType));
            android.hardware.camera2.CameraDevice.StateCallback deviceStateCallback$default = androidx.camera.camera2.impl.Camera2ImplConfig.getDeviceStateCallback$default(camera2ImplConfig, null, 1, null);
            if (deviceStateCallback$default != null) {
                builder.addDeviceStateCallback(deviceStateCallback$default);
            }
            android.hardware.camera2.CameraCaptureSession.StateCallback sessionStateCallback$default = androidx.camera.camera2.impl.Camera2ImplConfig.getSessionStateCallback$default(camera2ImplConfig, null, 1, null);
            if (sessionStateCallback$default != null) {
                builder.addSessionStateCallback(sessionStateCallback$default);
            }
            android.hardware.camera2.CameraCaptureSession.CaptureCallback sessionCaptureCallback$default = androidx.camera.camera2.impl.Camera2ImplConfig.getSessionCaptureCallback$default(camera2ImplConfig, null, 1, null);
            if (sessionCaptureCallback$default != null) {
                builder.addCameraCaptureCallback(androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer.INSTANCE.create(sessionCaptureCallback$default));
            }
            builder.setPreviewStabilization(config.getPreviewStabilizationMode());
            builder.setVideoStabilization(config.getVideoStabilizationMode());
            androidx.camera.core.impl.MutableOptionsBundle create = androidx.camera.core.impl.MutableOptionsBundle.create();
            java.lang.String physicalCameraId$default = androidx.camera.camera2.impl.Camera2ImplConfig.getPhysicalCameraId$default(camera2ImplConfig, null, 1, null);
            if (physicalCameraId$default != null) {
                create.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.SESSION_PHYSICAL_CAMERA_ID_OPTION, physicalCameraId$default);
            }
            java.lang.Long streamUseCase$default = androidx.camera.camera2.impl.Camera2ImplConfig.getStreamUseCase$default(camera2ImplConfig, null, 1, null);
            if (streamUseCase$default != null) {
                create.insertOption(androidx.camera.camera2.impl.Camera2ImplConfig.STREAM_USE_CASE_OPTION, java.lang.Long.valueOf(streamUseCase$default.longValue()));
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            builder.addImplementationOptions(create);
            builder.addImplementationOptions(camera2ImplConfig.getCaptureRequestOptions());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$CaptureCallbackContainer;", "Landroidx/camera/core/impl/CameraCaptureCallback;", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "p0", "<init>", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)V", "captureCallback", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "getCaptureCallback", "()Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CaptureCallbackContainer extends androidx.camera.core.impl.CameraCaptureCallback {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer.Companion INSTANCE = new androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer.Companion(null);
        private final android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback;

        private CaptureCallbackContainer(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
            this.captureCallback = captureCallback;
        }

        public final android.hardware.camera2.CameraCaptureSession.CaptureCallback getCaptureCallback() {
            return this.captureCallback;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$CaptureCallbackContainer$Companion;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;", "captureCallback", "Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$CaptureCallbackContainer;", "create", "(Landroid/hardware/camera2/CameraCaptureSession$CaptureCallback;)Landroidx/camera/camera2/adapter/CameraUseCaseAdapter$CaptureCallbackContainer;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer create(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureCallback, "");
                return new androidx.camera.camera2.adapter.CameraUseCaseAdapter.CaptureCallbackContainer(captureCallback, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public /* synthetic */ CaptureCallbackContainer(android.hardware.camera2.CameraCaptureSession.CaptureCallback captureCallback, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(captureCallback);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.values().length];
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.PREVIEW.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.STREAM_SHARING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.METERING_REPEATING.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[androidx.camera.core.impl.UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
