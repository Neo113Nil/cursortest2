package t2;

import A1.AbstractC0023i;
import A1.X;
import E3.AbstractC0161t;
import E3.J;
import E3.K;
import E3.L;
import E3.T;
import android.text.TextUtils;
import c2.e0;

/* loaded from: classes.dex */
public final class f extends n implements Comparable {

    /* renamed from: A, reason: collision with root package name */
    public final int f16306A;

    /* renamed from: B, reason: collision with root package name */
    public final int f16307B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16308C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f16309D;

    /* renamed from: E, reason: collision with root package name */
    public final int f16310E;

    /* renamed from: F, reason: collision with root package name */
    public final int f16311F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f16312G;

    /* renamed from: H, reason: collision with root package name */
    public final int f16313H;

    /* renamed from: I, reason: collision with root package name */
    public final int f16314I;

    /* renamed from: J, reason: collision with root package name */
    public final int f16315J;

    /* renamed from: K, reason: collision with root package name */
    public final int f16316K;

    /* renamed from: L, reason: collision with root package name */
    public final boolean f16317L;

    /* renamed from: M, reason: collision with root package name */
    public final boolean f16318M;

    /* renamed from: e, reason: collision with root package name */
    public final int f16319e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f16320f;

    /* renamed from: x, reason: collision with root package name */
    public final String f16321x;

    /* renamed from: y, reason: collision with root package name */
    public final i f16322y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f16323z;

    public f(int i7, e0 e0Var, int i8, i iVar, int i9, boolean z4, e eVar) {
        super(i7, e0Var, i8);
        int i10;
        int i11;
        int i12;
        boolean z7;
        this.f16322y = iVar;
        this.f16321x = p.g(this.f16369d.f306c);
        int i13 = 0;
        this.f16323z = p.e(i9, false);
        int i14 = 0;
        while (true) {
            int size = iVar.f16421E.size();
            i10 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            if (i14 >= size) {
                i11 = 0;
                i14 = Integer.MAX_VALUE;
                break;
            } else {
                i11 = p.d(this.f16369d, (String) iVar.f16421E.get(i14), false);
                if (i11 > 0) {
                    break;
                } else {
                    i14++;
                }
            }
        }
        this.f16307B = i14;
        this.f16306A = i11;
        this.f16308C = p.b(this.f16369d.f308e, iVar.f16422F);
        X x4 = this.f16369d;
        int i15 = x4.f308e;
        this.f16309D = i15 == 0 || (i15 & 1) != 0;
        this.f16312G = (x4.f307d & 1) != 0;
        int i16 = x4.f296P;
        this.f16313H = i16;
        this.f16314I = x4.f297Q;
        int i17 = x4.f311y;
        this.f16315J = i17;
        this.f16320f = (i17 == -1 || i17 <= iVar.f16424H) && (i16 == -1 || i16 <= iVar.f16423G) && eVar.apply(x4);
        String[] z8 = v2.t.z();
        int i18 = 0;
        while (true) {
            if (i18 >= z8.length) {
                i12 = 0;
                i18 = Integer.MAX_VALUE;
                break;
            } else {
                i12 = p.d(this.f16369d, z8[i18], false);
                if (i12 > 0) {
                    break;
                } else {
                    i18++;
                }
            }
        }
        this.f16310E = i18;
        this.f16311F = i12;
        int i19 = 0;
        while (true) {
            L l7 = iVar.f16425I;
            if (i19 < l7.size()) {
                String str = this.f16369d.f283C;
                if (str != null && str.equals(l7.get(i19))) {
                    i10 = i19;
                    break;
                }
                i19++;
            } else {
                break;
            }
        }
        this.f16316K = i10;
        this.f16317L = AbstractC0023i.g(i9) == 128;
        this.f16318M = AbstractC0023i.h(i9) == 64;
        i iVar2 = this.f16322y;
        if (p.e(i9, iVar2.f16352b0) && ((z7 = this.f16320f) || iVar2.f16346V)) {
            i13 = (!p.e(i9, false) || !z7 || this.f16369d.f311y == -1 || iVar2.f16431O || iVar2.f16430N || (!iVar2.f16353d0 && z4)) ? 1 : 2;
        }
        this.f16319e = i13;
    }

    @Override // t2.n
    public final int a() {
        return this.f16319e;
    }

    @Override // t2.n
    public final boolean b(n nVar) {
        int i7;
        String str;
        int i8;
        f fVar = (f) nVar;
        i iVar = this.f16322y;
        boolean z4 = iVar.f16349Y;
        X x4 = fVar.f16369d;
        X x7 = this.f16369d;
        if ((z4 || ((i8 = x7.f296P) != -1 && i8 == x4.f296P)) && ((iVar.f16347W || ((str = x7.f283C) != null && TextUtils.equals(str, x4.f283C))) && (iVar.f16348X || ((i7 = x7.f297Q) != -1 && i7 == x4.f297Q)))) {
            if (!iVar.f16350Z) {
                if (this.f16317L != fVar.f16317L || this.f16318M != fVar.f16318M) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final int compareTo(f fVar) {
        boolean z4 = this.f16323z;
        boolean z7 = this.f16320f;
        K a2 = (z7 && z4) ? p.f16384i : p.f16384i.a();
        AbstractC0161t c3 = AbstractC0161t.f2068a.c(z4, fVar.f16323z);
        Integer valueOf = Integer.valueOf(this.f16307B);
        Integer valueOf2 = Integer.valueOf(fVar.f16307B);
        J.f1999a.getClass();
        T t7 = T.f2026a;
        AbstractC0161t b7 = c3.b(valueOf, valueOf2, t7).a(this.f16306A, fVar.f16306A).a(this.f16308C, fVar.f16308C).c(this.f16312G, fVar.f16312G).c(this.f16309D, fVar.f16309D).b(Integer.valueOf(this.f16310E), Integer.valueOf(fVar.f16310E), t7).a(this.f16311F, fVar.f16311F).c(z7, fVar.f16320f).b(Integer.valueOf(this.f16316K), Integer.valueOf(fVar.f16316K), t7);
        int i7 = this.f16315J;
        Integer valueOf3 = Integer.valueOf(i7);
        int i8 = fVar.f16315J;
        AbstractC0161t b8 = b7.b(valueOf3, Integer.valueOf(i8), this.f16322y.f16430N ? p.f16384i.a() : p.j).c(this.f16317L, fVar.f16317L).c(this.f16318M, fVar.f16318M).b(Integer.valueOf(this.f16313H), Integer.valueOf(fVar.f16313H), a2).b(Integer.valueOf(this.f16314I), Integer.valueOf(fVar.f16314I), a2);
        Integer valueOf4 = Integer.valueOf(i7);
        Integer valueOf5 = Integer.valueOf(i8);
        if (!v2.t.a(this.f16321x, fVar.f16321x)) {
            a2 = p.j;
        }
        return b8.b(valueOf4, valueOf5, a2).e();
    }
}
