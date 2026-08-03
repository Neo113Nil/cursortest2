package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.q8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2186q8 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A01(@javax.annotation.CheckForNull com.facebook.ads.redexgen.core.InterfaceC2181q3<?, ?> multimap, java.lang.Object object) {
        if (object == multimap) {
            return true;
        }
        if (object instanceof com.facebook.ads.redexgen.core.InterfaceC2181q3) {
            return multimap.A4H().equals(((com.facebook.ads.redexgen.core.InterfaceC2181q3) object).A4H());
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<? extends java.util.List<V>> */
    public static <K, V> com.facebook.ads.redexgen.core.BM<K, V> A00(final java.util.Map<K, java.util.Collection<V>> map, final com.facebook.ads.redexgen.core.InterfaceC1877ku<? extends java.util.List<V>> factory) {
        return new com.facebook.ads.redexgen.core.C1A<K, V>(map, factory) { // from class: com.facebook.ads.redexgen.X.0t
            public static final long serialVersionUID = 0;
            public transient com.facebook.ads.redexgen.core.InterfaceC1877ku<? extends java.util.List<V>> A00;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0t != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ku != com.google.common.base.Supplier<? extends java.util.List<V>> */
            {
                this.A00 = (com.facebook.ads.redexgen.core.InterfaceC1877ku) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(factory);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0t != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq
            public final java.util.Map<K, java.util.Collection<V>> A00() {
                return A0J();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0t != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.core.AbstractC0604Bq
            public final java.util.Set<K> A02() {
                return A0K();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0t != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            @Override // com.facebook.ads.redexgen.core.C2L
            /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
            public final java.util.List<V> A0D() {
                return this.A00.get();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0t != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            private void readObject(java.io.ObjectInputStream stream) throws java.io.IOException, java.lang.ClassNotFoundException {
                stream.defaultReadObject();
                this.A00 = (com.facebook.ads.redexgen.core.InterfaceC1877ku) java.util.Objects.requireNonNull(stream.readObject());
                java.util.Map<K, java.util.Collection<V>> map2 = (java.util.Map) java.util.Objects.requireNonNull(stream.readObject());
                A0L(map2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.0t != com.google.common.collect.Multimaps$CustomListMultimap<K, V> */
            private void writeObject(java.io.ObjectOutputStream stream) throws java.io.IOException {
                stream.defaultWriteObject();
                stream.writeObject(this.A00);
                stream.writeObject(A0I());
            }
        };
    }
}
