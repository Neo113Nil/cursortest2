package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzlz extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzlz zzb;
    private int zzd;
    private com.google.android.gms.internal.consent_sdk.zzlx zze;
    private com.google.android.gms.internal.consent_sdk.zzej zzf;
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.consent_sdk.zzlz zzlzVar = new com.google.android.gms.internal.consent_sdk.zzlz();
        zzb = zzlzVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzlz.class, zzlzVar);
    }

    private zzlz() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0005ለ\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzlz();
        }
        com.google.android.gms.internal.consent_sdk.zzly zzlyVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzlp(zzlyVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
