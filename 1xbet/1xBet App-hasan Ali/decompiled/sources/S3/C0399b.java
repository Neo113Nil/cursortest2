package S3;

import P.AbstractC0329z;
import P.C0315s;
import a.AbstractC0444a;
import o0.C2201e;

/* renamed from: S3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0399b implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5438k = 1;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5439l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5440m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f5441n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ C2201e f5442o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b0.p f5443p;

    public /* synthetic */ C0399b(String str, String str2, long j5, C2201e c2201e, b0.p pVar, int i) {
        this.f5439l = str;
        this.f5440m = str2;
        this.f5441n = j5;
        this.f5442o = c2201e;
        this.f5443p = pVar;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5438k) {
            case 0:
                ((Integer) obj2).getClass();
                int B5 = AbstractC0329z.B(3079);
                String str = this.f5439l;
                String str2 = this.f5440m;
                C2201e c2201e = this.f5442o;
                AbstractC0406i.c(B5, this.f5441n, (C0315s) obj, this.f5443p, str, str2, c2201e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int B6 = AbstractC0329z.B(385);
                C2201e c2201e2 = this.f5442o;
                b0.p pVar = this.f5443p;
                String str3 = this.f5439l;
                String str4 = this.f5440m;
                AbstractC0412o.d(B6, this.f5441n, (C0315s) obj, pVar, str3, str4, c2201e2);
                break;
            default:
                ((Integer) obj2).getClass();
                int B7 = AbstractC0329z.B(3505);
                C2201e c2201e3 = this.f5442o;
                String str5 = this.f5439l;
                String str6 = this.f5440m;
                AbstractC0444a.U(B7, this.f5441n, (C0315s) obj, this.f5443p, str5, str6, c2201e3);
                break;
        }
        return W3.o.f6046a;
    }

    public /* synthetic */ C0399b(String str, String str2, C2201e c2201e, long j5, b0.p pVar, int i) {
        this.f5439l = str;
        this.f5440m = str2;
        this.f5442o = c2201e;
        this.f5441n = j5;
        this.f5443p = pVar;
    }

    public /* synthetic */ C0399b(C2201e c2201e, String str, String str2, long j5, b0.p pVar, int i) {
        this.f5442o = c2201e;
        this.f5439l = str;
        this.f5440m = str2;
        this.f5441n = j5;
        this.f5443p = pVar;
    }
}
