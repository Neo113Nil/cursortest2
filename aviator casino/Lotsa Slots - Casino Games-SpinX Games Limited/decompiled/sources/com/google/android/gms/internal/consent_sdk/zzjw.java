package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzjw extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzjw zzb;

    static {
        com.google.android.gms.internal.consent_sdk.zzjw zzjwVar = new com.google.android.gms.internal.consent_sdk.zzjw();
        zzb = zzjwVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzjw.class, zzjwVar);
    }

    private zzjw() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        com.google.android.gms.internal.consent_sdk.zzkb zzkbVar = null;
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzjw();
        }
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzjv(zzkbVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
