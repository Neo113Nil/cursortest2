package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.Bq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0604Bq<K, V> implements com.facebook.ads.redexgen.core.InterfaceC2181q3<K, V> {

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient java.util.Collection<V> A00;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient java.util.Map<K, java.util.Collection<V>> A01;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    public transient java.util.Set<K> A02;

    public abstract java.util.Map<K, java.util.Collection<V>> A00();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public java.util.Set<K> A01() {
        java.util.Set<K> set = this.A02;
        if (set != null) {
            return set;
        }
        java.util.Set<K> A02 = A02();
        this.A02 = A02;
        return A02;
    }

    public abstract java.util.Set<K> A02();

    public abstract java.util.Collection<V> A0B();

    public abstract java.util.Iterator<V> A0C();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2181q3
    public java.util.Map<K, java.util.Collection<V>> A4H() {
        java.util.Map<K, java.util.Collection<V>> map = this.A01;
        if (map != null) {
            return map;
        }
        java.util.Map<K, java.util.Collection<V>> A00 = A00();
        this.A01 = A00;
        return A00;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2181q3
    public java.util.Collection<V> values() {
        java.util.Collection<V> collection = this.A00;
        if (collection != null) {
            return collection;
        }
        java.util.Collection<V> A0B = A0B();
        this.A00 = A0B;
        return A0B;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bq != com.google.common.collect.AbstractMultimap<K, V> */
    public boolean A03(@javax.annotation.CheckForNull java.lang.Object value) {
        java.util.Iterator<java.util.Collection<V>> it = A4H().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(value)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bq != com.google.common.collect.AbstractMultimap<K, V> */
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return com.facebook.ads.redexgen.core.AbstractC2186q8.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bq != com.google.common.collect.AbstractMultimap<K, V> */
    public int hashCode() {
        return A4H().hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bq != com.google.common.collect.AbstractMultimap<K, V> */
    public java.lang.String toString() {
        return A4H().toString();
    }
}
