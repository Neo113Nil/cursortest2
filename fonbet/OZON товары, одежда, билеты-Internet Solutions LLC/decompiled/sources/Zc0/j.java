package Zc0;

import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsFragment$observeViewModel$lambda$5$lambda$4$$inlined$collectFlow$4", f = "PageAgreementWithConditionsFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class j extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35841d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Be.n f35842e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f35843f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f35844a;

        public a(n nVar) {
            this.f35844a = nVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            n.y(this.f35844a, (Yc0.a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Be.n nVar, kotlin.coroutines.d dVar, n nVar2) {
        super(2, dVar);
        this.f35842e = nVar;
        this.f35843f = nVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new j(this.f35842e, dVar, this.f35843f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((j) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35841d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f35843f);
            this.f35841d = 1;
            if (this.f35842e.collect(aVar2, this) == aVar) {
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
