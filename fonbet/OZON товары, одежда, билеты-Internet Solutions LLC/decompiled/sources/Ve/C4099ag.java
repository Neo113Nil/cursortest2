package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.ag, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4099ag extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f30672d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4187dh f30673e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Jh f30674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30675g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4099ag(C4187dh c4187dh, Jh jh2, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f30673e = c4187dh;
        this.f30674f = jh2;
        this.f30675g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4099ag(this.f30673e, this.f30674f, this.f30675g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((C4099ag) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30672d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f30672d = 1;
            if (this.f30673e.k(this.f30674f, this.f30675g, this) == aVar) {
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
