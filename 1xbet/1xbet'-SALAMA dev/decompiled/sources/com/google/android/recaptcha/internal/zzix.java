package com.google.android.recaptcha.internal;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzix extends zzjb {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;

    public /* synthetic */ zzix(byte[] bArr, int i7, int i8, boolean z4, zziw zziwVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = 0;
        this.zzh = 0;
    }

    private final void zzI() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i8 = this.zzj;
        if (i7 <= i8) {
            this.zzg = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzg = i9;
        this.zzf = i7 - i9;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzA(int i7) {
        this.zzj = i7;
        zzI();
    }

    public final void zzB(int i7) throws zzlc {
        if (i7 >= 0) {
            int i8 = this.zzf;
            int i9 = this.zzh;
            if (i7 <= i8 - i9) {
                this.zzh = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw zzlc.zzi();
        }
        throw zzlc.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final boolean zzC() {
        return this.zzh == this.zzf;
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
            if (this.zzf - this.zzh < 10) {
                while (i9 < 10) {
                    if (zza() < 0) {
                        i9++;
                    }
                }
                throw zzlc.zze();
            }
            while (i9 < 10) {
                byte[] bArr = this.zze;
                int i10 = this.zzh;
                this.zzh = i10 + 1;
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
        int i7 = this.zzh;
        if (i7 == this.zzf) {
            throw zzlc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 1;
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
        return this.zzh;
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final int zze(int i7) {
        if (i7 < 0) {
            throw zzlc.zzf();
        }
        int i8 = i7 + this.zzh;
        if (i8 < 0) {
            throw zzlc.zzg();
        }
        int i9 = this.zzj;
        if (i8 > i9) {
            throw zzlc.zzi();
        }
        this.zzj = i8;
        zzI();
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
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            throw zzlc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final int zzj() {
        int i7;
        int i8 = this.zzh;
        int i9 = this.zzf;
        if (i9 != i8) {
            byte[] bArr = this.zze;
            int i10 = i8 + 1;
            byte b7 = bArr[i8];
            if (b7 >= 0) {
                this.zzh = i10;
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
                this.zzh = i11;
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
            this.zzi = 0;
            return 0;
        }
        int iZzj = zzj();
        this.zzi = iZzj;
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
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            throw zzlc.zzi();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        long j = bArr[i7];
        long j3 = (((long) bArr[i7 + 1]) & 255) << 8;
        long j7 = bArr[i7 + 2];
        long j8 = bArr[i7 + 3];
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (j & 255) | j3 | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzr() {
        long j;
        long j3;
        int i7 = this.zzh;
        int i8 = this.zzf;
        if (i8 != i7) {
            byte[] bArr = this.zze;
            int i9 = i7 + 1;
            byte b7 = bArr[i7];
            if (b7 >= 0) {
                this.zzh = i9;
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
                this.zzh = i10;
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
    public final zziv zzw() throws zzlc {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzj <= i7 - i8) {
                zziv zzivVarZzk = zziv.zzk(this.zze, i8, iZzj);
                this.zzh += iZzj;
                return zzivVarZzk;
            }
        }
        if (iZzj == 0) {
            return zziv.zzb;
        }
        if (iZzj > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (iZzj <= i9 - i10) {
                int i11 = iZzj + i10;
                this.zzh = i11;
                return new zziu(Arrays.copyOfRange(this.zze, i10, i11));
            }
        }
        if (iZzj <= 0) {
            throw zzlc.zzf();
        }
        throw zzlc.zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzx() throws zzlc {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzj <= i7 - i8) {
                String str = new String(this.zze, i8, iZzj, zzla.zza);
                this.zzh += iZzj;
                return str;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj < 0) {
            throw zzlc.zzf();
        }
        throw zzlc.zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final String zzy() throws zzlc {
        int iZzj = zzj();
        if (iZzj > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzj <= i7 - i8) {
                String strZzd = zznl.zzd(this.zze, i8, iZzj);
                this.zzh += iZzj;
                return strZzd;
            }
        }
        if (iZzj == 0) {
            return "";
        }
        if (iZzj <= 0) {
            throw zzlc.zzf();
        }
        throw zzlc.zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzjb
    public final void zzz(int i7) throws zzlc {
        if (this.zzi != i7) {
            throw zzlc.zzb();
        }
    }
}
