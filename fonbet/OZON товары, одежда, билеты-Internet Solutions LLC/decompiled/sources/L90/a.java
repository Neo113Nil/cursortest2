package L90;

import android.app.Application;
import android.webkit.CookieManager;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Application f16633a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ru.ozon.fintech.settings.domain.a f16634b;

    public a(@NotNull Application application, @NotNull ru.ozon.fintech.settings.domain.a fintechSettings) {
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(fintechSettings, "fintechSettings");
        this.f16633a = application;
        this.f16634b = fintechSettings;
    }

    public final void a(@NotNull String domainPrefix, @NotNull String path, @NotNull String header, boolean z11) {
        Intrinsics.checkNotNullParameter(domainPrefix, "domainPrefix");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(header, "header");
        CookieManager cookieManager = CookieManager.getInstance();
        StringBuilder sb2 = new StringBuilder("https://");
        String str = this.f16634b.u() ? "ozonru.me" : "ozon.ru";
        String packageName = this.f16633a.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        String str2 = Intrinsics.d(h.k0(packageName, ".", packageName), "apvz") ? "meet.finance." : "finance.";
        sb2.append(domainPrefix);
        if (z11) {
            sb2.append(str2);
        }
        sb2.append(str);
        try {
            cookieManager.setCookie(sb2.toString(), header + "=undefined; Max-Age=-1; Path=" + path);
            cookieManager.flush();
        } catch (Exception e11) {
            L80.a.b("CookieCleaner", "can't clear bank cookie " + header + ": " + e11);
        }
    }
}
