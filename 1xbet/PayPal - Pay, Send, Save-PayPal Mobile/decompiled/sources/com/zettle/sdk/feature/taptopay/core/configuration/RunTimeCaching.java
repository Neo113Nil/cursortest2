package com.zettle.sdk.feature.taptopay.core.configuration;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J'\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H&¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0001H&¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/configuration/RunTimeCaching;", "", "T", "", "organizationId", "key", "get", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "", "has", "(Ljava/lang/String;Ljava/lang/String;)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "save", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface RunTimeCaching {
    <T> T get(java.lang.String organizationId, java.lang.String key);

    boolean has(java.lang.String organizationId, java.lang.String key);

    void save(java.lang.String organizationId, java.lang.String key, java.lang.Object value);
}
