package x;

import c4.AbstractC0548i;

/* renamed from: x.e0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2577e0 extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f20757k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f20758l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2577e0(long j5, a4.c cVar) {
        super(2, cVar);
        this.f20758l = j5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2577e0 c2577e0 = new C2577e0(this.f20758l, cVar);
        c2577e0.f20757k = obj;
        return c2577e0;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C2577e0 c2577e0 = (C2577e0) create((C2599p0) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        c2577e0.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        C2604s0 c2604s0 = ((C2599p0) this.f20757k).f20847a;
        C2604s0.a(c2604s0, c2604s0.f20869h, this.f20758l, 1);
        return W3.o.f6046a;
    }
}
