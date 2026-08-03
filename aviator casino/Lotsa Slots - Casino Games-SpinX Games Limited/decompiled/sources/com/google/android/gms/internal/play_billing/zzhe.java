package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzhe extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzhe zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private com.google.android.gms.internal.play_billing.zzgu zzg;
    private com.google.android.gms.internal.play_billing.zzgx zzh;

    static {
        com.google.android.gms.internal.play_billing.zzhe zzheVar = new com.google.android.gms.internal.play_billing.zzhe();
        zzb = zzheVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzhe.class, zzheVar);
    }

    private zzhe() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzhe zzheVar, com.google.android.gms.internal.play_billing.zzhl zzhlVar) {
        zzheVar.zzf = zzhlVar;
        zzheVar.zze = 4;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzhe zzheVar, com.google.android.gms.internal.play_billing.zzgu zzguVar) {
        zzguVar.getClass();
        zzheVar.zzg = zzguVar;
        zzheVar.zzd |= 1;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzhe zzheVar, com.google.android.gms.internal.play_billing.zzga zzgaVar) {
        zzheVar.zzf = zzgaVar;
        zzheVar.zze = 2;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzhe zzheVar, com.google.android.gms.internal.play_billing.zzge zzgeVar) {
        zzheVar.zzf = zzgeVar;
        zzheVar.zze = 3;
    }

    public static com.google.android.gms.internal.play_billing.zzhd zzy() {
        return (com.google.android.gms.internal.play_billing.zzhd) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006ဉ\u0001", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.zzga.class, com.google.android.gms.internal.play_billing.zzge.class, com.google.android.gms.internal.play_billing.zzhl.class, com.google.android.gms.internal.play_billing.zzgr.class, "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzhe();
        }
        com.google.android.gms.internal.play_billing.zzhc zzhcVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzhd(zzhcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
