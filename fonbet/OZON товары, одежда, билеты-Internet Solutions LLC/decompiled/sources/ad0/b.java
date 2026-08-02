package ad0;

import Jb0.q;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import androidx.lifecycle.J;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageNotification.presentation.PageNotificationFragment$observeViewModel$lambda$4$$inlined$repeatOnStarted$1", f = "PageNotificationFragment.kt", l = {69}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36575d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ J f36576e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ f f36577f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ e f36578g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ q f36579h;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.id.nativeauth.pageNotification.presentation.PageNotificationFragment$observeViewModel$lambda$4$$inlined$repeatOnStarted$1$1", f = "PageNotificationFragment.kt", l = {}, m = "invokeSuspend")
    public static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f36580d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f36581e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ e f36582f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ q f36583g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kotlin.coroutines.d dVar, f fVar, e eVar, q qVar) {
            super(2, dVar);
            this.f36581e = fVar;
            this.f36582f = eVar;
            this.f36583g = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(dVar, this.f36581e, this.f36582f, this.f36583g);
            aVar.f36580d = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            C10727i.c((M) this.f36580d, null, null, new c(this.f36581e.j0(), null, this.f36582f, this.f36583g), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(J j11, kotlin.coroutines.d dVar, f fVar, e eVar, q qVar) {
        super(2, dVar);
        this.f36576e = j11;
        this.f36577f = fVar;
        this.f36578g = eVar;
        this.f36579h = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f36576e, dVar, this.f36577f, this.f36578g, this.f36579h);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36575d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            a aVar2 = new a(null, this.f36577f, this.f36578g, this.f36579h);
            this.f36575d = 1;
            if (C5412d0.b(this.f36576e, bVar, aVar2, this) == aVar) {
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
