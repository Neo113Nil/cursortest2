package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhev {
    static final zzhtw zza(zzhfj zzhfjVar) {
        try {
            return ((zzhot) zzhnw.zza().zzk(null, zzhot.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzhpc("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }

    public static final zzhfj zzb(zzhfj zzhfjVar) throws GeneralSecurityException {
        return zzhfjVar != null ? zzhfjVar : zzhft.zzb(zza(null).zzaN());
    }
}
