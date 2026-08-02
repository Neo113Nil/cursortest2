package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbdj implements com.google.android.libraries.places.internal.zzbev {
    private static final com.google.android.libraries.places.internal.zzbdj zza = new com.google.android.libraries.places.internal.zzbdj();

    @Override // com.google.android.libraries.places.internal.zzbev
    public final boolean zzb(java.lang.Class cls) {
        return com.google.android.libraries.places.internal.zzbdq.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.libraries.places.internal.zzbev
    public final com.google.android.libraries.places.internal.zzbeu zzc(java.lang.Class cls) {
        if (!com.google.android.libraries.places.internal.zzbdq.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.libraries.places.internal.zzbeu) com.google.android.libraries.places.internal.zzbdq.zzby(cls.asSubclass(com.google.android.libraries.places.internal.zzbdq.class)).zzb(3, null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    public static com.google.android.libraries.places.internal.zzbdj zza() {
        return zza;
    }

    private zzbdj() {
    }
}
