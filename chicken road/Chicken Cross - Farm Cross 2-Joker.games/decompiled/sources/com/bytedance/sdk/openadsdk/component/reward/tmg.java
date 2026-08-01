package com.bytedance.sdk.openadsdk.component.reward;

import android.os.SystemClock;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg {
    private long gm;
    private long oo;
    private final pcc pcc;
    private final JSONObject qf;
    private long sf;
    private boolean vj;
    private boolean wh;

    public interface pcc {
        void pcc(int i, boolean z);
    }

    public tmg(pcc pccVar) {
        this.vj = true;
        this.pcc = pccVar;
        JSONObject jSONObject = (JSONObject) com.bytedance.sdk.openadsdk.yt.vj.pcc("reward_callback_backup", (Object) null, com.bytedance.sdk.openadsdk.yt.sf.pcc);
        this.qf = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.vj = false;
    }

    public static void pcc(of ofVar, boolean z, final int i) {
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, kun.pcc(ofVar), z ? "reward_callback" : "reward_fail_callback", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.tmg.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject pcc() {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", i);
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    public void pcc(long j) {
        if (j <= this.sf) {
            return;
        }
        this.sf = Math.min(30L, j);
    }

    public void pcc() {
        if (!this.vj && this.gm > 0) {
            this.oo += SystemClock.elapsedRealtime() - this.gm;
            this.gm = 0L;
        }
    }

    public void sf() {
        if (this.vj) {
            return;
        }
        this.gm = SystemClock.elapsedRealtime();
    }

    public void gm() {
        this.vj = true;
    }

    public void oo() {
        JSONObject jSONObject;
        if (this.pcc != null) {
            long elapsedRealtime = (this.oo + (this.gm > 0 ? SystemClock.elapsedRealtime() - this.gm : 0L)) / 1000;
            if (this.vj || (jSONObject = this.qf) == null || DebugKt.DEBUG_PROPERTY_VALUE_OFF.equals(jSONObject.optString("type"))) {
                return;
            }
            if ("force".equals(this.qf.optString("type"))) {
                if (elapsedRealtime >= this.qf.optInt("value", -1)) {
                    this.wh = true;
                    this.pcc.pcc(1, true);
                    return;
                }
                return;
            }
            if (Constants.NORMAL.equals(this.qf.optString("type"))) {
                int optInt = this.qf.optInt("value", -1);
                if (optInt < 0 && elapsedRealtime >= this.sf) {
                    this.wh = false;
                    this.pcc.pcc(1, false);
                } else {
                    if (optInt < 0 || elapsedRealtime < optInt) {
                        return;
                    }
                    this.wh = false;
                    this.pcc.pcc(1, false);
                }
            }
        }
    }
}
