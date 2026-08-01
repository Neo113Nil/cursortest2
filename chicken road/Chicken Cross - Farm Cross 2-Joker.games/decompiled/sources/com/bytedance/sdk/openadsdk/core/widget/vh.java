package com.bytedance.sdk.openadsdk.core.widget;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.bytedance.sdk.openadsdk.activity.single.IABLandingPageActivity;
import com.bytedance.sdk.openadsdk.activity.single.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class vh extends FrameLayout {
    private TextView gm;
    private String kj;
    private dax oo;
    private boolean pcc;
    private of qf;
    private nac sf;
    private PAGLogoView vj;
    private com.bytedance.sdk.openadsdk.core.gm.pcc vy;
    private com.bytedance.sdk.openadsdk.core.wh.kj wh;

    public vh(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.nac.uae);
    }

    public void pcc(of ofVar, String str, com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        this.qf = ofVar;
        this.kj = str;
        this.vy = pccVar;
    }

    public void setClickListener(com.bytedance.sdk.openadsdk.core.gm.pcc pccVar) {
        this.vy = pccVar;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            pcc();
        }
    }

    private void pcc() {
        if (this.pcc) {
            return;
        }
        this.pcc = true;
        sf();
        if (this.sf != null && this.qf.zk() != null && !TextUtils.isEmpty(this.qf.zk().pcc())) {
            com.bytedance.sdk.openadsdk.lo.sf.sf().pcc(this.qf.zk(), this.sf, this.qf);
        }
        dax daxVar = this.oo;
        if (daxVar != null) {
            rj.pcc((TextView) null, daxVar, this.qf);
            if (this.qf.xfm() != null) {
                this.oo.setVisibility(0);
            }
        }
        if (this.gm != null) {
            if (this.qf.xfm() != null && !TextUtils.isEmpty(this.qf.xfm().sf())) {
                this.gm.setText(this.qf.xfm().sf());
            } else if (!TextUtils.isEmpty(this.qf.ofe())) {
                this.gm.setText(this.qf.ofe());
            } else {
                this.gm.setVisibility(8);
            }
        }
        if (this.wh != null) {
            String gmh = this.qf.gmh();
            if (!TextUtils.isEmpty(gmh)) {
                this.wh.setText(gmh);
            } else {
                this.wh.setVisibility(8);
            }
        }
        this.vj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.vh.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    if (!com.bytedance.sdk.openadsdk.utils.sf.wh() || !com.bytedance.sdk.openadsdk.core.lu.oo().atb()) {
                        TTWebsiteActivity.pcc(vh.this.getContext(), vh.this.qf, vh.this.kj);
                    } else {
                        IABLandingPageActivity.pcc(vh.this.getContext(), vh.this.qf, vh.this.kj);
                    }
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void sf() {
        FrameLayout.LayoutParams layoutParams;
        Context context = getContext();
        boolean z = this.qf.ial() == 1;
        setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        com.bytedance.sdk.openadsdk.core.wh.vj vjVar = new com.bytedance.sdk.openadsdk.core.wh.vj(context);
        vjVar.setGravity(1);
        vjVar.setOrientation(1);
        if (z) {
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            layoutParams = new FrameLayout.LayoutParams(rj.sf(context, 327.0f), -2);
        }
        layoutParams.gravity = 17;
        int sf = rj.sf(context, 24.0f);
        layoutParams.rightMargin = sf;
        layoutParams.leftMargin = sf;
        addView(vjVar, layoutParams);
        nac nacVar = new nac(context);
        this.sf = nacVar;
        nacVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(rj.sf(context, 80.0f), rj.sf(context, 80.0f));
        layoutParams2.bottomMargin = rj.sf(context, 12.0f);
        vjVar.addView(this.sf, layoutParams2);
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.gm = kjVar;
        kjVar.setEllipsize(TextUtils.TruncateAt.END);
        this.gm.setGravity(17);
        this.gm.setMaxLines(2);
        this.gm.setMaxWidth(rj.sf(context, 180.0f));
        this.gm.setTextColor(-1);
        this.gm.setTextSize(2, 24.0f);
        vjVar.addView(this.gm, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.wh.kj kjVar2 = new com.bytedance.sdk.openadsdk.core.wh.kj(context);
        this.wh = kjVar2;
        kjVar2.setEllipsize(TextUtils.TruncateAt.END);
        this.wh.setGravity(17);
        this.wh.setMaxLines(2);
        this.wh.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.wh.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = rj.sf(context, 8.0f);
        vjVar.addView(this.wh, layoutParams3);
        this.oo = new dax(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, rj.sf(context, 16.0f));
        layoutParams4.topMargin = rj.sf(context, 12.0f);
        this.oo.setVisibility(8);
        vjVar.addView(this.oo, layoutParams4);
        this.vj = PAGLogoView.createPAGLogoViewByMaterial(context, this.qf);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, rj.sf(context, 14.0f));
        layoutParams5.gravity = 8388691;
        layoutParams5.leftMargin = rj.sf(context, 18.0f);
        if (z) {
            layoutParams5.bottomMargin = rj.sf(context, 61.0f);
        } else {
            layoutParams5.bottomMargin = rj.sf(context, 24.0f);
        }
        addView(this.vj, layoutParams5);
    }
}
