package com.datadog.android.internal.data;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000f\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\t\u0010\nJ!\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010J%\u0010\u0011\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000bH&¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u000eH&¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H&¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H&¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b!\u0010\""}, d2 = {"Lcom/datadog/android/internal/data/PreferencesStorage;", "", "", "clear", "()V", "", "key", "", "defaultValue", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getFloat", "(Ljava/lang/String;F)F", "", "getInt", "(Ljava/lang/String;I)I", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "putBoolean", "(Ljava/lang/String;Z)V", "putFloat", "(Ljava/lang/String;F)V", "putInt", "(Ljava/lang/String;I)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "putStringSet", "(Ljava/lang/String;Ljava/util/Set;)V", "remove", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface PreferencesStorage {
    void clear();

    boolean getBoolean(java.lang.String key, boolean defaultValue);

    float getFloat(java.lang.String key, float defaultValue);

    int getInt(java.lang.String key, int defaultValue);

    java.lang.String getString(java.lang.String key, java.lang.String defaultValue);

    java.util.Set<java.lang.String> getStringSet(java.lang.String key, java.util.Set<java.lang.String> defaultValue);

    void putBoolean(java.lang.String key, boolean value);

    void putFloat(java.lang.String key, float value);

    void putInt(java.lang.String key, int value);

    void putString(java.lang.String key, java.lang.String value);

    void putStringSet(java.lang.String key, java.util.Set<java.lang.String> value);

    void remove(java.lang.String key);

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ float getFloat$default(com.datadog.android.internal.data.PreferencesStorage preferencesStorage, java.lang.String str, float f, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloat");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            return preferencesStorage.getFloat(str, f);
        }

        public static /* synthetic */ int getInt$default(com.datadog.android.internal.data.PreferencesStorage preferencesStorage, java.lang.String str, int i, int i2, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return preferencesStorage.getInt(str, i);
        }

        public static /* synthetic */ java.lang.String getString$default(com.datadog.android.internal.data.PreferencesStorage preferencesStorage, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return preferencesStorage.getString(str, str2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ java.util.Set getStringSet$default(com.datadog.android.internal.data.PreferencesStorage preferencesStorage, java.lang.String str, java.util.Set set, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStringSet");
            }
            if ((i & 2) != 0) {
                set = kotlin.collections.SetsKt.emptySet();
            }
            return preferencesStorage.getStringSet(str, set);
        }

        public static /* synthetic */ boolean getBoolean$default(com.datadog.android.internal.data.PreferencesStorage preferencesStorage, java.lang.String str, boolean z, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return preferencesStorage.getBoolean(str, z);
        }
    }
}
