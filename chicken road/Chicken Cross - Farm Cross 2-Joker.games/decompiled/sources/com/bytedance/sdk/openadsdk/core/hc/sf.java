package com.bytedance.sdk.openadsdk.core.hc;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.qf.kj;

/* loaded from: classes4.dex */
public class sf {
    private float dax;
    private boolean gbb;
    private Context gpj;
    private int hc;
    private float jr;
    private boolean lo;
    private float lu;
    private float nac;
    private TextUtils.TruncateAt ork;
    protected String pcc;
    private int qf;
    private float tmg;
    private float vh;
    private int vj;
    private int vy;
    protected int sf = ViewCompat.MEASURED_STATE_MASK;
    private float gm = 12.0f;
    private float oo = -1.0f;
    private int wh = Integer.MAX_VALUE;
    private int kj = GravityCompat.START;

    public sf(Context context, boolean z) {
        this.gpj = context;
        this.lo = z;
    }

    public void pcc(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        if (pccVar == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.pcc)) {
            pccVar.setText(TextUtils.equals("null", this.pcc) ? "" : this.pcc);
        }
        pccVar.setTextSize(1, this.gm);
        pccVar.setMinTextSize(kj.pcc(this.gpj, this.oo));
        pccVar.setTextColor(this.sf);
        pccVar.setGravity(this.kj);
        pccVar.setLines(this.qf);
        pccVar.setMaxLines(this.wh);
        int i = this.vy;
        if (i != Integer.MAX_VALUE) {
            pccVar.setPaintFlags(i);
        }
        pccVar.setEllipsize(this.ork);
        if (this.vh > 0.0f) {
            if (this.lo) {
                gm(pccVar);
            } else {
                sf(pccVar);
            }
        }
        pccVar.setTypeface(pcc((int) this.tmg));
        oo(pccVar);
        float pcc = kj.pcc(this.gpj, this.gm);
        if (pcc > 0.0f) {
            pccVar.setLetterSpacing(this.lu / pcc);
        }
        pccVar.setIncludeFontPadding(false);
    }

    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        str.hashCode();
        switch (str) {
            case "shadowColor":
                this.hc = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                this.gbb = true;
                break;
            case "shadowOffsetX":
                this.jr = kj.pcc(this.gpj, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "shadowOffsetY":
                this.dax = kj.pcc(this.gpj, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
            case "textAlign":
                this.kj = pcc(str2);
                break;
            case "textColor":
                this.sf = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "textStyle":
                this.vj = sf(str2);
                break;
            case "shadowBlur":
                this.nac = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "textSize":
                this.gm = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "textDecoration":
                this.vy = oo(str2);
                break;
            case "fontWeight":
                float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                this.tmg = pcc;
                if (pcc < 1.0f || pcc > 1000.0f) {
                    this.tmg = 400.0f;
                    break;
                }
                break;
            case "lineHeight":
                this.vh = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "text":
                this.pcc = str2;
                break;
            case "lines":
                this.qf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                break;
            case "ellipsis":
                this.ork = gm(str2);
                break;
            case "minTextSize":
                this.oo = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "maxLines":
                int pcc2 = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, Integer.MAX_VALUE);
                this.wh = pcc2 > 0 ? pcc2 : Integer.MAX_VALUE;
                break;
            case "letterSpacing":
                this.lu = kj.pcc(this.gpj, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f));
                break;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int pcc(String str) {
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

    private int sf(String str) {
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

    private Typeface pcc(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Typeface.create(Typeface.DEFAULT, i, false);
        }
        return i >= 700 ? Typeface.DEFAULT_BOLD : Typeface.DEFAULT;
    }

    private TextUtils.TruncateAt gm(String str) {
        if (TextUtils.equals(str, "none")) {
            return null;
        }
        return TextUtils.TruncateAt.END;
    }

    private int oo(String str) {
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

    private void sf(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        pccVar.setLineSpacing(0.0f, this.vh);
    }

    private void gm(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        float f = this.vh;
        if (f <= 3.0f) {
            pccVar.setLineSpacing(0.0f, f);
        } else if (Build.VERSION.SDK_INT >= 28) {
            int round = Math.round(kj.pcc(this.gpj, (this.vh - (this.gm * 1.2f)) / 2.0f));
            pccVar.setPadding(pccVar.getPaddingLeft(), pccVar.getPaddingTop() + round, pccVar.getPaddingRight(), pccVar.getPaddingBottom() + round);
            pccVar.setLineHeight(Math.round(kj.pcc(this.gpj, this.vh)));
        }
    }

    private void oo(com.bytedance.adsdk.ugeno.vy.wh.pcc pccVar) {
        if (this.lo) {
            if (this.gbb) {
                float f = this.nac;
                if (f <= 0.0f) {
                    f = 1.0E-5f;
                }
                pccVar.setShadowLayer(f, this.jr, this.dax, this.hc);
                return;
            }
            return;
        }
        pccVar.setShadowLayer(this.nac, this.jr, this.dax, this.hc);
    }
}
