package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgvz extends zzgwe {
    private final byte[] zza;
    private int zzf;
    private int zzg;
    private int zzh;
    private final int zzi;
    private int zzj;
    private int zzk;

    public /* synthetic */ zzgvz(byte[] bArr, int i7, int i8, boolean z4, zzgwd zzgwdVar) {
        super(null);
        this.zzk = f.API_PRIORITY_OTHER;
        this.zza = bArr;
        this.zzf = i8 + i7;
        this.zzh = i7;
        this.zzi = i7;
    }

    private final void zzC() {
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

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzA() {
        return this.zzh == this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzB() {
        return zzq() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final double zza() {
        return Double.longBitsToDouble(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final float zzb() {
        return Float.intBitsToFloat(zzh());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzc() {
        return this.zzh - this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzd(int i7) {
        if (i7 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i8 = (this.zzh - this.zzi) + i7;
        if (i8 < 0) {
            throw new zzgxv("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i9 = this.zzk;
        if (i8 > i9) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzk = i8;
        zzC();
        return i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zze() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzf() {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzg() {
        return zzi();
    }

    public final int zzh() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 4) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzh = i7 + 4;
        int i8 = bArr[i7] & 255;
        int i9 = bArr[i7 + 1] & 255;
        int i10 = bArr[i7 + 2] & 255;
        return ((bArr[i7 + 3] & 255) << 24) | (i9 << 8) | i8 | (i10 << 16);
    }

    public final int zzi() {
        int i7;
        int i8 = this.zzh;
        int i9 = this.zzf;
        if (i9 != i8) {
            byte[] bArr = this.zza;
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
        return (int) zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzj() {
        return zzh();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzk() {
        return zzgwe.zzD(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzl() {
        if (zzA()) {
            this.zzj = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzj = zzi;
        if ((zzi >>> 3) != 0) {
            return zzi;
        }
        throw new zzgxv("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzm() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzn() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzo() {
        return zzq();
    }

    public final long zzp() {
        int i7 = this.zzh;
        if (this.zzf - i7 < 8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.zza;
        this.zzh = i7 + 8;
        long j = bArr[i7];
        long j3 = bArr[i7 + 2];
        long j7 = bArr[i7 + 3];
        return ((bArr[i7 + 7] & 255) << 56) | (j & 255) | ((bArr[i7 + 1] & 255) << 8) | ((j3 & 255) << 16) | ((j7 & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
    }

    public final long zzq() {
        long j;
        long j3;
        int i7 = this.zzh;
        int i8 = this.zzf;
        if (i8 != i7) {
            byte[] bArr = this.zza;
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
                            long j8 = (bArr[i14] << 28) ^ i15;
                            if (j8 >= 0) {
                                j = j8 ^ 266354560;
                            } else {
                                i10 = i7 + 6;
                                long j9 = (bArr[i12] << 35) ^ j8;
                                if (j9 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    int i16 = i7 + 7;
                                    long j10 = j9 ^ (bArr[i10] << 42);
                                    if (j10 >= 0) {
                                        j = j10 ^ 4363953127296L;
                                    } else {
                                        i10 = i7 + 8;
                                        j9 = j10 ^ (bArr[i16] << 49);
                                        if (j9 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i16 = i7 + 9;
                                            long j11 = (j9 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
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
        return zzr();
    }

    public final long zzr() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            int i8 = this.zzh;
            if (i8 == this.zzf) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr = this.zza;
            this.zzh = i8 + 1;
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((bArr[i8] & 128) == 0) {
                return j;
            }
        }
        throw new zzgxv("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzs() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzt() {
        return zzgwe.zzF(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzu() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final zzgvy zzv() {
        int zzi = zzi();
        if (zzi > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzi <= i7 - i8) {
                zzgvy zzv = zzgvy.zzv(this.zza, i8, zzi);
                this.zzh += zzi;
                return zzv;
            }
        }
        if (zzi == 0) {
            return zzgvy.zzb;
        }
        if (zzi > 0) {
            int i9 = this.zzf;
            int i10 = this.zzh;
            if (zzi <= i9 - i10) {
                int i11 = zzi + i10;
                this.zzh = i11;
                byte[] copyOfRange = Arrays.copyOfRange(this.zza, i10, i11);
                zzgvy zzgvyVar = zzgvy.zzb;
                return new zzgvv(copyOfRange);
            }
        }
        if (zzi <= 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzw() {
        int zzi = zzi();
        if (zzi > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzi <= i7 - i8) {
                String str = new String(this.zza, i8, zzi, zzgxt.zza);
                this.zzh += zzi;
                return str;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzx() {
        int zzi = zzi();
        if (zzi > 0) {
            int i7 = this.zzf;
            int i8 = this.zzh;
            if (zzi <= i7 - i8) {
                String zzh = zzhai.zzh(this.zza, i8, zzi);
                this.zzh += zzi;
                return zzh;
            }
        }
        if (zzi == 0) {
            return "";
        }
        if (zzi <= 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzy(int i7) {
        if (this.zzj != i7) {
            throw new zzgxv("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzz(int i7) {
        this.zzk = i7;
        zzC();
    }
}
