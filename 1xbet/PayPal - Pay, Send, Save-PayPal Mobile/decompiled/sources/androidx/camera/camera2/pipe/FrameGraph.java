package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0004\u0011\u0012\u0013\u0010JA\u0010\u000e\u001a\u00020\r2\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/FrameGraph;", "Landroidx/camera/camera2/pipe/CameraGraphBase;", "Landroidx/camera/camera2/pipe/FrameGraph$Session;", "Landroidx/camera/camera2/pipe/CameraControls3A;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamIds", "", "", "parameters", "", "capacity", "Landroidx/camera/camera2/pipe/FrameBuffer;", "captureWith", "(Ljava/util/Set;Ljava/util/Map;I)Landroidx/camera/camera2/pipe/FrameBuffer;", "Companion", "Config", "ConcurrentConfig", "Session"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FrameGraph extends androidx.camera.camera2.pipe.CameraGraphBase<androidx.camera.camera2.pipe.FrameGraph.Session>, androidx.camera.camera2.pipe.CameraControls3A, androidx.camera.camera2.pipe.UnsafeWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.FrameGraph.Companion INSTANCE = androidx.camera.camera2.pipe.FrameGraph.Companion.getHighResolutionOutputSizeshNQ4ISI;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/FrameGraph$Session;", "Landroidx/camera/camera2/pipe/CameraGraph$Session;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public interface Session extends androidx.camera.camera2.pipe.CameraGraph.Session {
    }

    androidx.camera.camera2.pipe.FrameBuffer captureWith(java.util.Set<androidx.camera.camera2.pipe.StreamId> streamIds, java.util.Map<java.lang.Object, ? extends java.lang.Object> parameters, int capacity);

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/FrameGraph$Config;", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "cameraGraphConfig", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)V", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "getCameraGraphConfig", "()Landroidx/camera/camera2/pipe/CameraGraph$Config;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {
        private final androidx.camera.camera2.pipe.CameraGraph.Config cameraGraphConfig;

        public Config(androidx.camera.camera2.pipe.CameraGraph.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            this.cameraGraphConfig = config;
        }

        public final androidx.camera.camera2.pipe.CameraGraph.Config getCameraGraphConfig() {
            return this.cameraGraphConfig;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/camera/camera2/pipe/FrameGraph$ConcurrentConfig;", "", "Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "cameraGraphConfigs", "", "Landroidx/camera/camera2/pipe/FrameGraph$Config;", "frameGraphConfigs", "<init>", "(Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;Ljava/util/List;)V", "Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "getCameraGraphConfigs", "()Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "Ljava/util/List;", "getFrameGraphConfigs", "()Ljava/util/List;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ConcurrentConfig {
        private final androidx.camera.camera2.pipe.CameraGraph.ConcurrentConfig cameraGraphConfigs;
        private final java.util.List<androidx.camera.camera2.pipe.FrameGraph.Config> frameGraphConfigs;

        public ConcurrentConfig(androidx.camera.camera2.pipe.CameraGraph.ConcurrentConfig concurrentConfig, java.util.List<androidx.camera.camera2.pipe.FrameGraph.Config> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(concurrentConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.cameraGraphConfigs = concurrentConfig;
            this.frameGraphConfigs = list;
            int size = concurrentConfig.getGraphConfigs().size();
            int size2 = concurrentConfig.getGraphConfigs().size();
            if (size2 != size) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid FrameGraph.ConcurrentConfig! Expected ");
                sb.append(size);
                sb.append(" configs, but received ");
                sb.append(size2);
                sb.append(" FrameGraph.Config(s).");
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            for (androidx.camera.camera2.pipe.FrameGraph.Config config : list) {
                if (!this.cameraGraphConfigs.getGraphConfigs().contains(config.getCameraGraphConfig())) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Mismatched ");
                    sb2.append(config);
                    sb2.append("! Config is not present within ");
                    sb2.append(this.cameraGraphConfigs.getGraphConfigs());
                    throw new java.lang.IllegalArgumentException(sb2.toString().toString());
                }
            }
        }

        public final androidx.camera.camera2.pipe.CameraGraph.ConcurrentConfig getCameraGraphConfigs() {
            return this.cameraGraphConfigs;
        }

        public final java.util.List<androidx.camera.camera2.pipe.FrameGraph.Config> getFrameGraphConfigs() {
            return this.frameGraphConfigs;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ androidx.camera.camera2.pipe.FrameBuffer captureWith$default(androidx.camera.camera2.pipe.FrameGraph frameGraph, java.util.Set set, java.util.Map map, int i, int i2, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: captureWith");
        }
        if ((i2 & 1) != 0) {
            set = kotlin.collections.SetsKt.emptySet();
        }
        if ((i2 & 2) != 0) {
            map = kotlin.collections.MapsKt.emptyMap();
        }
        if ((i2 & 4) != 0) {
            i = 1;
        }
        return frameGraph.captureWith(set, map, i);
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000e\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/FrameGraph$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/FrameGraph;", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "", "parameters", "", "capacity", "Landroidx/camera/camera2/pipe/FrameBuffer;", "captureWith---NP5ps", "(Landroidx/camera/camera2/pipe/FrameGraph;ILjava/util/Map;I)Landroidx/camera/camera2/pipe/FrameBuffer;", "captureWith"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.FrameGraph.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.pipe.FrameGraph.Companion();

        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: captureWith---NP5ps$default, reason: not valid java name */
        public static /* synthetic */ androidx.camera.camera2.pipe.FrameBuffer m486captureWithNP5ps$default(androidx.camera.camera2.pipe.FrameGraph.Companion companion, androidx.camera.camera2.pipe.FrameGraph frameGraph, int i, java.util.Map map, int i2, int i3, java.lang.Object obj) {
            if ((i3 & 2) != 0) {
                map = kotlin.collections.MapsKt.emptyMap();
            }
            if ((i3 & 4) != 0) {
                i2 = 1;
            }
            return companion.m487captureWithNP5ps(frameGraph, i, map, i2);
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: captureWith---NP5ps, reason: not valid java name */
        public final androidx.camera.camera2.pipe.FrameBuffer m487captureWithNP5ps(androidx.camera.camera2.pipe.FrameGraph frameGraph, int i, java.util.Map<java.lang.Object, ? extends java.lang.Object> map, int i2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(frameGraph, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            return frameGraph.captureWith(kotlin.collections.SetsKt.setOf(androidx.camera.camera2.pipe.StreamId.m755boximpl(i)), map, i2);
        }
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: captureWith---NP5ps, reason: not valid java name */
    static androidx.camera.camera2.pipe.FrameBuffer m485captureWithNP5ps(androidx.camera.camera2.pipe.FrameGraph frameGraph, int i, java.util.Map<java.lang.Object, ? extends java.lang.Object> map, int i2) {
        return INSTANCE.m487captureWithNP5ps(frameGraph, i, map, i2);
    }
}
