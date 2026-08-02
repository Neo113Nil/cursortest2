package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.graphics.colorspace.ColorModel;
import androidx.compose.ui.graphics.colorspace.ColorSpace;
import androidx.compose.ui.graphics.colorspace.ColorSpaceKt;
import androidx.compose.ui.graphics.colorspace.ColorSpaces;
import androidx.compose.ui.graphics.colorspace.Rgb;
import androidx.compose.ui.util.MathHelpersKt;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.ULong;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.ws.WebSocketProtocol;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0010\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a<\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0012\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0015\u001a2\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u00142\b\b\u0002\u0010\u000f\u001a\u00020\u0014H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u001a1\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0082\b\u001a-\u0010\u001f\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\u001a\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\fH\u0002\u001a!\u0010'\u001a\u00020\u0002*\u00020\u00022\u0006\u0010(\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b)\u0010*\u001a\u0019\u0010+\u001a\u00020,*\u00020\u0002H\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b-\u0010.\u001a\u0019\u0010/\u001a\u00020\f*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\u00020\u0002*\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u00020\u000204H\u0086\bø\u0001\u0000ø\u0001\u0002ø\u0001\u0001¢\u0006\u0004\b5\u00106\u001a\u0019\u00107\u001a\u00020\u0014*\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b8\u00109\"\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\"\u0010\u0007\u001a\u00020\u0001*\u00020\u00028Æ\u0002X\u0087\u0004ø\u0001\u0000¢\u0006\f\u0012\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u0012\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0005\b\u009920\u0001¨\u0006:"}, d2 = {"isSpecified", "", "Landroidx/compose/ui/graphics/Color;", "isSpecified-8_81llA$annotations", "(J)V", "isSpecified-8_81llA", "(J)Z", "isUnspecified", "isUnspecified-8_81llA$annotations", "isUnspecified-8_81llA", "Color", "red", "", "green", "blue", "alpha", "colorSpace", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "color", "", "(I)J", "(IIII)J", "", "(J)J", "compositeComponent", "fgC", "bgC", "fgA", "bgA", "a", "lerp", "start", "stop", "fraction", "lerp-jxsXWHM", "(JJF)J", "saturate", "v", "compositeOver", "background", "compositeOver--OWjLjI", "(JJ)J", "getComponents", "", "getComponents-8_81llA", "(J)[F", "luminance", "luminance-8_81llA", "(J)F", "takeOrElse", "block", "Lkotlin/Function0;", "takeOrElse-DxMtmZc", "(JLkotlin/jvm/functions/Function0;)J", "toArgb", "toArgb-8_81llA", "(J)I", "ui-graphics_release"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ColorKt {
    @Stable
    public static final long Color(float f, float f2, float f3, float f4, ColorSpace colorSpace) {
        Intrinsics.checkNotNullParameter(colorSpace, "colorSpace");
        float minValue = colorSpace.getMinValue(0);
        if (f <= colorSpace.getMaxValue(0) && minValue <= f) {
            float minValue2 = colorSpace.getMinValue(1);
            if (f2 <= colorSpace.getMaxValue(1) && minValue2 <= f2) {
                float minValue3 = colorSpace.getMinValue(2);
                if (f3 <= colorSpace.getMaxValue(2) && minValue3 <= f3 && 0.0f <= f4 && f4 <= 1.0f) {
                    if (colorSpace.getIsSrgb()) {
                        return Color.m503constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl((((((int) ((f * 255.0f) + 0.5f)) << 16) | (((int) ((f4 * 255.0f) + 0.5f)) << 24)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((f3 * 255.0f) + 0.5f))) & KeyboardMap.kValueMask) << 32));
                    }
                    if (colorSpace.getComponentCount() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int id2 = colorSpace.getId();
                    if (id2 == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short m601constructorimpl = Float16.m601constructorimpl(f);
                    return Color.m503constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(Float16.m601constructorimpl(f2)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 32) | ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(m601constructorimpl) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 48)) | ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(Float16.m601constructorimpl(f3)) & WebSocketProtocol.PAYLOAD_SHORT_MAX) << 16)) | ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl((int) ((Math.max(0.0f, Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | ULong.m1890constructorimpl(ULong.m1890constructorimpl(id2) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f + ", green = " + f2 + ", blue = " + f3 + ", alpha = " + f4 + " outside the range for " + colorSpace).toString());
    }

    public static /* synthetic */ long Color$default(float f, float f2, float f3, float f4, ColorSpace colorSpace, int i, Object obj) {
        if ((i & 8) != 0) {
            f4 = 1.0f;
        }
        if ((i & 16) != 0) {
            colorSpace = ColorSpaces.INSTANCE.getSrgb();
        }
        return Color(f, f2, f3, f4, colorSpace);
    }

    private static final float compositeComponent(float f, float f2, float f3, float f4, float f5) {
        if (f5 == 0.0f) {
            return 0.0f;
        }
        return (((1.0f - f3) * (f2 * f4)) + (f * f3)) / f5;
    }

    @Stable
    /* renamed from: compositeOver--OWjLjI, reason: not valid java name */
    public static final long m553compositeOverOWjLjI(long j, long j2) {
        float f;
        float f2;
        long m504convertvNxB06k = Color.m504convertvNxB06k(j, Color.m511getColorSpaceimpl(j2));
        float m509getAlphaimpl = Color.m509getAlphaimpl(j2);
        float m509getAlphaimpl2 = Color.m509getAlphaimpl(m504convertvNxB06k);
        float f3 = 1.0f - m509getAlphaimpl2;
        float f4 = (m509getAlphaimpl * f3) + m509getAlphaimpl2;
        float m513getRedimpl = Color.m513getRedimpl(m504convertvNxB06k);
        float m513getRedimpl2 = Color.m513getRedimpl(j2);
        float f5 = 0.0f;
        if (f4 == 0.0f) {
            f = 0.0f;
        } else {
            f = (((m513getRedimpl2 * m509getAlphaimpl) * f3) + (m513getRedimpl * m509getAlphaimpl2)) / f4;
        }
        float m512getGreenimpl = Color.m512getGreenimpl(m504convertvNxB06k);
        float m512getGreenimpl2 = Color.m512getGreenimpl(j2);
        if (f4 == 0.0f) {
            f2 = 0.0f;
        } else {
            f2 = (((m512getGreenimpl2 * m509getAlphaimpl) * f3) + (m512getGreenimpl * m509getAlphaimpl2)) / f4;
        }
        float m510getBlueimpl = Color.m510getBlueimpl(m504convertvNxB06k);
        float m510getBlueimpl2 = Color.m510getBlueimpl(j2);
        if (f4 != 0.0f) {
            f5 = (((m510getBlueimpl2 * m509getAlphaimpl) * f3) + (m510getBlueimpl * m509getAlphaimpl2)) / f4;
        }
        return Color(f, f2, f5, f4, Color.m511getColorSpaceimpl(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getComponents-8_81llA, reason: not valid java name */
    public static final float[] m554getComponents8_81llA(long j) {
        return new float[]{Color.m513getRedimpl(j), Color.m512getGreenimpl(j), Color.m510getBlueimpl(j), Color.m509getAlphaimpl(j)};
    }

    /* renamed from: isSpecified-8_81llA, reason: not valid java name */
    public static final boolean m555isSpecified8_81llA(long j) {
        return j != Color.INSTANCE.m543getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isSpecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m556isSpecified8_81llA$annotations(long j) {
    }

    /* renamed from: isUnspecified-8_81llA, reason: not valid java name */
    public static final boolean m557isUnspecified8_81llA(long j) {
        return j == Color.INSTANCE.m543getUnspecified0d7_KjU();
    }

    @Stable
    /* renamed from: isUnspecified-8_81llA$annotations, reason: not valid java name */
    public static /* synthetic */ void m558isUnspecified8_81llA$annotations(long j) {
    }

    @Stable
    /* renamed from: lerp-jxsXWHM, reason: not valid java name */
    public static final long m559lerpjxsXWHM(long j, long j2, float f) {
        ColorSpace oklab$ui_graphics_release = ColorSpaces.INSTANCE.getOklab$ui_graphics_release();
        long m504convertvNxB06k = Color.m504convertvNxB06k(j, oklab$ui_graphics_release);
        long m504convertvNxB06k2 = Color.m504convertvNxB06k(j2, oklab$ui_graphics_release);
        float m509getAlphaimpl = Color.m509getAlphaimpl(m504convertvNxB06k);
        float m513getRedimpl = Color.m513getRedimpl(m504convertvNxB06k);
        float m512getGreenimpl = Color.m512getGreenimpl(m504convertvNxB06k);
        float m510getBlueimpl = Color.m510getBlueimpl(m504convertvNxB06k);
        float m509getAlphaimpl2 = Color.m509getAlphaimpl(m504convertvNxB06k2);
        float m513getRedimpl2 = Color.m513getRedimpl(m504convertvNxB06k2);
        float m512getGreenimpl2 = Color.m512getGreenimpl(m504convertvNxB06k2);
        float m510getBlueimpl2 = Color.m510getBlueimpl(m504convertvNxB06k2);
        return Color.m504convertvNxB06k(Color(MathHelpersKt.lerp(m513getRedimpl, m513getRedimpl2, f), MathHelpersKt.lerp(m512getGreenimpl, m512getGreenimpl2, f), MathHelpersKt.lerp(m510getBlueimpl, m510getBlueimpl2, f), MathHelpersKt.lerp(m509getAlphaimpl, m509getAlphaimpl2, f), oklab$ui_graphics_release), Color.m511getColorSpaceimpl(j2));
    }

    @Stable
    /* renamed from: luminance-8_81llA, reason: not valid java name */
    public static final float m560luminance8_81llA(long j) {
        ColorSpace m511getColorSpaceimpl = Color.m511getColorSpaceimpl(j);
        if (!ColorModel.m807equalsimpl0(m511getColorSpaceimpl.getModel(), ColorModel.INSTANCE.m814getRgbxdoWZVw())) {
            throw new IllegalArgumentException(Intrinsics.stringPlus("The specified color must be encoded in an RGB color space. The supplied color space is ", ColorModel.m810toStringimpl(m511getColorSpaceimpl.getModel())).toString());
        }
        Function1<Double, Double> eotf = ((Rgb) m511getColorSpaceimpl).getEotf();
        double doubleValue = eotf.invoke(Double.valueOf(Color.m513getRedimpl(j))).doubleValue();
        return saturate((float) ((eotf.invoke(Double.valueOf(Color.m510getBlueimpl(j))).doubleValue() * 0.0722d) + (eotf.invoke(Double.valueOf(Color.m512getGreenimpl(j))).doubleValue() * 0.7152d) + (doubleValue * 0.2126d)));
    }

    private static final float saturate(float f) {
        if (f <= 0.0f) {
            return 0.0f;
        }
        if (f >= 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: takeOrElse-DxMtmZc, reason: not valid java name */
    public static final long m561takeOrElseDxMtmZc(long j, Function0<Color> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return j != Color.INSTANCE.m543getUnspecified0d7_KjU() ? j : block.invoke().m517unboximpl();
    }

    @Stable
    /* renamed from: toArgb-8_81llA, reason: not valid java name */
    public static final int m562toArgb8_81llA(long j) {
        ColorSpace m511getColorSpaceimpl = Color.m511getColorSpaceimpl(j);
        if (m511getColorSpaceimpl.getIsSrgb()) {
            return (int) ULong.m1890constructorimpl(j >>> 32);
        }
        float[] m554getComponents8_81llA = m554getComponents8_81llA(j);
        ColorSpaceKt.m818connectYBCOT_4$default(m511getColorSpaceimpl, null, 0, 3, null).transform(m554getComponents8_81llA);
        return ((int) ((m554getComponents8_81llA[2] * 255.0f) + 0.5f)) | (((int) ((m554getComponents8_81llA[3] * 255.0f) + 0.5f)) << 24) | (((int) ((m554getComponents8_81llA[0] * 255.0f) + 0.5f)) << 16) | (((int) ((m554getComponents8_81llA[1] * 255.0f) + 0.5f)) << 8);
    }

    public static /* synthetic */ long Color$default(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 8) != 0) {
            i4 = 255;
        }
        return Color(i, i2, i3, i4);
    }

    @Stable
    public static final long Color(int i) {
        return Color.m503constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(i) << 32));
    }

    @Stable
    public static final long Color(long j) {
        return Color.m503constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(ULong.m1890constructorimpl(j) & KeyboardMap.kValueMask) << 32));
    }

    @Stable
    public static final long Color(int i, int i2, int i3, int i4) {
        return Color(((i & 255) << 16) | ((i4 & 255) << 24) | ((i2 & 255) << 8) | (i3 & 255));
    }
}
