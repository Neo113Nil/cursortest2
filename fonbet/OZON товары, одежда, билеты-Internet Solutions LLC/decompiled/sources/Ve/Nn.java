package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10720e0;

/* loaded from: classes10.dex */
public final class Nn extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29567d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z2 f29568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F1 f29569f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Nn(Z2 z22, F1 f12, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29568e = z22;
        this.f29569f = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Nn(this.f29568e, this.f29569f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Nn(this.f29568e, this.f29569f, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29567d;
        if (i11 == 0) {
            Sc.s.b(obj);
            Z0 z02 = this.f29568e.f30540i;
            this.f29567d = 1;
            C10720e0 c10720e0 = C10720e0.f105451a;
            if (z02.f(this.f29569f, He.b.f10879b, this) == aVar) {
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
