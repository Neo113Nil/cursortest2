package com.bytedance.sdk.openadsdk.pcc.sf;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.core.ork.ork;
import com.bytedance.sdk.openadsdk.core.ork.vy;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* loaded from: classes4.dex */
public class pcc {
    private WeakReference<com.bytedance.sdk.openadsdk.core.gbb.wh> gbb;
    private final String gm;
    private boolean hc = false;
    private PAGMediaView kj;
    private boolean oo;
    private PAGMediaView ork;
    protected final of pcc;
    private com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm qf;
    private final Context sf;
    private com.bytedance.sdk.openadsdk.core.gm.sf tmg;
    private com.bytedance.sdk.openadsdk.core.gm.pcc vh;
    private WeakReference<com.bytedance.sdk.openadsdk.core.jr.sf.wh> vj;
    private fum vy;
    private sf wh;

    public pcc(Context context, of ofVar, String str) {
        this.sf = context;
        this.pcc = ofVar;
        this.gm = str;
    }

    public void pcc(sf sfVar) {
        this.wh = sfVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar) {
        this.qf = gmVar;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar) {
        this.vj = new WeakReference<>(whVar);
    }

    public void pcc(boolean z) {
        this.oo = z;
    }

    public PAGMediaView pcc() {
        return this.kj;
    }

    public fum sf() {
        return this.vy;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        this.vh = pccVar;
    }

    public PAGImageItem gm() {
        of ofVar = this.pcc;
        if (ofVar == null || ofVar.zk() == null) {
            return null;
        }
        return new PAGImageItem(this.pcc.zk().gm(), this.pcc.zk().sf(), this.pcc.zk().pcc(), (float) this.pcc.zk().oo());
    }

    public String oo() {
        of ofVar = this.pcc;
        if (ofVar != null) {
            return pcc(ofVar);
        }
        return null;
    }

    private String pcc(of ofVar) {
        if (ofVar.xfm() != null && !TextUtils.isEmpty(ofVar.xfm().sf())) {
            return ofVar.xfm().sf();
        }
        if (!TextUtils.isEmpty(ofVar.ofe())) {
            return ofVar.ofe();
        }
        if (!TextUtils.isEmpty(ofVar.gmh())) {
            return ofVar.gmh();
        }
        return "";
    }

    private String sf(of ofVar) {
        if (!TextUtils.isEmpty(ofVar.gmh())) {
            return ofVar.gmh();
        }
        if (!TextUtils.isEmpty(ofVar.lc())) {
            return ofVar.lc();
        }
        return "";
    }

    public String vj() {
        of ofVar = this.pcc;
        if (ofVar != null) {
            return sf(ofVar);
        }
        return null;
    }

    public String wh() {
        of ofVar = this.pcc;
        if (ofVar != null) {
            return ofVar.bgf();
        }
        return null;
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.sf sfVar) {
        this.tmg = sfVar;
    }

    public PAGMediaView qf() {
        PAGMediaView vy;
        com.bytedance.sdk.openadsdk.utils.sf.pcc(this.pcc);
        if (this.pcc.ei() == 2) {
            vy = gbb();
            pcc(vy);
        } else {
            vy = vy();
        }
        if (vy != null) {
            vy.setMrcTrackerKey(com.bytedance.sdk.openadsdk.qy.sf.vj.sf(this.pcc));
        } else {
            vy = new PAGMediaView(this.sf) { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.1
                @Override // android.view.ViewGroup, android.view.View
                protected void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.oo.pcc(this, pcc.this.pcc);
                }
            };
        }
        if (vy instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) vy).setMaterialMeta(this.pcc);
        }
        this.ork = vy;
        return vy;
    }

    public PAGMediaView kj() {
        return this.ork;
    }

    private void pcc(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView gbb() {
        if (of.vj(this.pcc)) {
            com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar = this.qf;
            if (gmVar == null || !(gmVar instanceof com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf)) {
                return null;
            }
            lo loVar = (lo) gmVar.oo();
            loVar.setTag(520093762, Boolean.TRUE);
            if (!this.hc) {
                this.qf.vj();
            }
            this.hc = true;
            return pcc(loVar);
        }
        com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar2 = this.qf;
        if (gmVar2 == null) {
            return null;
        }
        fum oo = gmVar2.oo();
        oo.setTag(520093762, Boolean.TRUE);
        if (!this.hc) {
            this.qf.vj();
        }
        this.hc = true;
        return pcc(oo);
    }

    public PAGMediaView vy() {
        if (of.vj(this.pcc)) {
            sf sfVar = this.wh;
            if (sfVar != null) {
                View vj = sfVar.vj();
                if (vj != null) {
                    if (vj.getParent() instanceof ViewGroup) {
                        ((ViewGroup) vj.getParent()).removeView(vj);
                    }
                    PAGMediaView pAGMediaView = this.kj;
                    if (pAGMediaView != null) {
                        pAGMediaView.setOnClickListener(null);
                        this.kj.setOnTouchListener(null);
                    }
                    PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.sf, vj, this);
                    pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
                    if (this.vh != null && vh.sf().oo(String.valueOf(this.pcc.kot()))) {
                        pAGVideoMediaView.setOnClickListener(this.vh);
                        pAGVideoMediaView.setOnTouchListener(this.vh);
                    } else {
                        com.bytedance.sdk.openadsdk.core.gm.gm gmVar = new com.bytedance.sdk.openadsdk.core.gm.gm() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.2
                            @Override // com.bytedance.sdk.openadsdk.core.gm.gm
                            protected void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                                try {
                                    ((PAGVideoMediaView) view).handleInterruptVideo();
                                } catch (Exception unused) {
                                }
                            }
                        };
                        pAGVideoMediaView.setOnClickListener(gmVar);
                        pAGVideoMediaView.setOnTouchListener(gmVar);
                    }
                    this.kj = pAGVideoMediaView;
                    pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                    return pAGVideoMediaView;
                }
                ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
                return null;
            }
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        List<lu> by = this.pcc.by();
        if (by != null && !by.isEmpty()) {
            ImageView imageView = new ImageView(this.sf);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            lu luVar = by.get(0);
            if (luVar != null) {
                com.bytedance.sdk.openadsdk.ork.oo.pcc(luVar).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(this.pcc, luVar.pcc(), imageView));
            }
            PAGMediaView pcc = pcc(imageView);
            if (this.vh != null && vh.sf().oo(String.valueOf(this.pcc.kot()))) {
                pcc.setOnClickListener(this.vh);
                pcc.setOnTouchListener(this.vh);
            } else {
                pcc.setOnClickListener(null);
                pcc.setOnTouchListener(null);
            }
            pcc.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView2 = this.kj;
            if (pAGMediaView2 != null) {
                pAGMediaView2.setOnClickListener(null);
                this.kj.setOnTouchListener(null);
            }
            this.kj = pcc;
            return pcc;
        }
        ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
        return null;
    }

    private PAGMediaView pcc(final View view) {
        int i;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        fum fumVar = this.vy;
        if (fumVar != null) {
            fumVar.setClickListener(null);
            this.vy.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar = this.tmg;
        if (sfVar != null && (sfVar instanceof ork) && (view instanceof fum)) {
            ((fum) view).setClickListener((ork) sfVar);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.vh;
        if (pccVar != null && (pccVar instanceof vy) && (view instanceof fum)) {
            ((fum) view).setClickCreativeListener((vy) pccVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.sf) { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.3
            @Override // android.view.View
            public void onWindowFocusChanged(boolean z) {
                super.onWindowFocusChanged(z);
                if (view instanceof fum) {
                    return;
                }
                pcc(z);
            }

            private void pcc(boolean z) {
                if (this.pcc != null) {
                    com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(this.pcc), z ? 4 : 8);
                }
                if (pcc.this.pcc != null) {
                    com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(pcc.this.pcc, z);
                }
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                pcc.this.pcc(pAGVideoAdListener);
            }

            @Override // android.view.ViewGroup, android.view.View
            protected void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.oo.pcc(this, pcc.this.pcc);
            }
        };
        int i2 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i2 = layoutParams.width;
            i = layoutParams.height;
        } else {
            i = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i2, i);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof fum) {
            this.vy = (fum) view;
        }
        return pAGMediaView;
    }

    public View ork() {
        if (com.bytedance.sdk.openadsdk.core.lu.pcc() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(com.bytedance.sdk.openadsdk.core.lu.pcc()) { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.4
            int pcc = 0;
            int sf = 0;

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            protected void onMeasure(int i, int i2) {
                if (this.pcc == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, Integer.MIN_VALUE), i2);
                    this.pcc = getMeasuredWidth();
                    this.sf = this.containerHeight;
                }
                setMeasuredDimension(this.pcc, this.sf);
            }

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
                super.onLayout(z, i, i2, i3, i4);
                try {
                    Object parent = getParent();
                    if (parent == null || this.pcc == 0 || this.sf == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i5 = this.pcc;
                    if (width < i5 || height < this.sf) {
                        float min = Math.min(height / this.sf, width / i5);
                        int i6 = (width - this.pcc) / 2;
                        if (min != 1.0f) {
                            setScaleX(min);
                            setScaleY(min);
                            setTranslationX(i6);
                        }
                    }
                } catch (Throwable th) {
                    th.getMessage();
                }
            }
        };
        pAGLogoView.initData(this.pcc);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                pcc.this.tmg();
            }
        });
        return pAGLogoView;
    }

    public View vh() {
        of ofVar;
        if (com.bytedance.sdk.openadsdk.core.lu.pcc() == null || (ofVar = this.pcc) == null || !ofVar.on() || !this.pcc.of()) {
            return null;
        }
        ImageView imageView = new ImageView(com.bytedance.sdk.openadsdk.core.lu.pcc());
        com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(com.bytedance.sdk.openadsdk.core.lu.pcc(), 14.0f, true), imageView, this.pcc);
        return imageView;
    }

    public void tmg() {
        if (this.sf != null) {
            if (com.bytedance.sdk.openadsdk.utils.sf.wh() && com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                IABLandingPageActivity.pcc(this.sf, this.pcc, this.gm);
            } else {
                TTWebsiteActivity.pcc(this.sf, this.pcc, this.gm);
            }
        }
    }

    public void pcc(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.pcc.sf.pcc.gm gmVar;
        if (this.pcc.ei() == 2 && of.vj(this.pcc) && (gmVar = this.qf) != null && (gmVar instanceof com.bytedance.sdk.openadsdk.pcc.sf.pcc.sf)) {
            lo loVar = (lo) gmVar.oo();
            if (loVar != null) {
                loVar.setVideoAdListener(sf(pAGVideoAdListener));
                return;
            }
            return;
        }
        sf sfVar = this.wh;
        if (sfVar != null) {
            sfVar.pcc(sf(pAGVideoAdListener));
        }
    }

    private gm sf(final PAGVideoAdListener pAGVideoAdListener) {
        return new gm() { // from class: com.bytedance.sdk.openadsdk.pcc.sf.pcc.6
            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void pcc(int i, int i2) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void pcc(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void sf(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.pcc.sf.gm
            public void gm(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }
        };
    }

    public void hc() {
        com.bytedance.sdk.openadsdk.core.gbb.wh whVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.gbb.wh> weakReference = this.gbb;
        if (weakReference == null || (whVar = weakReference.get()) == null) {
            return;
        }
        whVar.pcc(13);
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gbb.wh whVar) {
        this.gbb = new WeakReference<>(whVar);
    }
}
