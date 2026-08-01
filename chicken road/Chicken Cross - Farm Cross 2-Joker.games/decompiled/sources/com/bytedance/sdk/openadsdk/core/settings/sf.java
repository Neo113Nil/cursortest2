package com.bytedance.sdk.openadsdk.core.settings;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class sf {
    public boolean atb;
    public int dax;
    public boolean fum;
    public int gbb;
    public int gm;
    public int gpj;
    public int hc;
    public int jr;
    public int jsj;
    public int kj;
    public int lo;
    public int lq;
    public int lu;
    public boolean mk;
    public int nac;
    public List<String> of;
    public int oo;
    public int ork;
    public String pcc;
    public int qf;
    public int qy;
    public int sf;
    public int tmg;
    public int tsz;
    public int tz;
    public int vh;
    public int vj;
    public int vy;
    public int wh;
    public boolean ye;
    public int yt;
    public JSONObject zti;

    private static boolean pcc(int i) {
        return i == 1 || i == 2;
    }

    public sf(JSONObject jSONObject) {
        this.sf = 1;
        this.gm = 1;
        this.oo = 2;
        this.vj = 1;
        this.wh = 100;
        this.qf = 0;
        this.kj = 2;
        this.vy = 1;
        this.ork = 3;
        this.vh = 30;
        this.tmg = 30;
        this.hc = 1;
        this.gbb = 1;
        this.jr = 2;
        this.dax = 5000;
        this.nac = 2;
        this.lu = 3500;
        this.gpj = 0;
        this.lo = 5;
        this.fum = false;
        this.tz = 0;
        this.yt = 2;
        this.qy = 0;
        this.jsj = 0;
        this.tsz = 5;
        this.mk = true;
        this.atb = false;
        this.ye = false;
        this.lq = -1;
        new JSONObject();
        this.zti = jSONObject;
        if (jSONObject == null) {
            return;
        }
        this.pcc = jSONObject.optString("code_id");
        this.sf = jSONObject.optInt("auto_play", 1);
        this.lq = jSONObject.optInt("endcard_close_time", -1);
        this.gm = jSONObject.optInt("voice_control", 1);
        this.oo = jSONObject.optInt("rv_preload", 2);
        this.vj = jSONObject.optInt("nv_preload", 1);
        this.wh = Math.min(100, Math.max(0, jSONObject.optInt("proportion_watching", 100)));
        this.qf = jSONObject.optInt("skip_time_displayed", 0);
        this.kj = jSONObject.optInt("video_skip_result", 2);
        this.vy = jSONObject.optInt("reg_creative_control", 1);
        this.ork = jSONObject.optInt("play_bar_show_time", 3);
        int optInt = jSONObject.optInt("rv_skip_time", 30);
        this.vh = optInt;
        if (optInt < 0) {
            this.vh = 30;
        }
        this.hc = jSONObject.optInt("voice_control", 1);
        this.gbb = jSONObject.optInt("if_show_win", 1);
        this.jr = jSONObject.optInt("sp_preload", 2);
        this.dax = jSONObject.optInt("stop_time", 5000);
        this.nac = jSONObject.optInt("native_playable_delay", 2);
        this.lu = jSONObject.optInt("time_out_control", -1);
        this.gpj = jSONObject.optInt("playable_reward_type", 0);
        this.tz = jSONObject.optInt("reward_is_callback", 0);
        int optInt2 = jSONObject.optInt("iv_skip_time", 5);
        this.lo = optInt2;
        if (optInt2 < 0) {
            this.lo = 5;
        }
        pcc(jSONObject.optJSONArray("parent_tpl_ids"));
        this.yt = jSONObject.optInt("slot_type", 2);
        this.fum = jSONObject.optBoolean("close_on_click", false);
        this.qy = jSONObject.optInt("allow_system_back", 0);
        this.jsj = jSONObject.optInt("splash_skip_time", 0);
        this.tsz = jSONObject.optInt("splash_image_count_down_time", 5);
        this.atb = jSONObject.optBoolean("splash_count_down_time_off", false);
        this.ye = jSONObject.optBoolean("splash_close_on_click", false);
        this.mk = jSONObject.optBoolean("allow_mediaview_click", true);
        if (!pcc(this.gm)) {
            this.gm = 1;
        }
        if (!pcc(this.hc)) {
            this.hc = 1;
        }
        this.tmg = jSONObject.optInt("multi_rv_skip_time", 30);
    }

    public sf(String str, int i) {
        this.sf = 1;
        this.gm = 1;
        this.oo = 2;
        this.vj = 1;
        this.wh = 100;
        this.qf = 0;
        this.kj = 2;
        this.vy = 1;
        this.ork = 3;
        this.vh = 30;
        this.tmg = 30;
        this.hc = 1;
        this.gbb = 1;
        this.jr = 2;
        this.dax = 5000;
        this.nac = 2;
        this.lu = 3500;
        this.gpj = 0;
        this.lo = 5;
        this.fum = false;
        this.tz = 0;
        this.yt = 2;
        this.qy = 0;
        this.jsj = 0;
        this.tsz = 5;
        this.mk = true;
        this.atb = false;
        this.ye = false;
        this.lq = -1;
        this.zti = new JSONObject();
        this.pcc = str;
        this.gm = i;
    }

    public void pcc(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        this.of = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                this.of.add(jSONArray.get(i).toString());
            } catch (Exception unused) {
                return;
            }
        }
    }
}
