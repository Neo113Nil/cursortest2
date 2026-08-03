package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzge extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzge zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;

    static {
        com.google.android.gms.internal.play_billing.zzge zzgeVar = new com.google.android.gms.internal.play_billing.zzge();
        zzb = zzgeVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzge.class, zzgeVar);
    }

    private zzge() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzge zzgeVar, com.google.android.gms.internal.play_billing.zzhb zzhbVar) {
        zzhbVar.getClass();
        zzgeVar.zzf = zzhbVar;
        zzgeVar.zze = 2;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzge zzgeVar, int i) {
        zzgeVar.zzg = i - 1;
        zzgeVar.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.zzgd zzy() {
        return (com.google.android.gms.internal.play_billing.zzgd) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.zzgb.zza, com.google.android.gms.internal.play_billing.zzhb.class, com.google.android.gms.internal.play_billing.zzho.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzge();
        }
        com.google.android.gms.internal.play_billing.zzgc zzgcVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzgd(zzgcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
