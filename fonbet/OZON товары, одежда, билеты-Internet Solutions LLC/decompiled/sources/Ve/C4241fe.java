package Ve;

import Ae.C2406m0;
import Ae.InterfaceC2395h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.fe, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4241fe extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31027d;

    /* renamed from: e, reason: collision with root package name */
    public int f31028e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4192dm f31029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ InterfaceC2395h f31030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4241fe(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, C4192dm c4192dm, int i11) {
        super(2, dVar);
        this.f31027d = i11;
        this.f31030g = interfaceC2395h;
        this.f31029f = c4192dm;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31027d) {
            case 0:
                return new C4241fe((C2406m0) this.f31030g, dVar, this.f31029f, 0);
            default:
                return new C4241fe((Ae.M0) this.f31030g, dVar, this.f31029f, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31027d) {
            case 0:
                return new C4241fe((C2406m0) this.f31030g, dVar, this.f31029f, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4241fe((Ae.M0) this.f31030g, dVar, this.f31029f, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31027d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31028e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    J j11 = new J(this.f31029f, 1);
                    this.f31028e = 1;
                    if (((C2406m0) this.f31030g).collect(j11, this) == aVar) {
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
                int i12 = this.f31028e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4563qi c4563qi = new C4563qi(this.f31029f, 0);
                    this.f31028e = 1;
                    if (((Ae.M0) this.f31030g).collect(c4563qi, this) == aVar2) {
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
