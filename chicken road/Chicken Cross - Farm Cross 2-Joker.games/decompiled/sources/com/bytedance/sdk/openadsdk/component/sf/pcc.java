package com.bytedance.sdk.openadsdk.component.sf;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.common.qf;
import com.bytedance.sdk.openadsdk.core.jr.pcc.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.gm;
import com.bytedance.sdk.openadsdk.core.model.tsz;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.tz;
import com.bytedance.sdk.openadsdk.core.vy;
import com.bytedance.sdk.openadsdk.dax.oo;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.utils.tsx;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class pcc {
    private static volatile pcc pcc;
    private final of sf = lu.gm();

    public static pcc pcc() {
        if (pcc == null) {
            synchronized (pcc.class) {
                if (pcc == null) {
                    pcc = new pcc();
                }
            }
        }
        return pcc;
    }

    private pcc() {
    }

    public void pcc(final Context context, final AdSlot adSlot, final qf qfVar) {
        final tsx sf = tsx.sf();
        this.sf.pcc(adSlot, new tsz(), 5, new tz() { // from class: com.bytedance.sdk.openadsdk.component.sf.pcc.1
            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(int i, String str) {
                qfVar.onError(i, str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.tz, com.bytedance.sdk.openadsdk.core.of.pcc
            public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, gm gmVar) {
                pcc.this.pcc(pccVar, gmVar, context, adSlot, qfVar, sf);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(com.bytedance.sdk.openadsdk.core.model.pcc pccVar, gm gmVar, Context context, AdSlot adSlot, qf qfVar, tsx tsxVar) {
        if (pccVar.vj() != null && !pccVar.vj().isEmpty()) {
            List<com.bytedance.sdk.openadsdk.core.model.of> vj = pccVar.vj();
            ArrayList arrayList = new ArrayList(vj.size());
            for (com.bytedance.sdk.openadsdk.core.model.of ofVar : vj) {
                if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar) || (ofVar != null && ofVar.fi())) {
                    PAGNativeAd pcc2 = pcc(context, ofVar, adSlot);
                    if (qfVar instanceof PAGNativeAdLoadListener) {
                        arrayList.add(pcc2);
                    }
                }
                if (com.bytedance.sdk.openadsdk.core.model.of.vj(ofVar) && ofVar.kez() != null && ofVar.kez().vh() != null) {
                    if (lu.oo().vj(String.valueOf(ofVar.kot())) && lu.oo().bg()) {
                        if (ofVar.kez() != null) {
                            ofVar.kez().wh(1);
                        }
                        if (ofVar.vck() != null) {
                            ofVar.vck().wh(1);
                        }
                        sf pcc3 = com.bytedance.sdk.openadsdk.core.model.of.pcc(CacheDirFactory.getICacheDir(ofVar.we()).gm(), ofVar);
                        pcc3.pcc("material_meta", ofVar);
                        pcc3.pcc("ad_slot", adSlot);
                        com.bytedance.sdk.openadsdk.core.jr.vj.pcc.pcc(pcc3, null);
                    }
                    IPBroadcastReceiver.sf(context, ofVar);
                }
            }
            boolean z = qfVar instanceof PAGNativeAdLoadListener;
            if (z && !arrayList.isEmpty()) {
                if (adSlot != null && !TextUtils.isEmpty(adSlot.getBidAdm())) {
                    oo.pcc(vj.get(0), tsxVar.oo());
                }
                if (z) {
                    ((PAGNativeAdLoadListener) qfVar).onAdLoaded(arrayList.get(0));
                }
                if (gmVar.vj() == null || gmVar.vj().isEmpty()) {
                    return;
                }
                gmVar.gm(4);
                gm.pcc(gmVar);
                return;
            }
            qfVar.onError(-4, vy.pcc(-4));
            gmVar.pcc(-4);
            gmVar.gm(4);
            gm.pcc(gmVar);
            return;
        }
        qfVar.onError(-3, vy.pcc(-3));
        gmVar.pcc(-3);
        gmVar.gm(4);
        gm.pcc(gmVar);
    }

    private PAGNativeAd pcc(Context context, com.bytedance.sdk.openadsdk.core.model.of ofVar, AdSlot adSlot) {
        if (ofVar.ei() == 2) {
            if (ofVar.kez() != null) {
                return new com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf(context, ofVar, adSlot);
            }
            return new com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm(context, ofVar, adSlot);
        }
        return new com.bytedance.sdk.openadsdk.pcc.sf.sf(context, ofVar, 5, adSlot);
    }
}
