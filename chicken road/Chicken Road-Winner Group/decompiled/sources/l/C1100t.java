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
import g.AbstractC0301a;
import h.AbstractC0323a;

/* renamed from: l.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1100t {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f9884a;

    /* renamed from: b, reason: collision with root package name */
    public V.e f9885b;

    /* renamed from: c, reason: collision with root package name */
    public V.e f9886c;

    /* renamed from: d, reason: collision with root package name */
    public V.e f9887d;

    /* renamed from: e, reason: collision with root package name */
    public V.e f9888e;
    public V.e f;

    /* renamed from: g, reason: collision with root package name */
    public V.e f9889g;

    /* renamed from: h, reason: collision with root package name */
    public V.e f9890h;

    /* renamed from: i, reason: collision with root package name */
    public final C1102v f9891i;

    /* renamed from: j, reason: collision with root package name */
    public int f9892j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f9893k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f9894l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9895m;

    public C1100t(TextView textView) {
        this.f9884a = textView;
        this.f9891i = new C1102v(textView);
    }

    public static V.e c(Context context, C1096o c1096o, int i3) {
        ColorStateList f;
        synchronized (c1096o) {
            f = c1096o.f9844a.f(context, i3);
        }
        if (f == null) {
            return null;
        }
        V.e eVar = new V.e();
        eVar.f1603b = true;
        eVar.f1604c = f;
        return eVar;
    }

    public final void a(Drawable drawable, V.e eVar) {
        if (drawable == null || eVar == null) {
            return;
        }
        C1096o.c(drawable, eVar, this.f9884a.getDrawableState());
    }

    public final void b() {
        V.e eVar = this.f9885b;
        TextView textView = this.f9884a;
        if (eVar != null || this.f9886c != null || this.f9887d != null || this.f9888e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f9885b);
            a(compoundDrawables[1], this.f9886c);
            a(compoundDrawables[2], this.f9887d);
            a(compoundDrawables[3], this.f9888e);
        }
        if (this.f == null && this.f9889g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.f9889g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:161:0x0342, code lost:
    
        if (r3 != null) goto L222;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i3) {
        C1096o c1096o;
        boolean z3;
        boolean z4;
        String str;
        String str2;
        int i4;
        float f;
        int i5;
        ColorStateList colorStateList;
        int resourceId;
        int autoSizeStepGranularity;
        int i6;
        TextView textView = this.f9884a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C1096o.f9842b;
        synchronized (C1096o.class) {
            try {
                if (C1096o.f9843c == null) {
                    C1096o.b();
                }
                c1096o = C1096o.f9843c;
            } catch (Throwable th) {
                throw th;
            }
        }
        A0.j I3 = A0.j.I(context, attributeSet, AbstractC0301a.f, i3);
        TypedArray typedArray = (TypedArray) I3.f67c;
        int resourceId2 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f9885b = c(context, c1096o, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f9886c = c(context, c1096o, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f9887d = c(context, c1096o, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f9888e = c(context, c1096o, typedArray.getResourceId(2, 0));
        }
        int i7 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f = c(context, c1096o, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f9889g = c(context, c1096o, typedArray.getResourceId(6, 0));
        }
        I3.L();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr = AbstractC0301a.f4943s;
        if (resourceId2 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId2, iArr);
            A0.j jVar = new A0.j(context, obtainStyledAttributes);
            if (z5 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z4 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            f(context, jVar);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i7 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            jVar.L();
        } else {
            z3 = false;
            z4 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i3, 0);
        A0.j jVar2 = new A0.j(context, obtainStyledAttributes2);
        if (!z5 && obtainStyledAttributes2.hasValue(14)) {
            z4 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z6 = z4;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i7 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i7 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar2);
        jVar2.L();
        if (!z5 && z3) {
            this.f9884a.setAllCaps(z6);
        }
        Typeface typeface = this.f9894l;
        if (typeface != null) {
            if (this.f9893k == -1) {
                textView.setTypeface(typeface, this.f9892j);
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
        int[] iArr2 = AbstractC0301a.f4931g;
        C1102v c1102v = this.f9891i;
        Context context2 = c1102v.f9911j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr2, i3, 0);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1102v.f9903a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3)) {
            f = -1.0f;
            int resourceId3 = obtainStyledAttributes3.getResourceId(3, 0);
            if (resourceId3 > 0) {
                TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId3);
                int length = obtainTypedArray.length();
                i4 = 0;
                int[] iArr3 = new int[length];
                if (length > 0) {
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr3[i8] = obtainTypedArray.getDimensionPixelSize(i8, -1);
                    }
                    c1102v.f = C1102v.b(iArr3);
                    c1102v.h();
                }
                obtainTypedArray.recycle();
            } else {
                i4 = 0;
            }
        } else {
            i4 = 0;
            f = -1.0f;
        }
        obtainStyledAttributes3.recycle();
        if (c1102v.f9903a == 1) {
            if (!c1102v.f9908g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == f) {
                    i6 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i6 = 2;
                }
                if (dimension3 == f) {
                    dimension3 = TypedValue.applyDimension(i6, 112.0f, displayMetrics);
                }
                if (dimension == f) {
                    dimension = 1.0f;
                }
                c1102v.i(dimension2, dimension3, dimension);
            }
            c1102v.g();
        }
        if (H.b.f460t0 && c1102v.f9903a != 0) {
            int[] iArr4 = c1102v.f;
            if (iArr4.length > 0) {
                autoSizeStepGranularity = textView.getAutoSizeStepGranularity();
                if (autoSizeStepGranularity != f) {
                    textView.setAutoSizeTextTypeUniformWithConfiguration(Math.round(c1102v.f9906d), Math.round(c1102v.f9907e), Math.round(c1102v.f9905c), 0);
                } else {
                    textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr4, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr2);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a3 = resourceId4 != -1 ? c1096o.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a4 = resourceId5 != -1 ? c1096o.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a5 = resourceId6 != -1 ? c1096o.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a6 = resourceId7 != -1 ? c1096o.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a7 = resourceId8 != -1 ? c1096o.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a8 = resourceId9 != -1 ? c1096o.a(context, resourceId9) : null;
        if (a7 != null || a8 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a7 == null) {
                a7 = compoundDrawablesRelative[i4];
            }
            if (a4 == null) {
                a4 = compoundDrawablesRelative[1];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[2];
            }
            if (a6 == null) {
                a6 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a7, a4, a8, a6);
        } else if (a3 != null || a4 != null || a5 != null || a6 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[i4];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a3 == null) {
                    a3 = compoundDrawables[i4];
                }
                if (a4 == null) {
                    a4 = compoundDrawables[1];
                }
                if (a5 == null) {
                    a5 = compoundDrawables[2];
                }
                if (a6 == null) {
                    a6 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a3, a4, a5, a6);
            } else {
                if (a4 == null) {
                    a4 = compoundDrawablesRelative2[1];
                }
                Drawable drawable2 = compoundDrawablesRelative2[2];
                if (a6 == null) {
                    a6 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a4, drawable2, a6);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (obtainStyledAttributes4.hasValue(11) && (resourceId = obtainStyledAttributes4.getResourceId(11, i4)) != 0) {
                Object obj = AbstractC0323a.f4982a;
                colorStateList = context.getColorStateList(resourceId);
            }
            colorStateList = obtainStyledAttributes4.getColorStateList(11);
            H.m.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i5 = -1;
            H.m.g(textView, AbstractC1105y.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i5 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(14, i5);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(17, i5);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(18, i5);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i5) {
            X0.a.H(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i5) {
            X0.a.I(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i5) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r0, 1.0f);
            }
        }
    }

    public final void e(Context context, int i3) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i3, AbstractC0301a.f4943s);
        A0.j jVar = new A0.j(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f9884a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i4 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, jVar);
        if (i4 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            textView.setFontVariationSettings(string);
        }
        jVar.L();
        Typeface typeface = this.f9894l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f9892j);
        }
    }

    public final void f(Context context, A0.j jVar) {
        String string;
        Typeface create;
        Typeface create2;
        int i3 = this.f9892j;
        TypedArray typedArray = (TypedArray) jVar.f67c;
        this.f9892j = typedArray.getInt(2, i3);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 28) {
            int i5 = typedArray.getInt(11, -1);
            this.f9893k = i5;
            if (i5 != -1) {
                this.f9892j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f9895m = false;
                int i6 = typedArray.getInt(1, 1);
                if (i6 == 1) {
                    this.f9894l = Typeface.SANS_SERIF;
                    return;
                } else if (i6 == 2) {
                    this.f9894l = Typeface.SERIF;
                    return;
                } else {
                    if (i6 != 3) {
                        return;
                    }
                    this.f9894l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f9894l = null;
        int i7 = typedArray.hasValue(12) ? 12 : 10;
        int i8 = this.f9893k;
        int i9 = this.f9892j;
        if (!context.isRestricted()) {
            try {
                Typeface B3 = jVar.B(i7, this.f9892j, new C1099s(this, i8, i9));
                if (B3 != null) {
                    if (i4 < 28 || this.f9893k == -1) {
                        this.f9894l = B3;
                    } else {
                        create2 = Typeface.create(Typeface.create(B3, 0), this.f9893k, (this.f9892j & 2) != 0);
                        this.f9894l = create2;
                    }
                }
                this.f9895m = this.f9894l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f9894l != null || (string = typedArray.getString(i7)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f9893k == -1) {
            this.f9894l = Typeface.create(string, this.f9892j);
        } else {
            create = Typeface.create(Typeface.create(string, 0), this.f9893k, (this.f9892j & 2) != 0);
            this.f9894l = create;
        }
    }
}
