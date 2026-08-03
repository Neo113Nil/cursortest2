package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzcm implements com.google.android.gms.internal.play_billing.zzea {
    private static final com.google.android.gms.internal.play_billing.zzcm zza = new com.google.android.gms.internal.play_billing.zzcm();

    private zzcm() {
    }

    public static com.google.android.gms.internal.play_billing.zzcm zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final com.google.android.gms.internal.play_billing.zzdz zzb(java.lang.Class cls) {
        if (!com.google.android.gms.internal.play_billing.zzcs.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("Unsupported message type: ".concat(java.lang.String.valueOf(cls.getName())));
        }
        try {
            return (com.google.android.gms.internal.play_billing.zzdz) com.google.android.gms.internal.play_billing.zzcs.zzj(cls.asSubclass(com.google.android.gms.internal.play_billing.zzcs.class)).zzx(3, null, null);
        } catch (java.lang.Exception e) {
            throw new java.lang.RuntimeException("Unable to get message info for ".concat(java.lang.String.valueOf(cls.getName())), e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzea
    public final boolean zzc(java.lang.Class cls) {
        return com.google.android.gms.internal.play_billing.zzcs.class.isAssignableFrom(cls);
    }
}
