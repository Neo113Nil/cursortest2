package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class L extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f29376d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Z0 f29377e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ F1 f29378f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29379g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Z0 z02, F1 f12, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f29377e = z02;
        this.f29378f = f12;
        this.f29379g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new L(this.f29377e, this.f29378f, this.f29379g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((L) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29376d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f29376d = 1;
            if (this.f29377e.k(this.f29378f, this.f29379g, this) == aVar) {
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
