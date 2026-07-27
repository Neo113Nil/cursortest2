package com.bytedance.sdk.openadsdk.component.reward;

import android.graphics.SurfaceTexture;
import android.os.CountDownTimer;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;

/* loaded from: classes4.dex */
public class oo implements com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm {
    private final com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc gm;
    private pcc.InterfaceC0164pcc kj;
    private final pcc pcc;
    private long qf;
    private final of sf;
    private boolean oo = true;
    private long vj = 0;
    private boolean wh = false;

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean gbb() {
        return false;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean jr() {
        return false;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public int kj() {
        return 0;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(SurfaceTexture surfaceTexture) {
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean pcc(float f) {
        return false;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public long qf() {
        return 0L;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public com.bykv.vk.openvk.pcc.pcc.pcc.oo.sf tmg() {
        return null;
    }

    public oo(of ofVar, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar = new com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.oo.1
        };
        this.gm = pccVar;
        this.sf = ofVar;
        com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = ofVar.kez();
        long j = 10;
        long wh = kez != null ? (long) kez.wh() : 10L;
        if (wh <= 0) {
            kez.pcc(10.0d);
        } else {
            j = wh;
        }
        this.pcc = new pcc(j * 1000, pccVar, qfVar);
    }

    public long dax() {
        return this.qf;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(long j) {
        this.qf = j;
        pcc pccVar = this.pcc;
        if (pccVar != null) {
            pccVar.pcc(j);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void sf() {
        this.pcc.tmg();
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy());
        pccVar.gm(qf());
        pccVar.pcc(dax());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.gm, pccVar);
        pcc.InterfaceC0164pcc interfaceC0164pcc = this.kj;
        if (interfaceC0164pcc != null) {
            interfaceC0164pcc.pcc(2);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void gm() {
        this.pcc.vh();
        jr.pcc pccVar = new jr.pcc();
        pccVar.sf(wh());
        pccVar.oo(vy());
        pccVar.gm(qf());
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(this.gm, pccVar);
        pcc.InterfaceC0164pcc interfaceC0164pcc = this.kj;
        if (interfaceC0164pcc != null) {
            interfaceC0164pcc.pcc(1);
        }
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void oo() {
        this.pcc.hc();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(boolean z, int i) {
        oo();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void vj() {
        oo();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean pcc(com.bykv.vk.openvk.pcc.pcc.pcc.gm.gm gmVar) {
        this.wh = gmVar.vh();
        if (gmVar.ork() > 0) {
            this.pcc.sf(gmVar.ork());
        }
        gmVar.sf(com.bytedance.sdk.openadsdk.yt.vj.pcc("player_force_raw_url", 0) == 1);
        com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.pcc(this.sf, this.gm, gmVar);
        this.pcc.vh();
        pcc.InterfaceC0164pcc interfaceC0164pcc = this.kj;
        if (interfaceC0164pcc != null) {
            interfaceC0164pcc.pcc(1);
        }
        return true;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public long wh() {
        return this.pcc.nac();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public long vy() {
        return this.pcc.dax();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public int ork() {
        return com.bykv.vk.openvk.pcc.pcc.sf.oo.pcc.pcc(this.pcc.kj, this.pcc.pcc);
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public com.bykv.vk.openvk.pcc.pcc.pcc.pcc vh() {
        return this.pcc;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(boolean z, String str) {
        this.wh = z;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public boolean hc() {
        return this.pcc.sf();
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc(gm.pcc pccVar) {
        this.pcc.pcc(pccVar);
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc nac() {
        return this.gm;
    }

    public void pcc(pcc.InterfaceC0164pcc interfaceC0164pcc) {
        this.kj = interfaceC0164pcc;
    }

    @Override // com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm
    public void pcc() {
        this.pcc.ork();
    }

    private static class pcc implements com.bykv.vk.openvk.pcc.pcc.pcc.pcc {
        private final com.bytedance.sdk.openadsdk.oo.qf gm;
        private long kj;
        private long oo;
        private final long pcc;
        private gm.pcc qf;
        private final com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc sf;
        private int vj = 0;
        private long vy;
        private CountDownTimer wh;

        public long gbb() {
            return 0L;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public boolean gm() {
            return false;
        }

        public int jr() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public int oo() {
            return 0;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public boolean pcc() {
            return false;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public int vj() {
            return 0;
        }

        public pcc(long j, com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc pccVar, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
            this.pcc = j;
            this.sf = pccVar;
            this.gm = qfVar;
        }

        public long vy() {
            return this.vy;
        }

        public void pcc(long j) {
            this.vy = j;
        }

        public void ork() {
            this.kj = 0L;
            vh();
        }

        public void vh() {
            if (this.vj == 1) {
                return;
            }
            this.vj = 1;
            final long dax = dax();
            if (this.oo >= dax) {
                this.oo = 0L;
            }
            final long j = dax - this.oo;
            CountDownTimer countDownTimer = new CountDownTimer(j, 200L) { // from class: com.bytedance.sdk.openadsdk.component.reward.oo.pcc.1
                @Override // android.os.CountDownTimer
                public void onTick(long j2) {
                    long j3 = (j - j2) + pcc.this.oo;
                    pcc.this.kj = j3;
                    if (pcc.this.qf != null) {
                        pcc.this.qf.pcc(j3, dax);
                    }
                }

                @Override // android.os.CountDownTimer
                public void onFinish() {
                    if (pcc.this.qf != null) {
                        gm.pcc pccVar = pcc.this.qf;
                        long j2 = dax;
                        pccVar.pcc(j2, j2);
                    }
                    pcc.this.vj = 4;
                    pcc.this.kj = dax;
                    pcc.this.oo = dax;
                    if (pcc.this.qf != null) {
                        pcc.this.qf.pcc(pcc.this.nac(), 100);
                    }
                    jr.pcc pccVar2 = new jr.pcc();
                    pccVar2.sf(dax);
                    pccVar2.oo(dax);
                    pccVar2.gm(pcc.this.gbb());
                    pccVar2.oo(pcc.this.jr());
                    pccVar2.pcc(pcc.this.vy());
                    com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.sf(pcc.this.sf, pccVar2, pcc.this.gm);
                }
            };
            this.wh = countDownTimer;
            countDownTimer.start();
        }

        public void tmg() {
            this.vj = 2;
            this.oo = this.kj;
            CountDownTimer countDownTimer = this.wh;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.wh = null;
            }
        }

        public void hc() {
            this.vj = 0;
            CountDownTimer countDownTimer = this.wh;
            if (countDownTimer != null) {
                countDownTimer.cancel();
                this.wh = null;
            }
            if (this.qf != null) {
                this.qf = null;
            }
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public boolean sf() {
            return this.vj == 4;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public boolean wh() {
            return this.vj == 1;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public boolean qf() {
            return this.vj == 2;
        }

        @Override // com.bykv.vk.openvk.pcc.pcc.pcc.pcc
        public boolean kj() {
            return this.vj == 0;
        }

        public long dax() {
            return this.pcc;
        }

        public long nac() {
            return this.kj;
        }

        public void sf(long j) {
            this.oo = j;
        }

        public void pcc(gm.pcc pccVar) {
            this.qf = pccVar;
        }
    }
}
