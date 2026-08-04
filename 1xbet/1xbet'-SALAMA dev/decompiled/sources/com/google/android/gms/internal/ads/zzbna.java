package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
final class zzbna implements zzbzj {
    final /* synthetic */ zzbnb zza;

    public zzbna(zzbnb zzbnbVar) {
        this.zza = zzbnbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzj
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        final zzblx zzblxVar = (zzblx) obj;
        zzbza.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbmz
            @Override // java.lang.Runnable
            public final void run() {
                zzblx zzblxVar2 = zzblxVar;
                zzblxVar2.zzr("/result", zzbiy.zzo);
                zzblxVar2.zzc();
            }
        });
    }
}
