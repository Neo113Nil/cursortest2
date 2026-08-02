package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.annotation.NonNull;
import i.C6977a;

/* loaded from: classes.dex */
public final class W {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f37841a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    static final int[] f37842b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    static final int[] f37843c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    static final int[] f37844d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    static final int[] f37845e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    static final int[] f37846f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f37847g = new int[1];

    public static void a(@NonNull View view, @NonNull Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C6977a.f65656j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(int i11, @NonNull Context context) {
        ColorStateList d11 = d(i11, context);
        if (d11 != null && d11.isStateful()) {
            return d11.getColorForState(f37842b, d11.getDefaultColor());
        }
        ThreadLocal<TypedValue> threadLocal = f37841a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f7 = typedValue.getFloat();
        return androidx.core.graphics.c.f(c(i11, context), Math.round(Color.alpha(r4) * f7));
    }

    public static int c(int i11, @NonNull Context context) {
        int[] iArr = f37847g;
        iArr[0] = i11;
        b0 u11 = b0.u(context, null, iArr);
        try {
            return u11.b(0);
        } finally {
            u11.x();
        }
    }

    public static ColorStateList d(int i11, @NonNull Context context) {
        int[] iArr = f37847g;
        iArr[0] = i11;
        b0 u11 = b0.u(context, null, iArr);
        try {
            return u11.c(0);
        } finally {
            u11.x();
        }
    }
}
