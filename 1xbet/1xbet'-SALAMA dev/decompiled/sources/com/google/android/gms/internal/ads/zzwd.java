package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
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
            zzyp zzypVarZzb = this.zzf.zzb();
            zzwc zzwcVar2 = new zzwc(this.zzd.zzb, 65536);
            zzwcVar.zzc = zzypVarZzb;
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
        zzwc zzwcVarZzj = zzj(zzwcVar, j);
        while (i7 > 0) {
            int iMin = Math.min(i7, (int) (zzwcVarZzj.zzb - j));
            byteBuffer.put(zzwcVarZzj.zzc.zza, zzwcVarZzj.zza(j), iMin);
            i7 -= iMin;
            j += (long) iMin;
            if (j == zzwcVarZzj.zzb) {
                zzwcVarZzj = zzwcVarZzj.zzd;
            }
        }
        return zzwcVarZzj;
    }

    private static zzwc zzl(zzwc zzwcVar, long j, byte[] bArr, int i7) {
        zzwc zzwcVarZzj = zzj(zzwcVar, j);
        int i8 = i7;
        while (i8 > 0) {
            int iMin = Math.min(i8, (int) (zzwcVarZzj.zzb - j));
            System.arraycopy(zzwcVarZzj.zzc.zza, zzwcVarZzj.zza(j), bArr, i7 - i8, iMin);
            i8 -= iMin;
            j += (long) iMin;
            if (j == zzwcVarZzj.zzb) {
                zzwcVarZzj = zzwcVarZzj.zzd;
            }
        }
        return zzwcVarZzj;
    }

    private static zzwc zzm(zzwc zzwcVar, zzhg zzhgVar, zzwf zzwfVar, zzed zzedVar) {
        zzwc zzwcVarZzl;
        int iZzq;
        if (zzhgVar.zzl()) {
            long j = zzwfVar.zzb;
            zzedVar.zzI(1);
            zzwc zzwcVarZzl2 = zzl(zzwcVar, j, zzedVar.zzN(), 1);
            long j3 = j + 1;
            byte b7 = zzedVar.zzN()[0];
            int i7 = b7 & 128;
            int i8 = b7 & 127;
            zzhd zzhdVar = zzhgVar.zzb;
            byte[] bArr = zzhdVar.zza;
            if (bArr == null) {
                zzhdVar.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            boolean z4 = i7 != 0;
            zzwcVarZzl = zzl(zzwcVarZzl2, j3, zzhdVar.zza, i8);
            long j7 = j3 + ((long) i8);
            if (z4) {
                zzedVar.zzI(2);
                zzwcVarZzl = zzl(zzwcVarZzl, j7, zzedVar.zzN(), 2);
                j7 += 2;
                iZzq = zzedVar.zzq();
            } else {
                iZzq = 1;
            }
            int[] iArr = zzhdVar.zzd;
            if (iArr == null || iArr.length < iZzq) {
                iArr = new int[iZzq];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzhdVar.zze;
            if (iArr3 == null || iArr3.length < iZzq) {
                iArr3 = new int[iZzq];
            }
            int[] iArr4 = iArr3;
            if (z4) {
                int i9 = iZzq * 6;
                zzedVar.zzI(i9);
                zzwcVarZzl = zzl(zzwcVarZzl, j7, zzedVar.zzN(), i9);
                j7 += (long) i9;
                zzedVar.zzL(0);
                for (int i10 = 0; i10 < iZzq; i10++) {
                    iArr2[i10] = zzedVar.zzq();
                    iArr4[i10] = zzedVar.zzp();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zzwfVar.zza - ((int) (j7 - zzwfVar.zzb));
            }
            zzaea zzaeaVar = zzwfVar.zzc;
            int i11 = zzen.zza;
            zzhdVar.zzc(iZzq, iArr2, iArr4, zzaeaVar.zzb, zzhdVar.zza, zzaeaVar.zza, zzaeaVar.zzc, zzaeaVar.zzd);
            long j8 = zzwfVar.zzb;
            int i12 = (int) (j7 - j8);
            zzwfVar.zzb = j8 + ((long) i12);
            zzwfVar.zza -= i12;
        } else {
            zzwcVarZzl = zzwcVar;
        }
        if (!zzhgVar.zze()) {
            zzhgVar.zzj(zzwfVar.zza);
            return zzk(zzwcVarZzl, zzwfVar.zzb, zzhgVar.zzc, zzwfVar.zza);
        }
        zzedVar.zzI(4);
        zzwc zzwcVarZzl3 = zzl(zzwcVarZzl, zzwfVar.zzb, zzedVar.zzN(), 4);
        int iZzp = zzedVar.zzp();
        zzwfVar.zzb += 4;
        zzwfVar.zza -= 4;
        zzhgVar.zzj(iZzp);
        zzwc zzwcVarZzk = zzk(zzwcVarZzl3, zzwfVar.zzb, zzhgVar.zzc, iZzp);
        zzwfVar.zzb += (long) iZzp;
        int i13 = zzwfVar.zza - iZzp;
        zzwfVar.zza = i13;
        ByteBuffer byteBuffer = zzhgVar.zzf;
        if (byteBuffer == null || byteBuffer.capacity() < i13) {
            zzhgVar.zzf = ByteBuffer.allocate(i13);
        } else {
            zzhgVar.zzf.clear();
        }
        return zzk(zzwcVarZzk, zzwfVar.zzb, zzhgVar.zzf, zzwfVar.zza);
    }

    private final void zzn(int i7) {
        long j = this.zze + ((long) i7);
        this.zze = j;
        zzwc zzwcVar = this.zzd;
        if (j == zzwcVar.zzb) {
            this.zzd = zzwcVar.zzd;
        }
    }

    public final int zza(zzl zzlVar, int i7, boolean z4) throws EOFException {
        int iZzi = zzi(i7);
        zzwc zzwcVar = this.zzd;
        int iZza = zzlVar.zza(zzwcVar.zzc.zza, zzwcVar.zza(this.zze), iZzi);
        if (iZza != -1) {
            zzn(iZza);
            return iZza;
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
            int iZzi = zzi(i7);
            zzwc zzwcVar = this.zzd;
            zzedVar.zzH(zzwcVar.zzc.zza, zzwcVar.zza(this.zze), iZzi);
            i7 -= iZzi;
            zzn(iZzi);
        }
    }
}
