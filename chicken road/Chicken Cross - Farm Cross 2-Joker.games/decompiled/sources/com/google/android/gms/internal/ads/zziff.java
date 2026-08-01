package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.4.0 */
/* loaded from: classes9.dex */
final class zziff implements zzigu {
    private static final zziff zza = new zziff();

    private zziff() {
    }

    public static zziff zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final boolean zzb(Class cls) {
        return zzifm.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzigu
    public final zzigt zzc(Class cls) {
        if (!zzifm.class.isAssignableFrom(cls)) {
            String name = cls.getName();
            String.valueOf(name);
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(name)));
        }
        try {
            return (zzigt) zzifm.zzbt(cls.asSubclass(zzifm.class)).zzbs();
        } catch (Exception e) {
            String name2 = cls.getName();
            String.valueOf(name2);
            throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(name2)), e);
        }
    }
}
