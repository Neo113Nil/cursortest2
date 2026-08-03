package y;

/* renamed from: y.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1023k {
    public static float a(android.view.VelocityTracker velocityTracker, int i2) {
        return velocityTracker.getAxisVelocity(i2);
    }

    public static float b(android.view.VelocityTracker velocityTracker, int i2, int i3) {
        return velocityTracker.getAxisVelocity(i2, i3);
    }

    public static boolean c(android.view.VelocityTracker velocityTracker, int i2) {
        return velocityTracker.isAxisSupported(i2);
    }
}
