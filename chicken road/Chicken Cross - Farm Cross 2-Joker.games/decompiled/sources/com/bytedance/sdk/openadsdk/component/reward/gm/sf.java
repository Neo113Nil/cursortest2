package com.bytedance.sdk.openadsdk.component.reward.gm;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.jr;
import com.bytedance.sdk.openadsdk.component.reward.pcc.tmg;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.yt;
import com.bytedance.sdk.openadsdk.utils.dax;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class sf implements tsz.pcc, PAGExpressAdWrapperListener, pcc, com.bytedance.sdk.openadsdk.component.reward.gm.pcc.vj {
    protected boolean dax;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc fum;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj gpj;
    protected Context hc;
    protected long jr;
    protected com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo kj;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf.qf lo;
    protected boolean nac;
    protected Activity oo;
    protected com.bytedance.sdk.openadsdk.component.reward.pcc.pcc ork;
    protected String pcc;
    public jr qf;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm qy;
    public boolean sf;
    private com.bytedance.sdk.openadsdk.core.wh.gm tz;
    protected com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm vh;
    protected of vj;
    protected tmg vy;
    protected String wh;
    private ViewGroup yt;
    private final AtomicBoolean lu = new AtomicBoolean(false);
    protected boolean gm = false;
    private boolean of = false;
    protected final tsz tmg = new tsz(Looper.getMainLooper(), this);
    protected AtomicBoolean gbb = new AtomicBoolean(false);
    private AtomicBoolean jsj = new AtomicBoolean(false);
    private AtomicBoolean tsz = new AtomicBoolean(false);

    protected abstract void dax();

    protected void gbb() {
    }

    protected abstract void hc();

    @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
    public void onAdClicked() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdDismissed() {
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onAdShow(View view, int i) {
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
    }

    protected abstract void pcc(boolean z, int i, String str, int i2, String str2, int i3);

    protected abstract void tmg();

    public sf(Activity activity, Context context, of ofVar, String str, ViewGroup viewGroup, String str2) {
        this.oo = activity;
        this.vj = ofVar;
        this.wh = str;
        this.hc = context;
        this.yt = viewGroup;
        this.kj = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo(this, activity, ofVar, str);
        this.qf = new jr(viewGroup, ofVar, str, activity, activity.getApplicationContext(), this);
        this.vy = new tmg(activity, ofVar, ofVar.ial(), com.bytedance.sdk.openadsdk.utils.sf.pcc(), this.sf, null);
        this.gpj = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj(this, activity, ofVar);
        this.lo = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.qf(ofVar);
        this.fum = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc(viewGroup, activity);
        this.ork = new com.bytedance.sdk.openadsdk.component.reward.pcc.pcc(activity, ofVar, ofVar.ial(), str);
        this.pcc = str2;
        this.tz = new com.bytedance.sdk.openadsdk.core.wh.gm(activity);
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm(activity, ofVar, this.tz, viewGroup, this.qf);
        this.vh = gmVar;
        gmVar.pcc(this);
        this.kj.pcc(this);
        this.qf.pcc((PAGExpressAdWrapperListener) this);
        this.ork.pcc(pcc(ofVar));
        this.vy.pcc(ofVar.gqd().getDurationSlotType() == 7);
    }

    public void pcc(Bundle bundle) {
        dax.pcc(this.vj, this.hc, this.wh, this);
        lu();
        if (lo.vj(this.vj)) {
            this.ork.sf();
        }
        this.yt.addView(this.tz, new ViewGroup.LayoutParams(-1, -1));
        this.tz.setVisibility(8);
    }

    public void sf(Bundle bundle) {
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo ooVar = this.kj;
        if (ooVar != null && ooVar.pcc()) {
            this.vj.ork(true);
        }
        if (this.lu.get()) {
            this.vj.kj(true);
        }
    }

    public void gm(Bundle bundle) {
        if (bundle != null) {
            this.dax = bundle.getBoolean("enable_new_arch", false);
            return;
        }
        Activity activity = this.oo;
        if (activity == null || activity.getIntent() == null) {
            return;
        }
        this.dax = this.oo.getIntent().getBooleanExtra("enable_new_arch", false);
    }

    public void gm() {
        oo();
        tmg tmgVar = this.vy;
        if (tmgVar != null) {
            tmgVar.pcc(this.tmg);
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = this.vh;
        if (gmVar != null) {
            gmVar.sf();
        }
    }

    protected void oo() {
        if (this.of || this.vj == null) {
            return;
        }
        this.of = true;
        this.oo.getWindow().getDecorView().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.1
            @Override // java.lang.Runnable
            public void run() {
                float[] pcc = tmg.pcc(sf.this.vj.ial(), sf.this.oo, sf.this.vj, com.bytedance.sdk.openadsdk.utils.sf.pcc());
                com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "show loading page");
                if (sf.this.qf != null) {
                    sf.this.qf.pcc(pcc);
                    sf.this.qf.pcc(sf.this.vh);
                    sf.this.qf.gm();
                    sf.this.vj();
                    sf.this.qf.wh();
                    sf.this.qf.pcc(new com.bytedance.sdk.openadsdk.core.ork.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.1.1
                        @Override // com.bytedance.sdk.openadsdk.core.ork.vj
                        public void pcc(String str) {
                            if (sf.this.gpj != null) {
                                sf.this.gpj.pcc(str);
                            }
                        }
                    });
                }
            }
        });
    }

    private void lu() {
        com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
        if (pccVar == null) {
            return;
        }
        pccVar.pcc();
        if (this.ork.wh() != null) {
            this.yt.addView(this.ork.wh(), new FrameLayout.LayoutParams(-1, -1));
            this.ork.gm();
        }
    }

    protected void vj() {
        jr jrVar = this.qf;
        if (jrVar == null) {
            return;
        }
        yt sf = jrVar.sf();
        this.qf.pcc((pcc) this);
        if (sf != null) {
            this.lo.pcc(sf.getWebView());
            this.qf.pcc(this.lo);
            sf.setJsbLandingPageOpenListener(new com.bytedance.sdk.openadsdk.core.widget.vj() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.2
                @Override // com.bytedance.sdk.openadsdk.core.widget.vj
                public void pcc() {
                    sf.this.ork();
                }
            });
        }
    }

    public void wh() {
        com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "onPause: ");
        jr jrVar = this.qf;
        if (jrVar != null) {
            jrVar.vj();
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.pcc pccVar = this.fum;
        if (pccVar != null) {
            pccVar.gm();
        }
    }

    public void qf() {
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = this.vh;
        if (gmVar != null) {
            gmVar.gm();
        }
    }

    public void kj() {
        lo();
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.oo ooVar = this.kj;
        if (ooVar != null && ooVar.pcc() && this.kj.sf() > 0) {
            String valueOf = String.valueOf(SystemClock.elapsedRealtime() - this.kj.sf());
            jr jrVar = this.qf;
            com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, this.vj, this.wh, (jrVar == null || jrVar.sf() == null) ? null : this.qf.sf().getAdShowTime());
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj vjVar = this.gpj;
        if (vjVar != null) {
            vjVar.pcc();
        }
        jr jrVar2 = this.qf;
        if (jrVar2 != null) {
            jrVar2.qf();
        }
        dax.pcc();
    }

    public void vy() {
        tmg tmgVar = this.vy;
        if (tmgVar != null) {
            tmgVar.pcc();
        }
    }

    public void pcc(boolean z) {
        if (this.kj != null) {
            jr jrVar = this.qf;
            this.kj.pcc(z, (jrVar == null || jrVar.sf() == null) ? null : this.qf.sf().getAdShowTime());
            this.kj.pcc(z, this.vj, this.wh);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc
    public void pcc() {
        ork();
        this.vj.hu();
        this.vj.oo(true);
        if (of.vj(this.vj)) {
            of ofVar = this.vj;
            com.bytedance.sdk.openadsdk.oo.gm.sf(ofVar, this.wh, ofVar.zex());
        }
    }

    public void ork() {
        com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "invoke callback onAdClicked, ".concat(String.valueOf(this)));
        hc();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc
    public void sf() {
        if (this.lu.compareAndSet(false, true)) {
            com.bytedance.sdk.component.utils.lo.pcc("BVA", "invoke callback onShow, ".concat(String.valueOf(this)));
            vh();
        }
    }

    protected void vh() {
        tmg();
        jr jrVar = this.qf;
        if (jrVar == null || jrVar.sf() == null) {
            return;
        }
        this.qf.sf().gpj();
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderSuccess(View view, float f, float f2) {
        this.gbb.set(true);
        if (lo.vj(this.vj)) {
            if (this.tsz.get() && !this.jsj.get()) {
                this.jsj.set(true);
                gpj();
                com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar = this.vh;
                if (gmVar != null) {
                    gmVar.pcc();
                }
                com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
                if (pccVar != null) {
                    pccVar.vj();
                    this.ork.oo();
                }
            } else {
                com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar2 = this.ork;
                if (pccVar2 != null) {
                    pccVar2.sf();
                }
            }
        } else {
            gpj();
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar3 = this.ork;
            if (pccVar3 != null) {
                pccVar3.vj();
                this.ork.oo();
            }
        }
        if (this.fum == null || !kj.qf()) {
            return;
        }
        this.fum.pcc();
        this.fum.pcc(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (sf.this.oo != null) {
                    if (sf.this.qf != null && sf.this.qf.sf() != null) {
                        sf.this.qf.sf().setDirectDestroyWebView(true);
                    }
                    sf.this.gbb();
                    sf.this.oo.finish();
                }
            }
        });
        this.fum.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.4
            @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf.pcc
            public void pcc() {
                if (sf.this.qf != null) {
                    sf.this.qf.pcc();
                    com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "onSendHeartbeat: ");
                }
            }

            @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf.sf.pcc
            public void pcc(sf.EnumC0145sf enumC0145sf) {
                com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "onHeartbeatStatusChanged: ".concat(String.valueOf(enumC0145sf)));
                if (enumC0145sf == sf.EnumC0145sf.TIMEOUT) {
                    sf.this.fum.sf();
                    sf.this.fum.pcc(sf.this.vj);
                }
            }
        });
        this.qf.pcc(new oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.5
            @Override // com.bytedance.sdk.openadsdk.component.reward.gm.oo
            public void pcc() {
                if (sf.this.fum != null) {
                    sf.this.fum.oo();
                    com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "responseHeartBeat: ");
                }
            }
        });
    }

    private void gpj() {
        if (this.kj != null) {
            JSONObject jSONObject = new JSONObject();
            jr jrVar = this.qf;
            if (jrVar != null && jrVar.sf() != null) {
                jSONObject = this.qf.sf().pcc(jSONObject, this.vj);
            }
            this.jr = System.currentTimeMillis();
            this.kj.pcc(jSONObject);
        }
    }

    public void onRenderFail(View view, String str, int i) {
        this.gbb.set(false);
    }

    private void lo() {
        com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "removeLoadingPage: ");
        try {
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
            if (pccVar != null) {
                pccVar.oo();
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("BaseManagerBundle", "removeLoadingPage: ", th);
            com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar2 = this.ork;
            if (pccVar2 == null || pccVar2.wh() == null) {
                return;
            }
            this.ork.wh().setAlpha(0.0f);
        }
    }

    public void sf(boolean z) {
        this.gm = z;
    }

    public boolean jr() {
        return this.gm;
    }

    public void nac() {
        Activity activity;
        if (com.bytedance.sdk.openadsdk.yt.vj.vy() && (activity = this.oo) != null && activity.isChangingConfigurations()) {
            com.bytedance.sdk.component.utils.lo.pcc("BVA", "callback close is invoke by config change.");
            return;
        }
        if (!this.nac) {
            this.nac = true;
            of ofVar = this.vj;
            if (ofVar != null && !ofVar.iv()) {
                long vy = this.vj.vy();
                if (vy > 0) {
                    long elapsedRealtime = SystemClock.elapsedRealtime() - vy;
                    if (elapsedRealtime > 0) {
                        this.vj.sf(elapsedRealtime);
                    }
                }
                if (this.kj != null) {
                    JSONObject jSONObject = new JSONObject();
                    jr jrVar = this.qf;
                    if (jrVar != null && jrVar.sf() != null) {
                        jSONObject = this.qf.sf().pcc(jSONObject, this.vj);
                    }
                    this.jr = System.currentTimeMillis();
                    this.kj.pcc(jSONObject);
                }
            }
            dax();
            return;
        }
        com.bytedance.sdk.component.utils.lo.pcc("BVA", "invoke callback onAdClose has already been called ");
    }

    public com.bytedance.sdk.openadsdk.core.gm.vj pcc(of ofVar) {
        if (this.qy == null) {
            this.qy = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.oo, this.wh);
        }
        Activity activity = this.oo;
        String str = this.wh;
        com.bytedance.sdk.openadsdk.core.gm.vj vjVar = new com.bytedance.sdk.openadsdk.core.gm.vj(activity, ofVar, str, TextUtils.equals(str, "rewarded_video") ? 7 : 5) { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.6
            @Override // com.bytedance.sdk.openadsdk.core.gm.vj
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, int i, int i2, int i3, boolean z) {
                HashMap hashMap = new HashMap();
                hashMap.put(IronSourceConstants.EVENTS_DURATION, 0);
                hashMap.put("click_scence", 1);
                pcc(hashMap);
                sf.this.ork();
            }
        };
        vjVar.pcc(this.qy);
        return vjVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.pcc.vj
    public void pcc(String str, int i, int i2) {
        jr jrVar = this.qf;
        if (jrVar != null) {
            jrVar.pcc(str, i, i2);
            if (i == 2 || i == 3) {
                System.currentTimeMillis();
                this.tsz.set(true);
                if (this.gbb.get() && lo.vj(this.vj) && !this.jsj.get()) {
                    this.jsj.set(true);
                    gpj();
                    com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.tz;
                    if (gmVar != null) {
                        gmVar.setVisibility(0);
                    }
                    com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar2 = this.vh;
                    if (gmVar2 != null && i == 2) {
                        gmVar2.pcc();
                    }
                    com.bytedance.sdk.openadsdk.component.reward.pcc.pcc pccVar = this.ork;
                    if (pccVar != null) {
                        pccVar.oo();
                        this.ork.vj();
                        return;
                    }
                    return;
                }
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar3 = this.tz;
                if (gmVar3 != null) {
                    gmVar3.setVisibility(0);
                }
                com.bytedance.sdk.openadsdk.component.reward.gm.sf.gm gmVar4 = this.vh;
                if (gmVar4 == null || i != 2) {
                    return;
                }
                gmVar4.pcc();
            }
        }
    }
}
