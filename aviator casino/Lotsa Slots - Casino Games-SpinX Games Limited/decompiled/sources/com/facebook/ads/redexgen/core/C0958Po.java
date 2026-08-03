package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0958Po extends android.view.ViewGroup.LayoutParams {
    public float A00;
    public int A01;
    public int A02;
    public boolean A03;
    public int A04;
    public boolean A05;

    public C0958Po() {
        super(-1, -1);
        this.A00 = 0.0f;
    }

    public C0958Po(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = 0.0f;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, com.facebook.ads.redexgen.core.Pv.A0u);
        this.A04 = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
