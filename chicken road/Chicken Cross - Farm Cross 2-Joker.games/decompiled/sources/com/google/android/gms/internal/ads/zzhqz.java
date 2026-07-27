package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhqz implements zzhfi {
    private zzhqz(zzhfi zzhfiVar, int i, byte[] bArr) {
    }

    public static zzhfi zza(zzhne zzhneVar) throws GeneralSecurityException {
        zzhos zzc = zzhneVar.zzc(zzheq.zza());
        zzhfi zzhfiVar = (zzhfi) zzhmu.zza().zzc(zzc.zzg(), zzhfi.class).zza(zzc.zzb());
        zzhfm zzd = zzc.zzd();
        return new zzhqz(zzhfiVar, zzhor.zze(zzd), zzhor.zza(zzd, zzhneVar.zzb()).zzc());
    }
}
