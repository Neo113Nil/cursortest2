package com.bykv.vk.openvk.pcc.pcc.pcc.gm;

import android.os.Build;
import android.text.TextUtils;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class gm implements Serializable {
    private int dax;
    private int fum;
    private String gbb;
    public int gm;
    private boolean gpj;
    private int jr;
    private String kj;
    private boolean lo;
    private long lu;
    private String nac;
    private boolean ork;
    private sf qf;
    public String sf;
    private int tsz;
    private int tz;
    private boolean vy;
    private sf wh;
    private int vh = 204800;
    private int tmg = 0;
    private int hc = 0;
    protected float pcc = -1.0f;
    public final HashMap<String, Object> oo = new HashMap<>();
    private int of = 10000;
    private int yt = 10000;
    private int qy = 10000;
    private int jsj = 0;
    public int vj = 1;
    private JSONObject mk = new JSONObject();

    public gm(String str, sf sfVar, sf sfVar2, int i, int i2) {
        this.fum = 0;
        this.tz = 0;
        this.kj = str;
        this.wh = sfVar;
        this.qf = sfVar2;
        this.fum = i;
        this.tz = i2;
    }

    public void pcc(int i) {
        this.tsz = i;
    }

    public boolean pcc() {
        int i = this.tsz;
        return i == 1 || i == 2;
    }

    public boolean sf() {
        return this.tsz == 2;
    }

    public JSONObject gm() {
        return this.mk;
    }

    public int oo() {
        return this.mk.optInt("pitaya_cache_size", 0);
    }

    public String vj() {
        return this.kj;
    }

    public void pcc(String str) {
        this.kj = str;
    }

    public int wh() {
        if (gbb()) {
            return this.qf.jr();
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            return sfVar.jr();
        }
        return 0;
    }

    public boolean qf() {
        return this.lo;
    }

    public void sf(String str) {
        this.gbb = str;
    }

    public int kj() {
        return this.jr;
    }

    public void sf(int i) {
        this.jr = i;
    }

    public int vy() {
        return this.dax;
    }

    public void gm(int i) {
        this.dax = i;
    }

    public void gm(String str) {
        this.nac = str;
    }

    public long ork() {
        return this.lu;
    }

    public void pcc(long j) {
        this.lu = j;
    }

    public boolean vh() {
        return this.gpj;
    }

    public void pcc(boolean z) {
        this.gpj = z;
    }

    public long tmg() {
        if (gbb()) {
            return this.qf.vj();
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            return sfVar.vj();
        }
        return 0L;
    }

    public boolean hc() {
        if (gbb()) {
            return this.qf.fum();
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            return sfVar.fum();
        }
        return true;
    }

    public void oo(String str) {
        this.sf = str;
    }

    public void oo(int i) {
        this.gm = i;
    }

    public boolean gbb() {
        sf sfVar;
        if (this.tz == 1 && (sfVar = this.qf) != null && !TextUtils.isEmpty(sfVar.vh())) {
            if (com.bykv.vk.openvk.pcc.pcc.pcc.gm.vj() == 2) {
                if (Build.VERSION.SDK_INT >= 26) {
                    return true;
                }
            } else if (this.fum == 1) {
                return true;
            }
        }
        return false;
    }

    public float jr() {
        float f = this.pcc;
        if (f != -1.0f) {
            return f;
        }
        if (gbb()) {
            return this.qf.kj();
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            return sfVar.kj();
        }
        return -1.0f;
    }

    public String dax() {
        if (gbb()) {
            return this.qf.vh();
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            return sfVar.vh();
        }
        return null;
    }

    public String nac() {
        if (gbb()) {
            return this.qf.gbb();
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            return sfVar.gbb();
        }
        return null;
    }

    public int lu() {
        return this.fum;
    }

    public synchronized void pcc(String str, Object obj) {
        this.oo.put(str, obj);
    }

    public synchronized Object vj(String str) {
        return this.oo.get(str);
    }

    public int gpj() {
        return this.of;
    }

    public void vj(int i) {
        this.of = i;
    }

    public int lo() {
        return this.yt;
    }

    public void wh(int i) {
        this.yt = i;
    }

    public int fum() {
        return this.qy;
    }

    public void qf(int i) {
        this.qy = i;
    }

    public int tz() {
        return this.jsj;
    }

    public void kj(int i) {
        this.jsj = i;
    }

    public sf of() {
        return this.wh;
    }

    public sf yt() {
        return this.qf;
    }

    public void sf(boolean z) {
        this.vy = z;
    }

    public boolean qy() {
        return this.vy;
    }

    public void gm(boolean z) {
        this.ork = z;
    }

    public boolean jsj() {
        return this.ork;
    }
}
