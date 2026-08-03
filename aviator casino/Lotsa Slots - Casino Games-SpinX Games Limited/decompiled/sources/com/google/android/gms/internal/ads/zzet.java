package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzet {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final com.google.android.gms.internal.ads.zzgww zzc = com.google.android.gms.internal.ads.zzgww.zzm(java.nio.charset.StandardCharsets.US_ASCII, java.nio.charset.StandardCharsets.UTF_8, java.nio.charset.StandardCharsets.UTF_16, java.nio.charset.StandardCharsets.UTF_16BE, java.nio.charset.StandardCharsets.UTF_16LE);
    private static final java.util.concurrent.atomic.AtomicBoolean zzd = new java.util.concurrent.atomic.AtomicBoolean();
    private byte[] zze;
    private int zzf;
    private int zzg;

    public zzet() {
        this.zze = com.google.android.gms.internal.ads.zzfl.zzb;
    }

    public zzet(byte[] bArr, int i) {
        this.zze = bArr;
        this.zzg = i;
    }

    private final char zzS(java.nio.ByteOrder byteOrder, int i) {
        zzW(2);
        if (byteOrder == java.nio.ByteOrder.BIG_ENDIAN) {
            byte[] bArr = this.zze;
            int i2 = this.zzf + i;
            return com.google.android.gms.internal.ads.zzhad.zza(bArr[i2], bArr[i2 + 1]);
        }
        byte[] bArr2 = this.zze;
        int i3 = this.zzf + i;
        return com.google.android.gms.internal.ads.zzhad.zza(bArr2[i3 + 1], bArr2[i3]);
    }

    private final char zzT(java.nio.charset.Charset charset, char[] cArr) {
        int zzU;
        if (zzd() >= zzV(charset) && (zzU = zzU(charset)) != 0) {
            if (!java.lang.Character.isSupplementaryCodePoint(r1)) {
                long j = r1;
                char c = (char) j;
                com.google.android.gms.internal.ads.zzgtj.zze(((long) c) == j, "Out of range: %s", j);
                for (char c2 : cArr) {
                    if (c2 == c) {
                        this.zzf += com.google.android.gms.internal.ads.zzhah.zza(zzU & 255);
                        return c;
                    }
                }
            }
        }
        return (char) 0;
    }

    private final int zzU(java.nio.charset.Charset charset) {
        int i;
        int i2;
        int m;
        com.google.android.gms.internal.ads.zzgtj.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() < zzV(charset)) {
            int i3 = this.zzf;
            int i4 = this.zzg;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i3).length() + 17 + java.lang.String.valueOf(i4).length());
            sb.append("position=");
            sb.append(i3);
            sb.append(", limit=");
            sb.append(i4);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int i5 = 1;
        if (charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            byte b = this.zze[this.zzf];
            if ((b & 128) == 0) {
                i = com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(b);
                return (i << 8) | i5;
            }
            return 0;
        }
        if (charset.equals(java.nio.charset.StandardCharsets.UTF_8)) {
            byte b2 = this.zze[this.zzf];
            if ((b2 & 128) == 0) {
                i2 = 1;
            } else if ((b2 & 224) == 192 && zzd() >= 2 && zzX(this.zze[this.zzf + 1])) {
                i2 = 2;
            } else {
                if ((this.zze[this.zzf] & 240) == 224 && zzd() >= 3) {
                    byte[] bArr = this.zze;
                    int i6 = this.zzf;
                    if (zzX(bArr[i6 + 1]) && zzX(bArr[i6 + 2])) {
                        i2 = 3;
                    }
                }
                if ((this.zze[this.zzf] & 248) == 240 && zzd() >= 4) {
                    byte[] bArr2 = this.zze;
                    int i7 = this.zzf;
                    if (zzX(bArr2[i7 + 1]) && zzX(bArr2[i7 + 2]) && zzX(bArr2[i7 + 3])) {
                        i2 = 4;
                    }
                }
                i2 = 0;
            }
            if (i2 == 1) {
                m = com.google.android.gms.internal.ads.zzet$$ExternalSyntheticBackport0.m(this.zze[this.zzf]);
            } else if (i2 == 2) {
                byte[] bArr3 = this.zze;
                int i8 = this.zzf;
                m = zzY(0, 0, bArr3[i8], bArr3[i8 + 1]);
            } else {
                if (i2 != 3) {
                    if (i2 == 4) {
                        byte[] bArr4 = this.zze;
                        int i9 = this.zzf;
                        m = zzY(bArr4[i9], bArr4[i9 + 1], bArr4[i9 + 2], bArr4[i9 + 3]);
                    }
                    return 0;
                }
                byte[] bArr5 = this.zze;
                int i10 = this.zzf;
                m = zzY(0, bArr5[i10] & com.google.common.base.Ascii.SI, bArr5[i10 + 1], bArr5[i10 + 2]);
            }
            i5 = i2;
            i = m;
        } else {
            java.nio.ByteOrder byteOrder = charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) ? java.nio.ByteOrder.LITTLE_ENDIAN : java.nio.ByteOrder.BIG_ENDIAN;
            char zzS = zzS(byteOrder, 0);
            if (!java.lang.Character.isHighSurrogate(zzS) || zzd() < 4) {
                i = zzS;
                i5 = 2;
            } else {
                i = java.lang.Character.toCodePoint(zzS, zzS(byteOrder, 2));
                i5 = 4;
            }
        }
        return (i << 8) | i5;
    }

    private static int zzV(java.nio.charset.Charset charset) {
        com.google.android.gms.internal.ads.zzgtj.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        return (charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) ? 1 : 2;
    }

    private final void zzW(int i) {
        if (!zzd.get() || zzd() >= i) {
            return;
        }
        int zzd2 = zzd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 25 + java.lang.String.valueOf(zzd2).length());
        sb.append("bytesNeeded= ");
        sb.append(i);
        sb.append(", bytesLeft=");
        sb.append(zzd2);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    private static boolean zzX(byte b) {
        return (b & 192) == 128;
    }

    private static int zzY(int i, int i2, int i3, int i4) {
        return com.google.android.gms.internal.ads.zzhah.zze((byte) 0, com.google.android.gms.internal.ads.zzhal.zza(((i & 7) << 2) | ((i2 & 48) >> 4)), com.google.android.gms.internal.ads.zzhal.zza(((i3 & 60) >> 2) | ((i2 & 15) << 4)), com.google.android.gms.internal.ads.zzhal.zza((i4 & 63) | ((i3 & 3) << 6)));
    }

    public final long zzA() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        this.zzf = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (255 & j) | ((j2 & 255) << 8) | ((j3 & 255) << 16);
    }

    public final int zzB() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = i + 3;
        int i5 = bArr[i + 2] & 255;
        this.zzf = i + 4;
        return (bArr[i4] & 255) | (i2 << 24) | (i3 << 16) | (i5 << 8);
    }

    public final int zzC() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        this.zzf = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    public final long zzD() {
        zzW(8);
        byte[] bArr = this.zze;
        int i = this.zzf;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.zzf = i + 8;
        return ((j7 & 255) << 8) | ((j & 255) << 56) | ((j2 & 255) << 48) | ((j3 & 255) << 40) | ((j4 & 255) << 32) | ((j5 & 255) << 24) | ((j6 & 255) << 16) | (bArr[i2] & 255);
    }

    public final long zzE() {
        zzW(8);
        byte[] bArr = this.zze;
        int i = this.zzf;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        long j4 = bArr[i + 3];
        long j5 = bArr[i + 4];
        long j6 = bArr[i + 5];
        int i2 = i + 7;
        long j7 = bArr[i + 6];
        this.zzf = i + 8;
        return ((j6 & 255) << 40) | (j & 255) | ((j2 & 255) << 8) | ((j3 & 255) << 16) | ((j4 & 255) << 24) | ((j5 & 255) << 32) | ((j7 & 255) << 48) | ((bArr[i2] & 255) << 56);
    }

    public final int zzF() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        this.zzf = i + 4;
        return (i2 << 8) | i3;
    }

    public final int zzG() {
        return (zzs() << 21) | (zzs() << 14) | (zzs() << 7) | zzs();
    }

    public final int zzH() {
        int zzB = zzB();
        if (zzB >= 0) {
            return zzB;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzB).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(zzB);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final int zzI() {
        int zzC = zzC();
        if (zzC >= 0) {
            return zzC;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzC).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(zzC);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final long zzJ() {
        long zzD = zzD();
        if (zzD >= 0) {
            return zzD;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(zzD).length() + 18);
        sb.append("Top bit not zero: ");
        sb.append(zzD);
        throw new java.lang.IllegalStateException(sb.toString());
    }

    public final java.lang.String zzK(int i, java.nio.charset.Charset charset) {
        zzW(i);
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        java.lang.String str = new java.lang.String(bArr, i2, i, charset);
        this.zzf = i2 + i;
        return str;
    }

    public final java.lang.String zzL(int i) {
        zzW(i);
        if (i == 0) {
            return "";
        }
        int i2 = this.zzf;
        int i3 = (i2 + i) - 1;
        java.lang.String zzk = com.google.android.gms.internal.ads.zzfl.zzk(this.zze, i2, (i3 >= this.zzg || this.zze[i3] != 0) ? i : i - 1);
        this.zzf += i;
        return zzk;
    }

    public final java.lang.String zzM(char c) {
        if (zzd() == 0) {
            return null;
        }
        int i = this.zzf;
        while (i < this.zzg && this.zze[i] != 0) {
            i++;
        }
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        java.lang.String zzk = com.google.android.gms.internal.ads.zzfl.zzk(bArr, i2, i - i2);
        this.zzf = i;
        if (i < this.zzg) {
            this.zzf = i + 1;
        }
        return zzk;
    }

    public final java.lang.String zzN(java.nio.charset.Charset charset) {
        com.google.android.gms.internal.ads.zzgtj.zzf(zzc.contains(charset), "Unsupported charset: %s", charset);
        if (zzd() == 0) {
            return null;
        }
        if (!charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            zzR();
        }
        int i = 1;
        if (!charset.equals(java.nio.charset.StandardCharsets.UTF_8) && !charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) {
            i = 2;
            if (!charset.equals(java.nio.charset.StandardCharsets.UTF_16) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16LE) && !charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                java.lang.String valueOf = java.lang.String.valueOf(charset);
                java.lang.String.valueOf(valueOf);
                throw new java.lang.IllegalArgumentException("Unsupported charset: ".concat(java.lang.String.valueOf(valueOf)));
            }
        }
        int i2 = this.zzf;
        while (true) {
            int i3 = this.zzg;
            if (i2 >= i3 - (i - 1)) {
                i2 = i3;
                break;
            }
            if ((charset.equals(java.nio.charset.StandardCharsets.UTF_8) || charset.equals(java.nio.charset.StandardCharsets.US_ASCII)) && com.google.android.gms.internal.ads.zzfl.zzl(this.zze[i2])) {
                break;
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16) || charset.equals(java.nio.charset.StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.zze;
                if (bArr[i2] == 0 && com.google.android.gms.internal.ads.zzfl.zzl(bArr[i2 + 1])) {
                    break;
                }
            }
            if (charset.equals(java.nio.charset.StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.zze;
                if (bArr2[i2 + 1] == 0 && com.google.android.gms.internal.ads.zzfl.zzl(bArr2[i2])) {
                    break;
                }
            }
            i2 += i;
        }
        java.lang.String zzK = zzK(i2 - this.zzf, charset);
        if (this.zzf != this.zzg && zzT(charset, zza) == '\r') {
            zzT(charset, zzb);
        }
        return zzK;
    }

    public final long zzO() {
        int i;
        zzW(1);
        long j = this.zze[this.zzf];
        int i2 = 7;
        while (true) {
            i = 0;
            if (i2 < 0) {
                break;
            }
            if (((1 << i2) & j) != 0) {
                i2--;
            } else if (i2 < 6) {
                j &= r7 - 1;
                i = 7 - i2;
            } else if (i2 == 7) {
                i = 1;
            }
        }
        if (i == 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 35);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j);
            throw new java.lang.NumberFormatException(sb.toString());
        }
        zzW(i);
        for (int i3 = 1; i3 < i; i3++) {
            if ((this.zze[this.zzf + i3] & 192) != 128) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder(java.lang.String.valueOf(j).length() + 42);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j);
                throw new java.lang.NumberFormatException(sb2.toString());
            }
            j = (j << 6) | (r3 & 63);
        }
        this.zzf += i;
        return j;
    }

    public final void zzQ() {
        while ((zzs() & 128) != 0) {
        }
    }

    public final java.nio.charset.Charset zzR() {
        if (zzd() >= 3) {
            byte[] bArr = this.zze;
            int i = this.zzf;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.zzf = i + 3;
                return java.nio.charset.StandardCharsets.UTF_8;
            }
        }
        if (zzd() < 2) {
            return null;
        }
        byte[] bArr2 = this.zze;
        int i2 = this.zzf;
        byte b = bArr2[i2];
        if (b == -2) {
            if (bArr2[i2 + 1] != -1) {
                return null;
            }
            this.zzf = i2 + 2;
            return java.nio.charset.StandardCharsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.zzf = i2 + 2;
        return java.nio.charset.StandardCharsets.UTF_16LE;
    }

    public final void zza(int i) {
        byte[] bArr = this.zze;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzb(bArr, i);
    }

    public final void zzb(byte[] bArr, int i) {
        this.zze = bArr;
        this.zzg = i;
        this.zzf = 0;
    }

    public final void zzc(int i) {
        byte[] bArr = this.zze;
        if (i > bArr.length) {
            this.zze = java.util.Arrays.copyOf(bArr, i);
        }
    }

    public final int zzd() {
        return java.lang.Math.max(this.zzg - this.zzf, 0);
    }

    public final int zze() {
        return this.zzg;
    }

    public final void zzf(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zze.length) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzg = i;
    }

    public final int zzg() {
        return this.zzf;
    }

    public final void zzh(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzg) {
            z = true;
        }
        com.google.android.gms.internal.ads.zzgtj.zza(z);
        this.zzf = i;
    }

    public final byte[] zzi() {
        return this.zze;
    }

    public final int zzj() {
        return this.zze.length;
    }

    public final void zzk(int i) {
        zzh(this.zzf + i);
    }

    public final void zzl(com.google.android.gms.internal.ads.zzes zzesVar, int i) {
        zzm(zzesVar.zza, 0, i);
        zzesVar.zzf(0);
    }

    public final void zzm(byte[] bArr, int i, int i2) {
        zzW(i2);
        java.lang.System.arraycopy(this.zze, this.zzf, bArr, i, i2);
        this.zzf += i2;
    }

    public final int zzn() {
        zzW(1);
        return this.zze[this.zzf] & 255;
    }

    public final char zzo() {
        return zzS(java.nio.ByteOrder.BIG_ENDIAN, 0);
    }

    public final int zzp(java.nio.charset.Charset charset) {
        if (zzU(charset) != 0) {
            return com.google.android.gms.internal.ads.zzhah.zza(r3 >>> 8);
        }
        return 1114112;
    }

    public final int zzq() {
        if (zzd() >= 3) {
            this.zzf -= 3;
            return zzx();
        }
        int i = this.zzf;
        int i2 = this.zzg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 17 + java.lang.String.valueOf(i2).length());
        sb.append("position=");
        sb.append(i);
        sb.append(", limit=");
        sb.append(i2);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final int zzr() {
        if (zzd() >= 4) {
            this.zzf -= 4;
            return zzB();
        }
        int i = this.zzf;
        int i2 = this.zzg;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i).length() + 17 + java.lang.String.valueOf(i2).length());
        sb.append("position=");
        sb.append(i);
        sb.append(", limit=");
        sb.append(i2);
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final int zzs() {
        zzW(1);
        byte[] bArr = this.zze;
        int i = this.zzf;
        this.zzf = i + 1;
        return bArr[i] & 255;
    }

    public final int zzt() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return (bArr[i2] & 255) | (i3 << 8);
    }

    public final int zzu() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final short zzv() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return (short) ((bArr[i2] & 255) | (i3 << 8));
    }

    public final short zzw() {
        zzW(2);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.zzf = i + 2;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public final int zzx() {
        zzW(3);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = i + 2;
        int i4 = bArr[i + 1] & 255;
        this.zzf = i + 3;
        return (bArr[i3] & 255) | (i2 << 16) | (i4 << 8);
    }

    public final int zzy() {
        zzW(3);
        byte[] bArr = this.zze;
        int i = this.zzf;
        int i2 = bArr[i] & 255;
        int i3 = i + 2;
        int i4 = bArr[i + 1] & 255;
        this.zzf = i + 3;
        return (bArr[i3] & 255) | ((i2 << 24) >> 8) | (i4 << 8);
    }

    public final long zzz() {
        zzW(4);
        byte[] bArr = this.zze;
        int i = this.zzf;
        long j = bArr[i];
        long j2 = bArr[i + 1];
        long j3 = bArr[i + 2];
        this.zzf = i + 4;
        return (bArr[i + 3] & 255) | ((j & 255) << 24) | ((j2 & 255) << 16) | ((j3 & 255) << 8);
    }

    public zzet(int i) {
        this.zze = new byte[i];
        this.zzg = i;
    }

    public final long zzP() {
        long j = 0;
        for (int i = 0; i < 9; i++) {
            if (this.zzf == this.zzg) {
                throw new java.lang.IllegalStateException("Attempting to read a byte over the limit.");
            }
            long zzs = zzs();
            j |= (127 & zzs) << (i * 7);
            if ((zzs & 128) == 0) {
                break;
            }
        }
        return j;
    }

    public zzet(byte[] bArr) {
        this.zze = bArr;
        this.zzg = bArr.length;
    }
}
