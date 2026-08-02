package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.j6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4348j6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31342d;

    /* renamed from: e, reason: collision with root package name */
    public int f31343e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31344f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Bc f31345g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4348j6(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, Bc bc2, int i11) {
        super(2, dVar);
        this.f31342d = i11;
        this.f31344f = interfaceC2395h;
        this.f31345g = bc2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31342d) {
            case 0:
                return new C4348j6((C2406m0) this.f31344f, dVar, (S7) this.f31345g, 0);
            default:
                return new C4348j6((Ae.M0) this.f31344f, dVar, (Ub) this.f31345g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31342d) {
            case 0:
                return new C4348j6((C2406m0) this.f31344f, dVar, (S7) this.f31345g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4348j6((Ae.M0) this.f31344f, dVar, (Ub) this.f31345g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31342d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31343e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    G5 g52 = new G5((S7) this.f31345g);
                    this.f31343e = 1;
                    if (((C2406m0) this.f31344f).collect(g52, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
            default:
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                int i12 = this.f31343e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    F5 f52 = new F5((Ub) this.f31345g, 1);
                    this.f31343e = 1;
                    if (((Ae.M0) this.f31344f).collect(f52, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return Unit.f71690a;
        }
    }
}
