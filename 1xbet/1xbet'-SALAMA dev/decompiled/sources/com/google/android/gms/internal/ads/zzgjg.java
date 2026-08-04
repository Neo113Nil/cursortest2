package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzgjg extends zzgjd {
    public zzgjg(byte[] bArr, int i7) {
        super(bArr, i7);
    }

    @Override // com.google.android.gms.internal.ads.zzgjd
    public final int zza() {
        return 24;
    }

    @Override // com.google.android.gms.internal.ads.zzgjd
    public final int[] zzb(int[] iArr, int i7) {
        int length = iArr.length;
        if (length != 6) {
            throw new IllegalArgumentException(String.format("XChaCha20 uses 192-bit nonces, but got a %d-bit nonce", Integer.valueOf(length * 32)));
        }
        int[] iArr2 = new int[16];
        zzgjb.zzb(iArr2, zzgjb.zzd(this.zza, iArr));
        iArr2[12] = i7;
        iArr2[13] = 0;
        iArr2[14] = iArr[4];
        iArr2[15] = iArr[5];
        return iArr2;
    }
}
