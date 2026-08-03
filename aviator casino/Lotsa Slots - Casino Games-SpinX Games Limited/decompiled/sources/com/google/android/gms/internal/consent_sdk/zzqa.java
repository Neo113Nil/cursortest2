package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzqa extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzqa zzb;
    private long zzd;
    private int zze;

    static {
        com.google.android.gms.internal.consent_sdk.zzqa zzqaVar = new com.google.android.gms.internal.consent_sdk.zzqa();
        zzb = zzqaVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzqa.class, zzqaVar);
    }

    private zzqa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new com.google.android.gms.internal.consent_sdk.zzrz(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzqa();
        }
        com.google.android.gms.internal.consent_sdk.zzpz zzpzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzpy(zzpzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
