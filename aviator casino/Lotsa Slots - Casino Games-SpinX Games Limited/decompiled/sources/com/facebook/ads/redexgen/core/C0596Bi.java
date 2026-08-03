package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* renamed from: com.facebook.ads.redexgen.X.Bi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0596Bi<K, V> extends com.facebook.ads.redexgen.core.AbstractC1936lr<K, V> {
    public int A00;

    @com.google.common.collect.ParametricNullness
    public final K A01;
    public final /* synthetic */ com.facebook.ads.redexgen.core.C2037nh A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1936lr, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V getValue() {
        java.lang.Object A0F;
        java.util.Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) com.facebook.ads.redexgen.core.AbstractC2193qF.A01(A0h.get(this.A01));
        }
        A00();
        if (this.A00 == -1) {
            return (V) com.facebook.ads.redexgen.core.AbstractC2193qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        return (V) A0F;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.AbstractC1936lr, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final V setValue(@com.google.common.collect.ParametricNullness V v) {
        java.lang.Object A0F;
        java.util.Map<K, V> A0h = this.A02.A0h();
        if (A0h != null) {
            return (V) com.facebook.ads.redexgen.core.AbstractC2193qF.A01(A0h.put(this.A01, v));
        }
        A00();
        if (this.A00 == -1) {
            this.A02.put(this.A01, v);
            return (V) com.facebook.ads.redexgen.core.AbstractC2193qF.A00();
        }
        A0F = this.A02.A0F(this.A00);
        V v2 = (V) A0F;
        this.A02.A0R(this.A00, v);
        return v2;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    public C0596Bi(com.facebook.ads.redexgen.core.C2037nh c2037nh, int i) {
        java.lang.Object A0E;
        this.A02 = c2037nh;
        A0E = c2037nh.A0E(i);
        this.A01 = (K) A0E;
        this.A00 = i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    private void A00() {
        int A07;
        java.lang.Object A0E;
        if (this.A00 != -1 && this.A00 < this.A02.size()) {
            K k = this.A01;
            A0E = this.A02.A0E(this.A00);
            if (com.facebook.ads.redexgen.core.CB.A01(k, A0E)) {
                return;
            }
        }
        A07 = this.A02.A07(this.A01);
        this.A00 = A07;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Bi != com.google.common.collect.CompactHashMap<K, V>$MapEntry */
    @Override // com.facebook.ads.redexgen.core.AbstractC1936lr, java.util.Map.Entry
    @com.google.common.collect.ParametricNullness
    public final K getKey() {
        return this.A01;
    }
}
