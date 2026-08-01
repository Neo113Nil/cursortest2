package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import sg.bigo.ads.K0.AbstractC4963u;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public class YandexWarningTextView extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public int f12716a;
    public int b;
    public float c;
    public int d;
    public int e;
    public float f;
    public boolean g;
    public int h;
    public float i;
    public int j;
    public int k;

    public YandexWarningTextView(Context context) {
        super(context);
        this.f12716a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        a(null);
    }

    public final void a(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.BigoAd_YandexWarningTextView);
            this.f12716a = (int) ((obtainStyledAttributes.getDimensionPixelSize(R.styleable.BigoAd_YandexWarningTextView_bigo_ad_maxTextSize, this.f12716a) / getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5d);
            this.b = (int) ((obtainStyledAttributes.getDimensionPixelSize(R.styleable.BigoAd_YandexWarningTextView_bigo_ad_minTextSize, this.b) / getContext().getResources().getDisplayMetrics().scaledDensity) + 0.5d);
            obtainStyledAttributes.recycle();
        }
        this.j = getContext().getResources().getDisplayMetrics().heightPixels;
        this.k = AbstractC4963u.c(getContext());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        int i = this.e;
        if (i > 2) {
            i = 2;
        }
        canvas.save();
        canvas.scale(1.0f, ((this.d * 1.0f) / i) / this.f, 0.0f, this.i);
        super.onDraw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00e5 A[Catch: all -> 0x00fa, TryCatch #0 {all -> 0x00fa, blocks: (B:5:0x0007, B:10:0x0013, B:11:0x004f, B:13:0x0059, B:16:0x0080, B:18:0x00b6, B:23:0x00bf, B:24:0x00df, B:26:0x00e5, B:28:0x00e9, B:29:0x00eb, B:35:0x00d8, B:36:0x00dd, B:37:0x00c9, B:42:0x00db, B:43:0x005f, B:45:0x0066), top: B:4:0x0007 }] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        float f;
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        try {
            if (TextUtils.isEmpty(getText())) {
                return;
            }
            int paddingLeft = (i - getPaddingLeft()) - getPaddingRight();
            int paddingTop = (i2 - getPaddingTop()) - getPaddingBottom();
            this.d = paddingTop;
            float f2 = this.f12716a;
            float f3 = paddingTop * 0.5f;
            this.c = f3;
            setLineSpacing(f3, 0.0f);
            setTextSize(2, f2);
            StaticLayout staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.c, true);
            while (true) {
                if ((staticLayout.getHeight() > this.d || staticLayout.getWidth() > paddingLeft) && f2 > this.b) {
                    f2 -= 1.0f;
                    setTextSize(2, f2);
                    staticLayout = new StaticLayout(getText(), getPaint(), paddingLeft, Layout.Alignment.ALIGN_NORMAL, 0.0f, this.c, true);
                }
            }
            this.e = staticLayout.getLineCount();
            this.h = staticLayout.getLineAscent(0);
            this.f = (int) ((getContext().getResources().getDisplayMetrics().scaledDensity * Math.round(f2)) + 0.5d);
            int abs = Math.abs(this.h);
            boolean z = this.g;
            if (!z && 1 != (i5 = this.e)) {
                if (i5 >= 3) {
                    this.i = 0.0f;
                    if (this.k <= 1000 && this.j <= 1000) {
                        this.i = 0.0f;
                    }
                    setLineSpacing(this.f, 0.0f);
                    getPaint().getTextScaleX();
                    staticLayout.getLineTop(0);
                }
                if (f2 <= 36.0f) {
                    f = (abs * 1.0f) / i5;
                    this.i = f;
                    if (this.k <= 1000) {
                    }
                    setLineSpacing(this.f, 0.0f);
                    getPaint().getTextScaleX();
                    staticLayout.getLineTop(0);
                }
                f = abs * 1.1f;
                this.i = f;
                if (this.k <= 1000) {
                    this.i = 0.0f;
                }
                setLineSpacing(this.f, 0.0f);
                getPaint().getTextScaleX();
                staticLayout.getLineTop(0);
            }
            if (!z || f2 <= 20.0f) {
                f = abs / 2.0f;
                this.i = f;
                if (this.k <= 1000) {
                }
                setLineSpacing(this.f, 0.0f);
                getPaint().getTextScaleX();
                staticLayout.getLineTop(0);
            }
            f = abs * 1.1f;
            this.i = f;
            if (this.k <= 1000) {
            }
            setLineSpacing(this.f, 0.0f);
            getPaint().getTextScaleX();
            staticLayout.getLineTop(0);
        } catch (Throwable unused) {
        }
    }

    public void setIsHorizontal(boolean z) {
        this.g = z;
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12716a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        a(attributeSet);
    }

    public YandexWarningTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12716a = 25;
        this.b = 10;
        this.c = 35.0f;
        this.e = 1;
        this.f = 50.0f;
        this.g = false;
        this.h = 0;
        this.i = 0.0f;
        this.j = 1000;
        this.k = 1000;
        a(attributeSet);
    }
}
