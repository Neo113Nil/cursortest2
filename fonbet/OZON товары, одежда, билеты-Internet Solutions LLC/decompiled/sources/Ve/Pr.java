package Ve;

import Sc.C4005g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Pr extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29742d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4577r4 f29743e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Pr(C4577r4 c4577r4, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29743e = c4577r4;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Pr(this.f29743e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Pr(this.f29743e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29742d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4577r4 c4577r4 = this.f29743e;
            Ae.M0 m02 = ((C4673ud) c4577r4.f31931e).f32205b;
            C4456mr c4456mr = new C4456mr(c4577r4);
            this.f29742d = 1;
            if (m02.collect(c4456mr, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        throw new C4005g();
    }
}
