package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzaiw extends zzaiv {
    private final zzeu zzb;
    private final zzeu zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaiw(zzaht zzahtVar) {
        super(zzahtVar);
        this.zzb = new zzeu(zzgr.zza);
        this.zzc = new zzeu(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    protected final boolean zza(zzeu zzeuVar) throws zzaiu {
        int zzs = zzeuVar.zzs();
        int i = zzs >> 4;
        int i2 = zzs & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 28);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new zzaiu(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzaiv
    protected final boolean zzb(zzeu zzeuVar, long j) throws zzat {
        int i;
        int zzs = zzeuVar.zzs();
        long zzy = zzeuVar.zzy();
        if (zzs == 0) {
            if (!this.zze) {
                zzeu zzeuVar2 = new zzeu(new byte[zzeuVar.zzd()]);
                zzeuVar.zzm(zzeuVar2.zzi(), 0, zzeuVar.zzd());
                zzafm zza = zzafm.zza(zzeuVar2);
                this.zzd = zza.zzb;
                zzt zztVar = new zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("video/avc");
                zztVar.zzk(zza.zzl);
                zztVar.zzv(zza.zzc);
                zztVar.zzw(zza.zzd);
                zztVar.zzC(zza.zzk);
                zztVar.zzr(zza.zza);
                this.zza.zzA(zztVar.zzQ());
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
            zzeu zzeuVar3 = this.zzc;
            byte[] zzi = zzeuVar3.zzi();
            zzi[0] = 0;
            zzi[1] = 0;
            zzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzeuVar.zzd() > 0) {
                zzeuVar.zzm(zzeuVar3.zzi(), i3, this.zzd);
                zzeuVar3.zzh(0);
                zzeu zzeuVar4 = this.zzb;
                int zzH = zzeuVar3.zzH();
                zzeuVar4.zzh(0);
                zzaht zzahtVar = this.zza;
                zzahtVar.zzc(zzeuVar4, 4);
                zzahtVar.zzc(zzeuVar, zzH);
                i4 = i4 + 4 + zzH;
            }
            this.zza.zze(j + (zzy * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
