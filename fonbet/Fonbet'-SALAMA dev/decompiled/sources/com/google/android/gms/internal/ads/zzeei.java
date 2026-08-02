package com.google.android.gms.internal.ads;

import Y4.D;
import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeei implements zzebx {
    private final Context zza;
    private final zzdfn zzb;
    private final Executor zzc;

    public zzeei(Context context, zzdfn zzdfnVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdfnVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfar zzfarVar, int i7) {
        return zzfarVar.zza.zza.zzg.contains(Integer.toString(i7));
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzdhc zzah;
        zzboz zzD = ((zzfby) zzebuVar.zzb).zzD();
        zzbpa zzE = ((zzfby) zzebuVar.zzb).zzE();
        zzbpd zzd = ((zzfby) zzebuVar.zzb).zzd();
        if (zzd != null && zzc(zzfarVar, 6)) {
            zzah = zzdhc.zzt(zzd);
        } else if (zzD != null && zzc(zzfarVar, 6)) {
            zzah = zzdhc.zzai(zzD);
        } else if (zzD != null && zzc(zzfarVar, 2)) {
            zzah = zzdhc.zzag(zzD);
        } else if (zzE != null && zzc(zzfarVar, 6)) {
            zzah = zzdhc.zzaj(zzE);
        } else {
            if (zzE == null || !zzc(zzfarVar, 1)) {
                throw new zzefk(1, "No native ad mappers");
            }
            zzah = zzdhc.zzah(zzE);
        }
        if (zzah != null) {
            zzfba zzfbaVar = zzfarVar.zza.zza;
            if (zzfbaVar.zzg.contains(Integer.toString(zzah.zzc()))) {
                zzdhe zze = this.zzb.zze(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdho(zzah), new zzdjh(zzE, zzD, zzd));
                ((zzedi) zzebuVar.zzc).zzc(zze.zzk());
                zze.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzc);
                return zze.zza();
            }
        }
        throw new zzefk(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) {
        zzfby zzfbyVar = (zzfby) zzebuVar.zzb;
        zzfba zzfbaVar = zzfarVar.zza.zza;
        String jSONObject = zzfafVar.zzv.toString();
        String I02 = D.I0(zzfafVar.zzs);
        zzbou zzbouVar = (zzbou) zzebuVar.zzc;
        zzfba zzfbaVar2 = zzfarVar.zza.zza;
        zzfbyVar.zzp(this.zza, zzfbaVar.zzd, jSONObject, I02, zzbouVar, zzfbaVar2.zzi, zzfbaVar2.zzg);
    }
}
