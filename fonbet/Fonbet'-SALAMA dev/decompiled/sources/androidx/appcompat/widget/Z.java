package androidx.appcompat.widget;

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

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: l, reason: collision with root package name */
    public static final RectF f8587l = new RectF();

    /* renamed from: m, reason: collision with root package name */
    public static final ConcurrentHashMap f8588m = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f8589a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8590b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f8591c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f8592d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f8593e = -1.0f;

    /* renamed from: f, reason: collision with root package name */
    public int[] f8594f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f8595g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f8596h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f8597i;
    public final Context j;

    /* renamed from: k, reason: collision with root package name */
    public final W f8598k;

    static {
        new ConcurrentHashMap();
    }

    public Z(TextView textView) {
        this.f8597i = textView;
        this.j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f8598k = new X();
        } else {
            this.f8598k = new W();
        }
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i7 : iArr) {
            if (i7 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i7)) < 0) {
                arrayList.add(Integer.valueOf(i7));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i8 = 0; i8 < size; i8++) {
            iArr2[i8] = ((Integer) arrayList.get(i8)).intValue();
        }
        return iArr2;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f8588m;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e7);
            return null;
        }
    }

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, null);
        } catch (Exception e7) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e7);
            return obj2;
        }
    }

    public final void a() {
        if (f()) {
            if (this.f8590b) {
                if (this.f8597i.getMeasuredHeight() <= 0 || this.f8597i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f8598k.b(this.f8597i) ? 1048576 : (this.f8597i.getMeasuredWidth() - this.f8597i.getTotalPaddingLeft()) - this.f8597i.getTotalPaddingRight();
                int height = (this.f8597i.getHeight() - this.f8597i.getCompoundPaddingBottom()) - this.f8597i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f8587l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c3 = c(rectF);
                        if (c3 != this.f8597i.getTextSize()) {
                            g(c3, 0);
                        }
                    } finally {
                    }
                }
            }
            this.f8590b = true;
        }
    }

    public final int c(RectF rectF) {
        CharSequence transformation;
        int length = this.f8594f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i7 = length - 1;
        int i8 = 0;
        int i9 = 1;
        while (i9 <= i7) {
            int i10 = (i9 + i7) / 2;
            int i11 = this.f8594f[i10];
            TextView textView = this.f8597i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            CharSequence charSequence = (transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null) ? text : transformation;
            int b7 = T.b(textView);
            TextPaint textPaint = this.f8596h;
            if (textPaint == null) {
                this.f8596h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f8596h.set(textView.getPaint());
            this.f8596h.setTextSize(i11);
            StaticLayout a2 = V.a(charSequence, (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), b7, textView, this.f8596h, this.f8598k);
            if ((b7 == -1 || (a2.getLineCount() <= b7 && a2.getLineEnd(a2.getLineCount() - 1) == charSequence.length())) && a2.getHeight() <= rectF.bottom) {
                int i12 = i10 + 1;
                i8 = i9;
                i9 = i12;
            } else {
                i8 = i10 - 1;
                i7 = i8;
            }
        }
        return this.f8594f[i8];
    }

    public final boolean f() {
        return j() && this.f8589a != 0;
    }

    public final void g(float f7, int i7) {
        Context context = this.j;
        float applyDimension = TypedValue.applyDimension(i7, f7, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f8597i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean a2 = U.a(textView);
            if (textView.getLayout() != null) {
                this.f8590b = false;
                try {
                    Method d7 = d("nullLayouts");
                    if (d7 != null) {
                        d7.invoke(textView, null);
                    }
                } catch (Exception e7) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e7);
                }
                if (a2) {
                    textView.forceLayout();
                } else {
                    textView.requestLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean h() {
        if (j() && this.f8589a == 1) {
            if (!this.f8595g || this.f8594f.length == 0) {
                int floor = ((int) Math.floor((this.f8593e - this.f8592d) / this.f8591c)) + 1;
                int[] iArr = new int[floor];
                for (int i7 = 0; i7 < floor; i7++) {
                    iArr[i7] = Math.round((i7 * this.f8591c) + this.f8592d);
                }
                this.f8594f = b(iArr);
            }
            this.f8590b = true;
        } else {
            this.f8590b = false;
        }
        return this.f8590b;
    }

    public final boolean i() {
        boolean z4 = this.f8594f.length > 0;
        this.f8595g = z4;
        if (z4) {
            this.f8589a = 1;
            this.f8592d = r0[0];
            this.f8593e = r0[r1 - 1];
            this.f8591c = -1.0f;
        }
        return z4;
    }

    public final boolean j() {
        return !(this.f8597i instanceof AppCompatEditText);
    }

    public final void k(float f7, float f8, float f9) {
        if (f7 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f7 + "px) is less or equal to (0px)");
        }
        if (f8 <= f7) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f8 + "px) is less or equal to minimum auto-size text size (" + f7 + "px)");
        }
        if (f9 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f9 + "px) is less or equal to (0px)");
        }
        this.f8589a = 1;
        this.f8592d = f7;
        this.f8593e = f8;
        this.f8591c = f9;
        this.f8595g = false;
    }
}
