package Dc0;

import Ae.InterfaceC2395h;
import Fc0.c;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$$inlined$repeatOnStarted$1", f = "FintechRecoveryCameraFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class r extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f6522d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f6523e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ q f6524f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Jb0.g f6525g;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.fintech.presentation.camera.FintechRecoveryCameraFragment$observeViewModel$$inlined$repeatOnStarted$1$1", f = "FintechRecoveryCameraFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f6526d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f6527e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Jb0.g f6528f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, q qVar, Jb0.g gVar) {
            super(2, dVar);
            this.f6527e = qVar;
            this.f6528f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f6527e, this.f6528f);
            aVar.f6526d = obj;
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
            M m11 = (M) this.f6526d;
            q qVar = this.f6527e;
            InterfaceC2395h<c.b> z02 = qVar.M().z0();
            Jb0.g gVar = this.f6528f;
            C10727i.c(m11, null, null, new s(z02, null, qVar, gVar), 3);
            C10727i.c(m11, null, null, new t(qVar.M().s0(), null, qVar), 3);
            C10727i.c(m11, null, null, new u(qVar.M().t0(), null, qVar, gVar), 3);
            C10727i.c(m11, null, null, new v(qVar.M().w0(), null, qVar), 3);
            C10727i.c(m11, null, null, new w(qVar.M().A0(), null, qVar), 3);
            C10727i.c(m11, null, null, new x(qVar.M().y0(), null, qVar), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(J j11, kotlin.coroutines.d dVar, q qVar, Jb0.g gVar) {
        super(2, dVar);
        this.f6523e = j11;
        this.f6524f = qVar;
        this.f6525g = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new r(this.f6523e, dVar, this.f6524f, this.f6525g);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((r) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f6522d;
        if (i11 == 0) {
            Sc.s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f6524f, this.f6525g);
            this.f6522d = 1;
            if (C5412d0.b(this.f6523e, bVar, aVar2, this) == aVar) {
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
