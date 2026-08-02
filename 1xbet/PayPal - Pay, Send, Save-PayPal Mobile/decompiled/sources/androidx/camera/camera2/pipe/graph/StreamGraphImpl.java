package androidx.camera.camera2.pipe.graph;

@androidx.camera.camera2.pipe.config.CameraGraphScope
@kotlin.Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 V2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0005RSTUVB/\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u00102\u001a\u0004\u0018\u00010\u00182\u0006\u00103\u001a\u00020\u0017H\u0096\u0002J#\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020#2\b\u00107\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u0004\u0018\u00010$2\u0006\u00106\u001a\u00020#H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u0004\u0018\u00010\u00172\u0006\u00106\u001a\u00020#¢\u0006\u0004\b?\u0010@J\u0012\u0010A\u001a\u0004\u0018\u00010B2\u0006\u0010C\u001a\u00020DH\u0002J\u0010\u0010E\u001a\u00020F2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00020F0\u001a2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0002J\u0018\u0010H\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\b\u0010J\u001a\u00020KH\u0016J\u001c\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\f\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002J\u001c\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aH\u0002J\b\u0010P\u001a\u00020QH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u001b0\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u0016X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020'0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001dR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u001c\u0010+\u001a\b\u0012\u0004\u0012\u00020#0,X\u0096\u0004¢\u0006\n\n\u0002\b/\u001a\u0004\b-\u0010.R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001aX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001d¨\u0006W"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl;", "Landroidx/camera/camera2/pipe/StreamGraph;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "cameraMetadata", "Landroidx/camera/camera2/pipe/CameraMetadata;", "graphConfig", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "imageSources", "Landroidx/camera/camera2/pipe/media/ImageSources;", "cameraControllerProvider", "Ljavax/inject/Provider;", "Landroidx/camera/camera2/pipe/CameraController;", "<init>", "(Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/camera2/pipe/CameraGraph$Config;Landroidx/camera/camera2/pipe/media/ImageSources;Ljavax/inject/Provider;)V", "getCameraMetadata", "()Landroidx/camera/camera2/pipe/CameraMetadata;", "getGraphConfig", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getImageSources", "()Landroidx/camera/camera2/pipe/media/ImageSources;", "_streamMap", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "Landroidx/camera/camera2/pipe/CameraStream;", "outputConfigs", "", "Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$OutputConfig;", "getOutputConfigs$camera_camera2_pipe", "()Ljava/util/List;", "outputConfigMap", "Landroidx/camera/camera2/pipe/OutputStream;", "getOutputConfigMap$camera_camera2_pipe", "()Ljava/util/Map;", "imageSourceMap", "Landroidx/camera/camera2/pipe/StreamId;", "Landroidx/camera/camera2/pipe/media/ImageSource;", "getImageSourceMap$camera_camera2_pipe", "inputs", "Landroidx/camera/camera2/pipe/InputStream;", "getInputs", "streams", "getStreams", "streamIds", "", "getStreamIds", "()Ljava/util/Set;", "streamIds$1", "outputs", "getOutputs", "get", "config", "getOutputLatency", "Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "streamId", "outputId", "Landroidx/camera/camera2/pipe/OutputId;", "getOutputLatency-IL232MI", "(ILandroidx/camera/camera2/pipe/OutputId;)Landroidx/camera/camera2/pipe/StreamGraph$OutputLatency;", "getImageSource", "getImageSource-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/media/ImageSource;", "getCameraStreamConfig", "getCameraStreamConfig-aKI5c8E", "(I)Landroidx/camera/camera2/pipe/CameraStream$Config;", "getOutputConfigurationOrNull", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfig", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "computeNextSurfaceGroupId", "", "readExistingGroupNumbers", "computeIfDeferredStreamsAreSupported", "", "toString", "", "sortOutputsByPreviewStream", "unsortedStreams", "sortOutputsByVideoStream", "unsortedOutputs", "close", "", "OutputConfig", "OutputStreamImpl", "InputStreamImpl", "SurfaceListener", "Companion", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StreamGraphImpl implements androidx.camera.camera2.pipe.StreamGraph, java.lang.AutoCloseable {
    private final java.util.List<androidx.camera.camera2.pipe.CameraStream> accessartificialFrame;
    private final java.util.Map<androidx.camera.camera2.pipe.CameraStream.Config, androidx.camera.camera2.pipe.CameraStream> getOutputFormats;
    private final androidx.camera.camera2.pipe.media.ImageSources getOutputMinFrameDurationlomOqCM;
    private final androidx.camera.camera2.pipe.CameraMetadata getOutputSizes;
    private final javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> getOutputSizeshNQ4ISI;
    private final androidx.camera.camera2.pipe.CameraGraph.Config getOutputStallDuration;
    private final java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.media.ImageSource> getOutputStallDurationlomOqCM;
    private final java.util.List<androidx.camera.camera2.pipe.InputStream> getValidOutputFormatsForInputhNQ4ISI;
    private final java.util.List<androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig> isOutputSupportedFor;
    private final java.util.List<androidx.camera.camera2.pipe.OutputStream> isOutputSupportedForhNQ4ISI;
    private final java.util.Map<androidx.camera.camera2.pipe.OutputStream, androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig> toString;
    private final java.util.Set<androidx.camera.camera2.pipe.StreamId> unwrapAs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.graph.StreamGraphImpl.Companion INSTANCE = new androidx.camera.camera2.pipe.graph.StreamGraphImpl.Companion(null);
    private static final kotlinx.atomicfu.AtomicInt getHighSpeedVideoSizesFor = kotlinx.atomicfu.AtomicFU.atomic(0);
    private static final kotlinx.atomicfu.AtomicInt getHighResolutionOutputSizeshNQ4ISI = kotlinx.atomicfu.AtomicFU.atomic(0);
    private static final kotlinx.atomicfu.AtomicInt getHighSpeedVideoFpsRanges = kotlinx.atomicfu.AtomicFU.atomic(0);
    private static final kotlinx.atomicfu.AtomicInt getHighSpeedVideoFpsRangesFor = kotlinx.atomicfu.AtomicFU.atomic(0);
    private static final kotlinx.atomicfu.AtomicInt Camera2StreamConfigurationMap = kotlinx.atomicfu.AtomicFU.atomic(0);
    private static final java.util.List<androidx.camera.camera2.pipe.OutputStream.OutputType> getInputFormats = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.OutputStream.OutputType[]{androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_VIEW(), androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_TEXTURE()});
    private static final java.util.Comparator<androidx.camera.camera2.pipe.CameraStream> getInputSizeshNQ4ISI = new java.util.Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.util.List list;
            java.util.List list2;
            java.util.List list3;
            java.util.List list4;
            java.util.Iterator<T> it = ((androidx.camera.camera2.pipe.CameraStream) t).getOutputs().iterator();
            if (!it.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            androidx.camera.camera2.pipe.OutputStream outputStream = (androidx.camera.camera2.pipe.OutputStream) it.next();
            list = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getInputFormats;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.OutputType>) list, outputStream.getOutputType()));
            while (it.hasNext()) {
                androidx.camera.camera2.pipe.OutputStream outputStream2 = (androidx.camera.camera2.pipe.OutputStream) it.next();
                list4 = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getInputFormats;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.OutputType>) list4, outputStream2.getOutputType()));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            java.util.Iterator<T> it2 = ((androidx.camera.camera2.pipe.CameraStream) t2).getOutputs().iterator();
            if (it2.hasNext()) {
                androidx.camera.camera2.pipe.OutputStream outputStream3 = (androidx.camera.camera2.pipe.OutputStream) it2.next();
                list2 = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getInputFormats;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.OutputType>) list2, outputStream3.getOutputType()));
                while (it2.hasNext()) {
                    androidx.camera.camera2.pipe.OutputStream outputStream4 = (androidx.camera.camera2.pipe.OutputStream) it2.next();
                    list3 = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getInputFormats;
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(kotlin.collections.CollectionsKt.indexOf((java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.OutputType>) list3, outputStream4.getOutputType()));
                    if (valueOf3.compareTo(valueOf4) < 0) {
                        valueOf3 = valueOf4;
                    }
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, valueOf3);
            }
            throw new java.util.NoSuchElementException();
        }
    };
    private static final java.util.List<androidx.camera.camera2.pipe.StreamFormat> getOutputMinFrameDuration = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.StreamFormat[]{androidx.camera.camera2.pipe.StreamFormat.m709boximpl(androidx.camera.camera2.pipe.StreamFormat.INSTANCE.m735getUNKNOWN8FPWQzE()), androidx.camera.camera2.pipe.StreamFormat.m709boximpl(androidx.camera.camera2.pipe.StreamFormat.INSTANCE.m728getPRIVATE8FPWQzE())});
    private static final java.util.Comparator<androidx.camera.camera2.pipe.CameraStream> getHighSpeedVideoSizes = new java.util.Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$compareBy$2
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            java.util.List list;
            java.util.List list2;
            java.util.List list3;
            java.util.List list4;
            java.util.Iterator<T> it = ((androidx.camera.camera2.pipe.CameraStream) t).getOutputs().iterator();
            if (!it.hasNext()) {
                throw new java.util.NoSuchElementException();
            }
            androidx.camera.camera2.pipe.OutputStream outputStream = (androidx.camera.camera2.pipe.OutputStream) it.next();
            list = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getOutputMinFrameDuration;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(list.indexOf(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(outputStream.getFormat())));
            while (it.hasNext()) {
                androidx.camera.camera2.pipe.OutputStream outputStream2 = (androidx.camera.camera2.pipe.OutputStream) it.next();
                list4 = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getOutputMinFrameDuration;
                java.lang.Integer valueOf2 = java.lang.Integer.valueOf(list4.indexOf(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(outputStream2.getFormat())));
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            java.util.Iterator<T> it2 = ((androidx.camera.camera2.pipe.CameraStream) t2).getOutputs().iterator();
            if (it2.hasNext()) {
                androidx.camera.camera2.pipe.OutputStream outputStream3 = (androidx.camera.camera2.pipe.OutputStream) it2.next();
                list2 = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getOutputMinFrameDuration;
                java.lang.Integer valueOf3 = java.lang.Integer.valueOf(list2.indexOf(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(outputStream3.getFormat())));
                while (it2.hasNext()) {
                    androidx.camera.camera2.pipe.OutputStream outputStream4 = (androidx.camera.camera2.pipe.OutputStream) it2.next();
                    list3 = androidx.camera.camera2.pipe.graph.StreamGraphImpl.getOutputMinFrameDuration;
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(list3.indexOf(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(outputStream4.getFormat())));
                    if (valueOf3.compareTo(valueOf4) < 0) {
                        valueOf3 = valueOf4;
                    }
                }
                return kotlin.comparisons.ComparisonsKt.compareValues(valueOf, valueOf3);
            }
            throw new java.util.NoSuchElementException();
        }
    };

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$SurfaceListener;", "", "", "Landroidx/camera/camera2/pipe/StreamId;", "Landroid/view/Surface;", "surfaces", "", "onSurfaceMapUpdated", "(Ljava/util/Map;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface SurfaceListener {
        void onSurfaceMapUpdated(java.util.Map<androidx.camera.camera2.pipe.StreamId, ? extends android.view.Surface> surfaces);
    }

    /* JADX WARN: Removed duplicated region for block: B:85:0x01e0  */
    @javax.inject.Inject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StreamGraphImpl(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.media.ImageSources imageSources, javax.inject.Provider<androidx.camera.camera2.pipe.CameraController> provider) {
        kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker;
        java.util.ArrayList emptyList;
        java.util.List<androidx.camera.camera2.pipe.CameraStream> plus;
        androidx.camera.camera2.pipe.OutputStream.OutputType outputType;
        android.hardware.camera2.params.OutputConfiguration outputConfiguration;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadata, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageSources, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provider, "");
        this.getOutputSizes = cameraMetadata;
        this.getOutputStallDuration = config;
        this.getOutputMinFrameDurationlomOqCM = imageSources;
        this.getOutputSizeshNQ4ISI = provider;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        boolean z = androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(config.m357getSessionMode2uNL3no(), androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m383getNORMAL2uNL3no()) && !androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLegacy(cameraMetadata) && !androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelLimited(cameraMetadata) && (android.os.Build.VERSION.SDK_INT < 28 || !androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.isHardwareLevelExternal(cameraMetadata));
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        for (java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> list : config.getExclusiveStreamGroups()) {
            if (list.isEmpty()) {
                throw new java.lang.IllegalStateException("Check failed.");
            }
            java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> streams = this.getOutputStallDuration.getStreams();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator<T> it = streams.iterator();
            while (it.hasNext()) {
                kotlin.collections.CollectionsKt.addAll(arrayList3, ((androidx.camera.camera2.pipe.CameraStream.Config) it.next()).getOutputs());
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList3) {
                if (obj instanceof androidx.camera.camera2.pipe.OutputStream.Config.ExternalOutputConfig) {
                    arrayList4.add(obj);
                }
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            java.util.Iterator it2 = arrayList4.iterator();
            while (it2.hasNext()) {
                int surfaceGroupId = androidx.camera.camera2.pipe.compat.Api24Compat.getSurfaceGroupId(((androidx.camera.camera2.pipe.OutputStream.Config.ExternalOutputConfig) it2.next()).getOutput());
                if (!arrayList5.contains(java.lang.Integer.valueOf(surfaceGroupId))) {
                    arrayList5.add(java.lang.Integer.valueOf(surfaceGroupId));
                }
            }
            int nextGroupId$camera_camera2_pipe = INSTANCE.nextGroupId$camera_camera2_pipe();
            while (arrayList5.contains(java.lang.Integer.valueOf(nextGroupId$camera_camera2_pipe))) {
                nextGroupId$camera_camera2_pipe = INSTANCE.nextGroupId$camera_camera2_pipe();
            }
            for (androidx.camera.camera2.pipe.CameraStream.Config config2 : list) {
                if (linkedHashMap3.containsKey(config2)) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                linkedHashMap3.put(config2, java.lang.Integer.valueOf(nextGroupId$camera_camera2_pipe));
            }
        }
        java.util.Iterator<androidx.camera.camera2.pipe.CameraStream.Config> it3 = this.getOutputStallDuration.getStreams().iterator();
        while (true) {
            defaultConstructorMarker = null;
            if (!it3.hasNext()) {
                break;
            }
            androidx.camera.camera2.pipe.CameraStream.Config next = it3.next();
            for (androidx.camera.camera2.pipe.OutputStream.Config config3 : next.getOutputs()) {
                if (!linkedHashMap.containsKey(config3)) {
                    int m940nextConfigIdhoCEiqs$camera_camera2_pipe = INSTANCE.m940nextConfigIdhoCEiqs$camera_camera2_pipe();
                    android.util.Size size = config3.getSize();
                    int format = config3.getFormat();
                    java.lang.String camera = config3.getCamera();
                    java.lang.String m353getCameraDz_R5H8 = camera == null ? this.getOutputStallDuration.m353getCameraDz_R5H8() : camera;
                    java.lang.Integer num = (java.lang.Integer) linkedHashMap3.get(next);
                    if (z) {
                        androidx.camera.camera2.pipe.OutputStream.Config.LazyOutputConfig lazyOutputConfig = config3 instanceof androidx.camera.camera2.pipe.OutputStream.Config.LazyOutputConfig ? (androidx.camera.camera2.pipe.OutputStream.Config.LazyOutputConfig) config3 : null;
                        if (lazyOutputConfig != null) {
                            outputType = lazyOutputConfig.getOutputType();
                            androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode = config3.getMirrorMode();
                            androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase = config3.getTimestampBase();
                            androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile = config3.getDynamicRangeProfile();
                            androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase = config3.getStreamUseCase();
                            androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint = config3.getStreamUseHint();
                            java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes = config3.getSensorPixelModes();
                            if (android.os.Build.VERSION.SDK_INT >= 33) {
                                androidx.camera.camera2.pipe.OutputStream.Config.ExternalOutputConfig externalOutputConfig = config3 instanceof androidx.camera.camera2.pipe.OutputStream.Config.ExternalOutputConfig ? (androidx.camera.camera2.pipe.OutputStream.Config.ExternalOutputConfig) config3 : null;
                                if (externalOutputConfig != null) {
                                    outputConfiguration = externalOutputConfig.getOutput();
                                    androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig = new androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig(m940nextConfigIdhoCEiqs$camera_camera2_pipe, size, format, m353getCameraDz_R5H8, num, outputConfiguration, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes, null);
                                    linkedHashMap.put(config3, outputConfig);
                                    arrayList.add(outputConfig);
                                }
                            }
                            outputConfiguration = null;
                            androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig2 = new androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig(m940nextConfigIdhoCEiqs$camera_camera2_pipe, size, format, m353getCameraDz_R5H8, num, outputConfiguration, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes, null);
                            linkedHashMap.put(config3, outputConfig2);
                            arrayList.add(outputConfig2);
                        }
                    }
                    outputType = null;
                    androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode2 = config3.getMirrorMode();
                    androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase2 = config3.getTimestampBase();
                    androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile2 = config3.getDynamicRangeProfile();
                    androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase2 = config3.getStreamUseCase();
                    androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint2 = config3.getStreamUseHint();
                    java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes2 = config3.getSensorPixelModes();
                    if (android.os.Build.VERSION.SDK_INT >= 33) {
                    }
                    outputConfiguration = null;
                    androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig22 = new androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig(m940nextConfigIdhoCEiqs$camera_camera2_pipe, size, format, m353getCameraDz_R5H8, num, outputConfiguration, outputType, mirrorMode2, timestampBase2, dynamicRangeProfile2, streamUseCase2, streamUseHint2, sensorPixelModes2, null);
                    linkedHashMap.put(config3, outputConfig22);
                    arrayList.add(outputConfig22);
                }
            }
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        int size2 = this.getOutputStallDuration.getStreams().size();
        for (int i = 0; i < size2; i++) {
            androidx.camera.camera2.pipe.CameraStream.Config config4 = this.getOutputStallDuration.getStreams().get(i);
            java.util.List<androidx.camera.camera2.pipe.OutputStream.Config> outputs = config4.getOutputs();
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(outputs, 10));
            java.util.Iterator<T> it4 = outputs.iterator();
            while (it4.hasNext()) {
                java.lang.Object obj2 = linkedHashMap.get((androidx.camera.camera2.pipe.OutputStream.Config) it4.next());
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj2);
                androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig outputConfig3 = (androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig) obj2;
                androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputStreamImpl outputStreamImpl = new androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputStreamImpl(INSTANCE.m942nextOutputId4LaLFng$camera_camera2_pipe(), outputConfig3.getSize(), outputConfig3.getFormat(), outputConfig3.getCamera(), outputConfig3.getMirrorMode(), outputConfig3.getTimestampBase(), outputConfig3.getDynamicRangeProfile(), outputConfig3.getStreamUseCase(), outputConfig3.getDeferredOutputType(), outputConfig3.getStreamUseHint(), null);
                linkedHashMap4.put(outputStreamImpl, outputConfig3);
                arrayList6.add(outputStreamImpl);
            }
            java.util.ArrayList arrayList7 = arrayList6;
            androidx.camera.camera2.pipe.CameraStream cameraStream = new androidx.camera.camera2.pipe.CameraStream(INSTANCE.m943nextStreamIdptHMqGs$camera_camera2_pipe(), arrayList7, null);
            linkedHashMap2.put(config4, cameraStream);
            arrayList2.add(cameraStream);
            java.util.Iterator it5 = arrayList7.iterator();
            while (it5.hasNext()) {
                ((androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputStreamImpl) it5.next()).setStream(cameraStream);
            }
            java.util.Iterator<androidx.camera.camera2.pipe.OutputStream.Config> it6 = config4.getOutputs().iterator();
            while (it6.hasNext()) {
                java.lang.Object obj3 = linkedHashMap.get(it6.next());
                kotlin.jvm.internal.Intrinsics.checkNotNull(obj3);
                ((androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig) obj3).getStreamBuilder$camera_camera2_pipe().add(cameraStream);
            }
        }
        java.util.List<androidx.camera.camera2.pipe.InputStream.Config> input = this.getOutputStallDuration.getInput();
        if (input == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<androidx.camera.camera2.pipe.InputStream.Config> list2 = input;
            java.util.ArrayList arrayList8 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (androidx.camera.camera2.pipe.InputStream.Config config5 : list2) {
                arrayList8.add(new androidx.camera.camera2.pipe.graph.StreamGraphImpl.InputStreamImpl(INSTANCE.m941nextInputIdm1bwn9M$camera_camera2_pipe(), config5.getMaxImages(), config5.getStreamFormat(), defaultConstructorMarker));
            }
            emptyList = arrayList8;
        }
        this.getValidOutputFormatsForInputhNQ4ISI = emptyList;
        java.util.ArrayList arrayList9 = arrayList2;
        java.util.ArrayList arrayList10 = new java.util.ArrayList();
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        for (java.lang.Object obj4 : arrayList9) {
            java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs2 = ((androidx.camera.camera2.pipe.CameraStream) obj4).getOutputs();
            if (!(outputs2 instanceof java.util.Collection) || !outputs2.isEmpty()) {
                java.util.Iterator<T> it7 = outputs2.iterator();
                while (it7.hasNext()) {
                    androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase3 = ((androidx.camera.camera2.pipe.OutputStream) it7.next()).getStreamUseCase();
                    long m625getPREVIEWvrKr8v8 = androidx.camera.camera2.pipe.OutputStream.StreamUseCase.INSTANCE.m625getPREVIEWvrKr8v8();
                    java.util.ArrayList arrayList12 = arrayList11;
                    if (streamUseCase3 != null && androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m619equalsimpl0(streamUseCase3.m622unboximpl(), m625getPREVIEWvrKr8v8)) {
                        arrayList10.add(obj4);
                        arrayList11 = arrayList12;
                        break;
                    }
                    arrayList11 = arrayList12;
                }
            }
            java.util.ArrayList arrayList13 = arrayList11;
            arrayList13.add(obj4);
            arrayList11 = arrayList13;
        }
        kotlin.Pair pair = new kotlin.Pair(arrayList10, arrayList11);
        java.util.List list3 = (java.util.List) pair.component1();
        java.util.List list4 = (java.util.List) pair.component2();
        java.util.List list5 = list3;
        if (!list5.isEmpty()) {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list5, (java.lang.Iterable) list4);
        } else {
            java.util.ArrayList arrayList14 = new java.util.ArrayList();
            java.util.ArrayList arrayList15 = new java.util.ArrayList();
            for (java.lang.Object obj5 : arrayList9) {
                java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs3 = ((androidx.camera.camera2.pipe.CameraStream) obj5).getOutputs();
                if (!(outputs3 instanceof java.util.Collection) || !outputs3.isEmpty()) {
                    java.util.Iterator<T> it8 = outputs3.iterator();
                    while (it8.hasNext()) {
                        if (kotlin.collections.CollectionsKt.contains(getInputFormats, ((androidx.camera.camera2.pipe.OutputStream) it8.next()).getOutputType())) {
                            arrayList14.add(obj5);
                            break;
                        }
                    }
                }
                arrayList15.add(obj5);
            }
            kotlin.Pair pair2 = new kotlin.Pair(arrayList14, arrayList15);
            java.util.List list6 = (java.util.List) pair2.component1();
            java.util.List list7 = (java.util.List) pair2.component2();
            if (!list6.isEmpty()) {
                plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.sortedWith(list6, getInputSizeshNQ4ISI), (java.lang.Iterable) list7);
            } else {
                java.util.ArrayList arrayList16 = new java.util.ArrayList();
                java.util.ArrayList arrayList17 = new java.util.ArrayList();
                for (java.lang.Object obj6 : arrayList9) {
                    java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs4 = ((androidx.camera.camera2.pipe.CameraStream) obj6).getOutputs();
                    if (!(outputs4 instanceof java.util.Collection) || !outputs4.isEmpty()) {
                        java.util.Iterator<T> it9 = outputs4.iterator();
                        while (it9.hasNext()) {
                            if (getOutputMinFrameDuration.contains(androidx.camera.camera2.pipe.StreamFormat.m709boximpl(((androidx.camera.camera2.pipe.OutputStream) it9.next()).getFormat()))) {
                                arrayList16.add(obj6);
                                break;
                            }
                        }
                    }
                    arrayList17.add(obj6);
                }
                kotlin.Pair pair3 = new kotlin.Pair(arrayList16, arrayList17);
                java.util.List list8 = (java.util.List) pair3.component1();
                plus = list8.isEmpty() ? arrayList2 : kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.sortedWith(list8, getHighSpeedVideoSizes), (java.lang.Iterable) pair3.component2());
            }
        }
        java.util.List<androidx.camera.camera2.pipe.CameraStream> list9 = plus;
        java.util.ArrayList arrayList18 = new java.util.ArrayList();
        java.util.ArrayList arrayList19 = new java.util.ArrayList();
        for (java.lang.Object obj7 : list9) {
            java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs5 = ((androidx.camera.camera2.pipe.CameraStream) obj7).getOutputs();
            if (!(outputs5 instanceof java.util.Collection) || !outputs5.isEmpty()) {
                java.util.Iterator<T> it10 = outputs5.iterator();
                while (it10.hasNext()) {
                    androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase4 = ((androidx.camera.camera2.pipe.OutputStream) it10.next()).getStreamUseCase();
                    long m629getVIDEO_RECORDvrKr8v8 = androidx.camera.camera2.pipe.OutputStream.StreamUseCase.INSTANCE.m629getVIDEO_RECORDvrKr8v8();
                    if (streamUseCase4 != null && androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m619equalsimpl0(streamUseCase4.m622unboximpl(), m629getVIDEO_RECORDvrKr8v8)) {
                        arrayList18.add(obj7);
                        break;
                    }
                }
            }
            arrayList19.add(obj7);
        }
        kotlin.Pair pair4 = new kotlin.Pair(arrayList18, arrayList19);
        java.util.List list10 = (java.util.List) pair4.component1();
        java.util.List list11 = (java.util.List) pair4.component2();
        if (!list10.isEmpty()) {
            plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list11, (java.lang.Iterable) list10);
        } else {
            java.util.ArrayList arrayList20 = new java.util.ArrayList();
            java.util.ArrayList arrayList21 = new java.util.ArrayList();
            for (java.lang.Object obj8 : list9) {
                java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs6 = ((androidx.camera.camera2.pipe.CameraStream) obj8).getOutputs();
                if (!(outputs6 instanceof java.util.Collection) || !outputs6.isEmpty()) {
                    java.util.Iterator<T> it11 = outputs6.iterator();
                    while (it11.hasNext()) {
                        androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint3 = ((androidx.camera.camera2.pipe.OutputStream) it11.next()).getStreamUseHint();
                        long m638getVIDEO_RECORD4VYZOf8 = androidx.camera.camera2.pipe.OutputStream.StreamUseHint.INSTANCE.m638getVIDEO_RECORD4VYZOf8();
                        if (streamUseHint3 != null && androidx.camera.camera2.pipe.OutputStream.StreamUseHint.m633equalsimpl0(streamUseHint3.m636unboximpl(), m638getVIDEO_RECORD4VYZOf8)) {
                            arrayList20.add(obj8);
                            break;
                        }
                    }
                }
                arrayList21.add(obj8);
            }
            kotlin.Pair pair5 = new kotlin.Pair(arrayList20, arrayList21);
            java.util.List list12 = (java.util.List) pair5.component1();
            java.util.List list13 = (java.util.List) pair5.component2();
            if (!list12.isEmpty()) {
                plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) list13, (java.lang.Iterable) list12);
            }
        }
        this.accessartificialFrame = plus;
        java.util.List<androidx.camera.camera2.pipe.CameraStream> streams2 = getStreams();
        java.util.ArrayList arrayList22 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(streams2, 10));
        java.util.Iterator<T> it12 = streams2.iterator();
        while (it12.hasNext()) {
            arrayList22.add(androidx.camera.camera2.pipe.StreamId.m755boximpl(((androidx.camera.camera2.pipe.CameraStream) it12.next()).getId()));
        }
        this.unwrapAs = kotlin.collections.CollectionsKt.toSet(arrayList22);
        this.getOutputFormats = linkedHashMap2;
        this.isOutputSupportedFor = kotlin.collections.CollectionsKt.sortedWith(arrayList, new java.util.Comparator() { // from class: androidx.camera.camera2.pipe.graph.StreamGraphImpl$special$$inlined$sortedBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                java.util.Iterator<T> it13 = ((androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig) t).getStreams().iterator();
                if (!it13.hasNext()) {
                    throw new java.util.NoSuchElementException();
                }
                java.lang.Integer valueOf = java.lang.Integer.valueOf(androidx.camera.camera2.pipe.graph.StreamGraphImpl.this.getStreams().indexOf((androidx.camera.camera2.pipe.CameraStream) it13.next()));
                while (it13.hasNext()) {
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(androidx.camera.camera2.pipe.graph.StreamGraphImpl.this.getStreams().indexOf((androidx.camera.camera2.pipe.CameraStream) it13.next()));
                    if (valueOf.compareTo(valueOf2) > 0) {
                        valueOf = valueOf2;
                    }
                }
                java.lang.Integer num2 = valueOf;
                java.util.Iterator<T> it14 = ((androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig) t2).getStreams().iterator();
                if (it14.hasNext()) {
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(androidx.camera.camera2.pipe.graph.StreamGraphImpl.this.getStreams().indexOf((androidx.camera.camera2.pipe.CameraStream) it14.next()));
                    while (it14.hasNext()) {
                        java.lang.Integer valueOf4 = java.lang.Integer.valueOf(androidx.camera.camera2.pipe.graph.StreamGraphImpl.this.getStreams().indexOf((androidx.camera.camera2.pipe.CameraStream) it14.next()));
                        if (valueOf3.compareTo(valueOf4) > 0) {
                            valueOf3 = valueOf4;
                        }
                    }
                    return kotlin.comparisons.ComparisonsKt.compareValues(num2, valueOf3);
                }
                throw new java.util.NoSuchElementException();
            }
        });
        this.toString = linkedHashMap4;
        java.util.List<androidx.camera.camera2.pipe.CameraStream> streams3 = getStreams();
        java.util.ArrayList arrayList23 = new java.util.ArrayList();
        java.util.Iterator<T> it13 = streams3.iterator();
        while (it13.hasNext()) {
            kotlin.collections.CollectionsKt.addAll(arrayList23, ((androidx.camera.camera2.pipe.CameraStream) it13.next()).getOutputs());
        }
        this.isOutputSupportedForhNQ4ISI = arrayList23;
        java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
        for (androidx.camera.camera2.pipe.CameraStream.Config config6 : this.getOutputStallDuration.getStreams()) {
            androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig = config6.getImageSourceConfig();
            if (imageSourceConfig != null) {
                androidx.camera.camera2.pipe.CameraStream cameraStream2 = this.getOutputFormats.get(config6);
                if (cameraStream2 == null) {
                    throw new java.lang.IllegalStateException("Required value was null.".toString());
                }
                androidx.camera.camera2.pipe.CameraStream cameraStream3 = cameraStream2;
                createMapBuilder.put(androidx.camera.camera2.pipe.StreamId.m755boximpl(cameraStream3.getId()), this.getOutputMinFrameDurationlomOqCM.createImageSource(cameraStream3, imageSourceConfig));
            }
        }
        this.getOutputStallDurationlomOqCM = kotlin.collections.MapsKt.build(createMapBuilder);
    }

    /* renamed from: getCameraMetadata, reason: from getter */
    public final androidx.camera.camera2.pipe.CameraMetadata getGetOutputSizes() {
        return this.getOutputSizes;
    }

    /* renamed from: getGraphConfig, reason: from getter */
    public final androidx.camera.camera2.pipe.CameraGraph.Config getGetOutputStallDuration() {
        return this.getOutputStallDuration;
    }

    /* renamed from: getImageSources, reason: from getter */
    public final androidx.camera.camera2.pipe.media.ImageSources getGetOutputMinFrameDurationlomOqCM() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public final java.util.List<androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig> getOutputConfigs$camera_camera2_pipe() {
        return this.isOutputSupportedFor;
    }

    public final java.util.Map<androidx.camera.camera2.pipe.OutputStream, androidx.camera.camera2.pipe.graph.StreamGraphImpl.OutputConfig> getOutputConfigMap$camera_camera2_pipe() {
        return this.toString;
    }

    public final java.util.Map<androidx.camera.camera2.pipe.StreamId, androidx.camera.camera2.pipe.media.ImageSource> getImageSourceMap$camera_camera2_pipe() {
        return this.getOutputStallDurationlomOqCM;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public final java.util.List<androidx.camera.camera2.pipe.InputStream> getInputs() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public final java.util.List<androidx.camera.camera2.pipe.CameraStream> getStreams() {
        return this.accessartificialFrame;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public final java.util.Set<androidx.camera.camera2.pipe.StreamId> getStreamIds() {
        return this.unwrapAs;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public final java.util.List<androidx.camera.camera2.pipe.OutputStream> getOutputs() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    public final androidx.camera.camera2.pipe.CameraStream get(androidx.camera.camera2.pipe.CameraStream.Config config) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        return this.getOutputFormats.get(config);
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    /* renamed from: getOutputLatency-IL232MI */
    public final androidx.camera.camera2.pipe.StreamGraph.OutputLatency mo751getOutputLatencyIL232MI(int streamId, androidx.camera.camera2.pipe.OutputId outputId) {
        androidx.camera.camera2.pipe.StreamGraph.OutputLatency mo273getOutputLatencyn5Pu2dI = this.getOutputSizeshNQ4ISI.get().mo273getOutputLatencyn5Pu2dI(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
        if (mo273getOutputLatencyn5Pu2dI != null) {
            return mo273getOutputLatencyn5Pu2dI;
        }
        androidx.camera.camera2.pipe.CameraStream cameraStream = m748getaKI5c8E(streamId);
        androidx.camera.camera2.pipe.OutputStream outputStream = outputId != null ? m749getiYJqvbA(outputId.m542unboximpl()) : null;
        if (cameraStream == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("No stream found for given streamId ");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(streamId));
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (cameraStream.getOutputs().size() == 1) {
            outputStream = (androidx.camera.camera2.pipe.OutputStream) kotlin.collections.CollectionsKt.single((java.util.List) cameraStream.getOutputs());
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        } else if (outputStream == null) {
            throw new java.lang.IllegalStateException("Output must be specified for MultiResolution use case. No output found for given outputId ".concat(java.lang.String.valueOf(outputId)).toString());
        }
        androidx.camera.camera2.pipe.CameraStreamConfigurationMap streamConfigurationMap = androidx.camera.camera2.pipe.CameraMetadata.INSTANCE.getStreamConfigurationMap(this.getOutputSizes);
        java.lang.Long valueOf = streamConfigurationMap != null ? java.lang.Long.valueOf(streamConfigurationMap.mo4getOutputStallDurationlomOqCM(outputStream.getFormat(), outputStream.getSize())) : null;
        if (valueOf != null) {
            return new androidx.camera.camera2.pipe.StreamGraph.OutputLatency(valueOf.longValue(), 0L);
        }
        return null;
    }

    @Override // androidx.camera.camera2.pipe.StreamGraph
    /* renamed from: getImageSource-aKI5c8E */
    public final androidx.camera.camera2.pipe.media.ImageSource mo750getImageSourceaKI5c8E(int streamId) {
        return this.getOutputStallDurationlomOqCM.get(androidx.camera.camera2.pipe.StreamId.m755boximpl(streamId));
    }

    /* renamed from: getCameraStreamConfig-aKI5c8E, reason: not valid java name */
    public final androidx.camera.camera2.pipe.CameraStream.Config m939getCameraStreamConfigaKI5c8E(int streamId) {
        java.lang.Object obj;
        java.util.Iterator<T> it = this.getOutputFormats.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (androidx.camera.camera2.pipe.StreamId.m758equalsimpl0(((androidx.camera.camera2.pipe.CameraStream) ((java.util.Map.Entry) obj).getValue()).getId(), streamId)) {
                break;
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry != null) {
            return (androidx.camera.camera2.pipe.CameraStream.Config) entry.getKey();
        }
        return null;
    }

    @kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b(\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b*\u0010!R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b,\u0010-R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u00100R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u00101\u001a\u0004\b2\u00103R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010:\u001a\u0004\b;\u0010<R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010@\u001a\u0004\bA\u0010BR \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010C\u001a\u0004\bD\u0010ER \u0010H\u001a\b\u0012\u0004\u0012\u00020G0F8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bH\u0010C\u001a\u0004\bI\u0010ER\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020G0\u001a8G¢\u0006\u0006\u001a\u0004\bJ\u0010ER\u0011\u0010O\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010Q\u001a\u00020L8G¢\u0006\u0006\u001a\u0004\bP\u0010N"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$OutputConfig;", "", "Landroidx/camera/camera2/pipe/graph/OutputConfigId;", "id", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "", "groupNumber", "Landroid/hardware/camera2/params/OutputConfiguration;", "externalOutputConfig", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "deferredOutputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "<init>", "(ILandroid/util/Size;ILjava/lang/String;Ljava/lang/Integer;Landroid/hardware/camera2/params/OutputConfiguration;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getId-hoCEiqs", "()I", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "getFormat-8FPWQzE", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Ljava/lang/Integer;", "getGroupNumber", "()Ljava/lang/Integer;", "Landroid/hardware/camera2/params/OutputConfiguration;", "getExternalOutputConfig", "()Landroid/hardware/camera2/params/OutputConfiguration;", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getDeferredOutputType", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "getMirrorMode-dO1_9xk", "()Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getTimestampBase-pcPfPbY", "()Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getDynamicRangeProfile-OoVcG5w", "()Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "getStreamUseCase-8x2ez34", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-HIPxoCc", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "Ljava/util/List;", "getSensorPixelModes", "()Ljava/util/List;", "", "Landroidx/camera/camera2/pipe/CameraStream;", "streamBuilder", "getStreamBuilder$camera_camera2_pipe", "getStreams", "streams", "", "getDeferrable", "()Z", "deferrable", "getSurfaceSharing", "surfaceSharing"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputConfig {
        private final java.lang.String camera;
        private final androidx.camera.camera2.pipe.OutputStream.OutputType deferredOutputType;
        private final androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final android.hardware.camera2.params.OutputConfiguration externalOutputConfig;
        private final int format;
        private final java.lang.Integer groupNumber;
        private final int id;
        private final androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode;
        private final java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes;
        private final android.util.Size size;
        private final java.util.List<androidx.camera.camera2.pipe.CameraStream> streamBuilder;
        private final androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase;
        private final androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint;
        private final androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase;

        private OutputConfig(int i, android.util.Size size, int i2, java.lang.String str, java.lang.Integer num, android.hardware.camera2.params.OutputConfiguration outputConfiguration, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.id = i;
            this.size = size;
            this.format = i2;
            this.camera = str;
            this.groupNumber = num;
            this.externalOutputConfig = outputConfiguration;
            this.deferredOutputType = outputType;
            this.mirrorMode = mirrorMode;
            this.timestampBase = timestampBase;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.streamUseHint = streamUseHint;
            this.sensorPixelModes = list;
            this.streamBuilder = new java.util.ArrayList();
        }

        /* renamed from: getId-hoCEiqs, reason: not valid java name and from getter */
        public final int getId() {
            return this.id;
        }

        public final android.util.Size getSize() {
            return this.size;
        }

        /* renamed from: getFormat-8FPWQzE, reason: not valid java name and from getter */
        public final int getFormat() {
            return this.format;
        }

        /* renamed from: getCamera-Dz_R5H8, reason: not valid java name and from getter */
        public final java.lang.String getCamera() {
            return this.camera;
        }

        public final java.lang.Integer getGroupNumber() {
            return this.groupNumber;
        }

        public final android.hardware.camera2.params.OutputConfiguration getExternalOutputConfig() {
            return this.externalOutputConfig;
        }

        public final androidx.camera.camera2.pipe.OutputStream.OutputType getDeferredOutputType() {
            return this.deferredOutputType;
        }

        /* renamed from: getMirrorMode-dO1_9xk, reason: not valid java name and from getter */
        public final androidx.camera.camera2.pipe.OutputStream.MirrorMode getMirrorMode() {
            return this.mirrorMode;
        }

        /* renamed from: getTimestampBase-pcPfPbY, reason: not valid java name and from getter */
        public final androidx.camera.camera2.pipe.OutputStream.TimestampBase getTimestampBase() {
            return this.timestampBase;
        }

        /* renamed from: getDynamicRangeProfile-OoVcG5w, reason: not valid java name and from getter */
        public final androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        /* renamed from: getStreamUseCase-8x2ez34, reason: not valid java name and from getter */
        public final androidx.camera.camera2.pipe.OutputStream.StreamUseCase getStreamUseCase() {
            return this.streamUseCase;
        }

        /* renamed from: getStreamUseHint-HIPxoCc, reason: not valid java name and from getter */
        public final androidx.camera.camera2.pipe.OutputStream.StreamUseHint getStreamUseHint() {
            return this.streamUseHint;
        }

        public final java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> getSensorPixelModes() {
            return this.sensorPixelModes;
        }

        public final java.util.List<androidx.camera.camera2.pipe.CameraStream> getStreamBuilder$camera_camera2_pipe() {
            return this.streamBuilder;
        }

        public final java.util.List<androidx.camera.camera2.pipe.CameraStream> getStreams() {
            return this.streamBuilder;
        }

        public final boolean getDeferrable() {
            return this.deferredOutputType != null;
        }

        public final boolean getSurfaceSharing() {
            return this.streamBuilder.size() > 1;
        }

        public final java.lang.String toString() {
            return androidx.camera.camera2.pipe.graph.OutputConfigId.m925toStringimpl(this.id);
        }

        public /* synthetic */ OutputConfig(int i, android.util.Size size, int i2, java.lang.String str, java.lang.Integer num, android.hardware.camera2.params.OutputConfiguration outputConfiguration, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, size, i2, str, num, outputConfiguration, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0007\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u001a\u0010\t\u001a\u00020\b8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000f\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0011\u0010-\u001a\u0004\b.\u0010/R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0015\u00103\u001a\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0017@\u0017X\u0097.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$OutputStreamImpl;", "Landroidx/camera/camera2/pipe/OutputStream;", "Landroidx/camera/camera2/pipe/OutputId;", "id", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "<init>", "(ILandroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getId-4LaLFng", "()I", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "getFormat-8FPWQzE", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "getMirrorMode-dO1_9xk", "()Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getTimestampBase-pcPfPbY", "()Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getDynamicRangeProfile-OoVcG5w", "()Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "getStreamUseCase-8x2ez34", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getOutputType", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-HIPxoCc", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "Landroidx/camera/camera2/pipe/CameraStream;", "stream", "Landroidx/camera/camera2/pipe/CameraStream;", "getStream", "()Landroidx/camera/camera2/pipe/CameraStream;", "setStream", "(Landroidx/camera/camera2/pipe/CameraStream;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputStreamImpl implements androidx.camera.camera2.pipe.OutputStream {
        private final java.lang.String camera;
        private final androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final int format;
        private final int id;
        private final androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode;
        private final androidx.camera.camera2.pipe.OutputStream.OutputType outputType;
        private final android.util.Size size;
        public androidx.camera.camera2.pipe.CameraStream stream;
        private final androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase;
        private final androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint;
        private final androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase;

        private OutputStreamImpl(int i, android.util.Size size, int i2, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.id = i;
            this.size = size;
            this.format = i2;
            this.camera = str;
            this.mirrorMode = mirrorMode;
            this.timestampBase = timestampBase;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.outputType = outputType;
            this.streamUseHint = streamUseHint;
        }

        public /* synthetic */ OutputStreamImpl(int i, android.util.Size size, int i2, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, size, i2, str, (i3 & 16) != 0 ? null : mirrorMode, (i3 & 32) != 0 ? null : timestampBase, (i3 & 64) != 0 ? null : dynamicRangeProfile, (i3 & 128) != 0 ? null : streamUseCase, (i3 & 256) != 0 ? null : outputType, (i3 & 512) != 0 ? null : streamUseHint, null);
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getId-4LaLFng, reason: from getter */
        public final int getId() {
            return this.id;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public final android.util.Size getSize() {
            return this.size;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getFormat-8FPWQzE, reason: from getter */
        public final int getFormat() {
            return this.format;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getCamera-Dz_R5H8, reason: from getter */
        public final java.lang.String getCamera() {
            return this.camera;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getMirrorMode-dO1_9xk, reason: from getter */
        public final androidx.camera.camera2.pipe.OutputStream.MirrorMode getMirrorMode() {
            return this.mirrorMode;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getTimestampBase-pcPfPbY, reason: from getter */
        public final androidx.camera.camera2.pipe.OutputStream.TimestampBase getTimestampBase() {
            return this.timestampBase;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getDynamicRangeProfile-OoVcG5w, reason: from getter */
        public final androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile getDynamicRangeProfile() {
            return this.dynamicRangeProfile;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getStreamUseCase-8x2ez34, reason: from getter */
        public final androidx.camera.camera2.pipe.OutputStream.StreamUseCase getStreamUseCase() {
            return this.streamUseCase;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public final androidx.camera.camera2.pipe.OutputStream.OutputType getOutputType() {
            return this.outputType;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        /* renamed from: getStreamUseHint-HIPxoCc, reason: from getter */
        public final androidx.camera.camera2.pipe.OutputStream.StreamUseHint getStreamUseHint() {
            return this.streamUseHint;
        }

        @Override // androidx.camera.camera2.pipe.OutputStream
        public final androidx.camera.camera2.pipe.CameraStream getStream() {
            androidx.camera.camera2.pipe.CameraStream cameraStream = this.stream;
            if (cameraStream != null) {
                return cameraStream;
            }
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
            return null;
        }

        public final void setStream(androidx.camera.camera2.pipe.CameraStream cameraStream) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStream, "");
            this.stream = cameraStream;
        }

        public final java.lang.String toString() {
            return androidx.camera.camera2.pipe.OutputId.m541toStringimpl(getId());
        }

        public /* synthetic */ OutputStreamImpl(int i, android.util.Size size, int i2, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, size, i2, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, outputType, streamUseHint);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00048\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$InputStreamImpl;", "Landroidx/camera/camera2/pipe/InputStream;", "Landroidx/camera/camera2/pipe/InputStreamId;", "p0", "", "p1", "Landroidx/camera/camera2/pipe/StreamFormat;", "p2", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getId-m1bwn9M", "()I", "Camera2StreamConfigurationMap", "getMaxImages", "getHighResolutionOutputSizeshNQ4ISI", "getFormat-8FPWQzE", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class InputStreamImpl implements androidx.camera.camera2.pipe.InputStream {

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final int getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final int getHighSpeedVideoFpsRanges;
        private final int getHighSpeedVideoFpsRangesFor;

        private InputStreamImpl(int i, int i2, int i3) {
            this.getHighSpeedVideoFpsRangesFor = i;
            this.getHighResolutionOutputSizeshNQ4ISI = i2;
            this.getHighSpeedVideoFpsRanges = i3;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* renamed from: getId-m1bwn9M, reason: from getter */
        public final int getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* renamed from: getMaxImages, reason: from getter */
        public final int getGetHighResolutionOutputSizeshNQ4ISI() {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }

        @Override // androidx.camera.camera2.pipe.InputStream
        /* renamed from: getFormat-8FPWQzE, reason: from getter */
        public final int getGetHighSpeedVideoFpsRanges() {
            return this.getHighSpeedVideoFpsRanges;
        }

        public /* synthetic */ InputStreamImpl(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, i3);
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamGraph(");
        sb.append(this.getOutputFormats);
        sb.append(')');
        return sb.toString();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        java.util.Iterator<androidx.camera.camera2.pipe.media.ImageSource> it = this.getOutputStallDurationlomOqCM.values().iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\n\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\r\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR$\u0010$\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020%0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010\u001eR$\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020 0\u001fj\b\u0012\u0004\u0012\u00020 `!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#"}, d2 = {"Landroidx/camera/camera2/pipe/graph/StreamGraphImpl$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamId;", "nextStreamId-ptHMqGs$camera_camera2_pipe", "()I", "nextStreamId", "Landroidx/camera/camera2/pipe/OutputId;", "nextOutputId-4LaLFng$camera_camera2_pipe", "nextOutputId", "Landroidx/camera/camera2/pipe/InputStreamId;", "nextInputId-m1bwn9M$camera_camera2_pipe", "nextInputId", "Landroidx/camera/camera2/pipe/graph/OutputConfigId;", "nextConfigId-hoCEiqs$camera_camera2_pipe", "nextConfigId", "", "nextGroupId$camera_camera2_pipe", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoSizesFor", "Lkotlinx/atomicfu/AtomicInt;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getInputFormats", "Ljava/util/List;", "Ljava/util/Comparator;", "Landroidx/camera/camera2/pipe/CameraStream;", "Lkotlin/getOutputStallDuration;", "getInputSizeshNQ4ISI", "Ljava/util/Comparator;", "getOutputFormats", "Landroidx/camera/camera2/pipe/StreamFormat;", "getOutputMinFrameDuration"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: nextStreamId-ptHMqGs$camera_camera2_pipe, reason: not valid java name */
        public final int m943nextStreamIdptHMqGs$camera_camera2_pipe() {
            return androidx.camera.camera2.pipe.StreamId.m756constructorimpl(androidx.camera.camera2.pipe.graph.StreamGraphImpl.getHighSpeedVideoSizesFor.incrementAndGet());
        }

        /* renamed from: nextOutputId-4LaLFng$camera_camera2_pipe, reason: not valid java name */
        public final int m942nextOutputId4LaLFng$camera_camera2_pipe() {
            return androidx.camera.camera2.pipe.OutputId.m537constructorimpl(androidx.camera.camera2.pipe.graph.StreamGraphImpl.getHighResolutionOutputSizeshNQ4ISI.incrementAndGet());
        }

        /* renamed from: nextInputId-m1bwn9M$camera_camera2_pipe, reason: not valid java name */
        public final int m941nextInputIdm1bwn9M$camera_camera2_pipe() {
            return androidx.camera.camera2.pipe.InputStreamId.m518constructorimpl(androidx.camera.camera2.pipe.graph.StreamGraphImpl.getHighSpeedVideoFpsRanges.incrementAndGet());
        }

        /* renamed from: nextConfigId-hoCEiqs$camera_camera2_pipe, reason: not valid java name */
        public final int m940nextConfigIdhoCEiqs$camera_camera2_pipe() {
            return androidx.camera.camera2.pipe.graph.OutputConfigId.m921constructorimpl(androidx.camera.camera2.pipe.graph.StreamGraphImpl.getHighSpeedVideoFpsRangesFor.incrementAndGet());
        }

        public final int nextGroupId$camera_camera2_pipe() {
            return androidx.camera.camera2.pipe.graph.StreamGraphImpl.Camera2StreamConfigurationMap.incrementAndGet();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
