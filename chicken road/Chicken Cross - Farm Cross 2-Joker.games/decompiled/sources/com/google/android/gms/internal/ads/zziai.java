package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
final class zziai implements zzhfo {
    private final zzhoh zza;

    zziai(zzhoh zzhohVar, zzhni zzhniVar) {
        this.zza = zzhohVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhfo
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        for (zziaj zziajVar : this.zza.zza(bArr)) {
            try {
                zziajVar.zza.zza(bArr, bArr2);
                int i = zziajVar.zzb;
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("invalid signature");
    }
}
