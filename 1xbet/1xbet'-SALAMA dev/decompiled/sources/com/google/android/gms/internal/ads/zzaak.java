package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzaak {
    private final Context zza;
    private final zzaau zzb;
    private zzbz zzc;
    private zzbi zzd;
    private final List zze = zzfwh.zzn();
    private final zzbx zzf = zzbx.zza;
    private zzcz zzg = zzcz.zza;
    private boolean zzh;

    public zzaak(Context context, zzaau zzaauVar) {
        this.zza = context.getApplicationContext();
        this.zzb = zzaauVar;
    }

    public final zzaak zze(zzcz zzczVar) {
        this.zzg = zzczVar;
        return this;
    }

    public final zzaaq zzf() {
        zzcv.zzf(!this.zzh);
        zzaap zzaapVar = null;
        if (this.zzd == null) {
            if (this.zzc == null) {
                this.zzc = new zzaan(null);
            }
            this.zzd = new zzaao(this.zzc);
        }
        zzaaq zzaaqVar = new zzaaq(this, zzaapVar);
        this.zzh = true;
        return zzaaqVar;
    }
}
