package androidx.transition;

/* loaded from: classes7.dex */
class PropertyValuesHolderUtils {
    static android.animation.PropertyValuesHolder getHighSpeedVideoFpsRangesFor(android.util.Property<?, android.graphics.PointF> property, android.graphics.Path path) {
        return androidx.transition.PropertyValuesHolderUtils.Api21Impl.getHighSpeedVideoSizes(property, path);
    }

    private PropertyValuesHolderUtils() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static <V> android.animation.PropertyValuesHolder getHighSpeedVideoSizes(android.util.Property<?, V> property, android.graphics.Path path) {
            return android.animation.PropertyValuesHolder.ofObject(property, (android.animation.TypeConverter) null, path);
        }
    }
}
