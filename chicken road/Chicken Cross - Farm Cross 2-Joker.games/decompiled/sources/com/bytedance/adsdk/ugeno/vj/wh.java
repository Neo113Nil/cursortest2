package com.bytedance.adsdk.ugeno.vj;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.ugeno.sf.pcc;
import com.bytedance.adsdk.ugeno.vj.vj;

/* loaded from: classes4.dex */
public class wh extends com.bytedance.adsdk.ugeno.sf.pcc<vj> {
    private int gga;
    private int rc;
    private int uae;
    private int vd;
    private int xf;

    public wh(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public vj pcc() {
        vj vjVar = new vj(this.sf);
        vjVar.pcc(this);
        return vjVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        ((vj) this.vj).setFlexDirection(this.vd);
        ((vj) this.vj).setFlexWrap(this.xf);
        ((vj) this.vj).setJustifyContent(this.uae);
        ((vj) this.vj).setAlignItems(this.gga);
        ((vj) this.vj).setAlignContent(this.rc);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public pcc.C0109pcc ork() {
        return new pcc(this);
    }

    public static class pcc extends pcc.C0109pcc {
        public int atb;
        public int jsj;
        public int lq;
        public float mk;
        public int mu;
        public int pq;
        public float tsz;
        public float ye;
        public int zti;

        public pcc(com.bytedance.adsdk.ugeno.sf.pcc pccVar) {
            super(pccVar);
            this.jsj = 1;
            this.tsz = 0.0f;
            this.mk = 0.0f;
            this.atb = -1;
            this.ye = -1.0f;
            this.lq = -1;
            this.zti = -1;
            this.pq = ViewCompat.MEASURED_SIZE_MASK;
            this.mu = ViewCompat.MEASURED_SIZE_MASK;
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0109pcc
        public void pcc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.pcc(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasisPercent":
                    this.ye = oo(str2);
                    break;
                case "order":
                    this.jsj = pcc(str2);
                    break;
                case "flexShrink":
                    this.mk = gm(str2);
                    break;
                case "flexGrow":
                    this.tsz = sf(str2);
                    break;
                case "alignSelf":
                    this.atb = vj(str2);
                    break;
            }
        }

        private int pcc(String str) {
            try {
                return Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }

        private float sf(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float gm(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return 0.0f;
            }
        }

        private float oo(String str) {
            try {
                return Float.parseFloat(str);
            } catch (Exception unused) {
                return -1.0f;
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        private int vj(String str) {
            boolean z;
            str.hashCode();
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        z = false;
                        break;
                    }
                    z = -1;
                    break;
                case -1720785339:
                    if (str.equals("baseline")) {
                        z = true;
                        break;
                    }
                    z = -1;
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        z = 2;
                        break;
                    }
                    z = -1;
                    break;
                case 1384876188:
                    if (str.equals("flex_start")) {
                        z = 3;
                        break;
                    }
                    z = -1;
                    break;
                case 1744442261:
                    if (str.equals("flex_end")) {
                        z = 4;
                        break;
                    }
                    z = -1;
                    break;
                default:
                    z = -1;
                    break;
            }
            switch (z) {
                case false:
                    return 4;
                case true:
                    return 3;
                case true:
                    return 2;
                case true:
                    return 0;
                case true:
                    return 1;
                default:
                    return -1;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0109pcc
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public vj.pcc pcc() {
            vj.pcc pccVar = new vj.pcc((int) this.pcc, (int) this.sf);
            pccVar.leftMargin = (int) this.wh;
            pccVar.rightMargin = (int) this.qf;
            pccVar.topMargin = (int) this.kj;
            pccVar.bottomMargin = (int) this.vy;
            pccVar.gm(this.jsj);
            pccVar.oo(this.atb);
            pccVar.pcc(this.tsz);
            pccVar.sf(this.mk);
            pccVar.gm(this.ye);
            return pccVar;
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0109pcc
        public String toString() {
            return "LayoutParams{mWidth=" + this.pcc + ", mHeight=" + this.sf + ", mMargin=" + this.vj + ", mMarginLeft=" + this.wh + ", mMarginRight=" + this.qf + ", mMarginTop=" + this.kj + ", mMarginBottom=" + this.vy + ", mParams=" + this.yt + ", mOrder=" + this.jsj + ", mFlexGrow=" + this.tsz + ", mFlexShrink=" + this.mk + ", mAlignSelf=" + this.atb + ", mFlexBasisPercent=" + this.ye + ", mMinWidth=" + this.lq + ", mMinHeight=" + this.zti + ", mMaxWidth=" + this.pq + ", mMaxHeight=" + this.mu + "} " + super.toString();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.gga = dax(str2);
                break;
            case "flexDirection":
                this.vd = hc(str2);
                break;
            case "alignContent":
                this.rc = nac(str2);
                break;
            case "flexWrap":
                this.xf = gbb(str2);
                break;
            case "justifyContent":
                this.uae = jr(str2);
                break;
        }
    }

    int hc(String str) {
        str.hashCode();
        switch (str) {
            case "column_reverse":
                return 3;
            case "column":
                return 2;
            case "row_reverse":
                return 1;
            default:
                return 0;
        }
    }

    private int gbb(String str) {
        str.hashCode();
        return !str.equals("wrap") ? 0 : 1;
    }

    private int jr(String str) {
        str.hashCode();
        switch (str) {
            case "center":
                return 2;
            case "space_around":
                return 4;
            case "space_between":
                return 3;
            case "flex_end":
                return 1;
            default:
                return 0;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int dax(String str) {
        char c;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -1720785339:
                if (str.equals("baseline")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c != 2) {
            return c != 3 ? 4 : 3;
        }
        return 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private int nac(String str) {
        char c;
        switch (str.hashCode()) {
            case -1881872635:
                if (str.equals("stretch")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -1364013995:
                if (str.equals("center")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -932331738:
                if (str.equals("space_around")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1384876188:
                if (str.equals("flex_start")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1682480591:
                if (str.equals("space_between")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1744442261:
                if (str.equals("flex_end")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return 0;
        }
        if (c == 1) {
            return 1;
        }
        if (c == 2) {
            return 2;
        }
        if (c != 3) {
            return c != 4 ? 5 : 3;
        }
        return 4;
    }
}
