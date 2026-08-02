package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
final class zzgwc extends zzgwe {
    public static final /* synthetic */ int zza = 0;
    private final ByteBuffer zzf;
    private final long zzg;
    private long zzh;
    private long zzi;
    private final long zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zzgwc(ByteBuffer byteBuffer, boolean z4, zzgwd zzgwdVar) {
        super(null);
        this.zzm = f.API_PRIORITY_OTHER;
        this.zzf = byteBuffer.duplicate();
        long zze = zzhad.zze(byteBuffer);
        this.zzg = zze;
        this.zzh = byteBuffer.limit() + zze;
        long position = zze + byteBuffer.position();
        this.zzi = position;
        this.zzj = position;
    }

    private final int zzC() {
        return (int) (this.zzh - this.zzi);
    }

    private final void zzI() {
        long j = this.zzh + this.zzk;
        this.zzh = j;
        int i7 = (int) (j - this.zzj);
        int i8 = this.zzm;
        if (i7 <= i8) {
            this.zzk = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzk = i9;
        this.zzh = j - i9;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzA() {
        return this.zzi == this.zzh;
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
        return (int) (this.zzi - this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzd(int i7) {
        if (i7 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzc = i7 + zzc();
        int i8 = this.zzm;
        if (zzc > i8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = zzc;
        zzI();
        return i8;
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
        long j = this.zzi;
        if (this.zzh - j < 4) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = 4 + j;
        int zza2 = zzhad.zza(j) & 255;
        int zza3 = zzhad.zza(1 + j) & 255;
        int zza4 = zzhad.zza(2 + j) & 255;
        return ((zzhad.zza(j + 3) & 255) << 24) | (zza3 << 8) | zza2 | (zza4 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0089, code lost:
    
        if (com.google.android.gms.internal.ads.zzhad.zza(r3) >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zzi() {
        int i7;
        long j = this.zzi;
        if (this.zzh != j) {
            long j3 = 1 + j;
            byte zza2 = zzhad.zza(j);
            if (zza2 >= 0) {
                this.zzi = j3;
                return zza2;
            }
            if (this.zzh - j3 >= 9) {
                long j7 = 2 + j;
                int zza3 = (zzhad.zza(j3) << 7) ^ zza2;
                if (zza3 < 0) {
                    i7 = zza3 ^ (-128);
                } else {
                    long j8 = 3 + j;
                    int zza4 = zza3 ^ (zzhad.zza(j7) << 14);
                    if (zza4 >= 0) {
                        i7 = zza4 ^ 16256;
                    } else {
                        j7 = 4 + j;
                        int zza5 = zza4 ^ (zzhad.zza(j8) << 21);
                        if (zza5 < 0) {
                            i7 = (-2080896) ^ zza5;
                        } else {
                            j8 = 5 + j;
                            byte zza6 = zzhad.zza(j7);
                            int i8 = (zza5 ^ (zza6 << 28)) ^ 266354560;
                            if (zza6 < 0) {
                                j7 = 6 + j;
                                if (zzhad.zza(j8) < 0) {
                                    j8 = 7 + j;
                                    if (zzhad.zza(j7) < 0) {
                                        j7 = 8 + j;
                                        if (zzhad.zza(j8) < 0) {
                                            j8 = j + 9;
                                            if (zzhad.zza(j7) < 0) {
                                                j7 = 10 + j;
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                    }
                    j7 = j8;
                }
                this.zzi = j7;
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
            this.zzl = 0;
            return 0;
        }
        int zzi = zzi();
        this.zzl = zzi;
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
        long j = this.zzi;
        if (this.zzh - j < 8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = 8 + j;
        long zza2 = zzhad.zza(j);
        long zza3 = zzhad.zza(1 + j);
        long zza4 = zzhad.zza(2 + j);
        long zza5 = zzhad.zza(3 + j);
        long zza6 = zzhad.zza(4 + j);
        return ((zzhad.zza(j + 7) & 255) << 56) | (zza2 & 255) | ((zza3 & 255) << 8) | ((zza4 & 255) << 16) | ((zza5 & 255) << 24) | ((zza6 & 255) << 32) | ((zzhad.zza(5 + j) & 255) << 40) | ((zzhad.zza(6 + j) & 255) << 48);
    }

    public final long zzq() {
        long j;
        long j3;
        int i7;
        long j7 = this.zzi;
        if (this.zzh != j7) {
            long j8 = 1 + j7;
            byte zza2 = zzhad.zza(j7);
            if (zza2 >= 0) {
                this.zzi = j8;
                return zza2;
            }
            if (this.zzh - j8 >= 9) {
                long j9 = 2 + j7;
                int zza3 = (zzhad.zza(j8) << 7) ^ zza2;
                if (zza3 >= 0) {
                    long j10 = 3 + j7;
                    int zza4 = zza3 ^ (zzhad.zza(j9) << 14);
                    if (zza4 >= 0) {
                        j = zza4 ^ 16256;
                    } else {
                        j9 = 4 + j7;
                        int zza5 = zza4 ^ (zzhad.zza(j10) << 21);
                        if (zza5 < 0) {
                            i7 = (-2080896) ^ zza5;
                        } else {
                            j10 = 5 + j7;
                            long zza6 = (zzhad.zza(j9) << 28) ^ zza5;
                            if (zza6 < 0) {
                                long j11 = 6 + j7;
                                long zza7 = (zzhad.zza(j10) << 35) ^ zza6;
                                if (zza7 >= 0) {
                                    j9 = j7 + 7;
                                    long zza8 = zza7 ^ (zzhad.zza(j11) << 42);
                                    if (zza8 >= 0) {
                                        j = 4363953127296L ^ zza8;
                                    } else {
                                        j11 = 8 + j7;
                                        zza7 = zza8 ^ (zzhad.zza(j9) << 49);
                                        if (zza7 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j9 = j7 + 9;
                                            long zza9 = (zza7 ^ (zzhad.zza(j11) << 56)) ^ 71499008037633920L;
                                            if (zza9 < 0) {
                                                long j12 = j7 + 10;
                                                if (zzhad.zza(j9) >= 0) {
                                                    j9 = j12;
                                                }
                                            }
                                            j = zza9;
                                        }
                                    }
                                    this.zzi = j9;
                                    return j;
                                }
                                j3 = -34093383808L;
                                j = j3 ^ zza7;
                                j9 = j11;
                                this.zzi = j9;
                                return j;
                            }
                            j = 266354560 ^ zza6;
                        }
                    }
                    j9 = j10;
                    this.zzi = j9;
                    return j;
                }
                i7 = zza3 ^ (-128);
                j = i7;
                this.zzi = j9;
                return j;
            }
        }
        return zzr();
    }

    public final long zzr() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            long j3 = this.zzi;
            if (j3 == this.zzh) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzi = 1 + j3;
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zzhad.zza(j3) & 128) == 0) {
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
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return zzgvy.zzb;
            }
            if (zzi < 0) {
                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzi];
        long j = zzi;
        zzhad.zzo(this.zzi, bArr, 0L, j);
        this.zzi += j;
        zzgvy zzgvyVar = zzgvy.zzb;
        return new zzgvv(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzw() {
        int zzi = zzi();
        if (zzi <= 0 || zzi > zzC()) {
            if (zzi == 0) {
                return "";
            }
            if (zzi < 0) {
                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[zzi];
        long j = zzi;
        zzhad.zzo(this.zzi, bArr, 0L, j);
        String str = new String(bArr, zzgxt.zza);
        this.zzi += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzx() {
        int zzi = zzi();
        if (zzi > 0 && zzi <= zzC()) {
            String zzg = zzhai.zzg(this.zzf, (int) (this.zzi - this.zzg), zzi);
            this.zzi += zzi;
            return zzg;
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
        if (this.zzl != i7) {
            throw new zzgxv("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzz(int i7) {
        this.zzm = i7;
        zzI();
    }
}
