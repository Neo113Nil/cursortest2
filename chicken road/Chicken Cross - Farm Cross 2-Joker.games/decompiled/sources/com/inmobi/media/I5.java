package com.inmobi.media;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class I5 extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    public float f6618a;
    public int b;
    public int c;
    public int d;
    public int e;
    public Cg f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I5(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f6618a = 1.0f;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i == this.b && i2 == this.c && i5 == this.d && i6 == this.e) {
            return;
        }
        this.b = i;
        this.c = i2;
        this.d = i5;
        this.e = i6;
        Cg cg = this.f;
        if (cg != null) {
            cg.a(i, i2, i5, i6);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size != 0 && size2 != 0) {
            float f = this.f6618a;
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
        if (f <= 0.0f) {
            return;
        }
        this.f6618a = f;
        requestLayout();
    }

    public final void setOnPositionChangeListener(Cg cg) {
        this.f = cg;
    }
}
