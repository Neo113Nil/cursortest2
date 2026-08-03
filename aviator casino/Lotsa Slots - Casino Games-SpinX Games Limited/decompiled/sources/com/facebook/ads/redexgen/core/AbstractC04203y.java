package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.3y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC04203y {
    public static byte[] A00;

    static {
        A06();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T A01(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.NullPointerException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T A02(T t) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static <T> T A03(T t, java.lang.Object obj) {
        if (t != null) {
            return t;
        }
        throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 10);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{54, 17, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.SUB, 7, 69, 95, 90, com.google.common.base.Ascii.ESC, 81, 95, 44, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.VT, 69, 95, 90, com.google.common.base.Ascii.ESC, 81, 95, 51, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.VT, 69, 95, 90, com.google.common.base.Ascii.ESC};
    }

    @org.checkerframework.dataflow.qual.Pure
    public static int A00(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new java.lang.IndexOutOfBoundsException(java.lang.String.format(A04(0, 31, 117), java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3)));
        }
        return i;
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"#1"})
    @org.checkerframework.dataflow.qual.Pure
    public static java.lang.String A05(java.lang.String str) {
        if (!android.text.TextUtils.isEmpty(str)) {
            return str;
        }
        throw new java.lang.IllegalArgumentException();
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A07(boolean z) {
        if (z) {
        } else {
            throw new java.lang.IllegalArgumentException();
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A08(boolean z) {
        if (z) {
        } else {
            throw new java.lang.IllegalStateException();
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A09(boolean z, java.lang.Object obj) {
        if (z) {
        } else {
            throw new java.lang.IllegalArgumentException(java.lang.String.valueOf(obj));
        }
    }

    @org.checkerframework.dataflow.qual.Pure
    public static void A0A(boolean z, java.lang.Object obj) {
        if (z) {
        } else {
            throw new java.lang.IllegalStateException(java.lang.String.valueOf(obj));
        }
    }
}
