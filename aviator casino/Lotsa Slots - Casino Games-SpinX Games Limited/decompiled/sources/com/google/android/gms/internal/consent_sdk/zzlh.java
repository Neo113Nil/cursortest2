package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzlh extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzlh zzb;
    private int zzd;
    private java.lang.Object zzf;
    private int zze = 0;
    private java.lang.String zzg = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.consent_sdk.zzlh zzlhVar = new com.google.android.gms.internal.consent_sdk.zzlh();
        zzb = zzlhVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzlh.class, zzlhVar);
    }

    private zzlh() {
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003;\u0000\u0004;\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzlh();
        }
        com.google.android.gms.internal.consent_sdk.zzli zzliVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzlg(zzliVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
