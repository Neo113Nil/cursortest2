package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1637gj implements com.facebook.ads.redexgen.core.T1 {
    public final java.util.Map<java.lang.String, java.util.Set<java.lang.String>> A00 = new java.util.HashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // com.facebook.ads.redexgen.core.T1
    public final synchronized boolean AAM(java.lang.String str, java.lang.String str2) {
        boolean z;
        java.util.Set<java.lang.String> set = this.A00.get(str2);
        if (set != null) {
            z = set.contains(str);
        }
        return z;
    }

    @Override // com.facebook.ads.redexgen.core.T1
    public final synchronized void A4z(java.lang.String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.core.T1
    public final synchronized void AJE(java.lang.String str, java.lang.String str2) {
        java.util.Set<java.lang.String> set = this.A00.get(str2);
        if (set == null) {
            set = new java.util.HashSet<>();
            this.A00.put(str2, set);
        }
        set.add(str);
    }
}
