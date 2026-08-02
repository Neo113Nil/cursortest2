package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.nio.ByteBuffer;
import java.util.Iterator;

/* loaded from: classes.dex */
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
        return (int) (((this.zzh - this.zzl) - this.zzm) + this.zzn);
    }

    private final void zzJ() {
        if (!this.zzf.hasNext()) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        zzM();
    }

    private final void zzK(byte[] bArr, int i7, int i8) {
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
            int min = Math.min(i9, (int) (this.zzo - this.zzm));
            long j = min;
            zzhad.zzo(this.zzm, bArr, i8 - i9, j);
            i9 -= min;
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
        long position = byteBuffer.position();
        this.zzm = position;
        this.zzn = position;
        this.zzo = this.zzg.limit();
        long zze = zzhad.zze(this.zzg);
        this.zzm += zze;
        this.zzn += zze;
        this.zzo += zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzA() {
        return (((long) this.zzl) + this.zzm) - this.zzn == ((long) this.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final boolean zzB() {
        return zzr() != 0;
    }

    public final long zzC() {
        long j = 0;
        for (int i7 = 0; i7 < 64; i7 += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i7;
            if ((zzh() & 128) == 0) {
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
        return (int) ((this.zzl + this.zzm) - this.zzn);
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final int zzd(int i7) {
        if (i7 < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int zzc = i7 + zzc();
        int i8 = this.zzj;
        if (zzc > i8) {
            throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzj = zzc;
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

    public final byte zzh() {
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
            int zzh = zzh() & 255;
            int zzh2 = (zzh() & 255) << 8;
            return zzh | zzh2 | ((zzh() & 255) << 16) | ((zzh() & 255) << 24);
        }
        this.zzm = 4 + j3;
        int zza = zzhad.zza(j3) & 255;
        int zza2 = (zzhad.zza(1 + j3) & 255) << 8;
        return zza | zza2 | ((zzhad.zza(2 + j3) & 255) << 16) | ((zzhad.zza(j3 + 3) & 255) << 24);
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
    public final int zzl() {
        if (zzA()) {
            this.zzk = 0;
            return 0;
        }
        int zzp = zzp();
        this.zzk = zzp;
        if ((zzp >>> 3) != 0) {
            return zzp;
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
            byte zza = zzhad.zza(j);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j7 = 2 + j;
                int zza2 = (zzhad.zza(j3) << 7) ^ zza;
                if (zza2 < 0) {
                    i7 = zza2 ^ (-128);
                } else {
                    long j8 = 3 + j;
                    int zza3 = (zzhad.zza(j7) << 14) ^ zza2;
                    if (zza3 >= 0) {
                        i7 = zza3 ^ 16256;
                    } else {
                        long j9 = 4 + j;
                        int zza4 = zza3 ^ (zzhad.zza(j8) << 21);
                        if (zza4 < 0) {
                            i7 = (-2080896) ^ zza4;
                        } else {
                            j8 = 5 + j;
                            byte zza5 = zzhad.zza(j9);
                            int i8 = (zza4 ^ (zza5 << 28)) ^ 266354560;
                            if (zza5 < 0) {
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
            return (zzh() & 255) | ((zzh() & 255) << 8) | ((zzh() & 255) << 16) | ((zzh() & 255) << 24) | ((zzh() & 255) << 32) | ((zzh() & 255) << 40) | ((zzh() & 255) << 48) | ((zzh() & 255) << 56);
        }
        this.zzm = 8 + j3;
        long zza = zzhad.zza(j3) & 255;
        long zza2 = (zzhad.zza(1 + j3) & 255) << 8;
        long zza3 = (zzhad.zza(j3 + 2) & 255) << 16;
        long zza4 = (zzhad.zza(3 + j3) & 255) << 24;
        long zza5 = (zzhad.zza(j3 + 4) & 255) << 32;
        return zza5 | zza | zza2 | zza3 | zza4 | ((zzhad.zza(j3 + 5) & 255) << 40) | ((zzhad.zza(j3 + 6) & 255) << 48) | ((zzhad.zza(j3 + 7) & 255) << 56);
    }

    public final long zzr() {
        long j;
        long j3;
        long j7 = this.zzm;
        if (this.zzo != j7) {
            long j8 = j7 + 1;
            byte zza = zzhad.zza(j7);
            if (zza >= 0) {
                this.zzm++;
                return zza;
            }
            if (this.zzo - this.zzm >= 10) {
                long j9 = 2 + j7;
                int zza2 = (zzhad.zza(j8) << 7) ^ zza;
                if (zza2 < 0) {
                    j = zza2 ^ (-128);
                } else {
                    long j10 = 3 + j7;
                    int zza3 = (zzhad.zza(j9) << 14) ^ zza2;
                    if (zza3 >= 0) {
                        j = zza3 ^ 16256;
                    } else {
                        long j11 = 4 + j7;
                        int zza4 = zza3 ^ (zzhad.zza(j10) << 21);
                        if (zza4 < 0) {
                            j = (-2080896) ^ zza4;
                            j9 = j11;
                        } else {
                            j10 = 5 + j7;
                            long zza5 = (zzhad.zza(j11) << 28) ^ zza4;
                            if (zza5 >= 0) {
                                j = 266354560 ^ zza5;
                            } else {
                                long j12 = 6 + j7;
                                long zza6 = zza5 ^ (zzhad.zza(j10) << 35);
                                if (zza6 < 0) {
                                    j3 = -34093383808L;
                                } else {
                                    long j13 = 7 + j7;
                                    long zza7 = zza6 ^ (zzhad.zza(j12) << 42);
                                    if (zza7 >= 0) {
                                        j = 4363953127296L ^ zza7;
                                    } else {
                                        j12 = 8 + j7;
                                        zza6 = zza7 ^ (zzhad.zza(j13) << 49);
                                        if (zza6 < 0) {
                                            j3 = -558586000294016L;
                                        } else {
                                            j13 = 9 + j7;
                                            long zza8 = (zza6 ^ (zzhad.zza(j12) << 56)) ^ 71499008037633920L;
                                            if (zza8 < 0) {
                                                long j14 = j7 + 10;
                                                if (zzhad.zza(j13) >= 0) {
                                                    j = zza8;
                                                    j9 = j14;
                                                }
                                            } else {
                                                j = zza8;
                                            }
                                        }
                                    }
                                    j9 = j13;
                                }
                                j = j3 ^ zza6;
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
    public final zzgvy zzv() {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j3 = this.zzm;
            long j7 = zzp;
            if (j7 <= j - j3) {
                byte[] bArr = new byte[zzp];
                zzhad.zzo(j3, bArr, 0L, j7);
                this.zzm += j7;
                zzgvy zzgvyVar = zzgvy.zzb;
                return new zzgvv(bArr);
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            zzgvy zzgvyVar2 = zzgvy.zzb;
            return new zzgvv(bArr2);
        }
        if (zzp == 0) {
            return zzgvy.zzb;
        }
        if (zzp < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzw() {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j3 = this.zzm;
            long j7 = zzp;
            if (j7 <= j - j3) {
                byte[] bArr = new byte[zzp];
                zzhad.zzo(j3, bArr, 0L, j7);
                String str = new String(bArr, zzgxt.zza);
                this.zzm += j7;
                return str;
            }
        }
        if (zzp > 0 && zzp <= zzI()) {
            byte[] bArr2 = new byte[zzp];
            zzK(bArr2, 0, zzp);
            return new String(bArr2, zzgxt.zza);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp < 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final String zzx() {
        int zzp = zzp();
        if (zzp > 0) {
            long j = this.zzo;
            long j3 = this.zzm;
            long j7 = zzp;
            if (j7 <= j - j3) {
                String zzg = zzhai.zzg(this.zzg, (int) (j3 - this.zzn), zzp);
                this.zzm += j7;
                return zzg;
            }
        }
        if (zzp >= 0 && zzp <= zzI()) {
            byte[] bArr = new byte[zzp];
            zzK(bArr, 0, zzp);
            return zzhai.zzh(bArr, 0, zzp);
        }
        if (zzp == 0) {
            return "";
        }
        if (zzp <= 0) {
            throw new zzgxv("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new zzgxv("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.google.android.gms.internal.ads.zzgwe
    public final void zzy(int i7) {
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
