package com.google.android.recaptcha.internal;

/* loaded from: classes.dex */
final class zzme {
    private static final zzmd zza;
    private static final zzmd zzb;

    static {
        zzmd zzmdVar = null;
        try {
            zzmdVar = (zzmd) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        zza = zzmdVar;
        zzb = new zzmd();
    }

    public static zzmd zza() {
        return zza;
    }

    public static zzmd zzb() {
        return zzb;
    }
}
