package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import h.AbstractC1174a;

/* loaded from: classes.dex */
public abstract class X0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8579a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f8580b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f8581c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f8582d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f8583e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f8584f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f8585g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1174a.f13332k);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i7, Context context) {
        ColorStateList d7 = d(i7, context);
        if (d7 != null && d7.isStateful()) {
            return d7.getColorForState(f8580b, d7.getDefaultColor());
        }
        ThreadLocal threadLocal = f8579a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f7 = typedValue.getFloat();
        int c3 = c(i7, context);
        int round = Math.round(Color.alpha(c3) * f7);
        int i8 = I.a.f3460a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c3 & 16777215) | (round << 24);
    }

    public static int c(int i7, Context context) {
        int[] iArr = f8585g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(int i7, Context context) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f8585g;
        iArr[0] = i7;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = G.h.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
