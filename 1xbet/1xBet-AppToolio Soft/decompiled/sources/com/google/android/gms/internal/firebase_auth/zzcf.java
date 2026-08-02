package com.google.android.gms.internal.firebase_auth;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzcf extends zzcd {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzmw;
    private int zzmx;
    private int zzmy;
    private int zzmz;
    private int zzna;

    private zzcf(byte[] bArr, int i, int i2, boolean z) {
        super();
        this.zzna = Integer.MAX_VALUE;
        this.buffer = bArr;
        this.limit = i2 + i;
        this.pos = i;
        this.zzmy = this.pos;
        this.zzmw = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0066, code lost:
    
        if (r2[r3] >= 0) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int zzcu() throws IOException {
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
        return (int) zzcr();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b0, code lost:
    
        if (r2[r0] >= 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final long zzcv() throws IOException {
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
        return zzcr();
    }

    private final int zzcw() throws IOException {
        int i = this.pos;
        if (this.limit - i < 4) {
            throw zzdh.zzee();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private final long zzcx() throws IOException {
        int i = this.pos;
        if (this.limit - i < 8) {
            throw zzdh.zzee();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final void zzcy() {
        this.limit += this.zzmx;
        int i = this.limit;
        int i2 = i - this.zzmy;
        int i3 = this.zzna;
        if (i2 <= i3) {
            this.zzmx = 0;
        } else {
            this.zzmx = i2 - i3;
            this.limit = i - this.zzmx;
        }
    }

    private final byte zzcz() throws IOException {
        int i = this.pos;
        if (i == this.limit) {
            throw zzdh.zzee();
        }
        byte[] bArr = this.buffer;
        this.pos = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final double readDouble() throws IOException {
        return Double.longBitsToDouble(zzcx());
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final float readFloat() throws IOException {
        return Float.intBitsToFloat(zzcw());
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final String readString() throws IOException {
        int zzcu = zzcu();
        if (zzcu > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzcu <= i - i2) {
                String str = new String(this.buffer, i2, zzcu, zzdd.UTF_8);
                this.pos += zzcu;
                return str;
            }
        }
        if (zzcu == 0) {
            return "";
        }
        if (zzcu < 0) {
            throw zzdh.zzef();
        }
        throw zzdh.zzee();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final <T extends zzeh> T zza(zzer<T> zzerVar, zzco zzcoVar) throws IOException {
        int zzcu = zzcu();
        if (this.zzmq >= this.zzmr) {
            throw zzdh.zzej();
        }
        int zzp = zzp(zzcu);
        this.zzmq++;
        T zza = zzerVar.zza(this, zzcoVar);
        zzm(0);
        this.zzmq--;
        zzq(zzp);
        return zza;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzcc() throws IOException {
        if (zzcs()) {
            this.zzmz = 0;
            return 0;
        }
        this.zzmz = zzcu();
        int i = this.zzmz;
        if ((i >>> 3) != 0) {
            return i;
        }
        throw new zzdh("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final long zzcd() throws IOException {
        return zzcv();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final long zzce() throws IOException {
        return zzcv();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzcf() throws IOException {
        return zzcu();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final long zzcg() throws IOException {
        return zzcx();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzch() throws IOException {
        return zzcw();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final boolean zzci() throws IOException {
        return zzcv() != 0;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final String zzcj() throws IOException {
        int zzcu = zzcu();
        if (zzcu > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzcu <= i - i2) {
                if (!zzfx.zzf(this.buffer, i2, i2 + zzcu)) {
                    throw new zzdh("Protocol message had invalid UTF-8.");
                }
                int i3 = this.pos;
                this.pos = i3 + zzcu;
                return new String(this.buffer, i3, zzcu, zzdd.UTF_8);
            }
        }
        if (zzcu == 0) {
            return "";
        }
        if (zzcu <= 0) {
            throw zzdh.zzef();
        }
        throw zzdh.zzee();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final zzbu zzck() throws IOException {
        byte[] bArr;
        int zzcu = zzcu();
        if (zzcu > 0) {
            int i = this.limit;
            int i2 = this.pos;
            if (zzcu <= i - i2) {
                zzbu zzb = zzbu.zzb(this.buffer, i2, zzcu);
                this.pos += zzcu;
                return zzb;
            }
        }
        if (zzcu == 0) {
            return zzbu.zzmi;
        }
        if (zzcu > 0) {
            int i3 = this.limit;
            int i4 = this.pos;
            if (zzcu <= i3 - i4) {
                this.pos = zzcu + i4;
                bArr = Arrays.copyOfRange(this.buffer, i4, this.pos);
                return zzbu.zza(bArr);
            }
        }
        if (zzcu > 0) {
            throw zzdh.zzee();
        }
        if (zzcu != 0) {
            throw zzdh.zzef();
        }
        bArr = zzdd.EMPTY_BYTE_ARRAY;
        return zzbu.zza(bArr);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzcl() throws IOException {
        return zzcu();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzcm() throws IOException {
        return zzcu();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzcn() throws IOException {
        return zzcw();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final long zzco() throws IOException {
        return zzcx();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzcp() throws IOException {
        int zzcu = zzcu();
        return (-(zzcu & 1)) ^ (zzcu >>> 1);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final long zzcq() throws IOException {
        long zzcv = zzcv();
        return (-(zzcv & 1)) ^ (zzcv >>> 1);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    final long zzcr() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzcz() & 128) == 0) {
                return j;
            }
        }
        throw zzdh.zzeg();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final boolean zzcs() throws IOException {
        return this.pos == this.limit;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzct() {
        return this.pos - this.zzmy;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final void zzm(int i) throws zzdh {
        if (this.zzmz != i) {
            throw zzdh.zzeh();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final boolean zzn(int i) throws IOException {
        int zzcc;
        int i2 = 0;
        switch (i & 7) {
            case 0:
                if (this.limit - this.pos < 10) {
                    while (i2 < 10) {
                        if (zzcz() < 0) {
                            i2++;
                        }
                    }
                    throw zzdh.zzeg();
                }
                while (i2 < 10) {
                    byte[] bArr = this.buffer;
                    int i3 = this.pos;
                    this.pos = i3 + 1;
                    if (bArr[i3] < 0) {
                        i2++;
                    }
                }
                throw zzdh.zzeg();
                return true;
            case 1:
                zzr(8);
                return true;
            case 2:
                zzr(zzcu());
                return true;
            case 3:
                break;
            case 4:
                return false;
            case 5:
                zzr(4);
                return true;
            default:
                throw zzdh.zzei();
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

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final int zzp(int i) throws zzdh {
        if (i < 0) {
            throw zzdh.zzef();
        }
        int zzct = i + zzct();
        int i2 = this.zzna;
        if (zzct > i2) {
            throw zzdh.zzee();
        }
        this.zzna = zzct;
        zzcy();
        return i2;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final void zzq(int i) {
        this.zzna = i;
        zzcy();
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzcd
    public final void zzr(int i) throws IOException {
        if (i >= 0) {
            int i2 = this.limit;
            int i3 = this.pos;
            if (i <= i2 - i3) {
                this.pos = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw zzdh.zzee();
        }
        throw zzdh.zzef();
    }
}
