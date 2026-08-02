package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes10.dex */
public final class Tj extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4194dp f30059d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f30060e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tj(C4194dp c4194dp, String str, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f30059d = c4194dp;
        this.f30060e = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new Tj(this.f30059d, this.f30060e, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new Tj(this.f30059d, this.f30060e, (kotlin.coroutines.d) obj).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        ((C4238fb) this.f30059d.f30894c).b(new Vn(this.f30060e));
        return Unit.f71690a;
    }
}
