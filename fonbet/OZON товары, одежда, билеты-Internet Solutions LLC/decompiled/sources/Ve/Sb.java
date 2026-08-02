package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class Sb extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f29958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Zc f29959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Cd f29960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29961g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sb(Zc zc2, Cd cd2, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f29959e = zc2;
        this.f29960f = cd2;
        this.f29961g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new Sb(this.f29959e, this.f29960f, this.f29961g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Sb) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29958d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f29958d = 1;
            if (this.f29959e.k(this.f29960f, this.f29961g, this) == aVar) {
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
