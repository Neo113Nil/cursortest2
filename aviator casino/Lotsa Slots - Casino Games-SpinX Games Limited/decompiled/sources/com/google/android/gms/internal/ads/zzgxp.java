package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzgxp extends com.google.android.gms.internal.ads.zzgyu {
    zzgxp() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        zza().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object obj) {
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        java.lang.Object key = entry.getKey();
        java.lang.Object zza = com.google.android.gms.internal.ads.zzgxt.zza(zza(), key);
        if (java.util.Objects.equals(zza, entry.getValue())) {
            return zza != null || zza().containsKey(key);
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return zza().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object obj) {
        if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
            return zza().keySet().remove(((java.util.Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zza().size();
    }

    abstract java.util.Map zza();

    @Override // com.google.android.gms.internal.ads.zzgyu, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(java.util.Collection collection) {
        int ceil;
        collection.getClass();
        try {
            java.util.Collection collection2 = collection;
            return super.retainAll(collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                com.google.android.gms.internal.ads.zzgvi.zzb(size, "expectedSize");
                ceil = size + 1;
            } else {
                ceil = size < 1073741824 ? (int) java.lang.Math.ceil(size / 0.75d) : Integer.MAX_VALUE;
            }
            java.util.HashSet hashSet = new java.util.HashSet(ceil);
            for (java.lang.Object obj : collection) {
                if (contains(obj) && (obj instanceof java.util.Map.Entry)) {
                    hashSet.add(((java.util.Map.Entry) obj).getKey());
                }
            }
            return zza().keySet().retainAll(hashSet);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyu, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(java.util.Collection collection) {
        collection.getClass();
        try {
            java.util.Collection collection2 = collection;
            return com.google.android.gms.internal.ads.zzgyw.zzf(this, collection);
        } catch (java.lang.UnsupportedOperationException unused) {
            return com.google.android.gms.internal.ads.zzgyw.zze(this, collection.iterator());
        }
    }
}
