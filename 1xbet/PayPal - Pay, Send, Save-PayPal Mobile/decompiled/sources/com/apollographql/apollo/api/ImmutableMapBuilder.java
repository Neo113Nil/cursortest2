package com.apollographql.apollo.api;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00028\u0001¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/apollographql/apollo/api/ImmutableMapBuilder;", "K", "V", "", "<init>", "()V", "key", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "put", "(Ljava/lang/Object;Ljava/lang/Object;)Lcom/apollographql/apollo/api/ImmutableMapBuilder;", "", "build", "()Ljava/util/Map;", "", "getHighSpeedVideoSizes", "Ljava/util/Map;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ImmutableMapBuilder<K, V> {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.Map<K, V> getHighSpeedVideoFpsRangesFor = new java.util.LinkedHashMap();

    public final com.apollographql.apollo.api.ImmutableMapBuilder<K, V> put(K key, V value) {
        this.getHighSpeedVideoFpsRangesFor.put(key, value);
        return this;
    }

    public final java.util.Map<K, V> build() {
        return this.getHighSpeedVideoFpsRangesFor;
    }
}
