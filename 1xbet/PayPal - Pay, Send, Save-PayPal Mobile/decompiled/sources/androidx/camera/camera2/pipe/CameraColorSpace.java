package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0012\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\u0088\u0001\u0013\u0092\u0001\u00020\u000f"}, d2 = {"Landroidx/camera/camera2/pipe/CameraColorSpace;", "", "Landroid/graphics/ColorSpace$Named;", "toColorSpaceNamed-impl", "(Ljava/lang/String;)Landroid/graphics/ColorSpace$Named;", "toColorSpaceNamed", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "colorSpaceName", "Ljava/lang/String;", "getColorSpaceName", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class CameraColorSpace {
    private final java.lang.String colorSpaceName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.CameraColorSpace.Companion INSTANCE = new androidx.camera.camera2.pipe.CameraColorSpace.Companion(null);
    private static final java.lang.String UNKNOWN = "UNKNOWN";
    private static final java.lang.String SRGB = "SRGB";
    private static final java.lang.String LINEAR_SRGB = "LINEAR_SRGB";
    private static final java.lang.String EXTENDED_SRGB = "EXTENDED_SRGB";
    private static final java.lang.String LINEAR_EXTENDED_SRGB = "LINEAR_EXTENDED_SRGB";
    private static final java.lang.String BT709 = "BT709";
    private static final java.lang.String BT2020 = "BT2020";
    private static final java.lang.String DCI_P3 = "DCI_P3";
    private static final java.lang.String DISPLAY_P3 = "DISPLAY_P3";
    private static final java.lang.String NTSC_1953 = "NTSC_1953";
    private static final java.lang.String SMPTE_C = "SMPTE_C";
    private static final java.lang.String ADOBE_RGB = "ADOBE_RGB";
    private static final java.lang.String PRO_PHOTO_RGB = "PRO_PHOTO_RGB";
    private static final java.lang.String ACES = "ACES";
    private static final java.lang.String ACESCG = "ACESCG";
    private static final java.lang.String CIE_XYZ = "CIE_XYZ";
    private static final java.lang.String CIE_LAB = "CIE_LAB";
    private static final java.lang.String BT2020_HLG = "BT2020_HLG";
    private static final java.lang.String BT2020_PQ = "BT2020_PQ";

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b+\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u000b\u001a\u0004\b\u0011\u0010\rR\u001a\u0010\u0012\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u001a\u0010\u0014\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u000b\u001a\u0004\b\u0015\u0010\rR\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0017\u0010\rR\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u000b\u001a\u0004\b\u001b\u0010\rR\u001a\u0010\u001c\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u000b\u001a\u0004\b\u001d\u0010\rR\u001a\u0010\u001e\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u000b\u001a\u0004\b\u001f\u0010\rR\u001a\u0010 \u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\rR\u001a\u0010\"\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u000b\u001a\u0004\b#\u0010\rR\u001a\u0010$\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010\u000b\u001a\u0004\b%\u0010\rR\u001a\u0010&\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u000b\u001a\u0004\b'\u0010\rR\u001a\u0010(\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u000b\u001a\u0004\b)\u0010\rR\u001a\u0010*\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u000b\u001a\u0004\b+\u0010\rR\u001a\u0010,\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010\u000b\u001a\u0004\b-\u0010\rR\u001a\u0010.\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b/\u0010\rR\u001a\u00100\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010\u000b\u001a\u0004\b1\u0010\r"}, d2 = {"Landroidx/camera/camera2/pipe/CameraColorSpace$Companion;", "", "<init>", "()V", "Landroid/graphics/ColorSpace$Named;", "colorSpaceNamed", "Landroidx/camera/camera2/pipe/CameraColorSpace;", "fromColorSpaceNamed-5GKeQC8", "(Landroid/graphics/ColorSpace$Named;)Ljava/lang/String;", "fromColorSpaceNamed", "UNKNOWN", "Ljava/lang/String;", "getUNKNOWN-sh9K6P8", "()Ljava/lang/String;", "SRGB", "getSRGB-sh9K6P8", "LINEAR_SRGB", "getLINEAR_SRGB-sh9K6P8", "EXTENDED_SRGB", "getEXTENDED_SRGB-sh9K6P8", "LINEAR_EXTENDED_SRGB", "getLINEAR_EXTENDED_SRGB-sh9K6P8", "BT709", "getBT709-sh9K6P8", "BT2020", "getBT2020-sh9K6P8", "DCI_P3", "getDCI_P3-sh9K6P8", "DISPLAY_P3", "getDISPLAY_P3-sh9K6P8", "NTSC_1953", "getNTSC_1953-sh9K6P8", "SMPTE_C", "getSMPTE_C-sh9K6P8", "ADOBE_RGB", "getADOBE_RGB-sh9K6P8", "PRO_PHOTO_RGB", "getPRO_PHOTO_RGB-sh9K6P8", "ACES", "getACES-sh9K6P8", "ACESCG", "getACESCG-sh9K6P8", "CIE_XYZ", "getCIE_XYZ-sh9K6P8", "CIE_LAB", "getCIE_LAB-sh9K6P8", "BT2020_HLG", "getBT2020_HLG-sh9K6P8", "BT2020_PQ", "getBT2020_PQ-sh9K6P8"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUNKNOWN-sh9K6P8, reason: not valid java name */
        public final java.lang.String m267getUNKNOWNsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.UNKNOWN;
        }

        /* renamed from: getSRGB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m266getSRGBsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.SRGB;
        }

        /* renamed from: getLINEAR_SRGB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m262getLINEAR_SRGBsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.LINEAR_SRGB;
        }

        /* renamed from: getEXTENDED_SRGB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m260getEXTENDED_SRGBsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.EXTENDED_SRGB;
        }

        /* renamed from: getLINEAR_EXTENDED_SRGB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m261getLINEAR_EXTENDED_SRGBsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.LINEAR_EXTENDED_SRGB;
        }

        /* renamed from: getBT709-sh9K6P8, reason: not valid java name */
        public final java.lang.String m255getBT709sh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.BT709;
        }

        /* renamed from: getBT2020-sh9K6P8, reason: not valid java name */
        public final java.lang.String m252getBT2020sh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.BT2020;
        }

        /* renamed from: getDCI_P3-sh9K6P8, reason: not valid java name */
        public final java.lang.String m258getDCI_P3sh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.DCI_P3;
        }

        /* renamed from: getDISPLAY_P3-sh9K6P8, reason: not valid java name */
        public final java.lang.String m259getDISPLAY_P3sh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.DISPLAY_P3;
        }

        /* renamed from: getNTSC_1953-sh9K6P8, reason: not valid java name */
        public final java.lang.String m263getNTSC_1953sh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.NTSC_1953;
        }

        /* renamed from: getSMPTE_C-sh9K6P8, reason: not valid java name */
        public final java.lang.String m265getSMPTE_Csh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.SMPTE_C;
        }

        /* renamed from: getADOBE_RGB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m251getADOBE_RGBsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.ADOBE_RGB;
        }

        /* renamed from: getPRO_PHOTO_RGB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m264getPRO_PHOTO_RGBsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.PRO_PHOTO_RGB;
        }

        /* renamed from: getACES-sh9K6P8, reason: not valid java name */
        public final java.lang.String m249getACESsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.ACES;
        }

        /* renamed from: getACESCG-sh9K6P8, reason: not valid java name */
        public final java.lang.String m250getACESCGsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.ACESCG;
        }

        /* renamed from: getCIE_XYZ-sh9K6P8, reason: not valid java name */
        public final java.lang.String m257getCIE_XYZsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.CIE_XYZ;
        }

        /* renamed from: getCIE_LAB-sh9K6P8, reason: not valid java name */
        public final java.lang.String m256getCIE_LABsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.CIE_LAB;
        }

        /* renamed from: getBT2020_HLG-sh9K6P8, reason: not valid java name */
        public final java.lang.String m253getBT2020_HLGsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.BT2020_HLG;
        }

        /* renamed from: getBT2020_PQ-sh9K6P8, reason: not valid java name */
        public final java.lang.String m254getBT2020_PQsh9K6P8() {
            return androidx.camera.camera2.pipe.CameraColorSpace.BT2020_PQ;
        }

        @kotlin.jvm.JvmStatic
        /* renamed from: fromColorSpaceNamed-5GKeQC8, reason: not valid java name */
        public final java.lang.String m248fromColorSpaceNamed5GKeQC8(android.graphics.ColorSpace.Named colorSpaceNamed) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(colorSpaceNamed, "");
            switch (androidx.camera.camera2.pipe.CameraColorSpace.Companion.WhenMappings.$EnumSwitchMapping$0[colorSpaceNamed.ordinal()]) {
                case 1:
                    return m266getSRGBsh9K6P8();
                case 2:
                    return m262getLINEAR_SRGBsh9K6P8();
                case 3:
                    return m260getEXTENDED_SRGBsh9K6P8();
                case 4:
                    return m261getLINEAR_EXTENDED_SRGBsh9K6P8();
                case 5:
                    return m255getBT709sh9K6P8();
                case 6:
                    return m252getBT2020sh9K6P8();
                case 7:
                    return m258getDCI_P3sh9K6P8();
                case 8:
                    return m259getDISPLAY_P3sh9K6P8();
                case 9:
                    return m263getNTSC_1953sh9K6P8();
                case 10:
                    return m265getSMPTE_Csh9K6P8();
                case 11:
                    return m251getADOBE_RGBsh9K6P8();
                case 12:
                    return m264getPRO_PHOTO_RGBsh9K6P8();
                case 13:
                    return m249getACESsh9K6P8();
                case 14:
                    return m250getACESCGsh9K6P8();
                case 15:
                    return m257getCIE_XYZsh9K6P8();
                case 16:
                    return m256getCIE_LABsh9K6P8();
                default:
                    if (android.os.Build.VERSION.SDK_INT < 34) {
                        return null;
                    }
                    int i = androidx.camera.camera2.pipe.CameraColorSpace.Companion.WhenMappings.$EnumSwitchMapping$0[colorSpaceNamed.ordinal()];
                    if (i == 17) {
                        return m253getBT2020_HLGsh9K6P8();
                    }
                    if (i != 18) {
                        return null;
                    }
                    return m254getBT2020_PQsh9K6P8();
            }
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[android.graphics.ColorSpace.Named.values().length];
                try {
                    iArr[android.graphics.ColorSpace.Named.SRGB.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.LINEAR_SRGB.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.EXTENDED_SRGB.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.BT709.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.BT2020.ordinal()] = 6;
                } catch (java.lang.NoSuchFieldError unused6) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.DCI_P3.ordinal()] = 7;
                } catch (java.lang.NoSuchFieldError unused7) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.DISPLAY_P3.ordinal()] = 8;
                } catch (java.lang.NoSuchFieldError unused8) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.NTSC_1953.ordinal()] = 9;
                } catch (java.lang.NoSuchFieldError unused9) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.SMPTE_C.ordinal()] = 10;
                } catch (java.lang.NoSuchFieldError unused10) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.ADOBE_RGB.ordinal()] = 11;
                } catch (java.lang.NoSuchFieldError unused11) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.PRO_PHOTO_RGB.ordinal()] = 12;
                } catch (java.lang.NoSuchFieldError unused12) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.ACES.ordinal()] = 13;
                } catch (java.lang.NoSuchFieldError unused13) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.ACESCG.ordinal()] = 14;
                } catch (java.lang.NoSuchFieldError unused14) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.CIE_XYZ.ordinal()] = 15;
                } catch (java.lang.NoSuchFieldError unused15) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.CIE_LAB.ordinal()] = 16;
                } catch (java.lang.NoSuchFieldError unused16) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.BT2020_HLG.ordinal()] = 17;
                } catch (java.lang.NoSuchFieldError unused17) {
                }
                try {
                    iArr[android.graphics.ColorSpace.Named.BT2020_PQ.ordinal()] = 18;
                } catch (java.lang.NoSuchFieldError unused18) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ CameraColorSpace(java.lang.String str) {
        this.colorSpaceName = str;
    }

    public final java.lang.String getColorSpaceName() {
        return this.colorSpaceName;
    }

    /* renamed from: toColorSpaceNamed-impl, reason: not valid java name */
    public static final android.graphics.ColorSpace.Named m245toColorSpaceNamedimpl(java.lang.String str) {
        if (m242equalsimpl0(str, UNKNOWN)) {
            return null;
        }
        if (m242equalsimpl0(str, SRGB)) {
            return android.graphics.ColorSpace.Named.SRGB;
        }
        if (m242equalsimpl0(str, LINEAR_SRGB)) {
            return android.graphics.ColorSpace.Named.LINEAR_SRGB;
        }
        if (m242equalsimpl0(str, EXTENDED_SRGB)) {
            return android.graphics.ColorSpace.Named.EXTENDED_SRGB;
        }
        if (m242equalsimpl0(str, LINEAR_EXTENDED_SRGB)) {
            return android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB;
        }
        if (m242equalsimpl0(str, BT709)) {
            return android.graphics.ColorSpace.Named.BT709;
        }
        if (m242equalsimpl0(str, BT2020)) {
            return android.graphics.ColorSpace.Named.BT2020;
        }
        if (m242equalsimpl0(str, DCI_P3)) {
            return android.graphics.ColorSpace.Named.DCI_P3;
        }
        if (m242equalsimpl0(str, DISPLAY_P3)) {
            return android.graphics.ColorSpace.Named.DISPLAY_P3;
        }
        if (m242equalsimpl0(str, NTSC_1953)) {
            return android.graphics.ColorSpace.Named.NTSC_1953;
        }
        if (m242equalsimpl0(str, SMPTE_C)) {
            return android.graphics.ColorSpace.Named.SMPTE_C;
        }
        if (m242equalsimpl0(str, ADOBE_RGB)) {
            return android.graphics.ColorSpace.Named.ADOBE_RGB;
        }
        if (m242equalsimpl0(str, PRO_PHOTO_RGB)) {
            return android.graphics.ColorSpace.Named.PRO_PHOTO_RGB;
        }
        if (m242equalsimpl0(str, ACES)) {
            return android.graphics.ColorSpace.Named.ACES;
        }
        if (m242equalsimpl0(str, ACESCG)) {
            return android.graphics.ColorSpace.Named.ACESCG;
        }
        if (m242equalsimpl0(str, CIE_XYZ)) {
            return android.graphics.ColorSpace.Named.CIE_XYZ;
        }
        if (m242equalsimpl0(str, CIE_LAB)) {
            return android.graphics.ColorSpace.Named.CIE_LAB;
        }
        if (android.os.Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (m242equalsimpl0(str, BT2020_HLG)) {
            return android.graphics.ColorSpace.Named.BT2020_HLG;
        }
        if (m242equalsimpl0(str, BT2020_PQ)) {
            return android.graphics.ColorSpace.Named.BT2020_PQ;
        }
        return null;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m247unboximpl() {
        return this.colorSpaceName;
    }

    public final java.lang.String toString() {
        return m246toStringimpl(this.colorSpaceName);
    }

    public final int hashCode() {
        return m244hashCodeimpl(this.colorSpaceName);
    }

    public final boolean equals(java.lang.Object obj) {
        return m241equalsimpl(this.colorSpaceName, obj);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m246toStringimpl(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CameraColorSpace(colorSpaceName=");
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m244hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: fromColorSpaceNamed-5GKeQC8, reason: not valid java name */
    public static final java.lang.String m243fromColorSpaceNamed5GKeQC8(android.graphics.ColorSpace.Named named) {
        return INSTANCE.m248fromColorSpaceNamed5GKeQC8(named);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m242equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m241equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.camera.camera2.pipe.CameraColorSpace) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.camera.camera2.pipe.CameraColorSpace) obj).m247unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.camera.camera2.pipe.CameraColorSpace m240boximpl(java.lang.String str) {
        return new androidx.camera.camera2.pipe.CameraColorSpace(str);
    }
}
