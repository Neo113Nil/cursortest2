package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.h9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1663h9 extends com.facebook.ads.redexgen.core.Pv {
    public int A00;

    public C1663h9(android.content.Context context) {
        super(context);
        this.A00 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A00(int i) {
        this.A00 = i;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    @Override // com.facebook.ads.redexgen.core.Pv, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int h = this.A00;
        for (int i3 = 0; i3 < height; i3++) {
            android.view.View childAt = getChildAt(i3);
            int height = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            childAt.measure(i, height);
            int height2 = childAt.getMeasuredHeight();
            if (height2 > h) {
                h = height2;
            }
        }
        int height3 = android.view.View.MeasureSpec.makeMeasureSpec(h, 1073741824);
        super.onMeasure(i, height3);
    }
}
