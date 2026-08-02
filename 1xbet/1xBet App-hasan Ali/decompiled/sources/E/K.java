package E;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import p4.AbstractC2282w;

/* loaded from: classes.dex */
public final class K extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f1054k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f1055l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0104i0 f1056m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ I.O f1057n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K(InterfaceC0104i0 interfaceC0104i0, I.O o5, a4.c cVar) {
        super(2, cVar);
        this.f1056m = interfaceC0104i0;
        this.f1057n = o5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        K k5 = new K(this.f1056m, this.f1057n, cVar);
        k5.f1055l = obj;
        return k5;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((K) create((t0.v) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f1054k;
        if (i == 0) {
            G4.l.N(obj);
            J j5 = new J((t0.v) this.f1055l, this.f1056m, this.f1057n, null);
            this.f1054k = 1;
            if (AbstractC2282w.e(j5, this) == enumC0510a) {
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
