package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u0000 \u0017*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0017B\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/CacheUtils;", "", "K", "V", "Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "invocationUtils", "<init>", "(Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;)V", "Landroidx/collection/LruCache;", "p0", "", "Camera2StreamConfigurationMap", "(Landroidx/collection/LruCache;)V", "", "level", com.datadog.trace.api.DDSpanTypes.CACHE, "handleTrimMemory$dd_sdk_android_session_replay_release", "(ILandroidx/collection/LruCache;)V", "p1", "getHighSpeedVideoFpsRangesFor", "(Landroidx/collection/LruCache;I)V", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class CacheUtils<K, V> {
    private static final com.datadog.android.sessionreplay.internal.utils.CacheUtils.Companion Companion = new com.datadog.android.sessionreplay.internal.utils.CacheUtils.Companion(null);
    private final com.datadog.android.sessionreplay.internal.utils.InvocationUtils getHighSpeedVideoSizes;

    public CacheUtils(com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invocationUtils, "");
        this.getHighSpeedVideoSizes = invocationUtils;
    }

    public /* synthetic */ CacheUtils(com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.sessionreplay.internal.utils.InvocationUtils() : invocationUtils);
    }

    public final void handleTrimMemory$dd_sdk_android_session_replay_release(int level, androidx.collection.LruCache<K, V> cache) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cache, "");
        int maxSize = cache.maxSize() / 2;
        int maxSize2 = (cache.maxSize() / 4) * 3;
        if (level == 5) {
            getHighSpeedVideoFpsRangesFor(cache, maxSize2);
            return;
        }
        if (level == 10) {
            getHighSpeedVideoFpsRangesFor(cache, maxSize);
            return;
        }
        if (level == 15) {
            Camera2StreamConfigurationMap(cache);
            return;
        }
        if (level != 20) {
            if (level == 40) {
                Camera2StreamConfigurationMap(cache);
                return;
            }
            if (level == 60) {
                getHighSpeedVideoFpsRangesFor(cache, maxSize2);
            } else if (level == 80) {
                Camera2StreamConfigurationMap(cache);
            } else {
                Camera2StreamConfigurationMap(cache);
            }
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/CacheUtils$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private static void Camera2StreamConfigurationMap(androidx.collection.LruCache<K, V> p0) {
        com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
        com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
        try {
            p0.evictAll();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("Failed to evict cache entries"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }

    private static void getHighSpeedVideoFpsRangesFor(androidx.collection.LruCache<K, V> p0, int p1) {
        com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
        com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
        try {
            p0.trimToSize(p1);
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("Failed to trim cache to size"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CacheUtils() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
