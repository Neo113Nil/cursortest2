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
import androidx.appcompat.widget.AbstractC0616f0;
import androidx.appcompat.widget.C0644u;
import androidx.appcompat.widget.q1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f2591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f2593e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f2594f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f2595g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f2596h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f2597i;
    public Object j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f2598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f2599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
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

    public static G4.A c(Context context, C0644u c0644u, int i7) {
        ColorStateList colorStateListF;
        synchronized (c0644u) {
            colorStateListF = c0644u.f8748a.f(i7, context);
        }
        if (colorStateListF == null) {
            return null;
        }
        G4.A a2 = new G4.A();
        a2.f2872b = true;
        a2.f2873c = colorStateListF;
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
        int iMin = Math.min(text.length() - i8, i14 - Math.min(i10, (int) (((double) i14) * 0.8d)));
        int iMin2 = Math.min(i10, i14 - iMin);
        int i15 = i10 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i15))) {
            i15++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i8 + iMin) - 1))) {
            iMin--;
        }
        int i16 = iMin2 + i13;
        U.c.b(editorInfo, i13 != i12 ? TextUtils.concat(text.subSequence(i15, i15 + iMin2), text.subSequence(i8, iMin + i8)) : text.subSequence(i15, i16 + iMin + i15), iMin2, i16);
    }

    public void a(Drawable drawable, G4.A a2) {
        if (drawable == null || a2 == null) {
            return;
        }
        C0644u.d(drawable, a2, ((TextView) this.f2592d).getDrawableState());
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
        Drawable[] drawableArrA = androidx.appcompat.widget.M.a(textView);
        a(drawableArrA[0], (G4.A) this.f2597i);
        a(drawableArrA[2], (G4.A) this.j);
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
        String string;
        String string2;
        boolean z8;
        int i8;
        ColorStateList colorStateList;
        int resourceId;
        int i9;
        int resourceId2;
        TextView textView = (TextView) this.f2592d;
        Context context = textView.getContext();
        C0644u c0644uA = C0644u.a();
        int[] iArr = p051h.a.f13337i;
        C1017n0 c1017n0F = C1017n0.F(context, attributeSet, iArr, i7);
        P.U.g(textView, textView.getContext(), iArr, attributeSet, (TypedArray) c1017n0F.f17812c, i7);
        TypedArray typedArray = (TypedArray) c1017n0F.f17812c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f2593e = c(context, c0644uA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f2594f = c(context, c0644uA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f2595g = c(context, c0644uA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f2596h = c(context, c0644uA, typedArray.getResourceId(2, 0));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f2597i = c(context, c0644uA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.j = c(context, c0644uA, typedArray.getResourceId(6, 0));
        }
        c1017n0F.H();
        boolean z9 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = p051h.a.f13352y;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C1017n0 c1017n0 = new C1017n0(context, typedArrayObtainStyledAttributes);
            if (z9 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z7 = false;
            } else {
                z4 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z7 = true;
            }
            n(context, c1017n0);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i10 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            c1017n0.H();
        } else {
            z4 = false;
            z7 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i7, 0);
        C1017n0 c1017n1 = new C1017n0(context, typedArrayObtainStyledAttributes2);
        if (z9 || !typedArrayObtainStyledAttributes2.hasValue(14)) {
            z8 = z4;
        } else {
            z8 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z7 = true;
        }
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i10 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i10 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c1017n1);
        c1017n1.H();
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
        if (string != null) {
            androidx.appcompat.widget.O.d(textView, string);
        }
        if (string2 != null) {
            androidx.appcompat.widget.N.b(textView, androidx.appcompat.widget.N.a(string2));
        }
        int[] iArr3 = p051h.a.j;
        androidx.appcompat.widget.Z z10 = (androidx.appcompat.widget.Z) this.f2599l;
        Context context2 = z10.j;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i7, 0);
        TextView textView2 = z10.f8597i;
        P.U.g(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i7);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            z10.f8589a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i11 = 0; i11 < length; i11++) {
                    iArr4[i11] = typedArrayObtainTypedArray.getDimensionPixelSize(i11, -1);
                }
                z10.f8594f = androidx.appcompat.widget.Z.b(iArr4);
                z10.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
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
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? c0644uA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? c0644uA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? c0644uA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? c0644uA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? c0644uA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? c0644uA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = androidx.appcompat.widget.M.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            androidx.appcompat.widget.M.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = androidx.appcompat.widget.M.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                androidx.appcompat.widget.M.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = G.h.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            V.l.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            i8 = -1;
            V.l.g(textView, AbstractC0616f0.c(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i8 = -1;
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, i8);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, i8);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, i8);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i8) {
            p097n3.a.P(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i8) {
            p097n3.a.Q(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != i8) {
            if (dimensionPixelSize3 < 0) {
                throw new IllegalArgumentException();
            }
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public void g(int i7, Context context) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i7, p051h.a.f13352y);
        C1017n0 c1017n0 = new C1017n0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = (TextView) this.f2592d;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i8 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, c1017n0);
        if (i8 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            androidx.appcompat.widget.O.d(textView, string);
        }
        c1017n0.H();
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
                int[] iArrCopyOf = new int[length];
                if (i7 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = z4.j.getResources().getDisplayMetrics();
                    for (int i8 = 0; i8 < length; i8++) {
                        iArrCopyOf[i8] = Math.round(TypedValue.applyDimension(i7, iArr[i8], displayMetrics));
                    }
                }
                z4.f8594f = androidx.appcompat.widget.Z.b(iArrCopyOf);
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
                throw new IllegalArgumentException(p031e1.k.d(i7, "Unknown auto-size text type: "));
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

    public void n(Context context, C1017n0 c1017n0) {
        String string;
        int i7 = this.f2589a;
        TypedArray typedArray = (TypedArray) c1017n0.f17812c;
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
                Typeface typefaceW = c1017n0.w(i11, this.f2589a, new C0321h(this, i12, i13, new WeakReference((TextView) this.f2592d)));
                if (typefaceW != null) {
                    if (i8 < 28 || this.f2590b == -1) {
                        this.f2600m = typefaceW;
                    } else {
                        this.f2600m = androidx.appcompat.widget.P.a(Typeface.create(typefaceW, 0), this.f2590b, (this.f2589a & 2) != 0);
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
