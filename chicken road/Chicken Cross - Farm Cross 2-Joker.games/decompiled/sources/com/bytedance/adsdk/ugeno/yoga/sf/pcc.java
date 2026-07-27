package com.bytedance.adsdk.ugeno.yoga.sf;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.sf.pcc;
import com.bytedance.adsdk.ugeno.yoga.gbb;
import com.bytedance.adsdk.ugeno.yoga.hc;
import com.bytedance.adsdk.ugeno.yoga.oo;
import com.bytedance.adsdk.ugeno.yoga.ork;
import com.bytedance.adsdk.ugeno.yoga.sf.gm;
import com.bytedance.adsdk.ugeno.yoga.vj;
import com.bytedance.adsdk.ugeno.yoga.wh;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.adsdk.ugeno.sf.pcc<gm> {
    private com.bytedance.adsdk.ugeno.yoga.pcc gga;
    private ork kez;
    private com.bytedance.adsdk.ugeno.yoga.pcc rc;
    private wh uae;
    private vj vd;
    private gbb xf;

    public pcc(Context context) {
        super(context);
        this.vd = vj.ROW;
        this.xf = gbb.NO_WRAP;
        this.uae = wh.FLEX_START;
        this.gga = com.bytedance.adsdk.ugeno.yoga.pcc.STRETCH;
        this.rc = com.bytedance.adsdk.ugeno.yoga.pcc.STRETCH;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public gm pcc() {
        gm gmVar = new gm(this.sf);
        gmVar.pcc(this);
        this.kez = gmVar.getYogaNode();
        return gmVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    protected void mk() {
        if (this.lrr) {
            com.bytedance.adsdk.ugeno.vj.pcc().sf().pcc(this.vy, this.tsx, new pcc.InterfaceC0106pcc() { // from class: com.bytedance.adsdk.ugeno.yoga.sf.pcc.1
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
                public void pcc(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (pcc.this.vo != null) {
                            com.bytedance.adsdk.ugeno.core.wh unused = pcc.this.vo;
                            String unused2 = pcc.this.tsx;
                            return;
                        }
                        return;
                    }
                    if (pcc.this.vo != null) {
                        com.bytedance.adsdk.ugeno.core.wh unused3 = pcc.this.vo;
                        String unused4 = pcc.this.tsx;
                    }
                    final Bitmap pcc = kj.pcc(pcc.this.sf, bitmap, (int) pcc.this.rj);
                    if (pcc != null) {
                        kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.yoga.sf.pcc.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                pcc.this.pcc(new BitmapDrawable(pcc));
                            }
                        });
                    }
                }
            });
            return;
        }
        com.bytedance.adsdk.ugeno.vy.oo.pcc pccVar = new com.bytedance.adsdk.ugeno.vy.oo.pcc(this.sf);
        com.bytedance.adsdk.ugeno.vj.pcc().sf().pcc(this.vy, this.tsx, pccVar, this.vj.getWidth(), this.vj.getHeight(), new pcc.InterfaceC0106pcc() { // from class: com.bytedance.adsdk.ugeno.yoga.sf.pcc.2
            @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
            public void pcc(Bitmap bitmap) {
                if (bitmap == null) {
                    if (pcc.this.vo != null) {
                        com.bytedance.adsdk.ugeno.core.wh unused = pcc.this.vo;
                        String unused2 = pcc.this.tsx;
                        return;
                    }
                    return;
                }
                if (pcc.this.vo != null) {
                    com.bytedance.adsdk.ugeno.core.wh unused3 = pcc.this.vo;
                    String unused4 = pcc.this.tsx;
                }
            }
        });
        if (!this.iv || this.kun == ImageView.ScaleType.FIT_XY) {
            pccVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            pccVar.setScaleType(this.kun);
        }
        pccVar.setCornerRadius(this.xb);
        gm.pcc pccVar2 = new gm.pcc(-1, -1);
        pccVar2.wh(hc.ABSOLUTE.pcc());
        pccVar2.qf(0.0f);
        pccVar2.kj(0.0f);
        if (this.vj instanceof gm) {
            ((gm) this.vj).addView(pccVar, 0, pccVar2);
            pcc(pccVar);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    protected void pcc(Drawable drawable) {
        com.bytedance.adsdk.ugeno.vy.oo.pcc pccVar = new com.bytedance.adsdk.ugeno.vy.oo.pcc(this.sf);
        pccVar.setImageDrawable(drawable);
        if (!this.iv || this.kun == ImageView.ScaleType.FIT_XY) {
            pccVar.setScaleType(ImageView.ScaleType.FIT_XY);
        } else {
            pccVar.setScaleType(this.kun);
        }
        pccVar.setCornerRadius(this.xb);
        gm.pcc pccVar2 = new gm.pcc(-1, -1);
        pccVar2.wh(hc.ABSOLUTE.pcc());
        pccVar2.qf(0.0f);
        pccVar2.kj(0.0f);
        if (this.vj instanceof gm) {
            ((gm) this.vj).addView(pccVar, 0, pccVar2);
            pcc(pccVar);
        }
    }

    private void pcc(final com.bytedance.adsdk.ugeno.vy.oo.pcc pccVar) {
        this.vj.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.adsdk.ugeno.yoga.sf.pcc.3
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                ork pcc;
                if (pcc.this.vj == null || (pcc = ((gm) pcc.this.vj).pcc(pccVar)) == null) {
                    return;
                }
                int width = pcc.this.vj.getWidth();
                pcc.oo(width);
                int height = pcc.this.vj.getHeight();
                pcc.wh(height);
                pccVar.setCornerRadius(pcc.this.xb);
                pcc.this.vj.requestLayout();
                if (width > 0 || height > 0) {
                    pcc.this.vj.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc, com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        this.kez.pcc(this.vd);
        this.kez.pcc(this.xf);
        this.kez.pcc(this.uae);
        this.kez.pcc(this.gga);
        this.kez.gm(this.rc);
        this.kez.pcc(true);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    protected void gbb() {
        if (this.lq) {
            this.kez.sf(oo.ALL, this.jsj);
        }
        if (this.zti) {
            this.kez.sf(oo.LEFT, this.tsz);
        }
        if (this.pq) {
            this.kez.sf(oo.RIGHT, this.mk);
        }
        if (this.mu) {
            this.kez.sf(oo.TOP, this.atb);
        }
        if (this.nn) {
            this.kez.sf(oo.BOTTOM, this.ye);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar) {
        super.pcc(gmVar);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, ViewGroup.LayoutParams layoutParams) {
        if (gmVar == null) {
            return;
        }
        this.pcc.add(gmVar);
        View vh = gmVar.vh();
        if (vh != null) {
            ((gm) this.vj).addView(vh, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.pcc
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public C0114pcc ork() {
        return new C0114pcc(this);
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "alignItems":
                this.gga = com.bytedance.adsdk.ugeno.yoga.pcc.pcc(str2);
                break;
            case "flexDirection":
                this.vd = vj.pcc(str2);
                break;
            case "alignContent":
                this.rc = com.bytedance.adsdk.ugeno.yoga.pcc.pcc(str2);
                break;
            case "flexWrap":
                this.xf = gbb.pcc(str2);
                break;
            case "justifyContent":
                this.uae = wh.pcc(str2);
                break;
        }
    }

    public vj se() {
        return this.vd;
    }

    /* renamed from: com.bytedance.adsdk.ugeno.yoga.sf.pcc$pcc, reason: collision with other inner class name */
    public static class C0114pcc extends pcc.C0109pcc {
        public int atb;
        private boolean iv;
        public int jsj;
        private boolean kun;
        public int lq;
        private boolean lrr;
        public float mk;
        public int mu;
        public int nn;
        public int pq;
        private boolean rj;
        public float rnn;
        private boolean tsx;
        public float tsz;
        private boolean xb;
        public float ye;
        public int zti;

        public C0114pcc(com.bytedance.adsdk.ugeno.sf.pcc pccVar) {
            super(pccVar);
            this.jsj = 1;
            this.tsz = 0.0f;
            this.mk = 1.0f;
            this.atb = com.bytedance.adsdk.ugeno.yoga.pcc.AUTO.pcc();
            this.ye = -1.0f;
            this.lq = hc.RELATIVE.pcc();
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0109pcc
        public void pcc(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            super.pcc(context, str, str2);
            str.hashCode();
            switch (str) {
                case "flexBasis":
                    this.tsx = true;
                    float pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                    this.ye = pcc;
                    this.ye = kj.pcc(context, pcc);
                    break;
                case "bottom":
                    this.rj = true;
                    this.pq = (int) kj.pcc(context, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0));
                    break;
                case "top":
                    this.kun = true;
                    this.zti = (int) kj.pcc(context, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0));
                    break;
                case "left":
                    this.lrr = true;
                    this.mu = (int) kj.pcc(context, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0));
                    break;
                case "order":
                    this.jsj = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1);
                    break;
                case "ratio":
                    this.xb = true;
                    this.rnn = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                    break;
                case "right":
                    this.iv = true;
                    this.nn = (int) kj.pcc(context, com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0));
                    break;
                case "position":
                    this.lq = hc.pcc(str2).pcc();
                    break;
                case "flexShrink":
                    this.mk = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                    break;
                case "flexGrow":
                    this.tsz = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                    break;
                case "alignSelf":
                    this.atb = com.bytedance.adsdk.ugeno.yoga.pcc.pcc(str2).pcc();
                    break;
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0109pcc
        /* renamed from: sf, reason: merged with bridge method [inline-methods] */
        public gm.pcc pcc() {
            oo();
            gm.pcc pccVar = new gm.pcc((int) this.pcc, (int) this.sf);
            pccVar.tmg((int) (this.lo ? this.wh : this.vj));
            pccVar.gbb((int) (this.fum ? this.qf : this.vj));
            pccVar.vh((int) (this.tz ? this.kj : this.vj));
            pccVar.hc((int) (this.of ? this.vy : this.vj));
            pccVar.pcc(this.jsj);
            pccVar.vj(this.atb);
            pccVar.sf(this.tsz);
            pccVar.gm(this.mk);
            pccVar.dax(this.gm);
            pccVar.nac(this.oo);
            if (this.tsx) {
                pccVar.oo(this.ye);
            }
            pccVar.wh(this.lq);
            if (this.kun) {
                pccVar.qf(this.zti);
            }
            if (this.rj) {
                pccVar.vy(this.pq);
            }
            if (this.lrr) {
                pccVar.kj(this.mu);
            }
            if (this.iv) {
                pccVar.ork(this.nn);
            }
            if (this.xb && gm()) {
                float f = this.rnn;
                if (f > 0.0f) {
                    pccVar.jr(f);
                    pccVar.gm(0.0f);
                    pccVar.sf(0.0f);
                }
            }
            return pccVar;
        }

        public boolean gm() {
            if (this.pcc == -1.0f && this.sf == -1.0f) {
                return false;
            }
            return this.pcc == -2.0f || this.sf == -2.0f;
        }

        private void oo() {
            if (this.qy instanceof pcc) {
                if (((pcc) this.qy).se() == vj.ROW && this.qy.nn() == -2 && this.pcc == -1.0f && !this.qy.xb()) {
                    this.pcc = -2.0f;
                    this.mk = 1.0f;
                    this.tsz = 1.0f;
                    this.tsx = true;
                    this.ye = -1.0f;
                }
                if (((pcc) this.qy).se() == vj.COLUMN && this.qy.rnn() == -2 && this.sf == -1.0f && !this.qy.xb()) {
                    this.sf = -2.0f;
                    this.mk = 1.0f;
                    this.tsz = 1.0f;
                    this.tsx = true;
                    this.ye = -1.0f;
                }
            }
        }

        @Override // com.bytedance.adsdk.ugeno.sf.pcc.C0109pcc
        public String toString() {
            return "LayoutParams{mOrder=" + this.jsj + ", mFlexGrow=" + this.tsz + ", mFlexShrink=" + this.mk + ", mAlignSelf=" + this.atb + ", mFlexBasis=" + this.ye + ", mPosition=" + this.lq + ", mTop=" + this.zti + ", mBottom=" + this.pq + ", mLeft=" + this.mu + ", mRight=" + this.nn + AbstractJsonLexerKt.END_OBJ;
        }
    }
}
