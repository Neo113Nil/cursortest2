package com.bytedance.sdk.openadsdk.core.hc.sf.sf;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.adsdk.sf.oo;
import com.bytedance.adsdk.sf.ork;
import com.bytedance.adsdk.ugeno.pcc;
import com.bytedance.adsdk.ugeno.qf.kj;
import com.bytedance.adsdk.ugeno.sf.gm;
import com.bytedance.adsdk.ugeno.vj;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class pcc extends gm<sf> {
    private boolean az;
    private String gga;
    private boolean gpa;
    private float gr;
    private boolean kez;
    private int ofe;
    protected String pcc;
    private boolean rc;
    protected ImageView.ScaleType uae;
    protected HashMap<String, Bitmap> vd;
    protected ImageView.ScaleType xf;
    private float zpi;

    public pcc(Context context) {
        super(context);
        this.gga = "images";
        this.az = true;
        this.zpi = 1.0f;
        this.xf = ImageView.ScaleType.FIT_CENTER;
        this.uae = ImageView.ScaleType.FIT_XY;
        this.vd = new HashMap<>();
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    /* renamed from: gm, reason: merged with bridge method [inline-methods] */
    public sf pcc() {
        sf sfVar = new sf(this.sf);
        sfVar.pcc(this);
        return sfVar;
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void sf() {
        super.sf();
        ((sf) this.vj).setProgress(this.gr);
        if (this.zpi <= 0.0f) {
            this.zpi = 1.0f;
        }
        ((sf) this.vj).setSpeed(this.zpi);
        if (this.pcc.startsWith("local")) {
            ((sf) this.vj).setAnimation(hc(this.pcc));
            ((sf) this.vj).setImageAssetsFolder(this.gga);
        } else {
            ((sf) this.vj).setAnimationFromUrl(this.pcc);
        }
        ((sf) this.vj).setImageAssetDelegate(new AnonymousClass1());
        if (lq()) {
            ((sf) this.vj).setScaleType(this.uae);
        } else {
            ((sf) this.vj).setScaleType(this.xf);
        }
        if (lq()) {
            ((sf) this.vj).setRepeatCount(this.ofe);
        } else {
            ((sf) this.vj).pcc(this.kez);
        }
        if (lq()) {
            if (this.vj == 0 || !this.az) {
                return;
            }
            ((sf) this.vj).pcc();
            return;
        }
        if (this.vj != 0) {
            ((sf) this.vj).pcc();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc$1, reason: invalid class name */
    class AnonymousClass1 implements oo {
        AnonymousClass1() {
        }

        @Override // com.bytedance.adsdk.sf.oo
        public Bitmap pcc(final ork orkVar) {
            final String pcc;
            if (orkVar == null) {
                return null;
            }
            String ork = orkVar.ork();
            String vy = orkVar.vy();
            if (!TextUtils.isEmpty(ork) && TextUtils.isEmpty(vy)) {
                pcc = com.bytedance.adsdk.ugeno.gm.sf.pcc(ork, pcc.this.oo);
            } else {
                pcc = (TextUtils.isEmpty(vy) || !TextUtils.isEmpty(ork)) ? (TextUtils.isEmpty(vy) || TextUtils.isEmpty(ork)) ? null : com.bytedance.adsdk.ugeno.gm.sf.pcc(ork, pcc.this.oo) + com.bytedance.adsdk.ugeno.gm.sf.pcc(vy, pcc.this.oo) : com.bytedance.adsdk.ugeno.gm.sf.pcc(vy, pcc.this.oo);
            }
            if (TextUtils.isEmpty(pcc)) {
                return null;
            }
            Bitmap bitmap = pcc.this.vd.get(pcc);
            if (bitmap != null) {
                return bitmap;
            }
            vj.pcc().sf().pcc(pcc.this.vy, pcc, new pcc.InterfaceC0106pcc() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc.1.1
                @Override // com.bytedance.adsdk.ugeno.pcc.InterfaceC0106pcc
                public void pcc(Bitmap bitmap2) {
                    if (bitmap2 != null) {
                        final Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap2, orkVar.pcc(), orkVar.sf(), false);
                        pcc.this.vd.put(pcc, createScaledBitmap);
                        kj.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.hc.sf.sf.pcc.1.1.1
                            @Override // java.lang.Runnable
                            public void run() {
                                ((sf) pcc.this.vj).pcc(orkVar.kj(), createScaledBitmap);
                            }
                        });
                    }
                }
            });
            return pcc.this.vd.get(pcc);
        }
    }

    public void oo() {
        if (this.vj != 0) {
            ((sf) this.vj).pcc();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.sf.gm
    public void pcc(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
        }
        super.pcc(str, str2);
        str.hashCode();
        switch (str) {
            case "scaleMode":
                this.uae = jr(str2);
                break;
            case "scaleType":
                this.xf = gbb(str2);
                break;
            case "progress":
                this.gr = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0.0f);
                break;
            case "imagePath":
                this.gga = str2;
                break;
            case "autoReverse":
                this.rc = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "src":
                this.pcc = com.bytedance.sdk.openadsdk.core.hc.oo.pcc(str2);
                break;
            case "loop":
                if (lq()) {
                    this.ofe = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 0);
                    break;
                } else {
                    this.kez = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                    break;
                }
            case "speed":
                this.zpi = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, 1.0f);
                break;
            case "autoPlay":
                this.gpa = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, false);
                break;
            case "autoplay":
                this.az = com.bytedance.adsdk.ugeno.qf.gm.pcc(str2, true);
                break;
        }
    }

    public void pcc(AnimatorListenerAdapter animatorListenerAdapter) {
        ((sf) this.vj).pcc(animatorListenerAdapter);
    }

    private String hc(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("local")) {
            return "";
        }
        if (str.contains("shake_phone")) {
            return "lottie_json/shake_phone.json";
        }
        return str.contains("swipe_right") ? "lottie_json/swipe_right.json" : "";
    }

    private ImageView.ScaleType gbb(String str) {
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
            case "fitXY":
                return ImageView.ScaleType.FIT_XY;
            case "fitCenter":
                return ImageView.ScaleType.FIT_CENTER;
            case "centerCrop":
                return ImageView.ScaleType.CENTER_CROP;
            default:
                return scaleType;
        }
    }

    private ImageView.ScaleType jr(String str) {
        ImageView.ScaleType scaleType;
        scaleType = ImageView.ScaleType.FIT_XY;
        str.hashCode();
        switch (str) {
            case "center":
            case "none":
                return ImageView.ScaleType.CENTER;
            case "fit":
                return ImageView.ScaleType.FIT_CENTER;
            case "crop":
                return ImageView.ScaleType.CENTER_CROP;
            case "fill":
                return ImageView.ScaleType.FIT_XY;
            default:
                return scaleType;
        }
    }
}
