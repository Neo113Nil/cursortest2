package a1;

import c4.AbstractC0548i;
import p4.InterfaceC2280u;

/* renamed from: a1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0454a extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u f6378k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0454a(u uVar, a4.c cVar) {
        super(2, cVar);
        this.f6378k = uVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0454a(this.f6378k, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        C0454a c0454a = (C0454a) create((InterfaceC2280u) obj, (a4.c) obj2);
        W3.o oVar = W3.o.f6046a;
        c0454a.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        this.f6378k.show();
        return W3.o.f6046a;
    }
}
