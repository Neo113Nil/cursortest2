package androidx.camera.camera2.pipe.compat;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/camera/camera2/pipe/compat/AndroidPSessionFactory;", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory;", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfig", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "streamGraph", "<init>", "(Landroidx/camera/camera2/pipe/core/Threads;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;)V", "Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;", "cameraDevice", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "Landroidx/camera/camera2/pipe/compat/CaptureSessionState;", "captureSessionState", "Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "create", "(Landroidx/camera/camera2/pipe/compat/CameraDeviceWrapper;Ljava/util/Map;Landroidx/camera/camera2/pipe/compat/CaptureSessionState;)Landroidx/camera/camera2/pipe/compat/CaptureSessionFactory$Result;", "Camera2StreamConfigurationMap", "Landroidx/camera/camera2/pipe/core/Threads;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidPSessionFactory implements androidx.camera.camera2.pipe.compat.CaptureSessionFactory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.core.Threads getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraGraph.Config getHighSpeedVideoSizes;
    private final androidx.camera.camera2.pipe.graph.StreamGraphImpl getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AndroidPSessionFactory(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.graph.StreamGraphImpl streamGraphImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamGraphImpl, "");
        this.getHighResolutionOutputSizeshNQ4ISI = threads;
        this.getHighSpeedVideoSizes = config;
        this.getHighSpeedVideoFpsRangesFor = streamGraphImpl;
    }

    @Override // androidx.camera.camera2.pipe.compat.CaptureSessionFactory
    public final androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result create(androidx.camera.camera2.pipe.compat.CameraDeviceWrapper cameraDevice, java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces, androidx.camera.camera2.pipe.compat.CaptureSessionState captureSessionState) {
        int m357getSessionMode2uNL3no;
        int i;
        java.util.ArrayList arrayList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraDevice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaces, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(captureSessionState, "");
        int m357getSessionMode2uNL3no2 = this.getHighSpeedVideoSizes.m357getSessionMode2uNL3no();
        if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(m357getSessionMode2uNL3no2, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m383getNORMAL2uNL3no())) {
            i = 0;
        } else {
            if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(m357getSessionMode2uNL3no2, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m382getHIGH_SPEED2uNL3no())) {
                m357getSessionMode2uNL3no = 1;
            } else {
                if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(m357getSessionMode2uNL3no2, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m381getEXTENSION2uNL3no())) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported session mode: ");
                    sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m378toStringimpl(this.getHighSpeedVideoSizes.m357getSessionMode2uNL3no()));
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                m357getSessionMode2uNL3no = this.getHighSpeedVideoSizes.m357getSessionMode2uNL3no();
            }
            i = m357getSessionMode2uNL3no;
        }
        androidx.camera.camera2.pipe.compat.OutputConfigurations buildOutputConfigurations = androidx.camera.camera2.pipe.compat.CaptureSessionFactoryKt.buildOutputConfigurations(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, surfaces);
        if (!buildOutputConfigurations.getAll().isEmpty()) {
            java.util.List<androidx.camera.camera2.pipe.InputStream.Config> input = this.getHighSpeedVideoSizes.getInput();
            if (input != null) {
                java.util.List<androidx.camera.camera2.pipe.InputStream.Config> list = input;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    androidx.camera.camera2.pipe.OutputStream.Config config = (androidx.camera.camera2.pipe.OutputStream.Config) kotlin.collections.CollectionsKt.single((java.util.List) ((androidx.camera.camera2.pipe.InputStream.Config) it.next()).getStream().getOutputs());
                    arrayList2.add(new androidx.camera.camera2.pipe.compat.InputConfigData(config.getSize().getWidth(), config.getSize().getHeight(), config.getFormat()));
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                java.util.ArrayList arrayList3 = arrayList;
                if (!(arrayList3 instanceof java.util.Collection) || !arrayList3.isEmpty()) {
                    java.util.Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        if (((androidx.camera.camera2.pipe.compat.InputConfigData) it2.next()).getFormat() != ((androidx.camera.camera2.pipe.compat.InputConfigData) arrayList.get(0)).getFormat()) {
                            throw new java.lang.IllegalStateException("All InputStream.Config objects must have the same format for multi resolution".toString());
                        }
                    }
                }
            }
            if (cameraDevice.createCaptureSession(new androidx.camera.camera2.pipe.compat.SessionConfigData(i, arrayList, buildOutputConfigurations.getAll(), this.getHighResolutionOutputSizeshNQ4ISI.getCamera2Executor(), captureSessionState, this.getHighSpeedVideoSizes.m358getSessionTemplatefGx8uWA(), this.getHighSpeedVideoSizes.getSessionParameters(), this.getHighSpeedVideoSizes.m356getSessionColorSpacedxVZaPA(), null))) {
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
            androidx.camera.camera2.pipe.CameraGraph.Config unused = this.getHighSpeedVideoSizes;
        }
        captureSessionState.onSessionFinalized();
        return androidx.camera.camera2.pipe.compat.CaptureSessionFactory.Result.Failed.INSTANCE;
    }
}
