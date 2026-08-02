package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import com.google.android.gms.common.api.f;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
final class zzajd extends zzajb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private final long zzaa() {
        long j;
        long j3;
        long j7;
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
                            long j10 = j9 ^ (bArr[i14] << 28);
                            if (j10 >= 0) {
                                j7 = 266354560;
                            } else {
                                int i16 = i7 + 6;
                                long j11 = j10 ^ (bArr[i10] << 35);
                                if (j11 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    i10 = i7 + 7;
                                    j10 = j11 ^ (bArr[i16] << 42);
                                    if (j10 >= 0) {
                                        j7 = 4363953127296L;
                                    } else {
                                        i16 = i7 + 8;
                                        j11 = j10 ^ (bArr[i10] << 49);
                                        if (j11 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            i10 = i7 + 9;
                                            long j12 = (j11 ^ (bArr[i16] << 56)) ^ 71499008037633920L;
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
                this.zzi = i10;
                return j;
            }
        }
        return zzm();
    }

    private final void zzab() {
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

    private final byte zzw() {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i7 = this.zzi;
        this.zzi = i7 + 1;
        return bArr[i7];
    }

    private final int zzx() {
        int i7 = this.zzi;
        if (this.zzg - i7 < 4) {
            zzg(4);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 4;
        return ((bArr[i7 + 3] & 255) << 24) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16);
    }

    private final int zzy() {
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
        return (int) zzm();
    }

    private final long zzz() {
        int i7 = this.zzi;
        if (this.zzg - i7 < 8) {
            zzg(8);
            i7 = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i7 + 8;
        return ((bArr[i7 + 7] & 255) << 56) | (bArr[i7] & 255) | ((bArr[i7 + 1] & 255) << 8) | ((bArr[i7 + 2] & 255) << 16) | ((bArr[i7 + 3] & 255) << 24) | ((bArr[i7 + 4] & 255) << 32) | ((bArr[i7 + 5] & 255) << 40) | ((bArr[i7 + 6] & 255) << 48);
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
        return this.zzk + this.zzi;
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
    public final int zzi() {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzy = zzy();
        this.zzj = zzy;
        if ((zzy >>> 3) != 0) {
            return zzy;
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
    public final long zzm() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zzw() & 128) == 0) {
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

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final zzaip zzq() {
        int zzy = zzy();
        int i7 = this.zzg;
        int i8 = this.zzi;
        if (zzy <= i7 - i8 && zzy > 0) {
            zzaip zza = zzaip.zza(this.zzf, i8, zzy);
            this.zzi += zzy;
            return zza;
        }
        if (zzy == 0) {
            return zzaip.zza;
        }
        if (zzy < 0) {
            throw zzakf.zzf();
        }
        byte[] zzj = zzj(zzy);
        if (zzj != null) {
            return zzaip.zza(zzj);
        }
        int i9 = this.zzi;
        int i10 = this.zzg;
        int i11 = i10 - i9;
        this.zzk += i10;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf = zzf(zzy - i11);
        byte[] bArr = new byte[zzy];
        System.arraycopy(this.zzf, i9, bArr, 0, i11);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i11, bArr2.length);
            i11 += bArr2.length;
        }
        return zzaip.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() {
        int zzy = zzy();
        if (zzy > 0) {
            int i7 = this.zzg;
            int i8 = this.zzi;
            if (zzy <= i7 - i8) {
                String str = new String(this.zzf, i8, zzy, zzakb.zza);
                this.zzi += zzy;
                return str;
            }
        }
        if (zzy == 0) {
            return "";
        }
        if (zzy < 0) {
            throw zzakf.zzf();
        }
        if (zzy > this.zzg) {
            return new String(zza(zzy, false), zzakb.zza);
        }
        zzg(zzy);
        String str2 = new String(this.zzf, this.zzi, zzy, zzakb.zza);
        this.zzi += zzy;
        return str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() {
        byte[] zza;
        int zzy = zzy();
        int i7 = this.zzi;
        int i8 = this.zzg;
        if (zzy <= i8 - i7 && zzy > 0) {
            zza = this.zzf;
            this.zzi = i7 + zzy;
        } else {
            if (zzy == 0) {
                return "";
            }
            if (zzy < 0) {
                throw zzakf.zzf();
            }
            i7 = 0;
            if (zzy <= i8) {
                zzg(zzy);
                zza = this.zzf;
                this.zzi = zzy;
            } else {
                zza = zza(zzy, false);
            }
        }
        return zzamt.zzb(zza, i7, zzy);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() {
        return this.zzi == this.zzg && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() {
        return zzaa() != 0;
    }

    private zzajd(InputStream inputStream, int i7) {
        super();
        this.zzl = f.API_PRIORITY_OTHER;
        zzakb.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    private static int zza(InputStream inputStream) {
        try {
            return inputStream.available();
        } catch (zzakf e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final List<byte[]> zzf(int i7) {
        ArrayList arrayList = new ArrayList();
        while (i7 > 0) {
            int min = Math.min(i7, 4096);
            byte[] bArr = new byte[min];
            int i8 = 0;
            while (i8 < min) {
                int read = this.zze.read(bArr, i8, min - i8);
                if (read == -1) {
                    throw zzakf.zzj();
                }
                this.zzk += read;
                i8 += read;
            }
            i7 -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private final void zzg(int i7) {
        if (zzi(i7)) {
            return;
        }
        if (i7 <= (this.zzc - this.zzk) - this.zzi) {
            throw zzakf.zzj();
        }
        throw zzakf.zzi();
    }

    private final void zzh(int i7) {
        int i8 = this.zzg;
        int i9 = this.zzi;
        if (i7 <= i8 - i9 && i7 >= 0) {
            this.zzi = i9 + i7;
            return;
        }
        if (i7 < 0) {
            throw zzakf.zzf();
        }
        int i10 = this.zzk;
        int i11 = i10 + i9 + i7;
        int i12 = this.zzl;
        if (i11 > i12) {
            zzh((i12 - i10) - i9);
            throw zzakf.zzj();
        }
        this.zzk = i10 + i9;
        int i13 = i8 - i9;
        this.zzg = 0;
        this.zzi = 0;
        while (i13 < i7) {
            try {
                long j = i7 - i13;
                long zza = zza(this.zze, j);
                if (zza >= 0 && zza <= j) {
                    if (zza == 0) {
                        break;
                    } else {
                        i13 += (int) zza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzk += i13;
                zzab();
            }
        }
        if (i13 >= i7) {
            return;
        }
        int i14 = this.zzg;
        int i15 = i14 - this.zzi;
        this.zzi = i14;
        zzg(1);
        while (true) {
            int i16 = i7 - i15;
            int i17 = this.zzg;
            if (i16 <= i17) {
                this.zzi = i16;
                return;
            } else {
                i15 += i17;
                this.zzi = i17;
                zzg(1);
            }
        }
    }

    private final byte[] zzj(int i7) {
        if (i7 == 0) {
            return zzakb.zzb;
        }
        if (i7 < 0) {
            throw zzakf.zzf();
        }
        int i8 = this.zzk;
        int i9 = this.zzi;
        int i10 = i8 + i9 + i7;
        if (i10 - this.zzc > 0) {
            throw zzakf.zzi();
        }
        int i11 = this.zzl;
        if (i10 > i11) {
            zzh((i11 - i8) - i9);
            throw zzakf.zzj();
        }
        int i12 = this.zzg - i9;
        int i13 = i7 - i12;
        if (i13 >= 4096 && i13 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i12);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i12 < i7) {
            int zza = zza(this.zze, bArr, i12, i7 - i12);
            if (zza == -1) {
                throw zzakf.zzj();
            }
            this.zzk += zza;
            i12 += zza;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzb(int i7) {
        if (this.zzj != i7) {
            throw zzakf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i7) {
        this.zzl = i7;
        zzab();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzd(int i7) {
        int i8 = i7 & 7;
        int i9 = 0;
        if (i8 == 0) {
            if (this.zzg - this.zzi < 10) {
                while (i9 < 10) {
                    if (zzw() < 0) {
                        i9++;
                    }
                }
                throw zzakf.zze();
            }
            while (i9 < 10) {
                byte[] bArr = this.zzf;
                int i10 = this.zzi;
                this.zzi = i10 + 1;
                if (bArr[i10] < 0) {
                    i9++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i8 == 1) {
            zzh(8);
            return true;
        }
        if (i8 == 2) {
            zzh(zzy());
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
        zzh(4);
        return true;
    }

    private final boolean zzi(int i7) {
        do {
            int i8 = this.zzi;
            int i9 = i8 + i7;
            int i10 = this.zzg;
            if (i9 > i10) {
                int i11 = this.zzc;
                int i12 = this.zzk;
                if (i7 > (i11 - i12) - i8 || i12 + i8 + i7 > this.zzl) {
                    return false;
                }
                if (i8 > 0) {
                    if (i10 > i8) {
                        byte[] bArr = this.zzf;
                        System.arraycopy(bArr, i8, bArr, 0, i10 - i8);
                    }
                    this.zzk += i8;
                    this.zzg -= i8;
                    this.zzi = 0;
                }
                InputStream inputStream = this.zze;
                byte[] bArr2 = this.zzf;
                int i13 = this.zzg;
                int zza = zza(inputStream, bArr2, i13, Math.min(bArr2.length - i13, (this.zzc - this.zzk) - i13));
                if (zza == 0 || zza < -1 || zza > this.zzf.length) {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                }
                if (zza <= 0) {
                    return false;
                }
                this.zzg += zza;
                zzab();
            } else {
                throw new IllegalStateException(AbstractC0486a1.f(i7, "refillBuffer() called when ", " bytes were already available in buffer"));
            }
        } while (this.zzg < i7);
        return true;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zza(int i7) {
        if (i7 >= 0) {
            int i8 = this.zzk + this.zzi + i7;
            if (i8 >= 0) {
                int i9 = this.zzl;
                if (i8 <= i9) {
                    this.zzl = i8;
                    zzab();
                    return i9;
                }
                throw zzakf.zzj();
            }
            throw zzakf.zzg();
        }
        throw zzakf.zzf();
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i7, int i8) {
        try {
            return inputStream.read(bArr, i7, i8);
        } catch (zzakf e7) {
            e7.zzk();
            throw e7;
        }
    }

    private static long zza(InputStream inputStream, long j) {
        try {
            return inputStream.skip(j);
        } catch (zzakf e7) {
            e7.zzk();
            throw e7;
        }
    }

    private final byte[] zza(int i7, boolean z4) {
        byte[] zzj = zzj(i7);
        if (zzj != null) {
            return zzj;
        }
        int i8 = this.zzi;
        int i9 = this.zzg;
        int i10 = i9 - i8;
        this.zzk += i9;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf = zzf(i7 - i10);
        byte[] bArr = new byte[i7];
        System.arraycopy(this.zzf, i8, bArr, 0, i10);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i10, bArr2.length);
            i10 += bArr2.length;
        }
        return bArr;
    }
}
