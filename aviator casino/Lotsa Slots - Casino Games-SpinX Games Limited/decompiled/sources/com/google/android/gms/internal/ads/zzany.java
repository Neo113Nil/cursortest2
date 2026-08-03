package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzany {
    private final com.google.android.gms.internal.ads.zzet zza = new com.google.android.gms.internal.ads.zzet();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public final com.google.android.gms.internal.ads.zzcx zza() {
        int i;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        com.google.android.gms.internal.ads.zzet zzetVar = this.zza;
        if (zzetVar.zze() == 0 || zzetVar.zzg() != zzetVar.zze() || !this.zzc) {
            return null;
        }
        zzetVar.zzh(0);
        int i2 = this.zzh * this.zzi;
        int[] iArr = new int[i2];
        int i3 = 0;
        while (i3 < i2) {
            int zzs = zzetVar.zzs();
            if (zzs != 0) {
                i = i3 + 1;
                iArr[i3] = this.zzb[zzs];
            } else {
                int zzs2 = zzetVar.zzs();
                if (zzs2 != 0) {
                    int i4 = zzs2 & 63;
                    if ((zzs2 & 64) != 0) {
                        i4 = (i4 << 8) | zzetVar.zzs();
                    }
                    i = i4 + i3;
                    java.util.Arrays.fill(iArr, i3, i, (zzs2 & 128) == 0 ? this.zzb[0] : this.zzb[zzetVar.zzs()]);
                }
            }
            i3 = i;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(iArr, this.zzh, this.zzi, android.graphics.Bitmap.Config.ARGB_8888);
        com.google.android.gms.internal.ads.zzcw zzcwVar = new com.google.android.gms.internal.ads.zzcw();
        zzcwVar.zzc(createBitmap);
        zzcwVar.zzi(this.zzf / this.zzd);
        zzcwVar.zzj(0);
        zzcwVar.zzf(this.zzg / this.zze, 0);
        zzcwVar.zzg(0);
        zzcwVar.zzm(this.zzh / this.zzd);
        zzcwVar.zzn(this.zzi / this.zze);
        return zzcwVar.zzr();
    }

    public final void zzb() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zza(0);
        this.zzc = false;
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        if (i % 5 != 2) {
            return;
        }
        zzetVar.zzk(2);
        int[] iArr = this.zzb;
        java.util.Arrays.fill(iArr, 0);
        int i2 = 0;
        for (int i3 = i / 5; i2 < i3; i3 = i3) {
            int zzs = zzetVar.zzs();
            int zzs2 = zzetVar.zzs();
            int zzs3 = zzetVar.zzs();
            int zzs4 = zzetVar.zzs();
            double d = zzs2;
            int zzs5 = zzetVar.zzs() << 24;
            java.lang.String str = com.google.android.gms.internal.ads.zzfl.zza;
            double d2 = zzs3 - 128;
            double d3 = zzs4 - 128;
            iArr[zzs] = (java.lang.Math.max(0, java.lang.Math.min((int) (d + (1.402d * d2)), 255)) << 16) | zzs5 | (java.lang.Math.max(0, java.lang.Math.min((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 255)) << 8) | java.lang.Math.max(0, java.lang.Math.min((int) (d + (d3 * 1.772d)), 255));
            i2++;
        }
        this.zzc = true;
    }

    final /* synthetic */ void zzd(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        int zzx;
        if (i < 4) {
            return;
        }
        zzetVar.zzk(3);
        int i2 = i - 4;
        if ((zzetVar.zzs() & 128) != 0) {
            if (i2 < 7 || (zzx = zzetVar.zzx()) < 4) {
                return;
            }
            this.zzh = zzetVar.zzt();
            this.zzi = zzetVar.zzt();
            this.zza.zza(zzx - 4);
            i2 = i - 11;
        }
        com.google.android.gms.internal.ads.zzet zzetVar2 = this.zza;
        int zzg = zzetVar2.zzg();
        int zze = zzetVar2.zze();
        if (zzg >= zze || i2 <= 0) {
            return;
        }
        int min = java.lang.Math.min(i2, zze - zzg);
        zzetVar.zzm(zzetVar2.zzi(), zzg, min);
        zzetVar2.zzh(zzg + min);
    }

    final /* synthetic */ void zze(com.google.android.gms.internal.ads.zzet zzetVar, int i) {
        if (i < 19) {
            return;
        }
        this.zzd = zzetVar.zzt();
        this.zze = zzetVar.zzt();
        zzetVar.zzk(11);
        this.zzf = zzetVar.zzt();
        this.zzg = zzetVar.zzt();
    }
}
