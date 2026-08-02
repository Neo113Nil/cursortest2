package M5;

import Cd.C2749j;
import N5.c;
import android.graphics.Color;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes8.dex */
public final class o implements M<J5.d> {

    /* renamed from: a, reason: collision with root package name */
    private int f17434a;

    public o(int i11) {
        this.f17434a = i11;
    }

    @Override // M5.M
    public final J5.d a(N5.c cVar, float f7) throws IOException {
        int i11;
        char c11;
        int i12;
        int argb;
        float e11;
        int i13;
        ArrayList arrayList = new ArrayList();
        int i14 = 1;
        char c12 = 0;
        boolean z11 = cVar.m() == c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.beginArray();
        }
        while (cVar.hasNext()) {
            arrayList.add(Float.valueOf((float) cVar.nextDouble()));
        }
        int i15 = 2;
        if (arrayList.size() == 4 && ((Float) arrayList.get(0)).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add((Float) arrayList.get(1));
            arrayList.add((Float) arrayList.get(2));
            arrayList.add((Float) arrayList.get(3));
            this.f17434a = 2;
        }
        if (z11) {
            cVar.endArray();
        }
        if (this.f17434a == -1) {
            this.f17434a = arrayList.size() / 4;
        }
        int i16 = this.f17434a;
        float[] fArr = new float[i16];
        int[] iArr = new int[i16];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (true) {
            i11 = this.f17434a * 4;
            if (i17 >= i11) {
                break;
            }
            int i21 = i17 / 4;
            double floatValue = ((Float) arrayList.get(i17)).floatValue();
            int i22 = i17 % 4;
            if (i22 != 0) {
                if (i22 == i14) {
                    i18 = (int) (floatValue * 255.0d);
                } else if (i22 == 2) {
                    i19 = (int) (floatValue * 255.0d);
                } else if (i22 == 3) {
                    iArr[i21] = Color.argb(255, i18, i19, (int) (floatValue * 255.0d));
                }
                i13 = i14;
            } else {
                if (i21 > 0) {
                    i13 = i14;
                    float f11 = (float) floatValue;
                    if (fArr[i21 - 1] >= f11) {
                        fArr[i21] = f11 + 0.01f;
                    }
                } else {
                    i13 = i14;
                }
                fArr[i21] = (float) floatValue;
            }
            i17++;
            i14 = i13;
        }
        int i23 = i14;
        J5.d dVar = new J5.d(fArr, iArr);
        if (arrayList.size() <= i11) {
            return dVar;
        }
        float[] c13 = dVar.c();
        int[] b11 = dVar.b();
        int size = (arrayList.size() - i11) / 2;
        float[] fArr2 = new float[size];
        float[] fArr3 = new float[size];
        int i24 = 0;
        while (i11 < arrayList.size()) {
            if (i11 % 2 == 0) {
                fArr2[i24] = ((Float) arrayList.get(i11)).floatValue();
            } else {
                fArr3[i24] = ((Float) arrayList.get(i11)).floatValue();
                i24++;
            }
            i11++;
        }
        float[] c14 = dVar.c();
        if (c14.length == 0) {
            c14 = fArr2;
        } else if (size != 0) {
            int length = c14.length + size;
            float[] fArr4 = new float[length];
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            for (int i28 = 0; i28 < length; i28++) {
                float f12 = i26 < c14.length ? c14[i26] : Float.NaN;
                float f13 = i27 < size ? fArr2[i27] : Float.NaN;
                if (Float.isNaN(f13) || f12 < f13) {
                    fArr4[i28] = f12;
                    i26++;
                } else if (Float.isNaN(f12) || f13 < f12) {
                    fArr4[i28] = f13;
                    i27++;
                } else {
                    fArr4[i28] = f12;
                    i26++;
                    i27++;
                    i25++;
                }
            }
            c14 = i25 == 0 ? fArr4 : Arrays.copyOf(fArr4, length - i25);
        }
        int length2 = c14.length;
        int[] iArr2 = new int[length2];
        int i29 = 0;
        while (i29 < length2) {
            float f14 = c14[i29];
            int binarySearch = Arrays.binarySearch(c13, f14);
            int binarySearch2 = Arrays.binarySearch(fArr2, f14);
            if (binarySearch < 0 || binarySearch2 > 0) {
                c11 = c12;
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                float f15 = fArr3[binarySearch2];
                if (b11.length >= i15 && f14 != c13[c11]) {
                    for (int i31 = i23; i31 < c13.length; i31++) {
                        float f16 = c13[i31];
                        if (f16 >= f14 || i31 == c13.length - 1) {
                            if (i31 != c13.length - 1 || f14 < f16) {
                                int i32 = i31 - 1;
                                float f17 = c13[i32];
                                float f18 = (f14 - f17) / (f16 - f17);
                                int i33 = b11[i31];
                                int i34 = b11[i32];
                                i12 = Color.argb((int) (f15 * 255.0f), C2749j.e(f18, Color.red(i34), Color.red(i33)), C2749j.e(f18, Color.green(i34), Color.green(i33)), C2749j.e(f18, Color.blue(i34), Color.blue(i33)));
                            } else {
                                i12 = Color.argb((int) (f15 * 255.0f), Color.red(b11[i31]), Color.green(b11[i31]), Color.blue(b11[i31]));
                            }
                        }
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                i12 = b11[c11];
                iArr2[i29] = i12;
            } else {
                int i35 = b11[binarySearch];
                if (size >= i15 && f14 > fArr2[c12]) {
                    int i36 = i23;
                    while (i36 < size) {
                        float f19 = fArr2[i36];
                        if (f19 < f14) {
                            c11 = c12;
                            if (i36 != size - 1) {
                                i36++;
                                c12 = c11;
                            }
                        } else {
                            c11 = c12;
                        }
                        if (f19 <= f14) {
                            e11 = fArr3[i36];
                        } else {
                            int i37 = i36 - 1;
                            float f21 = fArr2[i37];
                            e11 = O5.f.e(fArr3[i37], fArr3[i36], (f14 - f21) / (f19 - f21));
                        }
                        argb = Color.argb((int) (e11 * 255.0f), Color.red(i35), Color.green(i35), Color.blue(i35));
                    }
                    throw new IllegalArgumentException("Unreachable code.");
                }
                c11 = c12;
                argb = Color.argb((int) (fArr3[c11] * 255.0f), Color.red(i35), Color.green(i35), Color.blue(i35));
                iArr2[i29] = argb;
            }
            i29++;
            c12 = c11;
            i15 = 2;
        }
        return new J5.d(c14, iArr2);
    }
}
