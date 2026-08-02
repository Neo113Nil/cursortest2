package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* loaded from: classes.dex */
final class zzgea implements zzgci {
    private final zzgmi zza;

    @Override // com.google.android.gms.internal.ads.zzgci
    public final byte[] zza(byte[] bArr, byte[] bArr2) {
        Iterator it = this.zza.zza(bArr).iterator();
        while (it.hasNext()) {
            try {
                byte[] zza = ((zzgdz) it.next()).zza.zza(bArr, bArr2);
                int length = bArr.length;
                return zza;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
