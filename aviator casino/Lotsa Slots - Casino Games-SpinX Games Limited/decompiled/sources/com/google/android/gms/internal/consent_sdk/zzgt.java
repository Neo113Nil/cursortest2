package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzgt extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzgt zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";

    static {
        com.google.android.gms.internal.consent_sdk.zzgt zzgtVar = new com.google.android.gms.internal.consent_sdk.zzgt();
        zzb = zzgtVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzgt.class, zzgtVar);
    }

    private zzgt() {
    }

    public static com.google.android.gms.internal.consent_sdk.zzgs zza() {
        return (com.google.android.gms.internal.consent_sdk.zzgs) zzb.zzp();
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.consent_sdk.zzgt zzgtVar, java.lang.String str) {
        str.getClass();
        zzgtVar.zzd |= 1;
        zzgtVar.zze = str;
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.consent_sdk.zzgt zzgtVar, java.lang.String str) {
        str.getClass();
        zzgtVar.zzd |= 2;
        zzgtVar.zzf = str;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzgt();
        }
        com.google.android.gms.internal.consent_sdk.zzhb zzhbVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzgs(zzhbVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
