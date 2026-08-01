package com.bytedance.adsdk.ugeno.pcc.pcc;

import android.animation.PropertyValuesHolder;
import android.graphics.Canvas;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class pcc {
    private String gm;
    protected JSONObject pcc;
    protected com.bytedance.adsdk.ugeno.sf.gm sf;

    public abstract List<PropertyValuesHolder> gm();

    public abstract void pcc(int i, int i2);

    public abstract void pcc(Canvas canvas);

    public abstract void sf();

    public abstract void sf(Canvas canvas);

    public pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
        this.pcc = jSONObject;
        this.sf = gmVar;
        pcc();
    }

    public void pcc() {
        this.gm = this.pcc.optString("type");
        sf();
    }

    public String oo() {
        return this.gm;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.pcc.pcc.pcc$pcc, reason: collision with other inner class name */
    public static class C0107pcc {
        public static pcc pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, JSONObject jSONObject) {
            if (gmVar == null || jSONObject == null) {
                return null;
            }
            String optString = jSONObject.optString("type");
            optString.hashCode();
            switch (optString) {
                case "stretch":
                    return new vj(gmVar, jSONObject);
                case "ripple":
                    return new sf(gmVar, jSONObject);
                case "rub_in":
                    return new gm(gmVar, jSONObject);
                case "shine":
                    return new oo(gmVar, jSONObject);
                default:
                    return null;
            }
        }
    }
}
