package J00;

import A00.a;
import Sc.s;
import i10.C6997c;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l20.C7854a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$jsonFlow$2", f = "Middleware.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<P00.k<C7854a>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f13616d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13617e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ a.InterfaceC0008a<? extends A00.a> f13618f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C6997c<C7854a> f13619g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(b<C7854a> bVar, a.InterfaceC0008a<? extends A00.a> interfaceC0008a, C6997c<C7854a> c6997c, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f13617e = bVar;
        this.f13618f = interfaceC0008a;
        this.f13619g = c6997c;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        i iVar = new i(this.f13617e, this.f13618f, this.f13619g, dVar);
        iVar.f13616d = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(P00.k<C7854a> kVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(kVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        s.b(obj);
        b.i(this.f13617e, (P00.k) this.f13616d, this.f13618f, this.f13619g);
        return Unit.f71690a;
    }
}
