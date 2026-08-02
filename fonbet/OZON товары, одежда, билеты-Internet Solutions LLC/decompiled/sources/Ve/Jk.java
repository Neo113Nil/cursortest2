package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class Jk extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ae.M0 f29302e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ S0 f29303f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C4699va f29304g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jk(Ae.M0 m02, kotlin.coroutines.d dVar, S0 s02, C4699va c4699va) {
        super(2, dVar);
        this.f29302e = m02;
        this.f29303f = s02;
        this.f29304g = c4699va;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new Jk(this.f29302e, dVar, this.f29303f, this.f29304g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Jk) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29301d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4305hk c4305hk = new C4305hk(this.f29304g, this.f29303f);
            this.f29301d = 1;
            if (this.f29302e.collect(c4305hk, this) == aVar) {
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
