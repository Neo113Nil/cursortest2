package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import spay.sdk.RedirectActivity;

/* renamed from: Ve.q1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4546q1 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31826d;

    /* renamed from: e, reason: collision with root package name */
    public int f31827e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31828f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31829g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4546q1(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, Object obj, int i11) {
        super(2, dVar);
        this.f31826d = i11;
        this.f31828f = interfaceC2395h;
        this.f31829g = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31826d) {
            case 0:
                return new C4546q1((C2406m0) this.f31828f, dVar, (RedirectActivity) this.f31829g, 0);
            case 1:
                return new C4546q1((Ae.M0) this.f31828f, dVar, (Mq) this.f31829g, 1);
            default:
                return new C4546q1((Ae.M0) this.f31828f, dVar, (C4283gr) this.f31829g, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31826d) {
            case 0:
                return new C4546q1((C2406m0) this.f31828f, dVar, (RedirectActivity) this.f31829g, 0).invokeSuspend(Unit.f71690a);
            case 1:
                return new C4546q1((Ae.M0) this.f31828f, dVar, (Mq) this.f31829g, 1).invokeSuspend(Unit.f71690a);
            default:
                return new C4546q1((Ae.M0) this.f31828f, dVar, (C4283gr) this.f31829g, 2).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31826d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31827e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    L0 l02 = new L0((RedirectActivity) this.f31829g, 0);
                    this.f31827e = 1;
                    if (((C2406m0) this.f31828f).collect(l02, this) == aVar) {
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
                int i12 = this.f31827e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    L0 l03 = new L0((Mq) this.f31829g, 3);
                    this.f31827e = 1;
                    if (((Ae.M0) this.f31828f).collect(l03, this) == aVar2) {
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
                int i13 = this.f31827e;
                if (i13 == 0) {
                    Sc.s.b(obj);
                    C4798yp c4798yp = new C4798yp((C4283gr) this.f31829g);
                    this.f31827e = 1;
                    if (((Ae.M0) this.f31828f).collect(c4798yp, this) == aVar3) {
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
