package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
public final class zzhc extends com.google.android.gms.internal.consent_sdk.zzqm implements com.google.android.gms.internal.consent_sdk.zzrr {
    private static final com.google.android.gms.internal.consent_sdk.zzhc zzb;
    private int zzd;
    private com.google.android.gms.internal.consent_sdk.zzgy zze;
    private com.google.android.gms.internal.consent_sdk.zzha zzg;
    private com.google.android.gms.internal.consent_sdk.zzgw zzh;
    private com.google.android.gms.internal.consent_sdk.zzgt zzi;
    private java.lang.String zzf = "";
    private com.google.android.gms.internal.consent_sdk.zzqr zzj = com.google.android.gms.internal.consent_sdk.zzqm.zzt();

    static {
        com.google.android.gms.internal.consent_sdk.zzhc zzhcVar = new com.google.android.gms.internal.consent_sdk.zzhc();
        zzb = zzhcVar;
        com.google.android.gms.internal.consent_sdk.zzqm.zzz(com.google.android.gms.internal.consent_sdk.zzhc.class, zzhcVar);
    }

    private zzhc() {
    }

    public static com.google.android.gms.internal.consent_sdk.zzgu zza() {
        return (com.google.android.gms.internal.consent_sdk.zzgu) zzb.zzp();
    }

    static /* synthetic */ void zzd(com.google.android.gms.internal.consent_sdk.zzhc zzhcVar, java.lang.String str) {
        str.getClass();
        com.google.android.gms.internal.consent_sdk.zzqr zzqrVar = zzhcVar.zzj;
        if (!zzqrVar.zzc()) {
            int size = zzqrVar.size();
            zzhcVar.zzj = zzqrVar.zzd(size + size);
        }
        zzhcVar.zzj.add(str);
    }

    static /* synthetic */ void zze(com.google.android.gms.internal.consent_sdk.zzhc zzhcVar, java.lang.String str) {
        zzhcVar.zzd |= 2;
        zzhcVar.zzf = str;
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.consent_sdk.zzhc zzhcVar, com.google.android.gms.internal.consent_sdk.zzgt zzgtVar) {
        zzhcVar.zzi = zzgtVar;
        zzhcVar.zzd |= 16;
    }

    static /* synthetic */ void zzg(com.google.android.gms.internal.consent_sdk.zzhc zzhcVar, com.google.android.gms.internal.consent_sdk.zzgw zzgwVar) {
        zzgwVar.getClass();
        zzhcVar.zzh = zzgwVar;
        zzhcVar.zzd |= 8;
    }

    static /* synthetic */ void zzh(com.google.android.gms.internal.consent_sdk.zzhc zzhcVar, com.google.android.gms.internal.consent_sdk.zzgy zzgyVar) {
        zzgyVar.getClass();
        zzhcVar.zze = zzgyVar;
        zzhcVar.zzd |= 1;
    }

    static /* synthetic */ void zzi(com.google.android.gms.internal.consent_sdk.zzhc zzhcVar, com.google.android.gms.internal.consent_sdk.zzha zzhaVar) {
        zzhaVar.getClass();
        zzhcVar.zzg = zzhaVar;
        zzhcVar.zzd |= 4;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzqm
    protected final java.lang.Object zzb(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzw(zzb, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002ለ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006Ț", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.consent_sdk.zzhc();
        }
        com.google.android.gms.internal.consent_sdk.zzhb zzhbVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.consent_sdk.zzgu(zzhbVar);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
