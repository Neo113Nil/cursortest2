package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
public final class zzdo {
    public static com.google.android.gms.internal.auth.zzdj zza(com.google.android.gms.internal.auth.zzdj zzdjVar) {
        return ((zzdjVar instanceof com.google.android.gms.internal.auth.zzdm) || (zzdjVar instanceof com.google.android.gms.internal.auth.zzdk)) ? zzdjVar : zzdjVar instanceof java.io.Serializable ? new com.google.android.gms.internal.auth.zzdk(zzdjVar) : new com.google.android.gms.internal.auth.zzdm(zzdjVar);
    }

    public static com.google.android.gms.internal.auth.zzdj zzb(java.lang.Object obj) {
        return new com.google.android.gms.internal.auth.zzdn(obj);
    }
}
