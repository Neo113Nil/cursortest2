package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzieo extends zzier {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;

    zzieo(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
        }
        this.zzb = bArr;
        this.zzd = 0;
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzidz
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzv(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzb(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzc(int i, int i2) throws IOException {
        zzr(i << 3);
        zzq(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzd(int i, int i2) throws IOException {
        zzr(i << 3);
        zzr(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zze(int i, int i2) throws IOException {
        zzr((i << 3) | 5);
        zzs(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzf(int i, long j) throws IOException {
        zzr(i << 3);
        zzt(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzg(int i, long j) throws IOException {
        zzr((i << 3) | 1);
        zzu(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzh(int i, boolean z) throws IOException {
        zzr(i << 3);
        zzp(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzi(int i, String str) throws IOException {
        zzr((i << 3) | 2);
        zzw(str);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzj(int i, zziei zzieiVar) throws IOException {
        zzr((i << 3) | 2);
        zzk(zzieiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzk(zziei zzieiVar) throws IOException {
        zzr(zzieiVar.zzb());
        zzieiVar.zzg(this);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzl(byte[] bArr, int i, int i2) throws IOException {
        zzr(i2);
        zzv(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzm(int i, zzigw zzigwVar) throws IOException {
        zzr(11);
        zzd(2, i);
        zzr(26);
        zzo(zzigwVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzn(int i, zziei zzieiVar) throws IOException {
        zzr(11);
        zzd(2, i);
        zzj(3, zzieiVar);
        zzr(12);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzo(zzigw zzigwVar) throws IOException {
        zzr(zzigwVar.zzbr());
        zzigwVar.zzcX(this);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzp(byte b) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i = this.zzd;
        try {
            int i2 = i + 1;
            try {
                this.zzb[i] = b;
                this.zzd = i2;
            } catch (IndexOutOfBoundsException e) {
                indexOutOfBoundsException = e;
                i = i2;
                throw new zziep(i, this.zzc, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e2) {
            indexOutOfBoundsException = e2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzq(int i) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        if (i >= 0) {
            zzr(i);
            return;
        }
        int i2 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            long j = i;
            int i3 = i2 + 1;
            try {
                bArr[i2] = (byte) (((int) j) | 128);
                int i4 = i2 + 2;
                try {
                    bArr[i3] = (byte) (((int) (j >>> 7)) | 128);
                    int i5 = i2 + 3;
                    bArr[i4] = (byte) (((int) (j >>> 14)) | 128);
                    i4 = i2 + 4;
                    bArr[i5] = (byte) (((int) (j >>> 21)) | 128);
                    int i6 = i2 + 5;
                    bArr[i4] = (byte) (((int) (j >>> 28)) | 128);
                    int i7 = i2 + 6;
                    try {
                        bArr[i6] = -1;
                        int i8 = i2 + 7;
                        bArr[i7] = -1;
                        i7 = i2 + 8;
                        bArr[i8] = -1;
                        i3 = i2 + 9;
                        bArr[i7] = -1;
                        i2 += 10;
                        bArr[i3] = 1;
                        this.zzd = i2;
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i2 = i7;
                        throw new zziep(i2, this.zzc, 10, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i2 = i4;
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i2 = i3;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x006c: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r2 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:47:0x006b */
    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzr(int i) throws IOException {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i2;
        int i3 = this.zzd;
        try {
            try {
                if ((i & RangingPosition.RSSI_UNKNOWN) == 0) {
                    int i4 = i3 + 1;
                    this.zzb[i3] = (byte) i;
                    this.zzd = i4;
                    return;
                }
                byte[] bArr = this.zzb;
                int i5 = i3 + 1;
                bArr[i3] = (byte) (i | 128);
                int i6 = i >>> 7;
                if ((i6 & RangingPosition.RSSI_UNKNOWN) == 0) {
                    int i7 = i3 + 2;
                    bArr[i5] = (byte) i6;
                    this.zzd = i7;
                    return;
                }
                int i8 = i3 + 2;
                try {
                    bArr[i5] = (byte) (i6 | 128);
                    int i9 = i >>> 14;
                    if ((i9 & RangingPosition.RSSI_UNKNOWN) == 0) {
                        int i10 = i3 + 3;
                        bArr[i8] = (byte) i9;
                        this.zzd = i10;
                        return;
                    }
                    int i11 = i3 + 3;
                    try {
                        bArr[i8] = (byte) (i9 | 128);
                        int i12 = i >>> 21;
                        if ((i12 & RangingPosition.RSSI_UNKNOWN) == 0) {
                            int i13 = i3 + 4;
                            bArr[i11] = (byte) i12;
                            this.zzd = i13;
                        } else {
                            i8 = i3 + 4;
                            bArr[i11] = (byte) (i12 | 128);
                            int i14 = i3 + 5;
                            bArr[i8] = (byte) (i >>> 28);
                            this.zzd = i14;
                        }
                    } catch (IndexOutOfBoundsException e) {
                        indexOutOfBoundsException = e;
                        i3 = i11;
                        throw new zziep(i3, this.zzc, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e2) {
                    indexOutOfBoundsException = e2;
                    i3 = i8;
                }
            } catch (IndexOutOfBoundsException e3) {
                indexOutOfBoundsException = e3;
                i3 = i2;
            }
        } catch (IndexOutOfBoundsException e4) {
            indexOutOfBoundsException = e4;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzs(int i) throws IOException {
        int i2 = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i2] = (byte) i;
            bArr[i2 + 1] = (byte) (i >> 8);
            bArr[i2 + 2] = (byte) (i >> 16);
            bArr[i2 + 3] = (byte) (i >> 24);
            this.zzd = i2 + 4;
        } catch (IndexOutOfBoundsException e) {
            throw new zziep(i2, this.zzc, 4, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzt(long j) throws IOException {
        long j2 = j & (-128);
        int i = this.zzd;
        try {
            if (j2 == 0) {
                this.zzb[i] = (byte) j;
                this.zzd = i + 1;
                return;
            }
            byte[] bArr = this.zzb;
            bArr[i] = (byte) (((int) j) | 128);
            int i2 = i + 1;
            long j3 = j >>> 7;
            long j4 = j3 & (-128);
            int i3 = (int) j3;
            if (j4 == 0) {
                bArr[i2] = (byte) i3;
                this.zzd = i + 2;
                return;
            }
            bArr[i2] = (byte) (i3 | 128);
            int i4 = i + 2;
            long j5 = j >>> 14;
            long j6 = j5 & (-128);
            int i5 = (int) j5;
            if (j6 == 0) {
                bArr[i4] = (byte) i5;
                this.zzd = i + 3;
                return;
            }
            bArr[i4] = (byte) (i5 | 128);
            int i6 = i + 3;
            long j7 = j >>> 21;
            long j8 = j7 & (-128);
            int i7 = (int) j7;
            if (j8 == 0) {
                bArr[i6] = (byte) i7;
                this.zzd = i + 4;
                return;
            }
            bArr[i6] = (byte) (i7 | 128);
            int i8 = i + 4;
            long j9 = j >>> 28;
            long j10 = j9 & (-128);
            int i9 = (int) j9;
            if (j10 == 0) {
                bArr[i8] = (byte) i9;
                this.zzd = i + 5;
                return;
            }
            bArr[i8] = (byte) (i9 | 128);
            int i10 = i + 5;
            long j11 = j >>> 35;
            long j12 = j11 & (-128);
            int i11 = (int) j11;
            if (j12 == 0) {
                bArr[i10] = (byte) i11;
                this.zzd = i + 6;
                return;
            }
            bArr[i10] = (byte) (i11 | 128);
            int i12 = i + 6;
            long j13 = j >>> 42;
            long j14 = j13 & (-128);
            int i13 = (int) j13;
            if (j14 == 0) {
                bArr[i12] = (byte) i13;
                this.zzd = i + 7;
                return;
            }
            bArr[i12] = (byte) (i13 | 128);
            int i14 = i + 7;
            long j15 = j >>> 49;
            long j16 = j15 & (-128);
            int i15 = (int) j15;
            if (j16 == 0) {
                bArr[i14] = (byte) i15;
                this.zzd = i + 8;
                return;
            }
            bArr[i14] = (byte) (i15 | 128);
            int i16 = i + 8;
            long j17 = j >>> 56;
            int i17 = (int) j17;
            if (((-128) & j17) == 0) {
                bArr[i16] = (byte) i17;
                this.zzd = i + 9;
            } else {
                bArr[i16] = (byte) (i17 | 128);
                bArr[i + 9] = (byte) (j >>> 63);
                this.zzd = i + 10;
            }
        } catch (IndexOutOfBoundsException e) {
            throw new zziep(i, this.zzc, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzu(long j) throws IOException {
        int i = this.zzd;
        try {
            byte[] bArr = this.zzb;
            bArr[i] = (byte) j;
            bArr[i + 1] = (byte) (j >> 8);
            bArr[i + 2] = (byte) (j >> 16);
            bArr[i + 3] = (byte) (j >> 24);
            bArr[i + 4] = (byte) (j >> 32);
            bArr[i + 5] = (byte) (j >> 40);
            bArr[i + 6] = (byte) (j >> 48);
            bArr[i + 7] = (byte) (j >> 56);
            this.zzd = i + 8;
        } catch (IndexOutOfBoundsException e) {
            throw new zziep(i, this.zzc, 8, e);
        }
    }

    public final void zzv(byte[] bArr, int i, int i2) throws IOException {
        try {
            System.arraycopy(bArr, i, this.zzb, this.zzd, i2);
            this.zzd += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zziep(this.zzd, this.zzc, i2, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzw(String str) throws IOException {
        int i = this.zzd;
        try {
            int zzF = zzF(str.length() * 3);
            int zzF2 = zzF(str.length());
            if (zzF2 != zzF) {
                int i2 = zziim.zza;
                zzr(zziij.zzb(str));
                byte[] bArr = this.zzb;
                int i3 = this.zzd;
                this.zzd = zziim.zzc(str, bArr, i3, bArr.length - i3);
                return;
            }
            int i4 = i + zzF2;
            this.zzd = i4;
            byte[] bArr2 = this.zzb;
            int zzc = zziim.zzc(str, bArr2, i4, bArr2.length - i4);
            this.zzd = i;
            zzr((zzc - i) - zzF2);
            this.zzd = zzc;
        } catch (IndexOutOfBoundsException e) {
            throw new zziep(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzx() {
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final int zzy() {
        return this.zzc - this.zzd;
    }
}
