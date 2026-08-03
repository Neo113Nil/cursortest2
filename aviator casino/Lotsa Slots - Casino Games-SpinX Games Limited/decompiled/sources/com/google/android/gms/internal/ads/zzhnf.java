package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhnf {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzhnf(java.lang.Class cls, java.lang.Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static com.google.android.gms.internal.ads.zzhnf zzd(com.google.android.gms.internal.ads.zzhne zzhneVar, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.zzhnd(cls, cls2, zzhneVar);
    }

    public abstract java.lang.Object zza(com.google.android.gms.internal.ads.zzhdq zzhdqVar) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzb() {
        return this.zza;
    }

    public final java.lang.Class zzc() {
        return this.zzb;
    }
}
