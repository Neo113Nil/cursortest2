package sg.bigo.ads.common.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import sg.bigo.ads.K0.AbstractC4963u;

/* loaded from: classes3.dex */
public class Indicator extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f12709a;
    public Paint b;
    public Paint c;
    public int d;
    public float e;
    public int f;
    public float g;
    public int h;
    public float i;
    public float j;
    public int k;
    public float l;
    public float m;

    public Indicator(Context context) {
        this(context, null);
    }

    public float getDistance() {
        return this.i;
    }

    public float getLengthSelected() {
        return this.g;
    }

    public float getRadius() {
        return this.e;
    }

    public int getType() {
        return this.f12709a;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        if (this.f12709a == 1) {
            if (this.l <= 0.0f) {
                return;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            float f2 = this.e;
            float f3 = this.l;
            canvas.translate(((width - f3) / 2.0f) + f2, height / 2.0f);
            Paint paint = new Paint();
            this.b = paint;
            paint.setStyle(Paint.Style.FILL);
            this.b.setColor(this.f);
            this.b.setAntiAlias(true);
            this.b.setStrokeWidth(3.0f);
            Paint paint2 = new Paint(this.b);
            this.c = paint2;
            paint2.setColor(this.h);
            float f4 = this.e;
            RectF rectF = new RectF(0.0f, -f4, f3, f4);
            float f5 = this.e;
            canvas.drawRoundRect(rectF, f5, f5, this.b);
            float f6 = (f3 - this.g) * this.m;
            float f7 = this.e;
            RectF rectF2 = new RectF(f6, -f7, this.g + f6, f7);
            float f8 = this.e;
            canvas.drawRoundRect(rectF2, f8, f8, this.c);
            return;
        }
        if (this.d <= 0) {
            return;
        }
        float width2 = canvas.getWidth();
        float height2 = canvas.getHeight();
        float f9 = this.e;
        float f10 = this.d - 1;
        canvas.translate(((((width2 - getPaddingLeft()) - getPaddingRight()) - (((this.i * f10) + ((f9 * 2.0f) * f10)) + this.g)) / 2.0f) + getPaddingLeft() + this.e, (((height2 - getPaddingTop()) - getPaddingBottom()) / 2.0f) + getPaddingTop());
        Paint paint3 = new Paint();
        this.b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.b.setColor(this.f);
        this.b.setAntiAlias(true);
        this.b.setStrokeWidth(3.0f);
        Paint paint4 = new Paint(this.b);
        this.c = paint4;
        paint4.setColor(this.h);
        float f11 = -this.e;
        for (int i = 0; i < this.d; i++) {
            if (i == this.k) {
                float f12 = this.e;
                canvas.drawCircle(f11 + f12, 0.0f, f12, this.b);
                float f13 = this.g + f11;
                float f14 = this.e;
                canvas.drawCircle(f13 - f14, 0.0f, f14, this.b);
                float f15 = (this.i * this.j) + f11;
                float f16 = this.e;
                RectF rectF3 = new RectF(f15, -f16, this.g + f15, f16);
                float f17 = this.e;
                canvas.drawRoundRect(rectF3, f17, f17, this.c);
                f = this.g;
            } else {
                float f18 = this.e;
                canvas.drawCircle(f11 + f18, 0.0f, f18, this.b);
                f = this.e * 2.0f;
            }
            f11 = f11 + f + this.i;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int defaultSize;
        int defaultSize2;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        float f = this.d - 1;
        float paddingLeft = (this.i * f) + (this.e * 2.0f * f) + this.g + getPaddingLeft() + getPaddingRight();
        float paddingTop = (this.e * 2.0f) + getPaddingTop() + getPaddingBottom();
        if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
            defaultSize = (int) paddingLeft;
            defaultSize2 = (int) paddingTop;
        } else if (mode == Integer.MIN_VALUE) {
            setMeasuredDimension((int) paddingLeft, size2);
            return;
        } else if (mode2 == Integer.MIN_VALUE) {
            setMeasuredDimension(size, (int) paddingTop);
            return;
        } else {
            defaultSize = View.getDefaultSize(getSuggestedMinimumWidth(), i);
            defaultSize2 = View.getDefaultSize(getSuggestedMinimumHeight(), i2);
        }
        setMeasuredDimension(defaultSize, defaultSize2);
    }

    public void setColor(int i) {
        if (this.f != i) {
            this.f = i;
            invalidate();
        }
    }

    public void setColorSelected(int i) {
        if (this.h != i) {
            this.h = i;
            invalidate();
        }
    }

    public void setLineLength(float f) {
        if (this.l != f) {
            this.l = f;
            requestLayout();
            invalidate();
        }
    }

    public void setNum(int i) {
        if (this.d != i) {
            this.d = i;
            requestLayout();
            invalidate();
        }
    }

    public void setRadius(float f) {
        if (f != this.e) {
            this.e = f;
            this.g = 8.0f * f;
            this.i = f * 2.0f;
            requestLayout();
            invalidate();
        }
    }

    public void setType(int i) {
        if (this.f12709a != i) {
            this.f12709a = i;
            invalidate();
        }
    }

    public Indicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Indicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12709a = 0;
        this.f = -2130706433;
        float a2 = AbstractC4963u.a(getContext(), 2);
        this.e = a2;
        this.h = -1;
        this.g = 8.0f * a2;
        this.i = a2 * 2.0f;
        this.d = 0;
        this.j = 0.0f;
        this.k = 0;
    }
}
