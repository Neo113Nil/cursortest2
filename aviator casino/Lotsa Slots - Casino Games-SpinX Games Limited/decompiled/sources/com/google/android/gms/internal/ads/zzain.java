package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzain extends com.google.android.gms.internal.ads.zzaim {
    private final com.google.android.gms.internal.ads.zzet zzb;
    private final com.google.android.gms.internal.ads.zzet zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzain(com.google.android.gms.internal.ads.zzahk zzahkVar) {
        super(zzahkVar);
        this.zzb = new com.google.android.gms.internal.ads.zzet(com.google.android.gms.internal.ads.zzgp.zza);
        this.zzc = new com.google.android.gms.internal.ads.zzet(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zza(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzail {
        int zzs = zzetVar.zzs();
        int i = zzs >> 4;
        int i2 = zzs & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new com.google.android.gms.internal.ads.zzail(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zzb(com.google.android.gms.internal.ads.zzet zzetVar, long j) throws com.google.android.gms.internal.ads.zzat {
        int i;
        int zzs = zzetVar.zzs();
        long zzy = zzetVar.zzy();
        if (zzs == 0) {
            if (!this.zze) {
                com.google.android.gms.internal.ads.zzet zzetVar2 = new com.google.android.gms.internal.ads.zzet(new byte[zzetVar.zzd()]);
                zzetVar.zzm(zzetVar2.zzi(), 0, zzetVar.zzd());
                com.google.android.gms.internal.ads.zzafd zza = com.google.android.gms.internal.ads.zzafd.zza(zzetVar2);
                this.zzd = zza.zzb;
                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("video/avc");
                zztVar.zzk(zza.zzl);
                zztVar.zzv(zza.zzc);
                zztVar.zzw(zza.zzd);
                zztVar.zzB(zza.zzk);
                zztVar.zzr(zza.zza);
                this.zza.zzA(zztVar.zzO());
                this.zze = true;
                return false;
            }
        } else if (zzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzc;
            byte[] zzi = zzetVar3.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzetVar.zzd() > 0) {
                zzetVar.zzm(zzetVar3.zzi(), i3, this.zzd);
                zzetVar3.zzh(0);
                com.google.android.gms.internal.ads.zzet zzetVar4 = this.zzb;
                int zzH = zzetVar3.zzH();
                zzetVar4.zzh(0);
                com.google.android.gms.internal.ads.zzahk zzahkVar = this.zza;
                zzahkVar.zzc(zzetVar4, 4);
                zzahkVar.zzc(zzetVar, zzH);
                i4 = i4 + 4 + zzH;
            }
            this.zza.zze(j + (zzy * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
