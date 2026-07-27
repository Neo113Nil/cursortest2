package com.bytedance.sdk.openadsdk.core.widget.pcc;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.sf.pcc.gbb;
import com.bytedance.sdk.component.sf.pcc.jr;
import com.bytedance.sdk.component.sf.pcc.tmg;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.activity.single.TTCeilingLandingPageActivity;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.tmg;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.lo;
import com.bytedance.sdk.openadsdk.utils.yt;
import com.google.common.net.HttpHeaders;
import com.tiktok.util.UrlConst;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends qf.pcc {
    private static final HashSet<String> tz;
    private boolean dax;
    private com.bytedance.sdk.openadsdk.gbb.oo fum;
    private String gbb;
    protected final mu gm;
    private JSONObject gpj;
    private com.bytedance.sdk.openadsdk.common.vj hc;
    private final Stack<String> jr;
    protected boolean kj;
    private of lo;
    private com.bytedance.sdk.openadsdk.core.jr.oo.sf lu;
    private TTCeilingLandingPageActivity.pcc nac;
    protected final Context oo;
    private tmg ork;
    private final boolean pcc;
    protected boolean qf;
    private String sf;
    private boolean tmg;
    private Map<String, Object> vh;
    protected final String vj;
    protected boolean vy;
    protected hc wh;

    public void pcc(tmg tmgVar) {
        this.ork = tmgVar;
    }

    public void pcc(Map<String, Object> map) {
        this.vh = map;
    }

    public void pcc(JSONObject jSONObject) {
        this.gpj = jSONObject;
    }

    public void pcc(String str) {
        this.sf = str;
    }

    public void pcc(of ofVar) {
        this.lo = ofVar;
    }

    public wh(Context context, mu muVar, String str, com.bytedance.sdk.openadsdk.common.vj vjVar, hc hcVar, boolean z, boolean z2, TTCeilingLandingPageActivity.pcc pccVar) {
        this(context, muVar, str, vjVar, hcVar, z);
        this.dax = z2;
        this.nac = pccVar;
    }

    public wh(Context context, mu muVar, String str, com.bytedance.sdk.openadsdk.common.vj vjVar, hc hcVar, boolean z) {
        this(context, muVar, str, hcVar, z);
        this.hc = vjVar;
    }

    public wh(Context context, mu muVar, String str, hc hcVar, boolean z) {
        this.qf = true;
        this.kj = true;
        this.vy = false;
        this.oo = context;
        this.gm = muVar;
        this.vj = str;
        this.wh = hcVar;
        this.pcc = z;
        this.jr = new Stack<>();
    }

    public hc sf() {
        return this.wh;
    }

    public void pcc(com.bytedance.sdk.openadsdk.gbb.oo ooVar) {
        this.fum = ooVar;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        of ofVar;
        try {
            String host = webResourceRequest.getUrl().getHost();
            if (webResourceRequest.getMethod().equalsIgnoreCase("GET") && (ofVar = this.lo) != null && !ofVar.bkt().isEmpty() && this.lo.bkt().containsKey(host)) {
                String str = this.lo.bkt().get(host);
                if (!TextUtils.isEmpty(str)) {
                    return pcc(webResourceRequest, host, str);
                }
            }
        } catch (Throwable unused) {
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    private WebResourceResponse pcc(WebResourceRequest webResourceRequest, String str, String str2) {
        try {
            String replace = webResourceRequest.getUrl().toString().replace(str, str2);
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            tmg.pcc pcc = new tmg.pcc().pcc().sf(replace).pcc("pixel_web").pcc(10);
            String cookie = CookieManager.getInstance().getCookie(UrlConst.HTTPS.concat(String.valueOf(str)));
            if (cookie != null) {
                pcc.sf(HttpHeaders.COOKIE, cookie);
            }
            if (requestHeaders != null) {
                for (Map.Entry<String, String> entry : requestHeaders.entrySet()) {
                    pcc.sf(entry.getKey(), entry.getValue());
                }
            }
            gbb sf = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().kj().pcc(pcc.sf()).sf();
            if (sf == null) {
                return null;
            }
            int gm = sf.gm();
            jr wh = sf.wh();
            String str3 = "";
            if (wh.vj() != null) {
                str3 = wh.vj().pcc();
            }
            String str4 = str3;
            if (wh == null) {
                return null;
            }
            return new WebResourceResponse(str4, wh.wh(), gm, sf.vj(), pcc.pcc(sf.ork(), str), wh.gm());
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        hc hcVar = this.wh;
        if (hcVar != null) {
            hcVar.sf(webView, str, this.pcc);
        }
        com.bytedance.sdk.openadsdk.common.vj vjVar = this.hc;
        if (vjVar != null) {
            vjVar.pcc(webView, str);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Uri parse;
        String lowerCase;
        Intent intent;
        hc hcVar = this.wh;
        if (hcVar != null) {
            hcVar.pcc(str, this.pcc);
        }
        com.bytedance.sdk.openadsdk.common.vj vjVar = this.hc;
        if (vjVar != null) {
            vjVar.pcc(webView, str, this.pcc);
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.fum;
        if (ooVar != null && this.pcc) {
            ooVar.sf(str);
        }
        if (pcc(webView, str)) {
            return true;
        }
        of ofVar = this.lo;
        if (ofVar != null && ofVar.lu() == 1 && ((com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(str, this.lo) || com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(this.lo, str)) && com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.sf(this.lo, this.oo, true))) {
            return true;
        }
        try {
            parse = Uri.parse(str);
            lowerCase = parse.getScheme().toLowerCase();
        } catch (Throwable unused) {
            mu muVar = this.gm;
            if (muVar != null && muVar.vj()) {
                return true;
            }
        }
        if ("bytedance".equals(lowerCase)) {
            lo.pcc(parse, this.gm);
            return true;
        }
        if (gm(str)) {
            return true;
        }
        if (!lu.pcc(str)) {
            if (com.bytedance.sdk.openadsdk.core.model.lo.vh(this.lo)) {
                pcc(lowerCase, str);
                return true;
            }
            try {
                if (str.startsWith("intent:")) {
                    intent = Intent.parseUri(str, 1);
                } else if (str.startsWith("android-app:")) {
                    intent = Intent.parseUri(str, 2);
                } else {
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(parse);
                    intent = intent2;
                }
                intent.addFlags(268435456);
                if (com.bytedance.sdk.openadsdk.yt.vj.pcc("intent_safe_jump", 0) == 1) {
                    pcc(intent, lowerCase, str);
                } else {
                    sf(intent, lowerCase, str);
                }
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.lo.pcc("WebChromeClient", "parseUri", th);
                pcc(lowerCase, false, 1, th.getMessage(), str);
            }
            com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar = this.lu;
            if (sfVar != null) {
                sfVar.kz();
            }
            return true;
        }
        return super.shouldOverrideUrlLoading(webView, str);
    }

    private void pcc(Intent intent, final String str, final String str2) {
        com.bytedance.sdk.component.utils.sf.pcc(this.oo, intent, new sf.InterfaceC0131sf() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.wh.1
            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0131sf
            public void pcc() {
                wh.this.pcc(str, true, 0, "", str2);
            }

            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0131sf
            public void pcc(Throwable th) {
                wh.this.pcc(str, false, 2, th.getMessage(), str2);
            }
        });
    }

    private void sf(Intent intent, String str, String str2) {
        ActivityInfo resolveActivityInfo = intent.resolveActivityInfo(this.oo.getApplicationContext().getPackageManager(), 65536);
        if (resolveActivityInfo != null && resolveActivityInfo.exported) {
            intent.setFlags(intent.getFlags() & (-196));
            HashSet hashSet = new HashSet();
            hashSet.add("android.intent.action.CHOOSER");
            hashSet.add("android.intent.action.SEND");
            hashSet.add("android.intent.action.SEND_MULTIPLE");
            hashSet.add("android.media.action.IMAGE_CAPTURE");
            hashSet.add("android.media.action.IMAGE_CAPTURE_SECURE");
            hashSet.add("android.media.action.VIDEO_CAPTURE");
            if (hashSet.contains(intent.getAction())) {
                pcc(str, str2, -2, "blockAllowList:" + intent.getAction());
                return;
            } else {
                pcc(intent, str, str2);
                return;
            }
        }
        pcc(str, str2, -1, "exported is false");
    }

    private void pcc(final String str, final String str2, final int i, final String str3) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("intent_safe_jump", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.wh.2
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put("scheme", str);
                jSONObject.put("url", str2);
                jSONObject.put("error", i);
                jSONObject.put("msg", str3);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("intent_safe_jump").sf(jSONObject.toString());
            }
        });
    }

    private void pcc(String str, String str2) {
        if ((vj(str) || "market".equals(str)) && ((this.ork != null || this.gpj != null) && sf(str2))) {
            gm();
        }
        this.ork = null;
        this.gpj = null;
    }

    public boolean sf(String str) {
        String str2;
        String str3;
        if (this.oo == null) {
            return false;
        }
        of ofVar = this.lo;
        if (ofVar != null && ofVar.xfm() != null) {
            str2 = this.lo.xfm().gm();
            str3 = this.lo.xfm().pcc();
        } else {
            str2 = "";
            str3 = "";
        }
        Context context = this.oo;
        of ofVar2 = this.lo;
        return com.bytedance.sdk.openadsdk.fum.pcc.pcc.pcc.pcc(context, str, ofVar2, kun.sf(ofVar2), null, true) || com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(this.lo, str2, this.oo, this.sf, (Map<String, Object>) null) || com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(this.oo, str3, str2, this.sf, this.lo);
    }

    private boolean vj(String str) {
        if (com.bytedance.sdk.openadsdk.core.model.lo.vh(this.lo)) {
            return TextUtils.equals(this.lo.sw(), str);
        }
        return false;
    }

    public void gm() {
        if (TextUtils.isEmpty(this.sf) || !com.bytedance.sdk.openadsdk.core.model.lo.ork(this.lo) || this.tmg) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tmg tmgVar = this.ork;
        if (tmgVar != null) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc("click", this.lo, tmgVar, this.sf, true, this.vh, 1);
            this.tmg = true;
            return;
        }
        JSONObject jSONObject = this.gpj;
        if (jSONObject != null) {
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.lo, this.sf, "click", jSONObject);
            this.tmg = true;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        hc hcVar = this.wh;
        if (hcVar != null) {
            hcVar.pcc(webView, str, this.pcc);
        }
        com.bytedance.sdk.openadsdk.common.vj vjVar = this.hc;
        if (vjVar != null) {
            vjVar.sf(webView, str, this.pcc);
        }
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        of ofVar;
        super.onPageStarted(webView, str, bitmap);
        of ofVar2 = this.lo;
        int pcc = (ofVar2 != null && ofVar2.zpi() && com.bytedance.sdk.openadsdk.yt.vj.pcc("opt_web_index", false)) ? kun.pcc(webView) : -1;
        new Object[]{"currentUrlIndex is:", Integer.valueOf(pcc)};
        hc hcVar = this.wh;
        if (hcVar != null) {
            hcVar.pcc(webView, str, bitmap, this.pcc, pcc);
        }
        com.bytedance.sdk.openadsdk.common.vj vjVar = this.hc;
        if (vjVar != null) {
            vjVar.gm(webView, str, this.pcc);
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.fum;
        if (ooVar != null && this.pcc) {
            ooVar.pcc(str);
        }
        if (this.pcc && (ofVar = this.lo) != null && ofVar.zpi() && this.lo.qy().sf() >= 2) {
            if (!TextUtils.isEmpty(str) && !str.equals(this.gbb)) {
                if (this.jr.contains(str)) {
                    while (!str.equals(this.jr.peek())) {
                        this.jr.pop();
                    }
                } else {
                    this.jr.push(str);
                }
            }
            this.gbb = str;
        }
        new Object[]{"mNeedHardwareAcceleration:", Boolean.valueOf(this.kj), "hasSetHardwareAccelerate", Boolean.valueOf(this.vy)};
        if (!this.kj || this.vy) {
            return;
        }
        this.vy = true;
        oo.pcc(this.oo).pcc(true).sf(webView.getSettings().getBuiltInZoomControls()).pcc(webView);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (this.wh == null || webResourceError == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str = "";
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders.containsKey("accept")) {
            str = requestHeaders.get("accept");
        }
        this.wh.pcc(webView, webResourceError.getErrorCode(), String.valueOf(webResourceError.getDescription()), uri, str, webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        if (this.wh == null || webResourceResponse == null) {
            return;
        }
        Uri url = webResourceRequest.getUrl();
        String str = "";
        String uri = url != null ? url.toString() : "";
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders.containsKey("accept")) {
            str = requestHeaders.get("accept");
        }
        this.wh.pcc(webView, webResourceResponse.getStatusCode(), String.valueOf(webResourceResponse.getReasonPhrase()), uri, str, webResourceRequest != null && webResourceRequest.isForMainFrame());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        if (sslErrorHandler != null) {
            try {
                sslErrorHandler.cancel();
            } catch (Throwable unused) {
            }
        }
        if (this.wh != null) {
            int i = 0;
            String str = "SslError: unknown";
            String str2 = null;
            if (sslError != null) {
                try {
                    i = sslError.getPrimaryError();
                    str = "SslError: ".concat(String.valueOf(sslError));
                    str2 = sslError.getUrl();
                } catch (Throwable unused2) {
                }
            }
            String str3 = str2;
            this.wh.pcc(webView, i, str, str3, oo(str3), true);
        }
    }

    public boolean gm(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            if ("play.google.com".equals(parse.getHost())) {
                if (com.bytedance.sdk.openadsdk.core.model.lo.vh(this.lo) && this.gpj == null && this.ork == null) {
                    return true;
                }
                Intent intent = new Intent("android.intent.action.VIEW");
                if (!(this.oo instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                intent.setData(parse);
                intent.setPackage("com.android.vending");
                this.oo.startActivity(intent);
                gm();
                this.gpj = null;
                this.ork = null;
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    static {
        HashSet<String> hashSet = new HashSet<>();
        tz = hashSet;
        hashSet.add("png");
        hashSet.add("ico");
        hashSet.add("jpg");
        hashSet.add("gif");
        hashSet.add("svg");
        hashSet.add("jpeg");
    }

    public static String oo(String str) {
        int lastIndexOf;
        String substring;
        if (str == null || (lastIndexOf = str.lastIndexOf(46)) < 0 || lastIndexOf == str.length() - 1 || (substring = str.substring(lastIndexOf)) == null || !tz.contains(substring.toLowerCase(Locale.getDefault()))) {
            return null;
        }
        return "image/".concat(String.valueOf(substring));
    }

    private boolean pcc(WebView webView, String str) {
        if (!kun.oo(this.lo) || this.lo.qy() == null || webView == null) {
            return false;
        }
        int sf = this.lo.qy().sf();
        int size = this.jr.size();
        if (this.dax) {
            size++;
        }
        new Object[]{"boc_index is:", Integer.valueOf(sf), "currentIndex is:", Integer.valueOf(size)};
        if (size + 1 != sf) {
            return false;
        }
        yt.pcc(this.oo, str, this.lo, sf.pcc.oo, true);
        TTCeilingLandingPageActivity.pcc pccVar = this.nac;
        if (pccVar != null) {
            pccVar.pcc();
        }
        return true;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        this.lu = sfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final String str, final boolean z, final int i, final String str2, final String str3) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), this.lo, this.sf, "lp_not_http_open", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.widget.pcc.wh.3
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("schema", str);
                    jSONObject.put("jump_url", str3);
                    jSONObject.put("success", z);
                    jSONObject.put("error_type", i);
                    jSONObject.put("error_reason", str2);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.component.vy.qf.pcc, android.webkit.WebViewClient
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        try {
            com.bytedance.sdk.component.adexpress.vj.vj.pcc().sf();
        } catch (Exception unused) {
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
