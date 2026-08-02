package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class BlendMode {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.BlendMode.Companion INSTANCE = new androidx.compose.ui.graphics.BlendMode.Companion(null);
    private static final int Clear = m5904constructorimpl(0);
    private static final int Src = m5904constructorimpl(1);
    private static final int Dst = m5904constructorimpl(2);
    private static final int SrcOver = m5904constructorimpl(3);
    private static final int DstOver = m5904constructorimpl(4);
    private static final int SrcIn = m5904constructorimpl(5);
    private static final int DstIn = m5904constructorimpl(6);
    private static final int SrcOut = m5904constructorimpl(7);
    private static final int DstOut = m5904constructorimpl(8);
    private static final int SrcAtop = m5904constructorimpl(9);
    private static final int DstAtop = m5904constructorimpl(10);
    private static final int Xor = m5904constructorimpl(11);
    private static final int Plus = m5904constructorimpl(12);
    private static final int Modulate = m5904constructorimpl(13);
    private static final int Screen = m5904constructorimpl(14);
    private static final int Overlay = m5904constructorimpl(15);
    private static final int Darken = m5904constructorimpl(16);
    private static final int Lighten = m5904constructorimpl(17);
    private static final int ColorDodge = m5904constructorimpl(18);
    private static final int ColorBurn = m5904constructorimpl(19);
    private static final int Hardlight = m5904constructorimpl(20);
    private static final int Softlight = m5904constructorimpl(21);
    private static final int Difference = m5904constructorimpl(22);
    private static final int Exclusion = m5904constructorimpl(23);
    private static final int Multiply = m5904constructorimpl(24);
    private static final int Hue = m5904constructorimpl(25);
    private static final int Saturation = m5904constructorimpl(26);
    private static final int Color = m5904constructorimpl(27);
    private static final int Luminosity = m5904constructorimpl(28);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5904constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5906equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ BlendMode(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\bR\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b.\u0010\bR\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010\u0006\u001a\u0004\b0\u0010\bR\u001a\u00101\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010\u0006\u001a\u0004\b4\u0010\bR\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010\u0006\u001a\u0004\b6\u0010\bR\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010\u0006\u001a\u0004\b8\u0010\bR\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010\u0006\u001a\u0004\b:\u0010\bR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010\u0006\u001a\u0004\b<\u0010\bR\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b@\u0010\b"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/BlendMode;", com.paypal.pds.components.SearchKt.ClearIconTag, com.visa.cbp.getEncExpo.warmup, "getClear-0nO6VwU", "()I", "Src", "getSrc-0nO6VwU", "Dst", "getDst-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "Xor", "getXor-0nO6VwU", "Plus", "getPlus-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Hue", "getHue-0nO6VwU", androidx.exifinterface.media.ExifInterface.TAG_SATURATION, "getSaturation-0nO6VwU", "Color", "getColor-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m5910getClear0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Clear;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m5933getSrc0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Src;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m5916getDst0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Dst;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m5937getSrcOver0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcOver;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m5920getDstOver0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstOver;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m5935getSrcIn0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcIn;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m5918getDstIn0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m5936getSrcOut0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcOut;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m5919getDstOut0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstOut;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m5934getSrcAtop0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcAtop;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m5917getDstAtop0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstAtop;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m5938getXor0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Xor;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m5929getPlus0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Plus;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m5926getModulate0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Modulate;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m5931getScreen0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Screen;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m5928getOverlay0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Overlay;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m5914getDarken0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Darken;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m5924getLighten0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Lighten;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m5913getColorDodge0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.ColorDodge;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m5912getColorBurn0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.ColorBurn;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m5922getHardlight0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Hardlight;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m5932getSoftlight0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Softlight;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m5915getDifference0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Difference;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m5921getExclusion0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Exclusion;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m5927getMultiply0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Multiply;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m5923getHue0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Hue;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m5930getSaturation0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Saturation;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m5911getColor0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Color;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m5925getLuminosity0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Luminosity;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m5908toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5908toStringimpl(int i) {
        return m5906equalsimpl0(i, Clear) ? com.paypal.pds.components.SearchKt.ClearIconTag : m5906equalsimpl0(i, Src) ? "Src" : m5906equalsimpl0(i, Dst) ? "Dst" : m5906equalsimpl0(i, SrcOver) ? "SrcOver" : m5906equalsimpl0(i, DstOver) ? "DstOver" : m5906equalsimpl0(i, SrcIn) ? "SrcIn" : m5906equalsimpl0(i, DstIn) ? "DstIn" : m5906equalsimpl0(i, SrcOut) ? "SrcOut" : m5906equalsimpl0(i, DstOut) ? "DstOut" : m5906equalsimpl0(i, SrcAtop) ? "SrcAtop" : m5906equalsimpl0(i, DstAtop) ? "DstAtop" : m5906equalsimpl0(i, Xor) ? "Xor" : m5906equalsimpl0(i, Plus) ? "Plus" : m5906equalsimpl0(i, Modulate) ? "Modulate" : m5906equalsimpl0(i, Screen) ? "Screen" : m5906equalsimpl0(i, Overlay) ? "Overlay" : m5906equalsimpl0(i, Darken) ? "Darken" : m5906equalsimpl0(i, Lighten) ? "Lighten" : m5906equalsimpl0(i, ColorDodge) ? "ColorDodge" : m5906equalsimpl0(i, ColorBurn) ? "ColorBurn" : m5906equalsimpl0(i, Hardlight) ? "HardLight" : m5906equalsimpl0(i, Softlight) ? "Softlight" : m5906equalsimpl0(i, Difference) ? "Difference" : m5906equalsimpl0(i, Exclusion) ? "Exclusion" : m5906equalsimpl0(i, Multiply) ? "Multiply" : m5906equalsimpl0(i, Hue) ? "Hue" : m5906equalsimpl0(i, Saturation) ? androidx.exifinterface.media.ExifInterface.TAG_SATURATION : m5906equalsimpl0(i, Color) ? "Color" : m5906equalsimpl0(i, Luminosity) ? "Luminosity" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m5907hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m5905equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5907hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5905equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.BlendMode) && i == ((androidx.compose.ui.graphics.BlendMode) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.BlendMode m5903boximpl(int i) {
        return new androidx.compose.ui.graphics.BlendMode(i);
    }
}
