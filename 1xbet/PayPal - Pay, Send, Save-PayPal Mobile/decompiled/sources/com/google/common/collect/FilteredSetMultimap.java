package com.google.common.collect;

/* loaded from: classes9.dex */
interface FilteredSetMultimap<K, V> extends com.google.common.collect.FilteredMultimap<K, V>, com.google.common.collect.SetMultimap<K, V> {
    @Override // com.google.common.collect.FilteredMultimap
    com.google.common.collect.SetMultimap<K, V> unfiltered();
}
