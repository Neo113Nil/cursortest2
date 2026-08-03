package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdm {
    private final com.google.android.gms.internal.ads.zzdz zza;
    private final com.google.android.gms.internal.ads.zzdz zzb;
    private final com.google.android.gms.internal.ads.zzdl zzc;
    private java.lang.Object zzd;
    private java.lang.Object zze;
    private int zzf;

    public zzdm(java.lang.Object obj, android.os.Looper looper, android.os.Looper looper2, com.google.android.gms.internal.ads.zzdo zzdoVar, com.google.android.gms.internal.ads.zzdl zzdlVar) {
        this.zza = zzdoVar.zzd(looper, null);
        this.zzb = zzdoVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzdlVar;
    }

    private final void zzh(java.lang.Runnable runnable) {
        com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzb;
        if (zzdzVar.zza().getThread().isAlive()) {
            zzdzVar.zzm(runnable);
        }
    }

    private final void zzi(java.lang.Object obj) {
        java.lang.Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final java.lang.Object zza() {
        com.google.android.gms.internal.ads.zzdz zzdzVar = this.zzb;
        android.os.Looper myLooper = android.os.Looper.myLooper();
        if (myLooper == zzdzVar.zza()) {
            return this.zzd;
        }
        com.google.android.gms.internal.ads.zzgtj.zzi(myLooper == this.zza.zza());
        return this.zze;
    }

    public final void zzb(com.google.android.gms.internal.ads.zzgta zzgtaVar, final com.google.android.gms.internal.ads.zzgta zzgtaVar2) {
        com.google.android.gms.internal.ads.zzgtj.zzi(android.os.Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzd(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdm.this.zze(zzgtaVar2);
            }
        });
        zzi(zzgtaVar.apply(this.zzd));
    }

    public final void zzc(final java.lang.Object obj) {
        this.zze = obj;
        zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdm.this.zzf(obj);
            }
        });
    }

    public final void zzd(java.lang.Runnable runnable) {
        com.google.android.gms.internal.ads.zzdz zzdzVar = this.zza;
        if (zzdzVar.zza().getThread().isAlive()) {
            zzdzVar.zzm(runnable);
        }
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzgta zzgtaVar) {
        final java.lang.Object apply = zzgtaVar.apply(this.zze);
        this.zze = apply;
        zzh(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzdm.this.zzg(apply);
            }
        });
    }

    final /* synthetic */ void zzf(java.lang.Object obj) {
        if (this.zzf == 0) {
            zzi(obj);
        }
    }

    final /* synthetic */ void zzg(java.lang.Object obj) {
        int i = this.zzf - 1;
        this.zzf = i;
        if (i == 0) {
            zzi(obj);
        }
    }
}
