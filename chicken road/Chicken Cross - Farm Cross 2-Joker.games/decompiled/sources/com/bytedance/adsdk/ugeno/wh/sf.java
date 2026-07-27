package com.bytedance.adsdk.ugeno.wh;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

/* loaded from: classes4.dex */
public class sf extends pcc<com.bytedance.adsdk.ugeno.sf.gm> {
    private com.bytedance.adsdk.ugeno.oo oo;

    public sf(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.wh.pcc
    public View vh(int i) {
        return ((com.bytedance.adsdk.ugeno.sf.gm) this.pcc.get(i)).vh();
    }

    public void pcc(com.bytedance.adsdk.ugeno.oo ooVar) {
        this.oo = ooVar;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.bytedance.adsdk.ugeno.oo ooVar = this.oo;
        if (ooVar != null) {
            int[] pcc = ooVar.pcc(i, i2);
            super.onMeasure(pcc[0], pcc[1]);
        } else {
            super.onMeasure(i, i2);
        }
        com.bytedance.adsdk.ugeno.oo ooVar2 = this.oo;
        if (ooVar2 != null) {
            ooVar2.vj();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.bytedance.adsdk.ugeno.oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.wh();
        }
        super.onLayout(z, i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.oo ooVar2 = this.oo;
        if (ooVar2 != null) {
            ooVar2.pcc(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.qf();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.kj();
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        com.bytedance.adsdk.ugeno.oo ooVar = this.oo;
        if (ooVar != null) {
            ooVar.sf(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
