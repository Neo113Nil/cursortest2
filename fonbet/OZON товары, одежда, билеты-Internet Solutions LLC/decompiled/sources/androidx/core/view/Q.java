package androidx.core.view;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes8.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, S> f42240a = Collections.synchronizedMap(new WeakHashMap());

    private static class a {
        static float a(VelocityTracker velocityTracker, int i11) {
            return velocityTracker.getAxisVelocity(i11);
        }

        static float b(VelocityTracker velocityTracker, int i11, int i12) {
            return velocityTracker.getAxisVelocity(i11, i12);
        }

        static boolean c(VelocityTracker velocityTracker, int i11) {
            return velocityTracker.isAxisSupported(i11);
        }
    }

    public static void a(@NonNull VelocityTracker velocityTracker, @NonNull MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            Map<VelocityTracker, S> map = f42240a;
            if (!map.containsKey(velocityTracker)) {
                map.put(velocityTracker, new S());
            }
            map.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(@NonNull VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, Float.MAX_VALUE);
        S s11 = f42240a.get(velocityTracker);
        if (s11 != null) {
            s11.b();
        }
    }

    public static float c(@NonNull VelocityTracker velocityTracker, int i11) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i11);
        }
        if (i11 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i11 == 1) {
            return velocityTracker.getYVelocity();
        }
        S s11 = f42240a.get(velocityTracker);
        if (s11 != null) {
            return s11.c(i11);
        }
        return 0.0f;
    }
}
