package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
public final class zzga extends com.google.android.gms.internal.play_billing.zzcs implements com.google.android.gms.internal.play_billing.zzed {
    private static final com.google.android.gms.internal.play_billing.zzga zzb;
    private int zzd;
    private int zze = 0;
    private java.lang.Object zzf;
    private int zzg;
    private com.google.android.gms.internal.play_billing.zzgk zzh;

    static {
        com.google.android.gms.internal.play_billing.zzga zzgaVar = new com.google.android.gms.internal.play_billing.zzga();
        zzb = zzgaVar;
        com.google.android.gms.internal.play_billing.zzcs.zzt(com.google.android.gms.internal.play_billing.zzga.class, zzgaVar);
    }

    private zzga() {
    }

    public static com.google.android.gms.internal.play_billing.zzga zzA(byte[] bArr, com.google.android.gms.internal.play_billing.zzcd zzcdVar) throws com.google.android.gms.internal.play_billing.zzdc {
        return (com.google.android.gms.internal.play_billing.zzga) com.google.android.gms.internal.play_billing.zzcs.zzm(zzb, bArr, zzcdVar);
    }

    static /* synthetic */ void zzB(com.google.android.gms.internal.play_billing.zzga zzgaVar, com.google.android.gms.internal.play_billing.zzgk zzgkVar) {
        zzgkVar.getClass();
        zzgaVar.zzh = zzgkVar;
        zzgaVar.zzd |= 2;
    }

    static /* synthetic */ void zzC(com.google.android.gms.internal.play_billing.zzga zzgaVar, com.google.android.gms.internal.play_billing.zzhb zzhbVar) {
        zzhbVar.getClass();
        zzgaVar.zzf = zzhbVar;
        zzgaVar.zze = 4;
    }

    static /* synthetic */ void zzD(com.google.android.gms.internal.play_billing.zzga zzgaVar, int i) {
        zzgaVar.zzg = i - 1;
        zzgaVar.zzd |= 1;
    }

    public static com.google.android.gms.internal.play_billing.zzfz zzy() {
        return (com.google.android.gms.internal.play_billing.zzfz) zzb.zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcs
    protected final java.lang.Object zzx(int i, java.lang.Object obj, java.lang.Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzq(zzb, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000", new java.lang.Object[]{"zzf", "zze", "zzd", "zzg", com.google.android.gms.internal.play_billing.zzgb.zza, "zzh", com.google.android.gms.internal.play_billing.zzhb.class});
        }
        if (i2 == 3) {
            return new com.google.android.gms.internal.play_billing.zzga();
        }
        com.google.android.gms.internal.play_billing.zzfy zzfyVar = null;
        if (i2 == 4) {
            return new com.google.android.gms.internal.play_billing.zzfz(zzfyVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
