package J9;

import h9.m;
import h9.s;
import h9.t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Iterator;
import o9.C8660b;

/* loaded from: classes9.dex */
public final class e {

    /* renamed from: f, reason: collision with root package name */
    private static final a f14215f = new a();

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f14216a;

    /* renamed from: c, reason: collision with root package name */
    private boolean f14218c;

    /* renamed from: e, reason: collision with root package name */
    private final t f14220e;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f14217b = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final int[] f14219d = new int[5];

    private static final class a implements Serializable, Comparator<d> {
        @Override // java.util.Comparator
        public final int compare(d dVar, d dVar2) {
            return Float.compare(dVar.h(), dVar2.h());
        }
    }

    public e(C8660b c8660b, t tVar) {
        this.f14216a = c8660b;
        this.f14220e = tVar;
    }

    private static float a(int[] iArr, int i11) {
        return ((i11 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    protected static boolean c(int[] iArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 < 5) {
                int i13 = iArr[i11];
                if (i13 == 0) {
                    break;
                }
                i12 += i13;
                i11++;
            } else if (i12 >= 7) {
                float f7 = i12 / 7.0f;
                float f11 = f7 / 2.0f;
                if (Math.abs(f7 - iArr[0]) >= f11 || Math.abs(f7 - iArr[1]) >= f11 || Math.abs((f7 * 3.0f) - iArr[2]) >= 3.0f * f11 || Math.abs(f7 - iArr[3]) >= f11 || Math.abs(f7 - iArr[4]) >= f11) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    private boolean e() {
        ArrayList arrayList = this.f14217b;
        int size = arrayList.size();
        Iterator it = arrayList.iterator();
        float f7 = 0.0f;
        int i11 = 0;
        float f11 = 0.0f;
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (dVar.g() >= 2) {
                i11++;
                f11 += dVar.h();
            }
        }
        if (i11 >= 3) {
            float f12 = f11 / size;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                f7 += Math.abs(((d) it2.next()).h() - f12);
            }
            if (f7 <= f11 * 0.05f) {
                return true;
            }
        }
        return false;
    }

    private static double f(d dVar, d dVar2) {
        double b11 = dVar.b() - dVar2.b();
        double c11 = dVar.c() - dVar2.c();
        return (c11 * c11) + (b11 * b11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final f b(EnumMap enumMap) throws m {
        ArrayList arrayList;
        double d11;
        double abs;
        int i11;
        int i12;
        boolean z11 = false;
        int i13 = 1;
        Object[] objArr = enumMap != null && enumMap.containsKey(h9.e.TRY_HARDER);
        C8660b c8660b = this.f14216a;
        int g10 = c8660b.g();
        int j11 = c8660b.j();
        int i14 = (g10 * 3) / 388;
        int i15 = 3;
        if (i14 < 3 || objArr != false) {
            i14 = 3;
        }
        int[] iArr = new int[5];
        int i16 = i14 - 1;
        boolean z12 = false;
        while (true) {
            arrayList = this.f14217b;
            if (i16 >= g10 || z12) {
                break;
            }
            Arrays.fill(iArr, 0);
            int i17 = 0;
            int i18 = 0;
            while (i17 < j11) {
                if (c8660b.d(i17, i16)) {
                    if ((i18 & 1) == 1) {
                        i18++;
                    }
                    iArr[i18] = iArr[i18] + 1;
                    i11 = i15;
                } else if ((i18 & 1) != 0) {
                    i11 = i15;
                    iArr[i18] = iArr[i18] + 1;
                } else if (i18 == 4) {
                    if (!c(iArr)) {
                        i11 = i15;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i11];
                        iArr[2] = iArr[4];
                        iArr[i11] = 1;
                        iArr[4] = 0;
                    } else if (d(i16, i17, iArr)) {
                        if (this.f14218c) {
                            z12 = e();
                            i11 = i15;
                        } else {
                            if (arrayList.size() > 1) {
                                Iterator it = arrayList.iterator();
                                d dVar = null;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i11 = i15;
                                        i12 = 0;
                                        break;
                                    }
                                    d dVar2 = (d) it.next();
                                    i11 = i15;
                                    if (dVar2.g() < 2) {
                                        i15 = i11;
                                    } else {
                                        if (dVar != null) {
                                            this.f14218c = true;
                                            i12 = ((int) (Math.abs(dVar.b() - dVar2.b()) - Math.abs(dVar.c() - dVar2.c()))) / 2;
                                            break;
                                        }
                                        i15 = i11;
                                        dVar = dVar2;
                                    }
                                }
                            } else {
                                i12 = 0;
                                i11 = i15;
                            }
                            int i19 = iArr[2];
                            if (i12 > i19) {
                                i16 += (i12 - i19) - 2;
                                i17 = j11 - 1;
                            }
                        }
                        Arrays.fill(iArr, 0);
                        i18 = 0;
                        i14 = 2;
                    } else {
                        i11 = i15;
                        iArr[0] = iArr[2];
                        iArr[1] = iArr[i11];
                        iArr[2] = iArr[4];
                        iArr[i11] = 1;
                        iArr[4] = 0;
                    }
                    i18 = i11;
                } else {
                    i11 = i15;
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                }
                i17++;
                i15 = i11;
            }
            int i21 = i15;
            if (c(iArr) && d(i16, j11, iArr)) {
                i14 = iArr[0];
                if (this.f14218c) {
                    z12 = e();
                }
            }
            i16 += i14;
            i15 = i21;
        }
        int i22 = i15;
        if (arrayList.size() < i22) {
            throw m.a();
        }
        arrayList.sort(f14215f);
        d[] dVarArr = new d[i22];
        int i23 = 0;
        double d12 = Double.MAX_VALUE;
        while (i23 < arrayList.size() - 2) {
            d dVar3 = (d) arrayList.get(i23);
            float h11 = dVar3.h();
            i23++;
            int i24 = i23;
            while (i24 < arrayList.size() - i13) {
                d dVar4 = (d) arrayList.get(i24);
                double f7 = f(dVar3, dVar4);
                i24++;
                boolean z13 = z11;
                int i25 = i13;
                for (int i26 = i24; i26 < arrayList.size(); i26++) {
                    d dVar5 = (d) arrayList.get(i26);
                    if (dVar5.h() <= 1.4f * h11) {
                        double f11 = f(dVar4, dVar5);
                        double f12 = f(dVar3, dVar5);
                        if (f7 < f11) {
                            if (f11 <= f12) {
                                f12 = f11;
                                f11 = f12;
                            } else if (f7 >= f12) {
                                d11 = f12;
                                f12 = f7;
                                abs = Math.abs(f11 - (d11 * 2.0d)) + Math.abs(f11 - (f12 * 2.0d));
                                if (abs >= d12) {
                                    dVarArr[z13 ? 1 : 0] = dVar3;
                                    dVarArr[i25] = dVar4;
                                    dVarArr[2] = dVar5;
                                    d12 = abs;
                                }
                            }
                            d11 = f7;
                            abs = Math.abs(f11 - (d11 * 2.0d)) + Math.abs(f11 - (f12 * 2.0d));
                            if (abs >= d12) {
                            }
                        } else {
                            if (f11 >= f12) {
                                d11 = f12;
                                f12 = f11;
                            } else if (f7 < f12) {
                                d11 = f11;
                                f11 = f12;
                                f12 = f7;
                                abs = Math.abs(f11 - (d11 * 2.0d)) + Math.abs(f11 - (f12 * 2.0d));
                                if (abs >= d12) {
                                }
                            } else {
                                d11 = f11;
                            }
                            f11 = f7;
                            abs = Math.abs(f11 - (d11 * 2.0d)) + Math.abs(f11 - (f12 * 2.0d));
                            if (abs >= d12) {
                            }
                        }
                    }
                }
                z11 = z13 ? 1 : 0;
                i13 = i25;
            }
        }
        if (d12 == Double.MAX_VALUE) {
            throw m.a();
        }
        s.d(dVarArr);
        return new f(dVarArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ee  */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v13 */
    /* JADX WARN: Type inference failed for: r16v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final boolean d(int i11, int i12, int[] iArr) {
        boolean z11;
        float a11;
        ?? r16;
        char c11;
        boolean z12;
        int i13;
        int i14;
        int i15;
        boolean z13 = false;
        boolean z14 = true;
        char c12 = 2;
        int i16 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a12 = (int) a(iArr, i12);
        int i17 = iArr[2];
        C8660b c8660b = this.f14216a;
        int g10 = c8660b.g();
        int[] iArr2 = this.f14219d;
        Arrays.fill(iArr2, 0);
        int i18 = i11;
        while (i18 >= 0 && c8660b.d(a12, i18)) {
            iArr2[2] = iArr2[2] + 1;
            i18--;
        }
        float f7 = Float.NaN;
        if (i18 < 0) {
            z11 = true;
        } else {
            while (i18 >= 0 && !c8660b.d(a12, i18)) {
                z11 = z14;
                int i19 = iArr2[z11 ? 1 : 0];
                if (i19 > i17) {
                    break;
                }
                iArr2[z11 ? 1 : 0] = i19 + 1;
                i18--;
                z14 = z11 ? 1 : 0;
            }
            z11 = z14;
            if (i18 >= 0 && iArr2[z11 ? 1 : 0] <= i17) {
                while (i18 >= 0 && c8660b.d(a12, i18)) {
                    int i21 = iArr2[0];
                    if (i21 > i17) {
                        break;
                    }
                    iArr2[0] = i21 + 1;
                    i18--;
                }
                if (iArr2[0] <= i17) {
                    int i22 = i11 + 1;
                    while (i22 < g10 && c8660b.d(a12, i22)) {
                        iArr2[2] = iArr2[2] + 1;
                        i22++;
                    }
                    if (i22 != g10) {
                        while (i22 < g10 && !c8660b.d(a12, i22)) {
                            int i23 = iArr2[3];
                            if (i23 >= i17) {
                                break;
                            }
                            iArr2[3] = i23 + 1;
                            i22++;
                        }
                        if (i22 != g10 && iArr2[3] < i17) {
                            while (i22 < g10 && c8660b.d(a12, i22)) {
                                int i24 = iArr2[4];
                                if (i24 >= i17) {
                                    break;
                                }
                                iArr2[4] = i24 + 1;
                                i22++;
                            }
                            int i25 = iArr2[4];
                            if (i25 < i17 && Math.abs(((((iArr2[0] + iArr2[z11 ? 1 : 0]) + iArr2[2]) + iArr2[3]) + i25) - i16) * 5 < i16 * 2 && c(iArr2)) {
                                a11 = a(iArr2, i22);
                                r16 = z11;
                                if (!Float.isNaN(a11)) {
                                    int i26 = (int) a11;
                                    int i27 = iArr[2];
                                    int j11 = c8660b.j();
                                    Arrays.fill(iArr2, 0);
                                    int i28 = a12;
                                    while (i28 >= 0 && c8660b.d(i28, i26)) {
                                        iArr2[2] = iArr2[2] + 1;
                                        i28--;
                                    }
                                    if (i28 < 0) {
                                        c11 = 2;
                                    } else {
                                        while (i28 >= 0 && !c8660b.d(i28, i26)) {
                                            c11 = c12;
                                            int i29 = iArr2[r16];
                                            if (i29 > i27) {
                                                break;
                                            }
                                            iArr2[r16] = i29 + 1;
                                            i28--;
                                            c12 = c11;
                                        }
                                        c11 = c12;
                                        if (i28 >= 0 && iArr2[r16] <= i27) {
                                            while (i28 >= 0 && c8660b.d(i28, i26)) {
                                                int i31 = iArr2[0];
                                                if (i31 > i27) {
                                                    break;
                                                }
                                                iArr2[0] = i31 + 1;
                                                i28--;
                                            }
                                            if (iArr2[0] <= i27) {
                                                int i32 = a12 + 1;
                                                while (i32 < j11 && c8660b.d(i32, i26)) {
                                                    iArr2[c11] = iArr2[c11] + 1;
                                                    i32++;
                                                }
                                                if (i32 != j11) {
                                                    while (i32 < j11 && !c8660b.d(i32, i26)) {
                                                        int i33 = iArr2[3];
                                                        if (i33 >= i27) {
                                                            break;
                                                        }
                                                        iArr2[3] = i33 + 1;
                                                        i32++;
                                                    }
                                                    if (i32 != j11 && iArr2[3] < i27) {
                                                        while (i32 < j11 && c8660b.d(i32, i26)) {
                                                            int i34 = iArr2[4];
                                                            if (i34 >= i27) {
                                                                break;
                                                            }
                                                            iArr2[4] = i34 + 1;
                                                            i32++;
                                                        }
                                                        int i35 = iArr2[4];
                                                        if (i35 < i27 && Math.abs(((((iArr2[0] + iArr2[r16]) + iArr2[c11]) + iArr2[3]) + i35) - i16) * 5 < i16 && c(iArr2)) {
                                                            f7 = a(iArr2, i32);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (!Float.isNaN(f7)) {
                                        int i36 = (int) f7;
                                        Arrays.fill(iArr2, 0);
                                        int i37 = 0;
                                        while (i26 >= i37 && i36 >= i37 && c8660b.d(i36 - i37, i26 - i37)) {
                                            iArr2[c11] = iArr2[c11] + 1;
                                            i37++;
                                        }
                                        if (iArr2[c11] != 0) {
                                            while (i26 >= i37 && i36 >= i37 && !c8660b.d(i36 - i37, i26 - i37)) {
                                                iArr2[r16] = iArr2[r16] + 1;
                                                i37++;
                                            }
                                            if (iArr2[r16] != 0) {
                                                while (i26 >= i37 && i36 >= i37 && c8660b.d(i36 - i37, i26 - i37)) {
                                                    iArr2[0] = iArr2[0] + 1;
                                                    i37++;
                                                }
                                                if (iArr2[0] != 0) {
                                                    int g11 = c8660b.g();
                                                    int j12 = c8660b.j();
                                                    int i38 = r16;
                                                    while (true) {
                                                        int i39 = i26 + i38;
                                                        z12 = z13;
                                                        if (i39 >= g11 || (i15 = i36 + i38) >= j12 || !c8660b.d(i15, i39)) {
                                                            break;
                                                        }
                                                        iArr2[c11] = iArr2[c11] + 1;
                                                        i38++;
                                                        z13 = z12 ? 1 : 0;
                                                    }
                                                    while (true) {
                                                        int i41 = i26 + i38;
                                                        if (i41 >= g11 || (i14 = i36 + i38) >= j12 || c8660b.d(i14, i41)) {
                                                            break;
                                                        }
                                                        iArr2[3] = iArr2[3] + 1;
                                                        i38++;
                                                    }
                                                    if (iArr2[3] == 0) {
                                                        return z12;
                                                    }
                                                    while (true) {
                                                        int i42 = i26 + i38;
                                                        if (i42 >= g11 || (i13 = i36 + i38) >= j12 || !c8660b.d(i13, i42)) {
                                                            break;
                                                        }
                                                        iArr2[4] = iArr2[4] + 1;
                                                        i38++;
                                                    }
                                                    if (iArr2[4] == 0) {
                                                        return z12;
                                                    }
                                                    int i43 = z12 ? 1 : 0;
                                                    int i44 = i43;
                                                    while (i43 < 5) {
                                                        int i45 = iArr2[i43];
                                                        if (i45 == 0) {
                                                            return z12;
                                                        }
                                                        i44 += i45;
                                                        i43++;
                                                    }
                                                    if (i44 < 7) {
                                                        return z12;
                                                    }
                                                    float f11 = i44 / 7.0f;
                                                    float f12 = f11 / 1.333f;
                                                    if (Math.abs(f11 - iArr2[z12 ? 1 : 0]) >= f12 || Math.abs(f11 - iArr2[r16]) >= f12 || Math.abs((f11 * 3.0f) - iArr2[c11]) >= 3.0f * f12 || Math.abs(f11 - iArr2[3]) >= f12 || Math.abs(f11 - iArr2[4]) >= f12) {
                                                        return z12;
                                                    }
                                                    float f13 = i16 / 7.0f;
                                                    int i46 = z12 ? 1 : 0;
                                                    while (true) {
                                                        ArrayList arrayList = this.f14217b;
                                                        if (i46 >= arrayList.size()) {
                                                            d dVar = new d(f7, a11, f13);
                                                            arrayList.add(dVar);
                                                            t tVar = this.f14220e;
                                                            if (tVar != null) {
                                                                tVar.a(dVar);
                                                            }
                                                            return r16;
                                                        }
                                                        d dVar2 = (d) arrayList.get(i46);
                                                        if (dVar2.e(f13, a11, f7)) {
                                                            arrayList.set(i46, dVar2.f(a11, f7, f13));
                                                            return r16;
                                                        }
                                                        i46++;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return false;
                            }
                        }
                    }
                }
            }
        }
        a11 = Float.NaN;
        r16 = z11;
        if (!Float.isNaN(a11)) {
        }
        return false;
    }
}
