package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zzicy extends com.google.android.gms.internal.ads.zzicx {
    private final byte[] zzb;

    zzicy(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzida zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzD = zzD(i, i2, bArr.length);
        return zzD == 0 ? com.google.android.gms.internal.ads.zzida.zza : new com.google.android.gms.internal.ads.zzicu(bArr, i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzida zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzD = zzD(i, i2, bArr.length);
        return zzD == 0 ? com.google.android.gms.internal.ads.zzida.zza : new com.google.android.gms.internal.ads.zzicu(bArr, i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        java.lang.System.arraycopy(this.zzb, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final java.nio.ByteBuffer zzf() {
        return java.nio.ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzida
    final void zzg(com.google.android.gms.internal.ads.zzicr zzicrVar) throws java.io.IOException {
        byte[] bArr = this.zzb;
        zzicrVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final java.lang.String zzh(java.nio.charset.Charset charset) {
        return new java.lang.String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final boolean zzi() {
        return com.google.android.gms.internal.ads.zzihf.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    protected final boolean zzj(com.google.android.gms.internal.ads.zzida zzidaVar) {
        return zzidaVar instanceof com.google.android.gms.internal.ads.zzicy ? java.util.Arrays.equals(this.zzb, ((com.google.android.gms.internal.ads.zzicy) zzidaVar).zzb) : zzidaVar instanceof com.google.android.gms.internal.ads.zzicu ? zzk(zzidaVar, 0, this.zzb.length) : zzidaVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzicx
    final boolean zzk(com.google.android.gms.internal.ads.zzida zzidaVar, int i, int i2) {
        if (i2 > zzidaVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = java.lang.String.valueOf(i2).length();
            int length2 = bArr.length;
            java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 18 + java.lang.String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 <= zzidaVar.zzb()) {
            if (zzidaVar instanceof com.google.android.gms.internal.ads.zzicy) {
                return com.google.android.gms.internal.ads.zzida.zzE(this.zzb, 0, ((com.google.android.gms.internal.ads.zzicy) zzidaVar).zzb, i, i2);
            }
            if (!(zzidaVar instanceof com.google.android.gms.internal.ads.zzicu)) {
                return zzidaVar.zzd(i, i3).equals(zzd(0, i2));
            }
            com.google.android.gms.internal.ads.zzicu zzicuVar = (com.google.android.gms.internal.ads.zzicu) zzidaVar;
            return com.google.android.gms.internal.ads.zzida.zzE(this.zzb, 0, zzicuVar.zzn(), zzicuVar.zzo() + i, i2);
        }
        int zzb = zzidaVar.zzb();
        int length3 = java.lang.String.valueOf(i).length();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length3 + 24 + java.lang.String.valueOf(i2).length() + 2 + java.lang.String.valueOf(zzb).length());
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
        return com.google.android.gms.internal.ads.zzier.zzb(i, this.zzb, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zzida
    public final com.google.android.gms.internal.ads.zzide zzm() {
        byte[] bArr = this.zzb;
        return com.google.android.gms.internal.ads.zzide.zzI(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
