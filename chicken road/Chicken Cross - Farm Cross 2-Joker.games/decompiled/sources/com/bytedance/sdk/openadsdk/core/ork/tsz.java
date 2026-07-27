package com.bytedance.sdk.openadsdk.core.ork;

import android.R;
import android.content.Context;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.nn;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tsz extends com.bytedance.sdk.component.adexpress.vj.pcc {
    protected vh dax;
    private of.pcc fum;
    protected com.bytedance.sdk.openadsdk.oo.oo.vj gbb;
    private final Map<String, com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm> gpj;
    protected JSONObject hc;
    protected mu jr;
    private String kj;
    private com.bytedance.sdk.component.adexpress.sf.qf lo;
    com.bytedance.sdk.openadsdk.utils.pcc lu;
    protected com.bytedance.sdk.openadsdk.core.jr.oo.sf nac;
    private final com.bytedance.sdk.component.kj.sf.gm of;
    protected Context ork;
    protected com.bytedance.sdk.openadsdk.core.model.of tmg;
    private volatile int tz;
    protected String vh;
    private com.bytedance.sdk.openadsdk.oo.hc vy;
    private final Runnable yt;

    public void lu() {
    }

    public tsz(Context context, com.bytedance.sdk.component.adexpress.sf.hc hcVar, com.bytedance.sdk.openadsdk.oo.oo.vj vjVar, com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        super(context, hcVar);
        this.gpj = Collections.synchronizedMap(new HashMap());
        this.tz = 0;
        this.of = new com.bytedance.sdk.component.kj.sf.gm("webviewrender_template") { // from class: com.bytedance.sdk.openadsdk.core.ork.tsz.1
            @Override // java.lang.Runnable
            public void run() {
                if (tsz.this.qf.get()) {
                    return;
                }
                tsz tszVar = tsz.this;
                tszVar.hc = tszVar.gbb().gm();
                tsz tszVar2 = tsz.this;
                tszVar2.pcc(tszVar2.hc);
                if (tsz.this.tz == 0) {
                    tsz.this.gpj();
                }
                com.bytedance.sdk.openadsdk.core.jr.gm().post(tsz.this.yt);
            }
        };
        this.yt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.tsz.2
            @Override // java.lang.Runnable
            public void run() {
                if (tsz.this.qf.get() || tsz.this.lo == null) {
                    return;
                }
                tsz.this.nac();
                tsz.this.dax();
            }
        };
        if (this.vj == null) {
            return;
        }
        this.ork = context;
        this.vh = hcVar.oo();
        this.tmg = ofVar;
        this.gbb = vjVar;
        gpj();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gpj() {
        if (this.vj.getWebView() != null && rnn.wh()) {
            lo();
        } else {
            this.tz = 1;
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.tsz.3
                @Override // java.lang.Runnable
                public void run() {
                    tsz.this.lo();
                }
            });
        }
        if (!jr.sf(this.tmg) || this.gm) {
            return;
        }
        jr.pcc(this.tmg);
    }

    protected void dax() {
        com.bytedance.sdk.component.adexpress.sf.qf qfVar = this.lo;
        if (qfVar != null) {
            super.pcc(qfVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lo() {
        if (this.vj == null || this.vj.getWebView() == null || this.tz == 2) {
            return;
        }
        this.kj = pcc(this.tmg);
        Log.d("TTAD.WebViewRender", "initWebViewRender: url = " + this.kj);
        this.vj.setDisplayZoomControls(false);
        pcc(nn.pcc(this.kj));
        tz();
        mu muVar = new mu(this.ork);
        this.jr = muVar;
        muVar.vj(true);
        jr();
        this.tz = 2;
    }

    public static String pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        return com.bytedance.sdk.component.adexpress.pcc.sf.sf.oo((ofVar == null || !ofVar.jy()) ? null : "v3");
    }

    public void nac() {
        mu muVar;
        if (this.vj == null || this.vj.getWebView() == null || (muVar = this.jr) == null) {
            return;
        }
        muVar.sf(this.vj).pcc(this.tmg).gm(this.tmg.esn()).oo(this.tmg.hl()).sf(kun.pcc(this.vh)).vj(this.tmg.ray()).pcc(this).pcc(this.hc).pcc(this.vj).pcc(this.gbb);
    }

    public void tz() {
        com.bytedance.sdk.openadsdk.core.model.of ofVar = this.tmg;
        if (ofVar == null || ofVar.kx() == null) {
            return;
        }
        this.fum = this.tmg.kx();
    }

    public void jr() {
        if (this.vj == null || this.vj.getWebView() == null) {
            return;
        }
        this.vj.setBackgroundColor(0);
        this.vj.setBackgroundResource(R.color.transparent);
        pcc(this.vj);
        if (oo() != null) {
            this.vy = new com.bytedance.sdk.openadsdk.oo.hc(this.tmg, oo().getWebView()).sf(false);
        }
        this.vy.pcc(this.gbb);
        this.dax = new vh(this.ork, this.jr, this.tmg, this.vy, gbb());
        this.vj.setWebViewClient(this.dax);
        this.vj.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.jr, this.vy));
        fum();
    }

    protected void fum() {
        com.bytedance.sdk.component.adexpress.vj.vj.pcc().pcc(this.vj, this.jr);
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected void tmg() {
        super.tmg();
        com.bytedance.sdk.openadsdk.utils.pcc vj = com.bytedance.sdk.openadsdk.core.dax.pcc().vj();
        this.lu = vj;
        vj.pcc(this);
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    protected void hc() {
        super.hc();
        com.bytedance.sdk.openadsdk.utils.pcc pccVar = this.lu;
        if (pccVar != null) {
            pccVar.sf(this);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc, com.bytedance.sdk.component.adexpress.sf.oo
    public void pcc(com.bytedance.sdk.component.adexpress.sf.qf qfVar) {
        this.lo = qfVar;
        rnn.gm((Runnable) this.of);
    }

    private void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return;
        }
        try {
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.ork).pcc(false).pcc(qfVar.getWebView());
            qfVar.setVerticalScrollBarEnabled(false);
            qfVar.setHorizontalScrollBarEnabled(false);
            com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(qfVar);
            qfVar.hc();
            qfVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
            qfVar.setMixedContentMode(0);
            qfVar.setJavaScriptEnabled(true);
            qfVar.setJavaScriptCanOpenWindowsAutomatically(true);
            qfVar.setDomStorageEnabled(true);
            qfVar.setDatabaseEnabled(true);
            qfVar.setAllowFileAccess(false);
            qfVar.setSupportZoom(true);
            qfVar.setBuiltInZoomControls(true);
            qfVar.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
            qfVar.setUseWideViewPort(true);
            qfVar.setCacheMode(-1);
        } catch (Exception e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.WebViewRender", e.toString());
        }
    }

    public vh of() {
        return this.dax;
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public com.bytedance.sdk.component.vy.qf oo() {
        return this.vj;
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void kj() {
        if (this.qf.get()) {
            return;
        }
        super.kj();
        mu muVar = this.jr;
        if (muVar != null) {
            muVar.gm();
            this.jr.tmg();
            this.jr = null;
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.vy;
        if (hcVar != null) {
            hcVar.oo(false);
        }
        com.bytedance.sdk.openadsdk.core.jr.gm().removeCallbacks(this.yt);
        this.gpj.clear();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc, com.bytedance.sdk.component.adexpress.sf.oo
    public int gm() {
        return this.tmg.rt();
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void vy() {
        if (oo() == null) {
            return;
        }
        try {
            oo().getWebView().resumeTimers();
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void vh() {
        super.vh();
        if (this.jr == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("expressShow", true);
            this.jr.pcc("expressShow", jSONObject);
            this.jr.gm(true);
        } catch (Exception unused) {
        }
    }

    public void sf(int i) {
        if (this.jr == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("zoom_type", i);
            this.jr.pcc("expressAdViewWillZoom", jSONObject);
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.lo.gm("TTAD.WebViewRender", e.getMessage());
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void ork() {
        mu muVar = this.jr;
        if (muVar == null) {
            return;
        }
        muVar.pcc("expressWebviewRecycle", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc
    public void pcc(int i) {
        if (i == this.wh) {
            return;
        }
        this.wh = i;
        gm(i == 0);
    }

    private void gm(boolean z) {
        if (this.jr == null || this.vj == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("adVisible", z);
            this.jr.pcc("expressAdShow", jSONObject);
            this.jr.sf(z);
        } catch (Exception unused) {
        }
    }

    public mu yt() {
        return this.jr;
    }

    public static boolean sf(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }

    @Override // com.bytedance.sdk.component.adexpress.vj.pcc, com.bytedance.sdk.component.adexpress.sf.vh
    public void pcc(com.bytedance.sdk.component.adexpress.sf.gbb gbbVar) {
        super.pcc(gbbVar);
        if (this.oo) {
            com.bytedance.sdk.component.utils.vy.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.tsz.4
                @Override // java.lang.Runnable
                public void run() {
                    WebView webView = tsz.this.vj.getWebView();
                    if (webView != null) {
                        webView.resumeTimers();
                    }
                }
            }, 2000L);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        this.nac = sfVar;
        mu muVar = this.jr;
        if (muVar != null) {
            muVar.pcc(sfVar);
        }
    }
}
