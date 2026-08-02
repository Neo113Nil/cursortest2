package Zc0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsFragment$observeViewModel$lambda$5$lambda$4$$inlined$collectFlow$3", f = "PageAgreementWithConditionsFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class i extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35837d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f35838e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f35839f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f35840a;

        public a(n nVar) {
            this.f35840a = nVar;
        }

        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            n.x(this.f35840a, (Zc0.a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, n nVar) {
        super(2, dVar);
        this.f35838e = interfaceC2395h;
        this.f35839f = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new i(this.f35838e, dVar, this.f35839f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35837d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f35839f);
            this.f35837d = 1;
            if (this.f35838e.collect(aVar2, this) == aVar) {
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
