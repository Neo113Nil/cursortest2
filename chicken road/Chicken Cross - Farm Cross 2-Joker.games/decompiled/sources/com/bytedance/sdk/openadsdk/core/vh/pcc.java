package com.bytedance.sdk.openadsdk.core.vh;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.embedapplog.PangleEncryptConstant;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.core.yt;
import com.bytedance.sdk.openadsdk.dax.pcc.vj;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.of;
import com.ironsource.L6;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private boolean gm;
    private final AtomicInteger pcc = new AtomicInteger(0);
    private oo sf = null;
    private final Runnable oo = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.vh.pcc.3
        @Override // java.lang.Runnable
        public void run() {
            pcc.this.pcc();
        }
    };

    public pcc(boolean z) {
        this.gm = false;
        this.gm = z;
    }

    public void pcc(oo ooVar) {
        this.sf = ooVar;
    }

    public void pcc() {
        try {
            if (!this.gm) {
                String sf = vh.sf(lu.pcc());
                int pcc = vh.pcc(lu.pcc());
                if (TextUtils.equals(sf, vh.oo) && pcc == vh.vj && sf.pcc().vy()) {
                    pcc(true);
                    return;
                }
            }
            JSONObject gm = gm();
            com.bytedance.sdk.component.qf.sf.oo sf2 = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().sf();
            final String pcc2 = kun.pcc("/api/ad/union/sdk/compliance_status/", false, true);
            sf2.gm(pcc2);
            sf2.sf("User-Agent", "");
            sf2.vj(sf(gm).toString());
            sf2.pcc(6);
            sf2.sf("compliance_stats");
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.pcc.1
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("compliance_status");
                    pccVar.qf(pcc.this.pcc(lu.pcc()).toString());
                    return pccVar;
                }
            });
            sf2.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.vh.pcc.2
                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar) {
                    String oo = sfVar.oo();
                    if (!sfVar.wh() || TextUtils.isEmpty(oo)) {
                        pcc.this.sf();
                        com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.pcc.2.2
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("compliance_status");
                                pccVar.qf(pcc.this.pcc(lu.pcc()).toString());
                                return pccVar;
                            }
                        });
                        if (gmVar != null) {
                            of.pcc(gmVar.wh());
                            vj.pcc("compliance_status", pcc2, sfVar.pcc(), sfVar.sf(), null, null);
                            return;
                        }
                        return;
                    }
                    try {
                        com.bytedance.sdk.openadsdk.lu.gm.sf(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.pcc.2.1
                            @Override // com.bytedance.sdk.openadsdk.lu.oo
                            public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                                com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                                pccVar.sf("compliance_status");
                                pccVar.qf(pcc.this.pcc(lu.pcc()).toString());
                                return pccVar;
                            }
                        });
                        of.sf();
                        JSONObject jSONObject = new JSONObject(oo);
                        String pcc3 = yt.pcc(jSONObject.optInt("cypher", -1), jSONObject.optString("message"));
                        if (TextUtils.isEmpty(pcc3)) {
                            pcc.this.sf();
                            return;
                        }
                        if (!pcc.this.pcc(new JSONObject(pcc3))) {
                            pcc.this.pcc(false);
                        } else if (!pcc.this.gm || TextUtils.isEmpty(vh.sf().hpk())) {
                            pcc.this.pcc(true);
                        } else {
                            pcc.this.pcc(false);
                        }
                    } catch (Throwable unused) {
                        pcc.this.sf();
                    }
                }

                @Override // com.bytedance.sdk.component.qf.pcc.pcc
                public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                    pcc.this.sf();
                    com.bytedance.sdk.openadsdk.lu.gm.gm(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.core.vh.pcc.2.3
                        @Override // com.bytedance.sdk.openadsdk.lu.oo
                        public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                            com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                            pccVar.sf("compliance_status");
                            pccVar.qf(pcc.this.pcc(lu.pcc()).toString());
                            return pccVar;
                        }
                    });
                    if (gmVar != null) {
                        of.pcc(gmVar.wh());
                        vj.pcc("compliance_status", gmVar.wh(), -1, iOException != null ? iOException.getMessage() : null, null, null);
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
        int kj = sf.pcc().kj();
        if (jSONObject.has("user_compliance_status")) {
            kj = jSONObject.optInt("user_compliance_status", -1);
            sf.pcc().sf(kj);
        }
        if (jSONObject.has("user_compliance_status_reason")) {
            sf.pcc().pcc(jSONObject.optString("user_compliance_status_reason", ""));
        }
        if (jSONObject.has("allow_req_time")) {
            sf.pcc().pcc(jSONObject.optLong("allow_req_time", sf.pcc.longValue()));
        }
        return kj == 1 || kj == 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf() {
        if (sf.pcc().ork()) {
            if (this.pcc.incrementAndGet() <= 3) {
                jr.sf().removeCallbacks(this.oo);
                jr.sf().postDelayed(this.oo, r0 * 10000);
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
            jSONObject.put("tcstring", vh.sf(lu.pcc()));
            jSONObject.put("tcf_gdpr", vh.pcc(lu.pcc()));
            jSONObject.put(L6.X0, com.bytedance.sdk.openadsdk.fum.pcc.sf.pcc.pcc().sf());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
