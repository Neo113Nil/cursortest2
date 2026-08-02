package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
abstract class zzbcb extends java.util.AbstractList implements com.google.android.libraries.places.internal.zzbea {
    private boolean zza;

    zzbcb(boolean z) {
        this.zza = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, java.lang.Object obj) {
        zzbO();
        super.add(i, obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final boolean addAll(int i, java.util.Collection collection) {
        zzbO();
        return super.addAll(i, collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zzbO();
        super.clear();
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.List)) {
            return false;
        }
        if (!(obj instanceof java.util.RandomAccess)) {
            return super.equals(obj);
        }
        java.util.List list = (java.util.List) obj;
        int size = size();
        if (size != list.size()) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (!get(i).equals(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object remove(int i) {
        zzbO();
        return super.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(java.util.Collection collection) {
        zzbO();
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean retainAll(java.util.Collection collection) {
        zzbO();
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object set(int i, java.lang.Object obj) {
        zzbO();
        return super.set(i, obj);
    }

    protected final void zzbO() {
        if (!this.zza) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(java.lang.Object obj) {
        zzbO();
        return super.add(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(java.util.Collection collection) {
        zzbO();
        return super.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(java.lang.Object obj) {
        zzbO();
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // com.google.android.libraries.places.internal.zzbea
    public final void zzb() {
        if (this.zza) {
            this.zza = false;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbea
    public final boolean zza() {
        return this.zza;
    }
}
