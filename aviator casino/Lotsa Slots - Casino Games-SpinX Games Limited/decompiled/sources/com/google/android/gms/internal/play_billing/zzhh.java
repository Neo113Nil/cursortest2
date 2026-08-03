package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzhh extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzhh zzb;
    private int zzd;
    private int zzf;
    private com.google.android.gms.internal.play_billing.zzcz zze = com.google.android.gms.internal.play_billing.zzcs.zzo();
    private java.lang.String zzg = "";

    static {
        com.google.android.gms.internal.play_billing.zzhh zzhhVar = new com.google.android.gms.internal.play_billing.zzhh();
        zzb = zzhhVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzhh.class, zzhhVar);
    }

    private zzhh() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzhh();
        }
        com.google.android.gms.internal.play_billing.zzhf zzhfVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzhg(zzhfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
