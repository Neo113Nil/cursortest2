package io.reactivex.flowables;

/* loaded from: classes3.dex */
public abstract class GroupedFlowable<K, T> extends io.reactivex.Flowable<T> {
    final K Camera2StreamConfigurationMap;

    public GroupedFlowable(K k) {
        this.Camera2StreamConfigurationMap = k;
    }

    public K getKey() {
        return this.Camera2StreamConfigurationMap;
    }
}
