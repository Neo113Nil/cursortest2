package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.os.Handler;
import android.os.Message;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.tz.pcc.pcc;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;

/* loaded from: classes4.dex */
public class kj extends ork implements Handler.Callback {
    private boolean fum;
    int gm;
    private int jsj;
    private final Handler lo;
    private int of;
    int oo;
    boolean pcc;
    protected int qf;
    private int qy;
    long sf;
    private boolean tsz;
    private int tz;
    int vj;
    boolean wh;
    private boolean yt;

    public kj(sf sfVar) {
        super(sfVar);
        this.lo = new Handler(this);
        this.pcc = false;
        this.sf = 0L;
        this.gm = 0;
        this.oo = 0;
        this.vj = 0;
        this.wh = false;
        this.fum = false;
        this.tz = 0;
        this.yt = false;
        this.qy = 0;
        this.jsj = 0;
        this.tsz = false;
        this.qf = atb.vy(this.ork);
        this.oo = this.ork.jk();
        int ys = this.ork.ys();
        this.vj = ys;
        this.qy = Math.max(0, this.oo - ys);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc() {
        if (this.gbb && !this.hc) {
            super.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    protected void pcc(boolean z) {
        if (this.nac != null) {
            try {
                this.lu = com.bytedance.sdk.openadsdk.tz.pcc.oo.pcc().pcc(this.ork, this.nac, sf());
                this.lu.pcc(this.tmg.tsx);
            } catch (Throwable th) {
                lo.gm("RVIVPlayableNewManager", "PreRender injection exception" + th.getMessage());
            }
            if (this.lu == null) {
                super.pcc(z);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    protected com.bytedance.sdk.openadsdk.hc.qf sf() {
        return new com.bytedance.sdk.openadsdk.hc.qf() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.kj.1
            @Override // com.bytedance.sdk.openadsdk.hc.qf
            public void pcc() {
                kj.this.nac();
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void gm() {
        if (this.gbb) {
            this.kj = true;
            boolean dax = dax();
            if (dax) {
                this.lu.pcc(new pcc.InterfaceC0205pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.kj.2
                    @Override // com.bytedance.sdk.openadsdk.tz.pcc.pcc.InterfaceC0205pcc
                    public void pcc(int i) {
                        if (kj.this.tsz) {
                            return;
                        }
                        kj.this.tz = i;
                        kj.this.lu.pcc((pcc.InterfaceC0205pcc) null);
                        kj.this.sf(i);
                    }
                });
            }
            this.lu.pcc();
            if (atb.kj(this.ork)) {
                this.tmg.ye.wh();
            }
            this.sf = System.currentTimeMillis();
            if (!dax) {
                sf(0);
            }
            this.tmg.tsx.kz();
            if (this.tmg.ra != null) {
                this.tmg.ra.pcc(this.oo);
            }
        }
    }

    private boolean dax() {
        if (this.tmg.gdh) {
            return false;
        }
        int i = this.qf;
        return 1 == i || 2 == i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sf(int i) {
        pcc(this.vj);
        if (this.fum) {
            return;
        }
        Handler handler = this.lo;
        handler.sendMessage(handler.obtainMessage(DescriptorProtos.Edition.EDITION_LEGACY_VALUE, this.vj, i));
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void oo() {
        if (this.gbb) {
            super.oo();
            if (DeviceUtils.qf() == 0) {
                this.tmg.xb = true;
            }
            if (this.tmg.xb) {
                this.tmg.zti.sf(true);
                gm(true);
            }
            if ((this.tmg.ew == null || this.tmg.ew.tmg == null || !this.tmg.ew.tmg.isShowing()) && vh() && qf() > 0) {
                pcc(0L);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void vj() {
        if (this.gbb) {
            super.vj();
            vy();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void wh() {
        if (this.gbb && !this.dax) {
            super.wh();
            this.lo.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public int qf() {
        return this.gm;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public int kj() {
        return this.of;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc(int i) {
        this.gm = i;
        this.of = i;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void vy() {
        if (this.gbb) {
            this.fum = true;
            this.lo.removeMessages(DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
            this.lo.removeMessages(600);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public void pcc(long j) {
        if (this.gbb && this.kj && !this.tmg.ork.get() && this.fum) {
            this.fum = false;
            Message obtain = Message.obtain();
            obtain.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
            obtain.arg1 = qf();
            obtain.arg2 = this.tz;
            this.lo.sendMessageDelayed(obtain, j);
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (message.what != 900 || !lu()) {
            return true;
        }
        int i = message.arg1;
        boolean z = false;
        if (this.yt) {
            int i2 = this.vj;
            int i3 = this.jsj;
            int i4 = i2 + i3;
            int i5 = this.oo;
            if (i4 < i5) {
                this.jsj = i3 + 1;
                Message obtain = Message.obtain();
                obtain.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
                obtain.arg1 = 0;
                this.lo.sendMessageDelayed(obtain, 1000L);
            } else {
                this.jsj = i5 - i2;
            }
        } else if (i > 0) {
            if (this.tz == 0 && 2 == this.qf) {
                z = true;
            }
            this.tmg.zti.oo(true);
            if (!z) {
                this.tmg.zti.pcc(String.valueOf(i), null);
            }
            Message obtain2 = Message.obtain();
            obtain2.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
            int i6 = i - 1;
            obtain2.arg1 = i6;
            this.lo.sendMessageDelayed(obtain2, 1000L);
            this.gm = i6;
            this.of = i;
        } else {
            this.wh = true;
            if (atb.kj(this.ork) && (!atb.lo(this.ork) || !this.lu.vj())) {
                this.tmg.zti.gm();
                this.tmg.zti.vj(true);
            } else {
                this.tmg.zti.oo(false);
                this.tmg.dax.set(true);
                this.tmg.ew.hc();
            }
            if (this.lu == null || this.lu.vj()) {
                this.jr = true;
            }
            if (this.qy > 0) {
                this.yt = true;
                this.jsj++;
                Message obtain3 = Message.obtain();
                obtain3.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
                obtain3.arg1 = 0;
                this.lo.sendMessageDelayed(obtain3, 1000L);
            }
            this.of = 0;
        }
        nac();
        return true;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.ork
    public boolean ork() {
        return this.wh;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nac() {
        int i;
        if (!this.yt) {
            i = this.vj - this.gm;
        } else {
            i = this.vj + this.jsj;
        }
        int i2 = com.bytedance.sdk.openadsdk.core.lu.oo().tsz(String.valueOf(this.tmg.wh)).wh;
        int i3 = this.oo;
        boolean z = false;
        boolean z2 = i3 <= 0 || (((float) i) / ((float) i3)) * 100.0f >= ((float) i2);
        int pcc = com.bytedance.sdk.openadsdk.core.lu.oo().pcc(String.valueOf(this.tmg.wh));
        if (pcc == 0) {
            boolean wh = this.lu != null ? this.lu.wh() : false;
            if (this.jr) {
                wh = true;
            }
            if (z2 && wh) {
                z = true;
            }
        } else if (pcc == 1) {
            z = z2;
        }
        if (z) {
            this.tmg.tsx.sf(true);
        }
    }

    private boolean lu() {
        return this.kj && atb.gm(this.tmg.sf) && !this.gpj.get();
    }
}
