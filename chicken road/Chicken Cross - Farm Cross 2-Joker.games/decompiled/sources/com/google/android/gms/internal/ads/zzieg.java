package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zzieg extends zzief {
    private final byte[] zzb;

    zzieg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    final byte zza(int i) {
        return this.zzb[i];
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final int zzb() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzc(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzD = zzD(i, i2, bArr.length);
        return zzD == 0 ? zziei.zza : new zziec(bArr, i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziei zzd(int i, int i2) {
        byte[] bArr = this.zzb;
        int zzD = zzD(i, i2, bArr.length);
        return zzD == 0 ? zziei.zza : new zziec(bArr, i, zzD);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final void zze(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.zzb, i, bArr, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zziei
    final void zzg(zzidz zzidzVar) throws IOException {
        byte[] bArr = this.zzb;
        zzidzVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final boolean zzi() {
        return zziim.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    protected final boolean zzj(zziei zzieiVar) {
        return zzieiVar instanceof zzieg ? Arrays.equals(this.zzb, ((zzieg) zzieiVar).zzb) : zzieiVar instanceof zziec ? zzk(zzieiVar, 0, this.zzb.length) : zzieiVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzief
    final boolean zzk(zziei zzieiVar, int i, int i2) {
        if (i2 > zzieiVar.zzb()) {
            byte[] bArr = this.zzb;
            int length = String.valueOf(i2).length();
            int length2 = bArr.length;
            StringBuilder sb = new StringBuilder(length + 18 + String.valueOf(length2).length());
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        int i3 = i + i2;
        if (i3 <= zzieiVar.zzb()) {
            if (zzieiVar instanceof zzieg) {
                return zziei.zzE(this.zzb, 0, ((zzieg) zzieiVar).zzb, i, i2);
            }
            if (!(zzieiVar instanceof zziec)) {
                return zzieiVar.zzd(i, i3).equals(zzd(0, i2));
            }
            zziec zziecVar = (zziec) zzieiVar;
            return zziei.zzE(this.zzb, 0, zziecVar.zzn(), zziecVar.zzo() + i, i2);
        }
        int zzb = zzieiVar.zzb();
        int length3 = String.valueOf(i).length();
        StringBuilder sb2 = new StringBuilder(length3 + 24 + String.valueOf(i2).length() + 2 + String.valueOf(zzb).length());
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
        return zzifz.zzc(i, this.zzb, i2, i3);
    }

    @Override // com.google.android.gms.internal.ads.zziei
    public final zziem zzm() {
        byte[] bArr = this.zzb;
        return zziem.zzI(bArr, 0, bArr.length, true);
    }

    final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }
}
