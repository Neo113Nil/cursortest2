package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: Ve.mp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4454mp extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f31610d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4628sq f31611e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4454mp(C4628sq c4628sq, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31611e = c4628sq;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4454mp(this.f31611e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4454mp(this.f31611e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f31610d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f31610d = 1;
            C4628sq c4628sq = this.f31611e;
            AbstractC4335im abstractC4335im = c4628sq.f32069e.f29733a;
            boolean z11 = abstractC4335im instanceof Aj;
            Ae.x0 x0Var = c4628sq.f32070f;
            if (z11) {
                obj2 = x0Var.emit(Tp.f30078d, this);
                if (obj2 != aVar) {
                    obj2 = Unit.f71690a;
                }
            } else if (abstractC4335im instanceof C4132bk) {
                obj2 = x0Var.emit(Tp.f30077c, this);
                if (obj2 != aVar) {
                    obj2 = Unit.f71690a;
                }
            } else if (abstractC4335im instanceof C4277gl) {
                obj2 = x0Var.emit(Tp.f30075a, this);
                if (obj2 != aVar) {
                    obj2 = Unit.f71690a;
                }
            } else if (abstractC4335im instanceof Gl) {
                obj2 = x0Var.emit(Tp.f30076b, this);
                if (obj2 != aVar) {
                    obj2 = Unit.f71690a;
                }
            } else {
                Intrinsics.d(abstractC4335im, Ck.f28773b);
                obj2 = Unit.f71690a;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
