package com.bytedance.sdk.openadsdk.core.vh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.dax.pcc.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.of;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private oo sf;
    private final AtomicInteger pcc = new AtomicInteger(0);
    private final Runnable gm = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vh.gm.3
        @Override // java.lang.Runnable
        public void run() {
            gm.this.pcc();
        }
    };

    public void pcc(oo ooVar) {
        this.sf = ooVar;
    }

    public void pcc() {
        try {
            if (sf.pcc().wh()) {
                pcc(true);
                return;
            }
            JSONObject gm = gm();
            com.bytedance.sdk.component.qf.sf.oo sf = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
            final String pcc = kun.pcc("/api/ad/union/sdk/register_status/", false, true);
            sf.gm(pcc);
            sf.sf("User-Agent", "");
            sf.vj(sf(gm).toString());
            sf.pcc(6);
            sf.sf("register_stats");
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.gm.1
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("register_status");
                    pccVar.qf(gm.this.pcc(lu.pcc()).toString());
                    return pccVar;
                }
            });
            sf.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.vh.gm.2
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    String oo = sfVar.oo();
                    if (!sfVar.wh() || TextUtils.isEmpty(oo)) {
                        gm.this.sf();
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.gm.2.2
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("register_status");
                                pccVar.qf(gm.this.pcc(lu.pcc()).toString());
                                return pccVar;
                            }
                        });
                        if (gmVar != null) {
                            of.pcc(gmVar.wh());
                            vj.pcc("register_status", pcc, sfVar.pcc(), sfVar.sf(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.gm.2.1
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("register_status");
                                pccVar.qf(gm.this.pcc(lu.pcc()).toString());
                                return pccVar;
                            }
                        });
                        of.sf();
                        JSONObject jSONObject = new JSONObject(oo);
                        String pcc2 = yt.pcc(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                        if (TextUtils.isEmpty(pcc2)) {
                            gm.this.sf();
                            return;
                        }
                        gm.this.pcc(gm.this.pcc(new JSONObject(pcc2)));
                    } catch (Throwable unused) {
                        gm.this.sf();
                    }
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    gm.this.sf();
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.gm.2.3
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("register_status");
                            pccVar.qf(gm.this.pcc(lu.pcc()).toString());
                            return pccVar;
                        }
                    });
                    if (gmVar != null) {
                        of.pcc(gmVar.wh());
                        vj.pcc("register_status", gmVar.wh(), -1, iOException != null ? iOException.getMessage() : null, null, null);
                    }
                }
            });
        } catch (Throwable unused) {
            sf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(boolean z) {
        oo ooVar = this.sf;
        if (ooVar != null) {
            ooVar.pcc(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean pcc(JSONObject jSONObject) {
        int gm = sf.pcc().gm();
        if (jSONObject.has("app_reg")) {
            gm = jSONObject.optInt("app_reg", -1);
            sf.pcc().pcc(gm);
        }
        return gm == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        if (sf.pcc().qf()) {
            if (this.pcc.incrementAndGet() <= 3) {
                jr.sf().removeCallbacks(this.gm);
                jr.sf().postDelayed(this.gm, r0 * 10000);
                return;
            } else {
                pcc(false);
                return;
            }
        }
        pcc(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject pcc(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("net_status", com.bytedance.sdk.component.utils.lu.pcc(context) ? 1 : 0);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    private JSONObject sf(JSONObject jSONObject) {
        return yt.pcc(PangleEncryptConstant.CryptDataScene.REGISTER_STATUS, jSONObject);
    }

    private JSONObject gm() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_id", ork.sf().oo());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
