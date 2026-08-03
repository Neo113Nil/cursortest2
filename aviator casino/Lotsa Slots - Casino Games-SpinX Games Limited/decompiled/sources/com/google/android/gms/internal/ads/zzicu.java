package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzicu extends com.google.android.gms.internal.ads.zzicx {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zzicu(byte[] bArr, int i, int i2) {
        super(null);
        zzD(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzida zzc(int i, int i2) {
        int zzD = zzD(i, i2, this.zzd);
        return zzD == 0 ? com.google.android.gms.internal.ads.zzida.zza : new com.google.android.gms.internal.ads.zzicu(this.zzb, this.zzc + i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzida zzd(int i, int i2) {
        int zzD = zzD(i, i2, this.zzd);
        return zzD == 0 ? com.google.android.gms.internal.ads.zzida.zza : new com.google.android.gms.internal.ads.zzicu(this.zzb, this.zzc + i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zzb, this.zzc + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final java.nio.ByteBuffer zzf() {
        return java.nio.ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final void zzg(com.google.android.gms.internal.ads.zzicr zzicrVar) throws java.io.IOException {
        zzicrVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final java.lang.String zzh(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        return com.google.android.gms.internal.ads.zzihf.zzb(bArr, i, this.zzd + i);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final boolean zzj(com.google.android.gms.internal.ads.zzida zzidaVar) {
        return ((zzidaVar instanceof com.google.android.gms.internal.ads.zzicy) || (zzidaVar instanceof com.google.android.gms.internal.ads.zzicu)) ? zzk(zzidaVar, 0, this.zzd) : zzidaVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicx
    final boolean zzk(com.google.android.gms.internal.ads.zzida zzidaVar, int i, int i2) {
        if (i2 > zzidaVar.zzb()) {
            int i3 = this.zzd;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(i2).length() + 18 + java.lang.String.valueOf(i3).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i3);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i4 = i + i2;
        if (i4 <= zzidaVar.zzb()) {
            if (zzidaVar instanceof com.google.android.gms.internal.ads.zzicy) {
                return com.google.android.gms.internal.ads.zzida.zzE(this.zzb, this.zzc, ((com.google.android.gms.internal.ads.zzicy) zzidaVar).zzn(), i, i2);
            }
            if (zzidaVar instanceof com.google.android.gms.internal.ads.zzicu) {
                com.google.android.gms.internal.ads.zzicu zzicuVar = (com.google.android.gms.internal.ads.zzicu) zzidaVar;
                return com.google.android.gms.internal.ads.zzida.zzE(this.zzb, this.zzc, zzicuVar.zzb, zzicuVar.zzc + i, i2);
            }
            com.google.android.gms.internal.ads.zzida zzd = zzidaVar.zzd(i, i4);
            int i5 = this.zzc;
            return zzd.equals(zzd(i5, i2 + i5));
        }
        int zzb = zzidaVar.zzb();
        int length = java.lang.String.valueOf(i).length();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length + 24 + java.lang.String.valueOf(i2).length() + 2 + java.lang.String.valueOf(zzb).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(zzb);
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final int zzl(int i, int i2, int i3) {
        return com.google.android.gms.internal.ads.zzier.zzb(i, this.zzb, this.zzc + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzide zzm() {
        return com.google.android.gms.internal.ads.zzide.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
