package com.bytedance.sdk.openadsdk.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vj {
    private static boolean gm;
    private static WeakReference<com.bytedance.sdk.openadsdk.core.model.of> pcc;
    private static long sf;

    public static void pcc(com.bytedance.sdk.openadsdk.core.model.of ofVar) {
        com.bytedance.sdk.openadsdk.core.model.wh xfm = ofVar.xfm();
        if (xfm == null || TextUtils.isEmpty(xfm.pcc())) {
            return;
        }
        pcc = new WeakReference<>(ofVar);
    }

    public static void pcc(long j) {
        sf(j);
    }

    private static void sf(final long j) {
        com.bytedance.sdk.openadsdk.core.model.of ofVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.model.of> weakReference = pcc;
        if (weakReference == null || j <= 0 || (ofVar = weakReference.get()) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.oo.gm.pcc(System.currentTimeMillis(), ofVar, ofVar.vj(), "store_duration", new com.bytedance.sdk.openadsdk.dax.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.utils.vj.1
            @Override // com.bytedance.sdk.openadsdk.dax.sf.pcc, com.bytedance.sdk.openadsdk.dax.sf.sf
            public JSONObject sf() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_DURATION, j);
                } catch (JSONException unused) {
                }
                return jSONObject;
            }
        });
        pcc = null;
        gm = false;
    }

    public static void pcc() {
        if (pcc == null || gm) {
            return;
        }
        if (sf > 0) {
            sf(SystemClock.elapsedRealtime() - sf);
        }
        pcc = null;
        sf = 0L;
    }

    public static void sf() {
        if (pcc == null || gm) {
            return;
        }
        sf = SystemClock.elapsedRealtime();
    }

    public static boolean gm() {
        WeakReference<com.bytedance.sdk.openadsdk.core.model.of> weakReference = pcc;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        gm = true;
        return true;
    }
}
