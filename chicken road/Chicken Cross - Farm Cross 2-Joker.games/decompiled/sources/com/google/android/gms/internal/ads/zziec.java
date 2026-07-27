package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zziec extends zzief {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    zziec(byte[] bArr, int i, int i2) {
        super(null);
        zzD(i, i + i2, bArr.length);
        this.zzb = bArr;
        this.zzc = i;
        this.zzd = i2;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    final byte zza(int i) {
        return this.zzb[this.zzc + i];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzc(int i, int i2) {
        int zzD = zzD(i, i2, this.zzd);
        return zzD == 0 ? zziei.zza : new zziec(this.zzb, this.zzc + i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzd(int i, int i2) {
        int zzD = zzD(i, i2, this.zzd);
        return zzD == 0 ? zziei.zza : new zziec(this.zzb, this.zzc + i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, this.zzc + i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zziei
    final void zzg(zzidz zzidzVar) throws IOException {
        zzidzVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i = this.zzc;
        return zziim.zzb(bArr, i, this.zzd + i);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final boolean zzj(zziei zzieiVar) {
        return ((zzieiVar instanceof zzieg) || (zzieiVar instanceof zziec)) ? zzk(zzieiVar, 0, this.zzd) : zzieiVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final boolean zzk(zziei zzieiVar, int i, int i2) {
        if (i2 > zzieiVar.zzb()) {
            int i3 = this.zzd;
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 18 + String.valueOf(i3).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(i3);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = i + i2;
        if (i4 <= zzieiVar.zzb()) {
            if (zzieiVar instanceof zzieg) {
                return zziei.zzE(this.zzb, this.zzc, ((zzieg) zzieiVar).zzn(), i, i2);
            }
            if (zzieiVar instanceof zziec) {
                zziec zziecVar = (zziec) zzieiVar;
                return zziei.zzE(this.zzb, this.zzc, zziecVar.zzb, zziecVar.zzc + i, i2);
            }
            zziei zzd = zzieiVar.zzd(i, i4);
            int i5 = this.zzc;
            return zzd.equals(zzd(i5, i2 + i5));
        }
        int zzb = zzieiVar.zzb();
        int length = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i2).length() + 2 + String.valueOf(zzb).length());
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(zzb);
        throw new IllegalArgumentException(sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final int zzl(int i, int i2, int i3) {
        return zzifz.zzc(i, this.zzb, this.zzc + i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem zzm() {
        return zziem.zzI(this.zzb, this.zzc, this.zzd, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    final /* synthetic */ int zzo() {
        return this.zzc;
    }
}
