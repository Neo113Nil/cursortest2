package com.bytedance.sdk.openadsdk.activity.single;

import android.R;
import android.app.Activity;
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
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.fum;
import com.bytedance.sdk.openadsdk.common.hc;
import com.bytedance.sdk.openadsdk.common.jr;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.common.tmg;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.vh;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class TTHistoryLandingPageActivity extends TTBaseLandingPageActivity {
    private static final LinkedList<WeakReference<Activity>> qf = new LinkedList<>();
    private qf.pcc atb;
    private String dax;
    private String fum;
    private mu gbb;
    TTAdDislikeToast gm;
    private com.bytedance.sdk.openadsdk.core.wh.wh gpj;
    private String hc;
    private ImageView iv;
    private int jr;
    private int jsj;
    private com.bytedance.sdk.component.vy.qf kj;
    private hc kun;
    private String lo;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh lq;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm lu;
    private tmg mk;
    private of nac;
    private ImageView nn;
    private jr ork;
    com.bytedance.sdk.openadsdk.oo.hc pcc;
    private int qy;
    private com.bytedance.sdk.openadsdk.gbb.pcc ri;
    private ImageView rnn;
    nac sf;
    private String tmg;
    private ImageView tsx;
    private ILoader tz;
    private Button vh;
    private Context vy;
    private com.bytedance.sdk.openadsdk.gbb.pcc.pcc xb;
    private com.bytedance.sdk.openadsdk.common.vj ye;
    private boolean zti;
    private final AtomicInteger of = new AtomicInteger(0);
    private final AtomicInteger yt = new AtomicInteger(0);
    private final AtomicInteger tsz = new AtomicInteger(0);
    final AtomicBoolean oo = new AtomicBoolean(false);
    final AtomicBoolean vj = new AtomicBoolean(false);
    private boolean rj = false;
    private long lrr = 0;
    int wh = -1;
    private String hpk = "DOWNLOAD";

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
        LinkedList<WeakReference<Activity>> linkedList = qf;
        linkedList.add(new WeakReference<>(this));
        if (linkedList.size() > 30) {
            kj();
        }
        com.bytedance.sdk.openadsdk.gbb.vj.pcc(this);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("material_key");
        this.lo = intent.getStringExtra("landing_url");
        int intExtra = intent.getIntExtra("landing_index", 0);
        if (stringExtra != null && intExtra >= 0) {
            com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(stringExtra, new AnonymousClass1(intExtra, bundle, elapsedRealtime));
        } else {
            finish();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity$1, reason: invalid class name */
    class AnonymousClass1 implements gm.InterfaceC0184gm {
        final /* synthetic */ long gm;
        final /* synthetic */ int pcc;
        final /* synthetic */ Bundle sf;

        AnonymousClass1(int i, Bundle bundle, long j) {
            this.pcc = i;
            this.sf = bundle;
            this.gm = j;
        }

        @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.InterfaceC0184gm
        public void pcc(final String str) {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1
                @Override // java.lang.Runnable
                public void run() {
                    List<of> sf = com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.sf(str);
                    TTHistoryLandingPageActivity.this.nac = (sf == null || sf.isEmpty()) ? null : sf.get(AnonymousClass1.this.pcc);
                    if (AnonymousClass1.this.sf != null) {
                        try {
                            TTHistoryLandingPageActivity.this.wh = AnonymousClass1.this.sf.getInt("meta_index", -1);
                            if (TTHistoryLandingPageActivity.this.wh >= 0) {
                                TTHistoryLandingPageActivity.this.nac = atb.pcc().pcc(TTHistoryLandingPageActivity.this.wh);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.nac != null) {
                        TTHistoryLandingPageActivity.this.tmg = TTHistoryLandingPageActivity.this.nac.esn();
                        TTHistoryLandingPageActivity.this.hc = TTHistoryLandingPageActivity.this.nac.hl();
                        TTHistoryLandingPageActivity.this.fum = TTHistoryLandingPageActivity.this.nac.cz();
                        TTHistoryLandingPageActivity.this.jr = TTHistoryLandingPageActivity.this.nac.hc();
                        TTHistoryLandingPageActivity.this.dax = TTHistoryLandingPageActivity.this.nac.tmg();
                        try {
                            TTHistoryLandingPageActivity.this.setContentView(TTHistoryLandingPageActivity.this.vj());
                            TTHistoryLandingPageActivity.this.sf();
                            TTHistoryLandingPageActivity.this.vy = TTHistoryLandingPageActivity.this;
                            if (TTHistoryLandingPageActivity.this.kj != null) {
                                com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(TTHistoryLandingPageActivity.this.vy).pcc(false).sf(false).pcc(TTHistoryLandingPageActivity.this.kj.getWebView());
                            }
                            TTHistoryLandingPageActivity.this.kun.pcc(true);
                            if (TTHistoryLandingPageActivity.this.kj != null && TTHistoryLandingPageActivity.this.kj.getWebView() != null) {
                                TTHistoryLandingPageActivity.this.pcc = new com.bytedance.sdk.openadsdk.oo.hc(TTHistoryLandingPageActivity.this.nac, TTHistoryLandingPageActivity.this.kj.getWebView(), new pcc(TTHistoryLandingPageActivity.this.qy, TTHistoryLandingPageActivity.this.nac, "landingpage", TTHistoryLandingPageActivity.this), TTHistoryLandingPageActivity.this.jsj).sf(true);
                                TTHistoryLandingPageActivity.this.atb = TTHistoryLandingPageActivity.this.pcc.pcc;
                                TTHistoryLandingPageActivity.this.ye = kun.pcc(TTHistoryLandingPageActivity.this.nac, TTHistoryLandingPageActivity.this.kj, TTHistoryLandingPageActivity.this.vy, TTHistoryLandingPageActivity.this.dax);
                                TTHistoryLandingPageActivity.this.pcc.vj(TTHistoryLandingPageActivity.this.rj);
                                TTHistoryLandingPageActivity.this.nac.gpj(TTHistoryLandingPageActivity.this.rj);
                            }
                            TTHistoryLandingPageActivity.this.vy();
                            if (TTHistoryLandingPageActivity.this.kj != null) {
                                TTHistoryLandingPageActivity.this.kj.setLandingPage(true);
                                TTHistoryLandingPageActivity.this.kj.setTag("landingpage");
                                TTHistoryLandingPageActivity.this.kj.setMaterialMeta(TTHistoryLandingPageActivity.this.nac.lr());
                            }
                            TTHistoryLandingPageActivity.this.gm();
                            TTHistoryLandingPageActivity.this.wh();
                            if (TTHistoryLandingPageActivity.this.ri != null) {
                                TTHistoryLandingPageActivity.this.ri.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.1.1.1
                                    @Override // android.view.View.OnClickListener
                                    public void onClick(View view) {
                                        TTHistoryLandingPageActivity.this.sf("onSelectPrivacy");
                                        TTWebsiteActivity.pcc(TTHistoryLandingPageActivity.this, TTHistoryLandingPageActivity.this.nac, TTHistoryLandingPageActivity.this.dax);
                                    }
                                });
                            }
                            gm.pcc.pcc(SystemClock.elapsedRealtime() - AnonymousClass1.this.gm, TTHistoryLandingPageActivity.this.nac, "landingpage", TTHistoryLandingPageActivity.this.tz, TTHistoryLandingPageActivity.this.fum);
                            return;
                        } catch (Throwable unused2) {
                            TTHistoryLandingPageActivity.this.finish();
                            return;
                        }
                    }
                    TTHistoryLandingPageActivity.this.finish();
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.InterfaceC0184gm
        public void sf(String str) {
            TTHistoryLandingPageActivity.this.finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        kun.pcc(this.nac, this.kj);
        this.ork = (jr) findViewById(com.bytedance.sdk.openadsdk.utils.nac.qcw);
        jr jrVar = (jr) findViewById(com.bytedance.sdk.openadsdk.utils.nac.bg);
        tmg tmgVar = (tmg) findViewById(520093721);
        this.mk = tmgVar;
        if (tmgVar != null) {
            tmgVar.pcc(this.nac);
            this.mk.pcc();
        }
        if (jrVar != null) {
            jrVar.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.mua);
        this.nn = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.7
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTHistoryLandingPageActivity.this.kj != null) {
                        if (TTHistoryLandingPageActivity.this.atb != null) {
                            TTHistoryLandingPageActivity.this.atb.pcc();
                        }
                        if (TTHistoryLandingPageActivity.this.kj.kj()) {
                            TTHistoryLandingPageActivity.this.kj.vy();
                            if (TTHistoryLandingPageActivity.this.kun != null) {
                                TTHistoryLandingPageActivity.this.kun.pcc(TTHistoryLandingPageActivity.this.kj.getWebView(), TTHistoryLandingPageActivity.this.atb);
                            }
                        }
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.nac.vo);
        this.rnn = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (TTHistoryLandingPageActivity.this.kj == null || !TTHistoryLandingPageActivity.this.kj.ork()) {
                        return;
                    }
                    TTHistoryLandingPageActivity.this.kj.vh();
                    if (TTHistoryLandingPageActivity.this.kun != null) {
                        TTHistoryLandingPageActivity.this.kun.pcc(TTHistoryLandingPageActivity.this.kj.getWebView(), TTHistoryLandingPageActivity.this.atb);
                    }
                }
            });
        }
        ImageView imageView3 = (ImageView) findViewById(520093716);
        this.iv = imageView3;
        if (imageView3 != null) {
            imageView3.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryLandingPageActivity.this.finish();
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.wh.wh whVar = (com.bytedance.sdk.openadsdk.core.wh.wh) findViewById(com.bytedance.sdk.openadsdk.utils.nac.qc);
        this.gpj = whVar;
        if (whVar != null) {
            whVar.setVisibility(0);
        }
        this.tsx = (ImageView) findViewById(520093740);
        final fum fumVar = new fum(this, false);
        ImageView imageView4 = this.tsx;
        if (imageView4 != null) {
            imageView4.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    fumVar.setOnMenuItemClickListener(new fum.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.10.1
                        @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                        public void pcc() {
                            if (TTHistoryLandingPageActivity.this.nac != null) {
                                com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(TTHistoryLandingPageActivity.this.nac);
                            }
                            com.bytedance.sdk.component.utils.sf.pcc(TTHistoryLandingPageActivity.this, new Intent(TTHistoryLandingPageActivity.this, (Class<?>) TTHistoryActivity.class), null);
                            TTHistoryLandingPageActivity.this.sf("onSelectHistory");
                            fumVar.pcc();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                        public void sf() {
                            if (TTHistoryLandingPageActivity.this.kj == null || TTHistoryLandingPageActivity.this.kj.getUrl() == null) {
                                return;
                            }
                            if (TTHistoryLandingPageActivity.this.gpj != null) {
                                TTHistoryLandingPageActivity.this.gpj.setVisibility(0);
                                TTHistoryLandingPageActivity.this.gpj.setProgress(0);
                            }
                            TTHistoryLandingPageActivity.this.kj.qf();
                            TTHistoryLandingPageActivity.this.kj.a_(TTHistoryLandingPageActivity.this.kj.getUrl());
                            TTHistoryLandingPageActivity.this.sf("onSelectRetry");
                            fumVar.pcc();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                        public void gm() {
                            ClipboardManager clipboardManager;
                            if (TTHistoryLandingPageActivity.this.kj != null) {
                                String url = TTHistoryLandingPageActivity.this.kj.getUrl();
                                if (!TextUtils.isEmpty(url) && (clipboardManager = (ClipboardManager) TTHistoryLandingPageActivity.this.getSystemService("clipboard")) != null) {
                                    clipboardManager.setPrimaryClip(ClipData.newPlainText("URL", url));
                                }
                            }
                            TTHistoryLandingPageActivity.this.sf("onSelectCopyLink");
                            fumVar.pcc();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                        public void oo() {
                            if (TTHistoryLandingPageActivity.this.kj != null) {
                                Intent intent = new Intent("android.intent.action.VIEW");
                                String url = TTHistoryLandingPageActivity.this.kj.getUrl();
                                if (!TextUtils.isEmpty(url)) {
                                    intent.setData(Uri.parse(url));
                                    com.bytedance.sdk.component.utils.sf.pcc(TTHistoryLandingPageActivity.this, intent, null);
                                }
                                TTHistoryLandingPageActivity.this.sf("onSelectOpenInBrowser");
                                fumVar.pcc();
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                        public void vj() {
                            TTHistoryLandingPageActivity.this.pcc();
                            TTHistoryLandingPageActivity.this.sf("onSelectReport");
                            fumVar.pcc();
                        }

                        @Override // com.bytedance.sdk.openadsdk.common.fum.pcc
                        public void wh() {
                            if (com.bytedance.sdk.openadsdk.utils.sf.wh()) {
                                IABLandingPageActivity.pcc(TTHistoryLandingPageActivity.this, TTHistoryLandingPageActivity.this.nac, TTHistoryLandingPageActivity.this.dax);
                            } else {
                                TTWebsiteActivity.pcc(TTHistoryLandingPageActivity.this, TTHistoryLandingPageActivity.this.nac, TTHistoryLandingPageActivity.this.dax);
                            }
                            TTHistoryLandingPageActivity.this.sf("onSelectPrivacy");
                            fumVar.pcc();
                        }
                    });
                    fumVar.pcc(view);
                }
            });
        }
        View findViewById = findViewById(com.bytedance.sdk.openadsdk.utils.nac.jy);
        if (findViewById != null) {
            findViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.11
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTHistoryLandingPageActivity.this.pcc();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm() {
        com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(this.vy, this.gbb, this.tmg, this.ye, this.pcc, true) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.12
            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTHistoryLandingPageActivity.this.gpj != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        TTHistoryLandingPageActivity.this.gpj.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
                if (TTHistoryLandingPageActivity.this.mk != null) {
                    TTHistoryLandingPageActivity.this.mk.sf();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                try {
                    if (!TextUtils.isEmpty(TTHistoryLandingPageActivity.this.fum)) {
                        TTHistoryLandingPageActivity.this.of.incrementAndGet();
                        WebResourceResponseModel pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(TTHistoryLandingPageActivity.this.tz, TTHistoryLandingPageActivity.this.fum, str);
                        if (pcc2 != null && pcc2.getWebResourceResponse() != null) {
                            TTHistoryLandingPageActivity.this.tsz.incrementAndGet();
                            return pcc2.getWebResourceResponse();
                        }
                        if (pcc2 != null && pcc2.getMsg() == 2) {
                            TTHistoryLandingPageActivity.this.yt.incrementAndGet();
                        }
                        return super.shouldInterceptRequest(webView, str);
                    }
                    return super.shouldInterceptRequest(webView, str);
                } catch (Throwable th) {
                    lo.pcc("TTAD.HistoryLandingPageAct", "shouldInterceptRequest url error", th);
                    return super.shouldInterceptRequest(webView, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
            }
        };
        this.lq = whVar;
        whVar.pcc(this.nac);
        this.lq.pcc("landingpage");
        com.bytedance.sdk.component.vy.qf qfVar = this.kj;
        if (qfVar != null) {
            qfVar.setWebViewClient(this.lq);
            com.bytedance.sdk.component.vy.qf qfVar2 = this.kj;
            if (qfVar2 != null) {
                qfVar2.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar2.getWebView(), BuildConfig.VERSION_CODE));
            }
            com.bytedance.sdk.component.vy.qf qfVar3 = this.kj;
            if (qfVar3 != null) {
                qfVar3.setMixedContentMode(0);
            }
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(this.nac, "landingpage", this.jsj);
        com.bytedance.sdk.component.vy.qf qfVar4 = this.kj;
        if (qfVar4 != null) {
            com.bytedance.sdk.openadsdk.utils.of.pcc(qfVar4, this.lo);
            this.kj.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.gbb, this.pcc, this.ye) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.13
                @Override // android.webkit.WebChromeClient
                public void onReceivedTitle(WebView webView, String str) {
                    super.onReceivedTitle(webView, str);
                    TTHistoryLandingPageActivity.this.kun.pcc(str);
                    TTHistoryLandingPageActivity.this.kun.sf(webView.getUrl());
                    try {
                        if (TextUtils.isEmpty(str)) {
                            str = TTHistoryLandingPageActivity.this.lo;
                        }
                        TTHistoryLandingPageActivity.this.xb = new com.bytedance.sdk.openadsdk.gbb.pcc.pcc();
                        com.bytedance.sdk.openadsdk.core.model.pcc oo = TTHistoryLandingPageActivity.this.nac.oo();
                        TTHistoryLandingPageActivity.this.xb.pcc(com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().gm(TTHistoryLandingPageActivity.this.nac.qrz()));
                        TTHistoryLandingPageActivity.this.xb.sf(oo.sf());
                        TTHistoryLandingPageActivity.this.xb.gm(String.valueOf(System.currentTimeMillis()));
                        TTHistoryLandingPageActivity.this.xb.vj(webView.getUrl());
                        TTHistoryLandingPageActivity.this.xb.sf(TTHistoryLandingPageActivity.this.nac.fq());
                        TTHistoryLandingPageActivity.this.xb.oo(str);
                        com.bytedance.sdk.openadsdk.gbb.pcc.pcc.gm.pcc().pcc(TTHistoryLandingPageActivity.this.xb);
                    } catch (Exception e) {
                        lo.pcc("TTAD.HistoryLandingPageAct", "page start: miabhistory index = " + TTHistoryLandingPageActivity.this.nac.fq() + "model = " + TTHistoryLandingPageActivity.this.xb, e);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (TTHistoryLandingPageActivity.this.mk != null) {
                        TTHistoryLandingPageActivity.this.mk.pcc(i);
                    }
                    if (TTHistoryLandingPageActivity.this.gpj != null && !TTHistoryLandingPageActivity.this.isFinishing()) {
                        if (i != 100 || !TTHistoryLandingPageActivity.this.gpj.isShown()) {
                            TTHistoryLandingPageActivity.this.gpj.setProgress(i);
                        } else {
                            TTHistoryLandingPageActivity.this.gpj.setVisibility(8);
                        }
                    }
                    if (TTHistoryLandingPageActivity.this.kun != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (currentTimeMillis - TTHistoryLandingPageActivity.this.lrr >= 200 || i == 100) {
                            TTHistoryLandingPageActivity.this.kun.pcc(webView, TTHistoryLandingPageActivity.this.atb);
                            TTHistoryLandingPageActivity.this.lrr = currentTimeMillis;
                        }
                    }
                }
            });
            if (this.kj.getWebView() != null) {
                this.kj.getWebView().setOnScrollChangeListener(new sf(this.pcc));
                this.kj.getWebView().setOnTouchListener(new gm(this.pcc, this.ye) { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.14
                    private float gm;
                    private float oo;
                    private long vj;
                    private final int sf = lu.sf();
                    private float wh = 0.0f;
                    private float qf = 0.0f;

                    @Override // com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.gm, android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
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
                                    TTHistoryLandingPageActivity.this.kun.pcc();
                                }
                                if (rawY - this.oo < (-this.sf)) {
                                    TTHistoryLandingPageActivity.this.kun.sf();
                                }
                            }
                        } catch (Throwable th) {
                            Log.e("TTAD.HistoryLandingPageAct", "TouchRecordTool onTouch error", th);
                        }
                        return super.onTouch(view, motionEvent);
                    }
                });
            }
            this.kj.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.2
                @Override // android.webkit.DownloadListener
                public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                    if (TTHistoryLandingPageActivity.this.lu != null) {
                        TTHistoryLandingPageActivity.this.lu.pcc(TTHistoryLandingPageActivity.this.nac);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View vj() {
        com.bytedance.sdk.openadsdk.core.model.sf bo;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        if (Build.VERSION.SDK_INT >= 35) {
            gmVar.setFitsSystemWindows(true);
        }
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(this);
        vjVar.setOrientation(1);
        gmVar.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        this.kun = new hc(this, this.nac, this.dax, false);
        jr jrVar = new jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.3
            @Override // com.bytedance.sdk.openadsdk.common.jr.pcc
            public View pcc(Context context) {
                return TTHistoryLandingPageActivity.this.kun.oo();
            }
        });
        jrVar.setId(com.bytedance.sdk.openadsdk.utils.nac.bg);
        vjVar.addView(jrVar, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0);
        layoutParams.weight = 1.0f;
        vjVar.addView(gmVar2, layoutParams);
        com.bytedance.sdk.component.vy.qf qfVar = new com.bytedance.sdk.component.vy.qf(this, qf.gm.LANDING_PAGE);
        this.kj = qfVar;
        qfVar.setId(com.bytedance.sdk.openadsdk.utils.nac.hpk);
        gmVar2.addView(qfVar, new FrameLayout.LayoutParams(-1, -1));
        jr jrVar2 = new jr(this, new jr.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.4
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
        of ofVar = this.nac;
        if (ofVar != null && (bo = ofVar.bo()) != null) {
            String oo = bo.oo();
            if (!TextUtils.isEmpty(oo)) {
                com.bytedance.sdk.openadsdk.gbb.pcc pccVar = new com.bytedance.sdk.openadsdk.gbb.pcc(this);
                this.ri = pccVar;
                pccVar.setId(com.bytedance.sdk.openadsdk.utils.nac.ywp);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
                this.ri.setPadding(rj.sf(this, 16.0f), rj.sf(this, 16.0f), rj.sf(this, 16.0f), rj.sf(this, 16.0f));
                this.ri.setPrivacyText(oo);
                layoutParams4.gravity = 80;
                gmVar2.addView(this.ri, layoutParams4);
            }
        }
        tmg tmgVar = new tmg(this);
        tmgVar.setOnlyLoading(this.zti);
        tmgVar.setId(520093721);
        gmVar.addView(tmgVar, new FrameLayout.LayoutParams(-1, -1));
        return gmVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh() {
        of ofVar = this.nac;
        if (ofVar == null || ofVar.az() != 4) {
            return;
        }
        jr jrVar = this.ork;
        if (jrVar != null) {
            jrVar.setVisibility(0);
        }
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.nac.kx);
        this.vh = button;
        if (button != null) {
            pcc(qf());
            if (this.lu == null) {
                this.lu = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this, TextUtils.isEmpty(this.dax) ? kun.sf(this.jr) : this.dax);
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(this, this.nac, this.dax, this.jr);
            pccVar.pcc(false);
            this.vh.setOnClickListener(pccVar);
            this.vh.setOnTouchListener(pccVar);
            pccVar.gm(true);
            pccVar.pcc(this.lu);
        }
    }

    private String qf() {
        of ofVar = this.nac;
        if (ofVar != null && !TextUtils.isEmpty(ofVar.bgf())) {
            this.hpk = this.nac.bgf();
        }
        return this.hpk;
    }

    private void pcc(String str) {
        if (TextUtils.isEmpty(str) || this.vh == null || isFinishing()) {
            return;
        }
        this.vh.setText(str);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        try {
            super.onConfigurationChanged(configuration);
        } catch (Throwable unused) {
        }
        wh();
    }

    private void kj() {
        while (true) {
            LinkedList<WeakReference<Activity>> linkedList = qf;
            if (linkedList.isEmpty()) {
                return;
            }
            Activity activity = linkedList.pollFirst().get();
            if (activity != null && !activity.isFinishing()) {
                activity.finish();
                return;
            }
        }
    }

    public static void pcc(Context context, String str, String str2, int i) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) TTHistoryLandingPageActivity.class);
        intent.putExtra("material_key", str);
        intent.putExtra("landing_url", str2);
        intent.putExtra("landing_index", i);
        com.bytedance.sdk.component.utils.sf.pcc(context, intent, null);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int pcc2 = this.nac != null ? atb.pcc().pcc(this.nac) : -1;
            this.wh = pcc2;
            bundle.putInt("meta_index", pcc2);
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.single.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.single.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        Iterator<WeakReference<Activity>> it = qf.iterator();
        while (it.hasNext()) {
            Activity activity = it.next().get();
            if (activity == this || activity == null) {
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vy() {
        mu muVar = new mu(this);
        this.gbb = muVar;
        muVar.sf(this.kj).gm(this.tmg).oo(this.hc).pcc(this.nac).sf(this.jr).pcc(this.nac.bxz()).vj(this.nac.ray()).pcc(this.kj).sf("landingpage");
    }

    protected void pcc() {
        if (isFinishing()) {
            return;
        }
        if (this.vj.get()) {
            vh();
            return;
        }
        if (this.sf == null) {
            ork();
        }
        nac nacVar = this.sf;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    private void ork() {
        try {
            if (this.sf == null) {
                nac nacVar = new nac(this.vy, this.nac);
                this.sf = nacVar;
                nacVar.setDislikeSource("landing_page");
                this.sf.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.5
                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(View view) {
                        TTHistoryLandingPageActivity.this.oo.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void sf(View view) {
                        TTHistoryLandingPageActivity.this.oo.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                    public void pcc(FilterWord filterWord) {
                        if (TTHistoryLandingPageActivity.this.vj.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTHistoryLandingPageActivity.this.vj.set(true);
                        TTHistoryLandingPageActivity.this.tmg();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.sf);
            if (this.gm == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.vy);
                this.gm = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th) {
            ApmHelper.reportCustomError("initDislike error", "LandingPageActivity", th);
        }
    }

    private void vh() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tmg() {
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
        com.bytedance.sdk.openadsdk.utils.oo.pcc(this, this.nac);
        of ofVar = this.nac;
        if (ofVar != null) {
            ofVar.tmh(1);
        }
    }

    public static class pcc implements com.bytedance.sdk.openadsdk.oo.tmg {
        private final String gm;
        private final WeakReference<TTHistoryLandingPageActivity> oo;
        private final int pcc;
        private final of sf;

        public pcc(int i, of ofVar, String str, TTHistoryLandingPageActivity tTHistoryLandingPageActivity) {
            this.pcc = i;
            this.sf = ofVar;
            this.gm = str;
            this.oo = new WeakReference<>(tTHistoryLandingPageActivity);
        }

        @Override // com.bytedance.sdk.openadsdk.oo.tmg
        public void pcc(int i) {
            TTHistoryLandingPageActivity tTHistoryLandingPageActivity = this.oo.get();
            if (tTHistoryLandingPageActivity != null) {
                gm.pcc.pcc(this.pcc, tTHistoryLandingPageActivity.yt.get(), tTHistoryLandingPageActivity.tsz.get(), tTHistoryLandingPageActivity.of.get() - tTHistoryLandingPageActivity.tsz.get(), this.sf, this.gm, i);
            }
        }
    }

    private static class sf implements View.OnScrollChangeListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.oo.hc> pcc;

        public sf(com.bytedance.sdk.openadsdk.oo.hc hcVar) {
            this.pcc = new WeakReference<>(hcVar);
        }

        @Override // android.view.View.OnScrollChangeListener
        public void onScrollChange(View view, int i, int i2, int i3, int i4) {
            com.bytedance.sdk.openadsdk.oo.hc hcVar = this.pcc.get();
            if (hcVar != null) {
                hcVar.sf(i2);
            }
        }
    }

    private static class gm implements View.OnTouchListener {
        private final WeakReference<com.bytedance.sdk.openadsdk.oo.hc> pcc;
        private final WeakReference<com.bytedance.sdk.openadsdk.common.vj> sf;

        public gm(com.bytedance.sdk.openadsdk.oo.hc hcVar, com.bytedance.sdk.openadsdk.common.vj vjVar) {
            this.pcc = new WeakReference<>(hcVar);
            this.sf = new WeakReference<>(vjVar);
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            com.bytedance.sdk.openadsdk.oo.hc hcVar = this.pcc.get();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(final String str) {
        com.bytedance.sdk.openadsdk.dax.oo.pcc("iab_more_options", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.activity.single.TTHistoryLandingPageActivity.6
            @Override // com.bytedance.sdk.openadsdk.dax.sf
            public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scene", str);
                return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("iab_more_options").sf(jSONObject.toString());
            }
        });
    }
}
