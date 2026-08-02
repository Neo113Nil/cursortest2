package N20;

import Ae.x0;
import Dj.EnumC2873a;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import u20.InterfaceC9924a;
import xe.J;

/* loaded from: classes3.dex */
public final class g extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f18464a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(J.a aVar, f fVar) {
        super(aVar);
        this.f18464a = fVar;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Object value;
        InterfaceC9924a.f99762b.f(EnumC2873a.ERROR, "ResourceDetailsViewModel: Ошибка при отображении переводов", th2);
        x0 x0Var = this.f18464a.f18458d;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, e.a((e) value, new Q20.a("🐞 Не удалось найти переводы", "Детали ошибки должны быть в логах"))));
    }
}
