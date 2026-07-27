package com.bytedance.sdk.openadsdk.component.reward.gm.pcc;

import android.R;
import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.wh;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.oo.tmg;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private String dax;
    private int fum;
    private boolean gbb;
    private mu gm;
    private volatile int gpj;
    private boolean hc;
    private wh jr;
    private AtomicBoolean jsj;
    private final Activity kj;
    private volatile int lo;
    private volatile int lu;
    private AtomicBoolean mk;
    private ILoader nac;
    private com.bytedance.sdk.openadsdk.common.vj of;
    private qf oo;
    private int ork;
    final of pcc;
    private final AtomicBoolean qf;
    private vj qy;
    com.bytedance.sdk.openadsdk.core.gm.sf sf;
    private hc tmg;
    private AtomicBoolean tsz;
    private int tz;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm vh;
    private oo vj;
    private String vy;
    private long wh;
    private pcc yt;

    static /* synthetic */ int hc(sf sfVar) {
        int i = sfVar.lo;
        sfVar.lo = i + 1;
        return i;
    }

    static /* synthetic */ int ork(sf sfVar) {
        int i = sfVar.lu;
        sfVar.lu = i + 1;
        return i;
    }

    static /* synthetic */ int tmg(sf sfVar) {
        int i = sfVar.gpj;
        sfVar.gpj = i + 1;
        return i;
    }

    public sf(Activity activity, of ofVar) {
        super(activity);
        this.qf = new AtomicBoolean(false);
        this.lu = 0;
        this.gpj = 0;
        this.lo = 0;
        this.jsj = new AtomicBoolean(false);
        this.tsz = new AtomicBoolean(false);
        this.mk = new AtomicBoolean(false);
        this.kj = activity;
        this.pcc = ofVar;
    }

    public void pcc(oo ooVar) {
        this.vj = ooVar;
        String vy = ooVar.vy();
        this.vy = vy;
        this.ork = kun.pcc(vy);
        of ofVar = this.pcc;
        if (ofVar != null) {
            this.dax = ofVar.cz();
        }
        if (!TextUtils.isEmpty(this.dax)) {
            this.nac = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
            int pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.nac, this.dax);
            this.fum = pcc2;
            this.tz = pcc2 > 0 ? 2 : 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        hashMap.put("dynamic_show_type", 11);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_sequence", 11);
        } catch (JSONException unused) {
        }
        hashMap.put("pag_json_data", jSONObject);
        View findViewById = this.kj.findViewById(R.id.content);
        Activity activity = this.kj;
        of ofVar2 = this.pcc;
        String str = this.vy;
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = new com.bytedance.sdk.openadsdk.core.gm.sf(activity, ofVar2, str, kun.pcc(str), true);
        this.sf = sfVar;
        sfVar.pcc(hashMap);
        this.sf.sf(findViewById);
    }

    public void setLoadStatusListener(vj vjVar) {
        this.qy = vjVar;
    }

    public void pcc() {
        Long valueOf = Long.valueOf(SystemClock.elapsedRealtime());
        this.oo = new qf(this.kj, qf.gm.LANDING_PAGE);
        ork();
        if (lo.vj(this.pcc)) {
            sf();
        }
        gm.pcc.pcc(SystemClock.elapsedRealtime() - valueOf.longValue(), this.pcc, this.vy, this.nac, this.dax);
    }

    public void sf() {
        of ofVar = this.pcc;
        if (ofVar == null || ofVar.yt() == null) {
            return;
        }
        jr.gm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.1
            @Override // java.lang.Runnable
            public void run() {
                if (sf.this.qf.get()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.oo.gm.pcc(sf.this.pcc, sf.this.vy, System.currentTimeMillis() - sf.this.wh, false);
                if (sf.this.qy == null || sf.this.tsz.get()) {
                    return;
                }
                sf.this.tsz.set(true);
                sf.this.qy.pcc(sf.this.vj != null ? sf.this.vj.pcc() : "", 3, -1);
            }
        }, this.pcc.yt().pcc() * 1000);
    }

    private void ork() {
        qf qfVar = this.oo;
        if (qfVar == null || qfVar.getWebView() == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(lu.pcc()).pcc(false).sf(false).pcc(this.oo.getWebView());
        qf qfVar2 = this.oo;
        if (qfVar2 != null && qfVar2.getWebView() != null) {
            this.yt = new pcc(this.fum, this.pcc, this.vy, this);
            hc sf = new hc(this.pcc, this.oo.getWebView(), this.yt, this.tz).sf(true);
            this.tmg = sf;
            sf.pcc(this.vy);
            com.bytedance.sdk.openadsdk.common.vj pcc2 = kun.pcc(this.pcc, this.oo, this.kj, this.vy);
            this.of = pcc2;
            if (pcc2 != null) {
                pcc2.pcc(this.vy);
            }
            kun.pcc(this.pcc, this.oo);
        }
        vh();
        this.oo.setLandingPage(true);
        this.oo.setTag(this.vy);
        this.oo.setMaterialMeta(this.pcc.lr());
        wh whVar = new wh(lu.pcc(), this.gm, this.pcc.esn(), this.of, this.tmg, true) { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.2
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                sf.this.tmg();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                if (sf.this.qy != null && !sf.this.jsj.get()) {
                    sf.this.jsj.set(true);
                    sf.this.qy.pcc(sf.this.vj != null ? sf.this.vj.pcc() : "", 1, 0);
                }
                sf.this.wh = System.currentTimeMillis();
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onReceivedError(WebView webView, int i, String str, String str2) {
                super.onReceivedError(webView, i, str, str2);
                new Object[]{"onReceivedError errorCode:%d, description:%s, failingUrl:%s", Integer.valueOf(i), str, str2};
                String oo = oo(str2);
                boolean z = false;
                if (this.wh != null) {
                    this.wh.pcc(webView, i, str, str2, oo(str2), (webView == null || str2 == null || !str2.equals(webView.getUrl())) ? false : true);
                }
                boolean z2 = oo != null && oo.startsWith("image");
                if (oo != null && oo.startsWith("mp4")) {
                    z = true;
                }
                if (z2 || z || sf.this.qf.get() || sf.this.qy == null || sf.this.tsz.get()) {
                    return;
                }
                sf.this.tsz.set(true);
                sf.this.qy.pcc(sf.this.vj != null ? sf.this.vj.pcc() : "", 3, i);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                new Object[]{"onReceivedSslError error:%s", sslError};
                if (sslErrorHandler != null && sf.this.qy != null && !sf.this.tsz.get()) {
                    sf.this.tsz.set(true);
                    sf.this.qy.pcc(sf.this.vj != null ? sf.this.vj.pcc() : "", 3, sslError != null ? sslError.getPrimaryError() : 0);
                }
                super.onReceivedSslError(webView, sslErrorHandler, sslError);
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (TextUtils.isEmpty(sf.this.dax)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    sf.ork(sf.this);
                    WebResourceResponseModel pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(sf.this.nac, sf.this.dax, str);
                    if (pcc3 != null && pcc3.getWebResourceResponse() != null) {
                        sf.tmg(sf.this);
                        return pcc3.getWebResourceResponse();
                    }
                    if (pcc3 != null && pcc3.getMsg() == 2) {
                        sf.hc(sf.this);
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.pcc("LandingPageModel", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str);
                }
            }
        };
        this.jr = whVar;
        this.oo.setWebViewClient(whVar);
        this.jr.pcc(this.pcc);
        this.jr.pcc(this.vy);
        this.oo.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.gm, this.tmg, this.of) { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.3
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (sf.this.kj == null || sf.this.kj.isFinishing() || i != 100) {
                    return;
                }
                sf.this.tmg();
            }
        });
        if (this.vh == null) {
            this.vh = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(lu.pcc(), this.vy);
        }
        this.oo.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.4
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (sf.this.vh != null) {
                    sf.this.vh.pcc(sf.this.pcc);
                }
            }
        });
        qf qfVar3 = this.oo;
        qfVar3.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar3.getWebView(), BuildConfig.VERSION_CODE));
        this.oo.setMixedContentMode(0);
        this.oo.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.5
            @Override // android.view.View.OnScrollChangeListener
            public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                if (sf.this.tmg != null) {
                    sf.this.tmg.sf(i2);
                }
            }
        });
        this.oo.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.6
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (!sf.this.gbb) {
                    sf.this.sf.onTouch(view, motionEvent);
                }
                if (!sf.this.gbb && motionEvent.getAction() == 1 && sf.this.sf.wh()) {
                    sf.this.oo.getWebView().performClick();
                    sf.this.gbb = true;
                }
                if (sf.this.tmg != null) {
                    sf.this.tmg.pcc(motionEvent);
                }
                if (sf.this.of == null) {
                    return false;
                }
                sf.this.of.pcc(motionEvent);
                return false;
            }
        });
        this.oo.getWebView().setOnClickListener(this.sf);
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc, this.vy, this.tz);
    }

    public void gm() {
        if (this.vj == null) {
            return;
        }
        pcc();
        String oo = this.vj.oo();
        if (TextUtils.isEmpty(oo)) {
            vj vjVar = this.qy;
            if (vjVar != null) {
                vjVar.pcc(this.vj.pcc(), 3, -2);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.utils.of.pcc(this.oo, oo);
        this.hc = true;
    }

    public boolean oo() {
        return this.hc;
    }

    public void vj() {
        oo ooVar = this.vj;
        if (ooVar == null || this.oo == null) {
            return;
        }
        float vj = ooVar.vj();
        float wh = this.vj.wh();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((int) this.vj.qf(), (int) this.vj.kj());
        layoutParams.leftMargin = (int) vj;
        layoutParams.topMargin = (int) wh;
        this.oo.setLayoutParams(layoutParams);
        addView(this.oo);
    }

    private void vh() {
        mu muVar = new mu(this.kj);
        this.gm = muVar;
        muVar.sf(this.oo).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(this.pcc)).gm(this.pcc.esn()).oo(this.pcc.hl()).pcc(this.pcc).sf(-1).pcc(this.pcc.bxz()).sf(this.vy).vj(this.pcc.ray()).pcc(this.oo).pcc(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.pcc.sf.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                if (sf.this.jr != null) {
                    sf.this.jr.gm();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tmg() {
        this.qf.get();
        if (this.qf.get()) {
            return;
        }
        this.qf.set(true);
        if (this.qy != null && !this.tsz.get()) {
            this.tsz.set(true);
            vj vjVar = this.qy;
            oo ooVar = this.vj;
            vjVar.pcc(ooVar != null ? ooVar.pcc() : "", 2, 0);
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.pcc, this.vy, System.currentTimeMillis() - this.wh, true);
    }

    public boolean wh() {
        return this.qf.get();
    }

    public void qf() {
        if (this.oo != null) {
            this.mk.set(true);
            this.oo.setVisibility(8);
            com.bytedance.sdk.openadsdk.core.kun.pcc(this.oo.getWebView());
        }
    }

    public void kj() {
        mu muVar = this.gm;
        if (muVar != null) {
            muVar.vh();
        }
        hc hcVar = this.tmg;
        if (hcVar != null) {
            hcVar.qf();
        }
    }

    public void vy() {
        hc hcVar = this.tmg;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    public static class pcc implements tmg {
        private final String gm;
        private final WeakReference<sf> oo;
        private final int pcc;
        private final of sf;

        public pcc(int i, of ofVar, String str, sf sfVar) {
            this.pcc = i;
            this.sf = ofVar;
            this.gm = str;
            this.oo = new WeakReference<>(sfVar);
        }

        @Override // com.bytedance.sdk.openadsdk.oo.tmg
        public void pcc(int i) {
            sf sfVar = this.oo.get();
            if (sfVar != null) {
                gm.pcc.pcc(this.pcc, sfVar.lo, sfVar.gpj, sfVar.lu - sfVar.gpj, this.sf, this.gm, i);
            }
        }
    }
}
