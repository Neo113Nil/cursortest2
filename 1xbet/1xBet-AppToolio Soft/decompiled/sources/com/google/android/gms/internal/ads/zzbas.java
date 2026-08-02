package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzbas extends zzbaq {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzdqd;
    private int zzdqe;
    private int zzdqf;
    private int zzdqg;
    private int zzdqh;

    private zzbas(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzdqh = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzdqf = this.pos;
        this.zzdqd = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzacc() throws IOException {
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            i7 = i5 + 1;
                            byte b2 = bArr[i5];
                            i = (i9 ^ (b2 << 28)) ^ 266354560;
                            if (b2 < 0) {
                                i5 = i7 + 1;
                                if (bArr[i7] < 0) {
                                    i7 = i5 + 1;
                                    if (bArr[i5] < 0) {
                                        i5 = i7 + 1;
                                        if (bArr[i7] < 0) {
                                            i7 = i5 + 1;
                                            if (bArr[i5] < 0) {
                                                i5 = i7 + 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    i5 = i7;
                }
                this.pos = i5;
                return i;
            }
        }
        return (int) zzabz();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzacd() throws IOException {
        long j;
        long j2;
        long j3;
        int i;
        int i2 = this.pos;
        int i3 = this.limit;
        if (i3 != i2) {
            byte[] bArr = this.buffer;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.pos = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i4 + 1;
                int i6 = b ^ (bArr[i4] << 7);
                if (i6 >= 0) {
                    int i7 = i5 + 1;
                    int i8 = i6 ^ (bArr[i5] << 14);
                    if (i8 >= 0) {
                        i5 = i7;
                        j = i8 ^ 16256;
                    } else {
                        i5 = i7 + 1;
                        int i9 = i8 ^ (bArr[i7] << 21);
                        if (i9 < 0) {
                            i = i9 ^ (-2080896);
                        } else {
                            long j4 = i9;
                            int i10 = i5 + 1;
                            long j5 = j4 ^ (bArr[i5] << 28);
                            if (j5 >= 0) {
                                j3 = 266354560;
                            } else {
                                i5 = i10 + 1;
                                long j6 = j5 ^ (bArr[i10] << 35);
                                if (j6 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i10 = i5 + 1;
                                    j5 = j6 ^ (bArr[i5] << 42);
                                    if (j5 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i5 = i10 + 1;
                                        j6 = j5 ^ (bArr[i10] << 49);
                                        if (j6 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i10 = i5 + 1;
                                            j = (j6 ^ (bArr[i5] << 56)) ^ 71499008037633920L;
                                            if (j < 0) {
                                                i5 = i10 + 1;
                                            }
                                            i5 = i10;
                                        }
                                    }
                                }
                                j = j6 ^ j2;
                            }
                            j = j3 ^ j5;
                            i5 = i10;
                        }
                    }
                    this.pos = i5;
                    return j;
                }
                i = i6 ^ (-128);
                j = i;
                this.pos = i5;
                return j;
            }
        }
        return zzabz();
    }

    private final int zzace() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzbbu.zzadl();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzacf() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzbbu.zzadl();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final void zzacg() {
        this.limit += this.zzdqe;
        int i = this.limit;
        int i2 = i - this.zzdqf;
        int i3 = this.zzdqh;
        if (i2 <= i3) {
            this.zzdqe = 0;
        } else {
            this.zzdqe = i2 - i3;
            this.limit = i - this.zzdqe;
        }
    }

    private final byte zzach() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzbbu.zzadl();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzacf());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzace());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final String readString() throws IOException {
        int zzacc = zzacc();
        if (zzacc > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzacc <= i - i2) {
                String str = new String(this.buffer, i2, zzacc, zzbbq.UTF_8);
                this.pos += zzacc;
                return str;
            }
        }
        if (zzacc == 0) {
            return "";
        }
        if (zzacc < 0) {
            throw zzbbu.zzadm();
        }
        throw zzbbu.zzadl();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabk() throws IOException {
        if (zzaca()) {
            this.zzdqg = 0;
            return 0;
        }
        this.zzdqg = zzacc();
        int i = this.zzdqg;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw zzbbu.zzado();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabl() throws IOException {
        return zzacd();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabm() throws IOException {
        return zzacd();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabn() throws IOException {
        return zzacc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabo() throws IOException {
        return zzacf();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabp() throws IOException {
        return zzace();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final boolean zzabq() throws IOException {
        return zzacd() != 0;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final String zzabr() throws IOException {
        int zzacc = zzacc();
        if (zzacc > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzacc <= i - i2) {
                if (!zzbem.zzf(this.buffer, i2, i2 + zzacc)) {
                    throw zzbbu.zzads();
                }
                int i3 = this.pos;
                this.pos = i3 + zzacc;
                return new String(this.buffer, i3, zzacc, zzbbq.UTF_8);
            }
        }
        if (zzacc == 0) {
            return "";
        }
        if (zzacc <= 0) {
            throw zzbbu.zzadm();
        }
        throw zzbbu.zzadl();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final zzbah zzabs() throws IOException {
        byte[] bArr;
        int zzacc = zzacc();
        if (zzacc > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzacc <= i - i2) {
                zzbah zzc = zzbah.zzc(this.buffer, i2, zzacc);
                this.pos += zzacc;
                return zzc;
            }
        }
        if (zzacc == 0) {
            return zzbah.zzdpq;
        }
        if (zzacc > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzacc <= i3 - i4) {
                this.pos = zzacc + i4;
                bArr = Arrays.copyOfRange(this.buffer, i4, this.pos);
                return zzbah.zzp(bArr);
            }
        }
        if (zzacc > 0) {
            throw zzbbu.zzadl();
        }
        if (zzacc != 0) {
            throw zzbbu.zzadm();
        }
        bArr = zzbbq.zzduq;
        return zzbah.zzp(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabt() throws IOException {
        return zzacc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabu() throws IOException {
        return zzacc();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabv() throws IOException {
        return zzace();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzabw() throws IOException {
        return zzacf();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzabx() throws IOException {
        return zzbu(zzacc());
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final long zzaby() throws IOException {
        return zzl(zzacd());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzbaq
    final long zzabz() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzach() & 128) == 0) {
                return j;
            }
        }
        throw zzbbu.zzadn();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final boolean zzaca() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzacb() {
        return this.pos - this.zzdqf;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzbp(int i) throws zzbbu {
        if (this.zzdqg != i) {
            throw zzbbu.zzadp();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.ads.zzbaq
    public final boolean zzbq(int i) throws IOException {
        int zzabk;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.limit - this.pos < 10) {
                    while (i2 < 10) {
                        if (zzach() < 0) {
                            i2++;
                        }
                    }
                    throw zzbbu.zzadn();
                }
                while (i2 < 10) {
                    byte[] bArr = this.buffer;
                    int i3 = this.pos;
                    this.pos = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw zzbbu.zzadn();
                return true;
            case 1:
                zzbt(8);
                return true;
            case 2:
                zzbt(zzacc());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzbt(4);
                return true;
            default:
                throw zzbbu.zzadq();
        }
        do {
            zzabk = zzabk();
            if (zzabk != 0) {
            }
            zzbp(((i >>> 3) << 3) | 4);
            return true;
        } while (zzbq(zzabk));
        zzbp(((i >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final int zzbr(int i) throws zzbbu {
        if (i < 0) {
            throw zzbbu.zzadm();
        }
        int zzacb = i + zzacb();
        int i2 = this.zzdqh;
        if (zzacb > i2) {
            throw zzbbu.zzadl();
        }
        this.zzdqh = zzacb;
        zzacg();
        return i2;
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzbs(int i) {
        this.zzdqh = i;
        zzacg();
    }

    @Override // com.google.android.gms.internal.ads.zzbaq
    public final void zzbt(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzbbu.zzadl();
        }
        throw zzbbu.zzadm();
    }
}
