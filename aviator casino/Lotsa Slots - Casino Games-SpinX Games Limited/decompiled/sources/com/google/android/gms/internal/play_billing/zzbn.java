package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
class zzbn extends com.google.android.gms.internal.play_billing.zzbm {
    protected final byte[] zza;

    zzbn(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzbq) || zzd() != ((com.google.android.gms.internal.play_billing.zzbq) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.play_billing.zzbn)) {
            return obj.equals(this);
        }
        com.google.android.gms.internal.play_billing.zzbn zzbnVar = (com.google.android.gms.internal.play_billing.zzbn) obj;
        int zzk = zzk();
        int zzk2 = zzbnVar.zzk();
        if (zzk != 0 && zzk2 != 0 && zzk != zzk2) {
            return false;
        }
        int zzd = zzd();
        if (zzd > zzbnVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        if (zzd > zzbnVar.zzd()) {
            throw new java.lang.IllegalArgumentException("Ran off end of other: 0, " + zzd + ", " + zzbnVar.zzd());
        }
        if (!(zzbnVar instanceof com.google.android.gms.internal.play_billing.zzbn)) {
            return zzbnVar.zzf(0, zzd).equals(zzf(0, zzd));
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzbnVar.zza;
        zzbnVar.zzc();
        int i = 0;
        int i2 = 0;
        while (i < zzd) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public byte zza(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    byte zzb(int i) {
        return this.zza[i];
    }

    protected int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public int zzd() {
        return this.zza.length;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    protected final int zze(int i, int i2, int i3) {
        return com.google.android.gms.internal.play_billing.zzda.zzb(i, this.zza, 0, i3);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final com.google.android.gms.internal.play_billing.zzbq zzf(int i, int i2) {
        int zzj = zzj(0, i2, zzd());
        return zzj == 0 ? com.google.android.gms.internal.play_billing.zzbq.zzb : new com.google.android.gms.internal.play_billing.zzbj(this.zza, 0, zzj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    protected final java.lang.String zzg(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zza, 0, zzd(), charset);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    final void zzh(com.google.android.gms.internal.play_billing.zzbf zzbfVar) throws java.io.IOException {
        ((com.google.android.gms.internal.play_billing.zzbv) zzbfVar).zzc(this.zza, 0, zzd());
    }

    @Override // com.google.android.gms.internal.play_billing.zzbq
    public final boolean zzi() {
        return com.google.android.gms.internal.play_billing.zzfu.zze(this.zza, 0, zzd());
    }
}
