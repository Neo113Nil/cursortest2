package i0;

import h0.C1987a;
import java.util.Arrays;
import o4.AbstractC2228f;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f17303a;

    public static float[] a() {
        return new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    }

    public static final long b(long j5, float[] fArr) {
        if (fArr.length < 16) {
            return j5;
        }
        float f = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[7];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        float intBitsToFloat = Float.intBitsToFloat((int) (j5 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j5 & 4294967295L));
        float f13 = 1 / (((f9 * intBitsToFloat2) + (f6 * intBitsToFloat)) + f12);
        if ((Float.floatToRawIntBits(f13) & Integer.MAX_VALUE) >= 2139095040) {
            f13 = 0.0f;
        }
        float f14 = f8 * intBitsToFloat2;
        return (Float.floatToRawIntBits((((f7 * intBitsToFloat2) + (f * intBitsToFloat)) + f10) * f13) << 32) | (Float.floatToRawIntBits((f14 + (f5 * intBitsToFloat) + f11) * f13) & 4294967295L);
    }

    public static final void c(float[] fArr, C1987a c1987a) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[3];
        float f7 = fArr[4];
        float f8 = fArr[5];
        float f9 = fArr[7];
        float f10 = fArr[12];
        float f11 = fArr[13];
        float f12 = fArr[15];
        float f13 = c1987a.f17187a;
        float f14 = c1987a.f17188b;
        float f15 = c1987a.f17189c;
        float f16 = c1987a.f17190d;
        float f17 = f6 * f13;
        float f18 = f9 * f14;
        float f19 = 1.0f / ((f17 + f18) + f12);
        if ((Float.floatToRawIntBits(f19) & Integer.MAX_VALUE) >= 2139095040) {
            f19 = 0.0f;
        }
        float f20 = f * f13;
        float f21 = f7 * f14;
        float f22 = (f20 + f21 + f10) * f19;
        float f23 = f13 * f5;
        float f24 = f14 * f8;
        float f25 = (f23 + f24 + f11) * f19;
        float f26 = f9 * f16;
        float f27 = 1.0f / ((f17 + f26) + f12);
        if ((Float.floatToRawIntBits(f27) & Integer.MAX_VALUE) >= 2139095040) {
            f27 = 0.0f;
        }
        float f28 = f7 * f16;
        float f29 = (f20 + f28 + f10) * f27;
        float f30 = f8 * f16;
        float f31 = (f23 + f30 + f11) * f27;
        float f32 = f6 * f15;
        float f33 = 1.0f / ((f18 + f32) + f12);
        if ((Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) >= 2139095040) {
            f33 = 0.0f;
        }
        float f34 = f * f15;
        float f35 = (f34 + f21 + f10) * f33;
        float f36 = f15 * f5;
        float f37 = (f24 + f36 + f11) * f33;
        float f38 = 1.0f / ((f32 + f26) + f12);
        float f39 = (Float.floatToRawIntBits(f38) & Integer.MAX_VALUE) < 2139095040 ? f38 : 0.0f;
        float f40 = (f34 + f28 + f10) * f39;
        float f41 = (f36 + f30 + f11) * f39;
        c1987a.f17187a = Math.min(f22, Math.min(f29, Math.min(f35, f40)));
        c1987a.f17188b = Math.min(f25, Math.min(f31, Math.min(f37, f41)));
        c1987a.f17189c = Math.max(f22, Math.max(f29, Math.max(f35, f40)));
        c1987a.f17190d = Math.max(f25, Math.max(f31, Math.max(f37, f41)));
    }

    public static final void d(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void e(float[] fArr, float[] fArr2) {
        if (fArr.length >= 16 && fArr2.length >= 16) {
            float f = fArr[0];
            float f5 = fArr2[0];
            float f6 = fArr[1];
            float f7 = fArr2[4];
            float f8 = fArr[2];
            float f9 = fArr2[8];
            float f10 = f8 * f9;
            float f11 = fArr[3];
            float f12 = fArr2[12];
            float f13 = f11 * f12;
            float f14 = f13 + f10 + (f6 * f7) + (f * f5);
            float f15 = fArr2[1];
            float f16 = fArr2[5];
            float f17 = fArr2[9];
            float f18 = f8 * f17;
            float f19 = fArr2[13];
            float f20 = f11 * f19;
            float f21 = f20 + f18 + (f6 * f16) + (f * f15);
            float f22 = fArr2[2];
            float f23 = fArr2[6];
            float f24 = fArr2[10];
            float f25 = f8 * f24;
            float f26 = fArr2[14];
            float f27 = f11 * f26;
            float f28 = f27 + f25 + (f6 * f23) + (f * f22);
            float f29 = fArr2[3];
            float f30 = fArr2[7];
            float f31 = fArr2[11];
            float f32 = f8 * f31;
            float f33 = fArr2[15];
            float f34 = f11 * f33;
            float f35 = f34 + f32 + (f6 * f30) + (f * f29);
            float f36 = fArr[4];
            float f37 = fArr[5];
            float f38 = fArr[6];
            float f39 = (f38 * f9) + (f37 * f7) + (f36 * f5);
            float f40 = fArr[7];
            float f41 = (f40 * f12) + f39;
            float f42 = (f40 * f19) + (f38 * f17) + (f37 * f16) + (f36 * f15);
            float f43 = (f40 * f26) + (f38 * f24) + (f37 * f23) + (f36 * f22);
            float f44 = f38 * f31;
            float f45 = f40 * f33;
            float f46 = f45 + f44 + (f37 * f30) + (f36 * f29);
            float f47 = fArr[8];
            float f48 = fArr[9];
            float f49 = fArr[10];
            float f50 = (f49 * f9) + (f48 * f7) + (f47 * f5);
            float f51 = fArr[11];
            float f52 = (f51 * f12) + f50;
            float f53 = (f51 * f19) + (f49 * f17) + (f48 * f16) + (f47 * f15);
            float f54 = (f51 * f26) + (f49 * f24) + (f48 * f23) + (f47 * f22);
            float f55 = f49 * f31;
            float f56 = f51 * f33;
            float f57 = f56 + f55 + (f48 * f30) + (f47 * f29);
            float f58 = fArr[12];
            float f59 = fArr[13];
            float f60 = (f7 * f59) + (f5 * f58);
            float f61 = fArr[14];
            float f62 = (f9 * f61) + f60;
            float f63 = fArr[15];
            float f64 = (f12 * f63) + f62;
            float f65 = f17 * f61;
            float f66 = f19 * f63;
            float f67 = f66 + f65 + (f16 * f59) + (f15 * f58);
            float f68 = f24 * f61;
            float f69 = f26 * f63;
            float f70 = f69 + f68 + (f23 * f59) + (f22 * f58);
            float f71 = f61 * f31;
            float f72 = f63 * f33;
            fArr[0] = f14;
            fArr[1] = f21;
            fArr[2] = f28;
            fArr[3] = f35;
            fArr[4] = f41;
            fArr[5] = f42;
            fArr[6] = f43;
            fArr[7] = f46;
            fArr[8] = f52;
            fArr[9] = f53;
            fArr[10] = f54;
            fArr[11] = f57;
            fArr[12] = f64;
            fArr[13] = f67;
            fArr[14] = f70;
            fArr[15] = f72 + f71 + (f59 * f30) + (f58 * f29);
        }
    }

    public static final void f(float[] fArr, float f, float f5) {
        if (fArr.length < 16) {
            return;
        }
        float f6 = (fArr[8] * 0.0f) + (fArr[4] * f5) + (fArr[0] * f) + fArr[12];
        float f7 = (fArr[9] * 0.0f) + (fArr[5] * f5) + (fArr[1] * f) + fArr[13];
        float f8 = (fArr[10] * 0.0f) + (fArr[6] * f5) + (fArr[2] * f) + fArr[14];
        float f9 = (fArr[11] * 0.0f) + (fArr[7] * f5) + (fArr[3] * f) + fArr[15];
        fArr[12] = f6;
        fArr[13] = f7;
        fArr[14] = f8;
        fArr[15] = f9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof z) {
            return kotlin.jvm.internal.l.a(this.f17303a, ((z) obj).f17303a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f17303a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n            |");
        float[] fArr = this.f17303a;
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return AbstractC2228f.o0(sb.toString());
    }
}
