package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0007\u0004\u0005\u0006\u0007\b\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph;", "Landroidx/camera/camera2/pipe/CameraGraphBase;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Landroidx/camera/camera2/pipe/CameraControls3A;", "Config", "ConcurrentConfig", "RepeatingRequestRequirementsBeforeCapture", "Flags", "OperatingMode", "Constants3A", "Session"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraGraph extends androidx.camera.camera2.pipe.CameraGraphBase<androidx.camera.camera2.pipe.CameraGraph.Session>, androidx.camera.camera2.pipe.CameraControls3A {

    @kotlin.Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004\u0012\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b'\u0010(J\u001c\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0004HÆ\u0003¢\u0006\u0004\b)\u0010(J\u0018\u0010*\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010/\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b-\u0010.J\u001c\u00100\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rHÆ\u0003¢\u0006\u0004\b0\u00101J\u0010\u00103\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b2\u0010.J\u0010\u00105\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b4\u0010.J\u001c\u00106\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rHÆ\u0003¢\u0006\u0004\b6\u00101J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004HÆ\u0003¢\u0006\u0004\b7\u0010(J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004HÆ\u0003¢\u0006\u0004\b8\u0010(J\u001c\u00109\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rHÆ\u0003¢\u0006\u0004\b9\u00101J\u0012\u0010;\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b:\u0010%J\u0012\u0010<\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u001cHÆ\u0003¢\u0006\u0004\b>\u0010?J\u0010\u0010@\u001a\u00020\u001eHÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010C\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\bB\u0010%J\u0096\u0002\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00042\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001c2\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u001a\u0010I\u001a\u00020H2\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bI\u0010JJ\u0010\u0010L\u001a\u00020KHÖ\u0001¢\u0006\u0004\bL\u0010.J\u0010\u0010N\u001a\u00020MHÖ\u0001¢\u0006\u0004\bN\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bP\u0010%R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010Q\u001a\u0004\bR\u0010(R&\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010Q\u001a\u0004\bS\u0010(R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010Q\u001a\u0004\bT\u0010(R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010U\u001a\u0004\bV\u0010,R\u001a\u0010\f\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010W\u001a\u0004\bX\u0010.R&\u0010\u000e\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010Y\u001a\u0004\bZ\u00101R\u001a\u0010\u0010\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010W\u001a\u0004\b[\u0010.R\u001a\u0010\u0011\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010W\u001a\u0004\b\\\u0010.R&\u0010\u0012\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010Y\u001a\u0004\b]\u00101R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\b^\u0010(R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010Q\u001a\u0004\b_\u0010(R&\u0010\u0017\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010Y\u001a\u0004\b`\u00101R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010O\u001a\u0004\ba\u0010%R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010b\u001a\u0004\bc\u0010=R\u001a\u0010\u001d\u001a\u00020\u001c8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010d\u001a\u0004\be\u0010?R\u001a\u0010\u001f\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010f\u001a\u0004\bg\u0010AR\u001c\u0010!\u001a\u0004\u0018\u00010 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010O\u001a\u0004\bh\u0010%R$\u0010j\u001a\u0004\u0018\u00010i8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Config;", "", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "streams", "exclusiveStreamGroups", "Landroidx/camera/camera2/pipe/InputStream$Config;", "input", "postviewStream", "Landroidx/camera/camera2/pipe/RequestTemplate;", "sessionTemplate", "", "sessionParameters", "Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "sessionMode", "defaultTemplate", "defaultParameters", "Landroidx/camera/camera2/pipe/Request$Listener;", "defaultListeners", "Landroidx/camera/camera2/pipe/GraphStateListener;", "graphStateListeners", "requiredParameters", "Landroidx/camera/camera2/pipe/CameraBackendId;", "cameraBackendId", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "customCameraBackend", "Landroidx/camera/camera2/pipe/MetadataTransform;", "metadataTransform", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "flags", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "sessionColorSpace", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/CameraStream$Config;ILjava/util/Map;IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Landroidx/camera/camera2/pipe/CameraBackendFactory;Landroidx/camera/camera2/pipe/MetadataTransform;Landroidx/camera/camera2/pipe/CameraGraph$Flags;Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1-Dz_R5H8", "()Ljava/lang/String;", "component1", "component2", "()Ljava/util/List;", "component3", "component4", "component5", "()Landroidx/camera/camera2/pipe/CameraStream$Config;", "component6-fGx8uWA", "()I", "component6", "component7", "()Ljava/util/Map;", "component8-2uNL3no", "component8", "component9-fGx8uWA", "component9", "component10", "component11", "component12", "component13", "component14-AKmI2lo", "component14", "component15", "()Landroidx/camera/camera2/pipe/CameraBackendFactory;", "component16", "()Landroidx/camera/camera2/pipe/MetadataTransform;", "component17", "()Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "component18-dxVZaPA", "component18", "copy-evZ4KcE", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/CameraStream$Config;ILjava/util/Map;IILjava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Landroidx/camera/camera2/pipe/CameraBackendFactory;Landroidx/camera/camera2/pipe/MetadataTransform;Landroidx/camera/camera2/pipe/CameraGraph$Flags;Ljava/lang/String;)Landroidx/camera/camera2/pipe/CameraGraph$Config;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "Ljava/lang/String;", "getCamera-Dz_R5H8", "Ljava/util/List;", "getStreams", "getExclusiveStreamGroups", "getInput", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "getPostviewStream", com.visa.cbp.getEncExpo.warmup, "getSessionTemplate-fGx8uWA", "Ljava/util/Map;", "getSessionParameters", "getSessionMode-2uNL3no", "getDefaultTemplate-fGx8uWA", "getDefaultParameters", "getDefaultListeners", "getGraphStateListeners", "getRequiredParameters", "getCameraBackendId-AKmI2lo", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "getCustomCameraBackend", "Landroidx/camera/camera2/pipe/MetadataTransform;", "getMetadataTransform", "Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "getFlags", "getSessionColorSpace-dxVZaPA", "Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "concurrentCameraGraphs", "Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "getConcurrentCameraGraphs$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;", "setConcurrentCameraGraphs$camera_camera2_pipe", "(Landroidx/camera/camera2/pipe/ConcurrentCameraGraphs;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {
        private final java.lang.String camera;
        private final java.lang.String cameraBackendId;
        private androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs;
        private final androidx.camera.camera2.pipe.CameraBackendFactory customCameraBackend;
        private final java.util.List<androidx.camera.camera2.pipe.Request.Listener> defaultListeners;
        private final java.util.Map<?, java.lang.Object> defaultParameters;
        private final int defaultTemplate;
        private final java.util.List<java.util.List<androidx.camera.camera2.pipe.CameraStream.Config>> exclusiveStreamGroups;
        private final androidx.camera.camera2.pipe.CameraGraph.Flags flags;
        private final java.util.List<androidx.camera.camera2.pipe.GraphStateListener> graphStateListeners;
        private final java.util.List<androidx.camera.camera2.pipe.InputStream.Config> input;
        private final androidx.camera.camera2.pipe.MetadataTransform metadataTransform;
        private final androidx.camera.camera2.pipe.CameraStream.Config postviewStream;
        private final java.util.Map<?, java.lang.Object> requiredParameters;
        private final java.lang.String sessionColorSpace;
        private final int sessionMode;
        private final java.util.Map<?, java.lang.Object> sessionParameters;
        private final int sessionTemplate;
        private final java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> streams;

        /* JADX WARN: Multi-variable type inference failed */
        private Config(java.lang.String str, java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> list, java.util.List<? extends java.util.List<androidx.camera.camera2.pipe.CameraStream.Config>> list2, java.util.List<androidx.camera.camera2.pipe.InputStream.Config> list3, androidx.camera.camera2.pipe.CameraStream.Config config, int i, java.util.Map<?, ? extends java.lang.Object> map, int i2, int i3, java.util.Map<?, ? extends java.lang.Object> map2, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> list4, java.util.List<? extends androidx.camera.camera2.pipe.GraphStateListener> list5, java.util.Map<?, ? extends java.lang.Object> map3, java.lang.String str2, androidx.camera.camera2.pipe.CameraBackendFactory cameraBackendFactory, androidx.camera.camera2.pipe.MetadataTransform metadataTransform, androidx.camera.camera2.pipe.CameraGraph.Flags flags, java.lang.String str3) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map2, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list4, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list5, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataTransform, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "");
            this.camera = str;
            this.streams = list;
            this.exclusiveStreamGroups = list2;
            this.input = list3;
            this.postviewStream = config;
            this.sessionTemplate = i;
            this.sessionParameters = map;
            this.sessionMode = i2;
            this.defaultTemplate = i3;
            this.defaultParameters = map2;
            this.defaultListeners = list4;
            this.graphStateListeners = list5;
            this.requiredParameters = map3;
            this.cameraBackendId = str2;
            this.customCameraBackend = cameraBackendFactory;
            this.metadataTransform = metadataTransform;
            this.flags = flags;
            this.sessionColorSpace = str3;
            if (str2 != null && cameraBackendFactory != null) {
                throw new java.lang.IllegalStateException("Setting both cameraBackendId and customCameraBackend is not supported.".toString());
            }
        }

        /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
        public final java.lang.String m353getCameraDz_R5H8() {
            return this.camera;
        }

        public final java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> getStreams() {
            return this.streams;
        }

        public /* synthetic */ Config(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, androidx.camera.camera2.pipe.CameraStream.Config config, int i, java.util.Map map, int i2, int i3, java.util.Map map2, java.util.List list4, java.util.List list5, java.util.Map map3, java.lang.String str2, androidx.camera.camera2.pipe.CameraBackendFactory cameraBackendFactory, androidx.camera.camera2.pipe.MetadataTransform metadataTransform, androidx.camera.camera2.pipe.CameraGraph.Flags flags, java.lang.String str3, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, (i4 & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i4 & 8) != 0 ? null : list3, (i4 & 16) != 0 ? null : config, (i4 & 32) != 0 ? androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(1) : i, (i4 & 64) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, (i4 & 128) != 0 ? androidx.camera.camera2.pipe.CameraGraph.OperatingMode.INSTANCE.m383getNORMAL2uNL3no() : i2, (i4 & 256) != 0 ? androidx.camera.camera2.pipe.RequestTemplate.m680constructorimpl(1) : i3, (i4 & 512) != 0 ? kotlin.collections.MapsKt.emptyMap() : map2, (i4 & 1024) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list4, (i4 & 2048) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list5, (i4 & 4096) != 0 ? kotlin.collections.MapsKt.emptyMap() : map3, (i4 & 8192) != 0 ? null : str2, (i4 & 16384) != 0 ? null : cameraBackendFactory, (32768 & i4) != 0 ? new androidx.camera.camera2.pipe.MetadataTransform(0, 0, null, 7, null) : metadataTransform, (65536 & i4) != 0 ? new androidx.camera.camera2.pipe.CameraGraph.Flags(false, false, null, null, 0, false, false, false, 255, null) : flags, (i4 & 131072) != 0 ? null : str3, null);
        }

        public final java.util.List<java.util.List<androidx.camera.camera2.pipe.CameraStream.Config>> getExclusiveStreamGroups() {
            return this.exclusiveStreamGroups;
        }

        public final java.util.List<androidx.camera.camera2.pipe.InputStream.Config> getInput() {
            return this.input;
        }

        public final androidx.camera.camera2.pipe.CameraStream.Config getPostviewStream() {
            return this.postviewStream;
        }

        /* renamed from: getSessionTemplate-fGx8uWA, reason: not valid java name */
        public final int m358getSessionTemplatefGx8uWA() {
            return this.sessionTemplate;
        }

        public final java.util.Map<?, java.lang.Object> getSessionParameters() {
            return this.sessionParameters;
        }

        /* renamed from: getSessionMode-2uNL3no, reason: not valid java name */
        public final int m357getSessionMode2uNL3no() {
            return this.sessionMode;
        }

        /* renamed from: getDefaultTemplate-fGx8uWA, reason: not valid java name */
        public final int m355getDefaultTemplatefGx8uWA() {
            return this.defaultTemplate;
        }

        public final java.util.Map<?, java.lang.Object> getDefaultParameters() {
            return this.defaultParameters;
        }

        public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> getDefaultListeners() {
            return this.defaultListeners;
        }

        public final java.util.List<androidx.camera.camera2.pipe.GraphStateListener> getGraphStateListeners() {
            return this.graphStateListeners;
        }

        public final java.util.Map<?, java.lang.Object> getRequiredParameters() {
            return this.requiredParameters;
        }

        /* renamed from: getCameraBackendId-AKmI2lo, reason: not valid java name */
        public final java.lang.String m354getCameraBackendIdAKmI2lo() {
            return this.cameraBackendId;
        }

        public final androidx.camera.camera2.pipe.CameraBackendFactory getCustomCameraBackend() {
            return this.customCameraBackend;
        }

        public final androidx.camera.camera2.pipe.MetadataTransform getMetadataTransform() {
            return this.metadataTransform;
        }

        public final androidx.camera.camera2.pipe.CameraGraph.Flags getFlags() {
            return this.flags;
        }

        /* renamed from: getSessionColorSpace-dxVZaPA, reason: not valid java name */
        public final java.lang.String m356getSessionColorSpacedxVZaPA() {
            return this.sessionColorSpace;
        }

        /* renamed from: getConcurrentCameraGraphs$camera_camera2_pipe, reason: from getter */
        public final androidx.camera.camera2.pipe.ConcurrentCameraGraphs getConcurrentCameraGraphs() {
            return this.concurrentCameraGraphs;
        }

        public final void setConcurrentCameraGraphs$camera_camera2_pipe(androidx.camera.camera2.pipe.ConcurrentCameraGraphs concurrentCameraGraphs) {
            this.concurrentCameraGraphs = concurrentCameraGraphs;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(camera=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraId.m398toStringimpl(this.camera));
            sb.append(", streams=");
            sb.append(this.streams);
            sb.append(", exclusiveStreamGroups=");
            sb.append(this.exclusiveStreamGroups);
            sb.append(", input=");
            sb.append(this.input);
            sb.append(", postviewStream=");
            sb.append(this.postviewStream);
            sb.append(", sessionTemplate=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.RequestTemplate.m685toStringimpl(this.sessionTemplate));
            sb.append(", sessionParameters=");
            sb.append(this.sessionParameters);
            sb.append(", sessionMode=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m378toStringimpl(this.sessionMode));
            sb.append(", defaultTemplate=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.RequestTemplate.m685toStringimpl(this.defaultTemplate));
            sb.append(", defaultParameters=");
            sb.append(this.defaultParameters);
            sb.append(", defaultListeners=");
            sb.append(this.defaultListeners);
            sb.append(", graphStateListeners=");
            sb.append(this.graphStateListeners);
            sb.append(", requiredParameters=");
            sb.append(this.requiredParameters);
            sb.append(", cameraBackendId=");
            java.lang.String str = this.cameraBackendId;
            sb.append((java.lang.Object) (str == null ? "null" : androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(str)));
            sb.append(", customCameraBackend=");
            sb.append(this.customCameraBackend);
            sb.append(", metadataTransform=");
            sb.append(this.metadataTransform);
            sb.append(", flags=");
            sb.append(this.flags);
            sb.append(", sessionColorSpace=");
            java.lang.String str2 = this.sessionColorSpace;
            sb.append((java.lang.Object) (str2 != null ? androidx.camera.camera2.pipe.CameraColorSpace.m246toStringimpl(str2) : "null"));
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int m396hashCodeimpl = androidx.camera.camera2.pipe.CameraId.m396hashCodeimpl(this.camera);
            int hashCode = this.streams.hashCode();
            int hashCode2 = this.exclusiveStreamGroups.hashCode();
            java.util.List<androidx.camera.camera2.pipe.InputStream.Config> list = this.input;
            int hashCode3 = list == null ? 0 : list.hashCode();
            androidx.camera.camera2.pipe.CameraStream.Config config = this.postviewStream;
            int hashCode4 = config == null ? 0 : config.hashCode();
            int m684hashCodeimpl = androidx.camera.camera2.pipe.RequestTemplate.m684hashCodeimpl(this.sessionTemplate);
            int hashCode5 = this.sessionParameters.hashCode();
            int m377hashCodeimpl = androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m377hashCodeimpl(this.sessionMode);
            int m684hashCodeimpl2 = androidx.camera.camera2.pipe.RequestTemplate.m684hashCodeimpl(this.defaultTemplate);
            int hashCode6 = this.defaultParameters.hashCode();
            int hashCode7 = this.defaultListeners.hashCode();
            int hashCode8 = this.graphStateListeners.hashCode();
            int hashCode9 = this.requiredParameters.hashCode();
            java.lang.String str = this.cameraBackendId;
            int m236hashCodeimpl = str == null ? 0 : androidx.camera.camera2.pipe.CameraBackendId.m236hashCodeimpl(str);
            androidx.camera.camera2.pipe.CameraBackendFactory cameraBackendFactory = this.customCameraBackend;
            int hashCode10 = cameraBackendFactory == null ? 0 : cameraBackendFactory.hashCode();
            int hashCode11 = this.metadataTransform.hashCode();
            int hashCode12 = this.flags.hashCode();
            java.lang.String str2 = this.sessionColorSpace;
            return (((((((((((((((((((((((((((((((((m396hashCodeimpl * 31) + hashCode) * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + m684hashCodeimpl) * 31) + hashCode5) * 31) + m377hashCodeimpl) * 31) + m684hashCodeimpl2) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + m236hashCodeimpl) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (str2 != null ? androidx.camera.camera2.pipe.CameraColorSpace.m244hashCodeimpl(str2) : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.pipe.CameraGraph.Config)) {
                return false;
            }
            androidx.camera.camera2.pipe.CameraGraph.Config config = (androidx.camera.camera2.pipe.CameraGraph.Config) other;
            if (!androidx.camera.camera2.pipe.CameraId.m395equalsimpl0(this.camera, config.camera) || !kotlin.jvm.internal.Intrinsics.areEqual(this.streams, config.streams) || !kotlin.jvm.internal.Intrinsics.areEqual(this.exclusiveStreamGroups, config.exclusiveStreamGroups) || !kotlin.jvm.internal.Intrinsics.areEqual(this.input, config.input) || !kotlin.jvm.internal.Intrinsics.areEqual(this.postviewStream, config.postviewStream) || !androidx.camera.camera2.pipe.RequestTemplate.m682equalsimpl0(this.sessionTemplate, config.sessionTemplate) || !kotlin.jvm.internal.Intrinsics.areEqual(this.sessionParameters, config.sessionParameters) || !androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m376equalsimpl0(this.sessionMode, config.sessionMode) || !androidx.camera.camera2.pipe.RequestTemplate.m682equalsimpl0(this.defaultTemplate, config.defaultTemplate) || !kotlin.jvm.internal.Intrinsics.areEqual(this.defaultParameters, config.defaultParameters) || !kotlin.jvm.internal.Intrinsics.areEqual(this.defaultListeners, config.defaultListeners) || !kotlin.jvm.internal.Intrinsics.areEqual(this.graphStateListeners, config.graphStateListeners) || !kotlin.jvm.internal.Intrinsics.areEqual(this.requiredParameters, config.requiredParameters)) {
                return false;
            }
            java.lang.String str = this.cameraBackendId;
            java.lang.String str2 = config.cameraBackendId;
            if (str != null ? !(str2 != null && androidx.camera.camera2.pipe.CameraBackendId.m235equalsimpl0(str, str2)) : str2 != null) {
                return false;
            }
            if (!kotlin.jvm.internal.Intrinsics.areEqual(this.customCameraBackend, config.customCameraBackend) || !kotlin.jvm.internal.Intrinsics.areEqual(this.metadataTransform, config.metadataTransform) || !kotlin.jvm.internal.Intrinsics.areEqual(this.flags, config.flags)) {
                return false;
            }
            java.lang.String str3 = this.sessionColorSpace;
            java.lang.String str4 = config.sessionColorSpace;
            return str3 != null ? str4 != null && androidx.camera.camera2.pipe.CameraColorSpace.m242equalsimpl0(str3, str4) : str4 == null;
        }

        /* renamed from: copy-evZ4KcE, reason: not valid java name */
        public final androidx.camera.camera2.pipe.CameraGraph.Config m352copyevZ4KcE(java.lang.String camera, java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> streams, java.util.List<? extends java.util.List<androidx.camera.camera2.pipe.CameraStream.Config>> exclusiveStreamGroups, java.util.List<androidx.camera.camera2.pipe.InputStream.Config> input, androidx.camera.camera2.pipe.CameraStream.Config postviewStream, int sessionTemplate, java.util.Map<?, ? extends java.lang.Object> sessionParameters, int sessionMode, int defaultTemplate, java.util.Map<?, ? extends java.lang.Object> defaultParameters, java.util.List<? extends androidx.camera.camera2.pipe.Request.Listener> defaultListeners, java.util.List<? extends androidx.camera.camera2.pipe.GraphStateListener> graphStateListeners, java.util.Map<?, ? extends java.lang.Object> requiredParameters, java.lang.String cameraBackendId, androidx.camera.camera2.pipe.CameraBackendFactory customCameraBackend, androidx.camera.camera2.pipe.MetadataTransform metadataTransform, androidx.camera.camera2.pipe.CameraGraph.Flags flags, java.lang.String sessionColorSpace) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(camera, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(streams, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exclusiveStreamGroups, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sessionParameters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultParameters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultListeners, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(graphStateListeners, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requiredParameters, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metadataTransform, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "");
            return new androidx.camera.camera2.pipe.CameraGraph.Config(camera, streams, exclusiveStreamGroups, input, postviewStream, sessionTemplate, sessionParameters, sessionMode, defaultTemplate, defaultParameters, defaultListeners, graphStateListeners, requiredParameters, cameraBackendId, customCameraBackend, metadataTransform, flags, sessionColorSpace, null);
        }

        /* renamed from: component9-fGx8uWA, reason: not valid java name and from getter */
        public final int getDefaultTemplate() {
            return this.defaultTemplate;
        }

        /* renamed from: component8-2uNL3no, reason: not valid java name and from getter */
        public final int getSessionMode() {
            return this.sessionMode;
        }

        public final java.util.Map<?, java.lang.Object> component7() {
            return this.sessionParameters;
        }

        /* renamed from: component6-fGx8uWA, reason: not valid java name and from getter */
        public final int getSessionTemplate() {
            return this.sessionTemplate;
        }

        /* renamed from: component5, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraStream.Config getPostviewStream() {
            return this.postviewStream;
        }

        public final java.util.List<androidx.camera.camera2.pipe.InputStream.Config> component4() {
            return this.input;
        }

        public final java.util.List<java.util.List<androidx.camera.camera2.pipe.CameraStream.Config>> component3() {
            return this.exclusiveStreamGroups;
        }

        public final java.util.List<androidx.camera.camera2.pipe.CameraStream.Config> component2() {
            return this.streams;
        }

        /* renamed from: component18-dxVZaPA, reason: not valid java name and from getter */
        public final java.lang.String getSessionColorSpace() {
            return this.sessionColorSpace;
        }

        /* renamed from: component17, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraGraph.Flags getFlags() {
            return this.flags;
        }

        /* renamed from: component16, reason: from getter */
        public final androidx.camera.camera2.pipe.MetadataTransform getMetadataTransform() {
            return this.metadataTransform;
        }

        /* renamed from: component15, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraBackendFactory getCustomCameraBackend() {
            return this.customCameraBackend;
        }

        /* renamed from: component14-AKmI2lo, reason: not valid java name and from getter */
        public final java.lang.String getCameraBackendId() {
            return this.cameraBackendId;
        }

        public final java.util.Map<?, java.lang.Object> component13() {
            return this.requiredParameters;
        }

        public final java.util.List<androidx.camera.camera2.pipe.GraphStateListener> component12() {
            return this.graphStateListeners;
        }

        public final java.util.List<androidx.camera.camera2.pipe.Request.Listener> component11() {
            return this.defaultListeners;
        }

        public final java.util.Map<?, java.lang.Object> component10() {
            return this.defaultParameters;
        }

        /* renamed from: component1-Dz_R5H8, reason: not valid java name and from getter */
        public final java.lang.String getCamera() {
            return this.camera;
        }

        public /* synthetic */ Config(java.lang.String str, java.util.List list, java.util.List list2, java.util.List list3, androidx.camera.camera2.pipe.CameraStream.Config config, int i, java.util.Map map, int i2, int i3, java.util.Map map2, java.util.List list4, java.util.List list5, java.util.Map map3, java.lang.String str2, androidx.camera.camera2.pipe.CameraBackendFactory cameraBackendFactory, androidx.camera.camera2.pipe.MetadataTransform metadataTransform, androidx.camera.camera2.pipe.CameraGraph.Flags flags, java.lang.String str3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, list, list2, list3, config, i, map, i2, i3, map2, list4, list5, map3, str2, cameraBackendFactory, metadataTransform, flags, str3);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "graphConfigs", "<init>", "(Ljava/util/List;)V", "Ljava/util/List;", "getGraphConfigs", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConcurrentConfig {
        private final java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> graphConfigs;

        public ConcurrentConfig(java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.graphConfigs = list;
            if (list.size() < 2) {
                throw new java.lang.IllegalStateException("Cannot create ConcurrentGraphConfig without 2 or more CameraGraph.Config(s)".toString());
            }
            androidx.camera.camera2.pipe.CameraGraph.Config config = (androidx.camera.camera2.pipe.CameraGraph.Config) kotlin.collections.CollectionsKt.first((java.util.List) list);
            java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> list2 = list;
            if (!(list2 instanceof java.util.Collection) || !list2.isEmpty()) {
                java.util.Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    java.lang.String m354getCameraBackendIdAKmI2lo = ((androidx.camera.camera2.pipe.CameraGraph.Config) it.next()).m354getCameraBackendIdAKmI2lo();
                    java.lang.String m354getCameraBackendIdAKmI2lo2 = config.m354getCameraBackendIdAKmI2lo();
                    if (m354getCameraBackendIdAKmI2lo != null) {
                        if (m354getCameraBackendIdAKmI2lo2 != null && androidx.camera.camera2.pipe.CameraBackendId.m235equalsimpl0(m354getCameraBackendIdAKmI2lo, m354getCameraBackendIdAKmI2lo2)) {
                        }
                        throw new java.lang.IllegalStateException("Each CameraGraph.Config must use the same camera backend!".toString());
                    }
                    if (m354getCameraBackendIdAKmI2lo2 != null) {
                        throw new java.lang.IllegalStateException("Each CameraGraph.Config must use the same camera backend!".toString());
                    }
                }
            }
            java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> list3 = this.graphConfigs;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
            java.util.Iterator<T> it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList.add(androidx.camera.camera2.pipe.CameraId.m392boximpl(((androidx.camera.camera2.pipe.CameraGraph.Config) it2.next()).m353getCameraDz_R5H8()));
            }
            if (kotlin.collections.CollectionsKt.distinct(arrayList).size() != this.graphConfigs.size()) {
                throw new java.lang.IllegalStateException("Each CameraGraph.Config must have a distinct camera id!".toString());
            }
        }

        public final java.util.List<androidx.camera.camera2.pipe.CameraGraph.Config> getGraphConfigs() {
            return this.graphConfigs;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "", "Lkotlin/UInt;", "repeatingFramesToComplete", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "completionBehavior", "<init>", "(ILandroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", com.visa.cbp.getEncExpo.warmup, "getRepeatingFramesToComplete-pVg5ArA", "()I", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "getCompletionBehavior", "()Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "CompletionBehavior"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class RepeatingRequestRequirementsBeforeCapture {
        private final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior;
        private final int repeatingFramesToComplete;

        private RepeatingRequestRequirementsBeforeCapture(int i, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(completionBehavior, "");
            this.repeatingFramesToComplete = i;
            this.completionBehavior = completionBehavior;
        }

        /* renamed from: getRepeatingFramesToComplete-pVg5ArA, reason: not valid java name and from getter */
        public final int getRepeatingFramesToComplete() {
            return this.repeatingFramesToComplete;
        }

        public /* synthetic */ RepeatingRequestRequirementsBeforeCapture(int i, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.AT_LEAST : completionBehavior, null);
        }

        public final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior getCompletionBehavior() {
            return this.completionBehavior;
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture$CompletionBehavior;", "", "<init>", "(Ljava/lang/String;I)V", "AT_LEAST", "EXACT"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CompletionBehavior {
            public static final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior AT_LEAST;
            private static final /* synthetic */ androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior[] Camera2StreamConfigurationMap;
            public static final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior EXACT;
            private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

            private CompletionBehavior(java.lang.String str, int i) {
            }

            static {
                androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior = new androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior("AT_LEAST", 0);
                AT_LEAST = completionBehavior;
                androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior2 = new androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior("EXACT", 1);
                EXACT = completionBehavior2;
                androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior[] completionBehaviorArr = {completionBehavior, completionBehavior2};
                Camera2StreamConfigurationMap = completionBehaviorArr;
                getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(completionBehaviorArr);
            }

            public static androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior[] values() {
                return (androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior[]) Camera2StreamConfigurationMap.clone();
            }

            public static androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior valueOf(java.lang.String str) {
                return (androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior) java.lang.Enum.valueOf(androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior.class, str);
            }

            public static kotlin.enums.EnumEntries<androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior> getEntries() {
                return getHighSpeedVideoFpsRanges;
            }
        }

        public /* synthetic */ RepeatingRequestRequirementsBeforeCapture(int i, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture.CompletionBehavior completionBehavior, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(i, completionBehavior);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001:\u00013BY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0010J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0010Jb\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u0013R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0015R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b/\u0010\u0017R\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b0\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b1\u0010\u0010R\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b2\u0010\u0010"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "", "", "configureBlankSessionOnStop", "abortCapturesOnStop", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "awaitRepeatingRequestBeforeCapture", "awaitRepeatingRequestOnDisconnect", "Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "finalizeSessionOnCloseBehavior", "closeCaptureSessionOnDisconnect", "closeCameraDeviceOnClose", "enableRestartDelays", "<init>", "(ZZLandroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;Ljava/lang/Boolean;IZZZLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Z", "component2", "component3", "()Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "component4", "()Ljava/lang/Boolean;", "component5-Bm6Tfm4", "()I", "component5", "component6", "component7", "component8", "copy-LsLUW-E", "(ZZLandroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;Ljava/lang/Boolean;IZZZ)Landroidx/camera/camera2/pipe/CameraGraph$Flags;", "copy", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "", "toString", "()Ljava/lang/String;", "Z", "getConfigureBlankSessionOnStop", "getAbortCapturesOnStop", "Landroidx/camera/camera2/pipe/CameraGraph$RepeatingRequestRequirementsBeforeCapture;", "getAwaitRepeatingRequestBeforeCapture", "Ljava/lang/Boolean;", "getAwaitRepeatingRequestOnDisconnect", com.visa.cbp.getEncExpo.warmup, "getFinalizeSessionOnCloseBehavior-Bm6Tfm4", "getCloseCaptureSessionOnDisconnect", "getCloseCameraDeviceOnClose", "getEnableRestartDelays", "FinalizeSessionOnCloseBehavior"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class Flags {
        private final boolean abortCapturesOnStop;
        private final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture;
        private final java.lang.Boolean awaitRepeatingRequestOnDisconnect;
        private final boolean closeCameraDeviceOnClose;
        private final boolean closeCaptureSessionOnDisconnect;
        private final boolean configureBlankSessionOnStop;
        private final boolean enableRestartDelays;
        private final int finalizeSessionOnCloseBehavior;

        private Flags(boolean z, boolean z2, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, java.lang.Boolean bool, int i, boolean z3, boolean z4, boolean z5) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(repeatingRequestRequirementsBeforeCapture, "");
            this.configureBlankSessionOnStop = z;
            this.abortCapturesOnStop = z2;
            this.awaitRepeatingRequestBeforeCapture = repeatingRequestRequirementsBeforeCapture;
            this.awaitRepeatingRequestOnDisconnect = bool;
            this.finalizeSessionOnCloseBehavior = i;
            this.closeCaptureSessionOnDisconnect = z3;
            this.closeCameraDeviceOnClose = z4;
            this.enableRestartDelays = z5;
        }

        public final boolean getConfigureBlankSessionOnStop() {
            return this.configureBlankSessionOnStop;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Flags(boolean z, boolean z2, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, java.lang.Boolean bool, int i, boolean z3, boolean z4, boolean z5, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(r1, r3, r4, (i2 & 8) == 0 ? bool : null, (i2 & 16) != 0 ? androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.INSTANCE.m371getOFFBm6Tfm4() : i, (i2 & 32) != 0 ? androidx.camera.camera2.pipe.compat.Camera2Quirks.INSTANCE.shouldCloseCaptureSessionOnDisconnect$camera_camera2_pipe() : z3, (i2 & 64) != 0 ? false : z4, (i2 & 128) == 0 ? z5 : false, null);
            boolean z6;
            androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture2;
            java.lang.Object[] objArr = 0;
            boolean z7 = (i2 & 1) != 0 ? false : z;
            if ((i2 & 2) != 0) {
                z6 = android.os.Build.VERSION.SDK_INT >= 30;
            } else {
                z6 = z2;
            }
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            if ((i2 & 4) != 0) {
                repeatingRequestRequirementsBeforeCapture2 = new androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture(objArr == true ? 1 : 0, objArr3 == true ? 1 : 0, 3, objArr2 == true ? 1 : 0);
            } else {
                repeatingRequestRequirementsBeforeCapture2 = repeatingRequestRequirementsBeforeCapture;
            }
        }

        public final boolean getAbortCapturesOnStop() {
            return this.abortCapturesOnStop;
        }

        public final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture getAwaitRepeatingRequestBeforeCapture() {
            return this.awaitRepeatingRequestBeforeCapture;
        }

        public final java.lang.Boolean getAwaitRepeatingRequestOnDisconnect() {
            return this.awaitRepeatingRequestOnDisconnect;
        }

        /* renamed from: getFinalizeSessionOnCloseBehavior-Bm6Tfm4, reason: not valid java name */
        public final int m363getFinalizeSessionOnCloseBehaviorBm6Tfm4() {
            return this.finalizeSessionOnCloseBehavior;
        }

        public final boolean getCloseCaptureSessionOnDisconnect() {
            return this.closeCaptureSessionOnDisconnect;
        }

        public final boolean getCloseCameraDeviceOnClose() {
            return this.closeCameraDeviceOnClose;
        }

        public final boolean getEnableRestartDelays() {
            return this.enableRestartDelays;
        }

        @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u000f\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u000f\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @kotlin.jvm.JvmInline
        public static final class FinalizeSessionOnCloseBehavior {
            private final int value;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.Companion(null);
            private static final int OFF = 0;
            private static final int IMMEDIATE = 1;
            private static final int TIMEOUT = 2;

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m366equalsimpl0(int i, int i2) {
                return i == i2;
            }

            @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraGraph$Flags$FinalizeSessionOnCloseBehavior;", "OFF", com.visa.cbp.getEncExpo.warmup, "getOFF-Bm6Tfm4", "()I", "IMMEDIATE", "getIMMEDIATE-Bm6Tfm4", "TIMEOUT", "getTIMEOUT-Bm6Tfm4"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class Companion {
                private Companion() {
                }

                /* renamed from: getOFF-Bm6Tfm4, reason: not valid java name */
                public final int m371getOFFBm6Tfm4() {
                    return androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.OFF;
                }

                /* renamed from: getIMMEDIATE-Bm6Tfm4, reason: not valid java name */
                public final int m370getIMMEDIATEBm6Tfm4() {
                    return androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.IMMEDIATE;
                }

                /* renamed from: getTIMEOUT-Bm6Tfm4, reason: not valid java name */
                public final int m372getTIMEOUTBm6Tfm4() {
                    return androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.TIMEOUT;
                }

                public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }
            }

            private /* synthetic */ FinalizeSessionOnCloseBehavior(int i) {
                this.value = i;
            }

            public final int getValue() {
                return this.value;
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ int m369unboximpl() {
                return this.value;
            }

            public final java.lang.String toString() {
                return m368toStringimpl(this.value);
            }

            public final int hashCode() {
                return m367hashCodeimpl(this.value);
            }

            public final boolean equals(java.lang.Object obj) {
                return m365equalsimpl(this.value, obj);
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static java.lang.String m368toStringimpl(int i) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("FinalizeSessionOnCloseBehavior(value=");
                sb.append(i);
                sb.append(')');
                return sb.toString();
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m367hashCodeimpl(int i) {
                return java.lang.Integer.hashCode(i);
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m365equalsimpl(int i, java.lang.Object obj) {
                return (obj instanceof androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior) && i == ((androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior) obj).m369unboximpl();
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior m364boximpl(int i) {
                return new androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior(i);
            }
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Flags(configureBlankSessionOnStop=");
            sb.append(this.configureBlankSessionOnStop);
            sb.append(", abortCapturesOnStop=");
            sb.append(this.abortCapturesOnStop);
            sb.append(", awaitRepeatingRequestBeforeCapture=");
            sb.append(this.awaitRepeatingRequestBeforeCapture);
            sb.append(", awaitRepeatingRequestOnDisconnect=");
            sb.append(this.awaitRepeatingRequestOnDisconnect);
            sb.append(", finalizeSessionOnCloseBehavior=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m368toStringimpl(this.finalizeSessionOnCloseBehavior));
            sb.append(", closeCaptureSessionOnDisconnect=");
            sb.append(this.closeCaptureSessionOnDisconnect);
            sb.append(", closeCameraDeviceOnClose=");
            sb.append(this.closeCameraDeviceOnClose);
            sb.append(", enableRestartDelays=");
            sb.append(this.enableRestartDelays);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = java.lang.Boolean.hashCode(this.configureBlankSessionOnStop);
            int hashCode2 = java.lang.Boolean.hashCode(this.abortCapturesOnStop);
            int hashCode3 = this.awaitRepeatingRequestBeforeCapture.hashCode();
            java.lang.Boolean bool = this.awaitRepeatingRequestOnDisconnect;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (bool == null ? 0 : bool.hashCode())) * 31) + androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m367hashCodeimpl(this.finalizeSessionOnCloseBehavior)) * 31) + java.lang.Boolean.hashCode(this.closeCaptureSessionOnDisconnect)) * 31) + java.lang.Boolean.hashCode(this.closeCameraDeviceOnClose)) * 31) + java.lang.Boolean.hashCode(this.enableRestartDelays);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.pipe.CameraGraph.Flags)) {
                return false;
            }
            androidx.camera.camera2.pipe.CameraGraph.Flags flags = (androidx.camera.camera2.pipe.CameraGraph.Flags) other;
            return this.configureBlankSessionOnStop == flags.configureBlankSessionOnStop && this.abortCapturesOnStop == flags.abortCapturesOnStop && kotlin.jvm.internal.Intrinsics.areEqual(this.awaitRepeatingRequestBeforeCapture, flags.awaitRepeatingRequestBeforeCapture) && kotlin.jvm.internal.Intrinsics.areEqual(this.awaitRepeatingRequestOnDisconnect, flags.awaitRepeatingRequestOnDisconnect) && androidx.camera.camera2.pipe.CameraGraph.Flags.FinalizeSessionOnCloseBehavior.m366equalsimpl0(this.finalizeSessionOnCloseBehavior, flags.finalizeSessionOnCloseBehavior) && this.closeCaptureSessionOnDisconnect == flags.closeCaptureSessionOnDisconnect && this.closeCameraDeviceOnClose == flags.closeCameraDeviceOnClose && this.enableRestartDelays == flags.enableRestartDelays;
        }

        /* renamed from: copy-LsLUW-E, reason: not valid java name */
        public final androidx.camera.camera2.pipe.CameraGraph.Flags m362copyLsLUWE(boolean configureBlankSessionOnStop, boolean abortCapturesOnStop, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture awaitRepeatingRequestBeforeCapture, java.lang.Boolean awaitRepeatingRequestOnDisconnect, int finalizeSessionOnCloseBehavior, boolean closeCaptureSessionOnDisconnect, boolean closeCameraDeviceOnClose, boolean enableRestartDelays) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(awaitRepeatingRequestBeforeCapture, "");
            return new androidx.camera.camera2.pipe.CameraGraph.Flags(configureBlankSessionOnStop, abortCapturesOnStop, awaitRepeatingRequestBeforeCapture, awaitRepeatingRequestOnDisconnect, finalizeSessionOnCloseBehavior, closeCaptureSessionOnDisconnect, closeCameraDeviceOnClose, enableRestartDelays, null);
        }

        /* renamed from: component8, reason: from getter */
        public final boolean getEnableRestartDelays() {
            return this.enableRestartDelays;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getCloseCameraDeviceOnClose() {
            return this.closeCameraDeviceOnClose;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getCloseCaptureSessionOnDisconnect() {
            return this.closeCaptureSessionOnDisconnect;
        }

        /* renamed from: component5-Bm6Tfm4, reason: not valid java name and from getter */
        public final int getFinalizeSessionOnCloseBehavior() {
            return this.finalizeSessionOnCloseBehavior;
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.Boolean getAwaitRepeatingRequestOnDisconnect() {
            return this.awaitRepeatingRequestOnDisconnect;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture getAwaitRepeatingRequestBeforeCapture() {
            return this.awaitRepeatingRequestBeforeCapture;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getAbortCapturesOnStop() {
            return this.abortCapturesOnStop;
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getConfigureBlankSessionOnStop() {
            return this.configureBlankSessionOnStop;
        }

        public /* synthetic */ Flags(boolean z, boolean z2, androidx.camera.camera2.pipe.CameraGraph.RepeatingRequestRequirementsBeforeCapture repeatingRequestRequirementsBeforeCapture, java.lang.Boolean bool, int i, boolean z3, boolean z4, boolean z5, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(z, z2, repeatingRequestRequirementsBeforeCapture, bool, i, z3, z4, z5);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u001a\u0010\u0006\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u0088\u0001\u0013\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(I)I", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoSizes", "Companion", "mode"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    /* loaded from: classes6.dex */
    public static final class OperatingMode {

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final int getHighSpeedVideoSizes;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.CameraGraph.OperatingMode.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraGraph.OperatingMode.Companion(null);
        private static final int NORMAL = 0;
        private static final int HIGH_SPEED = 1;
        private static final int EXTENSION = 2;

        /* renamed from: access$constructor-impl, reason: not valid java name */
        public static final /* synthetic */ int m373access$constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m376equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode$Companion;", "", "<init>", "()V", "", "mode", "Landroidx/camera/camera2/pipe/CameraGraph$OperatingMode;", "custom-EP6OhB0", "(I)I", io.reactivex.annotations.SchedulerSupport.CUSTOM, "NORMAL", com.visa.cbp.getEncExpo.warmup, "getNORMAL-2uNL3no", "()I", "HIGH_SPEED", "getHIGH_SPEED-2uNL3no", "EXTENSION", "getEXTENSION-2uNL3no"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getNORMAL-2uNL3no, reason: not valid java name */
            public final int m383getNORMAL2uNL3no() {
                return androidx.camera.camera2.pipe.CameraGraph.OperatingMode.NORMAL;
            }

            /* renamed from: getHIGH_SPEED-2uNL3no, reason: not valid java name */
            public final int m382getHIGH_SPEED2uNL3no() {
                return androidx.camera.camera2.pipe.CameraGraph.OperatingMode.HIGH_SPEED;
            }

            /* renamed from: getEXTENSION-2uNL3no, reason: not valid java name */
            public final int m381getEXTENSION2uNL3no() {
                return androidx.camera.camera2.pipe.CameraGraph.OperatingMode.EXTENSION;
            }

            /* renamed from: custom-EP6OhB0, reason: not valid java name */
            public final int m380customEP6OhB0(int mode) {
                if (mode != m383getNORMAL2uNL3no() && mode != m382getHIGH_SPEED2uNL3no()) {
                    return androidx.camera.camera2.pipe.CameraGraph.OperatingMode.m373access$constructorimpl(mode);
                }
                androidx.camera.camera2.pipe.core.Log.INSTANCE.getERROR_LOGGABLE();
                throw new java.lang.IllegalArgumentException(kotlin.Unit.INSTANCE.toString());
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ OperatingMode(int i) {
            this.getHighSpeedVideoSizes = i;
        }

        /* renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ int getGetHighSpeedVideoSizes() {
            return this.getHighSpeedVideoSizes;
        }

        public final java.lang.String toString() {
            return m378toStringimpl(this.getHighSpeedVideoSizes);
        }

        public final int hashCode() {
            return m377hashCodeimpl(this.getHighSpeedVideoSizes);
        }

        public final boolean equals(java.lang.Object obj) {
            return m375equalsimpl(this.getHighSpeedVideoSizes, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m378toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("OperatingMode(mode=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m377hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m375equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.CameraGraph.OperatingMode) && i == ((androidx.camera.camera2.pipe.CameraGraph.OperatingMode) obj).getGetHighSpeedVideoSizes();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.CameraGraph.OperatingMode m374boximpl(int i) {
            return new androidx.camera.camera2.pipe.CameraGraph.OperatingMode(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Constants3A;", "", "<init>", "()V", "", "DEFAULT_FRAME_LIMIT", com.visa.cbp.getEncExpo.warmup, "DEFAULT_TIME_LIMIT_MS", "", "DEFAULT_TIME_LIMIT_NS", "J", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "METERING_REGIONS_EMPTY", "[Landroid/hardware/camera2/params/MeteringRectangle;", "getMETERING_REGIONS_EMPTY", "()[Landroid/hardware/camera2/params/MeteringRectangle;", "METERING_REGIONS_DEFAULT", "getMETERING_REGIONS_DEFAULT", "Landroidx/camera/camera2/pipe/FrameNumber;", "FRAME_NUMBER_INVALID", "getFRAME_NUMBER_INVALID-Ugla2oM", "()J"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Constants3A {
        public static final int DEFAULT_FRAME_LIMIT = 60;
        public static final int DEFAULT_TIME_LIMIT_MS = 3000;
        public static final long DEFAULT_TIME_LIMIT_NS = 3000000000L;
        public static final androidx.camera.camera2.pipe.CameraGraph.Constants3A INSTANCE = new androidx.camera.camera2.pipe.CameraGraph.Constants3A();
        private static final android.hardware.camera2.params.MeteringRectangle[] METERING_REGIONS_EMPTY = new android.hardware.camera2.params.MeteringRectangle[0];
        private static final android.hardware.camera2.params.MeteringRectangle[] METERING_REGIONS_DEFAULT = {new android.hardware.camera2.params.MeteringRectangle(0, 0, 0, 0, 0)};
        private static final long FRAME_NUMBER_INVALID = androidx.camera.camera2.pipe.FrameNumber.m498constructorimpl(-1);

        private Constants3A() {
        }

        public final android.hardware.camera2.params.MeteringRectangle[] getMETERING_REGIONS_EMPTY() {
            return METERING_REGIONS_EMPTY;
        }

        public final android.hardware.camera2.params.MeteringRectangle[] getMETERING_REGIONS_DEFAULT() {
            return METERING_REGIONS_DEFAULT;
        }

        /* renamed from: getFRAME_NUMBER_INVALID-Ugla2oM, reason: not valid java name */
        public final long m359getFRAME_NUMBER_INVALIDUgla2oM() {
            return FRAME_NUMBER_INVALID;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\bg\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0005H&J\u0016\u0010\t\u001a\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH&J\b\u0010\u000e\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&Jî\u0001\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u000b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00132\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"2\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u0010(\u001a\u00020)2\b\b\u0002\u0010*\u001a\u00020)H¦@¢\u0006\u0004\b+\u0010,Jd\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\n\b\u0002\u0010.\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010$2\n\b\u0002\u00100\u001a\u0004\u0018\u00010$2\u0016\b\u0002\u00101\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u00102\u001a\u00020)H¦@¢\u0006\u0002\u00103J@\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0016\b\u0002\u0010%\u001a\u0010\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0018\u00010\"2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u00102\u001a\u00020)H¦@¢\u0006\u0002\u00105J<\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u00106\u001a\u00020$2\b\b\u0002\u00107\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020'2\b\b\u0002\u00102\u001a\u00020)H¦@¢\u0006\u0002\u00108J\u001e\u00109\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\b\u0002\u0010:\u001a\u00020$H¦@¢\u0006\u0002\u0010;ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006<À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/CameraGraph$Session;", "Landroidx/camera/camera2/pipe/CameraControls3A;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "startRepeating", "", "request", "Landroidx/camera/camera2/pipe/Request;", "stopRepeating", "submit", "requests", "", "capture", "Landroidx/camera/camera2/pipe/FrameCapture;", "abort", "lock3A", "Lkotlinx/coroutines/Deferred;", "Landroidx/camera/camera2/pipe/Result3A;", "aeMode", "Landroidx/camera/camera2/pipe/AeMode;", "afMode", "Landroidx/camera/camera2/pipe/AfMode;", "awbMode", "Landroidx/camera/camera2/pipe/AwbMode;", "aeRegions", "Landroid/hardware/camera2/params/MeteringRectangle;", "afRegions", "awbRegions", "aeLockBehavior", "Landroidx/camera/camera2/pipe/Lock3ABehavior;", "afLockBehavior", "awbLockBehavior", "afTriggerStartAeMode", "convergedCondition", "Lkotlin/Function1;", "Landroidx/camera/camera2/pipe/FrameMetadata;", "", "lockedCondition", "frameLimit", "", "convergedTimeLimitNs", "", "lockedTimeLimitNs", "lock3A--tS25XM", "(Landroidx/camera/camera2/pipe/AeMode;Landroidx/camera/camera2/pipe/AfMode;Landroidx/camera/camera2/pipe/AwbMode;Ljava/util/List;Ljava/util/List;Ljava/util/List;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/Lock3ABehavior;Landroidx/camera/camera2/pipe/AeMode;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IJJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlock3A", "ae", "af", "awb", "unlockedCondition", "timeLimitNs", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lock3AForCapture", "(Lkotlin/jvm/functions/Function1;IJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "triggerAf", "waitForAwb", "(ZZIJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unlock3APostCapture", "cancelAf", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Session extends androidx.camera.camera2.pipe.CameraControls3A, java.lang.AutoCloseable {
        void abort();

        androidx.camera.camera2.pipe.FrameCapture capture(androidx.camera.camera2.pipe.Request request);

        java.util.List<androidx.camera.camera2.pipe.FrameCapture> capture(java.util.List<androidx.camera.camera2.pipe.Request> requests);

        /* renamed from: lock3A--tS25XM, reason: not valid java name */
        java.lang.Object mo386lock3AtS25XM(androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List<android.hardware.camera2.params.MeteringRectangle> list, java.util.List<android.hardware.camera2.params.MeteringRectangle> list2, java.util.List<android.hardware.camera2.params.MeteringRectangle> list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode2, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function12, int i, long j, long j2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation);

        java.lang.Object lock3AForCapture(kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation);

        java.lang.Object lock3AForCapture(boolean z, boolean z2, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation);

        void startRepeating(androidx.camera.camera2.pipe.Request request);

        void stopRepeating();

        void submit(androidx.camera.camera2.pipe.Request request);

        void submit(java.util.List<androidx.camera.camera2.pipe.Request> requests);

        java.lang.Object unlock3A(java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.functions.Function1<? super androidx.camera.camera2.pipe.FrameMetadata, java.lang.Boolean> function1, int i, long j, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation);

        java.lang.Object unlock3APostCapture(boolean z, kotlin.coroutines.Continuation<? super kotlinx.coroutines.Deferred<androidx.camera.camera2.pipe.Result3A>> continuation);

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class DefaultImpls {
        }

        /* renamed from: lock3A--tS25XM$default, reason: not valid java name */
        static /* synthetic */ java.lang.Object m385lock3AtS25XM$default(androidx.camera.camera2.pipe.CameraGraph.Session session, androidx.camera.camera2.pipe.AeMode aeMode, androidx.camera.camera2.pipe.AfMode afMode, androidx.camera.camera2.pipe.AwbMode awbMode, java.util.List list, java.util.List list2, java.util.List list3, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior2, androidx.camera.camera2.pipe.Lock3ABehavior lock3ABehavior3, androidx.camera.camera2.pipe.AeMode aeMode2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, int i, long j, long j2, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return session.mo386lock3AtS25XM((i2 & 1) != 0 ? null : aeMode, (i2 & 2) != 0 ? null : afMode, (i2 & 4) != 0 ? null : awbMode, (i2 & 8) != 0 ? null : list, (i2 & 16) != 0 ? null : list2, (i2 & 32) != 0 ? null : list3, (i2 & 64) != 0 ? null : lock3ABehavior, (i2 & 128) != 0 ? null : lock3ABehavior2, (i2 & 256) != 0 ? null : lock3ABehavior3, (i2 & 512) != 0 ? null : aeMode2, (i2 & 1024) != 0 ? null : function1, (i2 & 2048) != 0 ? null : function12, (i2 & 4096) != 0 ? 60 : i, (i2 & 8192) != 0 ? 3000000000L : j, (i2 & 16384) != 0 ? 3000000000L : j2, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3A--tS25XM");
        }

        static /* synthetic */ java.lang.Object unlock3A$default(androidx.camera.camera2.pipe.CameraGraph.Session session, java.lang.Boolean bool, java.lang.Boolean bool2, java.lang.Boolean bool3, kotlin.jvm.functions.Function1 function1, int i, long j, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj == null) {
                return session.unlock3A((i2 & 1) != 0 ? null : bool, (i2 & 2) != 0 ? null : bool2, (i2 & 4) != 0 ? null : bool3, (i2 & 8) != 0 ? null : function1, (i2 & 16) != 0 ? 60 : i, (i2 & 32) != 0 ? 3000000000L : j, continuation);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3A");
        }

        static /* synthetic */ java.lang.Object lock3AForCapture$default(androidx.camera.camera2.pipe.CameraGraph.Session session, kotlin.jvm.functions.Function1 function1, int i, long j, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3AForCapture");
            }
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            kotlin.jvm.functions.Function1 function12 = function1;
            if ((i2 & 2) != 0) {
                i = 60;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                j = androidx.camera.camera2.pipe.CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
            }
            return session.lock3AForCapture(function12, i3, j, continuation);
        }

        static /* synthetic */ java.lang.Object lock3AForCapture$default(androidx.camera.camera2.pipe.CameraGraph.Session session, boolean z, boolean z2, int i, long j, kotlin.coroutines.Continuation continuation, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock3AForCapture");
            }
            if ((i2 & 1) != 0) {
                z = true;
            }
            boolean z3 = z;
            if ((i2 & 2) != 0) {
                z2 = false;
            }
            boolean z4 = z2;
            if ((i2 & 4) != 0) {
                i = 60;
            }
            int i3 = i;
            if ((i2 & 8) != 0) {
                j = androidx.camera.camera2.pipe.CameraGraph.Constants3A.DEFAULT_TIME_LIMIT_NS;
            }
            return session.lock3AForCapture(z3, z4, i3, j, continuation);
        }

        static /* synthetic */ java.lang.Object unlock3APostCapture$default(androidx.camera.camera2.pipe.CameraGraph.Session session, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock3APostCapture");
            }
            if ((i & 1) != 0) {
                z = true;
            }
            return session.unlock3APostCapture(z, continuation);
        }
    }
}
