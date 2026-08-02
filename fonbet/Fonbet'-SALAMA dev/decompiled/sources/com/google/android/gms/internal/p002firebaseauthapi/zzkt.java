package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzkt implements zzlh {
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zza() {
        return 32;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final int zzb() {
        return 12;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zzc() {
        return zzlq.zzk;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlh
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3, int i7, byte[] bArr4) {
        if (bArr.length != 32) {
            throw new InvalidAlgorithmParameterException("Unexpected key length: 32");
        }
        if (zzhq.zza()) {
            return zzhq.zza(bArr).zza(bArr2, bArr3, i7, bArr4);
        }
        return new zzho(bArr).zza(bArr2, Arrays.copyOfRange(bArr3, i7, bArr3.length), bArr4);
    }
}
