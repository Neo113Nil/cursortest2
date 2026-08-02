package com.google.android.gms.internal.ads;

import W5.AbstractC0486a1;
import java.util.Locale;

/* loaded from: classes.dex */
final class zzgwh extends zzgwl {
    private final byte[] zza;
    private final int zzb;
    private int zzc;

    public zzgwh(byte[] bArr, int i7, int i8) {
        super(null);
        int length = bArr.length;
        if (((length - i8) | i8) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(AbstractC0486a1.e(length, i8, "Array range is invalid. Buffer.length=", ", offset=0, length="));
        }
        this.zza = bArr;
        this.zzc = 0;
        this.zzb = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzK() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzL(byte b7) {
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i7 = this.zzc;
        try {
            int i8 = i7 + 1;
            try {
                this.zza[i7] = b7;
                this.zzc = i8;
            } catch (IndexOutOfBoundsException e7) {
                indexOutOfBoundsException = e7;
                i7 = i8;
                throw new zzgwi(i7, this.zzb, 1, indexOutOfBoundsException);
            }
        } catch (IndexOutOfBoundsException e8) {
            indexOutOfBoundsException = e8;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzM(int i7, boolean z4) {
        zzu(i7 << 3);
        zzL(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzN(int i7, zzgvy zzgvyVar) {
        zzu((i7 << 3) | 2);
        zzu(zzgvyVar.zzd());
        zzgvyVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl, com.google.android.gms.internal.ads.zzgvp
    public final void zza(byte[] bArr, int i7, int i8) {
        zze(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final int zzb() {
        return this.zzb - this.zzc;
    }

    public final void zze(byte[] bArr, int i7, int i8) {
        try {
            System.arraycopy(bArr, i7, this.zza, this.zzc, i8);
            this.zzc += i8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzgwi(this.zzc, this.zzb, i8, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzh(int i7, int i8) {
        zzu((i7 << 3) | 5);
        zzi(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzi(int i7) {
        int i8 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i8] = (byte) i7;
            bArr[i8 + 1] = (byte) (i7 >> 8);
            bArr[i8 + 2] = (byte) (i7 >> 16);
            bArr[i8 + 3] = (byte) (i7 >> 24);
            this.zzc = i8 + 4;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzgwi(i8, this.zzb, 4, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzj(int i7, long j) {
        zzu((i7 << 3) | 1);
        zzk(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzk(long j) {
        int i7 = this.zzc;
        try {
            byte[] bArr = this.zza;
            bArr[i7] = (byte) j;
            bArr[i7 + 1] = (byte) (j >> 8);
            bArr[i7 + 2] = (byte) (j >> 16);
            bArr[i7 + 3] = (byte) (j >> 24);
            bArr[i7 + 4] = (byte) (j >> 32);
            bArr[i7 + 5] = (byte) (j >> 40);
            bArr[i7 + 6] = (byte) (j >> 48);
            bArr[i7 + 7] = (byte) (j >> 56);
            this.zzc = i7 + 8;
        } catch (IndexOutOfBoundsException e7) {
            throw new zzgwi(i7, this.zzb, 8, e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzl(int i7, int i8) {
        zzu(i7 << 3);
        zzm(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzm(int i7) {
        if (i7 >= 0) {
            zzu(i7);
        } else {
            zzw(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzn(int i7, zzgyr zzgyrVar, zzgzk zzgzkVar) {
        zzu((i7 << 3) | 2);
        zzu(((zzgvh) zzgyrVar).zzaM(zzgzkVar));
        zzgzkVar.zzj(zzgyrVar, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzo(int i7, zzgyr zzgyrVar) {
        zzu(11);
        zzt(2, i7);
        zzu(26);
        zzu(zzgyrVar.zzaY());
        zzgyrVar.zzcY(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzp(int i7, zzgvy zzgvyVar) {
        zzu(11);
        zzt(2, i7);
        zzN(3, zzgvyVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzq(int i7, String str) {
        zzu((i7 << 3) | 2);
        zzr(str);
    }

    public final void zzr(String str) {
        int i7 = this.zzc;
        try {
            int zzD = zzgwl.zzD(str.length() * 3);
            int zzD2 = zzgwl.zzD(str.length());
            if (zzD2 != zzD) {
                zzu(zzhai.zze(str));
                byte[] bArr = this.zza;
                int i8 = this.zzc;
                this.zzc = zzhai.zzd(str, bArr, i8, this.zzb - i8);
                return;
            }
            int i9 = i7 + zzD2;
            this.zzc = i9;
            int zzd = zzhai.zzd(str, this.zza, i9, this.zzb - i9);
            this.zzc = i7;
            zzu((zzd - i7) - zzD2);
            this.zzc = zzd;
        } catch (zzhah e7) {
            this.zzc = i7;
            zzG(str, e7);
        } catch (IndexOutOfBoundsException e8) {
            throw new zzgwi(e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzs(int i7, int i8) {
        zzu((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzt(int i7, int i8) {
        zzu(i7 << 3);
        zzu(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzu(int i7) {
        int i8;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i9 = this.zzc;
        while ((i7 & (-128)) != 0) {
            try {
                i8 = i9 + 1;
                try {
                    this.zza[i9] = (byte) (i7 | 128);
                    i7 >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e7) {
                    indexOutOfBoundsException = e7;
                    i9 = i8;
                    throw new zzgwi(i9, this.zzb, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e8) {
                indexOutOfBoundsException = e8;
                throw new zzgwi(i9, this.zzb, 1, indexOutOfBoundsException);
            }
        }
        i8 = i9 + 1;
        this.zza[i9] = (byte) i7;
        this.zzc = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzv(int i7, long j) {
        zzu(i7 << 3);
        zzw(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzw(long j) {
        boolean z4;
        int i7;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i8;
        int i9 = this.zzc;
        z4 = zzgwl.zzb;
        if (!z4 || this.zzb - i9 < 10) {
            while ((j & (-128)) != 0) {
                try {
                    i8 = i9 + 1;
                } catch (IndexOutOfBoundsException e7) {
                    e = e7;
                }
                try {
                    this.zza[i9] = (byte) (((int) j) | 128);
                    j >>>= 7;
                    i9 = i8;
                } catch (IndexOutOfBoundsException e8) {
                    e = e8;
                    i9 = i8;
                    indexOutOfBoundsException = e;
                    throw new zzgwi(i9, this.zzb, 1, indexOutOfBoundsException);
                }
            }
            i7 = i9 + 1;
            try {
                this.zza[i9] = (byte) j;
            } catch (IndexOutOfBoundsException e9) {
                indexOutOfBoundsException = e9;
                i9 = i7;
                throw new zzgwi(i9, this.zzb, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j & (-128)) != 0) {
                zzhad.zzq(this.zza, i9, (byte) (((int) j) | 128));
                j >>>= 7;
                i9++;
            }
            i7 = i9 + 1;
            zzhad.zzq(this.zza, i9, (byte) j);
        }
        this.zzc = i7;
    }
}
