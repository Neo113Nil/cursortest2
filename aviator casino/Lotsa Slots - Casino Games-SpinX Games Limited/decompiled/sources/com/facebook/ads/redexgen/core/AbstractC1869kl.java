package com.facebook.ads.redexgen.core;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1869kl {
    public static byte[] A00;

    static {
        A05();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> com.facebook.ads.redexgen.core.InterfaceC1867kj<T> A00(com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> first, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> second) {
        return new com.facebook.ads.redexgen.core.C9(A04((com.facebook.ads.redexgen.core.InterfaceC1867kj) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(first), (com.facebook.ads.redexgen.core.InterfaceC1867kj) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(second)));
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 111);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static java.lang.String A02(java.lang.String methodName, java.lang.Iterable<?> components) {
        java.lang.StringBuilder append = new java.lang.StringBuilder(A01(0, 11, 124)).append(methodName).append('(');
        boolean z = true;
        for (java.lang.Object obj : components) {
            if (!z) {
                append.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            append.append(obj);
            z = false;
        }
        return append.append(')').toString();
    }

    public static void A05() {
        A00 = new byte[]{59, 93, 80, 79, 84, 78, 76, 95, 80, 94, com.google.common.base.Ascii.EM};
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> java.util.List<com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T>> A04(com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> first, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> second) {
        return java.util.Arrays.asList(first, second);
    }
}
