package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.p9, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2126p9 {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"K5wWXkn1kn3vTm5TWZRpAJ13TGij4Off", "na1woSjLgBJfLtqhSRSkwOGg", "PhLAgNdVWkw0DSh4SzNoPunxC5fhlr", "P2EphC6Qbo", "AgH7SjrpzHTBb", "6lZG", "iuGyz0SG3T5uD6f3liiVpcsGpl9NN6eU", "8JXy4no7J"};

    public static java.lang.String A07(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 50);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A08() {
        A00 = new byte[]{-67, -65, -78, -79, -74, -80, -82, -63, -78};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <T> boolean A0B(java.util.Iterator<T> iterator, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        return A00(iterator, predicate) != -1;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static boolean A0F(java.util.Iterator<?> iterator1, java.util.Iterator<?> iterator2) {
        while (iterator1.hasNext()) {
            if (!iterator2.hasNext() || !com.facebook.ads.redexgen.core.CB.A01(iterator1.next(), iterator2.next())) {
                return false;
            }
        }
        return !iterator2.hasNext();
    }

    static {
        A08();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> int A00(java.util.Iterator<T> iterator, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A05(predicate, A07(0, 9, 27));
        int i = 0;
        while (iterator.hasNext()) {
            if (predicate.A4C(iterator.next())) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    public static <T> com.facebook.ads.redexgen.core.C4C<T> A01(final java.util.Iterator<T> unfiltered, final com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> retainIfTrue) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(unfiltered);
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(retainIfTrue);
        return new com.facebook.ads.redexgen.core.AbstractC0609Bv<T>() { // from class: com.facebook.ads.redexgen.X.2I
            @Override // com.facebook.ads.redexgen.core.AbstractC0609Bv
            @javax.annotation.CheckForNull
            public final T A02() {
                while (unfiltered.hasNext()) {
                    T t = (T) unfiltered.next();
                    if (retainIfTrue.A4C(t)) {
                        return t;
                    }
                }
                return A01();
            }
        };
    }

    public static <T> java.util.Iterator<T> A02() {
        return com.facebook.ads.redexgen.core.EnumC2124p7.A03;
    }

    public static <T> com.facebook.ads.redexgen.core.C4C<T> A03(@com.google.common.collect.ParametricNullness T value) {
        return new com.facebook.ads.redexgen.core.BN(value);
    }

    @javax.annotation.CheckForNull
    public static <T> T A04(java.util.Iterator<T> iterator) {
        if (iterator.hasNext()) {
            T result = iterator.next();
            iterator.remove();
            return result;
        }
        return null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    @com.google.common.collect.ParametricNullness
    public static <T> T A05(java.util.Iterator<T> iterator, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(iterator);
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(predicate);
        while (iterator.hasNext()) {
            T next = iterator.next();
            if (predicate.A4C(next)) {
                return next;
            }
        }
        throw new java.util.NoSuchElementException();
    }

    @com.google.common.collect.ParametricNullness
    public static <T> T A06(@com.google.common.collect.ParametricNullness java.util.Iterator<? extends T> iterator, T defaultValue) {
        if (!iterator.hasNext()) {
            return defaultValue;
        }
        T defaultValue2 = iterator.next();
        return defaultValue2;
    }

    public static void A09(java.util.Iterator<?> iterator) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(iterator);
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x000b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> boolean A0A(java.util.Collection<T> addTo, java.util.Iterator<? extends T> iterator) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(addTo);
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(iterator);
        boolean z = false;
        while (wasModified) {
            boolean wasModified = addTo.add(iterator.next());
            z |= wasModified;
        }
        return z;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.kj != com.google.common.base.Predicate<? super T> */
    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static <T> boolean A0C(java.util.Iterator<T> removeFrom, com.facebook.ads.redexgen.core.InterfaceC1867kj<? super T> predicate) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(predicate);
        boolean z = false;
        while (modified) {
            boolean modified = predicate.A4C(removeFrom.next());
            if (modified) {
                removeFrom.remove();
                if (A01[5].length() != 4) {
                    throw new java.lang.RuntimeException();
                }
                A01[7] = "wI9B4C2he";
                z = true;
            }
        }
        return z;
    }

    public static boolean A0D(@javax.annotation.CheckForNull java.util.Iterator<?> iterator, java.lang.Object element) {
        if (element == null) {
            while (iterator.hasNext()) {
                if (iterator.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (iterator.hasNext()) {
            if (element.equals(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A0E(java.util.Iterator<?> removeFrom, java.util.Collection<?> elementsToRemove) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A04(elementsToRemove);
        boolean z = false;
        while (result) {
            boolean result = elementsToRemove.contains(removeFrom.next());
            if (result) {
                removeFrom.remove();
                z = true;
            }
        }
        return z;
    }
}
