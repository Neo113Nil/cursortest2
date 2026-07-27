package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzanh {
    private final zzani zza = new zzani();
    private final zzeu zzb = new zzeu(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzanh() {
    }

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzani zzaniVar = this.zza;
            if (i5 >= zzaniVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzaniVar.zzf[i5];
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

    public final zzani zzc() {
        return this.zza;
    }

    public final zzeu zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzeu zzeuVar = this.zzb;
        if (zzeuVar.zzi().length == 65025) {
            return;
        }
        zzeuVar.zzb(Arrays.copyOf(zzeuVar.zzi(), Math.max(65025, zzeuVar.zze())), zzeuVar.zze());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean zzb(zzagi zzagiVar) throws IOException {
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
                zzani zzaniVar = this.zza;
                if (!zzaniVar.zzb(zzagiVar, -1L) || !zzaniVar.zzc(zzagiVar, true)) {
                    break;
                }
                int i2 = zzaniVar.zzd;
                if ((zzaniVar.zza & 1) == 1 && this.zzb.zze() == 0) {
                    i2 += zzf(0);
                    i = this.zzd;
                } else {
                    i = 0;
                }
                if (!zzagl.zzd(zzagiVar, i2)) {
                    return false;
                }
                this.zzc = i;
            }
            int zzf = zzf(i);
            int i3 = this.zzc + this.zzd;
            if (zzf > 0) {
                zzeu zzeuVar = this.zzb;
                zzeuVar.zzc(zzeuVar.zze() + zzf);
                if (!zzagl.zzc(zzagiVar, zzeuVar.zzi(), zzeuVar.zze(), zzf)) {
                    return false;
                }
                zzeuVar.zzf(zzeuVar.zze() + zzf);
                this.zze = this.zza.zzf[i3 + (-1)] != 255;
            }
            if (i3 == this.zza.zzc) {
                i3 = -1;
            }
            this.zzc = i3;
        }
    }
}
