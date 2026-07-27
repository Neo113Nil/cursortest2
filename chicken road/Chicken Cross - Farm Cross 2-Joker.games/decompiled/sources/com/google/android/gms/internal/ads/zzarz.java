package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzarz {
    private final List zza;
    private final String zzb = "video/mp2t";
    private final zzaht[] zzc;
    private final zzhc zzd;

    public zzarz(List list, String str) {
        this.zza = list;
        this.zzc = new zzaht[list.size()];
        zzhc zzhcVar = new zzhc(new zzhb() { // from class: com.google.android.gms.internal.ads.zzary
            @Override // com.google.android.gms.internal.ads.zzhb
            public final /* synthetic */ void zza(long j, zzeu zzeuVar) {
                zzarz.this.zzc(j, zzeuVar);
            }
        });
        this.zzd = zzhcVar;
        zzhcVar.zza(3);
    }

    public final void zza(zzagk zzagkVar, zzarv zzarvVar) {
        int i = 0;
        while (true) {
            zzaht[] zzahtVarArr = this.zzc;
            if (i >= zzahtVarArr.length) {
                return;
            }
            zzarvVar.zza();
            zzaht zzs = zzagkVar.zzs(zzarvVar.zzb(), 3);
            zzv zzvVar = (zzv) this.zza.get(i);
            String str = zzvVar.zzp;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            zzguk.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            zzt zztVar = new zzt();
            zztVar.zza(zzarvVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzN(zzvVar.zzO);
            zztVar.zzr(zzvVar.zzs);
            zzs.zzA(zztVar.zzQ());
            zzahtVarArr[i] = zzs;
            i++;
        }
    }

    public final void zzb(long j, zzeu zzeuVar) {
        if (zzeuVar.zzd() < 9) {
            return;
        }
        int zzB = zzeuVar.zzB();
        int zzB2 = zzeuVar.zzB();
        int zzs = zzeuVar.zzs();
        if (zzB == 434 && zzB2 == 1195456820 && zzs == 3) {
            this.zzd.zzc(j, zzeuVar);
        }
    }

    final /* synthetic */ void zzc(long j, zzeu zzeuVar) {
        zzafu.zzb(j, zzeuVar, this.zzc);
    }
}
