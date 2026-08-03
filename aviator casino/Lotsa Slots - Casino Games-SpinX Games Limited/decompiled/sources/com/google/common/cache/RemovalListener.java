package com.google.common.cache;

@com.google.common.cache.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
public interface RemovalListener<K, V> {
    void onRemoval(com.google.common.cache.RemovalNotification<K, V> notification);
}
