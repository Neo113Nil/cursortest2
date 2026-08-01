package sg.bigo.ads.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import sg.bigo.ads.R;

/* loaded from: classes3.dex */
public class RoundedFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public float f12713a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;
    public Paint g;
    public RectF h;
    public int i;
    public float j;
    public Paint k;
    public RectF l;

    public RoundedFrameLayout(Context context) {
        this(context, null);
    }

    private Path getPath() {
        Path path = new Path();
        float f = this.f12713a;
        float f2 = this.b;
        float f3 = this.d;
        float f4 = this.c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = this.l;
        if (rectF == null) {
            rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
        }
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        return path;
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.f12713a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int save = canvas.save();
        if (this.k != null) {
            float f = this.j;
            RectF rectF = new RectF(f, f, getWidth() - this.j, getHeight() - this.j);
            this.l = rectF;
            float f2 = this.f12713a;
            canvas.drawRoundRect(rectF, f2, f2, this.k);
        }
        canvas.clipPath(getPath());
        super.dispatchDraw(canvas);
        Paint paint = this.g;
        float f3 = this.e;
        RectF rectF2 = this.h;
        if (paint != null && rectF2 != null && f3 > 0.0f) {
            float width = getWidth();
            float height = getHeight();
            if (width > 0.0f && height > 0.0f) {
                paint.setColor(this.f);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(f3);
                paint.setAntiAlias(true);
                rectF2.set(0.0f, 0.0f, width, height);
                float f4 = this.f12713a;
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            }
        }
        canvas.restoreToCount(save);
    }

    public float getCornerRadiusBottomLeft() {
        return this.c;
    }

    public float getCornerRadiusBottomRight() {
        return this.d;
    }

    public float getCornerRadiusTopLeft() {
        return this.f12713a;
    }

    public float getCornerRadiusTopRight() {
        return this.b;
    }

    public void setCornerRadius(float f) {
        a(f, f, f, f);
    }

    public void setShadowColor(int i) {
        this.i = i;
        invalidate();
    }

    public void setShadowRadius(float f) {
        boolean z = this.k == null;
        this.j = f;
        if (z && f > 0.0f) {
            setLayerType(1, null);
            setWillNotDraw(false);
            Paint paint = new Paint();
            this.k = paint;
            paint.setShadowLayer(this.j, 0.0f, 0.0f, this.i);
        }
        invalidate();
    }

    public void setStrokeColor(int i) {
        this.f = i;
        if (this.g == null) {
            this.g = new Paint();
        }
        if (this.h == null) {
            this.h = new RectF();
        }
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.e = f;
        if (this.g == null) {
            this.g = new Paint();
        }
        if (this.h == null) {
            this.h = new RectF();
        }
        invalidate();
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.BigoAd_RoundedFrameLayout);
        try {
            float dimension = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_radius, 0.0f);
            this.f12713a = dimension;
            this.b = dimension;
            this.c = dimension;
            this.d = dimension;
            if (dimension == 0.0f) {
                this.f12713a = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_topLeftRadius, 0.0f);
                this.b = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_topRightRadius, 0.0f);
                this.c = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_bottomLeftRadius, 0.0f);
                this.d = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_bottomRightRadius, 0.0f);
            }
            this.i = obtainStyledAttributes.getColor(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_shadowColor, Color.parseColor("#00FFFFFF"));
            float dimension2 = obtainStyledAttributes.getDimension(R.styleable.BigoAd_RoundedFrameLayout_bigo_ad_shadowRadius, -1.0f);
            this.j = dimension2;
            if (dimension2 > 0.0f) {
                setLayerType(1, null);
                setWillNotDraw(false);
                Paint paint = new Paint();
                this.k = paint;
                paint.setShadowLayer(this.j, 0.0f, 0.0f, this.i);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
        obtainStyledAttributes.recycle();
    }
}
