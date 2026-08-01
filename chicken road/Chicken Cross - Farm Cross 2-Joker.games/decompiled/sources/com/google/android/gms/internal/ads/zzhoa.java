package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzhoa {
    private final zzich zza;
    private final Class zzb;

    /* synthetic */ zzhoa(zzich zzichVar, Class cls, byte[] bArr) {
        this.zza = zzichVar;
        this.zzb = cls;
    }

    public static zzhoa zzd(zzhnz zzhnzVar, zzich zzichVar, Class cls) {
        return new zzhny(zzichVar, cls, zzhnzVar);
    }

    public abstract zzhfj zza(zzhow zzhowVar) throws GeneralSecurityException;

    public final zzich zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
