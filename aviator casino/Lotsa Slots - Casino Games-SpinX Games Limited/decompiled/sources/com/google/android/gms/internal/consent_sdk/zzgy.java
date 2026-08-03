package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzgy extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzgy zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";
    private long zzg;

    static {
        com.google.android.gms.internal.consent_sdk.zzgy zzgyVar = new com.google.android.gms.internal.consent_sdk.zzgy();
        zzb = zzgyVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzgy.class, zzgyVar);
    }

    private zzgy() {
    }

    public static com.google.android.gms.internal.consent_sdk.zzgx zza() {
        return (com.google.android.gms.internal.consent_sdk.zzgx) zzb.zzp();
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.consent_sdk.zzgy zzgyVar, java.lang.String str) {
        zzgyVar.zzd |= 2;
        zzgyVar.zzf = str;
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.consent_sdk.zzgy zzgyVar, long j) {
        zzgyVar.zzd |= 4;
        zzgyVar.zzg = j;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.consent_sdk.zzgy zzgyVar, int i) {
        zzgyVar.zze = i - 2;
        zzgyVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ဂ\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzgy();
        }
        com.google.android.gms.internal.consent_sdk.zzhb zzhbVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzgx(zzhbVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
