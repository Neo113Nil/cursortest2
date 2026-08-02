package Zc0;

import Ae.C2406m0;
import Ae.InterfaceC2397i;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.nativeauth.pageAgreementWithConditions.data.PageAgreementWithConditionsDTO;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsFragment$observeViewModel$lambda$5$lambda$4$$inlined$collectFlow$1", f = "PageAgreementWithConditionsFragment.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35826d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2406m0 f35827e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ n f35828f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.p f35829g;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f35830a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Jb0.p f35831b;

        public a(n nVar, Jb0.p pVar) {
            this.f35830a = nVar;
            this.f35831b = pVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            n.v(this.f35830a, this.f35831b, (PageAgreementWithConditionsDTO) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C2406m0 c2406m0, kotlin.coroutines.d dVar, n nVar, Jb0.p pVar) {
        super(2, dVar);
        this.f35827e = c2406m0;
        this.f35828f = nVar;
        this.f35829g = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f35827e, dVar, this.f35828f, this.f35829g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35826d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a(this.f35828f, this.f35829g);
            this.f35826d = 1;
            if (this.f35827e.collect(aVar2, this) == aVar) {
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
