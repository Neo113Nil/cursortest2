package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class wh extends vj {
    private static String lo = "";
    private volatile boolean fum;
    protected com.bytedance.sdk.component.adexpress.dynamic.gm.vy gpj;
    private Runnable pcc;
    private Runnable sf;

    public wh(Context context, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
        super(context, dynamicRootView, kjVar);
        this.fum = true;
        setTag(Integer.valueOf(getClickArea()));
        String sf2 = kjVar.ork().sf();
        if ("logo-union".equals(sf2)) {
            dynamicRootView.setLogoUnionHeight(this.kj - ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, this.tmg.sf() + this.tmg.pcc())));
        } else if ("scoreCountWithIcon".equals(sf2)) {
            dynamicRootView.setScoreCountWithIcon(this.kj - ((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(context, this.tmg.sf() + this.tmg.pcc())));
        }
    }

    private String sf(String str) {
        try {
            Map<String, String> vh = this.gbb.getRenderRequest().vh();
            if (vh != null && vh.size() > 0) {
                return vh.get(str);
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    protected FrameLayout.LayoutParams getWidgetLayoutParams() {
        return new FrameLayout.LayoutParams(this.qf, this.kj);
    }

    public boolean vy() {
        int i;
        int i2;
        Drawable backgroundDrawable;
        JSONObject optJSONObject;
        final View view = this.jr == null ? this : this.jr;
        setContentDescription(this.hc.pcc(this.tmg.tsz()));
        String qc = this.tmg.qc();
        String str = null;
        String pcc2 = (TextUtils.isEmpty(qc) || this.gbb == null || this.gbb.getRenderRequest() == null || this.gbb.getRenderRequest().gm() == null || (optJSONObject = this.gbb.getRenderRequest().gm().optJSONObject("creative")) == null) ? null : pcc(optJSONObject.opt(qc));
        if (TextUtils.isEmpty(pcc2)) {
            pcc2 = this.tmg.fum();
        }
        com.bytedance.sdk.component.adexpress.pcc.pcc.gm gm2 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().gm();
        if (gm2 != null) {
            i = gm2.dax();
            i2 = gm2.nac();
        } else {
            i = 0;
            i2 = 0;
        }
        if (this.tmg.lo()) {
            int gpj = this.tmg.gpj();
            String str2 = this.tmg.sf;
            com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().vj().pcc(str2).pcc(this.qf).sf(this.kj).oo(i).vj(i2).pcc(sf(str2)).gm(2).pcc(new gm(this.vh, gpj)).pcc(new sf(view, this));
        } else if (!TextUtils.isEmpty(pcc2)) {
            if (!pcc2.startsWith("http:") && !pcc2.startsWith("https:")) {
                if (this.gbb != null && this.gbb.getRenderRequest() != null) {
                    str = this.gbb.getRenderRequest().yt();
                }
                pcc2 = com.bytedance.sdk.component.adexpress.dynamic.vj.vy.sf(pcc2, str);
            }
            com.bytedance.sdk.component.vj.ork gm3 = com.bytedance.sdk.component.adexpress.pcc.pcc.pcc.pcc().vj().pcc(pcc2).pcc(this.qf).sf(this.kj).oo(i).vj(i2).pcc(sf(pcc2)).gm(1);
            pcc(gm3);
            gm3.pcc(new pcc(view, this.gbb, this.hc));
        }
        if (getBackground() == null && (backgroundDrawable = getBackgroundDrawable()) != null) {
            view.setBackground(backgroundDrawable);
        }
        if (this.tmg.atb() > 0.0d) {
            postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        if (wh.this.tmg.mu() > 0) {
                            wh whVar = wh.this;
                            Drawable gm4 = whVar.gm(whVar.gbb.getBgMaterialCenterCalcColor().get(Integer.valueOf(wh.this.tmg.mu())));
                            if (gm4 == null) {
                                wh whVar2 = wh.this;
                                gm4 = whVar2.pcc(true, whVar2.gbb.getBgMaterialCenterCalcColor().get(Integer.valueOf(wh.this.tmg.mu())));
                            }
                            if (gm4 != null) {
                                view.setBackground(gm4);
                                return;
                            }
                            View view2 = view;
                            wh whVar3 = wh.this;
                            view2.setBackground(whVar3.pcc(true, whVar3.gbb.getBgColor()));
                        }
                    } catch (Exception unused) {
                    }
                }
            }, (long) (this.tmg.atb() * 1000.0d));
        }
        if (this.jr != null) {
            this.jr.setPadding((int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.gm()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.sf()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.oo()), (int) com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.pcc()));
        }
        if (this.dax || this.tmg.gbb() > 0.0d) {
            setShouldInvisible(true);
            view.setVisibility(4);
            setVisibility(4);
        }
        return true;
    }

    private static class gm implements com.bytedance.sdk.component.vj.kj {
        private final WeakReference<Context> pcc;
        private final int sf;

        public gm(Context context, int i) {
            this.pcc = new WeakReference<>(context);
            this.sf = i;
        }

        @Override // com.bytedance.sdk.component.vj.kj
        public Bitmap pcc(Bitmap bitmap) {
            Context context = this.pcc.get();
            if (context != null) {
                return com.bytedance.sdk.component.adexpress.oo.pcc.pcc(context, bitmap, this.sf);
            }
            return null;
        }
    }

    private static class sf implements com.bytedance.sdk.component.vj.dax {
        private final WeakReference<View> pcc;
        private final WeakReference<vj> sf;

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
        }

        public sf(View view, vj vjVar) {
            this.pcc = new WeakReference<>(view);
            this.sf = new WeakReference<>(vjVar);
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            Object sf;
            vj vjVar;
            View view = this.pcc.get();
            if (view == null || (sf = vhVar.sf()) == null || vhVar.gm() == null || (vjVar = this.sf.get()) == null || !(sf instanceof Bitmap)) {
                return;
            }
            view.setBackground(vjVar.pcc((Bitmap) sf));
        }
    }

    private static class pcc implements com.bytedance.sdk.component.vj.dax {
        private final com.bytedance.sdk.component.adexpress.dynamic.oo.kj gm;
        private final WeakReference<View> pcc;
        private final WeakReference<DynamicRootView> sf;

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(int i, String str, Throwable th) {
        }

        public pcc(View view, DynamicRootView dynamicRootView, com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar) {
            this.pcc = new WeakReference<>(view);
            this.sf = new WeakReference<>(dynamicRootView);
            this.gm = kjVar;
        }

        @Override // com.bytedance.sdk.component.vj.dax
        public void pcc(com.bytedance.sdk.component.vj.vh vhVar) {
            Drawable drawable;
            View view = this.pcc.get();
            Object sf = vhVar.sf();
            if (sf instanceof Bitmap) {
                drawable = new BitmapDrawable((Bitmap) sf);
            } else if (sf instanceof Drawable) {
                if (Build.VERSION.SDK_INT >= 28 && (sf instanceof AnimatedImageDrawable)) {
                    ((AnimatedImageDrawable) sf).start();
                }
                drawable = (Drawable) sf;
            } else {
                drawable = null;
            }
            if (!com.bytedance.sdk.component.adexpress.oo.sf()) {
                DynamicRootView dynamicRootView = this.sf.get();
                if (dynamicRootView == null) {
                    return;
                }
                if (!"open_ad".equals(dynamicRootView.getRenderRequest().oo()) && !"splash_ad".equals(dynamicRootView.getRenderRequest().oo())) {
                    view.setBackground(drawable);
                    return;
                } else {
                    view.setBackground(drawable);
                    return;
                }
            }
            if (view == null) {
                return;
            }
            view.setBackground(drawable);
            com.bytedance.sdk.component.adexpress.dynamic.oo.kj kjVar = this.gm;
            if (kjVar == null || kjVar.ork() == null || 6 != this.gm.ork().pcc() || view.getBackground() == null) {
                return;
            }
            view.getBackground().setAutoMirrored(true);
        }
    }

    private String pcc(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof JSONArray) {
            return pcc(((JSONArray) obj).opt(0));
        }
        if (obj instanceof JSONObject) {
            return pcc((Object) ((JSONObject) obj).optString("url"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Drawable gm(String str) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            ArrayList arrayList = new ArrayList();
            String str2 = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                if (jSONArray.getString(i).startsWith("#")) {
                    arrayList.add(jSONArray.getString(i));
                } else if (jSONArray.getString(i).endsWith("deg")) {
                    str2 = jSONArray.getString(i);
                }
            }
            if (arrayList.size() <= 0) {
                return null;
            }
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = com.bytedance.sdk.component.adexpress.dynamic.oo.qf.pcc(((String) arrayList.get(i2)).substring(0, 7));
            }
            GradientDrawable pcc2 = pcc(pcc(str2), iArr);
            pcc2.setShape(0);
            pcc2.setCornerRadius(com.bytedance.sdk.component.adexpress.oo.qf.pcc(this.vh, this.tmg.jr()));
            return pcc2;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static void pcc(com.bytedance.sdk.component.vj.ork orkVar) {
        if ("SMARTISAN".equals(Build.BRAND) && "SM901".equals(getBuildModel())) {
            orkVar.pcc(Bitmap.Config.ARGB_8888);
        }
    }

    private static String getBuildModel() {
        try {
            lo = com.bytedance.sdk.component.utils.qy.pcc();
        } catch (Throwable unused) {
            lo = Build.MODEL;
        }
        if (TextUtils.isEmpty(lo)) {
            lo = Build.MODEL;
        }
        return lo;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        View view = this.jr == null ? this : this.jr;
        double lo2 = this.hc.ork().vj().lo();
        if (lo2 < 90.0d && lo2 > 0.0d) {
            com.bytedance.sdk.component.utils.vy.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh.2
                @Override // java.lang.Runnable
                public void run() {
                    wh.this.setVisibility(8);
                }
            }, (long) (lo2 * 1000.0d));
        }
        pcc(this.hc.ork().vj().gpj(), view);
        if (!TextUtils.isEmpty(this.tmg.lrr())) {
            pcc();
        }
        super.onAttachedToWindow();
    }

    private void pcc(double d, final View view) {
        if (d > 0.0d) {
            com.bytedance.sdk.component.utils.vy.sf().postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh.3
                @Override // java.lang.Runnable
                public void run() {
                    if (wh.this.hc.ork().vj().gga() != null) {
                        return;
                    }
                    view.setVisibility(0);
                    wh.this.setVisibility(0);
                }
            }, (long) (d * 1000.0d));
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.dynamicview.vj, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            removeCallbacks(this.pcc);
            removeCallbacks(this.sf);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(ViewGroup viewGroup) {
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) instanceof com.bytedance.sdk.component.adexpress.dynamic.gm.vy) {
                viewGroup.removeViewAt(i);
            }
        }
    }

    private void pcc() {
        if (this.fum) {
            int fmh = this.tmg.fmh();
            int zsj = this.tmg.zsj();
            Runnable runnable = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh.4
                @Override // java.lang.Runnable
                public void run() {
                    if (wh.this.gbb != null && wh.this.gbb.getRenderRequest() != null) {
                        com.bytedance.sdk.component.adexpress.sf.hc renderRequest = wh.this.gbb.getRenderRequest();
                        com.bytedance.sdk.component.adexpress.dynamic.oo.ork orkVar = new com.bytedance.sdk.component.adexpress.dynamic.oo.ork();
                        orkVar.pcc(renderRequest.jr());
                        orkVar.sf(renderRequest.dax());
                        orkVar.gm(renderRequest.nac());
                        orkVar.pcc(renderRequest.lu());
                        orkVar.sf(renderRequest.gpj());
                        orkVar.gm(renderRequest.lo());
                        orkVar.oo(renderRequest.fum());
                        orkVar.vj(renderRequest.tz());
                        wh whVar = wh.this;
                        Context context = wh.this.vh;
                        wh whVar2 = wh.this;
                        whVar.gpj = new com.bytedance.sdk.component.adexpress.dynamic.gm.vy(context, whVar2, whVar2.tmg, orkVar, renderRequest);
                    } else {
                        wh whVar3 = wh.this;
                        Context context2 = wh.this.vh;
                        wh whVar4 = wh.this;
                        whVar3.gpj = new com.bytedance.sdk.component.adexpress.dynamic.gm.vy(context2, whVar4, whVar4.tmg);
                    }
                    wh whVar5 = wh.this;
                    whVar5.sf(whVar5.gpj);
                    if (wh.this.getParent() instanceof ViewGroup) {
                        ((ViewGroup) wh.this.getParent()).setClipChildren(false);
                    }
                    wh.this.setClipChildren(false);
                    wh.this.gpj.setTag(2);
                    wh whVar6 = wh.this;
                    whVar6.pcc((ViewGroup) whVar6);
                    wh whVar7 = wh.this;
                    whVar7.addView(whVar7.gpj, new FrameLayout.LayoutParams(-1, -1));
                    wh.this.gpj.gm();
                }
            };
            this.pcc = runnable;
            postDelayed(runnable, fmh * 1000);
            if (this.tmg.gd() || zsj >= Integer.MAX_VALUE || fmh >= zsj) {
                return;
            }
            Runnable runnable2 = new Runnable() { // from class: com.bytedance.sdk.component.adexpress.dynamic.dynamicview.wh.5
                @Override // java.lang.Runnable
                public void run() {
                    if (wh.this.gpj != null) {
                        wh.this.fum = false;
                        wh.this.gpj.oo();
                        wh.this.gpj.setVisibility(4);
                        wh whVar = wh.this;
                        whVar.removeView(whVar.gpj);
                    }
                }
            };
            this.sf = runnable2;
            postDelayed(runnable2, zsj * 1000);
        }
    }
}
