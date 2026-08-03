package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzha extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzha zzb;
    private int zzd;
    private java.lang.String zze = "";

    static {
        com.google.android.gms.internal.consent_sdk.zzha zzhaVar = new com.google.android.gms.internal.consent_sdk.zzha();
        zzb = zzhaVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzha.class, zzhaVar);
    }

    private zzha() {
    }

    public static com.google.android.gms.internal.consent_sdk.zzgz zza() {
        return (com.google.android.gms.internal.consent_sdk.zzgz) zzb.zzp();
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.consent_sdk.zzha zzhaVar, java.lang.String str) {
        zzhaVar.zzd |= 1;
        zzhaVar.zze = "4.0.0";
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzha();
        }
        com.google.android.gms.internal.consent_sdk.zzhb zzhbVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzgz(zzhbVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
