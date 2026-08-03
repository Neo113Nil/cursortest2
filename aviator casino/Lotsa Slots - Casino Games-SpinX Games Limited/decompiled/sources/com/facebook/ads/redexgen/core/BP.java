package com.facebook.ads.redexgen.core;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: assets/audience_network/classes2.dex */
public abstract class BP<E> extends com.facebook.ads.redexgen.core.AbstractC2079oO<E> implements java.util.List<E>, java.util.RandomAccess {
    public static byte[] A00 = null;
    public static java.lang.String[] A01 = {"fHdUBkHaeOb", "RH", "RyMA6PTlrDF2m99nGPMPg2CjhSKVyaSQ", "ENegzNvFlexY3BR2RKk1z4PrLej5P8FF", "wggVriGK93MfFtYQABEEs6Hvem71Ew8R", "ul6RrA3f2JvHqPW8xA7h0PXskLz1uboQ", "Eo8bayYlVcx2q99x4ketqZKtcr", "wTUtZUDKElMjm9Nu5uZgljoHw4l"};
    public static final com.facebook.ads.redexgen.core.AbstractC0582Au<java.lang.Object> A02;
    public static final long serialVersionUID = -889275714;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static <E> com.facebook.ads.redexgen.core.BP<E> A05(java.util.Collection<? extends E> elements) {
        if (!(elements instanceof com.facebook.ads.redexgen.core.AbstractC2079oO)) {
            return A08(elements.toArray());
        }
        com.facebook.ads.redexgen.core.BP<E> A0J = ((com.facebook.ads.redexgen.core.AbstractC2079oO) elements).A0J();
        return A0J.A0K() ? A06(A0J.toArray()) : A0J;
    }

    public static java.lang.String A0A(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            java.lang.String[] strArr = A01;
            if (strArr[0].length() == strArr[7].length()) {
                throw new java.lang.RuntimeException();
            }
            A01[1] = "b9";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
            i4++;
        }
    }

    public static void A0B() {
        A00 = new byte[]{120, 94, 72, com.google.common.base.Ascii.CR, 126, 72, 95, 68, 76, 65, 68, 87, 72, 73, 107, 66, 95, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~((i * 31) + get(i2).hashCode()));
        }
        return i;
    }

    static {
        A0B();
        A02 = new com.facebook.ads.redexgen.core.AnonymousClass17(com.facebook.ads.redexgen.core.C2E.A02, 0);
    }

    public static <E> com.facebook.ads.redexgen.core.C2K<E> A01() {
        return new com.facebook.ads.redexgen.core.C2K<>();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    private final com.facebook.ads.redexgen.core.BP<E> A02(final int fromIndex, int toIndex) {
        final int i = toIndex - fromIndex;
        return new com.facebook.ads.redexgen.core.BP<E>(fromIndex, i) { // from class: com.facebook.ads.redexgen.X.2J
            public final transient int A00;
            public final transient int A01;

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            {
                this.A01 = fromIndex;
                this.A00 = i;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            public final int A0G() {
                return com.facebook.ads.redexgen.core.BP.this.A0H() + this.A01 + this.A00;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            public final int A0H() {
                return com.facebook.ads.redexgen.core.BP.this.A0H() + this.A01;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            public final boolean A0K() {
                return true;
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            @javax.annotation.CheckForNull
            public final java.lang.Object[] A0L() {
                return com.facebook.ads.redexgen.core.BP.this.A0L();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.BP, java.util.List
            /* renamed from: A0M */
            public final com.facebook.ads.redexgen.core.BP<E> subList(int fromIndex2, int toIndex2) {
                com.facebook.ads.redexgen.core.AbstractC1866ki.A0B(fromIndex2, toIndex2, this.A00);
                return com.facebook.ads.redexgen.core.BP.this.subList(this.A01 + fromIndex2, this.A01 + toIndex2);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.List
            public final E get(int index) {
                com.facebook.ads.redexgen.core.AbstractC1866ki.A00(index, this.A00);
                return com.facebook.ads.redexgen.core.BP.this.get(this.A01 + index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.BP, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
            public final /* bridge */ /* synthetic */ java.util.Iterator iterator() {
                return iterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.BP, java.util.List
            public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator() {
                return listIterator();
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // com.facebook.ads.redexgen.core.BP, java.util.List
            public final /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int index) {
                return super.listIterator(index);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2J != com.google.common.collect.ImmutableList<E>$SubList */
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                return this.A00;
            }
        };
    }

    public static <E> com.facebook.ads.redexgen.core.BP<E> A03() {
        return (com.facebook.ads.redexgen.core.BP<E>) com.facebook.ads.redexgen.core.C2E.A02;
    }

    public static <E> com.facebook.ads.redexgen.core.BP<E> A04(E e1) {
        return A08(e1);
    }

    public static <E> com.facebook.ads.redexgen.core.BP<E> A06(java.lang.Object[] elements) {
        return A09(elements, elements.length);
    }

    public static <E> com.facebook.ads.redexgen.core.BP<E> A07(E[] elements) {
        if (elements.length == 0) {
            return A03();
        }
        return A08((java.lang.Object[]) elements.clone());
    }

    public static <E> com.facebook.ads.redexgen.core.BP<E> A08(java.lang.Object... elements) {
        return A06(com.facebook.ads.redexgen.core.AbstractC2194qG.A03(elements));
    }

    public static <E> com.facebook.ads.redexgen.core.BP<E> A09(java.lang.Object[] elements, int length) {
        if (length == 0) {
            return A03();
        }
        return new com.facebook.ads.redexgen.core.C2E(elements, length);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public int A0I(java.lang.Object[] dst, int offset) {
        int size = size();
        for (int i = 0; i < size; i++) {
            int i2 = offset + i;
            dst[i2] = get(i);
        }
        return offset + size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    @java.lang.Deprecated
    public final com.facebook.ads.redexgen.core.BP<E> A0J() {
        return this;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.BP<E> subList(int fromIndex, int toIndex) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A0B(fromIndex, toIndex, size());
        int i = toIndex - fromIndex;
        int length = size();
        if (i == length) {
            return this;
        }
        if (i == 0) {
            return A03();
        }
        return A02(fromIndex, toIndex);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    /* renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.C4C<E> iterator() {
        return listIterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public final com.facebook.ads.redexgen.core.AbstractC0582Au<E> listIterator() {
        return listIterator(0);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    /* renamed from: A0P, reason: merged with bridge method [inline-methods] */
    public com.facebook.ads.redexgen.core.AbstractC0582Au<E> listIterator(int i) {
        com.facebook.ads.redexgen.core.AbstractC1866ki.A01(i, size());
        if (isEmpty()) {
            return (com.facebook.ads.redexgen.core.AbstractC0582Au<E>) A02;
        }
        return new com.facebook.ads.redexgen.core.AnonymousClass17(this, i);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int index, E element) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int index, java.util.Collection<? extends E> newElements) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        return indexOf(object) >= 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return com.facebook.ads.redexgen.core.AbstractC2147pU.A06(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int indexOf(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == null) {
            return -1;
        }
        return com.facebook.ads.redexgen.core.AbstractC2147pU.A00(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    public int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == null) {
            return -1;
        }
        return com.facebook.ads.redexgen.core.AbstractC2147pU.A01(this, object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    private void readObject(java.io.ObjectInputStream stream) throws java.io.InvalidObjectException {
        throw new java.io.InvalidObjectException(A0A(0, 18, 59));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @java.lang.Deprecated
    public final E remove(int index) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<E> */
    @Override // java.util.List
    @java.lang.Deprecated
    public final E set(int index, E element) {
        throw new java.lang.UnsupportedOperationException();
    }
}
