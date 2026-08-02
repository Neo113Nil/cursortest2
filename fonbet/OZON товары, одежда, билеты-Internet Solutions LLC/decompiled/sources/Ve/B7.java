package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class B7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f28674d;

    /* renamed from: e, reason: collision with root package name */
    public int f28675e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f28676f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f28677g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B7(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f28674d = i11;
        this.f28676f = interfaceC2395h;
        this.f28677g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f28674d) {
            case 0:
                return new B7((Ae.M0) this.f28676f, dVar, (C4400l0) this.f28677g, 0);
            default:
                return new B7((C2406m0) this.f28676f, dVar, (Hk) this.f28677g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f28674d) {
            case 0:
                return new B7((Ae.M0) this.f28676f, dVar, (C4400l0) this.f28677g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new B7((C2406m0) this.f28676f, dVar, (Hk) this.f28677g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f28674d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f28675e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Y6 y62 = new Y6((C4400l0) this.f28677g);
                    this.f28675e = 1;
                    if (((Ae.M0) this.f28676f).collect(y62, this) == aVar) {
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
                int i12 = this.f28675e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4160cj c4160cj = new C4160cj((Hk) this.f28677g, 0);
                    this.f28675e = 1;
                    if (((C2406m0) this.f28676f).collect(c4160cj, this) == aVar2) {
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
