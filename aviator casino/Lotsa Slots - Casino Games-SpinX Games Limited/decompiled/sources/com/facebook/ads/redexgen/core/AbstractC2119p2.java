package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.p2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2119p2 {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @com.google.common.collect.ParametricNullness
    public static <T> T A00(@com.google.common.collect.ParametricNullness java.lang.Iterable<? extends T> iterable, T t) {
        return (T) com.facebook.ads.redexgen.core.AbstractC2126p9.A06(iterable.iterator(), t);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A02(java.lang.Iterable<T> iterable, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        return com.facebook.ads.redexgen.core.AbstractC2126p9.A0B(iterable.iterator(), predicate);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A03(java.lang.Iterable<T> removeFrom, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        return ((removeFrom instanceof java.util.RandomAccess) && (removeFrom instanceof java.util.List)) ? A04((java.util.List) removeFrom, (com.facebook.ads.redexgen.core.InterfaceC1867kj) com.facebook.ads.redexgen.core.AbstractC1866ki.A04(predicate)) : com.facebook.ads.redexgen.core.AbstractC2126p9.A0C(removeFrom.iterator(), predicate);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> void A01(java.util.List<T> list, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate, int to, int from) {
        for (int size = list.size() - 1; size > from; size--) {
            if (predicate.A4C(list.get(size))) {
                list.remove(size);
            }
        }
        for (int n = from - 1; n >= to; n--) {
            list.remove(n);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> boolean A04(java.util.List<T> list, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        int i = 0;
        int i2 = 0;
        while (i < from) {
            T t = list.get(i);
            if (!predicate.A4C(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (java.lang.IllegalArgumentException unused) {
                        A01(list, predicate, i2, i);
                        return true;
                    } catch (java.lang.UnsupportedOperationException unused2) {
                        A01(list, predicate, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        int from = list.size();
        list.subList(i2, from).clear();
        return i != i2;
    }
}
