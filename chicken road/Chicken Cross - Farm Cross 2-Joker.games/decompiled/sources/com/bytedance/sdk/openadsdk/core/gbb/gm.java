package com.bytedance.sdk.openadsdk.core.gbb;

import com.bytedance.sdk.openadsdk.core.gbb.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.sf.gm;
import com.bytedance.sdk.openadsdk.core.model.of;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    protected pcc.EnumC0147pcc gm;
    protected String kj;
    protected pcc.sf oo;
    private String ork;
    protected int pcc;
    protected List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> qf;
    protected int sf;
    private of tmg;
    protected String vj;
    protected List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> wh;
    private final AtomicBoolean vh = new AtomicBoolean(false);
    protected String vy = "endcard_click";

    public gm(int i, int i2, pcc.EnumC0147pcc enumC0147pcc, pcc.sf sfVar, String str, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list, List<com.bytedance.sdk.openadsdk.core.gbb.sf.gm> list2, String str2) {
        this.wh = new ArrayList();
        this.qf = new ArrayList();
        this.pcc = i;
        this.sf = i2;
        this.gm = enumC0147pcc;
        this.oo = sfVar;
        this.vj = str;
        this.wh = list;
        this.qf = list2;
        this.kj = str2;
    }

    public int pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.sf;
    }

    public void pcc(long j) {
        com.bytedance.sdk.openadsdk.core.gbb.sf.gm.pcc(null, this.wh, null, j, this.ork, new gm.sf(this.vy, this.tmg), null);
    }

    public void sf(long j) {
        if (this.vh.compareAndSet(false, true)) {
            com.bytedance.sdk.openadsdk.core.gbb.sf.gm.sf((of) null, this.qf, (com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc) null, j, this.ork, (String) null);
        }
    }

    public static float pcc(int i, int i2, int i3, int i4, pcc.sf sfVar, pcc.EnumC0147pcc enumC0147pcc) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = i;
        float f2 = i3;
        return pcc(sfVar, enumC0147pcc) / ((Math.abs((f / i2) - (f2 / i4)) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbb.gm$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[pcc.sf.values().length];
            pcc = iArr;
            try {
                iArr[pcc.sf.STATIC_RESOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[pcc.sf.HTML_RESOURCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[pcc.sf.IFRAME_RESOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static float pcc(pcc.sf sfVar, pcc.EnumC0147pcc enumC0147pcc) {
        int i = AnonymousClass1.pcc[sfVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        }
        if (pcc.EnumC0147pcc.JAVASCRIPT.equals(enumC0147pcc)) {
            return 1.0f;
        }
        return pcc.EnumC0147pcc.IMAGE.equals(enumC0147pcc) ? 0.8f : 0.0f;
    }

    public String gm() {
        int i = AnonymousClass1.pcc[this.oo.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.vj;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.pcc + "\" height=\"" + this.sf + "\" src=\"" + this.vj + "\"></iframe>";
        }
        if (this.gm == pcc.EnumC0147pcc.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.vj + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        }
        if (this.gm == pcc.EnumC0147pcc.JAVASCRIPT) {
            return "<script src=\"" + this.vj + "\"></script>";
        }
        return null;
    }

    public String oo() {
        if (this.oo == pcc.sf.STATIC_RESOURCE && this.gm == pcc.EnumC0147pcc.IMAGE) {
            return this.vj;
        }
        return null;
    }

    public String vj() {
        return this.vj;
    }

    public void pcc(String str) {
        this.ork = str;
    }

    public static gm sf(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString("creativeType", pcc.EnumC0147pcc.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", pcc.sf.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new gm.pcc(optJSONArray.optString(i)).pcc());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new gm.pcc(optJSONArray2.optString(i2)).pcc());
        }
        return new gm(optInt, optInt2, pcc.EnumC0147pcc.valueOf(optString), pcc.sf.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    public void pcc(of ofVar) {
        this.tmg = ofVar;
    }
}
