package com.google.android.gms.internal.ads;

import I2.J;
import android.content.Context;
import android.os.RemoteException;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzedx implements zzebx {
    private final Context zza;
    private final zzder zzb;

    public zzedx(Context context, zzder zzderVar) {
        this.zza = context;
        this.zzb = zzderVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzedr zzedrVar = new zzedr(zzfafVar, (zzbqn) zzebuVar.zzb, EnumC1058b.INTERSTITIAL);
        zzddo zzddoVarZzd = this.zzb.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzddr(zzedrVar, null));
        zzedrVar.zzb(zzddoVarZzd.zzc());
        ((zzedi) zzebuVar.zzc).zzc(zzddoVarZzd.zzj());
        return zzddoVarZzd.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            ((zzbqn) zzebuVar.zzb).zzl(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzedv(this, zzebuVar, null), (zzbou) zzebuVar.zzc);
        } catch (RemoteException e7) {
            J.l("Remote exception loading a interstitial RTB ad", e7);
            throw new zzfbh(e7);
        }
    }
}
