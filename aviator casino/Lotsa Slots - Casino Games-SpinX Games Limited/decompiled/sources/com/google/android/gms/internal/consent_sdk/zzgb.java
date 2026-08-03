package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzgb extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzgb zzb;
    private int zzd;
    private com.google.android.gms.internal.consent_sdk.zzgj zze;
    private boolean zzf;

    static {
        com.google.android.gms.internal.consent_sdk.zzgb zzgbVar = new com.google.android.gms.internal.consent_sdk.zzgb();
        zzb = zzgbVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzgb.class, zzgbVar);
    }

    private zzgb() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzgb();
        }
        com.google.android.gms.internal.consent_sdk.zzgf zzgfVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzga(zzgfVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
