package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.h6, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4291h6 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31168d;

    /* renamed from: e, reason: collision with root package name */
    public int f31169e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31170f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ X4.a f31171g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4291h6(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, X4.a aVar, int i11) {
        super(2, dVar);
        this.f31168d = i11;
        this.f31170f = interfaceC2395h;
        this.f31171g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31168d) {
            case 0:
                return new C4291h6((Ae.M0) this.f31170f, dVar, (C4378k7) this.f31171g, 0);
            default:
                return new C4291h6((C2406m0) this.f31170f, dVar, (H2) this.f31171g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31168d) {
            case 0:
                return new C4291h6((Ae.M0) this.f31170f, dVar, (C4378k7) this.f31171g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4291h6((C2406m0) this.f31170f, dVar, (H2) this.f31171g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31168d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31169e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    F5 f52 = new F5((C4378k7) this.f31171g, 0);
                    this.f31169e = 1;
                    if (((Ae.M0) this.f31170f).collect(f52, this) == aVar) {
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
                int i12 = this.f31169e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4266ga c4266ga = new C4266ga((H2) this.f31171g);
                    this.f31169e = 1;
                    if (((C2406m0) this.f31170f).collect(c4266ga, this) == aVar2) {
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
