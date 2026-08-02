package J00;

import Ae.InterfaceC2397i;
import Sc.s;
import i10.h;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import l20.C7854a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$jsonFlow$1", f = "Middleware.kt", l = {212}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class h extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super P00.k<C7854a>>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13611d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f13612e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13613f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ h.c.b f13614g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ L00.i f13615h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(b<C7854a> bVar, h.c.b bVar2, L00.i iVar, kotlin.coroutines.d<? super h> dVar) {
        super(2, dVar);
        this.f13613f = bVar;
        this.f13614g = bVar2;
        this.f13615h = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        h hVar = new h(this.f13613f, this.f13614g, this.f13615h, dVar);
        hVar.f13612e = obj;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super P00.k<C7854a>> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((h) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        K00.i iVar;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13611d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = (InterfaceC2397i) this.f13612e;
            iVar = ((b) this.f13613f).f13552b;
            P00.k d11 = iVar.d(this.f13614g.a(), this.f13615h);
            this.f13611d = 1;
            if (interfaceC2397i.emit(d11, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
