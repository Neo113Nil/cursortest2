package com.bytedance.sdk.component.adexpress.dynamic.oo;

import android.text.TextUtils;
import io.ktor.sse.ServerSentEventKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class kj {
    private boolean gbb;
    private float gm;
    private String hc;
    private float kj;
    private float oo;
    private List<kj> ork;
    private String pcc;
    private float qf;
    private float sf;
    private List<List<kj>> tmg;
    private kj vh;
    private float vj;
    private vj vy;
    private float wh;
    private Map<String, String> jr = new HashMap();
    private Map<Integer, String> dax = new HashMap();

    public String pcc() {
        return this.hc;
    }

    public void pcc(String str) {
        this.hc = str;
    }

    public Map<Integer, String> sf() {
        return this.dax;
    }

    public void pcc(JSONArray jSONArray) {
        if (jSONArray != null) {
            try {
                if (jSONArray.length() == 0) {
                    return;
                }
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    this.dax.put(Integer.valueOf(optJSONObject.optInt("id")), optJSONObject.optString("value"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public String gm() {
        return this.pcc;
    }

    public void sf(String str) {
        this.pcc = str;
    }

    public float oo() {
        return this.oo;
    }

    public void pcc(float f) {
        this.oo = f;
    }

    public float vj() {
        return this.vj;
    }

    public void sf(float f) {
        this.vj = f;
    }

    public float wh() {
        return this.sf;
    }

    public void gm(float f) {
        this.sf = f;
    }

    public float qf() {
        return this.gm;
    }

    public void oo(float f) {
        this.gm = f;
    }

    public float kj() {
        return this.wh;
    }

    public void vj(float f) {
        this.wh = f;
    }

    public float vy() {
        return this.qf;
    }

    public void wh(float f) {
        this.qf = f;
    }

    public void qf(float f) {
        this.kj = f;
    }

    public vj ork() {
        return this.vy;
    }

    public void pcc(vj vjVar) {
        this.vy = vjVar;
    }

    public List<kj> vh() {
        return this.ork;
    }

    public void pcc(List<kj> list) {
        this.ork = list;
    }

    public void pcc(kj kjVar) {
        this.vh = kjVar;
    }

    public kj tmg() {
        return this.vh;
    }

    public int hc() {
        wh vj = this.vy.vj();
        return vj.fmh() + vj.zsj();
    }

    public int gbb() {
        wh vj = this.vy.vj();
        return vj.ri() + vj.hpk();
    }

    public float jr() {
        wh vj = this.vy.vj();
        return hc() + vj.jr() + vj.dax() + (vj.tmg() * 2.0f);
    }

    public float dax() {
        wh vj = this.vy.vj();
        return gbb() + vj.nac() + vj.gbb() + (vj.tmg() * 2.0f);
    }

    public void sf(List<List<kj>> list) {
        this.tmg = list;
    }

    public List<List<kj>> nac() {
        return this.tmg;
    }

    public boolean lu() {
        List<kj> list = this.ork;
        return list == null || list.size() <= 0;
    }

    public boolean gpj() {
        return this.gbb;
    }

    public void pcc(boolean z) {
        this.gbb = z;
    }

    public Map<String, String> lo() {
        return this.jr;
    }

    public void pcc(String str, String str2) {
        this.jr.put(str, str2);
    }

    public void fum() {
        List<List<kj>> list = this.tmg;
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (List<kj> list2 : this.tmg) {
            if (list2 != null && list2.size() > 0) {
                arrayList.add(list2);
            }
        }
        this.tmg = arrayList;
    }

    public boolean tz() {
        return TextUtils.equals(this.vy.vj().mk(), "flex");
    }

    public String of() {
        return this.vy.vj().of();
    }

    public void gm(String str) {
        this.vy.vj().wh(str);
    }

    public String toString() {
        return "DynamicLayoutUnit{id='" + this.pcc + "', x=" + this.sf + ", y=" + this.gm + ", width=" + this.wh + ", height=" + this.qf + ", remainWidth=" + this.kj + ", rootBrick=" + this.vy + ", childrenBrickUnits=" + this.ork + AbstractJsonLexerKt.END_OBJ;
    }

    public boolean yt() {
        return this.vy.vj().qc() < 0 || this.vy.vj().wax() < 0 || this.vy.vj().ra() < 0 || this.vy.vj().rt() < 0;
    }

    public String pcc(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.vy.sf());
        sb.append(ServerSentEventKt.COLON);
        sb.append(this.pcc);
        if (this.vy.vj() != null) {
            sb.append(ServerSentEventKt.COLON);
            sb.append(this.vy.vj().kez());
        }
        sb.append(ServerSentEventKt.COLON);
        sb.append(i);
        return sb.toString();
    }
}
