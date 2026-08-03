package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zznu extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zznu zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        com.google.android.gms.internal.consent_sdk.zznu zznuVar = new com.google.android.gms.internal.consent_sdk.zznu();
        zzb = zznuVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zznu.class, zznuVar);
    }

    private zznu() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.consent_sdk.zznr.zza, "zzf", com.google.android.gms.internal.consent_sdk.zzns.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zznu();
        }
        com.google.android.gms.internal.consent_sdk.zznt zzntVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zznq(zzntVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
