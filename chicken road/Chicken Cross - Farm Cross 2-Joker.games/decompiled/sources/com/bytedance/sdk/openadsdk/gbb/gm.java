package com.bytedance.sdk.openadsdk.gbb;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.adjust.sdk.Constants;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.core.dax;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.gpj;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.wh;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.qf.sf;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private static int gm = 2;
    private static long oo = 3600000;
    private static volatile gm pcc;
    private final Handler sf;
    private LinkedHashMap<Integer, SoftReference<qf>> vj;

    public static gm pcc() {
        if (pcc == null) {
            synchronized (gm.class) {
                if (pcc == null) {
                    pcc = new gm();
                }
            }
        }
        return pcc;
    }

    public gm() {
        gm = com.bytedance.sdk.openadsdk.yt.vj.pcc("pre_render_count", 2);
        long pcc2 = com.bytedance.sdk.openadsdk.yt.vj.pcc("pre_render_duration", Constants.ONE_HOUR);
        oo = pcc2;
        if (gm <= 0) {
            gm = 2;
        }
        if (pcc2 <= 0) {
            oo = 3600000L;
        }
        this.vj = new LinkedHashMap<>();
        this.sf = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.bytedance.sdk.openadsdk.gbb.gm.1
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                SoftReference softReference;
                int i = message.what;
                if (gm.this.vj == null || (softReference = (SoftReference) gm.this.vj.get(Integer.valueOf(i))) == null) {
                    return false;
                }
                qf qfVar = (qf) softReference.get();
                gm.this.pcc(i, 2, new of(), qfVar == null ? "" : qfVar.getTag());
                return false;
            }
        });
    }

    public void pcc(final of ofVar) {
        final String str;
        if (ofVar == null || !gm(ofVar)) {
            return;
        }
        gpj jsj = ofVar.jsj();
        if (jsj == null) {
            jsj = new gpj();
        }
        new Object[]{"open pre render:", Boolean.valueOf(ofVar.ss())};
        if (ofVar.ss()) {
            String xy = ofVar.xy();
            if (TextUtils.isEmpty(xy)) {
                return;
            }
            final int hashCode = xy.hashCode();
            if (lo.sf(ofVar)) {
                str = "landingpage_split_screen";
            } else if (lo.oo(ofVar)) {
                str = "landingpage_direct";
            } else if (!lo.gm(ofVar)) {
                str = "";
            } else {
                str = "landingpage_split_ceiling";
            }
            LinkedHashMap<Integer, SoftReference<qf>> linkedHashMap = this.vj;
            if (linkedHashMap == null || !linkedHashMap.containsKey(Integer.valueOf(hashCode))) {
                HashMap hashMap = new HashMap();
                hashMap.put(ofVar.cz(), ofVar);
                if (jsj.sf() == 2) {
                    com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc((Map<String, of>) hashMap, new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.gbb.gm.2
                        @Override // com.bytedance.sdk.openadsdk.qf.sf.pcc
                        public void pcc() {
                            gm.this.pcc(hashCode, ofVar, str, true);
                        }
                    }, true);
                    return;
                }
                if (jsj.sf() == 1) {
                    com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc((Map<String, of>) hashMap, (sf.pcc) null, true);
                    pcc(hashCode, ofVar, str, true);
                } else if (jsj.sf() == 0) {
                    pcc(hashCode, ofVar, str, false);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final int i, final of ofVar, final String str, final boolean z) {
        new Object[]{"begin pre render, useGecko", Boolean.valueOf(z)};
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.gbb.gm.3
            @Override // java.lang.Runnable
            public void run() {
                com.bytedance.sdk.openadsdk.utils.pcc vj;
                Activity sf;
                if (gm.this.vj != null && gm.this.vj.size() >= gm.gm) {
                    Map.Entry entry = (Map.Entry) gm.this.vj.entrySet().iterator().next();
                    SoftReference softReference = (SoftReference) entry.getValue();
                    if (softReference != null) {
                        qf qfVar = (qf) softReference.get();
                        gm.this.pcc(((Integer) entry.getKey()).intValue(), 1, ofVar, qfVar == null ? "" : qfVar.getTag());
                    }
                }
                if (gm.this.sf != null) {
                    Message obtain = Message.obtain();
                    obtain.what = i;
                    gm.this.sf.sendMessageDelayed(obtain, gm.oo);
                }
                SoftReference softReference2 = new SoftReference(new qf(lu.pcc(), false, qf.gm.LANDING_PAGE_PRE_RENDER));
                final qf qfVar2 = (qf) softReference2.get();
                if (qfVar2 == null) {
                    return;
                }
                mu muVar = null;
                qfVar2.setLayerType(2, null);
                rj.pcc((View) qfVar2, 4);
                qfVar2.setTag(str);
                qfVar2.setLandingPage(true);
                gpj jsj = ofVar.jsj();
                int pcc2 = jsj != null ? jsj.pcc() : 3;
                if (pcc2 == 2) {
                    int gm2 = rj.gm(lu.pcc());
                    int vj2 = rj.vj(lu.pcc());
                    int ial = ofVar.ial();
                    if (ial == 1) {
                        if (gm2 >= vj2) {
                            qfVar2.layout(0, 0, vj2, gm2);
                        }
                        qfVar2.layout(0, 0, gm2, vj2);
                    } else if (ial == 2) {
                        if (gm2 < vj2) {
                            qfVar2.layout(0, 0, vj2, gm2);
                        }
                        qfVar2.layout(0, 0, gm2, vj2);
                    }
                } else if (pcc2 == 1 && (vj = dax.pcc().vj()) != null && (sf = vj.sf()) != null) {
                    final int hashCode = sf.hashCode();
                    vj.pcc(new com.bytedance.sdk.component.adexpress.pcc() { // from class: com.bytedance.sdk.openadsdk.gbb.gm.3.1
                        @Override // com.bytedance.sdk.component.adexpress.pcc
                        public void pcc(Activity activity) {
                            int i2 = hashCode;
                            if (i2 == 0 || activity == null || i2 != activity.hashCode() || qfVar2.gm()) {
                                return;
                            }
                            gm.this.pcc(i, 5, ofVar, str);
                        }
                    });
                    FrameLayout frameLayout = (FrameLayout) sf.findViewById(R.id.content);
                    if (frameLayout != null) {
                        frameLayout.addView(qfVar2);
                    }
                }
                int pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(com.bytedance.sdk.openadsdk.qf.sf.pcc().sf(), ofVar.cz());
                hc hcVar = new hc(ofVar, qfVar2.getWebView());
                hcVar.pcc(pcc3 > 0 ? 2 : 0);
                hcVar.pcc(true);
                hcVar.sf(true);
                qfVar2.setWebViewClient(pcc(qfVar2, hcVar));
                qfVar2.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(muVar, hcVar) { // from class: com.bytedance.sdk.openadsdk.gbb.gm.3.2
                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (i2 == 100) {
                            qfVar2.setPreProgressHundred(true);
                        }
                    }
                });
                gm.this.pcc(qfVar2, ofVar.xy());
                gm.pcc(ofVar, str, Double.valueOf((System.currentTimeMillis() / 1000) - ofVar.wc()).floatValue(), "web_start_pre_render");
                if (gm.this.vj != null) {
                    gm.this.vj.put(Integer.valueOf(i), softReference2);
                }
            }

            private wh pcc(final qf qfVar, hc hcVar) {
                wh whVar = new wh(lu.pcc(), null, ofVar.esn(), hcVar, true) { // from class: com.bytedance.sdk.openadsdk.gbb.gm.3.3
                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                    public boolean shouldOverrideUrlLoading(WebView webView, String str2) {
                        return super.shouldOverrideUrlLoading(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                    public void onPageFinished(WebView webView, String str2) {
                        qf qfVar2 = qfVar;
                        if (qfVar2 != null) {
                            qfVar2.setPreFinish(true);
                        }
                        super.onPageFinished(webView, str2);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                    public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                        qf qfVar2 = qfVar;
                        if (qfVar2 != null) {
                            qfVar2.setPreStart(true);
                        }
                        super.onPageStarted(webView, str2, bitmap);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                    public void onReceivedError(WebView webView, int i2, String str2, String str3) {
                        String oo2 = oo(str3);
                        boolean z2 = oo2 != null && oo2.startsWith("image");
                        boolean z3 = oo2 != null && oo2.startsWith("mp4");
                        if (!z2 && !z3 && !qfVar.gm()) {
                            gm.this.pcc(i, 4, ofVar, str);
                        }
                        super.onReceivedError(webView, i2, str2, str3);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                        if (sslErrorHandler != null) {
                            gm.this.pcc(i, 4, ofVar, str);
                        }
                        super.onReceivedSslError(webView, sslErrorHandler, sslError);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                        try {
                            if (!z) {
                                return super.shouldInterceptRequest(webView, str2);
                            }
                            qf qfVar2 = qfVar;
                            if (qfVar2 != null) {
                                qfVar2.pcc++;
                            }
                            WebResourceResponseModel pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(com.bytedance.sdk.openadsdk.qf.sf.pcc().sf(), ofVar.cz(), str2);
                            if (pcc2 != null && pcc2.getWebResourceResponse() != null) {
                                qf qfVar3 = qfVar;
                                if (qfVar3 != null) {
                                    qfVar3.sf++;
                                }
                                return pcc2.getWebResourceResponse();
                            }
                            if (qfVar != null && pcc2 != null && pcc2.getMsg() == 2) {
                                qfVar.gm++;
                            }
                            return super.shouldInterceptRequest(webView, str2);
                        } catch (Throwable unused) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                    }
                };
                whVar.pcc(ofVar);
                whVar.pcc(str);
                return whVar;
            }
        });
    }

    public qf sf(of ofVar) {
        if (ofVar == null || TextUtils.isEmpty(ofVar.xy())) {
            return null;
        }
        String xy = ofVar.xy();
        if (TextUtils.isEmpty(xy)) {
            return null;
        }
        int hashCode = xy.hashCode();
        SoftReference<qf> softReference = this.vj.get(Integer.valueOf(hashCode));
        if (softReference == null || softReference.get() == null) {
            return null;
        }
        qf qfVar = softReference.get();
        pcc(ofVar, qfVar.getTag(), Double.valueOf((System.currentTimeMillis() / 1000) - ofVar.wc()).floatValue(), "web_use_pre_render");
        pcc(hashCode, 3, ofVar, qfVar.getTag());
        return qfVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, int i2, of ofVar, String str) {
        LinkedHashMap<Integer, SoftReference<qf>> linkedHashMap = this.vj;
        if (linkedHashMap != null && linkedHashMap.containsKey(Integer.valueOf(i))) {
            this.vj.remove(Integer.valueOf(i));
        }
        Handler handler = this.sf;
        if (handler != null) {
            handler.removeMessages(i);
        }
        pcc(ofVar, str, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(qf qfVar, String str) {
        if (qfVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(lu.pcc()).pcc(false).sf(false).pcc(qfVar.getWebView());
        qfVar.setMixedContentMode(0);
        new Object[]{"begin to render,url is", str};
        com.bytedance.sdk.openadsdk.utils.of.pcc(qfVar, str);
    }

    public static boolean gm(of ofVar) {
        return lo.vy(ofVar) || lo.sf(ofVar) || lo.gm(ofVar);
    }

    public static void pcc(of ofVar, String str, final float f, String str2) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, str2, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.gbb.gm.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, f);
                } catch (Throwable unused) {
                }
                new Object[]{"onWebPreRender", Float.valueOf(f)};
                return jSONObject;
            }
        });
    }

    public static void pcc(of ofVar, final String str, final int i) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, str, "web_delete_pre_render", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.gbb.gm.5
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("reason", i);
                } catch (Throwable unused) {
                }
                new Object[]{"onDeletePreRenderWeb", jSONObject, str};
                return jSONObject;
            }
        });
    }
}
