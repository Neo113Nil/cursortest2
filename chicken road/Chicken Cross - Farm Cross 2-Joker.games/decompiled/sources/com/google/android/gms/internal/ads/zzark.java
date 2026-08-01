package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzark {
    private final List zza;
    private final zzaht[] zzc;
    private final String zzb = "video/mp2t";
    private final zzhc zzd = new zzhc(new zzhb() { // from class: com.google.android.gms.internal.ads.zzarj
        @Override // com.google.android.gms.internal.ads.zzhb
        public final /* synthetic */ void zza(long j, zzeu zzeuVar) {
            zzark.this.zzf(j, zzeuVar);
        }
    });

    public zzark(List list, String str) {
        this.zza = list;
        this.zzc = new zzaht[list.size()];
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
            String str2 = zzvVar.zza;
            if (str2 == null) {
                str2 = zzarvVar.zzc();
            }
            zzt zztVar = new zzt();
            zztVar.zza(str2);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, zzeu zzeuVar) {
        this.zzd.zzc(j, zzeuVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j, zzeu zzeuVar) {
        zzafu.zza(j, zzeuVar, this.zzc);
    }
}
