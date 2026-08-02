package com.datadog.android.internal.data;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u001f\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ%\u0010 \u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lcom/datadog/android/internal/data/NoOpPreferencesStorage;", "Lcom/datadog/android/internal/data/PreferencesStorage;", "<init>", "()V", "", "clear", "", "key", "", "defaultValue", "getBoolean", "(Ljava/lang/String;Z)Z", "", "getFloat", "(Ljava/lang/String;F)F", "", "getInt", "(Ljava/lang/String;I)I", "getString", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "getStringSet", "(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "putBoolean", "(Ljava/lang/String;Z)V", "putFloat", "(Ljava/lang/String;F)V", "putInt", "(Ljava/lang/String;I)V", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "putStringSet", "(Ljava/lang/String;Ljava/util/Set;)V", "remove", "(Ljava/lang/String;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NoOpPreferencesStorage implements com.datadog.android.internal.data.PreferencesStorage {
    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void clear() {
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final java.util.Set<java.lang.String> getStringSet(java.lang.String key, java.util.Set<java.lang.String> defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultValue, "");
        return kotlin.collections.SetsKt.emptySet();
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void remove(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void putStringSet(java.lang.String key, java.util.Set<java.lang.String> value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void putString(java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void putInt(java.lang.String key, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void putFloat(java.lang.String key, float value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final void putBoolean(java.lang.String key, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final java.lang.String getString(java.lang.String key, java.lang.String defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return null;
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final int getInt(java.lang.String key, int defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return 0;
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final float getFloat(java.lang.String key, float defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return 0.0f;
    }

    @Override // com.datadog.android.internal.data.PreferencesStorage
    public final boolean getBoolean(java.lang.String key, boolean defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        return false;
    }
}
