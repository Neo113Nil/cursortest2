package com.google.firebase.inappmessaging.display.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import p000.C0200f6;
import p000.m80;
import p000.vr0;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public class ResizableImageView extends C0200f6 {

    /* JADX INFO: renamed from: m */
    public final int f1361m;

    public ResizableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1361m = (int) (context.getResources().getDisplayMetrics().density * 160.0f);
    }

    /* JADX INFO: renamed from: a */
    public final vr0 m1004a(int i, int i2) {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        if (i > maxWidth) {
            m80.m3344k("Image: capping width", maxWidth);
            i2 = (i2 * maxWidth) / i;
            i = maxWidth;
        }
        if (i2 > maxHeight) {
            m80.m3344k("Image: capping height", maxHeight);
            i = (i * maxHeight) / i2;
        } else {
            maxHeight = i2;
        }
        return new vr0(i, maxHeight);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Drawable drawable = getDrawable();
        boolean adjustViewBounds = getAdjustViewBounds();
        if (drawable == null || !adjustViewBounds) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        m80.m3345l("Image: intrinsic width, height", intrinsicWidth, intrinsicHeight);
        int i3 = this.f1361m;
        vr0 vr0VarM1004a = m1004a((int) Math.ceil((intrinsicWidth * i3) / 160), (int) Math.ceil((intrinsicHeight * i3) / 160));
        int i4 = vr0VarM1004a.f8254a;
        int i5 = vr0VarM1004a.f8255b;
        m80.m3345l("Image: new target dimensions", i4, i5);
        setMeasuredDimension(i4, i5);
        int iMax = Math.max(getMinimumWidth(), getSuggestedMinimumWidth());
        int iMax2 = Math.max(getMinimumHeight(), getSuggestedMinimumHeight());
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f = iMax;
        float f2 = iMax2;
        m80.m3345l("Image: min width, height", f, f2);
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        m80.m3345l("Image: actual width, height", f3, f4);
        float f5 = measuredWidth < iMax ? f / f3 : 1.0f;
        float f6 = measuredHeight < iMax2 ? f2 / f4 : 1.0f;
        if (f5 <= f6) {
            f5 = f6;
        }
        if (f5 > 1.0d) {
            int iCeil = (int) Math.ceil(f3 * f5);
            int iCeil2 = (int) Math.ceil(f4 * f5);
            m80.m3343j("Measured dimension (" + measuredWidth + "x" + measuredHeight + ") too small.  Resizing to " + iCeil + "x" + iCeil2);
            vr0 vr0VarM1004a2 = m1004a(iCeil, iCeil2);
            setMeasuredDimension(vr0VarM1004a2.f8254a, vr0VarM1004a2.f8255b);
        }
    }
}
