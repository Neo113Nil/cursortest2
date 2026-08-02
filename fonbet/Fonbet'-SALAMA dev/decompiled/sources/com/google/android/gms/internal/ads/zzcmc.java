package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class zzcmc implements zzbiz {
    final /* synthetic */ zzcmf zza;

    public zzcmc(zzcmf zzcmfVar) {
        this.zza = zzcmfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbiz
    public final void zza(Object obj, Map map) {
        Executor executor;
        if (zzcmf.zzg(this.zza, map)) {
            executor = this.zza.zzc;
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcmb
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmk zzcmkVar;
                    zzcmkVar = zzcmc.this.zza.zzd;
                    zzcmkVar.zzg();
                }
            });
        }
    }
}
