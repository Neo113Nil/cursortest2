package p000;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zc1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f9734a = new ThreadLocal();

    /* JADX INFO: renamed from: b */
    public static final int[] f9735b = {-16842910};

    /* JADX INFO: renamed from: c */
    public static final int[] f9736c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d */
    public static final int[] f9737d = {R.attr.state_pressed};

    /* JADX INFO: renamed from: e */
    public static final int[] f9738e = {R.attr.state_checked};

    /* JADX INFO: renamed from: f */
    public static final int[] f9739f = new int[0];

    /* JADX INFO: renamed from: g */
    public static final int[] f9740g = new int[1];

    /* JADX INFO: renamed from: a */
    public static void m5876a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(mz0.f5196j);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m5877b(Context context, int i) {
        ColorStateList colorStateListM5879d = m5879d(context, i);
        if (colorStateListM5879d != null && colorStateListM5879d.isStateful()) {
            return colorStateListM5879d.getColorForState(f9735b, colorStateListM5879d.getDefaultColor());
        }
        ThreadLocal threadLocal = f9734a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f = typedValue.getFloat();
        int iM5878c = m5878c(context, i);
        int iRound = Math.round(Color.alpha(iM5878c) * f);
        int i2 = AbstractC0767ui.f7820a;
        if (iRound >= 0 && iRound <= 255) {
            return (iM5878c & 16777215) | (iRound << 24);
        }
        C0270h1.m2190f("alpha must be between 0 and 255.");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m5878c(Context context, int i) {
        int[] iArr = f9740g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return typedArrayObtainStyledAttributes.getColor(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d */
    public static ColorStateList m5879d(Context context, int i) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f9740g;
        iArr[0] = i;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = j22.m2806o(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
