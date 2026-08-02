package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: Ve.l4, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C4404l4 extends kotlin.coroutines.jvm.internal.j implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ R4 f31505d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4404l4(R4 r42, kotlin.coroutines.d dVar) {
        super(1, dVar);
        this.f31505d = r42;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(kotlin.coroutines.d dVar) {
        return new C4404l4(this.f31505d, dVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C4404l4(this.f31505d, (kotlin.coroutines.d) obj).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        Sc.s.b(obj);
        R4 r42 = this.f31505d;
        ((C4238fb) r42.f29820c).b(new C4644td(r42.f29822e));
        return Unit.f71690a;
    }
}
