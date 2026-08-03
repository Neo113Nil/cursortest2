package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzhb extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzhb zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.zzhb zzhbVar = new com.google.android.gms.internal.play_billing.zzhb();
        zzb = zzhbVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzhb.class, zzhbVar);
    }

    private zzhb() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzhb zzhbVar, int i) {
        zzhbVar.zze = i - 1;
        zzhbVar.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.zzgz zzy() {
        return (com.google.android.gms.internal.play_billing.zzgz) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"zzd", "zze", com.google.android.gms.internal.play_billing.zzha.zza});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzhb();
        }
        com.google.android.gms.internal.play_billing.zzgy zzgyVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzgz(zzgyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
