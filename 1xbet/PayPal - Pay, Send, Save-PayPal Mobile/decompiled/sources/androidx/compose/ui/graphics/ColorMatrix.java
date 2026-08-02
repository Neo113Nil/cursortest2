package androidx.compose.ui.graphics;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\tH\u0086\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ-\u0010%\u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\t¢\u0006\u0004\b#\u0010$J\u0015\u0010(\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010\u001dJ\u0015\u0010*\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b)\u0010\u001dJ\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\t¢\u0006\u0004\b+\u0010\u001dJ\r\u0010.\u001a\u00020\u000e¢\u0006\u0004\b-\u0010\u0013J\r\u00100\u001a\u00020\u000e¢\u0006\u0004\b/\u0010\u0013J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b5\u00106J\u0010\u00108\u001a\u000207HÖ\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010<\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/graphics/ColorMatrix;", "", "", "values", "constructor-impl", "([F)[F", "", "row", "column", "", "get-impl", "([FII)F", "get", "v", "", "set-impl", "([FIIF)V", "set", "reset-impl", "([F)V", "reset", "src", "set-jHG-Opc", "([F[F)V", "colorMatrix", "timesAssign-jHG-Opc", "timesAssign", androidx.core.text.util.LocalePreferences.FirstDayOfWeek.SATURDAY, "setToSaturation-impl", "([FF)V", "setToSaturation", "redScale", "greenScale", "blueScale", "alphaScale", "setToScale-impl", "([FFFFF)V", "setToScale", "degrees", "setToRotateRed-impl", "setToRotateRed", "setToRotateGreen-impl", "setToRotateGreen", "setToRotateBlue-impl", "setToRotateBlue", "convertRgbToYuv-impl", "convertRgbToYuv", "convertYuvToRgb-impl", "convertYuvToRgb", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "[F", "getValues", "()[F"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ColorMatrix {
    private final float[] values;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float[] m6051constructorimpl(float[] fArr) {
        return fArr;
    }

    private /* synthetic */ ColorMatrix(float[] fArr) {
        this.values = fArr;
    }

    public final float[] getValues() {
        return this.values;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ float[] m6052constructorimpl$default(float[] fArr, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
        }
        return m6051constructorimpl(fArr);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final float m6057getimpl(float[] fArr, int i, int i2) {
        return fArr[(i * 5) + i2];
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m6060setimpl(float[] fArr, int i, int i2, float f) {
        fArr[(i * 5) + i2] = f;
    }

    /* renamed from: set-jHG-Opc, reason: not valid java name */
    public static final void m6061setjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20 || fArr2.length < 20) {
            return;
        }
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[1];
        fArr[2] = fArr2[2];
        fArr[3] = fArr2[3];
        fArr[4] = fArr2[4];
        fArr[5] = fArr2[5];
        fArr[6] = fArr2[6];
        fArr[7] = fArr2[7];
        fArr[8] = fArr2[8];
        fArr[9] = fArr2[9];
        fArr[10] = fArr2[10];
        fArr[11] = fArr2[11];
        fArr[12] = fArr2[12];
        fArr[13] = fArr2[13];
        fArr[14] = fArr2[14];
        fArr[15] = fArr2[15];
        fArr[16] = fArr2[16];
        fArr[17] = fArr2[17];
        fArr[18] = fArr2[18];
        fArr[19] = fArr2[19];
    }

    /* renamed from: timesAssign-jHG-Opc, reason: not valid java name */
    public static final void m6067timesAssignjHGOpc(float[] fArr, float[] fArr2) {
        if (fArr.length < 20) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[5];
        float f5 = fArr[2];
        float f6 = fArr2[10];
        float f7 = fArr[3];
        float f8 = fArr2[15];
        float f9 = fArr2[1];
        float f10 = fArr2[6];
        float f11 = fArr2[11];
        float f12 = fArr2[16];
        float f13 = fArr2[2];
        float f14 = fArr2[7];
        float f15 = fArr2[12];
        float f16 = fArr2[17];
        float f17 = fArr2[3];
        float f18 = fArr2[8];
        float f19 = fArr2[13];
        float f20 = fArr2[18];
        float f21 = fArr2[4];
        float f22 = fArr2[9];
        float f23 = fArr2[14];
        float f24 = fArr2[19];
        float f25 = fArr[4];
        float f26 = fArr[5];
        float f27 = fArr[6];
        float f28 = fArr[7];
        float f29 = fArr[8];
        float f30 = fArr[9];
        float f31 = fArr[10];
        float f32 = fArr[11];
        float f33 = fArr[12];
        float f34 = fArr[13];
        float f35 = fArr[14];
        float f36 = fArr[15];
        float f37 = fArr[16];
        float f38 = fArr[17];
        float f39 = fArr[18];
        float f40 = fArr[19];
        fArr[0] = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
        fArr[1] = (f * f9) + (f3 * f10) + (f5 * f11) + (f7 * f12);
        fArr[2] = (f * f13) + (f3 * f14) + (f5 * f15) + (f7 * f16);
        fArr[3] = (f * f17) + (f3 * f18) + (f5 * f19) + (f7 * f20);
        fArr[4] = (f * f21) + (f3 * f22) + (f5 * f23) + (f7 * f24) + f25;
        fArr[5] = (f26 * f2) + (f27 * f4) + (f28 * f6) + (f29 * f8);
        fArr[6] = (f26 * f9) + (f27 * f10) + (f28 * f11) + (f29 * f12);
        fArr[7] = (f26 * f13) + (f27 * f14) + (f28 * f15) + (f29 * f16);
        fArr[8] = (f26 * f17) + (f27 * f18) + (f28 * f19) + (f29 * f20);
        fArr[9] = (f26 * f21) + (f27 * f22) + (f28 * f23) + (f29 * f24) + f30;
        fArr[10] = (f31 * f2) + (f32 * f4) + (f33 * f6) + (f34 * f8);
        fArr[11] = (f31 * f9) + (f32 * f10) + (f33 * f11) + (f34 * f12);
        fArr[12] = (f31 * f13) + (f32 * f14) + (f33 * f15) + (f34 * f16);
        fArr[13] = (f31 * f17) + (f32 * f18) + (f33 * f19) + (f34 * f20);
        fArr[14] = (f31 * f21) + (f32 * f22) + (f33 * f23) + (f34 * f24) + f35;
        fArr[15] = (f2 * f36) + (f4 * f37) + (f6 * f38) + (f8 * f39);
        fArr[16] = (f9 * f36) + (f10 * f37) + (f11 * f38) + (f12 * f39);
        fArr[17] = (f13 * f36) + (f14 * f37) + (f15 * f38) + (f16 * f39);
        fArr[18] = (f17 * f36) + (f18 * f37) + (f19 * f38) + (f20 * f39);
        fArr[19] = (f36 * f21) + (f37 * f22) + (f38 * f23) + (f39 * f24) + f40;
    }

    /* renamed from: setToSaturation-impl, reason: not valid java name */
    public static final void m6065setToSaturationimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = 1.0f - f;
        float f3 = 0.213f * f2;
        float f4 = 0.715f * f2;
        float f5 = f2 * 0.072f;
        fArr[0] = f3 + f;
        fArr[1] = f4;
        fArr[2] = f5;
        fArr[5] = f3;
        fArr[6] = f4 + f;
        fArr[7] = f5;
        fArr[10] = f3;
        fArr[11] = f4;
        fArr[12] = f5 + f;
    }

    /* renamed from: setToScale-impl, reason: not valid java name */
    public static final void m6066setToScaleimpl(float[] fArr, float f, float f2, float f3, float f4) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = f;
        fArr[6] = f2;
        fArr[12] = f3;
        fArr[18] = f4;
    }

    /* renamed from: setToRotateRed-impl, reason: not valid java name */
    public static final void m6064setToRotateRedimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) java.lang.Math.floor(r2 + 0.5f));
        float abs = java.lang.Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) java.lang.Math.floor(0.5f + f2));
        float abs2 = java.lang.Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[6] = f4;
        fArr[7] = f6;
        fArr[11] = -f6;
        fArr[12] = f4;
    }

    /* renamed from: setToRotateGreen-impl, reason: not valid java name */
    public static final void m6063setToRotateGreenimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) java.lang.Math.floor(r3 + 0.5f));
        float abs = java.lang.Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) java.lang.Math.floor(0.5f + f2));
        float abs2 = java.lang.Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[0] = f4;
        fArr[2] = -f6;
        fArr[10] = f6;
        fArr[12] = f4;
    }

    /* renamed from: setToRotateBlue-impl, reason: not valid java name */
    public static final void m6062setToRotateBlueimpl(float[] fArr, float f) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        float f2 = f * 0.0027777778f;
        float floor = (0.25f + f2) - ((float) java.lang.Math.floor(r3 + 0.5f));
        float abs = java.lang.Math.abs(floor) * 2.0f;
        float f3 = 1.0f - abs;
        float f4 = ((floor * 8.0f) * f3) / (1.25f - (abs * f3));
        float floor2 = f2 - ((float) java.lang.Math.floor(0.5f + f2));
        float abs2 = java.lang.Math.abs(floor2) * 2.0f;
        float f5 = 1.0f - abs2;
        float f6 = ((floor2 * 8.0f) * f5) / (1.25f - (abs2 * f5));
        fArr[0] = f4;
        fArr[1] = f6;
        fArr[5] = -f6;
        fArr[6] = f4;
    }

    /* renamed from: convertRgbToYuv-impl, reason: not valid java name */
    public static final void m6053convertRgbToYuvimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[0] = 0.299f;
        fArr[1] = 0.587f;
        fArr[2] = 0.114f;
        fArr[5] = -0.16874f;
        fArr[6] = -0.33126f;
        fArr[7] = 0.5f;
        fArr[10] = 0.5f;
        fArr[11] = -0.41869f;
        fArr[12] = -0.08131f;
    }

    /* renamed from: convertYuvToRgb-impl, reason: not valid java name */
    public static final void m6054convertYuvToRgbimpl(float[] fArr) {
        if (fArr.length < 20) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
        fArr[2] = 1.402f;
        fArr[5] = 1.0f;
        fArr[6] = -0.34414f;
        fArr[7] = -0.71414f;
        fArr[10] = 1.0f;
        fArr[11] = 1.772f;
        fArr[12] = 0.0f;
    }

    /* renamed from: reset-impl, reason: not valid java name */
    public static final void m6059resetimpl(float[] fArr) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 0.0f;
        fArr[6] = 1.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 0.0f;
        fArr[11] = 0.0f;
        fArr[12] = 1.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 0.0f;
        fArr[16] = 0.0f;
        fArr[17] = 0.0f;
        fArr[18] = 1.0f;
        fArr[19] = 0.0f;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float[] m6069unboximpl() {
        return this.values;
    }

    public final java.lang.String toString() {
        return m6068toStringimpl(this.values);
    }

    public final int hashCode() {
        return m6058hashCodeimpl(this.values);
    }

    public final boolean equals(java.lang.Object other) {
        return m6055equalsimpl(this.values, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6068toStringimpl(float[] fArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ColorMatrix(values=");
        sb.append(java.util.Arrays.toString(fArr));
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6058hashCodeimpl(float[] fArr) {
        return java.util.Arrays.hashCode(fArr);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6056equalsimpl0(float[] fArr, float[] fArr2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(fArr, fArr2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6055equalsimpl(float[] fArr, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.graphics.ColorMatrix) && kotlin.jvm.internal.Intrinsics.areEqual(fArr, ((androidx.compose.ui.graphics.ColorMatrix) obj).m6069unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.graphics.ColorMatrix m6050boximpl(float[] fArr) {
        return new androidx.compose.ui.graphics.ColorMatrix(fArr);
    }
}
