package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.kj;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.oo.qf;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.lrr;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsz;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private boolean gbb;
    private long gpj;
    private final boolean kj;
    private of oo;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm ork;
    protected oo pcc;
    protected AdSlot sf;
    private qf tmg;
    private fum vh;
    private PAGBannerAdWrapperListener vj;
    private boolean vy;
    private final Context wh;
    private String gm = "banner_ad";
    private long qf = 0;
    private final AtomicBoolean hc = new AtomicBoolean(false);
    private final int jr = 1;
    private final int dax = 0;
    private int nac = -1;
    private final View.OnAttachStateChangeListener lu = new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.1
        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            if (pcc.this.nac == 0 || pcc.this.vy) {
                return;
            }
            pcc pccVar = pcc.this;
            pccVar.pcc(pccVar.pcc.getCurView(), pcc.this.oo);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            if (pcc.this.gbb) {
                pcc.this.nac = 0;
            } else {
                pcc.this.wh();
            }
        }
    };

    public pcc(Context context, of ofVar, AdSlot adSlot, qf qfVar, boolean z) {
        this.gbb = false;
        this.wh = context;
        this.oo = ofVar;
        this.sf = adSlot;
        this.tmg = qfVar;
        this.gbb = z;
        pcc(context, ofVar, adSlot);
        this.kj = false;
        this.vy = false;
    }

    public void pcc(int i) {
        oo ooVar = this.pcc;
        if (ooVar != null) {
            ooVar.setCurrentIndex(i);
        }
    }

    public void pcc(PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        kj kjVar = new kj(pAGBannerAdInteractionCallback);
        this.vj = kjVar;
        this.pcc.setExpressInteractionListener(kjVar);
    }

    public void pcc(PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        kj kjVar = new kj(pAGBannerAdInteractionListener);
        this.vj = kjVar;
        this.pcc.setExpressInteractionListener(kjVar);
    }

    public View pcc() {
        com.bytedance.sdk.openadsdk.utils.sf.pcc(this.oo);
        IPBroadcastReceiver.sf(this.wh, this.oo);
        return this.pcc;
    }

    private void pcc(Context context, of ofVar, AdSlot adSlot) {
        if (ofVar.kez() != null) {
            gm gmVar = new gm(context, ofVar, adSlot, this.gbb);
            this.pcc = gmVar;
            gmVar.addOnAttachStateChangeListener(this.lu);
        } else {
            oo ooVar = new oo(context, ofVar, adSlot, this.gbb);
            this.pcc = ooVar;
            ooVar.addOnAttachStateChangeListener(this.lu);
        }
    }

    public boolean sf() {
        return this.pcc instanceof gm;
    }

    public com.bytedance.sdk.openadsdk.gpj.gm.pcc gm() {
        oo ooVar = this.pcc;
        if (ooVar instanceof gm) {
            return ((gm) ooVar).getVideoModel();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z, of ofVar) {
        if (!z) {
            new Object[]{"banner_ad", "Lose focus, stop timing"};
        } else {
            if (this.oo.qap() && !this.oo.tsz()) {
                this.oo.qf(true);
                of ofVar2 = this.oo;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar2, this.gm, ofVar2.uij());
            }
            new Object[]{"banner_ad", "Get focus, start timing"};
        }
        rnn.sf(new C0167pcc(z, ofVar, this), 10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ork() {
        tmg();
    }

    public void oo() {
        sf(this.oo);
        this.qf = 0L;
    }

    public void vj() {
        this.qf = System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(View view, fum fumVar, of ofVar, String str, qf.pcc pccVar) {
        ork.sf().pcc(str, pccVar);
        this.qf = System.currentTimeMillis();
        try {
            JSONObject jSONObject = new JSONObject();
            if (fumVar != null) {
                jSONObject.put("dynamic_show_type", fumVar.getDynamicShowType());
                fumVar.pcc(jSONObject, ofVar);
            }
            if (view != null) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("width", view.getWidth());
                    jSONObject2.put("height", view.getHeight());
                    jSONObject2.put("alpha", view.getAlpha());
                } catch (Throwable unused) {
                }
                jSONObject.put("root_view", jSONObject2.toString());
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.gm, jSONObject, (JSONObject) null);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(ofVar);
        } catch (JSONException unused2) {
            lo.gm("PAGBannerAdImpl", "onShowFun json error");
        }
        PAGBannerAdWrapperListener pAGBannerAdWrapperListener = this.vj;
        if (pAGBannerAdWrapperListener != null) {
            pAGBannerAdWrapperListener.onAdShow(view, ofVar.az());
        }
        if (ofVar.qxq()) {
            kun.pcc(ofVar, view);
        }
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm pcc(of ofVar) {
        if (ofVar.az() == 4) {
            return com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.wh, this.gm);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final fum fumVar, final of ofVar) {
        com.bytedance.sdk.openadsdk.core.kj kjVar;
        if (fumVar == null || ofVar == null) {
            return;
        }
        this.oo = ofVar;
        this.ork = pcc(ofVar);
        this.vh = fumVar;
        final String pcc = tsz.pcc();
        final qf.pcc vh = vh();
        fumVar.setClosedListenerKey(pcc);
        fumVar.setBannerClickClosedListener(vh);
        fumVar.setBackupListener(new com.bytedance.sdk.component.adexpress.sf.gm() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.2
            @Override // com.bytedance.sdk.component.adexpress.sf.gm
            public boolean pcc(ViewGroup viewGroup, int i) {
                try {
                    fumVar.tz();
                    if (pcc.this.oo.on()) {
                        vy vyVar = new vy(fumVar.getContext());
                        vyVar.setClosedListenerKey(pcc);
                        vyVar.pcc(pcc.this.oo, fumVar, pcc.this.ork);
                        vyVar.setAdInteractionListener(pcc.this.vj);
                        fumVar.setVastVideoHelper(vyVar);
                        return true;
                    }
                    sf sfVar = new sf(fumVar.getContext());
                    sfVar.setClosedListenerKey(pcc);
                    sfVar.pcc(pcc.this.oo, fumVar, pcc.this.ork);
                    sfVar.setAdInteractionListener(pcc.this.vj);
                    return true;
                } catch (Exception unused) {
                    return false;
                }
            }
        });
        if (!this.kj) {
            com.bytedance.sdk.openadsdk.core.kj pcc2 = pcc(fumVar);
            if (pcc2 == null) {
                pcc2 = new com.bytedance.sdk.openadsdk.core.kj(this.wh, fumVar, this.tmg.pcc());
                fumVar.addView(pcc2);
            }
            kjVar = pcc2;
            kjVar.setAdType(1);
            kjVar.setCallback(new kj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.3
                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void pcc(boolean z) {
                    pcc.this.pcc(z, ofVar);
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void pcc() {
                    if (pcc.this.nac != 0) {
                        pcc.this.ork();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void sf() {
                    pcc pccVar = pcc.this;
                    pccVar.sf(pccVar.oo);
                }

                @Override // com.bytedance.sdk.openadsdk.core.kj.pcc
                public void pcc(View view) {
                    if (pcc.this.hc.compareAndSet(false, true)) {
                        pcc.this.pcc(view, fumVar, ofVar, pcc, vh);
                    }
                    if (pcc.this.pcc == null || pcc.this.pcc.getCurView() == null) {
                        return;
                    }
                    pcc.this.pcc.getCurView().vh();
                    pcc.this.pcc.getCurView().gpj();
                    pcc.this.pcc.setIsShow(true);
                }
            });
        } else {
            lrr.pcc(fumVar, true, 1, this.tmg.pcc(), new lrr.sf() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.4
                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void pcc(boolean z) {
                    pcc.this.pcc(z, ofVar);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void pcc() {
                    if (pcc.this.nac != 0) {
                        pcc.this.ork();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void sf() {
                    pcc pccVar = pcc.this;
                    pccVar.sf(pccVar.oo);
                }

                @Override // com.bytedance.sdk.openadsdk.utils.lrr.sf
                public void pcc(View view, boolean z) {
                    if (!z) {
                        com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(pcc.this.oo, 8);
                        return;
                    }
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(pcc.this.oo, 4);
                    if (pcc.this.hc.compareAndSet(false, true)) {
                        pcc.this.pcc(view, fumVar, ofVar, pcc, vh);
                    }
                    if (pcc.this.pcc == null || pcc.this.pcc.getCurView() == null) {
                        return;
                    }
                    pcc.this.pcc.getCurView().vh();
                    pcc.this.pcc.getCurView().gpj();
                    pcc.this.pcc.setIsShow(true);
                }
            }, null);
            kjVar = null;
        }
        Context pcc3 = fumVar != null ? com.bytedance.sdk.component.utils.sf.pcc(fumVar) : null;
        if (pcc3 == null) {
            pcc3 = this.wh;
        }
        com.bytedance.sdk.openadsdk.core.ork.ork orkVar = new com.bytedance.sdk.openadsdk.core.ork.ork(pcc3, ofVar, this.gm, 2);
        orkVar.sf(fumVar);
        orkVar.pcc(this);
        orkVar.pcc(this.ork);
        orkVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.5
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                if (pcc.this.vj != null) {
                    pcc.this.vj.onAdClicked();
                }
            }
        });
        fumVar.setClickListener(orkVar);
        com.bytedance.sdk.openadsdk.core.ork.vy vyVar = new com.bytedance.sdk.openadsdk.core.ork.vy(this.wh, ofVar, this.gm, 2);
        vyVar.sf(fumVar);
        vyVar.pcc(this);
        vyVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.6
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                if (pcc.this.vj != null) {
                    pcc.this.vj.onAdClicked();
                }
            }
        });
        fum fumVar2 = this.vh;
        if (fumVar2 instanceof com.bytedance.sdk.openadsdk.core.ork.lo) {
            vyVar.pcc(((com.bytedance.sdk.openadsdk.core.ork.lo) fumVar2).getVideoController());
        }
        vyVar.pcc(this.ork);
        fumVar.setClickCreativeListener(vyVar);
        if (this.kj) {
            return;
        }
        kjVar.setNeedCheckingShow(true);
    }

    private qf.pcc vh() {
        return new qf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.7
            @Override // com.bytedance.sdk.openadsdk.core.oo.qf.pcc
            public void pcc() {
                int width = pcc.this.vh.getWidth();
                int height = pcc.this.vh.getHeight();
                View pcc = pcc(((double) height) >= Math.floor((((double) width) * 450.0d) / 600.0d));
                pcc.this.vh.yt();
                pcc.this.vh.removeAllViews();
                pcc.this.vh.addView(pcc, new ViewGroup.LayoutParams(width, height));
                pcc.this.vh.setClickCreativeListener(null);
                pcc.this.vh.setClickListener(null);
                if (pcc.this.vj != null) {
                    pcc.this.vj.onAdDismissed();
                }
                pcc.this.vy = true;
            }

            private View pcc(boolean z) {
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(pcc.this.wh);
                ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
                gmVar.setBackgroundColor(-1);
                gmVar.setLayoutParams(layoutParams);
                View view = new View(pcc.this.wh);
                ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                view.setAlpha(0.3f);
                view.setBackgroundColor(Color.parseColor("#F3F7F8"));
                gmVar.addView(view, layoutParams2);
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(pcc.this.wh);
                ViewGroup.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                if (z) {
                    gmVar2.setBackground(tz.gm(pcc.this.wh, "tt_ad_closed_background_300_250"));
                } else {
                    gmVar2.setBackground(tz.gm(pcc.this.wh, "tt_ad_closed_background_320_50"));
                }
                gmVar.addView(gmVar2, layoutParams3);
                PAGLogoView createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(pcc.this.wh, pcc.this.oo);
                createPAGLogoViewByMaterial.setId(520093739);
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
                if (z) {
                    int sf = rj.sf(pcc.this.wh, 16.0f);
                    layoutParams4.width = rj.sf(pcc.this.wh, 77.0f);
                    layoutParams4.height = rj.sf(pcc.this.wh, 14.0f);
                    layoutParams4.leftMargin = sf;
                    layoutParams4.topMargin = sf;
                } else {
                    int sf2 = rj.sf(pcc.this.wh, 8.0f);
                    layoutParams4.width = rj.sf(pcc.this.wh, 45.0f);
                    layoutParams4.height = rj.sf(pcc.this.wh, 8.18f);
                    layoutParams4.leftMargin = sf2;
                    layoutParams4.topMargin = sf2;
                }
                gmVar2.addView(createPAGLogoViewByMaterial, layoutParams4);
                com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(pcc.this.wh);
                FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2);
                layoutParams5.gravity = 17;
                kjVar.setAlpha(0.5f);
                kjVar.setLines(1);
                kjVar.setText(tz.pcc(pcc.this.wh, "tt_ad_is_closed"));
                if (z) {
                    kjVar.setTextSize(18.0f);
                } else {
                    kjVar.setTextSize(12.0f);
                }
                gmVar2.addView(kjVar, layoutParams5);
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.7.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view2) {
                        if (!com.bytedance.sdk.openadsdk.utils.sf.wh() || !lu.oo().atb()) {
                            TTWebsiteActivity.pcc(pcc.this.wh, pcc.this.oo, pcc.this.gm);
                        } else {
                            IABLandingPageActivity.pcc(pcc.this.wh, pcc.this.oo, pcc.this.gm);
                        }
                    }
                };
                createPAGLogoViewByMaterial.setOnClickListener(onClickListener);
                kjVar.setOnClickListener(onClickListener);
                return gmVar;
            }
        };
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.oo.pcc$pcc, reason: collision with other inner class name */
    private static class C0167pcc extends com.bytedance.sdk.component.kj.sf.gm {
        WeakReference<pcc> gm;
        boolean pcc;
        of sf;

        C0167pcc(boolean z, of ofVar, pcc pccVar) {
            super("ReportWindowFocusChangedAdShow");
            this.pcc = z;
            this.sf = ofVar;
            this.gm = new WeakReference<>(pccVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            WeakReference<pcc> weakReference = this.gm;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.gm.get().sf(this.pcc, this.sf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(boolean z, of ofVar) {
        try {
            if (z) {
                this.qf = System.currentTimeMillis();
            } else {
                if (this.qf <= 0 || this.vh == null) {
                    return;
                }
                String valueOf = String.valueOf(System.currentTimeMillis() - this.qf);
                this.qf = 0L;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, ofVar, this.gm, this.vh.getAdShowTime());
            }
        } catch (Exception e) {
            lo.gm("PAGBannerAdImpl", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(of ofVar) {
        if (this.qf <= 0 || ofVar == null) {
            return;
        }
        try {
            if (this.vh != null) {
                String valueOf = String.valueOf(System.currentTimeMillis() - this.qf);
                this.qf = 0L;
                com.bytedance.sdk.openadsdk.oo.gm.pcc(valueOf, ofVar, this.gm, this.vh.getAdShowTime());
            }
        } catch (Exception e) {
            lo.gm("PAGBannerAdImpl", e.getMessage());
        }
    }

    private com.bytedance.sdk.openadsdk.core.kj pcc(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return null;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof com.bytedance.sdk.openadsdk.core.kj) {
                    return (com.bytedance.sdk.openadsdk.core.kj) childAt;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public void wh() {
        this.nac = 1;
        this.pcc.oo();
    }

    public void qf() {
        if (this.pcc != null) {
            try {
                wh();
                this.pcc.removeOnAttachStateChangeListener(this.lu);
            } catch (Throwable unused) {
            }
        }
    }

    public void pcc(final com.bytedance.sdk.openadsdk.pcc.pcc.sf sfVar) {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.gpj > 500) {
            this.gpj = currentTimeMillis;
            oo ooVar = this.pcc;
            if (ooVar instanceof gm) {
                ooVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.oo.pcc.8
                    @Override // java.lang.Runnable
                    public void run() {
                        ((gm) pcc.this.pcc).pcc(sfVar);
                    }
                }, 500L);
            }
        }
    }

    public void kj() {
        oo ooVar = this.pcc;
        if (ooVar instanceof gm) {
            ((gm) ooVar).sf();
        }
    }

    public void vy() {
        oo ooVar = this.pcc;
        if (ooVar instanceof gm) {
            ((gm) ooVar).pcc();
        }
    }

    private void tmg() {
        this.oo.pcc(SystemClock.elapsedRealtime());
        this.pcc.vj();
    }
}
