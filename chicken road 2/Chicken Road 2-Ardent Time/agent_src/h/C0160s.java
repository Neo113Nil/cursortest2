package h;

/* renamed from: h.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0160s {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f3247a;

    /* renamed from: b, reason: collision with root package name */
    public I1.h f3248b;

    /* renamed from: c, reason: collision with root package name */
    public I1.h f3249c;

    /* renamed from: d, reason: collision with root package name */
    public I1.h f3250d;

    /* renamed from: e, reason: collision with root package name */
    public I1.h f3251e;

    /* renamed from: f, reason: collision with root package name */
    public I1.h f3252f;

    /* renamed from: g, reason: collision with root package name */
    public I1.h f3253g;

    /* renamed from: h, reason: collision with root package name */
    public I1.h f3254h;

    /* renamed from: i, reason: collision with root package name */
    public final h.C0162u f3255i;

    /* renamed from: j, reason: collision with root package name */
    public int f3256j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f3257k = -1;

    /* renamed from: l, reason: collision with root package name */
    public android.graphics.Typeface f3258l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3259m;

    public C0160s(android.widget.TextView textView) {
        this.f3247a = textView;
        this.f3255i = new h.C0162u(textView);
    }

    public static I1.h c(android.content.Context context, h.C0157o c0157o, int i2) {
        android.content.res.ColorStateList f2;
        synchronized (c0157o) {
            f2 = c0157o.f3221a.f(context, i2);
        }
        if (f2 == null) {
            return null;
        }
        I1.h hVar = new I1.h();
        hVar.f724b = true;
        hVar.f725c = f2;
        return hVar;
    }

    public final void a(android.graphics.drawable.Drawable drawable, I1.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        h.C0157o.c(drawable, hVar, this.f3247a.getDrawableState());
    }

    public final void b() {
        I1.h hVar = this.f3248b;
        android.widget.TextView textView = this.f3247a;
        if (hVar != null || this.f3249c != null || this.f3250d != null || this.f3251e != null) {
            android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f3248b);
            a(compoundDrawables[1], this.f3249c);
            a(compoundDrawables[2], this.f3250d);
            a(compoundDrawables[3], this.f3251e);
        }
        if (this.f3252f == null && this.f3253g == null) {
            return;
        }
        android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f3252f);
        a(compoundDrawablesRelative[2], this.f3253g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0331, code lost:
    
        if (r3 != null) goto L221;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(android.util.AttributeSet attributeSet, int i2) {
        h.C0157o c0157o;
        boolean z2;
        boolean z3;
        java.lang.String str;
        java.lang.String str2;
        boolean z4;
        int i3;
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i4;
        int resourceId2;
        android.widget.TextView textView = this.f3247a;
        android.content.Context context = textView.getContext();
        android.graphics.PorterDuff.Mode mode = h.C0157o.f3219b;
        synchronized (h.C0157o.class) {
            try {
                if (h.C0157o.f3220c == null) {
                    h.C0157o.b();
                }
                c0157o = h.C0157o.f3220c;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        I0.b H2 = I0.b.H(context, attributeSet, c.AbstractC0095a.f2537f, i2);
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) H2.f658c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f3248b = c(context, c0157o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f3249c = c(context, c0157o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f3250d = c(context, c0157o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f3251e = c(context, c0157o, typedArray.getResourceId(2, 0));
        }
        int i5 = android.os.Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f3252f = c(context, c0157o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f3253g = c(context, c0157o, typedArray.getResourceId(6, 0));
        }
        H2.K();
        boolean z5 = textView.getTransformationMethod() instanceof android.text.method.PasswordTransformationMethod;
        int[] iArr = c.AbstractC0095a.f2550s;
        if (resourceId3 != -1) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr);
            I0.b bVar = new I0.b(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z3 = obtainStyledAttributes.getBoolean(14, false);
                z2 = true;
            }
            f(context, bVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i5 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            bVar.K();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i2, 0);
        I0.b bVar2 = new I0.b(context, obtainStyledAttributes2);
        if (z5 || !obtainStyledAttributes2.hasValue(14)) {
            z4 = z3;
        } else {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z2 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i5 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i5 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, bVar2);
        bVar2.K();
        if (!z5 && z2) {
            this.f3247a.setAllCaps(z4);
        }
        android.graphics.Typeface typeface = this.f3258l;
        if (typeface != null) {
            if (this.f3257k == -1) {
                textView.setTypeface(typeface, this.f3256j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            textView.setFontVariationSettings(str);
        }
        if (str2 != null) {
            textView.setTextLocales(android.os.LocaleList.forLanguageTags(str2));
        }
        int[] iArr2 = c.AbstractC0095a.f2538g;
        h.C0162u c0162u = this.f3255i;
        android.content.Context context2 = c0162u.f3276j;
        android.content.res.TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i2, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c0162u.f3267a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            android.content.res.TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr3 = new int[length];
            if (length > 0) {
                for (int i6 = 0; i6 < length; i6++) {
                    iArr3[i6] = obtainTypedArray.getDimensionPixelSize(i6, -1);
                }
                c0162u.f3272f = h.C0162u.b(iArr3);
                c0162u.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c0162u.f3267a == 1) {
            if (!c0162u.f3273g) {
                android.util.DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i4 = 2;
                    dimension2 = android.util.TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i4 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = android.util.TypedValue.applyDimension(i4, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c0162u.i(dimension2, dimension3, dimension);
            }
            c0162u.g();
        }
        if (C.c.f68N && c0162u.f3267a != 0) {
            int[] iArr4 = c0162u.f3272f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != -1.0f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(java.lang.Math.round(c0162u.f3270d), java.lang.Math.round(c0162u.f3271e), java.lang.Math.round(c0162u.f3269c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        android.content.res.TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        android.graphics.drawable.Drawable a2 = resourceId4 != -1 ? c0157o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        android.graphics.drawable.Drawable a3 = resourceId5 != -1 ? c0157o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        android.graphics.drawable.Drawable a4 = resourceId6 != -1 ? c0157o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        android.graphics.drawable.Drawable a5 = resourceId7 != -1 ? c0157o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        android.graphics.drawable.Drawable a6 = resourceId8 != -1 ? c0157o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        android.graphics.drawable.Drawable a7 = resourceId9 != -1 ? c0157o.a(context, resourceId9) : null;
        if (a6 != null || a7 != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a6 == null) {
                a6 = compoundDrawablesRelative[0];
            }
            if (a3 == null) {
                a3 = compoundDrawablesRelative[1];
            }
            if (a7 == null) {
                a7 = compoundDrawablesRelative[2];
            }
            if (a5 == null) {
                a5 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a6, a3, a7, a5);
        } else if (a2 != null || a3 != null || a4 != null || a5 != null) {
            android.graphics.drawable.Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            android.graphics.drawable.Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                android.graphics.drawable.Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a2 == null) {
                    a2 = compoundDrawables[0];
                }
                if (a3 == null) {
                    a3 = compoundDrawables[1];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[2];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a2, a3, a4, a5);
            } else {
                if (a3 == null) {
                    a3 = compoundDrawablesRelative2[1];
                }
                android.graphics.drawable.Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a5 == null) {
                    a5 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a3, drawable2, a5);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) != 0) {
                java.lang.Object obj = d.AbstractC0106a.f2737a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            C.o.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i3 = -1;
            C.o.g(textView, h.AbstractC0165x.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i3 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i3);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i3);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i3);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            Q1.l.w(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            Q1.l.x(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i3) {
            if (dimensionPixelSize3 < 0) {
                throw new java.lang.IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(android.content.Context context, int i2) {
        java.lang.String string;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i2, c.AbstractC0095a.f2550s);
        I0.b bVar = new I0.b(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        android.widget.TextView textView = this.f3247a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, bVar);
        if (i3 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        bVar.K();
        android.graphics.Typeface typeface = this.f3258l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f3256j);
        }
    }

    public final void f(android.content.Context context, I0.b bVar) {
        java.lang.String string;
        android.graphics.Typeface create;
        android.graphics.Typeface create2;
        int i2 = this.f3256j;
        android.content.res.TypedArray typedArray = (android.content.res.TypedArray) bVar.f658c;
        this.f3256j = typedArray.getInt(2, i2);
        int i3 = android.os.Build.VERSION.SDK_INT;
        if (i3 >= 28) {
            int i4 = typedArray.getInt(11, -1);
            this.f3257k = i4;
            if (i4 != -1) {
                this.f3256j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f3259m = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 == 1) {
                    this.f3258l = android.graphics.Typeface.SANS_SERIF;
                    return;
                } else if (i5 == 2) {
                    this.f3258l = android.graphics.Typeface.SERIF;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.f3258l = android.graphics.Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f3258l = null;
        int i6 = typedArray.hasValue(12) ? 12 : 10;
        int i7 = this.f3257k;
        int i8 = this.f3256j;
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface B2 = bVar.B(i6, this.f3256j, new P1.B(this, i7, i8));
                if (B2 != null) {
                    if (i3 < 28 || this.f3257k == -1) {
                        this.f3258l = B2;
                    } else {
                        create2 = android.graphics.Typeface.create(android.graphics.Typeface.create(B2, 0), this.f3257k, (this.f3256j & 2) != 0);
                        this.f3258l = create2;
                    }
                }
                this.f3259m = this.f3258l == null;
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            }
        }
        if (this.f3258l != null || (string = typedArray.getString(i6)) == null) {
            return;
        }
        if (android.os.Build.VERSION.SDK_INT < 28 || this.f3257k == -1) {
            this.f3258l = android.graphics.Typeface.create(string, this.f3256j);
        } else {
            create = android.graphics.Typeface.create(android.graphics.Typeface.create(string, 0), this.f3257k, (this.f3256j & 2) != 0);
            this.f3258l = create;
        }
    }
}
