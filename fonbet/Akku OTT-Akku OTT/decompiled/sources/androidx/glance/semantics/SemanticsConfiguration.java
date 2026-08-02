package androidx.glance.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\"\u0010\u0007\u001a\u0002H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005H\u0086\u0002¢\u0006\u0002\u0010\nJ1\u0010\u000b\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00052\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\b0\r¢\u0006\u0002\u0010\u000eJ!\u0010\u000f\u001a\u0004\u0018\u0001H\b\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u0005¢\u0006\u0002\u0010\nJ*\u0010\u0010\u001a\u00020\u0011\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00052\u0006\u0010\u0012\u001a\u0002H\bH\u0096\u0002¢\u0006\u0002\u0010\u0013R \u0010\u0003\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/glance/semantics/SemanticsConfiguration;", "Landroidx/glance/semantics/SemanticsPropertyReceiver;", "()V", "props", "", "Landroidx/glance/semantics/SemanticsPropertyKey;", "", "get", ExifInterface.GPS_DIRECTION_TRUE, Constants.KEY, "(Landroidx/glance/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "getOrElseNullable", "defaultValue", "Lkotlin/Function0;", "(Landroidx/glance/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getOrNull", "set", "", "value", "(Landroidx/glance/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SemanticsConfiguration implements SemanticsPropertyReceiver {
    public static final int $stable = 8;
    private final Map<SemanticsPropertyKey<?>, Object> props = new LinkedHashMap();

    public final <T> T get(SemanticsPropertyKey<T> key) {
        T t = (T) this.props.get(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key);
    }

    public final <T> T getOrElseNullable(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t = (T) this.props.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    public final <T> T getOrNull(SemanticsPropertyKey<T> key) {
        return (T) getOrElseNullable(key, new Function0<T>() { // from class: androidx.glance.semantics.SemanticsConfiguration$getOrNull$1
            @Override // kotlin.jvm.functions.Function0
            public final T invoke() {
                return null;
            }
        });
    }

    @Override // androidx.glance.semantics.SemanticsPropertyReceiver
    public <T> void set(SemanticsPropertyKey<T> key, T value) {
        this.props.put(key, value);
    }
}
