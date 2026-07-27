package com.bytedance.sdk.openadsdk.core.hc.oo;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.adsdk.ugeno.core.dax;
import com.bytedance.adsdk.ugeno.core.hc;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.hc.oo.pcc;
import com.bytedance.sdk.openadsdk.core.hc.pcc.sf;
import com.bytedance.sdk.openadsdk.core.hc.qf.oo;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.rnn;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf implements dax, pcc.InterfaceC0154pcc {
    protected static int pcc = 8;
    private float dax;
    private float gbb;
    private final Activity gm;
    private long gpj;
    private View hc;
    private float jr;
    private String kj;
    private boolean lo = true;
    private long lu;
    private float nac;
    private final of oo;
    private final com.bytedance.sdk.openadsdk.core.hc.qf.sf ork;
    private String qf;
    private pcc sf;
    private String tmg;
    private com.bytedance.sdk.openadsdk.core.hc.qf.pcc vh;
    private final com.bytedance.sdk.openadsdk.core.hc.kj.pcc vj;
    private JSONObject vy;
    private String wh;

    public sf(Activity activity, of ofVar, com.bytedance.sdk.openadsdk.core.hc.kj.pcc pccVar, String str, com.bytedance.sdk.openadsdk.core.hc.qf.sf sfVar) {
        this.gm = activity;
        this.tmg = str;
        this.oo = ofVar;
        this.ork = sfVar;
        this.vj = pccVar;
    }

    public void pcc() {
        if (this.oo == null) {
            this.ork.pcc(1, "material is null", "net");
            return;
        }
        if (this.vj == null) {
            this.ork.pcc(1, "material ugen template is null", "net");
            return;
        }
        this.sf = new pcc(this.gm);
        this.kj = this.vj.gm();
        this.wh = this.vj.pcc();
        this.qf = this.vj.sf();
        this.vy = this.oo.hc(true);
        this.ork.pcc(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD);
        com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc().pcc(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, this.kj, this.wh, this.qf, "", new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.hc.oo.sf.1
            @Override // com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc
            public void pcc(JSONObject jSONObject, String str) {
                sf sfVar = sf.this;
                sfVar.pcc(jSONObject, sfVar.vy);
                sf.this.ork.sf(str);
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.pcc.sf.pcc
            public void pcc(int i, String str, String str2) {
                sf.this.ork.pcc(i, str, str2);
            }
        });
    }

    public void pcc(View view) {
        this.hc = view;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.hc.qf.pcc pccVar) {
        this.vh = pccVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(JSONObject jSONObject, JSONObject jSONObject2) {
        this.sf.pcc((pcc.InterfaceC0154pcc) this);
        this.sf.pcc((dax) this);
        this.ork.pcc();
        this.sf.pcc(jSONObject, jSONObject2, new oo() { // from class: com.bytedance.sdk.openadsdk.core.hc.oo.sf.2
            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.oo
            public void pcc(int i, String str) {
                if (sf.this.ork != null) {
                    sf.this.ork.pcc(i, str);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.hc.qf.oo
            public void pcc(gm<View> gmVar) {
                if (sf.this.ork != null) {
                    sf.this.ork.pcc(gmVar);
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.oo.pcc.InterfaceC0154pcc
    public void pcc(hc hcVar) {
        String optString = hcVar.gm().optString("type");
        optString.hashCode();
        switch (optString) {
            case "privacy":
                if (this.gm != null && !TextUtils.isEmpty(lu.oo().lrr())) {
                    if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                        IABLandingPageActivity.pcc(this.gm, this.oo, this.tmg);
                        break;
                    } else {
                        TTWebsiteActivity.pcc(this.gm, this.oo, this.tmg);
                        break;
                    }
                }
                break;
            case "close":
                com.bytedance.sdk.openadsdk.core.hc.qf.pcc pccVar = this.vh;
                if (pccVar != null) {
                    pccVar.sf();
                    break;
                }
                break;
            case "creative":
                if (this.gm != null && this.oo != null) {
                    sf();
                    ComponentCallbacks2 componentCallbacks2 = this.gm;
                    if (componentCallbacks2 instanceof com.bytedance.sdk.openadsdk.core.jr.oo.sf) {
                        ((com.bytedance.sdk.openadsdk.core.jr.oo.sf) componentCallbacks2).qcw();
                    }
                    pcc(hcVar, this.oo);
                    break;
                }
                break;
        }
    }

    private void sf() {
        int az = this.oo.az();
        if (az != 2 && az != 3) {
            if (az == 4) {
                com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.gm, this.tmg).pcc(this.oo);
                return;
            } else {
                if (az != 5) {
                    return;
                }
                kun.sf(this.gm, this.oo.ln());
                return;
            }
        }
        if (az == 3) {
            String xy = this.oo.xy();
            if (!TextUtils.isEmpty(xy) && xy.contains("play.google.com/store")) {
                if (com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf.pcc(this.gm, xy, xy.substring(xy.indexOf("?id=") + 4), this.tmg, this.oo)) {
                    return;
                }
            }
        }
        Activity activity = this.gm;
        of ofVar = this.oo;
        int pcc2 = kun.pcc(this.tmg);
        String str = this.tmg;
        rnn.pcc(activity, ofVar, pcc2, null, null, str, com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.gm, str), true, 0);
    }

    private void pcc(hc hcVar, of ofVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("down_x", this.gbb);
            jSONObject.put("down_y", this.jr);
            jSONObject.put("down_time", this.lu);
            jSONObject.put("up_x", this.dax);
            jSONObject.put("up_y", this.nac);
            jSONObject.put("up_time", this.gpj);
            View vh = hcVar.pcc().vh();
            int i = 1;
            if (vh != null) {
                JSONObject jSONObject2 = new JSONObject();
                int[] iArr = new int[2];
                float width = vh.getWidth();
                float height = vh.getHeight();
                vh.getLocationOnScreen(iArr);
                float f = iArr[0];
                float f2 = iArr[1];
                jSONObject2.put("width", width);
                jSONObject2.put("height", height);
                jSONObject2.put("left", f);
                jSONObject2.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, f2);
                jSONObject.put("rectInfo", jSONObject2);
            }
            View view = this.hc;
            if (view != null) {
                int[] iArr2 = new int[2];
                view.getLocationOnScreen(iArr2);
                jSONObject.put("button_x", iArr2[0]);
                jSONObject.put("button_y", iArr2[1]);
                jSONObject.put("button_width", this.hc.getWidth());
                jSONObject.put("button_height", this.hc.getHeight());
            }
            View findViewById = this.gm.findViewById(R.id.content);
            if (findViewById != null) {
                int[] iArr3 = new int[2];
                findViewById.getLocationOnScreen(iArr3);
                jSONObject.put("ad_x", iArr3[0]);
                jSONObject.put("ad_y", iArr3[1]);
                jSONObject.put("width", findViewById.getWidth());
                jSONObject.put("height", findViewById.getHeight());
            }
            jSONObject.put("click_area_type", hcVar.pcc().mu());
            jSONObject.put("brick_id", hcVar.pcc().pq());
            jSONObject.put("endcard_id", this.wh);
            jSONObject.put("click_scence", 2);
            if (!this.lo) {
                i = 2;
            }
            jSONObject.put("user_behavior_type", i);
            com.bytedance.sdk.openadsdk.core.hc.qf.pcc pccVar = this.vh;
            if (pccVar != null) {
                jSONObject.put("endcard_type", pccVar.pcc());
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(ofVar, this.tmg, "click", jSONObject);
        } catch (JSONException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.core.dax
    public void pcc(gm gmVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.lu = System.currentTimeMillis();
            this.gbb = motionEvent.getRawX();
            this.jr = motionEvent.getRawY();
            this.lo = true;
            return;
        }
        if (action != 1) {
            if (action != 2) {
                return;
            }
            if (Math.abs(motionEvent.getRawX() - this.gbb) >= pcc || Math.abs(motionEvent.getRawY() - this.jr) >= pcc) {
                this.lo = false;
                return;
            }
            return;
        }
        this.dax = motionEvent.getRawX();
        this.nac = motionEvent.getRawY();
        if (Math.abs(this.dax - this.gbb) >= pcc || Math.abs(this.nac - this.jr) >= pcc) {
            this.lo = false;
        }
        this.gpj = System.currentTimeMillis();
    }
}
