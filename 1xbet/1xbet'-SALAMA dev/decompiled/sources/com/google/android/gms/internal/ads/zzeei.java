package com.google.android.gms.internal.ads;

import Y4.D;
import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
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
    public final /* bridge */ /* synthetic */ Object zza(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzefk, zzfbh {
        zzdhc zzdhcVarZzah;
        zzboz zzbozVarZzD = ((zzfby) zzebuVar.zzb).zzD();
        zzbpa zzbpaVarZzE = ((zzfby) zzebuVar.zzb).zzE();
        zzbpd zzbpdVarZzd = ((zzfby) zzebuVar.zzb).zzd();
        if (zzbpdVarZzd != null && zzc(zzfarVar, 6)) {
            zzdhcVarZzah = zzdhc.zzt(zzbpdVarZzd);
        } else if (zzbozVarZzD != null && zzc(zzfarVar, 6)) {
            zzdhcVarZzah = zzdhc.zzai(zzbozVarZzD);
        } else if (zzbozVarZzD != null && zzc(zzfarVar, 2)) {
            zzdhcVarZzah = zzdhc.zzag(zzbozVarZzD);
        } else if (zzbpaVarZzE != null && zzc(zzfarVar, 6)) {
            zzdhcVarZzah = zzdhc.zzaj(zzbpaVarZzE);
        } else {
            if (zzbpaVarZzE == null || !zzc(zzfarVar, 1)) {
                throw new zzefk(1, "No native ad mappers");
            }
            zzdhcVarZzah = zzdhc.zzah(zzbpaVarZzE);
        }
        if (zzdhcVarZzah != null) {
            zzfba zzfbaVar = zzfarVar.zza.zza;
            if (zzfbaVar.zzg.contains(Integer.toString(zzdhcVarZzah.zzc()))) {
                zzdhe zzdheVarZze = this.zzb.zze(new zzcqm(zzfarVar, zzfafVar, zzebuVar.zza), new zzdho(zzdhcVarZzah), new zzdjh(zzbpaVarZzE, zzbozVarZzD, zzbpdVarZzd));
                ((zzedi) zzebuVar.zzc).zzc(zzdheVarZze.zzk());
                zzdheVarZze.zzd().zzo(new zzcld((zzfby) zzebuVar.zzb), this.zzc);
                return zzdheVarZze.zza();
            }
        }
        throw new zzefk(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzebx
    public final void zzb(zzfar zzfarVar, zzfaf zzfafVar, zzebu zzebuVar) throws zzfbh {
        zzfby zzfbyVar = (zzfby) zzebuVar.zzb;
        zzfba zzfbaVar = zzfarVar.zza.zza;
        String string = zzfafVar.zzv.toString();
        String strI0 = D.I0(zzfafVar.zzs);
        zzbou zzbouVar = (zzbou) zzebuVar.zzc;
        zzfba zzfbaVar2 = zzfarVar.zza.zza;
        zzfbyVar.zzp(this.zza, zzfbaVar.zzd, string, strI0, zzbouVar, zzfbaVar2.zzi, zzfbaVar2.zzg);
    }
}
