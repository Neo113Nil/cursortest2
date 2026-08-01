package com.bytedance.sdk.openadsdk.common;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes4.dex */
public class jr extends View {
    private final pcc pcc;
    private View sf;

    public interface pcc {
        View pcc(Context context);
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    public jr(Context context, pcc pccVar) {
        super(context);
        this.pcc = pccVar;
        pcc();
    }

    private void pcc() {
        setVisibility(8);
        setWillNotDraw(true);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        View view = this.sf;
        if (view != null) {
            view.setVisibility(i);
            return;
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            sf();
        }
    }

    private View sf() {
        pcc pccVar;
        if (this.sf == null && (pccVar = this.pcc) != null) {
            this.sf = pccVar.pcc(getContext());
            pcc(this.sf, (ViewGroup) getParent());
        }
        return this.sf;
    }

    private void pcc(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
