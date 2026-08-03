package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzho extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzho zzb;
    private int zzd;
    private int zze;

    static {
        com.google.android.gms.internal.play_billing.zzho zzhoVar = new com.google.android.gms.internal.play_billing.zzho();
        zzb = zzhoVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzho.class, zzhoVar);
    }

    private zzho() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new java.lang.Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzho();
        }
        com.google.android.gms.internal.play_billing.zzhm zzhmVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzhn(zzhmVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
