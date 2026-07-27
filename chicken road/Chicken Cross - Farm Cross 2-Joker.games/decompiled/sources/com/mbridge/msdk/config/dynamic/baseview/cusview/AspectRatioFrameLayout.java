package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes6.dex */
public final class AspectRatioFrameLayout extends FrameLayout {
    public static final int RESIZE_MODE_FILL = 3;
    public static final int RESIZE_MODE_FIT = 0;
    public static final int RESIZE_MODE_FIXED_HEIGHT = 2;
    public static final int RESIZE_MODE_FIXED_WIDTH = 1;
    public static final int RESIZE_MODE_ZOOM = 4;

    /* renamed from: a, reason: collision with root package name */
    private final c f9067a;
    private float b;
    private int c;

    public interface b {
    }

    private final class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private float f9068a;
        private float b;
        private boolean c;
        private boolean d;

        private c() {
        }

        public void a(float f, float f2, boolean z) {
            this.f9068a = f;
            this.b = f2;
            this.c = z;
            if (this.d) {
                return;
            }
            this.d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.d = false;
            AspectRatioFrameLayout.a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    static /* synthetic */ b a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.c;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float f2;
        super.onMeasure(i, i2);
        if (this.b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f3 = measuredWidth;
        float f4 = measuredHeight;
        float f5 = f3 / f4;
        float f6 = (this.b / f5) - 1.0f;
        if (Math.abs(f6) <= 0.01f) {
            this.f9067a.a(this.b, f5, false);
            return;
        }
        int i3 = this.c;
        if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    f = this.b;
                } else if (i3 == 4) {
                    if (f6 > 0.0f) {
                        f = this.b;
                    } else {
                        f2 = this.b;
                    }
                }
                measuredWidth = (int) (f4 * f);
            } else {
                f2 = this.b;
            }
            measuredHeight = (int) (f3 / f2);
        } else if (f6 > 0.0f) {
            f2 = this.b;
            measuredHeight = (int) (f3 / f2);
        } else {
            f = this.b;
            measuredWidth = (int) (f4 * f);
        }
        this.f9067a.a(this.b, f5, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.b != f) {
            this.b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
    }

    public void setResizeMode(int i) {
        int i2 = this.c;
        int i3 = 1;
        if (i == 1) {
            i3 = 0;
        } else if (i == 2) {
            i3 = 3;
        } else if (i == 3) {
            i3 = 4;
        } else if (i != 4) {
            i3 = i != 5 ? i2 : 2;
        }
        if (i2 != i3) {
            this.c = i3;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = 0;
        this.f9067a = new c();
    }
}
