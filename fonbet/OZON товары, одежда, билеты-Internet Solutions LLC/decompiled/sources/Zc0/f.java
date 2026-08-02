package Zc0;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsFragment$observeViewModel$lambda$5$$inlined$repeatOnStarted$1", f = "PageAgreementWithConditionsFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class f extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f35817d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f35818e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f35819f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n f35820g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Jb0.p f35821h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageAgreementWithConditions.presentation.PageAgreementWithConditionsFragment$observeViewModel$lambda$5$$inlined$repeatOnStarted$1$1", f = "PageAgreementWithConditionsFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f35822d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f35823e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ n f35824f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Jb0.p f35825g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, q qVar, n nVar, Jb0.p pVar) {
            super(2, dVar);
            this.f35823e = qVar;
            this.f35824f = nVar;
            this.f35825g = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f35823e, this.f35824f, this.f35825g);
            aVar.f35822d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            M m11 = (M) this.f35822d;
            q qVar = this.f35823e;
            C2406m0 u02 = qVar.u0();
            n nVar = this.f35824f;
            Jb0.p pVar = this.f35825g;
            C10727i.c(m11, null, null, new g(u02, null, nVar, pVar), 3);
            C10727i.c(m11, null, null, new h(qVar.r0(), null, nVar, pVar), 3);
            C10727i.c(m11, null, null, new i(qVar.q0(), null, nVar), 3);
            C10727i.c(m11, null, null, new j(qVar.s0(), null, nVar), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(J j11, kotlin.coroutines.d dVar, q qVar, n nVar, Jb0.p pVar) {
        super(2, dVar);
        this.f35818e = j11;
        this.f35819f = qVar;
        this.f35820g = nVar;
        this.f35821h = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new f(this.f35818e, dVar, this.f35819f, this.f35820g, this.f35821h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((f) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f35817d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f35819f, this.f35820g, this.f35821h);
            this.f35817d = 1;
            if (C5412d0.b(this.f35818e, bVar, aVar2, this) == aVar) {
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
