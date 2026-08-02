package com.zettle.sdk.feature.taptopay.core.configuration;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCachingImpl;", "Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;", "<init>", "()V", "T", "", "organizationId", "key", "get", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "has", "(Ljava/lang/String;Ljava/lang/String;)Z", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "save", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Landroid/util/LruCache;", "Camera2StreamConfigurationMap", "Landroid/util/LruCache;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class RunTimeCachingImpl implements com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching {
    public static final com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCachingImpl INSTANCE = new com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCachingImpl();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final android.util.LruCache<java.lang.String, java.lang.Object> getHighResolutionOutputSizeshNQ4ISI = new android.util.LruCache<>(102400);

    private RunTimeCachingImpl() {
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching
    public final void save(java.lang.String organizationId, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        android.util.LruCache<java.lang.String, java.lang.Object> lruCache = getHighResolutionOutputSizeshNQ4ISI;
        synchronized (lruCache) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(organizationId);
            sb.append(key);
            lruCache.put(sb.toString(), value);
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching
    public final <T> T get(java.lang.String organizationId, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.util.LruCache<java.lang.String, java.lang.Object> lruCache = getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(organizationId);
        sb.append(key);
        return (T) lruCache.get(sb.toString());
    }

    @Override // com.zettle.sdk.feature.taptopay.core.configuration.RunTimeCaching
    public final boolean has(java.lang.String organizationId, java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(organizationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        android.util.LruCache<java.lang.String, java.lang.Object> lruCache = getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(organizationId);
        sb.append(key);
        return lruCache.get(sb.toString()) != null;
    }
}
