package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhqr implements zzhpn {
    private zzhqr(zzhpf zzhpfVar, Provider provider) throws GeneralSecurityException {
        if (!zzhlx.zza(1)) {
            throw new GeneralSecurityException("Cannot use AES-CMAC in FIPS-mode.");
        }
        try {
            Mac.getInstance("AESCMAC", provider);
            zzhpfVar.zze().zzc();
            zzhpfVar.zzf();
            new SecretKeySpec(zzhpfVar.zzd().zzc(zzheq.zza()), "AES");
        } catch (NoSuchAlgorithmException e) {
            throw new GeneralSecurityException("AES-CMAC not available.", e);
        }
    }

    public static zzhpn zza(zzhpf zzhpfVar, Provider provider) throws GeneralSecurityException {
        return new zzhqr(zzhpfVar, provider);
    }
}
