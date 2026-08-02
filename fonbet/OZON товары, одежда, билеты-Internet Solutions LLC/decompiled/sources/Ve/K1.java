package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class K1 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f29325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4748x3 f29326e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4087a4 f29327f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f29328g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K1(C4748x3 c4748x3, C4087a4 c4087a4, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f29326e = c4748x3;
        this.f29327f = c4087a4;
        this.f29328g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new K1(this.f29326e, this.f29327f, this.f29328g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((K1) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29325d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f29325d = 1;
            if (this.f29326e.k(this.f29327f, this.f29328g, this) == aVar) {
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
