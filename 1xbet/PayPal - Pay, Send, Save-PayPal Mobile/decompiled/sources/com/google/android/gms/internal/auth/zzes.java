package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzes implements com.google.android.gms.internal.auth.zzfv {
    private static final com.google.android.gms.internal.auth.zzes zza = new com.google.android.gms.internal.auth.zzes();

    @Override // com.google.android.gms.internal.auth.zzfv
    public final com.google.android.gms.internal.auth.zzfu zzb(java.lang.Class cls) {
        if (!com.google.android.gms.internal.auth.zzev.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.gms.internal.auth.zzfu) com.google.android.gms.internal.auth.zzev.zzb(cls.asSubclass(com.google.android.gms.internal.auth.zzev.class)).zzn(3, null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzfv
    public final boolean zzc(java.lang.Class cls) {
        return com.google.android.gms.internal.auth.zzev.class.isAssignableFrom(cls);
    }

    public static com.google.android.gms.internal.auth.zzes zza() {
        return zza;
    }

    private zzes() {
    }
}
