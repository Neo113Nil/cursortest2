package h;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.ThreadLocal f3151a = new java.lang.ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f3152b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f3153c = {android.R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f3154d = {android.R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f3155e = {android.R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3156f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f3157g = new int[1];

    public static int a(android.content.Context context, int i2) {
        android.content.res.ColorStateList c2 = c(context, i2);
        if (c2 != null && c2.isStateful()) {
            return c2.getColorForState(f3152b, c2.getDefaultColor());
        }
        java.lang.ThreadLocal threadLocal = f3151a;
        android.util.TypedValue typedValue = (android.util.TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new android.util.TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(android.R.attr.disabledAlpha, typedValue, true);
        float f2 = typedValue.getFloat();
        int b2 = b(context, i2);
        int round = java.lang.Math.round(android.graphics.Color.alpha(b2) * f2);
        int i3 = r.AbstractC0983a.f8324a;
        if (round < 0 || round > 255) {
            throw new java.lang.IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (b2 & 16777215) | (round << 24);
    }

    public static int b(android.content.Context context, int i2) {
        int[] iArr = f3157g;
        iArr[0] = i2;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static android.content.res.ColorStateList c(android.content.Context context, int i2) {
        android.content.res.ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f3157g;
        iArr[0] = i2;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes((android.util.AttributeSet) null, iArr);
        try {
            if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                java.lang.Object obj = d.AbstractC0106a.f2737a;
                colorStateList = context.getColorStateList(resourceId);
                if (colorStateList != null) {
                    return colorStateList;
                }
            }
            colorStateList = obtainStyledAttributes.getColorStateList(0);
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
