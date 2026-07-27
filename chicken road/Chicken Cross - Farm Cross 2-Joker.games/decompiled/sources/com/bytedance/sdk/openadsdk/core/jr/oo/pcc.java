package com.bytedance.sdk.openadsdk.core.jr.oo;

import android.content.Context;
import android.text.TextUtils;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.webkit.ProxyConfig;
import com.bytedance.sdk.component.utils.vy;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.core.gbb.oo;
import com.bytedance.sdk.openadsdk.core.gbb.wh;
import com.bytedance.sdk.openadsdk.core.jr.oo.gm;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.qy.sf.vj;
import com.bytedance.sdk.openadsdk.utils.lrr;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.iab.omid.library.bytedance2.adsession.FriendlyObstructionPurpose;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public class pcc extends com.bytedance.sdk.openadsdk.core.jr.pcc.pcc {
    private final Runnable fmh;
    private boolean hpk;
    private boolean iv;
    private final qf kun;
    private long lrr;
    protected long nn;
    private final AtomicBoolean ri;
    private long rj;
    protected boolean rnn;
    final gm.sf tsx;
    private final int xb;
    private InterfaceC0164pcc zsj;

    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.oo.pcc$pcc, reason: collision with other inner class name */
    public interface InterfaceC0164pcc {
        void pcc(int i);
    }

    protected void dax() {
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc
    public boolean qy() {
        return true;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.oo.pcc$1, reason: invalid class name */
    class AnonymousClass1 implements gm.sf {
        private boolean sf = true;

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i) {
        }

        AnonymousClass1() {
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            oo pcc;
            if (pcc.this.ri.compareAndSet(false, true)) {
                String unused = pcc.this.pcc;
                pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (pcc.this.mk != null) {
                            try {
                                pcc.this.mk.pcc(9);
                            } catch (Exception unused2) {
                            }
                        }
                        pcc.this.xb();
                    }
                });
                com.bytedance.sdk.openadsdk.core.model.oo gto = pcc.this.kj.gto();
                if (gto != null && (pcc = gto.pcc()) != null) {
                    long wh = pcc.this.wh();
                    pcc.oo(wh);
                    pcc.vj(wh);
                }
                vj.pcc(pcc.this.kj, 5);
                com.bytedance.sdk.openadsdk.qy.pcc.gm.pcc(pcc.this.kj, 5);
                if (pcc.this.zsj != null) {
                    pcc.this.zsj.pcc(3);
                }
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, long j) {
            String unused = pcc.this.pcc;
            pcc.this.yt = false;
            pcc.this.gm.removeCallbacks(pcc.this.fmh);
            pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.2
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.qf != null) {
                        pcc.this.qf.sf();
                    }
                }
            });
            if (!pcc.this.lo.get()) {
                pcc.this.nn = j;
                pcc pccVar2 = pcc.this;
                pccVar2.pcc(pccVar2.kun);
                pcc.this.pq();
            }
            if (pcc.this.mk != null) {
                pcc.this.mk.gm();
            }
            vj.pcc(pcc.this.kj, 0);
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(1);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            String unused = pcc.this.pcc;
            pcc.this.gm.removeCallbacks(pcc.this.fmh);
            pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.3
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.qf != null) {
                        pcc.this.qf.sf();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar2) {
            oo pcc;
            String unused = pcc.this.pcc;
            pccVar2.pcc();
            pccVar2.sf();
            pccVar2.gm();
            pcc.this.gm.removeCallbacks(pcc.this.fmh);
            pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.4
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.qf != null) {
                        pcc.this.qf.sf();
                    }
                    if (pcc.this.tsz != null) {
                        pcc.this.tsz.sf(pcc.this.lrr, com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(pcc.this.vy, pcc.this.pq));
                    }
                }
            });
            pcc.this.pcc(pccVar2);
            vj.pcc(pcc.this.kj, 6);
            com.bytedance.sdk.openadsdk.qy.pcc.gm.sf(pcc.this.kj);
            if (pcc.this.mk != null) {
                pcc.this.mk.pcc(14);
            }
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(4);
            }
            com.bytedance.sdk.openadsdk.core.model.oo gto = pcc.this.kj.gto();
            if (gto == null || (pcc = gto.pcc()) == null) {
                return;
            }
            pcc.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, boolean z) {
            String unused = pcc.this.pcc;
            pcc.this.gm.removeCallbacks(pcc.this.fmh);
            pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.5
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.qf != null) {
                        pcc.this.qf.sf();
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void gm(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            String unused = pcc.this.pcc;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i, int i2) {
            String unused = pcc.this.pcc;
            vy.pcc().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.6
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.wh == null) {
                        return;
                    }
                    try {
                        final float oo = pcc.this.wh.oo();
                        final float vj = pcc.this.wh.vj();
                        if (oo == 0.0f || vj == 0.0f) {
                            return;
                        }
                        pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.6.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (pcc.this.ri()) {
                                    if (!lo.sf(pcc.this.kj) && pcc.this.of.wh != 4) {
                                        if (!lo.gm(pcc.this.kj)) {
                                            if (pcc.this.kj.bbd() != 3) {
                                                if (pcc.this.kj.bbd() == 0) {
                                                    pcc.this.gm(oo, vj);
                                                    return;
                                                } else {
                                                    pcc.this.sf(oo, vj);
                                                    return;
                                                }
                                            }
                                            pcc.this.pcc(true, oo, vj);
                                            return;
                                        }
                                        pcc.this.pcc(true, oo, vj);
                                        return;
                                    }
                                    pcc.this.pcc(true, oo, vj);
                                    return;
                                }
                                pcc.this.pcc(oo, vj);
                            }
                        });
                    } catch (Throwable th) {
                        com.bytedance.sdk.component.utils.lo.gm(pcc.this.pcc, th.getMessage());
                    }
                }
            });
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i, int i2, int i3) {
            String unused = pcc.this.pcc;
            pcc.this.yt = true;
            pcc.this.iv();
            pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.7
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.qf != null) {
                        pcc.this.qf.nac();
                    }
                }
            });
            vj.pcc(pcc.this.kj, 3);
            if (pcc.this.mk != null) {
                pcc.this.mk.pcc(4);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, int i) {
            String unused = pcc.this.pcc;
            pcc.this.yt = false;
            pcc.this.gm.removeCallbacks(pcc.this.fmh);
            pcc.this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.8
                @Override // java.lang.Runnable
                public void run() {
                    if (pcc.this.qf != null) {
                        pcc.this.qf.sf();
                    }
                }
            });
            vj.pcc(pcc.this.kj, 0);
            if (pcc.this.mk != null) {
                pcc.this.mk.pcc(5);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void pcc(final com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar, long j, long j2) {
            oo pcc;
            if (Math.abs(j - pcc.this.vy) < 50) {
                return;
            }
            pcc pccVar2 = pcc.this;
            pccVar2.pcc(pccVar2.kun);
            pcc.this.pcc(j, j2);
            pcc.this.sf(j, j2);
            com.bytedance.sdk.openadsdk.core.model.oo gto = pcc.this.kj.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                pcc.pcc(j, j2, pcc.this.mk);
            }
            if (!this.sf || j2 - j >= 500) {
                return;
            }
            this.sf = false;
            pcc.this.gm.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.1.9
                @Override // java.lang.Runnable
                public void run() {
                    AnonymousClass1.this.pcc(pccVar);
                }
            }, 1000L);
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void oo(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            oo pcc;
            com.bytedance.sdk.openadsdk.core.model.oo gto = pcc.this.kj.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                pcc.sf(pcc.this.vy);
            }
            vj.pcc(pcc.this.kj, 3);
            if (pcc.this.mk != null) {
                pcc.this.mk.pcc(0);
            }
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(2);
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc.InterfaceC0094pcc
        public void vj(com.bykv.vk.openvk.pcc.pcc.pcc.pcc pccVar) {
            vj.pcc(pcc.this.kj, 0);
            if (pcc.this.mk != null) {
                pcc.this.mk.pcc(1);
            }
            if (pcc.this.zsj != null) {
                pcc.this.zsj.pcc(1);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.core.jr.oo.gm.sf
        public void pcc(int i, int i2) {
            pcc.this.rj();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rj() {
        sf(this.kun);
        this.of.vj = this.wh.fum();
        ye();
        this.lo.set(false);
        this.ri.set(false);
        pcc(this.kun);
    }

    public void mu() {
        this.tsx.pcc((com.bykv.vk.openvk.pcc.pcc.pcc.pcc) null, 0, 0);
    }

    protected void pcc(boolean z, float f, float f2) {
        try {
            new StringBuilder("landingPageChangeVideoSize start.......").append(this.kj.gqd());
            if (!hpk() || z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) f, (int) f2);
                layoutParams.addRule(13);
                if (rnn() != null) {
                    if (rnn() instanceof TextureView) {
                        ((TextureView) rnn()).setLayoutParams(layoutParams);
                    } else if (rnn() instanceof SurfaceView) {
                        ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                    }
                    ViewGroup.LayoutParams layoutParams2 = this.qy.getLayoutParams();
                    if (this.qy.getHeight() > 0) {
                        float min = Math.min(this.qy.getWidth() / f, this.qy.getHeight() / f2);
                        if (layoutParams2 != null) {
                            layoutParams.width = (int) (f * min);
                            layoutParams.height = (int) (f2 * min);
                            if (rnn() instanceof TextureView) {
                                ((TextureView) rnn()).setLayoutParams(layoutParams);
                            } else if (rnn() instanceof SurfaceView) {
                                ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                            }
                            if (this.of.wh == 4) {
                                layoutParams2.width = layoutParams.width;
                                layoutParams2.height = layoutParams.height;
                                this.qy.setLayoutParams(layoutParams2);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc(this.pcc, "changeSize error", th);
        }
    }

    public pcc(Context context, ViewGroup viewGroup, of ofVar, qf qfVar) {
        super(context, ofVar, viewGroup);
        this.rj = 0L;
        this.lrr = 0L;
        this.iv = false;
        this.nn = 0L;
        this.rnn = false;
        this.ri = new AtomicBoolean(false);
        this.tsx = new AnonymousClass1();
        this.fmh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.3
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.tsz != null) {
                    pcc.this.dax();
                    pcc.this.tsz.pcc();
                }
            }
        };
        this.kun = qfVar;
        this.xb = ofVar.kot();
        if (ofVar.ixc() && this.qy != null) {
            if (this.mk == null) {
                this.mk = wh.pcc();
            }
            this.mk.pcc(this.qy, ofVar);
        }
        this.qf = new com.bytedance.sdk.openadsdk.core.jr.sf.vj(context.getApplicationContext(), new com.bytedance.sdk.openadsdk.jr.oo(context), true, 17, this.kj, this);
        this.qf.pcc(this);
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.pcc.pcc, com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        int bm;
        super.pcc(gmVar);
        if (this.wh != null) {
            return false;
        }
        gmVar.dax();
        if (TextUtils.isEmpty(gmVar.dax())) {
            return false;
        }
        gmVar.sf(com.bytedance.sdk.openadsdk.yt.vj.pcc("player_force_raw_url", 0) == 1);
        sf(gmVar);
        gmVar.oo(1);
        this.rnn = !gmVar.dax().startsWith(ProxyConfig.MATCH_HTTP);
        if (this.mk != null) {
            if (this.of.wh == 1) {
                bm = this.kj.quq();
            } else {
                bm = this.kj.bm();
            }
            if (this.qy != null) {
                try {
                    int tqg = this.kj.tqg();
                    if (tqg != 7 && tqg != 8) {
                        if (tqg == 3) {
                            Iterator<View> it = lrr.pcc(this.qy, 2).iterator();
                            while (it.hasNext()) {
                                this.mk.pcc(it.next(), FriendlyObstructionPurpose.OTHER);
                            }
                        }
                    }
                    View pcc = lrr.pcc(this.qy, (Class<? extends View>) kj.class);
                    if (pcc != null) {
                        View findViewById = pcc.findViewById(nac.gbb);
                        View findViewById2 = pcc.findViewById(nac.wke);
                        View findViewById3 = pcc.findViewById(nac.jk);
                        this.mk.pcc(findViewById2, FriendlyObstructionPurpose.OTHER);
                        this.mk.pcc(findViewById, FriendlyObstructionPurpose.OTHER);
                        this.mk.pcc(findViewById3, FriendlyObstructionPurpose.OTHER);
                        if (this.hpk) {
                            View pcc2 = lrr.pcc(this.qy, (Class<? extends View>) com.bytedance.sdk.openadsdk.core.hc.sf.wh.pcc.class);
                            if (pcc2 instanceof com.bytedance.sdk.openadsdk.core.hc.sf.wh.pcc) {
                                this.mk.pcc(((com.bytedance.sdk.openadsdk.core.hc.sf.wh.pcc) pcc2).getMarkView(), FriendlyObstructionPurpose.OTHER);
                            }
                        }
                    }
                    Iterator<View> it2 = lrr.pcc(this.qy, 1).iterator();
                    while (it2.hasNext()) {
                        this.mk.pcc(it2.next(), FriendlyObstructionPurpose.OTHER);
                    }
                } catch (Throwable unused) {
                }
            }
            this.mk.pcc(bm > 0, bm / 1000.0f);
        }
        ye();
        if (gmVar.ork() > 0) {
            this.vy = gmVar.ork();
            this.ork = Math.max(this.ork, this.vy);
        }
        if (this.vy == this.pq) {
            this.vy = 0L;
        }
        if (this.qf != null) {
            this.qf.pcc();
            this.qf.qf();
            this.qf.gm(gmVar.kj(), gmVar.vy());
            this.qf.gm(this.qy);
        }
        this.wh = new gm();
        this.wh.pcc(this.tsx);
        lu();
        this.lrr = 0L;
        lrr();
        return true;
    }

    private void lrr() {
        this.wh.gm(lq());
        this.wh.pcc(this.of);
        this.rj = System.currentTimeMillis();
        this.qf.gm(8);
        this.qf.gm(0);
        pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.wh == null) {
                    return;
                }
                pcc.this.rj = System.currentTimeMillis();
                pcc.this.qf.oo(0);
                pcc.this.wh.pcc(true, pcc.this.vy, pcc.this.dax);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void iv() {
        int fmh;
        int i = this.of.wh;
        if (i == 2 || i == 1) {
            fmh = lu.oo().fmh() * 1000;
        } else {
            fmh = i == 4 ? lu.oo().ork(String.valueOf(this.xb)) : 5000;
        }
        this.gm.removeCallbacks(this.fmh);
        this.gm.postDelayed(this.fmh, fmh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xb() {
        if (this.qf == null) {
            return;
        }
        this.gm.removeCallbacks(this.fmh);
        this.qf.sf();
        this.lrr = System.currentTimeMillis() - this.rj;
        if (!this.iv) {
            this.iv = true;
            sf(this.pq, this.pq);
            long j = this.pq;
            this.vy = j;
            this.ork = j;
            sf(this.kun);
        }
        if (this.tsz != null) {
            this.tsz.pcc(this.lrr, com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(this.vy, this.pq));
        }
        this.gbb = true;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void gm() {
        oo pcc;
        if (this.qf != null) {
            this.qf.pcc();
            this.qf.jr();
            this.qf.lu();
        }
        new Object[]{"resumeVideo:  mIsSurfaceValid = ", Boolean.valueOf(this.hc)};
        if (this.wh != null) {
            if (this.wh.qf()) {
                if (this.hc) {
                    if (ork.lo()) {
                        this.wh.sf(3);
                        this.wh.pcc(false, this.wh.lu(), this.dax);
                    } else {
                        lo();
                    }
                } else {
                    sf(this.mu);
                }
                new Object[]{"resumeVideo: isPaused = true , mIsSurfaceValid = ", Boolean.valueOf(this.hc)};
            } else {
                this.wh.pcc(false, this.vy, this.dax);
            }
        }
        if (this.iv || !this.lo.get()) {
            return;
        }
        mk();
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.kj.gto();
        if (gto == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.gm(wh());
    }

    public void nn() {
        oo pcc;
        if (this.iv || !this.lo.get()) {
            return;
        }
        mk();
        com.bytedance.sdk.openadsdk.core.model.oo gto = this.kj.gto();
        if (gto == null || (pcc = gto.pcc()) == null) {
            return;
        }
        pcc.gm(wh());
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void oo() {
        if (this.wh == null) {
            return;
        }
        this.wh.tmg();
        this.wh = null;
        if (this.qf != null) {
            this.qf.vy();
        }
        this.gm.removeCallbacks(this.fmh);
        this.gm.removeCallbacksAndMessages(null);
        if (this.mk != null) {
            this.mk.oo();
        }
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.kj, this.ye.get(), this.rj);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(boolean z, int i) {
        oo();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void vj() {
        oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ri() {
        return this.kj.zx() == 100.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void pcc(float f, float f2) {
        try {
            if (rnn() != null && this.wh != null && this.qy != null) {
                float width = this.qy.getWidth();
                float f3 = f / (width * 1.0f);
                float height = this.qy.getHeight();
                if (f3 <= f2 / (1.0f * height)) {
                    width = f * (height / f2);
                } else {
                    height = f2 * (width / f);
                }
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) width, (int) height);
                layoutParams.addRule(13);
                if (rnn() instanceof TextureView) {
                    ((TextureView) rnn()).setLayoutParams(layoutParams);
                } else if (rnn() instanceof SurfaceView) {
                    ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc(this.pcc, "changeVideoSizeSupportInteraction error", th);
        }
    }

    private boolean hpk() {
        return rnn() == null || this.wh == null || (!com.bytedance.sdk.openadsdk.core.hc.vj.pcc(this.kj.rt()) ? this.kj.kx() != null : this.kj.uae() != null) || this.kj.pv() == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(float f, float f2) {
        try {
            new StringBuilder("changeVideoSize start.......slot=").append(this.kj.gqd());
            if (hpk()) {
                return;
            }
            int[] sf = rj.sf(lu.pcc());
            boolean z = false;
            boolean z2 = this.kj.ial() == 1;
            float f3 = sf[0];
            float f4 = sf[1];
            if (z2) {
                if (f > f2) {
                    pcc(f3, f4, f, f2, true);
                    return;
                }
            } else if (f < f2) {
                pcc(f3, f4, f, f2, false);
                return;
            }
            float f5 = f / f2;
            float f6 = f3 / f4;
            if (z2) {
                if (f6 < 0.5625f && f5 == 0.5625f) {
                    f = (9.0f * f4) / 16.0f;
                    z = true;
                    f2 = f4;
                }
            } else if (f6 > 1.7777778f && f5 == 1.7777778f) {
                f2 = (9.0f * f3) / 16.0f;
                z = true;
                f = f3;
            }
            if (z) {
                f3 = f;
                f4 = f2;
            }
            int i = (int) f3;
            int i2 = (int) f4;
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.addRule(13);
            if (rnn() != null) {
                if (rnn() instanceof TextureView) {
                    ((TextureView) rnn()).setLayoutParams(layoutParams);
                } else if (rnn() instanceof SurfaceView) {
                    ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.qy.getLayoutParams();
                if (layoutParams2 != null) {
                    layoutParams2.height = i2;
                    layoutParams2.width = i;
                    this.qy.setLayoutParams(layoutParams2);
                }
            }
        } catch (Throwable th) {
            com.bytedance.sdk.component.utils.lo.pcc(this.pcc, "changeSize error", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gm(float f, float f2) {
        try {
            if (rnn() != null && this.wh != null) {
                boolean z = this.kj.ial() == 1;
                int[] sf = rj.sf(lu.pcc());
                pcc(sf[0], sf[1], f, f2, z);
            }
        } catch (Throwable unused) {
        }
    }

    private void pcc(float f, float f2, float f3, float f4, boolean z) {
        RelativeLayout.LayoutParams layoutParams;
        if (f3 <= 0.0f || f4 <= 0.0f) {
            try {
                f3 = this.kj.kez().gm();
                f4 = this.kj.kez().sf();
            } catch (Throwable unused) {
                return;
            }
        }
        if (f4 > 0.0f && f3 > 0.0f) {
            if (z) {
                if (f3 < f4) {
                    return;
                }
                layoutParams = new RelativeLayout.LayoutParams((int) f, (int) ((f4 * f) / f3));
            } else if (f3 > f4) {
                return;
            } else {
                layoutParams = new RelativeLayout.LayoutParams((int) ((f3 * f2) / f4), (int) f2);
            }
            layoutParams.addRule(13);
            if (rnn() != null) {
                if (rnn() instanceof TextureView) {
                    ((TextureView) rnn()).setLayoutParams(layoutParams);
                } else if (rnn() instanceof SurfaceView) {
                    ((SurfaceView) rnn()).setLayoutParams(layoutParams);
                }
                ViewGroup.LayoutParams layoutParams2 = this.qy.getLayoutParams();
                if (!com.bytedance.sdk.component.adexpress.oo.sf.pcc(lu.pcc()) || this.qy.getHeight() <= 0 || layoutParams2 == null) {
                    return;
                }
                layoutParams2.width = layoutParams.width;
                layoutParams2.height = layoutParams.height;
                this.qy.setLayoutParams(layoutParams2);
            }
        }
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
            gm();
            if (this.qf != null) {
                this.qf.sf(false, false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(final long j, final long j2) {
        this.kj.oo(j);
        this.vy = j;
        this.pq = j2;
        final int pcc = com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(j, j2);
        this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.oo.pcc.4
            @Override // java.lang.Runnable
            public void run() {
                pcc.this.qf.pcc(j, j2);
                pcc.this.qf.pcc(pcc);
                try {
                    if (pcc.this.tsz != null) {
                        pcc.this.tsz.pcc(j, j2);
                    }
                } catch (Throwable th) {
                    com.bytedance.sdk.component.utils.lo.pcc(pcc.this.pcc, "onProgressUpdate error: ", th);
                }
            }
        });
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.wh.sf rnn() {
        if (this.qf != null) {
            return this.qf.hc();
        }
        return null;
    }

    public void tsx() {
        if (this.mk != null) {
            this.mk.pcc(2);
        }
    }

    public void kun() {
        if (this.mk != null) {
            this.mk.pcc(13);
        }
    }

    public void pcc(InterfaceC0164pcc interfaceC0164pcc) {
        this.zsj = interfaceC0164pcc;
    }

    public void wh(boolean z) {
        this.hpk = z;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc() {
        if (this.wh != null) {
            rj();
            this.wh.vy();
        }
    }
}
