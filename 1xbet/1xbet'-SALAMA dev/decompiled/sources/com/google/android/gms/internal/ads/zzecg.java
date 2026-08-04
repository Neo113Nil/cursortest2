package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class zzecg implements zzebx {
    private final Context zza;
    private final zzcnd zzb;
    private final Executor zzc;

    public zzecg(Context context, zzcnd zzcndVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcndVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, final zzebu zzebuVar) {
        zzcna zzcnaVarZza = this.zzb.zza(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzddr(new zzdez() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // com.google.android.gms.internal.ads.zzdez
            public final void zza(boolean z4, Context context, zzcvd zzcvdVar) throws zzdey {
                zzebu zzebuVar2 = zzebuVar;
                try {
                    ((zzfby) zzebuVar2.zzb).zzv(z4);
                    ((zzfby) zzebuVar2.zzb).zzw(context);
                } catch (zzfbh e7) {
                    throw new zzdey(e7.getCause());
                }
            }
        }, null), new zzcnb(zzfafVar.zzaa));
        zzcnaVarZza.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzc);
        ((zzedi) zzebuVar.zzc).zzc(zzcnaVarZza.zzk());
        return zzcnaVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        zzfby zzfbyVar = (zzfby) zzebuVar.zzb;
        zzfba zzfbaVar = zzfarVar.zza.zza;
        String string = zzfafVar.zzv.toString();
        zzfbyVar.zzl(this.zza, zzfbaVar.zzd, string, (zzbou) zzebuVar.zzc);
    }
}
