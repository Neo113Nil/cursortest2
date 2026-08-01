package com.bytedance.sdk.openadsdk.oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.webkit.JavascriptInterface;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.pcc.qf;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class hc {
    private static final int[] gm = {10, 30, 50, 75, 100};
    private long atb;
    private boolean bg;
    private com.bytedance.sdk.openadsdk.core.widget.pcc.qf dax;
    private volatile long erj;
    private int fmh;
    private int fum;
    private String gbb;
    private volatile long gd;
    private vy gpj;
    private String hc;
    private long hoh;
    private volatile int hpk;
    private final AtomicInteger iv;
    private final Context jr;
    private String jsj;
    private final AtomicBoolean kj;
    private boolean kun;
    private boolean lo;
    private long lq;
    private volatile long lrr;
    private com.bytedance.sdk.openadsdk.tz.kj lu;
    private long mk;
    private final int[] mu;
    private boolean nac;
    private WeakReference<WebView> nn;
    private long of;
    private int oo;
    private final AtomicBoolean ork;
    public qf.pcc pcc;
    private final boolean pq;
    private String ptr;
    private final AtomicBoolean qcw;
    private final AtomicBoolean qf;
    private final of qy;
    private final AtomicBoolean ri;
    private tmg rj;
    private boolean rnn;
    private final AtomicBoolean se;
    AtomicBoolean sf;
    private boolean tmg;
    private com.bytedance.sdk.openadsdk.oo.oo.vj tsx;
    private long tsz;
    private long tz;
    private int vh;
    private long vj;
    private String vr;
    private final AtomicBoolean vy;
    private int wh;
    private final AtomicInteger xb;
    private long ye;
    private int yt;
    private volatile long zsj;
    private boolean zti;

    public of pcc() {
        return this.qy;
    }

    public hc(of ofVar, WebView webView, tmg tmgVar, int i) {
        this(ofVar, webView);
        this.rj = tmgVar;
        this.fmh = i;
    }

    public hc(of ofVar, WebView webView) {
        this(ofVar, webView, false);
    }

    public hc(of ofVar, WebView webView, boolean z) {
        this.oo = 0;
        this.vj = -1L;
        this.wh = 1;
        this.qf = new AtomicBoolean(false);
        this.kj = new AtomicBoolean(false);
        this.vy = new AtomicBoolean(false);
        this.ork = new AtomicBoolean(false);
        this.vh = -1;
        this.lo = false;
        this.fum = 0;
        this.sf = new AtomicBoolean(false);
        this.jsj = "landingpage";
        this.tsz = 0L;
        this.mk = 0L;
        this.atb = 0L;
        this.ye = 0L;
        this.lq = 0L;
        this.zti = false;
        this.pq = false;
        int[] iArr = {0};
        this.mu = iArr;
        this.rnn = false;
        this.kun = false;
        this.lrr = 0L;
        this.iv = new AtomicInteger(0);
        this.xb = new AtomicInteger(0);
        this.ri = new AtomicBoolean(false);
        this.hpk = 0;
        this.fmh = -1;
        this.se = new AtomicBoolean(false);
        this.qcw = new AtomicBoolean(false);
        this.bg = false;
        Context pcc2 = com.bytedance.sdk.openadsdk.core.lu.pcc();
        this.jr = pcc2;
        this.qy = ofVar;
        if (webView == null) {
            return;
        }
        this.lo = z;
        WeakReference<WebView> weakReference = new WeakReference<>(webView);
        this.nn = weakReference;
        WebView webView2 = weakReference.get();
        if (webView2 == null) {
            return;
        }
        if (ofVar != null && ofVar.gr()) {
            com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = new com.bytedance.sdk.openadsdk.core.widget.pcc.qf(webView2, ofVar, pcc2, this.lo);
            this.dax = qfVar;
            this.pcc = qfVar.gm();
        }
        if (ofVar != null && ofVar.zpi() && com.bytedance.sdk.openadsdk.core.settings.vh.sf().of()) {
            this.gpj = new vy(ofVar, webView, this.lo);
        }
        if (webView instanceof com.bytedance.sdk.component.vy.wh) {
            this.hoh = ((com.bytedance.sdk.component.vy.wh) webView2).pcc;
        } else {
            this.hoh = System.currentTimeMillis();
        }
        try {
            webView2.addJavascriptInterface(new pcc(iArr), "JS_LANDING_PAGE_LOG_OBJ");
        } catch (Exception e) {
            lo.pcc("LandingPageLog", "addJavascriptInterface exception", e);
        }
        if (ofVar != null && ofVar.zvx() != null) {
            this.vj = ofVar.zvx().optLong("page_id", -1L);
        }
        this.vr = String.valueOf(SystemClock.elapsedRealtime());
    }

    public void pcc(boolean z) {
        if (z) {
            this.fum = 1;
        }
    }

    public void pcc(tmg tmgVar) {
        this.rj = tmgVar;
    }

    public void pcc(long j) {
        this.mk = j;
    }

    public void pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = this.dax;
        if (qfVar != null) {
            qfVar.pcc(str);
        }
        vy vyVar = this.gpj;
        if (vyVar != null) {
            vyVar.gm(str);
        }
        this.jsj = str;
    }

    public void pcc(int i) {
        this.fmh = i;
    }

    public com.bytedance.sdk.openadsdk.oo.oo.vj sf() {
        return this.tsx;
    }

    public void pcc(com.bytedance.sdk.openadsdk.oo.oo.vj vjVar) {
        this.tsx = vjVar;
    }

    public hc sf(boolean z) {
        this.rnn = z;
        return this;
    }

    public boolean gm() {
        return this.kun;
    }

    public void sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.ptr = str;
    }

    public void pcc(com.bytedance.sdk.openadsdk.tz.kj kjVar) {
        this.lu = kjVar;
    }

    public void gm(boolean z) {
        this.kun = z;
    }

    public void oo() {
        if (vy()) {
            this.zsj = SystemClock.elapsedRealtime();
            gm.pcc(this.qy, this.ptr);
        }
    }

    public void vj() {
        if (vy()) {
            this.gd = SystemClock.elapsedRealtime();
            wh();
        }
    }

    public void wh() {
        if (vy() && this.gd > 0 && this.erj > 0 && !this.se.getAndSet(true)) {
            gm.sf(this.erj - this.gd, this.qy, this.ptr, (String) null);
        }
    }

    public void pcc(WebView webView, int i) {
        if (webView == null) {
            return;
        }
        if (this.lrr == 0) {
            this.lrr = SystemClock.elapsedRealtime();
        }
        if (this.atb == 0 && i > 0) {
            this.atb = System.currentTimeMillis();
        } else if (this.ye == 0 && i == 100) {
            this.ye = System.currentTimeMillis();
        }
        if (this.oo != gm.length && ("landingpage".equals(this.jsj) || "landingpage_endcard".equals(this.jsj) || "landingpage_split_screen".equals(this.jsj) || "landingpage_direct".equals(this.jsj) || "aggregate_page".equals(this.jsj))) {
            int i2 = this.oo;
            while (true) {
                int[] iArr = gm;
                if (i2 >= iArr.length || i < iArr[this.oo]) {
                    break;
                }
                int i3 = i2 + 1;
                this.oo = i3;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", webView.getUrl());
                    long j = this.vj;
                    if (j != -1) {
                        jSONObject.put("page_id", j);
                    }
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("pct", iArr[i2]);
                } catch (Exception unused) {
                }
                pcc("progress_load_finish", jSONObject);
                i2 = i3;
            }
        }
        if (i == 100) {
            pcc(false, SystemClock.elapsedRealtime());
            sf(webView.getUrl(), NotificationCompat.CATEGORY_PROGRESS, Math.min(this.ye - this.atb, 600000L));
        }
    }

    private void sf(String str, String str2, long j) {
        if (this.vy.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                if (str.length() > 200) {
                    int indexOf = str.indexOf(38, 200);
                    int i = 300;
                    if (indexOf == -1 || indexOf > 300) {
                        indexOf = str.indexOf(63);
                    }
                    if (indexOf != -1 && indexOf <= 300) {
                        i = indexOf;
                    }
                    str = str.substring(0, i);
                }
                jSONObject.put("url", str);
                jSONObject.put("type", str2);
            } catch (Throwable unused) {
            }
            pcc("load_finish_progress", jSONObject, j);
        }
    }

    public void pcc(WebView webView, String str, Bitmap bitmap, boolean z, int i) {
        this.nac = z;
        this.yt++;
        com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = this.dax;
        if (qfVar != null && z) {
            qfVar.sf(str);
            this.dax.sf();
        }
        vy vyVar = this.gpj;
        if (vyVar != null && z) {
            vyVar.pcc(str, i);
        }
        WeakReference<WebView> weakReference = this.nn;
        WebView webView2 = weakReference != null ? weakReference.get() : null;
        if (webView2 != null) {
            try {
                WebBackForwardList copyBackForwardList = webView2.copyBackForwardList();
                if (copyBackForwardList != null && copyBackForwardList.getCurrentIndex() > this.hpk) {
                    this.iv.incrementAndGet();
                }
                this.hpk = copyBackForwardList.getCurrentIndex();
            } catch (Exception e) {
                lo.pcc("LandingPageLog", "copyBackForwardList exception", e);
            }
        }
        if (this.lrr == 0) {
            this.lrr = SystemClock.elapsedRealtime();
        }
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.tsx;
        if (vjVar != null) {
            vjVar.oo();
        }
        if (this.qf.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
                int i2 = this.fmh;
                if (i2 >= 0) {
                    jSONObject.putOpt("preload_status", Integer.valueOf(i2));
                }
            } catch (Exception unused) {
            }
            pcc("load_start", jSONObject);
        }
    }

    public void pcc(WebView webView, String str, boolean z) {
        pcc(false, SystemClock.elapsedRealtime());
        com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = this.dax;
        if (qfVar != null && z) {
            qfVar.pcc();
        }
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.tsx;
        if (vjVar != null) {
            vjVar.vj();
        }
        vy vyVar = this.gpj;
        if (vyVar != null && z) {
            vyVar.pcc(str);
        }
        if (webView != null && !this.zti && this.rnn) {
            this.zti = true;
            com.bytedance.sdk.component.utils.gbb.pcc(webView, "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});");
        }
        if (this.kj.compareAndSet(false, true)) {
            if (this.wh != 3) {
                this.wh = 2;
            }
            this.tsz = System.currentTimeMillis();
            boolean z2 = this.wh == 2;
            int ork = ork();
            if (z2) {
                long j = this.ye - this.atb;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", this.vh);
                    jSONObject.put("error_msg", this.hc);
                    jSONObject.put("error_url", this.gbb);
                    int i = this.fmh;
                    if (i >= 0) {
                        jSONObject.put("preload_status", i);
                    }
                    jSONObject.put("first_page", ork);
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.put("url", this.qy.xy());
                    jSONObject.put("preload_h5_type", this.qy.tsx());
                } catch (Exception unused) {
                }
                pcc(z, "0");
                long min = Math.min(j, 600000L);
                pcc("load_finish", jSONObject, min);
                if (vy()) {
                    this.erj = SystemClock.elapsedRealtime();
                    wh();
                    gm.pcc(this.qy, this.ptr, this.erj - this.zsj);
                }
                sf(str, "load_finish", min);
                tmg tmgVar = this.rj;
                if (tmgVar != null) {
                    tmgVar.pcc(ork);
                    return;
                }
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("error_code", this.vh);
                jSONObject2.put("error_msg", this.hc);
                jSONObject2.put("error_url", this.gbb);
                jSONObject2.put("first_page", ork);
                int i2 = this.fmh;
                if (i2 >= 0) {
                    jSONObject2.put("preload_status", i2);
                }
                jSONObject2.putOpt("render_type", "h5");
                jSONObject2.putOpt("render_type_2", 0);
                jSONObject2.put("url", this.qy.xy());
                jSONObject2.put("preload_h5_type", this.qy.tsx());
            } catch (Exception unused2) {
            }
            pcc(z, "2");
            pcc("load_fail", jSONObject2);
            if (vy()) {
                gm.pcc(this.qy, this.ptr, SystemClock.elapsedRealtime() - this.zsj, this.vh, this.hc, this.gbb);
            }
            if (this.tmg) {
                jSONObject2.remove("render_type");
                jSONObject2.remove("render_type_2");
                pcc("load_fail_main", jSONObject2);
            }
        }
    }

    private boolean vy() {
        of ofVar;
        return this.kun && (ofVar = this.qy) != null && ofVar.mu();
    }

    private String vj(String str) {
        return "javascript:".concat(String.valueOf(str));
    }

    public void pcc(WebView webView, int i, String str, String str2, String str3, boolean z) {
        com.bytedance.sdk.openadsdk.oo.oo.vj vjVar = this.tsx;
        if (vjVar != null) {
            vjVar.pcc((JSONObject) null);
        }
        if ((str3 == null || !str3.startsWith("image")) && this.wh != 2) {
            this.wh = 3;
        }
        this.vh = i;
        this.hc = str;
        this.gbb = str2;
        this.tmg = z;
    }

    public void qf() {
        if (this.lq == 0) {
            this.lq = System.currentTimeMillis();
        }
        this.tsz = System.currentTimeMillis();
        if ("landingpage".equals(this.jsj) || "landingpage_endcard".equals(this.jsj) || "landingpage_split_screen".equals(this.jsj) || "landingpage_direct".equals(this.jsj) || "aggregate_page".equals(this.jsj)) {
            if (this.qcw.compareAndSet(false, true)) {
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("landingStart", this.qy, this.vr);
            } else {
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("landingContinue", this.qy, this.vr);
            }
        }
        if (com.bytedance.sdk.openadsdk.core.model.lo.vy(this.qy) || com.bytedance.sdk.openadsdk.core.model.lo.sf(this.qy)) {
            pcc(true, SystemClock.elapsedRealtime());
        }
    }

    public void kj() {
        if (("landingpage".equals(this.jsj) || "landingpage_endcard".equals(this.jsj) || "landingpage_split_screen".equals(this.jsj) || "landingpage_direct".equals(this.jsj) || "aggregate_page".equals(this.jsj) || "landingpage_split_ceiling".equals(this.jsj)) && this.wh == 2) {
            if (this.mk > 0 || !gm()) {
                long currentTimeMillis = System.currentTimeMillis() - Math.max(this.tsz, this.mk);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.wh);
                    jSONObject.put("max_scroll_percent", this.mu[0]);
                    jSONObject.put("jump_times", this.iv.getAndSet(0));
                    jSONObject.put("click_times", this.xb.getAndSet(0));
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                this.ork.set(true);
                pcc("stay_page", jSONObject, Math.min(currentTimeMillis, 600000L));
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("landingPause", this.qy, this.vr);
            }
        }
    }

    public void pcc(com.bytedance.sdk.component.vy.qf qfVar) {
        int gh;
        Bitmap pcc2;
        of ofVar;
        if ((!"landingpage".equals(this.jsj) && !"landingpage_endcard".equals(this.jsj) && !"landingpage_split_screen".equals(this.jsj) && !"landingpage_direct".equals(this.jsj) && !"aggregate_page".equals(this.jsj)) || (gh = com.bytedance.sdk.openadsdk.core.lu.oo().gh()) == 0 || new Random().nextInt(100) + 1 > gh || qfVar == null || qfVar.getWebView() == null || qfVar.getVisibility() != 0 || (pcc2 = rj.pcc(qfVar)) == null || (ofVar = this.qy) == null) {
            return;
        }
        rj.pcc(ofVar, this.jsj, "landing_page_blank", pcc2, qfVar.getUrl(), this.vj);
    }

    public void oo(boolean z) {
        WeakReference<WebView> weakReference = this.nn;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("JS_LANDING_PAGE_LOG_OBJ");
            } catch (Exception e) {
                lo.pcc("LandingPageLog", "removeJavascriptInterface exception", e);
            }
        }
        if (this.kj.compareAndSet(false, true)) {
            pcc(z, "1");
            if (this.rnn) {
                gm.pcc(this.qy, this.jsj, System.currentTimeMillis() - this.lq, this.fmh, ork());
            }
        } else if (this.wh == 2 && !this.ork.get()) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("load_status", this.wh);
                jSONObject.put("max_scroll_percent", this.mu[0]);
                jSONObject.put("jump_times", this.iv.getAndSet(0));
                jSONObject.put("click_times", this.xb.getAndSet(0));
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (JSONException unused) {
            }
            pcc("stay_page", jSONObject, 0L);
        }
        if ("landingpage".equals(this.jsj) || "landingpage_endcard".equals(this.jsj) || "landingpage_split_screen".equals(this.jsj) || "landingpage_direct".equals(this.jsj) || "aggregate_page".equals(this.jsj) || "landingpage_split_ceiling".equals(this.jsj)) {
            com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("landingFinish", this.qy, this.vr);
        }
    }

    public void sf(WebView webView, String str, boolean z) {
        vy vyVar = this.gpj;
        if (vyVar == null || !z) {
            return;
        }
        vyVar.pcc(webView, str);
    }

    private void pcc(String str, JSONObject jSONObject) {
        pcc(str, jSONObject, -1L);
    }

    private void pcc(final String str, final JSONObject jSONObject, final long j) {
        if (!this.rnn || this.qy == null || TextUtils.isEmpty(str)) {
            return;
        }
        com.bytedance.sdk.openadsdk.tz.kj kjVar = this.lu;
        final int rnn = kjVar != null ? kjVar.rnn() : -1;
        gm.pcc(System.currentTimeMillis(), this.qy, this.jsj, str, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.hc.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 > 0) {
                        jSONObject2.put(IronSourceConstants.EVENTS_DURATION, j2);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject gm() {
                if (jSONObject != null) {
                    try {
                        boolean sf = atb.sf(hc.this.qy);
                        int i = 0;
                        jSONObject.put("is_playable", sf ? 1 : 0);
                        jSONObject.put("usecache", com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(hc.this.qy) ? 1 : 0);
                        if (sf && ("load_finish".equals(str) || "load_fail".equals(str))) {
                            jSONObject.put("playable_has_show", rnn);
                        }
                        if ("stay_page".equals(str)) {
                            JSONObject jSONObject2 = jSONObject;
                            if (hc.this.yt <= 1) {
                                i = 1;
                            }
                            jSONObject2.put("first_page", i);
                        }
                    } catch (JSONException unused) {
                    }
                }
                String str2 = str;
                String str3 = hc.this.jsj;
                JSONObject jSONObject3 = jSONObject;
                new Object[]{"sendEvent", str2, str3, jSONObject3};
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    if ("load_start".equals(str) || "load_finish".equals(str) || "progress_load_finish".equals(str)) {
                        jSONObject2.put("is_reused", hc.this.bg ? 1 : 0);
                    }
                    if (com.bytedance.sdk.openadsdk.gbb.gm.gm(hc.this.qy)) {
                        jSONObject2.put("is_lp_pre_render", hc.this.fum);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    private static class pcc {
        private final int[] pcc;

        public pcc(int[] iArr) {
            this.pcc = iArr;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x000f, code lost:
        
            if (r4 < 0) goto L8;
         */
        @JavascriptInterface
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void readPercent(String str) {
            int i;
            try {
                i = Float.valueOf(str).intValue();
                if (i > 100) {
                    i = 100;
                }
            } catch (Throwable unused) {
            }
            int[] iArr = this.pcc;
            if (iArr != null || iArr.length <= 0) {
            }
            iArr[0] = i;
            return;
            i = 0;
            int[] iArr2 = this.pcc;
            if (iArr2 != null) {
            }
        }

        @JavascriptInterface
        public String getUrl() {
            return "";
        }
    }

    public void pcc(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = this.dax;
        if (qfVar != null && this.nac) {
            qfVar.pcc(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.lrr != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.xb.incrementAndGet();
                this.xb.get();
                if (this.ri.getAndSet(true)) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("url", this.qy.xy());
                } catch (JSONException unused) {
                }
                pcc("click_time", jSONObject, Math.max(SystemClock.elapsedRealtime() - this.lrr, 0L));
            }
        }
    }

    public void pcc(String str, boolean z) {
        com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = this.dax;
        if (qfVar != null && z) {
            qfVar.gm(str);
        }
        vy vyVar = this.gpj;
        if (vyVar == null || !z) {
            return;
        }
        vyVar.sf(str);
    }

    public void sf(int i) {
        com.bytedance.sdk.openadsdk.core.widget.pcc.qf qfVar = this.dax;
        if (qfVar == null || !this.nac) {
            return;
        }
        qfVar.pcc(i);
    }

    private void pcc(boolean z, final String str) {
        if (z) {
            final int ork = ork();
            gm.pcc(new com.bytedance.sdk.component.kj.sf.gm("sendPrefLog") { // from class: com.bytedance.sdk.openadsdk.oo.hc.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        com.bytedance.sdk.openadsdk.core.settings.wh zti = com.bytedance.sdk.openadsdk.core.lu.oo().zti();
                        boolean pcc2 = hc.this.pcc(zti, str);
                        if (pcc2) {
                            if (!TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.wh.sf)) {
                                hc.this.pcc(ork, str);
                                return;
                            }
                            if (TextUtils.isEmpty(zti.gm) || !pcc2) {
                                return;
                            }
                            String str2 = zti.gm;
                            com.bytedance.sdk.component.qf.sf.sf gm2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
                            gm2.gm(str2);
                            HashMap hashMap = new HashMap();
                            hashMap.put("content-type", "application/json; charset=utf-8");
                            gm2.oo(hashMap);
                            gm2.pcc(9);
                            gm2.sf("sendPrefLog");
                            gm2.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.hc.2.1
                                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                                }

                                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                                    try {
                                        com.bytedance.sdk.openadsdk.core.settings.wh.sf = sfVar.oo();
                                        hc.this.pcc(ork, str);
                                    } catch (Exception e) {
                                        lo.pcc("LandingPageLog", "TTWebViewClient : onPageFinished", e);
                                    }
                                }
                            });
                        }
                    } catch (Throwable th) {
                        lo.gm(th.getMessage(), new Object[0]);
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, String str) {
        try {
            if (TextUtils.isEmpty(com.bytedance.sdk.openadsdk.core.settings.wh.sf)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder(com.bytedance.sdk.openadsdk.core.settings.wh.sf);
            jSONObject.putOpt("cid", pcc().esn());
            jSONObject.putOpt("ad_id", pcc().esn());
            jSONObject.put("log_extra", pcc().hl());
            kun.pcc(sb, "\"/** adInfo **/\"", jSONObject.toString());
            kun.pcc(sb, "\"/** first_page **/\"", String.valueOf(i));
            kun.pcc(sb, "\"/** ix_to_externalurl **/\"", this.vj != -1 ? "1" : "0");
            kun.pcc(sb, "\"/** preload_status **/\"", this.fmh == 2 ? "2" : "0");
            kun.pcc(sb, "\"/** scene_state **/\"", str);
            kun.pcc(sb, "\"/** web_init_time **/\"", String.valueOf(this.hoh));
            kun.pcc(sb, "\"/** channel_name **/\"", "\"" + pcc().cz() + "\"");
            kun.pcc(sb, "\"/** session_id **/\"", "\"" + UUID.randomUUID().toString() + "\"");
            kun.pcc(sb, "\"/** web_url **/\"", "\"" + pcc().xy() + "\"");
            String sb2 = sb.toString();
            if (TextUtils.isEmpty(sb2)) {
                return;
            }
            final String vj = vj(sb2);
            WeakReference<WebView> weakReference = this.nn;
            final WebView webView = weakReference != null ? weakReference.get() : null;
            if (TextUtils.isEmpty(vj) || webView == null) {
                return;
            }
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.oo.hc.3
                @Override // java.lang.Runnable
                public void run() {
                    com.bytedance.sdk.component.utils.gbb.pcc(webView, vj);
                }
            });
        } catch (Throwable th) {
            lo.gm(th.getMessage(), new Object[0]);
        }
    }

    private int ork() {
        WeakReference<WebView> weakReference = this.nn;
        WebView webView = weakReference != null ? weakReference.get() : null;
        if (webView != null) {
            try {
                WebBackForwardList copyBackForwardList = webView.copyBackForwardList();
                if (copyBackForwardList != null) {
                    if (copyBackForwardList.getCurrentIndex() == 0) {
                        return 1;
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(com.bytedance.sdk.openadsdk.core.settings.wh whVar, String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return whVar.oo;
            case "1":
                return whVar.vj;
            case "2":
                return whVar.wh;
            default:
                return false;
        }
    }

    public void pcc(boolean z, long j) {
        if (z) {
            this.tz = j;
        } else {
            this.of = j;
        }
        if (this.tz <= 0 || this.of <= 0 || !this.nac || !this.sf.compareAndSet(false, true)) {
            return;
        }
        pcc(this.qy, this.jsj, this.of - this.tz, this.fum, this.bg);
    }

    public static void pcc(final of ofVar, final String str, final long j, final int i, final boolean z) {
        gm.pcc(System.currentTimeMillis(), ofVar, str, "lp_feeling_duration", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.hc.4
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_lp_pre_render", i);
                    jSONObject.put("meta_pre_render", ofVar.ss() ? 1 : 0);
                    com.bytedance.sdk.openadsdk.core.model.gpj jsj = ofVar.jsj();
                    if (jsj == null) {
                        jsj = new com.bytedance.sdk.openadsdk.core.model.gpj();
                    }
                    jSONObject.put("pre_render_status", jsj.gm());
                    jSONObject.put("pre_render_use_gecko", jsj.sf());
                    jSONObject.put("pre_render_add_type", jsj.pcc());
                    jSONObject.put("is_reused", z ? 1 : 0);
                    new Object[]{"feeling duration is:", Long.valueOf(j), jSONObject, str};
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    public void gm(String str) {
        if (!this.rnn || this.qy == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.fmh;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.qy.xy();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        pcc("load_start", jSONObject);
    }

    public void oo(String str) {
        if (!this.rnn || this.qy == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            int i = this.fmh;
            if (i >= 0) {
                jSONObject.putOpt("preload_status", Integer.valueOf(i));
            }
            if (TextUtils.isEmpty(str)) {
                str = this.qy.xy();
            }
            jSONObject.put("url", str);
        } catch (Exception unused) {
        }
        pcc("progress_load_finish", jSONObject);
    }

    public void pcc(String str, long j) {
        if (!this.rnn || this.qy == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("error_code", this.vh);
            jSONObject.put("error_msg", this.hc);
            jSONObject.put("error_url", this.gbb);
            int i = this.fmh;
            if (i >= 0) {
                jSONObject.put("preload_status", i);
            }
            jSONObject.put("first_page", ork());
            jSONObject.putOpt("render_type", "h5");
            jSONObject.putOpt("render_type_2", 0);
            if (TextUtils.isEmpty(str)) {
                str = this.qy.xy();
            }
            jSONObject.put("url", str);
            jSONObject.put("preload_h5_type", this.qy.tsx());
        } catch (Exception unused) {
        }
        pcc("load_finish", jSONObject, Math.min(j, 600000L));
    }

    public void vj(boolean z) {
        this.bg = z;
    }

    public void pcc(final String str, final String str2, final long j) {
        if (!this.rnn || this.qy == null) {
            return;
        }
        gm.pcc(System.currentTimeMillis(), this.qy, this.jsj, "lp_redirect_duration", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.oo.hc.5
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                JSONObject jSONObject = new JSONObject();
                try {
                    String str3 = "";
                    jSONObject.put("first_url", TextUtils.isEmpty(str) ? "" : str);
                    if (!TextUtils.isEmpty(str2)) {
                        str3 = str2;
                    }
                    jSONObject.put("current_url", str3);
                    jSONObject.put("time_since_last_touch", j);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }
}
