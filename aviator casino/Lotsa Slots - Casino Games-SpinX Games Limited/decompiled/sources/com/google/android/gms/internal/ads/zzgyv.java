package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgyv extends java.util.AbstractSet {
    private zzgyv() {
        throw null;
    }

    /* synthetic */ zzgyv(byte[] bArr) {
    }

    static int zzd(java.util.Set set) {
        return set instanceof com.google.android.gms.internal.ads.zzgyv ? ((com.google.android.gms.internal.ads.zzgyv) set).zzc() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean addAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final void clear() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(java.lang.Object obj) {
        java.util.Set set;
        int zzd;
        int size;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Set) || (zzd = zzd((set = (java.util.Set) obj))) < 0) {
            return false;
        }
        if (set instanceof com.google.android.gms.internal.ads.zzgyv) {
            ((com.google.android.gms.internal.ads.zzgyv) set).zzb();
            size = 0;
        } else {
            size = set.size();
        }
        if (zzc() < size) {
            return false;
        }
        com.google.android.gms.internal.ads.zzgza it = iterator();
        int i = 0;
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
            i++;
        }
        if (i == zzd) {
            return true;
        }
        if (i < size) {
            return false;
        }
        java.util.Iterator it2 = set.iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 > i) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean remove(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean removeAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @java.lang.Deprecated
    public final boolean retainAll(java.util.Collection collection) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public abstract com.google.android.gms.internal.ads.zzgza iterator();

    abstract int zzb();

    abstract int zzc();
}
