package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzfa extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzfa zzb;
    private int zzd;
    private com.google.android.gms.internal.consent_sdk.zzew zze;
    private com.google.android.gms.internal.consent_sdk.zzey zzf;
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.consent_sdk.zzfa zzfaVar = new com.google.android.gms.internal.consent_sdk.zzfa();
        zzb = zzfaVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzfa.class, zzfaVar);
    }

    private zzfa() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzfa();
        }
        com.google.android.gms.internal.consent_sdk.zzez zzezVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzek(zzezVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
