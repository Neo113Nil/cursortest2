package androidx.vectordrawable.graphics.drawable;

/* loaded from: classes7.dex */
public class AnimationUtilsCompat {
    public static android.view.animation.Interpolator loadInterpolator(android.content.Context context, int i) throws android.content.res.Resources.NotFoundException {
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(context, i);
        androidx.core.util.ObjectsCompat.requireNonNull(loadInterpolator, "Failed to parse interpolator, no start tag found");
        return loadInterpolator;
    }

    private AnimationUtilsCompat() {
    }
}
