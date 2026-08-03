package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzibr extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzibw zza;

    zzibr(com.google.android.gms.internal.ads.zzibw zzibwVar) {
        java.util.Objects.requireNonNull(zzibwVar);
        this.zza = zzibwVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return (obj instanceof java.util.Map.Entry) && this.zza.zzc((java.util.Map.Entry) obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzibq(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzibw zzibwVar;
        com.google.android.gms.internal.ads.zzibv zzc;
        if (!(obj instanceof java.util.Map.Entry) || (zzc = (zzibwVar = this.zza).zzc((java.util.Map.Entry) obj)) == null) {
            return false;
        }
        zzibwVar.zzd(zzc, true);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.zzb;
    }
}
