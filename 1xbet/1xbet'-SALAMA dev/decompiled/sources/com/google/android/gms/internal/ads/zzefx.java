package com.google.android.gms.internal.ads;

import I2.J;
import android.content.Context;
import android.os.RemoteException;
import p167y2.EnumC1058b;

/* JADX INFO: loaded from: classes.dex */
public final class zzefx implements zzebx {
    private final Context zza;
    private final zzdmz zzb;

    public zzefx(Context context, zzdmz zzdmzVar) {
        this.zza = context;
        this.zzb = zzdmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzedr zzedrVar = new zzedr(zzfafVar, (zzbqn) zzebuVar.zzb, EnumC1058b.REWARDED);
        zzdmv zzdmvVarZzd = this.zzb.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdmw(zzedrVar));
        zzedrVar.zzb(zzdmvVarZzd.zzc());
        ((zzedi) zzebuVar.zzc).zzc(zzdmvVarZzd.zzo());
        return zzdmvVarZzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            if (zzfarVar.zza.zza.zzo.zza == 3) {
                ((zzbqn) zzebuVar.zzb).zzo(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzefv(this, zzebuVar, null), (zzbou) zzebuVar.zzc);
            } else {
                ((zzbqn) zzebuVar.zzb).zzp(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzefv(this, zzebuVar, null), (zzbou) zzebuVar.zzc);
            }
        } catch (RemoteException e7) {
            J.l("Remote exception loading a rewarded RTB ad", e7);
        }
    }
}
