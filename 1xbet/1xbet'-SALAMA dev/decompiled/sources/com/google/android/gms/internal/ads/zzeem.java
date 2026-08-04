package com.google.android.gms.internal.ads;

import F2.C0254t;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

/* JADX INFO: loaded from: classes.dex */
public final class zzeem implements zzebx {
    private final Context zza;
    private final zzdfn zzb;
    private zzbpd zzc;
    private final VersionInfoParcel zzd;

    public zzeem(Context context, zzdfn zzdfnVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzdfnVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzefk {
        if (!zzfarVar.zza.zza.zzg.contains(Integer.toString(6))) {
            throw new zzefk(2, "Unified must be used for RTB.");
        }
        zzdhc zzdhcVarZzt = zzdhc.zzt(this.zzc);
        zzfba zzfbaVar = zzfarVar.zza.zza;
        if (!zzfbaVar.zzg.contains(Integer.toString(zzdhcVarZzt.zzc()))) {
            throw new zzefk(1, "No corresponding native ad listener");
        }
        zzdhe zzdheVarZze = this.zzb.zze(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdho(zzdhcVarZzt), new zzdjh(null, null, this.zzc));
        ((zzedi) zzebuVar.zzc).zzc(zzdheVarZze.zzj());
        return zzdheVarZze.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        try {
            ((zzbqn) zzebuVar.zzb).zzq(zzfafVar.zzZ);
            zzeel zzeelVar = null;
            if (this.zzd.f10836c < ((Integer) C0254t.f2723d.f2726c.zzb(zzbby.zzbS)).intValue()) {
                ((zzbqn) zzebuVar.zzb).zzm(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzeek(this, zzebuVar, zzeelVar), (zzbou) zzebuVar.zzc);
            } else {
                ((zzbqn) zzebuVar.zzb).zzn(zzfafVar.zzU, zzfafVar.zzv.toString(), zzfarVar.zza.zza.zzd, new p105o3.b(this.zza), new zzeek(this, zzebuVar, zzeelVar), (zzbou) zzebuVar.zzc, zzfarVar.zza.zza.zzi);
            }
        } catch (RemoteException e7) {
            throw new zzfbh(e7);
        }
    }
}
