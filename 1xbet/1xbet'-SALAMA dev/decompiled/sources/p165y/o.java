package p165y;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p143u.e;

/* JADX INFO: loaded from: classes.dex */
public final class o extends p {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18125g;

    @Override // p165y.p
    public final boolean b(float f7, long j, View view, e eVar) {
        Method method;
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(a(f7, j, view, eVar));
        } else {
            if (this.f18125g) {
                return false;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f18125g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f7, j, view, eVar)));
                } catch (IllegalAccessException e7) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e7);
                } catch (InvocationTargetException e8) {
                    Log.e("ViewTimeCycle", "unable to setProgress", e8);
                }
            }
        }
        return this.f18129d;
    }
}
