package com.bytedance.sdk.openadsdk.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.gm.ork;
import com.bytedance.sdk.openadsdk.gm.tmg;
import com.bytedance.sdk.openadsdk.utils.rj;

/* loaded from: classes4.dex */
public class nac extends com.bytedance.sdk.openadsdk.core.wh.gm implements ork.sf {
    private pcc gm;
    private Context oo;
    private View pcc;
    private final com.bytedance.sdk.openadsdk.gm.ork qf;
    private of sf;
    private String vj;
    private boolean wh;

    public interface pcc {
        void pcc(View view);

        void pcc(FilterWord filterWord);

        void sf(View view);
    }

    public nac(Context context, of ofVar) {
        this(context.getApplicationContext());
        this.sf = ofVar;
        this.oo = context;
        oo();
        vj();
    }

    private void oo() {
        this.qf.pcc(this.sf.hl());
        this.qf.pcc(this);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public nac(Context context) {
        this(context, (AttributeSet) null);
    }

    public nac(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public nac(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.wh = false;
        this.qf = new com.bytedance.sdk.openadsdk.gm.ork();
        pcc(context, attributeSet);
    }

    private void pcc(Context context, AttributeSet attributeSet) {
        setClickable(true);
        setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.nac.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (nac.this.qf != null) {
                    nac.this.qf.vj();
                } else {
                    nac.this.sf();
                }
            }
        });
        setBackgroundColor(Color.parseColor("#80000000"));
        this.pcc = new com.bytedance.sdk.openadsdk.gm.vy(context, this.qf);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = rj.sf(getContext(), 20.0f);
        layoutParams.rightMargin = rj.sf(getContext(), 20.0f);
        this.pcc.setLayoutParams(layoutParams);
        this.pcc.setClickable(true);
        vj();
    }

    private void vj() {
        com.bytedance.sdk.openadsdk.gm.ork orkVar;
        of ofVar = this.sf;
        if (ofVar == null || (orkVar = this.qf) == null) {
            return;
        }
        orkVar.pcc(ofVar.ywc());
    }

    public void setDislikeSource(String str) {
        this.vj = str;
        this.qf.sf(str);
    }

    public void pcc() {
        if (this.pcc.getParent() == null) {
            addView(this.pcc);
        }
        setVisibility(0);
        this.wh = true;
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.pcc(this);
        }
    }

    public void sf() {
        setVisibility(8);
        this.wh = false;
        pcc pccVar = this.gm;
        if (pccVar != null) {
            pccVar.sf(this);
        }
    }

    public void setCallback(pcc pccVar) {
        this.gm = pccVar;
    }

    @Override // com.bytedance.sdk.openadsdk.gm.ork.sf
    public void pcc(int i) {
        if (com.bytedance.sdk.openadsdk.gm.ork.sf == i) {
            FilterWord sf = this.qf.sf();
            if (sf == null || com.bytedance.sdk.openadsdk.gm.ork.pcc.equals(sf)) {
                return;
            }
            pcc pccVar = this.gm;
            if (pccVar != null) {
                try {
                    pccVar.pcc(sf);
                } catch (Throwable unused) {
                }
            }
            sf();
            return;
        }
        if (com.bytedance.sdk.openadsdk.gm.ork.gm == i) {
            sf();
        } else if (com.bytedance.sdk.openadsdk.gm.ork.vj == i) {
            gm();
        }
    }

    public void gm() {
        Context context = this.oo;
        if (context instanceof Activity) {
            boolean isFinishing = ((Activity) context).isFinishing();
            com.bytedance.sdk.openadsdk.gm.tmg tmgVar = new com.bytedance.sdk.openadsdk.gm.tmg(this.oo, this.qf);
            tmgVar.pcc(wh());
            tmgVar.pcc(this.sf);
            if (isFinishing || tmgVar.isShowing()) {
                return;
            }
            tmgVar.show();
        }
    }

    private tmg.pcc wh() {
        return new tmg.pcc() { // from class: com.bytedance.sdk.openadsdk.common.nac.2
            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void pcc() {
                nac.this.setVisibility(8);
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void sf() {
                nac.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void gm() {
                nac.this.setVisibility(0);
            }

            @Override // com.bytedance.sdk.openadsdk.gm.tmg.pcc
            public void pcc(int i, FilterWord filterWord, String str) {
                nac.this.qf.gm(str);
                nac.this.setVisibility(0);
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.sdk.openadsdk.gm.ork orkVar = this.qf;
        if (orkVar != null) {
            orkVar.pcc();
        }
    }
}
