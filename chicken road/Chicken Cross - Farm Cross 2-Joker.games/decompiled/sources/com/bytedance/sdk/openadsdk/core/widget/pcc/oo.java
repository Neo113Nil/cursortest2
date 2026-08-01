package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.lo;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class oo {
    private final WeakReference<Context> pcc;
    private boolean sf = true;
    private final boolean gm = true;
    private final boolean oo = true;
    private final boolean vj = false;
    private final boolean wh = true;
    private boolean qf = true;

    public static oo pcc(Context context) {
        return new oo(context);
    }

    private oo(Context context) {
        this.pcc = new WeakReference<>(context);
    }

    public oo pcc(boolean z) {
        this.qf = z;
        return this;
    }

    public oo sf(boolean z) {
        this.sf = z;
        return this;
    }

    public void pcc(WebView webView) {
        if (webView == null || this.pcc.get() == null) {
            return;
        }
        sf(webView);
        WebSettings settings = webView.getSettings();
        pcc(settings);
        if (settings == null) {
            return;
        }
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            lo.gm("SSWebSettings", e.getMessage());
        }
        try {
            if (this.sf) {
                settings.setSupportZoom(true);
                settings.setBuiltInZoomControls(true);
            } else {
                settings.setSupportZoom(false);
            }
        } catch (Throwable th) {
            lo.gm("SSWebSettings", th.getMessage());
        }
        settings.setLoadWithOverviewMode(true);
        settings.setUseWideViewPort(true);
        settings.setDomStorageEnabled(true);
        settings.setAllowFileAccess(false);
        settings.setBlockNetworkImage(false);
        settings.setSavePassword(false);
        try {
            if (this.qf) {
                webView.setLayerType(2, null);
            } else {
                webView.setLayerType(0, null);
            }
        } catch (Throwable th2) {
            lo.gm("SSWebSettings", th2.getMessage());
        }
    }

    public static void sf(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            webView.removeJavascriptInterface("searchBoxJavaBridge_");
            webView.removeJavascriptInterface("accessibility");
            webView.removeJavascriptInterface("accessibilityTraversal");
        } catch (Throwable th) {
            lo.gm(th.toString(), new Object[0]);
        }
    }

    private void pcc(WebSettings webSettings) {
        try {
            webSettings.setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th) {
            lo.gm(th.toString(), new Object[0]);
        }
    }

    public static void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return;
        }
        int pcc = com.bytedance.sdk.openadsdk.yt.vj.pcc("clear_web_cache_new", 0);
        if (pcc == 0) {
            qfVar.pcc(true);
        } else if (pcc == 1) {
            qfVar.pcc(false);
        }
    }
}
