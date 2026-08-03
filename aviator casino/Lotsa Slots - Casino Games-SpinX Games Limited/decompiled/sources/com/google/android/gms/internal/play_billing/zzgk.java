package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzgk extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzgk zzb;
    private int zzd;
    private int zze;
    private int zzg;
    private java.lang.String zzf = "";
    private java.lang.String zzh = "";

    static {
        com.google.android.gms.internal.play_billing.zzgk zzgkVar = new com.google.android.gms.internal.play_billing.zzgk();
        zzb = zzgkVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzgk.class, zzgkVar);
    }

    private zzgk() {
    }

    static /* synthetic */ void zzA(com.google.android.gms.internal.play_billing.zzgk zzgkVar, int i) {
        zzgkVar.zzd |= 1;
        zzgkVar.zze = i;
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzgk zzgkVar, java.lang.String str) {
        str.getClass();
        zzgkVar.zzd |= 2;
        zzgkVar.zzf = str;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzgk zzgkVar, java.lang.String str) {
        zzgkVar.zzd |= 8;
        zzgkVar.zzh = str;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzgk zzgkVar, int i) {
        zzgkVar.zzg = i - 1;
        zzgkVar.zzd |= 4;
    }

    public static com.google.android.gms.internal.play_billing.zzgg zzy() {
        return (com.google.android.gms.internal.play_billing.zzgg) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0004᠌\u0002\u0005ဈ\u0003", new java.lang.Object[]{"zzd", "zze", "zzf", "zzg", com.google.android.gms.internal.play_billing.zzgi.zza, "zzh"});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzgk();
        }
        com.google.android.gms.internal.play_billing.zzgf zzgfVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzgg(zzgfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
