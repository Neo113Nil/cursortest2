package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzej {
    private static final com.google.android.gms.internal.play_billing.zzei zza;
    private static final com.google.android.gms.internal.play_billing.zzei zzb;

    static {
        com.google.android.gms.internal.play_billing.zzei zzeiVar;
        try {
            zzeiVar = (com.google.android.gms.internal.play_billing.zzei) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzeiVar = null;
        }
        zza = zzeiVar;
        zzb = new com.google.android.gms.internal.play_billing.zzei();
    }

    static com.google.android.gms.internal.play_billing.zzei zza() {
        return zza;
    }

    static com.google.android.gms.internal.play_billing.zzei zzb() {
        return zzb;
    }
}
