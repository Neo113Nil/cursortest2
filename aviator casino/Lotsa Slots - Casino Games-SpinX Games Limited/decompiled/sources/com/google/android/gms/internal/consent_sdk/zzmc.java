package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzmc extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzmc zzb;
    private int zzd;
    private boolean zze;

    static {
        com.google.android.gms.internal.consent_sdk.zzmc zzmcVar = new com.google.android.gms.internal.consent_sdk.zzmc();
        zzb = zzmcVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzmc.class, zzmcVar);
    }

    private zzmc() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzmc();
        }
        com.google.android.gms.internal.consent_sdk.zzmd zzmdVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzmb(zzmdVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
