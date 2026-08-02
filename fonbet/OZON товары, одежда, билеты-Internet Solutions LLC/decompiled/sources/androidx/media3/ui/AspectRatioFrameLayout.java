package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f44107d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final a f44108a;

    /* renamed from: b, reason: collision with root package name */
    private float f44109b;

    /* renamed from: c, reason: collision with root package name */
    private int f44110c;

    private final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private boolean f44111a;

        a() {
        }

        public final void a(float f7, float f11, boolean z11) {
            if (this.f44111a) {
                return;
            }
            this.f44111a = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f44111a = false;
            int i11 = AspectRatioFrameLayout.f44107d;
            AspectRatioFrameLayout.this.getClass();
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44110c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, x4.c.f105018a, 0, 0);
            try {
                this.f44110c = obtainStyledAttributes.getInt(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f44108a = new a();
    }

    public final void a(float f7) {
        if (this.f44109b != f7) {
            this.f44109b = f7;
            requestLayout();
        }
    }

    public final void b(int i11) {
        if (this.f44110c != i11) {
            this.f44110c = i11;
            requestLayout();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i11, int i12) {
        float f7;
        float f11;
        super.onMeasure(i11, i12);
        if (this.f44109b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f12 = measuredWidth;
        float f13 = measuredHeight;
        float f14 = f12 / f13;
        float f15 = (this.f44109b / f14) - 1.0f;
        float abs = Math.abs(f15);
        a aVar = this.f44108a;
        if (abs <= 0.01f) {
            aVar.a(this.f44109b, f14, false);
            return;
        }
        int i13 = this.f44110c;
        if (i13 != 0) {
            if (i13 != 1) {
                if (i13 == 2) {
                    f7 = this.f44109b;
                } else if (i13 == 4) {
                    if (f15 > 0.0f) {
                        f7 = this.f44109b;
                    } else {
                        f11 = this.f44109b;
                    }
                }
                measuredWidth = (int) (f13 * f7);
            } else {
                f11 = this.f44109b;
            }
            measuredHeight = (int) (f12 / f11);
        } else if (f15 > 0.0f) {
            f11 = this.f44109b;
            measuredHeight = (int) (f12 / f11);
        } else {
            f7 = this.f44109b;
            measuredWidth = (int) (f13 * f7);
        }
        aVar.a(this.f44109b, f14, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }
}
