package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzlf {
    private static final zzle zza;
    private static final zzle zzb;

    static {
        zzle zzleVar = null;
        try {
            zzleVar = (zzle) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzleVar;
        zzb = new zzle();
    }

    public static zzle zza() {
        return zza;
    }

    public static zzle zzb() {
        return zzb;
    }
}
