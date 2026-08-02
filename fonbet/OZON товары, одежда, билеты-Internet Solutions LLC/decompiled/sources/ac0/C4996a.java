package ac0;

import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.logout.presentation.LogoutActivity;
import xe.C10727i;
import xe.M;

@e(c = "ru.ozon.id.logout.presentation.LogoutActivity$bind$$inlined$repeatOnStarted$1", f = "LogoutActivity.kt", l = {69}, m = "invokeSuspend")
/* renamed from: ac0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4996a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36556d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f36557e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f36558f;

    @e(c = "ru.ozon.id.logout.presentation.LogoutActivity$bind$$inlined$repeatOnStarted$1$1", f = "LogoutActivity.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ac0.a$a, reason: collision with other inner class name */
    public static final class C0705a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        private /* synthetic */ Object f36559d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ LogoutActivity f36560e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0705a(kotlin.coroutines.d dVar, LogoutActivity logoutActivity) {
            super(2, dVar);
            this.f36560e = logoutActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C0705a c0705a = new C0705a(dVar, this.f36560e);
            c0705a.f36559d = obj;
            return c0705a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C0705a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            M m11 = (M) this.f36559d;
            LogoutActivity logoutActivity = this.f36560e;
            C10727i.c(m11, null, null, new b(LogoutActivity.K(logoutActivity).j0(), null, logoutActivity), 3);
            C10727i.c(m11, null, null, new c(LogoutActivity.K(logoutActivity).l0(), null, logoutActivity), 3);
            C10727i.c(m11, null, null, new d(LogoutActivity.K(logoutActivity).k0(), null, logoutActivity), 3);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4996a(LogoutActivity logoutActivity, kotlin.coroutines.d dVar, LogoutActivity logoutActivity2) {
        super(2, dVar);
        this.f36557e = logoutActivity;
        this.f36558f = logoutActivity2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new C4996a(this.f36557e, dVar, this.f36558f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((C4996a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36556d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            C0705a c0705a = new C0705a(null, this.f36558f);
            this.f36556d = 1;
            if (C5412d0.b(this.f36557e, bVar, c0705a, this) == aVar) {
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
