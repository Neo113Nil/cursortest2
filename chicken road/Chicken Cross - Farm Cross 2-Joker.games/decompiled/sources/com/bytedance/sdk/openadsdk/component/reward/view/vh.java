package com.bytedance.sdk.openadsdk.component.reward.view;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.compose.material.MenuKt;
import com.bytedance.sdk.component.adexpress.sf.gbb;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.reward.pcc.dax;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.jr;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class vh {
    public lo dax;
    private int fum;
    protected final com.bytedance.sdk.openadsdk.component.reward.pcc.sf gm;
    private final boolean gpj;
    dax hc;
    View kj;
    private final String lo;
    com.bytedance.sdk.openadsdk.core.wh.wh nac;
    private oo of;
    final of oo;
    PAGLogoView ork;
    FrameLayout qf;
    final Activity sf;
    RelativeLayout tmg;
    private boolean tz;
    ImageView vh;
    ImageView vj;
    View vy;
    ImageView wh;
    private com.bytedance.sdk.openadsdk.core.widget.vh yt;
    int pcc = 3;
    protected int gbb = 0;
    protected final AtomicBoolean jr = new AtomicBoolean(false);
    Runnable lu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vh.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                if ((vh.this.oo == null || !vh.this.oo.nmd()) && vh.this.vj != null) {
                    int[] iArr = new int[2];
                    vh.this.vj.getLocationOnScreen(iArr);
                    vh.this.gm.zti.pcc(iArr[0]);
                }
            } catch (Exception unused) {
            }
        }
    };

    protected boolean pcc() {
        return true;
    }

    public vh(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.gm = sfVar;
        this.sf = sfVar.rnn;
        this.oo = sfVar.sf;
        this.lo = sfVar.vj;
        this.gpj = sfVar.oo;
    }

    public void sf() {
        if (this.tz) {
            return;
        }
        this.tz = true;
        this.fum = this.gm.zsj;
        if (pcc() && !this.gm.vr) {
            dax daxVar = new dax(this.gm);
            this.hc = daxVar;
            daxVar.pcc();
        }
        gpj();
        lo loVar = new lo(this.sf, this.oo, this.lo, this.qf, this.gm.tsx, this.gm.nn);
        this.dax = loVar;
        loVar.pcc();
    }

    private void gpj() {
        RelativeLayout relativeLayout;
        oo ooVar = (oo) this.gm.nn.findViewById(nac.gbb);
        this.of = ooVar;
        ooVar.pcc(this.gm);
        com.bytedance.sdk.openadsdk.core.widget.vh vhVar = (com.bytedance.sdk.openadsdk.core.widget.vh) this.gm.nn.findViewById(nac.uae);
        this.yt = vhVar;
        if (vhVar != null) {
            vhVar.pcc(this.gm.sf, this.gm.vj, null);
        }
        this.ork = (PAGLogoView) this.gm.nn.findViewById(520093757);
        this.vh = (ImageView) this.gm.nn.findViewById(nac.jum);
        this.vj = (ImageView) this.gm.nn.findViewById(520093708);
        this.wh = (ImageView) this.gm.nn.findViewById(nac.st);
        this.qf = (FrameLayout) this.gm.nn.findViewById(nac.hc);
        this.kj = this.gm.nn.findViewById(nac.lu);
        this.vy = this.gm.nn.findViewById(nac.gga);
        this.tmg = (RelativeLayout) this.gm.nn.findViewById(nac.jk);
        dax daxVar = this.hc;
        if (daxVar == null || daxVar.wh() == null || (relativeLayout = this.tmg) == null) {
            return;
        }
        relativeLayout.addView(this.hc.wh(), new LinearLayout.LayoutParams(-1, -1));
        this.hc.gm();
    }

    public void gm() {
        this.qf.removeAllViews();
    }

    public void pcc(boolean z) {
        int i = 8;
        rj.pcc((View) this.ork, atb.gm(this.oo) ? 8 : 0);
        ImageView imageView = this.vh;
        if (this.oo.on() && this.oo.of()) {
            i = 0;
        }
        rj.pcc((View) imageView, i);
        sf(z);
        if (this.gpj) {
            vj();
        }
    }

    public void pcc(int i) {
        if (this.nac == null) {
            this.nac = new com.bytedance.sdk.openadsdk.core.wh.wh(this.gm.rnn);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(MenuKt.InTransitionDuration, MenuKt.InTransitionDuration);
            layoutParams.gravity = 17;
            this.nac.setLayoutParams(layoutParams);
            this.nac.setIndeterminateDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(this.gm.rnn, "tt_video_loading_progress_bar"));
            this.gm.mu.wh().addView(this.nac);
        }
        this.nac.setVisibility(i);
    }

    public void pcc(int i, int i2) {
        FrameLayout frameLayout;
        if (this.oo.pv() == 1 && (frameLayout = this.qf) != null && (frameLayout.getLayoutParams() instanceof RelativeLayout.LayoutParams)) {
            int gm = rj.gm((Context) this.sf);
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.qf.getLayoutParams();
            layoutParams.width = gm;
            int i3 = (gm * 9) / 16;
            layoutParams.height = i3;
            this.qf.setLayoutParams(layoutParams);
            this.gbb = (rj.vj(this.sf) - i3) / 2;
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.gm.gm gmVar, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        View view;
        View view2;
        of ofVar;
        if (this.qf != null && (ofVar = this.oo) != null && ofVar.jq() != null) {
            if (this.oo.jq().wh && !lo.sf(this.oo)) {
                pcc((View.OnClickListener) gmVar);
                pcc(gmVar);
            } else {
                pcc(onClickListener);
            }
        }
        of ofVar2 = this.oo;
        if (ofVar2 != null && ofVar2.pv() == 1) {
            if (this.oo.jq() != null && (view2 = this.kj) != null) {
                rj.pcc(view2, 0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.kj.getLayoutParams();
                layoutParams.height = this.gbb;
                this.kj.setLayoutParams(layoutParams);
                if (this.oo.jq().sf) {
                    this.kj.setOnClickListener(gmVar);
                    this.kj.setOnTouchListener(onTouchListener);
                } else {
                    this.kj.setOnClickListener(onClickListener);
                }
            }
            if (this.oo.jq() != null && (view = this.vy) != null) {
                rj.pcc(view, 0);
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.vy.getLayoutParams();
                layoutParams2.height = this.gbb;
                this.vy.setLayoutParams(layoutParams2);
                if (this.oo.jq().oo) {
                    this.vy.setOnClickListener(gmVar);
                    this.vy.setOnTouchListener(onTouchListener);
                } else {
                    this.vy.setOnClickListener(onClickListener);
                }
            }
        }
        PAGLogoView pAGLogoView = this.ork;
        if (pAGLogoView != null) {
            pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vh.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view3) {
                    try {
                        if (!com.bytedance.sdk.openadsdk.utils.sf.wh() || !lu.oo().atb()) {
                            TTWebsiteActivity.pcc(vh.this.sf, vh.this.oo, vh.this.lo);
                        } else {
                            IABLandingPageActivity.pcc(vh.this.sf, vh.this.oo, vh.this.lo);
                        }
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.lo.gm("TTAD.RFullVideoLayout", th.getMessage());
                    }
                }
            });
        }
        ImageView imageView = this.vh;
        if (imageView != null) {
            imageView.setClickable(true);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc((int) rj.pcc(lu.pcc(), 14.0f, true), this.vh, this.gm.sf);
        }
    }

    public void oo() {
        if (this.gm.sf.aj() && atb.gm(this.gm.sf)) {
            return;
        }
        rj.pcc((View) this.qf, 8);
        rj.pcc((View) this.yt, 8);
        rj.pcc(this.kj, 8);
        rj.pcc(this.vy, 8);
        sf(8);
        rj.pcc((View) this.vj, 8);
        rj.pcc((View) this.wh, 8);
        rj.pcc((View) this.ork, 8);
        rj.pcc((View) this.tmg, 8);
        rj.pcc((View) this.vh, 8);
    }

    void vj() {
        int fvk = this.oo.fvk();
        this.pcc = fvk;
        if (fvk == -200) {
            this.pcc = lu.oo().dax(String.valueOf(this.oo.kot()));
        }
        if (this.pcc != -1 || pcc() || (this.gm.ew instanceof com.bytedance.sdk.openadsdk.component.reward.sf.oo) || (this.gm.ew instanceof com.bytedance.sdk.openadsdk.component.reward.sf.gm)) {
            return;
        }
        sf(0);
    }

    void sf(boolean z) {
        int pcc;
        int pcc2;
        if (this.fum != 1 && z) {
            ImageView imageView = this.vj;
            ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
            ImageView imageView2 = this.wh;
            ViewGroup.LayoutParams layoutParams2 = imageView2 != null ? imageView2.getLayoutParams() : null;
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (pcc2 = pcc("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                if (pcc2 > marginLayoutParams.rightMargin) {
                    marginLayoutParams.rightMargin = pcc2;
                }
            }
            if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (pcc = pcc("navigation_bar_height")) > 0) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                if (pcc > marginLayoutParams2.rightMargin) {
                    marginLayoutParams2.rightMargin = pcc;
                }
            }
        }
        if ((this.gm.ew instanceof com.bytedance.sdk.openadsdk.component.reward.sf.oo) || (this.gm.ew instanceof com.bytedance.sdk.openadsdk.component.reward.sf.gm)) {
            return;
        }
        sf(0);
    }

    private int pcc(String str) {
        Resources resources = this.sf.getResources();
        if (resources != null) {
            return resources.getDimensionPixelSize(resources.getIdentifier(str, "dimen", "android"));
        }
        return 0;
    }

    public void sf(int i) {
        of ofVar = this.oo;
        if (ofVar != null && ofVar.on() && jr.pcc(this.oo)) {
            rj.pcc((View) this.of, 8);
        } else {
            rj.pcc((View) this.of, i);
        }
    }

    public void gm(int i) {
        of ofVar = this.oo;
        if (ofVar != null && ofVar.aj() && atb.gm(this.oo)) {
            rj.pcc((View) this.yt, i);
        }
    }

    public FrameLayout wh() {
        return this.qf;
    }

    public void oo(int i) {
        rj.pcc((View) this.ork, i);
    }

    public void qf() {
        if (this.vh.getVisibility() == 0) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.vh.getLayoutParams();
            marginLayoutParams.setMargins(0, 0, 11, 16);
            marginLayoutParams.setMarginStart(0);
            marginLayoutParams.setMarginEnd(11);
            this.vh.setLayoutParams(marginLayoutParams);
        }
    }

    public void vj(int i) {
        int i2 = this.pcc;
        if (i2 == -1 || i != i2 || this.jr.get()) {
            return;
        }
        sf(0);
        this.jr.set(true);
        kj();
    }

    protected void kj() {
        oo ooVar = this.of;
        if (ooVar == null) {
            return;
        }
        ooVar.pcc();
    }

    public void wh(int i) {
        rj.pcc((View) this.vj, i);
    }

    public boolean vy() {
        ImageView imageView = this.vj;
        return imageView != null && imageView.getVisibility() == 0;
    }

    public void pcc(View.OnClickListener onClickListener) {
        rj.pcc(this.qf, onClickListener, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    private void pcc(com.bytedance.sdk.openadsdk.core.gm.gm gmVar) {
        rj.pcc((View) this.qf, (View.OnTouchListener) gmVar, "TTBaseVideoActivity#mVideoNativeFrame");
    }

    public View ork() {
        return this.vj;
    }

    public View vh() {
        return this.wh;
    }

    public View tmg() {
        return this.of;
    }

    public void pcc(float f) {
        rj.pcc(this.vj, f);
    }

    public void pcc(Animation animation) {
        RelativeLayout relativeLayout = this.tmg;
        if (relativeLayout != null) {
            relativeLayout.startAnimation(animation);
        }
    }

    public void hc() {
        try {
            dax daxVar = this.hc;
            if (daxVar != null) {
                daxVar.oo();
            }
            RelativeLayout relativeLayout = this.tmg;
            if (relativeLayout != null) {
                relativeLayout.removeAllViews();
            }
        } catch (Throwable unused) {
            RelativeLayout relativeLayout2 = this.tmg;
            if (relativeLayout2 != null) {
                relativeLayout2.setAlpha(0.0f);
            }
        }
    }

    public void gbb() {
        try {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.gm.rnn, tz.vy(this.gm.rnn, "tt_fade_out"));
            if (loadAnimation != null) {
                loadAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.vh.3
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        vh.this.gm.mu.hc();
                    }
                });
                this.gm.mu.pcc(loadAnimation);
            } else {
                this.gm.mu.hc();
            }
        } catch (Throwable unused) {
            this.gm.mu.hc();
        }
    }

    public void jr() {
        lo loVar = this.dax;
        if (loVar != null) {
            loVar.wh();
        }
        ImageView imageView = this.vj;
        if (imageView != null) {
            imageView.removeCallbacks(this.lu);
        }
    }

    public void dax() {
        lo loVar = this.dax;
        if (loVar != null) {
            loVar.qf();
        }
    }

    public void nac() {
        lo loVar = this.dax;
        if (loVar != null) {
            loVar.kj();
        }
    }

    public void pcc(int i, gbb gbbVar) {
        lo loVar = this.dax;
        if (loVar != null) {
            loVar.pcc(i, gbbVar);
        }
    }

    public void lu() {
        com.bytedance.sdk.openadsdk.core.gm.vj vj = this.gm.jsj.vj();
        View view = this.of;
        if (view == null) {
            view = this.gm.nn;
        }
        vj.onClick(view);
    }
}
