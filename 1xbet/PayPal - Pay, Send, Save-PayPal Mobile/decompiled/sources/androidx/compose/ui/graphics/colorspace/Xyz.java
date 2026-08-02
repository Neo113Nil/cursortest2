package androidx.compose.ui.graphics.colorspace;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010!\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u0010R\u0014\u0010$\u001a\u00020#8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%"}, d2 = {"Landroidx/compose/ui/graphics/colorspace/Xyz;", "Landroidx/compose/ui/graphics/colorspace/ColorSpace;", "", "name", "", "id", "<init>", "(Ljava/lang/String;I)V", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "", "getMinValue", "(I)F", "getMaxValue", "", "v", "toXyz", "([F)[F", "v0", "v1", "v2", "", "toXy$ui_graphics", "(FFF)J", "toZ$ui_graphics", "(FFF)F", "x", "y", "z", "a", "colorSpace", "Landroidx/compose/ui/graphics/Color;", "xyzaToColor-JlNiLsg$ui_graphics", "(FFFFLandroidx/compose/ui/graphics/colorspace/ColorSpace;)J", "xyzaToColor", "fromXyz", "", "isWideGamut", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Xyz extends androidx.compose.ui.graphics.colorspace.ColorSpace {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMaxValue(int component) {
        return 2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float getMinValue(int component) {
        return -2.0f;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: isWideGamut */
    public final boolean getIsWideGamut() {
        return true;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float toZ$ui_graphics(float v0, float v1, float v2) {
        if (v2 < -2.0f) {
            v2 = -2.0f;
        }
        if (v2 > 2.0f) {
            return 2.0f;
        }
        return v2;
    }

    public Xyz(java.lang.String str, int i) {
        super(str, androidx.compose.ui.graphics.colorspace.ColorModel.INSTANCE.m6403getXyzxdoWZVw(), i, null);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] toXyz(float[] v) {
        float f = v[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        v[0] = f;
        float f2 = v[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        v[1] = f2;
        float f3 = v[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        v[2] = f4 <= 2.0f ? f4 : 2.0f;
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    /* renamed from: xyzaToColor-JlNiLsg$ui_graphics */
    public final long mo6405xyzaToColorJlNiLsg$ui_graphics(float x, float y, float z, float a2, androidx.compose.ui.graphics.colorspace.ColorSpace colorSpace) {
        if (x < -2.0f) {
            x = -2.0f;
        }
        if (x > 2.0f) {
            x = 2.0f;
        }
        if (y < -2.0f) {
            y = -2.0f;
        }
        if (y > 2.0f) {
            y = 2.0f;
        }
        if (z < -2.0f) {
            z = -2.0f;
        }
        return androidx.compose.ui.graphics.ColorKt.Color(x, y, z <= 2.0f ? z : 2.0f, a2, colorSpace);
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final float[] fromXyz(float[] v) {
        float f = v[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        v[0] = f;
        float f2 = v[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        v[1] = f2;
        float f3 = v[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        v[2] = f4 <= 2.0f ? f4 : 2.0f;
        return v;
    }

    @Override // androidx.compose.ui.graphics.colorspace.ColorSpace
    public final long toXy$ui_graphics(float v0, float v1, float v2) {
        if (v0 < -2.0f) {
            v0 = -2.0f;
        }
        if (v0 > 2.0f) {
            v0 = 2.0f;
        }
        if (v1 < -2.0f) {
            v1 = -2.0f;
        }
        return (java.lang.Float.floatToRawIntBits(v0) << 32) | (java.lang.Float.floatToRawIntBits(v1 <= 2.0f ? v1 : 2.0f) & 4294967295L);
    }
}
