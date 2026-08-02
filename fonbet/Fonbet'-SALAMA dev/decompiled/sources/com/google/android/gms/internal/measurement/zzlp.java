package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlp {
    private static final zzlo zza;
    private static final zzlo zzb;

    static {
        zzlo zzloVar = null;
        try {
            zzloVar = (zzlo) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzloVar;
        zzb = new zzlo();
    }

    public static zzlo zza() {
        return zza;
    }

    public static zzlo zzb() {
        return zzb;
    }
}
