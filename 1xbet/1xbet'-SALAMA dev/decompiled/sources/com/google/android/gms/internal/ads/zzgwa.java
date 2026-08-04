package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class zzgwa extends zzgwe {
    private final Iterable zza;
    private final Iterator zzf;
    private ByteBuffer zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;

    public /* synthetic */ zzgwa(Iterable iterable, int i7, boolean z4, zzgwd zzgwdVar) {
        super(null);
        this.zzj = f.API_PRIORITY_OTHER;
        this.zzh = i7;
        this.zza = iterable;
        this.zzf = iterable.iterator();
        this.zzl = 0;
        if (i7 != 0) {
            zzM();
            return;
        }
        this.zzg = zzgxt.zzc;
        this.zzm = 0L;
        this.zzn = 0L;
        this.zzo = 0L;
    }

    private final int zzI() {
        return (int) ((((long) (this.zzh - this.zzl)) - this.zzm) + this.zzn);
    }

    private final void zzJ() throws zzgxv {
        if (!this.zzf.hasNext()) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i7, int i8) throws zzgxv {
        if (i8 > zzI()) {
            if (i8 > 0) {
                throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            return;
        }
        int i9 = i8;
        while (i9 > 0) {
            if (this.zzo - this.zzm == 0) {
                zzJ();
            }
            int iMin = Math.min(i9, (int) (this.zzo - this.zzm));
            long j = iMin;
            zzhad.zzo(this.zzm, bArr, i8 - i9, j);
            i9 -= iMin;
            this.zzm += j;
        }
    }

    private final void zzL() {
        int i7 = this.zzh + this.zzi;
        this.zzh = i7;
        int i8 = this.zzj;
        if (i7 <= i8) {
            this.zzi = 0;
            return;
        }
        int i9 = i7 - i8;
        this.zzi = i9;
        this.zzh = i7 - i9;
    }

    private final void zzM() {
        ByteBuffer byteBuffer = (ByteBuffer) this.zzf.next();
        this.zzg = byteBuffer;
        this.zzl += (int) (this.zzm - this.zzn);
        long jPosition = byteBuffer.position();
        this.zzm = jPosition;
        this.zzn = jPosition;
        this.zzo = this.zzg.limit();
        long jZze = zzhad.zze(this.zzg);
        this.zzm += jZze;
        this.zzn += jZze;
        this.zzo += jZze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzA() {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzB() {
        return zzr() != 0;
    }

    public final long zzC() throws zzgxv {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            byte bZzh = zzh();
            j |= ((long) (bZzh & 127)) << i7;
            if ((bZzh & 128) == 0) {
                return j;
            }
        }
        throw new zzgxv("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final double zza() {
        return Double.longBitsToDouble(zzq());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final float zzb() {
        return Float.intBitsToFloat(zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzc() {
        return (int) ((((long) this.zzl) + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzd(int i7) throws zzgxv {
        if (i7 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int iZzc = i7 + zzc();
        int i8 = this.zzj;
        if (iZzc > i8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = iZzc;
        zzL();
        return i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zze() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzf() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzg() {
        return zzp();
    }

    public final byte zzh() throws zzgxv {
        if (this.zzo - this.zzm == 0) {
            zzJ();
        }
        long j = this.zzm;
        this.zzm = 1 + j;
        return zzhad.zza(j);
    }

    public final int zzi() {
        long j = this.zzo;
        long j3 = this.zzm;
        if (j - j3 < 4) {
            int iZzh = zzh() & 255;
            int iZzh2 = (zzh() & 255) << 8;
            return iZzh | iZzh2 | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
        }
        this.zzm = 4 + j3;
        int iZza = zzhad.zza(j3) & 255;
        int iZza2 = (zzhad.zza(1 + j3) & 255) << 8;
        return iZza | iZza2 | ((zzhad.zza(2 + j3) & 255) << 16) | ((zzhad.zza(j3 + 3) & 255) << 24);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzj() {
        return zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzk() {
        return zzgwe.zzD(zzp());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzl() throws zzgxv {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int iZzp = zzp();
        this.zzk = iZzp;
        if ((iZzp >>> 3) != 0) {
            return iZzp;
        }
        throw new zzgxv("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzm() {
        return zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzn() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzo() {
        return zzr();
    }

    public final int zzp() {
        int i7;
        long j = this.zzm;
        if (this.zzo != j) {
            long j3 = j + 1;
            byte bZza = zzhad.zza(j);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j7 = 2 + j;
                int iZza = (zzhad.zza(j3) << 7) ^ bZza;
                if (iZza < 0) {
                    i7 = iZza ^ (-128);
                } else {
                    long j8 = 3 + j;
                    int iZza2 = (zzhad.zza(j7) << 14) ^ iZza;
                    if (iZza2 >= 0) {
                        i7 = iZza2 ^ 16256;
                    } else {
                        long j9 = 4 + j;
                        int iZza3 = iZza2 ^ (zzhad.zza(j8) << 21);
                        if (iZza3 < 0) {
                            i7 = (-2080896) ^ iZza3;
                        } else {
                            j8 = 5 + j;
                            byte bZza2 = zzhad.zza(j9);
                            int i8 = (iZza3 ^ (bZza2 << 28)) ^ 266354560;
                            if (bZza2 < 0) {
                                j9 = 6 + j;
                                if (zzhad.zza(j8) < 0) {
                                    j8 = 7 + j;
                                    if (zzhad.zza(j9) < 0) {
                                        j9 = 8 + j;
                                        if (zzhad.zza(j8) < 0) {
                                            j8 = 9 + j;
                                            if (zzhad.zza(j9) < 0) {
                                                long j10 = j + 10;
                                                if (zzhad.zza(j8) >= 0) {
                                                    i7 = i8;
                                                    j7 = j10;
                                                }
                                            }
                                        }
                                    }
                                }
                                i7 = i8;
                            }
                            i7 = i8;
                        }
                        j7 = j9;
                    }
                    j7 = j8;
                }
                this.zzm = j7;
                return i7;
            }
        }
        return (int) zzC();
    }

    public final long zzq() {
        long j = this.zzo;
        long j3 = this.zzm;
        if (j - j3 < 8) {
            long jZzh = ((long) zzh()) & 255;
            long jZzh2 = (((long) zzh()) & 255) << 8;
            long jZzh3 = (((long) zzh()) & 255) << 16;
            long jZzh4 = (((long) zzh()) & 255) << 24;
            long jZzh5 = (((long) zzh()) & 255) << 32;
            long jZzh6 = (((long) zzh()) & 255) << 40;
            return jZzh | jZzh2 | jZzh3 | jZzh4 | jZzh5 | jZzh6 | ((((long) zzh()) & 255) << 48) | ((((long) zzh()) & 255) << 56);
        }
        this.zzm = 8 + j3;
        long jZza = ((long) zzhad.zza(j3)) & 255;
        long jZza2 = (((long) zzhad.zza(1 + j3)) & 255) << 8;
        long jZza3 = (((long) zzhad.zza(j3 + 2)) & 255) << 16;
        long jZza4 = (((long) zzhad.zza(3 + j3)) & 255) << 24;
        long jZza5 = (((long) zzhad.zza(j3 + 4)) & 255) << 32;
        long jZza6 = (((long) zzhad.zza(j3 + 5)) & 255) << 40;
        return jZza5 | jZza | jZza2 | jZza3 | jZza4 | jZza6 | ((((long) zzhad.zza(j3 + 6)) & 255) << 48) | ((((long) zzhad.zza(j3 + 7)) & 255) << 56);
    }

    public final long zzr() {
        long j;
        long j3;
        long j7 = this.zzm;
        if (this.zzo != j7) {
            long j8 = j7 + 1;
            byte bZza = zzhad.zza(j7);
            if (bZza >= 0) {
                this.zzm++;
                return bZza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j9 = 2 + j7;
                int iZza = (zzhad.zza(j8) << 7) ^ bZza;
                if (iZza < 0) {
                    j = iZza ^ (-128);
                } else {
                    long j10 = 3 + j7;
                    int iZza2 = (zzhad.zza(j9) << 14) ^ iZza;
                    if (iZza2 >= 0) {
                        j = iZza2 ^ 16256;
                    } else {
                        long j11 = 4 + j7;
                        int iZza3 = iZza2 ^ (zzhad.zza(j10) << 21);
                        if (iZza3 < 0) {
                            j = (-2080896) ^ iZza3;
                            j9 = j11;
                        } else {
                            j10 = 5 + j7;
                            long jZza = (((long) zzhad.zza(j11)) << 28) ^ ((long) iZza3);
                            if (jZza >= 0) {
                                j = 266354560 ^ jZza;
                            } else {
                                long j12 = 6 + j7;
                                long jZza2 = jZza ^ (((long) zzhad.zza(j10)) << 35);
                                if (jZza2 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    long j13 = 7 + j7;
                                    long jZza3 = jZza2 ^ (((long) zzhad.zza(j12)) << 42);
                                    if (jZza3 >= 0) {
                                        j = 4363953127296L ^ jZza3;
                                    } else {
                                        j12 = 8 + j7;
                                        jZza2 = jZza3 ^ (((long) zzhad.zza(j13)) << 49);
                                        if (jZza2 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j13 = 9 + j7;
                                            long jZza4 = (jZza2 ^ (((long) zzhad.zza(j12)) << 56)) ^ 71499008037633920L;
                                            if (jZza4 < 0) {
                                                long j14 = j7 + 10;
                                                if (zzhad.zza(j13) >= 0) {
                                                    j = jZza4;
                                                    j9 = j14;
                                                }
                                            } else {
                                                j = jZza4;
                                            }
                                        }
                                    }
                                    j9 = j13;
                                }
                                j = j3 ^ jZza2;
                                j9 = j12;
                            }
                        }
                    }
                    j9 = j10;
                }
                this.zzm = j9;
                return j;
            }
        }
        return zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzs() {
        return zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzt() {
        return zzgwe.zzF(zzr());
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final long zzu() {
        return zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final zzgvy zzv() throws zzgxv {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j3 = this.zzm;
            long j7 = iZzp;
            if (j7 <= j - j3) {
                byte[] bArr = new byte[iZzp];
                zzhad.zzo(j3, bArr, 0L, j7);
                this.zzm += j7;
                zzgvy zzgvyVar = zzgvy.zzb;
                return new zzgvv(bArr);
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            zzgvy zzgvyVar2 = zzgvy.zzb;
            return new zzgvv(bArr2);
        }
        if (iZzp == 0) {
            return zzgvy.zzb;
        }
        if (iZzp < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzw() throws zzgxv {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j3 = this.zzm;
            long j7 = iZzp;
            if (j7 <= j - j3) {
                byte[] bArr = new byte[iZzp];
                zzhad.zzo(j3, bArr, 0L, j7);
                String str = new String(bArr, zzgxt.zza);
                this.zzm += j7;
                return str;
            }
        }
        if (iZzp > 0 && iZzp <= zzI()) {
            byte[] bArr2 = new byte[iZzp];
            zzK(bArr2, 0, iZzp);
            return new String(bArr2, zzgxt.zza);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzx() throws zzgxv {
        int iZzp = zzp();
        if (iZzp > 0) {
            long j = this.zzo;
            long j3 = this.zzm;
            long j7 = iZzp;
            if (j7 <= j - j3) {
                String strZzg = zzhai.zzg(this.zzg, (int) (j3 - this.zzn), iZzp);
                this.zzm += j7;
                return strZzg;
            }
        }
        if (iZzp >= 0 && iZzp <= zzI()) {
            byte[] bArr = new byte[iZzp];
            zzK(bArr, 0, iZzp);
            return zzhai.zzh(bArr, 0, iZzp);
        }
        if (iZzp == 0) {
            return "";
        }
        if (iZzp <= 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzy(int i7) throws zzgxv {
        if (this.zzk != i7) {
            throw new zzgxv("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzz(int i7) {
        this.zzj = i7;
        zzL();
    }
}
