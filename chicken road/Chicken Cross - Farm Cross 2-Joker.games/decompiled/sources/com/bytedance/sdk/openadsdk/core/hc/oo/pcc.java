package com.bytedance.sdk.openadsdk.core.hc.oo;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.dax;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.tmg;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.sdk.openadsdk.core.hc.qf.oo;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.ironsource.L6;
import com.ironsource.U3;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc implements dax, jr {
    private InterfaceC0154pcc gm;
    private dax oo;
    private final Context pcc;
    private gm<View> sf;

    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.oo.pcc$pcc, reason: collision with other inner class name */
    interface InterfaceC0154pcc {
        void pcc(hc hcVar);
    }

    @Override // com.bytedance.adsdk.ugeno.core.jr
    public void pcc(gm gmVar, String str, wh.pcc pccVar) {
    }

    public pcc(Context context) {
        this.pcc = context;
    }

    public void pcc(final JSONObject jSONObject, final JSONObject jSONObject2, final oo ooVar) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            sf(jSONObject, jSONObject2, ooVar);
        } else {
            rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.oo.pcc.1
                @Override // java.lang.Runnable
                public void run() {
                    pcc.this.sf(jSONObject, jSONObject2, ooVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(JSONObject jSONObject, JSONObject jSONObject2, oo ooVar) {
        try {
            tmg tmgVar = new tmg(this.pcc);
            gm<View> pcc = tmgVar.pcc(jSONObject);
            this.sf = pcc;
            if (pcc == null) {
                if (ooVar != null) {
                    ooVar.pcc(3000, "ugen render fail");
                    return;
                }
                return;
            }
            View vh = pcc.vh();
            if (vh != null) {
                vh.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.hc.oo.pcc.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
            tmgVar.pcc((jr) this);
            tmgVar.pcc((dax) this);
            if (jSONObject2 != null) {
                try {
                    jSONObject2.put("language", com.bytedance.sdk.openadsdk.core.hc.sf());
                    jSONObject2.put(L6.F, U3.d);
                } catch (JSONException unused) {
                }
            }
            tmgVar.sf(jSONObject2);
            if (ooVar != null) {
                ooVar.pcc(this.sf);
            }
        } catch (Exception e) {
            if (ooVar != null) {
                ooVar.pcc(3000, "ugen render fail exception is" + e.getMessage());
            }
        }
    }

    public void pcc(InterfaceC0154pcc interfaceC0154pcc) {
        this.gm = interfaceC0154pcc;
    }

    public void pcc(dax daxVar) {
        this.oo = daxVar;
    }

    @Override // com.bytedance.adsdk.ugeno.core.jr
    public void pcc(hc hcVar, jr.sf sfVar, jr.pcc pccVar) {
        InterfaceC0154pcc interfaceC0154pcc;
        if (hcVar == null) {
            return;
        }
        if ((hcVar.sf() == 1 || hcVar.sf() == 4) && (interfaceC0154pcc = this.gm) != null) {
            interfaceC0154pcc.pcc(hcVar);
        }
        if (sfVar == null || hcVar.oo() == null) {
            return;
        }
        sfVar.pcc(hcVar.oo());
    }

    @Override // com.bytedance.adsdk.ugeno.core.dax
    public void pcc(gm gmVar, MotionEvent motionEvent) {
        dax daxVar = this.oo;
        if (daxVar != null) {
            daxVar.pcc(gmVar, motionEvent);
        }
    }
}
