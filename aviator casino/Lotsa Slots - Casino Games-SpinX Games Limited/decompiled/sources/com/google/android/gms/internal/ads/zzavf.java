package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzavf implements com.google.android.gms.internal.ads.zzave {
    @Override // com.google.android.gms.internal.ads.zzave
    public final byte zza(com.google.android.gms.internal.ads.zzavq zzavqVar, int i) {
        return zzavqVar.zzb(i);
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final com.google.android.gms.internal.ads.zzavq zzb(com.google.android.gms.internal.ads.zzavq zzavqVar, int i, int i2) {
        byte[] bArr;
        int length;
        if (i < 0 || i > i2 || i2 > (length = (bArr = zzavqVar.zza).length) || i > i2 || i2 > length) {
            throw new java.lang.IndexOutOfBoundsException();
        }
        return new com.google.android.gms.internal.ads.zzavq(com.google.android.gms.internal.ads.zzavq.zzh(bArr, i, i2 - i));
    }

    @Override // com.google.android.gms.internal.ads.zzave
    public final com.google.android.gms.internal.ads.zzave zzc() {
        return new com.google.android.gms.internal.ads.zzavf();
    }
}
