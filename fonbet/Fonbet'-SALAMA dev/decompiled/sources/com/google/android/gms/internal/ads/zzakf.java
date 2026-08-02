package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzakf {
    private final zzed zza = new zzed();
    private final int[] zzb = new int[256];
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;

    public static /* bridge */ /* synthetic */ void zzb(zzakf zzakfVar, zzed zzedVar, int i7) {
        int zzo;
        if (i7 < 4) {
            return;
        }
        zzedVar.zzM(3);
        int i8 = i7 - 4;
        if ((zzedVar.zzm() & 128) != 0) {
            if (i8 < 7 || (zzo = zzedVar.zzo()) < 4) {
                return;
            }
            zzakfVar.zzh = zzedVar.zzq();
            zzakfVar.zzi = zzedVar.zzq();
            zzakfVar.zza.zzI(zzo - 4);
            i8 = i7 - 11;
        }
        zzed zzedVar2 = zzakfVar.zza;
        int zzd = zzedVar2.zzd();
        int zze = zzedVar2.zze();
        if (zzd >= zze || i8 <= 0) {
            return;
        }
        int min = Math.min(i8, zze - zzd);
        zzedVar.zzH(zzedVar2.zzN(), zzd, min);
        zzakfVar.zza.zzL(zzd + min);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzakf zzakfVar, zzed zzedVar, int i7) {
        if (i7 < 19) {
            return;
        }
        zzakfVar.zzd = zzedVar.zzq();
        zzakfVar.zze = zzedVar.zzq();
        zzedVar.zzM(11);
        zzakfVar.zzf = zzedVar.zzq();
        zzakfVar.zzg = zzedVar.zzq();
    }

    public static /* bridge */ /* synthetic */ void zzd(zzakf zzakfVar, zzed zzedVar, int i7) {
        if (i7 % 5 != 2) {
            return;
        }
        zzedVar.zzM(2);
        Arrays.fill(zzakfVar.zzb, 0);
        int i8 = i7 / 5;
        for (int i9 = 0; i9 < i8; i9++) {
            int zzm = zzedVar.zzm();
            int zzm2 = zzedVar.zzm();
            int zzm3 = zzedVar.zzm();
            int zzm4 = zzedVar.zzm();
            int zzm5 = zzedVar.zzm();
            double d7 = zzm2;
            int[] iArr = zzakfVar.zzb;
            int i10 = zzen.zza;
            double d8 = zzm3 - 128;
            double d9 = zzm4 - 128;
            iArr[zzm] = (Math.max(0, Math.min((int) ((1.402d * d8) + d7), 255)) << 16) | (zzm5 << 24) | (Math.max(0, Math.min((int) ((d7 - (0.34414d * d9)) - (d8 * 0.71414d)), 255)) << 8) | Math.max(0, Math.min((int) ((d9 * 1.772d) + d7), 255));
        }
        zzakfVar.zzc = true;
    }

    public final zzcn zza() {
        int i7;
        if (this.zzd == 0 || this.zze == 0 || this.zzh == 0 || this.zzi == 0) {
            return null;
        }
        zzed zzedVar = this.zza;
        if (zzedVar.zze() == 0 || zzedVar.zzd() != zzedVar.zze() || !this.zzc) {
            return null;
        }
        zzedVar.zzL(0);
        int i8 = this.zzh * this.zzi;
        int[] iArr = new int[i8];
        int i9 = 0;
        while (i9 < i8) {
            int zzm = this.zza.zzm();
            if (zzm != 0) {
                i7 = i9 + 1;
                iArr[i9] = this.zzb[zzm];
            } else {
                int zzm2 = this.zza.zzm();
                if (zzm2 != 0) {
                    int i10 = zzm2 & 63;
                    if ((zzm2 & 64) != 0) {
                        i10 = (i10 << 8) | this.zza.zzm();
                    }
                    i7 = i10 + i9;
                    Arrays.fill(iArr, i9, i7, (zzm2 & 128) == 0 ? this.zzb[0] : this.zzb[this.zza.zzm()]);
                }
            }
            i9 = i7;
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.zzh, this.zzi, Bitmap.Config.ARGB_8888);
        zzcl zzclVar = new zzcl();
        zzclVar.zzc(createBitmap);
        zzclVar.zzh(this.zzf / this.zzd);
        zzclVar.zzi(0);
        zzclVar.zze(this.zzg / this.zze, 0);
        zzclVar.zzf(0);
        zzclVar.zzk(this.zzh / this.zzd);
        zzclVar.zzd(this.zzi / this.zze);
        return zzclVar.zzp();
    }

    public final void zze() {
        this.zzd = 0;
        this.zze = 0;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = 0;
        this.zza.zzI(0);
        this.zzc = false;
    }
}
