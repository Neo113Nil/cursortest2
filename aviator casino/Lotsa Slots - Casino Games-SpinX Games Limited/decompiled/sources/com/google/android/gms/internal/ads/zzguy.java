package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
class zzguy implements java.util.Iterator {
    final java.util.Iterator zza;
    final java.util.Collection zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzguz zzc;

    zzguy(com.google.android.gms.internal.ads.zzguz zzguzVar) {
        java.util.Objects.requireNonNull(zzguzVar);
        this.zzc = zzguzVar;
        this.zzb = zzguzVar.zzb;
        java.util.Collection collection = zzguzVar.zzb;
        this.zza = collection instanceof java.util.List ? ((java.util.List) collection).listIterator() : collection.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        return this.zza.hasNext();
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        zza();
        return this.zza.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.zza.remove();
        com.google.android.gms.internal.ads.zzguz zzguzVar = this.zzc;
        zzguzVar.zze.zzq(r1.zzp() - 1);
        zzguzVar.zzb();
    }

    final void zza() {
        com.google.android.gms.internal.ads.zzguz zzguzVar = this.zzc;
        zzguzVar.zza();
        if (zzguzVar.zzb != this.zzb) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    zzguy(com.google.android.gms.internal.ads.zzguz zzguzVar, java.util.Iterator it) {
        java.util.Objects.requireNonNull(zzguzVar);
        this.zzc = zzguzVar;
        this.zzb = zzguzVar.zzb;
        this.zza = it;
    }
}
