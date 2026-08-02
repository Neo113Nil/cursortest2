package y;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import u.C1616e;

/* loaded from: classes.dex */
public final class o extends p {

    /* renamed from: g, reason: collision with root package name */
    public boolean f18119g;

    @Override // y.p
    public final boolean b(float f7, long j, View view, C1616e c1616e) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f7, j, view, c1616e));
        } else {
            if (this.f18119g) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f18119g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f7, j, view, c1616e)));
                } catch (IllegalAccessException e7) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e7);
                } catch (InvocationTargetException e8) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e8);
                }
            }
        }
        return this.f18123d;
    }
}
