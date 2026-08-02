package com.google.android.libraries.places.internal;

/* loaded from: classes.dex */
public final class zztc extends com.google.android.libraries.places.internal.zzss {
    private static final com.google.android.libraries.places.internal.zztb zza = new com.google.android.libraries.places.internal.zztb(null);

    zztc(com.google.android.libraries.places.internal.zzup zzupVar) {
        super(zzupVar);
    }

    @javax.annotation.Nonnull
    @java.lang.Deprecated
    public static com.google.android.libraries.places.internal.zztc zzf(java.lang.String str) {
        return new com.google.android.libraries.places.internal.zztc(com.google.android.libraries.places.internal.zzvn.zzd("com.google.android.libraries.mapsplatform.common.api.configs.AuxLibConfigs"));
    }

    @Override // com.google.android.libraries.places.internal.zzss
    /* renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final com.google.android.libraries.places.internal.zzsz zza(java.util.logging.Level level) {
        boolean zzd = zzd(level);
        com.google.android.libraries.places.internal.zzvn.zzh(zzc(), level, zzd);
        return !zzd ? zza : new com.google.android.libraries.places.internal.zzta(this, level, false);
    }
}
