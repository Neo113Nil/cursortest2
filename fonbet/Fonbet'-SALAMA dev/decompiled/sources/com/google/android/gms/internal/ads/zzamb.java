package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes.dex */
final class zzamb {
    private static final byte[] zzd = {0, 0, 1};
    public int zza;
    public int zzb;
    public byte[] zzc = new byte[128];
    private boolean zze;
    private int zzf;

    public zzamb(int i7) {
    }

    public final void zza(byte[] bArr, int i7, int i8) {
        if (this.zze) {
            int i9 = i8 - i7;
            byte[] bArr2 = this.zzc;
            int length = bArr2.length;
            int i10 = this.zza + i9;
            if (length < i10) {
                this.zzc = Arrays.copyOf(bArr2, i10 + i10);
            }
            System.arraycopy(bArr, i7, this.zzc, this.zza, i9);
            this.zza += i9;
        }
    }

    public final void zzb() {
        this.zze = false;
        this.zza = 0;
        this.zzf = 0;
    }

    public final boolean zzc(int i7, int i8) {
        int i9 = this.zzf;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        if (i7 == 179 || i7 == 181) {
                            this.zza -= i8;
                            this.zze = false;
                            return true;
                        }
                    } else if ((i7 & 240) != 32) {
                        zzdq.zzf("H263Reader", "Unexpected start code value");
                        zzb();
                    } else {
                        this.zzb = this.zza;
                        this.zzf = 4;
                    }
                } else if (i7 > 31) {
                    zzdq.zzf("H263Reader", "Unexpected start code value");
                    zzb();
                } else {
                    this.zzf = 3;
                }
            } else if (i7 != 181) {
                zzdq.zzf("H263Reader", "Unexpected start code value");
                zzb();
            } else {
                this.zzf = 2;
            }
        } else if (i7 == 176) {
            this.zzf = 1;
            this.zze = true;
        }
        zza(zzd, 0, 3);
        return false;
    }
}
