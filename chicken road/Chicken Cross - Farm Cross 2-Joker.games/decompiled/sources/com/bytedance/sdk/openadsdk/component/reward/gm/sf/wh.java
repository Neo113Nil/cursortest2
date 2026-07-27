package com.bytedance.sdk.openadsdk.component.reward.gm.sf;

import android.app.Activity;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.component.reward.tmg;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.of;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.tsz;
import com.ironsource.L6;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh implements tmg.pcc {
    private of gm;
    private long kj;
    private Activity oo;
    private int qf;
    private String vj;
    private com.bytedance.sdk.openadsdk.component.reward.gm.wh vy;
    private String wh;
    private final AtomicBoolean pcc = new AtomicBoolean(false);
    private final AtomicInteger sf = new AtomicInteger(0);

    public wh(of ofVar, Activity activity, String str, String str2) {
        this.gm = ofVar;
        this.oo = activity;
        this.vj = str;
        this.wh = str2;
    }

    public void pcc() {
        if (this.gm != null && this.pcc.get()) {
            this.gm.vy(true);
        }
    }

    public void sf() {
        of ofVar = this.gm;
        if (ofVar == null || !ofVar.rj()) {
            return;
        }
        this.pcc.set(true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.tmg.pcc
    public void pcc(int i, boolean z) {
        if (this.pcc.get()) {
            return;
        }
        pcc(0L, 0, 13);
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar) {
        this.vy = whVar;
    }

    public void pcc(long j, int i, final int i2) {
        this.qf = i;
        this.kj = j;
        if (this.pcc.get()) {
            return;
        }
        this.pcc.set(true);
        if (lu.oo().nac(String.valueOf(this.gm.kot()))) {
            this.sf.set(1);
            com.bytedance.sdk.openadsdk.component.reward.gm.wh whVar = this.vy;
            if (whVar != null) {
                whVar.sf(true, this.gm.otd(), this.gm.gdh(), 0, "", i2);
                return;
            }
            return;
        }
        lu.gm().pcc(gm(), new of.sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh.1
            @Override // com.bytedance.sdk.openadsdk.core.of.sf
            public void pcc(int i3, String str) {
                if (wh.this.vy != null) {
                    wh.this.vy.sf(false, 0, "", i3, str, i2);
                }
                wh.this.sf.set(2);
            }

            @Override // com.bytedance.sdk.openadsdk.core.of.sf
            public void pcc(yt.sf sfVar) {
                boolean z = sfVar.sf;
                int pcc = sfVar.gm.pcc();
                String sf = sfVar.gm.sf();
                if (wh.this.vy != null) {
                    wh.this.vy.sf(sfVar.sf, pcc, sf, 0, "", i2);
                }
                wh.this.sf.set(1);
            }
        });
    }

    private JSONObject gm() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oversea_version_type", 1);
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_NAME, this.gm.gdh());
            jSONObject.put(CampaignEx.JSON_KEY_REWARD_AMOUNT, this.gm.otd());
            jSONObject.put("network", com.bytedance.sdk.component.utils.lu.gm(this.oo.getApplicationContext()));
            jSONObject.put("sdk_version", BuildConfig.VERSION_NAME);
            int bxz = this.gm.bxz();
            String str = "unKnow";
            if (bxz == 2) {
                str = kun.sf();
            } else if (bxz == 1) {
                str = kun.oo();
            }
            jSONObject.put("user_agent", str);
            JSONObject zvx = this.gm.zvx();
            if (zvx != null) {
                zvx.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
            }
            jSONObject.put("extra", zvx);
            jSONObject.put("media_extra", this.wh);
            jSONObject.put("video_duration", this.gm.kez().wh());
            jSONObject.put("play_start_ts", this.kj);
            jSONObject.put("play_end_ts", System.currentTimeMillis());
            jSONObject.put(IronSourceConstants.EVENTS_DURATION, this.qf);
            jSONObject.put("user_id", this.vj);
            jSONObject.put("trans_id", tsz.pcc().replace("-", ""));
            return jSONObject;
        } catch (Throwable th) {
            lo.pcc("RewardFullRewardManager", "", th);
            return null;
        }
    }
}
