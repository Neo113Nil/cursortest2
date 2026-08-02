package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class I extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f29192d;

    /* renamed from: e, reason: collision with root package name */
    public int f29193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f29194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29195g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ I(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f29192d = i11;
        this.f29194f = interfaceC2395h;
        this.f29195g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f29192d) {
            case 0:
                return new I((Ae.M0) this.f29194f, dVar, (C1) this.f29195g, 0);
            case 1:
                return new I((C2406m0) this.f29194f, dVar, (S0) this.f29195g, 1);
            default:
                return new I((Ae.M0) this.f29194f, dVar, (Cr) this.f29195g, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f29192d) {
            case 0:
                return new I((Ae.M0) this.f29194f, dVar, (C1) this.f29195g, 0).invokeSuspend(Unit.f71690a);
            case 1:
                return new I((C2406m0) this.f29194f, dVar, (S0) this.f29195g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new I((Ae.M0) this.f29194f, dVar, (Cr) this.f29195g, 2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f29192d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f29193e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4111b c4111b = new C4111b((C1) this.f29195g, 0);
                    this.f29193e = 1;
                    if (((Ae.M0) this.f29194f).collect(c4111b, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            case 1:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f29193e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4488o1 c4488o1 = new C4488o1((S0) this.f29195g, 2);
                    this.f29193e = 1;
                    if (((C2406m0) this.f29194f).collect(c4488o1, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar3 = Wc.a.COROUTINE_SUSPENDED;
                int i13 = this.f29193e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    Wp wp = new Wp((Cr) this.f29195g);
                    this.f29193e = 1;
                    if (((Ae.M0) this.f29194f).collect(wp, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
