package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzhj extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzhj zzb;
    private int zzd = 0;
    private java.lang.Object zze;

    static {
        com.google.android.gms.internal.consent_sdk.zzhj zzhjVar = new com.google.android.gms.internal.consent_sdk.zzhj();
        zzb = zzhjVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzhj.class, zzhjVar);
    }

    private zzhj() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"zze", "zzd", com.google.android.gms.internal.consent_sdk.zzhi.class, com.google.android.gms.internal.consent_sdk.zzhg.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzhj();
        }
        com.google.android.gms.internal.consent_sdk.zzhk zzhkVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzhe(zzhkVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
