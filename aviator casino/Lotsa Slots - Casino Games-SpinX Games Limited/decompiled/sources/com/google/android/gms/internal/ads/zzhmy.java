package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhmy {
    private final java.lang.Class zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzhmy(java.lang.Class cls, java.lang.Class cls2, byte[] bArr) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static com.google.android.gms.internal.ads.zzhmy zzd(com.google.android.gms.internal.ads.zzhmx zzhmxVar, java.lang.Class cls, java.lang.Class cls2) {
        return new com.google.android.gms.internal.ads.zzhmw(cls, cls2, zzhmxVar);
    }

    public abstract com.google.android.gms.internal.ads.zzhns zza(com.google.android.gms.internal.ads.zzheh zzhehVar) throws java.security.GeneralSecurityException;

    public final java.lang.Class zzb() {
        return this.zza;
    }

    public final java.lang.Class zzc() {
        return this.zzb;
    }
}
