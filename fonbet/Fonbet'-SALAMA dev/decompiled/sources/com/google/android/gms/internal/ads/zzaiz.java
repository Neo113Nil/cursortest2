package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzaiz {
    private final zzaja zza = new zzaja();
    private final zzed zzb = new zzed(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i7) {
        int i8;
        int i9 = 0;
        this.zzd = 0;
        do {
            int i10 = this.zzd;
            int i11 = i7 + i10;
            zzaja zzajaVar = this.zza;
            if (i11 >= zzajaVar.zzc) {
                break;
            }
            this.zzd = i10 + 1;
            i8 = zzajaVar.zzf[i11];
            i9 += i8;
        } while (i8 == 255);
        return i9;
    }

    public final zzed zza() {
        return this.zzb;
    }

    public final zzaja zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzed zzedVar = this.zzb;
        if (zzedVar.zzN().length == 65025) {
            return;
        }
        zzedVar.zzJ(Arrays.copyOf(zzedVar.zzN(), Math.max(65025, zzedVar.zze())), this.zzb.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zze(zzacw zzacwVar) {
        if (this.zze) {
            this.zze = false;
            this.zzb.zzI(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i7 = this.zzc;
            if (i7 < 0) {
                if (!this.zza.zzc(zzacwVar, -1L) || !this.zza.zzb(zzacwVar, true)) {
                    break;
                }
                zzaja zzajaVar = this.zza;
                int i8 = zzajaVar.zzd;
                if ((zzajaVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i8 += zzf(0);
                    i7 = this.zzd;
                } else {
                    i7 = 0;
                }
                if (!zzacz.zze(zzacwVar, i8)) {
                    return false;
                }
                this.zzc = i7;
            }
            int zzf = zzf(i7);
            int i9 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzed zzedVar = this.zzb;
                zzedVar.zzF(zzedVar.zze() + zzf);
                zzed zzedVar2 = this.zzb;
                if (!zzacz.zzd(zzacwVar, zzedVar2.zzN(), zzedVar2.zze(), zzf)) {
                    return false;
                }
                zzed zzedVar3 = this.zzb;
                zzedVar3.zzK(zzedVar3.zze() + zzf);
                this.zze = this.zza.zzf[i9 + (-1)] != 255;
            }
            if (i9 == this.zza.zzc) {
                i9 = -1;
            }
            this.zzc = i9;
        }
    }
}
