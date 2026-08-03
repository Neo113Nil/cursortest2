package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzarl {
    private final java.util.List zza;
    private final java.lang.String zzb = "video/mp2t";
    private final com.google.android.gms.internal.ads.zzahk[] zzc;
    private final com.google.android.gms.internal.ads.zzgz zzd;

    public zzarl(java.util.List list, java.lang.String str) {
        this.zza = list;
        this.zzc = new com.google.android.gms.internal.ads.zzahk[list.size()];
        com.google.android.gms.internal.ads.zzgz zzgzVar = new com.google.android.gms.internal.ads.zzgz(new com.google.android.gms.internal.ads.zzgy() { // from class: com.google.android.gms.internal.ads.zzark
            @Override // com.google.android.gms.internal.ads.zzgy
            public final /* synthetic */ void zza(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
                com.google.android.gms.internal.ads.zzarl.this.zzc(j, zzetVar);
            }
        });
        this.zzd = zzgzVar;
        zzgzVar.zza(3);
    }

    public final void zza(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        int i = 0;
        while (true) {
            com.google.android.gms.internal.ads.zzahk[] zzahkVarArr = this.zzc;
            if (i >= zzahkVarArr.length) {
                return;
            }
            zzarhVar.zza();
            com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 3);
            com.google.android.gms.internal.ads.zzv zzvVar = (com.google.android.gms.internal.ads.zzv) this.zza.get(i);
            java.lang.String str = zzvVar.zzp;
            boolean z = true;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            }
            com.google.android.gms.internal.ads.zzgtj.zzf(z, "Invalid closed caption MIME type provided: %s", str);
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zza(zzarhVar.zzc());
            zztVar.zzn(this.zzb);
            zztVar.zzo(str);
            zztVar.zzf(zzvVar.zze);
            zztVar.zze(zzvVar.zzd);
            zztVar.zzL(zzvVar.zzM);
            zztVar.zzr(zzvVar.zzs);
            zzu.zzA(zztVar.zzO());
            zzahkVarArr[i] = zzu;
            i++;
        }
    }

    public final void zzb(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
        if (zzetVar.zzd() < 9) {
            return;
        }
        int zzB = zzetVar.zzB();
        int zzB2 = zzetVar.zzB();
        int zzs = zzetVar.zzs();
        if (zzB == 434 && zzB2 == 1195456820 && zzs == 3) {
            this.zzd.zzc(j, zzetVar);
        }
    }

    final /* synthetic */ void zzc(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzafl.zzb(j, zzetVar, this.zzc);
    }
}
