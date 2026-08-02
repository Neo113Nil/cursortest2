package S3;

import P.AbstractC0329z;
import P.C0315s;
import o0.C2201e;

/* renamed from: S3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0400c implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f5460k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ String f5461l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ String f5462m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2201e f5463n;

    public /* synthetic */ C0400c(String str, String str2, C2201e c2201e, int i, int i5) {
        this.f5460k = i5;
        this.f5461l = str;
        this.f5462m = str2;
        this.f5463n = c2201e;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f5460k;
        C0315s c0315s = (C0315s) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                int B5 = AbstractC0329z.B(7);
                AbstractC0406i.d(this.f5461l, this.f5462m, this.f5463n, c0315s, B5);
                break;
            default:
                AbstractC0412o.c(this.f5461l, this.f5462m, this.f5463n, c0315s, AbstractC0329z.B(7));
                break;
        }
        return W3.o.f6046a;
    }
}
