package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V] */
/* renamed from: com.facebook.ads.redexgen.X.Br, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0605Br<V> extends com.facebook.ads.redexgen.core.C2L<K, V>.WrappedCollection implements java.util.List<V> {
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2L A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.List
    public final boolean addAll(int index, java.util.Collection<? extends V> c) {
        if (c.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = A06().addAll(index, c);
        if (addAll) {
            com.facebook.ads.redexgen.core.C2L.A02(this.A00, A02().size() - size);
            if (size == 0) {
                A03();
            }
        }
        return addAll;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lp != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/2L<TK;TV;>.WrappedCollection;)V */
    public C0605Br(@com.google.common.collect.ParametricNullness final com.facebook.ads.redexgen.core.C2L this$0, @javax.annotation.CheckForNull java.lang.Object key, java.util.List delegate, com.facebook.ads.redexgen.core.C1934lp ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    public final java.util.List<V> A06() {
        return (java.util.List) A02();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final void add(@com.google.common.collect.ParametricNullness int index, V element) {
        A04();
        boolean isEmpty = A02().isEmpty();
        A06().add(index, element);
        com.facebook.ads.redexgen.core.C2L.A00(this.A00);
        if (isEmpty) {
            A03();
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public final V get(int index) {
        A04();
        return A06().get(index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object o) {
        A04();
        return A06().indexOf(o);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object o) {
        A04();
        return A06().lastIndexOf(o);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final java.util.ListIterator<V> listIterator() {
        A04();
        return new com.facebook.ads.redexgen.core.C0606Bs(this);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final java.util.ListIterator<V> listIterator(int index) {
        A04();
        return new com.facebook.ads.redexgen.core.C0606Bs(this, index);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public final V remove(int index) {
        A04();
        V remove = A06().remove(index);
        com.facebook.ads.redexgen.core.C2L.A01(this.A00);
        A05();
        return remove;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    @com.google.common.collect.ParametricNullness
    public final V set(@com.google.common.collect.ParametricNullness int index, V element) {
        A04();
        return A06().set(index, element);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Br != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedList */
    @Override // java.util.List
    public final java.util.List<V> subList(int fromIndex, int toIndex) {
        A04();
        return this.A00.A0H(A01(), A06().subList(fromIndex, toIndex), A00() == null ? this : A00());
    }
}
