package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Mp extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29492d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1 f29493e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f29494f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f29495g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ C1 f29496h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Mp(C1 c12, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, C1 c13) {
        super(2, dVar);
        this.f29493e = c12;
        this.f29494f = bVar;
        this.f29495g = m02;
        this.f29496h = c13;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Mp(this.f29493e, this.f29494f, this.f29495g, dVar, this.f29496h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Mp) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29492d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4281gp c4281gp = new C4281gp(this.f29495g, null, this.f29496h, 0);
            this.f29492d = 1;
            if (C5412d0.b(this.f29493e, this.f29494f, c4281gp, this) == aVar) {
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
