package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgwq extends com.google.android.gms.internal.ads.zzgza {
    final java.util.Iterator zza;
    java.lang.Object zzb;
    java.util.Iterator zzc;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgwu zzd;

    zzgwq(com.google.android.gms.internal.ads.zzgwu zzgwuVar) {
        java.util.Objects.requireNonNull(zzgwuVar);
        this.zzd = zzgwuVar;
        this.zza = zzgwuVar.map.entrySet().zze().listIterator(0);
        this.zzb = null;
        this.zzc = com.google.android.gms.internal.ads.zzgxc.zza;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc.hasNext() || this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ java.lang.Object next() {
        if (!this.zzc.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) this.zza.next();
            this.zzb = entry.getKey();
            this.zzc = ((com.google.android.gms.internal.ads.zzgwi) entry.getValue()).iterator();
        }
        return new java.util.AbstractMap.SimpleImmutableEntry(java.util.Objects.requireNonNull(this.zzb), this.zzc.next());
    }
}
