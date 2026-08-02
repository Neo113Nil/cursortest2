package Ve;

import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Ym extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f30507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Mq f30508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AbstractC5434v.b f30509f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f30510g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Mq f30511h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ym(Mq mq, AbstractC5434v.b bVar, Ae.M0 m02, kotlin.coroutines.d dVar, Mq mq2) {
        super(2, dVar);
        this.f30508e = mq;
        this.f30509f = bVar;
        this.f30510g = m02;
        this.f30511h = mq2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Ym(this.f30508e, this.f30509f, this.f30510g, dVar, this.f30511h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Ym) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30507d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4546q1 c4546q1 = new C4546q1(this.f30510g, null, this.f30511h, 1);
            this.f30507d = 1;
            if (C5412d0.b(this.f30508e, this.f30509f, c4546q1, this) == aVar) {
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
