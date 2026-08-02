package Gf0;

import Ae.C0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.network.internal.debugMenu.screen.addDomain.AddDomainViewModel$onCancelClicked$1$1", f = "AddDomainViewModel.kt", l = {79}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class L extends kotlin.coroutines.jvm.internal.j implements Function2<xe.M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f10140d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ M f10141e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L(M m11, kotlin.coroutines.d<? super L> dVar) {
        super(2, dVar);
        this.f10141e = m11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new L(this.f10141e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(xe.M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((L) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        C0 c02;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f10140d;
        if (i11 == 0) {
            Sc.s.b(obj);
            c02 = this.f10141e.f10145d;
            O o11 = O.f10148a;
            this.f10140d = 1;
            if (c02.emit(o11, this) == aVar) {
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
