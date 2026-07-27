package com.bytedance.sdk.openadsdk.oo.pcc;

import android.content.Context;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.openadsdk.core.hc;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf implements com.bytedance.sdk.component.wh.pcc.vj {
    private final String pcc = "[8105]";

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean gm() {
        return true;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean kj() {
        return true;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public com.bytedance.sdk.component.wh.pcc.oo.pcc pcc(JSONObject jSONObject) {
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean pcc() {
        return false;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean qf() {
        return false;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean sf() {
        return false;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public com.bytedance.sdk.component.wh.pcc.wh vh() {
        return null;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public int wh() {
        return 1;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean pcc(Context context) {
        return lu.pcc(context);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public String pcc(String str) {
        return com.bytedance.sdk.component.oo.pcc.sf(str, com.bytedance.sdk.openadsdk.core.pcc.pcc());
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public String sf(String str) {
        return com.bytedance.sdk.component.oo.pcc.pcc(str, com.bytedance.sdk.openadsdk.core.pcc.pcc());
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public String vy() {
        return kun.oo();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public com.bytedance.sdk.component.wh.pcc.vj.gm ork() {
        if (com.bytedance.sdk.openadsdk.core.vh.sf.pcc().vj()) {
            return null;
        }
        return new gm();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public Executor oo() {
        return rnn.oo();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public Executor vj() {
        return rnn.kj();
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public void pcc(boolean z, int i, long j, com.bytedance.sdk.component.wh.pcc.wh.oo ooVar) {
        Runnable pcc;
        if (ooVar == null) {
            return;
        }
        if (z) {
            com.bytedance.sdk.openadsdk.dax.oo.pcc("track_link_result", false, new vy(true, ooVar));
            return;
        }
        ork mua = vh.sf().mua();
        if (mua == null || ooVar.oo() >= mua.pcc(ooVar.wh())) {
            com.bytedance.sdk.openadsdk.dax.oo.pcc("track_link_result", false, new vy(false, ooVar));
        } else {
            if (!mua.pcc() || (pcc = ooVar.pcc(hc.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc()), null)) == null) {
                return;
            }
            rnn.pcc().schedule(pcc, mua.sf(ooVar.wh()), TimeUnit.SECONDS);
        }
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public int gm(String str) {
        ork mua = vh.sf().mua();
        if (mua == null) {
            return 3;
        }
        return mua.pcc(str);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public long tmg() {
        long pcc = com.bytedance.sdk.openadsdk.yt.vj.pcc("log_queue_timeout", 40000);
        if (pcc < 30000 || pcc > UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
            return 40000L;
        }
        return pcc;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public HandlerThread pcc(String str, int i) {
        return com.bytedance.sdk.component.utils.kj.pcc(str, i);
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean hc() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("batch_log_config", a.k, 0) == 1;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public boolean gbb() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("batch_log_config", "log_list_reuse", 0) == 1;
    }

    @Override // com.bytedance.sdk.component.wh.pcc.vj
    public int jr() {
        return com.bytedance.sdk.openadsdk.yt.vj.pcc("batch_log_config", "once_max", 10);
    }
}
