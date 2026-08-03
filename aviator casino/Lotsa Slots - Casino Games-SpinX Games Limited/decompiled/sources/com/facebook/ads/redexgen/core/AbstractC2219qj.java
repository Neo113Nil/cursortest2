package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.qj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2219qj {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"QMNv5OeLi", "JpCyGMjCH0qsxjrywkKfLwsh76HDYAsW", "KBfMQLxtUMBpcerO39v", "kcWpGIrroOmjfPs85a", "Ek92TFQTKr4621X3uMn", "aSOd7mkF1z21DVbAzu", "Gro5DGcboyXTTqFPFEdSQ7qnAhBJScvW", "47M7luGjiBOnZ0iOunZSyxDazaCqRcyy"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static int A00(java.util.Set<?> s) {
        int i = 0;
        java.util.Iterator<?> it = s.iterator();
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    /* JADX WARN: Multi-variable type inference failed */
    public static <E> java.util.SortedSet<E> A03(java.util.SortedSet<E> unfiltered, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super E> predicate) {
        if (!(unfiltered instanceof com.facebook.ads.redexgen.core.C0583Av)) {
            return new com.facebook.ads.redexgen.core.AnonymousClass26((java.util.SortedSet) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(unfiltered), (com.facebook.ads.redexgen.core.InterfaceC1867kj) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(predicate));
        }
        com.facebook.ads.redexgen.core.C0583Av c0583Av = (com.facebook.ads.redexgen.core.C0583Av) unfiltered;
        return new com.facebook.ads.redexgen.core.AnonymousClass26((java.util.SortedSet) c0583Av.A01, com.facebook.ads.redexgen.core.AbstractC1869kl.A00(c0583Av.A00, predicate));
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 125);
        }
        return new java.lang.String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> java.util.Set<E> A07(java.util.Set<E> unfiltered, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super E> predicate) {
        if (unfiltered instanceof java.util.SortedSet) {
            return A03((java.util.SortedSet) unfiltered, predicate);
        }
        if (!(unfiltered instanceof com.facebook.ads.redexgen.core.C0583Av)) {
            return new com.facebook.ads.redexgen.core.C0583Av((java.util.Set) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(unfiltered), (com.facebook.ads.redexgen.core.InterfaceC1867kj) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(predicate));
        }
        com.facebook.ads.redexgen.core.C0583Av c0583Av = (com.facebook.ads.redexgen.core.C0583Av) unfiltered;
        return new com.facebook.ads.redexgen.core.C0583Av((java.util.Set) c0583Av.A01, com.facebook.ads.redexgen.core.AbstractC1869kl.A00(c0583Av.A00, predicate));
    }

    public static void A08() {
        A00 = new byte[]{com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM, 17, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.DC2, 8, 47, com.google.common.base.Ascii.EM, 8, 121, 111, 126, 59, 19, 5, com.google.common.base.Ascii.DC4, 82};
    }

    static {
        A08();
    }

    public static <E> com.facebook.ads.redexgen.core.AbstractC2217qh<E> A01(final java.util.Set<? extends E> set1, final java.util.Set<? extends E> set2) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A05(set1, A04(10, 4, 119));
        com.facebook.ads.redexgen.core.AbstractC1866ki.A05(set2, A04(14, 4, 29));
        return new com.facebook.ads.redexgen.core.C0585Ax(set1, set2);
    }

    public static <E> com.facebook.ads.redexgen.core.AbstractC2217qh<E> A02(final java.util.Set<E> set1, final java.util.Set<?> set2) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A05(set1, A04(10, 4, 119));
        com.facebook.ads.redexgen.core.AbstractC1866ki.A05(set2, A04(14, 4, 29));
        return new com.facebook.ads.redexgen.core.C0584Aw(set1, set2);
    }

    public static <E> java.util.HashSet<E> A05() {
        return new java.util.HashSet<>();
    }

    public static <E> java.util.HashSet<E> A06(int expectedSize) {
        return new java.util.HashSet<>(com.facebook.ads.redexgen.core.AbstractC2166po.A00(expectedSize));
    }

    public static boolean A09(@javax.annotation.CheckForNull java.util.Set<?> s, java.lang.Object object) {
        if (s == object) {
            return true;
        }
        if (!(object instanceof java.util.Set)) {
            return false;
        }
        if (A01[0].length() != 9) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A01;
        strArr[2] = "mkkUVP7U2mO33UgVMEf";
        strArr[4] = "sZqEaXQqwVxNGw5Qr8W";
        java.util.Set set = (java.util.Set) object;
        try {
            if (s.size() == set.size()) {
                if (s.containsAll(set)) {
                    return true;
                }
            }
            return false;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public static boolean A0A(java.util.Set<?> set, java.util.Collection<?> collection) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(collection);
        if (0 != 0) {
            throw new java.lang.NullPointerException(A04(0, 10, 1));
        }
        if (collection instanceof java.util.Set) {
            int size = collection.size();
            int size2 = set.size();
            if (A01[0].length() != 9) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[2] = "1Hjzr9oWssjCwBhAVsj";
            strArr[4] = "95dUReBvqcjLhc0vRoV";
            if (size > size2) {
                return com.facebook.ads.redexgen.core.AbstractC2126p9.A0E(set.iterator(), collection);
            }
        }
        java.util.Iterator<?> it = collection.iterator();
        java.lang.String[] strArr2 = A01;
        if (strArr2[2].length() != strArr2[4].length()) {
            A01[1] = "sptQvlXJPhLrnOvdD6zGRYz2Tqrv0eAh";
            return A0B(set, it);
        }
        java.lang.String[] strArr3 = A01;
        strArr3[2] = "FhrMChMKSM6HFLoTDqL";
        strArr3[4] = "aqz5QQGy23EnDjT9ypo";
        return A0B(set, it);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0B(java.util.Set<?> set, java.util.Iterator<?> iterator) {
        boolean z = false;
        while (changed) {
            boolean changed = set.remove(iterator.next());
            z |= changed;
        }
        return z;
    }
}
