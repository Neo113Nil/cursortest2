package sg.bigo.ads.E0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.core.view.ViewCompat;
import java.lang.reflect.Method;
import sg.bigo.ads.K0.A;

/* loaded from: classes3.dex */
public abstract class p {
    public static void a(int i, int i2, int i3, float[] fArr) {
        float f;
        float abs;
        float f2 = i / 255.0f;
        float f3 = i2 / 255.0f;
        float f4 = i3 / 255.0f;
        float max = Math.max(f2, Math.max(f3, f4));
        float min = Math.min(f2, Math.min(f3, f4));
        float f5 = max - min;
        float f6 = (max + min) / 2.0f;
        if (max == min) {
            f = 0.0f;
            abs = 0.0f;
        } else {
            f = max == f2 ? ((f3 - f4) / f5) % 6.0f : max == f3 ? ((f4 - f2) / f5) + 2.0f : 4.0f + ((f2 - f3) / f5);
            abs = f5 / (1.0f - Math.abs((2.0f * f6) - 1.0f));
        }
        float f7 = 360.0f;
        float f8 = (f * 60.0f) % 360.0f;
        if (f8 < 0.0f) {
            f8 += 360.0f;
        }
        if (f8 < 0.0f) {
            f7 = 0.0f;
        } else if (f8 <= 360.0f) {
            f7 = f8;
        }
        fArr[0] = f7;
        if (abs < 0.0f) {
            abs = 0.0f;
        } else if (abs > 1.0f) {
            abs = 1.0f;
        }
        fArr[1] = abs;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        } else if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        fArr[2] = f6;
    }

    public static double b(int i) {
        double a2 = a((16711680 & i) >> 16, (65280 & i) >> 8, i & 255);
        double a3 = a(255, 255, 255);
        return (Math.max(a2, a3) + 0.05000000074505806d) / (Math.min(a2, a3) + 0.05000000074505806d);
    }

    public static float a(ValueAnimator valueAnimator) {
        if (valueAnimator != null) {
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue instanceof Float) {
                return ((Float) animatedValue).floatValue();
            }
        }
        return 1.0f;
    }

    public static int a(int i, int i2) {
        return (i & ViewCompat.MEASURED_SIZE_MASK) | ((Math.max(0, Math.min(255, i2)) & 255) << 24);
    }

    public static int a(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2];
        if (f > 0.3f) {
            fArr[2] = ((f - 1.0f) * 0.6857143f) + 0.93f;
        } else {
            fArr[2] = f * 1.5f;
        }
        return Color.HSVToColor(fArr);
    }

    public static int a(float f, int i, int i2) {
        float f2 = ((i >> 24) & 255) / 255.0f;
        float f3 = ((i2 >> 24) & 255) / 255.0f;
        float pow = (float) Math.pow(((i >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((i >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((i & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((i2 >> 16) & 255) / 255.0f, 2.2d);
        float pow5 = ((((float) Math.pow(((i2 >> 8) & 255) / 255.0f, 2.2d)) - pow2) * f) + pow2;
        float pow6 = ((((float) Math.pow((i2 & 255) / 255.0f, 2.2d)) - pow3) * f) + pow3;
        float f4 = (((f3 - f2) * f) + f2) * 255.0f;
        return (Math.round(((float) Math.pow(((pow4 - pow) * f) + pow, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round(f4) << 24) | (Math.round(((float) Math.pow(pow5, 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow(pow6, 0.45454545454545453d)) * 255.0f);
    }

    public static Integer a(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            s sVar = new r(bitmap).a().e;
            if (sVar != null) {
                return Integer.valueOf(sVar.d);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static double a(int i, int i2, int i3) {
        double[] dArr = new double[3];
        dArr[0] = i / 255.0f;
        dArr[1] = i2 / 255.0f;
        dArr[2] = i3 / 255.0f;
        for (int i4 = 0; i4 < 3; i4++) {
            double d = dArr[i4];
            dArr[i4] = d <= 0.0392800010740757d ? d / 12.920000076293945d : Math.pow((d + 0.054999999701976776d) / 1.0549999475479126d, 2.4000000953674316d);
        }
        return (dArr[2] * 0.0722000002861023d) + (dArr[1] * 0.7152000069618225d) + (dArr[0] * 0.2125999927520752d);
    }

    public static void a(View view, BitmapDrawable bitmapDrawable, long j) {
        if (view == null) {
            return;
        }
        Object tag = view.getTag(-2123303016);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        Drawable background = view.getBackground();
        if (background == null) {
            view.setBackground(bitmapDrawable);
        } else {
            view.setBackground(new LayerDrawable(new Drawable[]{background, bitmapDrawable}));
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        if (j != -1) {
            ofFloat.setDuration(j);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new i(bitmapDrawable, background));
        ofFloat.addListener(new j(view, background, bitmapDrawable));
        ofFloat.start();
        view.setTag(-2123303016, ofFloat);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r8.setAccessible(true);
        r4 = r8.invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0059, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x005a, code lost:
    
        sg.bigo.ads.w0.AbstractC5496a.a("ReflectionHelper", android.util.Log.getStackTraceString(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0067, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006c A[LOOP:0: B:11:0x001a->B:28:0x006c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0070 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ValueAnimator a(View view, int i, k kVar) {
        n oVar;
        Object obj;
        Drawable findDrawableByLayerId;
        Drawable drawable = null;
        if (view == null) {
            return null;
        }
        Drawable background = view.getBackground();
        if ((background instanceof LayerDrawable) && (findDrawableByLayerId = ((LayerDrawable) background).findDrawableByLayerId(R.id.background)) != null) {
            background = findDrawableByLayerId;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= 10 || background == null) {
                break;
            }
            i2++;
            Method[] methods = background.getClass().getMethods();
            int length = methods.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                Method method = methods[i3];
                if (TextUtils.equals("getDrawable", method.getName()) && A.a(method.getParameterTypes()) && method.getReturnType() == Drawable.class) {
                    break;
                }
                i3++;
            }
            if (obj instanceof Drawable) {
                drawable = background;
                break;
            }
            background = (Drawable) obj;
        }
        if (drawable instanceof ColorDrawable) {
            oVar = new l(view, (ColorDrawable) drawable, i);
        } else if (drawable instanceof ShapeDrawable) {
            Paint paint = ((ShapeDrawable) drawable).getPaint();
            Paint.Style style = paint.getStyle();
            oVar = (style == Paint.Style.FILL || style == Paint.Style.FILL_AND_STROKE) ? new m(view, paint, i) : new o(view, i);
        } else {
            oVar = new o(view, i);
        }
        Object tag = view.getTag(-2123303016);
        if (tag instanceof ValueAnimator) {
            ((ValueAnimator) tag).cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        long a2 = kVar.a();
        if (a2 != -1) {
            ofFloat.setDuration(a2);
        }
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.addUpdateListener(new g(oVar, kVar));
        ofFloat.addListener(new h(kVar, i, oVar, view));
        ofFloat.start();
        view.setTag(-2123303016, ofFloat);
        return ofFloat;
    }

    public static void a(Interpolator interpolator, View view) {
        if (view == null) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.setInterpolator(interpolator);
        ofFloat.addUpdateListener(new e(view));
        ofFloat.start();
    }
}
