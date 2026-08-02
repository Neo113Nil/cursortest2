package com.google.common.cache;

/* loaded from: classes9.dex */
public interface Weigher<K, V> {
    int weigh(K k, V v);
}
