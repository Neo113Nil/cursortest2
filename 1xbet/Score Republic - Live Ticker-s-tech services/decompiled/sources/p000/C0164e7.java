package p000;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: e7 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0164e7 {

    /* JADX INFO: renamed from: a */
    public final TextView f1980a;

    /* JADX INFO: renamed from: b */
    public C0290hl f1981b;

    /* JADX INFO: renamed from: c */
    public C0290hl f1982c;

    /* JADX INFO: renamed from: d */
    public C0290hl f1983d;

    /* JADX INFO: renamed from: e */
    public C0290hl f1984e;

    /* JADX INFO: renamed from: f */
    public C0290hl f1985f;

    /* JADX INFO: renamed from: g */
    public C0290hl f1986g;

    /* JADX INFO: renamed from: h */
    public C0290hl f1987h;

    /* JADX INFO: renamed from: i */
    public final C0423l7 f1988i;

    /* JADX INFO: renamed from: j */
    public int f1989j = 0;

    /* JADX INFO: renamed from: k */
    public int f1990k = -1;

    /* JADX INFO: renamed from: l */
    public Typeface f1991l;

    /* JADX INFO: renamed from: m */
    public boolean f1992m;

    public C0164e7(TextView textView) {
        this.f1980a = textView;
        this.f1988i = new C0423l7(textView);
    }

    /* JADX INFO: renamed from: c */
    public static C0290hl m1373c(Context context, C0939z5 c0939z5, int i) {
        ColorStateList colorStateListM1581f;
        synchronized (c0939z5) {
            colorStateListM1581f = c0939z5.f9607a.m1581f(context, i);
        }
        if (colorStateListM1581f == null) {
            return null;
        }
        C0290hl c0290hl = new C0290hl();
        c0290hl.f3254b = true;
        c0290hl.f3255c = colorStateListM1581f;
        return c0290hl;
    }

    /* JADX INFO: renamed from: h */
    public static void m1374h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0454m1.m3317d(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0454m1.m3317d(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            hn0.m2318n(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            hn0.m2318n(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            hn0.m2318n(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int iMin = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (((double) i8) * 0.8d)));
        int iMin2 = Math.min(i4, i8 - iMin);
        int i9 = i4 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + iMin) - 1))) {
            iMin--;
        }
        int i10 = iMin2 + i7;
        hn0.m2318n(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i2, iMin + i2)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m1375a(Drawable drawable, C0290hl c0290hl) {
        if (drawable == null || c0290hl == null) {
            return;
        }
        C0939z5.m5861d(drawable, c0290hl, this.f1980a.getDrawableState());
    }

    /* JADX INFO: renamed from: b */
    public final void m1376b() {
        C0290hl c0290hl = this.f1981b;
        TextView textView = this.f1980a;
        if (c0290hl != null || this.f1982c != null || this.f1983d != null || this.f1984e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m1375a(compoundDrawables[0], this.f1981b);
            m1375a(compoundDrawables[1], this.f1982c);
            m1375a(compoundDrawables[2], this.f1983d);
            m1375a(compoundDrawables[3], this.f1984e);
        }
        if (this.f1985f == null && this.f1986g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m1375a(compoundDrawablesRelative[0], this.f1985f);
        m1375a(compoundDrawablesRelative[2], this.f1986g);
    }

    /* JADX INFO: renamed from: d */
    public final ColorStateList m1377d() {
        C0290hl c0290hl = this.f1987h;
        if (c0290hl != null) {
            return (ColorStateList) c0290hl.f3255c;
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final PorterDuff.Mode m1378e() {
        C0290hl c0290hl = this.f1987h;
        if (c0290hl != null) {
            return (PorterDuff.Mode) c0290hl.f3256d;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:252:0x0451 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x0453  */
    /* JADX WARN: Code duplicated, block: B:254:0x0457  */
    /* JADX WARN: Code duplicated, block: B:257:0x045f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:258:0x0461  */
    /* JADX WARN: Code duplicated, block: B:260:0x046f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0472  */
    /* JADX WARN: Code duplicated, block: B:264:0x047a  */
    /* JADX WARN: Code duplicated, block: B:265:0x048b  */
    /* JADX WARN: Code duplicated, block: B:269:0x0495 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:270:0x0497  */
    /* JADX WARN: Code duplicated, block: B:272:0x049c  */
    /* JADX WARN: Code duplicated, block: B:274:0x04a2  */
    /* JADX WARN: Code duplicated, block: B:276:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final void m1379f(AttributeSet attributeSet, int i) {
        boolean z;
        boolean z2;
        String string;
        String string2;
        int i2;
        float dimensionPixelSize;
        int i3;
        Paint.FontMetricsInt fontMetricsInt;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int resourceId2;
        TextView textView = this.f1980a;
        Context context = textView.getContext();
        C0939z5 c0939z5M5859a = C0939z5.m5859a();
        int[] iArr = mz0.f5194h;
        oq0 oq0VarM3731n = oq0.m3731n(context, attributeSet, iArr, i);
        Context context2 = textView.getContext();
        TypedArray typedArray = (TypedArray) oq0VarM3731n.f5841l;
        WeakHashMap weakHashMap = ai1.f194a;
        xh1.m5663b(textView, context2, iArr, attributeSet, typedArray, i, 0);
        TypedArray typedArray2 = (TypedArray) oq0VarM3731n.f5841l;
        int resourceId3 = typedArray2.getResourceId(0, -1);
        if (typedArray2.hasValue(3)) {
            this.f1981b = m1373c(context, c0939z5M5859a, typedArray2.getResourceId(3, 0));
        }
        if (typedArray2.hasValue(1)) {
            this.f1982c = m1373c(context, c0939z5M5859a, typedArray2.getResourceId(1, 0));
        }
        if (typedArray2.hasValue(4)) {
            this.f1983d = m1373c(context, c0939z5M5859a, typedArray2.getResourceId(4, 0));
        }
        if (typedArray2.hasValue(2)) {
            this.f1984e = m1373c(context, c0939z5M5859a, typedArray2.getResourceId(2, 0));
        }
        if (typedArray2.hasValue(5)) {
            this.f1985f = m1373c(context, c0939z5M5859a, typedArray2.getResourceId(5, 0));
        }
        if (typedArray2.hasValue(6)) {
            this.f1986g = m1373c(context, c0939z5M5859a, typedArray2.getResourceId(6, 0));
        }
        oq0VarM3731n.m3742o();
        boolean z3 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = mz0.f5208v;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            oq0 oq0Var = new oq0(context, typedArrayObtainStyledAttributes);
            if (z3 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z = false;
                z2 = false;
            } else {
                z2 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z = true;
            }
            m1383k(context, oq0Var);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = typedArrayObtainStyledAttributes.hasValue(13) ? typedArrayObtainStyledAttributes.getString(13) : null;
            oq0Var.m3742o();
        } else {
            z = false;
            z2 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        oq0 oq0Var2 = new oq0(context, typedArrayObtainStyledAttributes2);
        if (!z3 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z2 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z = true;
        }
        boolean z4 = z2;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1383k(context, oq0Var2);
        oq0Var2.m3742o();
        if (!z3 && z) {
            textView.setAllCaps(z4);
        }
        Typeface typeface = this.f1991l;
        if (typeface != null) {
            if (this.f1990k == -1) {
                textView.setTypeface(typeface, this.f1989j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            AbstractC0088c7.m895d(textView, string);
        }
        if (string2 != null) {
            AbstractC0052b7.m599b(textView, AbstractC0052b7.m598a(string2));
        }
        C0423l7 c0423l7 = this.f1988i;
        Context context3 = c0423l7.f4704h;
        int[] iArr3 = mz0.f5195i;
        TypedArray typedArrayObtainStyledAttributes3 = context3.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c0423l7.f4703g;
        xh1.m5663b(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i, 0);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            c0423l7.f4697a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (!typedArrayObtainStyledAttributes3.hasValue(3) || (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) <= 0) {
            i2 = 0;
        } else {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                i2 = 0;
                for (int i5 = 0; i5 < length; i5++) {
                    iArr4[i5] = typedArrayObtainTypedArray.getDimensionPixelSize(i5, -1);
                }
                int[] iArrM3186a = C0423l7.m3186a(iArr4);
                c0423l7.f4701e = iArrM3186a;
                int length2 = iArrM3186a.length;
                boolean z5 = length2 > 0;
                c0423l7.f4702f = z5;
                if (z5) {
                    c0423l7.f4697a = 1;
                    c0423l7.f4699c = iArrM3186a[0];
                    c0423l7.f4700d = iArrM3186a[length2 - 1];
                    c0423l7.f4698b = -1.0f;
                }
            } else {
                i2 = 0;
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!c0423l7.m3187b()) {
            c0423l7.f4697a = i2;
        } else if (c0423l7.f4697a == 1) {
            if (!c0423l7.f4702f) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                float f = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (f <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + f + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c0423l7.f4697a = 1;
                c0423l7.f4699c = dimension2;
                c0423l7.f4700d = f;
                c0423l7.f4698b = dimension;
                c0423l7.f4702f = i2;
            }
            if (c0423l7.m3187b() && c0423l7.f4697a == 1 && (!c0423l7.f4702f || c0423l7.f4701e.length == 0)) {
                int iFloor = ((int) Math.floor((c0423l7.f4700d - c0423l7.f4699c) / c0423l7.f4698b)) + 1;
                int[] iArr5 = new int[iFloor];
                for (int i6 = 0; i6 < iFloor; i6++) {
                    iArr5[i6] = Math.round((i6 * c0423l7.f4698b) + c0423l7.f4699c);
                }
                c0423l7.f4701e = C0423l7.m3186a(iArr5);
            }
        }
        if (c0423l7.f4697a != 0) {
            int[] iArr6 = c0423l7.f4701e;
            if (iArr6.length > 0) {
                if (AbstractC0088c7.m892a(textView) != -1.0f) {
                    AbstractC0088c7.m893b(textView, Math.round(c0423l7.f4699c), Math.round(c0423l7.f4700d), Math.round(c0423l7.f4698b), 0);
                } else {
                    AbstractC0088c7.m894c(textView, iArr6, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableM5862b = resourceId4 != -1 ? c0939z5M5859a.m5862b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableM5862b2 = resourceId5 != -1 ? c0939z5M5859a.m5862b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableM5862b3 = resourceId6 != -1 ? c0939z5M5859a.m5862b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableM5862b4 = resourceId7 != -1 ? c0939z5M5859a.m5862b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableM5862b5 = resourceId8 != -1 ? c0939z5M5859a.m5862b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableM5862b6 = resourceId9 != -1 ? c0939z5M5859a.m5862b(context, resourceId9) : null;
        if (drawableM5862b5 != null || drawableM5862b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (drawableM5862b5 == null) {
                drawableM5862b5 = compoundDrawablesRelative[0];
            }
            if (drawableM5862b2 == null) {
                drawableM5862b2 = compoundDrawablesRelative[1];
            }
            if (drawableM5862b6 == null) {
                drawableM5862b6 = compoundDrawablesRelative[2];
            }
            if (drawableM5862b4 == null) {
                drawableM5862b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawableM5862b5, drawableM5862b2, drawableM5862b6, drawableM5862b4);
        } else if (drawableM5862b != null || drawableM5862b2 != null || drawableM5862b3 != null || drawableM5862b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableM5862b == null) {
                    drawableM5862b = compoundDrawables[0];
                }
                if (drawableM5862b2 == null) {
                    drawableM5862b2 = compoundDrawables[1];
                }
                if (drawableM5862b3 == null) {
                    drawableM5862b3 = compoundDrawables[2];
                }
                if (drawableM5862b4 == null) {
                    drawableM5862b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableM5862b, drawableM5862b2, drawableM5862b3, drawableM5862b4);
            } else {
                if (drawableM5862b2 == null) {
                    drawableM5862b2 = compoundDrawablesRelative2[1];
                }
                if (drawableM5862b4 == null) {
                    drawableM5862b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawableM5862b2, compoundDrawablesRelative2[2], drawableM5862b4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = j22.m2806o(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            textView.setCompoundDrawableTintMode(AbstractC0890xu.m5689b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        if (typedArrayObtainStyledAttributes4.hasValue(19)) {
            TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes4.peekValue(19);
            if (typedValuePeekValue == null || typedValuePeekValue.type != 5) {
                dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
            } else {
                int i7 = typedValuePeekValue.data;
                i3 = i7 & 15;
                dimensionPixelSize = TypedValue.complexToFloat(i7);
            }
            typedArrayObtainStyledAttributes4.recycle();
            if (dimensionPixelSize2 != -1) {
                if (dimensionPixelSize2 >= 0) {
                    throw new IllegalArgumentException();
                }
                textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
            }
            if (dimensionPixelSize3 != -1) {
                if (dimensionPixelSize3 >= 0) {
                    throw new IllegalArgumentException();
                }
                fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i4 = fontMetricsInt.bottom;
                } else {
                    i4 = fontMetricsInt.descent;
                }
                if (dimensionPixelSize3 > Math.abs(i4)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i4);
                }
            }
            if (dimensionPixelSize != -1.0f) {
                if (i3 == -1) {
                    vk1.m5170i(textView, (int) dimensionPixelSize);
                } else if (Build.VERSION.SDK_INT >= 34) {
                    AbstractC0528o1.m3622k(textView, i3, dimensionPixelSize);
                } else {
                    vk1.m5170i(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
                }
            }
        }
        dimensionPixelSize = -1.0f;
        i3 = -1;
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize2 != -1) {
            if (dimensionPixelSize2 >= 0) {
                throw new IllegalArgumentException();
            }
            textView.setFirstBaselineToTopHeight(dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            if (dimensionPixelSize3 >= 0) {
                throw new IllegalArgumentException();
            }
            fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i4 = fontMetricsInt.bottom;
            } else {
                i4 = fontMetricsInt.descent;
            }
            if (dimensionPixelSize3 > Math.abs(i4)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize3 - i4);
            }
        }
        if (dimensionPixelSize != -1.0f) {
            if (i3 == -1) {
                vk1.m5170i(textView, (int) dimensionPixelSize);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0528o1.m3622k(textView, i3, dimensionPixelSize);
            } else {
                vk1.m5170i(textView, Math.round(TypedValue.applyDimension(i3, dimensionPixelSize, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1380g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, mz0.f5208v);
        oq0 oq0Var = new oq0(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f1980a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m1383k(context, oq0Var);
        if (typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            AbstractC0088c7.m895d(textView, string);
        }
        oq0Var.m3742o();
        Typeface typeface = this.f1991l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f1989j);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m1381i(ColorStateList colorStateList) {
        if (this.f1987h == null) {
            this.f1987h = new C0290hl();
        }
        C0290hl c0290hl = this.f1987h;
        c0290hl.f3255c = colorStateList;
        c0290hl.f3254b = colorStateList != null;
        this.f1981b = c0290hl;
        this.f1982c = c0290hl;
        this.f1983d = c0290hl;
        this.f1984e = c0290hl;
        this.f1985f = c0290hl;
        this.f1986g = c0290hl;
    }

    /* JADX INFO: renamed from: j */
    public final void m1382j(PorterDuff.Mode mode) {
        if (this.f1987h == null) {
            this.f1987h = new C0290hl();
        }
        C0290hl c0290hl = this.f1987h;
        c0290hl.f3256d = mode;
        c0290hl.f3253a = mode != null;
        this.f1981b = c0290hl;
        this.f1982c = c0290hl;
        this.f1983d = c0290hl;
        this.f1984e = c0290hl;
        this.f1985f = c0290hl;
        this.f1986g = c0290hl;
    }

    /* JADX INFO: renamed from: k */
    public final void m1383k(Context context, oq0 oq0Var) {
        String string;
        int i = this.f1989j;
        TypedArray typedArray = (TypedArray) oq0Var.f5841l;
        this.f1989j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.f1990k = i2;
        if (i2 != -1) {
            this.f1989j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f1992m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.f1991l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f1991l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f1991l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f1991l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.f1990k;
        int i6 = this.f1989j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceM3737g = oq0Var.m3737g(i4, this.f1989j, new C0940z6(this, i5, i6, new WeakReference(this.f1980a)));
                if (typefaceM3737g != null) {
                    if (this.f1990k != -1) {
                        this.f1991l = AbstractC0128d7.m1105a(Typeface.create(typefaceM3737g, 0), this.f1990k, (this.f1989j & 2) != 0);
                    } else {
                        this.f1991l = typefaceM3737g;
                    }
                }
                this.f1992m = this.f1991l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1991l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.f1990k != -1) {
            this.f1991l = AbstractC0128d7.m1105a(Typeface.create(string, 0), this.f1990k, (this.f1989j & 2) != 0);
        } else {
            this.f1991l = Typeface.create(string, this.f1989j);
        }
    }
}
