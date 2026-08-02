package Be;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collectToFun$1", f = "ChannelFlow.kt", l = {56}, m = "invokeSuspend")
/* renamed from: Be.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2634f extends kotlin.coroutines.jvm.internal.j implements Function2<ze.u<Object>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f3576d;

    /* renamed from: e, reason: collision with root package name */
    /* synthetic */ Object f3577e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC2635g<Object> f3578f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2634f(AbstractC2635g<Object> abstractC2635g, kotlin.coroutines.d<? super C2634f> dVar) {
        super(2, dVar);
        this.f3578f = abstractC2635g;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        C2634f c2634f = new C2634f(this.f3578f, dVar);
        c2634f.f3577e = obj;
        return c2634f;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ze.u<Object> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C2634f) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f3576d;
        if (i11 == 0) {
            Sc.s.b(obj);
            ze.u<? super Object> uVar = (ze.u) this.f3577e;
            this.f3576d = 1;
            if (this.f3578f.d(uVar, this) == aVar) {
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
