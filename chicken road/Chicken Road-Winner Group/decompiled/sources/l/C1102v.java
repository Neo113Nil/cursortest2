package l;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
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

/* renamed from: l.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1102v {

    /* renamed from: k, reason: collision with root package name */
    public static final RectF f9901k = new RectF();

    /* renamed from: l, reason: collision with root package name */
    public static final ConcurrentHashMap f9902l = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public int f9903a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9904b = false;

    /* renamed from: c, reason: collision with root package name */
    public float f9905c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f9906d = -1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f9907e = -1.0f;
    public int[] f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public boolean f9908g = false;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f9909h;

    /* renamed from: i, reason: collision with root package name */
    public final TextView f9910i;

    /* renamed from: j, reason: collision with root package name */
    public final Context f9911j;

    static {
        new ConcurrentHashMap();
    }

    public C1102v(TextView textView) {
        this.f9910i = textView;
        this.f9911j = textView.getContext();
    }

    public static int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i3 : iArr) {
                if (i3 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i3)) < 0) {
                    arrayList.add(Integer.valueOf(i3));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i4 = 0; i4 < size; i4++) {
                    iArr2[i4] = ((Integer) arrayList.get(i4)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method d(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = f9902l;
            Method method = (Method) concurrentHashMap.get(str);
            if (method != null || (method = TextView.class.getDeclaredMethod(str, new Class[0])) == null) {
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

    public static Object e(Object obj, String str, Object obj2) {
        try {
            return d(str).invoke(obj, new Object[0]);
        } catch (Exception e3) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e3);
            return obj2;
        }
    }

    public final void a() {
        if (this.f9903a != 0) {
            if (this.f9904b) {
                if (this.f9910i.getMeasuredHeight() <= 0 || this.f9910i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = Build.VERSION.SDK_INT >= 29 ? this.f9910i.isHorizontallyScrollable() : ((Boolean) e(this.f9910i, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue() ? 1048576 : (this.f9910i.getMeasuredWidth() - this.f9910i.getTotalPaddingLeft()) - this.f9910i.getTotalPaddingRight();
                int height = (this.f9910i.getHeight() - this.f9910i.getCompoundPaddingBottom()) - this.f9910i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f9901k;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float c3 = c(rectF);
                        if (c3 != this.f9910i.getTextSize()) {
                            f(0, c3);
                        }
                    } finally {
                    }
                }
            }
            this.f9904b = true;
        }
    }

    public final int c(RectF rectF) {
        TextDirectionHeuristic textDirectionHeuristic;
        CharSequence transformation;
        int length = this.f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i3 = length - 1;
        int i4 = 1;
        int i5 = 0;
        while (i4 <= i3) {
            int i6 = (i4 + i3) / 2;
            int i7 = this.f[i6];
            TextView textView = this.f9910i;
            CharSequence text = textView.getText();
            TransformationMethod transformationMethod = textView.getTransformationMethod();
            if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                text = transformation;
            }
            int i8 = Build.VERSION.SDK_INT;
            int maxLines = textView.getMaxLines();
            TextPaint textPaint = this.f9909h;
            if (textPaint == null) {
                this.f9909h = new TextPaint();
            } else {
                textPaint.reset();
            }
            this.f9909h.set(textView.getPaint());
            this.f9909h.setTextSize(i7);
            Layout.Alignment alignment = (Layout.Alignment) e(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
            StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f9909h, Math.round(rectF.right));
            obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
            if (i8 >= 29) {
                try {
                    textDirectionHeuristic = textView.getTextDirectionHeuristic();
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
            } else {
                textDirectionHeuristic = (TextDirectionHeuristic) e(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR);
            }
            obtain.setTextDirection(textDirectionHeuristic);
            StaticLayout build = obtain.build();
            if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                int i9 = i6 + 1;
                i5 = i4;
                i4 = i9;
            } else {
                i5 = i6 - 1;
                i3 = i5;
            }
        }
        return this.f[i5];
    }

    public final void f(int i3, float f) {
        Context context = this.f9911j;
        float applyDimension = TypedValue.applyDimension(i3, f, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics());
        TextView textView = this.f9910i;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.f9904b = false;
                try {
                    Method d3 = d("nullLayouts");
                    if (d3 != null) {
                        d3.invoke(textView, new Object[0]);
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
        if (this.f9903a == 1) {
            if (!this.f9908g || this.f.length == 0) {
                int floor = ((int) Math.floor((this.f9907e - this.f9906d) / this.f9905c)) + 1;
                int[] iArr = new int[floor];
                for (int i3 = 0; i3 < floor; i3++) {
                    iArr[i3] = Math.round((i3 * this.f9905c) + this.f9906d);
                }
                this.f = b(iArr);
            }
            this.f9904b = true;
        } else {
            this.f9904b = false;
        }
        return this.f9904b;
    }

    public final boolean h() {
        boolean z3 = this.f.length > 0;
        this.f9908g = z3;
        if (z3) {
            this.f9903a = 1;
            this.f9906d = r0[0];
            this.f9907e = r0[r1 - 1];
            this.f9905c = -1.0f;
        }
        return z3;
    }

    public final void i(float f, float f3, float f4) {
        if (f <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
        }
        if (f3 <= f) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        if (f4 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f4 + "px) is less or equal to (0px)");
        }
        this.f9903a = 1;
        this.f9906d = f;
        this.f9907e = f3;
        this.f9905c = f4;
        this.f9908g = false;
    }
}
