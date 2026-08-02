package N3;

import java.util.Collections;
import java.util.List;
import m3.C8050C;
import m3.C8065g;
import n3.C8434g;

/* loaded from: classes8.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    public final List<byte[]> f18468a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18469b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18470c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18471d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18472e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18473f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18474g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18475h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18476i;

    /* renamed from: j, reason: collision with root package name */
    public final int f18477j;

    /* renamed from: k, reason: collision with root package name */
    public final int f18478k;

    /* renamed from: l, reason: collision with root package name */
    public final float f18479l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18480m;

    /* renamed from: n, reason: collision with root package name */
    public final String f18481n;

    /* renamed from: o, reason: collision with root package name */
    public final C8434g.k f18482o;

    private C(List list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, float f7, int i22, String str, C8434g.k kVar) {
        this.f18468a = list;
        this.f18469b = i11;
        this.f18470c = i12;
        this.f18471d = i13;
        this.f18472e = i14;
        this.f18473f = i15;
        this.f18474g = i16;
        this.f18475h = i17;
        this.f18476i = i18;
        this.f18477j = i19;
        this.f18478k = i21;
        this.f18479l = f7;
        this.f18480m = i22;
        this.f18481n = str;
        this.f18482o = kVar;
    }

    public static C a(C8050C c8050c) throws j3.v {
        return b(c8050c, false, null);
    }

    private static C b(C8050C c8050c, boolean z11, C8434g.k kVar) throws j3.v {
        boolean z12;
        C8434g.C1287g h11;
        int i11;
        int i12 = 4;
        try {
            if (z11) {
                c8050c.S(4);
            } else {
                c8050c.S(21);
            }
            int E11 = c8050c.E() & 3;
            int E12 = c8050c.E();
            int f7 = c8050c.f();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                z12 = true;
                if (i14 >= E12) {
                    break;
                }
                c8050c.S(1);
                int L11 = c8050c.L();
                for (int i16 = 0; i16 < L11; i16++) {
                    int L12 = c8050c.L();
                    i15 += L12 + 4;
                    c8050c.S(L12);
                }
                i14++;
            }
            c8050c.R(f7);
            byte[] bArr = new byte[i15];
            C8434g.k kVar2 = kVar;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f11 = 1.0f;
            String str = null;
            int i28 = 0;
            int i29 = 0;
            while (i28 < E12) {
                int E13 = c8050c.E() & 63;
                int L13 = c8050c.L();
                int i31 = i13;
                C8434g.k kVar3 = kVar2;
                while (i31 < L13) {
                    boolean z13 = z12;
                    int L14 = c8050c.L();
                    int i32 = E11;
                    System.arraycopy(C8434g.f76385a, i13, bArr, i29, i12);
                    int i33 = i29 + 4;
                    System.arraycopy(c8050c.e(), c8050c.f(), bArr, i33, L14);
                    if (E13 == 32 && i31 == 0) {
                        kVar3 = C8434g.j(i33, i33 + L14, bArr);
                    } else {
                        if (E13 == 33 && i31 == 0) {
                            C8434g.h i34 = C8434g.i(bArr, i33, i33 + L14, kVar3);
                            i17 = i34.f76410a + 1;
                            i18 = i34.f76416g;
                            int i35 = i34.f76417h;
                            i21 = i34.f76412c + 8;
                            i22 = i34.f76413d + 8;
                            int i36 = i34.f76420k;
                            i19 = i35;
                            int i37 = i34.f76421l;
                            int i38 = i34.f76422m;
                            float f12 = i34.f76418i;
                            int i39 = i34.f76419j;
                            C8434g.c cVar = i34.f76411b;
                            if (cVar != null) {
                                i11 = i39;
                                str = C8065g.a(cVar.f76394a, cVar.f76395b, cVar.f76396c, cVar.f76397d, cVar.f76398e, cVar.f76399f);
                            } else {
                                i11 = i39;
                            }
                            i27 = i11;
                            f11 = f12;
                            i25 = i38;
                            i24 = i37;
                            i23 = i36;
                        } else if (E13 == 39 && i31 == 0 && (h11 = C8434g.h(i33, i33 + L14, bArr)) != null && kVar3 != null) {
                            i13 = 0;
                            i26 = h11.f76409a == kVar3.f76428a.get(0).f76390b ? 4 : 5;
                        }
                        i13 = 0;
                    }
                    i29 = i33 + L14;
                    c8050c.S(L14);
                    i31++;
                    z12 = z13;
                    E11 = i32;
                    i12 = 4;
                }
                i28++;
                kVar2 = kVar3;
                i12 = 4;
            }
            return new C(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), E11 + 1, i17, i18, i19, i21, i22, i23, i24, i25, i26, f11, i27, str, kVar2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw j3.v.a(e11, "Error parsing".concat(z11 ? "L-HEVC config" : "HEVC config"));
        }
    }

    public static C c(C8050C c8050c, C8434g.k kVar) throws j3.v {
        return b(c8050c, true, kVar);
    }
}
