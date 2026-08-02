package J9;

import I9.j;
import Ql0.h;
import h9.m;
import h9.s;
import h9.t;
import java.util.EnumMap;
import o9.C8660b;
import o9.C8664f;
import o9.C8665g;
import o9.C8667i;

/* loaded from: classes9.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f14211a;

    /* renamed from: b, reason: collision with root package name */
    private t f14212b;

    public c(C8660b c8660b) {
        this.f14211a = c8660b;
    }

    private float a(d dVar, d dVar2) {
        float e11 = e((int) dVar.b(), (int) dVar.c(), (int) dVar2.b(), (int) dVar2.c());
        float e12 = e((int) dVar2.b(), (int) dVar2.c(), (int) dVar.b(), (int) dVar.c());
        return Float.isNaN(e11) ? e12 / 7.0f : Float.isNaN(e12) ? e11 / 7.0f : (e11 + e12) / 14.0f;
    }

    private float d(int i11, int i12, int i13, int i14) {
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i21;
        c cVar;
        int i22;
        int i23 = 1;
        boolean z11 = Math.abs(i14 - i12) > Math.abs(i13 - i11);
        if (z11) {
            i16 = i11;
            i15 = i12;
            i18 = i13;
            i17 = i14;
        } else {
            i15 = i11;
            i16 = i12;
            i17 = i13;
            i18 = i14;
        }
        int abs = Math.abs(i17 - i15);
        int abs2 = Math.abs(i18 - i16);
        int i24 = 2;
        int i25 = (-abs) / 2;
        int i26 = i15 < i17 ? 1 : -1;
        int i27 = i16 < i18 ? 1 : -1;
        int i28 = i17 + i26;
        int i29 = i15;
        int i31 = i16;
        int i32 = 0;
        while (true) {
            if (i29 == i28) {
                i19 = i24;
                break;
            }
            int i33 = z11 ? i31 : i29;
            int i34 = z11 ? i29 : i31;
            boolean z12 = z11;
            if (i32 == i23) {
                i21 = i23;
                i22 = abs;
                cVar = this;
            } else {
                i21 = 0;
                cVar = this;
                i22 = abs;
            }
            if (i21 == cVar.f14211a.d(i33, i34)) {
                if (i32 == 2) {
                    return h.c(i29, i31, i15, i16);
                }
                i32++;
            }
            i25 += abs2;
            if (i25 > 0) {
                if (i31 == i18) {
                    i19 = 2;
                    break;
                }
                i31 += i27;
                i25 -= i22;
            }
            i29 += i26;
            abs = i22;
            z11 = z12;
            i23 = 1;
            i24 = 2;
        }
        if (i32 == i19) {
            return h.c(i28, i18, i15, i16);
        }
        return Float.NaN;
    }

    private float e(int i11, int i12, int i13, int i14) {
        float f7;
        float f11;
        float d11 = d(i11, i12, i13, i14);
        int i15 = i11 - (i13 - i11);
        int i16 = 0;
        C8660b c8660b = this.f14211a;
        if (i15 < 0) {
            f7 = i11 / (i11 - i15);
            i15 = 0;
        } else if (i15 >= c8660b.j()) {
            f7 = ((c8660b.j() - 1) - i11) / (i15 - i11);
            i15 = c8660b.j() - 1;
        } else {
            f7 = 1.0f;
        }
        float f12 = i12;
        int i17 = (int) (f12 - ((i14 - i12) * f7));
        if (i17 < 0) {
            f11 = f12 / (i12 - i17);
        } else if (i17 >= c8660b.g()) {
            f11 = ((c8660b.g() - 1) - i12) / (i17 - i12);
            i16 = c8660b.g() - 1;
        } else {
            i16 = i17;
            f11 = 1.0f;
        }
        return (d11 + d(i11, i12, (int) (((i15 - i11) * f11) + i11), i16)) - 1.0f;
    }

    public final C8665g b(EnumMap enumMap) throws m, h9.h {
        char c11;
        float b11;
        float c12;
        float f7;
        s[] sVarArr;
        a aVar = null;
        t tVar = enumMap == null ? null : (t) enumMap.get(h9.e.NEED_RESULT_POINT_CALLBACK);
        this.f14212b = tVar;
        C8660b c8660b = this.f14211a;
        f b12 = new e(c8660b, tVar).b(enumMap);
        d b13 = b12.b();
        d c13 = b12.c();
        d a11 = b12.a();
        float a12 = (a(b13, c13) + a(b13, a11)) / 2.0f;
        if (a12 < 1.0f) {
            throw m.a();
        }
        int e11 = (h.e(s.a(b13, a11) / a12) + h.e(s.a(b13, c13) / a12)) / 2;
        int i11 = e11 + 7;
        int i12 = i11 & 3;
        if (i12 == 0) {
            i11 = e11 + 8;
        } else if (i12 == 2) {
            i11 = e11 + 6;
        } else if (i12 == 3) {
            throw m.a();
        }
        int i13 = j.f12020g;
        if (i11 % 4 != 1) {
            throw h9.h.a();
        }
        try {
            j h11 = j.h((i11 - 17) / 4);
            int e12 = h11.e() - 7;
            if (h11.d().length > 0) {
                float b14 = a11.b() + (c13.b() - b13.b());
                float c14 = a11.c() + (c13.c() - b13.c());
                float f11 = 1.0f - (3.0f / e12);
                int b15 = (int) (((b14 - b13.b()) * f11) + b13.b());
                int c15 = (int) (((c14 - b13.c()) * f11) + b13.c());
                c11 = 1;
                for (int i14 = 4; i14 <= 16; i14 <<= 1) {
                    try {
                        aVar = c(b15, a12, i14, c15);
                        break;
                    } catch (m unused) {
                    }
                }
            } else {
                c11 = 1;
            }
            float f12 = i11 - 3.5f;
            if (aVar != null) {
                b11 = aVar.b();
                c12 = aVar.c();
                f7 = f12 - 3.0f;
            } else {
                b11 = (c13.b() - b13.b()) + a11.b();
                c12 = (c13.c() - b13.c()) + a11.c();
                f7 = f12;
            }
            C8660b a13 = C8664f.a(c8660b, i11, i11, C8667i.a(3.5f, 3.5f, f12, 3.5f, f7, f7, 3.5f, f12, b13.b(), b13.c(), c13.b(), c13.c(), b11, c12, a11.b(), a11.c()));
            if (aVar == null) {
                sVarArr = new s[3];
                sVarArr[0] = a11;
                sVarArr[c11] = b13;
                sVarArr[2] = c13;
            } else {
                sVarArr = new s[4];
                sVarArr[0] = a11;
                sVarArr[c11] = b13;
                sVarArr[2] = c13;
                sVarArr[3] = aVar;
            }
            return new C8665g(a13, sVarArr);
        } catch (IllegalArgumentException unused2) {
            throw h9.h.a();
        }
    }

    protected final a c(int i11, float f7, float f11, int i12) throws m {
        int i13 = (int) (f11 * f7);
        int max = Math.max(0, i11 - i13);
        C8660b c8660b = this.f14211a;
        int min = Math.min(c8660b.j() - 1, i11 + i13) - max;
        float f12 = 3.0f * f7;
        if (min < f12) {
            throw m.a();
        }
        int max2 = Math.max(0, i12 - i13);
        int min2 = Math.min(c8660b.g() - 1, i12 + i13) - max2;
        if (min2 >= f12) {
            return new b(this.f14211a, max, max2, min, min2, f7, this.f14212b).a();
        }
        throw m.a();
    }
}
