package n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import h.AbstractC1986a;
import java.lang.ref.WeakReference;
import n1.AbstractC2176q;
import r0.AbstractC2346c;

/* renamed from: n.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2155z {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f18335a;

    /* renamed from: b, reason: collision with root package name */
    public t0 f18336b;

    /* renamed from: c, reason: collision with root package name */
    public t0 f18337c;

    /* renamed from: d, reason: collision with root package name */
    public t0 f18338d;

    /* renamed from: e, reason: collision with root package name */
    public t0 f18339e;
    public t0 f;

    /* renamed from: g, reason: collision with root package name */
    public t0 f18340g;

    /* renamed from: h, reason: collision with root package name */
    public t0 f18341h;
    public final C2116J i;

    /* renamed from: j, reason: collision with root package name */
    public int f18342j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f18343k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f18344l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18345m;

    public C2155z(TextView textView) {
        this.f18335a = textView;
        this.i = new C2116J(textView);
    }

    public static t0 c(Context context, C2146p c2146p, int i) {
        ColorStateList i5;
        synchronized (c2146p) {
            i5 = c2146p.f18308a.i(context, i);
        }
        if (i5 == null) {
            return null;
        }
        t0 t0Var = new t0();
        t0Var.f18325b = true;
        t0Var.f18326c = i5;
        return t0Var;
    }

    public final void a(Drawable drawable, t0 t0Var) {
        if (drawable == null || t0Var == null) {
            return;
        }
        C2146p.c(drawable, t0Var, this.f18335a.getDrawableState());
    }

    public final void b() {
        t0 t0Var = this.f18336b;
        TextView textView = this.f18335a;
        if (t0Var != null || this.f18337c != null || this.f18338d != null || this.f18339e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f18336b);
            a(compoundDrawables[1], this.f18337c);
            a(compoundDrawables[2], this.f18338d);
            a(compoundDrawables[3], this.f18339e);
        }
        if (this.f == null && this.f18340g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.f18340g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(AttributeSet attributeSet, int i) {
        C2146p c2146p;
        boolean z3;
        boolean z5;
        String str;
        String str2;
        int i5;
        float f;
        int i6;
        ColorStateList colorStateList;
        int resourceId;
        int i7;
        int resourceId2;
        TextView textView = this.f18335a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = C2146p.f18306b;
        synchronized (C2146p.class) {
            try {
                if (C2146p.f18307c == null) {
                    C2146p.b();
                }
                c2146p = C2146p.f18307c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr = AbstractC1986a.f;
        v3.e G5 = v3.e.G(context, attributeSet, iArr, i);
        TextView textView2 = this.f18335a;
        n1.C.c(textView2, textView2.getContext(), iArr, attributeSet, (TypedArray) G5.f20433m, i);
        TypedArray typedArray = (TypedArray) G5.f20433m;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f18336b = c(context, c2146p, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f18337c = c(context, c2146p, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f18338d = c(context, c2146p, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f18339e = c(context, c2146p, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f = c(context, c2146p, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f18340g = c(context, c2146p, typedArray.getResourceId(6, 0));
        }
        G5.J();
        boolean z6 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC1986a.f17183q;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            v3.e eVar = new v3.e(context, obtainStyledAttributes);
            if (z6 || !obtainStyledAttributes.hasValue(14)) {
                z3 = false;
                z5 = false;
            } else {
                z5 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            f(context, eVar);
            int i8 = Build.VERSION.SDK_INT;
            str2 = obtainStyledAttributes.hasValue(15) ? obtainStyledAttributes.getString(15) : null;
            str = (i8 < 26 || !obtainStyledAttributes.hasValue(13)) ? null : obtainStyledAttributes.getString(13);
            eVar.J();
        } else {
            z3 = false;
            z5 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        v3.e eVar2 = new v3.e(context, obtainStyledAttributes2);
        if (!z6 && obtainStyledAttributes2.hasValue(14)) {
            z5 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z7 = z5;
        int i9 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        String str3 = str2;
        if (i9 >= 26 && obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (i9 >= 28 && obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, eVar2);
        eVar2.J();
        if (!z6 && z3) {
            this.f18335a.setAllCaps(z7);
        }
        Typeface typeface = this.f18344l;
        if (typeface != null) {
            if (this.f18343k == -1) {
                textView.setTypeface(typeface, this.f18342j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC2153x.d(textView, str);
        }
        if (str3 != null) {
            if (i9 >= 24) {
                AbstractC2152w.b(textView, AbstractC2152w.a(str3));
            } else {
                textView.setTextLocale(AbstractC2151v.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = AbstractC1986a.f17174g;
        C2116J c2116j = this.i;
        Context context2 = c2116j.f18171j;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView3 = c2116j.i;
        n1.C.c(textView3, textView3.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c2116j.f18164a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i10 = 0; i10 < length; i10++) {
                    iArr4[i10] = obtainTypedArray.getDimensionPixelSize(i10, -1);
                }
                c2116j.f = C2116J.b(iArr4);
                c2116j.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (c2116j.f18164a == 1) {
            if (!c2116j.f18169g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i7 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i7 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i7, 112.0f, displayMetrics);
                }
                float f5 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                c2116j.i(dimension2, f5, dimension);
            }
            c2116j.g();
        }
        if (I0.f18161a && c2116j.f18164a != 0) {
            int[] iArr5 = c2116j.f;
            if (iArr5.length > 0) {
                if (AbstractC2153x.a(textView) != -1.0f) {
                    AbstractC2153x.b(textView, Math.round(c2116j.f18167d), Math.round(c2116j.f18168e), Math.round(c2116j.f18166c), 0);
                } else {
                    AbstractC2153x.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable a5 = resourceId4 != -1 ? c2146p.a(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable a6 = resourceId5 != -1 ? c2146p.a(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable a7 = resourceId6 != -1 ? c2146p.a(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable a8 = resourceId7 != -1 ? c2146p.a(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable a9 = resourceId8 != -1 ? c2146p.a(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable a10 = resourceId9 != -1 ? c2146p.a(context, resourceId9) : null;
        if (a9 != null || a10 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (a9 == null) {
                a9 = compoundDrawablesRelative[0];
            }
            if (a6 == null) {
                a6 = compoundDrawablesRelative[1];
            }
            if (a10 == null) {
                a10 = compoundDrawablesRelative[2];
            }
            if (a8 == null) {
                a8 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(a9, a6, a10, a8);
        } else if (a5 != null || a6 != null || a7 != null || a8 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (a5 == null) {
                    a5 = compoundDrawables[0];
                }
                if (a6 == null) {
                    a6 = compoundDrawables[1];
                }
                if (a7 == null) {
                    a7 = compoundDrawables[2];
                }
                if (a8 == null) {
                    a8 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(a5, a6, a7, a8);
            } else {
                if (a6 == null) {
                    a6 = compoundDrawablesRelative2[1];
                }
                if (a8 == null) {
                    a8 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, a6, compoundDrawablesRelative2[2], a8);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC2346c.o(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintList(colorStateList);
            } else {
                ((s1.h) textView).setSupportCompoundDrawablesTintList(colorStateList);
            }
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            PorterDuff.Mode b3 = AbstractC2119M.b(obtainStyledAttributes4.getInt(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                textView.setCompoundDrawableTintMode(b3);
            } else {
                ((s1.h) textView).setSupportCompoundDrawablesTintMode(b3);
            }
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i11 = peekValue.data;
                i6 = i11 & 15;
                f = TypedValue.complexToFloat(i11);
                i5 = -1;
                obtainStyledAttributes4.recycle();
                if (dimensionPixelSize != i5) {
                    N4.b.Q(textView, dimensionPixelSize);
                }
                if (dimensionPixelSize2 != i5) {
                    N4.b.R(textView, dimensionPixelSize2);
                }
                if (f == -1.0f) {
                    if (i6 == i5) {
                        N4.b.S(textView, (int) f);
                        return;
                    } else if (Build.VERSION.SDK_INT >= 34) {
                        AbstractC2176q.k(textView, i6, f);
                        return;
                    } else {
                        N4.b.S(textView, Math.round(TypedValue.applyDimension(i6, f, textView.getResources().getDisplayMetrics())));
                        return;
                    }
                }
                return;
            }
            i5 = -1;
            f = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
        } else {
            i5 = -1;
            f = -1.0f;
        }
        i6 = i5;
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i5) {
        }
        if (dimensionPixelSize2 != i5) {
        }
        if (f == -1.0f) {
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1986a.f17183q);
        v3.e eVar = new v3.e(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f18335a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, eVar);
        if (i5 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC2153x.d(textView, string);
        }
        eVar.J();
        Typeface typeface = this.f18344l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f18342j);
        }
    }

    public final void f(Context context, v3.e eVar) {
        String string;
        int i = this.f18342j;
        TypedArray typedArray = (TypedArray) eVar.f20433m;
        this.f18342j = typedArray.getInt(2, i);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 28) {
            int i6 = typedArray.getInt(11, -1);
            this.f18343k = i6;
            if (i6 != -1) {
                this.f18342j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f18345m = false;
                int i7 = typedArray.getInt(1, 1);
                if (i7 == 1) {
                    this.f18344l = Typeface.SANS_SERIF;
                    return;
                } else if (i7 == 2) {
                    this.f18344l = Typeface.SERIF;
                    return;
                } else {
                    if (i7 != 3) {
                        return;
                    }
                    this.f18344l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f18344l = null;
        int i8 = typedArray.hasValue(12) ? 12 : 10;
        int i9 = this.f18343k;
        int i10 = this.f18342j;
        if (!context.isRestricted()) {
            try {
                Typeface y5 = eVar.y(i8, this.f18342j, new M0.e(this, i9, i10, new WeakReference(this.f18335a)));
                if (y5 != null) {
                    if (i5 < 28 || this.f18343k == -1) {
                        this.f18344l = y5;
                    } else {
                        this.f18344l = AbstractC2154y.a(Typeface.create(y5, 0), this.f18343k, (this.f18342j & 2) != 0);
                    }
                }
                this.f18345m = this.f18344l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f18344l != null || (string = typedArray.getString(i8)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f18343k == -1) {
            this.f18344l = Typeface.create(string, this.f18342j);
        } else {
            this.f18344l = AbstractC2154y.a(Typeface.create(string, 0), this.f18343k, (this.f18342j & 2) != 0);
        }
    }
}
