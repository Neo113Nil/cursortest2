package com.bytedance.adsdk.sf;

import android.graphics.Rect;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class qf {
    private gm dax;
    private boolean gbb;
    private Map<String, List<com.bytedance.adsdk.sf.gm.gm.vj>> gm;
    private sf gpj;
    private float hc;
    private LongSparseArray<com.bytedance.adsdk.sf.gm.gm.vj> kj;
    private pcc lu;
    private Map<String, ork> oo;
    private Rect ork;
    private SparseArray<com.bytedance.adsdk.sf.gm.oo> qf;
    private float tmg;
    private float vh;
    private Map<String, com.bytedance.adsdk.sf.gm.gm> vj;
    private List<com.bytedance.adsdk.sf.gm.gm.vj> vy;
    private List<com.bytedance.adsdk.sf.gm.wh> wh;
    private final lu pcc = new lu();
    private final HashSet<String> sf = new HashSet<>();
    private int jr = 0;
    private String nac = "";

    public static class gm {
        public String gm;
        public String oo;
        public int pcc;
        public JSONArray qf;
        public String sf;
        public int[] vj;
        public String wh;
    }

    public static class pcc {
        public Map<String, Object> gm;
        public int oo;
        public int pcc;
        public JSONArray qf;
        public Map<String, Object> sf;
        public int vj;
        public String wh;
    }

    public static class sf {
        public JSONArray gm;
        public String pcc;
        public int[][] sf;
    }

    public void pcc(Rect rect, float f, float f2, float f3, List<com.bytedance.adsdk.sf.gm.gm.vj> list, LongSparseArray<com.bytedance.adsdk.sf.gm.gm.vj> longSparseArray, Map<String, List<com.bytedance.adsdk.sf.gm.gm.vj>> map, Map<String, ork> map2, SparseArray<com.bytedance.adsdk.sf.gm.oo> sparseArray, Map<String, com.bytedance.adsdk.sf.gm.gm> map3, List<com.bytedance.adsdk.sf.gm.wh> list2, gm gmVar, String str, pcc pccVar, sf sfVar) {
        this.ork = rect;
        this.vh = f;
        this.tmg = f2;
        this.hc = f3;
        this.vy = list;
        this.kj = longSparseArray;
        this.gm = map;
        this.oo = map2;
        this.qf = sparseArray;
        this.vj = map3;
        this.wh = list2;
        this.dax = gmVar;
        this.nac = str;
        this.lu = pccVar;
        this.gpj = sfVar;
    }

    public void pcc(String str) {
        this.sf.add(str);
    }

    public void pcc(boolean z) {
        this.gbb = z;
    }

    public void pcc(int i) {
        this.jr += i;
    }

    public boolean pcc() {
        return this.gbb;
    }

    public int sf() {
        return this.jr;
    }

    public void sf(boolean z) {
        this.pcc.pcc(z);
    }

    public lu gm() {
        return this.pcc;
    }

    public com.bytedance.adsdk.sf.gm.gm.vj pcc(long j) {
        return this.kj.get(j);
    }

    public Rect oo() {
        return this.ork;
    }

    public float vj() {
        return (long) ((nac() / this.hc) * 1000.0f);
    }

    public float wh() {
        return this.vh;
    }

    public float qf() {
        return this.tmg;
    }

    public float pcc(float f) {
        return com.bytedance.adsdk.sf.wh.vj.pcc(this.vh, this.tmg, f);
    }

    public gm kj() {
        return this.dax;
    }

    public String vy() {
        return this.nac;
    }

    public sf ork() {
        return this.gpj;
    }

    public pcc vh() {
        return this.lu;
    }

    public float tmg() {
        return this.hc;
    }

    public List<com.bytedance.adsdk.sf.gm.gm.vj> hc() {
        return this.vy;
    }

    public List<com.bytedance.adsdk.sf.gm.gm.vj> sf(String str) {
        return this.gm.get(str);
    }

    public SparseArray<com.bytedance.adsdk.sf.gm.oo> gbb() {
        return this.qf;
    }

    public Map<String, com.bytedance.adsdk.sf.gm.gm> jr() {
        return this.vj;
    }

    public com.bytedance.adsdk.sf.gm.wh gm(String str) {
        int size = this.wh.size();
        for (int i = 0; i < size; i++) {
            com.bytedance.adsdk.sf.gm.wh whVar = this.wh.get(i);
            if (whVar.pcc(str)) {
                return whVar;
            }
        }
        return null;
    }

    public Map<String, ork> dax() {
        return this.oo;
    }

    public float nac() {
        return this.tmg - this.vh;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<com.bytedance.adsdk.sf.gm.gm.vj> it = this.vy.iterator();
        while (it.hasNext()) {
            sb.append(it.next().pcc("\t"));
        }
        return sb.toString();
    }
}
