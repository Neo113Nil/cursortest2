package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.fum;
import com.bytedance.sdk.openadsdk.common.jr;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.common.ork;
import com.bytedance.sdk.openadsdk.common.tmg;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.oo.hc;
import com.bytedance.sdk.openadsdk.utils.fum;
import com.bytedance.sdk.openadsdk.utils.gbb;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.lo;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.vh;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TTLandingPageActivity extends TTBaseLandingPageActivity {
    private mu dax;
    private com.bytedance.sdk.openadsdk.gbb.pcc.pcc fmh;
    private String fum;
    private String gbb;
    private com.bytedance.sdk.openadsdk.gbb.oo gd;
    TTAdDislikeToast gm;
    private of gpj;
    private com.bytedance.sdk.openadsdk.core.wh.wh hc;
    private ImageView iv;
    private String jr;
    private ImageView kj;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm lo;
    private gbb lq;
    private ImageView lrr;
    private String lu;
    private int mk;
    private int nac;
    private com.bytedance.sdk.openadsdk.common.vj nn;
    private String of;
    private Context ork;
    hc pcc;
    private com.bytedance.sdk.component.vy.qf qf;
    private boolean ri;
    private ImageView rj;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh rnn;
    nac sf;
    private Button tmg;
    private boolean tsx;
    private int tsz;
    private jr vh;
    private TextView vy;
    private com.bytedance.sdk.openadsdk.common.hc xb;
    private tmg ye;
    private ILoader yt;
    private com.bytedance.sdk.openadsdk.gbb.pcc zsj;
    private qf.pcc zti;
    private final AtomicBoolean tz = new AtomicBoolean(true);
    private final AtomicInteger qy = new AtomicInteger(0);
    private final AtomicInteger jsj = new AtomicInteger(0);
    private final AtomicInteger atb = new AtomicInteger(0);
    final AtomicBoolean oo = new AtomicBoolean(false);
    final AtomicBoolean vj = new AtomicBoolean(false);
    private boolean kun = false;
    private long hpk = 0;
    int wh = -1;
    private String erj = "DOWNLOAD";

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected boolean oo() {
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!com.bytedance.sdk.openadsdk.core.jr.vj()) {
            finish();
            return;
        }
        try {
            lu.sf(this);
        } catch (Throwable unused) {
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        of pcc2 = atb.pcc().pcc(atb.pcc(getIntent()));
        this.gpj = pcc2;
        if (pcc2 != null) {
            this.tsx = pcc2.gbb();
            this.gpj.tmh(0);
            if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false)) {
                fum.pcc(this.gpj);
            }
        }
        if (bundle != null) {
            try {
                int i = bundle.getInt("meta_index", -1);
                this.wh = i;
                if (i >= 0) {
                    this.gpj = atb.pcc().pcc(this.wh);
                }
            } catch (Throwable unused2) {
            }
        }
        com.bytedance.sdk.openadsdk.gbb.vj.pcc(this);
        this.fum = "";
        pcc(4);
        of ofVar = this.gpj;
        if (ofVar != null) {
            this.gbb = ofVar.esn();
            this.jr = this.gpj.hl();
            this.of = this.gpj.cz();
            this.fum = this.gpj.vh();
            this.nac = this.gpj.hc();
            this.lu = this.gpj.tmg();
        }
        try {
            setContentView(pcc(this.fum));
            if (this.gpj == null) {
                finish();
                return;
            }
            if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false)) {
                sf();
            }
            wh();
            if (!TextUtils.isEmpty(this.of)) {
                this.yt = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
                int pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.yt, this.of);
                this.tsz = pcc3;
                this.mk = pcc3 > 0 ? 2 : 0;
            }
            this.ork = this;
            if (this.qf != null) {
                com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this).pcc(false).sf(false).pcc(this.qf.getWebView());
            }
            if (this.ri) {
                this.xb.pcc(true);
            }
            com.bytedance.sdk.component.vy.qf qfVar = this.qf;
            if (qfVar != null && qfVar.getWebView() != null) {
                hc sf2 = new hc(this.gpj, this.qf.getWebView(), new pcc(this.tsz, this.gpj, "landingpage", this), this.mk).sf(true);
                this.pcc = sf2;
                this.zti = sf2.pcc;
                this.nn = kun.pcc(this.gpj, this.qf, this.ork, this.lu);
                this.pcc.vj(this.kun);
                this.gd = new com.bytedance.sdk.openadsdk.gbb.oo(this.pcc);
                this.gpj.gpj(this.kun);
            }
            qf();
            com.bytedance.sdk.component.vy.qf qfVar2 = this.qf;
            if (qfVar2 != null) {
                qfVar2.setLandingPage(true);
                this.qf.setTag("landingpage");
                this.qf.setMaterialMeta(this.gpj.lr());
            }
            com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this.ork, this.dax, this.gbb, this.nn, this.pcc, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.1
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    try {
                        if (TTLandingPageActivity.this.hc != null && !TTLandingPageActivity.this.isFinishing()) {
                            TTLandingPageActivity.this.hc.setVisibility(8);
                        }
                    } catch (Throwable unused3) {
                    }
                    if (TTLandingPageActivity.this.ye != null) {
                        TTLandingPageActivity.this.ye.sf();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (!TextUtils.isEmpty(TTLandingPageActivity.this.of)) {
                            TTLandingPageActivity.this.qy.incrementAndGet();
                            WebResourceResponseModel pcc4 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(TTLandingPageActivity.this.yt, TTLandingPageActivity.this.of, str);
                            if (pcc4 != null && pcc4.getWebResourceResponse() != null) {
                                TTLandingPageActivity.this.atb.incrementAndGet();
                                return pcc4.getWebResourceResponse();
                            }
                            if (pcc4 != null && pcc4.getMsg() == 2) {
                                TTLandingPageActivity.this.jsj.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(webView, str);
                        }
                        return super.shouldInterceptRequest(webView, str);
                    } catch (Throwable unused3) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                }
            };
            this.rnn = whVar;
            whVar.pcc(this.gpj);
            this.rnn.pcc("landingpage");
            com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.gd;
            if (ooVar != null) {
                this.rnn.pcc(ooVar);
            }
            com.bytedance.sdk.component.vy.qf qfVar3 = this.qf;
            if (qfVar3 != null) {
                qfVar3.setWebViewClient(this.rnn);
                com.bytedance.sdk.component.vy.qf qfVar4 = this.qf;
                if (qfVar4 != null) {
                    qfVar4.setUserAgentString(lo.pcc(qfVar4.getWebView(), BuildConfig.VERSION_CODE));
                }
                com.bytedance.sdk.component.vy.qf qfVar5 = this.qf;
                if (qfVar5 != null) {
                    qfVar5.setMixedContentMode(0);
                }
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.gpj, "landingpage", this.mk);
            if (this.qf != null) {
                if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false) && this.kun) {
                    hc hcVar = this.pcc;
                    if (hcVar != null) {
                        hcVar.gm(this.fum);
                        this.pcc.oo(this.fum);
                        this.pcc.pcc(this.fum, 0L);
                    }
                    tmg tmgVar = this.ye;
                    if (tmgVar != null) {
                        tmgVar.sf();
                    }
                } else {
                    com.bytedance.sdk.openadsdk.utils.of.pcc(this.qf, this.fum);
                }
                this.qf.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.dax, this.pcc, this.nn) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.12
                    @Override // android.webkit.WebChromeClient
                    public void onReceivedTitle(WebView webView, String str) {
                        super.onReceivedTitle(webView, str);
                        if (TTLandingPageActivity.this.ri) {
                            TTLandingPageActivity.this.xb.pcc(str);
                            TTLandingPageActivity.this.xb.sf(webView.getUrl());
                            if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_iab_history", true)) {
                                try {
                                    if (TextUtils.isEmpty(str)) {
                                        str = TTLandingPageActivity.this.fum;
                                    }
                                    TTLandingPageActivity.this.fmh = new com.bytedance.sdk.openadsdk.gbb.pcc.pcc();
                                    TTLandingPageActivity.this.fmh.sf(TTLandingPageActivity.this.gpj.oo().sf());
                                    TTLandingPageActivity.this.fmh.gm(String.valueOf(System.currentTimeMillis()));
                                    TTLandingPageActivity.this.fmh.vj(webView.getUrl());
                                    TTLandingPageActivity.this.fmh.sf(TTLandingPageActivity.this.gpj.fq());
                                    TTLandingPageActivity.this.fmh.pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().gm(TTLandingPageActivity.this.gpj.qrz()));
                                    TTLandingPageActivity.this.fmh.oo(str);
                                    com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(TTLandingPageActivity.this.fmh);
                                    return;
                                } catch (Exception unused3) {
                                    new StringBuilder("page start: miabhistory index = ").append(TTLandingPageActivity.this.gpj.fq()).append("model = ").append(TTLandingPageActivity.this.fmh);
                                    return;
                                }
                            }
                            return;
                        }
                        if (TTLandingPageActivity.this.vy != null) {
                            TextView textView = TTLandingPageActivity.this.vy;
                            if (TextUtils.isEmpty(str)) {
                                str = tz.pcc(TTLandingPageActivity.this, "tt_web_title_default");
                            }
                            textView.setText(str);
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i2) {
                        super.onProgressChanged(webView, i2);
                        if (TTLandingPageActivity.this.ye != null) {
                            TTLandingPageActivity.this.ye.pcc(i2);
                        }
                        if (TTLandingPageActivity.this.hc != null && !TTLandingPageActivity.this.isFinishing()) {
                            if (i2 != 100 || !TTLandingPageActivity.this.hc.isShown()) {
                                TTLandingPageActivity.this.hc.setProgress(i2);
                            } else {
                                TTLandingPageActivity.this.hc.setVisibility(8);
                            }
                        }
                        if (!TTLandingPageActivity.this.ri || TTLandingPageActivity.this.xb == null) {
                            return;
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - TTLandingPageActivity.this.hpk >= 200 || i2 == 100) {
                            TTLandingPageActivity.this.xb.pcc(webView, TTLandingPageActivity.this.zti);
                            TTLandingPageActivity.this.hpk = currentTimeMillis;
                        }
                    }
                });
                if (this.qf.getWebView() != null) {
                    this.qf.getWebView().setOnScrollChangeListener(new sf(this.pcc));
                    this.qf.getWebView().setOnTouchListener(new gm(this.pcc, this.nn) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.13
                        private float gm;
                        private float oo;
                        private long vj;
                        private final int sf = lu.sf();
                        private float wh = 0.0f;
                        private float qf = 0.0f;

                        @Override // com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.gm, android.view.View.OnTouchListener
                        public boolean onTouch(View view, MotionEvent motionEvent) {
                            if (TTLandingPageActivity.this.gd != null) {
                                TTLandingPageActivity.this.gd.pcc();
                            }
                            if (!TTLandingPageActivity.this.ri) {
                                return super.onTouch(view, motionEvent);
                            }
                            try {
                                int actionMasked = motionEvent.getActionMasked();
                                if (actionMasked == 0) {
                                    this.gm = motionEvent.getRawX();
                                    this.oo = motionEvent.getRawY();
                                    this.vj = System.currentTimeMillis();
                                } else if (actionMasked == 2) {
                                    float rawX = motionEvent.getRawX();
                                    float rawY = motionEvent.getRawY();
                                    if (Math.abs(rawX - this.gm) < this.sf) {
                                        Math.abs(rawY - this.oo);
                                    }
                                    this.wh += Math.abs(motionEvent.getX() - this.gm);
                                    this.qf += Math.abs(motionEvent.getY() - this.oo);
                                    System.currentTimeMillis();
                                    if (rawY - this.oo > this.sf) {
                                        TTLandingPageActivity.this.xb.pcc();
                                    }
                                    if (rawY - this.oo < (-this.sf)) {
                                        TTLandingPageActivity.this.xb.sf();
                                    }
                                }
                            } catch (Throwable th) {
                                Log.e("TTAD.LandingPageAct", "TouchRecordTool onTouch error", th);
                            }
                            return super.onTouch(view, motionEvent);
                        }
                    });
                }
                this.qf.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.14
                    @Override // android.webkit.DownloadListener
                    public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                        if (TTLandingPageActivity.this.lo != null) {
                            TTLandingPageActivity.this.lo.pcc(TTLandingPageActivity.this.gpj);
                        }
                    }
                });
            }
            gm();
            com.bytedance.sdk.openadsdk.gbb.pcc pccVar = this.zsj;
            if (pccVar != null) {
                pccVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.15
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        TTLandingPageActivity.this.gm("onSelectPrivacy");
                        TTLandingPageActivity tTLandingPageActivity = TTLandingPageActivity.this;
                        TTWebsiteActivity.pcc(tTLandingPageActivity, tTLandingPageActivity.gpj, TTLandingPageActivity.this.lu);
                    }
                });
            }
            gm.pcc.pcc(SystemClock.elapsedRealtime() - elapsedRealtime, this.gpj, "landingpage", this.yt, this.of);
        } catch (Throwable unused3) {
            finish();
        }
    }

    private void sf() {
        if (TextUtils.isEmpty(this.fum)) {
            return;
        }
        com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.16
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                pccVar.sf("lp_reuse");
                pccVar.oo(TTLandingPageActivity.this.lu);
                return pccVar;
            }
        });
        if (this.kun) {
            hc hcVar = this.pcc;
            if (hcVar != null) {
                hcVar.vj(true);
                this.gpj.gpj(true);
            }
            com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.17
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("lp_reuse");
                    pccVar.oo(TTLandingPageActivity.this.lu);
                    return pccVar;
                }
            });
            com.bytedance.sdk.openadsdk.dax.oo.pcc(true);
            return;
        }
        this.kun = false;
        com.bytedance.sdk.openadsdk.dax.oo.pcc(false);
        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.18
            @Override // com.bytedance.sdk.openadsdk.lu.oo
            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                pccVar.sf("lp_reuse");
                pccVar.oo(TTLandingPageActivity.this.lu);
                return pccVar;
            }
        });
    }

    public static class pcc implements com.bytedance.sdk.openadsdk.oo.tmg {
        private final String gm;
        private final WeakReference<TTLandingPageActivity> oo;
        private final int pcc;
        private final of sf;

        public pcc(int i, of ofVar, String str, TTLandingPageActivity tTLandingPageActivity) {
            this.pcc = i;
            this.sf = ofVar;
            this.gm = str;
            this.oo = new WeakReference<>(tTLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.oo.tmg
        public void pcc(int i) {
            TTLandingPageActivity tTLandingPageActivity = this.oo.get();
            if (tTLandingPageActivity != null) {
                gm.pcc.pcc(this.pcc, tTLandingPageActivity.jsj.get(), tTLandingPageActivity.atb.get(), tTLandingPageActivity.qy.get() - tTLandingPageActivity.atb.get(), this.sf, this.gm, i);
            }
        }
    }

    private static class sf implements View.OnScrollChangeListener {
        private final WeakReference<hc> pcc;

        public sf(hc hcVar) {
            this.pcc = new WeakReference<>(hcVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            hc hcVar = this.pcc.get();
            if (hcVar != null) {
                hcVar.sf(i2);
            }
        }
    }

    private static class gm implements View.OnTouchListener {
        private final WeakReference<hc> pcc;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.vj> sf;

        public gm(hc hcVar, com.bytedance.sdk.openadsdk.common.vj vjVar) {
            this.pcc = new WeakReference<>(hcVar);
            this.sf = new WeakReference<>(vjVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            hc hcVar = this.pcc.get();
            if (hcVar != null) {
                hcVar.pcc(motionEvent);
            }
            com.bytedance.sdk.openadsdk.common.vj vjVar = this.sf.get();
            if (vjVar == null) {
                return false;
            }
            vjVar.pcc(motionEvent);
            return false;
        }
    }

    private View pcc(String str) {
        Bundle bundle;
        com.bytedance.sdk.component.vy.qf qfVar;
        com.bytedance.sdk.openadsdk.core.model.sf bo;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar.setOrientation(1);
        gmVar.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        boolean atb = lu.oo().atb();
        this.ri = atb;
        if (this.gpj != null && atb) {
            this.xb = new com.bytedance.sdk.openadsdk.common.hc(this, this.gpj, this.lu, false);
        }
        jr jrVar = new jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.19
            @Override // com.bytedance.sdk.openadsdk.common.jr.pcc
            public View pcc(Context context) {
                if (TTLandingPageActivity.this.gpj != null && TTLandingPageActivity.this.ri) {
                    return TTLandingPageActivity.this.xb.oo();
                }
                return new ork(context);
            }
        });
        jrVar.setId(com.bytedance.sdk.openadsdk.utils.nac.bg);
        vjVar.addView(jrVar, new LinearLayout.LayoutParams(-1, this.ri ? -2 : rj.sf(this, 44.0f)));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        vjVar.addView(gmVar2, layoutParams);
        if (!com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false) || TextUtils.isEmpty(str)) {
            bundle = null;
            qfVar = null;
        } else {
            String str2 = System.identityHashCode(this.gpj) + "_" + str;
            qfVar = fum.pcc(this, str2);
            bundle = fum.pcc(str2);
        }
        if (qfVar == null) {
            qfVar = new com.bytedance.sdk.component.vy.qf(this, qf.gm.LANDING_PAGE);
        } else {
            if (bundle != null && qfVar.getWebView() != null) {
                qfVar.getWebView().restoreState(bundle);
            }
            this.kun = true;
        }
        qfVar.setId(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        gmVar2.addView(qfVar, new FrameLayout.LayoutParams(-1, -1));
        jr jrVar2 = new jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.2
            @Override // com.bytedance.sdk.openadsdk.common.jr.pcc
            public View pcc(Context context) {
                return new com.bytedance.sdk.openadsdk.common.kj(context);
            }
        });
        jrVar2.setId(com.bytedance.sdk.openadsdk.utils.nac.qcw);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 81;
        gmVar2.addView(jrVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.wh whVar = new com.bytedance.sdk.openadsdk.core.wh.wh(this, null, R.style.Widget.ProgressBar.Horizontal);
        whVar.setId(com.bytedance.sdk.openadsdk.utils.nac.qc);
        whVar.setProgress(1);
        whVar.setVisibility(8);
        whVar.setProgressDrawable(vh.pcc(this, "tt_browser_progress_style"));
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, rj.sf(this, 3.0f));
        layoutParams3.gravity = 49;
        gmVar2.addView(whVar, layoutParams3);
        of ofVar = this.gpj;
        if (ofVar != null && (bo = ofVar.bo()) != null) {
            String oo = bo.oo();
            if (!TextUtils.isEmpty(oo)) {
                com.bytedance.sdk.openadsdk.gbb.pcc pccVar = new com.bytedance.sdk.openadsdk.gbb.pcc(this);
                this.zsj = pccVar;
                pccVar.setId(com.bytedance.sdk.openadsdk.utils.nac.ywp);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                this.zsj.setPadding(rj.sf(this, 16.0f), rj.sf(this, 16.0f), rj.sf(this, 16.0f), rj.sf(this, 16.0f));
                this.zsj.setPrivacyText(oo);
                layoutParams4.gravity = 80;
                gmVar2.addView(this.zsj, layoutParams4);
            }
        }
        tmg tmgVar = new tmg(this);
        tmgVar.setOnlyLoading(this.tsx);
        tmgVar.setId(520093721);
        gmVar.addView(tmgVar, new FrameLayout.LayoutParams(-1, -1));
        return gmVar;
    }

    private void gm() {
        of ofVar = this.gpj;
        if (ofVar == null || ofVar.az() != 4) {
            return;
        }
        jr jrVar = this.vh;
        if (jrVar != null) {
            jrVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.nac.kx);
        this.tmg = button;
        if (button != null) {
            sf(vj());
            if (this.lo == null) {
                this.lo = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this, TextUtils.isEmpty(this.lu) ? kun.sf(this.nac) : this.lu);
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(this, this.gpj, this.lu, this.nac);
            pccVar.pcc(false);
            this.tmg.setOnClickListener(pccVar);
            this.tmg.setOnTouchListener(pccVar);
            pccVar.gm(true);
            pccVar.pcc(this.lo);
        }
    }

    private String vj() {
        of ofVar = this.gpj;
        if (ofVar != null && !TextUtils.isEmpty(ofVar.bgf())) {
            this.erj = this.gpj.bgf();
        }
        return this.erj;
    }

    private void sf(String str) {
        if (TextUtils.isEmpty(str) || this.tmg == null || isFinishing()) {
            return;
        }
        this.tmg.setText(str);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        gm();
    }

    private void wh() {
        com.bytedance.sdk.component.vy.qf qfVar = (com.bytedance.sdk.component.vy.qf) findViewById(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        this.qf = qfVar;
        kun.pcc(this.gpj, qfVar);
        this.vh = (jr) findViewById(com.bytedance.sdk.openadsdk.utils.nac.qcw);
        jr jrVar = (jr) findViewById(com.bytedance.sdk.openadsdk.utils.nac.bg);
        tmg tmgVar = (tmg) findViewById(520093721);
        this.ye = tmgVar;
        if (tmgVar != null) {
            tmgVar.pcc(this.gpj);
            this.ye.pcc();
        }
        if (jrVar != null) {
            jrVar.setVisibility(0);
        }
        if (this.ri) {
            this.rj = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.mua);
        } else {
            this.rj = (ImageView) findViewById(520093720);
        }
        ImageView imageView = this.rj;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.3
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.qf != null) {
                        if (TTLandingPageActivity.this.zti != null) {
                            TTLandingPageActivity.this.zti.pcc();
                        }
                        if (TTLandingPageActivity.this.qf.kj()) {
                            TTLandingPageActivity.this.qf.vy();
                            if (!TTLandingPageActivity.this.ri || TTLandingPageActivity.this.xb == null) {
                                return;
                            }
                            WebView webView = TTLandingPageActivity.this.qf.getWebView();
                            if (TTLandingPageActivity.this.xb == null || webView == null) {
                                return;
                            }
                            TTLandingPageActivity.this.xb.pcc(webView, TTLandingPageActivity.this.zti);
                            return;
                        }
                        if (TTLandingPageActivity.this.ri) {
                            return;
                        }
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.vo);
        this.lrr = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.qf == null || !TTLandingPageActivity.this.qf.ork()) {
                        return;
                    }
                    TTLandingPageActivity.this.qf.vh();
                    if (!TTLandingPageActivity.this.ri || TTLandingPageActivity.this.xb == null) {
                        return;
                    }
                    WebView webView = TTLandingPageActivity.this.qf.getWebView();
                    if (TTLandingPageActivity.this.xb == null || webView == null) {
                        return;
                    }
                    TTLandingPageActivity.this.xb.pcc(webView, TTLandingPageActivity.this.zti);
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.kj = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.vy = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.vd);
        com.bytedance.sdk.openadsdk.core.wh.wh whVar = (com.bytedance.sdk.openadsdk.core.wh.wh) findViewById(com.bytedance.sdk.openadsdk.utils.nac.qc);
        this.hc = whVar;
        if (whVar != null) {
            whVar.setVisibility(0);
        }
        this.iv = (ImageView) findViewById(520093740);
        if (this.ri) {
            final com.bytedance.sdk.openadsdk.common.fum fumVar = new com.bytedance.sdk.openadsdk.common.fum(this, false);
            ImageView imageView4 = this.iv;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        fumVar.setOnMenuItemClickListener(new fum.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.6.1
                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void pcc() {
                                if (TTLandingPageActivity.this.gpj != null) {
                                    com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(TTLandingPageActivity.this.gpj);
                                }
                                com.bytedance.sdk.component.utils.sf.pcc(TTLandingPageActivity.this, new Intent(TTLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), null);
                                TTLandingPageActivity.this.gm("onSelectHistory");
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void sf() {
                                com.bytedance.sdk.component.vy.qf qfVar2 = TTLandingPageActivity.this.qf;
                                if (qfVar2 == null || qfVar2.getUrl() == null) {
                                    return;
                                }
                                if (TTLandingPageActivity.this.hc != null) {
                                    TTLandingPageActivity.this.hc.setVisibility(0);
                                    TTLandingPageActivity.this.hc.setProgress(0);
                                }
                                qfVar2.qf();
                                String url = qfVar2.getUrl();
                                if (url != null) {
                                    qfVar2.a_(url);
                                }
                                TTLandingPageActivity.this.gm("onSelectRetry");
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void gm() {
                                ClipboardManager clipboardManager;
                                if (TTLandingPageActivity.this.qf != null) {
                                    String url = TTLandingPageActivity.this.qf.getUrl();
                                    if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                        clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                    }
                                }
                                TTLandingPageActivity.this.gm("onSelectCopyLink");
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void oo() {
                                if (TTLandingPageActivity.this.qf != null) {
                                    Intent intent = new Intent("android.intent.action.VIEW");
                                    String url = TTLandingPageActivity.this.qf.getUrl();
                                    if (!TextUtils.isEmpty(url)) {
                                        intent.setData(Uri.parse(url));
                                        com.bytedance.sdk.component.utils.sf.pcc(TTLandingPageActivity.this, intent, null);
                                    }
                                    TTLandingPageActivity.this.gm("onSelectOpenInBrowser");
                                    fumVar.pcc();
                                }
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void vj() {
                                TTLandingPageActivity.this.pcc();
                                TTLandingPageActivity.this.gm("onSelectReport");
                                fumVar.pcc();
                            }

                            @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                            public void wh() {
                                TTLandingPageActivity.this.gm("onSelectPrivacy");
                                if (com.bytedance.sdk.openadsdk.utils.sf.wh()) {
                                    IABLandingPageActivity.pcc(TTLandingPageActivity.this, TTLandingPageActivity.this.gpj, TTLandingPageActivity.this.lu);
                                } else {
                                    TTWebsiteActivity.pcc(TTLandingPageActivity.this, TTLandingPageActivity.this.gpj, TTLandingPageActivity.this.lu);
                                }
                                fumVar.pcc();
                            }
                        });
                        fumVar.pcc(view);
                    }
                });
            }
        }
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.nac.jy);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTLandingPageActivity.this.pcc();
                }
            });
        }
    }

    private void qf() {
        mu muVar = new mu(this);
        this.dax = muVar;
        muVar.sf(this.qf).gm(this.gbb).oo(this.jr).pcc(this.gpj).sf(this.nac).pcc(this.gpj.bxz()).vj(this.gpj.ray()).pcc(this.qf).sf("landingpage");
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        of ofVar = this.gpj;
        if (ofVar != null) {
            ofVar.tmh(1);
        }
        mu muVar = this.dax;
        if (muVar != null) {
            muVar.vh();
        }
        hc hcVar = this.pcc;
        if (hcVar != null) {
            hcVar.qf();
        }
        gbb gbbVar = this.lq;
        if (gbbVar != null) {
            gbbVar.pcc();
        }
        com.bytedance.sdk.component.vy.qf qfVar = this.qf;
        if (qfVar != null) {
            qfVar.tmg();
            final com.bytedance.sdk.component.vy.qf qfVar2 = this.qf;
            if (qfVar2 != null) {
                qfVar2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8
                    @Override // java.lang.Runnable
                    public void run() {
                        qfVar2.scrollBy(0, 1);
                        qfVar2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.8.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (qfVar2 == null || TTLandingPageActivity.this.isFinishing()) {
                                    return;
                                }
                                qfVar2.scrollBy(0, -1);
                            }
                        }, 10L);
                    }
                }, 200L);
            }
        }
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        of ofVar = this.gpj;
        if (ofVar != null) {
            ofVar.tmh(0);
        }
        hc hcVar = this.pcc;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        gbb gbbVar = this.lq;
        if (gbbVar != null) {
            gbbVar.sf();
        }
        of ofVar = this.gpj;
        if (ofVar != null) {
            ofVar.qf(SystemClock.elapsedRealtime());
            this.gpj.tmh(0);
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        kj();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity
    protected void gbb() {
        kj();
    }

    private void kj() {
        if (vy() && !this.tz.getAndSet(true)) {
            ork();
            pcc(0);
        } else {
            try {
                super.onBackPressed();
            } catch (Throwable th) {
                new Object[]{"onBackPressed: ", th.getMessage()};
            }
        }
    }

    private boolean vy() {
        return !TextUtils.isEmpty(this.fum) && this.fum.contains("__luban_sdk");
    }

    private void pcc(final int i) {
        if (this.kj == null || !vy()) {
            return;
        }
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.9
            @Override // java.lang.Runnable
            public void run() {
                rj.pcc((View) TTLandingPageActivity.this.kj, i);
            }
        });
    }

    private void ork() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.dax.pcc("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        com.bytedance.sdk.component.vy.qf qfVar;
        com.bytedance.sdk.component.vy.qf qfVar2;
        super.onDestroy();
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false)) {
            of ofVar = this.gpj;
            if (ofVar != null) {
                ofVar.tmh(0);
            }
            hc hcVar = this.pcc;
            if (hcVar != null && (qfVar2 = this.qf) != null) {
                hcVar.pcc(qfVar2);
            }
            if (this.qf != null && !TextUtils.isEmpty(this.fum)) {
                Bundle bundle = new Bundle();
                if (this.qf.getWebView() != null) {
                    this.qf.getWebView().saveState(bundle);
                }
                com.bytedance.sdk.openadsdk.utils.fum.pcc(System.identityHashCode(this.gpj) + "_" + this.fum, this.qf, bundle);
            } else {
                com.bytedance.sdk.component.vy.qf qfVar3 = this.qf;
                if (qfVar3 != null) {
                    mk.pcc(qfVar3);
                }
            }
            this.qf = null;
        } else {
            hc hcVar2 = this.pcc;
            if (hcVar2 != null && (qfVar = this.qf) != null) {
                hcVar2.pcc(qfVar);
            }
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
        } catch (Throwable unused) {
        }
        if (!com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_cache_enable", false)) {
            com.bytedance.sdk.component.vy.qf qfVar4 = this.qf;
            if (qfVar4 != null) {
                mk.pcc(qfVar4);
            }
            this.qf = null;
        }
        mu muVar = this.dax;
        if (muVar != null) {
            muVar.tmg();
        }
        hc hcVar3 = this.pcc;
        if (hcVar3 != null) {
            hcVar3.oo(true);
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.gd;
        if (ooVar != null) {
            ooVar.gm();
        }
        if (!TextUtils.isEmpty(this.of)) {
            gm.pcc.pcc(this.atb.get(), this.qy.get(), this.gpj);
        }
        com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.yt);
        gbb gbbVar = this.lq;
        if (gbbVar != null) {
            gbbVar.gm();
        }
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("lp_iab_history", true) && this.ri) {
            com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().sf();
        }
    }

    protected void pcc() {
        if (isFinishing()) {
            return;
        }
        if (this.vj.get()) {
            tmg();
            return;
        }
        if (this.sf == null) {
            vh();
        }
        nac nacVar = this.sf;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    private void vh() {
        try {
            if (this.sf == null) {
                nac nacVar = new nac(this.ork, this.gpj);
                this.sf = nacVar;
                nacVar.setDislikeSource("landing_page");
                this.sf.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.10
                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(View view) {
                        TTLandingPageActivity.this.oo.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void sf(View view) {
                        TTLandingPageActivity.this.oo.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(FilterWord filterWord) {
                        if (TTLandingPageActivity.this.vj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTLandingPageActivity.this.vj.set(true);
                        TTLandingPageActivity.this.hc();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.sf);
            if (this.gm == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.ork);
                this.gm = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void tmg() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hc() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.gm) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    @Override // android.app.Activity
    protected void onStart() {
        super.onStart();
        if (this.wh >= 0) {
            atb.pcc().gm(this.wh);
            this.wh = -1;
        }
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.gpj);
        of ofVar = this.gpj;
        if (ofVar != null) {
            ofVar.tmh(1);
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int pcc2 = this.gpj != null ? atb.pcc().pcc(this.gpj) : -1;
            this.wh = pcc2;
            bundle.putInt("meta_index", pcc2);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(final String str) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("iab_more_options", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTLandingPageActivity.11
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("iab_more_options").sf(jSONObject.toString());
            }
        });
    }
}
