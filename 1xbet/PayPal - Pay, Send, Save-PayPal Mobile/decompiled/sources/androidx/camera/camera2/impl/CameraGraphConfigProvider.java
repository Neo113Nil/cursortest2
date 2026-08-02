package androidx.camera.camera2.impl;

@androidx.camera.camera2.config.CameraScope
@kotlin.Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001EB[\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015Jk\u0010(\u001a\u00020%2\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0014\b\u0002\u0010#\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 2\u0014\b\u0002\u0010$\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"0 ¢\u0006\u0004\b&\u0010'J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u00101\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010,\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00103R\u0014\u00107\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010:\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010<\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010;R\u0016\u00108\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010=R\u0016\u0010?\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010>R\u0014\u0010/\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010AR\u0016\u0010D\u001a\u0004\u0018\u00010B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010C"}, d2 = {"Landroidx/camera/camera2/impl/CameraGraphConfigProvider;", "", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "callbackMap", "Landroidx/camera/camera2/impl/ComboRequestListener;", "requestListener", "Landroidx/camera/camera2/config/CameraConfig;", "cameraConfig", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "cameraQuirks", "Landroidx/camera/camera2/adapter/ZslControl;", "zslControl", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "templateParamsOverride", "Landroidx/camera/camera2/pipe/CameraMetadata;", "cameraMetadata", "Landroidx/camera/core/CameraXConfig;", "cameraXConfig", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "cameraInteropStateCallbackRepository", "<init>", "(Landroidx/camera/camera2/impl/CameraCallbackMap;Landroidx/camera/camera2/impl/ComboRequestListener;Landroidx/camera/camera2/config/CameraConfig;Landroidx/camera/camera2/compat/quirk/CameraQuirks;Landroidx/camera/camera2/adapter/ZslControl;Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;Landroidx/camera/camera2/pipe/CameraMetadata;Landroidx/camera/core/CameraXConfig;Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;)V", "Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "operatingMode", "Landroidx/camera/core/impl/SessionConfig;", "sessionConfig", "", "setOutputType", "Landroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;", "graphStateToCameraStateAdapter", "", "camera2ExtensionMode", "", "Landroidx/camera/core/impl/DeferrableSurface;", "", "surfaceToStreamUseCaseMap", "surfaceToStreamUseHintMap", "Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "create-79VDu0o", "(ILandroidx/camera/core/impl/SessionConfig;ZLandroidx/camera/camera2/adapter/GraphStateToCameraStateAdapter;Ljava/lang/Integer;Ljava/util/Map;Ljava/util/Map;)Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "create", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/camera/camera2/impl/CameraCallbackMap;", "getHighSpeedVideoSizes", "getOutputMinFrameDuration", "Landroidx/camera/camera2/impl/ComboRequestListener;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/camera/camera2/config/CameraConfig;", "Landroidx/camera/camera2/compat/quirk/CameraQuirks;", "getHighSpeedVideoFpsRanges", "getOutputSizeshNQ4ISI", "Landroidx/camera/camera2/adapter/ZslControl;", "Camera2StreamConfigurationMap", "getInputFormats", "Landroidx/camera/camera2/compat/workaround/TemplateParamsOverride;", "getInputSizeshNQ4ISI", "Landroidx/camera/camera2/pipe/CameraMetadata;", "getOutputFormats", "Landroidx/camera/core/CameraXConfig;", "Landroidx/camera/camera2/impl/CameraInteropStateCallbackRepository;", "getHighSpeedVideoSizesFor", "Landroidx/camera/camera2/compat/workaround/CloseCameraOnCameraGraphClose;", "Landroidx/camera/camera2/compat/workaround/CloseCameraOnCameraGraphClose;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "getOutputStallDuration", "CameraGraphCreationResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraGraphConfigProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository getHighSpeedVideoSizesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.config.CameraConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.camera.camera2.pipe.CameraMetadata getOutputFormats;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.CameraCallbackMap getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.quirk.CameraQuirks getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.CloseCameraOnCameraGraphClose getOutputMinFrameDuration;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private final androidx.camera.camera2.compat.workaround.TemplateParamsOverride getInputSizeshNQ4ISI;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.core.CameraXConfig getInputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final android.hardware.camera2.params.DynamicRangeProfiles getOutputStallDuration;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final androidx.camera.camera2.impl.ComboRequestListener getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.camera.camera2.adapter.ZslControl Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CameraGraphConfigProvider(androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener, androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository) {
        androidx.camera.camera2.compat.DynamicRangeProfilesCompat fromCameraMetaData;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraCallbackMap, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comboRequestListener, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraQuirks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zslControl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(templateParamsOverride, "");
        this.getHighSpeedVideoSizes = cameraCallbackMap;
        this.getHighResolutionOutputSizeshNQ4ISI = comboRequestListener;
        this.getHighSpeedVideoFpsRangesFor = cameraConfig;
        this.getHighSpeedVideoFpsRanges = cameraQuirks;
        this.Camera2StreamConfigurationMap = zslControl;
        this.getInputSizeshNQ4ISI = templateParamsOverride;
        this.getOutputFormats = cameraMetadata;
        this.getInputFormats = cameraXConfig;
        this.getHighSpeedVideoSizesFor = cameraInteropStateCallbackRepository;
        this.getOutputMinFrameDuration = new androidx.camera.camera2.compat.workaround.CloseCameraOnCameraGraphClose();
        android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles = null;
        if (android.os.Build.VERSION.SDK_INT >= 33 && cameraMetadata != null && (fromCameraMetaData = androidx.camera.camera2.compat.DynamicRangeProfilesCompat.INSTANCE.fromCameraMetaData(cameraMetadata)) != null) {
            dynamicRangeProfiles = fromCameraMetaData.toDynamicRangeProfiles();
        }
        this.getOutputStallDuration = dynamicRangeProfiles;
    }

    public /* synthetic */ CameraGraphConfigProvider(androidx.camera.camera2.impl.CameraCallbackMap cameraCallbackMap, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener, androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks, androidx.camera.camera2.adapter.ZslControl zslControl, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata, androidx.camera.core.CameraXConfig cameraXConfig, androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cameraCallbackMap, comboRequestListener, cameraConfig, cameraQuirks, zslControl, templateParamsOverride, cameraMetadata, (i & 128) != 0 ? null : cameraXConfig, (i & 256) != 0 ? null : cameraInteropStateCallbackRepository);
    }

    @kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b\u001d\u0010\r"}, d2 = {"Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "Landroidx/camera/core/impl/DeferrableSurface;", "streamConfigMap", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Ljava/util/Map;)V", "component1", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;", "component2", "()Ljava/util/Map;", "copy", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Ljava/util/Map;)Landroidx/camera/camera2/impl/CameraGraphConfigProvider$CameraGraphCreationResult;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getConfig", "Ljava/util/Map;", "getStreamConfigMap"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CameraGraphCreationResult {
        private final androidx.camera.camera2.pipe.CameraGraph.Config config;
        private final java.util.Map<androidx.camera.camera2.pipe.CameraStream.Config, androidx.camera.core.impl.DeferrableSurface> streamConfigMap;

        /* JADX WARN: Multi-variable type inference failed */
        public CameraGraphCreationResult(androidx.camera.camera2.pipe.CameraGraph.Config config, java.util.Map<androidx.camera.camera2.pipe.CameraStream.Config, ? extends androidx.camera.core.impl.DeferrableSurface> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.config = config;
            this.streamConfigMap = map;
        }

        public final androidx.camera.camera2.pipe.CameraGraph.Config getConfig() {
            return this.config;
        }

        public final java.util.Map<androidx.camera.camera2.pipe.CameraStream.Config, androidx.camera.core.impl.DeferrableSurface> getStreamConfigMap() {
            return this.streamConfigMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraGraphCreationResult(config=");
            sb.append(this.config);
            sb.append(", streamConfigMap=");
            sb.append(this.streamConfigMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.config.hashCode() * 31) + this.streamConfigMap.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult)) {
                return false;
            }
            androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult = (androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.config, cameraGraphCreationResult.config) && kotlin.jvm.internal.Intrinsics.areEqual(this.streamConfigMap, cameraGraphCreationResult.streamConfigMap);
        }

        public final androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult copy(androidx.camera.camera2.pipe.CameraGraph.Config config, java.util.Map<androidx.camera.camera2.pipe.CameraStream.Config, ? extends androidx.camera.core.impl.DeferrableSurface> streamConfigMap) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streamConfigMap, "");
            return new androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult(config, streamConfigMap);
        }

        public final java.util.Map<androidx.camera.camera2.pipe.CameraStream.Config, androidx.camera.core.impl.DeferrableSurface> component2() {
            return this.streamConfigMap;
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraGraph.Config getConfig() {
            return this.config;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult copy$default(androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult cameraGraphCreationResult, androidx.camera.camera2.pipe.CameraGraph.Config config, java.util.Map map, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                config = cameraGraphCreationResult.config;
            }
            if ((i & 2) != 0) {
                map = cameraGraphCreationResult.streamConfigMap;
            }
            return cameraGraphCreationResult.copy(config, map);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d6, code lost:
    
        if (kotlin.collections.ArraysKt.contains(r2, r10.m622unboximpl()) == true) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0192  */
    /* JADX WARN: Type inference failed for: r3v19, types: [androidx.camera.camera2.pipe.CameraStream$Config, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.camera.camera2.pipe.CameraStream$Config] */
    /* renamed from: create-79VDu0o, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult m98create79VDu0o(int operatingMode, androidx.camera.core.impl.SessionConfig sessionConfig, boolean setOutputType, androidx.camera.camera2.adapter.GraphStateToCameraStateAdapter graphStateToCameraStateAdapter, java.lang.Integer camera2ExtensionMode, java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> surfaceToStreamUseCaseMap, java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> surfaceToStreamUseHintMap) {
        androidx.camera.camera2.impl.CameraGraphConfigProvider cameraGraphConfigProvider;
        int i;
        androidx.camera.core.impl.SessionConfig sessionConfig2;
        java.lang.Integer num;
        android.util.Range<java.lang.Integer> expectedFrameRateRange;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        androidx.camera.core.CameraXConfig cameraXConfig;
        androidx.camera.camera2.interop.Camera2CaptureRequestConfigurator camera2CaptureRequestConfigurator;
        java.lang.String m393constructorimpl;
        androidx.camera.camera2.pipe.OutputStream.MirrorMode m596boximpl;
        androidx.camera.camera2.pipe.OutputStream.Config m574createvBYXiEU;
        androidx.camera.camera2.pipe.CameraStream.Config config;
        java.lang.String str;
        java.lang.String str2;
        androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile;
        java.lang.String m393constructorimpl2;
        androidx.camera.camera2.pipe.OutputStream.MirrorMode m596boximpl2;
        androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode;
        androidx.camera.camera2.pipe.OutputStream.OutputType surface;
        androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase;
        androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint;
        androidx.camera.camera2.pipe.OutputStream.Config m574createvBYXiEU2;
        androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile2;
        androidx.camera.camera2.impl.CameraGraphConfigProvider cameraGraphConfigProvider2 = this;
        androidx.camera.core.impl.SessionConfig sessionConfig3 = sessionConfig;
        java.util.Map<androidx.camera.core.impl.DeferrableSurface, java.lang.Long> map = surfaceToStreamUseCaseMap;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(surfaceToStreamUseHintMap, "");
        boolean m376equalsimpl0 = androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(operatingMode, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m381getEXTENSION2uNL3no());
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        int m680constructorimpl = androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(1);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        if (sessionConfig3 != null) {
            androidx.camera.camera2.impl.CameraInteropStateCallbackRepository cameraInteropStateCallbackRepository = cameraGraphConfigProvider2.getHighSpeedVideoSizesFor;
            if (cameraInteropStateCallbackRepository != null) {
                cameraInteropStateCallbackRepository.updateCallbacks(sessionConfig3);
            }
            if (sessionConfig.getTemplateType() != -1) {
                m680constructorimpl = androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(sessionConfig.getTemplateType());
            }
            linkedHashMap2.putAll(cameraGraphConfigProvider2.getInputSizeshNQ4ISI.mo79getOverrideParamsxlOpshk(androidx.camera.camera2.pipe.RequestTemplate.m679boximpl(m680constructorimpl)));
            androidx.camera.core.impl.Config implementationOptions = sessionConfig.getImplementationOptions();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(implementationOptions, "");
            linkedHashMap2.putAll(androidx.camera.camera2.impl.Camera2ImplConfigKt.toParameters(implementationOptions));
            if (androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(operatingMode, androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m381getEXTENSION2uNL3no())) {
                androidx.camera.camera2.pipe.Metadata.Key<java.lang.Integer> camera2ExtensionMode2 = androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getCamera2ExtensionMode();
                kotlin.jvm.internal.Intrinsics.checkNotNull(camera2ExtensionMode);
                linkedHashMap2.put(camera2ExtensionMode2, camera2ExtensionMode);
            }
            androidx.camera.core.impl.Config implementationOptions2 = sessionConfig.getImplementationOptions();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(implementationOptions2, "");
            java.lang.String physicalCameraId = new androidx.camera.camera2.impl.Camera2ImplConfig(implementationOptions2).getPhysicalCameraId(null);
            java.util.Iterator<androidx.camera.core.impl.SessionConfig.OutputConfig> it = sessionConfig.getOutputConfigs().iterator();
            androidx.camera.camera2.pipe.CameraStream.Config config2 = null;
            while (it.hasNext()) {
                androidx.camera.core.impl.SessionConfig.OutputConfig next = it.next();
                androidx.camera.core.impl.DeferrableSurface surface2 = next.getSurface();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surface2, "");
                if (physicalCameraId == null) {
                    str2 = next.getPhysicalCameraId();
                    str = physicalCameraId;
                } else {
                    str = physicalCameraId;
                    str2 = str;
                }
                androidx.camera.core.DynamicRange dynamicRange = next.getDynamicRange();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dynamicRange, "");
                int mirrorMode2 = next.getMirrorMode();
                androidx.camera.camera2.pipe.OutputStream.Config.Companion companion = androidx.camera.camera2.pipe.OutputStream.Config.INSTANCE;
                int i2 = m680constructorimpl;
                java.util.Iterator<androidx.camera.core.impl.SessionConfig.OutputConfig> it2 = it;
                if (android.os.Build.VERSION.SDK_INT >= 33) {
                    androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile m576boximpl = androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m576boximpl(androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.INSTANCE.m595getSTANDARDfFAQAUE());
                    if (cameraGraphConfigProvider2.getOutputStallDuration != null) {
                        dynamicRangeProfile2 = m576boximpl;
                        java.lang.Long dynamicRangeToFirstSupportedProfile = androidx.camera.camera2.internal.DynamicRangeConversions.INSTANCE.dynamicRangeToFirstSupportedProfile(dynamicRange, cameraGraphConfigProvider2.getOutputStallDuration);
                        if (dynamicRangeToFirstSupportedProfile != null) {
                            dynamicRangeProfile = androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m576boximpl(androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m577constructorimpl(dynamicRangeToFirstSupportedProfile.longValue()));
                        } else {
                            androidx.camera.camera2.impl.Camera2Logger camera2Logger = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                            if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                                java.lang.String unused = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                            }
                        }
                    } else {
                        dynamicRangeProfile2 = m576boximpl;
                    }
                    dynamicRangeProfile = dynamicRangeProfile2;
                } else {
                    dynamicRangeProfile = null;
                }
                android.util.Size prescribedSize = surface2.getPrescribedSize();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(prescribedSize, "");
                int m710constructorimpl = androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(surface2.getPrescribedStreamFormat());
                if (str2 == null) {
                    m393constructorimpl2 = null;
                } else {
                    androidx.camera.camera2.pipe.CameraId.Companion companion2 = androidx.camera.camera2.pipe.CameraId.INSTANCE;
                    m393constructorimpl2 = androidx.camera.camera2.pipe.CameraId.m393constructorimpl(str2);
                }
                if (mirrorMode2 == 0) {
                    m596boximpl2 = androidx.camera.camera2.pipe.OutputStream.MirrorMode.m596boximpl(androidx.camera.camera2.pipe.OutputStream.MirrorMode.m597constructorimpl(1));
                } else if (mirrorMode2 == 1) {
                    m596boximpl2 = androidx.camera.camera2.pipe.OutputStream.MirrorMode.m596boximpl(androidx.camera.camera2.pipe.OutputStream.MirrorMode.m597constructorimpl(2));
                } else {
                    mirrorMode = null;
                    if (!setOutputType) {
                        java.lang.Class<?> containerClass = next.getSurface().getContainerClass();
                        if (kotlin.jvm.internal.Intrinsics.areEqual(containerClass, android.media.MediaCodec.class)) {
                            surface = androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getMEDIA_CODEC();
                        } else if (kotlin.jvm.internal.Intrinsics.areEqual(containerClass, android.view.SurfaceHolder.class)) {
                            surface = androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_VIEW();
                        } else {
                            surface = kotlin.jvm.internal.Intrinsics.areEqual(containerClass, android.graphics.SurfaceTexture.class) ? androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_TEXTURE() : androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE();
                        }
                    } else {
                        surface = androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE();
                    }
                    androidx.camera.camera2.pipe.OutputStream.OutputType outputType = surface;
                    if (m376equalsimpl0) {
                        androidx.camera.camera2.pipe.CameraMetadata cameraMetadata = cameraGraphConfigProvider2.getOutputFormats;
                        java.lang.Long l = map.get(surface2);
                        androidx.camera.camera2.pipe.OutputStream.StreamUseCase m616boximpl = l != null ? androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m616boximpl(androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m617constructorimpl(l.longValue())) : null;
                        if (android.os.Build.VERSION.SDK_INT >= 33 && m616boximpl != null && cameraMetadata != null) {
                            android.hardware.camera2.CameraCharacteristics.Key key = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES;
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(key, "");
                            long[] jArr = (long[]) cameraMetadata.get(key);
                            if (jArr != null) {
                            }
                        }
                        androidx.camera.camera2.impl.Camera2Logger camera2Logger2 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
                        if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                            java.lang.String unused2 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
                        }
                        m616boximpl = null;
                        streamUseCase = m616boximpl;
                    } else {
                        streamUseCase = null;
                    }
                    if (m376equalsimpl0) {
                        java.lang.Long l2 = surfaceToStreamUseHintMap.get(surface2);
                        streamUseHint = l2 != null ? androidx.camera.camera2.pipe.OutputStream.StreamUseHint.m630boximpl(androidx.camera.camera2.pipe.OutputStream.StreamUseHint.m631constructorimpl(l2.longValue())) : null;
                    } else {
                        streamUseHint = null;
                    }
                    m574createvBYXiEU2 = companion.m574createvBYXiEU(prescribedSize, m710constructorimpl, (r25 & 4) != 0 ? null : m393constructorimpl2, (r25 & 8) != 0 ? androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE() : outputType, (r25 & 16) != 0 ? null : mirrorMode, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : dynamicRangeProfile, (r25 & 128) != 0 ? null : streamUseCase, (r25 & 256) != 0 ? null : streamUseHint, (r25 & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null);
                    java.util.List<androidx.camera.core.impl.DeferrableSurface> sharedSurfaces = next.getSharedSurfaces();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedSurfaces, "");
                    for (androidx.camera.core.impl.DeferrableSurface deferrableSurface : kotlin.collections.CollectionsKt.plus((java.util.Collection<? extends androidx.camera.core.impl.DeferrableSurface>) sharedSurfaces, surface2)) {
                        androidx.camera.camera2.pipe.CameraStream.Config create$default = androidx.camera.camera2.pipe.CameraStream.Config.Companion.create$default(androidx.camera.camera2.pipe.CameraStream.Config.INSTANCE, m574createvBYXiEU2, (androidx.camera.camera2.pipe.ImageSourceConfig) null, 2, (java.lang.Object) null);
                        linkedHashMap3.put(create$default, deferrableSurface);
                        if (next.getSurfaceGroupId() != -1) {
                            java.util.List list = (java.util.List) linkedHashMap.get(java.lang.Integer.valueOf(next.getSurfaceGroupId()));
                            if (list == null) {
                                linkedHashMap.put(java.lang.Integer.valueOf(next.getSurfaceGroupId()), kotlin.collections.CollectionsKt.mutableListOf(create$default));
                            } else {
                                list.add(create$default);
                            }
                        }
                        if (kotlin.jvm.internal.Intrinsics.areEqual(deferrableSurface, surface2)) {
                            androidx.camera.camera2.adapter.ZslControl zslControl = this.Camera2StreamConfigurationMap;
                            kotlin.jvm.internal.Intrinsics.checkNotNull(deferrableSurface);
                            if (zslControl.isZslSurface(deferrableSurface, sessionConfig)) {
                                config2 = create$default;
                            }
                        }
                    }
                    cameraGraphConfigProvider2 = this;
                    sessionConfig3 = sessionConfig;
                    physicalCameraId = str;
                    map = surfaceToStreamUseCaseMap;
                    m680constructorimpl = i2;
                    it = it2;
                }
                mirrorMode = m596boximpl2;
                if (!setOutputType) {
                }
                androidx.camera.camera2.pipe.OutputStream.OutputType outputType2 = surface;
                if (m376equalsimpl0) {
                }
                if (m376equalsimpl0) {
                }
                m574createvBYXiEU2 = companion.m574createvBYXiEU(prescribedSize, m710constructorimpl, (r25 & 4) != 0 ? null : m393constructorimpl2, (r25 & 8) != 0 ? androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE() : outputType2, (r25 & 16) != 0 ? null : mirrorMode, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : dynamicRangeProfile, (r25 & 128) != 0 ? null : streamUseCase, (r25 & 256) != 0 ? null : streamUseHint, (r25 & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null);
                java.util.List<androidx.camera.core.impl.DeferrableSurface> sharedSurfaces2 = next.getSharedSurfaces();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sharedSurfaces2, "");
                while (r1.hasNext()) {
                }
                cameraGraphConfigProvider2 = this;
                sessionConfig3 = sessionConfig;
                physicalCameraId = str;
                map = surfaceToStreamUseCaseMap;
                m680constructorimpl = i2;
                it = it2;
            }
            cameraGraphConfigProvider = cameraGraphConfigProvider2;
            int i3 = m680constructorimpl;
            sessionConfig2 = sessionConfig3;
            if (sessionConfig.getInputConfiguration() != null && (config = config2) != null) {
                arrayList3.add(new androidx.camera.camera2.pipe.InputStream.Config(config, 1, ((androidx.camera.camera2.pipe.OutputStream.Config) kotlin.collections.CollectionsKt.single((java.util.List) config.getOutputs())).getFormat(), null));
            }
            i = i3;
        } else {
            cameraGraphConfigProvider = cameraGraphConfigProvider2;
            i = m680constructorimpl;
            sessionConfig2 = sessionConfig3;
        }
        androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks = cameraGraphConfigProvider.getHighSpeedVideoFpsRanges;
        if (cameraQuirks.getQuirks().contains(androidx.camera.camera2.compat.quirk.CaptureSessionStuckQuirk.class)) {
            androidx.camera.camera2.impl.Camera2Logger camera2Logger3 = androidx.camera.camera2.impl.Camera2Logger.INSTANCE;
            if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
                java.lang.String unused3 = androidx.camera.camera2.impl.Camera2Logger.getHighSpeedVideoFpsRanges;
            }
        }
        androidx.camera.camera2.pipe.CameraGraph.Flags flags = new androidx.camera.camera2.pipe.CameraGraph.Flags(false, (!m376equalsimpl0 || androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopWithSessionProcessorQuirk.class) == null) && androidx.camera.camera2.compat.quirk.DeviceQuirks.INSTANCE.get(androidx.camera.camera2.compat.quirk.DisableAbortCapturesOnStopQuirk.class) == null && android.os.Build.VERSION.SDK_INT >= 30, new androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture(cameraQuirks.getQuirks().contains(androidx.camera.camera2.compat.quirk.QuickSuccessiveImageCaptureFailsRepeatingRequestQuirk.class) ? 1 : 0, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST, null), null, androidx.camera.camera2.compat.quirk.FinalizeSessionOnCloseQuirk.INSTANCE.m71getBehaviorBm6Tfm4(), true, cameraGraphConfigProvider.getOutputMinFrameDuration.shouldCloseCameraDevice(m376equalsimpl0), true, 9, null);
        if (sessionConfig2 != null) {
            androidx.camera.core.impl.CaptureConfig repeatingCaptureConfig = sessionConfig.getRepeatingCaptureConfig();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(repeatingCaptureConfig, "");
            int previewStabilizationMode = repeatingCaptureConfig.getPreviewStabilizationMode();
            int videoStabilizationMode = repeatingCaptureConfig.getVideoStabilizationMode();
            if (previewStabilizationMode == 1 || videoStabilizationMode == 1) {
                num = 0;
            } else if (previewStabilizationMode == 2) {
                num = 2;
            } else if (videoStabilizationMode == 2) {
                num = 1;
            }
            expectedFrameRateRange = sessionConfig2 == null ? sessionConfig.getExpectedFrameRateRange() : null;
            if (kotlin.jvm.internal.Intrinsics.areEqual(expectedFrameRateRange, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
                expectedFrameRateRange = null;
            }
            java.util.Map createMapBuilder = kotlin.collections.MapsKt.createMapBuilder();
            if (m376equalsimpl0) {
                createMapBuilder.put(androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getIgnore3ARequiredParameters(), java.lang.Boolean.TRUE);
            }
            if (num != null) {
                createMapBuilder.put(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, java.lang.Integer.valueOf(num.intValue()));
            }
            createMapBuilder.put(androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getCamera2CaptureRequestTag(), androidx.camera.core.impl.TagBundle.CAMERAX_USER_TAG_PREFIX);
            if (expectedFrameRateRange != null) {
                createMapBuilder.put(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, expectedFrameRateRange);
            }
            java.util.Map build = kotlin.collections.MapsKt.build(createMapBuilder);
            if (expectedFrameRateRange != null) {
                linkedHashMap2.put(android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, expectedFrameRateRange);
            }
            if (num != null) {
                linkedHashMap2.put(android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, num);
            }
            if (sessionConfig2 != null) {
                androidx.camera.core.impl.Config implementationOptions3 = sessionConfig.getImplementationOptions();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(implementationOptions3, "");
                java.lang.String physicalCameraId2 = new androidx.camera.camera2.impl.Camera2ImplConfig(implementationOptions3).getPhysicalCameraId(null);
                androidx.camera.core.impl.SessionConfig.OutputConfig postviewOutputConfig = sessionConfig.getPostviewOutputConfig();
                if (postviewOutputConfig != null) {
                    androidx.camera.core.impl.DeferrableSurface surface3 = postviewOutputConfig.getSurface();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(surface3, "");
                    if (physicalCameraId2 == null) {
                        physicalCameraId2 = postviewOutputConfig.getPhysicalCameraId();
                    }
                    int mirrorMode3 = postviewOutputConfig.getMirrorMode();
                    androidx.camera.camera2.pipe.OutputStream.Config.Companion companion3 = androidx.camera.camera2.pipe.OutputStream.Config.INSTANCE;
                    android.util.Size prescribedSize2 = surface3.getPrescribedSize();
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(prescribedSize2, "");
                    int m710constructorimpl2 = androidx.camera.camera2.pipe.StreamFormat.m710constructorimpl(surface3.getPrescribedStreamFormat());
                    if (physicalCameraId2 == null) {
                        m393constructorimpl = null;
                    } else {
                        androidx.camera.camera2.pipe.CameraId.Companion companion4 = androidx.camera.camera2.pipe.CameraId.INSTANCE;
                        m393constructorimpl = androidx.camera.camera2.pipe.CameraId.m393constructorimpl(physicalCameraId2);
                    }
                    if (mirrorMode3 == 0) {
                        m596boximpl = androidx.camera.camera2.pipe.OutputStream.MirrorMode.m596boximpl(androidx.camera.camera2.pipe.OutputStream.MirrorMode.m597constructorimpl(1));
                    } else {
                        m596boximpl = mirrorMode3 != 1 ? null : androidx.camera.camera2.pipe.OutputStream.MirrorMode.m596boximpl(androidx.camera.camera2.pipe.OutputStream.MirrorMode.m597constructorimpl(2));
                    }
                    m574createvBYXiEU = companion3.m574createvBYXiEU(prescribedSize2, m710constructorimpl2, (r25 & 4) != 0 ? null : m393constructorimpl, (r25 & 8) != 0 ? androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE() : null, (r25 & 16) != 0 ? null : m596boximpl, (r25 & 32) != 0 ? null : null, (r25 & 64) != 0 ? null : null, (r25 & 128) != 0 ? null : null, (r25 & 256) != 0 ? null : null, (r25 & 512) != 0 ? kotlin.collections.CollectionsKt.emptyList() : null);
                    arrayList = null;
                    ?? create$default2 = androidx.camera.camera2.pipe.CameraStream.Config.Companion.create$default(androidx.camera.camera2.pipe.CameraStream.Config.INSTANCE, m574createvBYXiEU, (androidx.camera.camera2.pipe.ImageSourceConfig) null, 2, (java.lang.Object) null);
                    if (create$default2 != null) {
                        linkedHashMap3.put(create$default2, postviewOutputConfig.getSurface());
                        arrayList2 = create$default2;
                        cameraXConfig = cameraGraphConfigProvider.getInputFormats;
                        if (cameraXConfig != null && (camera2CaptureRequestConfigurator = androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.getCamera2CaptureRequestConfigurator(cameraXConfig)) != null) {
                            androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.configureWithUnchecked(camera2CaptureRequestConfigurator, linkedHashMap2);
                        }
                        java.lang.String cameraId = cameraGraphConfigProvider.getHighSpeedVideoFpsRangesFor.getCameraId();
                        java.util.List list2 = kotlin.collections.CollectionsKt.toList(linkedHashMap3.keySet());
                        java.util.List list3 = kotlin.collections.CollectionsKt.toList(linkedHashMap.values());
                        if (!arrayList3.isEmpty()) {
                            arrayList = arrayList3;
                        }
                        return new androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult(new androidx.camera.camera2.pipe.CameraGraph.Config(cameraId, list2, list3, arrayList, arrayList2, i, linkedHashMap2, operatingMode, 0, build, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.Request.Listener[]{cameraGraphConfigProvider.getHighSpeedVideoSizes, cameraGraphConfigProvider.getHighResolutionOutputSizeshNQ4ISI}), kotlin.collections.CollectionsKt.listOfNotNull(graphStateToCameraStateAdapter), null, null, null, null, flags, null, 192768, null), kotlin.collections.MapsKt.toMap(linkedHashMap3));
                    }
                    arrayList2 = arrayList;
                    cameraXConfig = cameraGraphConfigProvider.getInputFormats;
                    if (cameraXConfig != null) {
                        androidx.camera.camera2.interop.Camera2CaptureRequestConfiguratorKt.configureWithUnchecked(camera2CaptureRequestConfigurator, linkedHashMap2);
                    }
                    java.lang.String cameraId2 = cameraGraphConfigProvider.getHighSpeedVideoFpsRangesFor.getCameraId();
                    java.util.List list22 = kotlin.collections.CollectionsKt.toList(linkedHashMap3.keySet());
                    java.util.List list32 = kotlin.collections.CollectionsKt.toList(linkedHashMap.values());
                    if (!arrayList3.isEmpty()) {
                    }
                    return new androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult(new androidx.camera.camera2.pipe.CameraGraph.Config(cameraId2, list22, list32, arrayList, arrayList2, i, linkedHashMap2, operatingMode, 0, build, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.Request.Listener[]{cameraGraphConfigProvider.getHighSpeedVideoSizes, cameraGraphConfigProvider.getHighResolutionOutputSizeshNQ4ISI}), kotlin.collections.CollectionsKt.listOfNotNull(graphStateToCameraStateAdapter), null, null, null, null, flags, null, 192768, null), kotlin.collections.MapsKt.toMap(linkedHashMap3));
                }
            }
            arrayList = null;
            arrayList2 = arrayList;
            cameraXConfig = cameraGraphConfigProvider.getInputFormats;
            if (cameraXConfig != null) {
            }
            java.lang.String cameraId22 = cameraGraphConfigProvider.getHighSpeedVideoFpsRangesFor.getCameraId();
            java.util.List list222 = kotlin.collections.CollectionsKt.toList(linkedHashMap3.keySet());
            java.util.List list322 = kotlin.collections.CollectionsKt.toList(linkedHashMap.values());
            if (!arrayList3.isEmpty()) {
            }
            return new androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult(new androidx.camera.camera2.pipe.CameraGraph.Config(cameraId22, list222, list322, arrayList, arrayList2, i, linkedHashMap2, operatingMode, 0, build, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.Request.Listener[]{cameraGraphConfigProvider.getHighSpeedVideoSizes, cameraGraphConfigProvider.getHighResolutionOutputSizeshNQ4ISI}), kotlin.collections.CollectionsKt.listOfNotNull(graphStateToCameraStateAdapter), null, null, null, null, flags, null, 192768, null), kotlin.collections.MapsKt.toMap(linkedHashMap3));
        }
        num = null;
        if (sessionConfig2 == null) {
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(expectedFrameRateRange, androidx.camera.core.impl.StreamSpec.FRAME_RATE_RANGE_UNSPECIFIED)) {
        }
        java.util.Map createMapBuilder2 = kotlin.collections.MapsKt.createMapBuilder();
        if (m376equalsimpl0) {
        }
        if (num != null) {
        }
        createMapBuilder2.put(androidx.camera.camera2.pipe.compat.CameraPipeKeys.INSTANCE.getCamera2CaptureRequestTag(), androidx.camera.core.impl.TagBundle.CAMERAX_USER_TAG_PREFIX);
        if (expectedFrameRateRange != null) {
        }
        java.util.Map build2 = kotlin.collections.MapsKt.build(createMapBuilder2);
        if (expectedFrameRateRange != null) {
        }
        if (num != null) {
        }
        if (sessionConfig2 != null) {
        }
        arrayList = null;
        arrayList2 = arrayList;
        cameraXConfig = cameraGraphConfigProvider.getInputFormats;
        if (cameraXConfig != null) {
        }
        java.lang.String cameraId222 = cameraGraphConfigProvider.getHighSpeedVideoFpsRangesFor.getCameraId();
        java.util.List list2222 = kotlin.collections.CollectionsKt.toList(linkedHashMap3.keySet());
        java.util.List list3222 = kotlin.collections.CollectionsKt.toList(linkedHashMap.values());
        if (!arrayList3.isEmpty()) {
        }
        return new androidx.camera.camera2.impl.CameraGraphConfigProvider.CameraGraphCreationResult(new androidx.camera.camera2.pipe.CameraGraph.Config(cameraId222, list2222, list3222, arrayList, arrayList2, i, linkedHashMap2, operatingMode, 0, build2, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.camera.camera2.pipe.Request.Listener[]{cameraGraphConfigProvider.getHighSpeedVideoSizes, cameraGraphConfigProvider.getHighResolutionOutputSizeshNQ4ISI}), kotlin.collections.CollectionsKt.listOfNotNull(graphStateToCameraStateAdapter), null, null, null, null, flags, null, 192768, null), kotlin.collections.MapsKt.toMap(linkedHashMap3));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraGraphConfigProvider<");
        sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.getHighSpeedVideoFpsRangesFor.getCameraId()));
        sb.append(kotlin.text.Typography.greater);
        return sb.toString();
    }
}
