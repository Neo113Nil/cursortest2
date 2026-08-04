package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzcqk implements zzgay {
    final /* synthetic */ zzgay zza;
    final /* synthetic */ zzcql zzb;

    public zzcqk(zzcql zzcqlVar, zzgay zzgayVar) {
        this.zza = zzgayVar;
        this.zzb = zzcqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd = false;
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqf
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd = false;
            }
        });
        this.zza.zzb((zzcpw) obj);
    }
}
