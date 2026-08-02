package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00102\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\""}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidExtensionSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "camera2MetadataProvider", "Landroidx/camera/camera2/pipe/StrictMode;", "strictMode", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;Landroidx/camera/camera2/pipe/StrictMode;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "create", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighSpeedVideoFpsRanges", "getHighSpeedVideoSizes", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/compat/Camera2MetadataProvider;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/StrictMode;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidExtensionSessionFactory implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.compat.Camera2MetadataProvider getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl Camera2StreamConfigurationMap;
    private final androidx.camera.camera2.pipe.StrictMode getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public AndroidExtensionSessionFactory(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl, androidx.camera.camera2.pipe.compat.Camera2MetadataProvider camera2MetadataProvider, androidx.camera.camera2.pipe.StrictMode strictMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera2MetadataProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strictMode, "");
        this.getHighSpeedVideoFpsRanges = threads;
        this.getHighResolutionOutputSizeshNQ4ISI = config;
        this.Camera2StreamConfigurationMap = streamGraphImpl;
        this.getHighSpeedVideoSizes = camera2MetadataProvider;
        this.getHighSpeedVideoFpsRangesFor = strictMode;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result create(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces, androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSessionState, "");
        if (!androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(this.getHighResolutionOutputSizeshNQ4ISI.m357getSessionMode2uNL3no(), androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m381getEXTENSION2uNL3no())) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported session mode: ");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m378toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI.m357getSessionMode2uNL3no()));
            sb.append(" for Extension CameraGraph");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        java.lang.Object obj = this.getHighResolutionOutputSizeshNQ4ISI.getSessionParameters().get(androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getCamera2ExtensionMode());
        java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
        if (num != null) {
            int intValue = num.intValue();
            if (this.getHighResolutionOutputSizeshNQ4ISI.getInput() != null) {
                throw new java.lang.IllegalStateException("Reprocessing is not supported for Extensions".toString());
            }
            androidx.camera.camera2.pipe.CameraMetadata mo796awaitCameraMetadataEfqyGwQ = this.getHighSpeedVideoSizes.mo796awaitCameraMetadataEfqyGwQ(cameraDevice.getCameraId());
            java.util.Set<java.lang.Integer> supportedExtensions = mo796awaitCameraMetadataEfqyGwQ.getSupportedExtensions();
            androidx.camera.camera2.pipe.StrictMode strictMode = this.getHighSpeedVideoFpsRangesFor;
            if (!supportedExtensions.contains(java.lang.Integer.valueOf(intValue))) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                sb2.append(cameraDevice);
                sb2.append(" does not support extension mode ");
                sb2.append(intValue);
                sb2.append(". Supported extensions are ");
                sb2.append(supportedExtensions);
                java.lang.String obj2 = sb2.toString();
                if (!strictMode.getEnabled()) {
                    androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                } else {
                    throw new java.lang.IllegalStateException(obj2);
                }
            }
            if (this.getHighResolutionOutputSizeshNQ4ISI.getPostviewStream() != null) {
                androidx.camera.camera2.pipe.CameraExtensionMetadata awaitExtensionMetadata = mo796awaitCameraMetadataEfqyGwQ.awaitExtensionMetadata(intValue);
                androidx.camera.camera2.pipe.StrictMode strictMode2 = this.getHighSpeedVideoFpsRangesFor;
                if (!awaitExtensionMetadata.isPostviewSupported()) {
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder();
                    sb3.append(cameraDevice);
                    sb3.append(" does not support Postview streams");
                    java.lang.String obj3 = sb3.toString();
                    if (!strictMode2.getEnabled()) {
                        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
                    } else {
                        throw new java.lang.IllegalStateException(obj3);
                    }
                }
                if (this.getHighResolutionOutputSizeshNQ4ISI.getPostviewStream().getOutputs().size() != 1) {
                    throw new java.lang.IllegalStateException("Postview streams can only have one OutputStream.config object".toString());
                }
            }
            androidx.camera.camera2.pipe.compat.OutputConfigurations buildOutputConfigurations = androidx.camera.camera2.pipe.compat.CaptureSessionFactoryKt.buildOutputConfigurations(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap, surfaces);
            if (!buildOutputConfigurations.getAll().isEmpty()) {
                if (!buildOutputConfigurations.getDeferred().isEmpty()) {
                    throw new java.lang.IllegalStateException("Deferred output is not supported for Extensions".toString());
                }
                if (cameraDevice.createExtensionSession(new androidx.camera.camera2.pipe.compat.ExtensionSessionConfigData(2, buildOutputConfigurations.getAll(), new androidx.camera.camera2.pipe.core.HandlerExecutor(this.getHighSpeedVideoFpsRanges.getCamera2Handler()), captureSessionState, this.getHighResolutionOutputSizeshNQ4ISI.m358getSessionTemplatefGx8uWA(), this.getHighResolutionOutputSizeshNQ4ISI.getSessionParameters(), java.lang.Integer.valueOf(intValue), new androidx.camera.camera2.pipe.compat.ExtensionSessionState(captureSessionState), buildOutputConfigurations.getPostviewOutput()))) {
                    return new androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Success(buildOutputConfigurations.getDeferred(), buildOutputConfigurations.getOutputSurfaceMap());
                }
                if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                    java.util.Objects.toString(cameraDevice);
                    java.util.Objects.toString(captureSessionState);
                }
                captureSessionState.onSessionFinalized();
                return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
            }
            if (androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE()) {
                androidx.camera.camera2.pipe.CameraGraph.Config unused = this.getHighResolutionOutputSizeshNQ4ISI;
            }
            captureSessionState.onSessionFinalized();
            return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
        }
        throw new java.lang.IllegalStateException("The CameraPipeKeys.camera2ExtensionMode must be set in the sessionParameters of the CameraGraph.Config when creating an Extension CameraGraph.".toString());
    }
}
