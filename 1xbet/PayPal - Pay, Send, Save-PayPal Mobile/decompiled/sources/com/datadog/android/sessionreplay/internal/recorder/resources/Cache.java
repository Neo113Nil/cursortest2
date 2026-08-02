package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b`\u0018\u0000 \u0011*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001:\u0001\u0011J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0007\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/Cache;", "", "K", "V", "", "clear", "()V", "key", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)V", "(Ljava/lang/Object;)V", "", io.ktor.http.ContentDisposition.Parameters.Size, "()I", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface Cache<K, V> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.recorder.resources.Cache.Companion INSTANCE = com.datadog.android.sessionreplay.internal.recorder.resources.Cache.Companion.getHighResolutionOutputSizeshNQ4ISI;
    public static final java.lang.String DOES_NOT_IMPLEMENT_COMPONENTCALLBACKS = "Cache instance does not implement ComponentCallbacks2";

    void clear();

    V get(K key);

    void put(V value);

    void put(K key, V value);

    int size();

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/Cache$Companion;", "", "<init>", "()V", "", "DOES_NOT_IMPLEMENT_COMPONENTCALLBACKS", "Ljava/lang/String;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static final java.lang.String DOES_NOT_IMPLEMENT_COMPONENTCALLBACKS = "Cache instance does not implement ComponentCallbacks2";
        static final /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.resources.Cache.Companion getHighResolutionOutputSizeshNQ4ISI = new com.datadog.android.sessionreplay.internal.recorder.resources.Cache.Companion();

        private Companion() {
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class DefaultImpls {
        public static <K, V> void put(com.datadog.android.sessionreplay.internal.recorder.resources.Cache<K, V> cache, K k, V v) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
        }

        public static <K, V> void put(com.datadog.android.sessionreplay.internal.recorder.resources.Cache<K, V> cache, V v) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(v, "");
        }

        public static <K, V> V get(com.datadog.android.sessionreplay.internal.recorder.resources.Cache<K, V> cache, K k) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(k, "");
            return null;
        }
    }
}
