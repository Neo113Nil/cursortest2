package J9;

import h9.m;
import h9.t;
import java.util.ArrayList;
import java.util.Iterator;
import o9.C8660b;

/* loaded from: classes9.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final C8660b f14202a;

    /* renamed from: c, reason: collision with root package name */
    private final int f14204c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14205d;

    /* renamed from: e, reason: collision with root package name */
    private final int f14206e;

    /* renamed from: f, reason: collision with root package name */
    private final int f14207f;

    /* renamed from: g, reason: collision with root package name */
    private final float f14208g;

    /* renamed from: i, reason: collision with root package name */
    private final t f14210i;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList f14203b = new ArrayList(5);

    /* renamed from: h, reason: collision with root package name */
    private final int[] f14209h = new int[3];

    b(C8660b c8660b, int i11, int i12, int i13, int i14, float f7, t tVar) {
        this.f14202a = c8660b;
        this.f14204c = i11;
        this.f14205d = i12;
        this.f14206e = i13;
        this.f14207f = i14;
        this.f14208g = f7;
        this.f14210i = tVar;
    }

    private boolean b(int[] iArr) {
        float f7 = this.f14208g;
        float f11 = f7 / 2.0f;
        for (int i11 = 0; i11 < 3; i11++) {
            if (Math.abs(f7 - iArr[i11]) >= f11) {
                return false;
            }
        }
        return true;
    }

    private a c(int i11, int i12, int[] iArr) {
        int i13 = iArr[0];
        int i14 = iArr[1];
        int i15 = i13 + i14 + iArr[2];
        float f7 = (i12 - r5) - (i14 / 2.0f);
        int i16 = (int) f7;
        int i17 = i14 * 2;
        C8660b c8660b = this.f14202a;
        int g10 = c8660b.g();
        int[] iArr2 = this.f14209h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i18 = i11;
        while (i18 >= 0 && c8660b.d(i16, i18)) {
            int i19 = iArr2[1];
            if (i19 > i17) {
                break;
            }
            iArr2[1] = i19 + 1;
            i18--;
        }
        float f11 = Float.NaN;
        if (i18 >= 0 && iArr2[1] <= i17) {
            while (i18 >= 0 && !c8660b.d(i16, i18)) {
                int i21 = iArr2[0];
                if (i21 > i17) {
                    break;
                }
                iArr2[0] = i21 + 1;
                i18--;
            }
            if (iArr2[0] <= i17) {
                int i22 = i11 + 1;
                while (i22 < g10 && c8660b.d(i16, i22)) {
                    int i23 = iArr2[1];
                    if (i23 > i17) {
                        break;
                    }
                    iArr2[1] = i23 + 1;
                    i22++;
                }
                if (i22 != g10 && iArr2[1] <= i17) {
                    while (i22 < g10 && !c8660b.d(i16, i22)) {
                        int i24 = iArr2[2];
                        if (i24 > i17) {
                            break;
                        }
                        iArr2[2] = i24 + 1;
                        i22++;
                    }
                    int i25 = iArr2[2];
                    if (i25 <= i17 && Math.abs(((iArr2[0] + iArr2[1]) + i25) - i15) * 5 < i15 * 2 && b(iArr2)) {
                        f11 = (i22 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f11)) {
            return null;
        }
        float f12 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList arrayList = this.f14203b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.e(f12, f11, f7)) {
                return aVar.f(f11, f7, f12);
            }
        }
        a aVar2 = new a(f7, f11, f12);
        arrayList.add(aVar2);
        t tVar = this.f14210i;
        if (tVar == null) {
            return null;
        }
        tVar.a(aVar2);
        return null;
    }

    final a a() throws m {
        C8660b c8660b;
        a c11;
        a c12;
        int i11 = this.f14204c;
        int i12 = this.f14206e + i11;
        int i13 = this.f14207f;
        int i14 = (i13 / 2) + this.f14205d;
        int[] iArr = new int[3];
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = ((i15 & 1) == 0 ? (i15 + 1) / 2 : -((i15 + 1) / 2)) + i14;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i17 = i11;
            while (true) {
                c8660b = this.f14202a;
                if (i17 >= i12 || c8660b.d(i17, i16)) {
                    break;
                }
                i17++;
            }
            int i18 = 0;
            while (i17 < i12) {
                if (!c8660b.d(i17, i16)) {
                    if (i18 == 1) {
                        i18++;
                    }
                    iArr[i18] = iArr[i18] + 1;
                } else if (i18 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i18 != 2) {
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                } else {
                    if (b(iArr) && (c12 = c(i16, i17, iArr)) != null) {
                        return c12;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i18 = 1;
                }
                i17++;
            }
            if (b(iArr) && (c11 = c(i16, i12, iArr)) != null) {
                return c11;
            }
        }
        ArrayList arrayList = this.f14203b;
        if (arrayList.isEmpty()) {
            throw m.a();
        }
        return (a) arrayList.get(0);
    }
}
