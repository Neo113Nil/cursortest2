package Ve;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes10.dex */
public final class H9 extends kotlin.coroutines.jvm.internal.j implements Function2 {

    /* renamed from: d, reason: collision with root package name */
    public int f29127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Na f29128e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H9(Na na2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f29128e = na2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new H9(this.f29128e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new H9(this.f29128e, (kotlin.coroutines.d) obj2).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f29127d;
        if (i11 == 0) {
            Sc.s.b(obj);
            this.f29127d = 1;
            if (this.f29128e.e0(this) == aVar) {
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
