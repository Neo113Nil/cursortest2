package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public abstract class zzhok {
    private final Class zza;
    private final Class zzb;

    /* synthetic */ zzhok(Class cls, Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzhok zzd(zzhoj zzhojVar, Class cls, Class cls2) {
        return new zzhoi(cls, cls2, zzhojVar);
    }

    public abstract Object zza(zzhes zzhesVar) throws GeneralSecurityException;

    public final Class zzb() {
        return this.zza;
    }

    public final Class zzc() {
        return this.zzb;
    }
}
