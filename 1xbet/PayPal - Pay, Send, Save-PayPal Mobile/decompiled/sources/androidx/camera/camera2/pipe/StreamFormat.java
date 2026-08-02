package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087@\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0005R\u0011\u0010\u0017\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/camera/camera2/pipe/StreamFormat;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", com.visa.cbp.getEncExpo.warmup, "getValue", "()I", "getBitsPerPixel-impl", "bitsPerPixel", "getName-impl", "name", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class StreamFormat {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.StreamFormat.Companion INSTANCE = new androidx.camera.camera2.pipe.StreamFormat.Companion(null);
    private static final int UNKNOWN = m710constructorimpl(0);
    private static final int PRIVATE = m710constructorimpl(34);
    private static final int DEPTH16 = m710constructorimpl(1144402265);
    private static final int DEPTH_JPEG = m710constructorimpl(1768253795);
    private static final int DEPTH_POINT_CLOUD = m710constructorimpl(257);
    private static final int FLEX_RGB_888 = m710constructorimpl(41);
    private static final int FLEX_RGBA_8888 = m710constructorimpl(42);
    private static final int HEIC = m710constructorimpl(1212500294);
    private static final int JPEG = m710constructorimpl(256);
    private static final int JPEG_R = m710constructorimpl(4101);
    private static final int NV16 = m710constructorimpl(16);
    private static final int NV21 = m710constructorimpl(17);
    private static final int RAW10 = m710constructorimpl(37);
    private static final int RAW12 = m710constructorimpl(38);
    private static final int RAW_DEPTH = m710constructorimpl(4098);
    private static final int RAW_PRIVATE = m710constructorimpl(36);
    private static final int RAW_SENSOR = m710constructorimpl(32);
    private static final int RGB_565 = m710constructorimpl(4);
    private static final int Y12 = m710constructorimpl(com.google.mlkit.vision.common.InputImage.IMAGE_FORMAT_YV12);
    private static final int Y16 = m710constructorimpl(540422489);
    private static final int Y8 = m710constructorimpl(538982489);
    private static final int YCBCR_P010 = m710constructorimpl(54);
    private static final int YUV_420_888 = m710constructorimpl(35);
    private static final int YUV_422_888 = m710constructorimpl(39);
    private static final int YUV_444_888 = m710constructorimpl(40);
    private static final int YUY2 = m710constructorimpl(20);
    private static final int YV12 = m710constructorimpl(com.google.mlkit.vision.common.InputImage.IMAGE_FORMAT_YV12);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m710constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m712equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/StreamFormat$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/StreamFormat;", "UNKNOWN", com.visa.cbp.getEncExpo.warmup, "getUNKNOWN-8FPWQzE", "()I", "PRIVATE", "getPRIVATE-8FPWQzE", "DEPTH16", "getDEPTH16-8FPWQzE", "DEPTH_JPEG", "getDEPTH_JPEG-8FPWQzE", "DEPTH_POINT_CLOUD", "getDEPTH_POINT_CLOUD-8FPWQzE", "FLEX_RGB_888", "getFLEX_RGB_888-8FPWQzE", "FLEX_RGBA_8888", "getFLEX_RGBA_8888-8FPWQzE", "HEIC", "getHEIC-8FPWQzE", "JPEG", "getJPEG-8FPWQzE", "JPEG_R", "getJPEG_R-8FPWQzE", "NV16", "getNV16-8FPWQzE", "NV21", "getNV21-8FPWQzE", "RAW10", "getRAW10-8FPWQzE", "RAW12", "getRAW12-8FPWQzE", "RAW_DEPTH", "getRAW_DEPTH-8FPWQzE", "RAW_PRIVATE", "getRAW_PRIVATE-8FPWQzE", "RAW_SENSOR", "getRAW_SENSOR-8FPWQzE", "RGB_565", "getRGB_565-8FPWQzE", "Y12", "getY12-8FPWQzE", "Y16", "getY16-8FPWQzE", "Y8", "getY8-8FPWQzE", "YCBCR_P010", "getYCBCR_P010-8FPWQzE", "YUV_420_888", "getYUV_420_888-8FPWQzE", "YUV_422_888", "getYUV_422_888-8FPWQzE", "YUV_444_888", "getYUV_444_888-8FPWQzE", "YUY2", "getYUY2-8FPWQzE", "YV12", "getYV12-8FPWQzE"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUNKNOWN-8FPWQzE, reason: not valid java name */
        public final int m735getUNKNOWN8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.UNKNOWN;
        }

        /* renamed from: getPRIVATE-8FPWQzE, reason: not valid java name */
        public final int m728getPRIVATE8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.PRIVATE;
        }

        /* renamed from: getDEPTH16-8FPWQzE, reason: not valid java name */
        public final int m718getDEPTH168FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.DEPTH16;
        }

        /* renamed from: getDEPTH_JPEG-8FPWQzE, reason: not valid java name */
        public final int m719getDEPTH_JPEG8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.DEPTH_JPEG;
        }

        /* renamed from: getDEPTH_POINT_CLOUD-8FPWQzE, reason: not valid java name */
        public final int m720getDEPTH_POINT_CLOUD8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.DEPTH_POINT_CLOUD;
        }

        /* renamed from: getFLEX_RGB_888-8FPWQzE, reason: not valid java name */
        public final int m722getFLEX_RGB_8888FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.FLEX_RGB_888;
        }

        /* renamed from: getFLEX_RGBA_8888-8FPWQzE, reason: not valid java name */
        public final int m721getFLEX_RGBA_88888FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.FLEX_RGBA_8888;
        }

        /* renamed from: getHEIC-8FPWQzE, reason: not valid java name */
        public final int m723getHEIC8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.HEIC;
        }

        /* renamed from: getJPEG-8FPWQzE, reason: not valid java name */
        public final int m724getJPEG8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.JPEG;
        }

        /* renamed from: getJPEG_R-8FPWQzE, reason: not valid java name */
        public final int m725getJPEG_R8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.JPEG_R;
        }

        /* renamed from: getNV16-8FPWQzE, reason: not valid java name */
        public final int m726getNV168FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.NV16;
        }

        /* renamed from: getNV21-8FPWQzE, reason: not valid java name */
        public final int m727getNV218FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.NV21;
        }

        /* renamed from: getRAW10-8FPWQzE, reason: not valid java name */
        public final int m729getRAW108FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.RAW10;
        }

        /* renamed from: getRAW12-8FPWQzE, reason: not valid java name */
        public final int m730getRAW128FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.RAW12;
        }

        /* renamed from: getRAW_DEPTH-8FPWQzE, reason: not valid java name */
        public final int m731getRAW_DEPTH8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.RAW_DEPTH;
        }

        /* renamed from: getRAW_PRIVATE-8FPWQzE, reason: not valid java name */
        public final int m732getRAW_PRIVATE8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.RAW_PRIVATE;
        }

        /* renamed from: getRAW_SENSOR-8FPWQzE, reason: not valid java name */
        public final int m733getRAW_SENSOR8FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.RAW_SENSOR;
        }

        /* renamed from: getRGB_565-8FPWQzE, reason: not valid java name */
        public final int m734getRGB_5658FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.RGB_565;
        }

        /* renamed from: getY12-8FPWQzE, reason: not valid java name */
        public final int m736getY128FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.Y12;
        }

        /* renamed from: getY16-8FPWQzE, reason: not valid java name */
        public final int m737getY168FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.Y16;
        }

        /* renamed from: getY8-8FPWQzE, reason: not valid java name */
        public final int m738getY88FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.Y8;
        }

        /* renamed from: getYCBCR_P010-8FPWQzE, reason: not valid java name */
        public final int m739getYCBCR_P0108FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.YCBCR_P010;
        }

        /* renamed from: getYUV_420_888-8FPWQzE, reason: not valid java name */
        public final int m740getYUV_420_8888FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.YUV_420_888;
        }

        /* renamed from: getYUV_422_888-8FPWQzE, reason: not valid java name */
        public final int m741getYUV_422_8888FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.YUV_422_888;
        }

        /* renamed from: getYUV_444_888-8FPWQzE, reason: not valid java name */
        public final int m742getYUV_444_8888FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.YUV_444_888;
        }

        /* renamed from: getYUY2-8FPWQzE, reason: not valid java name */
        public final int m743getYUY28FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.YUY2;
        }

        /* renamed from: getYV12-8FPWQzE, reason: not valid java name */
        public final int m744getYV128FPWQzE() {
            return androidx.camera.camera2.pipe.StreamFormat.YV12;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ StreamFormat(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m716toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m716toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("StreamFormat(");
        sb.append(m714getNameimpl(i));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: getBitsPerPixel-impl, reason: not valid java name */
    public static final int m713getBitsPerPixelimpl(int i) {
        if (m712equalsimpl0(i, DEPTH16)) {
            return 16;
        }
        if (m712equalsimpl0(i, FLEX_RGB_888)) {
            return 24;
        }
        if (m712equalsimpl0(i, FLEX_RGBA_8888)) {
            return 32;
        }
        if (m712equalsimpl0(i, NV16)) {
            return 16;
        }
        if (m712equalsimpl0(i, NV21)) {
            return 12;
        }
        if (m712equalsimpl0(i, RAW10)) {
            return 10;
        }
        if (m712equalsimpl0(i, RAW12)) {
            return 12;
        }
        if (m712equalsimpl0(i, RAW_DEPTH) || m712equalsimpl0(i, RAW_SENSOR) || m712equalsimpl0(i, RGB_565)) {
            return 16;
        }
        if (m712equalsimpl0(i, Y12)) {
            return 12;
        }
        if (m712equalsimpl0(i, Y16)) {
            return 16;
        }
        if (m712equalsimpl0(i, Y8)) {
            return 8;
        }
        if (m712equalsimpl0(i, YCBCR_P010)) {
            return 16;
        }
        if (m712equalsimpl0(i, YUV_420_888)) {
            return 12;
        }
        if (m712equalsimpl0(i, YUV_422_888)) {
            return 16;
        }
        if (m712equalsimpl0(i, YUV_444_888)) {
            return 24;
        }
        if (m712equalsimpl0(i, YUY2)) {
            return 16;
        }
        return m712equalsimpl0(i, YV12) ? 12 : -1;
    }

    /* renamed from: getName-impl, reason: not valid java name */
    public static final java.lang.String m714getNameimpl(int i) {
        if (m712equalsimpl0(i, UNKNOWN)) {
            return "UNKNOWN";
        }
        if (m712equalsimpl0(i, PRIVATE)) {
            return "PRIVATE";
        }
        if (m712equalsimpl0(i, DEPTH16)) {
            return "DEPTH16";
        }
        if (m712equalsimpl0(i, DEPTH_JPEG)) {
            return "DEPTH_JPEG";
        }
        if (m712equalsimpl0(i, DEPTH_POINT_CLOUD)) {
            return "DEPTH_POINT_CLOUD";
        }
        if (m712equalsimpl0(i, FLEX_RGB_888)) {
            return "FLEX_RGB_888";
        }
        if (m712equalsimpl0(i, FLEX_RGBA_8888)) {
            return "FLEX_RGBA_8888";
        }
        if (m712equalsimpl0(i, HEIC)) {
            return "HEIC";
        }
        if (m712equalsimpl0(i, JPEG)) {
            return "JPEG";
        }
        if (m712equalsimpl0(i, JPEG_R)) {
            return "JPEG_R";
        }
        if (m712equalsimpl0(i, NV16)) {
            return "NV16";
        }
        if (m712equalsimpl0(i, NV21)) {
            return "NV21";
        }
        if (m712equalsimpl0(i, RAW10)) {
            return "RAW10";
        }
        if (m712equalsimpl0(i, RAW12)) {
            return "RAW12";
        }
        if (m712equalsimpl0(i, RAW_DEPTH)) {
            return "RAW_DEPTH";
        }
        if (m712equalsimpl0(i, RAW_PRIVATE)) {
            return "RAW_PRIVATE";
        }
        if (m712equalsimpl0(i, RAW_SENSOR)) {
            return "RAW_SENSOR";
        }
        if (m712equalsimpl0(i, RGB_565)) {
            return "RGB_565";
        }
        if (m712equalsimpl0(i, Y12)) {
            return "Y12";
        }
        if (m712equalsimpl0(i, Y16)) {
            return "Y16";
        }
        if (m712equalsimpl0(i, Y8)) {
            return "Y8";
        }
        if (m712equalsimpl0(i, YCBCR_P010)) {
            return "YCBCR_P010";
        }
        if (m712equalsimpl0(i, YUV_420_888)) {
            return "YUV_420_888";
        }
        if (m712equalsimpl0(i, YUV_422_888)) {
            return "YUV_422_888";
        }
        if (m712equalsimpl0(i, YUV_444_888)) {
            return "YUV_444_888";
        }
        if (m712equalsimpl0(i, YUY2)) {
            return "YUY2";
        }
        if (m712equalsimpl0(i, YV12)) {
            return "YV12";
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UNKNOWN(");
        java.lang.String num = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(16));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
        sb.append(num);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m717unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m715hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m711equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m715hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m711equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.StreamFormat) && i == ((androidx.camera.camera2.pipe.StreamFormat) obj).m717unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.StreamFormat m709boximpl(int i) {
        return new androidx.camera.camera2.pipe.StreamFormat(i);
    }
}
