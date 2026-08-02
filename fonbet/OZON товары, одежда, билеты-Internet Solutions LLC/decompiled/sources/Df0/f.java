package Df0;

import Sc.s;
import We.InterfaceC4865g;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.M;
import xe.l1;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.cronet.CronetInterceptor$launchCancellationStatusCheck$1", f = "CronetInterceptor.kt", l = {175}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class f extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6698d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC4865g f6699e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ e f6700f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Ja.i f6701g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    f(InterfaceC4865g interfaceC4865g, e eVar, Ja.i iVar, kotlin.coroutines.d<? super f> dVar) {
        super(2, dVar);
        this.f6699e = interfaceC4865g;
        this.f6700f = eVar;
        this.f6701g = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f6699e, this.f6700f, this.f6701g, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ga.a aVar;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6698d;
        if (i11 == 0) {
            s.b(obj);
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
            } catch (Exception unused) {
            }
        }
        while (!this.f6699e.isCanceled()) {
            this.f6698d = 1;
            if (l1.a(this) == aVar2) {
                return aVar2;
            }
        }
        aVar = this.f6700f.f6692a;
        ((Oa.c) aVar.b()).a(this.f6701g);
        return Unit.f71690a;
    }
}
