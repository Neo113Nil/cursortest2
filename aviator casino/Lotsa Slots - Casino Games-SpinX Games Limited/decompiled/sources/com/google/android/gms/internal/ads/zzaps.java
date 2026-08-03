package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaps implements com.google.android.gms.internal.ads.zzapt {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzahk[] zzc;
    private boolean zzd;
    private int zze;
    private int zzf;
    private final java.lang.String zzb = "video/mp2t";
    private long zzg = -9223372036854775807L;

    public zzaps(java.util.List list, java.lang.String str) {
        this.zza = list;
        this.zzc = new com.google.android.gms.internal.ads.zzahk[list.size()];
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        if (zzetVar.zzd() == 0) {
            return false;
        }
        if (zzetVar.zzs() != i) {
            this.zzd = false;
        }
        this.zze--;
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        this.zzd = false;
        this.zzg = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzahk[] zzahkVarArr = this.zzc;
            if (i >= zzahkVarArr.length) {
                return;
            }
            com.google.android.gms.internal.ads.zzare zzareVar = (com.google.android.gms.internal.ads.zzare) this.zza.get(i);
            zzarhVar.zza();
            com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 3);
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zza(zzarhVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo("application/dvbsubs");
            zztVar.zzr(java.util.Collections.singletonList(zzareVar.zzb));
            zztVar.zze(zzareVar.zza);
            zzu.zzA(zztVar.zzO());
            zzahkVarArr[i] = zzu;
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.zzd = true;
        this.zzg = j;
        this.zzf = 0;
        this.zze = 2;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        if (this.zzd) {
            if (this.zze != 2 || zzf(zzetVar, 32)) {
                if (this.zze != 1 || zzf(zzetVar, 0)) {
                    int zzg = zzetVar.zzg();
                    int zzd = zzetVar.zzd();
                    for (com.google.android.gms.internal.ads.zzahk zzahkVar : this.zzc) {
                        zzetVar.zzh(zzg);
                        zzahkVar.zzc(zzetVar, zzd);
                    }
                    this.zzf += zzd;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
        if (this.zzd) {
            com.google.android.gms.internal.ads.zzgtj.zzi(this.zzg != -9223372036854775807L);
            for (com.google.android.gms.internal.ads.zzahk zzahkVar : this.zzc) {
                zzahkVar.zze(this.zzg, 1, this.zzf, 0, null);
            }
            this.zzd = false;
        }
    }
}
