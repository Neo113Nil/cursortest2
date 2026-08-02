package J00;

import A00.a;
import Ae.InterfaceC2397i;
import Sc.s;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import fd.InterfaceC6511n;
import i10.C6997c;
import kotlin.Unit;
import l20.C7854a;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.composer.middleware.MiddlewareImpl$jsonFlow$4", f = "Middleware.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class j extends kotlin.coroutines.jvm.internal.j implements InterfaceC6511n<InterfaceC2397i<? super A00.a>, Throwable, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f13620d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ InterfaceC2397i f13621e;

    /* renamed from: f, reason: collision with root package name */
    /* synthetic */ Throwable f13622f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b<C7854a> f13623g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ A00.a f13624h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ L00.i f13625i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ C6997c<C7854a> f13626j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    j(b<C7854a> bVar, A00.a aVar, L00.i iVar, C6997c<C7854a> c6997c, kotlin.coroutines.d<? super j> dVar) {
        super(3, dVar);
        this.f13623g = bVar;
        this.f13624h = aVar;
        this.f13625i = iVar;
        this.f13626j = c6997c;
    }

    @Override // fd.InterfaceC6511n
    public final Object invoke(InterfaceC2397i<? super A00.a> interfaceC2397i, Throwable th2, kotlin.coroutines.d<? super Unit> dVar) {
        L00.i iVar = this.f13625i;
        C6997c<C7854a> c6997c = this.f13626j;
        j jVar = new j(this.f13623g, this.f13624h, iVar, c6997c, dVar);
        jVar.f13621e = interfaceC2397i;
        jVar.f13622f = th2;
        return jVar.invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f13620d;
        if (i11 == 0) {
            s.b(obj);
            InterfaceC2397i interfaceC2397i = this.f13621e;
            a.p pVar = new a.p(this.f13624h, "", this.f13622f);
            b.h(this.f13623g, pVar, this.f13625i, this.f13626j);
            this.f13621e = null;
            this.f13620d = 1;
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
