package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
final class zzjr {
    private static final zzjp zza = new zzjq();
    private static final zzjp zzb;

    static {
        zzjp zzjpVar = null;
        try {
            zzjpVar = (zzjp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zzb = zzjpVar;
    }

    public static zzjp zza() {
        zzjp zzjpVar = zzb;
        if (zzjpVar != null) {
            return zzjpVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static zzjp zzb() {
        return zza;
    }
}
