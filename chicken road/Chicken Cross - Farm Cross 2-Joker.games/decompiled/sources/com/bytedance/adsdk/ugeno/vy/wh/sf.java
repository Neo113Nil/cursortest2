package com.bytedance.adsdk.ugeno.vy.wh;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.sf.gm;

/* loaded from: classes4.dex */
public class sf extends gm<pcc> {

    @Deprecated
    private TextUtils.TruncateAt az;

    @Deprecated
    private float by;
    private float eko;
    private int gga;
    private int gpa;
    private TextUtils.TruncateAt gr;
    private float jmx;
    private int kez;
    private float ln;
    private int ofe;
    private float oyx;
    protected String pcc;
    private float pzh;
    private int rc;
    private boolean rv;
    private float uae;
    protected int vd;
    private float xf;

    @Deprecated
    private float xy;
    private int zk;
    private float zpi;

    public sf(Context context) {
        super(context);
        this.vd = ViewCompat.MEASURED_STATE_MASK;
        this.xf = 12.0f;
        this.uae = -1.0f;
        this.rc = Integer.MAX_VALUE;
        this.ofe = GravityCompat.START;
        this.gr = TextUtils.TruncateAt.END;
        this.zpi = -1.0f;
        this.jmx = 400.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        if (TextUtils.equals("null", this.pcc)) {
            this.pcc = "";
        }
        gbb(this.pcc);
        ((pcc) this.vj).setTextSize(1, this.xf);
        ((pcc) this.vj).setTextColor(this.vd);
        ((pcc) this.vj).setLines(this.kez);
        ((pcc) this.vj).setMaxLines(this.rc);
        ((pcc) this.vj).setGravity(this.ofe);
        ((pcc) this.vj).setIncludeFontPadding(false);
        ((pcc) this.vj).setMinTextSize(kj.pcc(this.sf, this.uae));
        pcc(this.gpa);
        if (lq()) {
            pcc(this.gr);
        } else {
            pcc(this.az);
        }
        if (this.zpi > 0.0f) {
            if (lq()) {
                vy();
            } else {
                oo();
            }
        }
        ((pcc) this.vj).setBreakStrategy(0);
        if (lq()) {
            if (this.rv) {
                if (this.oyx <= 0.0f) {
                    this.oyx = 1.0E-5f;
                }
                ((pcc) this.vj).setShadowLayer(this.oyx, this.ln, this.eko, this.zk);
            }
        } else {
            ((pcc) this.vj).setShadowLayer(this.oyx, this.xy, this.by, this.zk);
        }
        if (this.gga == 1) {
            ((pcc) this.vj).setTypeface(Typeface.DEFAULT, this.gga);
        } else if (Build.VERSION.SDK_INT >= 28) {
            ((pcc) this.vj).setTypeface(Typeface.create(Typeface.DEFAULT, (int) this.jmx, this.gga == 2));
        } else if (this.jmx >= 500.0f) {
            ((pcc) this.vj).setTypeface(Typeface.DEFAULT, 1);
        }
        if (kj.pcc(this.sf, this.xf) > 0.0f) {
            ((pcc) this.vj).setLetterSpacing(this.pzh / kj.pcc(this.sf, this.xf));
        }
    }

    private void oo() {
        ((pcc) this.vj).setLineSpacing(0.0f, this.zpi);
    }

    private void vy() {
        if (this.zpi <= 3.0f) {
            ((pcc) this.vj).setLineSpacing(0.0f, this.zpi);
            return;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            int round = Math.round(kj.pcc(this.sf, (this.zpi - (this.xf * 1.2f)) / 2.0f));
            ((pcc) this.vj).setPadding(((pcc) this.vj).getPaddingLeft(), ((pcc) this.vj).getPaddingTop() + round, ((pcc) this.vj).getPaddingRight(), ((pcc) this.vj).getPaddingBottom() + round);
            ((pcc) this.vj).setLineHeight(Math.round(kj.pcc(this.sf, this.zpi)));
        }
    }

    public void gbb(String str) {
        this.pcc = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (TextUtils.equals("null", str)) {
            this.pcc = "";
        }
        ((pcc) this.vj).setText(this.pcc);
    }

    public void pcc(int i) {
        this.gpa = i;
        if (i == Integer.MAX_VALUE) {
            return;
        }
        ((pcc) this.vj).setPaintFlags(i);
    }

    public void pcc(TextUtils.TruncateAt truncateAt) {
        if (truncateAt == null) {
            return;
        }
        ((pcc) this.vj).setEllipsize(truncateAt);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "shadowRadius":
            case "shadowBlur":
                this.oyx = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "shadowColor":
                this.zk = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                this.rv = true;
                break;
            case "shadowOffsetX":
                this.ln = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.eko = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "textAlign":
                this.ofe = nac(str2);
                break;
            case "textColor":
                this.vd = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "textStyle":
                this.gga = dax(str2);
                break;
            case "textSize":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "textDecoration":
                this.gpa = lu(str2);
                break;
            case "shadowDx":
                this.xy = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "shadowDy":
                this.by = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "fontWeight":
                float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                this.jmx = pcc;
                if (pcc < 1.0f || pcc > 1000.0f) {
                    this.jmx = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.zpi = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "text":
                this.pcc = str2;
                break;
            case "lines":
                this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "ellipsis":
                this.gr = jr(str2);
                break;
            case "minTextSize":
                this.uae = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "maxLines":
                int pcc2 = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, Integer.MAX_VALUE);
                this.rc = pcc2 > 0 ? pcc2 : Integer.MAX_VALUE;
                break;
            case "ellipsize":
                this.az = hc(str2);
                break;
            case "letterSpacing":
                this.pzh = kj.pcc(this.sf, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
        }
    }

    private TextUtils.TruncateAt hc(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                this.az = TextUtils.TruncateAt.MIDDLE;
                break;
            case "end":
                this.az = TextUtils.TruncateAt.END;
                break;
            case "start":
                this.az = TextUtils.TruncateAt.START;
                break;
            default:
                this.az = null;
                break;
        }
        return this.az;
    }

    private TextUtils.TruncateAt jr(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int dax(String str) {
        char c;
        int hashCode = str.hashCode();
        if (hashCode == -1178781136) {
            if (str.equals("italic")) {
                c = 1;
            }
            c = 65535;
        } else if (hashCode != -1039745817) {
            if (hashCode == 3029637 && str.equals("bold")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (str.equals(Constants.NORMAL)) {
                c = 2;
            }
            c = 65535;
        }
        if (c != 0) {
            return c != 1 ? 0 : 2;
        }
        return 1;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int nac(String str) {
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1364013995:
                if (str.equals("center")) {
                    c = 0;
                    break;
                }
                break;
            case -348726240:
                if (str.equals("center_vertical")) {
                    c = 1;
                    break;
                }
                break;
            case 3317767:
                if (str.equals("left")) {
                    c = 2;
                    break;
                }
                break;
            case 108511772:
                if (str.equals("right")) {
                    c = 3;
                    break;
                }
                break;
            case 1063616078:
                if (str.equals("center_horizontal")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 17;
            case 1:
                return 16;
            case 2:
            default:
                return 3;
            case 3:
                return 5;
            case 4:
                return 1;
        }
    }

    private int lu(String str) {
        str.hashCode();
        switch (str) {
            case "underline":
                return 8;
            case "strikethrough":
                return 16;
            case "none":
            default:
                return Integer.MAX_VALUE;
        }
    }
}
