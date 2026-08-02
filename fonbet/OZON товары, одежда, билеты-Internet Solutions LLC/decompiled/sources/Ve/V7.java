package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class V7 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f30179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C4150c9 f30180e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ E9 f30181f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xe.I f30182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V7(C4150c9 c4150c9, E9 e92, xe.I i11, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f30180e = c4150c9;
        this.f30181f = e92;
        this.f30182g = i11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new V7(this.f30180e, this.f30181f, this.f30182g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((V7) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f30179d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f30179d = 1;
            if (this.f30180e.k(this.f30181f, this.f30182g, this) == aVar) {
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
