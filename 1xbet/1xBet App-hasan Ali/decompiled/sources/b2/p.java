package b2;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import f1.AbstractC1940b;
import f1.AbstractC1941c;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import r.C2327e;

/* loaded from: classes.dex */
public final class p extends g {

    /* renamed from: t, reason: collision with root package name */
    public static final PorterDuff.Mode f7280t = PorterDuff.Mode.SRC_IN;

    /* renamed from: l, reason: collision with root package name */
    public n f7281l;

    /* renamed from: m, reason: collision with root package name */
    public PorterDuffColorFilter f7282m;

    /* renamed from: n, reason: collision with root package name */
    public ColorFilter f7283n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7284o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7285p;

    /* renamed from: q, reason: collision with root package name */
    public final float[] f7286q;

    /* renamed from: r, reason: collision with root package name */
    public final Matrix f7287r;

    /* renamed from: s, reason: collision with root package name */
    public final Rect f7288s;

    public p() {
        this.f7285p = true;
        this.f7286q = new float[9];
        this.f7287r = new Matrix();
        this.f7288s = new Rect();
        n nVar = new n();
        nVar.f7271c = null;
        nVar.f7272d = f7280t;
        nVar.f7270b = new m();
        this.f7281l = nVar;
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f7233k;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f7288s;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f7283n;
        if (colorFilter == null) {
            colorFilter = this.f7282m;
        }
        Matrix matrix = this.f7287r;
        canvas.getMatrix(matrix);
        float[] fArr = this.f7286q;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && getLayoutDirection() == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        n nVar = this.f7281l;
        Bitmap bitmap = nVar.f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != nVar.f.getHeight()) {
            nVar.f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            nVar.f7277k = true;
        }
        if (this.f7285p) {
            n nVar2 = this.f7281l;
            if (nVar2.f7277k || nVar2.f7274g != nVar2.f7271c || nVar2.f7275h != nVar2.f7272d || nVar2.f7276j != nVar2.f7273e || nVar2.i != nVar2.f7270b.getRootAlpha()) {
                n nVar3 = this.f7281l;
                nVar3.f.eraseColor(0);
                Canvas canvas2 = new Canvas(nVar3.f);
                m mVar = nVar3.f7270b;
                mVar.a(mVar.f7261g, m.f7255p, canvas2, min, min2);
                n nVar4 = this.f7281l;
                nVar4.f7274g = nVar4.f7271c;
                nVar4.f7275h = nVar4.f7272d;
                nVar4.i = nVar4.f7270b.getRootAlpha();
                nVar4.f7276j = nVar4.f7273e;
                nVar4.f7277k = false;
            }
        } else {
            n nVar5 = this.f7281l;
            nVar5.f.eraseColor(0);
            Canvas canvas3 = new Canvas(nVar5.f);
            m mVar2 = nVar5.f7270b;
            mVar2.a(mVar2.f7261g, m.f7255p, canvas3, min, min2);
        }
        n nVar6 = this.f7281l;
        if (nVar6.f7270b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (nVar6.f7278l == null) {
                Paint paint2 = new Paint();
                nVar6.f7278l = paint2;
                paint2.setFilterBitmap(true);
            }
            nVar6.f7278l.setAlpha(nVar6.f7270b.getRootAlpha());
            nVar6.f7278l.setColorFilter(colorFilter);
            paint = nVar6.f7278l;
        }
        canvas.drawBitmap(nVar6.f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getAlpha() : this.f7281l.f7270b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f7281l.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getColorFilter() : this.f7283n;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f7233k != null && Build.VERSION.SDK_INT >= 24) {
            return new o(this.f7233k.getConstantState());
        }
        this.f7281l.f7269a = getChangingConfigurations();
        return this.f7281l;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f7281l.f7270b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f7281l.f7270b.f7262h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.isAutoMirrored() : this.f7281l.f7273e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        n nVar = this.f7281l;
        if (nVar == null) {
            return false;
        }
        m mVar = nVar.f7270b;
        if (mVar.f7267n == null) {
            mVar.f7267n = Boolean.valueOf(mVar.f7261g.a());
        }
        if (mVar.f7267n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f7281l.f7271c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f7284o && super.mutate() == this) {
            n nVar = this.f7281l;
            n nVar2 = new n();
            nVar2.f7271c = null;
            nVar2.f7272d = f7280t;
            if (nVar != null) {
                nVar2.f7269a = nVar.f7269a;
                m mVar = new m(nVar.f7270b);
                nVar2.f7270b = mVar;
                if (nVar.f7270b.f7260e != null) {
                    mVar.f7260e = new Paint(nVar.f7270b.f7260e);
                }
                if (nVar.f7270b.f7259d != null) {
                    nVar2.f7270b.f7259d = new Paint(nVar.f7270b.f7259d);
                }
                nVar2.f7271c = nVar.f7271c;
                nVar2.f7272d = nVar.f7272d;
                nVar2.f7273e = nVar.f7273e;
            }
            this.f7281l = nVar2;
            this.f7284o = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z3;
        PorterDuff.Mode mode;
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        n nVar = this.f7281l;
        ColorStateList colorStateList = nVar.f7271c;
        if (colorStateList == null || (mode = nVar.f7272d) == null) {
            z3 = false;
        } else {
            this.f7282m = a(colorStateList, mode);
            invalidateSelf();
            z3 = true;
        }
        m mVar = nVar.f7270b;
        if (mVar.f7267n == null) {
            mVar.f7267n = Boolean.valueOf(mVar.f7261g.a());
        }
        if (mVar.f7267n.booleanValue()) {
            boolean b3 = nVar.f7270b.f7261g.b(iArr);
            nVar.f7277k |= b3;
            if (b3) {
                invalidateSelf();
                return true;
            }
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j5) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j5);
        } else {
            super.scheduleSelf(runnable, j5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f7281l.f7270b.getRootAlpha() != i) {
            this.f7281l.f7270b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z3) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setAutoMirrored(z3);
        } else {
            this.f7281l.f7273e = z3;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f7283n = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
            return;
        }
        n nVar = this.f7281l;
        if (nVar.f7271c != colorStateList) {
            nVar.f7271c = colorStateList;
            this.f7282m = a(colorStateList, nVar.f7272d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.setTintMode(mode);
            return;
        }
        n nVar = this.f7281l;
        if (nVar.f7272d != mode) {
            nVar.f7272d = mode;
            this.f7282m = a(nVar.f7271c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z3, boolean z5) {
        Drawable drawable = this.f7233k;
        return drawable != null ? drawable.setVisible(z3, z5) : super.setVisible(z3, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        m mVar;
        int i;
        boolean z3;
        char c5;
        int i5;
        Paint.Cap cap;
        Paint.Join join;
        Drawable drawable = this.f7233k;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        n nVar = this.f7281l;
        nVar.f7270b = new m();
        TypedArray f = AbstractC1940b.f(resources, theme, attributeSet, AbstractC0509a.f7214a);
        n nVar2 = this.f7281l;
        m mVar2 = nVar2.f7270b;
        int i6 = !AbstractC1940b.c(xmlPullParser, "tintMode") ? -1 : f.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        if (i6 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i6 != 5) {
            if (i6 != 9) {
                switch (i6) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        nVar2.f7272d = mode;
        int i7 = 1;
        ColorStateList colorStateList = null;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "tint") != null) {
            TypedValue typedValue = new TypedValue();
            f.getValue(1, typedValue);
            int i8 = typedValue.type;
            if (i8 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i8 >= 28 && i8 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = f.getResources();
                int resourceId = f.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC1941c.f16945a;
                try {
                    colorStateList = AbstractC1941c.a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e3) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e3);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            nVar2.f7271c = colorStateList2;
        }
        boolean z5 = nVar2.f7273e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z5 = f.getBoolean(5, z5);
        }
        nVar2.f7273e = z5;
        float f5 = mVar2.f7263j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f5 = f.getFloat(7, f5);
        }
        mVar2.f7263j = f5;
        float f6 = mVar2.f7264k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f6 = f.getFloat(8, f6);
        }
        mVar2.f7264k = f6;
        boolean z6 = false;
        if (mVar2.f7263j <= 0.0f) {
            throw new XmlPullParserException(f.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f6 > 0.0f) {
            mVar2.f7262h = f.getDimension(3, mVar2.f7262h);
            float dimension = f.getDimension(2, mVar2.i);
            mVar2.i = dimension;
            if (mVar2.f7262h <= 0.0f) {
                throw new XmlPullParserException(f.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = mVar2.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = f.getFloat(4, alpha);
                }
                mVar2.setAlpha(alpha);
                String string = f.getString(0);
                if (string != null) {
                    mVar2.f7266m = string;
                    mVar2.f7268o.put(string, mVar2);
                }
                f.recycle();
                nVar.f7269a = getChangingConfigurations();
                nVar.f7277k = true;
                n nVar3 = this.f7281l;
                m mVar3 = nVar3.f7270b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(mVar3.f7261g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z7 = true;
                while (eventType != i7 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        j jVar = (j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        C2327e c2327e = mVar3.f7268o;
                        if (equals) {
                            i iVar = new i();
                            iVar.f7235e = 0.0f;
                            iVar.f7236g = 1.0f;
                            iVar.f7237h = 1.0f;
                            mVar = mVar3;
                            iVar.i = 0.0f;
                            iVar.f7238j = 1.0f;
                            iVar.f7239k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            iVar.f7240l = cap2;
                            Paint.Join join2 = Paint.Join.MITER;
                            iVar.f7241m = join2;
                            iVar.f7242n = 4.0f;
                            TypedArray f7 = AbstractC1940b.f(resources, theme, attributeSet, AbstractC0509a.f7216c);
                            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                String string2 = f7.getString(0);
                                if (string2 != null) {
                                    iVar.f7253b = string2;
                                }
                                String string3 = f7.getString(2);
                                if (string3 != null) {
                                    iVar.f7252a = G4.d.o(string3);
                                }
                                iVar.f = AbstractC1940b.a(f7, xmlPullParser, theme, "fillColor", 1);
                                float f8 = iVar.f7237h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                                    f8 = f7.getFloat(12, f8);
                                }
                                iVar.f7237h = f8;
                                int i9 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null ? f7.getInt(8, -1) : -1;
                                Paint.Cap cap3 = iVar.f7240l;
                                if (i9 == 0) {
                                    cap = cap2;
                                } else if (i9 != 1) {
                                    cap = i9 != 2 ? cap3 : Paint.Cap.SQUARE;
                                } else {
                                    cap = Paint.Cap.ROUND;
                                }
                                iVar.f7240l = cap;
                                int i10 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? f7.getInt(9, -1) : -1;
                                Paint.Join join3 = iVar.f7241m;
                                if (i10 == 0) {
                                    join = join2;
                                } else if (i10 != 1) {
                                    join = i10 != 2 ? join3 : Paint.Join.BEVEL;
                                } else {
                                    join = Paint.Join.ROUND;
                                }
                                iVar.f7241m = join;
                                float f9 = iVar.f7242n;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                                    f9 = f7.getFloat(10, f9);
                                }
                                iVar.f7242n = f9;
                                iVar.f7234d = AbstractC1940b.a(f7, xmlPullParser, theme, "strokeColor", 3);
                                float f10 = iVar.f7236g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                                    f10 = f7.getFloat(11, f10);
                                }
                                iVar.f7236g = f10;
                                float f11 = iVar.f7235e;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                                    f11 = f7.getFloat(4, f11);
                                }
                                iVar.f7235e = f11;
                                float f12 = iVar.f7238j;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                                    f12 = f7.getFloat(6, f12);
                                }
                                iVar.f7238j = f12;
                                float f13 = iVar.f7239k;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                                    f13 = f7.getFloat(7, f13);
                                }
                                iVar.f7239k = f13;
                                float f14 = iVar.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                                    f14 = f7.getFloat(5, f14);
                                }
                                iVar.i = f14;
                                int i11 = iVar.f7254c;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                                    i11 = f7.getInt(13, i11);
                                }
                                iVar.f7254c = i11;
                            }
                            f7.recycle();
                            jVar.f7244b.add(iVar);
                            if (iVar.getPathName() != null) {
                                c2327e.put(iVar.getPathName(), iVar);
                            }
                            nVar3.f7269a = nVar3.f7269a;
                            z7 = false;
                            c5 = '\b';
                            z3 = false;
                        } else {
                            mVar = mVar3;
                            c5 = '\b';
                            z3 = false;
                            if ("clip-path".equals(name)) {
                                h hVar = new h();
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                                    TypedArray f15 = AbstractC1940b.f(resources, theme, attributeSet, AbstractC0509a.f7217d);
                                    String string4 = f15.getString(0);
                                    if (string4 != null) {
                                        hVar.f7253b = string4;
                                    }
                                    String string5 = f15.getString(1);
                                    if (string5 != null) {
                                        hVar.f7252a = G4.d.o(string5);
                                    }
                                    hVar.f7254c = !AbstractC1940b.c(xmlPullParser, "fillType") ? 0 : f15.getInt(2, 0);
                                    f15.recycle();
                                }
                                jVar.f7244b.add(hVar);
                                if (hVar.getPathName() != null) {
                                    c2327e.put(hVar.getPathName(), hVar);
                                }
                                nVar3.f7269a = nVar3.f7269a;
                            } else if ("group".equals(name)) {
                                j jVar2 = new j();
                                TypedArray f16 = AbstractC1940b.f(resources, theme, attributeSet, AbstractC0509a.f7215b);
                                float f17 = jVar2.f7245c;
                                if (AbstractC1940b.c(xmlPullParser, "rotation")) {
                                    f17 = f16.getFloat(5, f17);
                                }
                                jVar2.f7245c = f17;
                                jVar2.f7246d = f16.getFloat(1, jVar2.f7246d);
                                jVar2.f7247e = f16.getFloat(2, jVar2.f7247e);
                                float f18 = jVar2.f;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                                    f18 = f16.getFloat(3, f18);
                                }
                                jVar2.f = f18;
                                float f19 = jVar2.f7248g;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                                    f19 = f16.getFloat(4, f19);
                                }
                                jVar2.f7248g = f19;
                                float f20 = jVar2.f7249h;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                                    f20 = f16.getFloat(6, f20);
                                }
                                jVar2.f7249h = f20;
                                float f21 = jVar2.i;
                                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                                    f21 = f16.getFloat(7, f21);
                                }
                                jVar2.i = f21;
                                String string6 = f16.getString(0);
                                if (string6 != null) {
                                    jVar2.f7251k = string6;
                                }
                                jVar2.c();
                                f16.recycle();
                                jVar.f7244b.add(jVar2);
                                arrayDeque.push(jVar2);
                                if (jVar2.getGroupName() != null) {
                                    c2327e.put(jVar2.getGroupName(), jVar2);
                                }
                                nVar3.f7269a = nVar3.f7269a;
                            }
                        }
                        i5 = 1;
                    } else {
                        mVar = mVar3;
                        i = depth;
                        z3 = z6;
                        c5 = '\b';
                        i5 = 1;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i7 = i5;
                    z6 = z3;
                    mVar3 = mVar;
                    depth = i;
                }
                if (!z7) {
                    this.f7282m = a(nVar.f7271c, nVar.f7272d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(f.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(f.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public p(n nVar) {
        this.f7285p = true;
        this.f7286q = new float[9];
        this.f7287r = new Matrix();
        this.f7288s = new Rect();
        this.f7281l = nVar;
        this.f7282m = a(nVar.f7271c, nVar.f7272d);
    }
}
