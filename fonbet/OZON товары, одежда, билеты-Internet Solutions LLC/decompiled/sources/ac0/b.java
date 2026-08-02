package ac0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Kb0.K;
import Sc.o;
import Sc.s;
import Xb0.b;
import bc0.AbstractC5649h;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.logout.presentation.LogoutActivity;
import xe.M;

@e(c = "ru.ozon.id.logout.presentation.LogoutActivity$bind$lambda$2$$inlined$collectFlow$1", f = "LogoutActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class b extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36561d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f36562e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f36563f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LogoutActivity f36564a;

        public a(LogoutActivity logoutActivity) {
            this.f36564a = logoutActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            Xb0.b bVar;
            AbstractC5649h abstractC5649h = (AbstractC5649h) t2;
            int i11 = LogoutActivity.f97174l;
            LogoutActivity logoutActivity = this.f36564a;
            if (!(abstractC5649h instanceof AbstractC5649h.a)) {
                throw new o();
            }
            AbstractC5649h.a.AbstractC0835a a11 = ((AbstractC5649h.a) abstractC5649h).a();
            if (a11 instanceof AbstractC5649h.a.AbstractC0835a.b) {
                bVar = new b.C0613b(((AbstractC5649h.a.AbstractC0835a.b) a11).a());
            } else if (a11 instanceof AbstractC5649h.a.AbstractC0835a.C0836a) {
                bVar = b.a.f34275a;
            } else {
                if (a11 != null) {
                    throw new o();
                }
                bVar = b.a.f34275a;
            }
            K k11 = Tb0.a.f26975d;
            if (k11 == null) {
                throw new Lb0.a();
            }
            k11.K().getValue().c(bVar, false);
            logoutActivity.finish();
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, LogoutActivity logoutActivity) {
        super(2, dVar);
        this.f36562e = interfaceC2395h;
        this.f36563f = logoutActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new b(this.f36562e, dVar, this.f36563f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((b) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36561d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f36563f);
            this.f36561d = 1;
            if (this.f36562e.collect(aVar2, this) == aVar) {
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
