package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvq extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvt zza;

    /* synthetic */ zzgvq(com.google.android.gms.internal.ads.zzgvt zzgvtVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return this.zza.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        return zzc != null ? zzc.keySet().iterator() : new com.google.android.gms.internal.ads.zzgvl(zzgvtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        java.lang.Object obj2;
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        if (zzc != null) {
            return zzc.keySet().remove(obj);
        }
        java.lang.Object zzj = zzgvtVar.zzj(obj);
        obj2 = com.google.android.gms.internal.ads.zzgvt.zzd;
        return zzj != obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
