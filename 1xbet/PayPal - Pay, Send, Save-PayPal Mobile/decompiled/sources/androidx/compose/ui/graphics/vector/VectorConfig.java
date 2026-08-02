package androidx.compose.ui.graphics.vector;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J+\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/graphics/vector/VectorConfig;", "", "T", "Landroidx/compose/ui/graphics/vector/VectorProperty;", "property", "defaultValue", "getOrDefault", "(Landroidx/compose/ui/graphics/vector/VectorProperty;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface VectorConfig {
    default <T> T getOrDefault(androidx.compose.ui.graphics.vector.VectorProperty<T> property, T defaultValue) {
        return defaultValue;
    }

    @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static <T> T getOrDefault(androidx.compose.ui.graphics.vector.VectorConfig vectorConfig, androidx.compose.ui.graphics.vector.VectorProperty<T> vectorProperty, T t) {
            return (T) androidx.compose.ui.graphics.vector.VectorConfig.super.getOrDefault(vectorProperty, t);
        }
    }
}
