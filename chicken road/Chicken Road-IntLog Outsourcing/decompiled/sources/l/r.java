package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import g.AbstractC0444a;
import h.AbstractC0477a;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f10948a;

    /* renamed from: b, reason: collision with root package name */
    public T4.h f10949b;

    /* renamed from: c, reason: collision with root package name */
    public T4.h f10950c;

    /* renamed from: d, reason: collision with root package name */
    public T4.h f10951d;

    /* renamed from: e, reason: collision with root package name */
    public T4.h f10952e;

    /* renamed from: f, reason: collision with root package name */
    public T4.h f10953f;

    /* renamed from: g, reason: collision with root package name */
    public T4.h f10954g;

    /* renamed from: h, reason: collision with root package name */
    public T4.h f10955h;

    /* renamed from: i, reason: collision with root package name */
    public final C1247t f10956i;

    /* renamed from: j, reason: collision with root package name */
    public int f10957j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f10958k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f10959l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10960m;

    public r(TextView textView) {
        this.f10948a = textView;
        this.f10956i = new C1247t(textView);
    }

    public static T4.h c(Context context, C1242n c1242n, int i2) {
        ColorStateList f3;
        synchronized (c1242n) {
            f3 = c1242n.f10910a.f(context, i2);
        }
        if (f3 == null) {
            return null;
        }
        T4.h hVar = new T4.h();
        hVar.f2877b = true;
        hVar.f2878c = f3;
        return hVar;
    }

    public final void a(Drawable drawable, T4.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        C1242n.c(drawable, hVar, this.f10948a.getDrawableState());
    }

    public final void b() {
        T4.h hVar = this.f10949b;
        TextView textView = this.f10948a;
        if (hVar != null || this.f10950c != null || this.f10951d != null || this.f10952e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f10949b);
            a(compoundDrawables[1], this.f10950c);
            a(compoundDrawables[2], this.f10951d);
            a(compoundDrawables[3], this.f10952e);
        }
        if (this.f10953f == null && this.f10954g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f10953f);
        a(compoundDrawablesRelative[2], this.f10954g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0331, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i2) {
        C1242n c1242n;
        boolean z;
        boolean z5;
        String str;
        String str2;
        boolean z6;
        int i3;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i6;
        int resourceId2;
        TextView textView = this.f10948a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C1242n.f10908b;
        synchronized (C1242n.class) {
            try {
                if (C1242n.f10909c == null) {
                    C1242n.b();
                }
                c1242n = C1242n.f10909c;
            } catch (Throwable th) {
                throw th;
            }
        }
        B4.i M5 = B4.i.M(context, attributeSet, AbstractC0444a.f5698f, i2);
        TypedArray typedArray = (TypedArray) M5.f312c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f10949b = c(context, c1242n, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f10950c = c(context, c1242n, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f10951d = c(context, c1242n, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f10952e = c(context, c1242n, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f10953f = c(context, c1242n, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f10954g = c(context, c1242n, typedArray.getResourceId(6, 0));
        }
        M5.P();
        boolean z7 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = AbstractC0444a.f5711s;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            B4.i iVar = new B4.i(context, obtainStyledAttributes);
            if (z7 || !obtainStyledAttributes.hasValue(14)) {
                z = false;
                z5 = false;
            } else {
                z5 = obtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            f(context, iVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i7 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            iVar.P();
        } else {
            z = false;
            z5 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        B4.i iVar2 = new B4.i(context, obtainStyledAttributes2);
        if (z7 || !obtainStyledAttributes2.hasValue(14)) {
            z6 = z5;
        } else {
            z6 = obtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i7 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, iVar2);
        iVar2.P();
        if (!z7 && z) {
            this.f10948a.setAllCaps(z6);
        }
        Typeface typeface = this.f10959l;
        if (typeface != null) {
            if (this.f10958k == -1) {
                textView.setTypeface(typeface, this.f10957j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            textView.setFontVariationSettings(str);
        }
        if (str2 != null) {
            textView.setTextLocales(LocaleList.forLanguageTags(str2));
        }
        int[] iArr2 = AbstractC0444a.f5699g;
        C1247t c1247t = this.f10956i;
        Context context2 = c1247t.f10977j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1247t.f10968a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i8 = 0; i8 < length; i8++) {
                    iArr3[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                }
                c1247t.f10973f = C1247t.b(iArr3);
                c1247t.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c1247t.f10968a == 1) {
            if (!c1247t.f10974g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c1247t.i(dimension2, dimension3, dimension);
            }
            c1247t.g();
        }
        if (I.b.f1221O && c1247t.f10968a != 0) {
            int[] iArr4 = c1247t.f10973f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c1247t.f10971d), Math.round(c1247t.f10972e), Math.round(c1247t.f10970c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a6 = resourceId4 != -1 ? c1242n.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a7 = resourceId5 != -1 ? c1242n.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a8 = resourceId6 != -1 ? c1242n.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a9 = resourceId7 != -1 ? c1242n.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a10 = resourceId8 != -1 ? c1242n.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a11 = resourceId9 != -1 ? c1242n.a(context, resourceId9) : null;
        if (a10 != null || a11 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a10 == null) {
                a10 = compoundDrawablesRelative[0];
            }
            if (a7 == null) {
                a7 = compoundDrawablesRelative[1];
            }
            if (a11 == null) {
                a11 = compoundDrawablesRelative[2];
            }
            if (a9 == null) {
                a9 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a10, a7, a11, a9);
        } else if (a6 != null || a7 != null || a8 != null || a9 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a6 == null) {
                    a6 = compoundDrawables[0];
                }
                if (a7 == null) {
                    a7 = compoundDrawables[1];
                }
                if (a8 == null) {
                    a8 = compoundDrawables[2];
                }
                if (a9 == null) {
                    a9 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a6, a7, a8, a9);
            } else {
                if (a7 == null) {
                    a7 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a9 == null) {
                    a9 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a7, drawable2, a9);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) != 0) {
                Object obj = AbstractC0477a.f5759a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            I.l.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            I.l.g(textView, AbstractC1250w.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i3);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            AbstractC1477a.x(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            AbstractC1477a.y(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i2) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, AbstractC0444a.f5711s);
        B4.i iVar = new B4.i(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f10948a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, iVar);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        iVar.P();
        Typeface typeface = this.f10959l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f10957j);
        }
    }

    public final void f(Context context, B4.i iVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i2 = this.f10957j;
        TypedArray typedArray = (TypedArray) iVar.f312c;
        this.f10957j = typedArray.getInt(2, i2);
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f10958k = i6;
            if (i6 != -1) {
                this.f10957j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f10960m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f10959l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f10959l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f10959l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f10959l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f10958k;
        int i10 = this.f10957j;
        if (!context.isRestricted()) {
            try {
                Typeface G5 = iVar.G(i8, this.f10957j, new G2.f(this, i9, i10));
                if (G5 != null) {
                    if (i3 < 28 || this.f10958k == -1) {
                        this.f10959l = G5;
                    } else {
                        create2 = Typeface.create(Typeface.create(G5, 0), this.f10958k, (this.f10957j & 2) != 0);
                        this.f10959l = create2;
                    }
                }
                this.f10960m = this.f10959l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f10959l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f10958k == -1) {
            this.f10959l = Typeface.create(string, this.f10957j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f10958k, (this.f10957j & 2) != 0);
            this.f10959l = create;
        }
    }
}
