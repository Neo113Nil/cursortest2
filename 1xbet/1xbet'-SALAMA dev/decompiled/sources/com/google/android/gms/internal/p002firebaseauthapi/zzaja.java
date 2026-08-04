package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
final class zzaja extends zzajb {
    private final byte[] zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;

    private final long zzaa() {
        long j;
        long j3;
        long j7;
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
                        i10 = i12;
                    } else {
                        int i14 = i7 + 4;
                        int i15 = i13 ^ (bArr[i12] << 21);
                        if (i15 < 0) {
                            long j8 = (-2080896) ^ i15;
                            i10 = i14;
                            j = j8;
                        } else {
                            long j9 = i15;
                            i10 = i7 + 5;
                            long j10 = j9 ^ (((long) bArr[i14]) << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                int i16 = i7 + 6;
                                long j11 = j10 ^ (((long) bArr[i10]) << 35);
                                if (j11 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j10 = j11 ^ (((long) bArr[i16]) << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j11 = j10 ^ (((long) bArr[i10]) << 49);
                                        if (j11 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j12 = (j11 ^ (((long) bArr[i16]) << 56)) ^ 71499008037633920L;
                                            if (j12 < 0) {
                                                int i17 = i7 + 10;
                                                if (bArr[i10] >= 0) {
                                                    i10 = i17;
                                                }
                                            }
                                            j = j12;
                                        }
                                    }
                                }
                                j = j11 ^ j3;
                                i10 = i16;
                            }
                            j = j10 ^ j7;
                        }
                    }
                }
                this.zzh = i10;
                return j;
            }
        }
        return zzm();
    }

    private final void zzab() {
        int i7 = this.zzf + this.zzg;
        this.zzf = i7;
        int i8 = i7 - this.zzi;
        int i9 = this.zzk;
        if (i8 <= i9) {
            this.zzg = 0;
            return;
        }
        int i10 = i8 - i9;
        this.zzg = i10;
        this.zzf = i7 - i10;
    }

    private final byte zzw() throws zzakf {
        int i7 = this.zzh;
        if (i7 == this.zzf) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 1;
        return bArr[i7];
    }

    private final int zzx() throws zzakf {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    private final int zzy() {
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
        return (int) zzm();
    }

    private final long zzz() throws zzakf {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            throw zzakf.zzj();
        }
        byte[] bArr = this.zze;
        this.zzh = i7 + 8;
        return ((((long) bArr[i7 + 7]) & 255) << 56) | (((long) bArr[i7]) & 255) | ((((long) bArr[i7 + 1]) & 255) << 8) | ((((long) bArr[i7 + 2]) & 255) << 16) | ((((long) bArr[i7 + 3]) & 255) << 24) | ((((long) bArr[i7 + 4]) & 255) << 32) | ((((long) bArr[i7 + 5]) & 255) << 40) | ((((long) bArr[i7 + 6]) & 255) << 48);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final double zza() {
        return Double.longBitsToDouble(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final float zzb() {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzd() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zze() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzf() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzg() {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzh() {
        return zzajb.zze(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzi() throws zzakf {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int iZzy = zzy();
        this.zzj = iZzy;
        if ((iZzy >>> 3) != 0) {
            return iZzy;
        }
        throw zzakf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzj() {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzk() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzl() {
        return zzaa();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzm() throws zzakf {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZzw = zzw();
            j |= ((long) (bZzw & 127)) << i7;
            if ((bZzw & 128) == 0) {
                return j;
            }
        }
        throw zzakf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzn() {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzo() {
        return zzajb.zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzp() {
        return zzaa();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0031 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0041  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final zzaip zzq() throws zzakf {
        byte[] bArrCopyOfRange;
        int iZzy = zzy();
        if (iZzy > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzy <= i7 - i8) {
                zzaip zzaipVarZza = zzaip.zza(this.zze, i8, iZzy);
                this.zzh += iZzy;
                return zzaipVarZza;
            }
        }
        if (iZzy == 0) {
            return zzaip.zza;
        }
        if (iZzy > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (iZzy <= i9 - i10) {
                int i11 = iZzy + i10;
                this.zzh = i11;
                bArrCopyOfRange = Arrays.copyOfRange(this.zze, i10, i11);
            } else {
                if (iZzy <= 0) {
                    throw zzakf.zzj();
                }
                if (iZzy == 0) {
                    throw zzakf.zzf();
                }
                bArrCopyOfRange = zzakb.zzb;
            }
        } else {
            if (iZzy <= 0) {
                throw zzakf.zzj();
            }
            if (iZzy == 0) {
                throw zzakf.zzf();
            }
            bArrCopyOfRange = zzakb.zzb;
        }
        return zzaip.zzb(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() throws zzakf {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzy <= i7 - i8) {
                String str = new String(this.zze, i8, iZzy, zzakb.zza);
                this.zzh += iZzy;
                return str;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy < 0) {
            throw zzakf.zzf();
        }
        throw zzakf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() throws zzakf {
        int iZzy = zzy();
        if (iZzy > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (iZzy <= i7 - i8) {
                String strZzb = zzamt.zzb(this.zze, i8, iZzy);
                this.zzh += iZzy;
                return strZzb;
            }
        }
        if (iZzy == 0) {
            return "";
        }
        if (iZzy <= 0) {
            throw zzakf.zzf();
        }
        throw zzakf.zzj();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() {
        return zzaa() != 0;
    }

    private zzaja(byte[] bArr, int i7, int i8, boolean z4) {
        super();
        this.zzk = f.API_PRIORITY_OTHER;
        this.zze = bArr;
        this.zzf = i8 + i7;
        this.zzh = i7;
        this.zzi = i7;
    }

    private final void zzf(int i7) throws zzakf {
        if (i7 >= 0) {
            int i8 = this.zzf;
            int i9 = this.zzh;
            if (i7 <= i8 - i9) {
                this.zzh = i9 + i7;
                return;
            }
        }
        if (i7 >= 0) {
            throw zzakf.zzj();
        }
        throw zzakf.zzf();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zza(int i7) throws zzakf {
        if (i7 < 0) {
            throw zzakf.zzf();
        }
        int iZzc = i7 + zzc();
        if (iZzc < 0) {
            throw zzakf.zzg();
        }
        int i8 = this.zzk;
        if (iZzc > i8) {
            throw zzakf.zzj();
        }
        this.zzk = iZzc;
        zzab();
        return i8;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzb(int i7) throws zzakf {
        if (this.zzj != i7) {
            throw zzakf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i7) {
        this.zzk = i7;
        zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzd(int i7) throws zzakf {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zzf - this.zzh < 10) {
                while (i9 < 10) {
                    if (zzw() < 0) {
                        i9++;
                    }
                }
                throw zzakf.zze();
            }
            while (i9 < 10) {
                byte[] bArr = this.zze;
                int i10 = this.zzh;
                this.zzh = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i8 == 1) {
            zzf(8);
            return true;
        }
        if (i8 == 2) {
            zzf(zzy());
            return true;
        }
        if (i8 == 3) {
            zzv();
            zzb(((i7 >>> 3) << 3) | 4);
            return true;
        }
        if (i8 == 4) {
            return false;
        }
        if (i8 != 5) {
            throw zzakf.zza();
        }
        zzf(4);
        return true;
    }
}
