package p165y;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class j extends k {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18114f;

    @Override // p165y.k
    public final void c(View view, float f7) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f7));
            return;
        }
        if (this.f18114f) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f18114f = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f7)));
            } catch (IllegalAccessException e7) {
                Log.e("ViewSpline", "unable to setProgress", e7);
            } catch (InvocationTargetException e8) {
                Log.e("ViewSpline", "unable to setProgress", e8);
            }
        }
    }
}
