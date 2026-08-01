package com.bytedance.sdk.openadsdk.core.jr.sf;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bykv.vk.openvk.pcc.pcc.pcc.pcc;
import com.bytedance.sdk.component.utils.jsj;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.lu;
import com.bytedance.sdk.component.utils.vy;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.core.jr.sf.wh;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.tsz;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.rnn;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes4.dex */
public class gm extends com.bytedance.sdk.openadsdk.core.jr.pcc.pcc {
    private boolean bg;
    private int erj;
    private int fmh;
    private sf gd;
    private final Runnable hoh;
    private int hpk;
    private boolean iv;
    private final String kun;
    private final boolean lrr;
    private long nn;
    private int ptr;
    private final jsj.pcc qcw;
    private WeakReference<pcc> ri;
    private final boolean rj;
    private long rnn;
    private final pcc.InterfaceC0094pcc se;
    private final boolean tsx;
    private int vr;
    private WeakReference<gm.oo> xb;
    private qf zsj;

    public interface pcc {
        void pcc(int i);

        void wh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oo(int i, int i2) {
        boolean z = i == -1010 || i == -1007 || i == -1004 || i == -110 || i == 100 || i == 200;
        if (i2 == 1 || i2 == 700 || i2 == 800) {
            return true;
        }
        return z;
    }

    public void wh(boolean z) {
        this.iv = z;
    }

    public void pcc(final wh.pcc pccVar) {
        if (!this.jr || this.qf == null) {
            return;
        }
        this.qf.pcc(new wh.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.2
            @Override // com.bytedance.sdk.openadsdk.core.jr.sf.wh.pcc
            public void pcc(View view, int i) {
                wh.pcc pccVar2 = pccVar;
                if (pccVar2 != null) {
                    pccVar2.pcc(view, i);
                }
            }
        });
    }

    public void pcc(PAGNativeAd pAGNativeAd) {
        if (!this.jr || this.qf == null) {
            return;
        }
        this.qf.pcc(pAGNativeAd);
    }

    public void pcc(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return;
        }
        this.hpk = i;
        this.fmh = i2;
    }

    public void sf(int i, int i2) {
        pcc(i, i2);
        if (this.qf == null || i <= 0 || i2 <= 0) {
            return;
        }
        this.qf.gm(i, i2);
        this.qf.pcc(i, i2);
        lrr();
    }

    public void pcc(sf sfVar) {
        this.gd = sfVar;
    }

    private void pcc(Context context) {
        ViewGroup gmVar;
        if (this.jr) {
            gmVar = new com.bytedance.sdk.openadsdk.jr.oo(context);
        } else {
            gmVar = new com.bytedance.sdk.openadsdk.jr.gm(context);
        }
        ViewGroup viewGroup = gmVar;
        if (this.jr) {
            this.qf = new vj(context, viewGroup, true, 17, this.kj, this, tz());
        } else {
            this.qf = new oo(context, viewGroup, true, 17, this.kj, this, false);
        }
        this.qf.pcc(this);
    }

    public gm(Context context, ViewGroup viewGroup, of ofVar, String str, boolean z, boolean z2, boolean z3, qf qfVar) {
        super(context, ofVar, viewGroup);
        this.nn = 0L;
        this.rnn = 0L;
        this.iv = true;
        this.hpk = 0;
        this.fmh = 0;
        this.se = new pcc.InterfaceC0094pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1
            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void gm(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i) {
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(gm.this.kj, 5);
                            com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(gm.this.kj, 5);
                            if (gm.this.mk != null) {
                                gm.this.mk.pcc(9);
                            }
                        } catch (Exception unused) {
                        }
                        gm.this.kun();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.oo gto = gm.this.kj.gto();
                if (gto == null || (pcc2 = gto.pcc()) == null) {
                    return;
                }
                pcc2.oo(gm.this.vy);
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, long j) {
                gm.this.yt = false;
                gm.this.gm.removeCallbacks(gm.this.hoh);
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (gm.this.qf != null) {
                            gm.this.qf.sf();
                        }
                        if (!gm.this.jr || gm.this.ri == null || gm.this.ri.get() == null) {
                            return;
                        }
                        ((pcc) gm.this.ri.get()).wh();
                    }
                });
                gm.this.pq();
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(gm.this.kj, 0);
                if (gm.this.mk != null) {
                    gm.this.mk.gm();
                }
                gm gmVar = gm.this;
                gmVar.pcc(gmVar.zsj);
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
                gm.this.gm.removeCallbacks(gm.this.hoh);
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.3
                    @Override // java.lang.Runnable
                    public void run() {
                        if (gm.this.xb != null && gm.this.xb.get() != null) {
                            gm.this.xb.get();
                        }
                        if (gm.this.qf != null) {
                            gm.this.qf.sf();
                        }
                    }
                });
                if (gm.this.tsx) {
                    return;
                }
                gm gmVar = gm.this;
                gmVar.pcc(gmVar.zsj);
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, final com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar2) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                String unused = gm.this.pcc;
                pccVar2.pcc();
                pccVar2.sf();
                pccVar2.gm();
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.4
                    @Override // java.lang.Runnable
                    public void run() {
                        int pcc3 = pccVar2.pcc();
                        int sf = pccVar2.sf();
                        if (!gm.this.tsz() || sf == -1004) {
                            if (gm.this.oo(pcc3, sf)) {
                                String unused2 = gm.this.pcc;
                                gm.this.qf.pcc(gm.this.kj, (WeakReference<Context>) null, false);
                                gm.this.sf(true);
                                gm.this.vj();
                            }
                            if (gm.this.qf != null) {
                                gm.this.qf.sf();
                            }
                            if (gm.this.tsz != null) {
                                gm.this.tsz.sf(gm.this.rnn, com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(gm.this.vy, gm.this.pq));
                            }
                            if (gm.this.xb == null || gm.this.xb.get() == null || gm.this.tsz()) {
                                return;
                            }
                            ((gm.oo) gm.this.xb.get()).pcc(pcc3, sf);
                        }
                    }
                });
                gm.this.pcc(pccVar2);
                com.bytedance.sdk.openadsdk.core.model.oo gto = gm.this.kj.gto();
                if (gto != null && (pcc2 = gto.pcc()) != null) {
                    pcc2.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(gm.this.kj, 6);
                com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(gm.this.kj);
                if (gm.this.mk != null) {
                    gm.this.mk.pcc(14);
                }
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, boolean z4) {
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.5
                    @Override // java.lang.Runnable
                    public void run() {
                        if (gm.this.qf != null) {
                            gm.this.qf.sf();
                        }
                    }
                });
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i, int i2) {
                vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.6
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.lrr();
                    }
                });
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i, int i2, int i3) {
                gm.this.yt = true;
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.7
                    @Override // java.lang.Runnable
                    public void run() {
                        if (gm.this.qf != null) {
                            gm.this.qf.nac();
                            gm.this.gm.postDelayed(gm.this.hoh, 8000L);
                        }
                    }
                });
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(gm.this.kj, 2);
                if (gm.this.mk != null) {
                    gm.this.mk.pcc(4);
                }
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i) {
                gm.this.yt = false;
                gm.this.gm.removeCallbacks(gm.this.hoh);
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.8
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.qf.sf();
                    }
                });
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(gm.this.kj, 0);
                if (gm.this.mk != null) {
                    gm.this.mk.pcc(5);
                }
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, final long j, final long j2) {
                if (Math.abs(j - gm.this.vy) < 50) {
                    return;
                }
                gm gmVar = gm.this;
                gmVar.pcc(gmVar.zsj);
                gm.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.1.9
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.pcc(j, j2);
                        gm.this.sf(j, j2);
                    }
                });
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void oo(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                com.bytedance.sdk.openadsdk.core.model.oo gto = gm.this.kj.gto();
                if (gto != null && (pcc2 = gto.pcc()) != null) {
                    pcc2.sf(gm.this.vy);
                }
                com.bytedance.sdk.openadsdk.qy.sf.vj.pcc(gm.this.kj, 3);
                if (gm.this.mk != null) {
                    gm.this.mk.pcc(0);
                }
            }

            @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
            public void vj(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
                com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
                com.bytedance.sdk.openadsdk.core.model.oo gto = gm.this.kj.gto();
                if (gto != null && (pcc2 = gto.pcc()) != null) {
                    pcc2.gm(gm.this.vy);
                }
                if (gm.this.mk != null) {
                    gm.this.mk.pcc(1);
                }
            }
        };
        this.ptr = 0;
        this.hoh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.4
            @Override // java.lang.Runnable
            public void run() {
                if (gm.this.qf != null) {
                    gm.this.qf.pcc(gm.this.kj, (WeakReference<Context>) null, false);
                    gm.this.qf.sf();
                    gm.this.sf(true);
                    String unused = gm.this.pcc;
                }
            }
        };
        this.qcw = new jsj.pcc() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.6
            @Override // com.bytedance.sdk.component.utils.jsj.pcc
            public void pcc(Context context2, Intent intent, boolean z4, final int i) {
                rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.6.1
                    @Override // java.lang.Runnable
                    public void run() {
                        gm.this.wh(i);
                    }
                });
            }
        };
        this.bg = false;
        this.vr = lu.gm(context);
        pcc(z);
        this.kun = str;
        try {
            this.hpk = viewGroup.getWidth();
            this.fmh = viewGroup.getHeight();
        } catch (Throwable unused) {
        }
        pcc(context);
        this.tsx = true;
        this.rj = z2;
        this.lrr = z3;
        if (qfVar != null) {
            this.zsj = qfVar;
        }
    }

    public com.bytedance.sdk.openadsdk.core.gbb.wh pcc(View view, List<Pair<View, FriendlyObstructionPurpose>> list) {
        if (!this.kj.ixc()) {
            return null;
        }
        if (this.mk == null) {
            this.mk = com.bytedance.sdk.openadsdk.core.gbb.wh.pcc();
        }
        this.mk.pcc(view, this.kj);
        if (list != null && list.size() > 0) {
            for (Pair<View, FriendlyObstructionPurpose> pair : list) {
                if (pair != null) {
                    this.mk.pcc((View) pair.first, pair.second == null ? FriendlyObstructionPurpose.OTHER : (FriendlyObstructionPurpose) pair.second);
                }
            }
        }
        return this.mk;
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public void pcc(gm.oo ooVar) {
        this.xb = new WeakReference<>(ooVar);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc() {
        if (this.wh != null) {
            this.wh.vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        super.pcc(gmVar);
        if (this.wh != null) {
            ApmHelper.reportCustomError("", "twice playVideoUrl", new IllegalStateException());
            return true;
        }
        if (TextUtils.isEmpty(gmVar.dax())) {
            return false;
        }
        sf(false);
        gmVar.dax();
        gmVar.sf(com.bytedance.sdk.openadsdk.yt.vj.pcc("player_force_raw_url", 0) == 1);
        int i = this.erj + 1;
        this.erj = i;
        gmVar.vj = i;
        sf(gmVar);
        ye();
        if (this.mk != null) {
            this.mk.pcc(false, 0.0f);
        }
        if (!tsz.sf(this.kun) || this.vy <= 0) {
            this.vy = gmVar.ork();
        }
        if (tsz.sf(this.kun) && this.vy == this.pq) {
            this.vy = 0L;
        }
        if (gmVar.ork() <= 0) {
            this.fum = false;
            this.lo.set(false);
        } else {
            this.vy = gmVar.ork();
            this.ork = Math.max(this.ork, this.vy);
        }
        if (this.qf != null) {
            this.qf.pcc();
            if (this.ptr == 0) {
                this.qf.qf();
            }
            this.qf.gm(gmVar.kj(), gmVar.vy());
            this.qf.gm(this.qy);
            this.qf.pcc(gmVar.kj(), gmVar.vy());
        }
        if (this.wh == null) {
            this.wh = new com.bytedance.sdk.openadsdk.core.jr.oo.gm();
            this.wh.pcc(this.se);
        }
        lu();
        this.rnn = 0L;
        try {
            gm(gmVar);
            return true;
        } catch (Exception e) {
            pcc(new com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc(-10, 0, e.getMessage()));
            lo.gm(this.pcc, "[video] invoke NativeVideoController#playVideo cause exception :".concat(String.valueOf(e)));
            return false;
        }
    }

    private void gm(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        gmVar.oo(0);
        this.wh.pcc(gmVar);
        this.nn = System.currentTimeMillis();
        this.qf.gm(8);
        this.qf.gm(0);
        pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.3
            @Override // java.lang.Runnable
            public void run() {
                if (gm.this.wh == null) {
                    return;
                }
                gm.this.nn = System.currentTimeMillis();
                gm.this.qf.oo(0);
                gm.this.wh.pcc(true, gm.this.vy, gm.this.dax);
            }
        });
        if (this.jr) {
            dax();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kun() {
        this.ptr++;
        if (this.qf == null) {
            return;
        }
        this.qf.sf();
        if (this.tsz != null) {
            this.tsz.pcc(this.rnn, com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(this.vy, this.pq));
        }
        this.rnn = System.currentTimeMillis() - this.nn;
        if (this.iv) {
            this.qf.pcc(this.kj, (WeakReference<Context>) null, true);
        }
        if (!this.fum) {
            this.fum = true;
            sf(this.pq, this.pq);
            long j = this.pq;
            this.vy = j;
            this.ork = j;
            sf(this.zsj);
        }
        if (!this.jr && this.gpj) {
            vj(this.qf, null);
        }
        this.gbb = true;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void gm() {
        if (this.qf != null) {
            this.qf.pcc();
        }
        if (this.qf != null) {
            this.qf.lu();
        }
        rj();
    }

    public void qf(boolean z) {
        if (this.qf != null) {
            this.qf.pcc();
        }
        if (this.qf != null && z) {
            this.qf.lu();
        }
        rj();
    }

    private void rj() {
        new Object[]{"resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.hc)};
        if (this.wh != null) {
            if (this.wh.qf()) {
                if (this.hc) {
                    lo();
                } else {
                    sf(this.mu);
                }
                new Object[]{"resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.hc)};
            } else {
                this.wh.pcc(false, this.vy, this.dax);
            }
        }
        if (this.lo.get()) {
            mk();
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void oo() {
        pcc(true, 3);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(boolean z, int i) {
        if (!this.fum && this.lo.get()) {
            if (z) {
                pcc(i, false);
                this.fum = false;
            } else {
                atb();
            }
        }
        vj();
        if (this.mk != null) {
            this.mk.oo();
        }
    }

    public final void pcc(int i, boolean z) {
        if (z || this.zti) {
            if (z) {
                this.zti = false;
            }
            if (this.fum || !this.lo.get()) {
                return;
            }
            jr.pcc pccVar = new jr.pcc();
            pccVar.sf(wh());
            pccVar.oo(vy());
            pccVar.gm(qf());
            pccVar.gm(i);
            pccVar.oo(kj());
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.qf, pccVar, this.zsj);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void vj() {
        if (this.wh != null) {
            this.wh.tmg();
            this.wh = null;
        }
        if (this.iv) {
            if (!"embeded_ad".equals(this.kun)) {
                this.qf.pcc(this.kj, (WeakReference<Context>) null, true);
            } else {
                this.qf.lo();
            }
            this.gm.removeCallbacksAndMessages(null);
            this.tmg.clear();
            if (this.jr) {
                mu();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 > 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        r2 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void lrr() {
        int i;
        int i2;
        try {
            if (iv() != null && this.wh != null && this.qy != null) {
                int oo = this.wh.oo();
                int vj = this.wh.vj();
                final int width = this.qy.getWidth();
                final int height = this.qy.getHeight();
                if (width > 0 && height > 0 && vj > 0 && oo > 0) {
                    if (oo == vj) {
                        i2 = width > height ? height : width;
                        i = i2;
                    } else if (oo > vj) {
                        i2 = (int) ((width * 1.0d) / ((oo * 1.0f) / vj));
                        i = width;
                    } else {
                        i = (int) ((height * 1.0d) / ((vj * 1.0f) / oo));
                        i2 = height;
                    }
                    if (i2 <= height && i2 > 0) {
                        height = i2;
                    }
                    this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.sf.gm.5
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(width, height);
                                layoutParams.addRule(13);
                                if (gm.this.iv() instanceof TextureView) {
                                    ((TextureView) gm.this.iv()).setLayoutParams(layoutParams);
                                    String unused = gm.this.pcc;
                                } else if (gm.this.iv() instanceof SurfaceView) {
                                    ((SurfaceView) gm.this.iv()).setLayoutParams(layoutParams);
                                    String unused2 = gm.this.pcc;
                                }
                            } catch (Throwable unused3) {
                                String unused4 = gm.this.pcc;
                            }
                        }
                    });
                    return;
                }
                return;
            }
            new StringBuilder("[step-1] >>>>> mContextRef=").append(this.vh).append(",getIRenderView() =").append(iv());
            com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
            com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar2 = this.wh;
        } catch (Throwable th) {
            new StringBuilder("[step-11] >>>>> changeVideoSize error !!!!! ：").append(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf iv() {
        if (this.vh.getResources().getConfiguration().orientation != 1 || this.qf == null) {
            return null;
        }
        return this.qf.hc();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view) {
        if (this.wh == null) {
            return;
        }
        if (this.wh.wh()) {
            sf();
            this.qf.sf(true, false);
            this.qf.wh();
        } else {
            if (!this.wh.qf()) {
                if (this.qf != null) {
                    this.qf.gm(this.qy);
                }
                vj(this.vy);
                if (this.qf != null) {
                    this.qf.sf(false, false);
                    return;
                }
                return;
            }
            qf(false);
            if (this.qf != null) {
                this.qf.sf(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(long j, long j2) {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc2;
        this.kj.oo(j);
        this.vy = j;
        this.pq = j2;
        this.qf.pcc(j, j2);
        this.qf.pcc(com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(j, j2));
        try {
            if (this.tsz != null) {
                this.tsz.pcc(j, j2);
            }
        } catch (Throwable th) {
            lo.pcc(this.pcc, "onProgressUpdate error: ", th);
        }
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.kj.gto();
        if (gto == null || (pcc2 = gto.pcc()) == null) {
            return;
        }
        pcc2.pcc(j, j2, this.mk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view, boolean z) {
        gm(!this.gpj);
        if (this.vh instanceof Activity) {
            if (this.qf != null) {
                this.qf.sf(this.qy);
                this.qf.gm(false);
            }
            pcc(1);
            gm.sf sfVar2 = this.jsj != null ? this.jsj.get() : null;
            if (sfVar2 != null) {
                sfVar2.pcc(this.gpj);
            }
        }
    }

    private boolean gm(int i, int i2) {
        if (i2 == 0) {
            sf();
            this.nac = true;
            if (this.qf != null) {
                this.qf.pcc(this.kj, (WeakReference<Context>) null, false);
            }
        }
        if (i2 != 4 && i2 != 0) {
            if (this.qf != null) {
                this.qf.pcc();
            }
            sf();
            this.nac = true;
            this.lu = false;
            if (this.qf != null) {
                return this.qf.pcc(i, this.kj.kez(), this.lrr);
            }
        } else if (i2 == 4) {
            this.nac = false;
            if (this.qf != null) {
                this.qf.jr();
            }
        }
        return true;
    }

    private void vj(int i) {
        if (this.vr == i) {
            return;
        }
        this.vr = i;
        if (i != 4 && i != 0) {
            this.lu = false;
        }
        if (!this.lu && !hc() && this.rj) {
            gm(2, i);
        }
        WeakReference<pcc> weakReference = this.ri;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.ri.get().pcc(this.vr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wh(int i) {
        vj(i);
        if (i == 4) {
            this.nac = false;
        }
    }

    public void gm(int i) {
        vj(i);
        if (i == 4) {
            this.nac = false;
            gm();
        }
    }

    public void dax() {
        if (this.bg || !this.tz) {
            return;
        }
        Context applicationContext = com.bytedance.sdk.openadsdk.core.lu.pcc().getApplicationContext();
        this.bg = true;
        jsj.pcc(this.qcw, applicationContext);
    }

    public void mu() {
        if (this.bg && this.tz) {
            this.bg = false;
            jsj.pcc(this.qcw);
        }
    }

    public void pcc(pcc pccVar) {
        this.ri = new WeakReference<>(pccVar);
    }

    public void nn() {
        if (this.mk != null) {
            this.mk.pcc(13);
        }
    }

    public void rnn() {
        if (this.wh != null) {
            sf(false);
            ye();
            this.lo.set(false);
            this.fum = false;
            pcc(this.zsj);
            this.wh.vy();
        }
    }

    public void oo(int i) {
        this.erj = i;
    }

    public int tsx() {
        return this.erj;
    }
}
