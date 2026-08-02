package J60;

import F60.f;
import com.squareup.moshi.Moshi;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.GoBackModel;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.NavigationLifecycleEvent;
import ru.ozon.fintech.features.finwebview.domain.webbridge.groups.navigation.models.NavigationTabId;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final WeakReference<FintechWebView> f14161a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Moshi f14162b;

    /* renamed from: c, reason: collision with root package name */
    private final Function1<String, Boolean> f14163c;

    public a(@NotNull WeakReference weakWebView, @NotNull Moshi moshi, Function1 function1) {
        Intrinsics.checkNotNullParameter("window.web_bridge", "webBridgeLocation");
        Intrinsics.checkNotNullParameter(weakWebView, "weakWebView");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.f14161a = weakWebView;
        this.f14162b = moshi;
        this.f14163c = function1;
    }

    public final Object a(@NotNull NavigationTabId navigationTabId, @NotNull d<? super Unit> dVar) {
        String str;
        FintechWebView fintechWebView = this.f14161a.get();
        try {
            str = this.f14162b.c(NavigationTabId.class).toJson(navigationTabId);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        Object b11 = f.b(this.f14163c, fintechWebView, "app_become_active", str, (j) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    public final Object b(@NotNull NavigationTabId navigationTabId, @NotNull d<? super Unit> dVar) {
        String str;
        FintechWebView fintechWebView = this.f14161a.get();
        try {
            str = this.f14162b.c(NavigationTabId.class).toJson(navigationTabId);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        Object b11 = f.b(this.f14163c, fintechWebView, "app_enter_background", str, (j) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    public final Object c(@NotNull GoBackModel goBackModel, @NotNull d<? super Boolean> dVar) {
        String str;
        FintechWebView fintechWebView = this.f14161a.get();
        try {
            str = this.f14162b.c(GoBackModel.class).toJson(goBackModel);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        return f.a(this.f14163c, fintechWebView, "navigation", "go_back", str, (j) dVar);
    }

    public final Object d(@NotNull NavigationLifecycleEvent navigationLifecycleEvent, @NotNull d<? super Unit> dVar) {
        String str;
        FintechWebView fintechWebView = this.f14161a.get();
        try {
            str = this.f14162b.c(NavigationLifecycleEvent.class).toJson(navigationLifecycleEvent);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        Object b11 = f.b(this.f14163c, fintechWebView, "on_start", str, (j) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    public final Object e(@NotNull NavigationLifecycleEvent navigationLifecycleEvent, @NotNull d<? super Unit> dVar) {
        String str;
        FintechWebView fintechWebView = this.f14161a.get();
        try {
            str = this.f14162b.c(NavigationLifecycleEvent.class).toJson(navigationLifecycleEvent);
        } catch (Throwable th2) {
            th2.printStackTrace();
            str = "";
        }
        Object b11 = f.b(this.f14163c, fintechWebView, "on_stop", str, (j) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }

    public final Object f(@NotNull d<? super Unit> dVar) {
        Object b11 = f.b(this.f14163c, this.f14161a.get(), "rotated", null, (j) dVar);
        return b11 == Wc.a.COROUTINE_SUSPENDED ? b11 : Unit.f71690a;
    }
}
