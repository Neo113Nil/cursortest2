package p165y;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f18107d;

    @Override // p165y.f
    public final void d(View view, float f7) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f7));
            return;
        }
        if (this.f18107d) {
            return;
        }
        try {
            method = view.getClass().getMethod("setProgress", Float.TYPE);
        } catch (NoSuchMethodException unused) {
            this.f18107d = true;
            method = null;
        }
        if (method != null) {
            try {
                method.invoke(view, Float.valueOf(a(f7)));
            } catch (IllegalAccessException e7) {
                Log.e("ViewOscillator", "unable to setProgress", e7);
            } catch (InvocationTargetException e8) {
                Log.e("ViewOscillator", "unable to setProgress", e8);
            }
        }
    }
}
