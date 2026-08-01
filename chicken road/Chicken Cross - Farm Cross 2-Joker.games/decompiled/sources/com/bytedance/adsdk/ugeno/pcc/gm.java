package com.bytedance.adsdk.ugeno.pcc;

import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private int gm;
    private String kj;
    private String oo;
    private JSONObject ork;
    private Map<String, TreeMap<Float, String>> pcc;
    private String qf;
    private long sf;
    private long vj;
    private int vy = 1;
    private pcc wh;

    public static class pcc {
        public String pcc;
        public String sf;
    }

    public JSONObject pcc() {
        return this.ork;
    }

    public void pcc(JSONObject jSONObject) {
        this.ork = jSONObject;
    }

    public Map<String, TreeMap<Float, String>> sf() {
        return this.pcc;
    }

    public void pcc(Map<String, TreeMap<Float, String>> map) {
        this.pcc = map;
    }

    public long gm() {
        return this.sf;
    }

    public void pcc(long j) {
        this.sf = j;
    }

    public int oo() {
        return this.gm;
    }

    public void pcc(int i) {
        this.gm = i;
    }

    public String vj() {
        return this.oo;
    }

    public void pcc(String str) {
        this.oo = str;
    }

    public long wh() {
        return this.vj;
    }

    public void sf(long j) {
        this.vj = j;
    }

    public pcc qf() {
        return this.wh;
    }

    public void pcc(pcc pccVar) {
        this.wh = pccVar;
    }

    public String kj() {
        return this.qf;
    }

    public void sf(String str) {
        this.qf = str;
    }

    public String vy() {
        return this.kj;
    }

    public void gm(String str) {
        this.kj = str;
    }

    public int ork() {
        return this.vy;
    }

    public void sf(int i) {
        this.vy = i;
    }

    public String toString() {
        return "AnimationModel{mKeyFramesMap=" + this.pcc + ", mDuration=" + this.sf + ", mPlayCount=" + this.gm + ", mPlayDirection=" + this.oo + ", mDelay=" + this.vj + ", mName=" + this.kj + ", mPlayState=" + this.vy + ", mTransformOrigin='" + this.wh + "', mTimingFunction='" + this.qf + "'}";
    }
}
