package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.model.PAGErrorModel;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.zti;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class qf extends PAGBannerAd {
    protected AdSlot gm;
    private int kj;
    private boolean oo;
    private final AtomicBoolean ork = new AtomicBoolean(false);
    protected Context pcc;
    private boolean qf;
    protected of sf;
    private List<com.bytedance.sdk.openadsdk.core.oo.pcc> vh;
    private boolean vj;
    private int vy;
    private vj wh;

    public interface pcc {
        void pcc();
    }

    public qf(Context context, of ofVar, AdSlot adSlot) {
        this.kj = 0;
        this.vy = 0;
        this.pcc = context;
        this.sf = ofVar;
        this.gm = adSlot;
        this.kj = (int) adSlot.getExpressViewAcceptedWidth();
        this.vy = (int) this.gm.getExpressViewAcceptedHeight();
        pcc(this.sf);
        sf(ofVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if (r2.vj().size() > 1) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void pcc(of ofVar) {
        com.bytedance.sdk.openadsdk.core.model.pcc oo;
        if (ofVar == null || (oo = ofVar.oo()) == null) {
            return;
        }
        boolean z = oo.vy();
        this.qf = z;
    }

    public boolean pcc() {
        return this.qf;
    }

    private void sf(of ofVar) {
        com.bytedance.sdk.openadsdk.core.model.pcc oo;
        if (ofVar == null || (oo = ofVar.oo()) == null) {
            return;
        }
        this.vh = new ArrayList();
        int size = oo.vj().size();
        if (this.qf) {
            this.wh = new vj(oo.kj(), this.pcc, this.kj, this.vy);
            for (int i = 0; i < size; i++) {
                this.gm.setExpressViewAccepted(((this.kj - rj.gm(this.pcc, oo.kj().vj())) - rj.gm(this.pcc, oo.kj().wh())) - (rj.gm(this.pcc, oo.kj().qf()) * 2), this.vy);
                of ofVar2 = oo.vj().get(i);
                if (i != 0) {
                    pcc(i, ofVar2);
                }
                com.bytedance.sdk.openadsdk.core.oo.pcc pccVar = new com.bytedance.sdk.openadsdk.core.oo.pcc(this.pcc, ofVar2, this.gm, this, true);
                pccVar.pcc(i);
                this.vh.add(pccVar);
            }
            this.wh.pcc(this.vh);
            return;
        }
        this.vh.add(new com.bytedance.sdk.openadsdk.core.oo.pcc(this.pcc, ofVar, this.gm, this, false));
    }

    private void pcc(int i, of ofVar) {
        if (i != 0) {
            if (!TextUtils.isEmpty(ofVar.wax())) {
                ofVar.gbb("0");
            }
            Map<String, Object> oa = ofVar.oa();
            if (oa == null || !oa.containsKey("price")) {
                return;
            }
            oa.put("price", "0");
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void win(Double d) {
        if (this.oo) {
            return;
        }
        zti.pcc(this.sf, d);
        this.oo = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PAGClientBidding
    public void loss(Double d, String str, String str2) {
        if (this.vj) {
            return;
        }
        zti.pcc(this.sf, d, str, str2);
        this.vj = true;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Map<String, Object> getMediaExtraInfo() {
        of ofVar = this.sf;
        if (ofVar != null) {
            return ofVar.oa();
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.api.PangleAd
    public Object getExtraInfo(String str) {
        of ofVar = this.sf;
        if (ofVar == null || ofVar.oa() == null) {
            return null;
        }
        try {
            return this.sf.oa().get(str);
        } catch (Throwable th) {
            lo.gm("PAGBannerAdImpl", th.getMessage());
            return null;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionCallback(final PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback) {
        List<com.bytedance.sdk.openadsdk.core.oo.pcc> list = this.vh;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.vh.size(); i++) {
            this.vh.get(i).pcc(new PAGBannerAdInteractionCallback() { // from class: com.bytedance.sdk.openadsdk.core.oo.qf.1
                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2;
                    if (!qf.this.ork.compareAndSet(false, true) || (pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback) == null) {
                        return;
                    }
                    pAGBannerAdInteractionCallback2.onAdShowed();
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback, com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdDismissed();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdInteractionCallback
                public void onAdShowFailed(PAGErrorModel pAGErrorModel) {
                    PAGBannerAdInteractionCallback pAGBannerAdInteractionCallback2 = pAGBannerAdInteractionCallback;
                    if (pAGBannerAdInteractionCallback2 != null) {
                        pAGBannerAdInteractionCallback2.onAdShowFailed(pAGErrorModel);
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void setAdInteractionListener(final PAGBannerAdInteractionListener pAGBannerAdInteractionListener) {
        List<com.bytedance.sdk.openadsdk.core.oo.pcc> list = this.vh;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (int i = 0; i < this.vh.size(); i++) {
            this.vh.get(i).pcc(new PAGBannerAdInteractionListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.qf.2
                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdShowed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2;
                    if (!qf.this.ork.compareAndSet(false, true) || (pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener) == null) {
                        return;
                    }
                    pAGBannerAdInteractionListener2.onAdShowed();
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdClicked() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdClicked();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.api.PAGAdListener
                public void onAdDismissed() {
                    PAGBannerAdInteractionListener pAGBannerAdInteractionListener2 = pAGBannerAdInteractionListener;
                    if (pAGBannerAdInteractionListener2 != null) {
                        pAGBannerAdInteractionListener2.onAdDismissed();
                    }
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public View getBannerView() {
        try {
            List<com.bytedance.sdk.openadsdk.core.oo.pcc> list = this.vh;
            if (list != null && !list.isEmpty()) {
                if (this.qf) {
                    return this.wh.sf();
                }
                return this.vh.get(0).pcc();
            }
        } catch (Throwable unused) {
        }
        return new View(this.pcc);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public PAGBannerSize getBannerSize() {
        if (this.gm != null) {
            return new PAGBannerSize(this.kj, this.vy);
        }
        return new PAGBannerSize(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd
    public void destroy() {
        try {
            List<com.bytedance.sdk.openadsdk.core.oo.pcc> list = this.vh;
            if (list == null || list.isEmpty()) {
                return;
            }
            if (this.qf) {
                this.wh.pcc();
            } else {
                this.vh.get(0).qf();
            }
        } catch (Throwable unused) {
        }
    }
}
