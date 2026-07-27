package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

/* loaded from: classes4.dex */
public class sf extends com.bytedance.sdk.openadsdk.core.wh.gm {
    private com.bytedance.sdk.openadsdk.core.wh.gm gm;
    private float oo;
    private final boolean pcc;
    private boolean qf;
    private final boolean sf;
    private float vj;
    private com.bytedance.sdk.openadsdk.activity.single.kj wh;

    public sf(Context context, boolean z, boolean z2, final int i) {
        super(context);
        this.pcc = z;
        this.sf = z2;
        if (!z) {
            this.gm = new com.bytedance.sdk.openadsdk.core.wh.gm(context);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            addView(this.gm, layoutParams);
            this.gm.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.1
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view, Outline outline) {
                    outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
                }
            });
            this.gm.setClipToOutline(true);
            return;
        }
        setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.sf.2
            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), i);
            }
        });
        setClipToOutline(true);
    }

    public void setWidthAndHeightRatio(float f) {
        this.oo = f;
    }

    @Override // com.bytedance.sdk.openadsdk.core.wh.gm, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (!this.sf) {
            if (this.pcc) {
                float f = this.oo;
                if (f > 0.0f) {
                    i2 = View.MeasureSpec.makeMeasureSpec((int) (size / f), 1073741824);
                } else {
                    float f2 = this.vj;
                    if (f2 > 0.0f) {
                        i2 = View.MeasureSpec.makeMeasureSpec((int) (size2 * f2), 1073741824);
                    }
                }
            } else {
                float f3 = this.oo;
                if (f3 > 0.0f) {
                    int max = Math.max(0, (size - ((int) (size2 * f3))) / 2);
                    setPadding(max, 0, max, 0);
                } else {
                    float f4 = this.vj;
                    if (f4 > 0.0f) {
                        int max2 = Math.max(0, (size - ((int) (size * f4))) / 2);
                        setPadding(max2, 0, max2, 0);
                    }
                }
            }
        } else {
            float f5 = this.oo;
            if (f5 > 0.0f) {
                int max3 = Math.max(0, (size - ((int) (size2 * f5))) / 2);
                setPadding(max3, 0, max3, 0);
            } else {
                float f6 = this.vj;
                if (f6 > 0.0f) {
                    int max4 = Math.max(0, (size - ((int) (size * f6))) / 2);
                    setPadding(max4, 0, max4, 0);
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public void setWidthOrHeightInParentRatio(float f) {
        this.vj = f;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        super.onWindowFocusChanged(z);
        if (this.qf == z || (kjVar = this.wh) == null || (yt = kjVar.yt()) == null) {
            return;
        }
        yt.jsj.sf(z);
    }

    public void setScene(com.bytedance.sdk.openadsdk.activity.single.kj kjVar) {
        this.wh = kjVar;
    }

    public void pcc(kj kjVar, FrameLayout.LayoutParams layoutParams) {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.gm;
        if (gmVar != null) {
            gmVar.addView(kjVar, layoutParams);
        } else {
            addView(kjVar, layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        super.onAttachedToWindow();
        if (this.qf || (kjVar = this.wh) == null || (yt = kjVar.yt()) == null) {
            return;
        }
        yt.jsj.sf(true);
        this.qf = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar;
        com.bytedance.sdk.openadsdk.component.reward.pcc.sf yt;
        super.onDetachedFromWindow();
        if (!this.qf || (kjVar = this.wh) == null || (yt = kjVar.yt()) == null) {
            return;
        }
        yt.jsj.sf(false);
        this.qf = false;
    }

    public void pcc() {
        com.bytedance.sdk.openadsdk.core.wh.gm gmVar = this.gm;
        if (gmVar != null) {
            gmVar.removeAllViews();
        } else {
            removeAllViews();
        }
    }
}
