package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.mk;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.mu;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.oo.gm;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class lu implements com.bytedance.sdk.openadsdk.hc.vy {
    private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf atb;
    private qf.pcc erj;
    private View fum;
    private int gbb;
    private boolean gd;
    protected String gm;
    private boolean gpj;
    private int hc;
    private boolean hoh;
    private com.bytedance.sdk.component.vy.qf jr;
    private long kun;
    private View lo;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.wh lq;
    private int lrr;
    private boolean lu;
    private boolean mu;
    private boolean nn;
    private float of;
    com.bytedance.sdk.openadsdk.oo.hc oo;
    private final String ork;
    mu pcc;
    private boolean pq;
    private com.bytedance.sdk.openadsdk.gbb.oo ptr;
    private boolean qcw;
    protected com.bytedance.sdk.openadsdk.oo.oo.vj qf;
    private ILoader ri;
    private boolean rnn;
    private com.bytedance.sdk.openadsdk.common.vj se;
    private final boolean tmg;
    private float tz;
    private int vh;
    private String xb;
    private long yt;
    protected boolean sf = true;
    private boolean dax = false;
    private final AtomicBoolean nac = new AtomicBoolean(true);
    int vj = 0;
    String wh = "";
    boolean kj = false;
    private SparseArray<gm.pcc> qy = new SparseArray<>();
    private boolean jsj = true;
    private float tsz = -1.0f;
    private float mk = -1.0f;
    private boolean ye = false;
    private long zti = 0;
    private long tsx = -1;
    private volatile int rj = 0;
    private int iv = -1;
    private volatile int hpk = 0;
    private volatile int fmh = 0;
    private long zsj = 0;
    public boolean vy = false;
    private int vr = -1;

    public interface sf {
        void pcc(WebView webView, String str);
    }

    static /* synthetic */ int gbb(lu luVar) {
        int i = luVar.rj;
        luVar.rj = i + 1;
        return i;
    }

    static /* synthetic */ int hc(lu luVar) {
        int i = luVar.fmh;
        luVar.fmh = i + 1;
        return i;
    }

    static /* synthetic */ int vh(lu luVar) {
        int i = luVar.hpk;
        luVar.hpk = i + 1;
        return i;
    }

    public lu(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.atb = sfVar;
        this.ork = sfVar.vj;
        this.tmg = sfVar.oo;
    }

    public void pcc() {
        if (this.gpj) {
            return;
        }
        this.gpj = true;
        this.vh = this.atb.zsj;
        this.hc = this.atb.erj;
        this.gbb = this.atb.se;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        sf();
        this.zsj = SystemClock.elapsedRealtime() - elapsedRealtime;
    }

    void sf() {
        this.lo = this.atb.rnn.findViewById(R.id.content);
        com.bytedance.sdk.component.vy.qf qfVar = (com.bytedance.sdk.component.vy.qf) this.atb.nn.findViewById(com.bytedance.sdk.openadsdk.utils.nac.dax);
        this.jr = qfVar;
        if (qfVar != null && of.sf(this.atb.sf)) {
            this.jr.vj();
        } else {
            rj.pcc((View) this.jr, 8);
        }
        com.bytedance.sdk.component.vy.qf qfVar2 = this.jr;
        if (qfVar2 != null) {
            qfVar2.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.1
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (lu.this.jr == null || lu.this.jr.getViewTreeObserver() == null) {
                        return;
                    }
                    lu.this.jr.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                    int measuredWidth = lu.this.jr.getMeasuredWidth();
                    int measuredHeight = lu.this.jr.getMeasuredHeight();
                    if (lu.this.jr.getVisibility() == 0) {
                        lu.this.pcc(measuredWidth, measuredHeight);
                    }
                }
            });
        }
    }

    public void pcc(String str, final com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        pcc(str, new sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.lu.sf
            public void pcc(WebView webView, String str2) {
                if (lu.this.atb.rnn.isFinishing()) {
                    return;
                }
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                lu.this.hc();
            }
        });
        pcc(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.6
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String str2, String str3, String str4, String str5, long j) {
                lu.this.atb.tz.sf();
                com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar2 = sfVar;
                if (sfVar2 != null) {
                    sfVar2.qcw();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        this.atb.lo.get();
        if (this.atb.ywp == null || !this.atb.ywp.tmg || this.atb.lo.get()) {
            return;
        }
        this.atb.lo.set(true);
        if (this.atb.gdh && lo.gbb(this.atb.sf) && sfVar != null) {
            sfVar.vj();
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.hc.qf qfVar, String str, final com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        if (this.jr == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        final of ofVar = this.atb.sf;
        hashMap.put("click_scence", 2);
        this.qf = mu();
        mu muVar = new mu(this.atb.rnn);
        this.pcc = muVar;
        muVar.pcc(this.atb.tsx);
        mu pcc2 = this.pcc.sf(this.jr).pcc(ofVar).pcc(com.bytedance.sdk.openadsdk.core.ork.sf.gm.pcc(ofVar)).gm(ofVar.esn()).oo(ofVar.hl()).sf(ofVar.tuy() ? 7 : 5).pcc(new com.bytedance.sdk.openadsdk.core.ork.pcc.gm(this.jr)).vj(ofVar.ray()).pcc(this.jr);
        if (tmg()) {
            str = "landingpage_endcard";
        }
        pcc2.sf(str).pcc(hashMap).pcc(this.qf).pcc(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.vj
            public void pcc() {
                if (lu.this.lq != null) {
                    lu.this.lq.gm();
                }
                com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar2 = sfVar;
                if (sfVar2 != null) {
                    sfVar2.qcw();
                }
            }
        }).pcc(new mu.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.7
            @Override // com.bytedance.sdk.openadsdk.core.mu.pcc
            public void pcc() {
                lu.this.pq();
            }
        });
        this.pcc.pcc(new com.bytedance.sdk.openadsdk.core.ork.pcc.oo(this.jr));
        this.pcc.pcc(this.atb.mu.ork()).pcc(this.atb.of.gm()).pcc(new com.bytedance.sdk.openadsdk.hc.gm() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.9
            @Override // com.bytedance.sdk.openadsdk.hc.gm
            public void pcc(boolean z, int i, String str2) {
                if (z) {
                    lu.this.vy = true;
                    if (lu.this.gd) {
                        lu.this.gd = false;
                        lu luVar = lu.this;
                        luVar.pcc(luVar.atb.xb, true);
                    }
                }
                if (of.oo(ofVar)) {
                    lu.this.pcc(z, i, str2);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.hc.gm
            public void pcc() {
                lu.this.rnn = true;
                lu.this.atb.mu.ork().performClick();
            }
        });
        this.pcc.wh(this.mu);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pq() {
        this.pq = true;
        this.qcw = false;
        this.atb.rj.removeMessages(600);
        this.atb.rj.removeMessages(700);
        this.atb.rj.removeMessages(DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
        this.atb.zti.oo(false);
        this.atb.dax.set(true);
        this.atb.ew.hc();
        of ofVar = this.atb.sf;
        ofVar.qap();
        if (ofVar.qap() || !kun.kj(atb.pcc(ofVar))) {
            return;
        }
        View ork = this.atb.mu.ork();
        View.OnClickListener onClickListener = (View.OnClickListener) ork.getTag(ork.getId());
        if (onClickListener != null) {
            pcc pccVar = new pcc(this.atb, ork, onClickListener);
            ork.setOnClickListener(pccVar);
            ork.setOnTouchListener(pccVar);
        }
    }

    public boolean gm() {
        return this.rnn;
    }

    public boolean oo() {
        return this.nn;
    }

    public void pcc(int i, int i2) {
        if (this.pcc == null || this.atb.rnn.isFinishing()) {
            return;
        }
        this.pcc.pcc(i, i2);
    }

    public void pcc(boolean z) {
        this.sf = z;
    }

    public void vj() {
        if (atb.vj(this.atb.sf) && this.atb.rt) {
            return;
        }
        wh();
    }

    public void wh() {
        of ofVar = this.atb.sf;
        if (TextUtils.isEmpty(of.pcc(this.atb.kun, ofVar))) {
            if (ofVar != null && !ofVar.mu() && this.ri == null && tmg()) {
                this.xb = ofVar.cz();
                this.ri = com.bytedance.sdk.openadsdk.qf.sf.pcc().sf();
                int pcc2 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(this.ri, this.xb);
                this.lrr = pcc2;
                this.iv = pcc2 > 0 ? 2 : 0;
                if (!TextUtils.isEmpty(this.xb)) {
                    com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
                    if (hcVar != null) {
                        hcVar.pcc(this.iv);
                    }
                    gm.pcc.pcc(this.zsj, ofVar, "landingpage_endcard", this.ri, this.xb);
                }
            }
            if ((!TextUtils.isEmpty(this.gm) && this.gm.contains("play.google.com/store")) || ((ofVar != null && !ofVar.xb() && lo.vy(ofVar)) || lo.kj(ofVar))) {
                this.kj = true;
                return;
            }
            Log.d("TTAD.RFWVM", "preLoadEndCardForce: return mShouldPreloadEndCard " + this.sf + ",webViewIsLoading " + this.hoh);
            if (this.sf) {
                boolean z = this.atb.ei;
                if (this.jr != null && ((z || !TextUtils.isEmpty(this.gm)) && of.sf(ofVar))) {
                    if (this.hoh) {
                        return;
                    }
                    String str = this.gm + "&is_pre_render=1";
                    com.bytedance.sdk.openadsdk.oo.hc hcVar2 = this.oo;
                    if (hcVar2 != null) {
                        hcVar2.oo();
                    }
                    com.bytedance.sdk.openadsdk.utils.of.pcc(this.jr, str);
                    this.hoh = true;
                    return;
                }
                if (of.gm(ofVar)) {
                    this.atb.lq.gm();
                }
            }
        }
    }

    public void qf() {
        this.pcc.pcc("showPlayableEndCardOverlay", (JSONObject) null);
        this.atb.rj.sendEmptyMessageDelayed(600, 1000L);
        this.atb.rj.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.10
            @Override // java.lang.Runnable
            public void run() {
                lu.this.pq();
            }
        }, 1000L);
    }

    public com.bytedance.sdk.component.vy.qf kj() {
        return this.jr;
    }

    public mu vy() {
        return this.pcc;
    }

    public void ork() {
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez;
        of ofVar = this.atb.sf;
        String kj = ofVar.kj();
        if (!TextUtils.isEmpty(kj) && this.atb.ywp != null && (this.atb.ywp.rnn() || this.atb.ywp.rj().jsj())) {
            this.gm = kj;
        } else if (!atb.vj(ofVar)) {
            this.gm = atb.tmg(ofVar);
        } else if (ofVar != null && (kez = ofVar.kez()) != null) {
            this.gm = kez.tmg();
        }
        String pcc2 = pcc(this.gm, ofVar, this.vh, this.gbb, this.hc);
        this.gm = pcc2;
        if (TextUtils.isEmpty(pcc2)) {
            return;
        }
        this.mu = this.gm.contains("use_second_endcard=1");
    }

    private static String pcc(String str, of ofVar, int i, int i2, int i3) {
        String str2;
        String str3;
        float zx = ofVar.zx();
        if (!TextUtils.isEmpty(str)) {
            if (i == 1) {
                if (str.contains("?")) {
                    str3 = str + U3.j.c;
                } else {
                    str3 = str + "?";
                }
                str = str3 + "orientation=portrait";
            }
            if (str.contains("?")) {
                str2 = str + U3.j.c;
            } else {
                str2 = str + "?";
            }
            str = str2 + "height=" + i2 + "&width=" + i3 + "&aspect_ratio=" + zx;
        }
        return !atb.sf(ofVar) ? com.bytedance.sdk.openadsdk.utils.wh.pcc(str) : str;
    }

    public void vh() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            mk.pcc(qfVar);
        }
        of ofVar = this.atb.sf;
        long j = this.kun;
        if (j > 0) {
            if (this.tsx > 0) {
                this.kun = j + (SystemClock.elapsedRealtime() - this.tsx);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("endcard_overlay_render_type", of.gm(ofVar) ? 7 : 0);
            } catch (Throwable unused) {
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.atb.sf, this.ork, "second_endcard_duration", jSONObject, this.kun);
        }
        this.jr = null;
        if (this.qf != null && !lo.oo(ofVar) && !lo.kj(ofVar) && !of.gm(ofVar)) {
            this.qf.pcc(true);
            this.qf.vh();
        }
        mu muVar = this.pcc;
        if (muVar != null) {
            muVar.tmg();
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.oo(ofVar.fy());
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.ptr;
        if (ooVar != null) {
            ooVar.gm();
        }
        DeviceUtils.AudioInfoReceiver.sf(this);
    }

    public void pcc(int i) {
        if (this.lu || !this.nac.get()) {
            pcc(0, this.atb.tsx);
        }
        rj.pcc((View) this.jr, i);
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            rj.pcc((View) qfVar.getWebView(), i);
        }
        of ofVar = this.atb.sf;
        if (this.jr == null || !ofVar.fy()) {
            return;
        }
        this.jr.setLandingPage(true);
        this.jr.setTag("landingpage_endcard");
        this.jr.setMaterialMeta(ofVar.lr());
    }

    public void pcc(float f) {
        rj.pcc(this.jr, f);
    }

    public void sf(boolean z) {
        pcc(this.pcc, z);
    }

    public void pcc(mu muVar, boolean z) {
        if (this.pcc == null || this.atb.rnn.isFinishing()) {
            return;
        }
        muVar.sf(z);
    }

    private void pcc(String str, final sf sfVar) {
        com.bytedance.sdk.component.vy.qf qfVar;
        final of ofVar = this.atb.sf;
        com.bytedance.sdk.component.vy.qf qfVar2 = this.jr;
        if (qfVar2 != null && qfVar2.getWebView() != null) {
            com.bytedance.sdk.openadsdk.oo.hc sf2 = new com.bytedance.sdk.openadsdk.oo.hc(ofVar, this.jr.getWebView(), new com.bytedance.sdk.openadsdk.oo.tmg() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.11
                @Override // com.bytedance.sdk.openadsdk.oo.tmg
                public void pcc(int i) {
                    if (TextUtils.isEmpty(lu.this.xb)) {
                        return;
                    }
                    gm.pcc.pcc(lu.this.lrr, lu.this.rj, lu.this.fmh, lu.this.hpk - lu.this.fmh, ofVar, "landingpage_endcard", i);
                }
            }, this.iv).sf(true);
            this.oo = sf2;
            this.erj = sf2.pcc;
            this.oo.pcc(tmg() ? "landingpage_endcard" : str);
            this.oo.sf(this.ork);
            this.oo.gm(true);
            this.jr.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.12
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (lu.this.oo != null) {
                        lu.this.oo.sf(i2);
                    }
                }
            });
            if (this.atb.of != null) {
                this.oo.pcc(this.atb.of.pcc());
            }
            com.bytedance.sdk.openadsdk.common.vj pcc2 = kun.pcc(ofVar, this.jr, this.atb.rnn, this.ork);
            this.se = pcc2;
            if (pcc2 != null) {
                if (tmg()) {
                    str = "landingpage_endcard";
                }
                pcc2.pcc(str);
            }
            if (tmg()) {
                kun.pcc(ofVar, this.jr);
            }
            this.ptr = new com.bytedance.sdk.openadsdk.gbb.oo(this.oo);
            com.bytedance.sdk.openadsdk.core.widget.pcc.wh whVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.wh(com.bytedance.sdk.openadsdk.core.lu.pcc(), this.pcc, ofVar.esn(), this.se, this.oo, ofVar.fy()) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str2) {
                    try {
                        if (TextUtils.isEmpty(lu.this.xb)) {
                            return super.shouldInterceptRequest(webView, str2);
                        }
                        lu.vh(lu.this);
                        WebResourceResponseModel pcc3 = com.bytedance.sdk.openadsdk.qf.sf.pcc().pcc(lu.this.ri, lu.this.xb, str2);
                        if (pcc3 != null && pcc3.getWebResourceResponse() != null) {
                            lu.hc(lu.this);
                            return pcc3.getWebResourceResponse();
                        }
                        if (pcc3 != null && pcc3.getMsg() == 2) {
                            lu.gbb(lu.this);
                        }
                        return super.shouldInterceptRequest(webView, str2);
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.lo.pcc("TTAD.RFWVM", "shouldInterceptRequest url error", th);
                        return super.shouldInterceptRequest(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.lo.pcc("TTAD.RFWVM", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, int i, String str2, String str3) {
                    super.onReceivedError(webView, i, str2, str3);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    if (webResourceError != null && webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedError WebResourceError : description=" + ((Object) webResourceError.getDescription()) + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !lu.this.pcc(webResourceRequest.getUrl().toString())) {
                        if (webResourceError != null && webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                            com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                            webResourceError.getErrorCode();
                            String.valueOf(webResourceError.getDescription());
                            String.valueOf(webResourceRequest.getUrl());
                        }
                        if (webResourceRequest == null || webResourceRequest.isForMainFrame()) {
                            lu.this.nac.set(false);
                            lu.this.hoh = false;
                            lu.this.pcc(webResourceError != null ? webResourceError.getErrorCode() : -1, lu.this.atb.tsx);
                        }
                        if (lu.this.qf != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (webResourceError != null) {
                                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                lu.this.qf.pcc(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        if (webResourceError != null) {
                            lu.this.vj = webResourceError.getErrorCode();
                            lu.this.wh = String.valueOf(webResourceError.getDescription());
                        }
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
                    super.onReceivedSslError(webView, sslErrorHandler, sslError);
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                    webResourceRequest.isForMainFrame();
                    webResourceRequest.getUrl();
                    webResourceResponse.getStatusCode();
                    if (webResourceRequest != null && webResourceRequest.getUrl() != null) {
                        Log.i("TTAD.RFWVM", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
                        lu.this.nac.set(false);
                        lu.this.hoh = false;
                        if (webResourceResponse != null) {
                            lu.this.vj = webResourceResponse.getStatusCode();
                            lu.this.wh = "onReceivedHttpError";
                        }
                        lu luVar = lu.this;
                        luVar.pcc(luVar.vj, lu.this.atb.tsx);
                    }
                    if (lu.this.qf != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (webResourceResponse != null) {
                                jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            }
                            lu.this.qf.pcc(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageFinished(WebView webView, String str2) {
                    super.onPageFinished(webView, str2);
                    lu.this.hoh = false;
                    lu.this.lu = true;
                    lu luVar = lu.this;
                    luVar.pcc(100, luVar.atb.tsx);
                    if (lu.this.atb.ye.lo()) {
                        View ork = lu.this.atb.mu.ork();
                        if (ork instanceof com.bytedance.sdk.openadsdk.core.wh.oo) {
                            ((com.bytedance.sdk.openadsdk.core.wh.oo) ork).setImageResource(tz.oo(lu.this.atb.kun, "tt_skip_btn"));
                        }
                    }
                    DeviceUtils.AudioInfoReceiver.pcc(lu.this);
                    lu.this.vr = DeviceUtils.qf();
                    if (lu.this.qf != null) {
                        lu.this.qf.vj();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.pcc.sf unused = lu.this.atb;
                    sf sfVar2 = sfVar;
                    if (sfVar2 != null) {
                        sfVar2.pcc(webView, str2);
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.wh, android.webkit.WebViewClient
                public void onPageStarted(WebView webView, String str2, Bitmap bitmap) {
                    super.onPageStarted(webView, str2, bitmap);
                    if (lu.this.qf != null) {
                        lu.this.qf.oo();
                    }
                }
            };
            this.lq = whVar;
            this.jr.setWebViewClient(whVar);
            this.lq.pcc(ofVar);
            this.lq.pcc(this.tmg ? "rewarded_video" : "fullscreen_interstitial_ad");
            if (ofVar.fy() && (qfVar = this.jr) != null && qfVar.getWebView() != null) {
                this.jr.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.3
                    private final int gm = com.bytedance.sdk.openadsdk.core.lu.sf();

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        int i;
                        if (lu.this.oo != null) {
                            lu.this.oo.pcc(motionEvent);
                        }
                        if (lu.this.se != null) {
                            lu.this.se.pcc(motionEvent);
                        }
                        if (lu.this.ptr != null) {
                            lu.this.ptr.pcc();
                        }
                        try {
                            int actionMasked = motionEvent.getActionMasked();
                            if (actionMasked != 0) {
                                int i2 = 3;
                                if (actionMasked != 1) {
                                    if (actionMasked != 2) {
                                        i2 = actionMasked != 3 ? -1 : 4;
                                    } else {
                                        float rawX = motionEvent.getRawX();
                                        float rawY = motionEvent.getRawY();
                                        if (Math.abs(rawX - lu.this.tz) >= this.gm || Math.abs(rawY - lu.this.of) >= this.gm) {
                                            lu.this.jsj = false;
                                        }
                                        lu.this.tsz += Math.abs(motionEvent.getX() - lu.this.tz);
                                        lu.this.mk += Math.abs(motionEvent.getY() - lu.this.of);
                                        i = (System.currentTimeMillis() - lu.this.yt <= 200 || (lu.this.tsz <= 8.0f && lu.this.mk <= 8.0f)) ? 2 : 1;
                                    }
                                }
                                i = i2;
                            } else {
                                lu.this.jsj = true;
                                lu.this.qy = new SparseArray();
                                lu.this.tz = motionEvent.getRawX();
                                lu.this.of = motionEvent.getRawY();
                                lu.this.yt = System.currentTimeMillis();
                                try {
                                    long landingPageClickBegin = lu.this.jr.getLandingPageClickBegin();
                                    if (landingPageClickBegin > 0 && landingPageClickBegin < lu.this.yt) {
                                        lu.this.yt = landingPageClickBegin;
                                        lu.this.jr.setLandingPageClickBegin(-1L);
                                    }
                                } catch (Exception unused) {
                                }
                                lu.this.tsz = -1.0f;
                                lu.this.mk = -1.0f;
                                i = 0;
                            }
                            lu.this.qy.put(motionEvent.getActionMasked(), new gm.pcc(i, motionEvent.getSize(), motionEvent.getPressure(), System.currentTimeMillis()));
                            if (motionEvent.getAction() == 1 && lo.qf(lu.this.atb.sf) && lu.this.atb.tsx != null) {
                                lu.this.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.3.1
                                    @Override // java.lang.Runnable
                                    public void run() {
                                        lu.this.atb.tsx.hoh();
                                    }
                                });
                            }
                            if (motionEvent.getAction() != 1 || view.getVisibility() != 0 || Float.valueOf(view.getAlpha()).intValue() != 1) {
                                return false;
                            }
                            if ((lu.this.dax && !lo.vh(ofVar)) || !lu.this.jsj) {
                                return false;
                            }
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("down_x", lu.this.tz);
                            jSONObject.put("down_y", lu.this.of);
                            jSONObject.put("down_time", lu.this.yt);
                            jSONObject.put("up_x", motionEvent.getRawX());
                            jSONObject.put("up_y", motionEvent.getRawY());
                            long currentTimeMillis = System.currentTimeMillis();
                            try {
                                long landingPageClickEnd = lu.this.jr.getLandingPageClickEnd();
                                if (landingPageClickEnd > 0 && landingPageClickEnd < currentTimeMillis) {
                                    try {
                                        lu.this.jr.setLandingPageClickEnd(-1L);
                                    } catch (Exception unused2) {
                                    }
                                    currentTimeMillis = landingPageClickEnd;
                                }
                            } catch (Exception unused3) {
                            }
                            jSONObject.put("up_time", currentTimeMillis);
                            int[] iArr = new int[2];
                            lu luVar = lu.this;
                            luVar.fum = luVar.atb.nn.findViewById(520093713);
                            if (lu.this.fum != null) {
                                lu.this.fum.getLocationOnScreen(iArr);
                                jSONObject.put("button_x", iArr[0]);
                                jSONObject.put("button_y", iArr[1]);
                                jSONObject.put("button_width", lu.this.fum.getWidth());
                                jSONObject.put("button_height", lu.this.fum.getHeight());
                            }
                            if (lu.this.lo != null) {
                                int[] iArr2 = new int[2];
                                lu.this.lo.getLocationOnScreen(iArr2);
                                jSONObject.put("ad_x", iArr2[0]);
                                jSONObject.put("ad_y", iArr2[1]);
                                jSONObject.put("width", lu.this.lo.getWidth());
                                jSONObject.put("height", lu.this.lo.getHeight());
                            }
                            jSONObject.put("toolType", motionEvent.getToolType(0));
                            jSONObject.put("deviceId", motionEvent.getDeviceId());
                            jSONObject.put("source", motionEvent.getSource());
                            jSONObject.put("ft", com.bytedance.sdk.openadsdk.core.model.tmg.pcc(lu.this.qy, com.bytedance.sdk.openadsdk.core.ork.sf().pcc() ? 1 : 2));
                            jSONObject.put("user_behavior_type", lu.this.jsj ? 1 : 2);
                            jSONObject.put("click_scence", 2);
                            if (lu.this.lq != null) {
                                lu.this.lq.pcc(jSONObject);
                            }
                            if (!lu.this.dax && !lo.ork(ofVar)) {
                                if (lu.this.tmg) {
                                    com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, "rewarded_video", "click", jSONObject);
                                } else {
                                    com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, "fullscreen_interstitial_ad", "click", jSONObject);
                                }
                                lu.this.dax = true;
                                return false;
                            }
                            return false;
                        } catch (Throwable th) {
                            Log.e("TTAD.RFWVM", "TouchRecordTool onTouch error", th);
                            return false;
                        }
                    }
                });
            }
            com.bytedance.sdk.component.vy.qf qfVar3 = this.jr;
            if (qfVar3 != null) {
                qfVar3.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.pcc.vj(this.pcc, this.oo, this.se) { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.lu.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.pcc.vj, android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView, int i) {
                        super.onProgressChanged(webView, i);
                    }
                });
            }
            pcc(this.jr);
            this.jr.setLayerType(1, null);
            this.jr.setBackgroundColor(-1);
            this.jr.setDisplayZoomControls(false);
        }
        com.bytedance.sdk.openadsdk.gbb.oo ooVar = this.ptr;
        if (ooVar != null) {
            this.lq.pcc(ooVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return this.atb.sf.fy() && str.endsWith(".mp4");
    }

    public boolean tmg() {
        String str = this.gm;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void pcc(DownloadListener downloadListener) {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar == null || downloadListener == null) {
            return;
        }
        qfVar.setDownloadListener(downloadListener);
    }

    public boolean hc() {
        return this.nac.get();
    }

    public boolean gbb() {
        return this.lu;
    }

    public void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        if (qfVar == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.oo.pcc(this.atb.rnn).pcc(false).sf(false).pcc(qfVar.getWebView());
        qfVar.setUserAgentString(com.bytedance.sdk.openadsdk.utils.lo.pcc(qfVar.getWebView(), BuildConfig.VERSION_CODE));
        qfVar.setMixedContentMode(0);
    }

    public void jr() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.kj();
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.kj();
        }
    }

    public void dax() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            qfVar.gbb();
        }
        if (this.tsx > 0) {
            this.kun += SystemClock.elapsedRealtime() - this.tsx;
            this.tsx = 0L;
        }
        mu muVar = this.pcc;
        if (muVar != null) {
            muVar.sf(false);
            sf(this.pcc, false);
            pcc(this.pcc, true, false);
        }
    }

    public void gm(boolean z) {
        sf(this.pcc, z);
    }

    public void sf(mu muVar, boolean z) {
        try {
            muVar.kj(z);
        } catch (Exception unused) {
        }
    }

    public void pcc(boolean z, boolean z2) {
        pcc(this.pcc, z, z2);
    }

    public void pcc(mu muVar, boolean z, boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z);
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, z2);
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.atb.ywp;
            String str = "end";
            if (kjVar != null) {
                jSONObject.put("multi_ads_show", kjVar.rj().ork());
                if (!kjVar.nac) {
                    str = "mid";
                }
                jSONObject.put("endcard_type", str);
            } else {
                jSONObject.put("endcard_type", "end");
            }
            muVar.pcc("endcard_control_event", jSONObject);
            if (z2) {
                if (this.lu) {
                    return;
                }
                this.gd = true;
                return;
            }
            this.gd = false;
        } catch (Exception unused) {
        }
    }

    public void oo(boolean z) {
        if (atb.sf(this.atb.sf)) {
            return;
        }
        vj(z);
    }

    public void vj(boolean z) {
        if (this.pcc == null || this.atb.rnn.isFinishing()) {
            return;
        }
        this.pcc.qf(z);
    }

    public void nac() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        if (qfVar != null) {
            qfVar.tmg();
        }
        if (this.tsx == 0) {
            this.tsx = SystemClock.elapsedRealtime();
        }
        of ofVar = this.atb.sf;
        mu muVar = this.pcc;
        if (muVar != null) {
            muVar.vh();
            com.bytedance.sdk.component.vy.qf qfVar2 = this.jr;
            if (qfVar2 != null) {
                if (qfVar2.getVisibility() == 0) {
                    this.pcc.sf(true);
                    sf(this.pcc, true);
                    pcc(this.pcc, false, true);
                    if (atb.kj(ofVar) && !this.pq && this.atb.sf.qap()) {
                        qf();
                    }
                } else {
                    this.pcc.sf(false);
                    sf(this.pcc, false);
                    pcc(this.pcc, true, false);
                }
            }
        }
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.qf();
        }
    }

    public int lu() {
        return this.vj;
    }

    public String gpj() {
        return this.wh;
    }

    public boolean lo() {
        return of.gm(this.atb.sf) ? this.mu && !this.nn && this.atb.lq.tmg() : this.mu && !this.nn && this.nac.get() && this.lu;
    }

    public void fum() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.qf();
        }
    }

    public void pcc(boolean z, int i, String str) {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar == null) {
            return;
        }
        if (z) {
            vjVar.sf();
        } else {
            vjVar.pcc(i, str);
        }
    }

    public void tz() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.wh();
        }
    }

    public void of() {
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.pcc(System.currentTimeMillis());
        }
    }

    public boolean yt() {
        return this.kj;
    }

    public void sf(int i) {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc(i);
            this.qf.gm();
        }
    }

    public void qy() {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.vy();
        }
    }

    private com.bytedance.sdk.openadsdk.oo.oo.vj mu() {
        return new com.bytedance.sdk.openadsdk.oo.gpj(2, this.tmg ? "rewarded_video" : "fullscreen_interstitial_ad", this.atb.sf);
    }

    public boolean jsj() {
        mu muVar = this.pcc;
        if (muVar == null) {
            return false;
        }
        return muVar.vy();
    }

    @Override // com.bytedance.sdk.openadsdk.hc.vy
    public void gm(int i) {
        int i2 = this.vr;
        if (i2 <= 0 && i > 0) {
            oo(false);
        } else if (i2 > 0 && i == 0) {
            oo(true);
        }
        this.vr = i;
    }

    public void wh(boolean z) {
        if (this.atb.gh != null) {
            this.atb.gh.pcc(this.atb, 5000L);
        }
        this.nn = true;
        JSONObject jSONObject = new JSONObject();
        of ofVar = this.atb.sf;
        try {
            jSONObject.put("endcard_overlay_render_type", of.gm(ofVar) ? 7 : 0);
        } catch (Throwable unused) {
        }
        com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.ork, "use_second_endcard", jSONObject);
        this.tsx = SystemClock.elapsedRealtime();
        try {
            if (!of.gm(ofVar)) {
                this.pcc.pcc("click_endcard_close", (JSONObject) null);
            } else if (z) {
                this.atb.lq.kj();
                com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.ork, "endcard_close_skip", jSONObject);
            }
        } catch (Exception unused2) {
        }
    }

    public boolean tsz() {
        this.nac.get();
        return this.lu && this.nac.get();
    }

    public boolean mk() {
        return this.qcw;
    }

    public boolean atb() {
        com.bytedance.sdk.component.vy.qf qfVar = this.jr;
        return qfVar == null || qfVar.getWebView() == null;
    }

    public void ye() {
        com.bytedance.sdk.openadsdk.oo.hc hcVar = this.oo;
        if (hcVar != null) {
            hcVar.vj();
        }
    }

    private static class pcc extends com.bytedance.sdk.openadsdk.core.gm.pcc implements sf.pcc {
        private final View.OnClickListener gm;
        private final com.bytedance.sdk.openadsdk.component.reward.pcc.sf pcc;
        private final View sf;

        public pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, View view, View.OnClickListener onClickListener) {
            super(sfVar.rnn, sfVar.sf, sfVar.vj, sfVar.oo ? 7 : 5);
            this.pcc = sfVar;
            this.sf = view;
            this.gm = onClickListener;
            HashMap hashMap = new HashMap();
            hashMap.put("close_auto_click", Boolean.TRUE);
            hashMap.put("click_scence", 2);
            pcc(hashMap);
            pcc(sfVar.tz.gm());
            pcc(this);
        }

        @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
        public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
            if (this.pcc.sf.qap()) {
                this.gm.onClick(view);
                this.sf.setOnTouchListener(null);
                this.sf.setOnClickListener(this.gm);
            } else {
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
                this.pcc.tsx.pq();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
        public void pcc(View view, int i) {
            this.sf.setOnTouchListener(null);
            this.sf.setOnClickListener(this.gm);
        }
    }

    public boolean lq() {
        return this.pq;
    }

    public void qf(boolean z) {
        this.qcw = z;
    }

    public boolean zti() {
        return this.vy;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.zti < 100) {
            return false;
        }
        this.zti = currentTimeMillis;
        if (runnable == null) {
            return true;
        }
        runnable.run();
        return true;
    }
}
