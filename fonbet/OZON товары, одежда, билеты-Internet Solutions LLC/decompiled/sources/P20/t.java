package P20;

import Ae.x0;
import Dj.EnumC2873a;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import u20.InterfaceC9924a;
import xe.J;

/* loaded from: classes3.dex */
public final class t extends kotlin.coroutines.a implements J {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f21736a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(J.a aVar, s sVar) {
        super(aVar);
        this.f21736a = sVar;
    }

    @Override // xe.J
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th2) {
        Object value;
        e eVar;
        InterfaceC9924a.f99762b.f(EnumC2873a.ERROR, "SourcesListViewModel: Ошибка при отображении источников строк", th2);
        x0 x0Var = this.f21736a.f21730d;
        do {
            value = x0Var.getValue();
            eVar = (e) value;
        } while (!x0Var.b(value, th2 instanceof C20.b ? e.a(eVar, new Q20.a("🐞 Не удалось прочитать отчет о строках", "Скорее всего для этого варианта сборки не настроена его генерация в настройках плагина Localz")) : e.a(eVar, new Q20.a("🐞 Не удалось найти источники строк", "Детали ошибки должны быть в логах"))));
    }
}
