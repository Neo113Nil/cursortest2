package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001\u0012B\u001f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/CameraStream;", "", "Landroidx/camera/camera2/pipe/StreamId;", "id", "", "Landroidx/camera/camera2/pipe/OutputStream;", "outputs", "<init>", "(ILjava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getId-ptHMqGs", "()I", "Ljava/util/List;", "getOutputs", "()Ljava/util/List;", "Config"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CameraStream {
    private final int id;
    private final java.util.List<androidx.camera.camera2.pipe.OutputStream> outputs;

    /* JADX WARN: Multi-variable type inference failed */
    private CameraStream(int i, java.util.List<? extends androidx.camera.camera2.pipe.OutputStream> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.id = i;
        this.outputs = list;
    }

    /* renamed from: getId-ptHMqGs, reason: not valid java name and from getter */
    public final int getId() {
        return this.id;
    }

    public final java.util.List<androidx.camera.camera2.pipe.OutputStream> getOutputs() {
        return this.outputs;
    }

    public final java.lang.String toString() {
        return androidx.camera.camera2.pipe.StreamId.m760toStringimpl(this.id);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B#\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/camera/camera2/pipe/CameraStream$Config;", "", "", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "outputs", "Landroidx/camera/camera2/pipe/ImageSourceConfig;", "imageSourceConfig", "<init>", "(Ljava/util/List;Landroidx/camera/camera2/pipe/ImageSourceConfig;)V", "", "toString", "()Ljava/lang/String;", "Ljava/util/List;", "getOutputs", "()Ljava/util/List;", "Landroidx/camera/camera2/pipe/ImageSourceConfig;", "getImageSourceConfig", "()Landroidx/camera/camera2/pipe/ImageSourceConfig;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.CameraStream.Config.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraStream.Config.Companion(null);
        private final androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig;
        private final java.util.List<androidx.camera.camera2.pipe.OutputStream.Config> outputs;

        /* JADX WARN: Multi-variable type inference failed */
        public Config(java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.Config> list, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.outputs = list;
            this.imageSourceConfig = imageSourceConfig;
            androidx.camera.camera2.pipe.OutputStream.Config config = (androidx.camera.camera2.pipe.OutputStream.Config) kotlin.collections.CollectionsKt.first((java.util.List) list);
            java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.Config> list2 = list;
            if ((list2 instanceof java.util.Collection) && list2.isEmpty()) {
                return;
            }
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (!androidx.camera.camera2.pipe.StreamFormat.m712equalsimpl0(((androidx.camera.camera2.pipe.OutputStream.Config) it.next()).getFormat(), config.getFormat())) {
                    throw new java.lang.IllegalStateException("All outputs must have the same format!".toString());
                }
            }
        }

        public /* synthetic */ Config(java.util.List list, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : imageSourceConfig);
        }

        public final java.util.List<androidx.camera.camera2.pipe.OutputStream.Config> getOutputs() {
            return this.outputs;
        }

        public final androidx.camera.camera2.pipe.ImageSourceConfig getImageSourceConfig() {
            return this.imageSourceConfig;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraStream.Config(outputs=");
            sb.append(this.outputs);
            sb.append(", imageSourceConfig=");
            sb.append(this.imageSourceConfig);
            sb.append(')');
            return sb.toString();
        }

        @kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u008b\u0001\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\u001e\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010!J'\u0010\u001e\u001a\u00020\u001b2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001e\u0010#"}, d2 = {"Landroidx/camera/camera2/pipe/CameraStream$Config$Companion;", "", "<init>", "()V", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "Landroidx/camera/camera2/pipe/ImageSourceConfig;", "imageSourceConfig", "Landroidx/camera/camera2/pipe/CameraStream$Config;", "create-LbzH4Vg", "(Landroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;Landroidx/camera/camera2/pipe/ImageSourceConfig;)Landroidx/camera/camera2/pipe/CameraStream$Config;", "create", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "output", "(Landroidx/camera/camera2/pipe/OutputStream$Config;Landroidx/camera/camera2/pipe/ImageSourceConfig;)Landroidx/camera/camera2/pipe/CameraStream$Config;", "outputs", "(Ljava/util/List;Landroidx/camera/camera2/pipe/ImageSourceConfig;)Landroidx/camera/camera2/pipe/CameraStream$Config;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: create-LbzH4Vg, reason: not valid java name */
            public final androidx.camera.camera2.pipe.CameraStream.Config m426createLbzH4Vg(android.util.Size size, int format, java.lang.String camera, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorPixelModes, "");
                return create(androidx.camera.camera2.pipe.OutputStream.Config.INSTANCE.m574createvBYXiEU(size, format, camera, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes), imageSourceConfig);
            }

            public static /* synthetic */ androidx.camera.camera2.pipe.CameraStream.Config create$default(androidx.camera.camera2.pipe.CameraStream.Config.Companion companion, androidx.camera.camera2.pipe.OutputStream.Config config, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    imageSourceConfig = null;
                }
                return companion.create(config, imageSourceConfig);
            }

            public final androidx.camera.camera2.pipe.CameraStream.Config create(androidx.camera.camera2.pipe.OutputStream.Config output, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(output, "");
                return new androidx.camera.camera2.pipe.CameraStream.Config(kotlin.collections.CollectionsKt.listOf(output), imageSourceConfig);
            }

            public static /* synthetic */ androidx.camera.camera2.pipe.CameraStream.Config create$default(androidx.camera.camera2.pipe.CameraStream.Config.Companion companion, java.util.List list, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig, int i, java.lang.Object obj) {
                if ((i & 2) != 0) {
                    imageSourceConfig = null;
                }
                return companion.create((java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.Config>) list, imageSourceConfig);
            }

            public final androidx.camera.camera2.pipe.CameraStream.Config create(java.util.List<? extends androidx.camera.camera2.pipe.OutputStream.Config> outputs, androidx.camera.camera2.pipe.ImageSourceConfig imageSourceConfig) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputs, "");
                return new androidx.camera.camera2.pipe.CameraStream.Config(outputs, imageSourceConfig);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }
    }

    public /* synthetic */ CameraStream(int i, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, list);
    }
}
