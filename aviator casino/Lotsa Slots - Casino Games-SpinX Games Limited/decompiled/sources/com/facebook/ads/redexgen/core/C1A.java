package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.1A, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C1A<K, V> extends com.facebook.ads.redexgen.core.C2L<K, V> implements com.facebook.ads.redexgen.core.BM<K, V> {
    public static final long serialVersionUID = 6588350623831699109L;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.C2L
    public final java.util.Collection<V> A0F(@com.google.common.collect.ParametricNullness K key, java.util.Collection<V> collection) {
        return A0H(key, (java.util.List) collection, null);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    public C1A(java.util.Map<K, java.util.Collection<V>> map) {
        super(map);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.C2L
    public final <E> java.util.Collection<E> A0G(java.util.Collection<E> collection) {
        return java.util.Collections.unmodifiableList((java.util.List) collection);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq, com.facebook.ads.redexgen.core.InterfaceC2181q3
    public java.util.Map<K, java.util.Collection<V>> A4H() {
        return super.A4H();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.C2L, com.facebook.ads.redexgen.core.InterfaceC2181q3
    public boolean AHE(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return super.AHE(key, value);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.1A != com.google.common.collect.AbstractListMultimap<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }
}
