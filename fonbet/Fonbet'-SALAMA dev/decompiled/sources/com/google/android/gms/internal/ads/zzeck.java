package com.google.android.gms.internal.ads;

import I2.J;
import android.content.Context;
import android.os.RemoteException;
import o3.BinderC1507b;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzeck implements zzebx {
    private final Context zza;
    private final zzcnd zzb;

    public zzeck(Context context, zzcnd zzcndVar) {
        this.zza = context;
        this.zzb = zzcndVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzedr zzedrVar = new zzedr(zzfafVar, (zzbqn) zzebuVar.zzb, EnumC1798b.APP_OPEN_AD);
        zzcna zza = this.zzb.zza(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzddr(zzedrVar, null), new zzcnb(zzfafVar.zzaa));
        zzedrVar.zzb(zza.zzc());
        ((zzedi) zzebuVar.zzc).zzc(zza.zzj());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            ((zzbqn) zzebuVar.zzb).zzi(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new BinderC1507b(this.zza), new zzeci(zzebuVar, null), (zzbou) zzebuVar.zzc);
        } catch (RemoteException e7) {
            J.l("Remote exception loading an app open RTB ad", e7);
            throw new zzfbh(e7);
        }
    }
}
