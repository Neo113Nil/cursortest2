package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzcg {
    private static final com.google.android.gms.internal.play_billing.zzce zza = new com.google.android.gms.internal.play_billing.zzcf();
    private static final com.google.android.gms.internal.play_billing.zzce zzb;

    static {
        com.google.android.gms.internal.play_billing.zzce zzceVar;
        try {
            zzceVar = (com.google.android.gms.internal.play_billing.zzce) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzceVar = null;
        }
        zzb = zzceVar;
    }

    static com.google.android.gms.internal.play_billing.zzce zza() {
        com.google.android.gms.internal.play_billing.zzce zzceVar = zzb;
        if (zzceVar != null) {
            return zzceVar;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static com.google.android.gms.internal.play_billing.zzce zzb() {
        return zza;
    }
}
