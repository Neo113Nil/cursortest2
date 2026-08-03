package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzgx extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzgx zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        com.google.android.gms.internal.play_billing.zzgx zzgxVar = new com.google.android.gms.internal.play_billing.zzgx();
        zzb = zzgxVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzgx.class, zzgxVar);
    }

    private zzgx() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzgx();
        }
        com.google.android.gms.internal.play_billing.zzgv zzgvVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzgw(zzgvVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
