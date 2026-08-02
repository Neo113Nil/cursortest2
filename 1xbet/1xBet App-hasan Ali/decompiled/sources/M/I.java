package M;

import A0.C0028g0;
import P.AbstractC0329z;
import P.C0315s;
import i4.InterfaceC2015a;
import w.C2539b;

/* loaded from: classes.dex */
public final class I extends kotlin.jvm.internal.m implements i4.e {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f3158l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f3159m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f3160n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f3161o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ Object f3162p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ W3.c f3163q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(Object obj, Object obj2, Object obj3, W3.c cVar, int i, int i5) {
        super(2);
        this.f3158l = i5;
        this.f3160n = obj;
        this.f3161o = obj2;
        this.f3162p = obj3;
        this.f3163q = cVar;
        this.f3159m = i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3158l) {
            case 0:
                ((Number) obj2).intValue();
                int B5 = AbstractC0329z.B(this.f3159m | 1);
                X.d dVar = (X.d) this.f3163q;
                J.a((C0249u) this.f3160n, (k0) this.f3161o, (v0) this.f3162p, dVar, (C0315s) obj, B5);
                break;
            case 1:
                ((Number) obj2).intValue();
                int B6 = AbstractC0329z.B(this.f3159m | 1);
                C0028g0 c0028g0 = (C0028g0) this.f3163q;
                v.w0.a((w.m) this.f3160n, (InterfaceC2015a) this.f3161o, (b0.p) this.f3162p, c0028g0, (C0315s) obj, B6);
                break;
            default:
                ((Number) obj2).intValue();
                int B7 = AbstractC0329z.B(this.f3159m | 1);
                C0028g0 c0028g02 = (C0028g0) this.f3163q;
                w.p.d((w.g) this.f3160n, (InterfaceC2015a) this.f3161o, (C2539b) this.f3162p, c0028g02, (C0315s) obj, B7);
                break;
        }
        return W3.o.f6046a;
    }
}
