package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.R;
import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class vj {
    private String kj;
    private nac pcc;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf qf;
    private TTAdDislikeToast sf;
    private Activity vj;
    private of wh;
    private final AtomicBoolean gm = new AtomicBoolean(false);
    private final ConcurrentHashMap<String, Boolean> oo = new ConcurrentHashMap<>();

    public vj(com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar, Activity activity, of ofVar) {
        this.qf = sfVar;
        this.vj = activity;
        this.wh = ofVar;
    }

    public void pcc(String str) {
        this.kj = str;
        if (this.vj.isFinishing()) {
            return;
        }
        wh();
        if (vj()) {
            sf();
        } else {
            gm();
        }
    }

    private void sf() {
        this.sf.show(TTAdDislikeToast.getDislikeTip());
        this.oo.put(this.kj, Boolean.TRUE);
    }

    private void gm() {
        if (this.pcc == null) {
            try {
                oo();
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        nac nacVar = this.pcc;
        if (nacVar != null) {
            nacVar.pcc();
        }
    }

    private void oo() {
        if (this.pcc == null) {
            nac nacVar = new nac(this.vj, this.wh);
            this.pcc = nacVar;
            nacVar.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.vj.1
                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(View view) {
                    vj.this.gm.set(true);
                    if (vj.this.qf != null && vj.this.qf.qf != null && vj.this.qf.qf.sf() != null) {
                        vj.this.qf.qf.sf().pcc(8, false, true);
                        vj.this.qf.qf.sf().setShouldNotifyAdVisibility(false);
                    }
                    vj.this.pcc.setDislikeSource(vj.this.kj);
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void sf(View view) {
                    vj.this.gm.set(false);
                    if (vj.this.qf == null || vj.this.qf.qf == null || vj.this.qf.qf.sf() == null) {
                        return;
                    }
                    vj.this.qf.qf.sf().pcc(0, true, false);
                    vj.this.qf.qf.sf().setShouldNotifyAdVisibility(true);
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(FilterWord filterWord) {
                    if (vj.this.vj() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    vj.this.oo.put(vj.this.kj, Boolean.TRUE);
                    vj.this.qf();
                }
            });
            ((FrameLayout) this.vj.findViewById(R.id.content)).addView(this.pcc);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean vj() {
        if (this.oo.containsKey(this.kj)) {
            return Boolean.TRUE.equals(this.oo.get(this.kj));
        }
        return false;
    }

    private void wh() {
        if (this.sf == null) {
            this.sf = new TTAdDislikeToast(this.vj);
            ((FrameLayout) this.vj.findViewById(R.id.content)).addView(this.sf);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qf() {
        TTAdDislikeToast tTAdDislikeToast = this.sf;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }

    public void pcc() {
        TTAdDislikeToast tTAdDislikeToast = this.sf;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }
}
