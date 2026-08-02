package b5;

import android.content.pm.PackageInfo;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;

/* renamed from: b5.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5541b {
    @NonNull
    public static PackageInfo a() {
        return WebView.getCurrentWebViewPackage();
    }

    public static boolean b(@NonNull WebSettings webSettings) {
        return webSettings.getSafeBrowsingEnabled();
    }

    public static WebChromeClient c(@NonNull WebView webView) {
        return webView.getWebChromeClient();
    }

    public static WebViewClient d(@NonNull WebView webView) {
        return webView.getWebViewClient();
    }

    public static void e(@NonNull WebSettings webSettings, boolean z11) {
        webSettings.setSafeBrowsingEnabled(z11);
    }
}
