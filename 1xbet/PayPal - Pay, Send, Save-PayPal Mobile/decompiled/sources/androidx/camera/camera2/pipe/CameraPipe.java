package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u0000 +2\u00020\u0001:\u0007,-./01+J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0006J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t2\u0006\u0010\u0003\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H&¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0002H&¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020 H&¢\u0006\u0004\b#\u0010$R\u001c\u0010*\u001a\u00020%8'@'X¦\u000e¢\u0006\f\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe;", "", "Landroidx/camera/camera2/pipe/CameraGraph$Config;", "config", "Landroidx/camera/camera2/pipe/CameraGraph;", "create", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)Landroidx/camera/camera2/pipe/CameraGraph;", "createCameraGraph", "Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;", "", "createCameraGraphs", "(Landroidx/camera/camera2/pipe/CameraGraph$ConcurrentConfig;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/FrameGraph$Config;", "frameGraphConfig", "Landroidx/camera/camera2/pipe/FrameGraph;", "createFrameGraph", "(Landroidx/camera/camera2/pipe/FrameGraph$Config;)Landroidx/camera/camera2/pipe/FrameGraph;", "Landroidx/camera/camera2/pipe/FrameGraph$ConcurrentConfig;", "frameGraphConfigs", "createFrameGraphs", "(Landroidx/camera/camera2/pipe/FrameGraph$ConcurrentConfig;)Ljava/util/List;", "Landroidx/camera/camera2/pipe/CameraDevices;", "cameras", "()Landroidx/camera/camera2/pipe/CameraDevices;", "Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "cameraSurfaceManager", "()Landroidx/camera/camera2/pipe/CameraSurfaceManager;", "graphConfig", "Landroidx/camera/camera2/pipe/ConfigQueryResult;", "isConfigSupported-NpXggIU", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConfigSupported", "", "prewarmIsConfigSupported", "(Landroidx/camera/camera2/pipe/CameraGraph$Config;)V", "shutdown", "()V", "Landroidx/camera/camera2/pipe/AudioRestrictionMode;", "getGlobalAudioRestrictionMode-_b5Q8KE", "()I", "setGlobalAudioRestrictionMode-LwUUkyU", "(I)V", "globalAudioRestrictionMode", "Companion", "Config", "Flags", "CameraInteropConfig", "ThreadConfig", "CameraMetadataConfig", "CameraBackendConfig"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface CameraPipe {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.CameraPipe.Companion INSTANCE = androidx.camera.camera2.pipe.CameraPipe.Companion.getHighResolutionOutputSizeshNQ4ISI;

    androidx.camera.camera2.pipe.CameraSurfaceManager cameraSurfaceManager();

    androidx.camera.camera2.pipe.CameraDevices cameras();

    @kotlin.Deprecated(message = "Use createCameraGraph instead.", replaceWith = @kotlin.ReplaceWith(expression = "createCameraGraph(config)", imports = {}))
    androidx.camera.camera2.pipe.CameraGraph create(androidx.camera.camera2.pipe.CameraGraph.Config config);

    androidx.camera.camera2.pipe.CameraGraph createCameraGraph(androidx.camera.camera2.pipe.CameraGraph.Config config);

    java.util.List<androidx.camera.camera2.pipe.CameraGraph> createCameraGraphs(androidx.camera.camera2.pipe.CameraGraph.ConcurrentConfig config);

    androidx.camera.camera2.pipe.FrameGraph createFrameGraph(androidx.camera.camera2.pipe.FrameGraph.Config frameGraphConfig);

    java.util.List<androidx.camera.camera2.pipe.FrameGraph> createFrameGraphs(androidx.camera.camera2.pipe.FrameGraph.ConcurrentConfig frameGraphConfigs);

    /* renamed from: getGlobalAudioRestrictionMode-_b5Q8KE, reason: not valid java name */
    int mo416getGlobalAudioRestrictionMode_b5Q8KE();

    /* renamed from: isConfigSupported-NpXggIU, reason: not valid java name */
    java.lang.Object mo417isConfigSupportedNpXggIU(androidx.camera.camera2.pipe.CameraGraph.Config config, kotlin.coroutines.Continuation<? super androidx.camera.camera2.pipe.ConfigQueryResult> continuation);

    void prewarmIsConfigSupported(androidx.camera.camera2.pipe.CameraGraph.Config graphConfig);

    /* renamed from: setGlobalAudioRestrictionMode-LwUUkyU, reason: not valid java name */
    void mo418setGlobalAudioRestrictionModeLwUUkyU(int i);

    void shutdown();

    @kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b\"\u0010#Jd\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010.\u001a\u00020-HÖ\u0001¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0017R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0019R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001bR\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010\u001dR\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010!R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010>\u001a\u0004\b?\u0010#"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Config;", "", "Landroid/content/Context;", "appContext", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "threadConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "cameraMetadataConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "cameraBackendConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "cameraInteropConfig", "Landroidx/camera/camera2/pipe/media/ImageSources;", "imageSources", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "flags", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "platformApiCompat", "<init>", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;Landroidx/camera/camera2/pipe/media/ImageSources;Landroidx/camera/camera2/pipe/CameraPipe$Flags;Landroidx/camera/camera2/pipe/PlatformApiCompat;)V", "component1", "()Landroid/content/Context;", "component2", "()Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "component3", "()Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "component4", "()Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "component5", "()Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "component6", "()Landroidx/camera/camera2/pipe/media/ImageSources;", "component7", "()Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "component8", "()Landroidx/camera/camera2/pipe/PlatformApiCompat;", "copy", "(Landroid/content/Context;Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;Landroidx/camera/camera2/pipe/media/ImageSources;Landroidx/camera/camera2/pipe/CameraPipe$Flags;Landroidx/camera/camera2/pipe/PlatformApiCompat;)Landroidx/camera/camera2/pipe/CameraPipe$Config;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/content/Context;", "getAppContext", "Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "getThreadConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "getCameraMetadataConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "getCameraBackendConfig", "Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "getCameraInteropConfig", "Landroidx/camera/camera2/pipe/media/ImageSources;", "getImageSources", "Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "getFlags", "Landroidx/camera/camera2/pipe/PlatformApiCompat;", "getPlatformApiCompat"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Config {
        private final android.content.Context appContext;
        private final androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig cameraBackendConfig;
        private final androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig;
        private final androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig cameraMetadataConfig;
        private final androidx.camera.camera2.pipe.CameraPipe.Flags flags;
        private final androidx.camera.camera2.pipe.media.ImageSources imageSources;
        private final androidx.camera.camera2.pipe.PlatformApiCompat platformApiCompat;
        private final androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig;

        public Config(android.content.Context context, androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig, androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig cameraMetadataConfig, androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig cameraBackendConfig, androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig, androidx.camera.camera2.pipe.media.ImageSources imageSources, androidx.camera.camera2.pipe.CameraPipe.Flags flags, androidx.camera.camera2.pipe.PlatformApiCompat platformApiCompat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadataConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackendConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInteropConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "");
            this.appContext = context;
            this.threadConfig = threadConfig;
            this.cameraMetadataConfig = cameraMetadataConfig;
            this.cameraBackendConfig = cameraBackendConfig;
            this.cameraInteropConfig = cameraInteropConfig;
            this.imageSources = imageSources;
            this.flags = flags;
            this.platformApiCompat = platformApiCompat;
        }

        public final android.content.Context getAppContext() {
            return this.appContext;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Multi-variable type inference failed */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Config(android.content.Context context, androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig, androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig cameraMetadataConfig, androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig cameraBackendConfig, androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig, androidx.camera.camera2.pipe.media.ImageSources imageSources, androidx.camera.camera2.pipe.CameraPipe.Flags flags, androidx.camera.camera2.pipe.PlatformApiCompat platformApiCompat, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(context, r1, r2, r4, r5, r6, r7, (i & 128) == 0 ? platformApiCompat : null);
            androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig cameraMetadataConfig2;
            androidx.camera.camera2.pipe.CameraPipe.Flags flags2;
            androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig2 = (i & 2) != 0 ? new androidx.camera.camera2.pipe.CameraPipe.ThreadConfig(null, null, null, null, null, null, null, 127, null) : threadConfig;
            java.lang.Object[] objArr = 0;
            java.lang.Object[] objArr2 = 0;
            java.lang.Object[] objArr3 = 0;
            java.lang.Object[] objArr4 = 0;
            if ((i & 4) != 0) {
                cameraMetadataConfig2 = new androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig(objArr4 == true ? 1 : 0, objArr3 == true ? 1 : 0, 3, objArr2 == true ? 1 : 0);
            } else {
                cameraMetadataConfig2 = cameraMetadataConfig;
            }
            androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig cameraBackendConfig2 = (i & 8) != 0 ? new androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig(null, null, null, 7, null) : cameraBackendConfig;
            androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig2 = (i & 16) != 0 ? new androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig(null, null, null, 7, null) : cameraInteropConfig;
            androidx.camera.camera2.pipe.media.ImageSources imageSources2 = (i & 32) != 0 ? null : imageSources;
            if ((i & 64) != 0) {
                flags2 = new androidx.camera.camera2.pipe.CameraPipe.Flags(false, 1, objArr == true ? 1 : 0);
            } else {
                flags2 = flags;
            }
        }

        public final androidx.camera.camera2.pipe.CameraPipe.ThreadConfig getThreadConfig() {
            return this.threadConfig;
        }

        public final androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig getCameraMetadataConfig() {
            return this.cameraMetadataConfig;
        }

        public final androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig getCameraBackendConfig() {
            return this.cameraBackendConfig;
        }

        public final androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig getCameraInteropConfig() {
            return this.cameraInteropConfig;
        }

        public final androidx.camera.camera2.pipe.media.ImageSources getImageSources() {
            return this.imageSources;
        }

        public final androidx.camera.camera2.pipe.CameraPipe.Flags getFlags() {
            return this.flags;
        }

        public final androidx.camera.camera2.pipe.PlatformApiCompat getPlatformApiCompat() {
            return this.platformApiCompat;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(appContext=");
            sb.append(this.appContext);
            sb.append(", threadConfig=");
            sb.append(this.threadConfig);
            sb.append(", cameraMetadataConfig=");
            sb.append(this.cameraMetadataConfig);
            sb.append(", cameraBackendConfig=");
            sb.append(this.cameraBackendConfig);
            sb.append(", cameraInteropConfig=");
            sb.append(this.cameraInteropConfig);
            sb.append(", imageSources=");
            sb.append(this.imageSources);
            sb.append(", flags=");
            sb.append(this.flags);
            sb.append(", platformApiCompat=");
            sb.append(this.platformApiCompat);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.appContext.hashCode();
            int hashCode2 = this.threadConfig.hashCode();
            int hashCode3 = this.cameraMetadataConfig.hashCode();
            int hashCode4 = this.cameraBackendConfig.hashCode();
            int hashCode5 = this.cameraInteropConfig.hashCode();
            androidx.camera.camera2.pipe.media.ImageSources imageSources = this.imageSources;
            int hashCode6 = imageSources == null ? 0 : imageSources.hashCode();
            int hashCode7 = this.flags.hashCode();
            androidx.camera.camera2.pipe.PlatformApiCompat platformApiCompat = this.platformApiCompat;
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (platformApiCompat != null ? platformApiCompat.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.pipe.CameraPipe.Config)) {
                return false;
            }
            androidx.camera.camera2.pipe.CameraPipe.Config config = (androidx.camera.camera2.pipe.CameraPipe.Config) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.appContext, config.appContext) && kotlin.jvm.internal.Intrinsics.areEqual(this.threadConfig, config.threadConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraMetadataConfig, config.cameraMetadataConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraBackendConfig, config.cameraBackendConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraInteropConfig, config.cameraInteropConfig) && kotlin.jvm.internal.Intrinsics.areEqual(this.imageSources, config.imageSources) && kotlin.jvm.internal.Intrinsics.areEqual(this.flags, config.flags) && kotlin.jvm.internal.Intrinsics.areEqual(this.platformApiCompat, config.platformApiCompat);
        }

        public final androidx.camera.camera2.pipe.CameraPipe.Config copy(android.content.Context appContext, androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig, androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig cameraMetadataConfig, androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig cameraBackendConfig, androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig, androidx.camera.camera2.pipe.media.ImageSources imageSources, androidx.camera.camera2.pipe.CameraPipe.Flags flags, androidx.camera.camera2.pipe.PlatformApiCompat platformApiCompat) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threadConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraMetadataConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraBackendConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraInteropConfig, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(flags, "");
            return new androidx.camera.camera2.pipe.CameraPipe.Config(appContext, threadConfig, cameraMetadataConfig, cameraBackendConfig, cameraInteropConfig, imageSources, flags, platformApiCompat);
        }

        /* renamed from: component8, reason: from getter */
        public final androidx.camera.camera2.pipe.PlatformApiCompat getPlatformApiCompat() {
            return this.platformApiCompat;
        }

        /* renamed from: component7, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraPipe.Flags getFlags() {
            return this.flags;
        }

        /* renamed from: component6, reason: from getter */
        public final androidx.camera.camera2.pipe.media.ImageSources getImageSources() {
            return this.imageSources;
        }

        /* renamed from: component5, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig getCameraInteropConfig() {
            return this.cameraInteropConfig;
        }

        /* renamed from: component4, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraPipe.CameraBackendConfig getCameraBackendConfig() {
            return this.cameraBackendConfig;
        }

        /* renamed from: component3, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig getCameraMetadataConfig() {
            return this.cameraMetadataConfig;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraPipe.ThreadConfig getThreadConfig() {
            return this.threadConfig;
        }

        /* renamed from: component1, reason: from getter */
        public final android.content.Context getAppContext() {
            return this.appContext;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "", "", "strictModeEnabled", "<init>", "(Z)V", "component1", "()Z", "copy", "(Z)Landroidx/camera/camera2/pipe/CameraPipe$Flags;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "getStrictModeEnabled"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Flags {
        private final boolean strictModeEnabled;

        public Flags(boolean z) {
            this.strictModeEnabled = z;
        }

        public /* synthetic */ Flags(boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? false : z);
        }

        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Flags(strictModeEnabled=");
            sb.append(this.strictModeEnabled);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return java.lang.Boolean.hashCode(this.strictModeEnabled);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof androidx.camera.camera2.pipe.CameraPipe.Flags) && this.strictModeEnabled == ((androidx.camera.camera2.pipe.CameraPipe.Flags) other).strictModeEnabled;
        }

        public final androidx.camera.camera2.pipe.CameraPipe.Flags copy(boolean strictModeEnabled) {
            return new androidx.camera.camera2.pipe.CameraPipe.Flags(strictModeEnabled);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getStrictModeEnabled() {
            return this.strictModeEnabled;
        }

        public static /* synthetic */ androidx.camera.camera2.pipe.CameraPipe.Flags copy$default(androidx.camera.camera2.pipe.CameraPipe.Flags flags, boolean z, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                z = flags.strictModeEnabled;
            }
            return flags.copy(z);
        }

        public Flags() {
            this(false, 1, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "cameraDeviceStateCallback", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "cameraCaptureSessionListener", "Landroidx/camera/camera2/pipe/core/DurationNs;", "cameraOpenRetryMaxTimeoutNs", "<init>", "(Landroid/hardware/camera2/CameraDevice$StateCallback;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Landroidx/camera/camera2/pipe/core/DurationNs;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Landroid/hardware/camera2/CameraDevice$StateCallback;", "component2", "()Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "component3-QWez1Bs", "()Landroidx/camera/camera2/pipe/core/DurationNs;", "component3", "copy-ck8WKOA", "(Landroid/hardware/camera2/CameraDevice$StateCallback;Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;Landroidx/camera/camera2/pipe/core/DurationNs;)Landroidx/camera/camera2/pipe/CameraPipe$CameraInteropConfig;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "getCameraDeviceStateCallback", "Landroidx/camera/camera2/pipe/CameraInterop$CaptureSessionListener;", "getCameraCaptureSessionListener", "Landroidx/camera/camera2/pipe/core/DurationNs;", "getCameraOpenRetryMaxTimeoutNs-QWez1Bs"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CameraInteropConfig {
        private final androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener cameraCaptureSessionListener;
        private final android.hardware.camera2.CameraDevice.StateCallback cameraDeviceStateCallback;
        private final androidx.camera.camera2.pipe.core.DurationNs cameraOpenRetryMaxTimeoutNs;

        private CameraInteropConfig(android.hardware.camera2.CameraDevice.StateCallback stateCallback, androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener captureSessionListener, androidx.camera.camera2.pipe.core.DurationNs durationNs) {
            this.cameraDeviceStateCallback = stateCallback;
            this.cameraCaptureSessionListener = captureSessionListener;
            this.cameraOpenRetryMaxTimeoutNs = durationNs;
        }

        public /* synthetic */ CameraInteropConfig(android.hardware.camera2.CameraDevice.StateCallback stateCallback, androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener captureSessionListener, androidx.camera.camera2.pipe.core.DurationNs durationNs, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : stateCallback, (i & 2) != 0 ? null : captureSessionListener, (i & 4) != 0 ? null : durationNs, null);
        }

        public final android.hardware.camera2.CameraDevice.StateCallback getCameraDeviceStateCallback() {
            return this.cameraDeviceStateCallback;
        }

        public final androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener getCameraCaptureSessionListener() {
            return this.cameraCaptureSessionListener;
        }

        /* renamed from: getCameraOpenRetryMaxTimeoutNs-QWez1Bs, reason: not valid java name */
        public final androidx.camera.camera2.pipe.core.DurationNs m423getCameraOpenRetryMaxTimeoutNsQWez1Bs() {
            return this.cameraOpenRetryMaxTimeoutNs;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraInteropConfig(cameraDeviceStateCallback=");
            sb.append(this.cameraDeviceStateCallback);
            sb.append(", cameraCaptureSessionListener=");
            sb.append(this.cameraCaptureSessionListener);
            sb.append(", cameraOpenRetryMaxTimeoutNs=");
            sb.append(this.cameraOpenRetryMaxTimeoutNs);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            android.hardware.camera2.CameraDevice.StateCallback stateCallback = this.cameraDeviceStateCallback;
            int hashCode = stateCallback == null ? 0 : stateCallback.hashCode();
            androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener captureSessionListener = this.cameraCaptureSessionListener;
            int hashCode2 = captureSessionListener == null ? 0 : captureSessionListener.hashCode();
            androidx.camera.camera2.pipe.core.DurationNs durationNs = this.cameraOpenRetryMaxTimeoutNs;
            return (((hashCode * 31) + hashCode2) * 31) + (durationNs != null ? androidx.camera.camera2.pipe.core.DurationNs.m875hashCodeimpl(durationNs.m880unboximpl()) : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig)) {
                return false;
            }
            androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig = (androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.cameraDeviceStateCallback, cameraInteropConfig.cameraDeviceStateCallback) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraCaptureSessionListener, cameraInteropConfig.cameraCaptureSessionListener) && kotlin.jvm.internal.Intrinsics.areEqual(this.cameraOpenRetryMaxTimeoutNs, cameraInteropConfig.cameraOpenRetryMaxTimeoutNs);
        }

        /* renamed from: copy-ck8WKOA, reason: not valid java name */
        public final androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig m422copyck8WKOA(android.hardware.camera2.CameraDevice.StateCallback cameraDeviceStateCallback, androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener cameraCaptureSessionListener, androidx.camera.camera2.pipe.core.DurationNs cameraOpenRetryMaxTimeoutNs) {
            return new androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig(cameraDeviceStateCallback, cameraCaptureSessionListener, cameraOpenRetryMaxTimeoutNs, null);
        }

        /* renamed from: component3-QWez1Bs, reason: not valid java name and from getter */
        public final androidx.camera.camera2.pipe.core.DurationNs getCameraOpenRetryMaxTimeoutNs() {
            return this.cameraOpenRetryMaxTimeoutNs;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener getCameraCaptureSessionListener() {
            return this.cameraCaptureSessionListener;
        }

        /* renamed from: component1, reason: from getter */
        public final android.hardware.camera2.CameraDevice.StateCallback getCameraDeviceStateCallback() {
            return this.cameraDeviceStateCallback;
        }

        /* renamed from: copy-ck8WKOA$default, reason: not valid java name */
        public static /* synthetic */ androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig m420copyck8WKOA$default(androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig, android.hardware.camera2.CameraDevice.StateCallback stateCallback, androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener captureSessionListener, androidx.camera.camera2.pipe.core.DurationNs durationNs, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                stateCallback = cameraInteropConfig.cameraDeviceStateCallback;
            }
            if ((i & 2) != 0) {
                captureSessionListener = cameraInteropConfig.cameraCaptureSessionListener;
            }
            if ((i & 4) != 0) {
                durationNs = cameraInteropConfig.cameraOpenRetryMaxTimeoutNs;
            }
            return cameraInteropConfig.m422copyck8WKOA(stateCallback, captureSessionListener, durationNs);
        }

        public /* synthetic */ CameraInteropConfig(android.hardware.camera2.CameraDevice.StateCallback stateCallback, androidx.camera.camera2.pipe.CameraInterop.CaptureSessionListener captureSessionListener, androidx.camera.camera2.pipe.core.DurationNs durationNs, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(stateCallback, captureSessionListener, durationNs);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019Jj\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0010R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010&\u001a\u0004\b(\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b)\u0010\u0010R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0015R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b0\u0010\u0019"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "", "Ljava/util/concurrent/Executor;", "defaultLightweightExecutor", "defaultBackgroundExecutor", "defaultBlockingExecutor", "defaultCameraExecutor", "Landroid/os/Handler;", "defaultCameraHandler", "Lkotlin/Function0;", "defaultCameraHandlerFn", "Lkotlinx/coroutines/CoroutineScope;", "testOnlyScope", "<init>", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)V", "component1", "()Ljava/util/concurrent/Executor;", "component2", "component3", "component4", "component5", "()Landroid/os/Handler;", "component6", "()Lkotlin/jvm/functions/Function0;", "component7", "()Lkotlinx/coroutines/CoroutineScope;", "copy", "(Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/os/Handler;Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CoroutineScope;)Landroidx/camera/camera2/pipe/CameraPipe$ThreadConfig;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/util/concurrent/Executor;", "getDefaultLightweightExecutor", "getDefaultBackgroundExecutor", "getDefaultBlockingExecutor", "getDefaultCameraExecutor", "Landroid/os/Handler;", "getDefaultCameraHandler", "Lkotlin/jvm/functions/Function0;", "getDefaultCameraHandlerFn", "Lkotlinx/coroutines/CoroutineScope;", "getTestOnlyScope"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ThreadConfig {
        private final java.util.concurrent.Executor defaultBackgroundExecutor;
        private final java.util.concurrent.Executor defaultBlockingExecutor;
        private final java.util.concurrent.Executor defaultCameraExecutor;
        private final android.os.Handler defaultCameraHandler;
        private final kotlin.jvm.functions.Function0<android.os.Handler> defaultCameraHandlerFn;
        private final java.util.concurrent.Executor defaultLightweightExecutor;
        private final kotlinx.coroutines.CoroutineScope testOnlyScope;

        /* JADX WARN: Multi-variable type inference failed */
        public ThreadConfig(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3, java.util.concurrent.Executor executor4, android.os.Handler handler, kotlin.jvm.functions.Function0<? extends android.os.Handler> function0, kotlinx.coroutines.CoroutineScope coroutineScope) {
            this.defaultLightweightExecutor = executor;
            this.defaultBackgroundExecutor = executor2;
            this.defaultBlockingExecutor = executor3;
            this.defaultCameraExecutor = executor4;
            this.defaultCameraHandler = handler;
            this.defaultCameraHandlerFn = function0;
            this.testOnlyScope = coroutineScope;
        }

        public /* synthetic */ ThreadConfig(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3, java.util.concurrent.Executor executor4, android.os.Handler handler, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : executor, (i & 2) != 0 ? null : executor2, (i & 4) != 0 ? null : executor3, (i & 8) != 0 ? null : executor4, (i & 16) != 0 ? null : handler, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? null : coroutineScope);
        }

        public final java.util.concurrent.Executor getDefaultLightweightExecutor() {
            return this.defaultLightweightExecutor;
        }

        public final java.util.concurrent.Executor getDefaultBackgroundExecutor() {
            return this.defaultBackgroundExecutor;
        }

        public final java.util.concurrent.Executor getDefaultBlockingExecutor() {
            return this.defaultBlockingExecutor;
        }

        public final java.util.concurrent.Executor getDefaultCameraExecutor() {
            return this.defaultCameraExecutor;
        }

        public final android.os.Handler getDefaultCameraHandler() {
            return this.defaultCameraHandler;
        }

        public final kotlin.jvm.functions.Function0<android.os.Handler> getDefaultCameraHandlerFn() {
            return this.defaultCameraHandlerFn;
        }

        public final kotlinx.coroutines.CoroutineScope getTestOnlyScope() {
            return this.testOnlyScope;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ThreadConfig(defaultLightweightExecutor=");
            sb.append(this.defaultLightweightExecutor);
            sb.append(", defaultBackgroundExecutor=");
            sb.append(this.defaultBackgroundExecutor);
            sb.append(", defaultBlockingExecutor=");
            sb.append(this.defaultBlockingExecutor);
            sb.append(", defaultCameraExecutor=");
            sb.append(this.defaultCameraExecutor);
            sb.append(", defaultCameraHandler=");
            sb.append(this.defaultCameraHandler);
            sb.append(", defaultCameraHandlerFn=");
            sb.append(this.defaultCameraHandlerFn);
            sb.append(", testOnlyScope=");
            sb.append(this.testOnlyScope);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            java.util.concurrent.Executor executor = this.defaultLightweightExecutor;
            int hashCode = executor == null ? 0 : executor.hashCode();
            java.util.concurrent.Executor executor2 = this.defaultBackgroundExecutor;
            int hashCode2 = executor2 == null ? 0 : executor2.hashCode();
            java.util.concurrent.Executor executor3 = this.defaultBlockingExecutor;
            int hashCode3 = executor3 == null ? 0 : executor3.hashCode();
            java.util.concurrent.Executor executor4 = this.defaultCameraExecutor;
            int hashCode4 = executor4 == null ? 0 : executor4.hashCode();
            android.os.Handler handler = this.defaultCameraHandler;
            int hashCode5 = handler == null ? 0 : handler.hashCode();
            kotlin.jvm.functions.Function0<android.os.Handler> function0 = this.defaultCameraHandlerFn;
            int hashCode6 = function0 == null ? 0 : function0.hashCode();
            kotlinx.coroutines.CoroutineScope coroutineScope = this.testOnlyScope;
            return (((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (coroutineScope != null ? coroutineScope.hashCode() : 0);
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.camera.camera2.pipe.CameraPipe.ThreadConfig)) {
                return false;
            }
            androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig = (androidx.camera.camera2.pipe.CameraPipe.ThreadConfig) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.defaultLightweightExecutor, threadConfig.defaultLightweightExecutor) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultBackgroundExecutor, threadConfig.defaultBackgroundExecutor) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultBlockingExecutor, threadConfig.defaultBlockingExecutor) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultCameraExecutor, threadConfig.defaultCameraExecutor) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultCameraHandler, threadConfig.defaultCameraHandler) && kotlin.jvm.internal.Intrinsics.areEqual(this.defaultCameraHandlerFn, threadConfig.defaultCameraHandlerFn) && kotlin.jvm.internal.Intrinsics.areEqual(this.testOnlyScope, threadConfig.testOnlyScope);
        }

        public final androidx.camera.camera2.pipe.CameraPipe.ThreadConfig copy(java.util.concurrent.Executor defaultLightweightExecutor, java.util.concurrent.Executor defaultBackgroundExecutor, java.util.concurrent.Executor defaultBlockingExecutor, java.util.concurrent.Executor defaultCameraExecutor, android.os.Handler defaultCameraHandler, kotlin.jvm.functions.Function0<? extends android.os.Handler> defaultCameraHandlerFn, kotlinx.coroutines.CoroutineScope testOnlyScope) {
            return new androidx.camera.camera2.pipe.CameraPipe.ThreadConfig(defaultLightweightExecutor, defaultBackgroundExecutor, defaultBlockingExecutor, defaultCameraExecutor, defaultCameraHandler, defaultCameraHandlerFn, testOnlyScope);
        }

        /* renamed from: component7, reason: from getter */
        public final kotlinx.coroutines.CoroutineScope getTestOnlyScope() {
            return this.testOnlyScope;
        }

        public final kotlin.jvm.functions.Function0<android.os.Handler> component6() {
            return this.defaultCameraHandlerFn;
        }

        /* renamed from: component5, reason: from getter */
        public final android.os.Handler getDefaultCameraHandler() {
            return this.defaultCameraHandler;
        }

        /* renamed from: component4, reason: from getter */
        public final java.util.concurrent.Executor getDefaultCameraExecutor() {
            return this.defaultCameraExecutor;
        }

        /* renamed from: component3, reason: from getter */
        public final java.util.concurrent.Executor getDefaultBlockingExecutor() {
            return this.defaultBlockingExecutor;
        }

        /* renamed from: component2, reason: from getter */
        public final java.util.concurrent.Executor getDefaultBackgroundExecutor() {
            return this.defaultBackgroundExecutor;
        }

        /* renamed from: component1, reason: from getter */
        public final java.util.concurrent.Executor getDefaultLightweightExecutor() {
            return this.defaultLightweightExecutor;
        }

        public static /* synthetic */ androidx.camera.camera2.pipe.CameraPipe.ThreadConfig copy$default(androidx.camera.camera2.pipe.CameraPipe.ThreadConfig threadConfig, java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, java.util.concurrent.Executor executor3, java.util.concurrent.Executor executor4, android.os.Handler handler, kotlin.jvm.functions.Function0 function0, kotlinx.coroutines.CoroutineScope coroutineScope, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                executor = threadConfig.defaultLightweightExecutor;
            }
            if ((i & 2) != 0) {
                executor2 = threadConfig.defaultBackgroundExecutor;
            }
            java.util.concurrent.Executor executor5 = executor2;
            if ((i & 4) != 0) {
                executor3 = threadConfig.defaultBlockingExecutor;
            }
            java.util.concurrent.Executor executor6 = executor3;
            if ((i & 8) != 0) {
                executor4 = threadConfig.defaultCameraExecutor;
            }
            java.util.concurrent.Executor executor7 = executor4;
            if ((i & 16) != 0) {
                handler = threadConfig.defaultCameraHandler;
            }
            android.os.Handler handler2 = handler;
            if ((i & 32) != 0) {
                function0 = threadConfig.defaultCameraHandlerFn;
            }
            kotlin.jvm.functions.Function0 function02 = function0;
            if ((i & 64) != 0) {
                coroutineScope = threadConfig.testOnlyScope;
            }
            return threadConfig.copy(executor, executor5, executor6, executor7, handler2, function02, coroutineScope);
        }

        public ThreadConfig() {
            this(null, null, null, null, null, null, null, 127, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B;\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\u0012\u001e\b\u0002\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00020\u0005¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR0\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$CameraMetadataConfig;", "", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "cacheBlocklist", "", "Landroidx/camera/camera2/pipe/CameraId;", "cameraCacheBlocklist", "<init>", "(Ljava/util/Set;Ljava/util/Map;)V", "Ljava/util/Set;", "getCacheBlocklist", "()Ljava/util/Set;", "Ljava/util/Map;", "getCameraCacheBlocklist", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraMetadataConfig {
        private final java.util.Set<android.hardware.camera2.CameraCharacteristics.Key<?>> cacheBlocklist;
        private final java.util.Map<androidx.camera.camera2.pipe.CameraId, java.util.Set<android.hardware.camera2.CameraCharacteristics.Key<?>>> cameraCacheBlocklist;

        /* JADX WARN: Multi-variable type inference failed */
        public CameraMetadataConfig(java.util.Set<? extends android.hardware.camera2.CameraCharacteristics.Key<?>> set, java.util.Map<androidx.camera.camera2.pipe.CameraId, ? extends java.util.Set<? extends android.hardware.camera2.CameraCharacteristics.Key<?>>> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.cacheBlocklist = set;
            this.cameraCacheBlocklist = map;
        }

        public /* synthetic */ CameraMetadataConfig(java.util.Set set, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? kotlin.collections.SetsKt.emptySet() : set, (i & 2) != 0 ? kotlin.collections.MapsKt.emptyMap() : map);
        }

        public final java.util.Set<android.hardware.camera2.CameraCharacteristics.Key<?>> getCacheBlocklist() {
            return this.cacheBlocklist;
        }

        public final java.util.Map<androidx.camera.camera2.pipe.CameraId, java.util.Set<android.hardware.camera2.CameraCharacteristics.Key<?>>> getCameraCacheBlocklist() {
            return this.cameraCacheBlocklist;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public CameraMetadataConfig() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$CameraBackendConfig;", "", "Landroidx/camera/camera2/pipe/CameraBackend;", "internalBackend", "Landroidx/camera/camera2/pipe/CameraBackendId;", "defaultBackend", "", "Landroidx/camera/camera2/pipe/CameraBackendFactory;", "cameraBackends", "<init>", "(Landroidx/camera/camera2/pipe/CameraBackend;Ljava/lang/String;Ljava/util/Map;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/CameraBackend;", "getInternalBackend", "()Landroidx/camera/camera2/pipe/CameraBackend;", "Ljava/lang/String;", "getDefaultBackend-AKmI2lo", "()Ljava/lang/String;", "Ljava/util/Map;", "getCameraBackends", "()Ljava/util/Map;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CameraBackendConfig {
        private final java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, androidx.camera.camera2.pipe.CameraBackendFactory> cameraBackends;
        private final java.lang.String defaultBackend;
        private final androidx.camera.camera2.pipe.CameraBackend internalBackend;

        /* JADX WARN: Multi-variable type inference failed */
        private CameraBackendConfig(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, ? extends androidx.camera.camera2.pipe.CameraBackendFactory> map) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(map, "");
            this.internalBackend = cameraBackend;
            this.defaultBackend = str;
            this.cameraBackends = map;
            if (str != null) {
                if (map.containsKey(str != null ? androidx.camera.camera2.pipe.CameraBackendId.m232boximpl(str) : null)) {
                    return;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append((java.lang.Object) (str == null ? "null" : androidx.camera.camera2.pipe.CameraBackendId.m237toStringimpl(str)));
                sb.append(" does not exist in cameraBackends! Available backends are: ");
                sb.append(map.keySet());
                throw new java.lang.IllegalStateException(sb.toString().toString());
            }
        }

        public final androidx.camera.camera2.pipe.CameraBackend getInternalBackend() {
            return this.internalBackend;
        }

        /* renamed from: getDefaultBackend-AKmI2lo, reason: not valid java name and from getter */
        public final java.lang.String getDefaultBackend() {
            return this.defaultBackend;
        }

        public /* synthetic */ CameraBackendConfig(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, java.util.Map map, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : cameraBackend, (i & 2) != 0 ? null : str, (i & 4) != 0 ? kotlin.collections.MapsKt.emptyMap() : map, null);
        }

        public final java.util.Map<androidx.camera.camera2.pipe.CameraBackendId, androidx.camera.camera2.pipe.CameraBackendFactory> getCameraBackends() {
            return this.cameraBackends;
        }

        public /* synthetic */ CameraBackendConfig(androidx.camera.camera2.pipe.CameraBackend cameraBackend, java.lang.String str, java.util.Map map, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(cameraBackend, str, map);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/CameraPipe$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/CameraPipe$Config;", "config", "Landroidx/camera/camera2/pipe/CameraPipe;", "create", "(Landroidx/camera/camera2/pipe/CameraPipe$Config;)Landroidx/camera/camera2/pipe/CameraPipe;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ androidx.camera.camera2.pipe.CameraPipe.Companion getHighResolutionOutputSizeshNQ4ISI = new androidx.camera.camera2.pipe.CameraPipe.Companion();

        private Companion() {
        }

        public final androidx.camera.camera2.pipe.CameraPipe create(androidx.camera.camera2.pipe.CameraPipe.Config config) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
            androidx.camera.camera2.pipe.core.Debug debug = androidx.camera.camera2.pipe.core.Debug.INSTANCE;
            try {
                android.os.Trace.beginSection("CameraPipe");
                androidx.camera.camera2.pipe.config.CameraPipeComponent build = androidx.camera.camera2.pipe.config.DaggerCameraPipeComponent.builder().cameraPipeConfigModule(new androidx.camera.camera2.pipe.config.CameraPipeConfigModule(config)).threadConfigModule(new androidx.camera.camera2.pipe.config.ThreadConfigModule(config.getThreadConfig())).build();
                android.os.Trace.endSection();
                kotlin.jvm.internal.Intrinsics.checkNotNull(build);
                return new androidx.camera.camera2.pipe.CameraPipeImpl(build);
            } catch (java.lang.Throwable th) {
                android.os.Trace.endSection();
                throw th;
            }
        }
    }
}
