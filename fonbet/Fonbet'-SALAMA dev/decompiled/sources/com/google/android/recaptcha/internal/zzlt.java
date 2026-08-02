package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzlt {
    private static final zzls zza;
    private static final zzls zzb;

    static {
        zzls zzlsVar = null;
        try {
            zzlsVar = (zzls) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzlsVar;
        zzb = new zzls();
    }

    public static zzls zza() {
        return zza;
    }

    public static zzls zzb() {
        return zzb;
    }
}
