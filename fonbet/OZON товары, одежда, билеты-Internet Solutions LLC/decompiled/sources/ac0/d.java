package ac0;

import Ae.C2417s0;
import Ae.InterfaceC2397i;
import Sc.s;
import bc0.EnumC5642a;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.id.logout.presentation.LogoutActivity;
import xe.M;

@e(c = "ru.ozon.id.logout.presentation.LogoutActivity$bind$lambda$2$$inlined$collectFlow$3", f = "LogoutActivity.kt", l = {80}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class d extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f36569d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C2417s0 f36570e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ LogoutActivity f36571f;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LogoutActivity f36572a;

        public a(LogoutActivity logoutActivity) {
            this.f36572a = logoutActivity;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Ae.InterfaceC2397i
        public final Object emit(T t2, kotlin.coroutines.d<? super Unit> dVar) {
            LogoutActivity.L(this.f36572a, (EnumC5642a) t2);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C2417s0 c2417s0, kotlin.coroutines.d dVar, LogoutActivity logoutActivity) {
        super(2, dVar);
        this.f36570e = c2417s0;
        this.f36571f = logoutActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new d(this.f36570e, dVar, this.f36571f);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((d) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f36569d;
        if (i11 == 0) {
            s.b(obj);
            a aVar2 = new a(this.f36571f);
            this.f36569d = 1;
            if (this.f36570e.collect(aVar2, this) == aVar) {
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
