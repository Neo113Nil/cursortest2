package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
public final class zzdo {
    public static com.google.android.gms.internal.auth.zzdj zza(com.google.android.gms.internal.auth.zzdj zzdjVar) {
        return ((zzdjVar instanceof com.google.android.gms.internal.auth.zzdm) || (zzdjVar instanceof com.google.android.gms.internal.auth.zzdk)) ? zzdjVar : zzdjVar instanceof java.io.Serializable ? new com.google.android.gms.internal.auth.zzdk(zzdjVar) : new com.google.android.gms.internal.auth.zzdm(zzdjVar);
    }

    public static com.google.android.gms.internal.auth.zzdj zzb(java.lang.Object obj) {
        return new com.google.android.gms.internal.auth.zzdn(obj);
    }
}
