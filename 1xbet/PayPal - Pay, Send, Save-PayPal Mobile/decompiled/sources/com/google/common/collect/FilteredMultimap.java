package com.google.common.collect;

/* loaded from: classes9.dex */
interface FilteredMultimap<K, V> extends com.google.common.collect.Multimap<K, V> {
    com.google.common.base.Predicate<? super java.util.Map.Entry<K, V>> entryPredicate();

    com.google.common.collect.Multimap<K, V> unfiltered();
}
