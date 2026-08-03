package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.2M, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C2M<K, V> extends com.facebook.ads.redexgen.core.C2L<K, V>.AsMap implements java.util.SortedMap<K, java.util.Collection<V>> {

    @javax.annotation.CheckForNull
    public java.util.SortedSet<K> A00;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A01;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.SortedMap, java.util.Map
    /* renamed from: A0D, reason: merged with bridge method [inline-methods] */
    public java.util.SortedSet<K> keySet() {
        java.util.SortedSet<K> sortedSet = this.A00;
        if (sortedSet != null) {
            return sortedSet;
        }
        java.util.SortedSet<K> A0C = A0C();
        this.A00 = A0C;
        return A0C;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    public C2M(final com.facebook.ads.redexgen.core.C2L this$0, java.util.SortedMap<K, java.util.Collection<V>> submap) {
        super(this$0, submap);
        this.A01 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    public java.util.SortedMap<K, java.util.Collection<V>> A0B() {
        return (java.util.SortedMap) this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    public java.util.SortedSet<K> A0C() {
        return new com.facebook.ads.redexgen.core.AnonymousClass18(this.A01, A0B());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    @javax.annotation.CheckForNull
    public final java.util.Comparator<? super K> comparator() {
        return A0B().comparator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public final K firstKey() {
        return A0B().firstKey();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    public java.util.SortedMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K toKey) {
        return new com.facebook.ads.redexgen.core.C2M(this.A01, A0B().headMap(toKey));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    @com.google.common.collect.ParametricNullness
    public final K lastKey() {
        return A0B().lastKey();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    public java.util.SortedMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
        return new com.facebook.ads.redexgen.core.C2M(this.A01, A0B().subMap(fromKey, toKey));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2M != com.google.common.collect.AbstractMapBasedMultimap<K, V>$SortedAsMap */
    @Override // java.util.SortedMap
    public java.util.SortedMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
        return new com.facebook.ads.redexgen.core.C2M(this.A01, A0B().tailMap(fromKey));
    }
}
