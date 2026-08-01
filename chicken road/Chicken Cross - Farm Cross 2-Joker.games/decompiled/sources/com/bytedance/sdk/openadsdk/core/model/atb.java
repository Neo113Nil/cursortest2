package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class atb {
    private String dax;
    private int gbb;
    private boolean gm;
    private int hc;
    private int jr;
    private int kj;
    private String lu;
    private String nac;
    private int oo;
    private boolean ork;
    private int pcc;
    private int qf;
    private int sf;
    private int tmg;
    private int vh;
    private String vj;
    private int vy;
    private String wh;

    public static boolean dax(of ofVar) {
        return false;
    }

    public static boolean hc(of ofVar) {
        return true;
    }

    private static int pcc(int i) {
        return i == 1 ? 10 : 5;
    }

    public int pcc() {
        return this.tmg;
    }

    public int sf() {
        return this.hc;
    }

    public int gm() {
        return this.gbb;
    }

    public int oo() {
        return this.jr;
    }

    public String vj() {
        return this.dax;
    }

    public String wh() {
        return this.nac;
    }

    public String qf() {
        return this.lu;
    }

    public atb(JSONObject jSONObject) {
        this.tmg = 5;
        this.hc = 5;
        this.gbb = 10;
        this.jr = 20;
        this.dax = "Next Ad";
        this.nac = "Next ad in %1$ds";
        this.lu = "Play Now";
        if (jSONObject == null) {
            return;
        }
        this.gm = jSONObject.optBoolean("is_playable");
        this.oo = jSONObject.optInt("playable_type", 0);
        this.vj = jSONObject.optString("playable_style");
        JSONObject optJSONObject = jSONObject.optJSONObject("playable");
        if (optJSONObject != null) {
            this.wh = optJSONObject.optString("playable_url", "");
            this.qf = optJSONObject.optInt("playable_orientation", 0);
            this.sf = optJSONObject.optInt("new_style", 0);
            this.pcc = optJSONObject.optInt("close_2_app", 0);
            int pcc = pcc(this.oo);
            this.kj = optJSONObject.optInt("playable_webview_timeout", pcc);
            this.vy = optJSONObject.optInt("playable_js_timeout", pcc);
            this.ork = optJSONObject.optInt("playable_backup_enable", 0) == 1;
            this.tmg = optJSONObject.optInt("wait_tips_time", 5);
            this.hc = optJSONObject.optInt("auto_to_next_time", 5);
            this.gbb = optJSONObject.optInt("next_ad_tips_show_time", 10);
            this.jr = optJSONObject.optInt("max_show_time", 20);
            this.nac = optJSONObject.optString("next_ad_in_xs");
            this.dax = optJSONObject.optString("next_ad_text");
            this.lu = optJSONObject.optString("play_now_text");
            int optInt = optJSONObject.optInt("countdown_show_type", 0);
            this.vh = optInt;
            if (optInt == 0 || optInt == 1 || optInt == 2) {
                return;
            }
            this.vh = 0;
        }
    }

    public static int pcc(of ofVar) {
        int i;
        atb vr = ofVar.vr();
        if (vr != null && (i = vr.pcc) >= 0 && i <= 100) {
            return i;
        }
        return 0;
    }

    private static atb mk(of ofVar) {
        if (ofVar == null) {
            return null;
        }
        return ofVar.vr();
    }

    public static boolean sf(of ofVar) {
        atb mk = mk(ofVar);
        return (mk == null || !mk.gm || TextUtils.isEmpty(tmg(ofVar))) ? false : true;
    }

    public static boolean gm(of ofVar) {
        return sf(ofVar) && atb(ofVar) == 1;
    }

    public static boolean oo(of ofVar) {
        return gm(ofVar) && !qf(ofVar);
    }

    public static boolean vj(of ofVar) {
        atb mk = mk(ofVar);
        return mk != null && ofVar.yir() && mk.gm && !TextUtils.isEmpty(tmg(ofVar));
    }

    public static boolean wh(of ofVar) {
        return vj(ofVar) && atb(ofVar) == 1;
    }

    public static boolean qf(of ofVar) {
        atb vr = ofVar.vr();
        return vr != null && vr.gm && vr.sf == 1;
    }

    public static boolean kj(of ofVar) {
        atb vr = ofVar.vr();
        return vr != null && ofVar.yir() && vr.gm && vr.sf == 1;
    }

    private static int atb(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.oo;
    }

    public static int vy(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.vh;
    }

    public static String ork(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return null;
        }
        return mk.vj;
    }

    public static String vh(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return null;
        }
        return mk.wh;
    }

    public static String tmg(of ofVar) {
        if (ofVar == null) {
            return null;
        }
        atb vr = ofVar.vr();
        if (vr != null && vr.gm) {
            String str = vr.wh;
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
        }
        if (ofVar.bg() == 20) {
            return ofVar.xy();
        }
        if (ofVar.kez() != null) {
            return ofVar.kez().tmg();
        }
        return null;
    }

    public static boolean gbb(of ofVar) {
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = ofVar.kez();
        return kez != null && kez.lo() == 1;
    }

    public static int jr(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.qf;
    }

    public int kj() {
        return this.kj;
    }

    public int vy() {
        return this.vy;
    }

    public boolean ork() {
        return this.ork;
    }

    public static long nac(of ofVar) {
        return Math.max(lu(ofVar), gpj(ofVar));
    }

    public static long lu(of ofVar) {
        if (mk(ofVar) == null) {
            return 5L;
        }
        return r2.kj();
    }

    public static long gpj(of ofVar) {
        if (mk(ofVar) == null) {
            return 5L;
        }
        return r2.vy();
    }

    public static boolean lo(of ofVar) {
        atb mk = mk(ofVar);
        return mk != null && mk.ork();
    }

    public static int fum(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.pcc();
    }

    public static String tz(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return null;
        }
        return mk.vj();
    }

    public static String of(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return null;
        }
        return mk.qf();
    }

    public static String yt(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return null;
        }
        return mk.wh();
    }

    public static int qy(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.sf();
    }

    public static int jsj(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.gm();
    }

    public static int tsz(of ofVar) {
        atb mk = mk(ofVar);
        if (mk == null) {
            return 0;
        }
        return mk.oo();
    }
}
