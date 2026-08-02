package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;
import xe.C10727i;

/* renamed from: Ve.pe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4530pe extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31778d;

    /* renamed from: e, reason: collision with root package name */
    public int f31779e;

    /* renamed from: f, reason: collision with root package name */
    public InterfaceC2395h f31780f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31781g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4530pe(C2406m0 c2406m0, kotlin.coroutines.d dVar, Bc bc2, int i11) {
        super(2, dVar);
        this.f31778d = i11;
        this.f31780f = c2406m0;
        this.f31781g = bc2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31778d) {
            case 0:
                return new C4530pe((Se) this.f31781g, dVar);
            case 1:
                return new C4530pe((C2406m0) this.f31780f, dVar, (Uh) this.f31781g, 1);
            default:
                return new C4530pe((C2406m0) this.f31780f, dVar, (C1) this.f31781g, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31778d) {
            case 0:
                return new C4530pe((Se) this.f31781g, dVar).invokeSuspend(Unit.f71690a);
            case 1:
                return new C4530pe((C2406m0) this.f31780f, dVar, (Uh) this.f31781g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new C4530pe((C2406m0) this.f31780f, dVar, (C1) this.f31781g, 2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ae.x0 x0Var;
        Object obj2 = this.f31781g;
        int i11 = 1;
        switch (this.f31778d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f31779e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    Se se2 = (Se) obj2;
                    Ae.x0 x0Var2 = se2.f29973f;
                    this.f31780f = x0Var2;
                    this.f31779e = 1;
                    C4700vb c4700vb = se2.f29972e;
                    c4700vb.getClass();
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    Object f7 = C10727i.f(He.b.f10879b, new M8(c4700vb, (kotlin.coroutines.d) null, i11), this);
                    if (f7 == aVar) {
                        return aVar;
                    }
                    x0Var = x0Var2;
                    obj = f7;
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    x0Var = (Ae.x0) this.f31780f;
                    Sc.s.b(obj);
                }
                x0Var.setValue(obj);
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f31779e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    C4094ab c4094ab = new C4094ab((Uh) obj2, 1);
                    this.f31779e = 1;
                    if (((C2406m0) this.f31780f).collect(c4094ab, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i14 = this.f31779e;
                if (i14 == 0) {
                    Sc.s.b(obj);
                    C4193dn c4193dn = new C4193dn((C1) obj2);
                    this.f31779e = 1;
                    if (((C2406m0) this.f31780f).collect(c4193dn, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4530pe(Se se2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31778d = 0;
        this.f31781g = se2;
    }
}
