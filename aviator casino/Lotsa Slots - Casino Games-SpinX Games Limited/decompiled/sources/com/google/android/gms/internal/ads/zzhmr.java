package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmr {
    private static final com.google.android.gms.internal.ads.zzhmr zza = (com.google.android.gms.internal.ads.zzhmr) com.google.android.gms.internal.ads.zzhny.zza(com.google.android.gms.internal.ads.zzhmq.zza);
    private final java.util.concurrent.atomic.AtomicReference zzb = new java.util.concurrent.atomic.AtomicReference(new com.google.android.gms.internal.ads.zzhnw(new com.google.android.gms.internal.ads.zzhnt(), null));

    public static com.google.android.gms.internal.ads.zzhmr zza() {
        return zza;
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzhlu zzhluVar) throws java.security.GeneralSecurityException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        com.google.android.gms.internal.ads.zzhnt zzhntVar = new com.google.android.gms.internal.ads.zzhnt((com.google.android.gms.internal.ads.zzhnw) atomicReference.get());
        zzhntVar.zza(zzhluVar);
        atomicReference.set(new com.google.android.gms.internal.ads.zzhnw(zzhntVar, null));
    }

    public final synchronized void zzc(com.google.android.gms.internal.ads.zzhlr zzhlrVar) throws java.security.GeneralSecurityException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        com.google.android.gms.internal.ads.zzhnt zzhntVar = new com.google.android.gms.internal.ads.zzhnt((com.google.android.gms.internal.ads.zzhnw) atomicReference.get());
        zzhntVar.zzb(zzhlrVar);
        atomicReference.set(new com.google.android.gms.internal.ads.zzhnw(zzhntVar, null));
    }

    public final synchronized void zzd(com.google.android.gms.internal.ads.zzhmy zzhmyVar) throws java.security.GeneralSecurityException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        com.google.android.gms.internal.ads.zzhnt zzhntVar = new com.google.android.gms.internal.ads.zzhnt((com.google.android.gms.internal.ads.zzhnw) atomicReference.get());
        zzhntVar.zzc(zzhmyVar);
        atomicReference.set(new com.google.android.gms.internal.ads.zzhnw(zzhntVar, null));
    }

    public final synchronized void zze(com.google.android.gms.internal.ads.zzhmv zzhmvVar) throws java.security.GeneralSecurityException {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zzb;
        com.google.android.gms.internal.ads.zzhnt zzhntVar = new com.google.android.gms.internal.ads.zzhnt((com.google.android.gms.internal.ads.zzhnw) atomicReference.get());
        zzhntVar.zzd(zzhmvVar);
        atomicReference.set(new com.google.android.gms.internal.ads.zzhnw(zzhntVar, null));
    }

    public final boolean zzf(com.google.android.gms.internal.ads.zzhns zzhnsVar) {
        return ((com.google.android.gms.internal.ads.zzhnw) this.zzb.get()).zza(zzhnsVar);
    }

    public final com.google.android.gms.internal.ads.zzhdq zzg(com.google.android.gms.internal.ads.zzhns zzhnsVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnw) this.zzb.get()).zzb(zzhnsVar, zzhelVar);
    }

    public final com.google.android.gms.internal.ads.zzhns zzh(com.google.android.gms.internal.ads.zzhdq zzhdqVar, java.lang.Class cls, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnw) this.zzb.get()).zzc(zzhdqVar, cls, zzhelVar);
    }

    public final boolean zzi(com.google.android.gms.internal.ads.zzhns zzhnsVar) {
        return ((com.google.android.gms.internal.ads.zzhnw) this.zzb.get()).zzd(zzhnsVar);
    }

    public final com.google.android.gms.internal.ads.zzheh zzj(com.google.android.gms.internal.ads.zzhns zzhnsVar) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnw) this.zzb.get()).zze(zzhnsVar);
    }

    public final com.google.android.gms.internal.ads.zzhns zzk(com.google.android.gms.internal.ads.zzheh zzhehVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        return ((com.google.android.gms.internal.ads.zzhnw) this.zzb.get()).zzf(zzhehVar, cls);
    }
}
