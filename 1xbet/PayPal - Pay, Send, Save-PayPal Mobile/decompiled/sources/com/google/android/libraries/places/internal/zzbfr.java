package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbfr extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.libraries.places.internal.zzbfs zza;

    /* synthetic */ zzbfr(com.google.android.libraries.places.internal.zzbfs zzbfsVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbfsVar);
        this.zza = zzbfsVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* synthetic */ boolean add(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.zza.put((java.lang.Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object obj2 = this.zza.get(entry.getKey());
        java.lang.Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.libraries.places.internal.zzbfq(this.zza, null);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.zza.remove(entry.getKey());
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
