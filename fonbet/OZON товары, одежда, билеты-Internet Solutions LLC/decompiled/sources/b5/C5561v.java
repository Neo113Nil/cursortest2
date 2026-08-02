package b5;

import android.webkit.CookieManager;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import yf.C10890a;

/* renamed from: b5.v, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5561v {

    /* renamed from: a, reason: collision with root package name */
    private final WebkitToCompatConverterBoundaryInterface f55545a;

    public C5561v(@NonNull WebkitToCompatConverterBoundaryInterface webkitToCompatConverterBoundaryInterface) {
        this.f55545a = webkitToCompatConverterBoundaryInterface;
    }

    @NonNull
    public final C5553n a(@NonNull CookieManager cookieManager) {
        return new C5553n((WebViewCookieManagerBoundaryInterface) C10890a.a(WebViewCookieManagerBoundaryInterface.class, this.f55545a.convertCookieManager(cookieManager)));
    }

    @NonNull
    public final C5556q b(@NonNull WebSettings webSettings) {
        return new C5556q((WebSettingsBoundaryInterface) C10890a.a(WebSettingsBoundaryInterface.class, this.f55545a.convertSettings(webSettings)));
    }
}
