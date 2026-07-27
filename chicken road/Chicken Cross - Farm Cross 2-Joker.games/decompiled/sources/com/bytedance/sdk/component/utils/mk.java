package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.of;
import com.bytedance.sdk.component.vy.qf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class mk {
    private static final HashMap<String, pcc> pcc = new HashMap<>();

    public static com.bytedance.sdk.component.vy.qf pcc(Context context, AttributeSet attributeSet, int i, qf.gm gmVar) {
        WebView pcc2 = pcc(context, attributeSet, i, gmVar, false);
        if (pcc2 == null) {
            return null;
        }
        com.bytedance.sdk.component.vy.qf qfVar = new com.bytedance.sdk.component.vy.qf(context, true, gmVar);
        qfVar.setWebView(pcc2);
        qfVar.vj();
        return qfVar;
    }

    public static WebView sf(Context context, AttributeSet attributeSet, int i, qf.gm gmVar) {
        return pcc(context, attributeSet, i, gmVar, true);
    }

    private static WebView pcc(Context context, AttributeSet attributeSet, int i, qf.gm gmVar, boolean z) {
        WebView webView;
        pcc pccVar;
        if (gmVar == null || attributeSet != null || i != 0 || (pccVar = pcc.get(gmVar.gbb)) == null) {
            webView = null;
        } else {
            webView = pccVar.sf();
            if (webView != null) {
                if (webView instanceof com.bytedance.sdk.component.vy.wh) {
                    ((com.bytedance.sdk.component.vy.wh) webView).setRecycler(false);
                }
                pcc(gmVar, false);
            }
        }
        if (webView != null || !z) {
            return webView;
        }
        if (!(context instanceof MutableContextWrapper)) {
            context = new MutableContextWrapper(context);
        }
        pcc(gmVar, true);
        return i != 0 ? new com.bytedance.sdk.component.vy.wh(context, attributeSet, i) : new com.bytedance.sdk.component.vy.wh(context, attributeSet);
    }

    private static void pcc(final qf.gm gmVar, final boolean z) {
        of.pcc("webview_allocate", new of.pcc() { // from class: com.bytedance.sdk.component.utils.mk.1
            @Override // com.bytedance.sdk.component.utils.of.pcc
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new", z ? 1 : 0);
                    jSONObject.put("scene", gmVar.gbb);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
    }

    public static void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        WebView webView;
        if (qfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        pcc pccVar = pcc.get(qfVar.getScene().gbb);
        if (pccVar != null && pccVar.pcc(webView)) {
            gm(qfVar);
        } else {
            pcc(webView);
        }
    }

    public static void sf(com.bytedance.sdk.component.vy.qf qfVar) {
        WebView webView;
        if (qfVar == null || (webView = qfVar.getWebView()) == null) {
            return;
        }
        pcc pccVar = pcc.get(qfVar.getScene().gbb);
        if (pccVar != null && pccVar.pcc(webView)) {
            oo(qfVar);
        } else {
            pcc(webView);
        }
    }

    private static void pcc(WebView webView) {
        if (webView == null) {
            return;
        }
        try {
            Context context = webView.getContext();
            if (context instanceof MutableContextWrapper) {
                ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
            }
            webView.setWebChromeClient(null);
            webView.setWebViewClient(null);
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
            }
            webView.removeAllViews();
            webView.destroy();
        } catch (Exception unused) {
        }
    }

    public static void pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    pcc pccVar = new pcc(next, jSONObject.getJSONObject(next));
                    Iterator<String> it = pccVar.pcc().iterator();
                    while (it.hasNext()) {
                        pcc.put(it.next(), pccVar);
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public static void gm(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return;
        }
        try {
            qfVar.removeAllViews();
            qfVar.qf();
            qfVar.setWebChromeClient(null);
            qfVar.setWebViewClient(null);
            qfVar.setDownloadListener(null);
            qfVar.setJavaScriptEnabled(true);
            qfVar.setCacheMode(-1);
            qfVar.setSupportZoom(false);
            qfVar.setUseWideViewPort(true);
            qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
            qfVar.setDomStorageEnabled(true);
            qfVar.setBuiltInZoomControls(false);
            qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            qfVar.setLoadWithOverviewMode(false);
            qfVar.setDefaultTextEncodingName("UTF-8");
            qfVar.setDefaultFontSize(16);
            WebView webView = qfVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.vy.wh) {
                ((com.bytedance.sdk.component.vy.wh) webView).pcc();
            }
        } catch (Throwable unused) {
        }
    }

    public static void oo(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return;
        }
        try {
            qfVar.removeAllViews();
            qfVar.qf();
            qfVar.setWebChromeClient(null);
            qfVar.setWebViewClient(null);
            qfVar.setDownloadListener(null);
            qfVar.setJavaScriptEnabled(true);
            qfVar.setCacheMode(-1);
            qfVar.setSupportZoom(false);
            qfVar.setUseWideViewPort(true);
            qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
            qfVar.setDomStorageEnabled(true);
            qfVar.setBuiltInZoomControls(false);
            qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
            qfVar.setLoadWithOverviewMode(false);
            qfVar.setDefaultTextEncodingName("UTF-8");
            qfVar.setDefaultFontSize(16);
            WebView webView = qfVar.getWebView();
            if (webView instanceof com.bytedance.sdk.component.vy.wh) {
                ((com.bytedance.sdk.component.vy.wh) webView).sf();
            }
        } catch (Throwable unused) {
        }
    }

    public static int pcc(qf.gm gmVar) {
        pcc pccVar;
        if (gmVar == null || (pccVar = pcc.get(gmVar.gbb)) == null) {
            return 0;
        }
        return pccVar.gm();
    }

    public static boolean sf(qf.gm gmVar) {
        return (gmVar == null || pcc.get(gmVar.gbb) == null) ? false : true;
    }

    private static class pcc {
        private final String oo;
        public final int sf;
        public final HashSet<String> pcc = new HashSet<>();
        private final ArrayList<WebView> gm = new ArrayList<>();

        public pcc(String str, JSONObject jSONObject) {
            this.oo = str;
            this.sf = jSONObject.optInt("max_count");
            JSONArray optJSONArray = jSONObject.optJSONArray("scene");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String optString = optJSONArray.optString(i);
                    if (!TextUtils.isEmpty(optString)) {
                        this.pcc.add(optString);
                    }
                }
            }
        }

        public boolean pcc(WebView webView) {
            if (webView != null && this.gm.size() < this.sf && !this.gm.contains(webView)) {
                Context context = webView.getContext();
                if (context instanceof MutableContextWrapper) {
                    ((MutableContextWrapper) context).setBaseContext(context.getApplicationContext());
                    if (webView instanceof com.bytedance.sdk.component.vy.wh) {
                        ((com.bytedance.sdk.component.vy.wh) webView).setRecycler(true);
                    }
                    ViewParent parent = webView.getParent();
                    if (parent instanceof ViewGroup) {
                        ((ViewGroup) parent).removeView(webView);
                    }
                    this.gm.add(webView);
                    return true;
                }
            }
            return false;
        }

        public HashSet<String> pcc() {
            return this.pcc;
        }

        public WebView sf() {
            if (this.gm.isEmpty()) {
                return null;
            }
            return this.gm.remove(0);
        }

        public int gm() {
            return this.gm.size();
        }
    }
}
