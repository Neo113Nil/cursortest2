package com.bytedance.sdk.openadsdk.core.model;

import android.util.SparseArray;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class tmg {
    private final String dax;
    private final int gbb;
    private final float gm;
    private final SparseArray<gm.pcc> hc;
    private final JSONObject jr;
    private final long kj;
    private final JSONObject nac;
    private final float oo;
    private final int ork;
    private final int[] pcc;
    private final long qf;
    private final int[] sf;
    private final int tmg;
    private final int vh;
    private final float vj;
    private final int vy;
    private final float wh;

    private tmg(pcc pccVar) {
        this.pcc = pccVar.ork;
        this.sf = pccVar.vh;
        this.gm = pccVar.vy;
        this.oo = pccVar.kj;
        this.vj = pccVar.qf;
        this.wh = pccVar.wh;
        this.qf = pccVar.vj;
        this.kj = pccVar.oo;
        this.vy = pccVar.tmg;
        this.ork = pccVar.hc;
        this.vh = pccVar.gbb;
        this.tmg = pccVar.dax;
        this.hc = pccVar.jr;
        this.dax = pccVar.nac;
        this.gbb = pccVar.lu;
        this.jr = pccVar.gpj;
        this.nac = pccVar.lo;
    }

    public JSONObject pcc() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = this.nac;
            if (jSONObject2 != null) {
                try {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        jSONObject.putOpt(next, this.nac.opt(next));
                    }
                } catch (Exception unused) {
                }
            }
            int[] iArr = this.pcc;
            if (iArr != null && iArr.length == 2) {
                jSONObject.putOpt("ad_x", Integer.valueOf(iArr[0])).putOpt("ad_y", Integer.valueOf(this.pcc[1]));
            }
            int[] iArr2 = this.sf;
            if (iArr2 != null && iArr2.length == 2) {
                jSONObject.putOpt("width", Integer.valueOf(iArr2[0])).putOpt("height", Integer.valueOf(this.sf[1]));
            }
            jSONObject.putOpt("down_x", Float.toString(this.gm)).putOpt("down_y", Float.toString(this.oo)).putOpt("up_x", Float.toString(this.vj)).putOpt("up_y", Float.toString(this.wh)).putOpt("down_time", Long.valueOf(this.qf)).putOpt("up_time", Long.valueOf(this.kj)).putOpt("toolType", Integer.valueOf(this.vy)).putOpt("deviceId", Integer.valueOf(this.ork)).putOpt("source", Integer.valueOf(this.vh)).putOpt("ft", pcc(this.hc, this.tmg)).putOpt("click_area_type", this.dax);
            int i = this.gbb;
            if (i > 0) {
                jSONObject.putOpt("areaType", Integer.valueOf(i));
            }
            JSONObject jSONObject3 = this.jr;
            if (jSONObject3 != null) {
                jSONObject.putOpt("rectInfo", jSONObject3);
            }
        } catch (Exception unused2) {
        }
        return jSONObject;
    }

    public static JSONObject pcc(SparseArray<gm.pcc> sparseArray, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            if (sparseArray != null) {
                for (int i2 = 0; i2 < sparseArray.size(); i2++) {
                    gm.pcc valueAt = sparseArray.valueAt(i2);
                    if (valueAt != null) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.putOpt("force", Double.valueOf(valueAt.gm)).putOpt("mr", Double.valueOf(valueAt.sf)).putOpt("phase", Integer.valueOf(valueAt.pcc)).putOpt("ts", Long.valueOf(valueAt.oo));
                        jSONArray.put(jSONObject2);
                        jSONObject.putOpt("ftc", Integer.valueOf(i)).putOpt("info", jSONArray);
                    }
                }
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static class pcc {
        private int dax;
        private int gbb;
        float gm;
        private JSONObject gpj;
        private int hc;
        private SparseArray<gm.pcc> jr;
        private float kj;
        private JSONObject lo;
        private int lu;
        private String nac;
        private long oo;
        private int[] ork;
        float pcc;
        private float qf;
        int sf;
        private int tmg;
        private int[] vh;
        private long vj;
        private float vy;
        private float wh;

        public pcc pcc(int i) {
            this.lu = i;
            return this;
        }

        public pcc pcc(JSONObject jSONObject) {
            this.gpj = jSONObject;
            return this;
        }

        public pcc sf(JSONObject jSONObject) {
            this.lo = jSONObject;
            return this;
        }

        public pcc sf(int i) {
            this.dax = i;
            return this;
        }

        public pcc pcc(SparseArray<gm.pcc> sparseArray) {
            this.jr = sparseArray;
            return this;
        }

        public pcc pcc(float f) {
            this.pcc = f;
            return this;
        }

        public pcc gm(int i) {
            this.sf = i;
            return this;
        }

        public pcc sf(float f) {
            this.gm = f;
            return this;
        }

        public pcc pcc(long j) {
            this.oo = j;
            return this;
        }

        public pcc sf(long j) {
            this.vj = j;
            return this;
        }

        public pcc gm(float f) {
            this.wh = f;
            return this;
        }

        public pcc oo(float f) {
            this.qf = f;
            return this;
        }

        public pcc vj(float f) {
            this.kj = f;
            return this;
        }

        public pcc wh(float f) {
            this.vy = f;
            return this;
        }

        public pcc pcc(int[] iArr) {
            this.ork = iArr;
            return this;
        }

        public pcc sf(int[] iArr) {
            this.vh = iArr;
            return this;
        }

        public pcc oo(int i) {
            this.tmg = i;
            return this;
        }

        public pcc vj(int i) {
            this.hc = i;
            return this;
        }

        public pcc wh(int i) {
            this.gbb = i;
            return this;
        }

        public pcc pcc(String str) {
            this.nac = str;
            return this;
        }

        public tmg pcc() {
            return new tmg(this);
        }
    }
}
