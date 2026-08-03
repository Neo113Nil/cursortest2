package com.inmobi.media;

/* renamed from: com.inmobi.media.l5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2555l5 extends android.view.TextureView {

    /* renamed from: a, reason: collision with root package name */
    public float f5309a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2555l5(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f5309a = 1.0f;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = android.view.View.MeasureSpec.getSize(i);
        int size2 = android.view.View.MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            float f = this.f5309a;
            if (f > 0.0f) {
                int i3 = (int) (size / f);
                if (i3 <= size2) {
                    setMeasuredDimension(size, i3);
                    return;
                } else {
                    setMeasuredDimension((int) (size2 * f), size2);
                    return;
                }
            }
        }
        super.onMeasure(i, i2);
    }

    public final void setAspectRatio(float f) {
        if (this.f5309a <= 0.0f) {
            return;
        }
        this.f5309a = f;
        requestLayout();
    }
}
