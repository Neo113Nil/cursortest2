package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzte extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzte zzb;
    private java.lang.String zzd = "";
    private long zze;
    private int zzf;

    static {
        com.google.android.gms.internal.consent_sdk.zzte zzteVar = new com.google.android.gms.internal.consent_sdk.zzte();
        zzb = zzteVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzte.class, zzteVar);
    }

    private zzte() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\u0002\u0003\u0004", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzte();
        }
        com.google.android.gms.internal.consent_sdk.zztd zztdVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zztc(zztdVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
