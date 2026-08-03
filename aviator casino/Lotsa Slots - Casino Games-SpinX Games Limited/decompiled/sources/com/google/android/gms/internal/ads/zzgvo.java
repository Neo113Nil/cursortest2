package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvo extends java.util.AbstractSet {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvt zza;

    /* synthetic */ zzgvo(com.google.android.gms.internal.ads.zzgvt zzgvtVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().contains(obj);
        }
        if (obj instanceof java.util.Map.Entry) {
            java.util.Map.Entry entry = (java.util.Map.Entry) obj;
            int zzi = zzgvtVar.zzi(entry.getKey());
            if (zzi != -1 && java.util.Objects.equals(zzgvtVar.zzp(zzi), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        return zzc != null ? zzc.entrySet().iterator() : new com.google.android.gms.internal.ads.zzgvm(zzgvtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        if (zzc != null) {
            return zzc.entrySet().remove(obj);
        }
        if (!(obj instanceof java.util.Map.Entry)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (zzgvtVar.zzb()) {
            return false;
        }
        int zzh = zzgvtVar.zzh();
        int zze = com.google.android.gms.internal.ads.zzgvu.zze(entry.getKey(), entry.getValue(), zzh, zzgvtVar.zzk(), zzgvtVar.zzl(), zzgvtVar.zzm(), zzgvtVar.zzn());
        if (zze == -1) {
            return false;
        }
        zzgvtVar.zze(zze, zzh);
        zzgvtVar.zzu(zzgvtVar.zzt() - 1);
        zzgvtVar.zzd();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }
}
