package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzel {
    private static final com.google.android.gms.internal.play_billing.zzel zza = new com.google.android.gms.internal.play_billing.zzel();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.play_billing.zzep zzb = new com.google.android.gms.internal.play_billing.zzdu();

    private zzel() {
    }

    public static com.google.android.gms.internal.play_billing.zzel zza() {
        return zza;
    }

    public final com.google.android.gms.internal.play_billing.zzeo zzb(java.lang.Class cls) {
        com.google.android.gms.internal.play_billing.zzda.zzc(cls, "messageType");
        com.google.android.gms.internal.play_billing.zzeo zzeoVar = (com.google.android.gms.internal.play_billing.zzeo) this.zzc.get(cls);
        if (zzeoVar == null) {
            zzeoVar = this.zzb.zza(cls);
            com.google.android.gms.internal.play_billing.zzda.zzc(cls, "messageType");
            com.google.android.gms.internal.play_billing.zzeo zzeoVar2 = (com.google.android.gms.internal.play_billing.zzeo) this.zzc.putIfAbsent(cls, zzeoVar);
            if (zzeoVar2 != null) {
                return zzeoVar2;
            }
        }
        return zzeoVar;
    }
}
