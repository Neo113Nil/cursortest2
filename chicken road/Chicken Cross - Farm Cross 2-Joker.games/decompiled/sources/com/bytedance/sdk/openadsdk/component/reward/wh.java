package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.core.jr.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.qy;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.tz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh {
    private static volatile wh pcc;
    private final Context sf;
    private com.bytedance.sdk.component.kj.sf.gm vj;
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final List<gm> oo = Collections.synchronizedList(new ArrayList());
    private final jsj.pcc wh = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.6
        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (wh.this.vj == null) {
                    wh.this.vj = new com.bytedance.sdk.openadsdk.component.reward.gm("fsv net connect task", wh.this.oo);
                }
                com.bytedance.sdk.component.utils.vy.pcc().post(wh.this.vj);
            }
        }
    };

    public static wh pcc(Context context) {
        if (pcc == null) {
            synchronized (wh.class) {
                if (pcc == null) {
                    pcc = new wh(context);
                }
            }
        }
        return pcc;
    }

    private wh(Context context) {
        this.sf = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
        sf();
    }

    public void pcc() {
        try {
            vj.pcc(this.sf).pcc();
        } catch (Throwable unused) {
        }
    }

    public void pcc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        sf(adSlot);
    }

    private void sf(final AdSlot adSlot) {
        tsz tszVar = new tsz();
        tszVar.gm = 2;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 8, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.1
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                return vj.pcc(wh.this.sf).pcc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = vj.pcc(wh.this.sf).pcc(pccVar);
                this.pcc = pcc2;
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (this.pcc || pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    return;
                }
                wh.this.pcc(pccVar, new gpj(wh.this.sf, pccVar), adSlot, true, (PAGInterstitialAdLoadListener) null);
            }
        });
    }

    public void pcc(AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        sf(adSlot, pAGInterstitialAdLoadListener);
    }

    private void sf(final AdSlot adSlot, final PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        final long currentTimeMillis = System.currentTimeMillis();
        tsz tszVar = new tsz();
        tszVar.gm = 1;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 8, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.2
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
                    gpj gpjVar = new gpj(wh.this.sf, pccVar);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(pccVar.vj().isEmpty() ? null : pccVar.vj().get(0));
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(pccVar.qf(), System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (pAGInterstitialAdLoadListener != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 0) {
                        wh.this.pcc(adSlot, pccVar, pAGInterstitialAdLoadListener, gpjVar.pcc(), this.pcc);
                    }
                    wh.this.pcc(pccVar, gpjVar, adSlot, false, pAGInterstitialAdLoadListener);
                    return;
                }
                PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener2 = pAGInterstitialAdLoadListener;
                if (pAGInterstitialAdLoadListener2 != null) {
                    pAGInterstitialAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
                    gmVar.pcc(-3);
                    gmVar.gm(5);
                    com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String pcc2 = vj.pcc(wh.this.sf).pcc(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(pcc2)) {
                    return null;
                }
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = vj.pcc(wh.this.sf).pcc(pccVar);
                this.pcc = pcc2;
                return pcc2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, PAGInterstitialAd pAGInterstitialAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.3
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    wh.this.gm(adSlot);
                } else {
                    vj.pcc(wh.this.sf).pcc(adSlot, pccVar);
                    wh.this.gm(adSlot);
                }
            }
        });
        if (pAGInterstitialAdLoadListener != null) {
            pAGInterstitialAdLoadListener.onAdLoaded(pAGInterstitialAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, gpj gpjVar, AdSlot adSlot, boolean z, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        if (!z) {
            com.bytedance.sdk.openadsdk.gbb.gm.pcc().pcc(pccVar.qf());
        }
        sf sfVar = new sf(new pcc(this.sf, adSlot, pccVar, pAGInterstitialAdLoadListener, false), pccVar);
        pcc(pccVar);
        for (int i = 0; i < pccVar.vj().size(); i++) {
            of ofVar = pccVar.vj().get(i);
            int bg = ofVar.bg();
            if (i == 0 && bg == 43) {
                ofVar.kez().wh(0);
            }
            if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.pcc(ofVar)) {
                if (com.bytedance.sdk.openadsdk.component.reward.gm.kj.vj()) {
                    ofVar.kez().wh(0);
                }
                if (!pccVar.vy() && ofVar.bg() != 43) {
                    return;
                }
            }
            pcc(pccVar, ofVar, gpjVar, adSlot, z, sfVar);
            if (!pccVar.vy()) {
            }
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
        qy vh = pccVar.vh();
        int i = pccVar.vy() ? 10 : 1;
        if (vh != null) {
            i = vh.dax();
        }
        for (final int i2 = 0; i2 < pccVar.vj().size() && i2 < i; i2++) {
            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(pccVar.vj().get(i2), new pcc.InterfaceC0161pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.4
                @Override // com.bytedance.sdk.openadsdk.core.jr.gm.pcc.InterfaceC0161pcc
                public void pcc(boolean z) {
                    com.bytedance.sdk.component.utils.lo.pcc("ScreenVideoLoadM", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of ofVar, final gpj gpjVar, final AdSlot adSlot, final boolean z, final sf sfVar) {
        if (z && !atb.gm(ofVar) && of.vj(ofVar) && com.bytedance.sdk.openadsdk.core.lu.oo().tsz(adSlot.getCodeId()).oo == 1 && !com.bytedance.sdk.component.utils.lu.oo(this.sf)) {
            pcc(new gm(ofVar, adSlot, pccVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = sfVar != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 1;
        if (atb.gm(ofVar)) {
            if (z) {
                vj.pcc(this.sf).pcc(adSlot, pccVar);
            }
        } else if (of.vj(ofVar)) {
            if (ofVar.kez() != null) {
                com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(CacheDirFactory.getICacheDir(ofVar.we()).pcc(), ofVar);
                pcc2.pcc("material_meta", ofVar);
                pcc2.pcc("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc2, new com.bykv.vk.openvk.pcc.pcc.pcc.vj.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.5
                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i) {
                        gpjVar.sf();
                        if (z) {
                            vj.pcc(wh.this.sf).pcc(adSlot, pccVar);
                        } else {
                            if (sfVar == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                                return;
                            }
                            sfVar.onAdLoaded(gpjVar.pcc());
                        }
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i, String str) {
                        if (sfVar == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                            return;
                        }
                        sfVar.onError(i, str);
                    }
                });
            } else {
                z2 = z3;
            }
            z3 = z2;
        } else if (z) {
            vj.pcc(this.sf).pcc(adSlot, pccVar);
        }
        if (z3) {
            sfVar.onAdLoaded(gpjVar.pcc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(AdSlot adSlot) {
        vj.pcc(this.sf).pcc(adSlot.getCodeId());
    }

    private void pcc(gm gmVar) {
        if (gmVar == null) {
            return;
        }
        if (this.oo.size() > 0) {
            this.oo.remove(0);
        }
        this.oo.add(gmVar);
    }

    private void sf() {
        if (this.gm.get()) {
            return;
        }
        this.gm.set(true);
        jsj.pcc(this.wh, this.sf);
    }

    private void gm() {
        if (this.gm.get()) {
            this.gm.set(false);
            try {
                jsj.pcc(this.wh);
            } catch (Exception unused) {
            }
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.vj != null) {
            try {
                com.bytedance.sdk.component.utils.vy.pcc().removeCallbacks(this.vj);
            } catch (Exception unused) {
            }
            this.vj = null;
        }
        gm();
    }

    private static class gm extends com.bytedance.sdk.component.kj.sf.gm {
        final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        final of pcc;
        final AdSlot sf;

        gm(of ofVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            super("Fullscreen Task");
            this.pcc = ofVar;
            this.sf = adSlot;
            this.gm = pccVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            of ofVar = this.pcc;
            if (ofVar == null || ofVar.kez() == null) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(CacheDirFactory.getICacheDir(this.pcc.we()).pcc(), this.pcc);
            pcc.pcc("material_meta", this.pcc);
            pcc.pcc("ad_slot", this.sf);
            com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new com.bykv.vk.openvk.pcc.pcc.pcc.vj.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.gm.1
                @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i) {
                    vj.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(gm.this.sf, gm.this.gm);
                }
            });
        }
    }

    private static class pcc implements PAGInterstitialAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        private final PAGInterstitialAdLoadListener oo;
        private final Context pcc;
        private final AdSlot sf;
        private final boolean vj;

        public pcc(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, boolean z) {
            this.pcc = context;
            this.sf = adSlot;
            this.gm = pccVar;
            this.oo = pAGInterstitialAdLoadListener;
            this.vj = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
        public void onError(int i, String str) {
            PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener = this.oo;
            if (pAGInterstitialAdLoadListener != null) {
                pAGInterstitialAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            wh.pcc(this.pcc).pcc(this.sf, this.gm, this.oo, pAGInterstitialAd, this.vj);
        }
    }

    private static class sf implements PAGInterstitialAdLoadListener {
        private final AtomicInteger gm;
        private final com.bytedance.sdk.openadsdk.core.model.pcc oo;
        private final PAGInterstitialAdLoadListener pcc;
        private final AtomicBoolean sf;

        private sf(PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            this.sf = new AtomicBoolean(false);
            this.pcc = pAGInterstitialAdLoadListener;
            this.oo = pccVar;
            this.gm = new AtomicInteger(pcc());
        }

        private int pcc() {
            if (!this.oo.wh()) {
                return 0;
            }
            int i = 0;
            for (int i2 = 0; i2 < this.oo.vj().size(); i2++) {
                of ofVar = this.oo.vj().get(i2);
                if (ofVar != null && !atb.gm(ofVar) && ofVar.kez() != null) {
                    i++;
                }
            }
            return i;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
        public void onError(int i, String str) {
            if (this.gm.decrementAndGet() > 0 || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onError(i, str);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.wh.sf.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", sf.this.oo.gm());
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("choose_ad_load_error").sf(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGInterstitialAd pAGInterstitialAd) {
            this.gm.decrementAndGet();
            if (this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onAdLoaded(pAGInterstitialAd);
        }
    }

    public void pcc(String str, of ofVar) {
        vj.pcc(this.sf).pcc(str, ofVar);
    }
}
