package Ve;

import Ae.C2399j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class F4 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public int f28966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ O5 f28967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C4341j f28968f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ He.b f28969g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F4(O5 o52, C4341j c4341j, He.b bVar, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f28967e = o52;
        this.f28968f = c4341j;
        this.f28969g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new F4(this.f28967e, this.f28968f, this.f28969g, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((F4) create((kotlin.coroutines.d) obj)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f28966d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f28966d = 1;
            if (C2399j.A(new C4434m5(this.f28967e, this.f28968f, this.f28969g, null)) == aVar) {
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
