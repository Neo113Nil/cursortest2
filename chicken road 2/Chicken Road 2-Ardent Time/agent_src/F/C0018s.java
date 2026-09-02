package F;

/* renamed from: F.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0018s extends m1.AbstractC0935f implements s1.q {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f512e = 1;

    /* renamed from: f, reason: collision with root package name */
    public int f513f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f514g;

    public /* synthetic */ C0018s(int i2, k1.d dVar) {
        super(i2, dVar);
    }

    @Override // m1.AbstractC0931b
    public final java.lang.Object g(java.lang.Object obj) {
        switch (this.f512e) {
            case 0:
                l1.EnumC0927a enumC0927a = l1.EnumC0927a.f8017a;
                int i2 = this.f513f;
                if (i2 == 0) {
                    a.AbstractC0059a.A(obj);
                    this.f513f = 1;
                    if (F.P.a((F.P) this.f514g, this) == enumC0927a) {
                        return enumC0927a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.AbstractC0059a.A(obj);
                }
                return h1.C0177i.f3302a;
            default:
                l1.EnumC0927a enumC0927a2 = l1.EnumC0927a.f8017a;
                int i3 = this.f513f;
                if (i3 == 0) {
                    a.AbstractC0059a.A(obj);
                    F.S s2 = (F.S) this.f514g;
                    this.f513f = 1;
                    s2.getClass();
                    obj = F.S.a(s2, this);
                    if (obj == enumC0927a2) {
                        return enumC0927a2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    a.AbstractC0059a.A(obj);
                }
                return obj;
        }
    }

    public final java.lang.Object i(java.lang.Object obj, java.lang.Object obj2, m1.AbstractC0931b abstractC0931b) {
        switch (this.f512e) {
            case 0:
                return new F.C0018s((F.P) this.f514g, abstractC0931b).g(h1.C0177i.f3302a);
            default:
                ((java.lang.Boolean) obj2).getClass();
                F.C0018s c0018s = new F.C0018s(3, abstractC0931b);
                c0018s.f514g = (F.S) obj;
                return c0018s.g(h1.C0177i.f3302a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0018s(F.P p2, k1.d dVar) {
        super(3, dVar);
        this.f514g = p2;
    }
}
