package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfuy {
    private final java.lang.String zza;
    private final java.lang.String zzb;

    private zzfuy(java.lang.String str, java.lang.String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static com.google.android.gms.internal.ads.zzfuy zza(java.lang.String str, java.lang.String str2) {
        com.google.android.gms.internal.ads.zzfwi.zzc(str, "Name is null or empty");
        com.google.android.gms.internal.ads.zzfwi.zzc(str2, "Version is null or empty");
        return new com.google.android.gms.internal.ads.zzfuy(str, str2);
    }

    public final java.lang.String zzb() {
        return this.zza;
    }

    public final java.lang.String zzc() {
        return this.zzb;
    }
}
