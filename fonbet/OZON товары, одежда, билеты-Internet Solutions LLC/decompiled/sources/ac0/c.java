package ac0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import Sc.s;
import bc0.AbstractC5650i;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.logout.presentation.LogoutActivity;
import xe.M;

@e(c = "ru.ozon.id.logout.presentation.LogoutActivity$bind$lambda$2$$inlined$collectFlow$2", f = "LogoutActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class c extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36565d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f36566e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f36567f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LogoutActivity f36568a;

        public a(LogoutActivity logoutActivity) {
            this.f36568a = logoutActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            LogoutActivity.M(this.f36568a, (AbstractC5650i) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, LogoutActivity logoutActivity) {
        super(2, dVar);
        this.f36566e = interfaceC2395h;
        this.f36567f = logoutActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new c(this.f36566e, dVar, this.f36567f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((c) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36565d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f36567f);
            this.f36565d = 1;
            if (this.f36566e.collect(aVar2, this) == aVar) {
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
