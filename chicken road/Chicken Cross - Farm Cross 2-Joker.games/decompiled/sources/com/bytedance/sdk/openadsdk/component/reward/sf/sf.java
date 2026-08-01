package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.component.utils.tz;
import com.bytedance.sdk.component.vy.qf;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardVideoActivity;
import com.bytedance.sdk.openadsdk.activity.single.sf;
import com.bytedance.sdk.openadsdk.component.reward.pcc.vy;
import com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.atb;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.vh;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.oo.sf;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.nac;
import com.bytedance.sdk.openadsdk.utils.rj;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class sf extends pcc {
    private com.bytedance.sdk.openadsdk.hc.qf hc;
    public com.bytedance.sdk.openadsdk.core.widget.sf tmg;
    protected com.bytedance.sdk.openadsdk.core.gm.vj vh;

    protected boolean jsj() {
        return true;
    }

    public abstract boolean oo();

    public abstract void pcc(FrameLayout frameLayout);

    public void vh() {
    }

    public abstract boolean vj();

    public abstract void wh();

    public sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.pcc
    public void pcc(com.bytedance.sdk.openadsdk.core.jr.oo.sf sfVar, tsz tszVar) {
        super.pcc(sfVar, tszVar);
        if (this.pcc.sf.wh() && this.pcc.tmh) {
            this.pcc.ye.pcc(false);
        }
    }

    public void pcc(kj kjVar) {
        pcc(kjVar, this.pcc);
    }

    public RFEndCardBackUpLayout qf() {
        return new RFEndCardBackUpLayout(this.pcc.kun);
    }

    public View kj() {
        PAGLogoView createPAGLogoViewByMaterial;
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(this.pcc.rnn);
        gmVar.setId(nac.wke);
        com.bytedance.sdk.openadsdk.core.wh.oo sf = com.bytedance.sdk.openadsdk.core.widget.wh.sf(this.pcc.rnn);
        sf.setId(520093708);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.topMargin = rj.sf(this.pcc.rnn, 20.0f);
        layoutParams.rightMargin = rj.sf(this.pcc.rnn, 16.0f);
        sf.setLayoutParams(layoutParams);
        sf.setContentDescription(tz.pcc(this.pcc.rnn, "tt_ad_close_text"));
        sf.setVisibility(8);
        com.bytedance.sdk.openadsdk.core.wh.oo pcc = com.bytedance.sdk.openadsdk.core.widget.wh.pcc(this.pcc.rnn, gmVar);
        pcc.setId(nac.st);
        pcc.setContentDescription(tz.pcc(this.pcc.rnn, "tt_close_backup_button_text"));
        if (this.pcc.ywp == null || !this.pcc.ywp.rj().jsj()) {
            createPAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(this.pcc.rnn, this.pcc.sf);
            createPAGLogoViewByMaterial.setId(520093757);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, rj.sf(this.pcc.rnn, 14.0f));
            layoutParams2.gravity = 8388691;
            createPAGLogoViewByMaterial.setLayoutParams(layoutParams2);
        } else {
            createPAGLogoViewByMaterial = null;
        }
        com.bytedance.sdk.openadsdk.core.wh.oo ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(this.pcc.rnn);
        ooVar.setId(nac.jum);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(rj.sf(this.pcc.rnn, 32.0f), rj.sf(this.pcc.rnn, 14.0f));
        layoutParams3.gravity = 8388693;
        ooVar.setLayoutParams(layoutParams3);
        ooVar.setPadding(rj.sf(this.pcc.rnn, 9.0f), 0, rj.sf(this.pcc.rnn, 9.0f), 0);
        ooVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (createPAGLogoViewByMaterial != null) {
            gmVar.addView(createPAGLogoViewByMaterial);
        }
        gmVar.addView(ooVar);
        if (!this.pcc.sf.xb() || !this.pcc.gdh || this.pcc.pcc != 1) {
            com.bytedance.sdk.openadsdk.component.reward.top.gm gmVar2 = new com.bytedance.sdk.openadsdk.component.reward.top.gm(this.pcc.rnn);
            gmVar2.setId(nac.on);
            gmVar2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            gmVar.addView(gmVar2);
        }
        gmVar.addView(sf);
        return gmVar;
    }

    public View vy() {
        com.bytedance.sdk.openadsdk.core.wh.qf qfVar;
        if (this.sf.pv() != 5) {
            qfVar = new com.bytedance.sdk.openadsdk.core.wh.qf(this.pcc.rnn);
            qfVar.setId(nac.jk);
        } else {
            qfVar = null;
        }
        new StringBuilder("getLoadingFrameView").append(qfVar);
        return qfVar;
    }

    public void ork() {
        this.pcc.qy.pcc(this.pcc, this.pcc.oo);
        this.pcc.mu.sf();
        this.pcc.pq.pcc();
        if (!this.pcc.sf.on()) {
            this.pcc.ye.pcc();
            this.pcc.lq.pcc();
        }
        this.pcc.of.qf();
        this.pcc.zti.pcc();
        if (atb.wh(this.pcc.sf)) {
            this.pcc.mu.oo();
            rj.pcc((View) this.pcc.ye.kj(), 4);
        }
        if (lo.oo(this.pcc.sf) || lo.sf(this.pcc.sf) || lo.kj(this.pcc.sf)) {
            return;
        }
        this.pcc.mu.pcc(rj.sf(this.pcc.kun, this.pcc.erj), rj.sf(this.pcc.kun, this.pcc.se));
        this.pcc.tz.pcc();
        if (this.pcc.kz) {
            this.pcc.mu.pcc(0);
        }
    }

    public void pcc(boolean z, boolean z2, boolean z3, int i) {
        this.pcc.pq.pcc(z, z2, z3, this, i);
    }

    public void tmg() {
        com.bytedance.sdk.openadsdk.core.widget.sf sfVar = this.tmg;
        if (sfVar == null || !sfVar.isShowing()) {
            return;
        }
        this.tmg.dismiss();
    }

    public void hc() {
        if (this.pcc.qf()) {
            this.pcc.zti.vj();
            boolean z = false;
            if (!this.pcc.gdh || !(this.pcc.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.pcc)) {
                this.pcc.mu.wh(0);
            }
            boolean z2 = this.pcc.ye != null && this.pcc.ye.lo();
            if (atb.wh(this.pcc.sf) && !z2) {
                z = true;
            }
            if (this.pcc.gh != null) {
                if (this.pcc.gbb.get() || z) {
                    this.pcc.gh.oo();
                    this.pcc.gh.pcc(this.pcc, this.pcc.qf);
                }
            }
        }
    }

    public void gbb() {
        if (this.ork != null) {
            this.ork.removeMessages(300);
        }
    }

    public void jr() {
        if (this.pcc.ywp != null || ((!atb.sf(this.sf) && !atb.gm(this.sf)) || (atb.kj(this.sf) && this.pcc.ye.mk() && !this.pcc.ye.lq()))) {
            dax();
        }
        if (this.pcc == null) {
            return;
        }
        if (this.pcc.gh != null && !this.pcc.ork.get()) {
            this.pcc.gh.pcc();
        }
        this.pcc.oo();
    }

    protected void dax() {
        if (this.pcc.vy.get() && this.pcc.lu.getAndSet(false) && (this.pcc.qf >= 0 || this.pcc.qf == -1)) {
            Message obtain = Message.obtain();
            obtain.what = 700;
            obtain.arg1 = this.pcc.qf;
            this.pcc.rj.sendMessage(obtain);
        }
        if (this.pcc.kj <= 0 || !this.pcc.gpj.getAndSet(false)) {
            return;
        }
        Message obtain2 = Message.obtain();
        obtain2.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
        obtain2.arg1 = this.pcc.kj;
        this.pcc.rj.sendMessage(obtain2);
    }

    public void nac() {
        if (this.pcc == null) {
            return;
        }
        try {
            this.pcc.ri = false;
            boolean z = this.pcc.ri;
            boolean z2 = this.pcc.xb;
            if (!this.pcc.ork.get()) {
                this.pcc.fum.dax();
            }
            gbb();
            this.pcc.ye.dax();
            this.pcc.of.kj();
            this.pcc.gpj.set(true);
            if (this.pcc.vy.get()) {
                this.pcc.lu.set(true);
            }
            if (this.pcc.gh != null) {
                this.pcc.gh.sf();
            }
            this.pcc.vj();
        } catch (Throwable unused) {
        }
    }

    public void lu() {
        if (this.pcc == null) {
            return;
        }
        if (this.pcc.mu != null) {
            this.pcc.mu.nac();
        }
        boolean z = this.pcc.xb;
        this.pcc.atb.pcc();
        DeviceUtils.qf();
        this.pcc.ye.jr();
        if (this.pcc.xb) {
            this.pcc.rnn.runOnUiThread(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.sf.1
                @Override // java.lang.Runnable
                public void run() {
                    if (sf.this.pcc.atb.pcc() > 0) {
                        sf.this.pcc.atb.pcc(false);
                    }
                }
            });
        }
    }

    public void gpj() {
        sf(false);
    }

    public void sf(boolean z) {
        try {
            if (this.pcc.yt != null && !z) {
                this.pcc.yt.wh();
            }
            if (this.pcc.mu != null) {
                this.pcc.mu.jr();
            }
            this.pcc.fum.mu();
            if (!oo()) {
                this.pcc.vy.get();
            }
            if (this.pcc.ye != null) {
                this.pcc.ye.vh();
            }
            if (this.pcc.of != null) {
                this.pcc.of.gm(vy.pcc);
            }
            if (this.pcc.mu != null) {
                this.pcc.mu.hc();
            }
            if (this.pcc.pq != null) {
                this.pcc.pq.gm();
            }
            if (this.pcc.gh != null) {
                this.pcc.gh.gm();
            }
        } catch (Throwable unused) {
        }
    }

    public void lo() {
        if (!this.pcc.of.vh() && lu.oo().tz(String.valueOf(this.pcc.wh)) == 1) {
            int pcc = pcc(this.pcc);
            if (sf(this.pcc)) {
                gm(this.pcc);
            } else if (pcc(this.pcc, pcc)) {
                oo(this.pcc);
            }
        }
    }

    private int pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (atb.gm(sfVar.sf)) {
            return sfVar.sf.ys();
        }
        if (sfVar.oo) {
            return sfVar.sf.quq();
        }
        return sfVar.sf.bm();
    }

    private boolean sf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        return sfVar.mu != null && sfVar.mu.vy();
    }

    private void gm(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (sfVar.mu != null && sfVar.mu.ork() != null) {
            sfVar.mu.ork().performClick();
        } else {
            if (sfVar.mu == null || sfVar.mu.vh() == null) {
                return;
            }
            sfVar.mu.vh().performClick();
        }
    }

    private boolean pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, int i) {
        if (i == -1) {
            return false;
        }
        return (!sfVar.vy.get() || atb.gm(sfVar.sf)) && ((sfVar.fum != null && (sfVar.fum.gbb() > (((long) i) * 1000) ? 1 : (sfVar.fum.gbb() == (((long) i) * 1000) ? 0 : -1)) >= 0) || (sfVar.of != null && sfVar.of.oo()));
    }

    private void oo(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        if (sfVar.zti != null) {
            sfVar.zti.oo();
        }
    }

    public void fum() {
        this.pcc.zti.gm();
        this.pcc.zti.vj(true);
    }

    public void tz() {
        this.vh = this.pcc.jsj.gm();
    }

    public void of() {
        if (!vj() && (this instanceof qf)) {
            this.pcc.jsj.sf();
            return;
        }
        if (!this.vy.pcc(this.vj.jr(), false)) {
            this.pcc.fum.vh();
            if (this.pcc.gdh && (this.pcc.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.pcc)) {
                ((com.bytedance.sdk.openadsdk.activity.single.pcc) this.pcc.ywp).of();
            } else {
                pcc(sf.C0198sf.pcc);
                this.vj.pcc(!this.vj.rnn() ? 1 : 0, 4);
            }
        }
        if (this.pcc.sf == null || this.pcc.gh == null || !this.pcc.sf.nmd()) {
            return;
        }
        this.pcc.gh.pcc(this.pcc, this.pcc.fum.tsz());
    }

    public void pcc(int i) {
        this.vj.lo();
        pcc(false, true, false, i);
        if (this.pcc.oo) {
            this.vy.sf(10000);
        }
    }

    public void yt() {
        gm();
        if (!this.pcc.sf.on() && jsj()) {
            qy();
        }
        if (jsj()) {
            this.pcc.pq.sf();
        }
        if (lo.oo(this.pcc.sf) || lo.kj(this.pcc.sf)) {
            this.ork.sendEmptyMessageDelayed(500, 100L);
        }
        this.pcc.mu.pcc(this.pcc.gd == 100.0f);
        tz();
        wh();
    }

    public final void qy() {
        if (this.pcc.rnn.isFinishing()) {
            return;
        }
        this.pcc.ye.ork();
        String str = this.pcc.oo ? "reward_endcard" : "fullscreen_endcard";
        this.pcc.ye.pcc(this.hc, str, this.pcc.tsx);
        if (this.pcc.rt) {
            this.pcc.of.pcc(this.pcc.xb);
        }
        this.pcc.ye.pcc(str, this.pcc.tsx);
        this.pcc.ye.vj();
    }

    public void pcc(Message message) {
        com.bytedance.sdk.openadsdk.core.gbb.oo pcc;
        int i = message.what;
        int i2 = message.what;
        if (i2 == 1) {
            fum();
            return;
        }
        if (i2 == 300) {
            if (this.pcc.gdh && (this.pcc.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.pcc)) {
                ((com.bytedance.sdk.openadsdk.activity.single.pcc) this.pcc.ywp).of();
            } else {
                pcc(sf.C0198sf.sf);
                this.pcc.fum.pcc(!this.pcc.fum.rnn() ? 1 : 0, 1 ^ (this.pcc.fum.rnn() ? 1 : 0));
            }
            ork.pcc(this.pcc.sf, "play_video_time_out", this.pcc.vj, (String) null);
            com.bytedance.sdk.openadsdk.core.model.oo gto = this.pcc.sf.gto();
            if (gto != null && (pcc = gto.pcc()) != null) {
                pcc.pcc(com.bytedance.sdk.openadsdk.core.gbb.pcc.pcc.GENERAL_LINEAR_AD_ERROR);
            }
            if (this.pcc.mu == null || this.pcc.mu.dax == null) {
                return;
            }
            this.pcc.mu.dax.ork();
            return;
        }
        if (i2 == 400) {
            this.pcc.fum.lo();
            pcc(false, true, false, 3);
            return;
        }
        if (i2 == 500) {
            if (!atb.vj(this.pcc.sf)) {
                this.pcc.zti.gm(false);
            }
            com.bytedance.sdk.component.vy.qf kj = this.pcc.ye.kj();
            if (kj != null && kj.getWebView() != null) {
                kj.tmg();
                kj.getWebView().resumeTimers();
            }
            if (this.pcc.ye.kj() != null) {
                this.pcc.ye.pcc(1.0f);
                this.pcc.mu.pcc(1.0f);
            }
            if (!this.pcc.sf.tuy() && this.pcc.fum.wh() && this.pcc.jr.get()) {
                this.pcc.fum.lo();
                return;
            }
            return;
        }
        if (i2 == 600) {
            hc();
            return;
        }
        if (i2 == 700) {
            int i3 = message.arg1;
            if (this.pcc.lu.get()) {
                return;
            }
            if (i3 > 0) {
                this.pcc.zti.sf();
                this.pcc.zti.pcc((CharSequence) ((i3 / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS));
                this.pcc.zti.vj(false);
                Message obtain = Message.obtain();
                obtain.what = 700;
                obtain.arg1 = i3 - 1000;
                com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
                sfVar.qf -= 1000;
                this.ork.sendMessageDelayed(obtain, 1000L);
                return;
            }
            this.ork.removeMessages(700);
            if (atb.qf(this.sf)) {
                if (this.pcc.of.sf() || !this.pcc.ye.hc()) {
                    hc();
                    return;
                } else {
                    fum();
                    return;
                }
            }
            hc();
            return;
        }
        if (i2 == 800) {
            if (!atb.sf(this.pcc.sf)) {
                this.pcc.zti.gm(false);
            }
            this.pcc.mu.pcc(1.0f);
            if (!this.pcc.sf.tuy() && this.pcc.fum.wh() && this.pcc.jr.get()) {
                this.pcc.fum.lo();
                return;
            }
            return;
        }
        if (i2 == 900 && !this.pcc.gpj.get()) {
            int i4 = message.arg1;
            double tsx = this.pcc.fum.tsx();
            pcc(i4, (long) (1000.0d * tsx));
            if (i4 > 0) {
                this.pcc.zti.sf();
                this.pcc.zti.pcc((CharSequence) ((i4 / 1000) + CmcdData.Factory.STREAMING_FORMAT_SS));
                this.pcc.zti.vj(false);
                Message obtain2 = Message.obtain();
                obtain2.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
                obtain2.arg1 = i4 - 1000;
                this.pcc.kj = obtain2.arg1;
                this.ork.sendMessageDelayed(obtain2, 1000L);
                if (this.pcc.gdh && (this.pcc.ywp instanceof com.bytedance.sdk.openadsdk.activity.single.pcc) && tsx > 0.0d) {
                    ((com.bytedance.sdk.openadsdk.activity.single.pcc) this.pcc.ywp).pcc((float) (1.0d - ((i4 / 1000.0f) / tsx)));
                    return;
                }
                return;
            }
            this.ork.removeMessages(DescriptorProtos.Edition.EDITION_LEGACY_VALUE);
            hc();
            com.bytedance.sdk.openadsdk.activity.single.kj kjVar = this.pcc.ywp;
            if (this.pcc.gdh && (kjVar instanceof com.bytedance.sdk.openadsdk.activity.single.pcc)) {
                kjVar.rj().pcc(kjVar, new sf.vj(5, this.pcc));
            }
        }
    }

    private void pcc(long j, long j2) {
        long j3 = j2 - j;
        if (this.pcc.rnn instanceof TTRewardVideoActivity) {
            ((TTRewardVideoActivity) this.pcc.rnn).gm(j3, j2);
        }
    }

    static void pcc(FrameLayout frameLayout, final com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        final com.bytedance.sdk.openadsdk.core.wh.oo ooVar;
        Context context = frameLayout.getContext();
        if (sfVar.tmh) {
            com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
            gmVar.setId(nac.tmg);
            frameLayout.addView(gmVar, new FrameLayout.LayoutParams(-1, -1));
            FrameLayout pcc = pcc(context);
            String str = "";
            if (of.vj(sfVar.sf)) {
                com.bykv.vk.openvk.pcc.pcc.pcc.gm.sf kez = sfVar.sf.kez();
                if (kez != null) {
                    str = kez.ork();
                }
            } else {
                List<com.bytedance.sdk.openadsdk.core.model.lu> by = sfVar.sf.by();
                if (by != null && !by.isEmpty()) {
                    str = by.get(0).pcc();
                }
            }
            if (TextUtils.isEmpty(str)) {
                ooVar = null;
            } else {
                ooVar = new com.bytedance.sdk.openadsdk.core.wh.oo(context);
                ooVar.setId(nac.pjm);
                ooVar.setTag(nac.pjm, str);
                ooVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                pcc.addView(ooVar);
            }
            gmVar.addView(pcc);
            gmVar.addView(new vh(context), new FrameLayout.LayoutParams(-1, -1));
            com.bytedance.sdk.openadsdk.component.reward.view.oo ooVar2 = new com.bytedance.sdk.openadsdk.component.reward.view.oo(context);
            ooVar2.setId(nac.gbb);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            frameLayout.addView(ooVar2, layoutParams);
            ooVar2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.sf.sf.2
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    int height = view.getHeight();
                    if (height <= 0) {
                        return;
                    }
                    View findViewById = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.nn.findViewById(520093757);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams2).bottomMargin = height;
                        }
                    }
                    View findViewById2 = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.nn.findViewById(nac.jum);
                    if (findViewById2 != null) {
                        ViewGroup.LayoutParams layoutParams3 = findViewById2.getLayoutParams();
                        if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams3).bottomMargin = height;
                        }
                    }
                    View findViewById3 = com.bytedance.sdk.openadsdk.component.reward.pcc.sf.this.nn.findViewById(nac.we);
                    if (findViewById3 != null) {
                        ViewGroup.LayoutParams layoutParams4 = findViewById3.getLayoutParams();
                        if (layoutParams4 instanceof FrameLayout.LayoutParams) {
                            ((FrameLayout.LayoutParams) layoutParams4).bottomMargin = height;
                        }
                    }
                    com.bytedance.sdk.openadsdk.core.wh.oo ooVar3 = ooVar;
                    if (ooVar3 != null) {
                        ViewGroup.LayoutParams layoutParams5 = ooVar3.getLayoutParams();
                        if (layoutParams5 instanceof ViewGroup.MarginLayoutParams) {
                            ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = height;
                            ooVar.setLayoutParams(layoutParams5);
                        }
                    }
                }
            });
            com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
            vjVar.setId(nac.jr);
            vjVar.setOrientation(1);
            vjVar.setVisibility(8);
            frameLayout.addView(vjVar, new FrameLayout.LayoutParams(-1, -1));
        }
        if (sfVar.lrr) {
            com.bytedance.sdk.component.vy.qf qfVar = new com.bytedance.sdk.component.vy.qf(context, true, qf.gm.ENDCARD);
            qfVar.setId(nac.dax);
            qfVar.setLayerType(2, null);
            qfVar.setVisibility(4);
            boolean qf = lo.qf(sfVar.sf);
            boolean hc = lo.hc(sfVar.sf);
            if (!sfVar.wax && (qf || hc)) {
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.topMargin = rj.sf(sfVar.kun, 58.0f);
                frameLayout.addView(qfVar, layoutParams2);
            } else {
                frameLayout.addView(qfVar, new FrameLayout.LayoutParams(-1, -1));
            }
            FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setId(nac.nac);
            frameLayout2.setVisibility(4);
            frameLayout.addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
            if (atb.sf(sfVar.sf)) {
                com.bytedance.sdk.openadsdk.core.wh.gm gmVar2 = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
                gmVar2.setId(nac.slc);
                gmVar2.setVisibility(4);
                frameLayout.addView(gmVar2, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    protected static FrameLayout pcc(Context context) {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
        gmVar.setId(nac.hc);
        gmVar.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        gmVar.setLayoutParams(layoutParams);
        return gmVar;
    }
}
