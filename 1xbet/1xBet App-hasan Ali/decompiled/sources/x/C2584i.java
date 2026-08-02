package x;

import b4.EnumC0510a;
import c4.AbstractC0548i;

/* renamed from: x.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2584i extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public int f20772k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f20773l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ S0 f20774m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2588k f20775n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2574d f20776o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ p4.U f20777p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2584i(S0 s02, C2588k c2588k, InterfaceC2574d interfaceC2574d, p4.U u5, a4.c cVar) {
        super(2, cVar);
        this.f20774m = s02;
        this.f20775n = c2588k;
        this.f20776o = interfaceC2574d;
        this.f20777p = u5;
    }

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2584i c2584i = new C2584i(this.f20774m, this.f20775n, this.f20776o, this.f20777p, cVar);
        c2584i.f20773l = obj;
        return c2584i;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2584i) create((C2599p0) obj, (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        EnumC0510a enumC0510a = EnumC0510a.f7289k;
        int i = this.f20772k;
        if (i == 0) {
            G4.l.N(obj);
            C2599p0 c2599p0 = (C2599p0) this.f20773l;
            InterfaceC2574d interfaceC2574d = this.f20776o;
            C2588k c2588k = this.f20775n;
            float y02 = C2588k.y0(c2588k, interfaceC2574d);
            S0 s02 = this.f20774m;
            s02.f20722e = y02;
            A.s sVar = new A.s(c2588k, this.f20777p, c2599p0, 11);
            A.n nVar = new A.n(c2588k, s02, interfaceC2574d, 5);
            this.f20772k = 1;
            if (s02.a(sVar, nVar, this) == enumC0510a) {
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
