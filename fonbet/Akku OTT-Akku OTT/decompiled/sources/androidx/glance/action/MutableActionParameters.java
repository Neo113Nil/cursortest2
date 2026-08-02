package androidx.glance.action;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.glance.action.ActionParameters;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B%\b\u0000\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006J\u001c\u0010\t\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\nH\u0016J\u0006\u0010\u000b\u001a\u00020\fJ!\u0010\r\u001a\u00020\u000e\"\b\b\u0000\u0010\u000f*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0096\u0002J\u0013\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u0096\u0002J(\u0010\u0013\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004H\u0096\u0002¢\u0006\u0002\u0010\u0014J-\u0010\u0015\u001a\u0002H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\u0006\u0010\u0016\u001a\u0002H\u000fH\u0016¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u000eH\u0016J%\u0010\u001b\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0004¢\u0006\u0002\u0010\u0014J2\u0010\u001c\u001a\u0004\u0018\u0001H\u000f\"\b\b\u0000\u0010\u000f*\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u00042\b\u0010\u001d\u001a\u0004\u0018\u0001H\u000fH\u0086\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u001e\u001a\u00020\u001fH\u0016R(\u0010\u0002\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00050\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006 "}, d2 = {"Landroidx/glance/action/MutableActionParameters;", "Landroidx/glance/action/ActionParameters;", "map", "", "Landroidx/glance/action/ActionParameters$Key;", "", "(Ljava/util/Map;)V", "getMap$glance_release", "()Ljava/util/Map;", "asMap", "", "clear", "", "contains", "", ExifInterface.GPS_DIRECTION_TRUE, Constants.KEY, "equals", "other", "get", "(Landroidx/glance/action/ActionParameters$Key;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Landroidx/glance/action/ActionParameters$Key;Ljava/lang/Object;)Ljava/lang/Object;", "hashCode", "", "isEmpty", "remove", "set", "value", "toString", "", "glance_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MutableActionParameters extends ActionParameters {
    public static final int $stable = 8;
    private final Map<ActionParameters.Key<? extends Object>, Object> map;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableActionParameters() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // androidx.glance.action.ActionParameters
    public Map<ActionParameters.Key<? extends Object>, Object> asMap() {
        return Collections.unmodifiableMap(this.map);
    }

    public final void clear() {
        this.map.clear();
    }

    @Override // androidx.glance.action.ActionParameters
    public <T> boolean contains(ActionParameters.Key<T> key) {
        return this.map.containsKey(key);
    }

    public boolean equals(Object other) {
        return (other instanceof MutableActionParameters) && Intrinsics.areEqual(this.map, ((MutableActionParameters) other).map);
    }

    @Override // androidx.glance.action.ActionParameters
    public <T> T get(ActionParameters.Key<T> key) {
        return (T) this.map.get(key);
    }

    public final Map<ActionParameters.Key<? extends Object>, Object> getMap$glance_release() {
        return this.map;
    }

    @Override // androidx.glance.action.ActionParameters
    public <T> T getOrDefault(ActionParameters.Key<T> key, T defaultValue) {
        T t = (T) get(key);
        return t == null ? defaultValue : t;
    }

    public int hashCode() {
        return this.map.hashCode();
    }

    @Override // androidx.glance.action.ActionParameters
    public boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final <T> T remove(ActionParameters.Key<T> key) {
        return (T) this.map.remove(key);
    }

    public final <T> T set(ActionParameters.Key<T> key, T value) {
        T t = (T) get(key);
        if (value == null) {
            remove(key);
            return t;
        }
        this.map.put(key, value);
        return t;
    }

    public String toString() {
        return this.map.toString();
    }

    public /* synthetic */ MutableActionParameters(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new LinkedHashMap() : map);
    }

    public MutableActionParameters(Map<ActionParameters.Key<? extends Object>, Object> map) {
        this.map = map;
    }
}
