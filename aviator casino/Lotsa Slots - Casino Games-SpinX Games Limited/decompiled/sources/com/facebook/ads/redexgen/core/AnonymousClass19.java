package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.19, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class AnonymousClass19<K, V> extends com.facebook.ads.redexgen.core.C2L<K, V>.SortedAsMap implements java.util.NavigableMap<K, java.util.Collection<V>> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @javax.annotation.CheckForNull
    private final java.util.Map.Entry<K, java.util.Collection<V>> A01(java.util.Iterator<java.util.Map.Entry<K, java.util.Collection<V>>> entryIterator) {
        if (!entryIterator.hasNext()) {
            return null;
        }
        java.util.Map.Entry<K, java.util.Collection<V>> next = entryIterator.next();
        java.util.Collection<V> A0D = this.A00.A0D();
        A0D.addAll(next.getValue());
        entryIterator.remove();
        return com.facebook.ads.redexgen.core.AbstractC2166po.A01(next.getKey(), this.A00.A0G(A0D));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry(@com.google.common.collect.ParametricNullness K key) {
        java.util.Map.Entry<K, java.util.Collection<V>> ceilingEntry = A0B().ceilingEntry(key);
        if (ceilingEntry == null) {
            return null;
        }
        return A0A(ceilingEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> firstEntry() {
        java.util.Map.Entry<K, java.util.Collection<V>> firstEntry = A0B().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return A0A(firstEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> floorEntry(@com.google.common.collect.ParametricNullness K key) {
        java.util.Map.Entry<K, java.util.Collection<V>> floorEntry = A0B().floorEntry(key);
        if (floorEntry == null) {
            return null;
        }
        return A0A(floorEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> higherEntry(@com.google.common.collect.ParametricNullness K key) {
        java.util.Map.Entry<K, java.util.Collection<V>> higherEntry = A0B().higherEntry(key);
        if (higherEntry == null) {
            return null;
        }
        return A0A(higherEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> lastEntry() {
        java.util.Map.Entry<K, java.util.Collection<V>> lastEntry = A0B().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return A0A(lastEntry);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry(@com.google.common.collect.ParametricNullness K key) {
        java.util.Map.Entry<K, java.util.Collection<V>> lowerEntry = A0B().lowerEntry(key);
        if (lowerEntry == null) {
            return null;
        }
        return A0A(lowerEntry);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    public AnonymousClass19(final com.facebook.ads.redexgen.core.C2L this$0, java.util.NavigableMap<K, java.util.Collection<V>> submap) {
        super(this$0, submap);
        this.A00 = this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableSet<K> A0C() {
        return new com.facebook.ads.redexgen.core.C0u(this.A00, A0B());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap<K, java.util.Collection<V>> A0B() {
        return (java.util.NavigableMap) super.A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K toKey) {
        return headMap(toKey, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K fromKey) {
        return tailMap(fromKey, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap, java.util.SortedMap
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final java.util.NavigableMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness K toKey) {
        return subMap(fromKey, true, toKey, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.SortedMap, java.util.Map
    /* renamed from: A06, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final java.util.NavigableSet<K> keySet() {
        return (java.util.NavigableSet) super.keySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final K ceilingKey(@com.google.common.collect.ParametricNullness K key) {
        return A0B().ceilingKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final java.util.NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final java.util.NavigableMap<K, java.util.Collection<V>> descendingMap() {
        return new com.facebook.ads.redexgen.core.AnonymousClass19(this.A00, A0B().descendingMap());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final K floorKey(@com.google.common.collect.ParametricNullness K key) {
        return A0B().floorKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final java.util.NavigableMap<K, java.util.Collection<V>> headMap(@com.google.common.collect.ParametricNullness K toKey, boolean inclusive) {
        return new com.facebook.ads.redexgen.core.AnonymousClass19(this.A00, A0B().headMap(toKey, inclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final K higherKey(@com.google.common.collect.ParametricNullness K key) {
        return A0B().higherKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final K lowerKey(@com.google.common.collect.ParametricNullness K key) {
        return A0B().lowerKey(key);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final java.util.NavigableSet<K> navigableKeySet() {
        return keySet();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> pollFirstEntry() {
        return A01(entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    @javax.annotation.CheckForNull
    public final java.util.Map.Entry<K, java.util.Collection<V>> pollLastEntry() {
        return A01(descendingMap().entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final java.util.NavigableMap<K, java.util.Collection<V>> subMap(@com.google.common.collect.ParametricNullness K fromKey, @com.google.common.collect.ParametricNullness boolean fromInclusive, K toKey, boolean toInclusive) {
        return new com.facebook.ads.redexgen.core.AnonymousClass19(this.A00, A0B().subMap(fromKey, fromInclusive, toKey, toInclusive));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.19 != com.google.common.collect.AbstractMapBasedMultimap<K, V>$NavigableAsMap */
    @Override // java.util.NavigableMap
    public final java.util.NavigableMap<K, java.util.Collection<V>> tailMap(@com.google.common.collect.ParametricNullness K fromKey, boolean inclusive) {
        return new com.facebook.ads.redexgen.core.AnonymousClass19(this.A00, A0B().tailMap(fromKey, inclusive));
    }
}
