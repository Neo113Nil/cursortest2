package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\bf\u0018\u00002\u00020\u0001:\b01234567J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00118'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0017\u001a\u00020\u00148'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u001c8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u0004\u0018\u00010 8'X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u0004\u0018\u00010$8'X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u0004\u0018\u00010(8'X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u0004\u0018\u00010,8'X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream;", "", "", "isValidForHighSpeedOperatingMode", "()Z", "Landroidx/camera/camera2/pipe/CameraStream;", "getStream", "()Landroidx/camera/camera2/pipe/CameraStream;", "stream", "Landroidx/camera/camera2/pipe/OutputId;", "getId-4LaLFng", "()I", "id", "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "getFormat-8FPWQzE", "format", "Landroidx/camera/camera2/pipe/CameraId;", "getCamera-Dz_R5H8", "()Ljava/lang/String;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "getMirrorMode-dO1_9xk", "()Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getTimestampBase-pcPfPbY", "()Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getDynamicRangeProfile-OoVcG5w", "()Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "getStreamUseCase-8x2ez34", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getOutputType", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-HIPxoCc", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "Config", "OutputType", "MirrorMode", "TimestampBase", "DynamicRangeProfile", "StreamUseHint", "StreamUseCase", "SensorPixelMode"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OutputStream {
    /* renamed from: getCamera-Dz_R5H8, reason: not valid java name */
    java.lang.String getCamera();

    /* renamed from: getDynamicRangeProfile-OoVcG5w, reason: not valid java name */
    androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile getDynamicRangeProfile();

    /* renamed from: getFormat-8FPWQzE, reason: not valid java name */
    int getFormat();

    /* renamed from: getId-4LaLFng, reason: not valid java name */
    int getId();

    /* renamed from: getMirrorMode-dO1_9xk, reason: not valid java name */
    androidx.camera.camera2.pipe.OutputStream.MirrorMode getMirrorMode();

    androidx.camera.camera2.pipe.OutputStream.OutputType getOutputType();

    android.util.Size getSize();

    androidx.camera.camera2.pipe.CameraStream getStream();

    /* renamed from: getStreamUseCase-8x2ez34, reason: not valid java name */
    androidx.camera.camera2.pipe.OutputStream.StreamUseCase getStreamUseCase();

    /* renamed from: getStreamUseHint-HIPxoCc, reason: not valid java name */
    androidx.camera.camera2.pipe.OutputStream.StreamUseHint getStreamUseHint();

    /* renamed from: getTimestampBase-pcPfPbY, reason: not valid java name */
    androidx.camera.camera2.pipe.OutputStream.TimestampBase getTimestampBase();

    @kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 =2\u00020\u0001:\u0004=>?@Bc\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010)\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001c\u00101\u001a\u0004\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\u0082\u0001\u0003ABC"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$Config;", "", "Landroid/util/Size;", "p0", "Landroidx/camera/camera2/pipe/StreamFormat;", "p1", "Landroidx/camera/camera2/pipe/CameraId;", "p2", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "p3", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "p4", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "p5", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "p6", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "p7", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "p8", "<init>", "(Landroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroid/util/Size;", "getSize", "()Landroid/util/Size;", "format", com.visa.cbp.getEncExpo.warmup, "getFormat-8FPWQzE", "()I", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Ljava/lang/String;", "getCamera-1LO98Z0", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "getMirrorMode-dO1_9xk", "()Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "getTimestampBase-pcPfPbY", "()Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "getDynamicRangeProfile-OoVcG5w", "()Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "getStreamUseCase-8x2ez34", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseHint", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "getStreamUseHint-HIPxoCc", "()Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "sensorPixelModes", "Ljava/util/List;", "getSensorPixelModes", "()Ljava/util/List;", "Companion", "SimpleOutputConfig", "LazyOutputConfig", "ExternalOutputConfig", "Landroidx/camera/camera2/pipe/OutputStream$Config$ExternalOutputConfig;", "Landroidx/camera/camera2/pipe/OutputStream$Config$LazyOutputConfig;", "Landroidx/camera/camera2/pipe/OutputStream$Config$SimpleOutputConfig;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Config {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.Config.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.Config.Companion(null);
        private final java.lang.String camera;
        private final androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile;
        private final int format;
        private final androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode;
        private final java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes;
        private final android.util.Size size;
        private final androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase;
        private final androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint;
        private final androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase;

        private Config(android.util.Size size, int i, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> list) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            this.size = size;
            this.format = i;
            this.camera = str;
            this.mirrorMode = mirrorMode;
            this.timestampBase = timestampBase;
            this.dynamicRangeProfile = dynamicRangeProfile;
            this.streamUseCase = streamUseCase;
            this.streamUseHint = streamUseHint;
            this.sensorPixelModes = list;
        }

        public final android.util.Size getSize() {
            return this.size;
        }

        /* renamed from: getFormat-8FPWQzE, reason: not valid java name and from getter */
        public final int getFormat() {
            return this.format;
        }

        /* renamed from: getCamera-1LO98Z0, reason: not valid java name and from getter */
        public final java.lang.String getCamera() {
            return this.camera;
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

        @kotlin.Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u007f\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001a\u0010\u001bJK\u0010!\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$Config$Companion;", "", "<init>", "()V", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "create-vBYXiEU", "(Landroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;)Landroidx/camera/camera2/pipe/OutputStream$Config;", "create", "Landroid/hardware/camera2/params/OutputConfiguration;", "externalOutputConfig", "external-4cjX7jI", "(Landroid/util/Size;ILjava/lang/String;Landroid/hardware/camera2/params/OutputConfiguration;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;)Landroidx/camera/camera2/pipe/OutputStream$Config;", com.paypal.oslo.feature.webview.api.navigation.OpenWebDeepLinkDestination.TYPE_EXTERNAL}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: external-4cjX7jI$default, reason: not valid java name */
            public static /* synthetic */ androidx.camera.camera2.pipe.OutputStream.Config m573external4cjX7jI$default(androidx.camera.camera2.pipe.OutputStream.Config.Companion companion, android.util.Size size, int i, java.lang.String str, android.hardware.camera2.params.OutputConfiguration outputConfiguration, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List list, int i2, java.lang.Object obj) {
                if ((i2 & 4) != 0) {
                    str = null;
                }
                java.lang.String str2 = str;
                if ((i2 & 32) != 0) {
                    list = kotlin.collections.CollectionsKt.emptyList();
                }
                return companion.m575external4cjX7jI(size, i, str2, outputConfiguration, streamUseHint, list);
            }

            /* renamed from: external-4cjX7jI, reason: not valid java name */
            public final androidx.camera.camera2.pipe.OutputStream.Config m575external4cjX7jI(android.util.Size size, int format, java.lang.String camera, android.hardware.camera2.params.OutputConfiguration externalOutputConfig, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalOutputConfig, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorPixelModes, "");
                return new androidx.camera.camera2.pipe.OutputStream.Config.ExternalOutputConfig(size, format, camera, externalOutputConfig, streamUseHint, sensorPixelModes, null);
            }

            /* renamed from: create-vBYXiEU, reason: not valid java name */
            public final androidx.camera.camera2.pipe.OutputStream.Config m574createvBYXiEU(android.util.Size size, int format, java.lang.String camera, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> sensorPixelModes) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sensorPixelModes, "");
                if (kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_TEXTURE()) || kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE_VIEW()) || ((kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getMEDIA_CODEC()) || kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getMEDIA_RECORDER())) && android.os.Build.VERSION.SDK_INT >= 35)) {
                    return new androidx.camera.camera2.pipe.OutputStream.Config.LazyOutputConfig(size, format, camera, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes, null);
                }
                if (!kotlin.jvm.internal.Intrinsics.areEqual(outputType, androidx.camera.camera2.pipe.OutputStream.OutputType.INSTANCE.getSURFACE())) {
                    throw new java.lang.IllegalStateException("Check failed.");
                }
                return new androidx.camera.camera2.pipe.OutputStream.Config.SimpleOutputConfig(size, format, camera, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, sensorPixelModes, null);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$Config$SimpleOutputConfig;", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "<init>", "(Landroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class SimpleOutputConfig extends androidx.camera.camera2.pipe.OutputStream.Config {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private SimpleOutputConfig(android.util.Size size, int i, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> list) {
                super(size, i, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
            }

            public /* synthetic */ SimpleOutputConfig(android.util.Size size, int i, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(size, i, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\t\u001a\u00020\b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$Config$LazyOutputConfig;", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "outputType", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "mirrorMode", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "timestampBase", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "dynamicRangeProfile", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "streamUseCase", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "<init>", "(Landroid/util/Size;ILjava/lang/String;Landroidx/camera/camera2/pipe/OutputStream$OutputType;Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getOutputType$camera_camera2_pipe", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class LazyOutputConfig extends androidx.camera.camera2.pipe.OutputStream.Config {
            private final androidx.camera.camera2.pipe.OutputStream.OutputType outputType;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private LazyOutputConfig(android.util.Size size, int i, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> list) {
                super(size, i, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputType, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.outputType = outputType;
            }

            /* renamed from: getOutputType$camera_camera2_pipe, reason: from getter */
            public final androidx.camera.camera2.pipe.OutputStream.OutputType getOutputType() {
                return this.outputType;
            }

            public /* synthetic */ LazyOutputConfig(android.util.Size size, int i, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.OutputType outputType, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(size, i, str, outputType, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
            }
        }

        @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\t\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$Config$ExternalOutputConfig;", "Landroidx/camera/camera2/pipe/OutputStream$Config;", "Landroid/util/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "Landroidx/camera/camera2/pipe/StreamFormat;", "format", "Landroidx/camera/camera2/pipe/CameraId;", com.paypal.oslo.feature.qrc.domain.utils.Constants.SOURCE_CAMERA, "Landroid/hardware/camera2/params/OutputConfiguration;", "output", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "streamUseHint", "", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "sensorPixelModes", "<init>", "(Landroid/util/Size;ILjava/lang/String;Landroid/hardware/camera2/params/OutputConfiguration;Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Landroid/hardware/camera2/params/OutputConfiguration;", "getOutput", "()Landroid/hardware/camera2/params/OutputConfiguration;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ExternalOutputConfig extends androidx.camera.camera2.pipe.OutputStream.Config {
            private final android.hardware.camera2.params.OutputConfiguration output;

            public final android.hardware.camera2.params.OutputConfiguration getOutput() {
                return this.output;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            private ExternalOutputConfig(android.util.Size size, int i, java.lang.String str, android.hardware.camera2.params.OutputConfiguration outputConfiguration, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List<androidx.camera.camera2.pipe.OutputStream.SensorPixelMode> list) {
                super(size, i, str, androidx.camera.camera2.pipe.OutputStream.MirrorMode.m596boximpl(androidx.camera.camera2.pipe.OutputStream.MirrorMode.m597constructorimpl(androidx.camera.camera2.pipe.compat.Api33Compat.getMirrorMode(outputConfiguration))), androidx.camera.camera2.pipe.OutputStream.TimestampBase.m639boximpl(androidx.camera.camera2.pipe.OutputStream.TimestampBase.m640constructorimpl(androidx.camera.camera2.pipe.compat.Api33Compat.getTimestampBase(outputConfiguration))), androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m576boximpl(androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.m577constructorimpl(androidx.camera.camera2.pipe.compat.Api33Compat.getDynamicRangeProfile(outputConfiguration))), androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m616boximpl(androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m617constructorimpl(androidx.camera.camera2.pipe.compat.Api33Compat.getStreamUseCase(outputConfiguration))), streamUseHint, list, null);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(outputConfiguration, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
                this.output = outputConfiguration;
            }

            public /* synthetic */ ExternalOutputConfig(android.util.Size size, int i, java.lang.String str, android.hardware.camera2.params.OutputConfiguration outputConfiguration, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this(size, i, str, outputConfiguration, streamUseHint, list);
            }
        }

        public java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Config(size=");
            sb.append(this.size);
            sb.append(", format=");
            sb.append((java.lang.Object) androidx.camera.camera2.pipe.StreamFormat.m716toStringimpl(this.format));
            sb.append(", camera=");
            java.lang.String str = this.camera;
            sb.append((java.lang.Object) (str == null ? "null" : androidx.camera.camera2.pipe.CameraId.m398toStringimpl(str)));
            sb.append(", mirrorMode=");
            sb.append(this.mirrorMode);
            sb.append(", timestampBase=");
            sb.append(this.timestampBase);
            sb.append(", dynamicRangeProfile=");
            sb.append(this.dynamicRangeProfile);
            sb.append(", streamUseCase=");
            sb.append(this.streamUseCase);
            sb.append(", streamUseHint=");
            sb.append(this.streamUseHint);
            sb.append(", sensorPixelModes=");
            sb.append(this.sensorPixelModes);
            sb.append(')');
            return sb.toString();
        }

        public /* synthetic */ Config(android.util.Size size, int i, java.lang.String str, androidx.camera.camera2.pipe.OutputStream.MirrorMode mirrorMode, androidx.camera.camera2.pipe.OutputStream.TimestampBase timestampBase, androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile dynamicRangeProfile, androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase, androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint, java.util.List list, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(size, i, str, mirrorMode, timestampBase, dynamicRangeProfile, streamUseCase, streamUseHint, list);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "", "<init>", "()V", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OutputType {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.OutputType.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.OutputType.Companion(null);
        private static final androidx.camera.camera2.pipe.OutputStream.OutputType SURFACE = new androidx.camera.camera2.pipe.OutputStream.OutputType();
        private static final androidx.camera.camera2.pipe.OutputStream.OutputType SURFACE_VIEW = new androidx.camera.camera2.pipe.OutputStream.OutputType();
        private static final androidx.camera.camera2.pipe.OutputStream.OutputType SURFACE_TEXTURE = new androidx.camera.camera2.pipe.OutputStream.OutputType();
        private static final androidx.camera.camera2.pipe.OutputStream.OutputType SURFACE_DEFERRED_FOR_QUERY_ONLY = new androidx.camera.camera2.pipe.OutputStream.OutputType();
        private static final androidx.camera.camera2.pipe.OutputStream.OutputType MEDIA_CODEC = new androidx.camera.camera2.pipe.OutputStream.OutputType();
        private static final androidx.camera.camera2.pipe.OutputStream.OutputType MEDIA_RECORDER = new androidx.camera.camera2.pipe.OutputStream.OutputType();

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$OutputType$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "SURFACE", "Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "getSURFACE", "()Landroidx/camera/camera2/pipe/OutputStream$OutputType;", "SURFACE_VIEW", "getSURFACE_VIEW", "SURFACE_TEXTURE", "getSURFACE_TEXTURE", "SURFACE_DEFERRED_FOR_QUERY_ONLY", "getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe", "MEDIA_CODEC", "getMEDIA_CODEC", "MEDIA_RECORDER", "getMEDIA_RECORDER"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.camera.camera2.pipe.OutputStream.OutputType getSURFACE() {
                return androidx.camera.camera2.pipe.OutputStream.OutputType.SURFACE;
            }

            public final androidx.camera.camera2.pipe.OutputStream.OutputType getSURFACE_VIEW() {
                return androidx.camera.camera2.pipe.OutputStream.OutputType.SURFACE_VIEW;
            }

            public final androidx.camera.camera2.pipe.OutputStream.OutputType getSURFACE_TEXTURE() {
                return androidx.camera.camera2.pipe.OutputStream.OutputType.SURFACE_TEXTURE;
            }

            public final androidx.camera.camera2.pipe.OutputStream.OutputType getSURFACE_DEFERRED_FOR_QUERY_ONLY$camera_camera2_pipe() {
                return androidx.camera.camera2.pipe.OutputStream.OutputType.SURFACE_DEFERRED_FOR_QUERY_ONLY;
            }

            public final androidx.camera.camera2.pipe.OutputStream.OutputType getMEDIA_CODEC() {
                return androidx.camera.camera2.pipe.OutputStream.OutputType.MEDIA_CODEC;
            }

            public final androidx.camera.camera2.pipe.OutputStream.OutputType getMEDIA_RECORDER() {
                return androidx.camera.camera2.pipe.OutputStream.OutputType.MEDIA_RECORDER;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private OutputType() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class MirrorMode {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.MirrorMode.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.MirrorMode.Companion(null);
        private static final int MIRROR_MODE_AUTO = m597constructorimpl(0);
        private static final int MIRROR_MODE_NONE = m597constructorimpl(1);
        private static final int MIRROR_MODE_H = m597constructorimpl(2);
        private static final int MIRROR_MODE_V = m597constructorimpl(3);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m597constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m599equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$MirrorMode$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$MirrorMode;", "MIRROR_MODE_AUTO", com.visa.cbp.getEncExpo.warmup, "getMIRROR_MODE_AUTO-DrUKqn0", "()I", "MIRROR_MODE_NONE", "getMIRROR_MODE_NONE-DrUKqn0", "MIRROR_MODE_H", "getMIRROR_MODE_H-DrUKqn0", "MIRROR_MODE_V", "getMIRROR_MODE_V-DrUKqn0"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getMIRROR_MODE_AUTO-DrUKqn0, reason: not valid java name */
            public final int m603getMIRROR_MODE_AUTODrUKqn0() {
                return androidx.camera.camera2.pipe.OutputStream.MirrorMode.MIRROR_MODE_AUTO;
            }

            /* renamed from: getMIRROR_MODE_NONE-DrUKqn0, reason: not valid java name */
            public final int m605getMIRROR_MODE_NONEDrUKqn0() {
                return androidx.camera.camera2.pipe.OutputStream.MirrorMode.MIRROR_MODE_NONE;
            }

            /* renamed from: getMIRROR_MODE_H-DrUKqn0, reason: not valid java name */
            public final int m604getMIRROR_MODE_HDrUKqn0() {
                return androidx.camera.camera2.pipe.OutputStream.MirrorMode.MIRROR_MODE_H;
            }

            /* renamed from: getMIRROR_MODE_V-DrUKqn0, reason: not valid java name */
            public final int m606getMIRROR_MODE_VDrUKqn0() {
                return androidx.camera.camera2.pipe.OutputStream.MirrorMode.MIRROR_MODE_V;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ MirrorMode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m602unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m601toStringimpl(this.value);
        }

        public final int hashCode() {
            return m600hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m598equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m601toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("MirrorMode(value=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m600hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m598equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.OutputStream.MirrorMode) && i == ((androidx.camera.camera2.pipe.OutputStream.MirrorMode) obj).m602unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStream.MirrorMode m596boximpl(int i) {
            return new androidx.camera.camera2.pipe.OutputStream.MirrorMode(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class TimestampBase {
        private final int value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.TimestampBase.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.TimestampBase.Companion(null);
        private static final int TIMESTAMP_BASE_DEFAULT = m640constructorimpl(0);
        private static final int TIMESTAMP_BASE_SENSOR = m640constructorimpl(1);
        private static final int TIMESTAMP_BASE_MONOTONIC = m640constructorimpl(2);
        private static final int TIMESTAMP_BASE_REALTIME = m640constructorimpl(3);
        private static final int TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED = m640constructorimpl(4);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m640constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m642equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$TimestampBase$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$TimestampBase;", "TIMESTAMP_BASE_DEFAULT", com.visa.cbp.getEncExpo.warmup, "getTIMESTAMP_BASE_DEFAULT-6HVI0MA", "()I", "TIMESTAMP_BASE_SENSOR", "getTIMESTAMP_BASE_SENSOR-6HVI0MA", "TIMESTAMP_BASE_MONOTONIC", "getTIMESTAMP_BASE_MONOTONIC-6HVI0MA", "TIMESTAMP_BASE_REALTIME", "getTIMESTAMP_BASE_REALTIME-6HVI0MA", "TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED", "getTIMESTAMP_BASE_CHOREOGRAPHER_SYNCED-6HVI0MA"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getTIMESTAMP_BASE_DEFAULT-6HVI0MA, reason: not valid java name */
            public final int m647getTIMESTAMP_BASE_DEFAULT6HVI0MA() {
                return androidx.camera.camera2.pipe.OutputStream.TimestampBase.TIMESTAMP_BASE_DEFAULT;
            }

            /* renamed from: getTIMESTAMP_BASE_SENSOR-6HVI0MA, reason: not valid java name */
            public final int m650getTIMESTAMP_BASE_SENSOR6HVI0MA() {
                return androidx.camera.camera2.pipe.OutputStream.TimestampBase.TIMESTAMP_BASE_SENSOR;
            }

            /* renamed from: getTIMESTAMP_BASE_MONOTONIC-6HVI0MA, reason: not valid java name */
            public final int m648getTIMESTAMP_BASE_MONOTONIC6HVI0MA() {
                return androidx.camera.camera2.pipe.OutputStream.TimestampBase.TIMESTAMP_BASE_MONOTONIC;
            }

            /* renamed from: getTIMESTAMP_BASE_REALTIME-6HVI0MA, reason: not valid java name */
            public final int m649getTIMESTAMP_BASE_REALTIME6HVI0MA() {
                return androidx.camera.camera2.pipe.OutputStream.TimestampBase.TIMESTAMP_BASE_REALTIME;
            }

            /* renamed from: getTIMESTAMP_BASE_CHOREOGRAPHER_SYNCED-6HVI0MA, reason: not valid java name */
            public final int m646getTIMESTAMP_BASE_CHOREOGRAPHER_SYNCED6HVI0MA() {
                return androidx.camera.camera2.pipe.OutputStream.TimestampBase.TIMESTAMP_BASE_CHOREOGRAPHER_SYNCED;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ TimestampBase(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m645unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m644toStringimpl(this.value);
        }

        public final int hashCode() {
            return m643hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m641equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m644toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TimestampBase(value=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m643hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m641equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.OutputStream.TimestampBase) && i == ((androidx.camera.camera2.pipe.OutputStream.TimestampBase) obj).m645unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStream.TimestampBase m639boximpl(int i) {
            return new androidx.camera.camera2.pipe.OutputStream.TimestampBase(i);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue", "()J", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class DynamicRangeProfile {
        private final long value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.Companion(null);
        private static final long STANDARD = m577constructorimpl(1);
        private static final long HLG10 = m577constructorimpl(2);
        private static final long HDR10 = m577constructorimpl(4);
        private static final long HDR10_PLUS = m577constructorimpl(8);
        private static final long DOLBY_VISION_10B_HDR_REF = m577constructorimpl(16);
        private static final long DOLBY_VISION_10B_HDR_REF_PO = m577constructorimpl(32);
        private static final long DOLBY_VISION_10B_HDR_OEM = m577constructorimpl(64);
        private static final long DOLBY_VISION_10B_HDR_OEM_PO = m577constructorimpl(128);
        private static final long DOLBY_VISION_8B_HDR_REF = m577constructorimpl(256);
        private static final long DOLBY_VISION_8B_HDR_REF_PO = m577constructorimpl(512);
        private static final long DOLBY_VISION_8B_HDR_OEM = m577constructorimpl(okhttp3.internal.ws.RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE);
        private static final long DOLBY_VISION_8B_HDR_OEM_PO = m577constructorimpl(coil3.svg.internal.UtilsKt.SVG_SIZE_BYTES);
        private static final long PUBLIC_MAX = m577constructorimpl(4096);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m577constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m579equalsimpl0(long j, long j2) {
            return j == j2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$DynamicRangeProfile;", "STANDARD", "J", "getSTANDARD-fFAQAUE", "()J", "HLG10", "getHLG10-fFAQAUE", "HDR10", "getHDR10-fFAQAUE", "HDR10_PLUS", "getHDR10_PLUS-fFAQAUE", "DOLBY_VISION_10B_HDR_REF", "getDOLBY_VISION_10B_HDR_REF-fFAQAUE", "DOLBY_VISION_10B_HDR_REF_PO", "getDOLBY_VISION_10B_HDR_REF_PO-fFAQAUE", "DOLBY_VISION_10B_HDR_OEM", "getDOLBY_VISION_10B_HDR_OEM-fFAQAUE", "DOLBY_VISION_10B_HDR_OEM_PO", "getDOLBY_VISION_10B_HDR_OEM_PO-fFAQAUE", "DOLBY_VISION_8B_HDR_REF", "getDOLBY_VISION_8B_HDR_REF-fFAQAUE", "DOLBY_VISION_8B_HDR_REF_PO", "getDOLBY_VISION_8B_HDR_REF_PO-fFAQAUE", "DOLBY_VISION_8B_HDR_OEM", "getDOLBY_VISION_8B_HDR_OEM-fFAQAUE", "DOLBY_VISION_8B_HDR_OEM_PO", "getDOLBY_VISION_8B_HDR_OEM_PO-fFAQAUE", "PUBLIC_MAX", "getPUBLIC_MAX-fFAQAUE"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getSTANDARD-fFAQAUE, reason: not valid java name */
            public final long m595getSTANDARDfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.STANDARD;
            }

            /* renamed from: getHLG10-fFAQAUE, reason: not valid java name */
            public final long m593getHLG10fFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.HLG10;
            }

            /* renamed from: getHDR10-fFAQAUE, reason: not valid java name */
            public final long m591getHDR10fFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.HDR10;
            }

            /* renamed from: getHDR10_PLUS-fFAQAUE, reason: not valid java name */
            public final long m592getHDR10_PLUSfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.HDR10_PLUS;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_REF-fFAQAUE, reason: not valid java name */
            public final long m585getDOLBY_VISION_10B_HDR_REFfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_10B_HDR_REF;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_REF_PO-fFAQAUE, reason: not valid java name */
            public final long m586getDOLBY_VISION_10B_HDR_REF_POfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_10B_HDR_REF_PO;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_OEM-fFAQAUE, reason: not valid java name */
            public final long m583getDOLBY_VISION_10B_HDR_OEMfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_10B_HDR_OEM;
            }

            /* renamed from: getDOLBY_VISION_10B_HDR_OEM_PO-fFAQAUE, reason: not valid java name */
            public final long m584getDOLBY_VISION_10B_HDR_OEM_POfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_10B_HDR_OEM_PO;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_REF-fFAQAUE, reason: not valid java name */
            public final long m589getDOLBY_VISION_8B_HDR_REFfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_8B_HDR_REF;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_REF_PO-fFAQAUE, reason: not valid java name */
            public final long m590getDOLBY_VISION_8B_HDR_REF_POfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_8B_HDR_REF_PO;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_OEM-fFAQAUE, reason: not valid java name */
            public final long m587getDOLBY_VISION_8B_HDR_OEMfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_8B_HDR_OEM;
            }

            /* renamed from: getDOLBY_VISION_8B_HDR_OEM_PO-fFAQAUE, reason: not valid java name */
            public final long m588getDOLBY_VISION_8B_HDR_OEM_POfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.DOLBY_VISION_8B_HDR_OEM_PO;
            }

            /* renamed from: getPUBLIC_MAX-fFAQAUE, reason: not valid java name */
            public final long m594getPUBLIC_MAXfFAQAUE() {
                return androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile.PUBLIC_MAX;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ DynamicRangeProfile(long j) {
            this.value = j;
        }

        public final long getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m582unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m581toStringimpl(this.value);
        }

        public final int hashCode() {
            return m580hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m578equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m581toStringimpl(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DynamicRangeProfile(value=");
            sb.append(j);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m580hashCodeimpl(long j) {
            return java.lang.Long.hashCode(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m578equalsimpl(long j, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile) && j == ((androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile) obj).m582unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile m576boximpl(long j) {
            return new androidx.camera.camera2.pipe.OutputStream.DynamicRangeProfile(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue", "()J", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class StreamUseHint {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.StreamUseHint.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.StreamUseHint.Companion(null);
        private static final long DEFAULT = m631constructorimpl(0);
        private static final long VIDEO_RECORD = m631constructorimpl(1);
        private final long value;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m631constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m633equalsimpl0(long j, long j2) {
            return j == j2;
        }

        private /* synthetic */ StreamUseHint(long j) {
            this.value = j;
        }

        public final long getValue() {
            return this.value;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseHint;", "DEFAULT", "J", "getDEFAULT-4VYZOf8", "()J", "VIDEO_RECORD", "getVIDEO_RECORD-4VYZOf8"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDEFAULT-4VYZOf8, reason: not valid java name */
            public final long m637getDEFAULT4VYZOf8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseHint.DEFAULT;
            }

            /* renamed from: getVIDEO_RECORD-4VYZOf8, reason: not valid java name */
            public final long m638getVIDEO_RECORD4VYZOf8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseHint.VIDEO_RECORD;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m636unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m635toStringimpl(this.value);
        }

        public final int hashCode() {
            return m634hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m632equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m635toStringimpl(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamUseHint(value=");
            sb.append(j);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m634hashCodeimpl(long j) {
            return java.lang.Long.hashCode(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m632equalsimpl(long j, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.OutputStream.StreamUseHint) && j == ((androidx.camera.camera2.pipe.OutputStream.StreamUseHint) obj).m636unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStream.StreamUseHint m630boximpl(long j) {
            return new androidx.camera.camera2.pipe.OutputStream.StreamUseHint(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(J)J", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "hashCode-impl", "(J)I", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "J", "getValue", "()J", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class StreamUseCase {
        private final long value;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.StreamUseCase.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.StreamUseCase.Companion(null);
        private static final long DEFAULT = m617constructorimpl(0);
        private static final long PREVIEW = m617constructorimpl(1);
        private static final long STILL_CAPTURE = m617constructorimpl(2);
        private static final long VIDEO_RECORD = m617constructorimpl(3);
        private static final long PREVIEW_VIDEO_STILL = m617constructorimpl(4);
        private static final long VIDEO_CALL = m617constructorimpl(5);
        private static final long CROPPED_RAW = m617constructorimpl(6);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static long m617constructorimpl(long j) {
            return j;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m619equalsimpl0(long j, long j2) {
            return j == j2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$StreamUseCase;", "DEFAULT", "J", "getDEFAULT-vrKr8v8", "()J", "PREVIEW", "getPREVIEW-vrKr8v8", "STILL_CAPTURE", "getSTILL_CAPTURE-vrKr8v8", "VIDEO_RECORD", "getVIDEO_RECORD-vrKr8v8", "PREVIEW_VIDEO_STILL", "getPREVIEW_VIDEO_STILL-vrKr8v8", "VIDEO_CALL", "getVIDEO_CALL-vrKr8v8", "CROPPED_RAW", "getCROPPED_RAW-vrKr8v8"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDEFAULT-vrKr8v8, reason: not valid java name */
            public final long m624getDEFAULTvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.DEFAULT;
            }

            /* renamed from: getPREVIEW-vrKr8v8, reason: not valid java name */
            public final long m625getPREVIEWvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.PREVIEW;
            }

            /* renamed from: getSTILL_CAPTURE-vrKr8v8, reason: not valid java name */
            public final long m627getSTILL_CAPTUREvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.STILL_CAPTURE;
            }

            /* renamed from: getVIDEO_RECORD-vrKr8v8, reason: not valid java name */
            public final long m629getVIDEO_RECORDvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.VIDEO_RECORD;
            }

            /* renamed from: getPREVIEW_VIDEO_STILL-vrKr8v8, reason: not valid java name */
            public final long m626getPREVIEW_VIDEO_STILLvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.PREVIEW_VIDEO_STILL;
            }

            /* renamed from: getVIDEO_CALL-vrKr8v8, reason: not valid java name */
            public final long m628getVIDEO_CALLvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.VIDEO_CALL;
            }

            /* renamed from: getCROPPED_RAW-vrKr8v8, reason: not valid java name */
            public final long m623getCROPPED_RAWvrKr8v8() {
                return androidx.camera.camera2.pipe.OutputStream.StreamUseCase.CROPPED_RAW;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ StreamUseCase(long j) {
            this.value = j;
        }

        public final long getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ long m622unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m621toStringimpl(this.value);
        }

        public final int hashCode() {
            return m620hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m618equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m621toStringimpl(long j) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamUseCase(value=");
            sb.append(j);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m620hashCodeimpl(long j) {
            return java.lang.Long.hashCode(j);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m618equalsimpl(long j, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.OutputStream.StreamUseCase) && j == ((androidx.camera.camera2.pipe.OutputStream.StreamUseCase) obj).m622unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStream.StreamUseCase m616boximpl(long j) {
            return new androidx.camera.camera2.pipe.OutputStream.StreamUseCase(j);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\u0010\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(I)Ljava/lang/String;", "toString", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @kotlin.jvm.JvmInline
    public static final class SensorPixelMode {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.camera.camera2.pipe.OutputStream.SensorPixelMode.Companion INSTANCE = new androidx.camera.camera2.pipe.OutputStream.SensorPixelMode.Companion(null);
        private static final int DEFAULT = m608constructorimpl(0);
        private static final int MAXIMUM_RESOLUTION = m608constructorimpl(1);
        private final int value;

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m608constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m610equalsimpl0(int i, int i2) {
            return i == i2;
        }

        @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/OutputStream$SensorPixelMode;", "DEFAULT", com.visa.cbp.getEncExpo.warmup, "getDEFAULT-ApWyzMw", "()I", "MAXIMUM_RESOLUTION", "getMAXIMUM_RESOLUTION-ApWyzMw"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            /* renamed from: getDEFAULT-ApWyzMw, reason: not valid java name */
            public final int m614getDEFAULTApWyzMw() {
                return androidx.camera.camera2.pipe.OutputStream.SensorPixelMode.DEFAULT;
            }

            /* renamed from: getMAXIMUM_RESOLUTION-ApWyzMw, reason: not valid java name */
            public final int m615getMAXIMUM_RESOLUTIONApWyzMw() {
                return androidx.camera.camera2.pipe.OutputStream.SensorPixelMode.MAXIMUM_RESOLUTION;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        private /* synthetic */ SensorPixelMode(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m613unboximpl() {
            return this.value;
        }

        public final java.lang.String toString() {
            return m612toStringimpl(this.value);
        }

        public final int hashCode() {
            return m611hashCodeimpl(this.value);
        }

        public final boolean equals(java.lang.Object obj) {
            return m609equalsimpl(this.value, obj);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static java.lang.String m612toStringimpl(int i) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SensorPixelMode(value=");
            sb.append(i);
            sb.append(')');
            return sb.toString();
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m611hashCodeimpl(int i) {
            return java.lang.Integer.hashCode(i);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m609equalsimpl(int i, java.lang.Object obj) {
            return (obj instanceof androidx.camera.camera2.pipe.OutputStream.SensorPixelMode) && i == ((androidx.camera.camera2.pipe.OutputStream.SensorPixelMode) obj).m613unboximpl();
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ androidx.camera.camera2.pipe.OutputStream.SensorPixelMode m607boximpl(int i) {
            return new androidx.camera.camera2.pipe.OutputStream.SensorPixelMode(i);
        }
    }

    @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static boolean isValidForHighSpeedOperatingMode(androidx.camera.camera2.pipe.OutputStream outputStream) {
            return androidx.camera.camera2.pipe.OutputStream.super.isValidForHighSpeedOperatingMode();
        }
    }

    default boolean isValidForHighSpeedOperatingMode() {
        if (getStreamUseCase() == null) {
            return true;
        }
        androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase = getStreamUseCase();
        long m624getDEFAULTvrKr8v8 = androidx.camera.camera2.pipe.OutputStream.StreamUseCase.INSTANCE.m624getDEFAULTvrKr8v8();
        if (streamUseCase != null && androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m619equalsimpl0(streamUseCase.m622unboximpl(), m624getDEFAULTvrKr8v8)) {
            return true;
        }
        androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase2 = getStreamUseCase();
        long m625getPREVIEWvrKr8v8 = androidx.camera.camera2.pipe.OutputStream.StreamUseCase.INSTANCE.m625getPREVIEWvrKr8v8();
        if (streamUseCase2 != null && androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m619equalsimpl0(streamUseCase2.m622unboximpl(), m625getPREVIEWvrKr8v8)) {
            return true;
        }
        androidx.camera.camera2.pipe.OutputStream.StreamUseCase streamUseCase3 = getStreamUseCase();
        long m629getVIDEO_RECORDvrKr8v8 = androidx.camera.camera2.pipe.OutputStream.StreamUseCase.INSTANCE.m629getVIDEO_RECORDvrKr8v8();
        if ((streamUseCase3 != null && androidx.camera.camera2.pipe.OutputStream.StreamUseCase.m619equalsimpl0(streamUseCase3.m622unboximpl(), m629getVIDEO_RECORDvrKr8v8)) || getStreamUseHint() == null) {
            return true;
        }
        androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint = getStreamUseHint();
        long m637getDEFAULT4VYZOf8 = androidx.camera.camera2.pipe.OutputStream.StreamUseHint.INSTANCE.m637getDEFAULT4VYZOf8();
        if (streamUseHint != null && androidx.camera.camera2.pipe.OutputStream.StreamUseHint.m633equalsimpl0(streamUseHint.m636unboximpl(), m637getDEFAULT4VYZOf8)) {
            return true;
        }
        androidx.camera.camera2.pipe.OutputStream.StreamUseHint streamUseHint2 = getStreamUseHint();
        return streamUseHint2 != null && androidx.camera.camera2.pipe.OutputStream.StreamUseHint.m633equalsimpl0(streamUseHint2.m636unboximpl(), androidx.camera.camera2.pipe.OutputStream.StreamUseHint.INSTANCE.m638getVIDEO_RECORD4VYZOf8());
    }
}
