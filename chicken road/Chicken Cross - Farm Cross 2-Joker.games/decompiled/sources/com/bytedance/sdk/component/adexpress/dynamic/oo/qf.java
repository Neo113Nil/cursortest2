package com.bytedance.sdk.component.adexpress.dynamic.oo;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.vj.vh;
import com.ironsource.U3;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf {
    public JSONObject gm;
    private wh oo;
    public int pcc;
    public String sf;
    private vj vj;
    private String wh;

    public qf(vj vjVar) {
        this.vj = vjVar;
        this.pcc = vjVar.pcc();
        this.sf = vjVar.gm();
        this.gm = vjVar.vj().gdh();
        this.wh = vjVar.oo();
        if (com.bytedance.sdk.component.adexpress.oo.gm() == 1) {
            this.oo = vjVar.qf();
        } else {
            this.oo = vjVar.vj();
        }
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            this.oo = vjVar.vj();
        }
    }

    public int pcc() {
        return (int) this.oo.gbb();
    }

    public int sf() {
        return (int) this.oo.nac();
    }

    public int gm() {
        return (int) this.oo.jr();
    }

    public int oo() {
        return (int) this.oo.dax();
    }

    public float vj() {
        return this.oo.lu();
    }

    public String wh() {
        if (this.pcc == 0) {
            if (!TextUtils.isEmpty(this.sf)) {
                return this.sf;
            }
            return this.gm.optString(com.bytedance.sdk.component.adexpress.oo.qf.gm(com.bytedance.sdk.component.adexpress.oo.pcc()));
        }
        return "";
    }

    public int qf() {
        return pcc(this.oo.tz());
    }

    public int kj() {
        String fum = this.oo.fum();
        if ("left".equals(fum)) {
            return 17;
        }
        if ("center".equals(fum)) {
            return 4;
        }
        return "right".equals(fum) ? 3 : 2;
    }

    public int vy() {
        int kj = kj();
        if (kj == 4) {
            return 17;
        }
        return kj == 3 ? GravityCompat.END : GravityCompat.START;
    }

    public String ork() {
        int i = this.pcc;
        if (i == 2 || i == 13) {
            return this.sf;
        }
        return "";
    }

    public String vh() {
        if (this.pcc == 1) {
            return this.sf;
        }
        return "";
    }

    public String tmg() {
        return this.wh;
    }

    public double hc() {
        if (this.pcc == 11) {
            try {
                return !com.bytedance.sdk.component.adexpress.oo.sf() ? (int) r0 : Double.parseDouble(this.sf);
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    public double gbb() {
        return this.oo.gpj();
    }

    public float jr() {
        return this.oo.vh();
    }

    public int dax() {
        return pcc(this.oo.jsj());
    }

    public float nac() {
        return this.oo.tmg();
    }

    public int lu() {
        return this.oo.gpa();
    }

    public int gpj() {
        return this.oo.gr();
    }

    public boolean lo() {
        return this.oo.az();
    }

    public String fum() {
        return this.oo.yt();
    }

    public void pcc(float f) {
        this.oo.pcc(f);
    }

    public boolean tz() {
        return this.oo.iv();
    }

    public int of() {
        return this.oo.xb();
    }

    public String yt() {
        return this.oo.tsx();
    }

    public String qy() {
        return this.oo.pzh();
    }

    public long jsj() {
        return this.oo.gmh();
    }

    public int tsz() {
        String tsx = this.oo.tsx();
        if ("skip-with-time-skip-btn".equals(this.vj.sf()) || "skip".equals(this.vj.sf()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.vj.sf())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.vj.sf()) && !"skip-with-time".equals(this.vj.sf())) {
            if (this.pcc == 10 && TextUtils.equals(this.oo.kun(), "click")) {
                return 5;
            }
            if (wax() && bbd()) {
                return 0;
            }
            if (wax()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.vj.sf())) {
                return 3;
            }
            if (!TextUtils.isEmpty(tsx) && !tsx.equals("none")) {
                if (tsx.equals("video") || (this.vj.pcc() == 7 && TextUtils.equals(tsx, Constants.NORMAL))) {
                    return (com.bytedance.sdk.component.adexpress.oo.sf() && this.vj.vj() != null && this.vj.vj().jmx()) ? 11 : 4;
                }
                if (tsx.equals(Constants.NORMAL)) {
                    return 1;
                }
                return (tsx.equals("creative") || "slide".equals(this.oo.kun())) ? 2 : 0;
            }
        }
        return 0;
    }

    private boolean wax() {
        return (com.bytedance.sdk.component.adexpress.oo.sf() && (this.vj.sf().contains("logo-union") || this.vj.sf().contains("logounion") || this.vj.sf().contains("logoad"))) || "logo-union".equals(this.vj.sf()) || "logounion".equals(this.vj.sf()) || "logoad".equals(this.vj.sf());
    }

    public int mk() {
        return pcc(this.oo.of());
    }

    public double atb() {
        return this.oo.kj();
    }

    public int ye() {
        return this.oo.gm();
    }

    public int lq() {
        return this.oo.sf();
    }

    public int zti() {
        return this.oo.vj();
    }

    public int pq() {
        return this.oo.oo();
    }

    public int mu() {
        return this.oo.vy();
    }

    public String nn() {
        return this.oo.ork();
    }

    public String rnn() {
        return this.oo.kun();
    }

    private boolean bbd() {
        if (com.bytedance.sdk.component.adexpress.oo.sf()) {
            return false;
        }
        return (!TextUtils.isEmpty(this.sf) && this.sf.contains("adx:")) || vh.sf();
    }

    public static int pcc(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(U3.i.T)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (str.startsWith("rgba") && (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) != null) {
            try {
                if (split.length == 4) {
                    return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2]));
                }
            } catch (NumberFormatException unused) {
                return 0;
            }
        }
        return ViewCompat.MEASURED_STATE_MASK;
    }

    public static float[] sf(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split != null && split.length == 4) {
            return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
        }
        return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
    }

    public boolean tsx() {
        return this.oo.ei();
    }

    public int kun() {
        return this.oo.ywp();
    }

    public int rj() {
        return this.oo.vgx();
    }

    public String lrr() {
        return this.oo.rnn();
    }

    public boolean iv() {
        return this.oo.kx();
    }

    public int xb() {
        return this.oo.qf();
    }

    public int ri() {
        return this.oo.ofe();
    }

    public int hpk() {
        return this.oo.zk();
    }

    public int fmh() {
        return this.oo.jy();
    }

    public int zsj() {
        return this.oo.gqd();
    }

    public boolean gd() {
        return this.oo.vd();
    }

    public String erj() {
        return this.oo.atb();
    }

    public String se() {
        return this.oo.xf();
    }

    public String ptr() {
        return this.oo.rv();
    }

    public boolean hoh() {
        return this.oo.hc();
    }

    public boolean qcw() {
        return this.oo.lq();
    }

    public String vr() {
        return this.oo.ye();
    }

    public int bg() {
        return this.oo.zti();
    }

    public int kz() {
        return this.oo.pq();
    }

    public double ew() {
        return this.oo.mu();
    }

    public double tmh() {
        return this.oo.nn();
    }

    public int gh() {
        return this.oo.uae();
    }

    public String gdh() {
        return this.oo.ln();
    }

    public String otd() {
        return this.oo.fvk();
    }

    public boolean ei() {
        return this.oo.mua();
    }

    public int vgx() {
        return this.oo.bxz();
    }

    public int ywp() {
        return this.oo.fy();
    }

    public int ra() {
        return this.oo.vo();
    }

    public boolean rt() {
        return this.oo.vd();
    }

    public String qc() {
        return this.oo.qy();
    }
}
