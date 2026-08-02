package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzcqj implements zzgay {
    final /* synthetic */ zzgay zza;
    final /* synthetic */ zzcql zzb;

    public zzcqj(zzcql zzcqlVar, zzgay zzgayVar) {
        this.zza = zzgayVar;
        this.zzb = zzcqlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcqf
            @Override // java.lang.Runnable
            public final void run() {
                zzcql.this.zzd = false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcql.zzc(this.zzb, ((zzcqe) obj).zza, this.zza);
    }
}
