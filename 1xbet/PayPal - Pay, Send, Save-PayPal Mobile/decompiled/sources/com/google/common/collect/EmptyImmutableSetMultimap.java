package com.google.common.collect;

/* loaded from: classes9.dex */
final class EmptyImmutableSetMultimap extends com.google.common.collect.ImmutableSetMultimap<java.lang.Object, java.lang.Object> {
    static final com.google.common.collect.EmptyImmutableSetMultimap INSTANCE = new com.google.common.collect.EmptyImmutableSetMultimap();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final /* bridge */ /* synthetic */ java.util.Map asMap() {
        return asMap();
    }

    private EmptyImmutableSetMultimap() {
        super(com.google.common.collect.ImmutableMap.of(), 0, null);
    }

    @Override // com.google.common.collect.ImmutableMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public final com.google.common.collect.ImmutableMap<java.lang.Object, java.util.Collection<java.lang.Object>> asMap() {
        return super.asMap();
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }
}
