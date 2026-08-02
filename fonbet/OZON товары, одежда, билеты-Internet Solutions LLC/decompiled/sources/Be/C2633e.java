package Be;

import Ae.C2399j;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {119}, m = "invokeSuspend")
/* renamed from: Be.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2633e extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3572d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f3573e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i<Object> f3574f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ AbstractC2635g<Object> f3575g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2633e(InterfaceC2397i<Object> interfaceC2397i, AbstractC2635g<Object> abstractC2635g, kotlin.coroutines.d<? super C2633e> dVar) {
        super(2, dVar);
        this.f3574f = interfaceC2397i;
        this.f3575g = abstractC2635g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C2633e c2633e = new C2633e(this.f3574f, this.f3575g, dVar);
        c2633e.f3573e = obj;
        return c2633e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2633e) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3572d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.w<Object> g10 = this.f3575g.g((M) this.f3573e);
            this.f3572d = 1;
            if (C2399j.s(this.f3574f, g10, this) == aVar) {
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
