package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Tj extends android.widget.ImageView {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public double f4981a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Tj(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f4981a = 1.0d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (size2 * this.f4981a), size2);
            return;
        }
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (size / this.f4981a));
            return;
        }
        double d = this.f4981a;
        int i3 = (int) (size / d);
        if (i3 <= size2) {
            setMeasuredDimension(size, i3);
        } else {
            setMeasuredDimension((int) (size2 * d), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        this.f4981a = bitmap.getWidth() / bitmap.getHeight();
        requestLayout();
    }
}
