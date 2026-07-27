package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zzhld implements zzhek {
    private final zzhoh zza;

    @Override // com.google.android.gms.internal.ads.zzhek
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zzhlc zzhlcVar : this.zza.zza(bArr)) {
            try {
                byte[] zza = zzhlcVar.zza.zza(bArr, bArr2);
                int i = zzhlcVar.zzb;
                int length = bArr.length;
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
