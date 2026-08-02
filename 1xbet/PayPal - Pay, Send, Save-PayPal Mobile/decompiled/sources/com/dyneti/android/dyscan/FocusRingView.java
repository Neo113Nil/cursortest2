package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public class FocusRingView extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f3286a;
    public boolean b;

    public FocusRingView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f3286a = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeCap(android.graphics.Paint.Cap.ROUND);
        paint.setStrokeWidth(2.0f);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        canvas.drawColor(android.graphics.Color.argb(0, 0, 0, 0));
        if (this.b) {
            canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, 150.0f, this.f3286a);
        }
    }
}
