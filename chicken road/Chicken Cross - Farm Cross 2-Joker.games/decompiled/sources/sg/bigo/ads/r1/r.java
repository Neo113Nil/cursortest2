package sg.bigo.ads.r1;

import android.content.Context;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import sg.bigo.ads.w0.AbstractC5496a;

/* loaded from: classes3.dex */
public final class r extends TextureView {

    /* renamed from: a, reason: collision with root package name */
    public int f13282a;
    public int b;
    public final int c;

    public r(Context context, int i, int i2, int i3) {
        super(context);
        this.f13282a = i;
        this.b = i2;
        this.c = i3;
        setLayoutParams((i3 == 1 || i3 == 4) ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-1, -2, 17));
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r13 != 4) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        if (r0 < r9) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
    
        r3 = r0 / r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a8, code lost:
    
        r5 = r9 / r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r0 < r9) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        double d;
        double d2;
        double d3;
        double d4;
        super.onMeasure(i, i2);
        if (this.f13282a <= 0 || this.b <= 0) {
            AbstractC5496a.a("VideoTextureView", "video width or height is invalidate");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE || mode == 0 || mode == 1073741824) {
            int i3 = this.c;
            if (i3 != 1 && i3 != 2 && i3 != 4) {
                setMeasuredDimension(size, (int) (((this.b * 1.0f) * size) / this.f13282a));
                return;
            }
            double measuredWidth = getMeasuredWidth();
            double measuredHeight = getMeasuredHeight();
            int i4 = getContext().getResources().getDisplayMetrics().heightPixels;
            if (measuredWidth <= 0.0d && measuredHeight <= 0.0d) {
                measuredWidth = this.f13282a;
                measuredHeight = this.b;
            } else if (measuredWidth <= 0.0d) {
                measuredWidth = (this.f13282a * measuredHeight) / this.b;
            } else if (measuredHeight <= 0.0d) {
                measuredHeight = (this.b * measuredWidth) / this.f13282a;
            } else {
                if (i3 != 1) {
                    if (i3 == 2) {
                        d = this.f13282a;
                        d2 = d * measuredHeight;
                        d3 = this.b;
                        d4 = measuredWidth * d3;
                    }
                }
                d = this.f13282a;
                d2 = d * measuredHeight;
                d3 = this.b;
                d4 = measuredWidth * d3;
            }
            setMeasuredDimension((int) measuredWidth, (int) measuredHeight);
        }
    }
}
