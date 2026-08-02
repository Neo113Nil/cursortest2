package org.apache.commons.imaging.formats.jpeg.decoder;

/* loaded from: classes17.dex */
final class Dct {
    private static final float A1;
    private static final float A2;
    private static final float A3;
    private static final float A4;
    private static final float A5;
    private static final float C2;
    private static final float C4;
    private static final float C6;
    private static final float[] DCT_SCALING_FACTORS = {(float) (0.5d / java.lang.Math.sqrt(2.0d)), (float) (0.25d / java.lang.Math.cos(0.19634954084936207d)), (float) (0.25d / java.lang.Math.cos(0.39269908169872414d)), (float) (0.25d / java.lang.Math.cos(0.5890486225480862d)), (float) (0.25d / java.lang.Math.cos(0.7853981633974483d)), (float) (0.25d / java.lang.Math.cos(0.9817477042468103d)), (float) (0.25d / java.lang.Math.cos(1.1780972450961724d)), (float) (0.25d / java.lang.Math.cos(1.3744467859455345d))};
    private static final float[] IDCT_SCALING_FACTORS = {(float) ((8.0d / java.lang.Math.sqrt(2.0d)) * 0.0625d), (float) ((java.lang.Math.cos(0.19634954084936207d) * 4.0d) * 0.125d), (float) ((java.lang.Math.cos(0.39269908169872414d) * 4.0d) * 0.125d), (float) ((java.lang.Math.cos(0.5890486225480862d) * 4.0d) * 0.125d), (float) ((java.lang.Math.cos(0.7853981633974483d) * 4.0d) * 0.125d), (float) ((java.lang.Math.cos(0.9817477042468103d) * 4.0d) * 0.125d), (float) ((java.lang.Math.cos(1.1780972450961724d) * 4.0d) * 0.125d), (float) ((java.lang.Math.cos(1.3744467859455345d) * 4.0d) * 0.125d)};
    private static final float Q;
    private static final float R;

    static {
        float cos = (float) java.lang.Math.cos(0.7853981633974483d);
        A1 = cos;
        A2 = (float) (java.lang.Math.cos(0.39269908169872414d) - java.lang.Math.cos(1.1780972450961724d));
        A3 = cos;
        A4 = (float) (java.lang.Math.cos(0.39269908169872414d) + java.lang.Math.cos(1.1780972450961724d));
        A5 = (float) java.lang.Math.cos(1.1780972450961724d);
        float cos2 = (float) (java.lang.Math.cos(0.39269908169872414d) * 2.0d);
        C2 = cos2;
        C4 = (float) (java.lang.Math.cos(0.7853981633974483d) * 2.0d);
        float cos3 = (float) (java.lang.Math.cos(1.1780972450961724d) * 2.0d);
        C6 = cos3;
        Q = cos2 - cos3;
        R = cos2 + cos3;
    }

    private Dct() {
    }

    public static void scaleQuantizationVector(float[] fArr) {
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * DCT_SCALING_FACTORS[i];
        }
    }

    public static void scaleDequantizationVector(float[] fArr) {
        for (int i = 0; i < 8; i++) {
            fArr[i] = fArr[i] * IDCT_SCALING_FACTORS[i];
        }
    }

    public static void scaleQuantizationMatrix(float[] fArr) {
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = (i * 8) + i2;
                float f = fArr[i3];
                float[] fArr2 = DCT_SCALING_FACTORS;
                fArr[i3] = f * fArr2[i] * fArr2[i2];
            }
        }
    }

    public static void scaleDequantizationMatrix(float[] fArr) {
        for (int i = 0; i < 8; i++) {
            for (int i2 = 0; i2 < 8; i2++) {
                int i3 = (i * 8) + i2;
                float f = fArr[i3];
                float[] fArr2 = IDCT_SCALING_FACTORS;
                fArr[i3] = f * fArr2[i] * fArr2[i2];
            }
        }
    }

    public static void forwardDCT8(float[] fArr) {
        float f = fArr[0];
        float f2 = fArr[7];
        float f3 = f + f2;
        float f4 = fArr[1];
        float f5 = fArr[6];
        float f6 = f4 + f5;
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = f7 + f8;
        float f10 = fArr[3];
        float f11 = fArr[4];
        float f12 = f10 + f11;
        float f13 = f7 - f8;
        float f14 = f4 - f5;
        float f15 = f - f2;
        float f16 = f3 + f12;
        float f17 = f6 + f9;
        float f18 = f3 - f12;
        float f19 = (f10 - f11) + f13;
        float f20 = f14 + f15;
        float f21 = ((f6 - f9) + f18) * A1;
        float f22 = (f20 - f19) * A5;
        float f23 = (f19 * A2) - f22;
        float f24 = (f13 + f14) * A3;
        float f25 = (f20 * A4) - f22;
        float f26 = f15 + f24;
        float f27 = f15 - f24;
        fArr[0] = f16 + f17;
        fArr[4] = f16 - f17;
        fArr[2] = f18 + f21;
        fArr[6] = f18 - f21;
        fArr[5] = f27 + f23;
        fArr[1] = f26 + f25;
        fArr[7] = f26 - f25;
        fArr[3] = f27 - f23;
    }

    public static void forwardDCT8x8(float[] fArr) {
        for (int i = 0; i < 8; i++) {
            int i2 = i * 8;
            float f = fArr[i2];
            int i3 = i2 + 7;
            float f2 = fArr[i3];
            float f3 = f + f2;
            int i4 = i2 + 1;
            float f4 = fArr[i4];
            int i5 = i2 + 6;
            float f5 = fArr[i5];
            float f6 = f4 + f5;
            int i6 = i2 + 2;
            float f7 = fArr[i6];
            int i7 = i2 + 5;
            float f8 = fArr[i7];
            float f9 = f7 + f8;
            int i8 = i2 + 3;
            float f10 = fArr[i8];
            int i9 = i2 + 4;
            float f11 = fArr[i9];
            float f12 = f10 + f11;
            float f13 = f7 - f8;
            float f14 = f4 - f5;
            float f15 = f - f2;
            float f16 = f3 + f12;
            float f17 = f6 + f9;
            float f18 = f3 - f12;
            float f19 = (f10 - f11) + f13;
            float f20 = f14 + f15;
            float f21 = ((f6 - f9) + f18) * A1;
            float f22 = (f20 - f19) * A5;
            float f23 = (f19 * A2) - f22;
            float f24 = (f13 + f14) * A3;
            float f25 = (f20 * A4) - f22;
            float f26 = f15 + f24;
            float f27 = f15 - f24;
            fArr[i2] = f16 + f17;
            fArr[i9] = f16 - f17;
            fArr[i6] = f18 + f21;
            fArr[i5] = f18 - f21;
            fArr[i7] = f27 + f23;
            fArr[i4] = f26 + f25;
            fArr[i3] = f26 - f25;
            fArr[i8] = f27 - f23;
        }
        for (int i10 = 0; i10 < 8; i10++) {
            float f28 = fArr[i10];
            int i11 = i10 + 56;
            float f29 = fArr[i11];
            float f30 = f28 + f29;
            int i12 = i10 + 8;
            float f31 = fArr[i12];
            int i13 = i10 + 48;
            float f32 = fArr[i13];
            float f33 = f31 + f32;
            int i14 = i10 + 16;
            float f34 = fArr[i14];
            int i15 = i10 + 40;
            float f35 = fArr[i15];
            float f36 = f34 + f35;
            int i16 = i10 + 24;
            float f37 = fArr[i16];
            int i17 = i10 + 32;
            float f38 = fArr[i17];
            float f39 = f37 + f38;
            float f40 = f34 - f35;
            float f41 = f31 - f32;
            float f42 = f28 - f29;
            float f43 = f30 + f39;
            float f44 = f33 + f36;
            float f45 = f30 - f39;
            float f46 = (f37 - f38) + f40;
            float f47 = f41 + f42;
            float f48 = ((f33 - f36) + f45) * A1;
            float f49 = (f47 - f46) * A5;
            float f50 = (f46 * A2) - f49;
            float f51 = (f40 + f41) * A3;
            float f52 = (f47 * A4) - f49;
            float f53 = f42 + f51;
            float f54 = f42 - f51;
            fArr[i10] = f43 + f44;
            fArr[i17] = f43 - f44;
            fArr[i14] = f45 + f48;
            fArr[i13] = f45 - f48;
            fArr[i15] = f54 + f50;
            fArr[i12] = f53 + f52;
            fArr[i11] = f53 - f52;
            fArr[i16] = f54 - f50;
        }
    }

    public static void inverseDCT8(float[] fArr) {
        float f = fArr[2];
        float f2 = fArr[6];
        float f3 = f + f2;
        float f4 = fArr[5];
        float f5 = fArr[3];
        float f6 = f4 - f5;
        float f7 = fArr[1];
        float f8 = fArr[7];
        float f9 = f7 + f8;
        float f10 = f5 + f4;
        float f11 = f7 - f8;
        float f12 = f9 + f10;
        float f13 = C6 * (f6 + f11);
        float f14 = Q;
        float f15 = R;
        float f16 = C4;
        float f17 = ((f15 * f11) - f13) - f12;
        float f18 = f17 - ((f9 - f10) * f16);
        float f19 = fArr[0];
        float f20 = fArr[4];
        float f21 = f19 - f20;
        float f22 = ((f - f2) * f16) - f3;
        float f23 = f19 + f20;
        float f24 = f21 + f22;
        float f25 = f23 + f3;
        float f26 = f21 - f22;
        float f27 = f23 - f3;
        float f28 = (f14 * f6) + f13 + f18;
        fArr[0] = f25 + f12;
        fArr[1] = f24 + f17;
        fArr[2] = f26 - f18;
        fArr[3] = f27 + f28;
        fArr[4] = f27 - f28;
        fArr[5] = f26 + f18;
        fArr[6] = f24 - f17;
        fArr[7] = f25 - f12;
    }

    public static void inverseDCT8x8(float[] fArr) {
        for (int i = 0; i < 8; i++) {
            int i2 = i * 8;
            int i3 = i2 + 2;
            float f = fArr[i3];
            int i4 = i2 + 6;
            float f2 = fArr[i4];
            float f3 = f + f2;
            int i5 = i2 + 5;
            float f4 = fArr[i5];
            int i6 = i2 + 3;
            float f5 = fArr[i6];
            float f6 = f4 - f5;
            int i7 = i2 + 1;
            float f7 = fArr[i7];
            int i8 = i2 + 7;
            float f8 = fArr[i8];
            float f9 = f7 + f8;
            float f10 = f5 + f4;
            float f11 = f7 - f8;
            float f12 = f9 + f10;
            float f13 = C6 * (f6 + f11);
            float f14 = Q;
            float f15 = R;
            float f16 = C4;
            float f17 = ((f15 * f11) - f13) - f12;
            float f18 = f17 - ((f9 - f10) * f16);
            float f19 = fArr[i2];
            int i9 = i2 + 4;
            float f20 = fArr[i9];
            float f21 = f19 - f20;
            float f22 = ((f - f2) * f16) - f3;
            float f23 = f19 + f20;
            float f24 = f21 + f22;
            float f25 = f23 + f3;
            float f26 = f21 - f22;
            float f27 = f23 - f3;
            float f28 = (f14 * f6) + f13 + f18;
            fArr[i2] = f25 + f12;
            fArr[i7] = f24 + f17;
            fArr[i3] = f26 - f18;
            fArr[i6] = f27 + f28;
            fArr[i9] = f27 - f28;
            fArr[i5] = f26 + f18;
            fArr[i4] = f24 - f17;
            fArr[i8] = f25 - f12;
        }
        for (int i10 = 0; i10 < 8; i10++) {
            int i11 = i10 + 16;
            float f29 = fArr[i11];
            int i12 = i10 + 48;
            float f30 = fArr[i12];
            float f31 = f29 + f30;
            int i13 = i10 + 40;
            float f32 = fArr[i13];
            int i14 = i10 + 24;
            float f33 = fArr[i14];
            float f34 = f32 - f33;
            int i15 = i10 + 8;
            float f35 = fArr[i15];
            int i16 = i10 + 56;
            float f36 = fArr[i16];
            float f37 = f35 + f36;
            float f38 = f33 + f32;
            float f39 = f35 - f36;
            float f40 = f37 + f38;
            float f41 = C6 * (f34 + f39);
            float f42 = Q;
            float f43 = R;
            float f44 = C4;
            float f45 = ((f43 * f39) - f41) - f40;
            float f46 = f45 - ((f37 - f38) * f44);
            float f47 = fArr[i10];
            int i17 = i10 + 32;
            float f48 = fArr[i17];
            float f49 = f47 - f48;
            float f50 = ((f29 - f30) * f44) - f31;
            float f51 = f47 + f48;
            float f52 = f49 + f50;
            float f53 = f51 + f31;
            float f54 = f49 - f50;
            float f55 = f51 - f31;
            float f56 = (f42 * f34) + f41 + f46;
            fArr[i10] = f53 + f40;
            fArr[i15] = f52 + f45;
            fArr[i11] = f54 - f46;
            fArr[i14] = f55 + f56;
            fArr[i17] = f55 - f56;
            fArr[i13] = f54 + f46;
            fArr[i12] = f52 - f45;
            fArr[i16] = f53 - f40;
        }
    }
}
