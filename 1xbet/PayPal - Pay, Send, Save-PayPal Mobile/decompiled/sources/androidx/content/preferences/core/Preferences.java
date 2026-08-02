package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001:\u0002\u0014\u0015B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\b\u0010\tJ&\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H¦\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u0004\u0012\u00020\u00010\fH&¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/datastore/preferences/core/Preferences;", "", "<init>", "()V", "T", "Landroidx/datastore/preferences/core/Preferences$Key;", "key", "", "contains", "(Landroidx/datastore/preferences/core/Preferences$Key;)Z", "get", "(Landroidx/datastore/preferences/core/Preferences$Key;)Ljava/lang/Object;", "", "asMap", "()Ljava/util/Map;", "Landroidx/datastore/preferences/core/MutablePreferences;", "toMutablePreferences", "()Landroidx/datastore/preferences/core/MutablePreferences;", "toPreferences", "()Landroidx/datastore/preferences/core/Preferences;", "Key", "Pair"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class Preferences {
    public abstract java.util.Map<androidx.datastore.preferences.core.Preferences.Key<?>, java.lang.Object> asMap();

    public abstract <T> boolean contains(androidx.datastore.preferences.core.Preferences.Key<T> key);

    public abstract <T> T get(androidx.datastore.preferences.core.Preferences.Key<T> key);

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0086\u0004¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Key;", "T", "", "", "name", "<init>", "(Ljava/lang/String;)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Landroidx/datastore/preferences/core/Preferences$Pair;", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "(Ljava/lang/Object;)Landroidx/datastore/preferences/core/Preferences$Pair;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "getName"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Key<T> {
        private final java.lang.String name;

        public Key(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.name = str;
        }

        public final java.lang.String getName() {
            return this.name;
        }

        public final androidx.datastore.preferences.core.Preferences.Pair<T> to(T value) {
            return new androidx.datastore.preferences.core.Preferences.Pair<>(this, value);
        }

        public final boolean equals(java.lang.Object other) {
            if (other instanceof androidx.datastore.preferences.core.Preferences.Key) {
                return kotlin.jvm.internal.Intrinsics.areEqual(this.name, ((androidx.datastore.preferences.core.Preferences.Key) other).name);
            }
            return false;
        }

        public final int hashCode() {
            return this.name.hashCode();
        }

        public final java.lang.String toString() {
            return this.name;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0005\u001a\u00028\u0000¢\u0006\u0004\b\u0006\u0010\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00028\u00008\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/datastore/preferences/core/Preferences$Pair;", "T", "", "Landroidx/datastore/preferences/core/Preferences$Key;", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "<init>", "(Landroidx/datastore/preferences/core/Preferences$Key;Ljava/lang/Object;)V", "Landroidx/datastore/preferences/core/Preferences$Key;", "getKey$datastore_preferences_core", "()Landroidx/datastore/preferences/core/Preferences$Key;", "Ljava/lang/Object;", "getValue$datastore_preferences_core", "()Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Pair<T> {
        private final androidx.datastore.preferences.core.Preferences.Key<T> key;
        private final T value;

        public Pair(androidx.datastore.preferences.core.Preferences.Key<T> key, T t) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
            this.key = key;
            this.value = t;
        }

        public final androidx.datastore.preferences.core.Preferences.Key<T> getKey$datastore_preferences_core() {
            return this.key;
        }

        public final T getValue$datastore_preferences_core() {
            return this.value;
        }
    }

    public final androidx.content.preferences.core.MutablePreferences toMutablePreferences() {
        return new androidx.content.preferences.core.MutablePreferences(kotlin.collections.MapsKt.toMutableMap(asMap()), false);
    }

    public final androidx.content.preferences.core.Preferences toPreferences() {
        return new androidx.content.preferences.core.MutablePreferences(kotlin.collections.MapsKt.toMutableMap(asMap()), true);
    }
}
