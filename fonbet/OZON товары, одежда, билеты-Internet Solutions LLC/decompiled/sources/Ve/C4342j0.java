package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;

/* renamed from: Ve.j0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4342j0 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31330d = 1;

    /* renamed from: e, reason: collision with root package name */
    public int f31331e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f31332f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f31333g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4342j0(Ae.x0 x0Var, kotlin.coroutines.d dVar, C4817zg c4817zg) {
        super(2, dVar);
        this.f31332f = x0Var;
        this.f31333g = c4817zg;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31330d) {
            case 0:
                return new C4342j0((C4577r4) this.f31332f, (Y5) this.f31333g, dVar);
            default:
                return new C4342j0((Ae.x0) this.f31332f, dVar, (C4817zg) this.f31333g);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31330d) {
            case 0:
                return new C4342j0((C4577r4) this.f31332f, (Y5) this.f31333g, dVar).invokeSuspend(Unit.f71690a);
            default:
                return new C4342j0((Ae.x0) this.f31332f, dVar, (C4817zg) this.f31333g).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.f31332f;
        Object obj3 = this.f31333g;
        switch (this.f31330d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31331e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    C4473nf c4473nf = ((C4577r4) obj2).f31938l;
                    Mf mf2 = ((Y5) obj3).f30437a;
                    this.f31331e = 1;
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    if (c4473nf.f(mf2, He.b.f10879b, this) == aVar) {
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
                int i12 = this.f31331e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4094ab c4094ab = new C4094ab((C4817zg) obj3, 0);
                    this.f31331e = 1;
                    if (((Ae.x0) obj2).collect(c4094ab, this) == aVar2) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4342j0(C4577r4 c4577r4, Y5 y52, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31332f = c4577r4;
        this.f31333g = y52;
    }
}
