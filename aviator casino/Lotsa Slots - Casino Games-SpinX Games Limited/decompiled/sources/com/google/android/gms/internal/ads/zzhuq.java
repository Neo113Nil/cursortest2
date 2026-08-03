package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhuq {
    public static final com.google.android.gms.internal.ads.zzhuq zza = new com.google.android.gms.internal.ads.zzhuq("NIST_P256", com.google.android.gms.internal.ads.zzhlg.zza);
    public static final com.google.android.gms.internal.ads.zzhuq zzb = new com.google.android.gms.internal.ads.zzhuq("NIST_P384", com.google.android.gms.internal.ads.zzhlg.zzb);
    public static final com.google.android.gms.internal.ads.zzhuq zzc = new com.google.android.gms.internal.ads.zzhuq("NIST_P521", com.google.android.gms.internal.ads.zzhlg.zzc);
    private final java.lang.String zzd;
    private final java.security.spec.ECParameterSpec zze;

    private zzhuq(java.lang.String str, java.security.spec.ECParameterSpec eCParameterSpec) {
        this.zzd = str;
        this.zze = eCParameterSpec;
    }

    public final java.lang.String toString() {
        return this.zzd;
    }

    public final java.security.spec.ECParameterSpec zza() {
        return this.zze;
    }
}
