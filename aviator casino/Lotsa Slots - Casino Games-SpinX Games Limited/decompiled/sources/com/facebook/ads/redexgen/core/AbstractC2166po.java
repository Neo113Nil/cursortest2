package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.po, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2166po {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"TjwGK8026J8LuqpHpLFvP2qkj", "KunvWIfGJHX7HbktOkm4MkD4kcFcu9wT", "QjUrIUPqRg1gsQtfLrmUPiSj1", "hJhvRorUNw8eJjUCTMSK9XaE24mC2alD", "Tu6zUEMe1bl4a7998mqTIFcXwEKbBm8m", "M1p7igLEPvcmLPbfEPVmBOai", "JVDSc2uxo9h85gcqbpEojEewGNrzMl9R", "xry660e9EuWNkwUeRbJOaxl6l4kfk7Fh"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @javax.annotation.CheckForNull
    public static <V> V A05(@javax.annotation.CheckForNull java.util.Map<?, V> map, java.lang.Object key) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(map);
        try {
            return map.get(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @javax.annotation.CheckForNull
    public static <V> V A06(@javax.annotation.CheckForNull java.util.Map<?, V> map, java.lang.Object key) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(map);
        try {
            return map.remove(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return null;
        }
    }

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A09() {
        A00 = new byte[]{76, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 0, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, 0, 6, 17, 0, 1, 54, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, 0};
        if (A01[5].length() == 3) {
            throw new java.lang.RuntimeException();
        }
        A01[5] = "l4YJgmx6qI";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0C(@javax.annotation.CheckForNull java.util.Map<?, ?> map, java.lang.Object key) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(map);
        try {
            return map.containsKey(key);
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    static {
        A09();
    }

    public static int A00(int expectedSize) {
        if (expectedSize < 3) {
            com.facebook.ads.redexgen.core.AbstractC2013nJ.A00(expectedSize, A07(2, 12, 124));
            int i = expectedSize + 1;
            if (A01[6].charAt(13) == 's') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[2] = "v9VFtcyEVV9ymySR9OVMr7RkF";
            strArr[0] = "Yfss3f07HcaF8zCrtbecDwNdH";
            return i;
        }
        if (expectedSize < 1073741824) {
            return (int) java.lang.Math.ceil(expectedSize / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    public static <K, V> java.util.Map.Entry<K, V> A01(@com.google.common.collect.ParametricNullness K key, @com.google.common.collect.ParametricNullness V value) {
        return new com.facebook.ads.redexgen.core.BQ(key, value);
    }

    public static <K, V> java.util.Iterator<K> A02(java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator) {
        return new com.facebook.ads.redexgen.core.BL(entryIterator);
    }

    public static <K, V> java.util.Iterator<V> A03(java.util.Iterator<java.util.Map.Entry<K, V>> entryIterator) {
        return new com.facebook.ads.redexgen.core.BK(entryIterator);
    }

    public static <V> com.facebook.ads.redexgen.core.InterfaceC1847kO<java.util.Map.Entry<?, V>, V> A04() {
        com.facebook.ads.redexgen.core.BJ bj = com.facebook.ads.redexgen.core.BJ.A03;
        if (A01[6].charAt(13) == 's') {
            throw new java.lang.RuntimeException();
        }
        A01[6] = "R0MoS7T4JZROoHrLtuxkN6DM2XkxoreU";
        return bj;
    }

    public static java.lang.String A08(java.util.Map<?, ?> map) {
        java.lang.StringBuilder append = com.facebook.ads.redexgen.core.AbstractC2032nc.A01(map.size()).append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (java.util.Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z) {
                java.lang.String[] strArr = A01;
                if (strArr[3].charAt(29) == strArr[7].charAt(29)) {
                    throw new java.lang.RuntimeException();
                }
                java.lang.String[] strArr2 = A01;
                strArr2[2] = "LuqjCLBVeKEi1AZvZkL9PbjPH";
                strArr2[0] = "FpOiwMODSylVfNj2ewxL0FWcD";
                append.append(A07(0, 2, 121));
            }
            z = false;
            append.append(entry.getKey()).append(com.ironsource.B5.U).append(entry.getValue());
        }
        java.lang.StringBuilder sb = append.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }

    public static boolean A0A(@javax.annotation.CheckForNull java.util.Map<?, ?> map, java.lang.Object value) {
        return com.facebook.ads.redexgen.core.AbstractC2126p9.A0D(A03(map.entrySet().iterator()), value);
    }

    public static boolean A0B(@javax.annotation.CheckForNull java.util.Map<?, ?> map, java.lang.Object object) {
        if (map == object) {
            return true;
        }
        if (object instanceof java.util.Map) {
            return map.entrySet().equals(((java.util.Map) object).entrySet());
        }
        java.lang.String[] strArr = A01;
        if (strArr[4].charAt(2) == strArr[1].charAt(2)) {
            throw new java.lang.RuntimeException();
        }
        A01[5] = "0gxsrdth";
        return false;
    }
}
