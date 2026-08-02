package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 U2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001UBe\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010\"\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u001bH\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u001bH\u0016¢\u0006\u0004\b&\u0010%J)\u0010+\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010(*\u00020'2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\t\u001a\u00020\b8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b5\u00106R\u0014\u00107\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b4\u00103R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000e\u00108\u001a\u0004\b9\u0010:R \u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010>\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010@\u001a\u00020\u00158\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010?R&\u0010=\u001a\u0014\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110A0\u000f8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b>\u0010<R\u0014\u0010D\u001a\u00020\u00138WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR/\u0010M\u001a\u0004\u0018\u00010E2\b\u0010F\u001a\u0004\u0018\u00010E8W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR/\u0010T\u001a\u0004\u0018\u00010N2\b\u0010F\u001a\u0004\u0018\u00010N8W@WX\u0097\u008e\u0002¢\u0006\u0012\n\u0004\bO\u0010H\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidMultiResolutionImageReader;", "Landroidx/camera/camera2/pipe/media/ImageReaderWrapper;", "Landroid/media/ImageReader$OnImageAvailableListener;", "Landroidx/camera/camera2/pipe/CameraOnActiveOutputSurfacesListener;", "Landroid/hardware/camera2/MultiResolutionImageReader;", "multiResolutionImageReader", "Landroidx/camera/camera2/pipe/StreamFormat;", "streamFormat", "", "capacity", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfigurations", "", "Landroid/hardware/camera2/params/MultiResolutionStreamInfo;", "Landroidx/camera/camera2/pipe/OutputId;", "streamInfoToOutputIdMap", "Landroid/view/Surface;", "surfaceToOutputIdMap", "", "concurrentOutputsEnabled", "<init>", "(Landroid/hardware/camera2/MultiResolutionImageReader;IIILjava/util/List;Ljava/util/Map;Ljava/util/Map;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/media/ImageReader;", "reader", "", "onImageAvailable", "(Landroid/media/ImageReader;)V", "activeOutputSurfaces", "", "timestamp", "frameNumber", "onActiveOutputSurfaces", "(Ljava/util/List;JJ)V", "close", "()V", "flush", "", "T", "Lkotlin/reflect/KClass;", "type", "unwrapAs", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "Landroid/hardware/camera2/MultiResolutionImageReader;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "getCapacity", "()I", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getOutputConfigurations$camera_camera2_pipe", "()Ljava/util/List;", "getHighSpeedVideoSizesFor", "Ljava/util/Map;", "getOutputMinFrameDuration", "getHighSpeedVideoSizes", "Z", "getOutputFormats", "", "getSurface", "()Landroid/view/Surface;", "surface", "Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;", "<set-?>", "onImageListener$delegate", "Lkotlinx/atomicfu/AtomicRef;", "getOnImageListener", "()Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;", "setOnImageListener", "(Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;)V", "onImageListener", "Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;", "onExpectedOutputsListener$delegate", "getOnExpectedOutputsListener", "()Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;", "setOnExpectedOutputsListener", "(Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;)V", "onExpectedOutputsListener", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidMultiResolutionImageReader implements androidx.camera.camera2.pipe.media.ImageReaderWrapper, android.media.ImageReader.OnImageAvailableListener, androidx.camera.camera2.pipe.CameraOnActiveOutputSurfacesListener {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader.Companion INSTANCE = new androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.hardware.camera2.MultiResolutionImageReader getHighResolutionOutputSizeshNQ4ISI;
    private final int capacity;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final boolean getOutputFormats;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<android.view.Surface, java.util.Set<androidx.camera.camera2.pipe.OutputId>> getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final java.util.Map<android.hardware.camera2.params.MultiResolutionStreamInfo, androidx.camera.camera2.pipe.OutputId> Camera2StreamConfigurationMap;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final java.util.Map<android.view.Surface, androidx.camera.camera2.pipe.OutputId> getHighSpeedVideoSizes;

    /* renamed from: onExpectedOutputsListener$delegate, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef onExpectedOutputsListener;

    /* renamed from: onImageListener$delegate, reason: from kotlin metadata */
    private final kotlinx.atomicfu.AtomicRef onImageListener;
    private final java.util.List<android.hardware.camera2.params.OutputConfiguration> outputConfigurations;

    private AndroidMultiResolutionImageReader(android.hardware.camera2.MultiResolutionImageReader multiResolutionImageReader, int i, int i2, int i3, java.util.List<android.hardware.camera2.params.OutputConfiguration> list, java.util.Map<android.hardware.camera2.params.MultiResolutionStreamInfo, androidx.camera.camera2.pipe.OutputId> map, java.util.Map<android.view.Surface, androidx.camera.camera2.pipe.OutputId> map2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiResolutionImageReader, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = multiResolutionImageReader;
        this.getHighSpeedVideoFpsRanges = i;
        this.capacity = i2;
        this.getHighSpeedVideoFpsRangesFor = i3;
        this.outputConfigurations = list;
        this.Camera2StreamConfigurationMap = map;
        this.getHighSpeedVideoSizes = map2;
        this.getOutputFormats = z;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.collections.MapsKt.mapCapacity(map2.size()));
        java.util.Iterator<T> it = map2.entrySet().iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), kotlin.collections.SetsKt.setOf(entry.getValue()));
        }
        this.getOutputMinFrameDuration = linkedHashMap;
        this.onImageListener = kotlinx.atomicfu.AtomicFU.atomic((java.lang.Object) null);
        this.onExpectedOutputsListener = kotlinx.atomicfu.AtomicFU.atomic((java.lang.Object) null);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final int getCapacity() {
        return this.capacity;
    }

    public final java.util.List<android.hardware.camera2.params.OutputConfiguration> getOutputConfigurations$camera_camera2_pipe() {
        return this.outputConfigurations;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final android.view.Surface getSurface() {
        android.view.Surface surface = this.getHighResolutionOutputSizeshNQ4ISI.getSurface();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surface, "");
        return surface;
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener getOnImageListener() {
        return (androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener) this.onImageListener.getValue();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final void setOnImageListener(androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener onImageListener) {
        this.onImageListener.setValue(onImageListener);
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener getOnExpectedOutputsListener() {
        return (androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener) this.onExpectedOutputsListener.getValue();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final void setOnExpectedOutputsListener(androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener) {
        this.onExpectedOutputsListener.setValue(onExpectedOutputsListener);
    }

    @Override // android.media.ImageReader.OnImageAvailableListener
    public final void onImageAvailable(android.media.ImageReader reader) {
        androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener;
        android.media.Image acquireNextImage = reader != null ? reader.acquireNextImage() : null;
        if (acquireNextImage != null) {
            androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener onImageListener = getOnImageListener();
            if (onImageListener == null) {
                acquireNextImage.close();
                return;
            }
            android.hardware.camera2.params.MultiResolutionStreamInfo streamInfoForImageReader = this.getHighResolutionOutputSizeshNQ4ISI.getStreamInfoForImageReader(reader);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(streamInfoForImageReader, "");
            androidx.camera.camera2.pipe.OutputId outputId = this.Camera2StreamConfigurationMap.get(streamInfoForImageReader);
            if (outputId == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(this);
                sb.append(": Failed to find OutputId for ");
                sb.append(reader);
                sb.append(" based on streamInfo ");
                sb.append(streamInfoForImageReader);
                sb.append('!');
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            int m542unboximpl = outputId.m542unboximpl();
            if (!this.getOutputFormats && (onExpectedOutputsListener = getOnExpectedOutputsListener()) != null) {
                onExpectedOutputsListener.onExpectedOutputs(acquireNextImage.getTimestamp(), kotlin.collections.SetsKt.setOf(androidx.camera.camera2.pipe.OutputId.m536boximpl(m542unboximpl)));
            }
            onImageListener.mo999onImageAQuxepk(this.getHighSpeedVideoFpsRangesFor, m542unboximpl, new androidx.camera.camera2.pipe.media.AndroidImage(acquireNextImage));
        }
    }

    @Override // androidx.camera.camera2.pipe.CameraOnActiveOutputSurfacesListener
    public final void onActiveOutputSurfaces(java.util.List<? extends android.view.Surface> activeOutputSurfaces, long timestamp, long frameNumber) {
        java.util.Set<androidx.camera.camera2.pipe.OutputId> set;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activeOutputSurfaces, "");
        if (activeOutputSurfaces.size() == 1) {
            android.view.Surface surface = activeOutputSurfaces.get(0);
            java.util.Set<androidx.camera.camera2.pipe.OutputId> set2 = this.getOutputMinFrameDuration.get(surface);
            if (set2 == null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unrecognized active surface in ");
                sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(this.getHighSpeedVideoFpsRangesFor));
                sb.append(": ");
                sb.append(surface);
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
            set = set2;
        } else {
            java.util.List<? extends android.view.Surface> list = activeOutputSurfaces;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            for (android.view.Surface surface2 : list) {
                androidx.camera.camera2.pipe.OutputId outputId = this.getHighSpeedVideoSizes.get(surface2);
                if (outputId == null) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unrecognized active surface in ");
                    sb2.append((java.lang.Object) androidx.camera.camera2.pipe.StreamId.m760toStringimpl(this.getHighSpeedVideoFpsRangesFor));
                    sb2.append(": ");
                    sb2.append(surface2);
                    throw new java.lang.IllegalStateException(sb2.toString().toString());
                }
                arrayList.add(androidx.camera.camera2.pipe.OutputId.m536boximpl(outputId.m542unboximpl()));
            }
            set = kotlin.collections.CollectionsKt.toSet(arrayList);
        }
        androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener = getOnExpectedOutputsListener();
        if (onExpectedOutputsListener != null) {
            onExpectedOutputsListener.onExpectedOutputs(timestamp, set);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.getHighResolutionOutputSizeshNQ4ISI.close();
    }

    @Override // androidx.camera.camera2.pipe.media.ImageReaderWrapper
    public final void flush() {
        this.getHighResolutionOutputSizeshNQ4ISI.flush();
    }

    @Override // androidx.camera.camera2.pipe.UnsafeWrapper
    public final <T> T unwrapAs(kotlin.reflect.KClass<T> type) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(type, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader.class))) {
            return (T) this;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(type, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.hardware.camera2.MultiResolutionImageReader.class))) {
            return (T) this.getHighResolutionOutputSizeshNQ4ISI;
        }
        return null;
    }

    public final java.lang.String toString() {
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(this.Camera2StreamConfigurationMap.keySet(), null, "[", "]", 0, null, new kotlin.jvm.functions.Function1() { // from class: androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader.$r8$lambda$CcZsucrtffWMUgK8IVyj1ul4XOs((android.hardware.camera2.params.MultiResolutionStreamInfo) obj);
            }
        }, 25, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MultiResolutionImageReader@");
        java.lang.String num = java.lang.Integer.toString(super.hashCode(), kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        sb.append(num);
        sb.append('-');
        sb.append(androidx.camera.camera2.pipe.StreamFormat.m714getNameimpl(this.getHighSpeedVideoFpsRanges));
        sb.append('-');
        sb.append(joinToString$default);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0016JA\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/pipe/media/AndroidMultiResolutionImageReader$Companion;", "", "<init>", "()V", "", "outputFormat", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "", "Landroidx/camera/camera2/pipe/OutputStream;", "outputs", "capacity", "Ljava/util/concurrent/Executor;", "executor", "", "usageFlags", "", "enableConcurrentOutputs", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "plaformApiCompat", "Landroidx/camera/camera2/pipe/media/ImageReaderWrapper;", "create-wJp1_LU", "(IILjava/util/List;ILjava/util/concurrent/Executor;Ljava/lang/Long;ZLandroidx/camera/camera2/pipe/PlatformApiCompat;)Landroidx/camera/camera2/pipe/media/ImageReaderWrapper;", "create", "Landroidx/camera/camera2/pipe/CameraStream;", "cameraStream", "platformApiCompat", "(Landroidx/camera/camera2/pipe/CameraStream;ILjava/util/concurrent/Executor;Ljava/lang/Long;ZLandroidx/camera/camera2/pipe/PlatformApiCompat;)Landroidx/camera/camera2/pipe/media/ImageReaderWrapper;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ee  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x0164  */
        /* renamed from: create-wJp1_LU, reason: not valid java name */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final androidx.camera.camera2.pipe.media.ImageReaderWrapper m996createwJp1_LU(int outputFormat, int streamId, java.util.List<? extends androidx.camera.camera2.pipe.OutputStream> outputs, int capacity, java.util.concurrent.Executor executor, java.lang.Long usageFlags, boolean enableConcurrentOutputs, androidx.camera.camera2.pipe.PlatformApiCompat plaformApiCompat) {
            android.hardware.camera2.MultiResolutionImageReader multiResolutionImageReader;
            android.hardware.camera2.MultiResolutionImageReader multiResolutionImageReader2;
            java.util.List list;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputs, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            if (capacity <= 0) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Capacity (");
                sb.append(capacity);
                sb.append(") must be > 0");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            if (capacity > 54) {
                throw new java.lang.IllegalArgumentException("Capacity for creating new ImageSources is restricted to 54. Android has undocumented internal limits that are different depending on which device the MultiResolutionImageReader is created on.".toString());
            }
            if (enableConcurrentOutputs && (plaformApiCompat == null || !plaformApiCompat.isMultiResolutionConcurrentReadersEnabled())) {
                throw new java.lang.IllegalArgumentException("Concurrent MultiResolutionImageReaders are not supported on this device".toString());
            }
            if (usageFlags != null && android.os.Build.VERSION.SDK_INT < 36) {
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
            }
            java.util.List<? extends androidx.camera.camera2.pipe.OutputStream> list2 = outputs;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10)), 16));
            for (androidx.camera.camera2.pipe.OutputStream outputStream : list2) {
                kotlin.Pair pair = kotlin.TuplesKt.to(new android.hardware.camera2.params.MultiResolutionStreamInfo(outputStream.getSize().getWidth(), outputStream.getSize().getHeight(), outputStream.getCamera()), androidx.camera.camera2.pipe.OutputId.m536boximpl(outputStream.getId()));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            java.util.Set keySet = linkedHashMap.keySet();
            if (plaformApiCompat != null && plaformApiCompat.isMultiResolutionConcurrentReadersEnabled()) {
                multiResolutionImageReader = plaformApiCompat.buildMultiResolutionImageReader(keySet, outputFormat, capacity, usageFlags, java.lang.Boolean.valueOf(enableConcurrentOutputs));
            } else {
                if (usageFlags != null && android.os.Build.VERSION.SDK_INT >= 36) {
                    multiResolutionImageReader2 = new android.hardware.camera2.MultiResolutionImageReader(keySet, outputFormat, capacity, usageFlags.longValue());
                    java.util.Collection<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput = android.hardware.camera2.params.OutputConfiguration.createInstancesForMultiResolutionOutput(multiResolutionImageReader2);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createInstancesForMultiResolutionOutput, "");
                    list = kotlin.collections.CollectionsKt.toList(createInstancesForMultiResolutionOutput);
                    if (list.size() == outputs.size()) {
                        throw new java.lang.IllegalStateException("Check failed.");
                    }
                    java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
                    for (kotlin.Pair pair2 : kotlin.collections.CollectionsKt.zip(list, list2)) {
                        android.hardware.camera2.params.OutputConfiguration outputConfiguration = (android.hardware.camera2.params.OutputConfiguration) pair2.component1();
                        androidx.camera.camera2.pipe.OutputStream outputStream2 = (androidx.camera.camera2.pipe.OutputStream) pair2.component2();
                        android.view.Surface surface = outputConfiguration.getSurface();
                        if (surface == null) {
                            throw new java.lang.IllegalStateException("Required value was null.".toString());
                        }
                        createMapBuilder.put(surface, androidx.camera.camera2.pipe.OutputId.m536boximpl(outputStream2.getId()));
                    }
                    android.hardware.camera2.MultiResolutionImageReader multiResolutionImageReader3 = multiResolutionImageReader2;
                    androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader androidMultiResolutionImageReader = new androidx.camera.camera2.pipe.media.AndroidMultiResolutionImageReader(multiResolutionImageReader3, androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(outputFormat), capacity, streamId, list, linkedHashMap, kotlin.collections.MapsKt.build(createMapBuilder), enableConcurrentOutputs, null);
                    if (plaformApiCompat != null && plaformApiCompat.isMultiResolutionConcurrentReadersEnabled() && enableConcurrentOutputs) {
                        plaformApiCompat.setOnActiveOutputSurfacesListener(multiResolutionImageReader2, executor, androidMultiResolutionImageReader);
                    }
                    multiResolutionImageReader2.setOnImageAvailableListener(androidMultiResolutionImageReader, executor);
                    return androidMultiResolutionImageReader;
                }
                multiResolutionImageReader = new android.hardware.camera2.MultiResolutionImageReader(keySet, outputFormat, capacity);
            }
            multiResolutionImageReader2 = multiResolutionImageReader;
            java.util.Collection<android.hardware.camera2.params.OutputConfiguration> createInstancesForMultiResolutionOutput2 = android.hardware.camera2.params.OutputConfiguration.createInstancesForMultiResolutionOutput(multiResolutionImageReader2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createInstancesForMultiResolutionOutput2, "");
            list = kotlin.collections.CollectionsKt.toList(createInstancesForMultiResolutionOutput2);
            if (list.size() == outputs.size()) {
            }
        }

        public final androidx.camera.camera2.pipe.media.ImageReaderWrapper create(androidx.camera.camera2.pipe.CameraStream cameraStream, int capacity, java.util.concurrent.Executor executor, java.lang.Long usageFlags, boolean enableConcurrentOutputs, androidx.camera.camera2.pipe.PlatformApiCompat platformApiCompat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraStream, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executor, "");
            java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs = cameraStream.getOutputs();
            if (outputs.isEmpty()) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(cameraStream);
                sb.append(" outputs cannot be empty!");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            return m996createwJp1_LU(((androidx.camera.camera2.pipe.OutputStream) kotlin.collections.CollectionsKt.first((java.util.List) outputs)).getFormat(), cameraStream.getId(), outputs, capacity, executor, usageFlags, enableConcurrentOutputs, platformApiCompat);
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ java.lang.CharSequence $r8$lambda$CcZsucrtffWMUgK8IVyj1ul4XOs(android.hardware.camera2.params.MultiResolutionStreamInfo multiResolutionStreamInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(multiResolutionStreamInfo, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(multiResolutionStreamInfo.getPhysicalCameraId());
        sb.append(":w");
        sb.append(multiResolutionStreamInfo.getWidth());
        sb.append(io.ktor.util.date.GMTDateParser.HOURS);
        sb.append(multiResolutionStreamInfo.getHeight());
        return sb.toString();
    }

    public /* synthetic */ AndroidMultiResolutionImageReader(android.hardware.camera2.MultiResolutionImageReader multiResolutionImageReader, int i, int i2, int i3, java.util.List list, java.util.Map map, java.util.Map map2, boolean z, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(multiResolutionImageReader, i, i2, i3, list, map, map2, z);
    }
}
