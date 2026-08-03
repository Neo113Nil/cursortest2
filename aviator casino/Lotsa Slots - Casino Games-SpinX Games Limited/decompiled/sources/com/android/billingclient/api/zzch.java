package com.android.billingclient.api;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes2.dex */
final class zzch implements com.android.billingclient.api.zzcc {
    private com.google.android.gms.internal.play_billing.zzgu zzb;
    private final com.android.billingclient.api.zzcj zzc;

    zzch(android.content.Context context, com.google.android.gms.internal.play_billing.zzgu zzguVar) {
        this.zzc = new com.android.billingclient.api.zzcj(context);
        this.zzb = zzguVar;
    }

    @Override // com.android.billingclient.api.zzcc
    public final void zza(com.google.android.gms.internal.play_billing.zzga zzgaVar) {
        if (zzgaVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.zzhd zzy = com.google.android.gms.internal.play_billing.zzhe.zzy();
            zzy.zzn(this.zzb);
            zzy.zzl(zzgaVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzhe) zzy.zzf());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcc
    public final void zzb(com.google.android.gms.internal.play_billing.zzga zzgaVar, int i) {
        try {
            com.google.android.gms.internal.play_billing.zzgt zzgtVar = (com.google.android.gms.internal.play_billing.zzgt) this.zzb.zzi();
            zzgtVar.zzl(i);
            this.zzb = (com.google.android.gms.internal.play_billing.zzgu) zzgtVar.zzf();
            zza(zzgaVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcc
    public final void zzc(com.google.android.gms.internal.play_billing.zzge zzgeVar) {
        if (zzgeVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.zzhd zzy = com.google.android.gms.internal.play_billing.zzhe.zzy();
            zzy.zzn(this.zzb);
            zzy.zzm(zzgeVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzhe) zzy.zzf());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcc
    public final void zzd(com.google.android.gms.internal.play_billing.zzge zzgeVar, int i) {
        try {
            com.google.android.gms.internal.play_billing.zzgt zzgtVar = (com.google.android.gms.internal.play_billing.zzgt) this.zzb.zzi();
            zzgtVar.zzl(i);
            this.zzb = (com.google.android.gms.internal.play_billing.zzgu) zzgtVar.zzf();
            zzc(zzgeVar);
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // com.android.billingclient.api.zzcc
    public final void zze(com.google.android.gms.internal.play_billing.zzhl zzhlVar) {
        if (zzhlVar == null) {
            return;
        }
        try {
            com.google.android.gms.internal.play_billing.zzhd zzy = com.google.android.gms.internal.play_billing.zzhe.zzy();
            zzy.zzn(this.zzb);
            zzy.zzo(zzhlVar);
            this.zzc.zza((com.google.android.gms.internal.play_billing.zzhe) zzy.zzf());
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.play_billing.zzb.zzl("BillingLogger", "Unable to log.", th);
        }
    }
}
