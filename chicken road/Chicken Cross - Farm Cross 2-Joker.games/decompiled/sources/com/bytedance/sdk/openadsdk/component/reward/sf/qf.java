package com.bytedance.sdk.openadsdk.component.reward.sf;

import android.app.Activity;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.openadsdk.component.reward.view.kj;
import com.bytedance.sdk.openadsdk.core.model.lu;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.kun;
import com.bytedance.sdk.openadsdk.utils.nac;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class qf extends sf {
    private String dax;
    private ViewGroup gbb;
    private final int hc;
    private com.bytedance.sdk.openadsdk.component.reward.view.wh jr;

    public qf(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        super(sfVar);
        this.dax = "fullscreen_interstitial_ad";
        this.hc = this.sf.ct();
    }

    private void tsz() {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout frameLayout = new FrameLayout(this.pcc.rnn);
        this.gbb = frameLayout;
        frameLayout.setId(nac.we);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        this.gbb.setLayoutParams(layoutParams2);
        View tmg = this.pcc.mu.tmg();
        if (tmg != null) {
            layoutParams2.bottomMargin = tmg.getHeight();
        }
        com.bytedance.sdk.openadsdk.component.reward.view.wh whVar = new com.bytedance.sdk.openadsdk.component.reward.view.wh(this.pcc.rnn);
        this.jr = whVar;
        whVar.setId(nac.gpa);
        if (this.pcc.sf.ial() == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -1);
        }
        layoutParams.gravity = 17;
        this.jr.setLayoutParams(layoutParams);
        this.gbb.addView(this.jr);
        mk();
    }

    private void mk() {
        if (this.gbb == null) {
            return;
        }
        pcc((View) this.jr);
    }

    private void sf(of ofVar) {
        if (ofVar == null || this.jr == null) {
            return;
        }
        atb();
        pcc((ImageView) this.jr);
    }

    private void atb() {
        lu luVar;
        List<lu> by = this.sf.by();
        if (by == null || by.size() <= 0 || (luVar = by.get(0)) == null) {
            return;
        }
        try {
            int sf = luVar.sf();
            int gm = luVar.gm();
            if (sf != 0 && gm != 0) {
                this.jr.setRatio(sf / gm);
                return;
            }
            int i = this.hc;
            if (i == 33) {
                this.jr.setRatio(1.0f);
            } else if (i == 3) {
                this.jr.setRatio(1.91f);
            } else {
                this.jr.setRatio(0.56f);
            }
        } catch (Exception e) {
            lo.gm("TTAD.RFTI", e.getMessage());
        }
    }

    private void pcc(ImageView imageView) {
        List<lu> by;
        lu luVar;
        if (this.sf == null || (by = this.sf.by()) == null || by.size() <= 0 || (luVar = by.get(0)) == null) {
            return;
        }
        com.bytedance.sdk.openadsdk.ork.oo.pcc(by.get(0)).gm(1).pcc(com.bytedance.sdk.openadsdk.ork.gm.pcc(this.sf, luVar.pcc(), imageView));
    }

    protected void pcc(View view) {
        com.bytedance.sdk.openadsdk.core.gm.sf sfVar;
        if (view == null || this.pcc.rnn == null || this.sf == null) {
            return;
        }
        if (this.vh == null) {
            Activity activity = this.pcc.rnn;
            of ofVar = this.sf;
            String str = this.dax;
            sfVar = new com.bytedance.sdk.openadsdk.core.gm.pcc(activity, ofVar, str, kun.pcc(str));
            sfVar.pcc(gm(this.sf));
            HashMap hashMap = new HashMap();
            hashMap.put("click_scence", 1);
            sfVar.pcc(hashMap);
        } else {
            sfVar = this.vh;
        }
        if (this.pcc.rnn != null) {
            sfVar.pcc(this.pcc.rnn);
        }
        view.setOnTouchListener(sfVar);
        view.setOnClickListener(sfVar);
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm gm(of ofVar) {
        if (ofVar.az() == 4) {
            return new com.bytedance.sdk.openadsdk.fum.pcc.pcc.sf(com.bytedance.sdk.openadsdk.core.lu.pcc(), this.dax);
        }
        return null;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(FrameLayout frameLayout) {
        try {
            tsz();
            sf(this.sf);
            frameLayout.addView(this.gbb);
        } catch (Exception e) {
            Log.e("TTAD.RFTI", "bindAd: ", e);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void pcc(kj kjVar) {
        if (com.bytedance.sdk.openadsdk.core.model.lo.sf(this.sf)) {
            oo.pcc(kjVar, this.sf);
            if (this.pcc.gh != null) {
                this.pcc.gh.pcc(this.pcc, (long) (this.pcc.fum.tsx() * 1000.0d));
                return;
            }
            return;
        }
        if (com.bytedance.sdk.openadsdk.core.model.lo.oo(this.sf) || com.bytedance.sdk.openadsdk.core.model.lo.kj(this.sf)) {
            oo.sf(kjVar, this.sf);
            if (this.pcc.gdh || this.pcc.gh == null) {
                return;
            }
            this.pcc.gh.pcc(this.pcc, (long) (this.pcc.fum.tsx() * 1000.0d));
            return;
        }
        super.pcc(kjVar);
    }

    public static boolean pcc(of ofVar) {
        return !of.vj(ofVar) && ofVar.zx() == 100.0f;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean oo() {
        return ye();
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public boolean vj() {
        return ye();
    }

    private boolean ye() {
        return this.sf != null && this.sf.ei() == 2;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.sf.sf
    public void wh() {
        if (com.bytedance.sdk.openadsdk.core.model.lo.sf(this.sf)) {
            this.wh.sf(8);
        }
        this.kj.gm(false);
        this.kj.oo(false);
        if (this.sf.ei() == 2) {
            this.kj.pcc(false);
            this.wh.wh(8);
            return;
        }
        this.kj.pcc(this.sf.dk());
        if (this.pcc.tmh) {
            Message obtain = Message.obtain();
            obtain.what = DescriptorProtos.Edition.EDITION_LEGACY_VALUE;
            com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar = this.pcc;
            int tsx = (int) (this.pcc.fum.tsx() * 1000.0d);
            sfVar.kj = tsx;
            obtain.arg1 = tsx;
            this.pcc.rj.sendMessage(obtain);
        }
    }
}
