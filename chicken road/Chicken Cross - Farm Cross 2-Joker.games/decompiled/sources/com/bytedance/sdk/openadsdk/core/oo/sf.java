package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.gpj;
import com.bytedance.sdk.openadsdk.core.ork.lo;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hc;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.core.widget.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.bytedance.sdk.openadsdk.utils.vh;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.sdk.openadsdk.core.ork.pcc {
    public static gpj[] pcc = {new gpj(1, 6.4f, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50), new gpj(4, 1.2f, 300, ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION)};
    private String gbb;
    private fum hc;
    private PAGBannerAdWrapperListener jr;
    private pcc tmg;

    public void setClosedListenerKey(String str) {
        this.gbb = str;
    }

    public sf(Context context) {
        super(context);
        this.sf = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    protected void pcc(View view, int i, dax daxVar) {
        fum fumVar = this.hc;
        if (fumVar != null) {
            fumVar.pcc(view, i, daxVar);
        }
    }

    void pcc(of ofVar, fum fumVar, com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar) {
        setBackgroundColor(-1);
        this.gm = ofVar;
        this.hc = fumVar;
        this.wh = "banner_ad";
        this.hc.addView(this, new ViewGroup.LayoutParams(-2, -2));
        sf();
    }

    private void sf() {
        gpj pcc2 = pcc(this.hc.getExpectExpressWidth(), this.hc.getExpectExpressHeight());
        if (this.hc.getExpectExpressWidth() > 0 && this.hc.getExpectExpressHeight() > 0) {
            this.qf = rj.sf(this.sf, this.hc.getExpectExpressWidth());
            this.kj = rj.sf(this.sf, this.hc.getExpectExpressHeight());
        } else {
            this.qf = rj.gm(this.sf);
            this.kj = Float.valueOf(this.qf / pcc2.sf).intValue();
        }
        if (this.qf > 0 && this.qf > rj.gm(this.sf)) {
            this.qf = rj.gm(this.sf);
            this.kj = Float.valueOf(this.kj * (rj.gm(this.sf) / this.qf)).intValue();
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(this.qf, this.kj);
        }
        layoutParams.width = this.qf;
        layoutParams.height = this.kj;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).gravity = 17;
        }
        setLayoutParams(layoutParams);
        if (this.gm != null) {
            int ct = this.gm.ct();
            if (ct == 1010 || ct == 1011 || ct == 1012) {
                oo();
            } else {
                pcc(pcc2);
            }
        }
    }

    private void pcc(gpj gpjVar) {
        if (gpjVar.pcc == 1) {
            gm();
        } else {
            vj();
        }
    }

    private void gm() {
        rj.sf(this.sf, 50.0f);
        pcc qf = qf();
        this.tmg = qf;
        ImageView imageView = qf.gm;
        TextView textView = this.tmg.sf;
        com.bytedance.sdk.openadsdk.core.widget.dax daxVar = this.tmg.oo;
        TextView textView2 = this.tmg.qf;
        View view = this.tmg.wh;
        if (view != null) {
            view.setOnClickListener(ork());
        }
        if (this.gm.zk() != null && !TextUtils.isEmpty(this.gm.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gm.zk().pcc(), this.gm.zk().sf(), this.gm.zk().gm(), imageView, this.gm);
        }
        textView.setText(this.gm.gmh());
        if (!TextUtils.isEmpty(this.gm.bgf())) {
            textView2.setText(this.gm.bgf());
        } else {
            textView2.setVisibility(8);
        }
        rj.pcc((TextView) null, daxVar, this.gm);
        pcc((View) imageView, true);
        imageView.setTag(520093762, Boolean.TRUE);
        pcc((View) this, true);
        pcc((View) textView2, true);
    }

    private void oo() {
        pcc wh = wh();
        this.tmg = wh;
        View view = wh.wh;
        if (view != null) {
            view.setOnClickListener(ork());
        }
        hc hcVar = this.tmg.pcc;
        if (hcVar != null) {
            List<lu> by = this.gm.by();
            if (by != null && !by.isEmpty()) {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(by.get(0), hcVar, this.gm);
            }
            pcc((View) hcVar, true);
            hcVar.setTag(520093762, Boolean.TRUE);
        }
    }

    private void vj() {
        TextView textView;
        TextView textView2;
        if (this.gm != null) {
            int ct = this.gm.ct();
            if (this.gm.kez() == null) {
                pcc kj = kj();
                this.tmg = kj;
                hc hcVar = kj.pcc;
                ImageView imageView = this.tmg.gm;
                TextView textView3 = this.tmg.sf;
                TextView textView4 = this.tmg.qf;
                View view = this.tmg.wh;
                if (view != null) {
                    view.setOnClickListener(ork());
                }
                ViewGroup.LayoutParams layoutParams = hcVar.getLayoutParams();
                if (this.qf - (rj.sf(this.sf, 8.0f) * 2) >= ((this.kj - rj.sf(this.sf, 8.0f)) - (rj.sf(this.sf, 21.0f) * 2)) - rj.sf(this.sf, 52.0f)) {
                    layoutParams.width = -2;
                    layoutParams.height = -1;
                } else {
                    layoutParams.width = -1;
                    layoutParams.height = -2;
                }
                hcVar.setLayoutParams(layoutParams);
                if (ct == 33) {
                    hcVar.setRatio(1.0f);
                } else {
                    hcVar.setRatio(1.91f);
                }
                List<lu> by = this.gm.by();
                if (by != null && !by.isEmpty()) {
                    com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(by.get(0), hcVar, this.gm);
                    com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(by.get(0).pcc(), this.tmg.vj);
                }
                if (this.gm.zk() == null || TextUtils.isEmpty(this.gm.zk().pcc())) {
                    textView = textView4;
                    textView2 = textView3;
                } else {
                    textView = textView4;
                    textView2 = textView3;
                    com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gm.zk().pcc(), this.gm.zk().sf(), this.gm.zk().gm(), imageView, this.gm);
                }
                textView2.setText(this.gm.gmh());
                if (!TextUtils.isEmpty(this.gm.bgf())) {
                    textView.setText(this.gm.bgf());
                } else {
                    textView.setVisibility(8);
                }
                rj.pcc((TextView) null, this.tmg.oo, this.gm);
                pcc((View) hcVar, true);
                hcVar.setTag(520093762, Boolean.TRUE);
                pcc((View) this, true);
                pcc((View) textView, true);
                return;
            }
            pcc vy = vy();
            this.tmg = vy;
            TextView textView5 = vy.sf;
            TextView textView6 = this.tmg.qf;
            tmg tmgVar = this.tmg.kj;
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gm.kez().ork(), this.tmg.vj);
            View view2 = this.tmg.wh;
            if (view2 != null) {
                view2.setOnClickListener(ork());
            }
            ViewGroup.LayoutParams layoutParams2 = tmgVar.getLayoutParams();
            if (ct == 15) {
                layoutParams2.width = -2;
                layoutParams2.height = -1;
                tmgVar.setLayoutParams(layoutParams2);
                tmgVar.setRatio(0.5625f);
            } else if (ct == 5) {
                layoutParams2.width = -1;
                layoutParams2.height = -2;
                tmgVar.setLayoutParams(layoutParams2);
                tmgVar.setRatio(1.7777778f);
            } else {
                if (this.qf - (rj.sf(this.sf, 8.0f) * 2) >= ((this.kj - rj.sf(this.sf, 8.0f)) - (rj.sf(this.sf, 21.0f) * 2)) - rj.sf(this.sf, 52.0f)) {
                    layoutParams2.width = -2;
                    layoutParams2.height = -1;
                } else {
                    layoutParams2.width = -1;
                    layoutParams2.height = -2;
                }
                tmgVar.setLayoutParams(layoutParams2);
                tmgVar.setRatio(1.0f);
            }
            tmgVar.removeAllViews();
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
            com.bytedance.sdk.openadsdk.core.jr.sf.wh videoView = getVideoView();
            if (videoView != null) {
                if (this.hc instanceof lo) {
                    videoView.setNeedSelfManagerVideo(!((lo) r7).gbb());
                    ((lo) this.hc).setBackupVideoView(videoView);
                    videoView.setVideoAdInteractionListener((lo) this.hc);
                }
                tmgVar.addView(videoView, layoutParams3);
                videoView.setAdCreativeClickListener(new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.sf.1
                    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.pcc
                    public void pcc(View view3, int i) {
                        if (sf.this.jr != null) {
                            sf.this.jr.onAdClicked();
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.core.ork.vy clickCreativeListener = this.hc.getClickCreativeListener();
                if (clickCreativeListener != null) {
                    clickCreativeListener.pcc(videoView.getNativeVideoController());
                }
            }
            if (this.gm.zk() != null && !TextUtils.isEmpty(this.gm.zk().pcc())) {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.gm.zk().pcc(), this.gm.zk().sf(), this.gm.zk().gm(), this.tmg.gm, this.gm);
            }
            textView5.setText(this.gm.gmh());
            rj.pcc((TextView) null, this.tmg.oo, this.gm);
            if (!TextUtils.isEmpty(this.gm.bgf())) {
                textView6.setText(this.gm.bgf());
            } else {
                textView6.setVisibility(8);
            }
            pcc((View) videoView, true);
            if (videoView != null) {
                videoView.setTag(520093762, Boolean.TRUE);
            }
            pcc((View) this, true);
            pcc((View) textView6, true);
            pcc(tmgVar);
        }
    }

    public static gpj pcc(int i, int i2) {
        try {
            return ((double) i2) >= Math.floor((((double) i) * 450.0d) / 600.0d) ? pcc[1] : pcc[0];
        } catch (Throwable unused) {
            return pcc[0];
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    public void pcc() {
        if (this.vj != null) {
            this.vj.show();
        } else if (this.oo != null) {
            this.oo.pcc();
        } else {
            TTDelegateActivity.pcc(this.gm, this.gbb);
        }
    }

    private pcc wh() {
        int sf = rj.sf(this.sf, 8.0f);
        hc hcVar = new hc(this.sf);
        hcVar.setId(520093736);
        hcVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(hcVar, layoutParams);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.sf, this.gm);
        createPAGLogoViewByMaterial.setId(520093739);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.setMargins(sf, sf, 0, 0);
        layoutParams2.gravity = 8388659;
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        addView(createPAGLogoViewByMaterial);
        return new pcc(createPAGLogoViewByMaterial, hcVar);
    }

    private pcc qf() {
        int sf = rj.sf(this.sf, 38.0f);
        int sf2 = (int) (rj.sf(this.sf, 25.0f) / 5.0d);
        int sf3 = rj.sf(this.sf, 10.0f);
        int sf4 = rj.sf(this.sf, 2.0f);
        int sf5 = rj.sf(this.sf, 6.0f);
        int sf6 = rj.sf(this.sf, 8.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.sf);
        addView(relativeLayout, -1, -1);
        nac nacVar = new nac(this.sf);
        nacVar.setId(520093738);
        TextView textView = new TextView(this.sf);
        textView.setId(520093730);
        com.bytedance.sdk.openadsdk.core.widget.dax daxVar = new com.bytedance.sdk.openadsdk.core.widget.dax(this.sf);
        daxVar.setId(520093735);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.sf, this.gm);
        createPAGLogoViewByMaterial.setId(520093739);
        TextView textView2 = new TextView(this.sf);
        textView2.setId(520093703);
        pcc pccVar = new pcc(nacVar, textView, daxVar, createPAGLogoViewByMaterial, textView2);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(sf, sf);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        layoutParams.addRule(20);
        layoutParams.setMarginStart(sf5);
        layoutParams.setMargins(sf5, 0, 0, 0);
        nacVar.setLayoutParams(layoutParams);
        nacVar.setBackgroundColor(-1);
        nacVar.setScaleType(ImageView.ScaleType.FIT_XY);
        relativeLayout.addView(nacVar);
        LinearLayout linearLayout = new LinearLayout(this.sf);
        linearLayout.setOrientation(1);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(15);
        layoutParams2.addRule(16, textView2.getId());
        layoutParams2.addRule(17, nacVar.getId());
        layoutParams2.setMarginStart(sf6);
        layoutParams2.setMarginEnd(sf6);
        layoutParams2.addRule(0, textView2.getId());
        layoutParams2.addRule(1, nacVar.getId());
        layoutParams2.setMargins(sf6, 0, sf6, 0);
        relativeLayout.addView(linearLayout, layoutParams2);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        textView.setTextDirection(5);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(80);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF333333"));
        textView.setTextSize(12.0f);
        textView.setLayoutParams(layoutParams3);
        linearLayout.addView(textView);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.topMargin = sf4;
        daxVar.setLayoutParams(layoutParams4);
        linearLayout.addView(daxVar);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(20);
        layoutParams5.addRule(9);
        layoutParams5.addRule(12);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams5);
        relativeLayout.addView(createPAGLogoViewByMaterial);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(11);
        layoutParams6.addRule(15);
        layoutParams6.setMarginEnd(sf5);
        layoutParams6.addRule(21);
        layoutParams6.rightMargin = sf5;
        textView2.setBackground(vh.pcc(this.sf, 12));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setGravity(17);
        textView2.setMaxLines(1);
        textView2.setPadding(sf3, sf2, sf3, sf2);
        textView2.setText(tz.pcc(this.sf, "tt_video_download_apk"));
        textView2.setTextColor(Color.parseColor("#f0f0f0"));
        textView2.setTextSize(10.0f);
        textView2.setLayoutParams(layoutParams6);
        relativeLayout.addView(textView2);
        return pccVar;
    }

    private pcc kj() {
        int sf = rj.sf(this.sf, 8.0f);
        int sf2 = rj.sf(this.sf, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.sf);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(sf, sf, sf, sf2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.sf);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        nac nacVar = new nac(this.sf);
        nacVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(rj.sf(this.sf, 52.0f), rj.sf(this.sf, 52.0f));
        nacVar.setScaleType(ImageView.ScaleType.FIT_XY);
        nacVar.setLayoutParams(layoutParams3);
        linearLayout.addView(nacVar);
        LinearLayout linearLayout2 = new LinearLayout(this.sf);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = sf;
        layoutParams4.rightMargin = sf;
        layoutParams4.setMarginStart(sf);
        layoutParams4.setMarginEnd(sf);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.sf);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        com.bytedance.sdk.openadsdk.core.widget.dax daxVar = new com.bytedance.sdk.openadsdk.core.widget.dax(this.sf);
        daxVar.setId(520093735);
        linearLayout2.addView(daxVar, new LinearLayout.LayoutParams(-2, -2));
        TextView textView2 = new TextView(this.sf);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(rj.sf(this.sf, 76.0f), rj.sf(this.sf, 36.0f));
        textView2.setBackground(vh.pcc(this.sf, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(tz.pcc(this.sf, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams6);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.sf);
        frameLayout.setLayoutDirection(3);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams7.addRule(2, linearLayout.getId());
        layoutParams7.bottomMargin = sf2;
        frameLayout.setLayoutParams(layoutParams7);
        relativeLayout.addView(frameLayout);
        hc hcVar = new hc(this.sf);
        hcVar.setId(520093736);
        hcVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams8.gravity = 17;
        frameLayout.addView(hcVar, layoutParams8);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.sf, this.gm);
        createPAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams9.addRule(10);
        layoutParams9.addRule(9);
        layoutParams9.setMargins(sf, sf, 0, 0);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams9);
        relativeLayout.addView(createPAGLogoViewByMaterial);
        return new pcc(nacVar, createPAGLogoViewByMaterial, textView2, textView, hcVar, daxVar, frameLayout);
    }

    private pcc vy() {
        int sf = rj.sf(this.sf, 8.0f);
        int sf2 = rj.sf(this.sf, 21.0f);
        RelativeLayout relativeLayout = new RelativeLayout(this.sf);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        relativeLayout.setPadding(sf, sf, sf, sf2);
        relativeLayout.setLayoutParams(layoutParams);
        addView(relativeLayout);
        LinearLayout linearLayout = new LinearLayout(this.sf);
        linearLayout.setId(520093737);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        linearLayout.setGravity(16);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(layoutParams2);
        relativeLayout.addView(linearLayout);
        nac nacVar = new nac(this.sf);
        nacVar.setId(520093738);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(rj.sf(this.sf, 52.0f), rj.sf(this.sf, 52.0f));
        nacVar.setScaleType(ImageView.ScaleType.FIT_XY);
        nacVar.setLayoutParams(layoutParams3);
        linearLayout.addView(nacVar);
        LinearLayout linearLayout2 = new LinearLayout(this.sf);
        linearLayout2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.leftMargin = sf;
        layoutParams4.rightMargin = sf;
        layoutParams4.setMarginStart(sf);
        layoutParams4.setMarginEnd(sf);
        linearLayout.addView(linearLayout2, layoutParams4);
        TextView textView = new TextView(this.sf);
        textView.setId(520093730);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        textView.setTextColor(Color.parseColor("#FF3E3E3E"));
        textView.setTextSize(16.0f);
        textView.setLayoutParams(layoutParams5);
        linearLayout2.addView(textView);
        com.bytedance.sdk.openadsdk.core.widget.dax daxVar = new com.bytedance.sdk.openadsdk.core.widget.dax(this.sf);
        daxVar.setId(520093735);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams6.topMargin = rj.sf(this.sf, 4.0f);
        linearLayout2.addView(daxVar, layoutParams6);
        TextView textView2 = new TextView(this.sf);
        textView2.setId(520093703);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(rj.sf(this.sf, 76.0f), rj.sf(this.sf, 36.0f));
        textView2.setBackground(vh.pcc(this.sf, 18));
        textView2.setEllipsize(TextUtils.TruncateAt.END);
        textView2.setMaxLines(1);
        textView2.setGravity(17);
        textView2.setText(tz.pcc(this.sf, "tt_video_download_apk"));
        textView2.setTextColor(-1);
        textView2.setTextSize(14.0f);
        textView2.setLayoutParams(layoutParams7);
        linearLayout.addView(textView2);
        FrameLayout frameLayout = new FrameLayout(this.sf);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams8.addRule(2, linearLayout.getId());
        layoutParams8.bottomMargin = sf2;
        frameLayout.setLayoutParams(layoutParams8);
        relativeLayout.addView(frameLayout);
        tmg tmgVar = new tmg(this.sf);
        tmgVar.setId(520093736);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams9.gravity = 17;
        tmgVar.setLayoutParams(layoutParams9);
        frameLayout.addView(tmgVar);
        View createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.sf, this.gm);
        createPAGLogoViewByMaterial.setId(520093739);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(10);
        layoutParams10.addRule(9);
        layoutParams10.setMargins(sf, sf, 0, 0);
        createPAGLogoViewByMaterial.setLayoutParams(layoutParams10);
        relativeLayout.addView(createPAGLogoViewByMaterial);
        return new pcc(nacVar, createPAGLogoViewByMaterial, textView2, textView, tmgVar, daxVar, frameLayout);
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.jr = pAGBannerAdWrapperListener;
    }

    private View.OnClickListener ork() {
        return new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.sf.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (!com.bytedance.sdk.openadsdk.utils.sf.wh() || !com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                    TTWebsiteActivity.pcc(sf.this.sf, sf.this.gm, sf.this.wh);
                } else {
                    IABLandingPageActivity.pcc(sf.this.sf, sf.this.gm, sf.this.wh);
                }
            }
        };
    }

    private static class pcc {
        ImageView gm;
        private tmg kj;
        com.bytedance.sdk.openadsdk.core.widget.dax oo;
        public hc pcc;
        TextView qf;
        public TextView sf;
        FrameLayout vj;
        View wh;

        pcc(ImageView imageView, TextView textView, com.bytedance.sdk.openadsdk.core.widget.dax daxVar, View view, TextView textView2) {
            this.gm = imageView;
            this.sf = textView;
            this.oo = daxVar;
            this.wh = view;
            this.qf = textView2;
        }

        public pcc(ImageView imageView, View view, TextView textView, TextView textView2, hc hcVar, com.bytedance.sdk.openadsdk.core.widget.dax daxVar, FrameLayout frameLayout) {
            this.gm = imageView;
            this.wh = view;
            this.qf = textView;
            this.sf = textView2;
            this.pcc = hcVar;
            this.oo = daxVar;
            this.vj = frameLayout;
        }

        public pcc(ImageView imageView, View view, TextView textView, TextView textView2, tmg tmgVar, com.bytedance.sdk.openadsdk.core.widget.dax daxVar, FrameLayout frameLayout) {
            this.gm = imageView;
            this.wh = view;
            this.qf = textView;
            this.sf = textView2;
            this.kj = tmgVar;
            this.oo = daxVar;
            this.vj = frameLayout;
        }

        public pcc(View view, hc hcVar) {
            this.wh = view;
            this.pcc = hcVar;
        }
    }
}
