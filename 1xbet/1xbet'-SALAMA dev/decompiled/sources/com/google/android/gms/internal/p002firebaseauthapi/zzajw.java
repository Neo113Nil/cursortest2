package com.google.android.gms.internal.p002firebaseauthapi;

/* JADX INFO: loaded from: classes.dex */
final class zzajw implements zzald {
    private static final zzajw zza = new zzajw();

    private zzajw() {
    }

    public static zzajw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final boolean zzb(Class<?> cls) {
        return zzajy.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final zzala zza(Class<?> cls) {
        if (!zzajy.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzala) zzajy.zza(cls.asSubclass(zzajy.class)).zza(zzajy.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }
}
