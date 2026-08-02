package com.google.android.gms.internal.ads;

import I2.J;
import android.content.Context;
import android.os.RemoteException;
import o3.BinderC1507b;
import y2.EnumC1798b;

/* loaded from: classes.dex */
public final class zzefx implements zzebx {
    private final Context zza;
    private final zzdmz zzb;

    public zzefx(Context context, zzdmz zzdmzVar) {
        this.zza = context;
        this.zzb = zzdmzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzedr zzedrVar = new zzedr(zzfafVar, (zzbqn) zzebuVar.zzb, EnumC1798b.REWARDED);
        zzdmv zzd = this.zzb.zzd(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdmw(zzedrVar));
        zzedrVar.zzb(zzd.zzc());
        ((zzedi) zzebuVar.zzc).zzc(zzd.zzo());
        return zzd.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            if (zzfarVar.zza.zza.zzo.zza == 3) {
                ((zzbqn) zzebuVar.zzb).zzo(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new BinderC1507b(this.zza), new zzefv(this, zzebuVar, null), (zzbou) zzebuVar.zzc);
            } else {
                ((zzbqn) zzebuVar.zzb).zzp(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new BinderC1507b(this.zza), new zzefv(this, zzebuVar, null), (zzbou) zzebuVar.zzc);
            }
        } catch (RemoteException e7) {
            J.l("Remote exception loading a rewarded RTB ad", e7);
        }
    }
}
