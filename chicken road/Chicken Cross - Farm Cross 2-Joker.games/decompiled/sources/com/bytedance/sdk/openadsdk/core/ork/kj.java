package com.bytedance.sdk.openadsdk.core.ork;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.bytedance.sdk.openadsdk.utils.tsx;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj {
    private final Context gm;
    private com.bytedance.sdk.openadsdk.core.model.of kj;
    private PAGBannerAdLoadListener oo;
    private AdSlot pcc;
    private final AtomicBoolean vj = new AtomicBoolean(false);
    private int wh = 5;
    private final tsx qf = tsx.gm();
    private final com.bytedance.sdk.openadsdk.core.of sf = com.bytedance.sdk.openadsdk.core.lu.gm();

    private kj(Context context) {
        if (context != null) {
            this.gm = context.getApplicationContext();
        } else {
            this.gm = com.bytedance.sdk.openadsdk.core.lu.pcc();
        }
    }

    public static kj pcc(Context context) {
        return new kj(context);
    }

    public void pcc(AdSlot adSlot, int i, com.bytedance.sdk.openadsdk.common.qf qfVar) {
        this.qf.vj();
        if (this.vj.get()) {
            return;
        }
        this.wh = i;
        this.vj.set(true);
        this.pcc = adSlot;
        if (qfVar instanceof PAGBannerAdLoadListener) {
            this.oo = (PAGBannerAdLoadListener) qfVar;
        }
        pcc(adSlot);
    }

    private void pcc(final AdSlot adSlot) {
        if (adSlot == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.core.model.tsz tszVar = new com.bytedance.sdk.openadsdk.core.model.tsz();
        tszVar.vy = 2;
        this.sf.pcc(adSlot, tszVar, this.wh, new com.bytedance.sdk.openadsdk.core.tz() { // from class: com.bytedance.sdk.openadsdk.core.ork.kj.1
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                kj.this.pcc(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar) {
                kj.this.pcc(pccVar, gmVar, adSlot);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, com.bytedance.sdk.openadsdk.core.model.gm gmVar, AdSlot adSlot) {
        if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
            com.bytedance.sdk.openadsdk.core.model.of ork = pccVar.ork();
            this.kj = ork;
            pcc(ork, adSlot);
            if (com.bytedance.sdk.component.utils.jr.gm()) {
                Log.e("ExpressAdLoadManager", "onAdLoad: net work response duration = " + this.qf.oo() + "run in  " + Thread.currentThread().getName());
            }
            if (this.vj.getAndSet(false)) {
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.ork.kj.2
                    @Override // java.lang.Runnable
                    public void run() {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        if (kj.this.kj != null) {
                            kj kjVar = kj.this;
                            kjVar.pcc(kjVar.kj, elapsedRealtime);
                        }
                    }
                });
                return;
            }
            return;
        }
        pcc(-3, com.bytedance.sdk.openadsdk.core.vy.pcc(-3));
        gmVar.pcc(-3);
        gmVar.gm(8);
        com.bytedance.sdk.openadsdk.core.model.gm.pcc(gmVar);
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot) {
        for (com.bytedance.sdk.openadsdk.core.model.of ofVar2 : ofVar.ky()) {
            if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar2) && ofVar2.kez() != null && ofVar2.kez().vh() != null) {
                if (com.bytedance.sdk.openadsdk.core.lu.oo().vj(String.valueOf(ofVar2.kot())) && com.bytedance.sdk.openadsdk.core.lu.oo().bg()) {
                    com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = com.bytedance.sdk.openadsdk.core.model.of.pcc(CacheDirFactory.getICacheDir(ofVar2.we()).gm(), ofVar2);
                    pcc.pcc("material_meta", ofVar2);
                    pcc.pcc("ad_slot", adSlot);
                    com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc, null);
                }
            }
        }
    }

    private PAGBannerAd pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        int i;
        int i2;
        PAGBannerSize ar = ofVar.ar();
        float min = Math.min(this.pcc.getExpressViewAcceptedHeight(), 250.0f);
        if (ar != null) {
            i = ar.getWidth();
            i2 = ar.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        float expressViewAcceptedWidth = i > 0 ? i : this.pcc.getExpressViewAcceptedWidth();
        if (i2 > 0) {
            min = i2;
        }
        this.pcc.setExpressViewAccepted(expressViewAcceptedWidth, min);
        return new com.bytedance.sdk.openadsdk.core.oo.qf(this.gm, ofVar, this.pcc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, long j) {
        if (this.oo != null) {
            PAGBannerAd pcc = pcc(ofVar);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long oo = this.qf.oo();
            if (!TextUtils.isEmpty(this.pcc.getBidAdm())) {
                com.bytedance.sdk.openadsdk.dax.oo.pcc(ofVar, oo);
            }
            this.oo.onAdLoaded(pcc);
            pcc(ofVar, oo, j, elapsedRealtime);
        }
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar, final long j, final long j2, final long j3) {
        try {
            if (com.bytedance.sdk.openadsdk.core.lu.oo().vr()) {
                if (com.bytedance.sdk.openadsdk.yt.vj.vj()) {
                    try {
                        if (this.wh != 1 || ofVar == null || ofVar.ky() == null || ofVar.ky().isEmpty() || ofVar.oo().pcc() == null) {
                            return;
                        }
                        final JSONObject pcc = ofVar.oo().pcc();
                        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, pcc.optString("tag", ""), "load_ad_time", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.kj.3
                            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                            public JSONObject sf() {
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, pcc.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
                                } catch (Throwable unused) {
                                }
                                return jSONObject;
                            }

                            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                            public JSONObject gm() {
                                try {
                                    long optLong = pcc.optLong("callback_start", 0L);
                                    long j4 = j2;
                                    long j5 = j4 - optLong;
                                    long j6 = j3 - j4;
                                    JSONObject optJSONObject = pcc.optJSONObject("extra_data");
                                    if (optJSONObject == null) {
                                        optJSONObject = new JSONObject();
                                    }
                                    optJSONObject.put("thread_dispatch_duration", j5);
                                    optJSONObject.put("build_banner_ad_duration", j6);
                                    optJSONObject.put("ad_load_duration_full", j);
                                    return optJSONObject;
                                } catch (Throwable unused) {
                                    return null;
                                }
                            }
                        });
                    } catch (Throwable unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(int i, String str) {
        PAGBannerAdLoadListener pAGBannerAdLoadListener;
        if (!this.vj.getAndSet(false) || (pAGBannerAdLoadListener = this.oo) == null) {
            return;
        }
        pAGBannerAdLoadListener.onError(i, str);
    }
}
