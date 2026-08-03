package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgun extends com.google.android.gms.internal.ads.zzgxp {
    final /* synthetic */ com.google.android.gms.internal.ads.zzgup zza;

    zzgun(com.google.android.gms.internal.ads.zzgup zzgupVar) {
        java.util.Objects.requireNonNull(zzgupVar);
        this.zza = zzgupVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(java.lang.Object obj) {
        return com.google.android.gms.internal.ads.zzgvk.zza(this.zza.zza.entrySet(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final java.util.Iterator iterator() {
        return new com.google.android.gms.internal.ads.zzguo(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgxp, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(java.lang.Object obj) {
        if (!contains(obj)) {
            return false;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) java.util.Objects.requireNonNull((java.util.Map.Entry) obj);
        com.google.android.gms.internal.ads.zzgup zzgupVar = this.zza;
        zzgupVar.zzb.zzn(entry.getKey());
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgxp
    final java.util.Map zza() {
        return this.zza;
    }
}
