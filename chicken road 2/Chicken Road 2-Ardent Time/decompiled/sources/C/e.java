package C;

/* loaded from: classes.dex */
public abstract class e {
    public static android.widget.EdgeEffect a(android.content.Context context, android.util.AttributeSet attributeSet) {
        try {
            return new android.widget.EdgeEffect(context, attributeSet);
        } catch (java.lang.Throwable unused) {
            return new android.widget.EdgeEffect(context);
        }
    }

    public static float b(android.widget.EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (java.lang.Throwable unused) {
            return 0.0f;
        }
    }

    public static float c(android.widget.EdgeEffect edgeEffect, float f2, float f3) {
        try {
            return edgeEffect.onPullDistance(f2, f3);
        } catch (java.lang.Throwable unused) {
            edgeEffect.onPull(f2, f3);
            return 0.0f;
        }
    }
}
