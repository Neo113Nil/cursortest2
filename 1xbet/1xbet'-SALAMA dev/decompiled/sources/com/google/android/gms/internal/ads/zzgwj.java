package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
final class zzgwj extends zzgwg {
    private final OutputStream zzg;

    public zzgwj(OutputStream outputStream, int i7) {
        super(i7);
        if (outputStream == null) {
            throw new NullPointerException("out");
        }
        this.zzg = outputStream;
    }

    private final void zzI() throws IOException {
        this.zzg.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzJ(int i7) throws IOException {
        if (this.zzb - this.zzc < i7) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzK() {
        if (this.zzc > 0) {
            zzI();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzL(byte b7) throws IOException {
        if (this.zzc == this.zzb) {
            zzI();
        }
        zzc(b7);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzM(int i7, boolean z4) throws IOException {
        zzJ(11);
        zzf(i7 << 3);
        zzc(z4 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzN(int i7, zzgvy zzgvyVar) {
        zzu((i7 << 3) | 2);
        zzu(zzgvyVar.zzd());
        zzgvyVar.zzo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl, com.google.android.gms.internal.ads.zzgvp
    public final void zza(byte[] bArr, int i7, int i8) throws IOException {
        zzr(bArr, i7, i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzh(int i7, int i8) throws IOException {
        zzJ(14);
        zzf((i7 << 3) | 5);
        zzd(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzi(int i7) throws IOException {
        zzJ(4);
        zzd(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzj(int i7, long j) throws IOException {
        zzJ(18);
        zzf((i7 << 3) | 1);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzk(long j) throws IOException {
        zzJ(8);
        zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzl(int i7, int i8) throws IOException {
        zzJ(20);
        zzf(i7 << 3);
        if (i8 >= 0) {
            zzf(i8);
        } else {
            zzg(i8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzm(int i7) throws IOException {
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
    public final void zzo(int i7, zzgyr zzgyrVar) throws IOException {
        zzu(11);
        zzt(2, i7);
        zzu(26);
        zzu(zzgyrVar.zzaY());
        zzgyrVar.zzcY(this);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzp(int i7, zzgvy zzgvyVar) throws IOException {
        zzu(11);
        zzt(2, i7);
        zzN(3, zzgvyVar);
        zzu(12);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzq(int i7, String str) throws IOException {
        zzu((i7 << 3) | 2);
        zzx(str);
    }

    public final void zzr(byte[] bArr, int i7, int i8) throws IOException {
        int i9 = this.zzb;
        int i10 = this.zzc;
        int i11 = i9 - i10;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, this.zza, i10, i8);
            this.zzc += i8;
            this.zzd += i8;
            return;
        }
        System.arraycopy(bArr, i7, this.zza, i10, i11);
        int i12 = i7 + i11;
        this.zzc = this.zzb;
        this.zzd += i11;
        zzI();
        int i13 = i8 - i11;
        if (i13 <= this.zzb) {
            System.arraycopy(bArr, i12, this.zza, 0, i13);
            this.zzc = i13;
        } else {
            this.zzg.write(bArr, i12, i13);
        }
        this.zzd += i13;
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzs(int i7, int i8) {
        zzu((i7 << 3) | i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzt(int i7, int i8) throws IOException {
        zzJ(20);
        zzf(i7 << 3);
        zzf(i8);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzu(int i7) {
        zzJ(5);
        zzf(i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzv(int i7, long j) throws IOException {
        zzJ(20);
        zzf(i7 << 3);
        zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzgwl
    public final void zzw(long j) throws IOException {
        zzJ(10);
        zzg(j);
    }

    public final void zzx(String str) throws IOException {
        int iZze;
        try {
            int length = str.length() * 3;
            int iZzD = zzgwl.zzD(length);
            int i7 = iZzD + length;
            int i8 = this.zzb;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int iZzd = zzhai.zzd(str, bArr, 0, length);
                zzu(iZzd);
                zzr(bArr, 0, iZzd);
                return;
            }
            if (i7 > i8 - this.zzc) {
                zzI();
            }
            int iZzD2 = zzgwl.zzD(str.length());
            int i9 = this.zzc;
            try {
                if (iZzD2 == iZzD) {
                    int i10 = i9 + iZzD2;
                    this.zzc = i10;
                    int iZzd2 = zzhai.zzd(str, this.zza, i10, this.zzb - i10);
                    this.zzc = i9;
                    iZze = (iZzd2 - i9) - iZzD2;
                    zzf(iZze);
                    this.zzc = iZzd2;
                } else {
                    iZze = zzhai.zze(str);
                    zzf(iZze);
                    this.zzc = zzhai.zzd(str, this.zza, this.zzc, iZze);
                }
                this.zzd += iZze;
            } catch (zzhah e7) {
                this.zzd -= this.zzc - i9;
                this.zzc = i9;
                throw e7;
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new zzgwi(e8);
            }
        } catch (zzhah e9) {
            zzG(str, e9);
        }
    }
}
