package com.bytedance.adsdk.sf;

import android.graphics.Bitmap;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class ork {
    private final String gm;
    private final String kj;
    private final String oo;
    private final JSONArray ork;
    private final int pcc;
    private final List<pcc> qf;
    private final int sf;
    private Bitmap vh;
    private final String vj;
    private final int[][] vy;
    private final String wh;

    public static class pcc {
        public String gm;
        public String oo;
        public int pcc;
        public String qf;
        public int sf;
        public int vj;
        public int wh;
    }

    public ork(int i, int i2, String str, String str2, String str3, String str4, List<pcc> list, String str5, int[][] iArr, JSONArray jSONArray) {
        this.pcc = i;
        this.sf = i2;
        this.gm = str;
        this.oo = str2;
        this.vj = str3;
        this.wh = str4;
        this.qf = list;
        this.kj = str5;
        this.vy = iArr;
        this.ork = jSONArray;
    }

    public int pcc() {
        return this.pcc;
    }

    public int sf() {
        return this.sf;
    }

    public List<pcc> gm() {
        return this.qf;
    }

    public String oo() {
        return this.wh;
    }

    public String vj() {
        return this.kj;
    }

    public int[][] wh() {
        return this.vy;
    }

    public JSONArray qf() {
        return this.ork;
    }

    public String kj() {
        return this.gm;
    }

    public String vy() {
        return this.oo;
    }

    public String ork() {
        return this.vj;
    }

    public Bitmap vh() {
        return this.vh;
    }

    public void pcc(Bitmap bitmap) {
        this.vh = bitmap;
    }
}
