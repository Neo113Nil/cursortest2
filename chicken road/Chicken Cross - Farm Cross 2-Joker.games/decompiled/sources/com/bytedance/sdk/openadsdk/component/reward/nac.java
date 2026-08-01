package com.bytedance.sdk.openadsdk.component.reward;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
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
public class nac {
    private static volatile nac pcc;
    private final Context sf;
    private com.bytedance.sdk.component.kj.sf.gm vj;
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final List<sf> oo = Collections.synchronizedList(new ArrayList());
    private final jsj.pcc wh = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.6
        @Override // com.bytedance.sdk.component.utils.jsj.pcc
        public void pcc(Context context, Intent intent, boolean z, int i) {
            if (z) {
                if (nac.this.vj == null) {
                    nac.this.vj = new com.bytedance.sdk.openadsdk.component.reward.gm("net connect task", nac.this.oo);
                }
                com.bytedance.sdk.component.utils.vy.pcc().post(nac.this.vj);
            }
        }
    };

    public static nac pcc(Context context) {
        if (pcc == null) {
            synchronized (nac.class) {
                if (pcc == null) {
                    pcc = new nac(context);
                }
            }
        }
        return pcc;
    }

    private nac(Context context) {
        this.sf = context == null ? com.bytedance.sdk.openadsdk.core.lu.pcc() : context.getApplicationContext();
        sf();
    }

    public void pcc(AdSlot adSlot) {
        if (adSlot == null || TextUtils.isEmpty(adSlot.getCodeId()) || !TextUtils.isEmpty(adSlot.getBidAdm())) {
            return;
        }
        sf(adSlot);
    }

    private void sf(final AdSlot adSlot) {
        tsz tszVar = new tsz();
        tszVar.sf = 2;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 7, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.1
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                return dax.pcc(nac.this.sf).pcc(adSlot.getCodeId(), false);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = dax.pcc(nac.this.sf).pcc(pccVar);
                this.pcc = pcc2;
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (this.pcc || pccVar.vj() == null || pccVar.vj().isEmpty()) {
                    return;
                }
                nac.this.pcc(pccVar, new lo(nac.this.sf, pccVar, adSlot), adSlot, true, (PAGRewardedAdLoadListener) null);
            }
        });
    }

    public void pcc(String str, of ofVar) {
        dax.pcc(this.sf).pcc(str, ofVar);
    }

    public void pcc() {
        try {
            dax.pcc(this.sf).pcc();
        } catch (Throwable unused) {
        }
    }

    public void pcc(AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        sf(adSlot, pAGRewardedAdLoadListener);
    }

    private void sf(final AdSlot adSlot, final PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (com.bytedance.sdk.component.utils.jr.gm()) {
            com.bykv.vk.openvk.pcc.pcc.pcc.qf.sf.pcc(adSlot.getBidAdm());
        }
        final long currentTimeMillis = System.currentTimeMillis();
        tsz tszVar = new tsz();
        tszVar.sf = 1;
        if (com.bytedance.sdk.openadsdk.core.lu.oo().hc(adSlot.getCodeId()) || adSlot.getExpressViewAcceptedWidth() > 0.0f || adSlot.isExpressAd()) {
            tszVar.vy = 2;
        }
        com.bytedance.sdk.openadsdk.core.lu.gm().pcc(adSlot, tszVar, 7, new tz() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.2
            boolean pcc = false;

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
                    lo loVar = new lo(nac.this.sf, pccVar, adSlot);
                    if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                        com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(pccVar.vj().isEmpty() ? null : pccVar.vj().get(0));
                        com.bytedance.sdk.openadsdk.dax.oo.pcc(pccVar.qf(), System.currentTimeMillis() - currentTimeMillis);
                    }
                    if (pAGRewardedAdLoadListener != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 0) {
                        nac.this.pcc(adSlot, pccVar, pAGRewardedAdLoadListener, loVar.pcc(), this.pcc);
                    }
                    nac.this.pcc(pccVar, loVar, adSlot, false, pAGRewardedAdLoadListener);
                    return;
                }
                PAGRewardedAdLoadListener pAGRewardedAdLoadListener2 = pAGRewardedAdLoadListener;
                if (pAGRewardedAdLoadListener2 != null) {
                    pAGRewardedAdLoadListener2.onError(-3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
                    gmVar.pcc(-3);
                    gmVar.gm(6);
                    com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public String pcc() {
                if (!TextUtils.isEmpty(adSlot.getBidAdm())) {
                    return null;
                }
                String pcc2 = dax.pcc(nac.this.sf).pcc(adSlot.getCodeId(), true);
                if (TextUtils.isEmpty(pcc2)) {
                    return null;
                }
                return pcc2;
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.fum
            public boolean pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
                boolean pcc2 = dax.pcc(nac.this.sf).pcc(pccVar);
                this.pcc = pcc2;
                return pcc2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, lo loVar, AdSlot adSlot, boolean z, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        if (!z) {
            com.bytedance.sdk.openadsdk.gbb.gm.pcc().pcc(pccVar.qf());
        }
        gm gmVar = new gm(new pcc(this.sf, adSlot, pccVar, pAGRewardedAdLoadListener, false), pccVar);
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
                if (!pccVar.vy() && bg != 43) {
                    return;
                }
            }
            pcc(pccVar, ofVar, loVar, adSlot, z, gmVar);
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
        for (final int i2 = 0; i2 < pccVar.vj().size(); i2++) {
            of ofVar = pccVar.vj().get(i2);
            if (i2 >= i) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.jr.gm.pcc.pcc().pcc(ofVar, new pcc.InterfaceC0161pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.3
                @Override // com.bytedance.sdk.openadsdk.core.jr.gm.pcc.InterfaceC0161pcc
                public void pcc(boolean z) {
                    com.bytedance.sdk.component.utils.lo.pcc("RewardVideoLoadManager", "onCachedResponse: i=" + i2 + ", isSuccess=" + z);
                }
            });
        }
    }

    private void pcc(final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, of ofVar, final lo loVar, final AdSlot adSlot, final boolean z, final gm gmVar) {
        if (z && !atb.gm(ofVar) && com.bytedance.sdk.openadsdk.core.lu.oo().tsz(adSlot.getCodeId()).oo == 1 && !com.bytedance.sdk.component.utils.lu.oo(this.sf)) {
            pcc(new sf(ofVar, adSlot, pccVar));
            return;
        }
        boolean z2 = false;
        boolean z3 = gmVar != null && com.bytedance.sdk.openadsdk.core.lu.oo().tsz() == 1;
        if (!atb.gm(ofVar)) {
            if (ofVar.kez() != null) {
                com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(CacheDirFactory.getICacheDir(ofVar.we()).pcc(), ofVar);
                pcc2.pcc("material_meta", ofVar);
                pcc2.pcc("ad_slot", adSlot);
                com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc2, new com.bykv.vk.openvk.pcc.pcc.pcc.vj.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.4
                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2, int i) {
                        loVar.sf();
                        if (z) {
                            dax.pcc(nac.this.sf).pcc(adSlot, pccVar);
                        } else {
                            if (gmVar == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                                return;
                            }
                            gmVar.onAdLoaded(loVar.pcc());
                        }
                    }

                    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar2, int i, String str) {
                        if (gmVar == null || com.bytedance.sdk.openadsdk.core.lu.oo().tsz() != 1) {
                            return;
                        }
                        gmVar.onError(i, str);
                    }
                });
            } else {
                z2 = z3;
            }
            z3 = z2;
        } else if (z) {
            dax.pcc(this.sf).pcc(adSlot, pccVar);
        }
        if (z3) {
            gmVar.onAdLoaded(loVar.pcc());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(final AdSlot adSlot, final com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, PAGRewardedAd pAGRewardedAd, final boolean z) {
        com.bytedance.sdk.openadsdk.core.jr.sf().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.5
            @Override // java.lang.Runnable
            public void run() {
                if (z) {
                    nac.this.gm(adSlot);
                } else {
                    dax.pcc(nac.this.sf).pcc(adSlot, pccVar);
                    nac.this.gm(adSlot);
                }
            }
        });
        if (pAGRewardedAdLoadListener != null) {
            pAGRewardedAdLoadListener.onAdLoaded(pAGRewardedAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(AdSlot adSlot) {
        dax.pcc(this.sf).pcc(adSlot.getCodeId());
    }

    private void pcc(sf sfVar) {
        if (sfVar == null) {
            return;
        }
        if (this.oo.size() > 0) {
            this.oo.remove(0);
        }
        this.oo.add(sfVar);
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

    public static class sf extends com.bytedance.sdk.component.kj.sf.gm {
        final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        final of pcc;
        final AdSlot sf;

        sf(of ofVar, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            super("Reward Task");
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
            com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, new com.bykv.vk.openvk.pcc.pcc.pcc.vj.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.sf.1
                @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i, String str) {
                }

                @Override // com.bykv.vk.openvk.pcc.pcc.pcc.vj.pcc.InterfaceC0095pcc
                public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar, int i) {
                    dax.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()).pcc(sf.this.sf, sf.this.gm);
                }
            });
        }
    }

    private static class pcc implements PAGRewardedAdLoadListener {
        private final com.bytedance.sdk.openadsdk.core.model.pcc gm;
        private final PAGRewardedAdLoadListener oo;
        private final Context pcc;
        private final AdSlot sf;
        private final boolean vj;

        public pcc(Context context, AdSlot adSlot, com.bytedance.sdk.openadsdk.core.model.pcc pccVar, PAGRewardedAdLoadListener pAGRewardedAdLoadListener, boolean z) {
            this.pcc = context;
            this.sf = adSlot;
            this.gm = pccVar;
            this.oo = pAGRewardedAdLoadListener;
            this.vj = z;
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener, com.bytedance.sdk.openadsdk.common.qf
        public void onError(int i, String str) {
            PAGRewardedAdLoadListener pAGRewardedAdLoadListener = this.oo;
            if (pAGRewardedAdLoadListener != null) {
                pAGRewardedAdLoadListener.onError(i, str);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            nac.pcc(this.pcc).pcc(this.sf, this.gm, this.oo, pAGRewardedAd, this.vj);
        }
    }

    private static class gm implements PAGRewardedAdLoadListener {
        private final AtomicInteger gm;
        private final com.bytedance.sdk.openadsdk.core.model.pcc oo;
        private final PAGRewardedAdLoadListener pcc;
        private final AtomicBoolean sf;

        private gm(PAGRewardedAdLoadListener pAGRewardedAdLoadListener, com.bytedance.sdk.openadsdk.core.model.pcc pccVar) {
            this.sf = new AtomicBoolean(false);
            this.pcc = pAGRewardedAdLoadListener;
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
            if (this.gm.decrementAndGet() > 0 || this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onError(i, str);
            com.bytedance.sdk.openadsdk.dax.oo.pcc("choose_ad_load_error", false, new com.bytedance.sdk.openadsdk.dax.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.nac.gm.1
                @Override // com.bytedance.sdk.openadsdk.dax.sf
                public com.bytedance.sdk.openadsdk.dax.pcc.gm pcc() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("req_id", gm.this.oo.gm());
                    return com.bytedance.sdk.openadsdk.dax.pcc.oo.sf().pcc("choose_ad_load_error").sf(jSONObject.toString());
                }
            });
        }

        @Override // com.bytedance.sdk.openadsdk.api.PAGLoadListener
        /* renamed from: pcc, reason: merged with bridge method [inline-methods] */
        public void onAdLoaded(PAGRewardedAd pAGRewardedAd) {
            this.gm.decrementAndGet();
            if (this.pcc == null || !this.sf.compareAndSet(false, true)) {
                return;
            }
            this.pcc.onAdLoaded(pAGRewardedAd);
        }
    }
}
