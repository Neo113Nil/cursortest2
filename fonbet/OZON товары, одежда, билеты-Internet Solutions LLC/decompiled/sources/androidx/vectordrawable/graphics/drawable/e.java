package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.collection.C5132a;
import androidx.core.content.res.k;
import androidx.core.graphics.f;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class e extends androidx.vectordrawable.graphics.drawable.d {

    /* renamed from: j, reason: collision with root package name */
    static final PorterDuff.Mode f45072j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private g f45073b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f45074c;

    /* renamed from: d, reason: collision with root package name */
    private ColorFilter f45075d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f45076e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f45077f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f45078g;

    /* renamed from: h, reason: collision with root package name */
    private final Matrix f45079h;

    /* renamed from: i, reason: collision with root package name */
    private final Rect f45080i;

    /* loaded from: classes8.dex */
    private static class a extends AbstractC0819e {
        a() {
        }

        public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                TypedArray e11 = k.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f45059d);
                String string = e11.getString(0);
                if (string != null) {
                    this.f45104b = string;
                }
                String string2 = e11.getString(1);
                if (string2 != null) {
                    this.f45103a = androidx.core.graphics.f.c(string2);
                }
                this.f45105c = k.d(xmlPullParser, "fillType") ? e11.getInt(2, 0) : 0;
                e11.recycle();
            }
        }

        a(a aVar) {
            super(aVar);
        }
    }

    private static abstract class d {
        private d() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }

        /* synthetic */ d(int i11) {
            this();
        }
    }

    private static class g extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        int f45122a;

        /* renamed from: b, reason: collision with root package name */
        f f45123b;

        /* renamed from: c, reason: collision with root package name */
        ColorStateList f45124c;

        /* renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f45125d;

        /* renamed from: e, reason: collision with root package name */
        boolean f45126e;

        /* renamed from: f, reason: collision with root package name */
        Bitmap f45127f;

        /* renamed from: g, reason: collision with root package name */
        ColorStateList f45128g;

        /* renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f45129h;

        /* renamed from: i, reason: collision with root package name */
        int f45130i;

        /* renamed from: j, reason: collision with root package name */
        boolean f45131j;

        /* renamed from: k, reason: collision with root package name */
        boolean f45132k;

        /* renamed from: l, reason: collision with root package name */
        Paint f45133l;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f45122a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable() {
            return new e(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public final Drawable newDrawable(Resources resources) {
            return new e(this);
        }
    }

    e() {
        this.f45077f = true;
        this.f45078g = new float[9];
        this.f45079h = new Matrix();
        this.f45080i = new Rect();
        g gVar = new g();
        gVar.f45124c = null;
        gVar.f45125d = f45072j;
        gVar.f45123b = new f();
        this.f45073b = gVar;
    }

    public static e a(@NonNull Resources resources, int i11, Resources.Theme theme) {
        e eVar = new e();
        eVar.f45071a = androidx.core.content.res.g.d(resources, i11, theme);
        new h(eVar.f45071a.getConstantState());
        return eVar;
    }

    final Object b(String str) {
        return this.f45073b.f45123b.f45121o.get(str);
    }

    final void c() {
        this.f45077f = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f45071a;
        if (drawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.a.b(drawable);
        return false;
    }

    final PorterDuffColorFilter d(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(super.getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f45080i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f45075d;
        if (colorFilter == null) {
            colorFilter = this.f45074c;
        }
        Matrix matrix = this.f45079h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f45078g;
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
        if (isAutoMirrored() && androidx.core.graphics.drawable.a.d(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.f45073b;
        Bitmap bitmap = gVar.f45127f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != gVar.f45127f.getHeight()) {
            gVar.f45127f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            gVar.f45132k = true;
        }
        if (this.f45077f) {
            g gVar2 = this.f45073b;
            if (gVar2.f45132k || gVar2.f45128g != gVar2.f45124c || gVar2.f45129h != gVar2.f45125d || gVar2.f45131j != gVar2.f45126e || gVar2.f45130i != gVar2.f45123b.getRootAlpha()) {
                g gVar3 = this.f45073b;
                gVar3.f45127f.eraseColor(0);
                gVar3.f45123b.a(new Canvas(gVar3.f45127f), min, min2);
                g gVar4 = this.f45073b;
                gVar4.f45128g = gVar4.f45124c;
                gVar4.f45129h = gVar4.f45125d;
                gVar4.f45130i = gVar4.f45123b.getRootAlpha();
                gVar4.f45131j = gVar4.f45126e;
                gVar4.f45132k = false;
            }
        } else {
            g gVar5 = this.f45073b;
            gVar5.f45127f.eraseColor(0);
            gVar5.f45123b.a(new Canvas(gVar5.f45127f), min, min2);
        }
        g gVar6 = this.f45073b;
        if (gVar6.f45123b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (gVar6.f45133l == null) {
                Paint paint2 = new Paint();
                gVar6.f45133l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar6.f45133l.setAlpha(gVar6.f45123b.getRootAlpha());
            gVar6.f45133l.setColorFilter(colorFilter);
            paint = gVar6.f45133l;
        }
        canvas.drawBitmap(gVar6.f45127f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getAlpha() : this.f45073b.f45123b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f45073b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f45071a;
        return drawable != null ? androidx.core.graphics.drawable.a.c(drawable) : this.f45075d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f45071a != null) {
            return new h(this.f45071a.getConstantState());
        }
        this.f45073b.f45122a = getChangingConfigurations();
        return this.f45073b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f45073b.f45123b.f45115i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f45073b.f45123b.f45114h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.isAutoMirrored() : this.f45073b.f45126e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        g gVar = this.f45073b;
        if (gVar == null) {
            return false;
        }
        f fVar = gVar.f45123b;
        if (fVar.f45120n == null) {
            fVar.f45120n = Boolean.valueOf(fVar.f45113g.a());
        }
        if (fVar.f45120n.booleanValue()) {
            return true;
        }
        ColorStateList colorStateList = this.f45073b.f45124c;
        return colorStateList != null && colorStateList.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f45076e && super.mutate() == this) {
            g gVar = this.f45073b;
            g gVar2 = new g();
            gVar2.f45124c = null;
            gVar2.f45125d = f45072j;
            if (gVar != null) {
                gVar2.f45122a = gVar.f45122a;
                f fVar = new f(gVar.f45123b);
                gVar2.f45123b = fVar;
                if (gVar.f45123b.f45111e != null) {
                    fVar.f45111e = new Paint(gVar.f45123b.f45111e);
                }
                if (gVar.f45123b.f45110d != null) {
                    gVar2.f45123b.f45110d = new Paint(gVar.f45123b.f45110d);
                }
                gVar2.f45124c = gVar.f45124c;
                gVar2.f45125d = gVar.f45125d;
                gVar2.f45126e = gVar.f45126e;
            }
            this.f45073b = gVar2;
            this.f45076e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean z11;
        PorterDuff.Mode mode;
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f45073b;
        ColorStateList colorStateList = gVar.f45124c;
        if (colorStateList == null || (mode = gVar.f45125d) == null) {
            z11 = false;
        } else {
            this.f45074c = d(colorStateList, mode);
            invalidateSelf();
            z11 = true;
        }
        f fVar = gVar.f45123b;
        if (fVar.f45120n == null) {
            fVar.f45120n = Boolean.valueOf(fVar.f45113g.a());
        }
        if (fVar.f45120n.booleanValue()) {
            boolean b11 = gVar.f45123b.f45113g.b(iArr);
            gVar.f45132k |= b11;
            if (b11) {
                invalidateSelf();
                return true;
            }
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j11);
        } else {
            super.scheduleSelf(runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f45073b.f45123b.getRootAlpha() != i11) {
            this.f45073b.f45123b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setAutoMirrored(z11);
        } else {
            this.f45073b.f45126e = z11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f45075d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i11) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.i(drawable, i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.j(drawable, colorStateList);
            return;
        }
        g gVar = this.f45073b;
        if (gVar.f45124c != colorStateList) {
            gVar.f45124c = colorStateList;
            this.f45074c = d(colorStateList, gVar.f45125d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.k(drawable, mode);
            return;
        }
        g gVar = this.f45073b;
        if (gVar.f45125d != mode) {
            gVar.f45125d = mode;
            this.f45074c = d(gVar.f45124c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f45071a;
        return drawable != null ? drawable.setVisible(z11, z12) : super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class h extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f45134a;

        public h(Drawable.ConstantState constantState) {
            this.f45134a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f45134a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f45134a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            e eVar = new e();
            eVar.f45071a = (VectorDrawable) this.f45134a.newDrawable();
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            e eVar = new e();
            eVar.f45071a = (VectorDrawable) this.f45134a.newDrawable(resources);
            return eVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            e eVar = new e();
            eVar.f45071a = (VectorDrawable) this.f45134a.newDrawable(resources, theme);
            return eVar;
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.e$e, reason: collision with other inner class name */
    /* loaded from: classes8.dex */
    private static abstract class AbstractC0819e extends d {

        /* renamed from: a, reason: collision with root package name */
        protected f.a[] f45103a;

        /* renamed from: b, reason: collision with root package name */
        String f45104b;

        /* renamed from: c, reason: collision with root package name */
        int f45105c;

        public AbstractC0819e() {
            super(0);
            this.f45103a = null;
            this.f45105c = 0;
        }

        public boolean c() {
            return this instanceof a;
        }

        public final void d(Path path) {
            path.reset();
            f.a[] aVarArr = this.f45103a;
            if (aVarArr != null) {
                f.a.e(aVarArr, path);
            }
        }

        public f.a[] getPathData() {
            return this.f45103a;
        }

        public String getPathName() {
            return this.f45104b;
        }

        public void setPathData(f.a[] aVarArr) {
            if (androidx.core.graphics.f.a(this.f45103a, aVarArr)) {
                androidx.core.graphics.f.e(this.f45103a, aVarArr);
            } else {
                this.f45103a = androidx.core.graphics.f.d(aVarArr);
            }
        }

        public AbstractC0819e(AbstractC0819e abstractC0819e) {
            super(0);
            this.f45103a = null;
            this.f45105c = 0;
            this.f45104b = abstractC0819e.f45104b;
            this.f45103a = androidx.core.graphics.f.d(abstractC0819e.f45103a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i11;
        Drawable drawable = this.f45071a;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.e(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f45073b;
        gVar.f45123b = new f();
        TypedArray e11 = k.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f45056a);
        g gVar2 = this.f45073b;
        f fVar = gVar2.f45123b;
        int i12 = k.d(xmlPullParser, "tintMode") ? e11.getInt(6, -1) : -1;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i13 = 3;
        if (i12 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i12 != 5) {
            if (i12 != 9) {
                switch (i12) {
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
        gVar2.f45125d = mode;
        ColorStateList b11 = k.b(e11, xmlPullParser, theme);
        if (b11 != null) {
            gVar2.f45124c = b11;
        }
        boolean z11 = gVar2.f45126e;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "autoMirrored") != null) {
            z11 = e11.getBoolean(5, z11);
        }
        gVar2.f45126e = z11;
        float f7 = fVar.f45116j;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportWidth") != null) {
            f7 = e11.getFloat(7, f7);
        }
        fVar.f45116j = f7;
        float f11 = fVar.f45117k;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "viewportHeight") != null) {
            f11 = e11.getFloat(8, f11);
        }
        fVar.f45117k = f11;
        if (fVar.f45116j <= 0.0f) {
            throw new XmlPullParserException(e11.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f11 > 0.0f) {
            fVar.f45114h = e11.getDimension(3, fVar.f45114h);
            int i14 = 2;
            float dimension = e11.getDimension(2, fVar.f45115i);
            fVar.f45115i = dimension;
            if (fVar.f45114h <= 0.0f) {
                throw new XmlPullParserException(e11.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = fVar.getAlpha();
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "alpha") != null) {
                    alpha = e11.getFloat(4, alpha);
                }
                fVar.setAlpha(alpha);
                String string = e11.getString(0);
                if (string != null) {
                    fVar.f45119m = string;
                    fVar.f45121o.put(string, fVar);
                }
                e11.recycle();
                gVar.f45122a = getChangingConfigurations();
                int i15 = 1;
                gVar.f45132k = true;
                g gVar3 = this.f45073b;
                f fVar2 = gVar3.f45123b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(fVar2.f45113g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z12 = true;
                while (eventType != i15 && (xmlPullParser.getDepth() >= depth || eventType != i13)) {
                    if (eventType == i14) {
                        String name = xmlPullParser.getName();
                        c cVar = (c) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        C5132a<String, Object> c5132a = fVar2.f45121o;
                        if (equals) {
                            b bVar = new b();
                            bVar.e(resources, xmlPullParser, attributeSet, theme);
                            cVar.f45093b.add(bVar);
                            if (bVar.getPathName() != null) {
                                c5132a.put(bVar.getPathName(), bVar);
                            }
                            gVar3.f45122a = gVar3.f45122a;
                            z12 = false;
                        } else if ("clip-path".equals(name)) {
                            a aVar = new a();
                            aVar.e(resources, xmlPullParser, attributeSet, theme);
                            cVar.f45093b.add(aVar);
                            if (aVar.getPathName() != null) {
                                c5132a.put(aVar.getPathName(), aVar);
                            }
                            gVar3.f45122a = gVar3.f45122a;
                        } else if ("group".equals(name)) {
                            c cVar2 = new c();
                            cVar2.c(resources, xmlPullParser, attributeSet, theme);
                            cVar.f45093b.add(cVar2);
                            arrayDeque.push(cVar2);
                            if (cVar2.getGroupName() != null) {
                                c5132a.put(cVar2.getGroupName(), cVar2);
                            }
                            gVar3.f45122a = gVar3.f45122a;
                        }
                        i11 = 3;
                    } else {
                        i11 = i13;
                        if (eventType == i11 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i13 = i11;
                    i15 = 1;
                    i14 = 2;
                }
                if (!z12) {
                    this.f45074c = d(gVar.f45124c, gVar.f45125d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(e11.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(e11.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    /* loaded from: classes8.dex */
    private static class b extends AbstractC0819e {

        /* renamed from: d, reason: collision with root package name */
        androidx.core.content.res.d f45081d;

        /* renamed from: e, reason: collision with root package name */
        float f45082e;

        /* renamed from: f, reason: collision with root package name */
        androidx.core.content.res.d f45083f;

        /* renamed from: g, reason: collision with root package name */
        float f45084g;

        /* renamed from: h, reason: collision with root package name */
        float f45085h;

        /* renamed from: i, reason: collision with root package name */
        float f45086i;

        /* renamed from: j, reason: collision with root package name */
        float f45087j;

        /* renamed from: k, reason: collision with root package name */
        float f45088k;

        /* renamed from: l, reason: collision with root package name */
        Paint.Cap f45089l;

        /* renamed from: m, reason: collision with root package name */
        Paint.Join f45090m;

        /* renamed from: n, reason: collision with root package name */
        float f45091n;

        b() {
            this.f45082e = 0.0f;
            this.f45084g = 1.0f;
            this.f45085h = 1.0f;
            this.f45086i = 0.0f;
            this.f45087j = 1.0f;
            this.f45088k = 0.0f;
            this.f45089l = Paint.Cap.BUTT;
            this.f45090m = Paint.Join.MITER;
            this.f45091n = 4.0f;
        }

        @Override // androidx.vectordrawable.graphics.drawable.e.d
        public final boolean a() {
            return this.f45083f.g() || this.f45081d.g();
        }

        @Override // androidx.vectordrawable.graphics.drawable.e.d
        public final boolean b(int[] iArr) {
            return this.f45081d.h(iArr) | this.f45083f.h(iArr);
        }

        public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray e11 = k.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f45058c);
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
                String string = e11.getString(0);
                if (string != null) {
                    this.f45104b = string;
                }
                String string2 = e11.getString(2);
                if (string2 != null) {
                    this.f45103a = androidx.core.graphics.f.c(string2);
                }
                this.f45083f = k.c(e11, xmlPullParser, theme, "fillColor", 1);
                float f7 = this.f45085h;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillAlpha") != null) {
                    f7 = e11.getFloat(12, f7);
                }
                this.f45085h = f7;
                int i11 = !(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineCap") != null) ? -1 : e11.getInt(8, -1);
                Paint.Cap cap = this.f45089l;
                if (i11 == 0) {
                    cap = Paint.Cap.BUTT;
                } else if (i11 == 1) {
                    cap = Paint.Cap.ROUND;
                } else if (i11 == 2) {
                    cap = Paint.Cap.SQUARE;
                }
                this.f45089l = cap;
                int i12 = xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeLineJoin") != null ? e11.getInt(9, -1) : -1;
                Paint.Join join = this.f45090m;
                if (i12 == 0) {
                    join = Paint.Join.MITER;
                } else if (i12 == 1) {
                    join = Paint.Join.ROUND;
                } else if (i12 == 2) {
                    join = Paint.Join.BEVEL;
                }
                this.f45090m = join;
                float f11 = this.f45091n;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeMiterLimit") != null) {
                    f11 = e11.getFloat(10, f11);
                }
                this.f45091n = f11;
                this.f45081d = k.c(e11, xmlPullParser, theme, "strokeColor", 3);
                float f12 = this.f45084g;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeAlpha") != null) {
                    f12 = e11.getFloat(11, f12);
                }
                this.f45084g = f12;
                float f13 = this.f45082e;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "strokeWidth") != null) {
                    f13 = e11.getFloat(4, f13);
                }
                this.f45082e = f13;
                float f14 = this.f45087j;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathEnd") != null) {
                    f14 = e11.getFloat(6, f14);
                }
                this.f45087j = f14;
                float f15 = this.f45088k;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathOffset") != null) {
                    f15 = e11.getFloat(7, f15);
                }
                this.f45088k = f15;
                float f16 = this.f45086i;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "trimPathStart") != null) {
                    f16 = e11.getFloat(5, f16);
                }
                this.f45086i = f16;
                int i13 = this.f45105c;
                if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "fillType") != null) {
                    i13 = e11.getInt(13, i13);
                }
                this.f45105c = i13;
            }
            e11.recycle();
        }

        float getFillAlpha() {
            return this.f45085h;
        }

        int getFillColor() {
            return this.f45083f.c();
        }

        float getStrokeAlpha() {
            return this.f45084g;
        }

        int getStrokeColor() {
            return this.f45081d.c();
        }

        float getStrokeWidth() {
            return this.f45082e;
        }

        float getTrimPathEnd() {
            return this.f45087j;
        }

        float getTrimPathOffset() {
            return this.f45088k;
        }

        float getTrimPathStart() {
            return this.f45086i;
        }

        void setFillAlpha(float f7) {
            this.f45085h = f7;
        }

        void setFillColor(int i11) {
            this.f45083f.i(i11);
        }

        void setStrokeAlpha(float f7) {
            this.f45084g = f7;
        }

        void setStrokeColor(int i11) {
            this.f45081d.i(i11);
        }

        void setStrokeWidth(float f7) {
            this.f45082e = f7;
        }

        void setTrimPathEnd(float f7) {
            this.f45087j = f7;
        }

        void setTrimPathOffset(float f7) {
            this.f45088k = f7;
        }

        void setTrimPathStart(float f7) {
            this.f45086i = f7;
        }

        b(b bVar) {
            super(bVar);
            this.f45082e = 0.0f;
            this.f45084g = 1.0f;
            this.f45085h = 1.0f;
            this.f45086i = 0.0f;
            this.f45087j = 1.0f;
            this.f45088k = 0.0f;
            this.f45089l = Paint.Cap.BUTT;
            this.f45090m = Paint.Join.MITER;
            this.f45091n = 4.0f;
            this.f45081d = bVar.f45081d;
            this.f45082e = bVar.f45082e;
            this.f45084g = bVar.f45084g;
            this.f45083f = bVar.f45083f;
            this.f45105c = bVar.f45105c;
            this.f45085h = bVar.f45085h;
            this.f45086i = bVar.f45086i;
            this.f45087j = bVar.f45087j;
            this.f45088k = bVar.f45088k;
            this.f45089l = bVar.f45089l;
            this.f45090m = bVar.f45090m;
            this.f45091n = bVar.f45091n;
        }
    }

    e(@NonNull g gVar) {
        this.f45077f = true;
        this.f45078g = new float[9];
        this.f45079h = new Matrix();
        this.f45080i = new Rect();
        this.f45073b = gVar;
        this.f45074c = d(gVar.f45124c, gVar.f45125d);
    }

    private static class f {

        /* renamed from: p, reason: collision with root package name */
        private static final Matrix f45106p = new Matrix();

        /* renamed from: a, reason: collision with root package name */
        private final Path f45107a;

        /* renamed from: b, reason: collision with root package name */
        private final Path f45108b;

        /* renamed from: c, reason: collision with root package name */
        private final Matrix f45109c;

        /* renamed from: d, reason: collision with root package name */
        Paint f45110d;

        /* renamed from: e, reason: collision with root package name */
        Paint f45111e;

        /* renamed from: f, reason: collision with root package name */
        private PathMeasure f45112f;

        /* renamed from: g, reason: collision with root package name */
        final c f45113g;

        /* renamed from: h, reason: collision with root package name */
        float f45114h;

        /* renamed from: i, reason: collision with root package name */
        float f45115i;

        /* renamed from: j, reason: collision with root package name */
        float f45116j;

        /* renamed from: k, reason: collision with root package name */
        float f45117k;

        /* renamed from: l, reason: collision with root package name */
        int f45118l;

        /* renamed from: m, reason: collision with root package name */
        String f45119m;

        /* renamed from: n, reason: collision with root package name */
        Boolean f45120n;

        /* renamed from: o, reason: collision with root package name */
        final C5132a<String, Object> f45121o;

        public f() {
            this.f45109c = new Matrix();
            this.f45114h = 0.0f;
            this.f45115i = 0.0f;
            this.f45116j = 0.0f;
            this.f45117k = 0.0f;
            this.f45118l = 255;
            this.f45119m = null;
            this.f45120n = null;
            this.f45121o = new C5132a<>();
            this.f45113g = new c();
            this.f45107a = new Path();
            this.f45108b = new Path();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void b(c cVar, Matrix matrix, Canvas canvas, int i11, int i12) {
            char c11;
            float f7;
            float f11;
            int i13;
            c cVar2 = cVar;
            char c12 = 1;
            cVar2.f45092a.set(matrix);
            Matrix matrix2 = cVar2.f45092a;
            matrix2.preConcat(cVar2.f45101j);
            canvas.save();
            char c13 = 0;
            int i14 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar2.f45093b;
                if (i14 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar = arrayList.get(i14);
                if (dVar instanceof c) {
                    b((c) dVar, matrix2, canvas, i11, i12);
                } else if (dVar instanceof AbstractC0819e) {
                    AbstractC0819e abstractC0819e = (AbstractC0819e) dVar;
                    float f12 = i11 / this.f45116j;
                    float f13 = i12 / this.f45117k;
                    float min = Math.min(f12, f13);
                    Matrix matrix3 = this.f45109c;
                    matrix3.set(matrix2);
                    matrix3.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix2.mapVectors(fArr);
                    float hypot = (float) Math.hypot(fArr[c13], fArr[c12]);
                    boolean z11 = c12;
                    boolean z12 = c13;
                    float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[z12 ? 1 : 0] * fArr[3]) - (fArr[z11 ? 1 : 0] * fArr[2]);
                    float max = Math.max(hypot, hypot2);
                    float abs = max > 0.0f ? Math.abs(f14) / max : 0.0f;
                    if (abs != 0.0f) {
                        Path path = this.f45107a;
                        abstractC0819e.d(path);
                        Path path2 = this.f45108b;
                        path2.reset();
                        if (abstractC0819e.c()) {
                            path2.setFillType(abstractC0819e.f45105c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix3);
                            canvas.clipPath(path2);
                        } else {
                            b bVar = (b) abstractC0819e;
                            float f15 = bVar.f45086i;
                            if (f15 != 0.0f || bVar.f45087j != 1.0f) {
                                float f16 = bVar.f45088k;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (bVar.f45087j + f16) % 1.0f;
                                if (this.f45112f == null) {
                                    this.f45112f = new PathMeasure();
                                }
                                this.f45112f.setPath(path, z12);
                                float length = this.f45112f.getLength();
                                float f19 = f17 * length;
                                float f21 = f18 * length;
                                path.reset();
                                if (f19 > f21) {
                                    this.f45112f.getSegment(f19, length, path, z11);
                                    f7 = 0.0f;
                                    this.f45112f.getSegment(0.0f, f21, path, z11);
                                } else {
                                    f7 = 0.0f;
                                    this.f45112f.getSegment(f19, f21, path, z11);
                                }
                                path.rLineTo(f7, f7);
                            }
                            path2.addPath(path, matrix3);
                            if (bVar.f45083f.j()) {
                                androidx.core.content.res.d dVar2 = bVar.f45083f;
                                if (this.f45111e == null) {
                                    i13 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f45111e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i13 = 16777215;
                                }
                                Paint paint2 = this.f45111e;
                                if (dVar2.f()) {
                                    Shader d11 = dVar2.d();
                                    d11.setLocalMatrix(matrix3);
                                    paint2.setShader(d11);
                                    paint2.setAlpha(Math.round(bVar.f45085h * 255.0f));
                                    f11 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int c14 = dVar2.c();
                                    float f22 = bVar.f45085h;
                                    PorterDuff.Mode mode = e.f45072j;
                                    f11 = 255.0f;
                                    paint2.setColor((c14 & i13) | (((int) (Color.alpha(c14) * f22)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(bVar.f45105c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            } else {
                                f11 = 255.0f;
                                i13 = 16777215;
                            }
                            if (bVar.f45081d.j()) {
                                androidx.core.content.res.d dVar3 = bVar.f45081d;
                                if (this.f45110d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.f45110d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.f45110d;
                                Paint.Join join = bVar.f45090m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = bVar.f45089l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(bVar.f45091n);
                                if (dVar3.f()) {
                                    Shader d12 = dVar3.d();
                                    d12.setLocalMatrix(matrix3);
                                    paint4.setShader(d12);
                                    paint4.setAlpha(Math.round(bVar.f45084g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int c15 = dVar3.c();
                                    float f23 = bVar.f45084g;
                                    PorterDuff.Mode mode2 = e.f45072j;
                                    paint4.setColor((c15 & i13) | (((int) (Color.alpha(c15) * f23)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(bVar.f45082e * min * abs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                    c11 = 1;
                    i14++;
                    cVar2 = cVar;
                    c12 = c11;
                    c13 = 0;
                }
                c11 = c12;
                i14++;
                cVar2 = cVar;
                c12 = c11;
                c13 = 0;
            }
        }

        public final void a(Canvas canvas, int i11, int i12) {
            b(this.f45113g, f45106p, canvas, i11, i12);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f45118l;
        }

        public void setAlpha(float f7) {
            setRootAlpha((int) (f7 * 255.0f));
        }

        public void setRootAlpha(int i11) {
            this.f45118l = i11;
        }

        public f(f fVar) {
            this.f45109c = new Matrix();
            this.f45114h = 0.0f;
            this.f45115i = 0.0f;
            this.f45116j = 0.0f;
            this.f45117k = 0.0f;
            this.f45118l = 255;
            this.f45119m = null;
            this.f45120n = null;
            C5132a<String, Object> c5132a = new C5132a<>();
            this.f45121o = c5132a;
            this.f45113g = new c(fVar.f45113g, c5132a);
            this.f45107a = new Path(fVar.f45107a);
            this.f45108b = new Path(fVar.f45108b);
            this.f45114h = fVar.f45114h;
            this.f45115i = fVar.f45115i;
            this.f45116j = fVar.f45116j;
            this.f45117k = fVar.f45117k;
            this.f45118l = fVar.f45118l;
            this.f45119m = fVar.f45119m;
            String str = fVar.f45119m;
            if (str != null) {
                c5132a.put(str, this);
            }
            this.f45120n = fVar.f45120n;
        }
    }

    private static class c extends d {

        /* renamed from: a, reason: collision with root package name */
        final Matrix f45092a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<d> f45093b;

        /* renamed from: c, reason: collision with root package name */
        float f45094c;

        /* renamed from: d, reason: collision with root package name */
        private float f45095d;

        /* renamed from: e, reason: collision with root package name */
        private float f45096e;

        /* renamed from: f, reason: collision with root package name */
        private float f45097f;

        /* renamed from: g, reason: collision with root package name */
        private float f45098g;

        /* renamed from: h, reason: collision with root package name */
        private float f45099h;

        /* renamed from: i, reason: collision with root package name */
        private float f45100i;

        /* renamed from: j, reason: collision with root package name */
        final Matrix f45101j;

        /* renamed from: k, reason: collision with root package name */
        private String f45102k;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public c(c cVar, C5132a<String, Object> c5132a) {
            super(r0);
            AbstractC0819e aVar;
            int i11 = 0;
            this.f45092a = new Matrix();
            this.f45093b = new ArrayList<>();
            this.f45094c = 0.0f;
            this.f45095d = 0.0f;
            this.f45096e = 0.0f;
            this.f45097f = 1.0f;
            this.f45098g = 1.0f;
            this.f45099h = 0.0f;
            this.f45100i = 0.0f;
            Matrix matrix = new Matrix();
            this.f45101j = matrix;
            this.f45102k = null;
            this.f45094c = cVar.f45094c;
            this.f45095d = cVar.f45095d;
            this.f45096e = cVar.f45096e;
            this.f45097f = cVar.f45097f;
            this.f45098g = cVar.f45098g;
            this.f45099h = cVar.f45099h;
            this.f45100i = cVar.f45100i;
            String str = cVar.f45102k;
            this.f45102k = str;
            if (str != null) {
                c5132a.put(str, this);
            }
            matrix.set(cVar.f45101j);
            ArrayList<d> arrayList = cVar.f45093b;
            while (i11 < arrayList.size()) {
                d dVar = arrayList.get(i11);
                if (dVar instanceof c) {
                    this.f45093b.add(new c((c) dVar, c5132a));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else {
                        if (!(dVar instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) dVar);
                    }
                    this.f45093b.add(aVar);
                    String str2 = aVar.f45104b;
                    if (str2 != null) {
                        c5132a.put(str2, aVar);
                    }
                }
                i11++;
            }
        }

        private void d() {
            Matrix matrix = this.f45101j;
            matrix.reset();
            matrix.postTranslate(-this.f45095d, -this.f45096e);
            matrix.postScale(this.f45097f, this.f45098g);
            matrix.postRotate(this.f45094c, 0.0f, 0.0f);
            matrix.postTranslate(this.f45099h + this.f45095d, this.f45100i + this.f45096e);
        }

        @Override // androidx.vectordrawable.graphics.drawable.e.d
        public final boolean a() {
            int i11 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f45093b;
                if (i11 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i11).a()) {
                    return true;
                }
                i11++;
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.e.d
        public final boolean b(int[] iArr) {
            int i11 = 0;
            boolean z11 = false;
            while (true) {
                ArrayList<d> arrayList = this.f45093b;
                if (i11 >= arrayList.size()) {
                    return z11;
                }
                z11 |= arrayList.get(i11).b(iArr);
                i11++;
            }
        }

        public final void c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            TypedArray e11 = k.e(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f45057b);
            float f7 = this.f45094c;
            if (k.d(xmlPullParser, "rotation")) {
                f7 = e11.getFloat(5, f7);
            }
            this.f45094c = f7;
            this.f45095d = e11.getFloat(1, this.f45095d);
            this.f45096e = e11.getFloat(2, this.f45096e);
            float f11 = this.f45097f;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleX") != null) {
                f11 = e11.getFloat(3, f11);
            }
            this.f45097f = f11;
            float f12 = this.f45098g;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "scaleY") != null) {
                f12 = e11.getFloat(4, f12);
            }
            this.f45098g = f12;
            float f13 = this.f45099h;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateX") != null) {
                f13 = e11.getFloat(6, f13);
            }
            this.f45099h = f13;
            float f14 = this.f45100i;
            if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "translateY") != null) {
                f14 = e11.getFloat(7, f14);
            }
            this.f45100i = f14;
            String string = e11.getString(0);
            if (string != null) {
                this.f45102k = string;
            }
            d();
            e11.recycle();
        }

        public String getGroupName() {
            return this.f45102k;
        }

        public Matrix getLocalMatrix() {
            return this.f45101j;
        }

        public float getPivotX() {
            return this.f45095d;
        }

        public float getPivotY() {
            return this.f45096e;
        }

        public float getRotation() {
            return this.f45094c;
        }

        public float getScaleX() {
            return this.f45097f;
        }

        public float getScaleY() {
            return this.f45098g;
        }

        public float getTranslateX() {
            return this.f45099h;
        }

        public float getTranslateY() {
            return this.f45100i;
        }

        public void setPivotX(float f7) {
            if (f7 != this.f45095d) {
                this.f45095d = f7;
                d();
            }
        }

        public void setPivotY(float f7) {
            if (f7 != this.f45096e) {
                this.f45096e = f7;
                d();
            }
        }

        public void setRotation(float f7) {
            if (f7 != this.f45094c) {
                this.f45094c = f7;
                d();
            }
        }

        public void setScaleX(float f7) {
            if (f7 != this.f45097f) {
                this.f45097f = f7;
                d();
            }
        }

        public void setScaleY(float f7) {
            if (f7 != this.f45098g) {
                this.f45098g = f7;
                d();
            }
        }

        public void setTranslateX(float f7) {
            if (f7 != this.f45099h) {
                this.f45099h = f7;
                d();
            }
        }

        public void setTranslateY(float f7) {
            if (f7 != this.f45100i) {
                this.f45100i = f7;
                d();
            }
        }

        public c() {
            super(0);
            this.f45092a = new Matrix();
            this.f45093b = new ArrayList<>();
            this.f45094c = 0.0f;
            this.f45095d = 0.0f;
            this.f45096e = 0.0f;
            this.f45097f = 1.0f;
            this.f45098g = 1.0f;
            this.f45099h = 0.0f;
            this.f45100i = 0.0f;
            this.f45101j = new Matrix();
            this.f45102k = null;
        }
    }
}
