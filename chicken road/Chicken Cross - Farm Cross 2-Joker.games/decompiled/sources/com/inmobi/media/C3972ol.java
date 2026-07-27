package com.inmobi.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ol, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3972ol extends ImageView {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    public double f7291a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3972ol(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f7291a = 1.0d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == 0 && size2 == 0) {
            super.onMeasure(i, i2);
            return;
        }
        if (size == 0) {
            setMeasuredDimension((int) (size2 * this.f7291a), size2);
            return;
        }
        if (size2 == 0) {
            setMeasuredDimension(size, (int) (size / this.f7291a));
            return;
        }
        double d = this.f7291a;
        int i3 = (int) (size / d);
        if (i3 <= size2) {
            setMeasuredDimension(size, i3);
        } else {
            setMeasuredDimension((int) (size2 * d), size2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        if (bitmap == null || bitmap.getHeight() <= 0) {
            return;
        }
        this.f7291a = bitmap.getWidth() / bitmap.getHeight();
        requestLayout();
    }
}
