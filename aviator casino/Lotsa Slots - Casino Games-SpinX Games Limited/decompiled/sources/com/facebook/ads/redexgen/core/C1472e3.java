package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.e3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1472e3 extends android.widget.RelativeLayout {
    public final android.graphics.Paint A00;
    public final android.graphics.RectF A01;

    public C1472e3(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        super(c1636gi);
        float f = c1636gi.getResources().getDisplayMetrics().density;
        android.widget.TextView textView = new android.widget.TextView(c1636gi);
        textView.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        textView.setTextSize(16.0f);
        textView.setText(str);
        textView.setTypeface(android.graphics.Typeface.defaultFromStyle(1));
        setGravity(17);
        float density = 6.0f * f;
        int i = (int) density;
        textView.setPadding(i, i, i, i);
        addView(textView);
        this.A00 = new android.graphics.Paint();
        this.A00.setStyle(android.graphics.Paint.Style.FILL);
        this.A00.setColor(-1);
        this.A01 = new android.graphics.RectF();
        com.facebook.ads.redexgen.core.YB.A0N(this, 0);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.A01.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.drawRoundRect(this.A01, f * 10.0f, 10.0f * f, this.A00);
        super.onDraw(canvas);
    }
}
