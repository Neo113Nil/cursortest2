package androidx.constraintlayout.utils.widget;

import A.a;
import A.c;
import B.q;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageButton;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: A, reason: collision with root package name */
    public RectF f8887A;

    /* renamed from: B, reason: collision with root package name */
    public final Drawable[] f8888B;

    /* renamed from: C, reason: collision with root package name */
    public LayerDrawable f8889C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f8890D;

    /* renamed from: E, reason: collision with root package name */
    public Drawable f8891E;

    /* renamed from: F, reason: collision with root package name */
    public Drawable f8892F;

    /* renamed from: G, reason: collision with root package name */
    public float f8893G;

    /* renamed from: H, reason: collision with root package name */
    public float f8894H;

    /* renamed from: I, reason: collision with root package name */
    public float f8895I;

    /* renamed from: J, reason: collision with root package name */
    public float f8896J;

    /* renamed from: d, reason: collision with root package name */
    public final c f8897d;

    /* renamed from: e, reason: collision with root package name */
    public float f8898e;

    /* renamed from: f, reason: collision with root package name */
    public float f8899f;

    /* renamed from: x, reason: collision with root package name */
    public float f8900x;

    /* renamed from: y, reason: collision with root package name */
    public Path f8901y;

    /* renamed from: z, reason: collision with root package name */
    public ViewOutlineProvider f8902z;

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8897d = new c();
        this.f8898e = 0.0f;
        this.f8899f = 0.0f;
        this.f8900x = Float.NaN;
        this.f8888B = new Drawable[2];
        this.f8890D = true;
        this.f8891E = null;
        this.f8892F = null;
        this.f8893G = Float.NaN;
        this.f8894H = Float.NaN;
        this.f8895I = Float.NaN;
        this.f8896J = Float.NaN;
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f938i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f8891E = obtainStyledAttributes.getDrawable(0);
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 4) {
                    this.f8898e = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f8890D));
                } else if (index == 5) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f8893G));
                } else if (index == 6) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f8894H));
                } else if (index == 7) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f8896J));
                } else if (index == 8) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f8895I));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f8892F = drawable;
            Drawable drawable2 = this.f8891E;
            Drawable[] drawableArr = this.f8888B;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.f8892F = drawable3;
                if (drawable3 != null) {
                    Drawable mutate = drawable3.mutate();
                    this.f8892F = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable mutate2 = getDrawable().mutate();
            this.f8892F = mutate2;
            drawableArr[0] = mutate2;
            drawableArr[1] = this.f8891E.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f8889C = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f8898e * 255.0f));
            if (!this.f8890D) {
                this.f8889C.getDrawable(0).setAlpha((int) ((1.0f - this.f8898e) * 255.0f));
            }
            super.setImageDrawable(this.f8889C);
        }
    }

    private void setOverlay(boolean z4) {
        this.f8890D = z4;
    }

    public final void a() {
        if (Float.isNaN(this.f8893G) && Float.isNaN(this.f8894H) && Float.isNaN(this.f8895I) && Float.isNaN(this.f8896J)) {
            return;
        }
        float f7 = Float.isNaN(this.f8893G) ? 0.0f : this.f8893G;
        float f8 = Float.isNaN(this.f8894H) ? 0.0f : this.f8894H;
        float f9 = Float.isNaN(this.f8895I) ? 1.0f : this.f8895I;
        float f10 = Float.isNaN(this.f8896J) ? 0.0f : this.f8896J;
        Matrix matrix = new Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f11 = f9 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f11, f11);
        float f12 = intrinsicWidth * f11;
        float f13 = f11 * intrinsicHeight;
        matrix.postTranslate(((((width - f12) * f7) + width) - f12) * 0.5f, ((((height - f13) * f8) + height) - f13) * 0.5f);
        matrix.postRotate(f10, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public final void b() {
        if (Float.isNaN(this.f8893G) && Float.isNaN(this.f8894H) && Float.isNaN(this.f8895I) && Float.isNaN(this.f8896J)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            a();
        }
    }

    public float getContrast() {
        return this.f8897d.f9f;
    }

    public float getCrossfade() {
        return this.f8898e;
    }

    public float getImagePanX() {
        return this.f8893G;
    }

    public float getImagePanY() {
        return this.f8894H;
    }

    public float getImageRotate() {
        return this.f8896J;
    }

    public float getImageZoom() {
        return this.f8895I;
    }

    public float getRound() {
        return this.f8900x;
    }

    public float getRoundPercent() {
        return this.f8899f;
    }

    public float getSaturation() {
        return this.f8897d.f8e;
    }

    public float getWarmth() {
        return this.f8897d.f10g;
    }

    @Override // android.view.View
    public final void layout(int i7, int i8, int i9, int i10) {
        super.layout(i7, i8, i9, i10);
        a();
    }

    public void setAltImageResource(int i7) {
        Drawable mutate = AbstractC1464a.w(getContext(), i7).mutate();
        this.f8891E = mutate;
        Drawable drawable = this.f8892F;
        Drawable[] drawableArr = this.f8888B;
        drawableArr[0] = drawable;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f8889C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8898e);
    }

    public void setBrightness(float f7) {
        c cVar = this.f8897d;
        cVar.f7d = f7;
        cVar.a(this);
    }

    public void setContrast(float f7) {
        c cVar = this.f8897d;
        cVar.f9f = f7;
        cVar.a(this);
    }

    public void setCrossfade(float f7) {
        this.f8898e = f7;
        if (this.f8888B != null) {
            if (!this.f8890D) {
                this.f8889C.getDrawable(0).setAlpha((int) ((1.0f - this.f8898e) * 255.0f));
            }
            this.f8889C.getDrawable(1).setAlpha((int) (this.f8898e * 255.0f));
            super.setImageDrawable(this.f8889C);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f8891E == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f8892F = mutate;
        Drawable[] drawableArr = this.f8888B;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8891E;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f8889C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8898e);
    }

    public void setImagePanX(float f7) {
        this.f8893G = f7;
        b();
    }

    public void setImagePanY(float f7) {
        this.f8894H = f7;
        b();
    }

    @Override // androidx.appcompat.widget.AppCompatImageButton, android.widget.ImageView
    public void setImageResource(int i7) {
        if (this.f8891E == null) {
            super.setImageResource(i7);
            return;
        }
        Drawable mutate = AbstractC1464a.w(getContext(), i7).mutate();
        this.f8892F = mutate;
        Drawable[] drawableArr = this.f8888B;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8891E;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f8889C = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8898e);
    }

    public void setImageRotate(float f7) {
        this.f8896J = f7;
        b();
    }

    public void setImageZoom(float f7) {
        this.f8895I = f7;
        b();
    }

    public void setRound(float f7) {
        if (Float.isNaN(f7)) {
            this.f8900x = f7;
            float f8 = this.f8899f;
            this.f8899f = -1.0f;
            setRoundPercent(f8);
            return;
        }
        boolean z4 = this.f8900x != f7;
        this.f8900x = f7;
        if (f7 != 0.0f) {
            if (this.f8901y == null) {
                this.f8901y = new Path();
            }
            if (this.f8887A == null) {
                this.f8887A = new RectF();
            }
            if (this.f8902z == null) {
                a aVar = new a(this, 1);
                this.f8902z = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            this.f8887A.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8901y.reset();
            Path path = this.f8901y;
            RectF rectF = this.f8887A;
            float f9 = this.f8900x;
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f7) {
        boolean z4 = this.f8899f != f7;
        this.f8899f = f7;
        if (f7 != 0.0f) {
            if (this.f8901y == null) {
                this.f8901y = new Path();
            }
            if (this.f8887A == null) {
                this.f8887A = new RectF();
            }
            if (this.f8902z == null) {
                a aVar = new a(this, 0);
                this.f8902z = aVar;
                setOutlineProvider(aVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8899f) / 2.0f;
            this.f8887A.set(0.0f, 0.0f, width, height);
            this.f8901y.reset();
            this.f8901y.addRoundRect(this.f8887A, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f7) {
        c cVar = this.f8897d;
        cVar.f8e = f7;
        cVar.a(this);
    }

    public void setWarmth(float f7) {
        c cVar = this.f8897d;
        cVar.f10g = f7;
        cVar.a(this);
    }
}
