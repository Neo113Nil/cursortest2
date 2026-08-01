package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.nac;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes4.dex */
public class oo {
    private TTAdDislikeToast gm;
    private final sf pcc;
    private com.bytedance.sdk.openadsdk.common.nac sf;

    public oo(sf sfVar) {
        this.pcc = sfVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        if (this.pcc.rnn.isFinishing()) {
            return;
        }
        boolean z = (this.pcc.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.vj) && ((com.bytedance.sdk.openadsdk.activity.single.vj) this.pcc.ywp).pcc;
        if (this.pcc.vh.get() || (this.pcc.ywp != null && this.pcc.ywp.rj().tsz() && !z)) {
            if (this.gm == null) {
                this.gm = new TTAdDislikeToast(this.pcc.rnn);
                ((FrameLayout) this.pcc.rnn.findViewById(R.id.content)).addView(this.gm);
            }
            this.gm.show(TTAdDislikeToast.getDislikeTip());
            this.pcc.vh.set(true);
            return;
        }
        if (this.sf == null) {
            try {
                sf(sfVar);
            } catch (Throwable th) {
                ApmHelper.reportCustomError("initDislike error", "RewardFullDislikeManager", th);
            }
        }
        com.bytedance.sdk.openadsdk.common.nac nacVar = this.sf;
        if (nacVar != null) {
            nacVar.pcc();
        }
        if (this.pcc.yt != null) {
            com.bytedance.sdk.openadsdk.component.oo.pcc.pcc(this.pcc.sf, this.pcc.yt.vh());
        }
    }

    public void pcc() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.hide();
        }
    }

    public void sf() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.onDestroy();
        }
    }

    private void sf(final com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        if (this.sf == null) {
            com.bytedance.sdk.openadsdk.common.nac nacVar = new com.bytedance.sdk.openadsdk.common.nac(this.pcc.rnn, this.pcc.sf);
            this.sf = nacVar;
            nacVar.setCallback(new nac.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.oo.1
                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(View view) {
                    oo.this.pcc.ork.set(true);
                    String str = "landing_page";
                    if (!lo.sf(oo.this.pcc.sf) && !lo.oo(oo.this.pcc.sf) && !lo.qf(oo.this.pcc.sf) && !lo.kj(oo.this.pcc.sf)) {
                        if (oo.this.pcc.vy.get()) {
                            if (!atb.sf(oo.this.pcc.sf)) {
                                if (!oo.this.pcc.sf.fy()) {
                                    str = CampaignEx.JSON_NATIVE_VIDEO_ENDCARD;
                                }
                            } else {
                                str = "playable";
                            }
                        } else {
                            str = "video_player";
                        }
                    }
                    oo.this.sf.setDislikeSource(str);
                    if (oo.this.pcc.fum.vj) {
                        if (oo.this.pcc.yt != null) {
                            oo.this.pcc.yt.pcc(8, false);
                            return;
                        }
                        return;
                    }
                    sfVar.gbb();
                    if (oo.this.pcc.fum.wh()) {
                        oo.this.pcc.fum.tz();
                    }
                    if (oo.this.gm()) {
                        oo.this.pcc.ywp.rj().sf(oo.this.pcc.ywp, 2);
                    }
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(oo.this.pcc.sf, 8);
                    oo.this.pcc.of.wh();
                    oo.this.pcc.of.kj();
                    if (oo.this.pcc.gh != null) {
                        oo.this.pcc.gh.sf();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void sf(View view) {
                    oo.this.pcc.ork.set(false);
                    if (oo.this.pcc.fum.vj) {
                        if (oo.this.pcc.yt != null) {
                            oo.this.pcc.yt.pcc(0, true);
                            return;
                        }
                        return;
                    }
                    oo.this.pcc.fum.pcc(sfVar);
                    if (oo.this.pcc.fum.vy()) {
                        oo.this.pcc.fum.fum();
                    }
                    if (oo.this.gm()) {
                        oo.this.pcc.ywp.rj().sf(oo.this.pcc.ywp, 1);
                    }
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(oo.this.pcc.sf, 4);
                    oo.this.pcc.of.pcc(0);
                    oo.this.pcc.of.vj();
                    if (oo.this.pcc.gh != null) {
                        oo.this.pcc.gh.pcc();
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.common.nac.pcc
                public void pcc(FilterWord filterWord) {
                    if (oo.this.pcc.vh.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    oo.this.pcc.vh.set(true);
                    if (oo.this.pcc.ywp != null) {
                        oo.this.pcc.ywp.rj().gm(true);
                    }
                    oo.this.oo();
                }
            });
            ((FrameLayout) this.pcc.rnn.findViewById(R.id.content)).addView(this.sf);
        }
        if (this.gm == null) {
            this.gm = new TTAdDislikeToast(this.pcc.rnn);
            ((FrameLayout) this.pcc.rnn.findViewById(R.id.content)).addView(this.gm);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean gm() {
        return this.pcc.bbd;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oo() {
        TTAdDislikeToast tTAdDislikeToast = this.gm;
        if (tTAdDislikeToast != null) {
            tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
        }
    }
}
