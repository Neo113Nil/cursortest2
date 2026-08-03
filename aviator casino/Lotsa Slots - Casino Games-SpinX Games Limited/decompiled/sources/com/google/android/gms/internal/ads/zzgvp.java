package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzgvp implements java.util.Iterator {
    int zzb;
    int zzc;
    int zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzgvt zze;

    /* synthetic */ zzgvp(com.google.android.gms.internal.ads.zzgvt zzgvtVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzgvtVar);
        this.zze = zzgvtVar;
        this.zzb = zzgvtVar.zzs();
        this.zzc = zzgvtVar.zzf();
        this.zzd = -1;
    }

    private final void zzb() {
        if (this.zze.zzs() != this.zzb) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
        zzb();
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i = this.zzc;
        this.zzd = i;
        java.lang.Object zza = zza(i);
        this.zzc = this.zze.zzg(this.zzc);
        return zza;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzb();
        com.google.android.gms.internal.ads.zzgtj.zzj(this.zzd >= 0, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        int i = this.zzd;
        com.google.android.gms.internal.ads.zzgvt zzgvtVar = this.zze;
        zzgvtVar.remove(zzgvtVar.zzo(i));
        this.zzc--;
        this.zzd = -1;
    }

    abstract java.lang.Object zza(int i);
}
