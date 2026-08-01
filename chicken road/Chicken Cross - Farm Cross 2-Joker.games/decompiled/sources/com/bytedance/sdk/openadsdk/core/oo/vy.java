package com.bytedance.sdk.openadsdk.core.oo;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTDelegateActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.fum;
import com.bytedance.sdk.openadsdk.core.ork.gpj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public class vy extends com.bytedance.sdk.openadsdk.core.ork.pcc implements gm.InterfaceC0093gm, gm.oo {
    private long dax;
    private com.bytedance.sdk.openadsdk.core.jr.sf.wh gbb;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm hc;
    private String jr;
    private PAGBannerAdWrapperListener nac;
    public boolean pcc;
    private fum tmg;

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.InterfaceC0093gm
    public void g_() {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.InterfaceC0093gm
    public void h_() {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.InterfaceC0093gm
    public void i_() {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.InterfaceC0093gm
    public void j_() {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.oo
    public void pcc(int i, int i2) {
    }

    public vy(Context context) {
        super(context);
        this.pcc = true;
        this.sf = context;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    protected void pcc(View view, int i, dax daxVar) {
        fum fumVar = this.tmg;
        if (fumVar != null) {
            fumVar.pcc(view, i, daxVar);
            com.bytedance.sdk.openadsdk.core.jr.sf.wh whVar = this.gbb;
            if (whVar == null || !(whVar.getNativeVideoController() instanceof com.bytedance.sdk.openadsdk.core.jr.sf.gm)) {
                return;
            }
            this.gbb.getNativeVideoController().nn();
        }
    }

    public void setClosedListenerKey(String str) {
        this.jr = str;
    }

    public void pcc(of ofVar, fum fumVar, com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar) {
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.gm = ofVar;
        this.tmg = fumVar;
        this.hc = gmVar;
        this.wh = "banner_ad";
        this.tmg.addView(this, new ViewGroup.LayoutParams(-2, -2));
        vj();
    }

    private void vj() {
        gpj pcc2 = sf.pcc(this.tmg.getExpectExpressWidth(), this.tmg.getExpectExpressHeight());
        if (this.tmg.getExpectExpressWidth() > 0 && this.tmg.getExpectExpressHeight() > 0) {
            this.qf = rj.sf(this.sf, this.tmg.getExpectExpressWidth());
            this.kj = rj.sf(this.sf, this.tmg.getExpectExpressHeight());
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
        pcc(pcc2);
    }

    private void pcc(gpj gpjVar) {
        if (this.gm != null) {
            int ct = this.gm.ct();
            pcc sf = sf(gpjVar);
            if (sf == null || sf.pcc == null) {
                return;
            }
            addView(sf.pcc);
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar = sf.gm;
            PAGLogoView pAGLogoView = sf.oo;
            com.bytedance.sdk.openadsdk.core.wh.oo ooVar2 = sf.vj;
            if (ooVar2 != null && this.gm.of()) {
                rj.pcc((View) ooVar2, 0);
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(lu.pcc(), 11.0f, true), ooVar2, this.gm);
            }
            com.bytedance.sdk.openadsdk.core.jr.sf.wh videoView = getVideoView();
            if (videoView instanceof com.bytedance.sdk.openadsdk.core.jr.sf.wh) {
                this.gbb = videoView;
                videoView.setVideoAdLoadListener(this);
                this.gbb.setVideoAdInteractionListener(this);
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Pair(ooVar, FriendlyObstructionPurpose.CLOSE_AD));
                arrayList.add(new Pair(pAGLogoView, FriendlyObstructionPurpose.OTHER));
                arrayList.add(new Pair(ooVar2, FriendlyObstructionPurpose.OTHER));
                this.gbb.pcc(arrayList);
                this.gbb.setAdCreativeClickListener(new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.core.oo.vy.1
                    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.pcc
                    public void pcc(View view, int i) {
                        if (vy.this.nac != null) {
                            vy.this.nac.onAdClicked();
                        }
                    }
                });
            }
            if (pAGLogoView != null) {
                pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.vy.2
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (!com.bytedance.sdk.openadsdk.utils.sf.wh() || !lu.oo().atb()) {
                            TTWebsiteActivity.pcc(vy.this.sf, vy.this.gm, vy.this.wh);
                        } else {
                            IABLandingPageActivity.pcc(vy.this.sf, vy.this.gm, vy.this.wh);
                        }
                    }
                });
            }
            if (ooVar != null) {
                ooVar.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.oo.vy.3
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        vy.this.pcc();
                    }
                });
            }
            tmg tmgVar = sf.sf;
            if (this.gm != null && this.gm.ibs() != null && tmgVar != null) {
                int ork = this.gm.ibs().ork();
                float vh = this.gm.ibs().vh();
                if (ork > 0 && vh > 0.0f) {
                    tmgVar.setRatio(ork / vh);
                } else if (ct == 15) {
                    tmgVar.setRatio(0.5625f);
                } else if (ct == 5) {
                    tmgVar.setRatio(1.7777778f);
                } else {
                    tmgVar.setRatio(1.0f);
                }
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            if (videoView != null && tmgVar != null) {
                tmgVar.addView(videoView, layoutParams);
                videoView.setTag(520093762, Boolean.TRUE);
            }
            pcc((View) videoView, true);
            pcc((View) this, true);
            pcc(tmgVar);
        }
    }

    private pcc sf(gpj gpjVar) {
        pcc pccVar = new pcc();
        pccVar.pcc = new FrameLayout(this.sf);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -2);
        layoutParams.width = -1;
        layoutParams.height = -1;
        pccVar.pcc.setLayoutParams(layoutParams);
        pccVar.sf = new tmg(this.sf);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        pccVar.sf.setLayoutParams(layoutParams2);
        pccVar.pcc.addView(pccVar.sf);
        int sf = rj.sf(this.sf, 5.0f);
        if (gpjVar != null && gpjVar.pcc == 1) {
            pccVar.gm = com.bytedance.sdk.openadsdk.core.widget.wh.pcc(getContext());
        } else {
            pccVar.gm = com.bytedance.sdk.openadsdk.core.widget.wh.sf(getContext());
        }
        pccVar.gm.setId(520093697);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = GravityCompat.END;
        layoutParams3.setMargins(sf, sf, sf, sf);
        pccVar.gm.setLayoutParams(layoutParams3);
        pccVar.pcc.addView(pccVar.gm);
        pccVar.oo = PAGLogoView.createPAGLogoViewByMaterial(this.sf, this.gm);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 8388691;
        layoutParams4.setMargins(sf, sf, sf, sf);
        pccVar.oo.setLayoutParams(layoutParams4);
        pccVar.pcc.addView(pccVar.oo);
        pccVar.vj = new com.bytedance.sdk.openadsdk.core.wh.oo(this.sf);
        int sf2 = rj.sf(this.sf, 11.0f);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(sf2, sf2);
        layoutParams5.gravity = 8388693;
        layoutParams5.rightMargin = sf;
        layoutParams5.bottomMargin = sf;
        pccVar.vj.setVisibility(8);
        pccVar.vj.setScaleType(ImageView.ScaleType.FIT_CENTER);
        pccVar.vj.setLayoutParams(layoutParams5);
        pccVar.pcc.addView(pccVar.vj);
        return pccVar;
    }

    @Override // com.bytedance.sdk.openadsdk.core.ork.pcc
    public void pcc() {
        if (this.vj != null) {
            this.vj.show();
        } else if (this.oo != null) {
            this.oo.pcc();
        } else {
            TTDelegateActivity.pcc(this.gm, this.jr);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm.InterfaceC0093gm
    public void pcc(long j, long j2) {
        this.dax = j;
    }

    public long getVideoProgress() {
        return this.dax;
    }

    public void setAdInteractionListener(PAGBannerAdWrapperListener pAGBannerAdWrapperListener) {
        this.nac = pAGBannerAdWrapperListener;
    }

    private static class pcc {
        public com.bytedance.sdk.openadsdk.core.wh.oo gm;
        public PAGLogoView oo;
        public FrameLayout pcc;
        public tmg sf;
        public com.bytedance.sdk.openadsdk.core.wh.oo vj;

        private pcc() {
        }
    }
}
