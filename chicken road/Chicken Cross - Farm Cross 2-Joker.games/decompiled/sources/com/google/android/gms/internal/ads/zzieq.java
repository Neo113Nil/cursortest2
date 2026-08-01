package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.uwb.RangingPosition;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzieq extends zzier {
    private final byte[] zzb;
    private final int zzc;
    private int zzd;
    private int zze;
    private final OutputStream zzf;

    zzieq(OutputStream outputStream, int i) {
        super(null);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzf = outputStream;
        if (i < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        byte[] bArr = new byte[Math.max(i, 20)];
        this.zzb = bArr;
        this.zzc = bArr.length;
    }

    private final void zzJ(int i) throws IOException {
        if (this.zzc - this.zzd < i) {
            zzK();
        }
    }

    private final void zzK() throws IOException {
        this.zzf.write(this.zzb, 0, this.zzd);
        this.zzd = 0;
    }

    final void zzA(long j) {
        int i = this.zzd;
        int i2 = i + 1;
        long j2 = j & (-128);
        int i3 = (int) j;
        int i4 = this.zze;
        if (j2 == 0) {
            this.zzb[i] = (byte) i3;
            this.zzd = i2;
            this.zze = i4 + 1;
            return;
        }
        int i5 = i + 2;
        byte[] bArr = this.zzb;
        bArr[i] = (byte) (i3 | 128);
        long j3 = j >>> 7;
        long j4 = j3 & (-128);
        int i6 = (int) j3;
        if (j4 == 0) {
            bArr[i2] = (byte) i6;
            this.zzd = i5;
            this.zze = i4 + 2;
            return;
        }
        int i7 = i + 3;
        bArr[i2] = (byte) (i6 | 128);
        long j5 = j >>> 14;
        long j6 = j5 & (-128);
        int i8 = (int) j5;
        if (j6 == 0) {
            bArr[i5] = (byte) i8;
            this.zzd = i7;
            this.zze = i4 + 3;
            return;
        }
        int i9 = i + 4;
        bArr[i5] = (byte) (i8 | 128);
        long j7 = j >>> 21;
        long j8 = j7 & (-128);
        int i10 = (int) j7;
        if (j8 == 0) {
            bArr[i7] = (byte) i10;
            this.zzd = i9;
            this.zze = i4 + 4;
            return;
        }
        int i11 = i + 5;
        bArr[i7] = (byte) (i10 | 128);
        long j9 = j >>> 28;
        long j10 = j9 & (-128);
        int i12 = (int) j9;
        if (j10 == 0) {
            bArr[i9] = (byte) i12;
            this.zzd = i11;
            this.zze = i4 + 5;
            return;
        }
        int i13 = i + 6;
        bArr[i9] = (byte) (i12 | 128);
        long j11 = j >>> 35;
        long j12 = j11 & (-128);
        int i14 = (int) j11;
        if (j12 == 0) {
            bArr[i11] = (byte) i14;
            this.zzd = i13;
            this.zze = i4 + 6;
            return;
        }
        int i15 = i + 7;
        bArr[i11] = (byte) (i14 | 128);
        long j13 = j >>> 42;
        long j14 = j13 & (-128);
        int i16 = (int) j13;
        if (j14 == 0) {
            bArr[i13] = (byte) i16;
            this.zzd = i15;
            this.zze = i4 + 7;
            return;
        }
        int i17 = i + 8;
        bArr[i13] = (byte) (i16 | 128);
        long j15 = j >>> 49;
        long j16 = j15 & (-128);
        int i18 = (int) j15;
        if (j16 == 0) {
            bArr[i15] = (byte) i18;
            this.zzd = i17;
            this.zze = i4 + 8;
            return;
        }
        int i19 = i + 9;
        bArr[i15] = (byte) (i18 | 128);
        long j17 = j >>> 56;
        int i20 = (int) j17;
        if ((j17 & (-128)) == 0) {
            bArr[i17] = (byte) i20;
            this.zzd = i19;
            this.zze = i4 + 9;
        } else {
            bArr[i17] = (byte) (i20 | 128);
            bArr[i19] = (byte) (j >>> 63);
            this.zzd = i + 10;
            this.zze = i4 + 10;
        }
    }

    final void zzB(int i) {
        int i2 = this.zzd;
        byte[] bArr = this.zzb;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        bArr[i2 + 3] = (byte) (i >> 24);
        this.zzd = i2 + 4;
        this.zze += 4;
    }

    final void zzC(long j) {
        int i = this.zzd;
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
        this.zze += 8;
    }

    public final void zzD(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzc;
        int i4 = this.zzd;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zzb, i4, i2);
            this.zzd += i2;
            this.zze += i2;
            return;
        }
        byte[] bArr2 = this.zzb;
        System.arraycopy(bArr, i, bArr2, i4, i5);
        int i6 = i + i5;
        this.zzd = i3;
        this.zze += i5;
        zzK();
        int i7 = i2 - i5;
        if (i7 <= i3) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.zzd = i7;
        } else {
            this.zzf.write(bArr, i6, i7);
        }
        this.zze += i7;
    }

    @Override // com.google.android.gms.internal.ads.zzidz
    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzD(bArr, i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzb(int i, int i2) throws IOException {
        zzr((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzc(int i, int i2) throws IOException {
        zzJ(20);
        zzz(i << 3);
        if (i2 >= 0) {
            zzz(i2);
        } else {
            zzA(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzd(int i, int i2) throws IOException {
        zzJ(20);
        zzz(i << 3);
        zzz(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zze(int i, int i2) throws IOException {
        zzJ(14);
        zzz((i << 3) | 5);
        zzB(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzf(int i, long j) throws IOException {
        zzJ(20);
        zzz(i << 3);
        zzA(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzg(int i, long j) throws IOException {
        zzJ(18);
        zzz((i << 3) | 1);
        zzC(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzh(int i, boolean z) throws IOException {
        zzJ(11);
        zzz(i << 3);
        zzv(z ? (byte) 1 : (byte) 0);
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
        zzD(bArr, 0, i2);
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
        if (this.zzd == this.zzc) {
            zzK();
        }
        zzv(b);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzq(int i) throws IOException {
        if (i >= 0) {
            zzr(i);
        } else {
            zzt(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzr(int i) throws IOException {
        zzJ(5);
        zzz(i);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzs(int i) throws IOException {
        zzJ(4);
        zzB(i);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzt(long j) throws IOException {
        zzJ(10);
        zzA(j);
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzu(long j) throws IOException {
        zzJ(8);
        zzC(j);
    }

    final void zzv(byte b) {
        byte[] bArr = this.zzb;
        int i = this.zzd;
        bArr[i] = b;
        this.zzd = i + 1;
        this.zze++;
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzw(String str) throws IOException {
        int zzb;
        int length = str.length() * 3;
        int zzF = zzF(length);
        int i = zzF + length;
        int i2 = this.zzc;
        if (i > i2) {
            byte[] bArr = new byte[length];
            int zzc = zziim.zzc(str, bArr, 0, length);
            zzr(zzc);
            zzD(bArr, 0, zzc);
            return;
        }
        if (i > i2 - this.zzd) {
            zzK();
        }
        int zzF2 = zzF(str.length());
        int i3 = this.zzd;
        try {
            if (zzF2 == zzF) {
                int i4 = i3 + zzF2;
                this.zzd = i4;
                int zzc2 = zziim.zzc(str, this.zzb, i4, i2 - i4);
                this.zzd = i3;
                zzb = (zzc2 - i3) - zzF2;
                zzz(zzb);
                this.zzd = zzc2;
            } else {
                int i5 = zziim.zza;
                zzb = zziij.zzb(str);
                zzz(zzb);
                this.zzd = zziim.zzc(str, this.zzb, this.zzd, zzb);
            }
            this.zze += zzb;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zziep(e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final void zzx() throws IOException {
        if (this.zzd > 0) {
            zzK();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzier
    public final int zzy() {
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
    }

    final void zzz(int i) {
        int i2 = this.zzd;
        int i3 = i2 + 1;
        int i4 = i & RangingPosition.RSSI_UNKNOWN;
        int i5 = this.zze;
        if (i4 == 0) {
            this.zzb[i2] = (byte) i;
            this.zzd = i3;
            this.zze = i5 + 1;
            return;
        }
        int i6 = i2 + 2;
        byte[] bArr = this.zzb;
        bArr[i2] = (byte) (i | 128);
        int i7 = i >>> 7;
        if ((i7 & RangingPosition.RSSI_UNKNOWN) == 0) {
            bArr[i3] = (byte) i7;
            this.zzd = i6;
            this.zze = i5 + 2;
            return;
        }
        int i8 = i2 + 3;
        bArr[i3] = (byte) (i7 | 128);
        int i9 = i >>> 14;
        if ((i9 & RangingPosition.RSSI_UNKNOWN) == 0) {
            bArr[i6] = (byte) i9;
            this.zzd = i8;
            this.zze = i5 + 3;
            return;
        }
        int i10 = i2 + 4;
        bArr[i6] = (byte) (i9 | 128);
        int i11 = i >>> 21;
        if ((i11 & RangingPosition.RSSI_UNKNOWN) == 0) {
            bArr[i8] = (byte) i11;
            this.zzd = i10;
            this.zze = i5 + 4;
        } else {
            bArr[i8] = (byte) (i11 | 128);
            bArr[i10] = (byte) (i >>> 28);
            this.zzd = i2 + 5;
            this.zze = i5 + 5;
        }
    }
}
