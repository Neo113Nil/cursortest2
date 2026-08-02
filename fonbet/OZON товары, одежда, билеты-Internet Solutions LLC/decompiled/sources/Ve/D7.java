package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class D7 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f28838d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Ei f28839e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4699va f28840f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ S0 f28841g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D7(Ei ei, kotlin.coroutines.d dVar, C4699va c4699va, S0 s02) {
        super(2, dVar);
        this.f28839e = ei;
        this.f28840f = c4699va;
        this.f28841g = s02;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new D7(this.f28839e, dVar, this.f28840f, this.f28841g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((D7) create((xe.M) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28838d;
        if (i11 == 0) {
            Sc.s.b(obj);
            C4090a7 c4090a7 = new C4090a7(this.f28840f, this.f28841g);
            this.f28838d = 1;
            if (this.f28839e.collect(c4090a7, this) == aVar) {
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
