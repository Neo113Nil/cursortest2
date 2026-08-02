package n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import g1.AbstractC1967a;
import h.AbstractC1986a;
import r0.AbstractC2346c;

/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f18314a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f18315b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f18316c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f18317d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f18318e = {R.attr.state_checked};
    public static final int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f18319g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1986a.f17175h);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i) {
        ColorStateList d5 = d(context, i);
        if (d5 != null && d5.isStateful()) {
            return d5.getColorForState(f18315b, d5.getDefaultColor());
        }
        ThreadLocal threadLocal = f18314a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f5 = typedValue.getFloat();
        int c5 = c(context, i);
        int round = Math.round(Color.alpha(c5) * f5);
        int i5 = AbstractC1967a.f17071a;
        if (round < 0 || round > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (c5 & 16777215) | (round << 24);
    }

    public static int c(Context context, int i) {
        int[] iArr = f18319g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f18319g;
        iArr[0] = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = AbstractC2346c.o(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
