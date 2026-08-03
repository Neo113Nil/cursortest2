package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
interface FilteredSetMultimap<K, V> extends com.google.common.collect.FilteredMultimap<K, V>, com.google.common.collect.SetMultimap<K, V> {
    @Override // com.google.common.collect.FilteredMultimap
    com.google.common.collect.SetMultimap<K, V> unfiltered();

    /* renamed from: com.google.common.collect.FilteredSetMultimap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
    }
}
