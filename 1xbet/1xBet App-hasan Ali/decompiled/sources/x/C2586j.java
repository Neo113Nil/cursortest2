package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;
import java.util.concurrent.CancellationException;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;

/* renamed from: x.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2586j extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20782k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20783l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C2588k f20784m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ S0 f20785n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2574d f20786o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2586j(C2588k c2588k, S0 s02, InterfaceC2574d interfaceC2574d, a4.c cVar) {
        super(2, cVar);
        this.f20784m = c2588k;
        this.f20785n = s02;
        this.f20786o = interfaceC2574d;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2586j c2586j = new C2586j(this.f20784m, this.f20785n, this.f20786o, cVar);
        c2586j.f20783l = obj;
        return c2586j;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2586j) create((InterfaceC2280u) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20782k;
        C2588k c2588k = this.f20784m;
        try {
            try {
                if (i == 0) {
                    G4.l.N(obj);
                    p4.U j5 = AbstractC2282w.j(((InterfaceC2280u) this.f20783l).i());
                    c2588k.f20796G = true;
                    C2604s0 c2604s0 = c2588k.f20798z;
                    v.d0 d0Var = v.d0.f20222k;
                    C2584i c2584i = new C2584i(this.f20785n, c2588k, this.f20786o, j5, null);
                    this.f20782k = 1;
                    if (c2604s0.e(d0Var, c2584i, this) == enumC0510a) {
                        return enumC0510a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    G4.l.N(obj);
                }
                c2588k.f20791B.y();
                c2588k.f20796G = false;
                c2588k.f20791B.o(null);
                c2588k.f20794E = false;
                return W3.o.f6046a;
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th) {
            c2588k.f20796G = false;
            c2588k.f20791B.o(null);
            c2588k.f20794E = false;
            throw th;
        }
    }
}
