package com.google.android.gms.internal.ads;

import I2.J;
import android.content.Context;
import android.os.RemoteException;
import o3.BinderC1507b;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzedx implements zzebx {
    private final Context zza;
    private final zzder zzb;

    public zzedx(Context context, zzder zzderVar) {
        this.zza = context;
        this.zzb = zzderVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzedr zzedrVar = new zzedr(zzfafVar, (zzbqn) zzebuVar.zzb, EnumC1798b.INTERSTITIAL);
        zzddo zzd = this.zzb.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzddr(zzedrVar, null));
        zzedrVar.zzb(zzd.zzc());
        ((zzedi) zzebuVar.zzc).zzc(zzd.zzj());
        return zzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            ((zzbqn) zzebuVar.zzb).zzl(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new BinderC1507b(this.zza), new zzedv(this, zzebuVar, null), (zzbou) zzebuVar.zzc);
        } catch (RemoteException e7) {
            J.l("Remote exception loading a interstitial RTB ad", e7);
            throw new zzfbh(e7);
        }
    }
}
