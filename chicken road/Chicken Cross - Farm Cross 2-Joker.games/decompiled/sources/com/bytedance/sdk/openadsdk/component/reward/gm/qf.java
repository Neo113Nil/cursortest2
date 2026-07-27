package com.bytedance.sdk.openadsdk.component.reward.gm;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.sf;
import com.bytedance.sdk.openadsdk.activity.TTRewardWebActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTRewardExpressVideoActivity;
import com.bytedance.sdk.openadsdk.component.reward.tmg;
import com.bytedance.sdk.openadsdk.core.atb;
import com.bytedance.sdk.openadsdk.core.jr;
import com.bytedance.sdk.openadsdk.core.lu;
import com.bytedance.sdk.openadsdk.core.model.lo;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.oem.IPBroadcastReceiver;
import com.bytedance.sdk.openadsdk.oo.ork;
import com.bytedance.sdk.openadsdk.utils.rnn;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class qf extends sf implements wh {
    private static com.bytedance.sdk.openadsdk.pcc.vj.pcc lo;
    private long fum;
    private com.bytedance.sdk.openadsdk.pcc.vj.pcc gpj;
    public com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh lu;
    private String of;
    private String tz;

    public qf(Activity activity, Context context, of ofVar, String str, ViewGroup viewGroup, String str2) {
        super(activity, context, ofVar, str, viewGroup, str2);
        this.fum = System.currentTimeMillis();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void pcc(Bundle bundle) {
        super.pcc(bundle);
        Intent intent = this.oo.getIntent();
        if (intent != null) {
            this.tz = intent.getStringExtra("media_extra");
            this.of = intent.getStringExtra("user_id");
        }
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh whVar = new com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh(this.vj, this.oo, this.of, this.tz);
        this.lu = whVar;
        whVar.pcc(this);
        if (bundle != null) {
            this.lu.sf();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void sf(Bundle bundle) {
        if (!this.dax) {
            lo = this.gpj;
        }
        super.sf(bundle);
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh whVar = this.lu;
        if (whVar != null) {
            whVar.pcc();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    protected void tmg() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.gpj;
        if (pccVar != null) {
            pccVar.pcc();
        } else {
            ork.pcc(this.vj, "show", 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    protected void hc() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.gpj;
        if (pccVar != null) {
            pccVar.onAdClicked();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    protected void pcc(boolean z, int i, String str, int i2, String str2, int i3) {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.gpj;
        if (pccVar != null) {
            pccVar.pcc(z, i, str, i2, str2);
            tmg.pcc(this.vj, z, i3);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void wh() {
        super.wh();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void gm() {
        super.gm();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void kj() {
        super.kj();
        if (this.gbb.get()) {
            nac();
        }
        pcc(this.oo.isFinishing(), this.oo.isChangingConfigurations());
        if (this.dax) {
            return;
        }
        this.gpj = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    public void gm(Bundle bundle) {
        super.gm(bundle);
        if (this.dax) {
            this.gpj = (com.bytedance.sdk.openadsdk.pcc.vj.pcc) atb.pcc().pcc(this.pcc, com.bytedance.sdk.openadsdk.pcc.vj.pcc.class);
            return;
        }
        com.bytedance.sdk.openadsdk.pcc.vj.pcc sf = atb.pcc().sf();
        this.gpj = sf;
        if (sf != null || bundle == null) {
            return;
        }
        this.gpj = lo;
        lo = null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    protected void vj() {
        this.qf.pcc((wh) this);
        super.vj();
    }

    public void pcc(boolean z, boolean z2) {
        if (!this.dax || TextUtils.isEmpty(this.pcc)) {
            return;
        }
        atb.pcc().pcc(this.pcc, z, z2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf, com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener
    public void onRenderFail(View view, String str, int i) {
        super.onRenderFail(view, str, i);
        jr.gm().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.qf.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d("UnifyRewardBundle", "run: start backup activity");
                if (qf.this.ork != null) {
                    qf.this.ork.vj();
                }
                qf.this.lu();
                if (qf.this.oo == null || qf.this.oo.isFinishing() || !(qf.this.oo instanceof TTRewardWebActivity)) {
                    return;
                }
                ((TTRewardWebActivity) qf.this.oo).sf();
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    protected void dax() {
        com.bytedance.sdk.openadsdk.pcc.vj.pcc pccVar = this.gpj;
        if (pccVar != null) {
            pccVar.sf();
        } else {
            ork.pcc(this.vj, "close", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lu() {
        com.bytedance.sdk.openadsdk.core.model.pcc oo;
        if (this.vj == null || (oo = this.vj.oo()) == null || !oo.wh()) {
            return;
        }
        final of qf = oo.qf();
        List<of> vj = oo.vj();
        if (vj != null) {
            Iterator<of> it = vj.iterator();
            while (it.hasNext()) {
                IPBroadcastReceiver.sf(this.hc, it.next());
            }
        }
        qf.gpj(1);
        Context context = this.oo == null ? this.hc : this.oo;
        if (context == null) {
            context = lu.pcc();
        }
        Intent intent = new Intent(context, (Class<?>) TTRewardExpressVideoActivity.class);
        if (lo.vj(this.vj)) {
            this.vj.pcc(7, 8);
            if (this.vj.kez() != null) {
                this.vj.kez().oo("");
            }
            intent.putExtra("extra_conversion_link", 5);
        }
        com.bytedance.sdk.openadsdk.component.reward.pcc.gm.pcc(intent, this.oo, this.gm, oo, this.pcc);
        intent.putExtra("media_extra", this.tz);
        intent.putExtra("user_id", this.of);
        intent.putExtra("start_show_time", SystemClock.elapsedRealtime());
        intent.putExtra("enable_new_arch", this.dax);
        if (this.dax) {
            atb.pcc().pcc(this.pcc, (String) this.gpj);
        } else {
            atb.pcc().pcc(this.gpj);
        }
        this.gpj = null;
        intent.putExtra("back_up", true);
        if (com.bytedance.sdk.openadsdk.yt.vj.pcc("start_activity_async", 0) == 1) {
            com.bytedance.sdk.openadsdk.lu.gm.pcc(new com.bytedance.sdk.openadsdk.lu.oo() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.qf.2
                @Override // com.bytedance.sdk.openadsdk.lu.oo
                public com.bytedance.sdk.openadsdk.lu.sf.pcc pcc() {
                    com.bytedance.sdk.openadsdk.lu.sf.pcc pccVar = new com.bytedance.sdk.openadsdk.lu.sf.pcc();
                    pccVar.sf("start_activity");
                    pccVar.oo("rewarded_video");
                    return pccVar;
                }
            });
        }
        com.bytedance.sdk.component.utils.sf.pcc(context, intent, new sf.InterfaceC0131sf() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.qf.3
            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0131sf
            public void pcc() {
            }

            @Override // com.bytedance.sdk.component.utils.sf.InterfaceC0131sf
            public void pcc(Throwable th) {
                ork.pcc(qf, "show_ad_fail", qf.this.wh, "activity_start_fail");
            }
        }, true);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.wh
    public void pcc(long j, int i) {
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh whVar = this.lu;
        if (whVar != null) {
            whVar.pcc(j, i, 13);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.wh
    public void sf(boolean z, int i, String str, int i2, String str2, int i3) {
        gm(z, i, str, i2, str2, i3);
    }

    private void gm(final boolean z, final int i, final String str, final int i2, final String str2, final int i3) {
        com.bytedance.sdk.component.utils.lo.pcc("UnifyRewardBundle", "invoke callback onRewardVerify: " + z + ", " + i + ", " + str + ", " + i2 + ", " + str2 + "; " + this);
        rnn.pcc(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.gm.qf.4
            @Override // java.lang.Runnable
            public void run() {
                qf.this.pcc(z, i, str, i2, str2, i3);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.gm.sf
    protected void gbb() {
        super.gbb();
        com.bytedance.sdk.openadsdk.component.reward.gm.sf.wh whVar = this.lu;
        if (whVar != null) {
            whVar.pcc(this.jr, (int) (System.currentTimeMillis() - this.jr), 14);
        }
    }

    protected void finalize() throws Throwable {
        super.finalize();
        if (this.dax) {
            return;
        }
        lo = null;
    }
}
