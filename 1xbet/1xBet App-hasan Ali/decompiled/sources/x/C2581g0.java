package x;

import c4.AbstractC0548i;

/* renamed from: x.g0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2581g0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f20765k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f20766l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2581g0(long j5, a4.c cVar) {
        super(2, cVar);
        this.f20766l = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2581g0 c2581g0 = new C2581g0(this.f20766l, cVar);
        c2581g0.f20765k = obj;
        return c2581g0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C2581g0 c2581g0 = (C2581g0) create((C2599p0) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        c2581g0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        C2604s0 c2604s0 = ((C2599p0) this.f20765k).f20847a;
        C2604s0.a(c2604s0, c2604s0.f20869h, this.f20766l, 1);
        return W3.o.f6046a;
    }
}
