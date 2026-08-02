package J00;

import A00.a;
import Ae.InterfaceC2397i;
import Sc.s;
import fd.InterfaceC6511n;
import i10.C6997c;
import kotlin.Unit;
import l20.C7854a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$multiFetchFlow$3", f = "Middleware.kt", l = {281}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class m extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super A00.a>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13645d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f13646e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Throwable f13647f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13648g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ a.u.b f13649h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ String f13650i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ L00.i f13651j;

    /* renamed from: k, reason: collision with root package name */
    final /* synthetic */ C6997c<C7854a> f13652k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    m(b<C7854a> bVar, a.u.b bVar2, String str, L00.i iVar, C6997c<C7854a> c6997c, kotlin.coroutines.d<? super m> dVar) {
        super(3, dVar);
        this.f13648g = bVar;
        this.f13649h = bVar2;
        this.f13650i = str;
        this.f13651j = iVar;
        this.f13652k = c6997c;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super A00.a> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        String str = this.f13650i;
        L00.i iVar = this.f13651j;
        C6997c<C7854a> c6997c = this.f13652k;
        m mVar = new m(this.f13648g, this.f13649h, str, iVar, c6997c, dVar);
        mVar.f13646e = interfaceC2397i;
        mVar.f13647f = th2;
        return mVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13645d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = this.f13646e;
            Throwable th2 = this.f13647f;
            a.p pVar = new a.p(this.f13649h, this.f13650i, th2);
            b.h(this.f13648g, pVar, this.f13651j, this.f13652k);
            this.f13646e = null;
            this.f13645d = 1;
            if (interfaceC2397i.emit(pVar, this) == aVar) {
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
