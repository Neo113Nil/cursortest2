package com.google.android.recaptcha.internal;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class zziz extends zzjb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    public /* synthetic */ zziz(InputStream inputStream, int i7, zziy zziyVar) {
        super(null);
        this.zzl = f.API_PRIORITY_OTHER;
        byte[] bArr = zzla.zzb;
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private final List zzI(int i7) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int iMin = Math.min(i7, 4096);
            byte[] bArr = new byte[iMin];
            int i8 = 0;
            while (i8 < iMin) {
                int i9 = this.zze.read(bArr, i8, iMin - i8);
                if (i9 == -1) {
                    throw zzlc.zzi();
                }
                this.zzk += i9;
                i8 += i9;
            }
            i7 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzJ() {
        int i7 = this.zzg + this.zzh;
        this.zzg = i7;
        int i8 = this.zzk + i7;
        int i9 = this.zzl;
        if (i8 <= i9) {
            this.zzh = 0;
            return;
        }
        int i10 = i8 - i9;
        this.zzh = i10;
        this.zzg = i7 - i10;
    }

    private final void zzK(int i7) throws zzlc {
        if (zzL(i7)) {
            return;
        }
        if (i7 <= (f.API_PRIORITY_OTHER - this.zzk) - this.zzi) {
            throw zzlc.zzi();
        }
        throw zzlc.zzh();
    }

    private final boolean zzL(int i7) throws IOException {
        int i8 = this.zzi;
        int i9 = i8 + i7;
        int i10 = this.zzg;
        if (i9 <= i10) {
            throw new IllegalStateException(AbstractC0486a1.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
        }
        int i11 = this.zzk;
        if (i7 > (f.API_PRIORITY_OTHER - i11) - i8 || i11 + i8 + i7 > this.zzl) {
            return false;
        }
        if (i8 > 0) {
            if (i10 > i8) {
                byte[] bArr = this.zzf;
                System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
            }
            i11 = this.zzk + i8;
            this.zzk = i11;
            i10 = this.zzg - i8;
            this.zzg = i10;
            this.zzi = 0;
        }
        try {
            int i12 = this.zze.read(this.zzf, i10, Math.min(4096 - i10, (f.API_PRIORITY_OTHER - i11) - i10));
            if (i12 == 0 || i12 < -1 || i12 > 4096) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + i12 + "\nThe InputStream implementation is buggy.");
            }
            if (i12 <= 0) {
                return false;
            }
            this.zzg += i12;
            zzJ();
            if (this.zzg >= i7) {
                return true;
            }
            return zzL(i7);
        } catch (zzlc e7) {
            e7.zzj();
            throw e7;
        }
    }

    private final byte[] zzM(int i7, boolean z4) throws IOException {
        byte[] bArrZzN = zzN(i7);
        if (bArrZzN != null) {
            return bArrZzN;
        }
        int i8 = this.zzi;
        int i9 = this.zzg;
        int i10 = i9 - i8;
        this.zzk += i9;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, i8, bArr, 0, i10);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i10, length);
            i10 += length;
        }
        return bArr;
    }

    private final byte[] zzN(int i7) throws IOException {
        if (i7 == 0) {
            return zzla.zzb;
        }
        int i8 = this.zzk;
        int i9 = this.zzi;
        int i10 = i8 + i9 + i7;
        if ((-2147483647) + i10 > 0) {
            throw zzlc.zzh();
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            zzB((i11 - i8) - i9);
            throw zzlc.zzi();
        }
        int i12 = this.zzg - i9;
        int i13 = i7 - i12;
        if (i13 >= 4096) {
            try {
                if (i13 > this.zze.available()) {
                    return null;
                }
            } catch (zzlc e7) {
                e7.zzj();
                throw e7;
            }
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i12);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i12 < i7) {
            try {
                int i14 = this.zze.read(bArr, i12, i7 - i12);
                if (i14 == -1) {
                    throw zzlc.zzi();
                }
                this.zzk += i14;
                i12 += i14;
            } catch (zzlc e8) {
                e8.zzj();
                throw e8;
            }
        }
        return bArr;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzA(int i7) {
        this.zzl = i7;
        zzJ();
    }

    public final void zzB(int i7) throws zzlc {
        int i8 = this.zzg;
        int i9 = this.zzi;
        int i10 = i8 - i9;
        if (i7 <= i10 && i7 >= 0) {
            this.zzi = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw zzlc.zzf();
        }
        int i11 = this.zzk;
        int i12 = i11 + i9;
        int i13 = this.zzl;
        if (i12 + i7 > i13) {
            zzB((i13 - i11) - i9);
            throw zzlc.zzi();
        }
        this.zzk = i12;
        this.zzg = 0;
        this.zzi = 0;
        while (i10 < i7) {
            try {
                long j = i7 - i10;
                try {
                    long jSkip = this.zze.skip(j);
                    if (jSkip < 0 || jSkip > j) {
                        throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i10 += (int) jSkip;
                    }
                } catch (zzlc e7) {
                    e7.zzj();
                    throw e7;
                }
            } catch (Throwable th) {
                this.zzk += i10;
                zzJ();
                throw th;
            }
        }
        this.zzk += i10;
        zzJ();
        if (i10 >= i7) {
            return;
        }
        int i14 = this.zzg;
        int i15 = i14 - this.zzi;
        this.zzi = i14;
        zzK(1);
        while (true) {
            int i16 = i7 - i15;
            int i17 = this.zzg;
            if (i16 <= i17) {
                this.zzi = i16;
                return;
            } else {
                i15 += i17;
                this.zzi = i17;
                zzK(1);
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzC() {
        return this.zzi == this.zzg && !zzL(1);
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzD() {
        return zzr() != 0;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzE(int i7) throws zzlc {
        int iZzm;
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i9 < 10) {
                    if (zza() < 0) {
                        i9++;
                    }
                }
                throw zzlc.zze();
            }
            while (i9 < 10) {
                byte[] bArr = this.zzf;
                int i10 = this.zzi;
                this.zzi = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw zzlc.zze();
            return true;
        }
        if (i8 == 1) {
            zzB(8);
            return true;
        }
        if (i8 == 2) {
            zzB(zzj());
            return true;
        }
        if (i8 != 3) {
            if (i8 == 4) {
                return false;
            }
            if (i8 != 5) {
                throw zzlc.zza();
            }
            zzB(4);
            return true;
        }
        do {
            iZzm = zzm();
            if (iZzm == 0) {
                break;
            }
        } while (zzE(iZzm));
        zzz(((i7 >>> 3) << 3) | 4);
        return true;
    }

    public final byte zza() throws zzlc {
        if (this.zzi == this.zzg) {
            zzK(1);
        }
        byte[] bArr = this.zzf;
        int i7 = this.zzi;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final double zzb() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final float zzc() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzd() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zze(int i7) throws zzlc {
        if (i7 < 0) {
            throw zzlc.zzf();
        }
        int i8 = this.zzk + this.zzi + i7;
        if (i8 < 0) {
            throw zzlc.zzg();
        }
        int i9 = this.zzl;
        if (i8 > i9) {
            throw zzlc.zzi();
        }
        this.zzl = i8;
        zzJ();
        return i9;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzf() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzg() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzh() {
        return zzj();
    }

    public final int zzi() throws zzlc {
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            zzK(4);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final int zzj() {
        int i7;
        int i8 = this.zzi;
        int i9 = this.zzg;
        if (i9 != i8) {
            byte[] bArr = this.zzf;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.zzi = i10;
                return b7;
            }
            if (i9 - i10 >= 9) {
                int i11 = i8 + 2;
                int i12 = (bArr[i10] << 7) ^ b7;
                if (i12 < 0) {
                    i7 = i12 ^ (-128);
                } else {
                    int i13 = i8 + 3;
                    int i14 = (bArr[i11] << 14) ^ i12;
                    if (i14 >= 0) {
                        i7 = i14 ^ 16256;
                    } else {
                        int i15 = i8 + 4;
                        int i16 = i14 ^ (bArr[i13] << 21);
                        if (i16 < 0) {
                            i7 = (-2080896) ^ i16;
                        } else {
                            i13 = i8 + 5;
                            byte b8 = bArr[i15];
                            int i17 = (i16 ^ (b8 << 28)) ^ 266354560;
                            if (b8 < 0) {
                                i15 = i8 + 6;
                                if (bArr[i13] < 0) {
                                    i13 = i8 + 7;
                                    if (bArr[i15] < 0) {
                                        i15 = i8 + 8;
                                        if (bArr[i13] < 0) {
                                            i13 = i8 + 9;
                                            if (bArr[i15] < 0) {
                                                int i18 = i8 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i11 = i18;
                                                    i7 = i17;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i17;
                            }
                            i7 = i17;
                        }
                        i11 = i15;
                    }
                    i11 = i13;
                }
                this.zzi = i11;
                return i7;
            }
        }
        return (int) zzs();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzk() {
        return zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzl() {
        return zzjb.zzF(zzj());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzm() throws zzlc {
        if (zzC()) {
            this.zzj = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzj = iZzj;
        if ((iZzj >>> 3) != 0) {
            return iZzj;
        }
        throw zzlc.zzc();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zzn() {
        return zzj();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzo() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzp() {
        return zzr();
    }

    public final long zzq() throws zzlc {
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            zzK(8);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 8;
        long j = bArr[i7];
        long j3 = (((long) bArr[i7 + 1]) & 255) << 8;
        long j7 = bArr[i7 + 2];
        long j8 = bArr[i7 + 3];
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (j & 255) | j3 | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j;
        long j3;
        int i7 = this.zzi;
        int i8 = this.zzg;
        if (i8 != i7) {
            byte[] bArr = this.zzf;
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzi = i9;
                return b7;
            }
            if (i8 - i9 >= 9) {
                int i10 = i7 + 2;
                int i11 = (bArr[i9] << 7) ^ b7;
                if (i11 < 0) {
                    j = i11 ^ (-128);
                } else {
                    int i12 = i7 + 3;
                    int i13 = (bArr[i10] << 14) ^ i11;
                    if (i13 >= 0) {
                        j = i13 ^ 16256;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j7 = (-2080896) ^ i15;
                            i10 = i14;
                            j = j7;
                        } else {
                            i12 = i7 + 5;
                            long j8 = (((long) bArr[i14]) << 28) ^ ((long) i15);
                            if (j8 >= 0) {
                                j = j8 ^ 266354560;
                            } else {
                                i10 = i7 + 6;
                                long j9 = (((long) bArr[i12]) << 35) ^ j8;
                                if (j9 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i16 = i7 + 7;
                                    long j10 = j9 ^ (((long) bArr[i10]) << 42);
                                    if (j10 >= 0) {
                                        j = j10 ^ 4363953127296L;
                                    } else {
                                        i10 = i7 + 8;
                                        j9 = j10 ^ (((long) bArr[i16]) << 49);
                                        if (j9 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i16 = i7 + 9;
                                            long j11 = (j9 ^ (((long) bArr[i10]) << 56)) ^ 71499008037633920L;
                                            if (j11 < 0) {
                                                i10 = i7 + 10;
                                                if (bArr[i16] >= 0) {
                                                    j = j11;
                                                }
                                            } else {
                                                j = j11;
                                            }
                                        }
                                    }
                                    i10 = i16;
                                }
                                j = j9 ^ j3;
                            }
                        }
                    }
                    i10 = i12;
                }
                this.zzi = i10;
                return j;
            }
        }
        return zzs();
    }

    public final long zzs() throws zzlc {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZza = zza();
            j |= ((long) (bZza & 127)) << i7;
            if ((bZza & 128) == 0) {
                return j;
            }
        }
        throw zzlc.zze();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzt() {
        return zzq();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzu() {
        return zzjb.zzG(zzr());
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final long zzv() {
        return zzr();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final zziv zzw() throws IOException {
        int iZzj = zzj();
        int i7 = this.zzg;
        int i8 = this.zzi;
        if (iZzj <= i7 - i8 && iZzj > 0) {
            zziv zzivVarZzk = zziv.zzk(this.zzf, i8, iZzj);
            this.zzi += iZzj;
            return zzivVarZzk;
        }
        if (iZzj == 0) {
            return zziv.zzb;
        }
        if (iZzj < 0) {
            throw zzlc.zzf();
        }
        byte[] bArrZzN = zzN(iZzj);
        if (bArrZzN != null) {
            return zziv.zzk(bArrZzN, 0, bArrZzN.length);
        }
        int i9 = this.zzi;
        int i10 = this.zzg;
        int i11 = i10 - i9;
        this.zzk += i10;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> listZzI = zzI(iZzj - i11);
        byte[] bArr = new byte[iZzj];
        System.arraycopy(this.zzf, i9, bArr, 0, i11);
        for (byte[] bArr2 : listZzI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i11, length);
            i11 += length;
        }
        return new zziu(bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzx() throws zzlc {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (iZzj <= i7 - i8) {
                String str = new String(this.zzf, i8, iZzj, zzla.zza);
                this.zzi += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzlc.zzf();
        }
        if (iZzj > this.zzg) {
            return new String(zzM(iZzj, false), zzla.zza);
        }
        zzK(iZzj);
        String str2 = new String(this.zzf, this.zzi, iZzj, zzla.zza);
        this.zzi += iZzj;
        return str2;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzy() throws IOException {
        byte[] bArrZzM;
        int iZzj = zzj();
        int i7 = this.zzi;
        int i8 = this.zzg;
        if (iZzj <= i8 - i7 && iZzj > 0) {
            bArrZzM = this.zzf;
            this.zzi = i7 + iZzj;
        } else {
            if (iZzj == 0) {
                return "";
            }
            if (iZzj < 0) {
                throw zzlc.zzf();
            }
            i7 = 0;
            if (iZzj <= i8) {
                zzK(iZzj);
                bArrZzM = this.zzf;
                this.zzi = iZzj;
            } else {
                bArrZzM = zzM(iZzj, false);
            }
        }
        return zznl.zzd(bArrZzM, i7, iZzj);
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzz(int i7) throws zzlc {
        if (this.zzj != i7) {
            throw zzlc.zzb();
        }
    }
}
