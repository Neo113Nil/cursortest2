package io.reactivex.observables;

/* loaded from: classes3.dex */
public abstract class GroupedObservable<K, T> extends io.reactivex.Observable<T> {
    final K Camera2StreamConfigurationMap;

    public GroupedObservable(K k) {
        this.Camera2StreamConfigurationMap = k;
    }

    public K getKey() {
        return this.Camera2StreamConfigurationMap;
    }
}
