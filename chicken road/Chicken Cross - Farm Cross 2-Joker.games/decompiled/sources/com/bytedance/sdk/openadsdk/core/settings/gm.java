package com.bytedance.sdk.openadsdk.core.settings;

import android.util.Log;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.utils.hc;
import java.io.File;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private static final ConcurrentHashMap<String, sf> pcc = new ConcurrentHashMap<>();

    public static void pcc(boolean z) {
        File pcc2 = pcc();
        if (pcc2.exists()) {
            try {
                HashMap<String, sf> sf = sf(new JSONArray(new String(com.bytedance.sdk.component.utils.qf.oo(pcc2))));
                if (sf.isEmpty()) {
                    return;
                }
                for (Map.Entry<String, sf> entry : sf.entrySet()) {
                    pcc.put(entry.getKey(), entry.getValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    private static HashMap<String, sf> sf(JSONArray jSONArray) {
        HashMap<String, sf> hashMap = new HashMap<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                sf pcc2 = pcc(jSONArray.getJSONObject(i));
                if (pcc2 != null) {
                    hashMap.put(pcc2.pcc, pcc2);
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public static File pcc() {
        return com.bytedance.sdk.component.utils.qf.pcc(lu.pcc(), lu.pcc().getFilesDir(), "tt_ads_conf_sr");
    }

    private static sf pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new sf(jSONObject);
    }

    public static sf pcc(String str) {
        sf sfVar = pcc.get(str);
        return sfVar == null ? sf(str) : sfVar;
    }

    private static sf sf(String str) {
        return new sf(str, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void pcc(JSONArray jSONArray) {
        HashMap<String, sf> sf;
        FileWriter fileWriter;
        if (jSONArray == null) {
            return;
        }
        File pcc2 = pcc();
        File file = new File(pcc2.getParent(), pcc2.getName() + ".tmp");
        FileWriter fileWriter2 = null;
        try {
            try {
                if (file.exists()) {
                    file.delete();
                }
                fileWriter = new FileWriter(file);
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            fileWriter.write(jSONArray.toString());
            file.renameTo(pcc2);
            if (file.exists()) {
                file.delete();
            }
            hc.pcc(fileWriter);
        } catch (Exception e2) {
            e = e2;
            fileWriter2 = fileWriter;
            Log.e("SdkSettings.AdSlot", "saveAdSlotToLocal: ", e);
            if (file.exists()) {
                file.delete();
            }
            hc.pcc(fileWriter2);
            sf = sf(jSONArray);
            if (sf.isEmpty()) {
            }
        } catch (Throwable th2) {
            th = th2;
            fileWriter2 = fileWriter;
            if (file.exists()) {
                file.delete();
            }
            hc.pcc(fileWriter2);
            throw th;
        }
        sf = sf(jSONArray);
        if (sf.isEmpty()) {
            for (Map.Entry<String, sf> entry : sf.entrySet()) {
                pcc.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public static void sf() {
        File pcc2 = pcc();
        if (pcc2.exists()) {
            pcc2.delete();
        }
    }
}
