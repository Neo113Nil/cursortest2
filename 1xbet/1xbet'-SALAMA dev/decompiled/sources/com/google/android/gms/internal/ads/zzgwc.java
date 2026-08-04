package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
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
        long jZze = zzhad.zze(byteBuffer);
        this.zzg = jZze;
        this.zzh = ((long) byteBuffer.limit()) + jZze;
        long jPosition = jZze + ((long) byteBuffer.position());
        this.zzi = jPosition;
        this.zzj = jPosition;
    }

    private final int zzC() {
        return (int) (this.zzh - this.zzi);
    }

    private final void zzI() {
        long j = this.zzh + ((long) this.zzk);
        this.zzh = j;
        int i7 = (int) (j - this.zzj);
        int i8 = this.zzm;
        if (i7 <= i8) {
            this.zzk = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzk = i9;
        this.zzh = j - ((long) i9);
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
    public final int zzd(int i7) throws zzgxv {
        if (i7 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i7 + zzc();
        int i8 = this.zzm;
        if (iZzc > i8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = iZzc;
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

    public final int zzh() throws zzgxv {
        long j = this.zzi;
        if (this.zzh - j < 4) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = 4 + j;
        int iZza = zzhad.zza(j) & 255;
        int iZza2 = zzhad.zza(1 + j) & 255;
        int iZza3 = zzhad.zza(2 + j) & 255;
        return ((zzhad.zza(j + 3) & 255) << 24) | (iZza2 << 8) | iZza | (iZza3 << 16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0089, code lost:
    
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
            byte bZza = zzhad.zza(j);
            if (bZza >= 0) {
                this.zzi = j3;
                return bZza;
            }
            if (this.zzh - j3 >= 9) {
                long j7 = 2 + j;
                int iZza = (zzhad.zza(j3) << 7) ^ bZza;
                if (iZza < 0) {
                    i7 = iZza ^ (-128);
                } else {
                    long j8 = 3 + j;
                    int iZza2 = iZza ^ (zzhad.zza(j7) << 14);
                    if (iZza2 >= 0) {
                        i7 = iZza2 ^ 16256;
                    } else {
                        j7 = 4 + j;
                        int iZza3 = iZza2 ^ (zzhad.zza(j8) << 21);
                        if (iZza3 < 0) {
                            i7 = (-2080896) ^ iZza3;
                        } else {
                            j8 = 5 + j;
                            byte bZza2 = zzhad.zza(j7);
                            int i8 = (iZza3 ^ (bZza2 << 28)) ^ 266354560;
                            if (bZza2 < 0) {
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
    public final int zzl() throws zzgxv {
        if (zzA()) {
            this.zzl = 0;
            return 0;
        }
        int iZzi = zzi();
        this.zzl = iZzi;
        if ((iZzi >>> 3) != 0) {
            return iZzi;
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

    public final long zzp() throws zzgxv {
        long j = this.zzi;
        if (this.zzh - j < 8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzi = 8 + j;
        long jZza = zzhad.zza(j);
        long jZza2 = zzhad.zza(1 + j);
        long jZza3 = zzhad.zza(2 + j);
        long jZza4 = zzhad.zza(3 + j);
        long jZza5 = zzhad.zza(4 + j);
        return ((((long) zzhad.zza(j + 7)) & 255) << 56) | (jZza & 255) | ((jZza2 & 255) << 8) | ((jZza3 & 255) << 16) | ((jZza4 & 255) << 24) | ((jZza5 & 255) << 32) | ((zzhad.zza(5 + j) & 255) << 40) | ((zzhad.zza(6 + j) & 255) << 48);
    }

    public final long zzq() {
        long j;
        long j3;
        int i7;
        long j7 = this.zzi;
        if (this.zzh != j7) {
            long j8 = 1 + j7;
            byte bZza = zzhad.zza(j7);
            if (bZza >= 0) {
                this.zzi = j8;
                return bZza;
            }
            if (this.zzh - j8 >= 9) {
                long j9 = 2 + j7;
                int iZza = (zzhad.zza(j8) << 7) ^ bZza;
                if (iZza >= 0) {
                    long j10 = 3 + j7;
                    int iZza2 = iZza ^ (zzhad.zza(j9) << 14);
                    if (iZza2 < 0) {
                        j9 = 4 + j7;
                        int iZza3 = iZza2 ^ (zzhad.zza(j10) << 21);
                        if (iZza3 < 0) {
                            i7 = (-2080896) ^ iZza3;
                        } else {
                            j10 = 5 + j7;
                            long jZza = (((long) zzhad.zza(j9)) << 28) ^ ((long) iZza3);
                            if (jZza >= 0) {
                                j = 266354560 ^ jZza;
                            } else {
                                long j11 = 6 + j7;
                                long jZza2 = (((long) zzhad.zza(j10)) << 35) ^ jZza;
                                if (jZza2 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    j9 = j7 + 7;
                                    long jZza3 = jZza2 ^ (((long) zzhad.zza(j11)) << 42);
                                    if (jZza3 >= 0) {
                                        j = 4363953127296L ^ jZza3;
                                    } else {
                                        j11 = 8 + j7;
                                        jZza2 = jZza3 ^ (((long) zzhad.zza(j9)) << 49);
                                        if (jZza2 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j9 = j7 + 9;
                                            long jZza4 = (jZza2 ^ (((long) zzhad.zza(j11)) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j12 = j7 + 10;
                                                if (zzhad.zza(j9) >= 0) {
                                                    j9 = j12;
                                                }
                                            }
                                            j = jZza4;
                                        }
                                    }
                                }
                                j = j3 ^ jZza2;
                                j9 = j11;
                            }
                        }
                        this.zzi = j9;
                        return j;
                    }
                    j = iZza2 ^ 16256;
                    j9 = j10;
                    this.zzi = j9;
                    return j;
                }
                i7 = iZza ^ (-128);
                j = i7;
                this.zzi = j9;
                return j;
            }
        }
        return zzr();
    }

    public final long zzr() throws zzgxv {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            long j3 = this.zzi;
            if (j3 == this.zzh) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.zzi = 1 + j3;
            byte bZza = zzhad.zza(j3);
            j |= ((long) (bZza & 127)) << i7;
            if ((bZza & 128) == 0) {
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
    public final zzgvy zzv() throws zzgxv {
        int iZzi = zzi();
        if (iZzi <= 0 || iZzi > zzC()) {
            if (iZzi == 0) {
                return zzgvy.zzb;
            }
            if (iZzi < 0) {
                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzi];
        long j = iZzi;
        zzhad.zzo(this.zzi, bArr, 0L, j);
        this.zzi += j;
        zzgvy zzgvyVar = zzgvy.zzb;
        return new zzgvv(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzw() throws zzgxv {
        int iZzi = zzi();
        if (iZzi <= 0 || iZzi > zzC()) {
            if (iZzi == 0) {
                return "";
            }
            if (iZzi < 0) {
                throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = new byte[iZzi];
        long j = iZzi;
        zzhad.zzo(this.zzi, bArr, 0L, j);
        String str = new String(bArr, zzgxt.zza);
        this.zzi += j;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzx() throws zzgxv {
        int iZzi = zzi();
        if (iZzi > 0 && iZzi <= zzC()) {
            String strZzg = zzhai.zzg(this.zzf, (int) (this.zzi - this.zzg), iZzi);
            this.zzi += (long) iZzi;
            return strZzg;
        }
        if (iZzi == 0) {
            return "";
        }
        if (iZzi <= 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzy(int i7) throws zzgxv {
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
