package I;

/* renamed from: I.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0152e extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0159l f2477l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f2478m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f2479n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0152e(InterfaceC0159l interfaceC0159l, boolean z3, boolean z5) {
        super(1);
        this.f2477l = interfaceC0159l;
        this.f2478m = z3;
        this.f2479n = z5;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        H0.j jVar = (H0.j) obj;
        long a5 = this.f2477l.a();
        jVar.f(A.f2384c, new z(this.f2478m ? E.N.f1061l : E.N.f1062m, a5, this.f2479n ? 1 : 3, G4.d.C(a5)));
        return W3.o.f6046a;
    }
}
