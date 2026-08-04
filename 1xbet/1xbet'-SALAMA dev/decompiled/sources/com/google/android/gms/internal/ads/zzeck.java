package com.google.android.gms.internal.ads;

import I2.J;
import android.content.Context;
import android.os.RemoteException;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzeck implements zzebx {
    private final Context zza;
    private final zzcnd zzb;

    public zzeck(Context context, zzcnd zzcndVar) {
        this.zza = context;
        this.zzb = zzcndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzedr zzedrVar = new zzedr(zzfafVar, (zzbqn) zzebuVar.zzb, EnumC1058b.APP_OPEN_AD);
        zzcna zzcnaVarZza = this.zzb.zza(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzddr(zzedrVar, null), new zzcnb(zzfafVar.zzaa));
        zzedrVar.zzb(zzcnaVarZza.zzc());
        ((zzedi) zzebuVar.zzc).zzc(zzcnaVarZza.zzj());
        return zzcnaVarZza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            ((zzbqn) zzebuVar.zzb).zzi(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzeci(zzebuVar, null), (zzbou) zzebuVar.zzc);
        } catch (RemoteException e7) {
            J.l("Remote exception loading an app open RTB ad", e7);
            throw new zzfbh(e7);
        }
    }
}
