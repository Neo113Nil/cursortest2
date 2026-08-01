package com.bytedance.sdk.openadsdk.component.kj;

import android.content.Context;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.gm.pcc;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;

/* loaded from: classes4.dex */
public class gm implements pcc.InterfaceC0150pcc {
    private of gm;
    private sf oo;
    private Context pcc;
    private FrameLayout sf;
    private boolean vj = false;

    public gm(Context context) {
        this.pcc = context.getApplicationContext();
    }

    public void pcc(FrameLayout frameLayout, of ofVar) {
        this.sf = frameLayout;
        this.gm = ofVar;
        this.oo = new sf(this.pcc, this.sf, this.gm);
    }

    public boolean pcc() {
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc = of.pcc(CacheDirFactory.getICacheDir(0).sf(), this.gm);
        pcc.sf(this.gm.esn());
        pcc.sf(this.sf.getWidth());
        pcc.gm(this.sf.getHeight());
        pcc.gm(this.gm.hl());
        pcc.pcc(0L);
        pcc.pcc(true);
        return this.oo.pcc(pcc);
    }

    public sf sf() {
        return this.oo;
    }

    public void pcc(boolean z) {
        this.vj = z;
    }

    public boolean gm() {
        return this.vj;
    }

    public boolean oo() {
        sf sfVar = this.oo;
        return (sfVar == null || sfVar.vh() == null || !this.oo.vh().sf()) ? false : true;
    }

    public boolean vj() {
        sf sfVar = this.oo;
        return (sfVar == null || sfVar.vh() == null || !this.oo.vh().wh()) ? false : true;
    }

    public boolean wh() {
        sf sfVar = this.oo;
        return (sfVar == null || sfVar.vh() == null || !this.oo.vh().qf()) ? false : true;
    }

    public boolean qf() {
        sf sfVar = this.oo;
        return sfVar != null && sfVar.gbb();
    }

    public void pcc(gm.pcc pccVar) {
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.pcc(pccVar);
        }
    }

    public boolean pcc(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.component.pcc pccVar, of ofVar) {
        pcc(frameLayout, ofVar);
        pcc(pccVar);
        try {
            boolean pcc = pcc();
            if (!pcc) {
                of ofVar2 = this.gm;
                ork.pcc(ofVar2, "show_ad_fail", ofVar2.vj(), "video_play_fail");
            }
            return pcc;
        } catch (Throwable th) {
            lo.gm("TTAppOpenVideoManager", "open_ad", "ttAppOpenAd playVideo error: " + th.getMessage());
            return false;
        }
    }

    public boolean pcc(float f) {
        try {
            sf sfVar = this.oo;
            if (sfVar != null) {
                return sfVar.pcc(f);
            }
            return false;
        } catch (Throwable th) {
            lo.gm("TTAppOpenVideoManager", "open_ad", "setPlaybackSpeed error: " + th.getMessage());
            return false;
        }
    }

    public void kj() {
        try {
            if (vj()) {
                this.oo.sf();
            }
        } catch (Throwable th) {
            lo.gm("TTAppOpenVideoManager", "open_ad", "AppOpenVideoManager onPause throw Exception :" + th.getMessage());
        }
    }

    public void vy() {
        try {
            if (wh()) {
                vh();
            }
        } catch (Throwable th) {
            lo.gm("TTAppOpenVideoManager", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void ork() {
        sf sfVar = this.oo;
        if (sfVar == null) {
            return;
        }
        sfVar.oo();
        this.oo = null;
    }

    public void vh() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.gm();
        }
    }

    public void tmg() {
        sf sfVar = this.oo;
        if (sfVar == null) {
            return;
        }
        this.pcc = null;
        sfVar.oo();
        this.oo = null;
    }

    public long hc() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            return sfVar.wh();
        }
        return 0L;
    }

    public long gbb() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            return sfVar.qf();
        }
        return 0L;
    }

    public long jr() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            return sfVar.vy() + this.oo.qf();
        }
        return 0L;
    }

    public void pcc(int i) {
        if (this.oo != null) {
            jr.pcc pccVar = new jr.pcc();
            pccVar.sf(hc());
            pccVar.oo(jr());
            pccVar.gm(gbb());
            pccVar.gm(i);
            pccVar.oo(this.oo.kj());
            pccVar.pcc(this.oo.nac());
            this.oo.pcc(pccVar);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.gm.pcc.InterfaceC0150pcc
    public long getVideoProgress() {
        return hc();
    }

    public void dax() {
        sf sfVar = this.oo;
        if (sfVar != null) {
            sfVar.kun();
        }
    }
}
