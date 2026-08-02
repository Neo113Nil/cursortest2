package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class Qg extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f29780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Wh f29781e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Al f29782f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29783g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Qg(Wh wh2, Al al, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f29781e = wh2;
        this.f29782f = al;
        this.f29783g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new Qg(this.f29781e, this.f29782f, this.f29783g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Qg) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29780d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f29780d = 1;
            if (this.f29781e.k(this.f29782f, this.f29783g, this) == aVar) {
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
