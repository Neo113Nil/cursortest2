package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzgu extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzgu zzb;
    private int zzd;
    private java.lang.String zze = "";
    private java.lang.String zzf = "";
    private int zzg;

    static {
        com.google.android.gms.internal.play_billing.zzgu zzguVar = new com.google.android.gms.internal.play_billing.zzgu();
        zzb = zzguVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzgu.class, zzguVar);
    }

    private zzgu() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzgu zzguVar, java.lang.String str) {
        str.getClass();
        zzguVar.zzd |= 1;
        zzguVar.zze = str;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzgu zzguVar, java.lang.String str) {
        str.getClass();
        zzguVar.zzd |= 2;
        zzguVar.zzf = str;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzgu zzguVar, int i) {
        zzguVar.zzd |= 4;
        zzguVar.zzg = i;
    }

    public static com.google.android.gms.internal.play_billing.zzgt zzy() {
        return (com.google.android.gms.internal.play_billing.zzgt) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003င\u0002", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzgu();
        }
        com.google.android.gms.internal.play_billing.zzgs zzgsVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzgt(zzgsVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
