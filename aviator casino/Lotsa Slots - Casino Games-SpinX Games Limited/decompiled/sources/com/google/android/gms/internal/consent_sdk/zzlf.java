package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzlf extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzlf zzb;
    private int zzd;
    private com.google.android.gms.internal.consent_sdk.zzrk zzh = com.google.android.gms.internal.consent_sdk.zzrk.zza();
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.consent_sdk.zzlf zzlfVar = new com.google.android.gms.internal.consent_sdk.zzlf();
        zzb = zzlfVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzlf.class, zzlfVar);
    }

    private zzlf() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0001\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u00042", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", com.google.android.gms.internal.consent_sdk.zzle.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzlf();
        }
        com.google.android.gms.internal.consent_sdk.zzli zzliVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzld(zzliVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
