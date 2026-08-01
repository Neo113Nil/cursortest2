package com.bykv.vk.openvk.pcc.pcc.pcc.gm;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.ktor.http.ContentDisposition;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class sf {
    private long gm;
    private int hc;
    private String kj;
    private double oo;
    private String ork;
    private int pcc;
    private String qf;
    private int sf;
    private int tmg;
    private double vh;
    private String vj;
    private String vy;
    private String wh;
    private float gbb = -1.0f;
    private int jr = 0;
    private int dax = 0;
    private int nac = 0;
    private int lu = 0;
    private int gpj = 307200;
    private int lo = 1;

    public int pcc() {
        return this.tmg;
    }

    public void pcc(int i) {
        this.tmg = i;
    }

    public int sf() {
        return this.pcc;
    }

    public void sf(int i) {
        this.pcc = i;
    }

    public int gm() {
        return this.sf;
    }

    public void gm(int i) {
        this.sf = i;
    }

    public int oo() {
        return this.hc;
    }

    public void oo(int i) {
        this.hc = i;
    }

    public long vj() {
        return this.gm;
    }

    public void pcc(long j) {
        this.gm = j;
    }

    public double wh() {
        return this.oo;
    }

    public void pcc(double d) {
        this.oo = d;
    }

    public double qf() {
        return this.vh;
    }

    public float kj() {
        return this.gbb;
    }

    public String vy() {
        return this.vj;
    }

    public void pcc(String str) {
        this.vj = str;
    }

    public String ork() {
        return this.wh;
    }

    public void sf(String str) {
        this.wh = str;
    }

    public String vh() {
        return this.qf;
    }

    public void gm(String str) {
        this.qf = str;
    }

    public String tmg() {
        return this.kj;
    }

    public void oo(String str) {
        this.kj = str;
    }

    public String hc() {
        return this.vy;
    }

    public void vj(String str) {
        this.vy = str;
    }

    public String gbb() {
        if (TextUtils.isEmpty(this.ork)) {
            this.ork = com.bykv.vk.openvk.pcc.pcc.pcc.qf.sf.pcc(this.qf);
        }
        return this.ork;
    }

    public void wh(String str) {
        this.ork = str;
    }

    public int jr() {
        if (this.gpj < 0) {
            this.gpj = 307200;
        }
        long j = this.gpj;
        long j2 = this.gm;
        if (j > j2) {
            this.gpj = (int) j2;
        }
        return this.gpj;
    }

    public void vj(int i) {
        this.gpj = i;
    }

    public int dax() {
        return this.nac;
    }

    public void wh(int i) {
        this.nac = i;
    }

    public int nac() {
        return this.lu;
    }

    public void qf(int i) {
        this.lu = i;
    }

    public JSONObject lu() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", sf());
            jSONObject.put("cover_url", ork());
            jSONObject.put("cover_width", gm());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, tmg());
            jSONObject.put("file_hash", gbb());
            jSONObject.put("resolution", vy());
            jSONObject.put(ContentDisposition.Parameters.Size, vj());
            jSONObject.put("video_duration", wh());
            jSONObject.put("video_url", vh());
            jSONObject.put("playable_download_url", hc());
            jSONObject.put("if_playable_loading_show", gpj());
            jSONObject.put("remove_loading_page_type", lo());
            jSONObject.put("fallback_endcard_judge", pcc());
            jSONObject.put("video_preload_size", jr());
            jSONObject.put("reward_video_cached_type", dax());
            jSONObject.put("execute_cached_type", nac());
            jSONObject.put("endcard_render", oo());
            jSONObject.put("replay_time", tz());
            jSONObject.put("play_speed_ratio", kj());
            if (qf() > 0.0d) {
                jSONObject.put("start", qf());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public int gpj() {
        return this.jr;
    }

    public void kj(int i) {
        this.jr = i;
    }

    public int lo() {
        return this.dax;
    }

    public void vy(int i) {
        this.dax = i;
    }

    public boolean fum() {
        return this.nac == 0;
    }

    public void ork(int i) {
        this.lo = Math.min(4, Math.max(1, i));
    }

    public int tz() {
        return this.lo;
    }
}
