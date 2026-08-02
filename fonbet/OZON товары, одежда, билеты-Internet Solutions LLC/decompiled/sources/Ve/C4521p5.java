package Ve;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;

/* renamed from: Ve.p5, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4521p5 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ N9 f31762d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4521p5(N9 n92, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f31762d = n92;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new C4521p5(this.f31762d, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4521p5(this.f31762d, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        N9 n92 = this.f31762d;
        Ae.x0 x0Var = n92.f29539k;
        x0Var.setValue(C7714v.k0((Iterable) x0Var.getValue(), C7714v.K((List) n92.f29539k.getValue())));
        return Unit.f71690a;
    }
}
