package t2;

import A1.AbstractC0023i;
import A1.X;
import E3.AbstractC0161t;
import E3.J;
import E3.L;
import E3.T;
import c2.e0;

/* loaded from: classes.dex */
public final class o extends n {

    /* renamed from: A, reason: collision with root package name */
    public final int f16370A;

    /* renamed from: B, reason: collision with root package name */
    public final int f16371B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16372C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f16373D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f16374E;

    /* renamed from: F, reason: collision with root package name */
    public final int f16375F;

    /* renamed from: G, reason: collision with root package name */
    public final boolean f16376G;

    /* renamed from: H, reason: collision with root package name */
    public final boolean f16377H;

    /* renamed from: I, reason: collision with root package name */
    public final int f16378I;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f16379e;

    /* renamed from: f, reason: collision with root package name */
    public final i f16380f;

    /* renamed from: x, reason: collision with root package name */
    public final boolean f16381x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f16382y;

    /* renamed from: z, reason: collision with root package name */
    public final int f16383z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o(int i7, e0 e0Var, int i8, i iVar, int i9, int i10, boolean z4) {
        super(i7, e0Var, i8);
        boolean z7;
        boolean z8;
        int i11;
        L l7;
        String str;
        boolean z9;
        X x4;
        boolean z10;
        X x7;
        int i12;
        int i13;
        float f7;
        int i14;
        X x8;
        int i15;
        int i16;
        int i17;
        int i18 = 3;
        int i19 = 0;
        this.f16380f = iVar;
        int i20 = iVar.f16344T ? 24 : 16;
        this.f16374E = iVar.f16343S && (i10 & i20) != 0;
        if (z4 && (((i15 = (x8 = this.f16369d).f288H) == -1 || i15 <= iVar.f16434a) && ((i16 = x8.f289I) == -1 || i16 <= iVar.f16435b))) {
            float f8 = x8.f290J;
            if ((f8 == -1.0f || f8 <= iVar.f16436c) && ((i17 = x8.f311y) == -1 || i17 <= iVar.f16437d)) {
                z7 = true;
                this.f16379e = z7;
                if (z4 && (((i12 = (x7 = this.f16369d).f288H) == -1 || i12 >= iVar.f16438e) && ((i13 = x7.f289I) == -1 || i13 >= iVar.f16439f))) {
                    f7 = x7.f290J;
                    if ((f7 != -1.0f || f7 >= iVar.f16440x) && ((i14 = x7.f311y) == -1 || i14 >= iVar.f16441y)) {
                        z8 = true;
                        this.f16381x = z8;
                        this.f16382y = p.e(i9, false);
                        X x9 = this.f16369d;
                        this.f16383z = x9.f311y;
                        this.f16370A = x9.b();
                        this.f16372C = p.b(this.f16369d.f308e, iVar.f16420D);
                        int i21 = this.f16369d.f308e;
                        this.f16373D = (i21 == 0 && (i21 & 1) == 0) ? false : true;
                        i11 = 0;
                        while (true) {
                            l7 = iVar.f16419C;
                            if (i11 < l7.size()) {
                                i11 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                                break;
                            }
                            String str2 = this.f16369d.f283C;
                            if (str2 != null && str2.equals(l7.get(i11))) {
                                break;
                            } else {
                                i11++;
                            }
                        }
                        this.f16371B = i11;
                        this.f16376G = AbstractC0023i.g(i9) != 128;
                        this.f16377H = AbstractC0023i.h(i9) != 64;
                        str = this.f16369d.f283C;
                        if (str != null) {
                            switch (str.hashCode()) {
                                case -1662735862:
                                    if (str.equals("video/av01")) {
                                        z9 = false;
                                        break;
                                    }
                                    z9 = -1;
                                    break;
                                case -1662541442:
                                    if (str.equals("video/hevc")) {
                                        z9 = true;
                                        break;
                                    }
                                    z9 = -1;
                                    break;
                                case 1331836730:
                                    if (str.equals("video/avc")) {
                                        z9 = 2;
                                        break;
                                    }
                                    z9 = -1;
                                    break;
                                case 1599127257:
                                    if (str.equals("video/x-vnd.on2.vp9")) {
                                        z9 = 3;
                                        break;
                                    }
                                    z9 = -1;
                                    break;
                                default:
                                    z9 = -1;
                                    break;
                            }
                            switch (z9) {
                                case false:
                                    i18 = 4;
                                    break;
                                case true:
                                    i18 = 1;
                                    break;
                                case true:
                                    i18 = 2;
                                    break;
                            }
                            this.f16378I = i18;
                            x4 = this.f16369d;
                            if ((x4.f308e & 16384) == 0) {
                                i iVar2 = this.f16380f;
                                if (p.e(i9, iVar2.f16352b0) && ((z10 = this.f16379e) || iVar2.f16342R)) {
                                    i19 = (!p.e(i9, false) || !this.f16381x || !z10 || x4.f311y == -1 || iVar2.f16431O || iVar2.f16430N || (i20 & i9) == 0) ? 1 : 2;
                                }
                            }
                            this.f16375F = i19;
                        }
                        i18 = 0;
                        this.f16378I = i18;
                        x4 = this.f16369d;
                        if ((x4.f308e & 16384) == 0) {
                        }
                        this.f16375F = i19;
                    }
                }
                z8 = false;
                this.f16381x = z8;
                this.f16382y = p.e(i9, false);
                X x92 = this.f16369d;
                this.f16383z = x92.f311y;
                this.f16370A = x92.b();
                this.f16372C = p.b(this.f16369d.f308e, iVar.f16420D);
                int i212 = this.f16369d.f308e;
                this.f16373D = (i212 == 0 && (i212 & 1) == 0) ? false : true;
                i11 = 0;
                while (true) {
                    l7 = iVar.f16419C;
                    if (i11 < l7.size()) {
                    }
                    i11++;
                }
                this.f16371B = i11;
                this.f16376G = AbstractC0023i.g(i9) != 128;
                this.f16377H = AbstractC0023i.h(i9) != 64;
                str = this.f16369d.f283C;
                if (str != null) {
                }
                i18 = 0;
                this.f16378I = i18;
                x4 = this.f16369d;
                if ((x4.f308e & 16384) == 0) {
                }
                this.f16375F = i19;
            }
        }
        z7 = false;
        this.f16379e = z7;
        if (z4) {
            f7 = x7.f290J;
            if (f7 != -1.0f) {
            }
            z8 = true;
            this.f16381x = z8;
            this.f16382y = p.e(i9, false);
            X x922 = this.f16369d;
            this.f16383z = x922.f311y;
            this.f16370A = x922.b();
            this.f16372C = p.b(this.f16369d.f308e, iVar.f16420D);
            int i2122 = this.f16369d.f308e;
            this.f16373D = (i2122 == 0 && (i2122 & 1) == 0) ? false : true;
            i11 = 0;
            while (true) {
                l7 = iVar.f16419C;
                if (i11 < l7.size()) {
                }
                i11++;
            }
            this.f16371B = i11;
            this.f16376G = AbstractC0023i.g(i9) != 128;
            this.f16377H = AbstractC0023i.h(i9) != 64;
            str = this.f16369d.f283C;
            if (str != null) {
            }
            i18 = 0;
            this.f16378I = i18;
            x4 = this.f16369d;
            if ((x4.f308e & 16384) == 0) {
            }
            this.f16375F = i19;
        }
        z8 = false;
        this.f16381x = z8;
        this.f16382y = p.e(i9, false);
        X x9222 = this.f16369d;
        this.f16383z = x9222.f311y;
        this.f16370A = x9222.b();
        this.f16372C = p.b(this.f16369d.f308e, iVar.f16420D);
        int i21222 = this.f16369d.f308e;
        this.f16373D = (i21222 == 0 && (i21222 & 1) == 0) ? false : true;
        i11 = 0;
        while (true) {
            l7 = iVar.f16419C;
            if (i11 < l7.size()) {
            }
            i11++;
        }
        this.f16371B = i11;
        this.f16376G = AbstractC0023i.g(i9) != 128;
        this.f16377H = AbstractC0023i.h(i9) != 64;
        str = this.f16369d.f283C;
        if (str != null) {
        }
        i18 = 0;
        this.f16378I = i18;
        x4 = this.f16369d;
        if ((x4.f308e & 16384) == 0) {
        }
        this.f16375F = i19;
    }

    public static int c(o oVar, o oVar2) {
        AbstractC0161t c3 = AbstractC0161t.f2068a.c(oVar.f16382y, oVar2.f16382y).a(oVar.f16372C, oVar2.f16372C).c(oVar.f16373D, oVar2.f16373D).c(oVar.f16379e, oVar2.f16379e).c(oVar.f16381x, oVar2.f16381x);
        Integer valueOf = Integer.valueOf(oVar.f16371B);
        Integer valueOf2 = Integer.valueOf(oVar2.f16371B);
        J.f1999a.getClass();
        AbstractC0161t b7 = c3.b(valueOf, valueOf2, T.f2026a);
        boolean z4 = oVar2.f16376G;
        boolean z7 = oVar.f16376G;
        AbstractC0161t c4 = b7.c(z7, z4);
        boolean z8 = oVar2.f16377H;
        boolean z9 = oVar.f16377H;
        AbstractC0161t c7 = c4.c(z9, z8);
        if (z7 && z9) {
            c7 = c7.a(oVar.f16378I, oVar2.f16378I);
        }
        return c7.e();
    }

    @Override // t2.n
    public final int a() {
        return this.f16375F;
    }

    @Override // t2.n
    public final boolean b(n nVar) {
        o oVar = (o) nVar;
        if (this.f16374E || v2.t.a(this.f16369d.f283C, oVar.f16369d.f283C)) {
            if (!this.f16380f.f16345U) {
                if (this.f16376G != oVar.f16376G || this.f16377H != oVar.f16377H) {
                }
            }
            return true;
        }
        return false;
    }
}
