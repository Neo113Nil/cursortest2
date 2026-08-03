package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1469e0 {
    public final int[] A00(android.view.View view, int i, int i2) {
        com.facebook.ads.redexgen.core.R3 r3 = (com.facebook.ads.redexgen.core.R3) view.getLayoutParams();
        int childHeightSpec = android.view.ViewGroup.getChildMeasureSpec(i, view.getPaddingLeft() + view.getPaddingRight(), r3.width);
        int childWidthSpec = view.getPaddingTop();
        view.measure(childHeightSpec, android.view.ViewGroup.getChildMeasureSpec(i2, childWidthSpec + view.getPaddingBottom(), r3.height));
        int childWidthSpec2 = view.getMeasuredWidth();
        int childWidthSpec3 = view.getMeasuredHeight();
        return new int[]{childWidthSpec2 + r3.leftMargin + r3.rightMargin, childWidthSpec3 + r3.bottomMargin + r3.topMargin};
    }
}
