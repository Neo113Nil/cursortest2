package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.2C, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public class C2C<K, V> extends com.facebook.ads.redexgen.core.BO<java.util.Map.Entry<K, V>> {
    public final transient int A00;
    public final transient int A01;
    public final transient com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> A02;
    public final transient java.lang.Object[] A03;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.oX != com.google.common.collect.ImmutableMap<K, V> */
    public C2C(com.facebook.ads.redexgen.core.AbstractC2088oX<K, V> map, java.lang.Object[] alternatingKeysAndValues, int keyOffset, int size) {
        this.A02 = map;
        this.A03 = alternatingKeysAndValues;
        this.A00 = keyOffset;
        this.A01 = size;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final int A0I(java.lang.Object[] dst, int offset) {
        return A0J().A0I(dst, offset);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
    public final boolean A0K() {
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.core.BO
    public final com.facebook.ads.redexgen.core.BP<java.util.Map.Entry<K, V>> A0M() {
        return new com.facebook.ads.redexgen.core.BP<java.util.Map.Entry<K, V>>() { // from class: com.facebook.ads.redexgen.X.2D
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.List
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final java.util.Map.Entry<K, V> get(int index) {
                int i;
                java.lang.Object[] objArr;
                int i2;
                java.lang.Object[] objArr2;
                int i3;
                i = com.facebook.ads.redexgen.core.C2C.this.A01;
                com.facebook.ads.redexgen.core.AbstractC1866ki.A00(index, i);
                objArr = com.facebook.ads.redexgen.core.C2C.this.A03;
                i2 = com.facebook.ads.redexgen.core.C2C.this.A00;
                java.lang.Object requireNonNull = java.util.Objects.requireNonNull(objArr[(index * 2) + i2]);
                objArr2 = com.facebook.ads.redexgen.core.C2C.this.A03;
                i3 = com.facebook.ads.redexgen.core.C2C.this.A00;
                return new java.util.AbstractMap.SimpleImmutableEntry(requireNonNull, java.util.Objects.requireNonNull(objArr2[(index * 2) + (i3 ^ 1)]));
            }

            @Override // com.facebook.ads.redexgen.core.AbstractC2079oO
            public final boolean A0K() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public final int size() {
                int i;
                i = com.facebook.ads.redexgen.core.C2C.this.A01;
                return i;
            }
        };
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: A0N */
    public final com.facebook.ads.redexgen.core.C4C<java.util.Map.Entry<K, V>> iterator() {
        return A0J().iterator();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // com.facebook.ads.redexgen.core.AbstractC2079oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object object) {
        if (!(object instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) object;
        java.lang.Object k = entry.getKey();
        java.lang.Object value = entry.getValue();
        return value != null && value.equals(this.A02.get(k));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2C != com.google.common.collect.RegularImmutableMap$EntrySet<K, V> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.A01;
    }
}
