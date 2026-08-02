package androidx.core.graphics;

import B0.A0;
import android.graphics.Path;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.ArrayList;
import org.maplibre.android.log.Logger;

/* loaded from: classes8.dex */
public final class f {
    public static boolean a(a[] aVarArr, a[] aVarArr2) {
        if (aVarArr == null || aVarArr2 == null || aVarArr.length != aVarArr2.length) {
            return false;
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            if (aVarArr[i11].f42154a != aVarArr2[i11].f42154a || aVarArr[i11].f42155b.length != aVarArr2[i11].f42155b.length) {
                return false;
            }
        }
        return true;
    }

    static float[] b(float[] fArr, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i11, length);
        float[] fArr2 = new float[i11];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static a[] c(@NonNull String str) {
        int i11;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 1;
        while (i14 < str.length()) {
            while (i14 < str.length()) {
                char charAt = str.charAt(i14);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i14++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i13, i14).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i12) == 'z' || trim.charAt(i12) == 'Z') {
                            fArr = new float[i12];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i15 = i12;
                                int i16 = 1;
                                while (i16 < length) {
                                    int i17 = i12;
                                    int i18 = i17;
                                    int i19 = i18;
                                    int i21 = i19;
                                    for (int i22 = i16; i22 < trim.length(); i22++) {
                                        char charAt2 = trim.charAt(i22);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case DescriptorProtos$FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER /* 44 */:
                                                        break;
                                                    case DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER /* 45 */:
                                                        if (i22 != i16 && i17 == 0) {
                                                            i17 = 0;
                                                            i19 = 1;
                                                            i21 = 1;
                                                            break;
                                                        }
                                                        i17 = 0;
                                                        break;
                                                    case '.':
                                                        if (i18 == 0) {
                                                            i17 = 0;
                                                            i18 = 1;
                                                            break;
                                                        }
                                                        i17 = 0;
                                                        i19 = 1;
                                                        i21 = 1;
                                                        break;
                                                    default:
                                                        i17 = 0;
                                                        break;
                                                }
                                            } else {
                                                i17 = 1;
                                            }
                                            if (i19 == 0) {
                                                if (i16 < i22) {
                                                    fArr2[i15] = Float.parseFloat(trim.substring(i16, i22));
                                                    i15++;
                                                }
                                                i16 = i21 == 0 ? i22 : i22 + 1;
                                                i12 = 0;
                                            }
                                        }
                                        i17 = 0;
                                        i19 = 1;
                                        if (i19 == 0) {
                                        }
                                    }
                                    if (i16 < i22) {
                                    }
                                    if (i21 == 0) {
                                    }
                                    i12 = 0;
                                }
                                fArr = b(fArr2, i15);
                                i12 = 0;
                            } catch (NumberFormatException e11) {
                                throw new RuntimeException(A0.b("error in parsing \"", trim, "\""), e11);
                            }
                        }
                        arrayList.add(new a(trim.charAt(i12), fArr));
                    }
                    i13 = i14;
                    i14++;
                    i12 = 0;
                }
                i14++;
            }
            trim = str.substring(i13, i14).trim();
            if (!trim.isEmpty()) {
            }
            i13 = i14;
            i14++;
            i12 = 0;
        }
        if (i14 - i13 != 1 || i13 >= str.length()) {
            i11 = 0;
        } else {
            i11 = 0;
            arrayList.add(new a(str.charAt(i13), new float[0]));
        }
        return (a[]) arrayList.toArray(new a[i11]);
    }

    @NonNull
    public static a[] d(@NonNull a[] aVarArr) {
        a[] aVarArr2 = new a[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            aVarArr2[i11] = new a(aVarArr[i11]);
        }
        return aVarArr2;
    }

    public static void e(@NonNull a[] aVarArr, @NonNull a[] aVarArr2) {
        for (int i11 = 0; i11 < aVarArr2.length; i11++) {
            aVarArr[i11].f42154a = aVarArr2[i11].f42154a;
            for (int i12 = 0; i12 < aVarArr2[i11].f42155b.length; i12++) {
                aVarArr[i11].f42155b[i12] = aVarArr2[i11].f42155b[i12];
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private char f42154a;

        /* renamed from: b, reason: collision with root package name */
        private final float[] f42155b;

        a(char c11, float[] fArr) {
            this.f42154a = c11;
            this.f42155b = fArr;
        }

        private static void d(Path path, float f7, float f11, float f12, float f13, float f14, float f15, float f16, boolean z11, boolean z12) {
            double d11;
            double d12;
            double radians = Math.toRadians(f16);
            double cos = Math.cos(radians);
            double sin = Math.sin(radians);
            double d13 = f7;
            double d14 = f11;
            double d15 = f14;
            double d16 = ((d14 * sin) + (d13 * cos)) / d15;
            double d17 = f15;
            double d18 = ((d14 * cos) + ((-f7) * sin)) / d17;
            double d19 = f13;
            double d21 = ((d19 * sin) + (f12 * cos)) / d15;
            double d22 = ((d19 * cos) + ((-f12) * sin)) / d17;
            double d23 = d16 - d21;
            double d24 = d18 - d22;
            double d25 = (d16 + d21) / 2.0d;
            double d26 = (d18 + d22) / 2.0d;
            double d27 = (d24 * d24) + (d23 * d23);
            if (d27 == 0.0d) {
                Log.w("PathParser", " Points are coincident");
                return;
            }
            double d28 = (1.0d / d27) - 0.25d;
            if (d28 < 0.0d) {
                Log.w("PathParser", "Points are too far apart " + d27);
                float sqrt = (float) (Math.sqrt(d27) / 1.99999d);
                d(path, f7, f11, f12, f13, f14 * sqrt, sqrt * f15, f16, z11, z12);
                return;
            }
            double sqrt2 = Math.sqrt(d28);
            double d29 = sqrt2 * d23;
            double d31 = sqrt2 * d24;
            if (z11 == z12) {
                d11 = d25 - d31;
                d12 = d26 + d29;
            } else {
                d11 = d25 + d31;
                d12 = d26 - d29;
            }
            double atan2 = Math.atan2(d18 - d12, d16 - d11);
            double atan22 = Math.atan2(d22 - d12, d21 - d11) - atan2;
            if (z12 != (atan22 >= 0.0d)) {
                atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
            }
            double d32 = d11 * d15;
            double d33 = d12 * d17;
            double d34 = (d32 * cos) - (d33 * sin);
            double d35 = (d33 * cos) + (d32 * sin);
            int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
            double cos2 = Math.cos(radians);
            double sin2 = Math.sin(radians);
            double cos3 = Math.cos(atan2);
            double sin3 = Math.sin(atan2);
            double d36 = -d15;
            double d37 = d36 * cos2;
            double d38 = d17 * sin2;
            double d39 = (d37 * sin3) - (d38 * cos3);
            double d41 = d36 * sin2;
            double d42 = d17 * cos2;
            double d43 = atan22 / ceil;
            double d44 = (cos3 * d42) + (sin3 * d41);
            double d45 = d13;
            double d46 = d14;
            int i11 = 0;
            double d47 = atan2;
            while (i11 < ceil) {
                double d48 = d47 + d43;
                double sin4 = Math.sin(d48);
                double cos4 = Math.cos(d48);
                int i12 = ceil;
                double d49 = (((d15 * cos2) * cos4) + d34) - (d38 * sin4);
                double d51 = (d42 * sin4) + (d15 * sin2 * cos4) + d35;
                double d52 = (d37 * sin4) - (d38 * cos4);
                double d53 = (cos4 * d42) + (sin4 * d41);
                double d54 = d48 - d47;
                double tan = Math.tan(d54 / 2.0d);
                double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d54)) / 3.0d;
                path.rLineTo(0.0f, 0.0f);
                path.cubicTo((float) ((d39 * sqrt3) + d45), (float) ((d44 * sqrt3) + d46), (float) (d49 - (sqrt3 * d52)), (float) (d51 - (sqrt3 * d53)), (float) d49, (float) d51);
                i11++;
                d46 = d51;
                cos2 = cos2;
                d41 = d41;
                d47 = d48;
                d44 = d53;
                d45 = d49;
                ceil = i12;
                d39 = d52;
                d43 = d43;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Deprecated
        public static void e(@NonNull a[] aVarArr, @NonNull Path path) {
            int i11;
            int i12;
            a aVar;
            int i13;
            char c11;
            float f7;
            float f11;
            float f12;
            float f13;
            a aVar2;
            boolean z11;
            float f14;
            float f15;
            float f16;
            float f17;
            float f18;
            float f19;
            float f21;
            float f22;
            Path path2 = path;
            float[] fArr = new float[6];
            int length = aVarArr.length;
            int i14 = 0;
            char c12 = 'm';
            int i15 = 0;
            char c13 = 'm';
            while (i15 < length) {
                a aVar3 = aVarArr[i15];
                char c14 = aVar3.f42154a;
                float f23 = fArr[i14];
                float f24 = fArr[1];
                float f25 = fArr[2];
                float f26 = fArr[3];
                float f27 = fArr[4];
                float f28 = fArr[5];
                switch (c14) {
                    case RegisterRequest.U2F_V1_CHALLENGE_BYTE_LENGTH /* 65 */:
                    case 'a':
                        i11 = 7;
                        break;
                    case 'C':
                    case Logger.NONE /* 99 */:
                        i11 = 6;
                        break;
                    case 'H':
                    case 'V':
                    case 'h':
                    case 'v':
                        i11 = 1;
                        break;
                    case 'Q':
                    case 'S':
                    case 'q':
                    case 's':
                        i11 = 4;
                        break;
                    case 'Z':
                    case 'z':
                        path2.close();
                        path2.moveTo(f27, f28);
                        f23 = f27;
                        f25 = f23;
                        f24 = f28;
                        f26 = f24;
                    default:
                        i11 = 2;
                        break;
                }
                float f29 = f24;
                float f31 = f27;
                float f32 = f28;
                float f33 = f23;
                int i16 = i14;
                while (true) {
                    float[] fArr2 = aVar3.f42155b;
                    if (i16 < fArr2.length) {
                        int i17 = i14;
                        if (c14 == 'A') {
                            i12 = i16;
                            aVar = aVar3;
                            float f34 = f33;
                            float f35 = f29;
                            i13 = i15;
                            c11 = c14;
                            int i18 = i12 + 5;
                            int i19 = i12 + 6;
                            d(path, f34, f35, fArr2[i18], fArr2[i19], fArr2[i12], fArr2[i12 + 1], fArr2[i12 + 2], fArr2[i12 + 3] != 0.0f ? 1 : i17, fArr2[i12 + 4] != 0.0f ? 1 : i17);
                            f25 = fArr2[i18];
                            f7 = fArr2[i19];
                            f26 = f7;
                            f11 = f25;
                        } else if (c14 == 'C') {
                            i12 = i16;
                            i13 = i15;
                            aVar = aVar3;
                            c11 = c14;
                            int i21 = i12 + 2;
                            int i22 = i12 + 3;
                            int i23 = i12 + 4;
                            int i24 = i12 + 5;
                            path2.cubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i21], fArr2[i22], fArr2[i23], fArr2[i24]);
                            float f36 = fArr2[i23];
                            float f37 = fArr2[i24];
                            f25 = fArr2[i21];
                            f26 = fArr2[i22];
                            f7 = f37;
                            f11 = f36;
                        } else if (c14 != 'H') {
                            if (c14 == 'Q') {
                                i12 = i16;
                                i13 = i15;
                                aVar = aVar3;
                                c11 = c14;
                                int i25 = i12 + 1;
                                int i26 = i12 + 2;
                                int i27 = i12 + 3;
                                path2.quadTo(fArr2[i12], fArr2[i25], fArr2[i26], fArr2[i27]);
                                f12 = fArr2[i12];
                                float f38 = fArr2[i25];
                                f13 = fArr2[i26];
                                f26 = f38;
                                f7 = fArr2[i27];
                            } else if (c14 == 'V') {
                                i12 = i16;
                                i13 = i15;
                                aVar = aVar3;
                                f11 = f33;
                                c11 = c14;
                                path2.lineTo(f11, fArr2[i12]);
                                f7 = fArr2[i12];
                            } else if (c14 != 'a') {
                                if (c14 == 'c') {
                                    i12 = i16;
                                    int i28 = i12 + 2;
                                    int i29 = i12 + 3;
                                    int i31 = i12 + 4;
                                    int i32 = i12 + 5;
                                    path2.rCubicTo(fArr2[i12], fArr2[i12 + 1], fArr2[i28], fArr2[i29], fArr2[i31], fArr2[i32]);
                                    float f39 = fArr2[i28] + f33;
                                    float f41 = f29 + fArr2[i29];
                                    f33 += fArr2[i31];
                                    f29 += fArr2[i32];
                                    f25 = f39;
                                    f26 = f41;
                                } else if (c14 != 'h') {
                                    if (c14 != 'q') {
                                        if (c14 != 'v') {
                                            if (c14 == 'L') {
                                                i12 = i16;
                                                int i33 = i12 + 1;
                                                path2.lineTo(fArr2[i12], fArr2[i33]);
                                                f11 = fArr2[i12];
                                                f7 = fArr2[i33];
                                            } else if (c14 == 'M') {
                                                i12 = i16;
                                                f11 = fArr2[i12];
                                                f7 = fArr2[i12 + 1];
                                                if (i12 > 0) {
                                                    path2.lineTo(f11, f7);
                                                } else {
                                                    path2.moveTo(f11, f7);
                                                    f31 = f11;
                                                    f32 = f7;
                                                }
                                            } else if (c14 == 'S') {
                                                i12 = i16;
                                                if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                    f33 = (f33 * 2.0f) - f25;
                                                    f29 = (f29 * 2.0f) - f26;
                                                }
                                                float f42 = f33;
                                                float f43 = f29;
                                                int i34 = i12 + 1;
                                                int i35 = i12 + 2;
                                                int i36 = i12 + 3;
                                                path2.cubicTo(f42, f43, fArr2[i12], fArr2[i34], fArr2[i35], fArr2[i36]);
                                                f12 = fArr2[i12];
                                                float f44 = fArr2[i34];
                                                f13 = fArr2[i35];
                                                f26 = f44;
                                                f7 = fArr2[i36];
                                                i13 = i15;
                                                aVar = aVar3;
                                                c11 = c14;
                                            } else if (c14 == 'T') {
                                                i12 = i16;
                                                if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                    f33 = (f33 * 2.0f) - f25;
                                                    f29 = (f29 * 2.0f) - f26;
                                                }
                                                float f45 = f29;
                                                float f46 = fArr2[i12];
                                                int i37 = i12 + 1;
                                                path2.quadTo(f33, f45, f46, fArr2[i37]);
                                                f26 = f45;
                                                f11 = fArr2[i12];
                                                f7 = fArr2[i37];
                                                i13 = i15;
                                                aVar = aVar3;
                                                f25 = f33;
                                                c11 = c14;
                                            } else if (c14 == 'l') {
                                                i12 = i16;
                                                int i38 = i12 + 1;
                                                path2.rLineTo(fArr2[i12], fArr2[i38]);
                                                f33 += fArr2[i12];
                                                f17 = fArr2[i38];
                                            } else if (c14 == c12) {
                                                i12 = i16;
                                                float f47 = fArr2[i12];
                                                f33 += f47;
                                                float f48 = fArr2[i12 + 1];
                                                f29 += f48;
                                                if (i12 > 0) {
                                                    path2.rLineTo(f47, f48);
                                                } else {
                                                    path2.rMoveTo(f47, f48);
                                                    aVar = aVar3;
                                                    f11 = f33;
                                                    f31 = f11;
                                                    f7 = f29;
                                                    f32 = f7;
                                                    i13 = i15;
                                                    c11 = c14;
                                                }
                                            } else if (c14 == 's') {
                                                if (c13 == 'c' || c13 == 's' || c13 == 'C' || c13 == 'S') {
                                                    f18 = f29 - f26;
                                                    f19 = f33 - f25;
                                                } else {
                                                    f19 = 0.0f;
                                                    f18 = 0.0f;
                                                }
                                                int i39 = i16 + 1;
                                                int i41 = i16 + 2;
                                                int i42 = i16 + 3;
                                                i12 = i16;
                                                path2.rCubicTo(f19, f18, fArr2[i16], fArr2[i39], fArr2[i41], fArr2[i42]);
                                                f14 = fArr2[i12] + f33;
                                                f15 = f29 + fArr2[i39];
                                                f33 += fArr2[i41];
                                                f16 = fArr2[i42];
                                            } else if (c14 != 't') {
                                                i12 = i16;
                                            } else {
                                                if (c13 == 'q' || c13 == 't' || c13 == 'Q' || c13 == 'T') {
                                                    f21 = f33 - f25;
                                                    f22 = f29 - f26;
                                                } else {
                                                    f22 = 0.0f;
                                                    f21 = 0.0f;
                                                }
                                                int i43 = i16 + 1;
                                                path2.rQuadTo(f21, f22, fArr2[i16], fArr2[i43]);
                                                float f49 = f21 + f33;
                                                float f51 = f29 + f22;
                                                float f52 = f33 + fArr2[i16];
                                                f29 += fArr2[i43];
                                                f26 = f51;
                                                i12 = i16;
                                                aVar = aVar3;
                                                f11 = f52;
                                                f25 = f49;
                                                f7 = f29;
                                                i13 = i15;
                                                c11 = c14;
                                            }
                                            i13 = i15;
                                            aVar = aVar3;
                                            c11 = c14;
                                        } else {
                                            i12 = i16;
                                            path2.rLineTo(0.0f, fArr2[i12]);
                                            f17 = fArr2[i12];
                                        }
                                        f29 += f17;
                                    } else {
                                        i12 = i16;
                                        int i44 = i12 + 1;
                                        int i45 = i12 + 2;
                                        int i46 = i12 + 3;
                                        path2.rQuadTo(fArr2[i12], fArr2[i44], fArr2[i45], fArr2[i46]);
                                        f14 = fArr2[i12] + f33;
                                        f15 = f29 + fArr2[i44];
                                        f33 += fArr2[i45];
                                        f16 = fArr2[i46];
                                    }
                                    f29 += f16;
                                    f25 = f14;
                                    f26 = f15;
                                } else {
                                    i12 = i16;
                                    path2.rLineTo(fArr2[i12], 0.0f);
                                    f33 += fArr2[i12];
                                }
                                aVar = aVar3;
                                f11 = f33;
                                f7 = f29;
                                i13 = i15;
                                c11 = c14;
                            } else {
                                i12 = i16;
                                int i47 = i12 + 5;
                                float f53 = fArr2[i47] + f33;
                                int i48 = i12 + 6;
                                float f54 = fArr2[i48] + f29;
                                float f55 = fArr2[i12];
                                float f56 = fArr2[i12 + 1];
                                float f57 = fArr2[i12 + 2];
                                if (fArr2[i12 + 3] != 0.0f) {
                                    aVar2 = aVar3;
                                    z11 = 1;
                                } else {
                                    aVar2 = aVar3;
                                    z11 = i17;
                                }
                                aVar = aVar2;
                                float f58 = f33;
                                c11 = c14;
                                float f59 = f29;
                                i13 = i15;
                                d(path, f58, f59, f53, f54, f55, f56, f57, z11, fArr2[i12 + 4] != 0.0f ? 1 : i17);
                                f11 = f58 + fArr2[i47];
                                f7 = f59 + fArr2[i48];
                                f25 = f11;
                                f26 = f7;
                            }
                            f25 = f12;
                            f11 = f13;
                        } else {
                            i12 = i16;
                            aVar = aVar3;
                            c11 = c14;
                            f7 = f29;
                            i13 = i15;
                            path2.lineTo(fArr2[i12], f7);
                            f11 = fArr2[i12];
                        }
                        c14 = c11;
                        aVar3 = aVar;
                        i15 = i13;
                        i14 = i17;
                        c12 = 'm';
                        f33 = f11;
                        f29 = f7;
                        c13 = c14;
                        i16 = i12 + i11;
                        path2 = path;
                    }
                }
                int i49 = i14;
                fArr[i49] = f33;
                fArr[1] = f29;
                fArr[2] = f25;
                fArr[3] = f26;
                fArr[4] = f31;
                fArr[5] = f32;
                c13 = aVar3.f42154a;
                i15++;
                path2 = path;
                i14 = i49;
                c12 = 'm';
            }
        }

        a(a aVar) {
            this.f42154a = aVar.f42154a;
            float[] fArr = aVar.f42155b;
            this.f42155b = f.b(fArr, fArr.length);
        }
    }
}
