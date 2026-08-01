package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.jr.oo.pcc;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.fum;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oo.vj.sf.jr;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.io.File;
import java.util.HashSet;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class nac {
    private pcc.InterfaceC0164pcc atb;
    private boolean gbb;
    boolean gm;
    private long gpj;
    private boolean hc;
    private boolean jr;
    private final of kj;
    private String lo;
    private long lu;
    private final sf of;
    final boolean oo;
    private final String ork;
    private final Activity qf;
    private long tmg;
    private boolean tz;
    private long vh;
    private FrameLayout vy;
    com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm wh;
    private com.bytedance.sdk.openadsdk.oo.qf ye;
    private boolean yt;
    protected boolean pcc = false;
    boolean sf = false;
    protected boolean vj = false;
    private long dax = -1;
    private int nac = -1;
    private boolean qy = false;
    private int jsj = 0;
    private float tsz = 1.0f;
    private boolean mk = false;
    private volatile boolean lq = false;
    private HashSet<String> fum = new HashSet<>();

    public long pcc() {
        return this.dax;
    }

    public void pcc(long j) {
        this.dax = j;
    }

    public long sf() {
        return this.lu;
    }

    public boolean gm() {
        return this.qy;
    }

    public boolean oo() {
        int i;
        return this.mk ? this.qy && this.jsj == 1 : this.qy && ((i = this.jsj) == 2 || i == 1);
    }

    public com.bytedance.sdk.openadsdk.oo.qf vj() {
        return this.ye;
    }

    public nac(sf sfVar) {
        this.of = sfVar;
        this.qf = sfVar.rnn;
        this.kj = sfVar.sf;
        this.oo = sfVar.oo;
        this.ork = sfVar.vj;
    }

    public void pcc(FrameLayout frameLayout, com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        if (this.tz) {
            return;
        }
        this.tz = true;
        this.vy = frameLayout;
        if (this.kj.uk() != null) {
            this.jsj = this.kj.uk().sf();
            this.tsz = this.kj.uk().pcc();
        }
        this.ye = qfVar;
        if (of.vj(this.kj)) {
            this.mk = true;
            this.wh = new com.bytedance.sdk.openadsdk.core.jr.oo.pcc(this.qf, this.vy, this.kj, qfVar);
            oo(this.yt);
            pcc.InterfaceC0164pcc interfaceC0164pcc = this.atb;
            if (interfaceC0164pcc != null) {
                ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).pcc(interfaceC0164pcc);
            }
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).wh(this.jr);
            return;
        }
        this.mk = false;
        com.bytedance.sdk.openadsdk.component.reward.oo ooVar = new com.bytedance.sdk.openadsdk.component.reward.oo(this.kj, qfVar);
        this.wh = ooVar;
        pcc.InterfaceC0164pcc interfaceC0164pcc2 = this.atb;
        if (interfaceC0164pcc2 != null) {
            ooVar.pcc(interfaceC0164pcc2);
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.oo.qf qfVar) {
        this.ye = qfVar;
    }

    public boolean wh() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        return (gmVar == null || gmVar.vh() == null || !this.wh.vh().wh()) ? false : true;
    }

    public boolean qf() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        return gmVar != null && gmVar.hc();
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.sf.pcc kj() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return null;
        }
        if (gmVar instanceof com.bytedance.sdk.openadsdk.component.reward.oo) {
            return ((com.bytedance.sdk.openadsdk.component.reward.oo) gmVar).nac();
        }
        return gmVar.tmg();
    }

    public boolean vy() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        return (gmVar == null || gmVar.vh() == null || !this.wh.vh().qf()) ? false : true;
    }

    public boolean ork() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        return gmVar != null && gmVar.gbb();
    }

    public void pcc(long j, long j2) {
        this.tmg = j;
        if (this.lq && (rnn() || wh() || j > 0)) {
            vh();
        }
        sf(j, j2);
    }

    public void vh() {
        this.lq = false;
        if (this.of.rj != null) {
            this.of.rj.removeMessages(300);
        }
    }

    private void sf(long j, long j2) {
        int abs = (int) Math.abs(this.nac - j);
        int i = this.nac;
        if (i < 0 || abs > 500 || i > j2 || abs >= 500 || this.fum.contains(this.lo)) {
            return;
        }
        if (this.nac > j) {
            com.bytedance.sdk.openadsdk.core.jr.gm().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.nac.1
                @Override // java.lang.Runnable
                public void run() {
                    nac.this.nn();
                    nac.this.of.yt.pcc(nac.this.nac, nac.this.lo);
                }
            }, abs);
        } else {
            nn();
            this.of.yt.pcc(this.nac, this.lo);
        }
        this.fum.add(this.lo);
    }

    public void pcc(int i, String str) {
        this.nac = i;
        this.lo = str;
    }

    public boolean tmg() {
        return this.pcc;
    }

    public long hc() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.wh();
        }
        return this.vh;
    }

    public long gbb() {
        return this.tmg;
    }

    public long jr() {
        return this.vh;
    }

    public void sf(long j) {
        this.vh = j;
    }

    public void pcc(boolean z) {
        this.pcc = z;
    }

    public void dax() {
        try {
            if (wh()) {
                this.wh.sf();
            }
        } catch (Throwable th) {
            lo.gm("RewardFullVideoPlayerManager onPause throw Exception :" + th.getMessage(), new Object[0]);
        }
    }

    public void pcc(int i, int i2) {
        if (this.wh != null) {
            jr.pcc pccVar = new jr.pcc();
            pccVar.gm(nac());
            pccVar.oo(jsj());
            pccVar.sf(hc());
            pccVar.pcc(i);
            pccVar.sf(i2);
            com.bytedance.sdk.openadsdk.oo.vj.pcc.pcc.oo(this.wh.tmg(), pccVar);
        }
    }

    public long nac() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.qf();
        }
        return 0L;
    }

    public com.bykv.vk.openvk.pcc.pcc.pcc.pcc lu() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.vh();
        }
        return null;
    }

    private void fmh() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar == null || gmVar.vh() == null) {
            return;
        }
        this.vh = this.wh.wh();
        if (this.wh.vh().gm() || !this.wh.vh().sf()) {
            this.wh.sf();
            this.wh.oo();
            this.pcc = true;
        }
    }

    public void gpj() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar == null) {
            return;
        }
        gmVar.oo();
        this.wh = null;
    }

    public void lo() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.vj();
        }
    }

    public void fum() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.gm();
        }
    }

    public void sf(boolean z) {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.sf();
            this.gbb = z;
        }
    }

    public void tz() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.sf();
        }
    }

    public void pcc(gm.pcc pccVar) {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(pccVar);
        }
    }

    public void pcc(boolean z, String str) {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc(z, str);
        }
    }

    public long of() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.vy();
        }
        return 0L;
    }

    public int yt() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.ork();
        }
        return 0;
    }

    public int qy() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.kj();
        }
        return 0;
    }

    public long jsj() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.vy() + this.wh.qf();
        }
        return 0L;
    }

    public void pcc(String str, boolean z) {
        if (this.wh != null) {
            long hc = hc();
            if (this.kj.gd()) {
                hc = this.of.wh();
            }
            long j = hc;
            JSONObject pcc = kun.pcc(this.kj, this.wh.qf(), this.wh.vh());
            try {
                pcc.put("auto_click", z);
                if (!z) {
                    com.bytedance.sdk.openadsdk.oo.gm.pcc(pcc, this.of.oo ? this.of.sf.quq() : this.of.sf.bm(), (int) j);
                }
            } catch (Exception unused) {
            }
            com.bytedance.sdk.openadsdk.oo.gm.pcc(this.kj, this.ork, str, j, yt(), pcc, this.ye);
            jsj();
            yt();
        }
        lrr();
    }

    public long tsz() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            return gmVar.vy();
        }
        return 0L;
    }

    public boolean mk() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            if (gmVar.vh() != null) {
                com.bykv.vk.openvk.pcc.pcc.pcc.pcc vh = this.wh.vh();
                if (vh.qf() || vh.kj()) {
                    com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar2 = this.wh;
                    if (gmVar2 instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
                        ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar2).nn();
                    }
                    return true;
                }
            } else if (tmg()) {
                pcc(false);
                com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar3 = this.wh;
                if (gmVar3 instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
                    ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar3).nn();
                }
                return true;
            }
        }
        return false;
    }

    public boolean atb() {
        return this.wh != null;
    }

    public boolean ye() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        return gmVar != null && gmVar.vh() == null;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean pcc(long j, boolean z, Map<String, Object> map, com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        boolean z2;
        boolean z3 = false;
        if (!atb()) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc(this.of.sf, "show_ad_fail", this.of.vj, "video_controller_not_ready");
            return false;
        }
        if (com.bytedance.sdk.openadsdk.core.model.lo.oo(this.of.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(this.of.sf)) {
            return true;
        }
        if (!z || !ye()) {
            pcc(sfVar);
        }
        try {
            z2 = pcc(j, this.of.xb);
        } catch (Exception e) {
            e = e;
        }
        try {
            this.hc = false;
        } catch (Exception e2) {
            e = e2;
            z3 = z2;
            Log.e("TTAD.RFVideoPlayerMag", "playVideo: ", e);
            z2 = z3;
            if (!z2) {
            }
            if (!z2) {
            }
            return z2;
        }
        if (!z2 && !z) {
            this.of.jsj.pcc(map);
        } else if (!z2) {
            com.bytedance.sdk.openadsdk.oo.ork.pcc(this.of.sf, "show_ad_fail", this.of.vj, "video_play_fail");
        }
        return z2;
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.sf.sf sfVar) {
        if (this.of.vy.get() || !this.of.ri || atb.gm(this.of.sf)) {
            return;
        }
        boolean vj = of.vj(this.of.sf);
        boolean oo = this.of.yt.oo();
        int gbb = com.bytedance.sdk.openadsdk.core.lu.oo().gbb(String.valueOf(this.of.wh));
        if ((!vj && gbb == 1 && oo) || com.bytedance.sdk.openadsdk.core.model.lo.oo(this.of.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(this.of.sf) || this.vj || !sfVar.vj()) {
            return;
        }
        this.of.fum.vh();
        Message obtain = Message.obtain();
        obtain.what = 300;
        this.of.rj.sendMessageDelayed(obtain, 5000L);
        this.lq = true;
    }

    public boolean lq() {
        return this.lq;
    }

    public void zti() {
        int i = this.jsj;
        if (i == 1 || i == 2) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("switch", 0);
                pcc(jSONObject);
            } catch (Throwable th) {
                lo.pcc("TTAD.RFVideoPlayerMag", "onStopPlaySpeed: ", th);
            }
        }
    }

    public boolean pcc(JSONObject jSONObject) {
        int i;
        if (this.wh == null || jSONObject == null || ((i = this.jsj) != 1 && i != 2)) {
            this.qy = false;
            return false;
        }
        int optInt = jSONObject.optInt("switch", 0);
        float optDouble = (float) jSONObject.optDouble("speed", 0.0d);
        this.tsz = optDouble;
        if (optDouble <= 0.0f && this.of.sf.uk() != null) {
            this.tsz = this.of.sf.uk().pcc();
        }
        if (optInt == 0) {
            this.tsz = 1.0f;
            if (this.qy) {
                long currentTimeMillis = this.lu + (System.currentTimeMillis() - this.gpj);
                this.lu = currentTimeMillis;
                com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
                if (gmVar != null) {
                    gmVar.pcc(currentTimeMillis);
                }
                if (this.of.tsx != null) {
                    this.of.tsx.oo(false);
                }
            }
        } else if (optInt == 1 && !this.qy) {
            this.gpj = System.currentTimeMillis();
            if (this.of.tsx != null) {
                this.of.tsx.oo(true);
            }
        }
        this.qy = optInt == 1;
        if (this.jsj == 1) {
            return true;
        }
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar2 = this.wh;
        if (gmVar2 == null) {
            return false;
        }
        return gmVar2.pcc(this.tsz);
    }

    private boolean pcc(long j, boolean z) {
        if (this.wh == null || this.kj.kez() == null) {
            return false;
        }
        String pcc = CacheDirFactory.getICacheDir(this.kj.we()).pcc();
        File file = new File(pcc, this.kj.kez().gbb());
        if (file.exists() && file.length() > 0) {
            this.sf = true;
        }
        com.bytedance.sdk.openadsdk.core.jr.pcc.sf pcc2 = of.pcc(pcc, this.kj);
        pcc2.sf(this.kj.esn());
        pcc2.sf(this.vy.getWidth());
        pcc2.gm(this.vy.getHeight());
        pcc2.gm(this.kj.hl());
        pcc2.pcc(j);
        pcc2.pcc(z);
        return this.wh.pcc(pcc2);
    }

    public void gm(boolean z) {
        this.gm = z;
    }

    public boolean pq() {
        return this.gm;
    }

    public void mu() {
        this.qy = false;
        gpj();
    }

    public void nn() {
        try {
            if (wh()) {
                this.vj = true;
                tz();
            }
        } catch (Exception e) {
            lo.gm("TTAD.RFVideoPlayerMag", "onPause throw Exception :" + e.getMessage());
        }
    }

    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        try {
            this.vj = false;
            if (tmg()) {
                fmh();
                sf(sfVar);
            } else if (vy()) {
                fum();
            }
        } catch (Throwable th) {
            lo.gm("TTAD.RFVideoPlayerMag", "onContinue throw Exception :" + th.getMessage());
        }
    }

    public void pcc(boolean z, com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, boolean z2) {
        if (this.gbb || !(!z2 || z || this.vj)) {
            if (vy()) {
                fum();
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: continue play");
            } else {
                fmh();
                sf(sfVar);
                Log.i("TTAD.RFVideoPlayerMag", "resumeOrRestartVideo: recreate video player & exec play");
            }
            this.gbb = false;
        }
    }

    public boolean rnn() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar == null || gmVar.vh() == null) {
            return false;
        }
        return this.wh.vh().pcc();
    }

    protected void sf(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar) {
        if (!mk() || sfVar == null) {
            return;
        }
        sfVar.pcc(jr(), true);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double tsx() {
        double wh;
        long oo;
        fum yt = this.kj.yt();
        if (com.bytedance.sdk.openadsdk.core.model.lo.oo(this.kj) && yt != null) {
            oo = yt.sf();
        } else if (com.bytedance.sdk.openadsdk.core.model.lo.kj(this.kj) && yt != null) {
            oo = yt.oo();
        } else {
            com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = this.kj.kez();
            wh = kez != null ? kez.wh() * kez.tz() : 0.0d;
            if (this.of.ra != null) {
                this.of.ra.pcc((long) wh);
            }
            return wh;
        }
        wh = oo;
        if (this.of.ra != null) {
        }
        return wh;
    }

    public void kun() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar).mu();
        }
    }

    public View rj() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            return (View) ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar).rnn();
        }
        return null;
    }

    public void lrr() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar).tsx();
        }
    }

    public void iv() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar).kun();
        }
    }

    public void oo(boolean z) {
        this.yt = z;
        if (this.wh instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            if (z) {
                ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).sf(this.kj.kez().tz());
            } else {
                this.kj.kez().ork(1);
                ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) this.wh).sf(1);
            }
        }
    }

    public void pcc(pcc.InterfaceC0164pcc interfaceC0164pcc) {
        this.atb = interfaceC0164pcc;
    }

    public void xb() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar != null) {
            gmVar.pcc();
        }
    }

    public void ri() {
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar == null || gmVar.vh() == null) {
            return;
        }
        this.vh = this.wh.wh();
        lo();
        pcc(true);
        this.hc = true;
    }

    public boolean hpk() {
        return this.hc;
    }

    public void vj(boolean z) {
        this.jr = z;
        com.bykv.vk.openvk.pcc.pcc.pcc.oo.gm gmVar = this.wh;
        if (gmVar instanceof com.bytedance.sdk.openadsdk.core.jr.oo.pcc) {
            ((com.bytedance.sdk.openadsdk.core.jr.oo.pcc) gmVar).wh(z);
        }
    }
}
