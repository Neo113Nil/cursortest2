package com.bytedance.sdk.openadsdk.tz.sf;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private List<C0206pcc> gm;
    private String pcc;
    private List<C0206pcc> sf;

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(List<C0206pcc> list) {
        this.sf = list;
    }

    public void sf(List<C0206pcc> list) {
        this.gm = list;
    }

    public String pcc() {
        return this.pcc;
    }

    public List<C0206pcc> sf() {
        return this.sf;
    }

    public List<C0206pcc> gm() {
        return this.gm;
    }

    public static pcc sf(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            pcc pccVar = new pcc();
            pccVar.pcc(jSONObject.optString("version"));
            JSONArray optJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    C0206pcc pcc = C0206pcc.pcc(optJSONArray.optJSONObject(i));
                    if (pcc != null) {
                        if (pcc.gm == 1) {
                            arrayList.add(pcc);
                        } else if (pcc.gm == 2 && arrayList2.size() < 10) {
                            arrayList2.add(pcc);
                        }
                    }
                }
            }
            pccVar.pcc(arrayList);
            pccVar.sf(arrayList2);
            return pccVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.tz.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0206pcc {
        private int gm;
        private String pcc;
        private String sf;

        public static C0206pcc pcc(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0206pcc c0206pcc = new C0206pcc();
            c0206pcc.pcc = jSONObject.optString("url");
            c0206pcc.sf = jSONObject.optString("md5");
            c0206pcc.gm = jSONObject.optInt("type");
            return c0206pcc;
        }

        public String pcc() {
            return this.pcc;
        }

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0206pcc) {
                String str2 = this.pcc;
                if (str2 != null) {
                    C0206pcc c0206pcc = (C0206pcc) obj;
                    if (str2.equals(c0206pcc.pcc) && (str = this.sf) != null && str.equals(c0206pcc.sf)) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }
    }
}
