package com.bytedance.sdk.openadsdk.core.jr.pcc;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bykv.vk.openvk.pcc.pcc.pcc.wh.oo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.gbb.wh;
import com.bytedance.sdk.openadsdk.core.jr.sf.vj;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.lo;
import com.bytedance.sdk.openadsdk.oo.qf;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class pcc implements gm, tsz.pcc, com.bytedance.sdk.openadsdk.core.jr.sf.pcc {
    protected boolean atb;
    protected boolean dax;
    protected boolean fum;
    protected WeakReference<gm.sf> jsj;
    protected final of kj;
    protected long lq;
    protected wh mk;
    private long nn;
    protected sf of;
    protected SurfaceHolder oo;
    protected long pq;
    protected vj qf;
    protected final ViewGroup qy;
    protected gm.pcc tsz;
    protected final Context vh;
    protected SurfaceTexture vj;
    protected com.bytedance.sdk.openadsdk.core.jr.oo.gm wh;
    protected boolean yt;
    protected String pcc = "TTAD.VideoController";
    protected final int sf = 100;
    protected final tsz gm = new tsz(Looper.getMainLooper(), this);
    protected long vy = 0;
    protected long ork = 0;
    protected final List<Runnable> tmg = new ArrayList();
    protected boolean hc = false;
    protected boolean gbb = false;
    protected boolean jr = true;
    protected boolean nac = false;
    protected boolean lu = false;
    protected boolean gpj = false;
    protected AtomicBoolean lo = new AtomicBoolean(false);
    protected boolean tz = true;
    protected AtomicInteger ye = new AtomicInteger(0);
    protected boolean zti = false;
    protected Runnable mu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc.1
        @Override // java.lang.Runnable
        public void run() {
            new Object[]{"resumeVideo: run ", Boolean.valueOf(pcc.this.hc)};
            pcc.this.lo();
        }
    };
    private long rnn = 0;
    private boolean tsx = true;
    private int kun = 1;
    private final AtomicBoolean rj = new AtomicBoolean(false);

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean jr() {
        return true;
    }

    @Override // com.bytedance.sdk.component.utils.tsz.pcc
    public void pcc(Message message) {
    }

    public void pcc(gm.oo ooVar) {
    }

    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view, boolean z) {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        return false;
    }

    public long nac() {
        return this.lq;
    }

    public pcc(Context context, of ofVar, ViewGroup viewGroup) {
        this.kj = ofVar;
        this.vh = context;
        this.qy = viewGroup;
        this.pcc += hashCode();
    }

    protected void lu() {
        if (this.wh == null) {
            return;
        }
        if (dax()) {
            SurfaceTexture surfaceTexture = this.vj;
            if (surfaceTexture == null || surfaceTexture == this.wh.lo()) {
                return;
            }
            this.wh.pcc(this.vj);
            return;
        }
        SurfaceHolder surfaceHolder = this.oo;
        if (surfaceHolder == null || surfaceHolder == this.wh.gpj()) {
            return;
        }
        this.wh.pcc(this.oo);
    }

    private boolean dax() {
        vj vjVar = this.qf;
        if (vjVar != null) {
            return vjVar.hc() instanceof oo;
        }
        return false;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public long wh() {
        return this.vy;
    }

    public void sf(long j) {
        this.vy = j;
        this.ork = Math.max(this.ork, j);
    }

    protected void pcc(Runnable runnable) {
        if (this.qf.tz() && this.hc) {
            runnable.run();
        } else {
            sf(runnable);
        }
    }

    protected void sf(Runnable runnable) {
        this.tmg.add(runnable);
    }

    protected void gpj() {
        if (this.tmg.isEmpty()) {
            return;
        }
        Iterator it = new ArrayList(this.tmg).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.tmg.clear();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, SurfaceHolder surfaceHolder) {
        this.hc = true;
        this.oo = surfaceHolder;
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return;
        }
        gmVar.pcc(surfaceHolder);
        gpj();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, SurfaceHolder surfaceHolder) {
        this.hc = false;
        this.oo = null;
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(false);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, SurfaceTexture surfaceTexture) {
        this.hc = true;
        this.vj = surfaceTexture;
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(surfaceTexture);
            this.wh.pcc(this.hc);
        }
        gpj();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, SurfaceTexture surfaceTexture) {
        this.hc = false;
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(false);
        }
        this.vj = null;
        gpj();
    }

    protected void lo() {
        this.gm.postAtFrontOfQueue(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc.2
            @Override // java.lang.Runnable
            public void run() {
                if (pcc.this.wh != null) {
                    new Object[]{"resumeVideo: execResumePlay", Boolean.valueOf(pcc.this.hc)};
                    pcc.this.wh.ork();
                }
            }
        });
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public com.bykv.vk.openvk.pcc.pcc.pcc.pcc vh() {
        return this.wh;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    /* renamed from: fum, reason: merged with bridge method [inline-methods] */
    public final vj tmg() {
        return this.qf;
    }

    public boolean tz() {
        return this.jr;
    }

    public void pcc(boolean z) {
        this.jr = z;
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.oo(z);
        }
    }

    public void gm(long j) {
        this.rnn = j;
    }

    public boolean of() {
        return this.nac;
    }

    public void oo(long j) {
        this.pq = j;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final long qf() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return 0L;
        }
        return gmVar.jr();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final int kj() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return 0;
        }
        return gmVar.dax();
    }

    public boolean yt() {
        return this.dax;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final void pcc(final boolean z, String str) {
        this.dax = z;
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.sf(z);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.qf, z, str);
        }
        if (this.mk != null) {
            if (com.bykv.vk.openvk.pcc.pcc.sf.sf.pcc.pcc()) {
                this.mk.pcc(z);
            } else {
                this.gm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc.3
                    @Override // java.lang.Runnable
                    public void run() {
                        pcc.this.mk.pcc(z);
                    }
                });
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final long vy() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return 0L;
        }
        return gmVar.nac();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean hc() {
        return this.gbb;
    }

    public final void sf(boolean z) {
        this.gbb = z;
    }

    protected void gm(boolean z) {
        this.gpj = z;
    }

    public boolean qy() {
        return this.tsx;
    }

    public final void oo(boolean z) {
        this.tsx = z;
    }

    public void sf(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        sf sfVar = (sf) gmVar;
        this.of = sfVar;
        this.dax = sfVar.vh();
        gmVar.oo(String.valueOf(this.kj.kot()));
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final boolean gbb() {
        return this.yt;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final int ork() {
        return com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(this.ork, this.pq);
    }

    public void vj(boolean z) {
        this.tz = z;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void sf(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view) {
        sf(sfVar, view, false, false);
    }

    public final void sf(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view, boolean z, boolean z2) {
        gm(!this.gpj);
        Context context = this.vh;
        if (context != null && (context instanceof Activity)) {
            if (this.gpj) {
                pcc(z ? 8 : 0);
                vj vjVar = this.qf;
                if (vjVar != null) {
                    vjVar.pcc(this.qy);
                    this.qf.gm(false);
                }
            } else {
                pcc(1);
                vj vjVar2 = this.qf;
                if (vjVar2 != null) {
                    vjVar2.sf(this.qy);
                    this.qf.gm(false);
                }
            }
            WeakReference<gm.sf> weakReference = this.jsj;
            gm.sf sfVar2 = weakReference != null ? weakReference.get() : null;
            if (sfVar2 != null) {
                sfVar2.pcc(this.gpj);
            }
        }
    }

    public final void pcc(gm.sf sfVar) {
        this.jsj = new WeakReference<>(sfVar);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void vj(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view) {
        pcc(sfVar, view, false);
    }

    public final boolean jsj() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        return gmVar == null || gmVar.sf();
    }

    public final boolean tsz() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        return gmVar != null && gmVar.wh();
    }

    public final void pcc(int i) {
        Context context = this.vh;
        if (context == null) {
            return;
        }
        boolean z = i == 0 || i == 8;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            try {
                activity.setRequestedOrientation(i);
            } catch (Throwable unused) {
            }
            if (!z) {
                activity.getWindow().setFlags(1024, 1024);
            } else {
                activity.getWindow().clearFlags(1024);
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void gm(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view) {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.vy();
        }
        pcc(true, 3);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view, boolean z, boolean z2) {
        if (this.jr) {
            sf();
        }
        if (z && !this.jr && !jsj()) {
            this.qf.sf(!tsz(), false);
            this.qf.pcc(z2, true, false);
        }
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null && gmVar.wh()) {
            this.qf.wh();
            this.qf.vj();
        } else {
            this.qf.wh();
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void oo(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, View view) {
        if (this.gpj) {
            gm(false);
            vj vjVar = this.qf;
            if (vjVar != null) {
                vjVar.sf(this.qy);
            }
            pcc(1);
            return;
        }
        pcc(true, 3);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, int i, boolean z) {
        if (this.vh == null) {
            return;
        }
        long j = (long) (((i * r0) * 1.0f) / 100.0f);
        if (this.pq > 0) {
            this.nn = (int) j;
        } else {
            this.nn = 0L;
        }
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc(this.nn);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, int i) {
        if (this.wh == null) {
            return;
        }
        pcc(this.nn, gm(i));
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.pcc
    public final void sf(com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf sfVar, int i) {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.wh();
        }
    }

    private void pcc(long j, boolean z) {
        if (this.wh == null) {
            return;
        }
        if (z) {
            mu();
        }
        this.wh.pcc(j);
    }

    private boolean gm(int i) {
        return this.qf.sf(i);
    }

    private void mu() {
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.oo(0);
            this.qf.pcc(false, false);
            this.qf.gm(false);
            this.qf.vj();
            this.qf.qf();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void pcc(qf qfVar) {
        boolean z = false;
        if (this.lo.compareAndSet(false, true)) {
            this.zti = true;
            wh whVar = this.mk;
            if (whVar != null) {
                whVar.pcc(vy(), yt());
            }
            jr.pcc pccVar = new jr.pcc();
            pccVar.pcc(qy());
            pccVar.oo(vy());
            com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
            if (gmVar != null && gmVar.gbb()) {
                z = true;
            }
            pccVar.sf(z);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(lu.pcc(), this.qf, pccVar, qfVar);
        }
    }

    protected final void mk() {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy() / lq());
        pccVar.gm(qf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(tmg(), pccVar);
    }

    protected final void atb() {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy() / lq());
        pccVar.gm(qf());
        pccVar.pcc(nac());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.qf, pccVar);
    }

    protected final void sf(qf qfVar) {
        this.zti = true;
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy() / lq());
        pccVar.gm(qf());
        pccVar.oo(kj());
        pccVar.pcc(nac());
        pccVar.gm(this.atb);
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(this.qf, pccVar, qfVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.pcc pccVar) {
        this.zti = true;
        jr.pcc pccVar2 = new jr.pcc();
        pccVar2.gm(qf());
        pccVar2.oo(vy() / lq());
        pccVar2.sf(wh());
        pccVar2.pcc(pccVar);
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.gm(tmg(), pccVar2);
    }

    protected final void ye() {
        this.zti = true;
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.kj, this.qf, this.of);
    }

    public int lq() {
        return this.kun;
    }

    public void sf(int i) {
        this.kun = i;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final void pcc(gm.pcc pccVar) {
        this.tsz = pccVar;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.jr.pcc.pcc$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] pcc;

        static {
            int[] iArr = new int[lo.pcc.values().length];
            pcc = iArr;
            try {
                iArr[lo.pcc.PAUSE_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                pcc[lo.pcc.RELEASE_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                pcc[lo.pcc.START_VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.jr.sf.pcc
    public final void pcc(lo.pcc pccVar, String str) {
        int i = AnonymousClass4.pcc[pccVar.ordinal()];
        if (i == 1) {
            sf();
            return;
        }
        if (i == 2) {
            oo();
        } else {
            if (i != 3) {
                return;
            }
            gm();
            this.nac = false;
            this.lu = true;
        }
    }

    public final long zti() {
        return wh() + qf();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public final void sf() {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.vh();
        }
        if (this.fum || !this.lo.get()) {
            return;
        }
        atb();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(long j) {
        this.lq = j;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean pcc(float f) {
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.pcc(f);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void pq() {
        com.bytedance.sdk.openadsdk.oo.pcc.sf.pcc(com.bytedance.sdk.openadsdk.qy.pcc.pcc(this.kj.pzh(), true, this.kj), 5, this.kj.esn());
    }

    public final void vj(long j) {
        this.vy = j;
        this.ork = Math.max(this.ork, j);
        vj vjVar = this.qf;
        if (vjVar != null) {
            vjVar.pcc();
        }
        com.bytedance.sdk.openadsdk.core.jr.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(true, this.vy, this.dax);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void pcc(long j, long j2) {
        if (!this.rj.get() && com.bytedance.sdk.openadsdk.wh.pcc.pcc().gm() && (j * 1.0d) / j2 > 0.3d) {
            this.rj.set(true);
            if (this.kj != null) {
                com.bytedance.sdk.openadsdk.wh.sf.pcc().pcc("videoPercent30", this.kj);
            }
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(SurfaceTexture surfaceTexture) {
        this.atb = true;
        this.ye.incrementAndGet();
    }
}
