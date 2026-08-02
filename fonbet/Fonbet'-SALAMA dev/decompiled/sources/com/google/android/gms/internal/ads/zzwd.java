package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzwd {
    private final zzed zza = new zzed(32);
    private zzwc zzb;
    private zzwc zzc;
    private zzwc zzd;
    private long zze;
    private final zzyw zzf;

    public zzwd(zzyw zzywVar) {
        this.zzf = zzywVar;
        zzwc zzwcVar = new zzwc(0L, 65536);
        this.zzb = zzwcVar;
        this.zzc = zzwcVar;
        this.zzd = zzwcVar;
    }

    private final int zzi(int i7) {
        zzwc zzwcVar = this.zzd;
        if (zzwcVar.zzc == null) {
            zzyp zzb = this.zzf.zzb();
            zzwc zzwcVar2 = new zzwc(this.zzd.zzb, 65536);
            zzwcVar.zzc = zzb;
            zzwcVar.zzd = zzwcVar2;
        }
        return Math.min(i7, (int) (this.zzd.zzb - this.zze));
    }

    private static zzwc zzj(zzwc zzwcVar, long j) {
        while (j >= zzwcVar.zzb) {
            zzwcVar = zzwcVar.zzd;
        }
        return zzwcVar;
    }

    private static zzwc zzk(zzwc zzwcVar, long j, ByteBuffer byteBuffer, int i7) {
        zzwc zzj = zzj(zzwcVar, j);
        while (i7 > 0) {
            int min = Math.min(i7, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i7 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwc zzl(zzwc zzwcVar, long j, byte[] bArr, int i7) {
        zzwc zzj = zzj(zzwcVar, j);
        int i8 = i7;
        while (i8 > 0) {
            int min = Math.min(i8, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i7 - i8, min);
            i8 -= min;
            j += min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzwc zzm(zzwc zzwcVar, zzhg zzhgVar, zzwf zzwfVar, zzed zzedVar) {
        zzwc zzwcVar2;
        int i7;
        if (zzhgVar.zzl()) {
            long j = zzwfVar.zzb;
            zzedVar.zzI(1);
            zzwc zzl = zzl(zzwcVar, j, zzedVar.zzN(), 1);
            long j3 = j + 1;
            byte b7 = zzedVar.zzN()[0];
            int i8 = b7 & 128;
            int i9 = b7 & Byte.MAX_VALUE;
            zzhd zzhdVar = zzhgVar.zzb;
            byte[] bArr = zzhdVar.zza;
            if (bArr == null) {
                zzhdVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z4 = i8 != 0;
            zzwcVar2 = zzl(zzl, j3, zzhdVar.zza, i9);
            long j7 = j3 + i9;
            if (z4) {
                zzedVar.zzI(2);
                zzwcVar2 = zzl(zzwcVar2, j7, zzedVar.zzN(), 2);
                j7 += 2;
                i7 = zzedVar.zzq();
            } else {
                i7 = 1;
            }
            int[] iArr = zzhdVar.zzd;
            if (iArr == null || iArr.length < i7) {
                iArr = new int[i7];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhdVar.zze;
            if (iArr3 == null || iArr3.length < i7) {
                iArr3 = new int[i7];
            }
            int[] iArr4 = iArr3;
            if (z4) {
                int i10 = i7 * 6;
                zzedVar.zzI(i10);
                zzwcVar2 = zzl(zzwcVar2, j7, zzedVar.zzN(), i10);
                j7 += i10;
                zzedVar.zzL(0);
                for (int i11 = 0; i11 < i7; i11++) {
                    iArr2[i11] = zzedVar.zzq();
                    iArr4[i11] = zzedVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwfVar.zza - ((int) (j7 - zzwfVar.zzb));
            }
            zzaea zzaeaVar = zzwfVar.zzc;
            int i12 = zzen.zza;
            zzhdVar.zzc(i7, iArr2, iArr4, zzaeaVar.zzb, zzhdVar.zza, zzaeaVar.zza, zzaeaVar.zzc, zzaeaVar.zzd);
            long j8 = zzwfVar.zzb;
            int i13 = (int) (j7 - j8);
            zzwfVar.zzb = j8 + i13;
            zzwfVar.zza -= i13;
        } else {
            zzwcVar2 = zzwcVar;
        }
        if (!zzhgVar.zze()) {
            zzhgVar.zzj(zzwfVar.zza);
            return zzk(zzwcVar2, zzwfVar.zzb, zzhgVar.zzc, zzwfVar.zza);
        }
        zzedVar.zzI(4);
        zzwc zzl2 = zzl(zzwcVar2, zzwfVar.zzb, zzedVar.zzN(), 4);
        int zzp = zzedVar.zzp();
        zzwfVar.zzb += 4;
        zzwfVar.zza -= 4;
        zzhgVar.zzj(zzp);
        zzwc zzk = zzk(zzl2, zzwfVar.zzb, zzhgVar.zzc, zzp);
        zzwfVar.zzb += zzp;
        int i14 = zzwfVar.zza - zzp;
        zzwfVar.zza = i14;
        ByteBuffer byteBuffer = zzhgVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i14) {
            zzhgVar.zzf = ByteBuffer.allocate(i14);
        } else {
            zzhgVar.zzf.clear();
        }
        return zzk(zzk, zzwfVar.zzb, zzhgVar.zzf, zzwfVar.zza);
    }

    private final void zzn(int i7) {
        long j = this.zze + i7;
        this.zze = j;
        zzwc zzwcVar = this.zzd;
        if (j == zzwcVar.zzb) {
            this.zzd = zzwcVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i7, boolean z4) {
        int zzi = zzi(i7);
        zzwc zzwcVar = this.zzd;
        int zza = zzlVar.zza(zzwcVar.zzc.zza, zzwcVar.zza(this.zze), zzi);
        if (zza != -1) {
            zzn(zza);
            return zza;
        }
        if (z4) {
            return -1;
        }
        throw new EOFException();
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzwc zzwcVar;
        if (j != -1) {
            while (true) {
                zzwcVar = this.zzb;
                if (j < zzwcVar.zzb) {
                    break;
                }
                this.zzf.zzc(zzwcVar.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzwcVar.zza) {
                this.zzc = zzwcVar;
            }
        }
    }

    public final void zzd(zzhg zzhgVar, zzwf zzwfVar) {
        zzm(this.zzc, zzhgVar, zzwfVar, this.zza);
    }

    public final void zze(zzhg zzhgVar, zzwf zzwfVar) {
        this.zzc = zzm(this.zzc, zzhgVar, zzwfVar, this.zza);
    }

    public final void zzf() {
        zzwc zzwcVar = this.zzb;
        if (zzwcVar.zzc != null) {
            this.zzf.zzd(zzwcVar);
            zzwcVar.zzb();
        }
        this.zzb.zze(0L, 65536);
        zzwc zzwcVar2 = this.zzb;
        this.zzc = zzwcVar2;
        this.zzd = zzwcVar2;
        this.zze = 0L;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzed zzedVar, int i7) {
        while (i7 > 0) {
            int zzi = zzi(i7);
            zzwc zzwcVar = this.zzd;
            zzedVar.zzH(zzwcVar.zzc.zza, zzwcVar.zza(this.zze), zzi);
            i7 -= zzi;
            zzn(zzi);
        }
    }
}
