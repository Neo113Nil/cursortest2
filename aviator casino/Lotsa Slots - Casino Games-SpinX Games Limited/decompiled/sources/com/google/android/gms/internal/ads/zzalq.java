package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzalq {
    public final com.google.android.gms.internal.ads.zzahk zza;
    public com.google.android.gms.internal.ads.zzaml zzd;
    public com.google.android.gms.internal.ads.zzalk zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    private final com.google.android.gms.internal.ads.zzv zzj;
    private boolean zzm;
    public final com.google.android.gms.internal.ads.zzamk zzb = new com.google.android.gms.internal.ads.zzamk();
    public final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet();
    private final com.google.android.gms.internal.ads.zzet zzk = new com.google.android.gms.internal.ads.zzet(1);
    private final com.google.android.gms.internal.ads.zzet zzl = new com.google.android.gms.internal.ads.zzet();

    public zzalq(com.google.android.gms.internal.ads.zzahk zzahkVar, com.google.android.gms.internal.ads.zzaml zzamlVar, com.google.android.gms.internal.ads.zzalk zzalkVar, com.google.android.gms.internal.ads.zzv zzvVar) {
        this.zza = zzahkVar;
        this.zzd = zzamlVar;
        this.zze = zzalkVar;
        this.zzj = zzvVar;
        zza(zzamlVar, zzalkVar);
    }

    public final void zza(com.google.android.gms.internal.ads.zzaml zzamlVar, com.google.android.gms.internal.ads.zzalk zzalkVar) {
        this.zzd = zzamlVar;
        this.zze = zzalkVar;
        this.zza.zzA(this.zzj);
        zzc();
    }

    public final void zzb(com.google.android.gms.internal.ads.zzq zzqVar) {
        com.google.android.gms.internal.ads.zzami zzamiVar = this.zzd.zza;
        com.google.android.gms.internal.ads.zzalk zzalkVar = this.zzb.zza;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        com.google.android.gms.internal.ads.zzamj zza = zzamiVar.zza(zzalkVar.zza);
        com.google.android.gms.internal.ads.zzq zzb = zzqVar.zzb(zza != null ? zza.zzb : null);
        com.google.android.gms.internal.ads.zzt zza2 = this.zzj.zza();
        zza2.zzs(zzb);
        this.zza.zzA(zza2.zzO());
    }

    public final void zzc() {
        com.google.android.gms.internal.ads.zzamk zzamkVar = this.zzb;
        zzamkVar.zzd = 0;
        zzamkVar.zzp = 0L;
        zzamkVar.zzq = false;
        zzamkVar.zzk = false;
        zzamkVar.zzo = false;
        zzamkVar.zzm = null;
        this.zzf = 0;
        this.zzh = 0;
        this.zzg = 0;
        this.zzi = 0;
        this.zzm = false;
    }

    public final long zzd() {
        if (!this.zzm) {
            return this.zzd.zzf[this.zzf];
        }
        com.google.android.gms.internal.ads.zzamk zzamkVar = this.zzb;
        return zzamkVar.zzi[this.zzf];
    }

    public final long zze() {
        return !this.zzm ? this.zzd.zzc[this.zzf] : this.zzb.zzf[this.zzh];
    }

    public final int zzf() {
        return !this.zzm ? this.zzd.zzd[this.zzf] : this.zzb.zzh[this.zzf];
    }

    public final int zzg() {
        int i = !this.zzm ? this.zzd.zzg[this.zzf] : this.zzb.zzj[this.zzf] ? 1 : 0;
        return zzj() != null ? i | 1073741824 : i;
    }

    public final boolean zzh() {
        this.zzf++;
        if (!this.zzm) {
            return false;
        }
        int i = this.zzg + 1;
        this.zzg = i;
        int[] iArr = this.zzb.zzg;
        int i2 = this.zzh;
        if (i != iArr[i2]) {
            return true;
        }
        this.zzh = i2 + 1;
        this.zzg = 0;
        return false;
    }

    public final int zzi(int i, int i2) {
        com.google.android.gms.internal.ads.zzet zzetVar;
        com.google.android.gms.internal.ads.zzamj zzj = zzj();
        if (zzj == null) {
            return 0;
        }
        int i3 = zzj.zzd;
        if (i3 != 0) {
            zzetVar = this.zzb.zzn;
        } else {
            byte[] bArr = zzj.zze;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzl;
            byte[] bArr2 = bArr;
            int length = bArr2.length;
            zzetVar2.zzb(bArr2, length);
            zzetVar = zzetVar2;
            i3 = length;
        }
        com.google.android.gms.internal.ads.zzamk zzamkVar = this.zzb;
        boolean zzb = zzamkVar.zzb(this.zzf);
        boolean z = zzb || i2 != 0;
        com.google.android.gms.internal.ads.zzet zzetVar3 = this.zzk;
        zzetVar3.zzi()[0] = (byte) ((true != z ? 0 : 128) | i3);
        zzetVar3.zzh(0);
        com.google.android.gms.internal.ads.zzahk zzahkVar = this.zza;
        zzahkVar.zzd(zzetVar3, 1, 1);
        zzahkVar.zzd(zzetVar, i3, 1);
        if (!z) {
            return i3 + 1;
        }
        if (!zzb) {
            com.google.android.gms.internal.ads.zzet zzetVar4 = this.zzc;
            zzetVar4.zza(8);
            byte[] zzi = zzetVar4.zzi();
            zzi[0] = 0;
            zzi[1] = 1;
            zzi[2] = 0;
            zzi[3] = (byte) i2;
            zzi[4] = (byte) ((i >> 24) & 255);
            zzi[5] = (byte) ((i >> 16) & 255);
            zzi[6] = (byte) ((i >> 8) & 255);
            zzi[7] = (byte) (i & 255);
            zzahkVar.zzd(zzetVar4, 8, 1);
            return i3 + 9;
        }
        int i4 = i3 + 1;
        com.google.android.gms.internal.ads.zzet zzetVar5 = zzamkVar.zzn;
        int zzt = zzetVar5.zzt();
        zzetVar5.zzk(-2);
        int i5 = (zzt * 6) + 2;
        if (i2 != 0) {
            com.google.android.gms.internal.ads.zzet zzetVar6 = this.zzc;
            zzetVar6.zza(i5);
            byte[] zzi2 = zzetVar6.zzi();
            zzetVar5.zzm(zzi2, 0, i5);
            int i6 = (((zzi2[2] & 255) << 8) | (zzi2[3] & 255)) + i2;
            zzi2[2] = (byte) ((i6 >> 8) & 255);
            zzi2[3] = (byte) (i6 & 255);
            zzetVar5 = zzetVar6;
        }
        zzahkVar.zzd(zzetVar5, i5, 1);
        return i4 + i5;
    }

    public final com.google.android.gms.internal.ads.zzamj zzj() {
        if (!this.zzm) {
            return null;
        }
        com.google.android.gms.internal.ads.zzamk zzamkVar = this.zzb;
        com.google.android.gms.internal.ads.zzalk zzalkVar = zzamkVar.zza;
        java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
        int i = zzalkVar.zza;
        com.google.android.gms.internal.ads.zzamj zzamjVar = zzamkVar.zzm;
        if (zzamjVar == null) {
            zzamjVar = this.zzd.zza.zza(i);
        }
        if (zzamjVar == null || !zzamjVar.zza) {
            return null;
        }
        return zzamjVar;
    }

    final /* synthetic */ boolean zzk() {
        return this.zzm;
    }

    final /* synthetic */ void zzl(boolean z) {
        this.zzm = true;
    }
}
