package p139t2;

import A1.AbstractC0023i;
import A1.X;
import E3.AbstractC0161t;
import E3.J;
import E3.L;
import E3.T;
import com.google.android.gms.common.api.f;
import p018c2.e0;
import p151v2.t;

/* JADX INFO: loaded from: classes.dex */
public final class o extends n {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int f16376A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final int f16377B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final int f16378C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final boolean f16379D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final boolean f16380E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int f16381F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final boolean f16382G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final boolean f16383H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final int f16384I;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16385e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i f16386f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f16387x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f16388y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f16389z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:31:0x004d  */
    /* JADX WARN: Code duplicated, block: B:51:0x007b  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    public o(int i7, e0 e0Var, int i8, i iVar, int i9, int i10, boolean z4) {
        boolean z7;
        boolean z8;
        boolean z9;
        X x4;
        int i11;
        int i12;
        int i13;
        X x7;
        int i14;
        int i15;
        int i16;
        super(i7, e0Var, i8);
        int i17 = 3;
        int i18 = 0;
        this.f16386f = iVar;
        int i19 = iVar.f16350T ? 24 : 16;
        this.f16380E = iVar.f16349S && (i10 & i19) != 0;
        if (!z4 || (((i14 = (x7 = this.f16375d).f288H) != -1 && i14 > iVar.f16440a) || ((i15 = x7.f289I) != -1 && i15 > iVar.f16441b))) {
            z7 = false;
        } else {
            float f7 = x7.f290J;
            if ((f7 == -1.0f || f7 <= iVar.f16442c) && ((i16 = x7.f311y) == -1 || i16 <= iVar.f16443d)) {
                z7 = true;
            } else {
                z7 = false;
            }
        }
        this.f16385e = z7;
        if (!z4 || (((i11 = (x4 = this.f16375d).f288H) != -1 && i11 < iVar.f16444e) || ((i12 = x4.f289I) != -1 && i12 < iVar.f16445f))) {
            z8 = false;
        } else {
            float f8 = x4.f290J;
            if ((f8 == -1.0f || f8 >= iVar.f16446x) && ((i13 = x4.f311y) == -1 || i13 >= iVar.f16447y)) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        this.f16387x = z8;
        this.f16388y = p.e(i9, false);
        X x8 = this.f16375d;
        this.f16389z = x8.f311y;
        this.f16376A = x8.b();
        this.f16378C = p.b(this.f16375d.f308e, iVar.f16426D);
        int i20 = this.f16375d.f308e;
        this.f16379D = i20 == 0 || (i20 & 1) != 0;
        int i21 = 0;
        while (true) {
            L l7 = iVar.f16425C;
            if (i21 >= l7.size()) {
                i21 = f.API_PRIORITY_OTHER;
                break;
            }
            String str = this.f16375d.f283C;
            if (str != null && str.equals(l7.get(i21))) {
                break;
            } else {
                i21++;
            }
        }
        this.f16377B = i21;
        this.f16382G = AbstractC0023i.g(i9) == 128;
        this.f16383H = AbstractC0023i.h(i9) == 64;
        String str2 = this.f16375d.f283C;
        if (str2 != null) {
            switch (str2) {
                case "video/av01":
                    i17 = 4;
                    break;
                case "video/hevc":
                    break;
                case "video/avc":
                    i17 = 1;
                    break;
                case "video/x-vnd.on2.vp9":
                    i17 = 2;
                    break;
                default:
                    i17 = 0;
                    break;
            }
        } else {
            i17 = 0;
        }
        this.f16384I = i17;
        X x9 = this.f16375d;
        if ((x9.f308e & 16384) == 0) {
            i iVar2 = this.f16386f;
            if (p.e(i9, iVar2.f16358b0) && ((z9 = this.f16385e) || iVar2.f16348R)) {
                i18 = (!p.e(i9, false) || !this.f16387x || !z9 || x9.f311y == -1 || iVar2.f16437O || iVar2.f16436N || (i19 & i9) == 0) ? 1 : 2;
            }
        }
        this.f16381F = i18;
    }

    public static int c(o oVar, o oVar2) {
        AbstractC0161t abstractC0161tC = AbstractC0161t.f2068a.c(oVar.f16388y, oVar2.f16388y).a(oVar.f16378C, oVar2.f16378C).c(oVar.f16379D, oVar2.f16379D).c(oVar.f16385e, oVar2.f16385e).c(oVar.f16387x, oVar2.f16387x);
        Integer numValueOf = Integer.valueOf(oVar.f16377B);
        Integer numValueOf2 = Integer.valueOf(oVar2.f16377B);
        J.f1999a.getClass();
        AbstractC0161t abstractC0161tB = abstractC0161tC.b(numValueOf, numValueOf2, T.f2026a);
        boolean z4 = oVar2.f16382G;
        boolean z7 = oVar.f16382G;
        AbstractC0161t abstractC0161tC2 = abstractC0161tB.c(z7, z4);
        boolean z8 = oVar2.f16383H;
        boolean z9 = oVar.f16383H;
        AbstractC0161t abstractC0161tC3 = abstractC0161tC2.c(z9, z8);
        if (z7 && z9) {
            abstractC0161tC3 = abstractC0161tC3.a(oVar.f16384I, oVar2.f16384I);
        }
        return abstractC0161tC3.e();
    }

    @Override // p139t2.n
    public final int a() {
        return this.f16381F;
    }

    @Override // p139t2.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f16380E || t.a(this.f16375d.f283C, oVar.f16375d.f283C)) {
            if (!this.f16386f.f16351U) {
                if (this.f16382G != oVar.f16382G || this.f16383H != oVar.f16383H) {
                }
            }
            return true;
        }
        return false;
    }
}
