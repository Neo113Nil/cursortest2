package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhzz {
    public static final com.google.android.gms.internal.ads.zzhzz zza = new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziaa());
    public static final com.google.android.gms.internal.ads.zzhzz zzb = new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziae());
    public static final com.google.android.gms.internal.ads.zzhzz zzc = new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziag());
    public static final com.google.android.gms.internal.ads.zzhzz zzd = new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziaf());
    public static final com.google.android.gms.internal.ads.zzhzz zze;
    public static final com.google.android.gms.internal.ads.zzhzz zzf;
    private final com.google.android.gms.internal.ads.zzhzy zzg;

    static {
        new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziab());
        zze = new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziad());
        zzf = new com.google.android.gms.internal.ads.zzhzz(new com.google.android.gms.internal.ads.zziac());
    }

    public zzhzz(com.google.android.gms.internal.ads.zziah zziahVar) {
        this.zzg = !com.google.android.gms.internal.ads.zzhks.zza() ? "The Android Project".equals(java.lang.System.getProperty("java.vendor")) ? new com.google.android.gms.internal.ads.zzhzv(zziahVar, null) : new com.google.android.gms.internal.ads.zzhzw(zziahVar, null) : new com.google.android.gms.internal.ads.zzhzx(zziahVar, null);
    }

    public static java.util.List zza(java.lang.String... strArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str : strArr) {
            java.security.Provider provider = java.security.Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public final java.lang.Object zzb(java.lang.String str) throws java.security.GeneralSecurityException {
        return this.zzg.zza(str);
    }
}
