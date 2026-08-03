package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzgw extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzgw zzb;
    private int zzd;
    private int zze;
    private java.lang.String zzf = "";
    private java.lang.String zzg = "";
    private int zzh;

    static {
        com.google.android.gms.internal.consent_sdk.zzgw zzgwVar = new com.google.android.gms.internal.consent_sdk.zzgw();
        zzb = zzgwVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzgw.class, zzgwVar);
    }

    private zzgw() {
    }

    public static com.google.android.gms.internal.consent_sdk.zzgv zza() {
        return (com.google.android.gms.internal.consent_sdk.zzgv) zzb.zzp();
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.consent_sdk.zzgw zzgwVar, int i) {
        zzgwVar.zzd |= 8;
        zzgwVar.zzh = i;
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.consent_sdk.zzgw zzgwVar, java.lang.String str) {
        str.getClass();
        zzgwVar.zzd |= 4;
        zzgwVar.zzg = str;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.consent_sdk.zzgw zzgwVar, java.lang.String str) {
        str.getClass();
        zzgwVar.zzd |= 2;
        zzgwVar.zzf = str;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.consent_sdk.zzgw zzgwVar, int i) {
        zzgwVar.zze = 1;
        zzgwVar.zzd = 1 | zzgwVar.zzd;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004င\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzgw();
        }
        com.google.android.gms.internal.consent_sdk.zzhb zzhbVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzgv(zzhbVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
