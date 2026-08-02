package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgcv {
    public static final zzgdf zza(zzgdf zzgdfVar) {
        return zzgdfVar != null ? zzgdfVar : zzgdl.zza(zzb(null).zzaV());
    }

    public static final zzgse zzb(zzgdf zzgdfVar) {
        try {
            return ((zzgmx) zzglu.zzc().zze(null, zzgmx.class)).zzc();
        } catch (GeneralSecurityException e7) {
            throw new zzgnh("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e7);
        }
    }
}
