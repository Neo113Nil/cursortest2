package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzmo extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzmo zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private com.google.android.gms.internal.consent_sdk.zzte zzg;
    private com.google.android.gms.internal.consent_sdk.zzte zzh;
    private int zzi;

    static {
        com.google.android.gms.internal.consent_sdk.zzmo zzmoVar = new com.google.android.gms.internal.consent_sdk.zzmo();
        zzb = zzmoVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzmo.class, zzmoVar);
    }

    private zzmo() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u00047\u0000\u0005<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", com.google.android.gms.internal.consent_sdk.zzmn.zza, com.google.android.gms.internal.consent_sdk.zzqa.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzmo();
        }
        com.google.android.gms.internal.consent_sdk.zzmw zzmwVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzmm(zzmwVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
