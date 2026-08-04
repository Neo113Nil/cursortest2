package com.google.android.gms.internal.ads;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class zzcmc implements zzbiz {
    final /* synthetic */ zzcmf zza;

    public zzcmc(zzcmf zzcmfVar) {
        this.zza = zzcmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        if (zzcmf.zzg(this.zza, map)) {
            this.zza.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmb
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zza.zzd.zzg();
                }
            });
        }
    }
}
