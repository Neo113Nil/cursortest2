package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzkg {
    private static final zzke zza = new zzkf();
    private static final zzke zzb;

    static {
        zzke zzkeVar = null;
        try {
            zzkeVar = (zzke) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzkeVar;
    }

    public static zzke zza() {
        zzke zzkeVar = zzb;
        if (zzkeVar != null) {
            return zzkeVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzke zzb() {
        return zza;
    }
}
