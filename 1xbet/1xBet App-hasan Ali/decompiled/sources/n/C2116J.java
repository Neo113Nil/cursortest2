package n;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: n.J, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2116J {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f18162l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f18163m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f18164a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f18165b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f18166c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f18167d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f18168e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f18169g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f18170h;
    public final TextView i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f18171j;

    /* renamed from: k, reason: collision with root package name */
    public final C2113G f18172k;

    public C2116J(TextView textView) {
        this.i = textView;
        this.f18171j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f18172k = new C2114H();
        } else {
            this.f18172k = new C2113G();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                    arrayList.add(Integer.valueOf(i));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i5 = 0; i5 < size; i5++) {
                    iArr2[i5] = ((Integer) arrayList.get(i5)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f18163m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, null)) == null) {
                return method;
            }
            method.setAccessible(true);
            concurrentHashMap.put(str, method);
            return method;
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e3);
            return null;
        }
    }

    public static Object e(TextView textView, String str, Object obj) {
        try {
            return d(str).invoke(textView, null);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj;
        }
    }

    public final void a() {
        if (this.f18164a != 0) {
            if (this.f18165b) {
                if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f18172k.b(this.i) ? 1048576 : (this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft()) - this.i.getTotalPaddingRight();
                int height = (this.i.getHeight() - this.i.getCompoundPaddingBottom()) - this.i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f18162l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c5 = c(rectF);
                        if (c5 != this.i.getTextSize()) {
                            f(0, c5);
                        }
                    } finally {
                    }
                }
            }
            this.f18165b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i = length - 1;
        int i5 = 0;
        int i6 = 1;
        while (i6 <= i) {
            int i7 = (i6 + i) / 2;
            int i8 = this.f[i7];
            TextView textView = this.i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f18170h;
            if (textPaint == null) {
                this.f18170h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f18170h.set(textView.getPaint());
            this.f18170h.setTextSize(i8);
            StaticLayout a5 = AbstractC2112F.a(text, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines, textView, this.f18170h, this.f18172k);
            if ((maxLines == -1 || (a5.getLineCount() <= maxLines && a5.getLineEnd(a5.getLineCount() - 1) == text.length())) && a5.getHeight() <= rectF.bottom) {
                int i9 = i7 + 1;
                i5 = i6;
                i6 = i9;
            } else {
                i5 = i7 - 1;
                i = i5;
            }
        }
        return this.f[i5];
    }

    public final void f(int i, float f) {
        Context context = this.f18171j;
        float applyDimension = TypedValue.applyDimension(i, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f18165b = false;
                try {
                    Method d5 = d("nullLayouts");
                    if (d5 != null) {
                        d5.invoke(textView, null);
                    }
                } catch (Exception e3) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e3);
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
        if (this.f18164a == 1) {
            if (!this.f18169g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f18168e - this.f18167d) / this.f18166c)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.f18166c) + this.f18167d);
                }
                this.f = b(iArr);
            }
            this.f18165b = true;
        } else {
            this.f18165b = false;
        }
        return this.f18165b;
    }

    public final boolean h() {
        boolean z3 = this.f.length > 0;
        this.f18169g = z3;
        if (z3) {
            this.f18164a = 1;
            this.f18167d = r0[0];
            this.f18168e = r0[r1 - 1];
            this.f18166c = -1.0f;
        }
        return z3;
    }

    public final void i(float f, float f5, float f6) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f5 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f5 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f6 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f6 + "px) is less or equal to (0px)");
        }
        this.f18164a = 1;
        this.f18167d = f;
        this.f18168e = f5;
        this.f18166c = f6;
        this.f18169g = false;
    }
}
