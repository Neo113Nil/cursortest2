package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzgd {
    private static final com.google.android.gms.internal.auth.zzgc zza;
    private static final com.google.android.gms.internal.auth.zzgc zzb;

    static {
        com.google.android.gms.internal.auth.zzgc zzgcVar;
        try {
            zzgcVar = (com.google.android.gms.internal.auth.zzgc) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzgcVar = null;
        }
        zza = zzgcVar;
        zzb = new com.google.android.gms.internal.auth.zzgc();
    }

    static com.google.android.gms.internal.auth.zzgc zzb() {
        return zzb;
    }

    static com.google.android.gms.internal.auth.zzgc zza() {
        return zza;
    }
}
