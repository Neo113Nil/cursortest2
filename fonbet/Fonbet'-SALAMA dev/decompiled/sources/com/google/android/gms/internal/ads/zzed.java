package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import e1.k;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzed {
    private static final char[] zza = {'\r', '\n'};
    private static final char[] zzb = {'\n'};
    private static final zzfwm zzc = zzfwm.zzr(StandardCharsets.US_ASCII, StandardCharsets.UTF_8, StandardCharsets.UTF_16, StandardCharsets.UTF_16BE, StandardCharsets.UTF_16LE);
    private byte[] zzd;
    private int zze;
    private int zzf;

    public zzed(byte[] bArr, int i7) {
        this.zzd = bArr;
        this.zzf = i7;
    }

    private final char zzO(Charset charset, char[] cArr) {
        int zzP = zzP(charset);
        if (zzP != 0) {
            int i7 = zzP >> 16;
            for (char c3 : cArr) {
                char c4 = (char) i7;
                if (c3 == c4) {
                    this.zze += (char) zzP;
                    return c4;
                }
            }
        }
        return (char) 0;
    }

    private final int zzP(Charset charset) {
        byte zza2;
        char zzb2;
        int i7 = 1;
        if (charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) {
            if (this.zzf - this.zze > 0) {
                zza2 = (byte) zzfzh.zza(this.zzd[r2] & 255);
                return (zzfzh.zza(zza2) << 16) + i7;
            }
        }
        if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
            int i8 = this.zzf;
            int i9 = this.zze;
            if (i8 - i9 >= 2) {
                byte[] bArr = this.zzd;
                zzb2 = zzfzh.zzb(bArr[i9], bArr[i9 + 1]);
                zza2 = (byte) zzb2;
                i7 = 2;
                return (zzfzh.zza(zza2) << 16) + i7;
            }
        }
        if (!charset.equals(StandardCharsets.UTF_16LE)) {
            return 0;
        }
        int i10 = this.zzf;
        int i11 = this.zze;
        if (i10 - i11 < 2) {
            return 0;
        }
        byte[] bArr2 = this.zzd;
        zzb2 = zzfzh.zzb(bArr2[i11 + 1], bArr2[i11]);
        zza2 = (byte) zzb2;
        i7 = 2;
        return (zzfzh.zza(zza2) << 16) + i7;
    }

    public final String zzA(int i7) {
        if (i7 == 0) {
            return "";
        }
        int i8 = this.zze;
        int i9 = (i8 + i7) - 1;
        String zzC = zzen.zzC(this.zzd, i8, (i9 >= this.zzf || this.zzd[i9] != 0) ? i7 : i7 - 1);
        this.zze += i7;
        return zzC;
    }

    public final String zzB(int i7, Charset charset) {
        byte[] bArr = this.zzd;
        int i8 = this.zze;
        String str = new String(bArr, i8, i7, charset);
        this.zze = i8 + i7;
        return str;
    }

    public final Charset zzC() {
        int i7 = this.zzf;
        int i8 = this.zze;
        int i9 = i7 - i8;
        if (i9 >= 3) {
            byte[] bArr = this.zzd;
            if (bArr[i8] == -17 && bArr[i8 + 1] == -69 && bArr[i8 + 2] == -65) {
                this.zze = i8 + 3;
                return StandardCharsets.UTF_8;
            }
        }
        if (i9 < 2) {
            return null;
        }
        byte[] bArr2 = this.zzd;
        byte b7 = bArr2[i8];
        if (b7 == -2) {
            if (bArr2[i8 + 1] != -1) {
                return null;
            }
            this.zze = i8 + 2;
            return StandardCharsets.UTF_16BE;
        }
        if (b7 != -1 || bArr2[i8 + 1] != -2) {
            return null;
        }
        this.zze = i8 + 2;
        return StandardCharsets.UTF_16LE;
    }

    public final short zzD() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        this.zze = i7 + 2;
        return (short) (((bArr[i8] & 255) << 8) | i9);
    }

    public final short zzE() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        this.zze = i7 + 2;
        return (short) ((bArr[i8] & 255) | (i9 << 8));
    }

    public final void zzF(int i7) {
        byte[] bArr = this.zzd;
        if (i7 > bArr.length) {
            this.zzd = Arrays.copyOf(bArr, i7);
        }
    }

    public final void zzG(zzec zzecVar, int i7) {
        zzH(zzecVar.zza, 0, i7);
        zzecVar.zzl(0);
    }

    public final void zzH(byte[] bArr, int i7, int i8) {
        System.arraycopy(this.zzd, this.zze, bArr, i7, i8);
        this.zze += i8;
    }

    public final void zzI(int i7) {
        byte[] bArr = this.zzd;
        if (bArr.length < i7) {
            bArr = new byte[i7];
        }
        zzJ(bArr, i7);
    }

    public final void zzJ(byte[] bArr, int i7) {
        this.zzd = bArr;
        this.zzf = i7;
        this.zze = 0;
    }

    public final void zzK(int i7) {
        boolean z4 = false;
        if (i7 >= 0 && i7 <= this.zzd.length) {
            z4 = true;
        }
        zzcv.zzd(z4);
        this.zzf = i7;
    }

    public final void zzL(int i7) {
        boolean z4 = false;
        if (i7 >= 0 && i7 <= this.zzf) {
            z4 = true;
        }
        zzcv.zzd(z4);
        this.zze = i7;
    }

    public final void zzM(int i7) {
        zzL(this.zze + i7);
    }

    public final byte[] zzN() {
        return this.zzd;
    }

    public final char zza(Charset charset) {
        zzcv.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        return (char) (zzP(charset) >> 16);
    }

    public final int zzb() {
        return this.zzf - this.zze;
    }

    public final int zzc() {
        return this.zzd.length;
    }

    public final int zzd() {
        return this.zze;
    }

    public final int zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzd[this.zze] & 255;
    }

    public final int zzg() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zze = i10;
        int i11 = bArr[i8] & 255;
        int i12 = i7 + 3;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i7 + 4;
        return (bArr[i12] & 255) | (i9 << 24) | (i11 << 16) | (i13 << 8);
    }

    public final int zzh() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zze = i10;
        int i11 = bArr[i8] & 255;
        this.zze = i7 + 3;
        return (bArr[i10] & 255) | ((i9 << 24) >> 8) | (i11 << 8);
    }

    public final int zzi() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zze = i10;
        int i11 = bArr[i8] & 255;
        int i12 = i7 + 3;
        this.zze = i12;
        int i13 = bArr[i10] & 255;
        this.zze = i7 + 4;
        return ((bArr[i12] & 255) << 24) | (i11 << 8) | i9 | (i13 << 16);
    }

    public final int zzj() {
        int zzi = zzi();
        if (zzi >= 0) {
            return zzi;
        }
        throw new IllegalStateException(k.d(zzi, "Top bit not zero: "));
    }

    public final int zzk() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        this.zze = i7 + 2;
        return ((bArr[i8] & 255) << 8) | i9;
    }

    public final int zzl() {
        return (zzm() << 21) | (zzm() << 14) | (zzm() << 7) | zzm();
    }

    public final int zzm() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        this.zze = i7 + 1;
        return bArr[i7] & 255;
    }

    public final int zzn() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        this.zze = i7 + 2;
        int i10 = bArr[i8] & 255;
        this.zze = i7 + 4;
        return i10 | (i9 << 8);
    }

    public final int zzo() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        int i10 = i7 + 2;
        this.zze = i10;
        int i11 = bArr[i8] & 255;
        this.zze = i7 + 3;
        return (bArr[i10] & 255) | (i9 << 16) | (i11 << 8);
    }

    public final int zzp() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException(k.d(zzg, "Top bit not zero: "));
    }

    public final int zzq() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        int i9 = bArr[i7] & 255;
        this.zze = i7 + 2;
        return (bArr[i8] & 255) | (i9 << 8);
    }

    public final long zzr() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        long j = bArr[i7];
        int i9 = i7 + 2;
        this.zze = i9;
        long j3 = bArr[i8];
        int i10 = i7 + 3;
        this.zze = i10;
        long j7 = bArr[i9];
        int i11 = i7 + 4;
        this.zze = i11;
        long j8 = bArr[i10];
        int i12 = i7 + 5;
        this.zze = i12;
        long j9 = bArr[i11];
        int i13 = i7 + 6;
        this.zze = i13;
        long j10 = bArr[i12];
        this.zze = i7 + 7;
        long j11 = bArr[i13];
        this.zze = i7 + 8;
        return ((bArr[r5] & 255) << 56) | ((j11 & 255) << 48) | ((j3 & 255) << 8) | (j & 255) | ((j7 & 255) << 16) | ((j8 & 255) << 24) | ((j9 & 255) << 32) | ((j10 & 255) << 40);
    }

    public final long zzs() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        long j = bArr[i7];
        int i9 = i7 + 2;
        this.zze = i9;
        long j3 = bArr[i8];
        this.zze = i7 + 3;
        long j7 = bArr[i9];
        this.zze = i7 + 4;
        return ((bArr[r2] & 255) << 24) | (j & 255) | ((j3 & 255) << 8) | ((j7 & 255) << 16);
    }

    public final long zzt() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        long j = bArr[i7];
        int i9 = i7 + 2;
        this.zze = i9;
        long j3 = bArr[i8];
        int i10 = i7 + 3;
        this.zze = i10;
        long j7 = bArr[i9];
        int i11 = i7 + 4;
        this.zze = i11;
        long j8 = bArr[i10];
        int i12 = i7 + 5;
        this.zze = i12;
        long j9 = bArr[i11];
        int i13 = i7 + 6;
        this.zze = i13;
        long j10 = bArr[i12];
        this.zze = i7 + 7;
        long j11 = bArr[i13];
        this.zze = i7 + 8;
        return (bArr[r3] & 255) | ((j & 255) << 56) | ((j3 & 255) << 48) | ((j7 & 255) << 40) | ((j8 & 255) << 32) | ((j9 & 255) << 24) | ((j10 & 255) << 16) | ((j11 & 255) << 8);
    }

    public final long zzu() {
        byte[] bArr = this.zzd;
        int i7 = this.zze;
        int i8 = i7 + 1;
        this.zze = i8;
        long j = bArr[i7];
        int i9 = i7 + 2;
        this.zze = i9;
        long j3 = bArr[i8];
        this.zze = i7 + 3;
        long j7 = bArr[i9];
        this.zze = i7 + 4;
        return (bArr[r2] & 255) | ((j & 255) << 24) | ((j3 & 255) << 16) | ((j7 & 255) << 8);
    }

    public final long zzv() {
        long j = 0;
        for (int i7 = 0; i7 < 9; i7++) {
            if (this.zze == this.zzf) {
                throw new IllegalStateException("Attempting to read a byte over the limit.");
            }
            long zzm = zzm();
            j |= (127 & zzm) << (i7 * 7);
            if ((zzm & 128) == 0) {
                break;
            }
        }
        return j;
    }

    public final long zzw() {
        long zzt = zzt();
        if (zzt >= 0) {
            return zzt;
        }
        throw new IllegalStateException(AbstractC0486a1.g("Top bit not zero: ", zzt));
    }

    public final long zzx() {
        int i7;
        int i8;
        long j = this.zzd[this.zze];
        int i9 = 7;
        while (true) {
            i7 = 0;
            if (i9 < 0) {
                break;
            }
            if (((1 << i9) & j) != 0) {
                i9--;
            } else if (i9 < 6) {
                j &= r7 - 1;
                i7 = 7 - i9;
            } else if (i9 == 7) {
                i7 = 1;
            }
        }
        if (i7 == 0) {
            throw new NumberFormatException(AbstractC0486a1.g("Invalid UTF-8 sequence first byte: ", j));
        }
        for (i8 = 1; i8 < i7; i8++) {
            if ((this.zzd[this.zze + i8] & 192) != 128) {
                throw new NumberFormatException(AbstractC0486a1.g("Invalid UTF-8 sequence continuation byte: ", j));
            }
            j = (j << 6) | (r2 & 63);
        }
        this.zze += i7;
        return j;
    }

    public final String zzy(char c3) {
        int i7 = this.zzf;
        int i8 = this.zze;
        if (i7 - i8 == 0) {
            return null;
        }
        while (i8 < this.zzf && this.zzd[i8] != 0) {
            i8++;
        }
        byte[] bArr = this.zzd;
        int i9 = this.zze;
        String zzC = zzen.zzC(bArr, i9, i8 - i9);
        this.zze = i8;
        if (i8 < this.zzf) {
            this.zze = i8 + 1;
        }
        return zzC;
    }

    public final String zzz(Charset charset) {
        zzcv.zze(zzc.contains(charset), "Unsupported charset: ".concat(String.valueOf(charset)));
        if (this.zzf - this.zze == 0) {
            return null;
        }
        Charset charset2 = StandardCharsets.US_ASCII;
        if (!charset.equals(charset2)) {
            zzC();
        }
        int i7 = 1;
        if (!charset.equals(StandardCharsets.UTF_8) && !charset.equals(charset2)) {
            i7 = 2;
            if (!charset.equals(StandardCharsets.UTF_16) && !charset.equals(StandardCharsets.UTF_16LE) && !charset.equals(StandardCharsets.UTF_16BE)) {
                throw new IllegalArgumentException("Unsupported charset: ".concat(String.valueOf(charset)));
            }
        }
        int i8 = this.zze;
        while (true) {
            int i9 = this.zzf;
            if (i8 >= i9 - (i7 - 1)) {
                i8 = i9;
                break;
            }
            if ((charset.equals(StandardCharsets.UTF_8) || charset.equals(StandardCharsets.US_ASCII)) && zzen.zzM(this.zzd[i8])) {
                break;
            }
            if (charset.equals(StandardCharsets.UTF_16) || charset.equals(StandardCharsets.UTF_16BE)) {
                byte[] bArr = this.zzd;
                if (bArr[i8] == 0 && zzen.zzM(bArr[i8 + 1])) {
                    break;
                }
            }
            if (charset.equals(StandardCharsets.UTF_16LE)) {
                byte[] bArr2 = this.zzd;
                if (bArr2[i8 + 1] == 0 && zzen.zzM(bArr2[i8])) {
                    break;
                }
            }
            i8 += i7;
        }
        String zzB = zzB(i8 - this.zze, charset);
        if (this.zze != this.zzf && zzO(charset, zza) == '\r') {
            zzO(charset, zzb);
        }
        return zzB;
    }

    public zzed() {
        this.zzd = zzen.zzc;
    }

    public zzed(int i7) {
        this.zzd = new byte[i7];
        this.zzf = i7;
    }

    public zzed(byte[] bArr) {
        this.zzd = bArr;
        this.zzf = bArr.length;
    }
}
