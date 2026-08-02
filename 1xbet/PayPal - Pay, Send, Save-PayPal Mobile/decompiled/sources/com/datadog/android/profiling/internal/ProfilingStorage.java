package com.datadog.android.profiling.internal;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bH\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR$\u0010 \u001a\u0004\u0018\u00010\u00128\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%"}, d2 = {"Lcom/datadog/android/profiling/internal/ProfilingStorage;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "", "sdkInstanceName", "", "addProfilingFlag$dd_sdk_android_profiling_release", "(Landroid/content/Context;Ljava/lang/String;)V", "", "getProfilingEnabledInstanceNames$dd_sdk_android_profiling_release", "(Landroid/content/Context;)Ljava/util/Set;", "", "getSampleRate$dd_sdk_android_profiling_release", "(Landroid/content/Context;)F", "p0", "Lcom/datadog/android/internal/data/SharedPreferencesStorage;", "Camera2StreamConfigurationMap", "(Landroid/content/Context;)Lcom/datadog/android/internal/data/SharedPreferencesStorage;", "sdkInstanceNames", "removeProfilingFlag$dd_sdk_android_profiling_release", "(Landroid/content/Context;Ljava/util/Set;)V", "removeSampleRate$dd_sdk_android_profiling_release", "(Landroid/content/Context;)V", "sampleRate", "setSampleRate$dd_sdk_android_profiling_release", "(Landroid/content/Context;F)V", "KEY_PROFILING_ENABLED", "Ljava/lang/String;", "KEY_PROFILING_SAMPLE_RATE", "sharedPreferencesStorage", "Lcom/datadog/android/internal/data/SharedPreferencesStorage;", "getSharedPreferencesStorage$dd_sdk_android_profiling_release", "()Lcom/datadog/android/internal/data/SharedPreferencesStorage;", "setSharedPreferencesStorage$dd_sdk_android_profiling_release", "(Lcom/datadog/android/internal/data/SharedPreferencesStorage;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfilingStorage {
    public static final com.datadog.android.profiling.internal.ProfilingStorage INSTANCE = new com.datadog.android.profiling.internal.ProfilingStorage();
    public static final java.lang.String KEY_PROFILING_ENABLED = "dd_profiling_enabled";
    public static final java.lang.String KEY_PROFILING_SAMPLE_RATE = "dd_profiling_sample_rate";
    private static volatile com.datadog.android.internal.data.SharedPreferencesStorage sharedPreferencesStorage;

    private ProfilingStorage() {
    }

    public final com.datadog.android.internal.data.SharedPreferencesStorage getSharedPreferencesStorage$dd_sdk_android_profiling_release() {
        return sharedPreferencesStorage;
    }

    public final void setSharedPreferencesStorage$dd_sdk_android_profiling_release(com.datadog.android.internal.data.SharedPreferencesStorage sharedPreferencesStorage2) {
        sharedPreferencesStorage = sharedPreferencesStorage2;
    }

    public final void setSampleRate$dd_sdk_android_profiling_release(android.content.Context appContext, float sampleRate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        Camera2StreamConfigurationMap(appContext).putFloat(KEY_PROFILING_SAMPLE_RATE, sampleRate);
    }

    public final float getSampleRate$dd_sdk_android_profiling_release(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        return Camera2StreamConfigurationMap(appContext).getFloat(KEY_PROFILING_SAMPLE_RATE, -1.0f);
    }

    public final void removeSampleRate$dd_sdk_android_profiling_release(android.content.Context appContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        Camera2StreamConfigurationMap(appContext).remove(KEY_PROFILING_SAMPLE_RATE);
    }

    @kotlin.jvm.JvmStatic
    public static final void addProfilingFlag$dd_sdk_android_profiling_release(android.content.Context appContext, java.lang.String sdkInstanceName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceName, "");
        com.datadog.android.internal.data.SharedPreferencesStorage Camera2StreamConfigurationMap = INSTANCE.Camera2StreamConfigurationMap(appContext);
        synchronized (Camera2StreamConfigurationMap) {
            Camera2StreamConfigurationMap.putStringSet(KEY_PROFILING_ENABLED, kotlin.collections.SetsKt.plus(Camera2StreamConfigurationMap.getStringSet(KEY_PROFILING_ENABLED, kotlin.collections.SetsKt.emptySet()), sdkInstanceName));
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final java.util.Set<java.lang.String> getProfilingEnabledInstanceNames$dd_sdk_android_profiling_release(android.content.Context appContext) {
        java.util.Set<java.lang.String> stringSet$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        com.datadog.android.internal.data.SharedPreferencesStorage Camera2StreamConfigurationMap = INSTANCE.Camera2StreamConfigurationMap(appContext);
        synchronized (Camera2StreamConfigurationMap) {
            stringSet$default = com.datadog.android.internal.data.PreferencesStorage.DefaultImpls.getStringSet$default(Camera2StreamConfigurationMap, KEY_PROFILING_ENABLED, null, 2, null);
        }
        return stringSet$default;
    }

    @kotlin.jvm.JvmStatic
    public static final void removeProfilingFlag$dd_sdk_android_profiling_release(android.content.Context appContext, java.util.Set<java.lang.String> sdkInstanceNames) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkInstanceNames, "");
        com.datadog.android.internal.data.SharedPreferencesStorage Camera2StreamConfigurationMap = INSTANCE.Camera2StreamConfigurationMap(appContext);
        synchronized (Camera2StreamConfigurationMap) {
            java.util.Set<java.lang.String> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(com.datadog.android.internal.data.PreferencesStorage.DefaultImpls.getStringSet$default(Camera2StreamConfigurationMap, KEY_PROFILING_ENABLED, null, 2, null));
            if (mutableSet.removeAll(sdkInstanceNames)) {
                Camera2StreamConfigurationMap.putStringSet(KEY_PROFILING_ENABLED, mutableSet);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final com.datadog.android.internal.data.SharedPreferencesStorage Camera2StreamConfigurationMap(android.content.Context p0) {
        com.datadog.android.internal.data.SharedPreferencesStorage sharedPreferencesStorage2 = sharedPreferencesStorage;
        if (sharedPreferencesStorage2 != null) {
            return sharedPreferencesStorage2;
        }
        synchronized (this) {
            com.datadog.android.internal.data.SharedPreferencesStorage sharedPreferencesStorage3 = sharedPreferencesStorage;
            if (sharedPreferencesStorage3 != null) {
                return sharedPreferencesStorage3;
            }
            com.datadog.android.internal.data.SharedPreferencesStorage sharedPreferencesStorage4 = new com.datadog.android.internal.data.SharedPreferencesStorage(p0);
            sharedPreferencesStorage = sharedPreferencesStorage4;
            return sharedPreferencesStorage4;
        }
    }
}
