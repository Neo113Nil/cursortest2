package com.bytedance.sdk.openadsdk.core.gbb.sf;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.openadsdk.core.gbb.sf.pcc;
import com.bytedance.sdk.openadsdk.core.gbb.sf.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import io.ktor.sse.ServerSentEventKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private static final Map<String, sf> pcc = new ConcurrentHashMap();
    private static final AtomicBoolean sf = new AtomicBoolean(false);
    private final String gm;
    private final boolean oo;
    private EnumC0148gm vj;
    private boolean wh;

    /* renamed from: com.bytedance.sdk.openadsdk.core.gbb.sf.gm$gm, reason: collision with other inner class name */
    enum EnumC0148gm {
        TRACKING_URL,
        QUARTILE_EVENT
    }

    static {
        jsj.pcc(new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.gbb.sf.gm.1
            @Override // com.bytedance.sdk.component.utils.jsj.pcc
            public void pcc(Context context, Intent intent, boolean z, int i) {
                if (i == 0 || gm.pcc.size() <= 0) {
                    return;
                }
                gm.qf();
            }
        }, lu.pcc());
    }

    protected gm(String str, EnumC0148gm enumC0148gm, Boolean bool) {
        this.gm = str;
        this.vj = enumC0148gm;
        this.oo = bool.booleanValue();
    }

    public static List<String> pcc(of ofVar, List<gm> list, com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar, long j, String str, String str2) {
        if (list == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (gm gmVar : list) {
            if (gmVar != null && (!gmVar.oo() || gmVar.gm())) {
                arrayList.add(gmVar.sf());
                gmVar.l_();
            }
        }
        return arrayList.isEmpty() ? arrayList : new com.bytedance.sdk.openadsdk.core.gbb.gm.gm(arrayList, ofVar).pcc(pccVar).pcc(j).sf(str).pcc(str2).pcc();
    }

    public static boolean pcc(of ofVar, List<gm> list, com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar, long j, String str, sf sfVar, String str2) {
        List<String> pcc2 = pcc(ofVar, list, pccVar, j, str, str2);
        pcc(pcc2, sfVar);
        return !pcc2.isEmpty();
    }

    public static void sf(of ofVar, List<gm> list, com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc pccVar, long j, String str, String str2) {
        pcc(ofVar, list, pccVar, j, str, null, str2);
    }

    public static void pcc(List<String> list, sf sfVar) {
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            if (!TextUtils.isEmpty(str)) {
                pcc(str, sfVar, false);
            }
        }
    }

    private static void pcc(final String str, final sf sfVar, final boolean z) {
        com.bytedance.sdk.component.qf.sf.sf gm = com.bytedance.sdk.openadsdk.lo.sf.sf().gm().gm();
        if (gm == null) {
            return;
        }
        gm.pcc(true);
        gm.gm(str);
        gm.sf(new com.bytedance.sdk.component.qf.pcc.pcc() { // from class: com.bytedance.sdk.openadsdk.core.gbb.sf.gm.2
            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, com.bytedance.sdk.component.qf.sf sfVar2) {
                String str2;
                boolean z2;
                sf sfVar3 = sf.this;
                if (sfVar3 == null || sfVar3.pcc == null) {
                    return;
                }
                String str3 = null;
                if (sfVar2 == null || !sfVar2.wh()) {
                    if (sfVar2 != null) {
                        str3 = sfVar2.pcc() + ServerSentEventKt.COLON + sfVar2.sf();
                        if (!z && (sfVar2.pcc() <= 300 || sfVar2.pcc() >= 400)) {
                            gm.pcc.put(str, sf.this);
                        }
                    }
                    str2 = str3;
                    z2 = false;
                } else {
                    z2 = true;
                    str2 = null;
                }
                gm.sf(z2, str2, kun.gm(sf.this.pcc.hh()), sf.this, str, z);
                if (!z2 || gm.pcc.isEmpty()) {
                    return;
                }
                gm.qf();
            }

            @Override // com.bytedance.sdk.component.qf.pcc.pcc
            public void pcc(com.bytedance.sdk.component.qf.sf.gm gmVar, IOException iOException) {
                sf sfVar2 = sf.this;
                if (sfVar2 != null && sfVar2.pcc != null) {
                    gm.sf(false, iOException != null ? iOException.getMessage() : null, kun.gm(sf.this.pcc.hh()), sf.this, str, z);
                }
                if (z || sf.this == null) {
                    return;
                }
                gm.pcc.put(str, sf.this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void qf() {
        if (sf.compareAndSet(false, true)) {
            Map<String, sf> map = pcc;
            HashSet<Map.Entry> hashSet = new HashSet(map.entrySet());
            map.clear();
            for (Map.Entry entry : hashSet) {
                if (entry != null) {
                    pcc((String) entry.getKey(), (sf) entry.getValue(), true);
                }
            }
            sf.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void sf(final boolean z, final String str, final String str2, final sf sfVar, final String str3, final boolean z2) {
        if (sfVar == null || sfVar.pcc == null) {
            return;
        }
        final boolean on = sfVar.pcc.on();
        final String str4 = on ? "dsp_track_link_result" : "track_link_result";
        com.bytedance.sdk.openadsdk.oo.gm.pcc(new com.bytedance.sdk.component.kj.sf.gm(str4) { // from class: com.bytedance.sdk.openadsdk.core.gbb.sf.gm.3
            @Override // java.lang.Runnable
            public void run() {
                final JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("type", sfVar.sf);
                    jSONObject.put("success", z);
                    jSONObject.put("url", str3);
                    if (on) {
                        if (!TextUtils.isEmpty(str)) {
                            jSONObject.put("description", str);
                        }
                        if (sfVar.gm >= 0.0f) {
                            jSONObject.put(NotificationCompat.CATEGORY_PROGRESS, Math.round(sfVar.gm * 100.0f) / 100.0d);
                        }
                    }
                } catch (Throwable unused) {
                }
                com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), sfVar.pcc, str2, str4, new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.gbb.sf.gm.3.1
                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject gm() {
                        return jSONObject;
                    }

                    @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
                    public JSONObject pcc() {
                        if (!z2) {
                            return null;
                        }
                        try {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("retry", true);
                            return jSONObject2;
                        } catch (Throwable unused2) {
                            return null;
                        }
                    }
                });
            }
        });
    }

    public static List<gm> pcc(JSONArray jSONArray) {
        return pcc(jSONArray, false);
    }

    public static List<gm> pcc(JSONArray jSONArray, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                String optString = jSONArray.optString(i);
                if (!TextUtils.isEmpty(optString)) {
                    arrayList.add(new pcc(optString).pcc(z).pcc());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.gbb.sf.sf> sf(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new sf.pcc(optJSONObject.optString("content"), (float) optJSONObject.optDouble("trackingFraction", 0.0d)).pcc());
                }
            }
        }
        return arrayList;
    }

    public static List<com.bytedance.sdk.openadsdk.core.gbb.sf.pcc> gm(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    arrayList.add(new pcc.C0149pcc(optJSONObject.optString("content"), optJSONObject.optLong("trackingMilliseconds", 0L)).pcc());
                }
            }
        }
        return arrayList;
    }

    public String sf() {
        return this.gm;
    }

    public boolean gm() {
        return this.oo;
    }

    public void l_() {
        this.wh = true;
    }

    public boolean oo() {
        return this.wh;
    }

    public static class pcc {
        private final String pcc;
        private EnumC0148gm sf = EnumC0148gm.TRACKING_URL;
        private boolean gm = false;

        public pcc(String str) {
            this.pcc = str;
        }

        public pcc pcc(boolean z) {
            this.gm = z;
            return this;
        }

        public gm pcc() {
            return new gm(this.pcc, this.sf, Boolean.valueOf(this.gm));
        }
    }

    public static class sf {
        float gm;
        final of pcc;
        String sf;

        public sf(String str, of ofVar) {
            this(str, ofVar, -1.0f);
        }

        public sf(String str, of ofVar, float f) {
            this.sf = str;
            this.pcc = ofVar;
            this.gm = f;
        }

        public String toString() {
            return super.toString();
        }
    }
}
