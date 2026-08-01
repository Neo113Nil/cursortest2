package com.bytedance.sdk.component.adexpress.pcc.gm;

import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.U3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private String gm;
    private List<C0119pcc> oo;
    private String pcc;
    private Map<String, pcc> qf = new ConcurrentHashMap();
    private String sf;
    private sf vj;
    private String wh;

    public Map<String, pcc> pcc() {
        return this.qf;
    }

    public String sf() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public String gm() {
        return this.sf;
    }

    public void sf(String str) {
        this.sf = str;
    }

    public String oo() {
        return this.gm;
    }

    public void gm(String str) {
        this.gm = str;
    }

    public void pcc(sf sfVar) {
        this.vj = sfVar;
    }

    public sf vj() {
        return this.vj;
    }

    public List<C0119pcc> wh() {
        if (this.oo == null) {
            this.oo = new ArrayList();
        }
        return this.oo;
    }

    public void pcc(List<C0119pcc> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.oo = list;
    }

    public void oo(String str) {
        this.wh = str;
    }

    public String qf() {
        return this.wh;
    }

    public boolean kj() {
        return (TextUtils.isEmpty(oo()) || TextUtils.isEmpty(gm()) || TextUtils.isEmpty(sf())) ? false : true;
    }

    public JSONObject vy() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("name", sf());
            jSONObject.putOpt("version", gm());
            jSONObject.putOpt(U3.i.Z, oo());
            if (!TextUtils.isEmpty(this.wh)) {
                jSONObject.put("template_fetch_url", this.wh);
            }
            JSONArray jSONArray = new JSONArray();
            if (wh() != null) {
                for (C0119pcc c0119pcc : wh()) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("url", c0119pcc.pcc());
                    jSONObject2.putOpt("md5", c0119pcc.sf());
                    jSONObject2.putOpt("level", Integer.valueOf(c0119pcc.gm()));
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.putOpt("resources", jSONArray);
            if (!this.qf.isEmpty()) {
                JSONObject jSONObject3 = new JSONObject();
                boolean z = false;
                for (String str : this.qf.keySet()) {
                    pcc pccVar = this.qf.get(str);
                    if (pccVar != null) {
                        jSONObject3.put(str, pccVar.vy());
                        z = true;
                    }
                }
                if (z) {
                    jSONObject.put("engines", jSONObject3);
                }
            }
            sf vj = vj();
            if (vj != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("url", vj.pcc);
                jSONObject4.put("md5", vj.sf);
                JSONObject jSONObject5 = new JSONObject();
                List<Pair<String, String>> sf2 = vj.sf();
                if (sf2 != null) {
                    for (Pair<String, String> pair : sf2) {
                        jSONObject5.put((String) pair.first, pair.second);
                    }
                }
                jSONObject4.put("map", jSONObject5);
                jSONObject.putOpt("resources_archive", jSONObject4);
            }
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String ork() {
        JSONObject vy;
        if (!kj() || (vy = vy()) == null) {
            return null;
        }
        return vy.toString();
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.pcc.gm.pcc$pcc, reason: collision with other inner class name */
    public static class C0119pcc {
        private int gm;
        private String pcc;
        private String sf;

        public boolean equals(Object obj) {
            String str;
            if (obj instanceof C0119pcc) {
                String str2 = this.pcc;
                if (str2 != null) {
                    C0119pcc c0119pcc = (C0119pcc) obj;
                    if (str2.equals(c0119pcc.pcc()) && (str = this.sf) != null && str.equals(c0119pcc.sf())) {
                        return true;
                    }
                }
                return false;
            }
            return super.equals(obj);
        }

        public String pcc() {
            return this.pcc;
        }

        public void pcc(String str) {
            this.pcc = str;
        }

        public String sf() {
            return this.sf;
        }

        public void sf(String str) {
            this.sf = str;
        }

        public int gm() {
            return this.gm;
        }

        public void pcc(int i) {
            this.gm = i;
        }
    }

    public static class sf {
        private List<Pair<String, String>> gm;
        private String pcc;
        private String sf;

        public String pcc() {
            return this.pcc;
        }

        public void pcc(String str) {
            this.pcc = str;
        }

        public void sf(String str) {
            this.sf = str;
        }

        public void pcc(List<Pair<String, String>> list) {
            this.gm = list;
        }

        public List<Pair<String, String>> sf() {
            return this.gm;
        }
    }

    public static pcc vj(String str) {
        if (str == null) {
            return null;
        }
        try {
            return pcc(new JSONObject(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static pcc pcc(JSONObject jSONObject) {
        JSONObject optJSONObject;
        if (jSONObject == null) {
            return null;
        }
        pcc pccVar = new pcc();
        pccVar.pcc(jSONObject.optString("name"));
        pccVar.sf(jSONObject.optString("version"));
        pccVar.gm(jSONObject.optString(U3.i.Z));
        pccVar.oo(jSONObject.optString("template_fetch_url", ""));
        JSONArray optJSONArray = jSONObject.optJSONArray("resources");
        ArrayList arrayList = new ArrayList();
        if (optJSONArray != null && optJSONArray.length() > 0) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                C0119pcc c0119pcc = new C0119pcc();
                c0119pcc.pcc(optJSONObject2.optString("url"));
                c0119pcc.sf(optJSONObject2.optString("md5"));
                c0119pcc.pcc(optJSONObject2.optInt("level"));
                arrayList.add(c0119pcc);
            }
        }
        pccVar.pcc(arrayList);
        try {
            JSONObject optJSONObject3 = jSONObject.optJSONObject("engines");
            if (optJSONObject3 != null) {
                Iterator<String> keys = optJSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    pcc pcc = pcc(optJSONObject3.optJSONObject(next));
                    if (pcc != null) {
                        pccVar.pcc().put(next, pcc);
                    }
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        if (jSONObject.has("resources_archive") && (optJSONObject = jSONObject.optJSONObject("resources_archive")) != null) {
            sf sfVar = new sf();
            sfVar.pcc(optJSONObject.optString("url"));
            sfVar.sf(optJSONObject.optString("md5"));
            JSONObject optJSONObject4 = optJSONObject.optJSONObject("map");
            if (optJSONObject4 != null) {
                Iterator<String> keys2 = optJSONObject4.keys();
                ArrayList arrayList2 = new ArrayList();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    arrayList2.add(new Pair<>(next2, optJSONObject4.optString(next2)));
                }
                sfVar.pcc(arrayList2);
            }
            pccVar.pcc(sfVar);
        }
        if (pccVar.kj()) {
            return pccVar;
        }
        return null;
    }
}
