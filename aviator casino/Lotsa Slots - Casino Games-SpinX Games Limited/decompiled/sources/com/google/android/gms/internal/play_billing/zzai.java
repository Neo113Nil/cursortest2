package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public abstract class zzai extends com.google.android.gms.internal.play_billing.zzaf implements java.util.List, java.util.RandomAccess {
    private static final com.google.android.gms.internal.play_billing.zzaw zza = new com.google.android.gms.internal.play_billing.zzag(com.google.android.gms.internal.play_billing.zzao.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    zzai() {
    }

    static com.google.android.gms.internal.play_billing.zzai zzi(java.lang.Object[] objArr, int i) {
        return i == 0 ? com.google.android.gms.internal.play_billing.zzao.zza : new com.google.android.gms.internal.play_billing.zzao(objArr, i);
    }

    public static com.google.android.gms.internal.play_billing.zzai zzj(java.util.Collection collection) {
        if (collection instanceof com.google.android.gms.internal.play_billing.zzaf) {
            com.google.android.gms.internal.play_billing.zzai zzd2 = ((com.google.android.gms.internal.play_billing.zzaf) collection).zzd();
            if (!zzd2.zzf()) {
                return zzd2;
            }
            java.lang.Object[] array = zzd2.toArray();
            return zzi(array, array.length);
        }
        java.lang.Object[] array2 = collection.toArray();
        int length = array2.length;
        for (int i = 0; i < length; i++) {
            if (array2[i] == null) {
                throw new java.lang.NullPointerException("at index " + i);
            }
        }
        return zzi(array2, array2.length);
    }

    public static com.google.android.gms.internal.play_billing.zzai zzk() {
        return com.google.android.gms.internal.play_billing.zzao.zza;
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final void add(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final boolean addAll(int i, java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(@javax.annotation.CheckForNull java.lang.Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof java.util.List) {
            java.util.List list = (java.util.List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof java.util.RandomAccess) {
                    for (int i = 0; i < size; i++) {
                        if (com.google.android.gms.internal.play_billing.zzz.zza(get(i), list.get(i))) {
                        }
                    }
                    return true;
                }
                java.util.Iterator it = iterator();
                java.util.Iterator it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !com.google.android.gms.internal.play_billing.zzz.zza(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ java.util.ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object remove(int i) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.List
    @java.lang.Deprecated
    public final java.lang.Object set(int i, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    int zza(java.lang.Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    @java.lang.Deprecated
    public final com.google.android.gms.internal.play_billing.zzai zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzaf
    /* renamed from: zze */
    public final com.google.android.gms.internal.play_billing.zzav iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.play_billing.zzai subList(int i, int i2) {
        com.google.android.gms.internal.play_billing.zzaa.zzd(i, i2, size());
        int i3 = i2 - i;
        return i3 == size() ? this : i3 == 0 ? com.google.android.gms.internal.play_billing.zzao.zza : new com.google.android.gms.internal.play_billing.zzah(this, i, i3);
    }

    @Override // java.util.List
    /* renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final com.google.android.gms.internal.play_billing.zzaw listIterator(int i) {
        com.google.android.gms.internal.play_billing.zzaa.zzb(i, size(), com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        return isEmpty() ? zza : new com.google.android.gms.internal.play_billing.zzag(this, i);
    }
}
