package u;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class Y extends AbstractC0548i implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public int f19730k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f19731l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f19732m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2452c0 f19733n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ t0 f19734o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ float f19735p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(Object obj, Object obj2, C2452c0 c2452c0, t0 t0Var, float f, a4.c cVar) {
        super(1, cVar);
        this.f19731l = obj;
        this.f19732m = obj2;
        this.f19733n = c2452c0;
        this.f19734o = t0Var;
        this.f19735p = f;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        return ((Y) create((a4.c) obj)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(a4.c cVar) {
        return new Y(this.f19731l, this.f19732m, this.f19733n, this.f19734o, this.f19735p, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f19730k;
        if (i == 0) {
            G4.l.N(obj);
            X x5 = new X(this.f19731l, this.f19732m, this.f19733n, this.f19734o, this.f19735p, null);
            this.f19730k = 1;
            if (AbstractC2282w.e(x5, this) == enumC0510a) {
                return enumC0510a;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
        }
        return W3.o.f6046a;
    }
}
