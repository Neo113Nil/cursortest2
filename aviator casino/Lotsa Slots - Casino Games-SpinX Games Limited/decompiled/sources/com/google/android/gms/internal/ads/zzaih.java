package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzaih extends com.google.android.gms.internal.ads.zzaim {
    private static final int[] zzb = {5512, 11025, 22050, 44100};
    private boolean zzc;
    private boolean zzd;
    private int zze;

    public zzaih(com.google.android.gms.internal.ads.zzahk zzahkVar) {
        super(zzahkVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zza(com.google.android.gms.internal.ads.zzet zzetVar) throws com.google.android.gms.internal.ads.zzail {
        if (this.zzc) {
            zzetVar.zzk(1);
        } else {
            int zzs = zzetVar.zzs();
            int i = zzs >> 4;
            this.zze = i;
            if (i == 2) {
                int i2 = zzb[(zzs >> 2) & 3];
                com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                zztVar.zzn("video/x-flv");
                zztVar.zzo("audio/mpeg");
                zztVar.zzG(1);
                zztVar.zzH(i2);
                this.zza.zzA(zztVar.zzO());
                this.zzd = true;
            } else if (i == 7 || i == 8) {
                com.google.android.gms.internal.ads.zzt zztVar2 = new com.google.android.gms.internal.ads.zzt();
                zztVar2.zzn("video/x-flv");
                zztVar2.zzo(i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw");
                zztVar2.zzG(1);
                zztVar2.zzH(8000);
                this.zza.zzA(zztVar2.zzO());
                this.zzd = true;
            } else if (i != 10) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 28);
                sb.append("Audio format not supported: ");
                sb.append(i);
                throw new com.google.android.gms.internal.ads.zzail(sb.toString());
            }
            this.zzc = true;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaim
    protected final boolean zzb(com.google.android.gms.internal.ads.zzet zzetVar, long j) throws com.google.android.gms.internal.ads.zzat {
        if (this.zze == 2) {
            int zzd = zzetVar.zzd();
            com.google.android.gms.internal.ads.zzahk zzahkVar = this.zza;
            zzahkVar.zzc(zzetVar, zzd);
            zzahkVar.zze(j, 1, zzd, 0, null);
            return true;
        }
        int zzs = zzetVar.zzs();
        if (zzs != 0 || this.zzd) {
            if (this.zze == 10 && zzs != 1) {
                return false;
            }
            int zzd2 = zzetVar.zzd();
            com.google.android.gms.internal.ads.zzahk zzahkVar2 = this.zza;
            zzahkVar2.zzc(zzetVar, zzd2);
            zzahkVar2.zze(j, 1, zzd2, 0, null);
            return true;
        }
        int zzd3 = zzetVar.zzd();
        byte[] bArr = new byte[zzd3];
        zzetVar.zzm(bArr, 0, zzd3);
        com.google.android.gms.internal.ads.zzaev zza = com.google.android.gms.internal.ads.zzaew.zza(bArr);
        com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
        zztVar.zzn("video/x-flv");
        zztVar.zzo("audio/mp4a-latm");
        zztVar.zzk(zza.zzc);
        zztVar.zzG(zza.zzb);
        zztVar.zzH(zza.zza);
        zztVar.zzr(java.util.Collections.singletonList(bArr));
        this.zza.zzA(zztVar.zzO());
        this.zzd = true;
        return false;
    }
}
