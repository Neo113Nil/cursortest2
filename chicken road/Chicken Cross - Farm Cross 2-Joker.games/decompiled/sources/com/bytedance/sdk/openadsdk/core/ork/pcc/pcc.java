package com.bytedance.sdk.openadsdk.core.ork.pcc;

import android.app.Activity;
import android.content.Context;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.PAGExpressAdWrapperListener;
import com.bytedance.sdk.openadsdk.core.gm.gm;
import com.bytedance.sdk.openadsdk.core.gm.sf;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.core.ork.ork;
import com.bytedance.sdk.openadsdk.core.ork.vj;
import com.bytedance.sdk.openadsdk.core.ork.vy;
import com.bytedance.sdk.openadsdk.core.ork.yt;
import com.bytedance.sdk.openadsdk.utils.kun;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class pcc {
    protected ViewGroup gm;
    protected Context kj;
    protected String oo;
    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm ork;
    protected yt pcc;
    protected Activity qf;
    protected of sf;
    private com.bytedance.sdk.openadsdk.component.reward.gm.sf tmg;
    private PAGExpressAdWrapperListener vh;
    protected float vj;
    protected AdSlot vy;
    protected float wh;

    public pcc(ViewGroup viewGroup, of ofVar, String str, Activity activity, Context context, com.bytedance.sdk.openadsdk.component.reward.gm.sf sfVar) {
        this.gm = viewGroup;
        this.sf = ofVar;
        this.oo = str;
        this.qf = activity;
        this.kj = context;
        this.tmg = sfVar;
    }

    public yt sf() {
        return this.pcc;
    }

    public void pcc(float[] fArr) {
        if (fArr == null || fArr.length != 2) {
            return;
        }
        pcc(fArr[0], fArr[1]);
    }

    public void pcc(float f, float f2) {
        this.vj = f;
        this.wh = f2;
        this.vy = new AdSlot.Builder().setCodeId(String.valueOf(this.sf.kot())).setExpressViewAcceptedSize(this.vj, this.wh).build();
        this.pcc = new yt(this.qf, this.kj, this.sf, this.vy, this.oo);
    }

    public void gm() {
        yt ytVar = this.pcc;
        if (ytVar == null) {
            return;
        }
        ytVar.setExpressInteractionListener(this.vh);
        oo();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        this.gm.addView(this.pcc, layoutParams);
        this.pcc.fum();
        this.pcc.vh();
    }

    public void pcc(PAGExpressAdWrapperListener pAGExpressAdWrapperListener) {
        this.vh = pAGExpressAdWrapperListener;
    }

    public void pcc(vj vjVar) {
        this.pcc.setDislikeClickListener(vjVar);
    }

    protected void oo() {
        Activity activity = this.qf;
        of ofVar = this.sf;
        String str = this.oo;
        ork orkVar = new ork(activity, ofVar, str, kun.pcc(str));
        orkVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.pcc.pcc.1
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                pcc.this.tmg.ork();
            }
        });
        HashMap hashMap = new HashMap();
        hashMap.put("click_scence", 1);
        orkVar.pcc(hashMap);
        Activity activity2 = this.qf;
        of ofVar2 = this.sf;
        String str2 = this.oo;
        vy vyVar = new vy(activity2, ofVar2, str2, kun.pcc(str2)) { // from class: com.bytedance.sdk.openadsdk.core.ork.pcc.pcc.2
            @Override // com.bytedance.sdk.openadsdk.core.gm.pcc, com.bytedance.sdk.openadsdk.core.gm.sf, com.bytedance.sdk.openadsdk.core.gm.gm
            public void pcc(View view, float f, float f2, float f3, float f4, SparseArray<gm.pcc> sparseArray, boolean z) {
                super.pcc(view, f, f2, f3, f4, sparseArray, z);
            }
        };
        vyVar.pcc(new sf.pcc() { // from class: com.bytedance.sdk.openadsdk.core.ork.pcc.pcc.3
            @Override // com.bytedance.sdk.openadsdk.core.gm.sf.pcc
            public void pcc(View view, int i) {
                pcc.this.tmg.ork();
            }
        });
        HashMap hashMap2 = new HashMap();
        hashMap2.put("click_scence", 1);
        vyVar.pcc(hashMap2);
        pcc(orkVar, vyVar);
    }

    public void pcc(ork orkVar, vy vyVar) {
        of ofVar;
        if (this.pcc == null || (ofVar = this.sf) == null) {
            return;
        }
        this.ork = pcc(ofVar);
        orkVar.sf(this.pcc);
        orkVar.pcc(this.ork);
        this.pcc.setClickListener(orkVar);
        vyVar.sf(this.pcc);
        vyVar.pcc(this.ork);
        this.pcc.setClickCreativeListener(vyVar);
    }

    private com.bytedance.sdk.openadsdk.fum.pcc.pcc.gm pcc(of ofVar) {
        if (ofVar.az() == 4) {
            return com.bytedance.sdk.openadsdk.fum.pcc.pcc.oo.pcc(this.qf, this.oo);
        }
        return null;
    }

    public void vj() {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.tmg();
        }
    }

    public void wh() {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.vh();
        }
    }

    public void qf() {
        yt ytVar = this.pcc;
        if (ytVar != null) {
            ytVar.hc();
        }
    }
}
