package Gf0;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.addDomain.AddDomainViewModel$onAddDomainClicked$1", f = "AddDomainViewModel.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class K extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f10137d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M f10138e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ D f10139f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    K(M m11, D d11, kotlin.coroutines.d<? super K> dVar) {
        super(2, dVar);
        this.f10138e = m11;
        this.f10139f = d11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new K(this.f10138e, this.f10139f, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((K) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Jf0.b bVar;
        C0 c02;
        D d11 = this.f10139f;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f10137d;
        M m11 = this.f10138e;
        try {
            if (i11 == 0) {
                Sc.s.b(obj);
                bVar = m11.f10142a;
                bVar.h(d11.c(), new F(d11), new G(d11));
                c02 = m11.f10145d;
                O o11 = O.f10148a;
                this.f10137d = 1;
                if (c02.emit(o11, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Sc.s.b(obj);
            }
        } catch (Exception e11) {
            M.g0(m11, D.a(M.e0(m11), null, 0, null, null, 0, 0L, 0L, false, e11.getMessage(), 255));
        }
        return Unit.f71690a;
    }
}
