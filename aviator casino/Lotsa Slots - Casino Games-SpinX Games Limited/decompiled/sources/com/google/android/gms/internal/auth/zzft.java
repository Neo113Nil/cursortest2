package com.google.android.gms.internal.auth;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes4.dex */
final class zzft {
    private static final com.google.android.gms.internal.auth.zzfs zza;
    private static final com.google.android.gms.internal.auth.zzfs zzb;

    static {
        com.google.android.gms.internal.auth.zzfs zzfsVar;
        try {
            zzfsVar = (com.google.android.gms.internal.auth.zzfs) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzfsVar = null;
        }
        zza = zzfsVar;
        zzb = new com.google.android.gms.internal.auth.zzfs();
    }

    static com.google.android.gms.internal.auth.zzfs zza() {
        return zza;
    }

    static com.google.android.gms.internal.auth.zzfs zzb() {
        return zzb;
    }
}
