package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzgwz implements zzgyp {
    private static final zzgwz zza = new zzgwz();

    private zzgwz() {
    }

    public static zzgwz zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final zzgyo zzb(Class cls) {
        if (!zzgxg.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzgyo) zzgxg.zzbh(cls.asSubclass(zzgxg.class)).zzbO();
        } catch (Exception e7) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyp
    public final boolean zzc(Class cls) {
        return zzgxg.class.isAssignableFrom(cls);
    }
}
