package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzaqw {
    private final java.util.List zza;
    private final com.google.android.gms.internal.ads.zzahk[] zzc;
    private final java.lang.String zzb = "video/mp2t";
    private final com.google.android.gms.internal.ads.zzgz zzd = new com.google.android.gms.internal.ads.zzgz(new com.google.android.gms.internal.ads.zzgy() { // from class: com.google.android.gms.internal.ads.zzaqv
        @Override // com.google.android.gms.internal.ads.zzgy
        public final /* synthetic */ void zza(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
            com.google.android.gms.internal.ads.zzaqw.this.zzf(j, zzetVar);
        }
    });

    public zzaqw(java.util.List list, java.lang.String str) {
        this.zza = list;
        this.zzc = new com.google.android.gms.internal.ads.zzahk[list.size()];
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
            java.lang.String str2 = zzvVar.zza;
            if (str2 == null) {
                str2 = zzarhVar.zzc();
            }
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zza(str2);
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

    public final void zzb(int i) {
        this.zzd.zza(i);
    }

    public final void zzc(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
        this.zzd.zzc(j, zzetVar);
    }

    public final void zzd() {
        this.zzd.zze();
    }

    public final void zze() {
        this.zzd.zze();
    }

    final /* synthetic */ void zzf(long j, com.google.android.gms.internal.ads.zzet zzetVar) {
        com.google.android.gms.internal.ads.zzafl.zza(j, zzetVar, this.zzc);
    }
}
