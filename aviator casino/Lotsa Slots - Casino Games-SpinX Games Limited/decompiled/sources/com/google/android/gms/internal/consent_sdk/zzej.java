package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzej extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzej zzb;
    private int zzd;
    private long zze;
    private long zzf;

    static {
        com.google.android.gms.internal.consent_sdk.zzej zzejVar = new com.google.android.gms.internal.consent_sdk.zzej();
        zzb = zzejVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzej.class, zzejVar);
    }

    private zzej() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzej();
        }
        com.google.android.gms.internal.consent_sdk.zzei zzeiVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzeh(zzeiVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
