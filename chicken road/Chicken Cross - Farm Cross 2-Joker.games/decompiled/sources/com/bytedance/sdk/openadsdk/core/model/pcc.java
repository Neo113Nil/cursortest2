package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private String gm;
    private tz ork;
    private String pcc;
    private int sf;
    private of tmg;
    private String vh;
    private of vj;
    private int vy;
    private qy wh;
    private List<of> oo = new ArrayList();
    private JSONObject qf = new JSONObject();
    private volatile boolean kj = false;

    public JSONObject pcc() {
        return this.qf;
    }

    public void pcc(JSONObject jSONObject) {
        this.qf = jSONObject;
    }

    public String sf() {
        return this.pcc;
    }

    public String gm() {
        of qf = qf();
        if (qf != null) {
            return qf.qxv();
        }
        return "";
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public int oo() {
        return this.sf;
    }

    public void pcc(int i) {
        this.sf = i;
    }

    public void sf(String str) {
        this.gm = str;
    }

    public List<of> vj() {
        return this.oo;
    }

    public void pcc(of ofVar) {
        this.oo.add(ofVar);
        if (this.tmg == null) {
            this.tmg = ofVar;
        }
    }

    public void pcc(List<of> list) {
        this.oo = list;
        if (list.isEmpty()) {
            return;
        }
        this.tmg = list.get(0);
    }

    public static Map<String, of> pcc(pcc pccVar) {
        if (pccVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (of ofVar : pccVar.vj()) {
            if (!TextUtils.isEmpty(ofVar.cz())) {
                hashMap.put(ofVar.cz(), ofVar);
            }
        }
        if (hashMap.size() != 0) {
            return hashMap;
        }
        return null;
    }

    public boolean wh() {
        List<of> list = this.oo;
        return list != null && list.size() > 0;
    }

    public of qf() {
        if (this.oo.size() > 0) {
            return this.oo.get(0);
        }
        return null;
    }

    public tz kj() {
        return this.ork;
    }

    public void pcc(tz tzVar) {
        this.ork = tzVar;
    }

    public void sf(int i) {
        this.vy = i;
    }

    public boolean vy() {
        return this.vy == 1;
    }

    public of ork() {
        return this.tmg;
    }

    public void pcc(qy qyVar) {
        this.wh = qyVar;
    }

    public qy vh() {
        return this.wh;
    }

    public static pcc sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            pcc pccVar = new pcc();
            pccVar.pcc(tz.pcc(jSONObject.optJSONObject("loop_config")));
            pccVar.sf(jSONObject.optInt("multi_ad_style", 0));
            JSONArray optJSONArray = jSONObject.optJSONArray("creatives");
            if (optJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    of pcc = com.bytedance.sdk.openadsdk.core.sf.pcc(optJSONArray.optJSONObject(i), null, null, pccVar, i);
                    if (pcc != null) {
                        arrayList.add(pcc);
                    }
                }
                pccVar.pcc(arrayList);
            }
            pccVar.pcc(jSONObject.optString(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, ""));
            String optString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(optString)) {
                pccVar.pcc(qy.pcc(optString));
            }
            return pccVar;
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc("AdInfo", "fromJson: ", th);
            return null;
        }
    }

    public void gm(String str) {
        this.vh = str;
    }

    public String tmg() {
        return this.vh;
    }

    public of hc() {
        return this.vj;
    }

    public void sf(of ofVar) {
        this.vj = ofVar;
    }
}
