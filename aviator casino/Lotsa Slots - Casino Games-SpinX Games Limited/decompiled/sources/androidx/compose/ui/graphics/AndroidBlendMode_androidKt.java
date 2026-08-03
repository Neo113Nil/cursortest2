package androidx.compose.ui.graphics;

/* compiled from: AndroidBlendMode.android.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u0002ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u0002H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0002*\u00020\u0006H\u0001¢\u0006\u0002\u0010\n\u001a\u0016\u0010\u000b\u001a\u00020\f*\u00020\u0002H\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"isSupported", "", "Landroidx/compose/ui/graphics/BlendMode;", "isSupported-s9anfk8", "(I)Z", "toAndroidBlendMode", "Landroid/graphics/BlendMode;", "toAndroidBlendMode-s9anfk8", "(I)Landroid/graphics/BlendMode;", "toComposeBlendMode", "(Landroid/graphics/BlendMode;)I", "toPorterDuffMode", "Landroid/graphics/PorterDuff$Mode;", "toPorterDuffMode-s9anfk8", "(I)Landroid/graphics/PorterDuff$Mode;", "ui-graphics_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AndroidBlendMode_androidKt {

    /* compiled from: AndroidBlendMode.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[android.graphics.BlendMode.values().length];
            try {
                iArr[android.graphics.BlendMode.CLEAR.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[android.graphics.BlendMode.DST.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OVER.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OVER.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_IN.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_IN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_OUT.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_OUT.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[android.graphics.BlendMode.SRC_ATOP.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[android.graphics.BlendMode.DST_ATOP.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[android.graphics.BlendMode.XOR.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[android.graphics.BlendMode.PLUS.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[android.graphics.BlendMode.MODULATE.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[android.graphics.BlendMode.SCREEN.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[android.graphics.BlendMode.OVERLAY.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[android.graphics.BlendMode.DARKEN.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            try {
                iArr[android.graphics.BlendMode.LIGHTEN.ordinal()] = 18;
            } catch (java.lang.NoSuchFieldError unused18) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_DODGE.ordinal()] = 19;
            } catch (java.lang.NoSuchFieldError unused19) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR_BURN.ordinal()] = 20;
            } catch (java.lang.NoSuchFieldError unused20) {
            }
            try {
                iArr[android.graphics.BlendMode.HARD_LIGHT.ordinal()] = 21;
            } catch (java.lang.NoSuchFieldError unused21) {
            }
            try {
                iArr[android.graphics.BlendMode.SOFT_LIGHT.ordinal()] = 22;
            } catch (java.lang.NoSuchFieldError unused22) {
            }
            try {
                iArr[android.graphics.BlendMode.DIFFERENCE.ordinal()] = 23;
            } catch (java.lang.NoSuchFieldError unused23) {
            }
            try {
                iArr[android.graphics.BlendMode.EXCLUSION.ordinal()] = 24;
            } catch (java.lang.NoSuchFieldError unused24) {
            }
            try {
                iArr[android.graphics.BlendMode.MULTIPLY.ordinal()] = 25;
            } catch (java.lang.NoSuchFieldError unused25) {
            }
            try {
                iArr[android.graphics.BlendMode.HUE.ordinal()] = 26;
            } catch (java.lang.NoSuchFieldError unused26) {
            }
            try {
                iArr[android.graphics.BlendMode.SATURATION.ordinal()] = 27;
            } catch (java.lang.NoSuchFieldError unused27) {
            }
            try {
                iArr[android.graphics.BlendMode.COLOR.ordinal()] = 28;
            } catch (java.lang.NoSuchFieldError unused28) {
            }
            try {
                iArr[android.graphics.BlendMode.LUMINOSITY.ordinal()] = 29;
            } catch (java.lang.NoSuchFieldError unused29) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: isSupported-s9anfk8, reason: not valid java name */
    public static final boolean m1962isSupporteds9anfk8(int i) {
        return android.os.Build.VERSION.SDK_INT >= 29 || androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2055getSrcOver0nO6VwU()) || m1964toPorterDuffModes9anfk8(i) != android.graphics.PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toPorterDuffMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.PorterDuff.Mode m1964toPorterDuffModes9anfk8(int i) {
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.CLEAR;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2051getSrc0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.SRC;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2034getDst0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.DST;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2055getSrcOver0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2038getDstOver0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.DST_OVER;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2053getSrcIn0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2036getDstIn0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.DST_IN;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2054getSrcOut0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.SRC_OUT;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2037getDstOut0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.DST_OUT;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2052getSrcAtop0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2035getDstAtop0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.DST_ATOP;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2056getXor0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.XOR;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2047getPlus0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.ADD;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2049getScreen0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.SCREEN;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2046getOverlay0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.OVERLAY;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2032getDarken0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.DARKEN;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2042getLighten0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.LIGHTEN;
        }
        if (androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2044getModulate0nO6VwU())) {
            return android.graphics.PorterDuff.Mode.MULTIPLY;
        }
        return android.graphics.PorterDuff.Mode.SRC_OVER;
    }

    /* renamed from: toAndroidBlendMode-s9anfk8, reason: not valid java name */
    public static final android.graphics.BlendMode m1963toAndroidBlendModes9anfk8(int i) {
        return androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU()) ? android.graphics.BlendMode.CLEAR : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2051getSrc0nO6VwU()) ? android.graphics.BlendMode.SRC : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2034getDst0nO6VwU()) ? android.graphics.BlendMode.DST : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2055getSrcOver0nO6VwU()) ? android.graphics.BlendMode.SRC_OVER : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2038getDstOver0nO6VwU()) ? android.graphics.BlendMode.DST_OVER : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2053getSrcIn0nO6VwU()) ? android.graphics.BlendMode.SRC_IN : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2036getDstIn0nO6VwU()) ? android.graphics.BlendMode.DST_IN : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2054getSrcOut0nO6VwU()) ? android.graphics.BlendMode.SRC_OUT : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2037getDstOut0nO6VwU()) ? android.graphics.BlendMode.DST_OUT : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2052getSrcAtop0nO6VwU()) ? android.graphics.BlendMode.SRC_ATOP : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2035getDstAtop0nO6VwU()) ? android.graphics.BlendMode.DST_ATOP : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2056getXor0nO6VwU()) ? android.graphics.BlendMode.XOR : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2047getPlus0nO6VwU()) ? android.graphics.BlendMode.PLUS : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2044getModulate0nO6VwU()) ? android.graphics.BlendMode.MODULATE : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2049getScreen0nO6VwU()) ? android.graphics.BlendMode.SCREEN : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2046getOverlay0nO6VwU()) ? android.graphics.BlendMode.OVERLAY : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2032getDarken0nO6VwU()) ? android.graphics.BlendMode.DARKEN : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2042getLighten0nO6VwU()) ? android.graphics.BlendMode.LIGHTEN : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2031getColorDodge0nO6VwU()) ? android.graphics.BlendMode.COLOR_DODGE : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2030getColorBurn0nO6VwU()) ? android.graphics.BlendMode.COLOR_BURN : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2040getHardlight0nO6VwU()) ? android.graphics.BlendMode.HARD_LIGHT : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2050getSoftlight0nO6VwU()) ? android.graphics.BlendMode.SOFT_LIGHT : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2033getDifference0nO6VwU()) ? android.graphics.BlendMode.DIFFERENCE : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2039getExclusion0nO6VwU()) ? android.graphics.BlendMode.EXCLUSION : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2045getMultiply0nO6VwU()) ? android.graphics.BlendMode.MULTIPLY : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2041getHue0nO6VwU()) ? android.graphics.BlendMode.HUE : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2048getSaturation0nO6VwU()) ? android.graphics.BlendMode.SATURATION : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2029getColor0nO6VwU()) ? android.graphics.BlendMode.COLOR : androidx.compose.ui.graphics.BlendMode.m2024equalsimpl0(i, androidx.compose.ui.graphics.BlendMode.INSTANCE.m2043getLuminosity0nO6VwU()) ? android.graphics.BlendMode.LUMINOSITY : android.graphics.BlendMode.SRC_OVER;
    }

    public static final int toComposeBlendMode(android.graphics.BlendMode blendMode) {
        switch (androidx.compose.ui.graphics.AndroidBlendMode_androidKt.WhenMappings.$EnumSwitchMapping$0[blendMode.ordinal()]) {
            case 1:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2028getClear0nO6VwU();
            case 2:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2051getSrc0nO6VwU();
            case 3:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2034getDst0nO6VwU();
            case 4:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2055getSrcOver0nO6VwU();
            case 5:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2038getDstOver0nO6VwU();
            case 6:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2053getSrcIn0nO6VwU();
            case 7:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2036getDstIn0nO6VwU();
            case 8:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2054getSrcOut0nO6VwU();
            case 9:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2037getDstOut0nO6VwU();
            case 10:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2052getSrcAtop0nO6VwU();
            case 11:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2035getDstAtop0nO6VwU();
            case 12:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2056getXor0nO6VwU();
            case 13:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2047getPlus0nO6VwU();
            case 14:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2044getModulate0nO6VwU();
            case 15:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2049getScreen0nO6VwU();
            case 16:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2046getOverlay0nO6VwU();
            case 17:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2032getDarken0nO6VwU();
            case 18:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2042getLighten0nO6VwU();
            case 19:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2031getColorDodge0nO6VwU();
            case 20:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2030getColorBurn0nO6VwU();
            case 21:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2040getHardlight0nO6VwU();
            case 22:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2050getSoftlight0nO6VwU();
            case 23:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2033getDifference0nO6VwU();
            case 24:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2039getExclusion0nO6VwU();
            case 25:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2045getMultiply0nO6VwU();
            case 26:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2041getHue0nO6VwU();
            case 27:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2048getSaturation0nO6VwU();
            case 28:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2029getColor0nO6VwU();
            case 29:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2043getLuminosity0nO6VwU();
            default:
                return androidx.compose.ui.graphics.BlendMode.INSTANCE.m2055getSrcOver0nO6VwU();
        }
    }
}
