package com.bytedance.sdk.openadsdk.core.jr.sf;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.settings.vh;
import com.bytedance.sdk.openadsdk.core.widget.gpj;
import com.bytedance.sdk.openadsdk.core.widget.lo;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public class vj implements com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf<of>, com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc, tsz.pcc, pcc.InterfaceC0150pcc, gpj.pcc, lo.sf {
    com.bytedance.sdk.openadsdk.core.gm.pcc atb;
    int dax;
    int fum;
    int gbb;
    ViewGroup gm;
    boolean gpj;
    TextView hc;
    int jr;
    boolean jsj;
    ImageView kj;
    int lo;
    boolean lq;
    boolean lu;
    com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm mk;
    private final String mu;
    int nac;
    Context of;
    com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf oo;
    View ork;
    protected final int pcc;
    private long pq;
    View qf;
    pcc qy;
    protected final int sf;
    View tmg;
    com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm tsz;
    of tz;
    ImageView vh;
    ImageView vj;
    View vy;
    View wh;
    com.bytedance.sdk.openadsdk.core.gm.pcc ye;
    lo yt;
    private wh.pcc zti;

    public void gm(boolean z) {
    }

    public boolean ork() {
        return false;
    }

    public void pcc(int i) {
    }

    public void pcc(long j) {
    }

    public void pcc(long j, long j2) {
    }

    public void pcc(Message message) {
    }

    public void pcc(View view, boolean z) {
    }

    public void pcc(ViewGroup viewGroup) {
    }

    public void pcc(String str) {
    }

    public void sf(ViewGroup viewGroup) {
    }

    public void sf(boolean z) {
    }

    public boolean sf(int i) {
        return false;
    }

    public void vj() {
    }

    public void wh() {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf
    public /* bridge */ /* synthetic */ void pcc(of ofVar, WeakReference weakReference, boolean z) {
        pcc(ofVar, (WeakReference<Context>) weakReference, z);
    }

    public vj(Context context, ViewGroup viewGroup, boolean z, int i, of ofVar, com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar, boolean z2) {
        this.pcc = 228;
        this.sf = 160;
        this.lu = true;
        this.jsj = true;
        this.lq = true;
        this.mu = Build.MODEL;
        if (this instanceof oo) {
            return;
        }
        this.of = lu.pcc().getApplicationContext();
        oo(z2);
        this.gm = viewGroup;
        this.lu = z;
        this.fum = i;
        this.mk = gmVar;
        this.tz = ofVar;
        oo(8);
        pcc(context, this.gm);
        oo();
        tmg();
    }

    public vj(Context context, ViewGroup viewGroup, boolean z, int i, of ofVar, com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar) {
        this(context, viewGroup, z, i, ofVar, gmVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void tmg() {
        String str;
        int i;
        String str2;
        int i2;
        com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar;
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar;
        String str3 = this.jsj ? "embeded_ad" : "embeded_ad_landingpage";
        if (this.tz.tuy()) {
            str2 = "rewarded_video";
            i2 = 7;
        } else if (this.tz.qra()) {
            str2 = "fullscreen_interstitial_ad";
            i2 = 5;
        } else if (this.tz.jl()) {
            str2 = "banner_ad";
            i2 = 2;
        } else {
            str = str3;
            i = 1;
            if (this.tz.az() == 4) {
                this.tsz = com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.of, str);
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = new com.bytedance.sdk.openadsdk.core.gm.pcc(this.of, this.tz, str, i);
            this.atb = pccVar2;
            pccVar2.pcc(this);
            this.atb.sf(true);
            if (!this.jsj) {
                this.atb.pcc(true);
            } else {
                this.atb.pcc(false);
                this.atb.gm(true);
            }
            this.atb.pcc(this.mk);
            this.atb.vj(true);
            this.atb.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.1
                @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
                public void pcc(View view, int i3) {
                    if (vj.this.zti != null) {
                        vj.this.zti.pcc(view, i3);
                    }
                }
            });
            gmVar = this.tsz;
            if (gmVar != null && (pccVar = this.atb) != null) {
                pccVar.pcc(gmVar);
            }
            if (qy()) {
                return;
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar3 = new com.bytedance.sdk.openadsdk.core.gm.pcc(this.of, this.tz, str, i) { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.2
                @Override // com.bytedance.sdk.openadsdk.core.gm.pcc
                public boolean sf() {
                    boolean pcc = vj.this.yt != null ? vj.this.yt.pcc() : false;
                    vj.this.vj.getVisibility();
                    return pcc || vj.this.vj.getVisibility() == 0;
                }

                @Override // com.bytedance.sdk.openadsdk.core.gm.pcc
                public boolean gm() {
                    if (vj.this.ork == null || vj.this.ork.getVisibility() != 0) {
                        return vj.this.tmg != null && vj.this.tmg.getVisibility() == 0;
                    }
                    return true;
                }
            };
            this.ye = pccVar3;
            pccVar3.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.3
                @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
                public void pcc(View view, int i3) {
                    if (vj.this.zti != null) {
                        vj.this.zti.pcc(view, i3);
                    }
                }
            });
            this.ye.sf(true);
            this.ye.pcc(this.jsj);
            this.ye.pcc(this.mk);
            this.ye.vj(true);
            com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gmVar2 = this.tsz;
            if (gmVar2 != null) {
                this.ye.pcc(gmVar2);
            }
            this.ye.pcc(this);
            return;
        }
        str = str2;
        i = i2;
        if (this.tz.az() == 4) {
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar22 = new com.bytedance.sdk.openadsdk.core.gm.pcc(this.of, this.tz, str, i);
        this.atb = pccVar22;
        pccVar22.pcc(this);
        this.atb.sf(true);
        if (!this.jsj) {
        }
        this.atb.pcc(this.mk);
        this.atb.vj(true);
        this.atb.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i3) {
                if (vj.this.zti != null) {
                    vj.this.zti.pcc(view, i3);
                }
            }
        });
        gmVar = this.tsz;
        if (gmVar != null) {
            pccVar.pcc(gmVar);
        }
        if (qy()) {
        }
    }

    private boolean qy() {
        return of.vj(this.tz) && (!com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.tz.rt()) ? this.tz.kx() == null : this.tz.uae() == null) && this.tz.ra() == 1;
    }

    public void pcc(wh.pcc pccVar) {
        this.zti = pccVar;
    }

    public void pcc(PAGNativeAd pAGNativeAd) {
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.atb;
        if (pccVar != null) {
            pccVar.pcc(pAGNativeAd);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = this.ye;
        if (pccVar2 != null) {
            pccVar2.pcc(pAGNativeAd);
        }
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf hc() {
        return this.oo;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v20, types: [com.bykv.vk.openvk.pcc.pcc.pcc.wh.oo] */
    void pcc(Context context, View view) {
        com.bykv.vk.openvk.pcc.pcc.pcc.wh.gm gmVar;
        System.currentTimeMillis();
        of ofVar = this.tz;
        if ((ofVar == null || ((!ofVar.tg() && !this.tz.jl()) || vh.sf().kx())) && view != null) {
            view.setKeepScreenOn(true);
        }
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar2 = this.mk;
        if (gmVar2 != null && gmVar2.jr()) {
            gmVar = new com.bykv.vk.openvk.pcc.pcc.pcc.wh.oo(this.of);
        } else {
            gmVar = new com.bykv.vk.openvk.pcc.pcc.pcc.wh.gm(this.of);
        }
        if (view instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams.addRule(13);
            ((RelativeLayout) view).addView(gmVar, 0, layoutParams);
        }
        rj.pcc((View) gmVar, 8);
        this.oo = gmVar;
        this.vj = (ImageView) view.findViewById(nac.bgf);
        this.wh = view.findViewById(nac.pzh);
        this.qf = view.findViewById(nac.lc);
        this.kj = (ImageView) view.findViewById(nac.gmh);
        this.vy = view.findViewById(nac.ln);
        System.currentTimeMillis();
    }

    void pcc(View view, Context context) {
        View view2;
        if (view == null || context == null || (view2 = this.vy) == null || view2.getParent() == null || this.ork != null) {
            return;
        }
        this.ork = this.vy;
        this.vh = (ImageView) view.findViewById(nac.oyx);
        this.tmg = view.findViewById(nac.eko);
        this.hc = (TextView) view.findViewById(nac.ri);
    }

    void gbb() {
        if (this.qy == null || this.yt != null) {
            return;
        }
        System.currentTimeMillis();
        lo loVar = new lo();
        this.yt = loVar;
        loVar.pcc(this.of, this.gm);
        this.yt.pcc(this.qy, this);
        System.currentTimeMillis();
    }

    public boolean pcc(int i, com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf sfVar, boolean z) {
        lo loVar = this.yt;
        return loVar == null || loVar.pcc(i, sfVar, z);
    }

    public void jr() {
        lo loVar = this.yt;
        if (loVar != null) {
            loVar.pcc(false);
        }
    }

    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc pccVar) {
        if (pccVar instanceof pcc) {
            this.qy = (pcc) pccVar;
            gbb();
        }
    }

    boolean dax() {
        return this.qy != null;
    }

    void oo() {
        this.oo.pcc(this);
        this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.vj.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (vj.this.dax()) {
                    if (vj.this.hc == null || vj.this.hc.getVisibility() != 0) {
                        vj.this.qy.pcc(vj.this, view);
                    }
                }
            }
        });
    }

    public void gm(int i) {
        rj.pcc((View) this.gm, 0);
        com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.setVisibility(i);
        }
    }

    public void oo(boolean z) {
        this.jsj = z;
        if (z) {
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar = this.atb;
            if (pccVar != null) {
                pccVar.pcc(true);
            }
            com.bytedance.sdk.openadsdk.core.gm.pcc pccVar2 = this.ye;
            if (pccVar2 != null) {
                pccVar2.pcc(true);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar3 = this.atb;
        if (pccVar3 != null) {
            pccVar3.pcc(false);
        }
        com.bytedance.sdk.openadsdk.core.gm.pcc pccVar4 = this.ye;
        if (pccVar4 != null) {
            pccVar4.pcc(false);
        }
    }

    public void pcc(int i, int i2) {
        if (i == -1) {
            i = rj.gm(this.of);
        }
        if (i <= 0) {
            return;
        }
        this.gbb = i;
        if (fum() || ork() || (this.fum & 8) == 8) {
            this.jr = i2;
        } else {
            this.jr = vj(i);
        }
        sf(this.gbb, this.jr);
    }

    public void sf(boolean z, boolean z2) {
        ImageView imageView = this.vj;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(this.of, "tt_play_movebar_textpage"));
            } else {
                imageView.setImageDrawable(com.bytedance.sdk.openadsdk.utils.vh.pcc(this.of, "tt_stop_movebar_textpage"));
            }
        }
    }

    public void sf(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = this.gm.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (i == -1 || i == -2 || i > 0) {
            layoutParams.width = i;
        }
        if (i2 == -1 || i2 == -2 || i2 > 0) {
            layoutParams.height = i2;
        }
        this.gm.setLayoutParams(layoutParams);
    }

    private int vj(int i) {
        if (this.dax <= 0 || this.nac <= 0) {
            return 0;
        }
        int sf = rj.sf(this.of, 228.0f);
        int sf2 = rj.sf(this.of, 160.0f);
        int i2 = (int) (this.nac * ((i * 1.0f) / this.dax));
        return i2 > sf ? sf : i2 < sf2 ? sf2 : i2;
    }

    public void gm(int i, int i2) {
        this.dax = i;
        this.nac = i2;
    }

    public void gm(ViewGroup viewGroup) {
        if (viewGroup == null) {
            return;
        }
        if (this.gm.getParent() == null) {
            viewGroup.addView(this.gm);
        }
        oo(0);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf
    public View gm() {
        return this.gm;
    }

    public void qf() {
        of ofVar;
        rj.wh(this.wh);
        rj.wh(this.qf);
        if (this.kj != null && (ofVar = this.tz) != null && ofVar.kez() != null && this.tz.kez().ork() != null) {
            rj.wh(this.kj);
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.tz.kez().ork(), this.tz.kez().gm(), this.tz.kez().sf(), this.kj, this.tz);
        }
        if (this.vj.getVisibility() == 0) {
            rj.pcc((View) this.vj, 8);
        }
    }

    public void nac() {
        rj.wh(this.wh);
        rj.wh(this.qf);
        if (this.vj.getVisibility() == 0) {
            rj.pcc((View) this.vj, 8);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf
    public void pcc() {
        pcc(false, this.lu);
        gpj();
    }

    public void lu() {
        rj.pcc((View) this.gm, 0);
        com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf sfVar = this.oo;
        if (sfVar != null) {
            rj.pcc(sfVar.getView(), 0);
        }
    }

    void gpj() {
        try {
            rj.pcc(this.ork, 8);
            rj.pcc((View) this.vh, 8);
            rj.pcc(this.tmg, 8);
            rj.pcc((View) this.hc, 8);
        } catch (Exception unused) {
        }
    }

    public void lo() {
        ImageView imageView = this.vh;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
    }

    private void wh(int i) {
        rj.pcc(this.tmg, i);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf
    public void pcc(boolean z) {
        this.lq = z;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    public void pcc(of ofVar, WeakReference<Context> weakReference, boolean z) {
        of ofVar2;
        if (ofVar == null) {
            return;
        }
        pcc(false, this.lu);
        pcc(this.gm, lu.pcc());
        View view = this.ork;
        if (view != null) {
            rj.pcc(view, 0);
        }
        ImageView imageView = this.vh;
        if (imageView != null) {
            rj.pcc((View) imageView, 0);
        }
        rj.pcc(this.tmg, 0);
        if (this.vh != null && (ofVar2 = this.tz) != null && ofVar2.kez() != null && this.tz.kez().ork() != null) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.tz.kez().ork(), this.tz.kez().gm(), this.tz.kez().sf(), this.vh, ofVar);
        }
        rj.pcc((View) this.hc, 0);
        String bgf = ofVar.bgf();
        if (TextUtils.isEmpty(bgf)) {
            int az = ofVar.az();
            if (az != 2 && az != 3) {
                if (az == 4) {
                    bgf = tz.pcc(this.of, "tt_video_download_apk");
                } else if (az == 5) {
                    bgf = tz.pcc(this.of, "tt_video_dial_phone");
                } else if (az != 8) {
                    bgf = tz.pcc(this.of, "tt_video_mobile_go_detail");
                }
            }
            bgf = tz.pcc(this.of, "tt_video_mobile_go_detail");
        }
        TextView textView = this.hc;
        if (textView != null) {
            textView.setText(bgf);
            this.hc.setOnClickListener(this.atb);
            this.hc.setOnTouchListener(this.atb);
        }
        if (this.lq) {
            return;
        }
        wh(4);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf
    public void sf() {
        rj.vj(this.wh);
        rj.vj(this.qf);
        ImageView imageView = this.kj;
        if (imageView != null) {
            rj.vj(imageView);
        }
    }

    public void kj() {
        rj.vj(this.wh);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc
    public void pcc(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.oo.getHolder()) {
            return;
        }
        this.gpj = true;
        if (dax()) {
            this.qy.pcc(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc
    public void pcc(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (surfaceHolder != this.oo.getHolder()) {
            return;
        }
        dax();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc
    public void sf(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != this.oo.getHolder()) {
            return;
        }
        this.gpj = false;
        if (dax()) {
            this.qy.sf(this, surfaceHolder);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc
    public void pcc(SurfaceTexture surfaceTexture, int i, int i2) {
        this.gpj = true;
        if (dax()) {
            this.qy.pcc(this, surfaceTexture);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc
    public boolean pcc(SurfaceTexture surfaceTexture) {
        this.gpj = false;
        if (!dax()) {
            return true;
        }
        this.qy.sf(this, surfaceTexture);
        return true;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.wh.pcc
    public void sf(SurfaceTexture surfaceTexture) {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.mk;
        if (gmVar != null) {
            gmVar.pcc(surfaceTexture);
        }
    }

    public void vy() {
        oo(8);
        if (yt()) {
            this.oo.setVisibility(8);
        }
        ImageView imageView = this.kj;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        oo(8);
        rj.pcc(this.ork, 8);
        rj.pcc((View) this.vh, 8);
        rj.pcc(this.tmg, 8);
        lo loVar = this.yt;
        if (loVar != null) {
            loVar.pcc(true);
        }
    }

    public boolean fum() {
        return this.lu;
    }

    public void pcc(boolean z, boolean z2, boolean z3) {
        rj.pcc((View) this.vj, (!z || this.wh.getVisibility() == 0) ? 8 : 0);
    }

    public void pcc(boolean z, boolean z2) {
        rj.pcc((View) this.vj, 8);
    }

    public void vh() {
        pcc(true, false);
    }

    public boolean tz() {
        return this.gpj;
    }

    public void oo(int i) {
        this.lo = i;
        rj.pcc((View) this.gm, i);
    }

    @Override // com.bytedance.sdk.openadsdk.core.widget.gpj.pcc
    public boolean of() {
        lo loVar = this.yt;
        return loVar != null && loVar.pcc();
    }

    boolean yt() {
        return (this.fum & 4) != 4 || this.lu;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf
    public void pcc(Drawable drawable) {
        ViewGroup viewGroup = this.gm;
        if (viewGroup != null) {
            viewGroup.setBackgroundDrawable(drawable);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0150pcc
    public long getVideoProgress() {
        if (this.pq <= 0) {
            of ofVar = this.tz;
            if (ofVar != null && ofVar.kez() != null) {
                this.pq = (long) (this.tz.kez().wh() * 1000.0d);
            }
            com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.mk;
            if (gmVar != null) {
                this.pq = gmVar.vy();
            }
        }
        return this.pq;
    }
}
