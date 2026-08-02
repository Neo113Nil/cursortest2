package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.pd, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4529pd extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31774d;

    /* renamed from: e, reason: collision with root package name */
    public int f31775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31776f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31777g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4529pd(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f31774d = i11;
        this.f31776f = interfaceC2395h;
        this.f31777g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31774d) {
            case 0:
                return new C4529pd((Ae.M0) this.f31776f, dVar, (C4817zg) this.f31777g, 0);
            default:
                return new C4529pd((C2406m0) this.f31776f, dVar, (D) this.f31777g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31774d) {
            case 0:
                return new C4529pd((Ae.M0) this.f31776f, dVar, (C4817zg) this.f31777g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4529pd((C2406m0) this.f31776f, dVar, (D) this.f31777g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31774d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31775e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Kc kc = new Kc((C4817zg) this.f31777g);
                    this.f31775e = 1;
                    if (((Ae.M0) this.f31776f).collect(kc, this) == aVar) {
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
                int i12 = this.f31775e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4169d c4169d = new C4169d((D) this.f31777g, 1);
                    this.f31775e = 1;
                    if (((C2406m0) this.f31776f).collect(c4169d, this) == aVar2) {
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
