package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Os, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0938Os extends android.widget.FrameLayout {
    public int A00;
    public int A01;
    public boolean A02;
    public boolean A03;
    public final android.graphics.Rect A04;
    public final android.graphics.Rect A05;
    public final com.facebook.ads.redexgen.core.InterfaceC0939Ot A06;
    public static java.lang.String[] A07 = {"ShNBvS5", "b2z1l7evnHkZXpFh4jUAU", "JfQekQfzdw1mJ2RkSzlEvaL1jVLq96XT", "0M9zDLqBQAVDpkbZHtwaURqwF1mV2f1S", "jQ6MUrNiHIuV2Q80zD0eWZ3NfiJ07L6A", "0up6ixfDqbrZOotDwCZ4gMtZBiUGrTem", "xF0da7GYt9A5Qra0MND7i27I5BG4MHvn", "fGPiNZIH9FIGNZUMCtCVq24hO8AJIHug"};
    public static final int[] A0B = {android.R.attr.colorBackground};
    public static final float A08 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
    public static final int A09 = (int) (A08 * 1.0f);
    public static final com.facebook.ads.redexgen.core.InterfaceC0940Ou A0A = new com.facebook.ads.redexgen.core.C1722i9();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public C0938Os(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = new android.graphics.Rect();
        this.A05 = new android.graphics.Rect();
        this.A06 = new com.facebook.ads.redexgen.core.C1723iA(this);
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(A0B);
        int color = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
        android.graphics.Color.colorToHSV(color, new float[3]);
        android.content.res.ColorStateList valueOf = android.content.res.ColorStateList.valueOf(-328966);
        this.A02 = false;
        this.A03 = true;
        this.A04.left = 0;
        this.A04.top = 0;
        this.A04.right = 0;
        this.A04.bottom = 0;
        float f = 10.0f > 50.0f ? 10.0f : 50.0f;
        this.A01 = 0;
        this.A00 = 0;
        A0A.AAG(this.A06, context, valueOf, 10.0f, 10.0f, f);
    }

    static {
        A0A.AAE();
    }

    public C0938Os(android.content.Context context) {
        this(context, null);
    }

    public C0938Os(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
        return A0A.A71(this.A06);
    }

    public float getCardElevation() {
        return A0A.A7v(this.A06);
    }

    public int getContentPaddingBottom() {
        return this.A04.bottom;
    }

    public int getContentPaddingLeft() {
        return this.A04.left;
    }

    public int getContentPaddingRight() {
        return this.A04.right;
    }

    public int getContentPaddingTop() {
        return this.A04.top;
    }

    public float getMaxCardElevation() {
        return A0A.A8S(this.A06);
    }

    public boolean getPreventCornerOverlap() {
        return this.A03;
    }

    public float getRadius() {
        return A0A.A8r(this.A06);
    }

    public boolean getUseCompatPadding() {
        return this.A02;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!(A0A instanceof com.facebook.ads.redexgen.core.C1722i9)) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            switch (mode) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    int minWidth = (int) java.lang.Math.ceil(A0A.A8Y(this.A06));
                    i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max(minWidth, android.view.View.MeasureSpec.getSize(i)), mode);
                    break;
            }
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            if (A07[1].length() == 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A07;
            strArr[4] = "ezVHALe6egolV0dGNwTkgEwTmiIckZEU";
            strArr[5] = "9kVtZpYuS1B6eNaF5MtLQpOmcikxmxeD";
            switch (mode2) {
                case Integer.MIN_VALUE:
                case 1073741824:
                    i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((int) java.lang.Math.ceil(A0A.A8X(this.A06)), android.view.View.MeasureSpec.getSize(i2)), mode2);
                    break;
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setCardBackgroundColor(int i) {
        A0A.AJJ(this.A06, android.content.res.ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList colorStateList) {
        A0A.AJJ(this.A06, colorStateList);
    }

    public void setCardElevation(float f) {
        A0A.AJP(this.A06, f);
    }

    public void setMaxCardElevation(float f) {
        A0A.AJX(this.A06, f);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.A00 = i;
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.A01 = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.A03) {
            this.A03 = z;
            A0A.AFT(this.A06);
        }
    }

    public void setRadius(float f) {
        A0A.AJj(this.A06, f);
    }

    public void setUseCompatPadding(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            A0A.ADP(this.A06);
        }
    }
}
