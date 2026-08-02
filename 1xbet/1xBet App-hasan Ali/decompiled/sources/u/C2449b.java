package u;

import c4.AbstractC0548i;

/* renamed from: u.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2449b extends AbstractC0548i implements i4.c {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2451c f19753k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f19754l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2449b(C2451c c2451c, Object obj, a4.c cVar) {
        super(1, cVar);
        this.f19753k = c2451c;
        this.f19754l = obj;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        C2449b c2449b = (C2449b) create((a4.c) obj);
        W3.o oVar = W3.o.f6046a;
        c2449b.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(a4.c cVar) {
        return new C2449b(this.f19753k, this.f19754l, cVar);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        C2451c c2451c = this.f19753k;
        C2451c.b(c2451c);
        Object a5 = C2451c.a(c2451c, this.f19754l);
        c2451c.f19762c.f19846l.setValue(a5);
        c2451c.f19764e.setValue(a5);
        return W3.o.f6046a;
    }
}
