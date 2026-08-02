package Wc0;

import Ae.C2406m0;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$$inlined$repeatOnStarted$1", f = "OtpFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class g extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f33466d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f33467e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Xc0.d f33468f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ b f33469g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.otp.view.OtpFragment$observeViewModel$lambda$20$$inlined$repeatOnStarted$1$1", f = "OtpFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f33470d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Xc0.d f33471e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b f33472f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, Xc0.d dVar2, b bVar) {
            super(2, dVar);
            this.f33471e = dVar2;
            this.f33472f = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f33471e, this.f33472f);
            aVar.f33470d = obj;
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
            M m11 = (M) this.f33470d;
            Xc0.d dVar = this.f33471e;
            C2406m0 Q02 = dVar.Q0();
            b bVar = this.f33472f;
            C10727i.c(m11, null, null, new h(Q02, null, bVar), 3);
            C10727i.c(m11, null, null, new i(dVar.N0(), null, bVar), 3);
            C10727i.c(m11, null, null, new j(dVar.O0(), null, bVar), 3);
            C10727i.c(m11, null, null, new k(dVar.L0(), null, bVar), 3);
            C10727i.c(m11, null, null, new l(dVar.K0(), null, bVar), 3);
            C10727i.c(m11, null, null, new m(dVar.P0(), null, bVar), 3);
            C10727i.c(m11, null, null, new n(dVar.J0(), null, bVar), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(J j11, kotlin.coroutines.d dVar, Xc0.d dVar2, b bVar) {
        super(2, dVar);
        this.f33467e = j11;
        this.f33468f = dVar2;
        this.f33469g = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new g(this.f33467e, dVar, this.f33468f, this.f33469g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((g) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f33466d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f33468f, this.f33469g);
            this.f33466d = 1;
            if (C5412d0.b(this.f33467e, bVar, aVar2, this) == aVar) {
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
