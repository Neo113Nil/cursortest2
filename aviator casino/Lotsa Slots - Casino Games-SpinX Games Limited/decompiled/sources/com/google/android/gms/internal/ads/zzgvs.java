package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgvs extends java.util.AbstractCollection {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvt zza;

    /* synthetic */ zzgvs(com.google.android.gms.internal.ads.zzgvt zzgvtVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzgvtVar);
        this.zza = zzgvtVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.zza.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final java.util.Iterator iterator() {
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zza;
        java.util.Map zzc = zzgvtVar.zzc();
        return zzc != null ? zzc.values().iterator() : new com.google.android.gms.internal.ads.zzgvn(zzgvtVar);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.zza.size();
    }
}
