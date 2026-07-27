package com.bytedance.sdk.openadsdk.core.hc.wh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.media3.extractor.ts.TsExtractor;
import com.bytedance.adsdk.ugeno.core.jr;
import com.bytedance.adsdk.ugeno.core.vh;
import com.bytedance.adsdk.ugeno.oo.wh;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.core.model.dax;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.model.zti;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class qf extends oo {
    private float atb;
    private com.bytedance.adsdk.ugeno.sf.gm jsj;
    private float lq;
    private com.bytedance.sdk.openadsdk.core.widget.vj mk;
    private float pq;
    private com.bytedance.adsdk.ugeno.sf.gm qy;
    private com.bytedance.adsdk.ugeno.sf.gm tsz;
    private boolean ye;
    private boolean zti;

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setSoundMute(boolean z) {
    }

    public qf(Context context, of ofVar, boolean z, pcc pccVar, ViewGroup viewGroup) {
        super(context, ofVar, z, pccVar, viewGroup);
        this.ye = false;
        this.zti = true;
        if (TextUtils.equals(this.tz, "fullscreen_interstitial_ad")) {
            this.atb = this.vj.bm();
        } else if (TextUtils.equals(this.tz, "rewarded_video")) {
            this.atb = this.vj.quq();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    protected JSONObject pcc() {
        JSONObject gm = this.wh.gm();
        if (gm != null) {
            return gm.optJSONObject("xTemplate");
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    protected JSONObject sf() {
        return this.wh.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public void pcc(com.bytedance.sdk.openadsdk.core.widget.vj vjVar) {
        this.mk = vjVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.adsdk.ugeno.core.jr
    public void pcc(com.bytedance.adsdk.ugeno.sf.gm gmVar, String str, wh.pcc pccVar) {
        char c;
        if (this.kj == null || pccVar == null) {
            return;
        }
        String sf = pccVar.sf();
        sf.hashCode();
        int i = 7;
        int i2 = -1;
        switch (sf.hashCode()) {
            case -1882810668:
                if (sf.equals("sendLogExtra")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1439599355:
                if (sf.equals("sendAdExtra")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -511324706:
                if (sf.equals("openPrivacy")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -55818203:
                if (sf.equals("pauseVideo")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 3532159:
                if (sf.equals("skip")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 72484600:
                if (sf.equals("openPlayable")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 804386914:
                if (sf.equals("videoControl")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 951590323:
                if (sf.equals("convert")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1151744482:
                if (sf.equals("muteVideo")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case 1528469391:
                if (sf.equals("openLinks")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case 1603466254:
                if (sf.equals("speedVideoOrTimer")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 1671642405:
                if (sf.equals("dislike")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                new kj().pcc("sendLogExtra", this.vj, this.tz, pccVar.gm());
                return;
            case 1:
                new kj().pcc("sendAdExtra", this.vj, this.tz, pccVar.gm());
                return;
            case 2:
                break;
            case 3:
            case 6:
                i = 4;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                if (this.vy != null) {
                    this.vy.sf((JSONObject) null);
                    return;
                }
                return;
            case 7:
                i = 2;
                break;
            case '\b':
                i = 5;
                break;
            case '\t':
                new wh().pcc(pcc(gmVar.vh()), this.sf instanceof Activity, this.vj, this.tz, pccVar.gm(), this.mk);
                return;
            case '\n':
                lo.sf("UGenRender", "onUGenEvent: " + pccVar.gm());
                i = 13;
                if (pccVar.gm() != null && !pccVar.gm().isEmpty()) {
                    try {
                        i2 = Integer.parseInt(String.valueOf(pccVar.gm().get("switch")));
                        break;
                    } catch (Throwable th) {
                        lo.gm("UGenRender", th);
                        break;
                    }
                }
                break;
            case 11:
                i = 3;
                break;
            default:
                i = 0;
                break;
        }
        String mu = gmVar.mu();
        if (!TextUtils.isEmpty(mu) && "VideoV3".equals(mu)) {
            mu = "Video";
        }
        this.kj.pcc(gmVar.vh(), i, new dax.pcc().oo(this.gbb).gm(this.jr).sf(this.dax).pcc(this.nac).sf(this.lu).pcc(this.gpj).gm(i2).pcc(this.of).pcc(true).pcc(mu).sf(false).pcc());
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    protected int oo() {
        if (this.wh.mu()) {
            lo.pcc("UGenRender", "renderWidget: only update data");
            return gbb();
        }
        return vy();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064 A[Catch: all -> 0x0078, NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, TRY_LEAVE, TryCatch #2 {NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, all -> 0x0078, blocks: (B:21:0x0025, B:24:0x002e, B:7:0x004c, B:9:0x0050, B:10:0x0060, B:12:0x0064, B:6:0x003c), top: B:20:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050 A[Catch: all -> 0x0078, NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, TryCatch #2 {NoClassDefFoundError -> 0x007b, UnsatisfiedLinkError -> 0x007e, all -> 0x0078, blocks: (B:21:0x0025, B:24:0x002e, B:7:0x004c, B:9:0x0050, B:10:0x0060, B:12:0x0064, B:6:0x003c), top: B:20:0x0025 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected int vy() {
        hc();
        this.pcc.pcc((jr) this);
        this.pcc.pcc((com.bytedance.adsdk.ugeno.core.dax) this);
        if (dax()) {
            this.pcc.pcc(new gm());
        }
        zti uae = this.vj.uae();
        if (uae == null) {
            try {
                if (!com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh.pcc(this.tz)) {
                    this.gm = this.pcc.pcc(this.oo, this.yt, (JSONObject) null);
                    if (this.gm != null) {
                        jr();
                        this.tsz = this.gm.wh("ProgressBar");
                        tmg();
                    }
                    if (!(this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
                        return 0;
                    }
                    this.wh.pq().sf();
                    this.wh.pq().gm();
                    return 0;
                }
            } catch (NoClassDefFoundError unused) {
                return 140;
            } catch (UnsatisfiedLinkError unused2) {
                return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
            } catch (Throwable unused3) {
                return 141;
            }
        }
        this.gm = this.pcc.pcc(this.oo, this.yt, pcc(uae));
        if (this.gm != null) {
        }
        if (!(this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh)) {
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public com.bytedance.adsdk.ugeno.sf.gm qf() {
        if (this.gm == null) {
            return null;
        }
        return this.gm.wh("Playable");
    }

    private void tmg() {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.qy;
        if (gmVar != null) {
            gmVar.gm(8);
        }
        com.bytedance.adsdk.ugeno.sf.gm gmVar2 = this.jsj;
        if (gmVar2 != null) {
            gmVar2.gm(8);
        }
    }

    private void hc() {
        vh vhVar = new vh();
        HashMap hashMap = new HashMap();
        hashMap.put("image_info", this.wh.vh());
        hashMap.put("cache_dir", this.wh.gbb());
        vhVar.pcc(hashMap);
        vhVar.pcc(this.sf);
        vhVar.pcc(this.oo);
        vhVar.sf(this.yt);
        this.pcc.pcc("ad", vhVar);
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    protected com.bytedance.adsdk.ugeno.sf.gm kj() {
        if (this.gm == null) {
            return null;
        }
        return this.gm.wh("VideoV3");
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo, com.bytedance.sdk.component.adexpress.dynamic.oo
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        if (this.gm == null) {
            return;
        }
        boolean z2 = i == 1;
        if (TextUtils.equals(this.tz, "open_ad") && this.pcc != null) {
            this.pcc.pcc(this.gm, "countdown", charSequence);
        }
        sf(charSequence, z2, i2, z);
        pcc(charSequence, z2, i2, z);
        gm(charSequence, z2, i2, z);
    }

    private void pcc(CharSequence charSequence, boolean z, int i, boolean z2) {
        int i2;
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.qy;
        if (gmVar != null && (gmVar instanceof com.bytedance.sdk.openadsdk.core.hc.sf.sf)) {
            try {
                i2 = Integer.parseInt((String) charSequence);
            } catch (Exception unused) {
                lo.gm("UGenRender", "parse duration exception", charSequence);
                i2 = 0;
            }
            com.bytedance.sdk.openadsdk.core.hc.sf.sf sfVar = (com.bytedance.sdk.openadsdk.core.hc.sf.sf) this.qy;
            if (z2 || i2 <= 0 || this.ye || pcc(sfVar)) {
                this.qy.gm(8);
                return;
            }
            this.qy.gm(0);
            if (!z && this.wh.pcc() && com.bytedance.sdk.component.adexpress.oo.wh.sf(this.wh.oo())) {
                ((com.bytedance.sdk.openadsdk.core.hc.sf.sf) this.qy).gbb(String.valueOf(i));
            } else if (!"open_ad".equals(this.wh.oo()) && this.wh.pcc()) {
                this.ye = true;
                this.qy.gm(8);
            } else {
                ((com.bytedance.sdk.openadsdk.core.hc.sf.sf) this.qy).gbb(String.valueOf(charSequence));
            }
        }
    }

    private void sf(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.tsz;
        if (gmVar != null && (gmVar instanceof com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm)) {
            try {
                int parseInt = Integer.parseInt((String) charSequence);
                if (this.zti) {
                    this.lq = i;
                    this.zti = false;
                }
                this.pq = (float) (this.pq + ((0.5d / this.lq) * 100.0d));
                this.pcc.pcc(this.gm, "ProgressBar://progress", Float.valueOf(this.pq), Float.valueOf(this.atb));
                if (!z2 && parseInt > 0 && !z) {
                    ((com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm) this.tsz).qf(500);
                    ((com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm) this.tsz).pcc((int) this.pq);
                    return;
                }
                ((com.bytedance.sdk.openadsdk.core.hc.sf.oo.gm) this.tsz).gm(8);
            } catch (Throwable th) {
                lo.gm("UGenRender", th.getMessage());
            }
        }
    }

    private void gm(CharSequence charSequence, boolean z, int i, boolean z2) {
        com.bytedance.adsdk.ugeno.sf.gm gmVar = this.jsj;
        if (gmVar != null && (gmVar instanceof com.bytedance.sdk.openadsdk.core.hc.sf.wh)) {
            int i2 = 0;
            if (!z && !z2) {
                i2 = 8;
            }
            gmVar.gm(i2);
        }
    }

    private Context pcc(View view) {
        Activity pcc = view != null ? com.bytedance.sdk.component.utils.sf.pcc(view) : null;
        return pcc == null ? this.sf : pcc;
    }

    public void ork() {
        if (this.pcc != null) {
            this.pcc.pcc(this.gm, "videoFail", new Object[0]);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.hc.wh.oo
    public void pcc(long j, long j2) {
        super.pcc(j, j2);
        if (this.pcc != null) {
            this.pcc.pcc(this.gm, "videoProgress", Long.valueOf(j), Long.valueOf(j2));
        }
    }

    public void vh() {
        if (this.pcc != null) {
            this.pcc.pcc(this.gm, "show", new Object[0]);
        }
    }

    private int gbb() {
        hc();
        try {
            this.pcc.pcc(this.yt, this.gm);
            if (this.gm != null) {
                jr();
                tmg();
            }
            if (this instanceof com.bytedance.sdk.openadsdk.core.hc.wh.pcc.wh) {
                return 0;
            }
            this.wh.pq().sf();
            this.wh.pq().gm();
            return 0;
        } catch (NoClassDefFoundError unused) {
            return 140;
        } catch (UnsatisfiedLinkError unused2) {
            return TsExtractor.TS_STREAM_TYPE_DTS_UHD;
        } catch (Throwable unused3) {
            return 141;
        }
    }

    private void jr() {
        if (this.gm == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> wh = this.gm.wh("RVCountdown");
        this.qy = wh;
        if (wh == null) {
            this.qy = this.gm.wh("FVCountdown");
        }
        if (this.qy == null) {
            this.qy = this.gm.wh("AOCountdown");
        }
        com.bytedance.adsdk.ugeno.sf.gm<View> wh2 = this.gm.wh("RVSkipView");
        this.jsj = wh2;
        if (wh2 == null) {
            this.jsj = this.gm.wh("FVSkipView");
        }
        if (this.jsj == null) {
            this.jsj = this.gm.wh("AOSkipView");
        }
    }

    private boolean dax() {
        return this.vj != null && this.vj.vd() == 1;
    }

    private boolean pcc(com.bytedance.sdk.openadsdk.core.hc.sf.sf sfVar) {
        if (sfVar == null) {
            return true;
        }
        if (TextUtils.equals(this.tz, "open_ad")) {
            return sfVar.oo() == 8 || sfVar.oo() == 4;
        }
        return false;
    }

    public JSONObject pcc(zti ztiVar) {
        if (ztiVar != null) {
            return ztiVar.vj();
        }
        return null;
    }
}
