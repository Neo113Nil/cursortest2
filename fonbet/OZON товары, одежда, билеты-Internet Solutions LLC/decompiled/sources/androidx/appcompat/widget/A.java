package androidx.appcompat.widget;

import E0.C2942q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import androidx.annotation.NonNull;
import i.C6977a;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
final class A {

    /* renamed from: l, reason: collision with root package name */
    private static final RectF f37516l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private static ConcurrentHashMap<String, Method> f37517m = new ConcurrentHashMap<>();

    /* renamed from: a, reason: collision with root package name */
    private int f37518a = 0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f37519b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f37520c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private float f37521d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    private float f37522e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    private int[] f37523f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    private boolean f37524g = false;

    /* renamed from: h, reason: collision with root package name */
    private TextPaint f37525h;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final TextView f37526i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f37527j;

    /* renamed from: k, reason: collision with root package name */
    private final b f37528k;

    /* loaded from: classes8.dex */
    private static final class a {
        @NonNull
        static StaticLayout a(@NonNull CharSequence charSequence, @NonNull Layout.Alignment alignment, int i11, int i12, @NonNull TextView textView, @NonNull TextPaint textPaint, @NonNull d dVar) {
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i11);
            StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i12 == -1) {
                i12 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i12);
            try {
                dVar.a(obtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return obtain.build();
        }
    }

    private static class b extends d {
        b() {
        }

        @Override // androidx.appcompat.widget.A.d
        void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) A.j("getTextDirectionHeuristic", textView, TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    private static class c extends b {
        c() {
        }

        @Override // androidx.appcompat.widget.A.b, androidx.appcompat.widget.A.d
        void a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // androidx.appcompat.widget.A.d
        boolean b(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    private static class d {
        d() {
        }

        void a(StaticLayout.Builder builder, TextView textView) {
            throw null;
        }

        boolean b(TextView textView) {
            return ((Boolean) A.j("getHorizontallyScrolling", textView, Boolean.FALSE)).booleanValue();
        }
    }

    A(@NonNull TextView textView) {
        this.f37526i = textView;
        this.f37527j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f37528k = new c();
        } else {
            this.f37528k = new b();
        }
    }

    private static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i11 : iArr) {
                if (i11 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i11)) < 0) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i12 = 0; i12 < size; i12++) {
                    iArr2[i12] = ((Integer) arrayList.get(i12)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    private int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f37523f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i11 = length - 1;
        int i12 = 0;
        int i13 = 1;
        while (i13 <= i11) {
            int i14 = (i13 + i11) / 2;
            int i15 = this.f37523f[i14];
            TextView textView = this.f37526i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f37525h;
            if (textPaint == null) {
                this.f37525h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f37525h.set(textView.getPaint());
            this.f37525h.setTextSize(i15);
            StaticLayout a11 = a.a(charSequence, (Layout.Alignment) j("getLayoutAlignment", textView, Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, this.f37526i, this.f37525h, this.f37528k);
            if ((maxLines == -1 || (a11.getLineCount() <= maxLines && a11.getLineEnd(a11.getLineCount() - 1) == charSequence.length())) && a11.getHeight() <= rectF.bottom) {
                int i16 = i14 + 1;
                i12 = i13;
                i13 = i16;
            } else {
                i12 = i14 - 1;
                i11 = i12;
            }
        }
        return this.f37523f[i12];
    }

    private static Method i(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f37517m;
            Method method = concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e11);
            return null;
        }
    }

    @SuppressLint({"BanUncheckedReflection"})
    static Object j(@NonNull String str, @NonNull Object obj, @NonNull Object obj2) {
        try {
            return i(str).invoke(obj, new Object[0]);
        } catch (Exception e11) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e11);
            return obj2;
        }
    }

    private boolean q() {
        if (s() && this.f37518a == 1) {
            if (!this.f37524g || this.f37523f.length == 0) {
                int floor = ((int) Math.floor((this.f37522e - this.f37521d) / this.f37520c)) + 1;
                int[] iArr = new int[floor];
                for (int i11 = 0; i11 < floor; i11++) {
                    iArr[i11] = Math.round((i11 * this.f37520c) + this.f37521d);
                }
                this.f37523f = b(iArr);
            }
            this.f37519b = true;
        } else {
            this.f37519b = false;
        }
        return this.f37519b;
    }

    private boolean r() {
        boolean z11 = this.f37523f.length > 0;
        this.f37524g = z11;
        if (z11) {
            this.f37518a = 1;
            this.f37521d = r0[0];
            this.f37522e = r0[r1 - 1];
            this.f37520c = -1.0f;
        }
        return z11;
    }

    private boolean s() {
        return !(this.f37526i instanceof AppCompatEditText);
    }

    private void t(float f7, float f11, float f12) throws IllegalArgumentException {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException(C2942q.b(f7, "Minimum auto-size text size (", "px) is less or equal to (0px)"));
        }
        if (f11 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f11 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f12 <= 0.0f) {
            throw new IllegalArgumentException(C2942q.b(f12, "The auto-size step granularity (", "px) is less or equal to (0px)"));
        }
        this.f37518a = 1;
        this.f37521d = f7;
        this.f37522e = f11;
        this.f37520c = f12;
        this.f37524g = false;
    }

    final void a() {
        if (k()) {
            if (this.f37519b) {
                if (this.f37526i.getMeasuredHeight() <= 0 || this.f37526i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f37528k.b(this.f37526i) ? 1048576 : (this.f37526i.getMeasuredWidth() - this.f37526i.getTotalPaddingLeft()) - this.f37526i.getTotalPaddingRight();
                int height = (this.f37526i.getHeight() - this.f37526i.getCompoundPaddingBottom()) - this.f37526i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f37516l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c11 = c(rectF);
                        if (c11 != this.f37526i.getTextSize()) {
                            p(c11, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f37519b = true;
        }
    }

    final int d() {
        return Math.round(this.f37522e);
    }

    final int e() {
        return Math.round(this.f37521d);
    }

    final int f() {
        return Math.round(this.f37520c);
    }

    final int[] g() {
        return this.f37523f;
    }

    final int h() {
        return this.f37518a;
    }

    final boolean k() {
        return s() && this.f37518a != 0;
    }

    final void l(AttributeSet attributeSet, int i11) {
        int resourceId;
        int[] iArr = C6977a.f65655i;
        Context context = this.f37527j;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i11, 0);
        TextView textView = this.f37526i;
        androidx.core.view.Y.B(textView, textView.getContext(), iArr, attributeSet, obtainStyledAttributes, i11);
        if (obtainStyledAttributes.hasValue(5)) {
            this.f37518a = obtainStyledAttributes.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes.hasValue(4) ? obtainStyledAttributes.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes.hasValue(2) ? obtainStyledAttributes.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes.hasValue(1) ? obtainStyledAttributes.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr2[i12] = obtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                this.f37523f = b(iArr2);
                r();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!s()) {
            this.f37518a = 0;
            return;
        }
        if (this.f37518a == 1) {
            if (!this.f37524g) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                t(dimension2, dimension3, dimension);
            }
            q();
        }
    }

    final void m(int i11, int i12, int i13, int i14) throws IllegalArgumentException {
        if (s()) {
            DisplayMetrics displayMetrics = this.f37527j.getResources().getDisplayMetrics();
            t(TypedValue.applyDimension(i14, i11, displayMetrics), TypedValue.applyDimension(i14, i12, displayMetrics), TypedValue.applyDimension(i14, i13, displayMetrics));
            if (q()) {
                a();
            }
        }
    }

    final void n(@NonNull int[] iArr, int i11) throws IllegalArgumentException {
        if (s()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i11 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f37527j.getResources().getDisplayMetrics();
                    for (int i12 = 0; i12 < length; i12++) {
                        iArr2[i12] = Math.round(TypedValue.applyDimension(i11, iArr[i12], displayMetrics));
                    }
                }
                this.f37523f = b(iArr2);
                if (!r()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f37524g = false;
            }
            if (q()) {
                a();
            }
        }
    }

    final void o(int i11) {
        if (s()) {
            if (i11 == 0) {
                this.f37518a = 0;
                this.f37521d = -1.0f;
                this.f37522e = -1.0f;
                this.f37520c = -1.0f;
                this.f37523f = new int[0];
                this.f37519b = false;
                return;
            }
            if (i11 != 1) {
                throw new IllegalArgumentException(Ej.b.a(i11, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = this.f37527j.getResources().getDisplayMetrics();
            t(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (q()) {
                a();
            }
        }
    }

    final void p(float f7, int i11) {
        Context context = this.f37527j;
        float applyDimension = TypedValue.applyDimension(i11, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f37526i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f37519b = false;
                try {
                    Method i12 = i("nullLayouts");
                    if (i12 != null) {
                        i12.invoke(textView, new Object[0]);
                    }
                } catch (Exception e11) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e11);
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
}
