package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzkr extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzkr zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private boolean zzg;

    static {
        com.google.android.gms.internal.consent_sdk.zzkr zzkrVar = new com.google.android.gms.internal.consent_sdk.zzkr();
        zzb = zzkrVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzkr.class, zzkrVar);
    }

    private zzkr() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.consent_sdk.zzkm.class, com.google.android.gms.internal.consent_sdk.zzkq.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzkr();
        }
        com.google.android.gms.internal.consent_sdk.zzkz zzkzVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzkk(zzkzVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
