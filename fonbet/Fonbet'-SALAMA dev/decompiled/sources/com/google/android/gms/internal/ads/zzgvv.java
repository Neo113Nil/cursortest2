package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import v0.AbstractC1663a;

/* loaded from: classes.dex */
class zzgvv extends zzgvu {
    protected final byte[] zza;

    public zzgvv(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgvy) || zzd() != ((zzgvy) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof zzgvv)) {
            return obj.equals(this);
        }
        zzgvv zzgvvVar = (zzgvv) obj;
        int zzr = zzr();
        int zzr2 = zzgvvVar.zzr();
        if (zzr == 0 || zzr2 == 0 || zzr == zzr2) {
            return zzg(zzgvvVar, 0, zzd());
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public byte zza(int i7) {
        return this.zza[i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public byte zzb(int i7) {
        return this.zza[i7];
    }

    public int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(this.zza, i7, bArr, i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzgvu
    public final boolean zzg(zzgvy zzgvyVar, int i7, int i8) {
        if (i8 > zzgvyVar.zzd()) {
            throw new IllegalArgumentException("Length too large: " + i8 + zzd());
        }
        int i9 = i7 + i8;
        if (i9 > zzgvyVar.zzd()) {
            int zzd = zzgvyVar.zzd();
            StringBuilder g3 = AbstractC1663a.g("Ran off end of other: ", i7, ", ", i8, ", ");
            g3.append(zzd);
            throw new IllegalArgumentException(g3.toString());
        }
        if (!(zzgvyVar instanceof zzgvv)) {
            return zzgvyVar.zzk(i7, i9).equals(zzk(0, i8));
        }
        zzgvv zzgvvVar = (zzgvv) zzgvyVar;
        byte[] bArr = this.zza;
        byte[] bArr2 = zzgvvVar.zza;
        int zzc = zzc() + i8;
        int zzc2 = zzc();
        int zzc3 = zzgvvVar.zzc() + i7;
        while (zzc2 < zzc) {
            if (bArr[zzc2] != bArr2[zzc3]) {
                return false;
            }
            zzc2++;
            zzc3++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzi(int i7, int i8, int i9) {
        return zzgxt.zzb(i7, this.zza, zzc() + i8, i9);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final int zzj(int i7, int i8, int i9) {
        int zzc = zzc() + i8;
        return zzhai.zzf(i7, this.zza, zzc, i9 + zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgvy zzk(int i7, int i8) {
        int zzq = zzgvy.zzq(i7, i8, zzd());
        return zzq == 0 ? zzgvy.zzb : new zzgvs(this.zza, zzc() + i7, zzq);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final zzgwe zzl() {
        return zzgwe.zzH(this.zza, zzc(), zzd(), true);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final String zzm(Charset charset) {
        return new String(this.zza, zzc(), zzd(), charset);
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final ByteBuffer zzn() {
        return ByteBuffer.wrap(this.zza, zzc(), zzd()).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final void zzo(zzgvp zzgvpVar) {
        zzgvpVar.zza(this.zza, zzc(), zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzgvy
    public final boolean zzp() {
        int zzc = zzc();
        return zzhai.zzi(this.zza, zzc, zzd() + zzc);
    }
}
