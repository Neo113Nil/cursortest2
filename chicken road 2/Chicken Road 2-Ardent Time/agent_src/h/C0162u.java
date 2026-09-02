package h;

/* renamed from: h.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0162u {

    /* renamed from: k, reason: collision with root package name */
    public static final android.graphics.RectF f3265k = new android.graphics.RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f3266l = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f3267a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3268b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f3269c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f3270d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f3271e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f3272f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f3273g = false;

    /* renamed from: h, reason: collision with root package name */
    public android.text.TextPaint f3274h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f3275i;

    /* renamed from: j, reason: collision with root package name */
    public final android.content.Context f3276j;

    static {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public C0162u(android.widget.TextView textView) {
        this.f3275i = textView;
        this.f3276j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        java.util.Arrays.sort(iArr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i2 : iArr) {
            if (i2 > 0 && java.util.Collections.binarySearch(arrayList, java.lang.Integer.valueOf(i2)) < 0) {
                arrayList.add(java.lang.Integer.valueOf(i2));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i3 = 0; i3 < size; i3++) {
            iArr2[i3] = ((java.lang.Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    public static java.lang.reflect.Method d(java.lang.String str) {
        try {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = f3266l;
            java.lang.reflect.Method method = (java.lang.reflect.Method) concurrentHashMap.get(str);
            if (method == null && (method = android.widget.TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (java.lang.Exception e2) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e2);
            return null;
        }
    }

    public static java.lang.Object e(java.lang.Object obj, java.lang.String str, java.lang.Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (java.lang.Exception e2) {
            android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e2);
            return obj2;
        }
    }

    public final void a() {
        if (this.f3267a != 0) {
            if (this.f3268b) {
                if (this.f3275i.getMeasuredHeight() <= 0 || this.f3275i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = android.os.Build.VERSION.SDK_INT >= 29 ? this.f3275i.isHorizontallyScrollable() : ((java.lang.Boolean) e(this.f3275i, "getHorizontallyScrolling", java.lang.Boolean.FALSE)).booleanValue() ? 1048576 : (this.f3275i.getMeasuredWidth() - this.f3275i.getTotalPaddingLeft()) - this.f3275i.getTotalPaddingRight();
                int height = (this.f3275i.getHeight() - this.f3275i.getCompoundPaddingBottom()) - this.f3275i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                android.graphics.RectF rectF = f3265k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c2 = c(rectF);
                        if (c2 != this.f3275i.getTextSize()) {
                            f(0, c2);
                        }
                    } finally {
                    }
                }
            }
            this.f3268b = true;
        }
    }

    public final int c(android.graphics.RectF rectF) {
        android.text.TextDirectionHeuristic textDirectionHeuristic;
        java.lang.CharSequence transformation;
        int length = this.f3272f.length;
        if (length == 0) {
            throw new java.lang.IllegalStateException("No available text sizes to choose from.");
        }
        int i2 = length - 1;
        int i3 = 1;
        int i4 = 0;
        while (i3 <= i2) {
            int i5 = (i3 + i2) / 2;
            int i6 = this.f3272f[i5];
            android.widget.TextView textView = this.f3275i;
            java.lang.CharSequence text = textView.getText();
            android.text.method.TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i7 = android.os.Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            android.text.TextPaint textPaint = this.f3274h;
            if (textPaint == null) {
                this.f3274h = new android.text.TextPaint();
            } else {
                textPaint.reset();
            }
            this.f3274h.set(textView.getPaint());
            this.f3274h.setTextSize(i6);
            android.text.Layout.Alignment alignment = (android.text.Layout.Alignment) e(textView, "getLayoutAlignment", android.text.Layout.Alignment.ALIGN_NORMAL);
            android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(text, 0, text.length(), this.f3274h, java.lang.Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            if (i7 >= 29) {
                try {
                    textDirectionHeuristic = textView.getTextDirectionHeuristic();
                } catch (java.lang.ClassCastException unused) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
            } else {
                textDirectionHeuristic = (android.text.TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
            android.text.StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i8 = i5 + 1;
                i4 = i3;
                i3 = i8;
            } else {
                i4 = i5 - 1;
                i2 = i4;
            }
        }
        return this.f3272f[i4];
    }

    public final void f(int i2, float f2) {
        android.content.Context context = this.f3276j;
        float applyDimension = android.util.TypedValue.applyDimension(i2, f2, (context == null ? android.content.res.Resources.getSystem() : context.getResources()).getDisplayMetrics());
        android.widget.TextView textView = this.f3275i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f3268b = false;
                try {
                    java.lang.reflect.Method d2 = d("nullLayouts");
                    if (d2 != null) {
                        d2.invoke(textView, null);
                    }
                } catch (java.lang.Exception e2) {
                    android.util.Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e2);
                }
                if (isInLayout) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean g() {
        if (this.f3267a == 1) {
            if (!this.f3273g || this.f3272f.length == 0) {
                int floor = ((int) java.lang.Math.floor((this.f3271e - this.f3270d) / this.f3269c)) + 1;
                int[] iArr = new int[floor];
                for (int i2 = 0; i2 < floor; i2++) {
                    iArr[i2] = java.lang.Math.round((i2 * this.f3269c) + this.f3270d);
                }
                this.f3272f = b(iArr);
            }
            this.f3268b = true;
        } else {
            this.f3268b = false;
        }
        return this.f3268b;
    }

    public final boolean h() {
        boolean z2 = this.f3272f.length > 0;
        this.f3273g = z2;
        if (z2) {
            this.f3267a = 1;
            this.f3270d = r0[0];
            this.f3271e = r0[r1 - 1];
            this.f3269c = -1.0f;
        }
        return z2;
    }

    public final void i(float f2, float f3, float f4) {
        if (f2 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
        }
        if (f3 <= f2) {
            throw new java.lang.IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
        }
        if (f4 <= 0.0f) {
            throw new java.lang.IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f3267a = 1;
        this.f3270d = f2;
        this.f3271e = f3;
        this.f3269c = f4;
        this.f3273g = false;
    }
}
