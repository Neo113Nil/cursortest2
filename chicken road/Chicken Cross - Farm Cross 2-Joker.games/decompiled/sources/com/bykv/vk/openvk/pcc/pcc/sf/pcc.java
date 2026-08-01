package com.bykv.vk.openvk.pcc.pcc.sf;

import android.text.TextUtils;
import com.bykv.vk.openvk.pcc.pcc.pcc.pcc.sf;
import com.ironsource.C4665u;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class pcc {
    public static int gm = 10;
    private static int kj = 8192;
    public static int oo = 10;
    public static int pcc = 50;
    private static int qf = 1;
    public static int sf = 10;
    private static sf vj;
    private static boolean wh;

    public static void pcc(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            pcc = jSONObject.optInt("splash", 50);
            sf = jSONObject.optInt(C4665u.j, 10);
            gm = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            oo = optInt;
            if (pcc < 0) {
                pcc = 50;
            }
            if (sf < 0) {
                sf = 10;
            }
            if (gm < 0) {
                gm = 10;
            }
            if (optInt < 0) {
                oo = 10;
            }
            new Object[]{"splash=", Integer.valueOf(pcc), ",reward=", Integer.valueOf(sf), ",brand=", Integer.valueOf(gm), ",other=", Integer.valueOf(oo)};
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void pcc(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            wh = jSONObject.optInt("check_moov", 0) == 1;
            qf = jSONObject.optInt("new_media_source", 1);
            kj = jSONObject.optInt("read_buffer_size_k", 8) * 1024;
        } catch (JSONException unused) {
        }
    }

    public static boolean sf(String str) {
        return wh && str != null && str.endsWith(".mp4");
    }

    public static void pcc(sf sfVar) {
        vj = sfVar;
    }

    public static void pcc() {
        sf sfVar = vj;
        if (sfVar != null) {
            sfVar.oo();
        }
    }

    public static int sf() {
        return pcc;
    }

    public static int gm() {
        return sf;
    }

    public static int oo() {
        return gm;
    }

    public static int vj() {
        return oo;
    }

    public static int wh() {
        return qf;
    }

    public static int qf() {
        return kj;
    }
}
