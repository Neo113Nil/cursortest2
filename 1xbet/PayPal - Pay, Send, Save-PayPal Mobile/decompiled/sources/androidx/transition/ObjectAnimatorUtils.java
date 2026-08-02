package androidx.transition;

/* loaded from: classes3.dex */
class ObjectAnimatorUtils {
    static <T> android.animation.ObjectAnimator Camera2StreamConfigurationMap(T t, android.util.Property<T, android.graphics.PointF> property, android.graphics.Path path) {
        return androidx.transition.ObjectAnimatorUtils.Api21Impl.Camera2StreamConfigurationMap(t, property, path);
    }

    private ObjectAnimatorUtils() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static <T, V> android.animation.ObjectAnimator Camera2StreamConfigurationMap(T t, android.util.Property<T, V> property, android.graphics.Path path) {
            return android.animation.ObjectAnimator.ofObject(t, property, (android.animation.TypeConverter) null, path);
        }
    }
}
