package com.bytedance.sdk.openadsdk.component.qf;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.qf;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.component.wh;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.yt.vj;
import com.facebook.internal.NativeProtocol;
import java.io.File;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class pcc {
    private static Boolean sf;
    private static AtomicInteger pcc = new AtomicInteger(0);
    private static Integer gm = null;

    public static File pcc(String str) {
        return new File(CacheDirFactory.getICacheDir(0).sf() + File.separator + str);
    }

    public static File sf(String str) {
        File sf2 = wh.pcc(lu.pcc()).sf();
        if (TextUtils.isEmpty(str) || str.contains("..") || str.contains("../") || str.contains("/")) {
            return null;
        }
        return new File(sf2, str);
    }

    public static void pcc(File file) {
        if (file == null) {
            return;
        }
        try {
            qf.sf(file);
        } catch (Throwable unused) {
        }
    }

    public static void pcc(Context context) {
        try {
            wh.pcc(context).pcc();
            if (vj()) {
                com.bytedance.sdk.openadsdk.common.lu.pcc().sf();
            }
        } catch (Throwable unused) {
        }
    }

    public static String pcc() {
        return wh.pcc(lu.pcc()).sf().getAbsolutePath();
    }

    public static void pcc(JSONObject jSONObject, int i, boolean z) {
        try {
            String kj = ork.sf().kj();
            int vy = ork.sf().vy();
            JSONObject jSONObject2 = jSONObject.getJSONObject("creative");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, kj);
            if (!z) {
                jSONObject3.put("app_icon_id", "@".concat(String.valueOf(vy)));
            } else if (ork.sf().vy() != 0) {
                jSONObject3.put("app_icon_id", "local://pag_open_icon_id");
            }
            jSONObject2.put("open_app_info", jSONObject3);
            if (jSONObject2.optJSONObject("video") == null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("video_duration", lu.oo().yt(String.valueOf(i)));
                jSONObject2.put("video", jSONObject4);
            }
        } catch (Exception e) {
            lo.gm("TTAppOpenUtils", e.getMessage());
        }
    }

    public static int pcc(of ofVar, int i) {
        return i - ofVar.sod();
    }

    public static long sf() {
        return SystemClock.elapsedRealtime() - Process.getStartElapsedRealtime();
    }

    public static int gm() {
        return pcc.incrementAndGet();
    }

    public static int oo() {
        return jr.sf.get() ? 1 : 2;
    }

    public static boolean vj() {
        return vj.pcc("aoa_cache_opt_enable", 0) == 1;
    }

    public static boolean wh() {
        return lu.oo().ork() == 1;
    }

    public static int qf() {
        return pcc.get() == 0 ? vj.pcc("aoa_cold_load_timeout", 3500) : vj.pcc("aoa_hot_load_timeout", 3500);
    }

    public static int kj() {
        if (vj()) {
            return vj.pcc("aoa_cache_count", 3);
        }
        return 1;
    }

    public static int vy() {
        int pcc2 = vj.pcc("aoa_cache_refresh_time", 72000000);
        if (pcc2 < 60000) {
            return 72000000;
        }
        return pcc2;
    }

    public static int ork() {
        int pcc2 = vj.pcc("aoa_cache_poll_interval", Constants.ONE_HOUR);
        return pcc2 < 60000 ? Constants.ONE_HOUR : pcc2;
    }

    public static void pcc(int i) {
        Map<String, AdSlot> gm2;
        if (!vj() || (gm2 = com.bytedance.sdk.openadsdk.common.lu.pcc().gm()) == null || gm2.size() == 0) {
            return;
        }
        gm2.size();
        for (AdSlot adSlot : gm2.values()) {
            if (adSlot != null && TextUtils.isEmpty(adSlot.getBidAdm())) {
                try {
                    adSlot.setCacheScene(i);
                    wh.pcc(lu.pcc()).pcc(adSlot);
                } catch (Throwable unused) {
                    new StringBuilder("loadAdCache failed for rit: ").append(adSlot);
                }
            }
        }
    }

    public static boolean pcc(AdSlot adSlot) {
        Map<String, Object> requestExtraMap;
        return (adSlot == null || (requestExtraMap = adSlot.getRequestExtraMap()) == null || requestExtraMap.get("is_from_m") != Boolean.TRUE) ? false : true;
    }

    public static boolean vh() {
        if (sf == null) {
            boolean z = false;
            boolean z2 = vj.pcc("open_ad_ugen_backup_enable", 0) == 1;
            boolean z3 = vj.pcc("express_backup_type", 0) == 1;
            if (z2 && z3) {
                z = true;
            }
            sf = Boolean.valueOf(z);
        }
        new StringBuilder("isOpenAdUgenBackupEnable = ").append(sf);
        return sf.booleanValue();
    }

    public static int tmg() {
        if (gm == null) {
            Integer valueOf = Integer.valueOf(vj.pcc("aoa_preload_size", 10));
            gm = valueOf;
            if (valueOf.intValue() < 0) {
                gm = 10;
            }
        }
        new StringBuilder("getPreloadRitMaxSize = ").append(gm);
        return gm.intValue();
    }
}
