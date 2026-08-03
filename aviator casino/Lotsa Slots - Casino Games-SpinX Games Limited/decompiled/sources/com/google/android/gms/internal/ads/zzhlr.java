package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzhlr {
    private final com.google.android.gms.internal.ads.zziaz zza;
    private final java.lang.Class zzb;

    /* synthetic */ zzhlr(com.google.android.gms.internal.ads.zziaz zziazVar, java.lang.Class cls, byte[] bArr) {
        this.zza = zziazVar;
        this.zzb = cls;
    }

    public static com.google.android.gms.internal.ads.zzhlr zzd(com.google.android.gms.internal.ads.zzhlq zzhlqVar, com.google.android.gms.internal.ads.zziaz zziazVar, java.lang.Class cls) {
        return new com.google.android.gms.internal.ads.zzhlp(zziazVar, cls, zzhlqVar);
    }

    public abstract com.google.android.gms.internal.ads.zzhdq zza(com.google.android.gms.internal.ads.zzhns zzhnsVar, @javax.annotation.Nullable com.google.android.gms.internal.ads.zzhel zzhelVar) throws java.security.GeneralSecurityException;

    public final com.google.android.gms.internal.ads.zziaz zzb() {
        return this.zza;
    }

    public final java.lang.Class zzc() {
        return this.zzb;
    }
}
