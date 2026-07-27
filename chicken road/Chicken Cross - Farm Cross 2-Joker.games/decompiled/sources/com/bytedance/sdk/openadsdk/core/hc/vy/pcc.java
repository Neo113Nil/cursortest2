package com.bytedance.sdk.openadsdk.core.hc.vy;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.adsdk.ugeno.core.dax;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.core.vh;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.sdk.openadsdk.core.hc.qf.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.vungle.ads.internal.protos.Sdk;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc implements dax, jr {
    private gm gm;
    private Context pcc;
    private tmg sf;

    @Override // com.bytedance.adsdk.ugeno.core.jr
    public void pcc(hc hcVar, jr.sf sfVar, jr.pcc pccVar) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.dax
    public void pcc(gm gmVar, MotionEvent motionEvent) {
    }

    @Override // com.bytedance.adsdk.ugeno.core.jr
    public void pcc(gm gmVar, String str, wh.pcc pccVar) {
    }

    public pcc(Context context) {
        this.pcc = context;
    }

    public void pcc(final JSONObject jSONObject, final JSONObject jSONObject2, final JSONObject jSONObject3, final oo ooVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            sf(jSONObject, jSONObject2, jSONObject3, ooVar);
        } else {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.vy.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.sf(jSONObject, jSONObject2, jSONObject3, ooVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, oo ooVar) {
        this.sf = new tmg(this.pcc);
        pcc();
        this.sf.pcc((jr) this);
        this.sf.pcc((dax) this);
        if (jSONObject == null || jSONObject2 == null) {
            if (ooVar != null) {
                ooVar.pcc(Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE, "template or data is null");
                return;
            }
            return;
        }
        try {
            gm<View> pcc = this.sf.pcc(jSONObject, jSONObject2, jSONObject3);
            this.gm = pcc;
            if (pcc != null) {
                ooVar.pcc(pcc);
            } else if (ooVar != null) {
                ooVar.pcc(3000, "ugen render fail");
            }
        } catch (NoClassDefFoundError unused) {
            if (ooVar != null) {
                ooVar.pcc(138, "ugen render yoga error");
            }
        } catch (UnsatisfiedLinkError unused2) {
            if (ooVar != null) {
                ooVar.pcc(TsExtractor.TS_STREAM_TYPE_DTS_UHD, "ugen render yoga error");
            }
        } catch (Throwable unused3) {
            if (ooVar != null) {
                ooVar.pcc(138, "ugen render error");
            }
        }
    }

    private void pcc() {
        vh vhVar = new vh();
        vhVar.pcc(this.pcc);
        this.sf.pcc("page", vhVar);
    }
}
