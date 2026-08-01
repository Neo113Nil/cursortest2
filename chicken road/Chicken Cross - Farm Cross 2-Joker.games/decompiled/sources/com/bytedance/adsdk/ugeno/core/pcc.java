package com.bytedance.adsdk.ugeno.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private List<C0102pcc> gm;
    private long oo;
    private String pcc;
    private float sf;
    private long vj;
    private String wh;

    public String pcc() {
        return this.pcc;
    }

    public void pcc(String str) {
        this.pcc = str;
    }

    public void pcc(float f) {
        this.sf = f;
    }

    public float sf() {
        return this.sf;
    }

    public List<C0102pcc> gm() {
        return this.gm;
    }

    public void pcc(List<C0102pcc> list) {
        this.gm = list;
    }

    public long oo() {
        return this.oo;
    }

    public void pcc(long j) {
        this.oo = j;
    }

    public long vj() {
        return this.vj;
    }

    public void sf(long j) {
        this.vj = j;
    }

    public String wh() {
        return this.wh;
    }

    public void sf(String str) {
        this.wh = str;
    }

    public static pcc pcc(String str, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return pcc(new JSONObject(str), gmVar);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static pcc pcc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        return pcc(jSONObject, null, gmVar);
    }

    public static pcc pcc(JSONObject jSONObject, JSONObject jSONObject2, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        if (jSONObject == null) {
            return null;
        }
        pcc pccVar = new pcc();
        pccVar.pcc(jSONObject.optString("ordering"));
        String optString = jSONObject.optString("loop");
        if (TextUtils.equals("infinite", optString)) {
            pccVar.pcc(-1.0f);
        } else {
            try {
                pccVar.pcc(Float.parseFloat(optString));
            } catch (NumberFormatException unused) {
                pccVar.pcc(0.0f);
            }
        }
        pccVar.pcc(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION, 0L));
        pccVar.sf(com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("startDelay"), gmVar.tmg()), 0L));
        pccVar.sf(jSONObject.optString("loopMode"));
        JSONArray optJSONArray = jSONObject.optJSONArray("animators");
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (jSONObject2 != null) {
                    com.bytedance.adsdk.ugeno.qf.sf.pcc(jSONObject2, optJSONObject);
                }
                arrayList.add(C0102pcc.pcc(optJSONObject, gmVar));
            }
            pccVar.pcc(arrayList);
        }
        return pccVar;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.core.pcc$pcc, reason: collision with other inner class name */
    public static class C0102pcc {
        private String gm;
        private float[] kj;
        private long oo;
        private String ork;
        private long pcc;
        private float qf;
        private float sf;
        private String vj;
        private String vy;
        private float wh;

        public long pcc() {
            return this.pcc;
        }

        public void pcc(long j) {
            this.pcc = j;
        }

        public float sf() {
            return this.sf;
        }

        public void pcc(float f) {
            this.sf = f;
        }

        public String gm() {
            return this.gm;
        }

        public void pcc(String str) {
            this.gm = str;
        }

        public long oo() {
            return this.oo;
        }

        public void sf(long j) {
            this.oo = j;
        }

        public String vj() {
            return this.vj;
        }

        public void sf(String str) {
            this.vj = str;
        }

        public float wh() {
            return this.wh;
        }

        public void sf(float f) {
            this.wh = f;
        }

        public float qf() {
            return this.qf;
        }

        public void gm(float f) {
            this.qf = f;
        }

        public float[] kj() {
            return this.kj;
        }

        public void pcc(float[] fArr) {
            this.kj = fArr;
        }

        public String vy() {
            return this.vy;
        }

        public String ork() {
            return this.ork;
        }

        public void gm(String str) {
            this.ork = str;
        }

        public void oo(String str) {
            this.vy = str;
        }

        public static C0102pcc pcc(JSONObject jSONObject, com.bytedance.adsdk.ugeno.sf.gm gmVar) {
            if (jSONObject == null) {
                return null;
            }
            C0102pcc c0102pcc = new C0102pcc();
            c0102pcc.pcc(jSONObject.optLong(IronSourceConstants.EVENTS_DURATION));
            String optString = jSONObject.optString("loop");
            if (TextUtils.equals("infinite", optString)) {
                c0102pcc.pcc(-1.0f);
            } else {
                try {
                    c0102pcc.pcc(Float.parseFloat(optString));
                } catch (NumberFormatException unused) {
                    c0102pcc.pcc(0.0f);
                }
            }
            c0102pcc.pcc(jSONObject.optString("loopMode"));
            c0102pcc.sf(jSONObject.optString("type"));
            if (TextUtils.equals(c0102pcc.vj(), "ripple")) {
                c0102pcc.gm(jSONObject.optString("rippleColor"));
            }
            View vh = gmVar.vh();
            Context context = vh != null ? vh.getContext() : null;
            if (TextUtils.equals(c0102pcc.vj(), "backgroundColor")) {
                String pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("valueTo"), gmVar.tmg());
                int pcc2 = com.bytedance.adsdk.ugeno.qf.pcc.pcc(jSONObject.optString("valueFrom"));
                int pcc3 = com.bytedance.adsdk.ugeno.qf.pcc.pcc(pcc);
                c0102pcc.sf(pcc2);
                c0102pcc.gm(pcc3);
            } else if ((TextUtils.equals(c0102pcc.vj(), "translateX") || TextUtils.equals(c0102pcc.vj(), "translateY")) && context != null) {
                try {
                    float pcc4 = com.bytedance.adsdk.ugeno.qf.kj.pcc(context, (float) jSONObject.optDouble("valueFrom"));
                    float pcc5 = com.bytedance.adsdk.ugeno.qf.kj.pcc(context, (float) jSONObject.optDouble("valueTo"));
                    c0102pcc.sf(pcc4);
                    c0102pcc.gm(pcc5);
                } catch (Exception unused2) {
                    Log.e("animation", "animation ");
                }
            } else {
                c0102pcc.sf((float) jSONObject.optDouble("valueFrom"));
                c0102pcc.gm((float) jSONObject.optDouble("valueTo"));
            }
            c0102pcc.oo(jSONObject.optString("interpolator"));
            String pcc6 = com.bytedance.adsdk.ugeno.gm.sf.pcc(jSONObject.optString("startDelay"), gmVar.tmg());
            Log.d("TAG", "createAnimationModel: ");
            c0102pcc.sf(com.bytedance.adsdk.ugeno.qf.gm.pcc(pcc6, 0L));
            JSONArray optJSONArray = jSONObject.optJSONArray("values");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                float[] fArr = new float[optJSONArray.length()];
                int i = 0;
                if ((TextUtils.equals(c0102pcc.vj(), "translateX") || TextUtils.equals(c0102pcc.vj(), "translateY")) && context != null) {
                    while (i < optJSONArray.length()) {
                        fArr[i] = com.bytedance.adsdk.ugeno.qf.kj.pcc(context, (float) pcc.pcc(optJSONArray.optString(i), gmVar.tmg()));
                        i++;
                    }
                } else {
                    while (i < optJSONArray.length()) {
                        fArr[i] = (float) pcc.pcc(optJSONArray.optString(i), gmVar.tmg());
                        i++;
                    }
                }
                c0102pcc.pcc(fArr);
            }
            return c0102pcc;
        }
    }

    public static double pcc(Object obj, JSONObject jSONObject) {
        if (obj instanceof String) {
            return com.bytedance.adsdk.ugeno.qf.gm.pcc(com.bytedance.adsdk.ugeno.gm.sf.pcc((String) obj, jSONObject), 0.0d);
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Long) {
            return ((Double) obj).doubleValue();
        }
        if (obj instanceof Integer) {
            return ((Double) obj).doubleValue();
        }
        return 0.0d;
    }
}
