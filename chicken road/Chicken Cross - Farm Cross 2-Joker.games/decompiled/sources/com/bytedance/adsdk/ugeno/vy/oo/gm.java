package com.bytedance.adsdk.ugeno.vy.oo;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.adsdk.ugeno.core.wh;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.qf.oo;
import com.bytedance.adsdk.ugeno.vj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.adsdk.ugeno.sf.gm<pcc> {
    private int gga;
    private float gpa;
    private float kez;
    private int ofe;
    protected String pcc;
    private float rc;
    protected String uae;
    protected ImageView.ScaleType vd;
    protected boolean xf;

    public gm(Context context) {
        super(context);
        this.vd = ImageView.ScaleType.FIT_XY;
        this.gga = -1;
        this.rc = -1.0f;
        this.kez = -1.0f;
        this.ofe = 0;
        this.gpa = 50.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        vy();
        ((pcc) this.vj).setScaleType(this.vd);
        ((pcc) this.vj).setBorderColor(this.qcw);
        ((pcc) this.vj).setCornerRadius(this.xb);
        ((pcc) this.vj).setBorderWidth(this.hoh);
        if (this.gga != -1) {
            ((pcc) this.vj).setColorFilter(this.gga);
        }
        ((pcc) this.vj).setEraseEnabled(this.ofe == 1);
        ((pcc) this.vj).setEraseRadius(this.gpa);
    }

    public void gbb(String str) {
        this.pcc = str;
    }

    private void vy() {
        if (TextUtils.isEmpty(this.pcc)) {
            return;
        }
        ((pcc) this.vj).setImageDrawable(null);
        if (this.pcc.startsWith("local://")) {
            try {
                String replace = this.pcc.replace("local://", "");
                if (TextUtils.equals(gm(), "raw")) {
                    ((pcc) this.vj).setImageResource(oo.pcc(this.sf, replace));
                    return;
                } else {
                    pcc((ImageView) this.vj, replace);
                    return;
                }
            } catch (Throwable unused) {
                return;
            }
        }
        if (this.pcc.startsWith("@")) {
            try {
                ((pcc) this.vj).setImageResource(Integer.parseInt(this.pcc.substring(1)));
                return;
            } catch (Exception unused2) {
                return;
            }
        }
        ork();
    }

    public void pcc(ImageView imageView, String str) {
        imageView.setImageResource(oo.sf(this.sf, str));
    }

    private void ork() {
        if (this.rc > 0.0f) {
            vj.pcc().sf().pcc(this.vy, this.pcc, new pcc.InterfaceC0106pcc() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.1
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
                public void pcc(Bitmap bitmap) {
                    if (bitmap == null) {
                        if (gm.this.vo != null) {
                            wh unused = gm.this.vo;
                            return;
                        }
                        return;
                    }
                    if (gm.this.vo != null) {
                        wh unused2 = gm.this.vo;
                    }
                    final Bitmap pcc = kj.pcc(gm.this.sf, bitmap, (int) gm.this.rc);
                    if (pcc != null) {
                        kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((pcc) gm.this.vj).setImageBitmap(pcc);
                            }
                        });
                    }
                    if (gm.this.xf || gm.this.kez > 0.0f) {
                        Bitmap pcc2 = kj.pcc(gm.this.sf, bitmap, gm.this.kez > 0.0f ? (int) gm.this.kez : 10);
                        if (pcc2 != null) {
                            final BitmapDrawable bitmapDrawable = new BitmapDrawable(gm.this.sf.getResources(), pcc2);
                            kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.1.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    ((pcc) gm.this.vj).setBackground(bitmapDrawable);
                                }
                            });
                        }
                    }
                }
            });
            return;
        }
        vj.pcc().sf().pcc(this.vy, this.pcc, (ImageView) this.vj, ((pcc) this.vj).getWidth(), ((pcc) this.vj).getHeight(), new pcc.InterfaceC0106pcc() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.2
            @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
            public void pcc(Bitmap bitmap) {
                if (bitmap == null) {
                    if (gm.this.vo != null) {
                        wh unused = gm.this.vo;
                    }
                } else if (gm.this.vo != null) {
                    wh unused2 = gm.this.vo;
                }
            }
        });
        if (this.xf || this.kez > 0.0f) {
            vj.pcc().sf().pcc(this.vy, this.pcc, new pcc.InterfaceC0106pcc() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.3
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
                public void pcc(Bitmap bitmap) {
                    if (bitmap == null) {
                        return;
                    }
                    final Bitmap pcc = kj.pcc(gm.this.sf, bitmap, gm.this.kez > 0.0f ? (int) gm.this.kez : 10);
                    kj.pcc(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.3.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (pcc != null) {
                                ((pcc) gm.this.vj).setBackground(new BitmapDrawable(gm.this.sf.getResources(), pcc));
                            }
                        }
                    });
                }
            });
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: oo, reason: merged with bridge method [inline-methods] */
    public pcc pcc() {
        pcc pccVar = new pcc(this.sf);
        pccVar.pcc(this);
        return pccVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
            case "scaleType":
                this.vd = hc(str2);
                break;
            case "imageBlur":
                this.rc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
            case "eraseRadius":
                this.gpa = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 50.0f);
                if (this.vj != 0) {
                    ((pcc) this.vj).setEraseRadius(this.gpa);
                    break;
                }
                break;
            case "isBgGaussianBlur":
                this.xf = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "src":
                this.pcc = str2;
                break;
            case "erase":
                int pcc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                this.ofe = pcc;
                if (pcc == 1 && this.vj != 0) {
                    ((pcc) this.vj).setEraseEnabled(true);
                    break;
                }
                break;
            case "tintColor":
                this.gga = com.bytedance.adsdk.ugeno.qf.pcc.pcc(str2);
                break;
            case "imageBgBlur":
                this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, -1.0f);
                break;
        }
    }

    private ImageView.ScaleType hc(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
                return ImageView.ScaleType.CENTER;
            case "fitEnd":
                return ImageView.ScaleType.FIT_END;
            case "fitStart":
                return ImageView.ScaleType.FIT_START;
            case "centerInside":
                return ImageView.ScaleType.CENTER_INSIDE;
            case "fit":
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fill":
            case "fitXY":
                return ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void qf() {
        super.qf();
        ((pcc) this.vj).post(new Runnable() { // from class: com.bytedance.adsdk.ugeno.vy.oo.gm.4
            @Override // java.lang.Runnable
            public void run() {
                Drawable drawable = ((pcc) gm.this.vj).getDrawable();
                if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
                    return;
                }
                ((AnimatedImageDrawable) drawable).start();
            }
        });
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void kj() {
        super.kj();
        Drawable drawable = ((pcc) this.vj).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm, com.bytedance.adsdk.ugeno.oo
    public void pcc(String str, Map<String, Object> map) {
        this.qf = (com.bytedance.adsdk.ugeno.sf.pcc) sf((com.bytedance.adsdk.ugeno.sf.gm) this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pq());
        Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getValue());
        }
        pcc(this.qf, str, arrayList.toArray());
    }

    private void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, Object... objArr) {
        List<com.bytedance.adsdk.ugeno.sf.gm<View>> vy;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(str, objArr);
        if (!(gmVar instanceof com.bytedance.adsdk.ugeno.sf.pcc) || (vy = ((com.bytedance.adsdk.ugeno.sf.pcc) gmVar).vy()) == null || vy.isEmpty()) {
            return;
        }
        Iterator<com.bytedance.adsdk.ugeno.sf.gm<View>> it = vy.iterator();
        while (it.hasNext()) {
            pcc(it.next(), str, objArr);
        }
    }

    protected String gm() {
        return this.uae;
    }
}
