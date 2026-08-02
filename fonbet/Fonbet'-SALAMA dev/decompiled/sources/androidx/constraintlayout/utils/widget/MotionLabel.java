package androidx.constraintlayout.utils.widget;

import A.e;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.salamadev.khotabaljomo3a.kichkabdelhamid.R;
import p6.c;
import z.InterfaceC1804b;

/* loaded from: classes.dex */
public class MotionLabel extends View implements InterfaceC1804b {

    /* renamed from: A, reason: collision with root package name */
    public float f8935A;

    /* renamed from: B, reason: collision with root package name */
    public float f8936B;

    /* renamed from: C, reason: collision with root package name */
    public final int f8937C;

    /* renamed from: D, reason: collision with root package name */
    public final int f8938D;

    /* renamed from: E, reason: collision with root package name */
    public float f8939E;

    /* renamed from: F, reason: collision with root package name */
    public String f8940F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f8941G;

    /* renamed from: H, reason: collision with root package name */
    public final Rect f8942H;

    /* renamed from: I, reason: collision with root package name */
    public int f8943I;

    /* renamed from: J, reason: collision with root package name */
    public int f8944J;

    /* renamed from: K, reason: collision with root package name */
    public int f8945K;

    /* renamed from: L, reason: collision with root package name */
    public int f8946L;

    /* renamed from: M, reason: collision with root package name */
    public final String f8947M;

    /* renamed from: N, reason: collision with root package name */
    public int f8948N;

    /* renamed from: O, reason: collision with root package name */
    public final int f8949O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f8950P;

    /* renamed from: Q, reason: collision with root package name */
    public float f8951Q;

    /* renamed from: R, reason: collision with root package name */
    public float f8952R;

    /* renamed from: S, reason: collision with root package name */
    public float f8953S;

    /* renamed from: T, reason: collision with root package name */
    public final Drawable f8954T;

    /* renamed from: U, reason: collision with root package name */
    public Matrix f8955U;

    /* renamed from: V, reason: collision with root package name */
    public final Bitmap f8956V;

    /* renamed from: W, reason: collision with root package name */
    public final BitmapShader f8957W;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f8958a;

    /* renamed from: a0, reason: collision with root package name */
    public final Matrix f8959a0;

    /* renamed from: b, reason: collision with root package name */
    public Path f8960b;

    /* renamed from: b0, reason: collision with root package name */
    public float f8961b0;

    /* renamed from: c, reason: collision with root package name */
    public int f8962c;
    public float c0;

    /* renamed from: d, reason: collision with root package name */
    public int f8963d;

    /* renamed from: d0, reason: collision with root package name */
    public float f8964d0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8965e;

    /* renamed from: e0, reason: collision with root package name */
    public float f8966e0;

    /* renamed from: f, reason: collision with root package name */
    public float f8967f;

    /* renamed from: f0, reason: collision with root package name */
    public final Paint f8968f0;

    /* renamed from: g0, reason: collision with root package name */
    public final int f8969g0;

    /* renamed from: h0, reason: collision with root package name */
    public Rect f8970h0;

    /* renamed from: i0, reason: collision with root package name */
    public Paint f8971i0;

    /* renamed from: j0, reason: collision with root package name */
    public float f8972j0;

    /* renamed from: k0, reason: collision with root package name */
    public float f8973k0;

    /* renamed from: l0, reason: collision with root package name */
    public float f8974l0;

    /* renamed from: m0, reason: collision with root package name */
    public float f8975m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f8976n0;

    /* renamed from: x, reason: collision with root package name */
    public float f8977x;

    /* renamed from: y, reason: collision with root package name */
    public ViewOutlineProvider f8978y;

    /* renamed from: z, reason: collision with root package name */
    public RectF f8979z;

    public MotionLabel(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        Typeface typeface;
        TextPaint textPaint = new TextPaint();
        this.f8958a = textPaint;
        this.f8960b = new Path();
        this.f8962c = 65535;
        this.f8963d = 65535;
        this.f8965e = false;
        this.f8967f = 0.0f;
        this.f8977x = Float.NaN;
        this.f8935A = 48.0f;
        this.f8936B = Float.NaN;
        this.f8939E = 0.0f;
        this.f8940F = "Hello World";
        this.f8941G = true;
        this.f8942H = new Rect();
        this.f8943I = 1;
        this.f8944J = 1;
        this.f8945K = 1;
        this.f8946L = 1;
        this.f8948N = 8388659;
        this.f8949O = 0;
        this.f8950P = false;
        this.f8961b0 = Float.NaN;
        this.c0 = Float.NaN;
        this.f8964d0 = 0.0f;
        this.f8966e0 = 0.0f;
        this.f8968f0 = new Paint();
        this.f8969g0 = 0;
        this.f8973k0 = Float.NaN;
        this.f8974l0 = Float.NaN;
        this.f8975m0 = Float.NaN;
        this.f8976n0 = Float.NaN;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true);
        int i8 = typedValue.data;
        this.f8962c = i8;
        textPaint.setColor(i8);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f945q);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i9 = 0; i9 < indexCount; i9++) {
                int index = obtainStyledAttributes.getIndex(i9);
                if (index == 5) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == 7) {
                    this.f8947M = obtainStyledAttributes.getString(index);
                } else if (index == 11) {
                    this.f8936B = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f8936B);
                } else if (index == 0) {
                    this.f8935A = obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f8935A);
                } else if (index == 2) {
                    this.f8937C = obtainStyledAttributes.getInt(index, this.f8937C);
                } else if (index == 1) {
                    this.f8938D = obtainStyledAttributes.getInt(index, this.f8938D);
                } else if (index == 3) {
                    this.f8962c = obtainStyledAttributes.getColor(index, this.f8962c);
                } else if (index == 9) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f8977x);
                    this.f8977x = dimension;
                    setRound(dimension);
                } else if (index == 10) {
                    float f7 = obtainStyledAttributes.getFloat(index, this.f8967f);
                    this.f8967f = f7;
                    setRoundPercent(f7);
                } else if (index == 4) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == 8) {
                    this.f8949O = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 17) {
                    this.f8963d = obtainStyledAttributes.getInt(index, this.f8963d);
                    this.f8965e = true;
                } else if (index == 18) {
                    this.f8939E = obtainStyledAttributes.getDimension(index, this.f8939E);
                    this.f8965e = true;
                } else if (index == 12) {
                    this.f8954T = obtainStyledAttributes.getDrawable(index);
                    this.f8965e = true;
                } else if (index == 13) {
                    this.f8973k0 = obtainStyledAttributes.getFloat(index, this.f8973k0);
                } else if (index == 14) {
                    this.f8974l0 = obtainStyledAttributes.getFloat(index, this.f8974l0);
                } else if (index == 19) {
                    this.f8964d0 = obtainStyledAttributes.getFloat(index, this.f8964d0);
                } else if (index == 20) {
                    this.f8966e0 = obtainStyledAttributes.getFloat(index, this.f8966e0);
                } else if (index == 15) {
                    this.f8976n0 = obtainStyledAttributes.getFloat(index, this.f8976n0);
                } else if (index == 16) {
                    this.f8975m0 = obtainStyledAttributes.getFloat(index, this.f8975m0);
                } else if (index == 23) {
                    this.f8961b0 = obtainStyledAttributes.getDimension(index, this.f8961b0);
                } else if (index == 24) {
                    this.c0 = obtainStyledAttributes.getDimension(index, this.c0);
                } else if (index == 22) {
                    this.f8969g0 = obtainStyledAttributes.getInt(index, this.f8969g0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        if (this.f8954T != null) {
            this.f8959a0 = new Matrix();
            int intrinsicWidth = this.f8954T.getIntrinsicWidth();
            int intrinsicHeight = this.f8954T.getIntrinsicHeight();
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.c0) ? 128 : (int) this.c0;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                intrinsicHeight = Float.isNaN(this.f8961b0) ? 128 : (int) this.f8961b0;
            }
            if (this.f8969g0 != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f8956V = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f8956V);
            this.f8954T.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f8954T.setFilterBitmap(true);
            this.f8954T.draw(canvas);
            if (this.f8969g0 != 0) {
                Bitmap bitmap = this.f8956V;
                System.nanoTime();
                int width = bitmap.getWidth() / 2;
                int height = bitmap.getHeight() / 2;
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
                for (int i10 = 0; i10 < 4 && width >= 32 && height >= 32; i10++) {
                    width /= 2;
                    height /= 2;
                    createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
                }
                this.f8956V = createScaledBitmap;
            }
            Bitmap bitmap2 = this.f8956V;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f8957W = new BitmapShader(bitmap2, tileMode, tileMode);
        }
        this.f8943I = getPaddingLeft();
        this.f8944J = getPaddingRight();
        this.f8945K = getPaddingTop();
        this.f8946L = getPaddingBottom();
        String str = this.f8947M;
        int i11 = this.f8938D;
        int i12 = this.f8937C;
        if (str != null) {
            typeface = Typeface.create(str, i12);
            if (typeface != null) {
                setTypeface(typeface);
                textPaint.setColor(this.f8962c);
                textPaint.setStrokeWidth(this.f8939E);
                textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
                textPaint.setFlags(128);
                setTextSize(this.f8935A);
                textPaint.setAntiAlias(true);
            }
        } else {
            typeface = null;
        }
        if (i11 == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i11 == 2) {
            typeface = Typeface.SERIF;
        } else if (i11 == 3) {
            typeface = Typeface.MONOSPACE;
        }
        if (i12 > 0) {
            Typeface defaultFromStyle = typeface == null ? Typeface.defaultFromStyle(i12) : Typeface.create(typeface, i12);
            setTypeface(defaultFromStyle);
            int i13 = (~(defaultFromStyle != null ? defaultFromStyle.getStyle() : 0)) & i12;
            textPaint.setFakeBoldText((i13 & 1) != 0);
            textPaint.setTextSkewX((2 & i13) != 0 ? -0.25f : 0.0f);
        } else {
            textPaint.setFakeBoldText(false);
            textPaint.setTextSkewX(0.0f);
            setTypeface(typeface);
        }
        textPaint.setColor(this.f8962c);
        textPaint.setStrokeWidth(this.f8939E);
        textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        textPaint.setFlags(128);
        setTextSize(this.f8935A);
        textPaint.setAntiAlias(true);
    }

    private float getHorizontalOffset() {
        float f7 = Float.isNaN(this.f8936B) ? 1.0f : this.f8935A / this.f8936B;
        TextPaint textPaint = this.f8958a;
        String str = this.f8940F;
        return ((this.f8964d0 + 1.0f) * ((((Float.isNaN(this.f8952R) ? getMeasuredWidth() : this.f8952R) - getPaddingLeft()) - getPaddingRight()) - (textPaint.measureText(str, 0, str.length()) * f7))) / 2.0f;
    }

    private float getVerticalOffset() {
        float f7 = Float.isNaN(this.f8936B) ? 1.0f : this.f8935A / this.f8936B;
        Paint.FontMetrics fontMetrics = this.f8958a.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f8953S) ? getMeasuredHeight() : this.f8953S) - getPaddingTop()) - getPaddingBottom();
        float f8 = fontMetrics.descent;
        float f9 = fontMetrics.ascent;
        return (((1.0f - this.f8966e0) * (measuredHeight - ((f8 - f9) * f7))) / 2.0f) - (f7 * f9);
    }

    public final void a(float f7) {
        if (this.f8965e || f7 != 1.0f) {
            this.f8960b.reset();
            String str = this.f8940F;
            int length = str.length();
            TextPaint textPaint = this.f8958a;
            Rect rect = this.f8942H;
            textPaint.getTextBounds(str, 0, length, rect);
            textPaint.getTextPath(str, 0, length, 0.0f, 0.0f, this.f8960b);
            if (f7 != 1.0f) {
                Log.v("MotionLabel", c.c() + " scale " + f7);
                Matrix matrix = new Matrix();
                matrix.postScale(f7, f7);
                this.f8960b.transform(matrix);
            }
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = getHeight();
            rectF.right = getWidth();
            this.f8941G = false;
        }
    }

    public final void b(float f7, float f8, float f9, float f10) {
        int i7 = (int) (f7 + 0.5f);
        this.f8951Q = f7 - i7;
        int i8 = (int) (f9 + 0.5f);
        int i9 = i8 - i7;
        int i10 = (int) (f10 + 0.5f);
        int i11 = (int) (0.5f + f8);
        int i12 = i10 - i11;
        float f11 = f9 - f7;
        this.f8952R = f11;
        float f12 = f10 - f8;
        this.f8953S = f12;
        if (this.f8959a0 != null) {
            this.f8952R = f11;
            this.f8953S = f12;
            c();
        }
        if (getMeasuredHeight() == i12 && getMeasuredWidth() == i9) {
            super.layout(i7, i11, i8, i10);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
            super.layout(i7, i11, i8, i10);
        }
        if (this.f8950P) {
            Rect rect = this.f8970h0;
            TextPaint textPaint = this.f8958a;
            if (rect == null) {
                this.f8971i0 = new Paint();
                this.f8970h0 = new Rect();
                this.f8971i0.set(textPaint);
                this.f8972j0 = this.f8971i0.getTextSize();
            }
            this.f8952R = f11;
            this.f8953S = f12;
            Paint paint = this.f8971i0;
            String str = this.f8940F;
            paint.getTextBounds(str, 0, str.length(), this.f8970h0);
            float height = this.f8970h0.height() * 1.3f;
            float f13 = (f11 - this.f8944J) - this.f8943I;
            float f14 = (f12 - this.f8946L) - this.f8945K;
            float width = this.f8970h0.width();
            if (width * f14 > height * f13) {
                textPaint.setTextSize((this.f8972j0 * f13) / width);
            } else {
                textPaint.setTextSize((this.f8972j0 * f14) / height);
            }
            if (this.f8965e || !Float.isNaN(this.f8936B)) {
                a(Float.isNaN(this.f8936B) ? 1.0f : this.f8935A / this.f8936B);
            }
        }
    }

    public final void c() {
        float f7 = Float.isNaN(this.f8973k0) ? 0.0f : this.f8973k0;
        float f8 = Float.isNaN(this.f8974l0) ? 0.0f : this.f8974l0;
        float f9 = Float.isNaN(this.f8975m0) ? 1.0f : this.f8975m0;
        float f10 = Float.isNaN(this.f8976n0) ? 0.0f : this.f8976n0;
        this.f8959a0.reset();
        float width = this.f8956V.getWidth();
        float height = this.f8956V.getHeight();
        float f11 = Float.isNaN(this.c0) ? this.f8952R : this.c0;
        float f12 = Float.isNaN(this.f8961b0) ? this.f8953S : this.f8961b0;
        float f13 = f9 * (width * f12 < height * f11 ? f11 / width : f12 / height);
        this.f8959a0.postScale(f13, f13);
        float f14 = width * f13;
        float f15 = f11 - f14;
        float f16 = f13 * height;
        float f17 = f12 - f16;
        if (!Float.isNaN(this.f8961b0)) {
            f17 = this.f8961b0 / 2.0f;
        }
        if (!Float.isNaN(this.c0)) {
            f15 = this.c0 / 2.0f;
        }
        this.f8959a0.postTranslate((((f7 * f15) + f11) - f14) * 0.5f, (((f8 * f17) + f12) - f16) * 0.5f);
        this.f8959a0.postRotate(f10, f11 / 2.0f, f12 / 2.0f);
        this.f8957W.setLocalMatrix(this.f8959a0);
    }

    public float getRound() {
        return this.f8977x;
    }

    public float getRoundPercent() {
        return this.f8967f;
    }

    public float getScaleFromTextSize() {
        return this.f8936B;
    }

    public float getTextBackgroundPanX() {
        return this.f8973k0;
    }

    public float getTextBackgroundPanY() {
        return this.f8974l0;
    }

    public float getTextBackgroundRotate() {
        return this.f8976n0;
    }

    public float getTextBackgroundZoom() {
        return this.f8975m0;
    }

    public int getTextOutlineColor() {
        return this.f8963d;
    }

    public float getTextPanX() {
        return this.f8964d0;
    }

    public float getTextPanY() {
        return this.f8966e0;
    }

    public float getTextureHeight() {
        return this.f8961b0;
    }

    public float getTextureWidth() {
        return this.c0;
    }

    public Typeface getTypeface() {
        return this.f8958a.getTypeface();
    }

    @Override // android.view.View
    public final void layout(int i7, int i8, int i9, int i10) {
        super.layout(i7, i8, i9, i10);
        boolean isNaN = Float.isNaN(this.f8936B);
        float f7 = isNaN ? 1.0f : this.f8935A / this.f8936B;
        this.f8952R = i9 - i7;
        this.f8953S = i10 - i8;
        if (this.f8950P) {
            Rect rect = this.f8970h0;
            TextPaint textPaint = this.f8958a;
            if (rect == null) {
                this.f8971i0 = new Paint();
                this.f8970h0 = new Rect();
                this.f8971i0.set(textPaint);
                this.f8972j0 = this.f8971i0.getTextSize();
            }
            Paint paint = this.f8971i0;
            String str = this.f8940F;
            paint.getTextBounds(str, 0, str.length(), this.f8970h0);
            int width = this.f8970h0.width();
            int height = (int) (this.f8970h0.height() * 1.3f);
            float f8 = (this.f8952R - this.f8944J) - this.f8943I;
            float f9 = (this.f8953S - this.f8946L) - this.f8945K;
            if (isNaN) {
                float f10 = width;
                float f11 = height;
                if (f10 * f9 > f11 * f8) {
                    textPaint.setTextSize((this.f8972j0 * f8) / f10);
                } else {
                    textPaint.setTextSize((this.f8972j0 * f9) / f11);
                }
            } else {
                float f12 = width;
                float f13 = height;
                f7 = f12 * f9 > f13 * f8 ? f8 / f12 : f9 / f13;
            }
        }
        if (this.f8965e || !isNaN) {
            float f14 = i7;
            float f15 = i8;
            float f16 = i9;
            float f17 = i10;
            if (this.f8959a0 != null) {
                this.f8952R = f16 - f14;
                this.f8953S = f17 - f15;
                c();
            }
            a(f7);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7 = Float.isNaN(this.f8936B) ? 1.0f : this.f8935A / this.f8936B;
        super.onDraw(canvas);
        boolean z4 = this.f8965e;
        TextPaint textPaint = this.f8958a;
        if (!z4 && f7 == 1.0f) {
            canvas.drawText(this.f8940F, this.f8951Q + this.f8943I + getHorizontalOffset(), this.f8945K + getVerticalOffset(), textPaint);
            return;
        }
        if (this.f8941G) {
            a(f7);
        }
        if (this.f8955U == null) {
            this.f8955U = new Matrix();
        }
        if (!this.f8965e) {
            float horizontalOffset = this.f8943I + getHorizontalOffset();
            float verticalOffset = this.f8945K + getVerticalOffset();
            this.f8955U.reset();
            this.f8955U.preTranslate(horizontalOffset, verticalOffset);
            this.f8960b.transform(this.f8955U);
            textPaint.setColor(this.f8962c);
            textPaint.setStyle(Paint.Style.FILL_AND_STROKE);
            textPaint.setStrokeWidth(this.f8939E);
            canvas.drawPath(this.f8960b, textPaint);
            this.f8955U.reset();
            this.f8955U.preTranslate(-horizontalOffset, -verticalOffset);
            this.f8960b.transform(this.f8955U);
            return;
        }
        Paint paint = this.f8968f0;
        paint.set(textPaint);
        this.f8955U.reset();
        float horizontalOffset2 = this.f8943I + getHorizontalOffset();
        float verticalOffset2 = this.f8945K + getVerticalOffset();
        this.f8955U.postTranslate(horizontalOffset2, verticalOffset2);
        this.f8955U.preScale(f7, f7);
        this.f8960b.transform(this.f8955U);
        if (this.f8957W != null) {
            textPaint.setFilterBitmap(true);
            textPaint.setShader(this.f8957W);
        } else {
            textPaint.setColor(this.f8962c);
        }
        textPaint.setStyle(Paint.Style.FILL);
        textPaint.setStrokeWidth(this.f8939E);
        canvas.drawPath(this.f8960b, textPaint);
        if (this.f8957W != null) {
            textPaint.setShader(null);
        }
        textPaint.setColor(this.f8963d);
        textPaint.setStyle(Paint.Style.STROKE);
        textPaint.setStrokeWidth(this.f8939E);
        canvas.drawPath(this.f8960b, textPaint);
        this.f8955U.reset();
        this.f8955U.postTranslate(-horizontalOffset2, -verticalOffset2);
        this.f8960b.transform(this.f8955U);
        textPaint.set(paint);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        int mode = View.MeasureSpec.getMode(i7);
        int mode2 = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i7);
        int size2 = View.MeasureSpec.getSize(i8);
        this.f8950P = false;
        this.f8943I = getPaddingLeft();
        this.f8944J = getPaddingRight();
        this.f8945K = getPaddingTop();
        this.f8946L = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f8958a;
            String str = this.f8940F;
            textPaint.getTextBounds(str, 0, str.length(), this.f8942H);
            if (mode != 1073741824) {
                size = (int) (r7.width() + 0.99999f);
            }
            size += this.f8943I + this.f8944J;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (textPaint.getFontMetricsInt(null) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f8945K + this.f8946L + fontMetricsInt;
            }
        } else if (this.f8949O != 0) {
            this.f8950P = true;
        }
        setMeasuredDimension(size, size2);
    }

    public void setGravity(int i7) {
        if ((i7 & 8388615) == 0) {
            i7 |= 8388611;
        }
        if ((i7 & 112) == 0) {
            i7 |= 48;
        }
        if (i7 != this.f8948N) {
            invalidate();
        }
        this.f8948N = i7;
        int i8 = i7 & 112;
        if (i8 == 48) {
            this.f8966e0 = -1.0f;
        } else if (i8 != 80) {
            this.f8966e0 = 0.0f;
        } else {
            this.f8966e0 = 1.0f;
        }
        int i9 = i7 & 8388615;
        if (i9 != 3) {
            if (i9 != 5) {
                if (i9 != 8388611) {
                    if (i9 != 8388613) {
                        this.f8964d0 = 0.0f;
                        return;
                    }
                }
            }
            this.f8964d0 = 1.0f;
            return;
        }
        this.f8964d0 = -1.0f;
    }

    public void setRound(float f7) {
        if (Float.isNaN(f7)) {
            this.f8977x = f7;
            float f8 = this.f8967f;
            this.f8967f = -1.0f;
            setRoundPercent(f8);
            return;
        }
        boolean z4 = this.f8977x != f7;
        this.f8977x = f7;
        if (f7 != 0.0f) {
            if (this.f8960b == null) {
                this.f8960b = new Path();
            }
            if (this.f8979z == null) {
                this.f8979z = new RectF();
            }
            if (this.f8978y == null) {
                e eVar = new e(this, 1);
                this.f8978y = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            this.f8979z.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8960b.reset();
            Path path = this.f8960b;
            RectF rectF = this.f8979z;
            float f9 = this.f8977x;
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f7) {
        boolean z4 = this.f8967f != f7;
        this.f8967f = f7;
        if (f7 != 0.0f) {
            if (this.f8960b == null) {
                this.f8960b = new Path();
            }
            if (this.f8979z == null) {
                this.f8979z = new RectF();
            }
            if (this.f8978y == null) {
                e eVar = new e(this, 0);
                this.f8978y = eVar;
                setOutlineProvider(eVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8967f) / 2.0f;
            this.f8979z.set(0.0f, 0.0f, width, height);
            this.f8960b.reset();
            this.f8960b.addRoundRect(this.f8979z, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f7) {
        this.f8936B = f7;
    }

    public void setText(CharSequence charSequence) {
        this.f8940F = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f7) {
        this.f8973k0 = f7;
        c();
        invalidate();
    }

    public void setTextBackgroundPanY(float f7) {
        this.f8974l0 = f7;
        c();
        invalidate();
    }

    public void setTextBackgroundRotate(float f7) {
        this.f8976n0 = f7;
        c();
        invalidate();
    }

    public void setTextBackgroundZoom(float f7) {
        this.f8975m0 = f7;
        c();
        invalidate();
    }

    public void setTextFillColor(int i7) {
        this.f8962c = i7;
        invalidate();
    }

    public void setTextOutlineColor(int i7) {
        this.f8963d = i7;
        this.f8965e = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f7) {
        this.f8939E = f7;
        this.f8965e = true;
        if (Float.isNaN(f7)) {
            this.f8939E = 1.0f;
            this.f8965e = false;
        }
        invalidate();
    }

    public void setTextPanX(float f7) {
        this.f8964d0 = f7;
        invalidate();
    }

    public void setTextPanY(float f7) {
        this.f8966e0 = f7;
        invalidate();
    }

    public void setTextSize(float f7) {
        this.f8935A = f7;
        Log.v("MotionLabel", c.c() + "  " + f7 + " / " + this.f8936B);
        TextPaint textPaint = this.f8958a;
        if (!Float.isNaN(this.f8936B)) {
            f7 = this.f8936B;
        }
        textPaint.setTextSize(f7);
        a(Float.isNaN(this.f8936B) ? 1.0f : this.f8935A / this.f8936B);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f7) {
        this.f8961b0 = f7;
        c();
        invalidate();
    }

    public void setTextureWidth(float f7) {
        this.c0 = f7;
        c();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        TextPaint textPaint = this.f8958a;
        if (textPaint.getTypeface() != typeface) {
            textPaint.setTypeface(typeface);
        }
    }
}
