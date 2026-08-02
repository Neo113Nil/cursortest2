package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Lab;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "getMinValue", "(I)F", "getMaxValue", "", "v", "toXyz", "([F)[F", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toZ$ui_graphics", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Lab extends androidx.compose.ui.graphics.colorspace.ColorSpace {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int component) {
        return component == 0 ? 100.0f : 128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int component) {
        return component == 0 ? 0.0f : -128.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public final boolean getIsWideGamut() {
        return true;
    }

    public Lab(java.lang.String str, int i) {
        super(str, androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6401getLabxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] v) {
        float f = v[0];
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        v[0] = f;
        float f2 = v[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        v[1] = f2;
        float f3 = v[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        v[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f10 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f11 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        v[0] = f9 * androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0];
        v[1] = f10 * androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1];
        v[2] = f11 * androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v1 < -128.0f) {
            v1 = -128.0f;
        }
        if (v1 > 128.0f) {
            v1 = 128.0f;
        }
        float f = (v0 + 16.0f) / 116.0f;
        float f2 = (v1 * 0.002f) + f;
        float f3 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        return (java.lang.Float.floatToRawIntBits((f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f) * androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1]) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f3 * androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0]) << 32);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics(float v0, float v1, float v2) {
        if (v0 < 0.0f) {
            v0 = 0.0f;
        }
        if (v0 > 100.0f) {
            v0 = 100.0f;
        }
        if (v2 < -128.0f) {
            v2 = -128.0f;
        }
        if (v2 > 128.0f) {
            v2 = 128.0f;
        }
        float f = ((v0 + 16.0f) / 116.0f) - (v2 * 0.005f);
        return (f > 0.20689656f ? f * f * f : 0.12841855f * (f - 0.13793103f)) * androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public final long mo6405xyzaToColorJlNiLsg$ui_graphics(float x, float y, float z, float a2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        float f = x / androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0];
        float f2 = y / androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1];
        float f3 = z / androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
        float cbrt = f > 0.008856452f ? (float) java.lang.Math.cbrt(f) : (f * 7.787037f) + 0.13793103f;
        float cbrt2 = f2 > 0.008856452f ? (float) java.lang.Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float f4 = (116.0f * cbrt2) - 16.0f;
        float f5 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f3 > 0.008856452f ? (float) java.lang.Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        return androidx.compose.ui.graphics.ColorKt.Color(f4, f5, cbrt3 <= 128.0f ? cbrt3 : 128.0f, a2, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] v) {
        float f = v[0] / androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[0];
        float f2 = v[1] / androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[1];
        float f3 = v[2] / androidx.compose.ui.graphics.colorspace.Illuminant.INSTANCE.getD50Xyz$ui_graphics()[2];
        float cbrt = f > 0.008856452f ? (float) java.lang.Math.cbrt(f) : (f * 7.787037f) + 0.13793103f;
        float cbrt2 = f2 > 0.008856452f ? (float) java.lang.Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float f4 = (116.0f * cbrt2) - 16.0f;
        float f5 = (cbrt - cbrt2) * 500.0f;
        float cbrt3 = (cbrt2 - (f3 > 0.008856452f ? (float) java.lang.Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        v[0] = f4;
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        v[1] = f5;
        if (cbrt3 < -128.0f) {
            cbrt3 = -128.0f;
        }
        v[2] = cbrt3 <= 128.0f ? cbrt3 : 128.0f;
        return v;
    }
}
