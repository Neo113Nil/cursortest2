package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Oklab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "getMinValue", "(I)F", "getMaxValue", "", "v", "toXyz", "([F)[F", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toZ$ui_graphics", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Oklab extends androidx.compose.ui.graphics.colorspace.ColorSpace {
    public static final int $stable = 0;
    private static final float[] Camera2StreamConfigurationMap;
    private static final float[] getHighSpeedVideoFpsRanges;
    private static final float[] getHighSpeedVideoFpsRangesFor;
    private static final float[] getHighSpeedVideoSizes;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int component) {
        return component == 0 ? 1.0f : 0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int component) {
        return component == 0 ? 0.0f : -0.5f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public final boolean getIsWideGamut() {
        return true;
    }

    public Oklab(java.lang.String str, int i) {
        super(str, androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6401getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] v) {
        float f = v[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        v[0] = f;
        float f2 = v[1];
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        v[1] = f2;
        float f3 = v[2];
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        v[2] = f4 <= 0.5f ? f4 : 0.5f;
        androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(Camera2StreamConfigurationMap, v);
        float f5 = v[0];
        v[0] = f5 * f5 * f5;
        float f6 = v[1];
        v[1] = f6 * f6 * f6;
        float f7 = v[2];
        v[2] = f7 * f7 * f7;
        androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(getHighSpeedVideoSizes, v);
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = Camera2StreamConfigurationMap;
        float f2 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f);
        float f3 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f);
        float f4 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f);
        float f5 = f2 * f2 * f2;
        float f6 = f3 * f3 * f3;
        float f7 = f4 * f4 * f4;
        float[] fArr2 = getHighSpeedVideoSizes;
        float f8 = fArr2[0];
        float f9 = fArr2[3];
        float f10 = fArr2[6];
        return (java.lang.Float.floatToRawIntBits((fArr2[1] * f5) + (fArr2[4] * f6) + (fArr2[7] * f7)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(((f8 * f5) + (f9 * f6)) + (f10 * f7)) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 1.0f) {
            v0 = 1.0f;
        }
        if (v1 < -0.5f) {
            v1 = -0.5f;
        }
        if (v1 > 0.5f) {
            v1 = 0.5f;
        }
        if (v2 < -0.5f) {
            v2 = -0.5f;
        }
        float f = v2 <= 0.5f ? v2 : 0.5f;
        float[] fArr = Camera2StreamConfigurationMap;
        float f2 = (fArr[0] * v0) + (fArr[3] * v1) + (fArr[6] * f);
        float f3 = (fArr[1] * v0) + (fArr[4] * v1) + (fArr[7] * f);
        float f4 = (fArr[2] * v0) + (fArr[5] * v1) + (fArr[8] * f);
        float[] fArr2 = getHighSpeedVideoSizes;
        return (fArr2[2] * f2 * f2 * f2) + (fArr2[5] * f3 * f3 * f3) + (fArr2[8] * f4 * f4 * f4);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public final long mo6405xyzaToColorJlNiLsg$ui_graphics(float x, float y, float z, float a2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        float[] fArr = getHighSpeedVideoFpsRangesFor;
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float fastCbrt = androidx.compose.ui.util.MathHelpersKt.fastCbrt((f * x) + (f2 * y) + (f3 * z));
        float fastCbrt2 = androidx.compose.ui.util.MathHelpersKt.fastCbrt((f4 * x) + (f5 * y) + (f6 * z));
        float fastCbrt3 = androidx.compose.ui.util.MathHelpersKt.fastCbrt((f7 * x) + (f8 * y) + (f9 * z));
        float[] fArr2 = getHighSpeedVideoFpsRanges;
        return androidx.compose.ui.graphics.ColorKt.Color((fArr2[0] * fastCbrt) + (fArr2[3] * fastCbrt2) + (fArr2[6] * fastCbrt3), (fArr2[1] * fastCbrt) + (fArr2[4] * fastCbrt2) + (fArr2[7] * fastCbrt3), (fArr2[2] * fastCbrt) + (fArr2[5] * fastCbrt2) + (fArr2[8] * fastCbrt3), a2, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] v) {
        androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(getHighSpeedVideoFpsRangesFor, v);
        v[0] = androidx.compose.ui.util.MathHelpersKt.fastCbrt(v[0]);
        v[1] = androidx.compose.ui.util.MathHelpersKt.fastCbrt(v[1]);
        v[2] = androidx.compose.ui.util.MathHelpersKt.fastCbrt(v[2]);
        androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3Float3(getHighSpeedVideoFpsRanges, v);
        return v;
    }

    static {
        float[] mul3x3 = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.mul3x3(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, androidx.compose.ui.graphics.colorspace.ColorSpaceKt.chromaticAdaptation(androidx.compose.ui.graphics.colorspace.Adaptation.INSTANCE.getBradford().getTransform(), androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50().toXyz$ui_graphics(), androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD65().toXyz$ui_graphics()));
        getHighSpeedVideoFpsRangesFor = mul3x3;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        getHighSpeedVideoFpsRanges = fArr;
        getHighSpeedVideoSizes = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.inverse3x3(mul3x3);
        Camera2StreamConfigurationMap = androidx.compose.ui.graphics.colorspace.ColorSpaceKt.inverse3x3(fArr);
    }
}
