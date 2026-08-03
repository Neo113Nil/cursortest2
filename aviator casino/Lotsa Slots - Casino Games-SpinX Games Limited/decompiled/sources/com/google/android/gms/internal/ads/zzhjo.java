package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhjo extends com.google.android.gms.internal.ads.zzhjp {
    public zzhjo(byte[] bArr, int i) throws java.security.InvalidKeyException {
        super(bArr, i);
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    public final int[] zza(int[] iArr, int i) {
        int length = iArr.length;
        if (length != 3) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", java.lang.Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        com.google.android.gms.internal.ads.zzhjn.zza(iArr2, this.zza);
        iArr2[12] = i;
        java.lang.System.arraycopy(iArr, 0, iArr2, 13, 3);
        return iArr2;
    }

    @Override // com.google.android.gms.internal.ads.zzhjp
    public final int zzb() {
        return 12;
    }
}
