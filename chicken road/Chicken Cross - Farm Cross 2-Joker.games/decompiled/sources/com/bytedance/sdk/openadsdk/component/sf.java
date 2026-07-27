package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.ork;
import com.bytedance.sdk.openadsdk.core.ork.vy;
import com.ironsource.U3;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf extends gm {
    private com.bytedance.sdk.openadsdk.component.vy.sf gbb;
    private final com.bytedance.sdk.openadsdk.component.wh.sf hc;
    private boolean jr;

    public sf(Activity activity, of ofVar, FrameLayout frameLayout, pcc pccVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.kj.pcc pccVar2, com.bytedance.sdk.openadsdk.component.wh.sf sfVar) {
        super(activity, ofVar, frameLayout, pccVar, i, z, pccVar2);
        this.hc = sfVar;
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public void pcc(ViewGroup viewGroup) {
        Pair<Float, Float> pcc = com.bytedance.sdk.openadsdk.core.ork.sf.pcc.pcc(this.pcc.getWindow(), this.qf);
        com.bytedance.sdk.openadsdk.component.vy.sf sfVar = new com.bytedance.sdk.openadsdk.component.vy.sf(this.pcc, this.sf, new AdSlot.Builder().setCodeId(String.valueOf(this.sf.kot())).setExpressViewAcceptedSize(((Float) pcc.first).floatValue(), ((Float) pcc.second).floatValue()).build(), "open_ad", this.vj, this.hc, this.tmg);
        this.gbb = sfVar;
        sfVar.setTopListener(this.vj);
        this.gbb.setExpressVideoListenerProxy(this.vj);
        this.gbb.setExpressInteractionListener(new PAGExpressAdWrapperListener() { // from class: com.bytedance.sdk.openadsdk.component.sf.1
            @Override // com.bytedance.sdk.openadsdk.api.PAGAdWrapperListener
            public void onAdClicked() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdDismissed() {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onAdShow(View view, int i) {
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderFail(View view, String str, int i) {
                sf.this.vj.oo();
            }

            @Override // com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
            public void onRenderSuccess(View view, float f, float f2) {
                if (sf.this.gbb.of()) {
                    sf.this.jr = true;
                    sf sfVar2 = sf.this;
                    sf.super.pcc((ViewGroup) sfVar2.oo);
                    sf.super.pcc();
                    sf.super.sf();
                    return;
                }
                if (sf.this.sf.ye()) {
                    sf.this.vj.gm();
                    return;
                }
                if (sf.this.gm) {
                    sf sfVar3 = sf.this;
                    if (sfVar3.pcc(sfVar3.gbb.getVideoFrameLayout())) {
                        sf.this.gbb.setVideoManager(sf.this.qf());
                        sf.this.vj.gm();
                        return;
                    } else {
                        sf.this.vj.oo();
                        return;
                    }
                }
                sf.this.vj.gm();
            }
        });
        this.sf.lo(1);
        this.oo.addView(this.gbb, new FrameLayout.LayoutParams(-1, -1));
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public void pcc() {
        ork pcc = com.bytedance.sdk.openadsdk.component.pcc.sf.pcc(this.sf, this.pcc, this.tmg, this.gbb);
        pcc.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.sf.2
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                sf.this.vj.vj();
            }
        });
        this.gbb.setClickListener(pcc);
        vy sf = com.bytedance.sdk.openadsdk.component.pcc.sf.sf(this.sf, this.pcc, this.tmg, this.gbb);
        this.gbb.setClickCreativeListener(sf);
        sf.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.sf.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                sf.this.vj.vj();
            }
        });
        this.gbb.setBackupListener(new com.bytedance.sdk.component.adexpress.sf.gm() { // from class: com.bytedance.sdk.openadsdk.component.sf.4
            @Override // com.bytedance.sdk.component.adexpress.sf.gm
            public boolean pcc(ViewGroup viewGroup, int i) {
                new Object[]{"open_ad", "isUseBackup() called with: view = [" + viewGroup + "], errCode = [" + i + U3.j.e};
                try {
                    ((fum) viewGroup).tz();
                    new com.bytedance.sdk.openadsdk.component.vy.pcc(sf.this.pcc).pcc((fum) sf.this.gbb);
                    return true;
                } catch (Exception e) {
                    Log.e("AppOpenAdExpressManager", "", e);
                    return false;
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public void sf() {
        this.gbb.fum();
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public void pcc(int i, boolean z) {
        new Object[]{"setTime leftTime=", Integer.valueOf(i), "canSkip=", Boolean.valueOf(z)};
        super.pcc(i, z);
        com.bytedance.sdk.openadsdk.component.vy.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.setTime(String.valueOf(i), (int) (this.tmg.gm() / 1000), i, false);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public void gm() {
        super.gm();
        com.bytedance.sdk.openadsdk.component.vy.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.hc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public int oo() {
        return this.gbb.getDynamicShowType();
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public JSONObject pcc(JSONObject jSONObject) {
        return this.gbb.pcc(jSONObject, this.sf);
    }

    @Override // com.bytedance.sdk.openadsdk.component.gm
    public void vj() {
        com.bytedance.sdk.openadsdk.component.vy.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.gpj();
        }
    }

    public void pcc(long j, long j2) {
        com.bytedance.sdk.openadsdk.component.vy.sf sfVar = this.gbb;
        if (sfVar != null) {
            sfVar.pcc(j, j2);
        }
    }
}
