package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class vh extends wh {
    private String pcc;

    public vh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        if (!TextUtils.isEmpty(this.tmg.otd()) && kjVar.gpj()) {
            com.bytedance.sdk.component.adexpress.wh.ork orkVar = new com.bytedance.sdk.component.adexpress.wh.ork(context);
            orkVar.setAnimationsLoop(this.tmg.ei());
            orkVar.setImageLottieTosPath(this.tmg.otd());
            orkVar.setLottieAppNameMaxLength(this.tmg.ra());
            orkVar.setLottieAdTitleMaxLength(this.tmg.ywp());
            orkVar.setLottieAdDescMaxLength(this.tmg.vgx());
            orkVar.setData(kjVar.lo());
            this.jr = orkVar;
        } else if (this.tmg.jr() > 0.0f) {
            this.jr = new com.bytedance.sdk.component.adexpress.wh.yt(context);
            ((com.bytedance.sdk.component.adexpress.wh.yt) this.jr).setXRound((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, this.tmg.jr()));
            ((com.bytedance.sdk.component.adexpress.wh.yt) this.jr).setYRound((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, this.tmg.jr()));
        } else if (!kj() && "arrowButton".equals(kjVar.ork().sf())) {
            com.bytedance.sdk.component.adexpress.dynamic.animation.view.sf sfVar = new com.bytedance.sdk.component.adexpress.dynamic.animation.view.sf(context);
            sfVar.setBrickNativeValue(this.tmg);
            this.jr = sfVar;
        } else {
            this.jr = new ImageView(context);
        }
        this.pcc = getImageKey();
        this.jr.setTag(Integer.valueOf(getClickArea()));
        if ("arrowButton".equals(kjVar.ork().sf())) {
            if (this.tmg.sf() > 0 || this.tmg.pcc() > 0) {
                this.qf = Math.min(this.qf, this.kj);
                this.kj = Math.min(this.qf, this.kj);
                this.vy = (int) (this.vy + com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, this.tmg.sf() + (this.tmg.pcc() / 2) + 0.5f));
            } else {
                this.qf = Math.max(this.qf, this.kj);
                this.kj = Math.max(this.qf, this.kj);
            }
            this.tmg.pcc(this.qf / 2);
        }
        addView(this.jr, new FrameLayout.LayoutParams(this.qf, this.kj));
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = ((ImageView) this.jr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).start();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = ((ImageView) this.jr).getDrawable();
        if (Build.VERSION.SDK_INT < 28 || !(drawable instanceof AnimatedImageDrawable)) {
            return;
        }
        ((AnimatedImageDrawable) drawable).stop();
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh, com.bytedance.sdk.component.adexpress.dynamic.dynamicview.pq
    public boolean vy() {
        int i;
        super.vy();
        if (!TextUtils.isEmpty(this.tmg.otd())) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_CROP);
            return true;
        }
        int i2 = 0;
        if ("arrowButton".equals(this.hc.ork().sf())) {
            ((ImageView) this.jr).setImageResource(com.bytedance.sdk.component.utils.tz.oo(this.vh, "tt_white_righterbackicon_titlebar"));
            if (((ImageView) this.jr).getDrawable() != null) {
                ((ImageView) this.jr).getDrawable().setAutoMirrored(true);
            }
            this.jr.setPadding(0, 0, 0, 0);
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.FIT_XY);
            return true;
        }
        this.jr.setBackgroundColor(this.tmg.mk());
        String gm = this.hc.ork().gm();
        if ("user".equals(gm)) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            ((ImageView) this.jr).setColorFilter(this.tmg.qf());
            ((ImageView) this.jr).setImageDrawable(com.bytedance.sdk.component.utils.tz.gm(getContext(), "tt_user"));
            ((ImageView) this.jr).setPadding(this.qf / 10, this.kj / 5, this.qf / 10, 0);
        } else if (gm != null && gm.startsWith("@")) {
            try {
                ((ImageView) this.jr).setImageResource(Integer.parseInt(gm.substring(1)));
            } catch (Exception unused) {
            }
        }
        com.bytedance.sdk.component.vj.jr vj = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().vj();
        String vh = this.tmg.vh();
        if (!TextUtils.isEmpty(vh) && !vh.startsWith("http:") && !vh.startsWith("https:")) {
            vh = com.bytedance.sdk.component.adexpress.dynamic.vj.vy.sf(vh, (this.gbb == null || this.gbb.getRenderRequest() == null) ? null : this.gbb.getRenderRequest().yt());
        }
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        if (gm2 != null) {
            i2 = gm2.dax();
            i = gm2.nac();
        } else {
            i = 0;
        }
        com.bytedance.sdk.component.vj.ork vj2 = vj.pcc(vh).pcc(this.pcc).pcc(this.qf).sf(this.kj).oo(i2).vj(i);
        String gbb = this.gbb.getRenderRequest().gbb();
        if (!TextUtils.isEmpty(gbb)) {
            vj2.sf(gbb);
        }
        if (pcc()) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.FIT_CENTER);
            vj2.pcc(Bitmap.Config.ARGB_4444).gm(2).pcc(new pcc(this.vh)).pcc(new sf(this.jr, getResources()));
        } else {
            if (com.bytedance.sdk.component.adexpress.oo.sf()) {
                vj2.gm(1).pcc((ImageView) this.jr);
            }
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.FIT_XY);
        }
        if ((this.jr instanceof ImageView) && "cover".equals(getImageObjectFit())) {
            ((ImageView) this.jr).setScaleType(ImageView.ScaleType.CENTER_CROP);
        }
        return true;
    }

    private static class pcc implements com.bytedance.sdk.component.vj.kj {
        private final WeakReference<Context> pcc;

        public pcc(Context context) {
            this.pcc = new WeakReference<>(context);
        }

        @Override // com.bytedance.sdk.component.vj.kj
        public Bitmap pcc(Bitmap bitmap) {
            Context context = this.pcc.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.oo.pcc.pcc(context, bitmap, 25);
            }
            return null;
        }
    }

    private static class sf implements com.bytedance.sdk.component.vj.dax {
        private WeakReference<View> pcc;
        private Resources sf;

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
        }

        public sf(View view, Resources resources) {
            this.pcc = new WeakReference<>(view);
            this.sf = resources;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            Object sf;
            View view = this.pcc.get();
            if (view == null || (sf = vhVar.sf()) == null || vhVar.gm() == null) {
                return;
            }
            if (sf instanceof Bitmap) {
                view.setBackground(new BitmapDrawable(this.sf, (Bitmap) sf));
            } else if (sf instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (sf instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) sf).start();
                }
                view.setBackground((Drawable) sf);
            }
        }
    }

    private boolean pcc() {
        String tmg = this.tmg.tmg();
        if (this.tmg.lo()) {
            return true;
        }
        if (TextUtils.isEmpty(tmg)) {
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(tmg);
            return Math.abs((((float) this.qf) / (((float) this.kj) * 1.0f)) - (((float) jSONObject.optInt("width")) / (((float) jSONObject.optInt("height")) * 1.0f))) > 0.01f;
        } catch (JSONException unused) {
            return false;
        }
    }

    private String getImageKey() {
        Map<String, String> vh = this.gbb.getRenderRequest().vh();
        if (vh == null || vh.size() <= 0) {
            return null;
        }
        return vh.get(this.tmg.vh());
    }
}
