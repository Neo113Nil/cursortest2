package com.google.android.gms.internal.firebase_auth;

import com.google.android.gms.internal.firebase_auth.zzdb;

/* loaded from: classes.dex */
final class zzda implements zzeg {
    private static final zzda zzqw = new zzda();

    private zzda() {
    }

    public static zzda zzdy() {
        return zzqw;
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeg
    public final boolean zzb(Class<?> cls) {
        return zzdb.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.firebase_auth.zzeg
    public final zzef zzc(Class<?> cls) {
        if (!zzdb.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (zzef) zzdb.zzd(cls.asSubclass(zzdb.class)).zza(zzdb.zze.zzrg, (Object) null, (Object) null);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
