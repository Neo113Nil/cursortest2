package F2;

import K4.C0321h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.appcompat.widget.AbstractC0637f0;
import androidx.appcompat.widget.C0665u;
import androidx.appcompat.widget.q1;
import h.AbstractC1174a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import n3.AbstractC1464a;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class L0 {

    /* renamed from: a, reason: collision with root package name */
    public int f2589a;

    /* renamed from: b, reason: collision with root package name */
    public int f2590b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2591c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2592d;

    /* renamed from: e, reason: collision with root package name */
    public Object f2593e;

    /* renamed from: f, reason: collision with root package name */
    public Object f2594f;

    /* renamed from: g, reason: collision with root package name */
    public Object f2595g;

    /* renamed from: h, reason: collision with root package name */
    public Object f2596h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2597i;
    public Object j;

    /* renamed from: k, reason: collision with root package name */
    public Object f2598k;

    /* renamed from: l, reason: collision with root package name */
    public Object f2599l;

    /* renamed from: m, reason: collision with root package name */
    public Object f2600m;

    public L0() {
        this.f2592d = new HashSet();
        this.f2595g = new Bundle();
        this.f2597i = new HashMap();
        this.f2593e = new HashSet();
        this.f2596h = new Bundle();
        this.f2594f = new HashSet();
        this.f2600m = new ArrayList();
        this.f2589a = -1;
        this.f2590b = 60000;
    }

    public static G4.A c(Context context, C0665u c0665u, int i7) {
        ColorStateList f7;
        synchronized (c0665u) {
            f7 = c0665u.f8748a.f(i7, context);
        }
        if (f7 == null) {
            return null;
        }
        G4.A a2 = new G4.A();
        a2.f2872b = true;
        a2.f2873c = f7;
        return a2;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i7 >= 30) {
            U.b.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i7 >= 30) {
            U.b.a(editorInfo, text);
            return;
        }
        int i8 = editorInfo.initialSelStart;
        int i9 = editorInfo.initialSelEnd;
        int i10 = i8 > i9 ? i9 : i8;
        if (i8 <= i9) {
            i8 = i9;
        }
        int length = text.length();
        if (i10 < 0 || i8 > length) {
            U.c.b(editorInfo, null, 0, 0);
            return;
        }
        int i11 = editorInfo.inputType & 4095;
        if (i11 == 129 || i11 == 225 || i11 == 18) {
            U.c.b(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            U.c.b(editorInfo, text, i10, i8);
            return;
        }
        int i12 = i8 - i10;
        int i13 = i12 > 1024 ? 0 : i12;
        int i14 = 2048 - i13;
        int min = Math.min(text.length() - i8, i14 - Math.min(i10, (int) (i14 * 0.8d)));
        int min2 = Math.min(i10, i14 - min);
        int i15 = i10 - min2;
        if (Character.isLowSurrogate(text.charAt(i15))) {
            i15++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i8 + min) - 1))) {
            min--;
        }
        int i16 = min2 + i13;
        U.c.b(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + min2), text.subSequence(i8, min + i8)) : text.subSequence(i15, i16 + min + i15), min2, i16);
    }

    public void a(Drawable drawable, G4.A a2) {
        if (drawable == null || a2 == null) {
            return;
        }
        C0665u.d(drawable, a2, ((TextView) this.f2592d).getDrawableState());
    }

    public void b() {
        G4.A a2 = (G4.A) this.f2593e;
        TextView textView = (TextView) this.f2592d;
        if (a2 != null || ((G4.A) this.f2594f) != null || ((G4.A) this.f2595g) != null || ((G4.A) this.f2596h) != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], (G4.A) this.f2593e);
            a(compoundDrawables[1], (G4.A) this.f2594f);
            a(compoundDrawables[2], (G4.A) this.f2595g);
            a(compoundDrawables[3], (G4.A) this.f2596h);
        }
        if (((G4.A) this.f2597i) == null && ((G4.A) this.j) == null) {
            return;
        }
        Drawable[] a4 = androidx.appcompat.widget.M.a(textView);
        a(a4[0], (G4.A) this.f2597i);
        a(a4[2], (G4.A) this.j);
    }

    public ColorStateList d() {
        G4.A a2 = (G4.A) this.f2598k;
        if (a2 != null) {
            return (ColorStateList) a2.f2873c;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        G4.A a2 = (G4.A) this.f2598k;
        if (a2 != null) {
            return (PorterDuff.Mode) a2.f2874d;
        }
        return null;
    }

    public void f(AttributeSet attributeSet, int i7) {
        boolean z4;
        boolean z7;
        String str;
        String str2;
        boolean z8;
        int i8;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = (TextView) this.f2592d;
        Context context = textView.getContext();
        C0665u a2 = C0665u.a();
        int[] iArr = AbstractC1174a.f13331i;
        C1726n0 F7 = C1726n0.F(context, attributeSet, iArr, i7);
        P.U.g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) F7.f17806c, i7);
        TypedArray typedArray = (TypedArray) F7.f17806c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2593e = c(context, a2, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2594f = c(context, a2, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2595g = c(context, a2, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2596h = c(context, a2, typedArray.getResourceId(2, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2597i = c(context, a2, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.j = c(context, a2, typedArray.getResourceId(6, 0));
        }
        F7.H();
        boolean z9 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1174a.f13346y;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C1726n0 c1726n0 = new C1726n0(context, obtainStyledAttributes);
            if (z9 || !obtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z7 = false;
            } else {
                z4 = obtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            }
            n(context, c1726n0);
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i10 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            c1726n0.H();
        } else {
            z4 = false;
            z7 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        C1726n0 c1726n02 = new C1726n0(context, obtainStyledAttributes2);
        if (z9 || !obtainStyledAttributes2.hasValue(14)) {
            z8 = z4;
        } else {
            z8 = obtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        }
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (i10 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i10 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c1726n02);
        c1726n02.H();
        if (!z9 && z7) {
            textView.setAllCaps(z8);
        }
        Typeface typeface = (Typeface) this.f2600m;
        if (typeface != null) {
            if (this.f2590b == -1) {
                textView.setTypeface(typeface, this.f2589a);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            androidx.appcompat.widget.O.d(textView, str);
        }
        if (str2 != null) {
            androidx.appcompat.widget.N.b(textView, androidx.appcompat.widget.N.a(str2));
        }
        int[] iArr3 = AbstractC1174a.j;
        androidx.appcompat.widget.Z z10 = (androidx.appcompat.widget.Z) this.f2599l;
        Context context2 = z10.j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = z10.f8597i;
        P.U.g(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i7);
        if (obtainStyledAttributes3.hasValue(5)) {
            z10.f8589a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    iArr4[i11] = obtainTypedArray.getDimensionPixelSize(i11, -1);
                }
                z10.f8594f = androidx.appcompat.widget.Z.b(iArr4);
                z10.i();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!z10.j()) {
            z10.f8589a = 0;
        } else if (z10.f8589a == 1) {
            if (!z10.f8595g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i9 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i9 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i9, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z10.k(dimension2, dimension3, dimension);
            }
            z10.h();
        }
        if (q1.f8735b && z10.f8589a != 0) {
            int[] iArr5 = z10.f8594f;
            if (iArr5.length > 0) {
                if (androidx.appcompat.widget.O.a(textView) != -1.0f) {
                    androidx.appcompat.widget.O.b(textView, Math.round(z10.f8592d), Math.round(z10.f8593e), Math.round(z10.f8591c), 0);
                } else {
                    androidx.appcompat.widget.O.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable b7 = resourceId4 != -1 ? a2.b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable b8 = resourceId5 != -1 ? a2.b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable b9 = resourceId6 != -1 ? a2.b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable b10 = resourceId7 != -1 ? a2.b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable b11 = resourceId8 != -1 ? a2.b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable b12 = resourceId9 != -1 ? a2.b(context, resourceId9) : null;
        if (b11 != null || b12 != null) {
            Drawable[] a4 = androidx.appcompat.widget.M.a(textView);
            if (b11 == null) {
                b11 = a4[0];
            }
            if (b8 == null) {
                b8 = a4[1];
            }
            if (b12 == null) {
                b12 = a4[2];
            }
            if (b10 == null) {
                b10 = a4[3];
            }
            androidx.appcompat.widget.M.b(textView, b11, b8, b12, b10);
        } else if (b7 != null || b8 != null || b9 != null || b10 != null) {
            Drawable[] a7 = androidx.appcompat.widget.M.a(textView);
            Drawable drawable = a7[0];
            if (drawable == null && a7[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (b7 == null) {
                    b7 = compoundDrawables[0];
                }
                if (b8 == null) {
                    b8 = compoundDrawables[1];
                }
                if (b9 == null) {
                    b9 = compoundDrawables[2];
                }
                if (b10 == null) {
                    b10 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(b7, b8, b9, b10);
            } else {
                if (b8 == null) {
                    b8 = a7[1];
                }
                Drawable drawable2 = a7[2];
                if (b10 == null) {
                    b10 = a7[3];
                }
                androidx.appcompat.widget.M.b(textView, drawable, b8, drawable2, b10);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = G.h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            V.l.f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i8 = -1;
            V.l.g(textView, AbstractC0637f0.c(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i8 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i8);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i8);
        int dimensionPixelSize3 = obtainStyledAttributes4.getDimensionPixelSize(19, i8);
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i8) {
            AbstractC1464a.P(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i8) {
            AbstractC1464a.Q(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i8) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            if (dimensionPixelSize3 != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(dimensionPixelSize3 - r1, 1.0f);
            }
        }
    }

    public void g(int i7, Context context) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i7, AbstractC1174a.f13346y);
        C1726n0 c1726n0 = new C1726n0(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = (TextView) this.f2592d;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c1726n0);
        if (i8 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            androidx.appcompat.widget.O.d(textView, string);
        }
        c1726n0.H();
        Typeface typeface = (Typeface) this.f2600m;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f2589a);
        }
    }

    public void i(int i7, int i8, int i9, int i10) {
        androidx.appcompat.widget.Z z4 = (androidx.appcompat.widget.Z) this.f2599l;
        if (z4.j()) {
            DisplayMetrics displayMetrics = z4.j.getResources().getDisplayMetrics();
            z4.k(TypedValue.applyDimension(i10, i7, displayMetrics), TypedValue.applyDimension(i10, i8, displayMetrics), TypedValue.applyDimension(i10, i9, displayMetrics));
            if (z4.h()) {
                z4.a();
            }
        }
    }

    public void j(int[] iArr, int i7) {
        androidx.appcompat.widget.Z z4 = (androidx.appcompat.widget.Z) this.f2599l;
        if (z4.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i7 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = z4.j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArr2[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                z4.f8594f = androidx.appcompat.widget.Z.b(iArr2);
                if (!z4.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                z4.f8595g = false;
            }
            if (z4.h()) {
                z4.a();
            }
        }
    }

    public void k(int i7) {
        androidx.appcompat.widget.Z z4 = (androidx.appcompat.widget.Z) this.f2599l;
        if (z4.j()) {
            if (i7 == 0) {
                z4.f8589a = 0;
                z4.f8592d = -1.0f;
                z4.f8593e = -1.0f;
                z4.f8591c = -1.0f;
                z4.f8594f = new int[0];
                z4.f8590b = false;
                return;
            }
            if (i7 != 1) {
                throw new IllegalArgumentException(e1.k.d(i7, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = z4.j.getResources().getDisplayMetrics();
            z4.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z4.h()) {
                z4.a();
            }
        }
    }

    public void l(ColorStateList colorStateList) {
        if (((G4.A) this.f2598k) == null) {
            this.f2598k = new G4.A();
        }
        G4.A a2 = (G4.A) this.f2598k;
        a2.f2873c = colorStateList;
        a2.f2872b = colorStateList != null;
        this.f2593e = a2;
        this.f2594f = a2;
        this.f2595g = a2;
        this.f2596h = a2;
        this.f2597i = a2;
        this.j = a2;
    }

    public void m(PorterDuff.Mode mode) {
        if (((G4.A) this.f2598k) == null) {
            this.f2598k = new G4.A();
        }
        G4.A a2 = (G4.A) this.f2598k;
        a2.f2874d = mode;
        a2.f2871a = mode != null;
        this.f2593e = a2;
        this.f2594f = a2;
        this.f2595g = a2;
        this.f2596h = a2;
        this.f2597i = a2;
        this.j = a2;
    }

    public void n(Context context, C1726n0 c1726n0) {
        String string;
        int i7 = this.f2589a;
        TypedArray typedArray = (TypedArray) c1726n0.f17806c;
        this.f2589a = typedArray.getInt(2, i7);
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 28) {
            int i9 = typedArray.getInt(11, -1);
            this.f2590b = i9;
            if (i9 != -1) {
                this.f2589a &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f2591c = false;
                int i10 = typedArray.getInt(1, 1);
                if (i10 == 1) {
                    this.f2600m = Typeface.SANS_SERIF;
                    return;
                } else if (i10 == 2) {
                    this.f2600m = Typeface.SERIF;
                    return;
                } else {
                    if (i10 != 3) {
                        return;
                    }
                    this.f2600m = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f2600m = null;
        int i11 = typedArray.hasValue(12) ? 12 : 10;
        int i12 = this.f2590b;
        int i13 = this.f2589a;
        if (!context.isRestricted()) {
            try {
                Typeface w7 = c1726n0.w(i11, this.f2589a, new C0321h(this, i12, i13, new WeakReference((TextView) this.f2592d)));
                if (w7 != null) {
                    if (i8 < 28 || this.f2590b == -1) {
                        this.f2600m = w7;
                    } else {
                        this.f2600m = androidx.appcompat.widget.P.a(Typeface.create(w7, 0), this.f2590b, (this.f2589a & 2) != 0);
                    }
                }
                this.f2591c = ((Typeface) this.f2600m) == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (((Typeface) this.f2600m) != null || (string = typedArray.getString(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f2590b == -1) {
            this.f2600m = Typeface.create(string, this.f2589a);
        } else {
            this.f2600m = androidx.appcompat.widget.P.a(Typeface.create(string, 0), this.f2590b, (this.f2589a & 2) != 0);
        }
    }

    public L0(TextView textView) {
        this.f2589a = 0;
        this.f2590b = -1;
        this.f2592d = textView;
        this.f2599l = new androidx.appcompat.widget.Z(textView);
    }
}
