package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zziah {
    public static zzhfn zza(zzhfe zzhfeVar, zzhop zzhopVar) throws GeneralSecurityException {
        zzhnh zzhnhVar = (zzhnh) zzhfeVar.zzf(zzhnh.class);
        zzhni zza = (zzhnhVar == null || zzhnhVar.zza()) ? zzhnl.zza : zzhnr.zza().zzb().zza(zzhfeVar, zzhnhVar, "public_key_sign", "sign");
        zzhfd zzhfdVar = (zzhfd) zzhfeVar;
        return new zziaf(new zziag((zzhfn) zzhopVar.zza(zzhfdVar.zzc()), zzhfdVar.zzc().zzc()), zza);
    }
}
