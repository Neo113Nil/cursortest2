package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhfs {
    public static zzhfd zza(String str) throws GeneralSecurityException {
        try {
            try {
                try {
                    zzhuc zze = zzhuc.zze(zzher.zza(str).zzb().zzaN(), zziew.zzb());
                    for (zzhub zzhubVar : zze.zzb()) {
                        if (zzhubVar.zzb().zzi() == 2 || zzhubVar.zzb().zzi() == 3 || zzhubVar.zzb().zzi() == 4) {
                            int zzi = zzhubVar.zzb().zzi();
                            throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", zzi != 2 ? zzi != 3 ? zzi != 4 ? zzi != 5 ? zzi != 6 ? "UNRECOGNIZED" : "REMOTE" : "ASYMMETRIC_PUBLIC" : "ASYMMETRIC_PRIVATE" : "SYMMETRIC" : "UNKNOWN_KEYMATERIAL", zzhubVar.zzb().zza()));
                        }
                    }
                    return zzhfd.zza(zze);
                } catch (zzige unused) {
                    throw new GeneralSecurityException("invalid keyset");
                }
            } catch (zzige unused2) {
                throw new GeneralSecurityException("invalid keyset");
            }
        } catch (IOException unused3) {
            throw new GeneralSecurityException("Parse keyset failed");
        }
    }
}
