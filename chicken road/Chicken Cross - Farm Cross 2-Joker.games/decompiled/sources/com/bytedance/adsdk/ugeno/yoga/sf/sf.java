package com.bytedance.adsdk.ugeno.yoga.sf;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.yoga.ork;
import com.bytedance.adsdk.ugeno.yoga.qf;
import com.bytedance.adsdk.ugeno.yoga.sf.gm;
import com.bytedance.adsdk.ugeno.yoga.vh;

/* loaded from: classes4.dex */
public class sf extends ViewGroup {
    public ork getYogaNode() {
        throw null;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof sf) {
            throw null;
        }
        ork pcc = vh.pcc();
        gm.pcc(new gm.pcc(layoutParams), pcc, view);
        pcc.pcc(view);
        pcc.pcc((qf) new gm.sf());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        throw new RuntimeException("Attempting to layout a VirtualYogaLayout");
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new gm.pcc(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new gm.pcc(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof gm.pcc;
    }
}
