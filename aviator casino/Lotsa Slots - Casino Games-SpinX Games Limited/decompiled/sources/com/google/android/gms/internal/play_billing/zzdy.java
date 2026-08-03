package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzdy {
    private static final com.google.android.gms.internal.play_billing.zzdx zza;
    private static final com.google.android.gms.internal.play_billing.zzdx zzb;

    static {
        com.google.android.gms.internal.play_billing.zzdx zzdxVar;
        try {
            zzdxVar = (com.google.android.gms.internal.play_billing.zzdx) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            zzdxVar = null;
        }
        zza = zzdxVar;
        zzb = new com.google.android.gms.internal.play_billing.zzdx();
    }

    static com.google.android.gms.internal.play_billing.zzdx zza() {
        return zza;
    }

    static com.google.android.gms.internal.play_billing.zzdx zzb() {
        return zzb;
    }
}
