package x;

import c4.AbstractC0548i;
import h0.C1988b;

/* renamed from: x.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2566L extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ int f20664k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2566L(int i, int i5, a4.c cVar) {
        super(i, cVar);
        this.f20664k = i5;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        switch (this.f20664k) {
            case 0:
                long j5 = ((C1988b) obj2).f17191a;
                C2566L c2566l = new C2566L(3, 0, (a4.c) obj3);
                W3.o oVar = W3.o.f6046a;
                c2566l.invokeSuspend(oVar);
                return oVar;
            case 1:
                ((Number) obj2).floatValue();
                C2566L c2566l2 = new C2566L(3, 1, (a4.c) obj3);
                W3.o oVar2 = W3.o.f6046a;
                c2566l2.invokeSuspend(oVar2);
                return oVar2;
            default:
                long j6 = ((C1988b) obj2).f17191a;
                C2566L c2566l3 = new C2566L(3, 2, (a4.c) obj3);
                W3.o oVar3 = W3.o.f6046a;
                c2566l3.invokeSuspend(oVar3);
                return oVar3;
        }
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        W3.o oVar = W3.o.f6046a;
        switch (this.f20664k) {
            case 0:
                G4.l.N(obj);
                break;
            case 1:
                G4.l.N(obj);
                break;
            default:
                G4.l.N(obj);
                break;
        }
        return oVar;
    }
}
