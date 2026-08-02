package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzeo {
    private static final com.google.android.gms.internal.auth.zzem zza = new com.google.android.gms.internal.auth.zzen();
    private static final com.google.android.gms.internal.auth.zzem zzb;

    static {
        com.google.android.gms.internal.auth.zzem zzemVar;
        try {
            zzemVar = (com.google.android.gms.internal.auth.zzem) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzemVar = null;
        }
        zzb = zzemVar;
    }

    static com.google.android.gms.internal.auth.zzem zza() {
        com.google.android.gms.internal.auth.zzem zzemVar = zzb;
        if (zzemVar != null) {
            return zzemVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static com.google.android.gms.internal.auth.zzem zzb() {
        return zza;
    }
}
