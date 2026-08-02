package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzaca {
    private final byte[] buffer;
    private int zzbtp;
    private final int zzbyw;
    private final int zzbyx;
    private int zzbyy;
    private int zzbyz;
    private int zzbza;
    private int zzbzb;
    private int zzbtr = Integer.MAX_VALUE;
    private int zzbtk = 64;
    private int zzbtl = 67108864;

    private zzaca(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzbyw = i;
        int i3 = i2 + i;
        this.zzbyy = i3;
        this.zzbyx = i3;
        this.zzbyz = i;
    }

    public static zzaca zza(byte[] bArr, int i, int i2) {
        return new zzaca(bArr, 0, i2);
    }

    private final void zzan(int i) throws IOException {
        if (i < 0) {
            throw zzaci.zzvx();
        }
        int i2 = this.zzbyz;
        int i3 = i2 + i;
        int i4 = this.zzbtr;
        if (i3 > i4) {
            zzan(i4 - i2);
            throw zzaci.zzvw();
        }
        if (i > this.zzbyy - i2) {
            throw zzaci.zzvw();
        }
        this.zzbyz = i2 + i;
    }

    public static zzaca zzi(byte[] bArr) {
        return zza(bArr, 0, bArr.length);
    }

    private final void zztp() {
        this.zzbyy += this.zzbtp;
        int i = this.zzbyy;
        int i2 = this.zzbtr;
        if (i <= i2) {
            this.zzbtp = 0;
        } else {
            this.zzbtp = i - i2;
            this.zzbyy = i - this.zzbtp;
        }
    }

    private final byte zzvs() throws IOException {
        int i = this.zzbyz;
        if (i == this.zzbyy) {
            throw zzaci.zzvw();
        }
        byte[] bArr = this.buffer;
        this.zzbyz = i + 1;
        return bArr[i];
    }

    public final int getPosition() {
        return this.zzbyz - this.zzbyw;
    }

    public final String readString() throws IOException {
        int zzvn = zzvn();
        if (zzvn < 0) {
            throw zzaci.zzvx();
        }
        int i = this.zzbyy;
        int i2 = this.zzbyz;
        if (zzvn > i - i2) {
            throw zzaci.zzvw();
        }
        String str = new String(this.buffer, i2, zzvn, zzach.UTF_8);
        this.zzbyz += zzvn;
        return str;
    }

    public final void zza(zzacj zzacjVar) throws IOException {
        int zzvn = zzvn();
        if (this.zzbzb >= this.zzbtk) {
            throw zzaci.zzvz();
        }
        int zzaf = zzaf(zzvn);
        this.zzbzb++;
        zzacjVar.zzb(this);
        zzaj(0);
        this.zzbzb--;
        zzal(zzaf);
    }

    public final void zza(zzacj zzacjVar, int i) throws IOException {
        int i2 = this.zzbzb;
        if (i2 >= this.zzbtk) {
            throw zzaci.zzvz();
        }
        this.zzbzb = i2 + 1;
        zzacjVar.zzb(this);
        zzaj((i << 3) | 4);
        this.zzbzb--;
    }

    public final int zzaf(int i) throws zzaci {
        if (i < 0) {
            throw zzaci.zzvx();
        }
        int i2 = i + this.zzbyz;
        int i3 = this.zzbtr;
        if (i2 > i3) {
            throw zzaci.zzvw();
        }
        this.zzbtr = i2;
        zztp();
        return i3;
    }

    public final void zzaj(int i) throws zzaci {
        if (this.zzbza != i) {
            throw new zzaci("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzak(int i) throws IOException {
        int zzvl;
        switch (i & 7) {
            case 0:
                zzvn();
                return true;
            case 1:
                zzvq();
                return true;
            case 2:
                zzan(zzvn());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzvp();
                return true;
            default:
                throw new zzaci("Protocol message tag had invalid wire type.");
        }
        do {
            zzvl = zzvl();
            if (zzvl != 0) {
            }
            zzaj(((i >>> 3) << 3) | 4);
            return true;
        } while (zzak(zzvl));
        zzaj(((i >>> 3) << 3) | 4);
        return true;
    }

    public final void zzal(int i) {
        this.zzbtr = i;
        zztp();
    }

    public final void zzam(int i) {
        zzd(i, this.zzbza);
    }

    public final byte[] zzc(int i, int i2) {
        if (i2 == 0) {
            return zzacm.zzbzz;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzbyw + i, bArr, 0, i2);
        return bArr;
    }

    final void zzd(int i, int i2) {
        int i3 = this.zzbyz;
        int i4 = this.zzbyw;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3 - i4);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= 0) {
            this.zzbyz = i4 + i;
            this.zzbza = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    public final int zzvl() throws IOException {
        if (this.zzbyz == this.zzbyy) {
            this.zzbza = 0;
            return 0;
        }
        this.zzbza = zzvn();
        int i = this.zzbza;
        if (i != 0) {
            return i;
        }
        throw new zzaci("Protocol message contained an invalid tag (zero).");
    }

    public final boolean zzvm() throws IOException {
        return zzvn() != 0;
    }

    public final int zzvn() throws IOException {
        int i;
        byte zzvs = zzvs();
        if (zzvs >= 0) {
            return zzvs;
        }
        int i2 = zzvs & Byte.MAX_VALUE;
        byte zzvs2 = zzvs();
        if (zzvs2 >= 0) {
            i = zzvs2 << 7;
        } else {
            i2 |= (zzvs2 & Byte.MAX_VALUE) << 7;
            byte zzvs3 = zzvs();
            if (zzvs3 >= 0) {
                i = zzvs3 << 14;
            } else {
                i2 |= (zzvs3 & Byte.MAX_VALUE) << 14;
                byte zzvs4 = zzvs();
                if (zzvs4 < 0) {
                    int i3 = i2 | ((zzvs4 & Byte.MAX_VALUE) << 21);
                    byte zzvs5 = zzvs();
                    int i4 = i3 | (zzvs5 << 28);
                    if (zzvs5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (zzvs() >= 0) {
                            return i4;
                        }
                    }
                    throw zzaci.zzvy();
                }
                i = zzvs4 << 21;
            }
        }
        return i2 | i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final long zzvo() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzvs() & 128) == 0) {
                return j;
            }
        }
        throw zzaci.zzvy();
    }

    public final int zzvp() throws IOException {
        return (zzvs() & 255) | ((zzvs() & 255) << 8) | ((zzvs() & 255) << 16) | ((zzvs() & 255) << 24);
    }

    public final long zzvq() throws IOException {
        return ((zzvs() & 255) << 8) | (zzvs() & 255) | ((zzvs() & 255) << 16) | ((zzvs() & 255) << 24) | ((zzvs() & 255) << 32) | ((zzvs() & 255) << 40) | ((zzvs() & 255) << 48) | ((zzvs() & 255) << 56);
    }

    public final int zzvr() {
        int i = this.zzbtr;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzbyz;
    }
}
