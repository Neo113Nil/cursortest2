package sg.bigo.ads.K0;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.lang.ref.WeakReference;

/* renamed from: sg.bigo.ads.K0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4954k {
    public static Interpolator a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator() : new DecelerateInterpolator(1.5f) : new AccelerateInterpolator(1.5f);
    }

    public static void a(View view, View view2, sg.bigo.ads.x.j jVar) {
        View view3 = (View) new WeakReference(view).get();
        if (view3 != null) {
            view3.animate().alpha(0.0f).scaleX(1.5f).scaleY(1.5f).setDuration(300).setInterpolator(new DecelerateInterpolator()).setListener(new C4947d(jVar)).start();
        }
        View view4 = (View) new WeakReference(view2).get();
        if (view4 != null) {
            view4.animate().alpha(0.0f).setDuration(300).setInterpolator(new DecelerateInterpolator()).start();
        }
    }

    public static void a(View view, int i, int i2, int i3) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{i, i});
            view.setBackground(gradientDrawable);
            ArgbEvaluator argbEvaluator = new ArgbEvaluator();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(500L);
            ofFloat.addUpdateListener(new C4948e(argbEvaluator, i, i2, i3, gradientDrawable));
            ofFloat.start();
        } catch (Throwable unused) {
        }
    }
}
