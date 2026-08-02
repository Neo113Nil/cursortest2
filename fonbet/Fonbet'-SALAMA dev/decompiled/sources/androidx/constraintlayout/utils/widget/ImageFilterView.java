package androidx.constraintlayout.utils.widget;

import A.b;
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
import androidx.appcompat.widget.AppCompatImageView;
import n3.AbstractC1464a;

/* loaded from: classes.dex */
public class ImageFilterView extends AppCompatImageView {

    /* renamed from: A, reason: collision with root package name */
    public float f8903A;

    /* renamed from: B, reason: collision with root package name */
    public Path f8904B;

    /* renamed from: C, reason: collision with root package name */
    public ViewOutlineProvider f8905C;

    /* renamed from: D, reason: collision with root package name */
    public RectF f8906D;

    /* renamed from: E, reason: collision with root package name */
    public final Drawable[] f8907E;

    /* renamed from: F, reason: collision with root package name */
    public LayerDrawable f8908F;

    /* renamed from: G, reason: collision with root package name */
    public float f8909G;

    /* renamed from: H, reason: collision with root package name */
    public float f8910H;

    /* renamed from: I, reason: collision with root package name */
    public float f8911I;

    /* renamed from: J, reason: collision with root package name */
    public float f8912J;

    /* renamed from: d, reason: collision with root package name */
    public final c f8913d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f8914e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f8915f;

    /* renamed from: x, reason: collision with root package name */
    public Drawable f8916x;

    /* renamed from: y, reason: collision with root package name */
    public float f8917y;

    /* renamed from: z, reason: collision with root package name */
    public float f8918z;

    public ImageFilterView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f8913d = new c();
        this.f8914e = true;
        this.f8915f = null;
        this.f8916x = null;
        this.f8917y = 0.0f;
        this.f8918z = 0.0f;
        this.f8903A = Float.NaN;
        this.f8907E = new Drawable[2];
        this.f8909G = Float.NaN;
        this.f8910H = Float.NaN;
        this.f8911I = Float.NaN;
        this.f8912J = Float.NaN;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, q.f938i);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f8915f = obtainStyledAttributes.getDrawable(0);
            for (int i8 = 0; i8 < indexCount; i8++) {
                int index = obtainStyledAttributes.getIndex(i8);
                if (index == 4) {
                    this.f8917y = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == 13) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 12) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 3) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 2) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 10) {
                    setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == 11) {
                    setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == 9) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f8914e));
                } else if (index == 5) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f8909G));
                } else if (index == 6) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f8910H));
                } else if (index == 7) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f8912J));
                } else if (index == 8) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f8911I));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f8916x = drawable;
            Drawable drawable2 = this.f8915f;
            Drawable[] drawableArr = this.f8907E;
            if (drawable2 == null || drawable == null) {
                Drawable drawable3 = getDrawable();
                this.f8916x = drawable3;
                if (drawable3 != null) {
                    Drawable mutate = drawable3.mutate();
                    this.f8916x = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable mutate2 = getDrawable().mutate();
            this.f8916x = mutate2;
            drawableArr[0] = mutate2;
            drawableArr[1] = this.f8915f.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
            this.f8908F = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f8917y * 255.0f));
            if (!this.f8914e) {
                this.f8908F.getDrawable(0).setAlpha((int) ((1.0f - this.f8917y) * 255.0f));
            }
            super.setImageDrawable(this.f8908F);
        }
    }

    private void setOverlay(boolean z4) {
        this.f8914e = z4;
    }

    public final void a() {
        if (Float.isNaN(this.f8909G) && Float.isNaN(this.f8910H) && Float.isNaN(this.f8911I) && Float.isNaN(this.f8912J)) {
            return;
        }
        float f7 = Float.isNaN(this.f8909G) ? 0.0f : this.f8909G;
        float f8 = Float.isNaN(this.f8910H) ? 0.0f : this.f8910H;
        float f9 = Float.isNaN(this.f8911I) ? 1.0f : this.f8911I;
        float f10 = Float.isNaN(this.f8912J) ? 0.0f : this.f8912J;
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

    public final void d() {
        if (Float.isNaN(this.f8909G) && Float.isNaN(this.f8910H) && Float.isNaN(this.f8911I) && Float.isNaN(this.f8912J)) {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        } else {
            a();
        }
    }

    public float getBrightness() {
        return this.f8913d.f7d;
    }

    public float getContrast() {
        return this.f8913d.f9f;
    }

    public float getCrossfade() {
        return this.f8917y;
    }

    public float getImagePanX() {
        return this.f8909G;
    }

    public float getImagePanY() {
        return this.f8910H;
    }

    public float getImageRotate() {
        return this.f8912J;
    }

    public float getImageZoom() {
        return this.f8911I;
    }

    public float getRound() {
        return this.f8903A;
    }

    public float getRoundPercent() {
        return this.f8918z;
    }

    public float getSaturation() {
        return this.f8913d.f8e;
    }

    public float getWarmth() {
        return this.f8913d.f10g;
    }

    @Override // android.view.View
    public final void layout(int i7, int i8, int i9, int i10) {
        super.layout(i7, i8, i9, i10);
        a();
    }

    public void setAltImageResource(int i7) {
        Drawable mutate = AbstractC1464a.w(getContext(), i7).mutate();
        this.f8915f = mutate;
        Drawable drawable = this.f8916x;
        Drawable[] drawableArr = this.f8907E;
        drawableArr[0] = drawable;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f8908F = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8917y);
    }

    public void setBrightness(float f7) {
        c cVar = this.f8913d;
        cVar.f7d = f7;
        cVar.a(this);
    }

    public void setContrast(float f7) {
        c cVar = this.f8913d;
        cVar.f9f = f7;
        cVar.a(this);
    }

    public void setCrossfade(float f7) {
        this.f8917y = f7;
        if (this.f8907E != null) {
            if (!this.f8914e) {
                this.f8908F.getDrawable(0).setAlpha((int) ((1.0f - this.f8917y) * 255.0f));
            }
            this.f8908F.getDrawable(1).setAlpha((int) (this.f8917y * 255.0f));
            super.setImageDrawable(this.f8908F);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (this.f8915f == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f8916x = mutate;
        Drawable[] drawableArr = this.f8907E;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8915f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f8908F = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8917y);
    }

    public void setImagePanX(float f7) {
        this.f8909G = f7;
        d();
    }

    public void setImagePanY(float f7) {
        this.f8910H = f7;
        d();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i7) {
        if (this.f8915f == null) {
            super.setImageResource(i7);
            return;
        }
        Drawable mutate = AbstractC1464a.w(getContext(), i7).mutate();
        this.f8916x = mutate;
        Drawable[] drawableArr = this.f8907E;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f8915f;
        LayerDrawable layerDrawable = new LayerDrawable(drawableArr);
        this.f8908F = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f8917y);
    }

    public void setImageRotate(float f7) {
        this.f8912J = f7;
        d();
    }

    public void setImageZoom(float f7) {
        this.f8911I = f7;
        d();
    }

    public void setRound(float f7) {
        if (Float.isNaN(f7)) {
            this.f8903A = f7;
            float f8 = this.f8918z;
            this.f8918z = -1.0f;
            setRoundPercent(f8);
            return;
        }
        boolean z4 = this.f8903A != f7;
        this.f8903A = f7;
        if (f7 != 0.0f) {
            if (this.f8904B == null) {
                this.f8904B = new Path();
            }
            if (this.f8906D == null) {
                this.f8906D = new RectF();
            }
            if (this.f8905C == null) {
                b bVar = new b(this, 1);
                this.f8905C = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            this.f8906D.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f8904B.reset();
            Path path = this.f8904B;
            RectF rectF = this.f8906D;
            float f9 = this.f8903A;
            path.addRoundRect(rectF, f9, f9, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f7) {
        boolean z4 = this.f8918z != f7;
        this.f8918z = f7;
        if (f7 != 0.0f) {
            if (this.f8904B == null) {
                this.f8904B = new Path();
            }
            if (this.f8906D == null) {
                this.f8906D = new RectF();
            }
            if (this.f8905C == null) {
                b bVar = new b(this, 0);
                this.f8905C = bVar;
                setOutlineProvider(bVar);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float min = (Math.min(width, height) * this.f8918z) / 2.0f;
            this.f8906D.set(0.0f, 0.0f, width, height);
            this.f8904B.reset();
            this.f8904B.addRoundRect(this.f8906D, min, min, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z4) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f7) {
        c cVar = this.f8913d;
        cVar.f8e = f7;
        cVar.a(this);
    }

    public void setWarmth(float f7) {
        c cVar = this.f8913d;
        cVar.f10g = f7;
        cVar.a(this);
    }
}
