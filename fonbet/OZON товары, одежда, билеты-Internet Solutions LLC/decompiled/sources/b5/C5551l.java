package b5;

import a5.AbstractC4948f;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* renamed from: b5.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5551l {
    @Deprecated
    public static int a(@NonNull WebSettings webSettings) {
        int forceDark;
        forceDark = webSettings.getForceDark();
        return forceDark;
    }

    public static WebViewRenderProcess b(@NonNull WebView webView) {
        WebViewRenderProcess webViewRenderProcess;
        webViewRenderProcess = webView.getWebViewRenderProcess();
        return webViewRenderProcess;
    }

    public static WebViewRenderProcessClient c(@NonNull WebView webView) {
        WebViewRenderProcessClient webViewRenderProcessClient;
        webViewRenderProcessClient = webView.getWebViewRenderProcessClient();
        return webViewRenderProcessClient;
    }

    @Deprecated
    public static void d(@NonNull WebSettings webSettings, int i11) {
        webSettings.setForceDark(i11);
    }

    public static void e(@NonNull WebView webView, AbstractC4948f abstractC4948f) {
        webView.setWebViewRenderProcessClient(null);
    }

    public static void f(@NonNull WebView webView, @NonNull Executor executor, AbstractC4948f abstractC4948f) {
        webView.setWebViewRenderProcessClient(executor, null);
    }

    public static boolean g(@NonNull WebViewRenderProcess webViewRenderProcess) {
        boolean terminate;
        terminate = webViewRenderProcess.terminate();
        return terminate;
    }
}
