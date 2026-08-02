package M;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.InterfaceC2280u;
import y.C2654j;

/* renamed from: M.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234e extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f3315k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C2654j f3316l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Z.p f3317m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0234e(C2654j c2654j, Z.p pVar, a4.c cVar) {
        super(2, cVar);
        this.f3316l = c2654j;
        this.f3317m = pVar;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        return new C0234e(this.f3316l, this.f3317m, cVar);
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C0234e) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f3315k;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            G4.l.N(obj);
            return W3.o.f6046a;
        }
        G4.l.N(obj);
        s4.B b3 = this.f3316l.f21123a;
        C0233d c0233d = new C0233d(this.f3317m, 0);
        this.f3315k = 1;
        b3.getClass();
        s4.B.k(b3, c0233d, this);
        return enumC0510a;
    }
}
