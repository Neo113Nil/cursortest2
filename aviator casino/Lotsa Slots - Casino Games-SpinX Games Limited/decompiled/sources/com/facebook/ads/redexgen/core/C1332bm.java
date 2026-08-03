package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.bm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1332bm extends android.widget.LinearLayout {
    public static final int A06 = (int) (com.facebook.ads.redexgen.core.XX.A02 * 4.0f);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final com.facebook.ads.redexgen.core.C1636gi A04;
    public final com.facebook.ads.redexgen.core.C1333bn[] A05;

    public C1332bm(com.facebook.ads.redexgen.core.C1636gi c1636gi, int i, int i2, int i3, int i4) {
        super(c1636gi);
        this.A00 = A06;
        this.A04 = c1636gi;
        setOrientation(0);
        this.A03 = i;
        this.A01 = i3;
        this.A02 = i4;
        this.A05 = new com.facebook.ads.redexgen.core.C1333bn[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            this.A05[i5] = A00();
            addView(this.A05[i5]);
        }
        A01();
    }

    private com.facebook.ads.redexgen.core.C1333bn A00() {
        com.facebook.ads.redexgen.core.C1333bn c1333bn = new com.facebook.ads.redexgen.core.C1333bn(this.A04, this.A01, this.A02);
        android.widget.LinearLayout.LayoutParams starRatingViewParams = new android.widget.LinearLayout.LayoutParams(this.A03, this.A03);
        starRatingViewParams.gravity = 16;
        c1333bn.setLayoutParams(starRatingViewParams);
        return c1333bn;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A01() {
        int i = 0;
        while (i < i) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.A05[i].getLayoutParams();
            int i2 = i == 0 ? 0 : this.A00;
            layoutParams.leftMargin = i2;
            i++;
        }
        requestLayout();
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void A02(float f) {
        for (int i = 0; i < i; i++) {
            float fillRatio = java.lang.Math.min(1.0f, f - i);
            if (fillRatio < 0.0f) {
                fillRatio = 0.0f;
            }
            this.A05[i].setFillRatio(fillRatio);
        }
    }

    public void setItemSpacing(int i) {
        this.A00 = i;
        A01();
    }

    public void setRating(float f) {
        A02(f);
    }
}
