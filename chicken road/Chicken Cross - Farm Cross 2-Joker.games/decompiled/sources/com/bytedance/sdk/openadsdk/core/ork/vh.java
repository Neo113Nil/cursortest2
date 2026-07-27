package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.adexpress.oo.vy;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import com.bytedance.sdk.openadsdk.core.mu;
import com.google.common.base.Ascii;
import com.google.common.net.HttpHeaders;
import com.ironsource.C4761z5;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class vh extends com.bytedance.sdk.openadsdk.core.widget.pcc.wh {
    private static final byte[] tmg = {-119, 80, 78, 71, Ascii.CR, 10, Ascii.SUB, 10, 0, 0, 0, Ascii.CR, 73, 72, 68, 82, 0, 0, 0, 1, 0, 0, 0, 1, 8, 6, 0, 0, 0, Ascii.US, Ascii.NAK, -60, -119, 0, 0, 0, 10, 73, 68, 65, 84, 120, -100, 99, 96, 96, 96, 96, 0, 0, 0, 3, 0, 1, -2, 60, -79, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};
    private com.bytedance.sdk.component.adexpress.sf.hc ork;
    public ArrayList<Integer> pcc;
    private final com.bytedance.sdk.openadsdk.core.model.of sf;
    private boolean vh;

    public vh(Context context, mu muVar, com.bytedance.sdk.openadsdk.core.model.of ofVar, com.bytedance.sdk.openadsdk.oo.hc hcVar, com.bytedance.sdk.component.adexpress.sf.hc hcVar2) {
        super(context, muVar, ofVar.esn(), hcVar, false);
        this.vh = false;
        this.pcc = new ArrayList<>();
        this.sf = ofVar;
        this.ork = hcVar2;
        this.vh = com.bytedance.sdk.openadsdk.yt.vj.pcc("inject_data_normal_open", 0) == 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc;
        try {
            String uri = webResourceRequest.getUrl().toString();
            vy.pcc pcc2 = com.bytedance.sdk.component.adexpress.oo.vy.pcc(uri);
            if (pcc2 == vy.pcc.VIDEO && com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(this.sf) && com.bytedance.sdk.openadsdk.component.reward.gm.kj.wh() && (pcc = pcc(uri, pcc2, webResourceRequest.getRequestHeaders())) != null && pcc.pcc() != null) {
                return pcc.pcc();
            }
            webResourceRequest.getUrl().toString();
            webResourceRequest.getRequestHeaders().get("Range");
            return shouldInterceptRequest(webView, uri);
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("ExpressClient", "shouldInterceptRequest error1", th);
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
    }

    public int pcc() {
        Iterator<Integer> it = this.pcc.iterator();
        while (it.hasNext()) {
            Integer next = it.next();
            if (next.intValue() == 3 || next.intValue() == 2 || next.intValue() == -1) {
                return next.intValue();
            }
        }
        return TextUtils.isEmpty(oo()) ? -1 : 1;
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc = pcc(webView, str);
            pcc(currentTimeMillis, System.currentTimeMillis(), str, (pcc == null || pcc.pcc() == null) ? 2 : 1);
            if (pcc != null && pcc.sf() != 5) {
                pcc.sf();
                this.pcc.add(Integer.valueOf(pcc.sf()));
            }
            if (pcc != null && pcc.pcc() != null) {
                new Object[]{"return WebResourceResponse by cache, url is:", str};
                return pcc.pcc();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("ExpressClient", "shouldInterceptRequest error2", th);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        this.qf = false;
        super.onPageFinished(webView, str);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.kj = false;
        super.onPageStarted(webView, str, bitmap);
        com.bytedance.sdk.component.adexpress.sf.hc hcVar = this.ork;
        if (hcVar != null && hcVar.of() && this.vh) {
            com.bytedance.sdk.component.utils.gbb.pcc(webView, "javascript:window.SDK_INJECT_DATA=" + this.ork.gm());
        }
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(WebView webView, String str) {
        com.bytedance.sdk.openadsdk.core.model.lu luVar = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        new Object[]{"url is:", str};
        if (str.equals("local://pag_open_icon_id") || str.equals(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc)) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
            pccVar.pcc(5);
            pccVar.pcc(vj());
            return pccVar;
        }
        of.pcc kx = this.sf.kx();
        if (kx != null && !TextUtils.isEmpty(str) && str.equals(kx.sf())) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
            pccVar2.pcc(5);
            WebResourceResponse vj = vj(str);
            pccVar2.pcc(vj);
            boolean z = vj != null;
            new Object[]{"webview cache result is:", Boolean.valueOf(z)};
            com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(z);
            return pccVar2;
        }
        vy.pcc pcc = com.bytedance.sdk.component.adexpress.oo.vy.pcc(str);
        if (jr.sf(this.sf)) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc2 = pcc(str, pcc);
            if (pcc2 != null) {
                return pcc2;
            }
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc sf = sf(str, pcc);
            if (sf != null) {
                return sf;
            }
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc gm = gm(str, pcc);
            if (gm != null) {
                return gm;
            }
        }
        if (pcc != vy.pcc.IMAGE) {
            Iterator<com.bytedance.sdk.openadsdk.core.model.lu> it = this.sf.by().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.bytedance.sdk.openadsdk.core.model.lu next = it.next();
                if (!TextUtils.isEmpty(next.pcc()) && !TextUtils.isEmpty(str)) {
                    String pcc3 = next.pcc();
                    if (pcc3.startsWith("https")) {
                        pcc3 = pcc3.replaceFirst("https", ProxyConfig.MATCH_HTTP);
                    }
                    if ((str.startsWith("https") ? str.replaceFirst("https", ProxyConfig.MATCH_HTTP) : str).equals(pcc3)) {
                        luVar = next;
                        break;
                    }
                }
            }
        }
        if (pcc == vy.pcc.IMAGE || luVar != null) {
            com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar3 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
            pccVar3.pcc(5);
            pccVar3.pcc(pcc(str, com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.sf, str)));
            return pccVar3;
        }
        return com.bytedance.sdk.component.adexpress.pcc.sf.sf.pcc(str, pcc, "", oo());
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(String str, vy.pcc pccVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.sf;
        if (ofVar == null || ofVar.kez() == null || !TextUtils.equals(this.sf.kez().vh(), str)) {
            return null;
        }
        com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
        pccVar2.pcc(5);
        WebResourceResponse sf = sf(this.sf.kez().gbb(), pccVar, map);
        if (sf == null) {
            com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(0, str, this.sf, map);
            return null;
        }
        pccVar2.pcc(sf);
        com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(1, str, this.sf, map);
        return pccVar2;
    }

    private WebResourceResponse sf(String str, vy.pcc pccVar, Map<String, String> map) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.sf;
        if (ofVar != null && ofVar.kez() != null) {
            File file = new File(CacheDirFactory.getICacheDir(this.sf.we()).pcc(), str);
            if (file.exists() && file.length() > 0) {
                try {
                    return pcc(file, pccVar, map);
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        }
        return null;
    }

    private boolean sf(Map<String, String> map) {
        String str;
        return (map == null || map.isEmpty() || (str = map.get("Range")) == null || !str.startsWith("bytes=")) ? false : true;
    }

    private WebResourceResponse pcc(File file, vy.pcc pccVar, Map<String, String> map) {
        if (sf(map)) {
            return sf(file, pccVar, map);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            HashMap hashMap = new HashMap();
            long length = file.length();
            hashMap.put(HttpHeaders.ACCEPT_RANGES, "bytes");
            hashMap.put(HttpHeaders.CONTENT_RANGE, String.format("bytes 0-%d/%d", Long.valueOf(length - 1), Long.valueOf(length)));
            WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
            webResourceResponse.setResponseHeaders(map);
            webResourceResponse.setEncoding(C4761z5.O);
            webResourceResponse.setData(fileInputStream);
            webResourceResponse.setStatusCodeAndReasonPhrase(200, "OK");
            return webResourceResponse;
        } catch (Throwable th) {
            th.getMessage();
            return null;
        }
    }

    private WebResourceResponse sf(File file, vy.pcc pccVar, Map<String, String> map) {
        long j;
        long j2;
        long[] pcc;
        long length = file.length();
        long j3 = length - 1;
        if (map == null || map.isEmpty() || (pcc = com.bytedance.sdk.openadsdk.core.ork.sf.sf.pcc(map.get("Range"), length)) == null || pcc.length != 2) {
            j = 0;
            j2 = j3;
        } else {
            j = pcc[0];
            j2 = pcc[1];
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCEPT_RANGES, "bytes");
        hashMap.put(HttpHeaders.CONTENT_RANGE, String.format("bytes %d-%d/%d", Long.valueOf(j), Long.valueOf(j2), Long.valueOf(length)));
        new StringBuilder("handleRangeVideoResponse: cache video. header=").append(hashMap);
        WebResourceResponse webResourceResponse = new WebResourceResponse(null, null, null);
        if (webResourceResponse.getResponseHeaders() != null) {
            webResourceResponse.getResponseHeaders().clear();
        }
        webResourceResponse.setResponseHeaders(hashMap);
        webResourceResponse.setStatusCodeAndReasonPhrase(206, "Partial Content");
        webResourceResponse.setMimeType(pccVar.pcc());
        webResourceResponse.setEncoding("UTF-8");
        try {
            webResourceResponse.setData(new FileInputStream(file));
        } catch (IOException e) {
            e.getMessage();
        }
        return webResourceResponse;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(String str, vy.pcc pccVar) {
        zti.pcc wh;
        JSONArray pcc;
        zti uae = this.sf.uae();
        if (uae != null && (wh = uae.wh()) != null && (pcc = wh.pcc()) != null && pcc.length() > 0) {
            for (int i = 0; i < pcc.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.hc.oo.pcc(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj(), pcc.optString(i)), str) && pccVar == vy.pcc.IMAGE) {
                    com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
                    pccVar2.pcc(5);
                    pccVar2.pcc(pcc(str, com.bytedance.sdk.component.utils.vj.pcc(str)));
                    return pccVar2;
                }
            }
        }
        return null;
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc sf(String str, vy.pcc pccVar) {
        zti.pcc wh;
        JSONArray sf;
        zti uae = this.sf.uae();
        if (uae == null || (wh = uae.wh()) == null || (sf = wh.sf()) == null || sf.length() <= 0) {
            return null;
        }
        return pcc(sf, str, pccVar);
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc gm(String str, vy.pcc pccVar) {
        zti.pcc wh;
        JSONArray gm;
        zti uae = this.sf.uae();
        if (uae == null || (wh = uae.wh()) == null || (gm = wh.gm()) == null || gm.length() <= 0) {
            return null;
        }
        return pcc(gm, str, pccVar);
    }

    private com.bytedance.sdk.component.adexpress.pcc.sf.pcc pcc(JSONArray jSONArray, String str, vy.pcc pccVar) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                if (TextUtils.equals(com.bytedance.sdk.openadsdk.core.hc.oo.pcc(com.bytedance.sdk.openadsdk.core.settings.vh.sf().gpj(), jSONArray.optString(i)), str)) {
                    com.bytedance.sdk.component.adexpress.pcc.sf.pcc pccVar2 = new com.bytedance.sdk.component.adexpress.pcc.sf.pcc();
                    pccVar2.pcc(5);
                    pccVar2.pcc(oo(str, pccVar));
                    return pccVar2;
                }
            }
        }
        return null;
    }

    private WebResourceResponse oo(String str, vy.pcc pccVar) {
        InputStream sf;
        if (TextUtils.isEmpty(str) || (sf = jr.sf(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse(pccVar.pcc(), "UTF-8", sf);
        pcc(webResourceResponse);
        return webResourceResponse;
    }

    private String oo() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.sf;
        if (ofVar == null) {
            return null;
        }
        if (ofVar.kx() != null) {
            return this.sf.kx().vh();
        }
        if (this.sf.uae() != null) {
            return "v3";
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private WebResourceResponse vj() {
        InputStream openRawResource;
        int vy = com.bytedance.sdk.openadsdk.core.ork.sf().vy();
        if (vy == 0) {
            return null;
        }
        Resources resources = com.bytedance.sdk.openadsdk.core.lu.pcc().getResources();
        if (resources != null) {
            try {
                TypedValue typedValue = new TypedValue();
                resources.getValueForDensity(vy, 0, typedValue, true);
                if (typedValue.string != null && typedValue.string.toString().endsWith(".xml")) {
                    openRawResource = new ByteArrayInputStream(tmg);
                } else {
                    openRawResource = resources.openRawResource(vy);
                }
            } catch (Resources.NotFoundException e) {
                com.bytedance.sdk.component.utils.lo.gm("ExpressClient", e.toString());
            }
            if (openRawResource == null) {
                return new WebResourceResponse(vy.pcc.IMAGE.pcc(), "UTF-8", openRawResource);
            }
            return null;
        }
        openRawResource = null;
        if (openRawResource == null) {
        }
    }

    private WebResourceResponse vj(String str) {
        InputStream pcc;
        if (TextUtils.isEmpty(str) || (pcc = com.bytedance.sdk.openadsdk.core.vj.pcc.pcc().pcc(str)) == null) {
            return null;
        }
        WebResourceResponse webResourceResponse = new WebResourceResponse("audio/*", "UTF-8", pcc);
        pcc(webResourceResponse);
        return webResourceResponse;
    }

    private WebResourceResponse pcc(String str, String str2) {
        WebResourceResponse webResourceResponse = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            InputStream pcc = com.bytedance.sdk.openadsdk.ork.oo.pcc(str, str2);
            if (pcc == null) {
                return null;
            }
            WebResourceResponse webResourceResponse2 = new WebResourceResponse(vy.pcc.IMAGE.pcc(), C4761z5.O, pcc);
            try {
                pcc(webResourceResponse2);
                return webResourceResponse2;
            } catch (Throwable th) {
                th = th;
                webResourceResponse = webResourceResponse2;
                com.bytedance.sdk.component.utils.lo.pcc("ExpressClient", "get image WebResourceResponse error", th);
                return webResourceResponse;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void pcc(long j, long j2, String str, int i) {
        if (this.wh == null || this.wh.sf() == null) {
            return;
        }
        vy.pcc pcc = com.bytedance.sdk.component.adexpress.oo.vy.pcc(str);
        if (pcc == vy.pcc.HTML) {
            this.wh.sf().pcc(str, j, j2, i);
        } else if (pcc == vy.pcc.JS) {
            this.wh.sf().sf(str, j, j2, i);
        }
    }

    private void pcc(WebResourceResponse webResourceResponse) {
        if (webResourceResponse == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(HttpHeaders.ACCESS_CONTROL_ALLOW_ORIGIN, "*");
        webResourceResponse.setResponseHeaders(hashMap);
    }
}
