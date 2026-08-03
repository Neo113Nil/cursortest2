package com.fyber.inneractive.sdk.ui;

/* loaded from: classes3.dex */
public class IAcloseButton extends android.view.View {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Paint f4270a;
    public final android.graphics.Path b;

    public IAcloseButton(android.content.Context context, int i) {
        super(context);
        int b = com.fyber.inneractive.sdk.util.o.b(10);
        int i2 = ((i - (b * 2)) / 4) + b;
        android.graphics.Point point = new android.graphics.Point(i2, i2);
        int i3 = i - i2;
        android.graphics.Point point2 = new android.graphics.Point(i2, i3);
        android.graphics.Point point3 = new android.graphics.Point(i3, i3);
        android.graphics.Point point4 = new android.graphics.Point(i3, i2);
        android.graphics.Path path = new android.graphics.Path();
        this.b = path;
        path.setFillType(android.graphics.Path.FillType.EVEN_ODD);
        path.moveTo(point.x, point.y);
        path.lineTo(point3.x, point3.y);
        path.moveTo(point2.x, point2.y);
        path.lineTo(point4.x, point4.y);
        path.close();
        android.graphics.Paint paint = new android.graphics.Paint(1);
        this.f4270a = paint;
        paint.setStrokeWidth(com.fyber.inneractive.sdk.util.o.b(2));
        paint.setColor(-1);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setAntiAlias(true);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(-1436657061);
        gradientDrawable.setStroke(com.fyber.inneractive.sdk.util.o.b(2), -1);
        com.fyber.inneractive.sdk.util.o.a(this, gradientDrawable);
        setPadding(b, b, b, b);
    }

    @Override // android.view.View
    public final void onDraw(android.graphics.Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.b, this.f4270a);
    }
}
