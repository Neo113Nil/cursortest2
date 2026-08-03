package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgwi<E> extends java.util.AbstractCollection<E> implements java.io.Serializable {
    private static final java.lang.Object[] zza = new java.lang.Object[0];

    zzgwi() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(java.lang.Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final java.util.Spliterator spliterator() {
        return java.util.Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray() {
        return toArray(zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: zza */
    public abstract com.google.android.gms.internal.ads.zzgza iterator();

    java.lang.Object[] zzb() {
        return null;
    }

    int zzc() {
        throw new java.lang.UnsupportedOperationException();
    }

    int zzd() {
        throw new java.lang.UnsupportedOperationException();
    }

    public com.google.android.gms.internal.ads.zzgwm zze() {
        if (isEmpty()) {
            int i = com.google.android.gms.internal.ads.zzgwm.zzd;
            return com.google.android.gms.internal.ads.zzgyh.zza;
        }
        java.lang.Object[] array = toArray(zza);
        int i2 = com.google.android.gms.internal.ads.zzgwm.zzd;
        return com.google.android.gms.internal.ads.zzgwm.zzt(array, array.length);
    }

    abstract boolean zzf();

    int zzg(java.lang.Object[] objArr, int i) {
        com.google.android.gms.internal.ads.zzgza it = iterator();
        while (it.hasNext()) {
            objArr[i] = it.next();
            i++;
        }
        return i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final java.lang.Object[] toArray(java.lang.Object[] objArr) {
        objArr.getClass();
        int size = size();
        int length = objArr.length;
        if (length < size) {
            java.lang.Object[] zzb = zzb();
            if (zzb != null) {
                return java.util.Arrays.copyOfRange(zzb, zzc(), zzd(), objArr.getClass());
            }
            if (length != 0) {
                objArr = java.util.Arrays.copyOf(objArr, 0);
            }
            objArr = java.util.Arrays.copyOf(objArr, size);
        } else if (length > size) {
            objArr[size] = null;
        }
        zzg(objArr, 0);
        return objArr;
    }
}
