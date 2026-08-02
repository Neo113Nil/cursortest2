package g1;

import android.graphics.Path;
import android.util.Log;

/* renamed from: g1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1969c {

    /* renamed from: a, reason: collision with root package name */
    public char f17077a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f17078b;

    public C1969c(char c5, float[] fArr) {
        this.f17077a = c5;
        this.f17078b = fArr;
    }

    public static void a(Path path, float f, float f5, float f6, float f7, float f8, float f9, float f10, boolean z3, boolean z5) {
        double d5;
        double d6;
        double radians = Math.toRadians(f10);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d7 = f;
        double d8 = f5;
        double d9 = f8;
        double d10 = ((d8 * sin) + (d7 * cos)) / d9;
        double d11 = f9;
        double d12 = ((d8 * cos) + ((-f) * sin)) / d11;
        double d13 = f7;
        double d14 = ((d13 * sin) + (f6 * cos)) / d9;
        double d15 = ((d13 * cos) + ((-f6) * sin)) / d11;
        double d16 = d10 - d14;
        double d17 = d12 - d15;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d12 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d20);
            float sqrt = (float) (Math.sqrt(d20) / 1.99999d);
            a(path, f, f5, f6, f7, f8 * sqrt, sqrt * f9, f10, z3, z5);
            return;
        }
        double sqrt2 = Math.sqrt(d21);
        double d22 = sqrt2 * d16;
        double d23 = sqrt2 * d17;
        if (z3 == z5) {
            d5 = d18 - d23;
            d6 = d19 + d22;
        } else {
            d5 = d18 + d23;
            d6 = d19 - d22;
        }
        double atan2 = Math.atan2(d12 - d6, d10 - d5);
        double atan22 = Math.atan2(d15 - d6, d14 - d5) - atan2;
        if (z5 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d5 * d9;
        double d25 = d6 * d11;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d28 = -d9;
        double d29 = d28 * cos2;
        double d30 = d11 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d11 * cos2;
        double d34 = atan22 / ceil;
        double d35 = (cos3 * d33) + (sin3 * d32);
        double d36 = d7;
        double d37 = d8;
        int i = 0;
        double d38 = atan2;
        while (i < ceil) {
            double d39 = d38 + d34;
            double sin4 = Math.sin(d39);
            double cos4 = Math.cos(d39);
            int i5 = ceil;
            double d40 = (((d9 * cos2) * cos4) + d26) - (d30 * sin4);
            double d41 = (d33 * sin4) + (d9 * sin2 * cos4) + d27;
            double d42 = (d29 * sin4) - (d30 * cos4);
            double d43 = (cos4 * d33) + (sin4 * d32);
            double d44 = d39 - d38;
            double tan = Math.tan(d44 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d44)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d31 * sqrt3) + d36), (float) ((d35 * sqrt3) + d37), (float) (d40 - (sqrt3 * d42)), (float) (d41 - (sqrt3 * d43)), (float) d40, (float) d41);
            i++;
            d37 = d41;
            cos2 = cos2;
            d32 = d32;
            d38 = d39;
            d35 = d43;
            d36 = d40;
            ceil = i5;
            d31 = d42;
            d34 = d34;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(C1969c[] c1969cArr, Path path) {
        int i;
        int i5;
        C1969c c1969c;
        int i6;
        char c5;
        float f;
        float f5;
        float f6;
        float f7;
        C1969c c1969c2;
        boolean z3;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Path path2 = path;
        float[] fArr = new float[6];
        int length = c1969cArr.length;
        char c6 = 'm';
        int i7 = 0;
        char c7 = 'm';
        int i8 = 0;
        while (i8 < length) {
            C1969c c1969c3 = c1969cArr[i8];
            char c8 = c1969c3.f17077a;
            float f16 = fArr[i7];
            float f17 = fArr[1];
            float f18 = fArr[2];
            float f19 = fArr[3];
            float f20 = fArr[4];
            float f21 = fArr[5];
            switch (c8) {
                case 'A':
                case 'a':
                    i = 7;
                    break;
                case 'C':
                case 'c':
                    i = 6;
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i = 4;
                    break;
                case 'Z':
                case 'z':
                    path2.close();
                    path2.moveTo(f20, f21);
                    f16 = f20;
                    f18 = f16;
                    f17 = f21;
                    f19 = f17;
                default:
                    i = 2;
                    break;
            }
            float f22 = f17;
            float f23 = f20;
            float f24 = f21;
            float f25 = f16;
            int i9 = i7;
            while (true) {
                float[] fArr2 = c1969c3.f17078b;
                if (i9 < fArr2.length) {
                    int i10 = i7;
                    if (c8 == 'A') {
                        i5 = i9;
                        c1969c = c1969c3;
                        float f26 = f25;
                        float f27 = f22;
                        i6 = i8;
                        c5 = c8;
                        int i11 = i5 + 5;
                        int i12 = i5 + 6;
                        a(path, f26, f27, fArr2[i11], fArr2[i12], fArr2[i5], fArr2[i5 + 1], fArr2[i5 + 2], fArr2[i5 + 3] != 0.0f ? 1 : i10, fArr2[i5 + 4] != 0.0f ? 1 : i10);
                        f18 = fArr2[i11];
                        f = fArr2[i12];
                        f19 = f;
                        f5 = f18;
                    } else if (c8 == 'C') {
                        i5 = i9;
                        i6 = i8;
                        c1969c = c1969c3;
                        c5 = c8;
                        int i13 = i5 + 2;
                        int i14 = i5 + 3;
                        int i15 = i5 + 4;
                        int i16 = i5 + 5;
                        path2.cubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i13], fArr2[i14], fArr2[i15], fArr2[i16]);
                        float f28 = fArr2[i15];
                        float f29 = fArr2[i16];
                        f18 = fArr2[i13];
                        f19 = fArr2[i14];
                        f = f29;
                        f5 = f28;
                    } else if (c8 != 'H') {
                        if (c8 == 'Q') {
                            i5 = i9;
                            i6 = i8;
                            c1969c = c1969c3;
                            c5 = c8;
                            int i17 = i5 + 1;
                            int i18 = i5 + 2;
                            int i19 = i5 + 3;
                            path2.quadTo(fArr2[i5], fArr2[i17], fArr2[i18], fArr2[i19]);
                            f6 = fArr2[i5];
                            float f30 = fArr2[i17];
                            f7 = fArr2[i18];
                            f19 = f30;
                            f = fArr2[i19];
                        } else if (c8 == 'V') {
                            i5 = i9;
                            i6 = i8;
                            c1969c = c1969c3;
                            f5 = f25;
                            c5 = c8;
                            path2.lineTo(f5, fArr2[i5]);
                            f = fArr2[i5];
                        } else if (c8 != 'a') {
                            if (c8 == 'c') {
                                i5 = i9;
                                int i20 = i5 + 2;
                                int i21 = i5 + 3;
                                int i22 = i5 + 4;
                                int i23 = i5 + 5;
                                path2.rCubicTo(fArr2[i5], fArr2[i5 + 1], fArr2[i20], fArr2[i21], fArr2[i22], fArr2[i23]);
                                float f31 = fArr2[i20] + f25;
                                float f32 = f22 + fArr2[i21];
                                f25 += fArr2[i22];
                                f22 += fArr2[i23];
                                f18 = f31;
                                f19 = f32;
                            } else if (c8 != 'h') {
                                if (c8 != 'q') {
                                    if (c8 != 'v') {
                                        if (c8 == 'L') {
                                            i5 = i9;
                                            int i24 = i5 + 1;
                                            path2.lineTo(fArr2[i5], fArr2[i24]);
                                            f5 = fArr2[i5];
                                            f = fArr2[i24];
                                        } else if (c8 == 'M') {
                                            i5 = i9;
                                            f5 = fArr2[i5];
                                            f = fArr2[i5 + 1];
                                            if (i5 > 0) {
                                                path2.lineTo(f5, f);
                                            } else {
                                                path2.moveTo(f5, f);
                                                f23 = f5;
                                                f24 = f;
                                            }
                                        } else if (c8 == 'S') {
                                            i5 = i9;
                                            if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                f25 = (f25 * 2.0f) - f18;
                                                f22 = (f22 * 2.0f) - f19;
                                            }
                                            float f33 = f25;
                                            float f34 = f22;
                                            int i25 = i5 + 1;
                                            int i26 = i5 + 2;
                                            int i27 = i5 + 3;
                                            path2.cubicTo(f33, f34, fArr2[i5], fArr2[i25], fArr2[i26], fArr2[i27]);
                                            f6 = fArr2[i5];
                                            float f35 = fArr2[i25];
                                            f7 = fArr2[i26];
                                            f19 = f35;
                                            f = fArr2[i27];
                                            i6 = i8;
                                            c1969c = c1969c3;
                                            c5 = c8;
                                        } else if (c8 == 'T') {
                                            i5 = i9;
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f25 = (f25 * 2.0f) - f18;
                                                f22 = (f22 * 2.0f) - f19;
                                            }
                                            float f36 = f22;
                                            float f37 = fArr2[i5];
                                            int i28 = i5 + 1;
                                            path2.quadTo(f25, f36, f37, fArr2[i28]);
                                            f19 = f36;
                                            f5 = fArr2[i5];
                                            f = fArr2[i28];
                                            i6 = i8;
                                            c1969c = c1969c3;
                                            f18 = f25;
                                            c5 = c8;
                                        } else if (c8 == 'l') {
                                            i5 = i9;
                                            int i29 = i5 + 1;
                                            path2.rLineTo(fArr2[i5], fArr2[i29]);
                                            f25 += fArr2[i5];
                                            f11 = fArr2[i29];
                                        } else if (c8 == c6) {
                                            i5 = i9;
                                            float f38 = fArr2[i5];
                                            f25 += f38;
                                            float f39 = fArr2[i5 + 1];
                                            f22 += f39;
                                            if (i5 > 0) {
                                                path2.rLineTo(f38, f39);
                                            } else {
                                                path2.rMoveTo(f38, f39);
                                                c1969c = c1969c3;
                                                f5 = f25;
                                                f23 = f5;
                                                f = f22;
                                                f24 = f;
                                                i6 = i8;
                                                c5 = c8;
                                            }
                                        } else if (c8 == 's') {
                                            if (c7 == 'c' || c7 == 's' || c7 == 'C' || c7 == 'S') {
                                                f12 = f22 - f19;
                                                f13 = f25 - f18;
                                            } else {
                                                f13 = 0.0f;
                                                f12 = 0.0f;
                                            }
                                            int i30 = i9 + 1;
                                            int i31 = i9 + 2;
                                            int i32 = i9 + 3;
                                            i5 = i9;
                                            path2.rCubicTo(f13, f12, fArr2[i9], fArr2[i30], fArr2[i31], fArr2[i32]);
                                            f8 = fArr2[i5] + f25;
                                            f9 = f22 + fArr2[i30];
                                            f25 += fArr2[i31];
                                            f10 = fArr2[i32];
                                        } else if (c8 != 't') {
                                            i5 = i9;
                                        } else {
                                            if (c7 == 'q' || c7 == 't' || c7 == 'Q' || c7 == 'T') {
                                                f14 = f25 - f18;
                                                f15 = f22 - f19;
                                            } else {
                                                f15 = 0.0f;
                                                f14 = 0.0f;
                                            }
                                            int i33 = i9 + 1;
                                            path2.rQuadTo(f14, f15, fArr2[i9], fArr2[i33]);
                                            float f40 = f14 + f25;
                                            float f41 = f22 + f15;
                                            float f42 = f25 + fArr2[i9];
                                            f22 += fArr2[i33];
                                            f19 = f41;
                                            i5 = i9;
                                            c1969c = c1969c3;
                                            f5 = f42;
                                            f18 = f40;
                                            f = f22;
                                            i6 = i8;
                                            c5 = c8;
                                        }
                                        i6 = i8;
                                        c1969c = c1969c3;
                                        c5 = c8;
                                    } else {
                                        i5 = i9;
                                        path2.rLineTo(0.0f, fArr2[i5]);
                                        f11 = fArr2[i5];
                                    }
                                    f22 += f11;
                                } else {
                                    i5 = i9;
                                    int i34 = i5 + 1;
                                    int i35 = i5 + 2;
                                    int i36 = i5 + 3;
                                    path2.rQuadTo(fArr2[i5], fArr2[i34], fArr2[i35], fArr2[i36]);
                                    f8 = fArr2[i5] + f25;
                                    f9 = f22 + fArr2[i34];
                                    f25 += fArr2[i35];
                                    f10 = fArr2[i36];
                                }
                                f22 += f10;
                                f18 = f8;
                                f19 = f9;
                            } else {
                                i5 = i9;
                                path2.rLineTo(fArr2[i5], 0.0f);
                                f25 += fArr2[i5];
                            }
                            c1969c = c1969c3;
                            f5 = f25;
                            f = f22;
                            i6 = i8;
                            c5 = c8;
                        } else {
                            i5 = i9;
                            int i37 = i5 + 5;
                            float f43 = fArr2[i37] + f25;
                            int i38 = i5 + 6;
                            float f44 = fArr2[i38] + f22;
                            float f45 = fArr2[i5];
                            float f46 = fArr2[i5 + 1];
                            float f47 = fArr2[i5 + 2];
                            if (fArr2[i5 + 3] != 0.0f) {
                                c1969c2 = c1969c3;
                                z3 = 1;
                            } else {
                                c1969c2 = c1969c3;
                                z3 = i10;
                            }
                            c1969c = c1969c2;
                            float f48 = f25;
                            c5 = c8;
                            float f49 = f22;
                            i6 = i8;
                            a(path, f48, f49, f43, f44, f45, f46, f47, z3, fArr2[i5 + 4] != 0.0f ? 1 : i10);
                            f5 = f48 + fArr2[i37];
                            f = f49 + fArr2[i38];
                            f18 = f5;
                            f19 = f;
                        }
                        f18 = f6;
                        f5 = f7;
                    } else {
                        i5 = i9;
                        c1969c = c1969c3;
                        c5 = c8;
                        f = f22;
                        i6 = i8;
                        path2.lineTo(fArr2[i5], f);
                        f5 = fArr2[i5];
                    }
                    c8 = c5;
                    c1969c3 = c1969c;
                    i8 = i6;
                    i7 = i10;
                    c6 = 'm';
                    f25 = f5;
                    f22 = f;
                    c7 = c8;
                    i9 = i5 + i;
                    path2 = path;
                }
            }
            int i39 = i7;
            fArr[i39] = f25;
            fArr[1] = f22;
            fArr[2] = f18;
            fArr[3] = f19;
            fArr[4] = f23;
            fArr[5] = f24;
            c7 = c1969c3.f17077a;
            i8++;
            path2 = path;
            i7 = i39;
            c6 = 'm';
        }
    }

    public C1969c(C1969c c1969c) {
        this.f17077a = c1969c.f17077a;
        float[] fArr = c1969c.f17078b;
        this.f17078b = G4.d.k(fArr, fArr.length);
    }
}
