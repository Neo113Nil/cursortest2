package androidx.core.view;

/* loaded from: classes.dex */
public final class VelocityTrackerCompat {
    private static java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> sFallbackTrackers = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface VelocityTrackableMotionEventAxis {
    }

    @java.lang.Deprecated
    public static float getXVelocity(android.view.VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @java.lang.Deprecated
    public static float getYVelocity(android.view.VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static boolean isAxisSupported(android.view.VelocityTracker velocityTracker, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.VelocityTrackerCompat.Api34Impl.isAxisSupported(velocityTracker, i);
        }
        return i == 26 || i == 0 || i == 1;
    }

    public static float getAxisVelocity(android.view.VelocityTracker velocityTracker, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        androidx.core.view.VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            return fallbackTrackerOrNull.getAxisVelocity(i);
        }
        return 0.0f;
    }

    public static float getAxisVelocity(android.view.VelocityTracker velocityTracker, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.VelocityTrackerCompat.Api34Impl.getAxisVelocity(velocityTracker, i, i2);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity(i2);
        }
        if (i == 1) {
            return velocityTracker.getYVelocity(i2);
        }
        return 0.0f;
    }

    public static void clear(android.view.VelocityTracker velocityTracker) {
        velocityTracker.clear();
        removeFallbackForTracker(velocityTracker);
    }

    public static void recycle(android.view.VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        removeFallbackForTracker(velocityTracker);
    }

    public static void computeCurrentVelocity(android.view.VelocityTracker velocityTracker, int i, float f) {
        velocityTracker.computeCurrentVelocity(i, f);
        androidx.core.view.VelocityTrackerFallback fallbackTrackerOrNull = getFallbackTrackerOrNull(velocityTracker);
        if (fallbackTrackerOrNull != null) {
            fallbackTrackerOrNull.computeCurrentVelocity(i, f);
        }
    }

    public static void computeCurrentVelocity(android.view.VelocityTracker velocityTracker, int i) {
        computeCurrentVelocity(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void addMovement(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (android.os.Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!sFallbackTrackers.containsKey(velocityTracker)) {
                sFallbackTrackers.put(velocityTracker, new androidx.core.view.VelocityTrackerFallback());
            }
            sFallbackTrackers.get(velocityTracker).addMovement(motionEvent);
        }
    }

    private static void removeFallbackForTracker(android.view.VelocityTracker velocityTracker) {
        sFallbackTrackers.remove(velocityTracker);
    }

    private static androidx.core.view.VelocityTrackerFallback getFallbackTrackerOrNull(android.view.VelocityTracker velocityTracker) {
        return sFallbackTrackers.get(velocityTracker);
    }

    private static class Api34Impl {
        private Api34Impl() {
        }

        static boolean isAxisSupported(android.view.VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }

        static float getAxisVelocity(android.view.VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        static float getAxisVelocity(android.view.VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    private VelocityTrackerCompat() {
    }
}
