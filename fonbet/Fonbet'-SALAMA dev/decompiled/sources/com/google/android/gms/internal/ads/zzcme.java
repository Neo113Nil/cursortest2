package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzcme implements zzbiz {
    final /* synthetic */ zzcmf zza;

    public zzcme(zzcmf zzcmfVar) {
        this.zza = zzcmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcmf.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmd
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmk zzcmkVar;
                    zzcmkVar = zzcme.this.zza.zzd;
                    zzcmkVar.zzj();
                }
            });
        }
    }
}
