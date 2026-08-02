package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgvs extends zzgvv {
    private final int zzc;
    private final int zzd;

    public zzgvs(byte[] bArr, int i7, int i8) {
        super(bArr);
        zzgvy.zzq(i7, i7 + i8, bArr.length);
        this.zzc = i7;
        this.zzd = i8;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, com.google.android.gms.internal.ads.zzgvy
    public final byte zza(int i7) {
        zzgvy.zzy(i7, this.zzd);
        return ((zzgvv) this).zza[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, com.google.android.gms.internal.ads.zzgvy
    public final byte zzb(int i7) {
        return ((zzgvv) this).zza[this.zzc + i7];
    }

    @Override // com.google.android.gms.internal.ads.zzgvv
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, com.google.android.gms.internal.ads.zzgvy
    public final int zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzgvv, com.google.android.gms.internal.ads.zzgvy
    public final void zze(byte[] bArr, int i7, int i8, int i9) {
        System.arraycopy(((zzgvv) this).zza, this.zzc + i7, bArr, i8, i9);
    }
}
