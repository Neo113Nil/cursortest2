package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamt {
    private final com.google.android.gms.internal.ads.zzamu zza = new com.google.android.gms.internal.ads.zzamu();
    private final com.google.android.gms.internal.ads.zzet zzb = new com.google.android.gms.internal.ads.zzet(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzamt() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            com.google.android.gms.internal.ads.zzamu zzamuVar = this.zza;
            if (i5 >= zzamuVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzamuVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final com.google.android.gms.internal.ads.zzamu zzc() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzet zzd() {
        return this.zzb;
    }

    public final void zze() {
        com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
        if (zzetVar.zzi().length == 65025) {
            return;
        }
        zzetVar.zzb(java.util.Arrays.copyOf(zzetVar.zzi(), java.lang.Math.max(65025, zzetVar.zze())), zzetVar.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzafz zzafzVar) throws java.io.IOException {
        if (this.zze) {
            this.zze = false;
            this.zzb.zza(0);
        }
        while (true) {
            if (this.zze) {
                return true;
            }
            int i = this.zzc;
            if (i < 0) {
                com.google.android.gms.internal.ads.zzamu zzamuVar = this.zza;
                if (!zzamuVar.zzb(zzafzVar, -1L) || !zzamuVar.zzc(zzafzVar, true)) {
                    break;
                }
                int i2 = zzamuVar.zzd;
                if ((zzamuVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!com.google.android.gms.internal.ads.zzagc.zzd(zzafzVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                com.google.android.gms.internal.ads.zzet zzetVar = this.zzb;
                zzetVar.zzc(zzetVar.zze() + zzf);
                if (!com.google.android.gms.internal.ads.zzagc.zzc(zzafzVar, zzetVar.zzi(), zzetVar.zze(), zzf)) {
                    return false;
                }
                zzetVar.zzf(zzetVar.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
