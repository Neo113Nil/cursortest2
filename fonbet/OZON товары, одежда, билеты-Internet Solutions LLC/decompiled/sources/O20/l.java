package O20;

import Ae.x0;
import Dj.EnumC2873a;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import u20.InterfaceC9924a;
import xe.J;

/* loaded from: classes3.dex */
public final class l extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ m f19899a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(J.a aVar, m mVar) {
        super(aVar);
        this.f19899a = mVar;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Object value;
        InterfaceC9924a.f99762b.f(EnumC2873a.ERROR, "ResourceListViewModel: Ошибка при отображении списка строк", th2);
        x0 x0Var = this.f19899a.f19903d;
        do {
            value = x0Var.getValue();
        } while (!x0Var.b(value, k.a((k) value, null, null, new Q20.a("🐞 Не удалось найти строки", "Детали ошибки должны быть в логах"), 7)));
    }
}
