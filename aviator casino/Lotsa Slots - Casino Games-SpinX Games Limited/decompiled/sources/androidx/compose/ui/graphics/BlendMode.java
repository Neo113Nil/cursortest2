package androidx.compose.ui.graphics;

/* compiled from: BlendMode.kt */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\f\u0010\u0005J\u000f\u0010\r\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0012"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode;", "", "value", "", "constructor-impl", "(I)I", "equals", "", "other", "equals-impl", "(ILjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(I)Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class BlendMode {
    private final int value;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.graphics.BlendMode.Companion INSTANCE = new androidx.compose.ui.graphics.BlendMode.Companion(null);
    private static final int Clear = m2022constructorimpl(0);
    private static final int Src = m2022constructorimpl(1);
    private static final int Dst = m2022constructorimpl(2);
    private static final int SrcOver = m2022constructorimpl(3);
    private static final int DstOver = m2022constructorimpl(4);
    private static final int SrcIn = m2022constructorimpl(5);
    private static final int DstIn = m2022constructorimpl(6);
    private static final int SrcOut = m2022constructorimpl(7);
    private static final int DstOut = m2022constructorimpl(8);
    private static final int SrcAtop = m2022constructorimpl(9);
    private static final int DstAtop = m2022constructorimpl(10);
    private static final int Xor = m2022constructorimpl(11);
    private static final int Plus = m2022constructorimpl(12);
    private static final int Modulate = m2022constructorimpl(13);
    private static final int Screen = m2022constructorimpl(14);
    private static final int Overlay = m2022constructorimpl(15);
    private static final int Darken = m2022constructorimpl(16);
    private static final int Lighten = m2022constructorimpl(17);
    private static final int ColorDodge = m2022constructorimpl(18);
    private static final int ColorBurn = m2022constructorimpl(19);
    private static final int Hardlight = m2022constructorimpl(20);
    private static final int Softlight = m2022constructorimpl(21);
    private static final int Difference = m2022constructorimpl(22);
    private static final int Exclusion = m2022constructorimpl(23);
    private static final int Multiply = m2022constructorimpl(24);
    private static final int Hue = m2022constructorimpl(25);
    private static final int Saturation = m2022constructorimpl(26);
    private static final int Color = m2022constructorimpl(27);
    private static final int Luminosity = m2022constructorimpl(28);

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.BlendMode m2021boximpl(int i) {
        return new androidx.compose.ui.graphics.BlendMode(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m2022constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2023equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.BlendMode) && i == ((androidx.compose.ui.graphics.BlendMode) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2024equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2025hashCodeimpl(int i) {
        return i;
    }

    public boolean equals(java.lang.Object obj) {
        return m2023equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m2025hashCodeimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getValue() {
        return this.value;
    }

    private /* synthetic */ BlendMode(int i) {
        this.value = i;
    }

    /* compiled from: BlendMode.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b<\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006R\u0019\u0010\n\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000b\u0010\u0006R\u0019\u0010\f\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\r\u0010\u0006R\u0019\u0010\u000e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u000f\u0010\u0006R\u0019\u0010\u0010\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0017\u0010\u0006R\u0019\u0010\u0018\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0019\u0010\u0006R\u0019\u0010\u001a\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u001f\u0010\u0006R\u0019\u0010 \u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b!\u0010\u0006R\u0019\u0010\"\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b#\u0010\u0006R\u0019\u0010$\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b%\u0010\u0006R\u0019\u0010&\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b'\u0010\u0006R\u0019\u0010(\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b)\u0010\u0006R\u0019\u0010*\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b+\u0010\u0006R\u0019\u0010,\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b-\u0010\u0006R\u0019\u0010.\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b/\u0010\u0006R\u0019\u00100\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b1\u0010\u0006R\u0019\u00102\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b3\u0010\u0006R\u0019\u00104\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b5\u0010\u0006R\u0019\u00106\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b7\u0010\u0006R\u0019\u00108\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b9\u0010\u0006R\u0019\u0010:\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b;\u0010\u0006R\u0019\u0010<\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b=\u0010\u0006R\u0019\u0010>\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b?\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006@"}, d2 = {"Landroidx/compose/ui/graphics/BlendMode$Companion;", "", "()V", "Clear", "Landroidx/compose/ui/graphics/BlendMode;", "getClear-0nO6VwU", "()I", "I", "Color", "getColor-0nO6VwU", "ColorBurn", "getColorBurn-0nO6VwU", "ColorDodge", "getColorDodge-0nO6VwU", "Darken", "getDarken-0nO6VwU", "Difference", "getDifference-0nO6VwU", "Dst", "getDst-0nO6VwU", "DstAtop", "getDstAtop-0nO6VwU", "DstIn", "getDstIn-0nO6VwU", "DstOut", "getDstOut-0nO6VwU", "DstOver", "getDstOver-0nO6VwU", "Exclusion", "getExclusion-0nO6VwU", "Hardlight", "getHardlight-0nO6VwU", "Hue", "getHue-0nO6VwU", "Lighten", "getLighten-0nO6VwU", "Luminosity", "getLuminosity-0nO6VwU", "Modulate", "getModulate-0nO6VwU", "Multiply", "getMultiply-0nO6VwU", "Overlay", "getOverlay-0nO6VwU", "Plus", "getPlus-0nO6VwU", androidx.exifinterface.media.ExifInterface.TAG_SATURATION, "getSaturation-0nO6VwU", "Screen", "getScreen-0nO6VwU", "Softlight", "getSoftlight-0nO6VwU", "Src", "getSrc-0nO6VwU", "SrcAtop", "getSrcAtop-0nO6VwU", "SrcIn", "getSrcIn-0nO6VwU", "SrcOut", "getSrcOut-0nO6VwU", "SrcOver", "getSrcOver-0nO6VwU", "Xor", "getXor-0nO6VwU", "ui-graphics_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getClear-0nO6VwU, reason: not valid java name */
        public final int m2028getClear0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Clear;
        }

        /* renamed from: getSrc-0nO6VwU, reason: not valid java name */
        public final int m2051getSrc0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Src;
        }

        /* renamed from: getDst-0nO6VwU, reason: not valid java name */
        public final int m2034getDst0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Dst;
        }

        /* renamed from: getSrcOver-0nO6VwU, reason: not valid java name */
        public final int m2055getSrcOver0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcOver;
        }

        /* renamed from: getDstOver-0nO6VwU, reason: not valid java name */
        public final int m2038getDstOver0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstOver;
        }

        /* renamed from: getSrcIn-0nO6VwU, reason: not valid java name */
        public final int m2053getSrcIn0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcIn;
        }

        /* renamed from: getDstIn-0nO6VwU, reason: not valid java name */
        public final int m2036getDstIn0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstIn;
        }

        /* renamed from: getSrcOut-0nO6VwU, reason: not valid java name */
        public final int m2054getSrcOut0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcOut;
        }

        /* renamed from: getDstOut-0nO6VwU, reason: not valid java name */
        public final int m2037getDstOut0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstOut;
        }

        /* renamed from: getSrcAtop-0nO6VwU, reason: not valid java name */
        public final int m2052getSrcAtop0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.SrcAtop;
        }

        /* renamed from: getDstAtop-0nO6VwU, reason: not valid java name */
        public final int m2035getDstAtop0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.DstAtop;
        }

        /* renamed from: getXor-0nO6VwU, reason: not valid java name */
        public final int m2056getXor0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Xor;
        }

        /* renamed from: getPlus-0nO6VwU, reason: not valid java name */
        public final int m2047getPlus0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Plus;
        }

        /* renamed from: getModulate-0nO6VwU, reason: not valid java name */
        public final int m2044getModulate0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Modulate;
        }

        /* renamed from: getScreen-0nO6VwU, reason: not valid java name */
        public final int m2049getScreen0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Screen;
        }

        /* renamed from: getOverlay-0nO6VwU, reason: not valid java name */
        public final int m2046getOverlay0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Overlay;
        }

        /* renamed from: getDarken-0nO6VwU, reason: not valid java name */
        public final int m2032getDarken0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Darken;
        }

        /* renamed from: getLighten-0nO6VwU, reason: not valid java name */
        public final int m2042getLighten0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Lighten;
        }

        /* renamed from: getColorDodge-0nO6VwU, reason: not valid java name */
        public final int m2031getColorDodge0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.ColorDodge;
        }

        /* renamed from: getColorBurn-0nO6VwU, reason: not valid java name */
        public final int m2030getColorBurn0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.ColorBurn;
        }

        /* renamed from: getHardlight-0nO6VwU, reason: not valid java name */
        public final int m2040getHardlight0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Hardlight;
        }

        /* renamed from: getSoftlight-0nO6VwU, reason: not valid java name */
        public final int m2050getSoftlight0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Softlight;
        }

        /* renamed from: getDifference-0nO6VwU, reason: not valid java name */
        public final int m2033getDifference0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Difference;
        }

        /* renamed from: getExclusion-0nO6VwU, reason: not valid java name */
        public final int m2039getExclusion0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Exclusion;
        }

        /* renamed from: getMultiply-0nO6VwU, reason: not valid java name */
        public final int m2045getMultiply0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Multiply;
        }

        /* renamed from: getHue-0nO6VwU, reason: not valid java name */
        public final int m2041getHue0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Hue;
        }

        /* renamed from: getSaturation-0nO6VwU, reason: not valid java name */
        public final int m2048getSaturation0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Saturation;
        }

        /* renamed from: getColor-0nO6VwU, reason: not valid java name */
        public final int m2029getColor0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Color;
        }

        /* renamed from: getLuminosity-0nO6VwU, reason: not valid java name */
        public final int m2043getLuminosity0nO6VwU() {
            return androidx.compose.ui.graphics.BlendMode.Luminosity;
        }
    }

    public java.lang.String toString() {
        return m2026toStringimpl(this.value);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m2026toStringimpl(int i) {
        return m2024equalsimpl0(i, Clear) ? "Clear" : m2024equalsimpl0(i, Src) ? "Src" : m2024equalsimpl0(i, Dst) ? "Dst" : m2024equalsimpl0(i, SrcOver) ? "SrcOver" : m2024equalsimpl0(i, DstOver) ? "DstOver" : m2024equalsimpl0(i, SrcIn) ? "SrcIn" : m2024equalsimpl0(i, DstIn) ? "DstIn" : m2024equalsimpl0(i, SrcOut) ? "SrcOut" : m2024equalsimpl0(i, DstOut) ? "DstOut" : m2024equalsimpl0(i, SrcAtop) ? "SrcAtop" : m2024equalsimpl0(i, DstAtop) ? "DstAtop" : m2024equalsimpl0(i, Xor) ? "Xor" : m2024equalsimpl0(i, Plus) ? "Plus" : m2024equalsimpl0(i, Modulate) ? "Modulate" : m2024equalsimpl0(i, Screen) ? "Screen" : m2024equalsimpl0(i, Overlay) ? "Overlay" : m2024equalsimpl0(i, Darken) ? "Darken" : m2024equalsimpl0(i, Lighten) ? "Lighten" : m2024equalsimpl0(i, ColorDodge) ? "ColorDodge" : m2024equalsimpl0(i, ColorBurn) ? "ColorBurn" : m2024equalsimpl0(i, Hardlight) ? "HardLight" : m2024equalsimpl0(i, Softlight) ? "Softlight" : m2024equalsimpl0(i, Difference) ? "Difference" : m2024equalsimpl0(i, Exclusion) ? "Exclusion" : m2024equalsimpl0(i, Multiply) ? "Multiply" : m2024equalsimpl0(i, Hue) ? "Hue" : m2024equalsimpl0(i, Saturation) ? androidx.exifinterface.media.ExifInterface.TAG_SATURATION : m2024equalsimpl0(i, Color) ? "Color" : m2024equalsimpl0(i, Luminosity) ? "Luminosity" : com.facebook.internal.AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }
}
