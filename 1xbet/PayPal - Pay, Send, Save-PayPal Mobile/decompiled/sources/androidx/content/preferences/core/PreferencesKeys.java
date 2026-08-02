package androidx.content.preferences.core;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0012\n\u0000\u001a\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\u0005\u001a\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\n\u0010\u0005\u001a\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u0005\u001a\u001b\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0005\u001a!\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u000f0\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0005\u001a\u001b\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0005"}, d2 = {"", "name", "Landroidx/datastore/preferences/core/Preferences$Key;", "", "intKey", "(Ljava/lang/String;)Landroidx/datastore/preferences/core/Preferences$Key;", "", "doubleKey", "stringKey", "", "booleanKey", "", "floatKey", "", "longKey", "", "stringSetKey", "", "byteArrayKey"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PreferencesKeys {
    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Integer> intKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Double> doubleKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.String> stringKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Boolean> booleanKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Float> floatKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.lang.Long> longKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<java.util.Set<java.lang.String>> stringSetKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }

    public static final androidx.datastore.preferences.core.Preferences.Key<byte[]> byteArrayKey(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return new androidx.datastore.preferences.core.Preferences.Key<>(str);
    }
}
