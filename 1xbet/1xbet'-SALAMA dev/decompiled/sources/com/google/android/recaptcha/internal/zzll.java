package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes.dex */
final class zzll {
    private static final zzlk zza;
    private static final zzlk zzb;

    static {
        zzlk zzlkVar = null;
        try {
            zzlkVar = (zzlk) Class.forName("com.google.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzlkVar;
        zzb = new zzlk();
    }

    public static zzlk zza() {
        return zza;
    }

    public static zzlk zzb() {
        return zzb;
    }
}
