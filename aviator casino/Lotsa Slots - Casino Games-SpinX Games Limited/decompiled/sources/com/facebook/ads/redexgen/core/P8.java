package com.facebook.ads.redexgen.core;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network/classes2.dex */
public final class P8<K, V> implements java.util.Set<java.util.Map.Entry<K, V>> {
    public static java.lang.String[] A01 = {"YtNF8b8ioPsgGgaDUde7WsjUMR00Jzoy", "ONmCOidcB6U5WZLM0OONVLfChSccD2jC", "SJu8u5Zh6YlgArwXrUirNpL4997vCJ", "nE4owr1wlu2VobktzduoSxTpcn75jZ1P", "qSRAP7Al4GPL3nfNBbzCOWjKh9ZAaoHj", "", "XO0jmWeq4", "JpA0oM1ow"};
    public final /* synthetic */ com.facebook.ads.redexgen.core.PC A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(java.util.Collection<? extends java.util.Map.Entry<K, V>> collection) {
        int A04 = this.A00.A04();
        for (java.util.Map.Entry<K, V> entry : collection) {
            this.A00.A0F(entry.getKey(), entry.getValue());
        }
        return A04 != this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    public P8(com.facebook.ads.redexgen.core.PC pc) {
        this.A00 = pc;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    private final boolean A00(@javax.annotation.Nullable java.util.Map.Entry<K, V> object) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(@javax.annotation.Nullable java.lang.Object obj) {
        A00((java.util.Map.Entry) obj);
        throw null;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.A00.A0D();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean contains(@javax.annotation.Nullable java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        int index = this.A00.A05(entry.getKey());
        if (index < 0) {
            return false;
        }
        java.lang.Object foundVal = this.A00.A0B(index, 1);
        return com.facebook.ads.redexgen.core.P5.A04(foundVal, entry.getValue());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean equals(java.lang.Object obj) {
        return com.facebook.ads.redexgen.core.PC.A03(this, obj);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int A04 = this.A00.A04() - 1; A04 >= 0; A04--) {
            com.facebook.ads.redexgen.core.PC pc = this.A00;
            java.lang.String[] strArr = A01;
            java.lang.String str = strArr[6];
            java.lang.String str2 = strArr[7];
            int i2 = str.length();
            int result = str2.length();
            if (i2 != result) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[6] = "tAEwYau76";
            strArr2[7] = "8QLk4N8pE";
            int i3 = 0;
            java.lang.Object A0B = pc.A0B(A04, 0);
            java.lang.Object A0B2 = this.A00.A0B(A04, 1);
            int i4 = A0B == null ? 0 : A0B.hashCode();
            if (A0B2 != null) {
                i3 = A0B2.hashCode();
            }
            i += i3 ^ i4;
        }
        return i;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.A00.A04() == 0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
        return new com.facebook.ads.redexgen.core.PA(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.A00.A04();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final java.lang.Object[] toArray() {
        throw new java.lang.UnsupportedOperationException();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.P8 != com.facebook.ads.internal.androidx.support.v4.util.MapCollections<K, V>$EntrySet */
    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] array) {
        throw new java.lang.UnsupportedOperationException();
    }
}
