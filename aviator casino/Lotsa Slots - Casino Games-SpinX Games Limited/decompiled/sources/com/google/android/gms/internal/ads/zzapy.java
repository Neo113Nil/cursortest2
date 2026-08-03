package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzapy implements com.google.android.gms.internal.ads.zzapt {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final com.google.android.gms.internal.ads.zzarl zzb;
    private com.google.android.gms.internal.ads.zzapx zzg;
    private long zzh;
    private java.lang.String zzi;
    private com.google.android.gms.internal.ads.zzahk zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final com.google.android.gms.internal.ads.zzapw zze = new com.google.android.gms.internal.ads.zzapw(128);
    private long zzl = -9223372036854775807L;
    private final com.google.android.gms.internal.ads.zzaqk zzf = new com.google.android.gms.internal.ads.zzaqk(178, 128);
    private final com.google.android.gms.internal.ads.zzet zzc = new com.google.android.gms.internal.ads.zzet();

    zzapy(com.google.android.gms.internal.ads.zzarl zzarlVar, java.lang.String str) {
        this.zzb = zzarlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zza() {
        com.google.android.gms.internal.ads.zzgp.zzj(this.zzd);
        this.zze.zza();
        com.google.android.gms.internal.ads.zzapx zzapxVar = this.zzg;
        if (zzapxVar != null) {
            zzapxVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzb(com.google.android.gms.internal.ads.zzagb zzagbVar, com.google.android.gms.internal.ads.zzarh zzarhVar) {
        zzarhVar.zza();
        this.zzi = zzarhVar.zzc();
        com.google.android.gms.internal.ads.zzahk zzu = zzagbVar.zzu(zzarhVar.zzb(), 2);
        this.zzj = zzu;
        this.zzg = new com.google.android.gms.internal.ads.zzapx(zzu);
        this.zzb.zza(zzagbVar, zzarhVar);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzc(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        int i;
        float f;
        float f2;
        this.zzg.getClass();
        this.zzj.getClass();
        int zzg = zzetVar.zzg();
        int zze = zzetVar.zze();
        byte[] zzi = zzetVar.zzi();
        this.zzh += zzetVar.zzd();
        this.zzj.zzc(zzetVar, zzetVar.zzd());
        while (true) {
            int zzi2 = com.google.android.gms.internal.ads.zzgp.zzi(zzi, zzg, zze, this.zzd);
            if (zzi2 == zze) {
                break;
            }
            int i2 = zzi2 + 3;
            int i3 = zzetVar.zzi()[i2] & 255;
            int i4 = zzi2 - zzg;
            if (!this.zzk) {
                if (i4 > 0) {
                    this.zze.zzc(zzi, zzg, zzi2);
                }
                int i5 = i4 < 0 ? -i4 : 0;
                com.google.android.gms.internal.ads.zzapw zzapwVar = this.zze;
                if (zzapwVar.zzb(i3, i5)) {
                    com.google.android.gms.internal.ads.zzahk zzahkVar = this.zzj;
                    int i6 = zzapwVar.zzb;
                    java.lang.String str = this.zzi;
                    str.getClass();
                    byte[] copyOf = java.util.Arrays.copyOf(zzapwVar.zzc, zzapwVar.zza);
                    com.google.android.gms.internal.ads.zzes zzesVar = new com.google.android.gms.internal.ads.zzes(copyOf, copyOf.length);
                    zzesVar.zzo(i6);
                    zzesVar.zzo(4);
                    zzesVar.zzg();
                    zzesVar.zzh(8);
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(4);
                        zzesVar.zzh(3);
                    }
                    int zzj = zzesVar.zzj(4);
                    if (zzj == 15) {
                        int zzj2 = zzesVar.zzj(8);
                        int zzj3 = zzesVar.zzj(8);
                        if (zzj3 == 0) {
                            com.google.android.gms.internal.ads.zzeg.zzc("H263Reader", "Invalid aspect ratio");
                            f2 = 1.0f;
                        } else {
                            f = zzj2 / zzj3;
                            f2 = f;
                        }
                    } else if (zzj < 7) {
                        f = zza[zzj];
                        f2 = f;
                    } else {
                        com.google.android.gms.internal.ads.zzeg.zzc("H263Reader", "Invalid aspect ratio");
                        f2 = 1.0f;
                    }
                    if (zzesVar.zzi()) {
                        zzesVar.zzh(2);
                        zzesVar.zzh(1);
                        if (zzesVar.zzi()) {
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                            zzesVar.zzh(3);
                            zzesVar.zzh(11);
                            zzesVar.zzg();
                            zzesVar.zzh(15);
                            zzesVar.zzg();
                        }
                    }
                    if (zzesVar.zzj(2) != 0) {
                        com.google.android.gms.internal.ads.zzeg.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzesVar.zzg();
                    int zzj4 = zzesVar.zzj(16);
                    zzesVar.zzg();
                    if (zzesVar.zzi()) {
                        if (zzj4 == 0) {
                            com.google.android.gms.internal.ads.zzeg.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = zzj4 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            zzesVar.zzh(i8);
                        }
                    }
                    zzesVar.zzg();
                    int zzj5 = zzesVar.zzj(13);
                    zzesVar.zzg();
                    int zzj6 = zzesVar.zzj(13);
                    zzesVar.zzg();
                    zzesVar.zzg();
                    com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
                    zztVar.zza(str);
                    zztVar.zzn("video/mp2t");
                    zztVar.zzo("video/mp4v-es");
                    zztVar.zzv(zzj5);
                    zztVar.zzw(zzj6);
                    zztVar.zzB(f2);
                    zztVar.zzr(java.util.Collections.singletonList(copyOf));
                    zzahkVar.zzA(zztVar.zzO());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(zzi, zzg, zzi2);
            com.google.android.gms.internal.ads.zzaqk zzaqkVar = this.zzf;
            if (i4 > 0) {
                zzaqkVar.zzd(zzi, zzg, zzi2);
                i = 0;
            } else {
                i = -i4;
            }
            if (zzaqkVar.zze(i)) {
                int zza2 = com.google.android.gms.internal.ads.zzgp.zza(zzaqkVar.zza, zzaqkVar.zzb);
                com.google.android.gms.internal.ads.zzet zzetVar2 = this.zzc;
                java.lang.String str2 = com.google.android.gms.internal.ads.zzfl.zza;
                zzetVar2.zzb(zzaqkVar.zza, zza2);
                this.zzb.zzb(this.zzl, zzetVar2);
            }
            if (i3 == 178) {
                if (zzetVar.zzi()[zzi2 + 2] == 1) {
                    zzaqkVar.zzc(178);
                }
                i3 = 178;
            }
            int i9 = zze - zzi2;
            this.zzg.zzd(this.zzh - i9, i9, this.zzk);
            this.zzg.zzb(i3, this.zzl);
            zzg = i2;
        }
        if (!this.zzk) {
            this.zze.zzc(zzi, zzg, zze);
        }
        this.zzg.zzc(zzi, zzg, zze);
        this.zzf.zzd(zzi, zzg, zze);
    }

    @Override // com.google.android.gms.internal.ads.zzapt
    public final void zze(boolean z) {
        com.google.android.gms.internal.ads.zzapx zzapxVar = this.zzg;
        zzapxVar.getClass();
        if (z) {
            zzapxVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
