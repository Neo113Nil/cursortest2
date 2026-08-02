package A9;

import B9.j;
import C.o0;
import androidx.recyclerview.widget.m;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import h9.EnumC6876a;
import h9.h;
import h9.q;
import h9.s;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import o9.C8659a;
import y9.r;
import z9.AbstractC11003a;
import z9.C11004b;

/* loaded from: classes9.dex */
public final class c extends AbstractC11003a {

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f559k = {7, 5, 4, 3, 1};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f560l = {4, 20, 52, 104, 204};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f561m = {0, 348, 1388, 2948, 3988};

    /* renamed from: n, reason: collision with root package name */
    private static final int[][] f562n = {new int[]{1, 8, 4, 1}, new int[]{3, 6, 4, 1}, new int[]{3, 4, 6, 1}, new int[]{3, 2, 8, 1}, new int[]{2, 6, 5, 1}, new int[]{2, 2, 9, 1}};

    /* renamed from: o, reason: collision with root package name */
    private static final int[][] f563o = {new int[]{1, 3, 9, 27, 81, 32, 96, 77}, new int[]{20, 60, 180, 118, 143, 7, 21, 63}, new int[]{189, 145, 13, 39, 117, 140, 209, 205}, new int[]{193, 157, 49, 147, 19, 57, 171, 91}, new int[]{62, 186, 136, 197, 169, 85, 44, 132}, new int[]{185, 133, 188, 142, 4, 12, 36, 108}, new int[]{113, UserVerificationMethods.USER_VERIFY_PATTERN, 173, 97, 80, 29, 87, 50}, new int[]{150, 28, 84, 41, 123, 158, 52, 156}, new int[]{46, 138, 203, 187, 139, 206, 196, 166}, new int[]{76, 17, 51, 153, 37, 111, 122, 155}, new int[]{43, 129, 176, 106, 107, 110, 119, 146}, new int[]{16, 48, 144, 10, 30, 90, 59, 177}, new int[]{109, 116, 137, m.e.DEFAULT_DRAG_ANIMATION_DURATION, 178, 112, 125, 164}, new int[]{70, 210, 208, 202, 184, 130, 179, 115}, new int[]{134, 191, 151, 31, 93, 68, 204, 190}, new int[]{148, 22, 66, 198, 172, 94, 71, 2}, new int[]{6, 18, 54, 162, 64, 192, 154, 40}, new int[]{120, 149, 25, 75, 14, 42, 126, 167}, new int[]{79, 26, 78, 23, 69, 207, 199, 175}, new int[]{103, 98, 83, 38, 114, 131, 182, 124}, new int[]{161, 61, 183, 127, 170, 88, 53, 159}, new int[]{55, 165, 73, 8, 24, 72, 5, 15}, new int[]{45, 135, 194, 160, 58, 174, 100, 89}};

    /* renamed from: p, reason: collision with root package name */
    private static final int[][] f564p = {new int[]{0, 0}, new int[]{0, 1, 1}, new int[]{0, 2, 1, 3}, new int[]{0, 4, 1, 3, 2}, new int[]{0, 4, 1, 3, 3, 5}, new int[]{0, 4, 1, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 2, 3, 3}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 4}, new int[]{0, 0, 1, 1, 2, 2, 3, 4, 5, 5}, new int[]{0, 0, 1, 1, 2, 3, 3, 4, 4, 5, 5}};

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList f565g = new ArrayList(11);

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f566h = new ArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final int[] f567i = new int[2];

    /* renamed from: j, reason: collision with root package name */
    private boolean f568j;

    private boolean p() {
        ArrayList arrayList = this.f565g;
        a aVar = (a) arrayList.get(0);
        C11004b b11 = aVar.b();
        C11004b c11 = aVar.c();
        if (c11 != null) {
            int a11 = c11.a();
            int i11 = 2;
            for (int i12 = 1; i12 < arrayList.size(); i12++) {
                a aVar2 = (a) arrayList.get(i12);
                int a12 = aVar2.b().a() + a11;
                int i13 = i11 + 1;
                C11004b c12 = aVar2.c();
                if (c12 != null) {
                    a11 = c12.a() + a12;
                    i11 += 2;
                } else {
                    i11 = i13;
                    a11 = a12;
                }
            }
            if (((i11 - 4) * 211) + (a11 % 211) == b11.b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (p() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r1 = new java.util.ArrayList(r11);
        r1.add(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0075, code lost:
    
        return q(r10 + 1, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0079, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0066, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private List q(int i11, ArrayList arrayList) throws h9.m {
        while (true) {
            ArrayList arrayList2 = this.f566h;
            if (i11 >= arrayList2.size()) {
                throw h9.m.a();
            }
            b bVar = (b) arrayList2.get(i11);
            ArrayList arrayList3 = this.f565g;
            arrayList3.clear();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList3.addAll(((b) it.next()).a());
            }
            arrayList3.addAll(bVar.a());
            int[][] iArr = f564p;
            int i12 = 0;
            while (true) {
                if (i12 < 10) {
                    int[] iArr2 = iArr[i12];
                    if (arrayList3.size() <= iArr2.length) {
                        for (int i13 = 0; i13 < arrayList3.size(); i13++) {
                            if (((a) arrayList3.get(i13)).a().c() != iArr2[i13]) {
                                break;
                            }
                        }
                        break;
                    }
                    i12++;
                }
            }
            i11++;
        }
    }

    private List<a> r(boolean z11) {
        ArrayList arrayList = this.f566h;
        List<a> list = null;
        if (arrayList.size() > 25) {
            arrayList.clear();
            return null;
        }
        this.f565g.clear();
        if (z11) {
            Collections.reverse(arrayList);
        }
        try {
            list = q(0, new ArrayList());
        } catch (h9.m unused) {
        }
        if (z11) {
            Collections.reverse(arrayList);
        }
        return list;
    }

    static q s(List<a> list) throws h9.m, h {
        int size = list.size() << 1;
        int i11 = size - 1;
        if (list.get(list.size() - 1).c() == null) {
            i11 = size - 2;
        }
        C8659a c8659a = new C8659a(i11 * 12);
        int b11 = list.get(0).c().b();
        int i12 = 0;
        for (int i13 = 11; i13 >= 0; i13--) {
            if (((1 << i13) & b11) != 0) {
                c8659a.n(i12);
            }
            i12++;
        }
        for (int i14 = 1; i14 < list.size(); i14++) {
            a aVar = list.get(i14);
            int b12 = aVar.b().b();
            for (int i15 = 11; i15 >= 0; i15--) {
                if (((1 << i15) & b12) != 0) {
                    c8659a.n(i12);
                }
                i12++;
            }
            if (aVar.c() != null) {
                int b13 = aVar.c().b();
                for (int i16 = 11; i16 >= 0; i16--) {
                    if (((1 << i16) & b13) != 0) {
                        c8659a.n(i12);
                    }
                    i12++;
                }
            }
        }
        String d11 = j.a(c8659a).d();
        s[] a11 = list.get(0).a().a();
        s[] a12 = list.get(list.size() - 1).a().a();
        return new q(d11, null, new s[]{a11[0], a11[1], a12[0], a12[1]}, EnumC6876a.RSS_EXPANDED);
    }

    private void v(C8659a c8659a, ArrayList arrayList, int i11) throws h9.m {
        ArrayList arrayList2;
        int i12;
        int[] i13 = i();
        i13[0] = 0;
        i13[1] = 0;
        i13[2] = 0;
        i13[3] = 0;
        int j11 = c8659a.j();
        if (i11 >= 0) {
            arrayList2 = arrayList;
            i12 = i11;
        } else if (arrayList.isEmpty()) {
            arrayList2 = arrayList;
            i12 = 0;
        } else {
            arrayList2 = arrayList;
            i12 = ((a) o0.b(1, arrayList2)).a().b()[1];
        }
        boolean z11 = arrayList2.size() % 2 != 0;
        if (this.f568j) {
            z11 = !z11;
        }
        boolean z12 = false;
        while (true) {
            if (i12 >= j11) {
                break;
            }
            boolean f7 = c8659a.f(i12);
            boolean z13 = !f7;
            if (f7) {
                z12 = z13;
                break;
            } else {
                i12++;
                z12 = z13;
            }
        }
        int i14 = 0;
        boolean z14 = z12;
        int i15 = i12;
        while (i12 < j11) {
            if (c8659a.f(i12) != z14) {
                i13[i14] = i13[i14] + 1;
            } else {
                if (i14 == 3) {
                    if (z11) {
                        int length = i13.length;
                        for (int i16 = 0; i16 < length / 2; i16++) {
                            int i17 = i13[i16];
                            int i18 = (length - i16) - 1;
                            i13[i16] = i13[i18];
                            i13[i18] = i17;
                        }
                    }
                    if (AbstractC11003a.o(i13)) {
                        int[] iArr = this.f567i;
                        iArr[0] = i15;
                        iArr[1] = i12;
                        return;
                    }
                    if (z11) {
                        int length2 = i13.length;
                        for (int i19 = 0; i19 < length2 / 2; i19++) {
                            int i21 = i13[i19];
                            int i22 = (length2 - i19) - 1;
                            i13[i19] = i13[i22];
                            i13[i22] = i21;
                        }
                    }
                    i15 += i13[0] + i13[1];
                    i13[0] = i13[2];
                    i13[1] = i13[3];
                    i13[2] = 0;
                    i13[3] = 0;
                    i14--;
                } else {
                    i14++;
                }
                i13[i14] = 1;
                z14 = !z14;
            }
            i12++;
        }
        throw h9.m.a();
    }

    @Override // y9.r
    public final q b(int i11, C8659a c8659a, EnumMap enumMap) throws h9.m, h {
        ArrayList arrayList = this.f565g;
        arrayList.clear();
        this.f568j = false;
        try {
            return s(u(i11, c8659a));
        } catch (h9.m unused) {
            arrayList.clear();
            this.f568j = true;
            return s(u(i11, c8659a));
        }
    }

    @Override // y9.r, h9.o
    public final void reset() {
        this.f565g.clear();
        this.f566h.clear();
    }

    final C11004b t(C8659a c8659a, z9.c cVar, boolean z11, boolean z12) throws h9.m {
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int[][] iArr;
        int[] h11 = h();
        Arrays.fill(h11, 0);
        if (z12) {
            r.f(cVar.b()[0], c8659a, h11);
        } else {
            r.e(cVar.b()[1], c8659a, h11);
            int i11 = 0;
            for (int length = h11.length - 1; i11 < length; length--) {
                int i12 = h11[i11];
                h11[i11] = h11[length];
                h11[length] = i12;
                i11++;
            }
        }
        float f7 = Ql0.h.f(h11) / 17.0f;
        float f11 = (cVar.b()[1] - cVar.b()[0]) / 15.0f;
        if (Math.abs(f7 - f11) / f11 > 0.3f) {
            throw h9.m.a();
        }
        int[] l11 = l();
        int[] j11 = j();
        float[] m11 = m();
        float[] k11 = k();
        for (int i13 = 0; i13 < h11.length; i13++) {
            float f12 = (h11[i13] * 1.0f) / f7;
            int i14 = (int) (0.5f + f12);
            if (i14 <= 0) {
                if (f12 < 0.3f) {
                    throw h9.m.a();
                }
                i14 = 1;
            } else if (i14 > 8) {
                if (f12 > 8.7f) {
                    throw h9.m.a();
                }
                i14 = 8;
            }
            int i15 = i13 / 2;
            if ((i13 & 1) == 0) {
                l11[i15] = i14;
                m11[i15] = f12 - i14;
            } else {
                j11[i15] = i14;
                k11[i15] = f12 - i14;
            }
        }
        int f13 = Ql0.h.f(l());
        int f14 = Ql0.h.f(j());
        if (f13 > 13) {
            z13 = false;
            z14 = true;
        } else if (f13 < 4) {
            z14 = false;
            z13 = true;
        } else {
            z13 = false;
            z14 = false;
        }
        if (f14 > 13) {
            z15 = false;
            z16 = true;
        } else if (f14 < 4) {
            z16 = false;
            z15 = true;
        } else {
            z15 = false;
            z16 = false;
        }
        int i16 = (f13 + f14) - 17;
        boolean z17 = (f13 & 1) == 1;
        boolean z18 = (f14 & 1) == 0;
        boolean z19 = z13;
        boolean z21 = z14;
        boolean z22 = z15;
        boolean z23 = z16;
        if (i16 != -1) {
            if (i16 != 0) {
                if (i16 != 1) {
                    throw h9.m.a();
                }
                if (z17) {
                    if (z18) {
                        throw h9.m.a();
                    }
                    z21 = true;
                    z19 = z13;
                    z22 = z15;
                    z23 = z16;
                } else {
                    if (!z18) {
                        throw h9.m.a();
                    }
                    z23 = true;
                    z19 = z13;
                    z21 = z14;
                    z22 = z15;
                }
            } else if (z17) {
                if (!z18) {
                    throw h9.m.a();
                }
                if (f13 < f14) {
                    z19 = true;
                    z23 = true;
                    z21 = z14;
                    z22 = z15;
                } else {
                    z21 = true;
                    z22 = true;
                    z19 = z13;
                    z23 = z16;
                }
            } else if (z18) {
                throw h9.m.a();
            }
        } else if (z17) {
            if (z18) {
                throw h9.m.a();
            }
            z19 = true;
            z21 = z14;
            z22 = z15;
            z23 = z16;
        } else {
            if (!z18) {
                throw h9.m.a();
            }
            z22 = true;
            z19 = z13;
            z21 = z14;
            z23 = z16;
        }
        if (z19) {
            if (z21) {
                throw h9.m.a();
            }
            AbstractC11003a.n(m(), l());
        }
        if (z21) {
            AbstractC11003a.g(m(), l());
        }
        if (z22) {
            if (z23) {
                throw h9.m.a();
            }
            AbstractC11003a.n(m(), j());
        }
        if (z23) {
            AbstractC11003a.g(k(), j());
        }
        int c11 = (((cVar.c() * 4) + (z11 ? 0 : 2)) + (!z12 ? 1 : 0)) - 1;
        int length2 = l11.length - 1;
        int i17 = 0;
        int i18 = 0;
        while (true) {
            iArr = f563o;
            if (length2 < 0) {
                break;
            }
            if (cVar.c() != 0 || !z11 || !z12) {
                i17 += l11[length2] * iArr[c11][length2 * 2];
            }
            i18 += l11[length2];
            length2--;
        }
        int i19 = 0;
        for (int length3 = j11.length - 1; length3 >= 0; length3--) {
            if (cVar.c() != 0 || !z11 || !z12) {
                i19 += j11[length3] * iArr[c11][(length3 * 2) + 1];
            }
        }
        int i21 = i17 + i19;
        if ((i18 & 1) != 0 || i18 > 13 || i18 < 4) {
            throw h9.m.a();
        }
        int i22 = (13 - i18) / 2;
        int i23 = f559k[i22];
        return new C11004b((Ql0.h.d(l11, i23, true) * f560l[i22]) + Ql0.h.d(j11, 9 - i23, false) + f561m[i22], i21);
    }

    final List<a> u(int i11, C8659a c8659a) throws h9.m {
        boolean z11;
        boolean z12;
        boolean z13 = false;
        while (true) {
            ArrayList arrayList = this.f565g;
            if (z13) {
                if (p()) {
                    return arrayList;
                }
                ArrayList arrayList2 = this.f566h;
                boolean isEmpty = arrayList2.isEmpty();
                int i12 = 0;
                boolean z14 = false;
                while (true) {
                    if (i12 >= arrayList2.size()) {
                        z11 = false;
                        break;
                    }
                    b bVar = (b) arrayList2.get(i12);
                    if (bVar.b() > i11) {
                        z11 = bVar.c(arrayList);
                        break;
                    }
                    z14 = bVar.c(arrayList);
                    i12++;
                }
                if (!z11 && !z14) {
                    Iterator it = arrayList2.iterator();
                    loop2: while (true) {
                        if (!it.hasNext()) {
                            z12 = false;
                            break;
                        }
                        b bVar2 = (b) it.next();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            a aVar = (a) it2.next();
                            Iterator it3 = bVar2.a().iterator();
                            while (it3.hasNext()) {
                                if (aVar.equals((a) it3.next())) {
                                    break;
                                }
                            }
                        }
                        z12 = true;
                        break loop2;
                    }
                    if (!z12) {
                        arrayList2.add(i12, new b(i11, arrayList));
                        Iterator it4 = arrayList2.iterator();
                        while (it4.hasNext()) {
                            b bVar3 = (b) it4.next();
                            if (bVar3.a().size() != arrayList.size()) {
                                Iterator it5 = bVar3.a().iterator();
                                while (true) {
                                    if (!it5.hasNext()) {
                                        it4.remove();
                                        break;
                                    }
                                    if (!arrayList.contains((a) it5.next())) {
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                if (!isEmpty) {
                    List<a> r11 = r(false);
                    if (r11 != null) {
                        return r11;
                    }
                    List<a> r12 = r(true);
                    if (r12 != null) {
                        return r12;
                    }
                }
                throw h9.m.a();
            }
            try {
                arrayList.add(w(c8659a, arrayList, i11));
            } catch (h9.m e11) {
                if (arrayList.isEmpty()) {
                    throw e11;
                }
                z13 = true;
            }
        }
    }

    final a w(C8659a c8659a, ArrayList arrayList, int i11) throws h9.m {
        int i12;
        int i13;
        int i14;
        z9.c cVar;
        C11004b c11004b;
        int[][] iArr;
        int i15;
        boolean z11 = arrayList.size() % 2 == 0;
        if (this.f568j) {
            z11 = !z11;
        }
        int i16 = -1;
        boolean z12 = true;
        do {
            v(c8659a, arrayList, i16);
            int[] iArr2 = this.f567i;
            if (z11) {
                int i17 = iArr2[0] - 1;
                while (i17 >= 0 && !c8659a.f(i17)) {
                    i17--;
                }
                i12 = i17 + 1;
                i14 = iArr2[0] - i12;
                i13 = iArr2[1];
            } else {
                i12 = iArr2[0];
                i13 = c8659a.i(iArr2[1] + 1);
                i14 = i13 - iArr2[1];
            }
            int i18 = i12;
            int i19 = i13;
            int[] i21 = i();
            System.arraycopy(i21, 0, i21, 1, i21.length - 1);
            i21[0] = i14;
            try {
                iArr = f562n;
            } catch (h9.m unused) {
                cVar = null;
            }
            for (i15 = 0; i15 < 6; i15++) {
                if (r.d(i21, iArr[i15], 0.45f) < 0.2f) {
                    cVar = new z9.c(i15, i18, i19, i11, new int[]{i18, i19});
                    if (cVar == null) {
                        int i22 = iArr2[0];
                        i16 = c8659a.f(i22) ? c8659a.h(c8659a.i(i22)) : c8659a.i(c8659a.h(i22));
                    } else {
                        z12 = false;
                    }
                }
            }
            throw h9.m.a();
        } while (z12);
        C11004b t2 = t(c8659a, cVar, z11, true);
        if (!arrayList.isEmpty() && ((a) o0.b(1, arrayList)).d()) {
            throw h9.m.a();
        }
        try {
            c11004b = t(c8659a, cVar, z11, false);
        } catch (h9.m unused2) {
            c11004b = null;
        }
        return new a(t2, c11004b, cVar);
    }
}
