package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;

/* loaded from: classes.dex */
public final class zzgk {
    private final byte[] buffer;
    private int zzmq;
    private int zzmx;
    private int zzmz;
    private final int zzxk;
    private final int zzxl;
    private int zzxm;
    private int zzxn;
    private zzcd zzxo;
    private int zzna = Integer.MAX_VALUE;
    private int zzmr = 64;
    private int zzms = 67108864;

    private zzgk(byte[] bArr, int i, int i2) {
        this.buffer = bArr;
        this.zzxk = i;
        int i3 = i2 + i;
        this.zzxm = i3;
        this.zzxl = i3;
        this.zzxn = i;
    }

    private final void zzcy() {
        this.zzxm += this.zzmx;
        int i = this.zzxm;
        int i2 = this.zzna;
        if (i <= i2) {
            this.zzmx = 0;
        } else {
            this.zzmx = i - i2;
            this.zzxm = i - this.zzmx;
        }
    }

    private final byte zzcz() throws IOException {
        int i = this.zzxn;
        if (i == this.zzxm) {
            throw zzgs.zzgp();
        }
        byte[] bArr = this.buffer;
        this.zzxn = i + 1;
        return bArr[i];
    }

    public static zzgk zzi(byte[] bArr, int i, int i2) {
        return new zzgk(bArr, 0, i2);
    }

    private final void zzr(int i) throws IOException {
        if (i < 0) {
            throw zzgs.zzgq();
        }
        int i2 = this.zzxn;
        int i3 = i2 + i;
        int i4 = this.zzna;
        if (i3 > i4) {
            zzr(i4 - i2);
            throw zzgs.zzgp();
        }
        if (i > this.zzxm - i2) {
            throw zzgs.zzgp();
        }
        this.zzxn = i2 + i;
    }

    public final int getPosition() {
        return this.zzxn - this.zzxk;
    }

    public final byte[] readBytes() throws IOException {
        int zzcu = zzcu();
        if (zzcu < 0) {
            throw zzgs.zzgq();
        }
        if (zzcu == 0) {
            return zzgw.zzyk;
        }
        int i = this.zzxm;
        int i2 = this.zzxn;
        if (zzcu > i - i2) {
            throw zzgs.zzgp();
        }
        byte[] bArr = new byte[zzcu];
        System.arraycopy(this.buffer, i2, bArr, 0, zzcu);
        this.zzxn += zzcu;
        return bArr;
    }

    public final String readString() throws IOException {
        int zzcu = zzcu();
        if (zzcu < 0) {
            throw zzgs.zzgq();
        }
        int i = this.zzxm;
        int i2 = this.zzxn;
        if (zzcu > i - i2) {
            throw zzgs.zzgp();
        }
        String str = new String(this.buffer, i2, zzcu, zzgr.UTF_8);
        this.zzxn += zzcu;
        return str;
    }

    public final <T extends zzdb<T, ?>> T zza(zzer<T> zzerVar) throws IOException {
        try {
            if (this.zzxo == null) {
                this.zzxo = zzcd.zzd(this.buffer, this.zzxk, this.zzxl);
            }
            int zzct = this.zzxo.zzct();
            int i = this.zzxn - this.zzxk;
            if (zzct > i) {
                throw new IOException(String.format("CodedInputStream read ahead of CodedInputByteBufferNano: %s > %s", Integer.valueOf(zzct), Integer.valueOf(i)));
            }
            this.zzxo.zzr(i - zzct);
            this.zzxo.zzo(this.zzmr - this.zzmq);
            T t = (T) this.zzxo.zza(zzerVar, zzco.zzdl());
            zzn(this.zzmz);
            return t;
        } catch (zzdh e) {
            throw new zzgs("", e);
        }
    }

    public final void zzay(int i) {
        zzs(i, this.zzmz);
    }

    public final void zzb(zzgt zzgtVar) throws IOException {
        int zzcu = zzcu();
        if (this.zzmq >= this.zzmr) {
            throw new zzgs("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int zzp = zzp(zzcu);
        this.zzmq++;
        zzgtVar.zza(this);
        zzm(0);
        this.zzmq--;
        zzq(zzp);
    }

    public final int zzcc() throws IOException {
        if (this.zzxn == this.zzxm) {
            this.zzmz = 0;
            return 0;
        }
        this.zzmz = zzcu();
        int i = this.zzmz;
        if (i != 0) {
            return i;
        }
        throw new zzgs("Protocol message contained an invalid tag (zero).");
    }

    public final long zzce() throws IOException {
        return zzcv();
    }

    public final boolean zzci() throws IOException {
        return zzcu() != 0;
    }

    public final int zzcu() throws IOException {
        int i;
        byte zzcz = zzcz();
        if (zzcz >= 0) {
            return zzcz;
        }
        int i2 = zzcz & Byte.MAX_VALUE;
        byte zzcz2 = zzcz();
        if (zzcz2 >= 0) {
            i = zzcz2 << 7;
        } else {
            i2 |= (zzcz2 & Byte.MAX_VALUE) << 7;
            byte zzcz3 = zzcz();
            if (zzcz3 >= 0) {
                i = zzcz3 << 14;
            } else {
                i2 |= (zzcz3 & Byte.MAX_VALUE) << 14;
                byte zzcz4 = zzcz();
                if (zzcz4 < 0) {
                    int i3 = i2 | ((zzcz4 & Byte.MAX_VALUE) << 21);
                    byte zzcz5 = zzcz();
                    int i4 = i3 | (zzcz5 << 28);
                    if (zzcz5 >= 0) {
                        return i4;
                    }
                    for (int i5 = 0; i5 < 5; i5++) {
                        if (zzcz() >= 0) {
                            return i4;
                        }
                    }
                    throw zzgs.zzgr();
                }
                i = zzcz4 << 21;
            }
        }
        return i2 | i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public final long zzcv() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzcz() & 128) == 0) {
                return j;
            }
        }
        throw zzgs.zzgr();
    }

    public final int zzgl() {
        int i = this.zzna;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.zzxn;
    }

    public final void zzm(int i) throws zzgs {
        if (this.zzmz != i) {
            throw new zzgs("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final boolean zzn(int i) throws IOException {
        int zzcc;
        switch (i & 7) {
            case 0:
                zzcu();
                return true;
            case 1:
                zzcz();
                zzcz();
                zzcz();
                zzcz();
                zzcz();
                zzcz();
                zzcz();
                zzcz();
                return true;
            case 2:
                zzr(zzcu());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzcz();
                zzcz();
                zzcz();
                zzcz();
                return true;
            default:
                throw new zzgs("Protocol message tag had invalid wire type.");
        }
        do {
            zzcc = zzcc();
            if (zzcc != 0) {
            }
            zzm(((i >>> 3) << 3) | 4);
            return true;
        } while (zzn(zzcc));
        zzm(((i >>> 3) << 3) | 4);
        return true;
    }

    public final int zzp(int i) throws zzgs {
        if (i < 0) {
            throw zzgs.zzgq();
        }
        int i2 = i + this.zzxn;
        int i3 = this.zzna;
        if (i2 > i3) {
            throw zzgs.zzgp();
        }
        this.zzna = i2;
        zzcy();
        return i3;
    }

    public final void zzq(int i) {
        this.zzna = i;
        zzcy();
    }

    public final byte[] zzr(int i, int i2) {
        if (i2 == 0) {
            return zzgw.zzyk;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.buffer, this.zzxk + i, bArr, 0, i2);
        return bArr;
    }

    final void zzs(int i, int i2) {
        int i3 = this.zzxn;
        int i4 = this.zzxk;
        if (i > i3 - i4) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Position ");
            sb.append(i);
            sb.append(" is beyond current ");
            sb.append(i3 - i4);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i >= 0) {
            this.zzxn = i4 + i;
            this.zzmz = i2;
        } else {
            StringBuilder sb2 = new StringBuilder(24);
            sb2.append("Bad position ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        }
    }
}
