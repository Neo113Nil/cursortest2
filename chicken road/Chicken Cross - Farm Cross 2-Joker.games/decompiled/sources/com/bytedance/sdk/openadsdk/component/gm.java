package com.bytedance.sdk.openadsdk.component;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTAppOpenAdTransActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.component.vy.vj;
import com.bytedance.sdk.openadsdk.component.wh;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.wh.kj;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.dax;
import com.bytedance.sdk.openadsdk.core.widget.nac;
import com.bytedance.sdk.openadsdk.utils.lu;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.io.File;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class gm {
    private kj dax;
    private float fum;
    private ImageView gbb;
    protected final boolean gm;
    private kj gpj;
    private RelativeLayout hc;
    private PAGLogoView jr;
    private com.bytedance.sdk.openadsdk.core.wh.oo jsj;
    protected FrameLayout kj;
    private kj lo;
    private nac lu;
    private View mk;
    private ImageView nac;
    private final com.bytedance.sdk.openadsdk.component.vy.kj of = new com.bytedance.sdk.openadsdk.component.vy.kj();
    protected final FrameLayout oo;
    protected com.bytedance.sdk.openadsdk.core.wh.oo ork;
    protected final Activity pcc;
    protected int qf;
    private kj qy;
    protected final of sf;
    protected final com.bytedance.sdk.openadsdk.component.kj.pcc tmg;
    private dax tsz;
    private float tz;
    protected kj vh;
    protected final com.bytedance.sdk.openadsdk.component.pcc vj;
    protected View vy;
    protected final int wh;
    private com.bytedance.sdk.openadsdk.component.kj.gm yt;

    public int oo() {
        return -1;
    }

    public JSONObject pcc(JSONObject jSONObject) {
        return null;
    }

    public void vj() {
    }

    public gm(Activity activity, of ofVar, FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.pcc pccVar, int i, boolean z, com.bytedance.sdk.openadsdk.component.kj.pcc pccVar2) {
        this.pcc = activity;
        this.sf = ofVar;
        this.oo = frameLayout;
        this.qf = i;
        this.gm = z;
        this.vj = pccVar;
        this.wh = ofVar.kot();
        this.tmg = pccVar2;
    }

    public void pcc(ViewGroup viewGroup) {
        com.bytedance.sdk.openadsdk.component.vy.gm ooVar = new com.bytedance.sdk.openadsdk.component.vy.oo(this.pcc, this.sf);
        int hoh = this.sf.hoh();
        if (hoh == 5) {
            ooVar = new com.bytedance.sdk.openadsdk.component.vy.wh(this.pcc, this.sf);
        } else if (hoh == 4) {
            ooVar = new com.bytedance.sdk.openadsdk.component.vy.vj(this.pcc, this.sf);
        }
        this.hc = ooVar;
        viewGroup.addView(ooVar);
        this.nac = ooVar.getBackImage();
        this.kj = ooVar.getVideoContainer();
        this.gbb = ooVar.getImageView();
        this.dax = ooVar.getClickButton();
        this.jr = ooVar.getAdLogo();
        this.qy = ooVar.getAdTitleTextView();
        this.jsj = ooVar.getAdIconView();
        this.tsz = ooVar.getScoreBar();
        this.mk = ooVar.getOverlayLayout();
        if (this.sf.ye()) {
            this.lu = ooVar.getIconOnlyView();
            this.gpj = ooVar.getTitle();
            this.lo = ooVar.getContent();
        }
        if (ooVar.getDspAdChoice() != null) {
            ooVar.getDspAdChoice().pcc(14, this.sf);
        }
        if (!this.sf.uxz()) {
            this.of.pcc(ooVar, this.sf, this.tz, this.fum, this.gm);
        }
        this.vy = ooVar.getTopDisLike();
        this.ork = ooVar.getTopSkip();
        this.vh = ooVar.getTopCountDown();
        if (ooVar instanceof com.bytedance.sdk.openadsdk.component.vy.vj) {
            ((com.bytedance.sdk.openadsdk.component.vy.vj) ooVar).setRenderListener(new vj.pcc() { // from class: com.bytedance.sdk.openadsdk.component.gm.1
                @Override // com.bytedance.sdk.openadsdk.component.vy.vj.pcc
                public void pcc(View view, int i) {
                    gm.this.vj.vj();
                }
            });
        }
    }

    public void pcc() {
        this.jr.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.gm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (com.bytedance.sdk.openadsdk.utils.sf.wh() && lu.oo().atb()) {
                        IABLandingPageActivity.pcc(gm.this.pcc, gm.this.sf, "open_ad");
                    } else {
                        TTWebsiteActivity.pcc(gm.this.pcc, gm.this.sf, "open_ad");
                    }
                } catch (Throwable th) {
                    lo.gm("AppOpenAdNativeManager", th.getMessage());
                }
            }
        });
        wh();
        if (this.sf.uxz()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.pcc.pcc pcc2 = com.bytedance.sdk.openadsdk.component.pcc.sf.pcc(this.sf, this.pcc, this.tmg);
        pcc2.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.gm.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                gm.this.vj.vj();
            }
        });
        pcc2.pcc(this.yt);
        if (this.sf.ptr() == 1) {
            this.hc.setOnClickListener(pcc2);
            this.hc.setOnTouchListener(pcc2);
        }
        this.dax.setOnClickListener(pcc2);
        this.dax.setOnTouchListener(pcc2);
    }

    protected void wh() {
        View view = this.vy;
        if (view == null || this.ork == null) {
            return;
        }
        view.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.gm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (gm.this.vj != null) {
                    gm.this.vj.sf(view2);
                }
            }
        });
        this.ork.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.gm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (gm.this.vj != null) {
                    gm.this.vj.pcc(view2);
                }
            }
        });
    }

    public void sf() {
        Window window;
        if (!this.sf.uxz()) {
            kj();
        } else {
            this.vj.gm();
        }
        Activity activity = this.pcc;
        if (!(activity instanceof TTAppOpenAdTransActivity) || (window = activity.getWindow()) == null) {
            return;
        }
        window.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#1E1E1E")));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void kj() {
        boolean z;
        dax daxVar;
        View view;
        this.of.pcc();
        this.dax.setText(this.sf.bgf());
        if (this.sf.ye()) {
            vy();
            return;
        }
        if (this.gm) {
            sf(0);
            pcc(8);
            if (pcc(this.kj)) {
                this.vj.gm();
            } else {
                this.vj.oo();
            }
            wh.pcc(this.sf, new pcc(this.pcc, this), 25);
        } else {
            sf(8);
            pcc(0);
            ork();
            this.vj.gm();
        }
        boolean z2 = true;
        if (this.qy != null) {
            if (!TextUtils.isEmpty(this.sf.ofe())) {
                this.qy.setText(this.sf.ofe());
            } else if (this.sf.xfm() != null) {
                this.qy.setText(this.sf.xfm().sf());
            }
            z = true;
            if (this.jsj != null) {
                com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.sf.zk(), this.jsj, this.sf);
            }
            daxVar = this.tsz;
            if (daxVar != null) {
                rj.pcc((TextView) null, daxVar, this.sf);
                if (this.sf.xfm() == null || this.sf.xfm().oo() < 0.0d) {
                    this.tsz.setVisibility(8);
                }
                view = this.mk;
                if (view != null) {
                    view.setVisibility(z2 ? 0 : 8);
                    return;
                }
                return;
            }
            z2 = z;
            view = this.mk;
            if (view != null) {
            }
        }
        z = false;
        if (this.jsj != null) {
        }
        daxVar = this.tsz;
        if (daxVar != null) {
        }
        z2 = z;
        view = this.mk;
        if (view != null) {
        }
    }

    protected boolean pcc(FrameLayout frameLayout) {
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar = new com.bytedance.sdk.openadsdk.component.kj.gm(this.pcc);
        this.yt = gmVar;
        return gmVar.pcc(frameLayout, this.vj, this.sf);
    }

    private void sf(int i) {
        rj.pcc((View) this.kj, i);
    }

    private void vy() {
        if (this.gpj != null) {
            if (this.sf.xfm() != null && !TextUtils.isEmpty(this.sf.xfm().sf())) {
                this.gpj.setText(this.sf.xfm().sf());
            } else if (!TextUtils.isEmpty(this.sf.ofe())) {
                this.gpj.setText(this.sf.ofe());
            } else {
                this.gpj.setVisibility(8);
            }
        }
        if (this.lo != null) {
            if (!TextUtils.isEmpty(this.sf.gmh())) {
                this.lo.setText(this.sf.gmh());
            } else {
                this.lo.setVisibility(8);
            }
        }
        if (this.lu != null && this.sf.zk() != null && !TextUtils.isEmpty(this.sf.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.sf.zk().pcc(), this.sf.zk().sf(), this.sf.zk().gm(), this.lu, this.sf);
        }
        this.vj.gm();
    }

    private void ork() {
        com.bytedance.sdk.openadsdk.core.model.lu luVar = this.sf.by().get(0);
        String pcc2 = TextUtils.isEmpty(luVar.qf()) ? com.bytedance.sdk.component.utils.vj.pcc(luVar.pcc()) : luVar.qf();
        if (TextUtils.isEmpty(pcc2) || pcc2.contains("../") || pcc2.contains("/") || pcc2.contains("..")) {
            return;
        }
        File sf2 = com.bytedance.sdk.openadsdk.component.qf.pcc.sf(pcc2);
        com.bytedance.sdk.openadsdk.utils.lu.pcc(new com.bytedance.sdk.openadsdk.lo.pcc(luVar.pcc(), luVar.qf()), luVar.sf(), luVar.gm(), new sf(this), sf2 != null ? sf2.getParent() : null, 25);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(Object obj) {
        try {
            if (obj instanceof Bitmap) {
                this.nac.setImageDrawable(new BitmapDrawable(lu.pcc().getResources(), (Bitmap) obj));
            }
        } catch (Throwable unused) {
            lo.gm("AppOpenAdNativeManager", "open_ad", "bindBackGroundImage error");
        }
    }

    void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
        if (this.gbb == null) {
            return;
        }
        if (sfVar.sf() != null) {
            this.gbb.setImageBitmap(sfVar.sf());
            return;
        }
        Drawable oo = sfVar.oo();
        if (oo != null) {
            this.gbb.setScaleType(ImageView.ScaleType.FIT_CENTER);
            if (Build.VERSION.SDK_INT >= 28 && (oo instanceof AnimatedImageDrawable)) {
                ((AnimatedImageDrawable) oo).start();
            }
            this.gbb.setImageDrawable(oo);
            return;
        }
        if (this.sf.by() == null || this.sf.by().get(0) == null) {
            return;
        }
        Drawable pcc2 = com.bytedance.sdk.openadsdk.utils.lu.pcc(sfVar.gm(), this.sf.by().get(0).sf());
        this.gbb.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.gbb.setImageDrawable(pcc2);
    }

    void pcc(int i) {
        rj.pcc((View) this.gbb, i);
    }

    public static class pcc implements wh.gm {
        WeakReference<Activity> pcc;
        private final WeakReference<gm> sf;

        pcc(Activity activity, gm gmVar) {
            this.pcc = new WeakReference<>(activity);
            this.sf = new WeakReference<>(gmVar);
        }

        @Override // com.bytedance.sdk.openadsdk.component.wh.gm
        public void pcc(Object obj) {
            gm gmVar;
            if (this.pcc.get() == null || this.pcc.get().isFinishing() || (gmVar = this.sf.get()) == null) {
                return;
            }
            gmVar.pcc(obj);
        }
    }

    public void pcc(float f, float f2) {
        this.tz = f;
        this.fum = f2;
    }

    public void pcc(int i, boolean z) {
        kj kjVar;
        if (this.ork == null || (kjVar = this.vh) == null) {
            return;
        }
        if (z) {
            if (kjVar.getVisibility() != 8) {
                this.vh.setVisibility(8);
            }
            if (this.ork.getVisibility() != 0) {
                this.ork.setVisibility(0);
                return;
            }
            return;
        }
        this.vh.setText(i + CmcdData.Factory.STREAMING_FORMAT_SS);
        if (this.vh.getVisibility() != 0) {
            this.vh.setVisibility(0);
        }
    }

    public com.bytedance.sdk.openadsdk.component.kj.gm qf() {
        return this.yt;
    }

    public void gm() {
        com.bytedance.sdk.openadsdk.component.kj.gm gmVar = this.yt;
        if (gmVar != null) {
            gmVar.tmg();
        }
    }

    public static class sf implements lu.pcc {
        private final WeakReference<gm> pcc;

        @Override // com.bytedance.sdk.openadsdk.utils.lu.pcc
        public void pcc() {
        }

        public sf(gm gmVar) {
            this.pcc = new WeakReference<>(gmVar);
        }

        @Override // com.bytedance.sdk.openadsdk.utils.lu.pcc
        public void pcc(com.bytedance.sdk.openadsdk.lo.pcc.sf sfVar) {
            gm gmVar;
            if (!sfVar.vj() || (gmVar = this.pcc.get()) == null) {
                return;
            }
            gmVar.pcc(sfVar);
            if (sfVar.sf() != null) {
                gmVar.pcc(sfVar.pcc());
            }
        }
    }
}
