package com.google.common.cache;

@ElementTypesAreNonnullByDefault
/* loaded from: classes8.dex */
public interface RemovalListener<K, V> {
    void onRemoval(RemovalNotification<K, V> notification);
}
