package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhlu {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzhlu(java.lang.Class cls, java.lang.Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static com.google.android.gms.internal.ads.zzhlu zzd(com.google.android.gms.internal.ads.zzhlt zzhltVar, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.zzhls(cls, cls2, zzhltVar);
    }

    public abstract com.google.android.gms.internal.ads.zzhns zza(com.google.android.gms.internal.ads.zzhdq zzhdqVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzb() {
        return this.zza;
    }

    public final java.lang.Class zzc() {
        return this.zzb;
    }
}
