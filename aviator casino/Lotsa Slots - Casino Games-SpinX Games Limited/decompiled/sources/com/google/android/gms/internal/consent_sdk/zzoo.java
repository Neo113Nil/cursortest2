package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzoo extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzoo zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private com.google.android.gms.internal.consent_sdk.zzqq zzg = zzs();

    static {
        com.google.android.gms.internal.consent_sdk.zzoo zzooVar = new com.google.android.gms.internal.consent_sdk.zzoo();
        zzb = zzooVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzoo.class, zzooVar);
    }

    private zzoo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            com.google.android.gms.internal.consent_sdk.zzqp zzqpVar = com.google.android.gms.internal.consent_sdk.zzom.zza;
            return zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002ࠬ\u0003᠌\u0001", new java.lang.Object[]{"zzd", "zze", "zzg", zzqpVar, "zzf", zzqpVar});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzoo();
        }
        com.google.android.gms.internal.consent_sdk.zzon zzonVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzol(zzonVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
