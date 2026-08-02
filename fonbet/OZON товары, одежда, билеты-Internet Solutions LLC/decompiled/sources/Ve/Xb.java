package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class Xb extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f30347d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4183dd f30348e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Hd f30349f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30350g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Xb(C4183dd c4183dd, Hd hd2, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f30348e = c4183dd;
        this.f30349f = hd2;
        this.f30350g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new Xb(this.f30348e, this.f30349f, this.f30350g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((Xb) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30347d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f30347d = 1;
            if (this.f30348e.k(this.f30349f, this.f30350g, this) == aVar) {
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
