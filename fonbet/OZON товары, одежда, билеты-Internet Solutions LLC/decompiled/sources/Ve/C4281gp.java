package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.gp, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4281gp extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f31125d;

    /* renamed from: e, reason: collision with root package name */
    public int f31126e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f31127f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C1 f31128g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4281gp(Ae.M0 m02, kotlin.coroutines.d dVar, C1 c12, int i11) {
        super(2, dVar);
        this.f31125d = i11;
        this.f31127f = m02;
        this.f31128g = c12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.f31125d) {
            case 0:
                return new C4281gp(this.f31127f, dVar, this.f31128g, 0);
            default:
                return new C4281gp(this.f31127f, dVar, this.f31128g, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.f31125d) {
            case 0:
                return new C4281gp(this.f31127f, dVar, this.f31128g, 0).invokeSuspend(Unit.f71690a);
            default:
                return new C4281gp(this.f31127f, dVar, this.f31128g, 1).invokeSuspend(Unit.f71690a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.f31125d) {
            case 0:
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                int i11 = this.f31126e;
                if (i11 == 0) {
                    Sc.s.b(obj);
                    Z3 z32 = new Z3(this.f31128g, 3);
                    this.f31126e = 1;
                    if (this.f31127f.collect(z32, this) == aVar) {
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
                int i12 = this.f31126e;
                if (i12 == 0) {
                    Sc.s.b(obj);
                    C4563qi c4563qi = new C4563qi(this.f31128g, 1);
                    this.f31126e = 1;
                    if (this.f31127f.collect(c4563qi, this) == aVar2) {
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
